
p585600@10.116.193.244's password:
Last login: Thu Sep  3 16:26:17 2026 from 10.122.150.31
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ H=/opt/jbcs-httpd24-2.4/httpd
-sh-4.2$
-sh-4.2$
-sh-4.2$ sudo su

Presumimos que você recebeu as instruções de sempre do administrador
de sistema local. Basicamente, resume-se a estas três coisas:

    #1) Respeite a privacidade dos outros.
    #2) Pense antes de digitar.
    #3) Com grandes poderes vêm grandes responsabilidades.

[sudo] senha para p585600:
[root@caddeapllx756 p585600]#
[root@caddeapllx756 p585600]#
[root@caddeapllx756 p585600]# H=/opt/jbcs-httpd24-2.4/httpd
[root@caddeapllx756 p585600]#
[root@caddeapllx756 p585600]#
[root@caddeapllx756 p585600]# grep -RniE 'LimitRequestBody|SecRequestBodyLimit|Timeout' $H/conf $H/sites-available/*sigec-csc* 2>/dev/null
[root@caddeapllx756 p585600]#
[root@caddeapllx756 p585600]#
[root@caddeapllx756 p585600]# ls /logs/apache2/sigec-csc/
ls: não é possível acessar /logs/apache2/sigec-csc/: Arquivo ou diretório não encontrado
[root@caddeapllx756 p585600]#


