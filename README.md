export enum Ambiente {
  DES,
  PRD,
}

export enum DnsSSO {
  DES = 'https://login.des.caixa/auth',
  PRD = 'https://login.prd.caixa/auth',
}

export function getKEYCLOAK_ROOT_URL(ambiente: Ambiente): any {
  //@ts-expect-error implicit any
  return DnsSSO[Ambiente[ambiente]];
}

// https://random-data-api.com/documentation
export function getRandomDataAPI(): string {
  return 'https://random-data-api.com/api/v2';
}

// https://jsonplaceholder.typicode.com/guide/
export function getJsonPlaceholderAPI(): string {
  return 'https://jsonplaceholder.typicode.com';
}

export type RuntimeEnvValue = string | boolean | undefined;

function getRuntimeEnvObject(): Record<string, RuntimeEnvValue> | undefined {
  const envContainer = (globalThis as { _ENV?: Record<string, RuntimeEnvValue> })._ENV;
  return envContainer;
}

export function getRuntimeEnvString(key: string): string | undefined {
  const value = getRuntimeEnvObject()?.[key];
  if (typeof value !== 'string') return undefined;

  const normalized = value.trim();
  return normalized.length > 0 ? normalized : undefined;
}

export function getRequiredRuntimeEnvString(key: string): string {
  const value = getRuntimeEnvString(key);
  if (!value) {
    throw new Error(
      `[ENV] Variavel obrigatoria nao definida: _ENV.${key}`
    );
  }
  return value;
}

export function getRequiredRuntimeEnvStringFrom(keys: string[]): string {
  for (const key of keys) {
    const value = getRuntimeEnvString(key);
    if (value) return value;
  }

  throw new Error(
    `[ENV] Nenhuma variavel obrigatoria foi definida: ${keys
      .map((key) => `_ENV.${key}`)
      .join(' ou ')}`
  );
}

export function getRuntimeEnvBoolean(
  key: string,
  fallback: boolean
): boolean {
  const value = getRuntimeEnvObject()?.[key];
  if (typeof value === 'boolean') return value;
  if (typeof value === 'string') return value.toLowerCase() === 'true';
  return fallback;
}

export function getRequiredRuntimeEnvBoolean(key: string): boolean {
  const envContainer = (globalThis as { _ENV?: Record<string, RuntimeEnvValue> })._ENV;
  const value = envContainer?.[key];

  if (typeof value === 'boolean') return value;
  if (typeof value === 'string') {
    if (value.toLowerCase() === 'true') return true;
    if (value.toLowerCase() === 'false') return false;
  }

  throw new Error(
    `[ENV] Variavel booleana obrigatoria invalida ou ausente: _ENV.${key}`
  );
}

export function normalizeBaseUrl(url: string): string {
  return url.trim().replace(/\/+$/, '');
}

export function buildApiUrl(baseUrl: string): string {
  const normalized = normalizeBaseUrl(baseUrl);
  return /\/api$/i.test(normalized) ? normalized : `${normalized}/api`;
}



RESTANTE DA ESTRUTURA DO CODIGO

Skip to main content
Azure DevOps
projetos
/
Caixa
/
Repos
/
Files
/

SIPDM-frontend
Search


Caixa

Overview

Boards

Repos
Files
Commits
Pushes
Branches
Tags
Pull requests

Pipelines

Test Plans

Artifacts
Project settings
SIPDM-frontend

reports
src
app
assets
environments
environment.model.ts
environment.prod.ts
environment.ts
favicon.ico
index.html
main.ts
styles.scss
.editorconfig
.eslintrc.json
.gitignore
.prettierignore
.prettierrc
angular.json
jest.config.js
package-lock.json
package.json
README.md
setup-jest.ts
sonar-project.properties
tsconfig.app.json
tsconfig.eslint.json
tsconfig.json
tsconfig.spec.json
vite.config.ts

template

/
src
/
environments
/
environment.model.ts
environment.model.ts

Edit

Contents
History
Compare
Blame

1920212223242526272829303132333435363738394041424344161718131415101112789456123
export enum Ambiente {
  DES,
  PRD,
}

export enum DnsSSO {
  DES = 'https://login.des.caixa/auth',
  PRD = 'https://login.prd.caixa/auth',
}

…}

export function buildApiUrl(baseUrl: string): string {
  const normalized = normalizeBaseUrl(baseUrl);
  return /\/api$/i.test(normalized) ? normalized : `${normalized}/api`;
}

Showing 4 items.

Finished loading items

Expanded

Collapsed

