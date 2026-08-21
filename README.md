# Ver estrutura completa desse repo de config
ls -la /opt/batch/config/sigdb/sigdb/

# Ver se TRANSMITE é rastreado pelo git ou só existe fora dele
cd /opt/batch/config/sigdb/sigdb
git status
git log --oneline -5 -- TRANSMITE 2>/dev/null

# Ver remote e branch, pra saber se isso é puxado pela esteira
git remote -v
git log -3 --format="%h %an %ad %s"

# Confirmar se TRANSMITE é o mesmo caminho de /sigdb/sigdb/TRANSMITE ou coisa parecida
find /opt/batch/config/sigdb -iname "TRANSMITE*"



grep -rn "TRANSMITE" /opt/batch/config/sigdb/sigdb/ --include="*.sh" --include="*.yml" --include="*.yaml" --include="*.xml" 2>/dev/null
find /opt/batch/config/sigdb/sigdb -iname "*.sh" -exec grep -l "chmod\|mkdir" {} \;
