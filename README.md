
-sh-4.2$
-sh-4.2$ hostname
caddeapllx2484.agil.nprd.caixa.gov.br
-sh-4.2$
-sh-4.2$
-sh-4.2$ ls -la /logs/httpd/ | grep sicmu
-rw-------  1 apache apache 1304491 Ago 24 16:31 sicmu-intranet-update.caixa-access.log
-rw-r--r--  1 apache apache  101626 Ago  6 11:22 sicmu-intranet-update.caixa-access.log-20260731
-rw-------  1 apache apache    2651 Ago 17 10:47 sicmu-intranet-update.caixa-error.log
-rw-r--r--  1 apache apache       0 Jul 30 16:42 sicmu-intranet-update.caixa-error.log-20260731
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep "24/Aug/2026:15:02:3[0-9]" /logs/httpd/sicmu-intranet-update.caixa-access.log
grep: /logs/httpd/sicmu-intranet-update.caixa-access.log: Permissão negada
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep "24/Aug/2026:15:02:38" /logs/httpd/sicmu-intranet-update.caixa-access.log | wc -l
grep: /logs/httpd/sicmu-intranet-update.caixa-access.log: Permissão negada
0
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep "24/Aug/2026:15:02:38" /logs/httpd/sicmu-intranet-update.caixa-access.log
grep: /logs/httpd/sicmu-intranet-update.caixa-access.log: Permissão negada
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ sudo su
[sudo] senha para p585600:
,[root@caddeapllx2484 p585600]# ,grep "24/Aug/2026:15:02:38" /logs/httpd/sicmu-intranet-update.caixa-access.log
bash: ,grep: comando não encontrado
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]# grep "24/Aug/2026:15:02:38" /logs/httpd/sicmu-intranet-update.caixa-access.log
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]# grep "24/Aug/2026:15:02:38" /logs/httpd/sicmu-intranet-update.caixa-access.log | wc -l
0
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]# grep "24/Aug/2026:15:02:3[0-9]" /logs/httpd/sicmu-intranet-update.caixa-access.log
[root@caddeapllx2484 p585600]#
