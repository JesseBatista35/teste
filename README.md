
[root@sbrdeapllx104 p585600]# systemctl show jboss-eap7_hc -p LimitNPROC -p LimitNOFILE -p User -p PAMName
LimitNOFILE=4096
LimitNPROC=47246
User=
PAMName=
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# ls -la /etc/systemd/system/jboss-eap7_hc.service.d/ 2>/dev/null
[root@sbrdeapllx104 p585600]# cat /etc/systemd/system/jboss-eap7_hc.service.d/*.conf 2>/dev/null
[root@sbrdeapllx104 p585600]# cat /etc/systemd/system/jboss-eap7_hc.service | grep -i user
    WantedBy=multi-user.target
[root@sbrdeapllx104 p585600]# systemctl status jboss-eap7_hc
● jboss-eap7_hc.service - JBoss EAP Systemctl - HC
   Loaded: loaded (/etc/systemd/system/jboss-eap7_hc.service; enabled; vendor preset: disabled)
   Active: inactive (dead) since Ter 2026-09-08 12:48:49 -03; 1 day 5h ago
 Main PID: 13858

Set 09 00:02:45 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
Set 09 02:02:52 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
Set 09 04:02:46 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
Set 09 06:02:45 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
Set 09 08:02:42 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
Set 09 10:02:54 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
Set 09 12:03:34 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
Set 09 14:02:45 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
Set 09 16:02:46 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
Set 09 18:02:45 sbrdeapllx104.extra.caixa.gov.br systemd[1]: [/etc/systemd/system/jboss-eap7_hc.service:12] Unknown lvalue 'ExecRestart' in section 'Service'
[root@sbrdeapllx104 p585600]#
