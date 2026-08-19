
Check case sensitivity · JS


#!/usr/bin/env node
/**
 * check-case-sensitivity.js
 *
 * Varre arquivos .ts/.tsx em busca de imports/exports relativos cujo
 * "case" (maiúsculas/minúsculas) não bate exatamente com o nome real
 * do arquivo no disco. Esse tipo de problema passa despercebido em
 * Windows/Mac (sistemas de arquivo case-insensitive) mas quebra o
 * build em agentes Linux (case-sensitive) — inclusive pode disparar o
 * erro "Cannot destructure property 'pos' of 'file.referencedFiles[index]'"
 * do compilador Angular/TypeScript.
 *
 * Uso:
 *   node check-case-sensitivity.js [pasta]
 *
 * Padrão: pasta = "src"
 */

const fs = require('fs');
const path = require('path');

const rootArg = process.argv[2] || 'src';
const root = path.resolve(process.cwd(), rootArg);

if (!fs.existsSync(root)) {
  console.error(`Pasta não encontrada: ${root}`);
  process.exit(1);
}

const IMPORT_RE = /(?:import|export)(?:[^'"]*?)from\s+['"](\.\.?\/[^'"]+)['"]|require\(\s*['"](\.\.?\/[^'"]+)['"]\s*\)/g;
const EXTENSIONS = ['', '.ts', '.tsx', '/index.ts', '/index.tsx'];

let filesScanned = 0;
let issuesFound = 0;

function walk(dir, cb) {
  for (const entry of fs.readdirSync(dir, { withFileTypes: true })) {
    if (entry.name === 'node_modules' || entry.name.startsWith('.')) continue;
    const full = path.join(dir, entry.name);
    if (entry.isDirectory()) {
      walk(full, cb);
    } else if (/\.(ts|tsx)$/.test(entry.name) && !entry.name.endsWith('.spec.ts')) {
      cb(full);
    }
  }
}

// Retorna o nome real (case exato) de um arquivo/pasta dentro de `dir`,
// comparando case-insensitive. Retorna null se não existir de forma alguma.
function findRealName(dir, name) {
  let entries;
  try {
    entries = fs.readdirSync(dir);
  } catch {
    return null;
  }
  const exact = entries.find((e) => e === name);
  if (exact) return exact;
  const insensitive = entries.find((e) => e.toLowerCase() === name.toLowerCase());
  return insensitive || null;
}

// Verifica, segmento por segmento, se o caminho relativo bate exatamente
// com o que existe no disco. Retorna { ok, realPath, reason }.
function checkPathCasing(fromFile, importPath) {
  const fromDir = path.dirname(fromFile);
  const segments = importPath.split('/').filter((s) => s !== '.');
  let currentDir = fromDir;
  let rebuilt = [];

  for (let i = 0; i < segments.length; i++) {
    const seg = segments[i];
    if (seg === '..') {
      currentDir = path.dirname(currentDir);
      rebuilt.push(seg);
      continue;
    }
    const isLast = i === segments.length - 1;
    if (!isLast) {
      const real = findRealName(currentDir, seg);
      if (!real) return { ok: null }; // não conseguiu resolver (pode não ser um path de arquivo)
      if (real !== seg) return { ok: false, expected: real, got: seg };
      currentDir = path.join(currentDir, real);
      rebuilt.push(real);
    } else {
      // último segmento: pode ser arquivo direto ou precisar de extensão/index
      for (const ext of EXTENSIONS) {
        const candidate = seg + ext.replace(/^\/index/, '');
        if (ext.includes('index')) {
          const real = findRealName(currentDir, seg);
          if (real) {
            const subDir = path.join(currentDir, real);
            const indexName = ext.split('/')[1];
            const realIndex = findRealName(subDir, indexName);
            if (realIndex) {
              const ok = real === seg;
              return ok
                ? { ok: true }
                : { ok: false, expected: real, got: seg };
            }
          }
          continue;
        }
        const real = findRealName(currentDir, candidate);
        if (real) {
          return real === candidate
            ? { ok: true }
            : { ok: false, expected: real.replace(/\.tsx?$/, ''), got: seg };
        }
      }
      return { ok: null }; // não achou de nenhum jeito (pode ser alias, .scss, .json, etc.)
    }
  }
  return { ok: true };
}

walk(root, (file) => {
  filesScanned++;
  const content = fs.readFileSync(file, 'utf8');
  let match;
  IMPORT_RE.lastIndex = 0;
  while ((match = IMPORT_RE.exec(content))) {
    const importPath = match[1] || match[2];
    if (!importPath) continue;
    const result = checkPathCasing(file, importPath);
    if (result.ok === false) {
      issuesFound++;
      const line = content.slice(0, match.index).split('\n').length;
      console.log(`\n[CASE MISMATCH] ${path.relative(process.cwd(), file)}:${line}`);
      console.log(`  import: "${importPath}"`);
      console.log(`  esperado no disco: "${result.expected}"  |  usado no import: "${result.got}"`);
    }
  }
});

console.log(`\n--------------------------------------------------`);
console.log(`Arquivos escaneados: ${filesScanned}`);
console.log(`Problemas de case encontrados: ${issuesFound}`);
if (issuesFound === 0) {
  console.log('Nenhum mismatch de case detectado nos imports relativos.');
}
