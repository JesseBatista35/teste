cd $(Build.Repository.LocalPath)

echo "=== Buscando referências triplo-slash (/// <reference ...>) ==="
grep -rn '/// *<reference' src --include="*.ts" || echo "Nenhuma referência triplo-slash encontrada"

echo ""
echo "=== Rodando tsc puro para diagnóstico direto ==="
npx tsc --noEmit -p tsconfig.app.json
