cd $(Build.Repository.LocalPath)

echo "=== Arquivos na pasta model/endomarketing ==="
ls -la src/app/model/endomarketing/

echo ""
echo "=== Imports relativos partindo de dentro da propria pasta endomarketing ==="
grep -rn "from '\./[Cc]ategoria" src/app/model/endomarketing/
grep -rn "from \"\./[Cc]ategoria" src/app/model/endomarketing/

echo ""
echo "=== Qualquer arquivo index/barrel na pasta ==="
ls src/app/model/endomarketing/ | grep -i index
