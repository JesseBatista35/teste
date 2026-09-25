
/proc/31415/environ
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$ sudo cat /proc/<PID>/environ | tr '\0' '\n' | grep -E '^(STRATEGY|LDAP_URL|LDAP_USER_BASE|LDAP_GROUP_BASE)='
-bash: PID: Arquivo ou diretório não encontrado
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$ sudo docker ps --format '{{.Names}}\t{{.Image}}'
sudo: docker: comando não encontrado
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$ sudo docker inspect <container> --format '{{range .Config.Env}}{{println .}}{{end}}' \
>   | grep -E '^(STRATEGY|LDAP_URL|LDAP_USER_BASE|LDAP_GROUP_BASE)='
-bash: container: Arquivo ou diretório não encontrado
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$ systemctl cat <servico> | grep -E 'Environment|EnvironmentFile'
-bash: erro de sintaxe próximo do `token' não esperado `|'
p585600@SCTDEAPLLX0094:~$ sudo grep -rEsn '(STRATEGY|LDAP_URL|LDAP_USER_BASE|LDAP_GROUP_BASE)\s*[=:]' \
>   /etc /opt /srv /var/www /app /home 2>/dev/null | grep -v '\.log:'


^C
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$ sudo find / -xdev \( -name '.env' -o -name '*.env' -o -name 'docker-compose*.yml' \) 2>/dev/null
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$
