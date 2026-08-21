
[p585600@caddeapllx2560 opt]$ ls -la /opt/batch/config/sigdb/sigdb/
ls: não foi possível acessar '/opt/batch/config/sigdb/sigdb/': Não é um diretório
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$ cd /opt/batch/config/sigdb/sigdb
-sh: cd: /opt/batch/config/sigdb/sigdb: Não é um diretório
[p585600@caddeapllx2560 opt]$ git status
-sh: git: comando não encontrado
[p585600@caddeapllx2560 opt]$ git log --oneline -5 -- TRANSMITE 2>/dev/null
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$ git remote -v
-sh: git: comando não encontrado
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$ git log -3 --format="%h %an %ad %s"
-sh: git: comando não encontrado
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$ find /opt/batch/config/sigdb -iname "TRANSMITE*"
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$ grep -rn "TRANSMITE" /opt/batch/config/sigdb/sigdb/ --include="*.sh" --include="*.yml" --include="*.yaml" --include="*.xml" 2>/dev/null
[p585600@caddeapllx2560 opt]$ find /opt/batch/config/sigdb/sigdb -iname "*.sh" -exec grep -l "chmod\|mkdir" {} \;
[p585600@caddeapllx2560 opt]$
