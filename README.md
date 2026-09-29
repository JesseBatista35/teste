$
-sh-4.2$
-sh-4.2$ oc rsh -n sinep-tqs sinep-arquivos-tqs-22-qqgk7 \
>   bash -c 'timeout 3 bash -c "</dev/tcp/10.192.224.100/1415" && echo ABERTA || echo FECHADA'
ABERTA
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$   oc rsh -n sinep-tqs sinep-arquivos-tqs-22-qqgk7 \
>   curl -v --connect-timeout 3 telnet://10.192.224.100:1415
* Rebuilt URL to: telnet://10.192.224.100:1415/
*   Trying 10.192.224.100...
* TCP_NODELAY set
* Connected to 10.192.224.100 (10.192.224.100) port 1415 (#0)

