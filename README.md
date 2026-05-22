
-sh-4.2$ echo "==TESTE CONFIG APACHE==" &&
> /opt/jbcs-httpd24-2.4/httpd/sbin/apachectl configtest &&
> echo "==RECARREGANDO APACHE==" &&
> /opt/jbcs-httpd24-2.4/httpd/sbin/apachectl graceful &&
> echo "==STATUS==" &&
> /opt/jbcs-httpd24-2.4/httpd/sbin/apachectl status | head -20
==TESTE CONFIG APACHE==
(13)Permission denied: AH00086: httpd: could not open error log file /opt/jbcs-httpd24-2.4/httpd/logs/httpd.log.
Syntax OK
==RECARREGANDO APACHE==
(13)Permission denied: AH00086: httpd: could not open error log file /opt/jbcs-httpd24-2.4/httpd/logs/httpd.log.
httpd not running, trying to start
no listening sockets available, shutting down
AH00015: Unable to open logs
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ sudo /opt/jbcs-httpd24-2.4/httpd/sbin/apachectl graceful

Presumimos que você recebeu as instruções de sempre do administrador
de sistema local. Basicamente, resume-se a estas três coisas:

    #1) Respeite a privacidade dos outros.
    #2) Pense antes de digitar.
    #3) Com grandes poderes vêm grandes responsabilidades.

[sudo] senha para p585600:
-sh-4.2$ sudo /opt/jbcs-httpd24-2.4/httpd/sbin/apachectl graceful
-sh-4.2$
