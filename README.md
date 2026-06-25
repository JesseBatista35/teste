#!/bin/bash
set -e

echo "=== Configurando Node 14 ==="
export PATH=/opt/ads-agent/_work/_tool/node/14.18.2/x64/bin:$PATH
export NODE_PATH=/opt/ads-agent/_work/_tool/node/14.18.2/x64/lib/node_modules

node --version
npm --version

echo "=== Limpando ==="
rm -rf node_modules package-lock.json
npm cache clean --force

echo "=== Instalando ==="
npm install --ignore-scripts --no-audit --verbose

echo "=== ngcc ==="
npx ngcc --properties es2015 browser module main --first-only --create-ivy-entry-points

echo "=== Pronto ==="
