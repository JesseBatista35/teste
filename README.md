
(Nem todos os processos puderam ser identificados, informações sobre processos
 de outrem não serão mostrados, você deve ser root para vê-los todos.)
[p585600@caddeapllx2577 ~]$ sudo su

Presumimos que você recebeu as instruções de sempre do administrador
de sistema local. Basicamente, resume-se a estas três coisas:

    #1) Respeite a privacidade dos outros.
    #2) Pense antes de digitar.
    #3) Com grandes poderes vêm grandes responsabilidades.

[sudo] senha para p585600:
[root@caddeapllx2577 p585600]# netstat -tlnp | grep httpd
tcp6       0      0 :::443                  :::*                    OUÇA       750315/httpd
tcp6       0      0 :::80                   :::*                    OUÇA       750315/httpd
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]# ss -tlnp | grep httpd
LISTEN 0      511                *:443              *:*    users:(("httpd",pid=750318,fd=6),("httpd",pid=750315,fd=6))
LISTEN 0      511                *:80               *:*    users:(("httpd",pid=750318,fd=4),("httpd",pid=750315,fd=4))
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#

