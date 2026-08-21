
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$ ps -ef | grep -iE "java|jboss|wildfly"
p585600   738615  738498  0 11:20 pts/0    00:00:00 grep --color=auto -iE java|jboss|wildfly
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$ systemctl lists-units --type=service | grep -iE "jboss|wildfly|siccp|sig"
Unknown command verb lists-units.
[p585600@caddeapllx2560 opt]$ systemctl show <nome-do-servico> -p User,Group
cat /etc/systemd/system/<nome-do-servico>.service 2>/dev/null
-sh: nome-do-servico: Arquivo ou diretório inexistente
-sh: nome-do-servico: Arquivo ou diretório inexistente
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
[p585600@caddeapllx2560 opt]$
