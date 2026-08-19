cd $(Build.Repository.LocalPath)
echo "=== Versao do typescript instalado no projeto ==="
cat node_modules/typescript/package.json | grep version
echo "=== Rodando tsc LOCAL (sem npx) ==="
node_modules/.bin/tsc --noEmit -p tsconfig.app.json
