#!/bin/bash
set -e

echo "=== Usando Node 14 ==="
nvm install 14.18.2
nvm use 14.18.2
node --version
npm --version

echo "=== Removendo tudo ==="
rm -rf node_modules package-lock.json
npm cache clean --force

echo "=== Instalando ==="
npm install --ignore-scripts --no-audit --verbose

echo "=== ngcc ==="
npx ngcc --properties es2015 browser module main --first-only --create-ivy-entry-points

echo "=== Pronto ==="
