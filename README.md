cd $(Build.Repository.LocalPath)

echo "=== Conteudo categoria.model.ts (minusculo) ==="
cat src/app/model/endomarketing/categoria.model.ts

echo ""
echo "=== Conteudo Categoria.model.ts (maiusculo) ==="
cat src/app/model/endomarketing/Categoria.model.ts

echo ""
echo "=== MD5 dos dois arquivos (se forem iguais, o hash bate) ==="
md5sum src/app/model/endomarketing/categoria.model.ts src/app/model/endomarketing/Categoria.model.ts

echo ""
echo "=== Quem importa de model/endomarketing/categoria (qualquer caixa) ==="
grep -rni "model/endomarketing/categoria" src --include="*.ts"
