cd $(Build.Repository.LocalPath)
echo "=== Verificando referencias triplo-slash ==="
grep -rn "reference path" src
echo "=== Rodando tsc puro ==="
npx tsc --noEmit -p tsconfig.app.json
