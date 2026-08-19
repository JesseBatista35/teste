cd $(Build.Repository.LocalPath)
echo "=== Arquivos existentes ==="
ls -la src/app/model/endomarketing/ | grep -i categoria

echo "=== Diferenca entre os dois arquivos ==="
diff src/app/model/endomarketing/categoria.model.ts src/app/model/endomarketing/Categoria.model.ts

echo "=== Quem importa categoria.model minusculo ==="
grep -rn "categoria.model" src --include="*.ts" | grep -v "Categoria.model"

echo "=== Quem importa Categoria.model maiusculo ==="
grep -rn "Categoria.model" src --include="*.ts"
