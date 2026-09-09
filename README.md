
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# sed -n '1,20p' /etc/systemd/system/jboss-eap7_hc.service
[Unit]
   Description=JBoss EAP Systemctl - HC
   After=NetworkManager.service

[Service]
    TimeoutStartSec=600
    TimeoutStopSec=600
    Type=forking
    ExecStart=/opt/jboss/jboss-eap/bin/init.d/jboss-eap_hc_des.sh start
    ExecStop=/opt/jboss/jboss-eap/bin/init.d/jboss-eap_hc_des.sh stop
    ExecReload=/opt/jboss/jboss-eap/bin/init.d/jboss-eap_hc_des.sh reload
    ExecRestart=/opt/jboss/jboss-eap/bin/init.d/jboss-eap_hc_des.sh restart
    PIDFile=/opt/jboss/jboss-eap/hc/tmp/jboss-hc-des.pid

[Install]
    WantedBy=multi-user.target
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# su - jboss -c 'ulimit -u'
4096
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# su - jboss -c 'ulimit -a'
core file size          (blocks, -c) 0
data seg size           (kbytes, -d) unlimited
scheduling priority             (-e) 0
file size               (blocks, -f) unlimited
pending signals                 (-i) 47246
max locked memory       (kbytes, -l) 64
max memory size         (kbytes, -m) unlimited
open files                      (-n) 1024
pipe size            (512 bytes, -p) 8
POSIX message queues     (bytes, -q) 819200
real-time priority              (-r) 0
stack size              (kbytes, -s) 8192
cpu time               (seconds, -t) unlimited
max user processes              (-u) 4096
virtual memory          (kbytes, -v) unlimited
file locks                      (-x) unlimited
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# grep -i ExecStart /etc/systemd/system/jboss-eap7_hc.service
    ExecStart=/opt/jboss/jboss-eap/bin/init.d/jboss-eap_hc_des.sh start
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# journalctl -u jboss-eap7_hc --since "2026-09-07" --until "2026-09-09 18:00" --no-pager | tail -60
-- Logs begin at Qui 2026-09-03 17:57:03 -03, end at Qua 2026-09-09 18:46:19 -03. --
Set 07 00:02:51 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
Set 07 00:02:51 sbrdeapllx104.extra.caixa.gov.br systemd[1]: jboss-eap7_hc.service: Supervising process 13858 which is not our child. We'll most likely not notice when it exits.
Set 07 02:02:46 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
Set 07 02:02:46 sbrdeapllx104.extra.caixa.gov.br systemd[1]: jboss-eap7_hc.service: Supervising process 13858 which is not our child. We'll most likely not notice when it exits.
Set 07 04:02:41 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
Set 07 04:02:41 sbrdeapllx104.extra.caixa.gov.br systemd[1]: jboss-eap7_hc.service: Supervising process 13858 which is not our child. We'll most likely not notice when it exits.
Set 07 06:02:46 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
Set 07 06:02:46 sbrdeapllx104.extra.caixa.gov.br systemd[1]: jboss-eap7_hc.service: Supervising process 13858 which is not our child. We'll most likely not notice when it exits.
Set 07 08:02:47 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
Set 07 08:02:47 sbrdeapllx104.extra.caixa.gov.br systemd[1]: jboss-eap7_hc.service: Supervising process 13858 which is not our child. We'll most likely not notice when it exits.
Set 07 10:02:43 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
Set 07 10:02:43 sbrdeapllx104.extra.caixa.gov.br systemd[1]: jboss-eap7_hc.service: Supervising process 13858 which is not our child. We'll most likely not notice when it exits.
Set 07 12:02:45 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
Set 07 12:02:45 sbrdeapllx104.extra.caixa.gov.br systemd[1]: jboss-eap7_hc.service: Supervising process 13858 which is not our child. We'll most likely not notice when it exits.
Set 07 14:03:54 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
Set 07 14:03:54 sbrdeapllx104.extra.caixa.gov.br systemd[1]: jboss-eap7_hc.service: Supervising process 13858 which is not our child. We'll most likely not notice when it exits.
Set 07 16:02:47 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
Set 07 16:02:47 sbrdeapllx104.extra.caixa.gov.br systemd[1]: jboss-eap7_hc.service: Supervising process 13858 which is not our child. We'll most likely not notice when it exits.
Set 07 18:02:44 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
Set 07 18:02:44 sbrdeapllx104.extra.caixa.gov.br systemd[1]: jboss-eap7_hc.service: Supervising process 13858 which is not our child. We'll most likely not notice when it exits.
Set 07 20:02:39 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
Set 07 20:02:40 sbrdeapllx104.extra.caixa.gov.br systemd[1]: jboss-eap7_hc.service: Supervising process 13858 which is not our child. We'll most likely not notice when it exits.
Set 07 22:02:51 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
Set 07 22:02:51 sbrdeapllx104.extra.caixa.gov.br systemd[1]: jboss-eap7_hc.service: Supervising process 13858 which is not our child. We'll most likely not notice when it exits.
Set 08 00:02:43 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
Set 08 00:02:43 sbrdeapllx104.extra.caixa.gov.br systemd[1]: jboss-eap7_hc.service: Supervising process 13858 which is not our child. We'll most likely not notice when it exits.
Set 08 02:02:44 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
Set 08 02:02:44 sbrdeapllx104.extra.caixa.gov.br systemd[1]: jboss-eap7_hc.service: Supervising process 13858 which is not our child. We'll most likely not notice when it exits.
Set 08 04:02:44 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
Set 08 04:02:44 sbrdeapllx104.extra.caixa.gov.br systemd[1]: jboss-eap7_hc.service: Supervising process 13858 which is not our child. We'll most likely not notice when it exits.
Set 08 06:02:42 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
Set 08 06:02:42 sbrdeapllx104.extra.caixa.gov.br systemd[1]: jboss-eap7_hc.service: Supervising process 13858 which is not our child. We'll most likely not notice when it exits.
Set 08 08:02:43 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
Set 08 08:02:43 sbrdeapllx104.extra.caixa.gov.br systemd[1]: jboss-eap7_hc.service: Supervising process 13858 which is not our child. We'll most likely not notice when it exits.
Set 08 10:02:42 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
Set 08 10:02:42 sbrdeapllx104.extra.caixa.gov.br systemd[1]: jboss-eap7_hc.service: Supervising process 13858 which is not our child. We'll most likely not notice when it exits.
Set 08 12:02:50 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
Set 08 12:02:50 sbrdeapllx104.extra.caixa.gov.br systemd[1]: jboss-eap7_hc.service: Supervising process 13858 which is not our child. We'll most likely not notice when it exits.
Set 08 12:48:49 sbrdeapllx104.extra.caixa.gov.br jboss-eap_hc_des.sh[15155]: Stopping JBoss Host1 Controller - DES: [  OK  ]
Set 08 14:04:05 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
Set 08 16:02:42 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
Set 08 18:02:42 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
Set 08 20:02:49 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
Set 08 22:02:46 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
Set 09 00:02:45 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
Set 09 02:02:52 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
Set 09 04:02:46 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
Set 09 06:02:45 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
Set 09 08:02:42 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
Set 09 10:02:54 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
Set 09 12:03:34 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
Set 09 14:02:45 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
Set 09 16:02:46 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
