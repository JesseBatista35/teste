
-sh-4.2$ oc rsh -n sinep-arquivos-tqs-22-qqgk7 \ bash -c 'timeout 3 bash -c "</dev/tcp/10.192.224.100/1415" && echo ABERTA || echo FECHADA'
Error from server (NotFound): pods " bash" not found
-sh-4.2$
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
^Ccommand terminated with exit code 130
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs -n sinep-tqs sinep-relatorios-tqs-21-deploy
--> Scaling up sinep-relatorios-tqs-21 from 0 to 1, scaling down sinep-relatorios-tqs-18 from 1 to 0 (keep 1 pods available, don't exceed 2 pods)
    Scaling sinep-relatorios-tqs-21 up to 1
error: timed out waiting for any update progress to be made
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
