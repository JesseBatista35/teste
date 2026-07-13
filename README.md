
[p585600@scttqapllx0032 /]$ ls -la /opt/etc/init.d/jboss-master sudo -u jboss /opt/etc/init.d/jboss-master status
ls: impossível acessar sudo: Arquivo ou diretório não encontrado
ls: impossível acessar jboss: Arquivo ou diretório não encontrado
ls: impossível acessar status: Arquivo ou diretório não encontrado
-rwxrwxrwx. 1 jboss jboss 4261 Abr  4  2019 /opt/etc/init.d/jboss-master
-rwxrwxrwx. 1 jboss jboss 4261 Abr  4  2019 /opt/etc/init.d/jboss-master
[p585600@scttqapllx0032 /]$
[p585600@scttqapllx0032 /]$
[p585600@scttqapllx0032 /]$
[p585600@scttqapllx0032 /]$
[p585600@scttqapllx0032 /]$ sudo -u jboss kill -15 99496 sleep 15 ps -p 99496 && echo "ainda vivo" || echo "morreu"
kill: não foi possível localizar o processo "sleep"
kill 15: Operação não permitida
kill: não foi possível localizar o processo "ps"
kill: não foi possível localizar o processo "-p"
morreu
[p585600@scttqapllx0032 /]$
[p585600@scttqapllx0032 /]$
[p585600@scttqapllx0032 /]$
[p585600@scttqapllx0032 /]$
[p585600@scttqapllx0032 /]$
[p585600@scttqapllx0032 /]$
