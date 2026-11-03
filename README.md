# no antigo (sbrdeaprlx052)
grep -RniE 'CreateBalancers|UseAlias' /opt/jbcs-httpd24-2.4/httpd/*.conf /opt/jbcs-httpd24-2.4/httpd/conf /opt/jbcs-httpd24-2.4/httpd/conf.d 2>/dev/null

# no novo (caddeapllx2794)
grep -RniE 'CreateBalancers|UseAlias' /opt/httpd/conf /opt/httpd/conf.d


httpd -t && httpd -k graceful

No sbrdeapllx104 (10.116.94.211):

bash
tail -100 /opt/jboss/jboss-eap/domain/servers/sigec-portabilidade-batch_node1_lx104/log/server.log

Procure onde o boot parou: um deploy pendurado, timers, ou conexão com fila ou banco.

Para validar o Apache novo, o Online já basta. O teste do Batch fica para quando ele estiver STARTED.





Last login: Tue Nov  3 11:30:12 2026 from 10.122.150.31
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$ grep -RniE 'CreateBalancers|UseAlias' /opt/httpd/conf /opt/httpd/conf.d
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$ httpd -t && httpd -k graceful
(13)Permission denied: AH00086: httpd: could not open error log file /opt/httpd/logs/httpd.log.
[Tue Nov 03 12:05:17.371724 2026] [so:warn] [pid 4153287:tid 4153287] AH01574: module proxy_module is already loaded, skipping
[Tue Nov 03 12:05:17.371766 2026] [so:warn] [pid 4153287:tid 4153287] AH01574: module slotmem_shm_module is already loaded, skipping
[Tue Nov 03 12:05:17.373647 2026] [so:warn] [pid 4153287:tid 4153287] AH01574: module proxy_cluster_module is already loaded, skipping
[Tue Nov 03 12:05:17.373667 2026] [so:warn] [pid 4153287:tid 4153287] AH01574: module cluster_slotmem_module is already loaded, skipping
[Tue Nov 03 12:05:17.373673 2026] [so:warn] [pid 4153287:tid 4153287] AH01574: module manager_module is already loaded, skipping
[Tue Nov 03 12:05:17.373679 2026] [so:warn] [pid 4153287:tid 4153287] AH01574: module advertise_module is already loaded, skipping
Syntax OK
(13)Permission denied: AH00086: httpd: could not open error log file /opt/httpd/logs/httpd.log.
[Tue Nov 03 12:05:17.416472 2026] [so:warn] [pid 4153290:tid 4153290] AH01574: module proxy_module is already loaded, skipping
[Tue Nov 03 12:05:17.416515 2026] [so:warn] [pid 4153290:tid 4153290] AH01574: module slotmem_shm_module is already loaded, skipping
[Tue Nov 03 12:05:17.418250 2026] [so:warn] [pid 4153290:tid 4153290] AH01574: module proxy_cluster_module is already loaded, skipping
[Tue Nov 03 12:05:17.418272 2026] [so:warn] [pid 4153290:tid 4153290] AH01574: module cluster_slotmem_module is already loaded, skipping
[Tue Nov 03 12:05:17.418279 2026] [so:warn] [pid 4153290:tid 4153290] AH01574: module manager_module is already loaded, skipping
[Tue Nov 03 12:05:17.418286 2026] [so:warn] [pid 4153290:tid 4153290] AH01574: module advertise_module is already loaded, skipping
httpd not running, trying to start
(13)Permission denied: AH00072: make_sock: could not bind to address [::]:80
(13)Permission denied: AH00072: make_sock: could not bind to address 0.0.0.0:80
no listening sockets available, shutting down
AH00015: Unable to open logs
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$



Permission denied, please try again.
p585600@10.116.98.52's password:
Permission denied, please try again.
p585600@10.116.98.52's password:
Last failed login: Tue Nov  3 12:05:46 -03 2026 from 10.116.89.0 on ssh:notty
There was 1 failed login attempt since the last successful login.
Last login: Tue Nov  3 10:40:25 2026 from 10.116.82.43
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep -RniE 'CreateBalancers|UseAlias' /opt/jbcs-httpd24-2.4/httpd/*.conf /opt/jbcs-httpd24-2.4/httpd/conf /opt/jbcs-httpd24-2.4/httpd/conf.d 2>/dev/null
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$

