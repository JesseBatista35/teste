[root@sbrdeapllx104 servers]# systemctl status jboss-eap7_hc.service
● jboss-eap7_hc.service - JBoss EAP Systemctl - HC
   Loaded: loaded (/etc/systemd/system/jboss-eap7_hc.service; enabled; vendor preset: disabled)
   Active: failed (Result: resources) since Qua 2026-09-09 18:56:47 -03; 1min 8s ago
  Process: 35544 ExecStart=/opt/jboss/jboss-eap/bin/init.d/jboss-eap_hc_des.sh start (code=exited, status=0/SUCCESS)
 Main PID: 13858

Set 09 18:56:41 sbrdeapllx104.extra.caixa.gov.br systemd[1]: Starting JBoss EAP Systemctl - HC...
Set 09 18:56:41 sbrdeapllx104.extra.caixa.gov.br su[35554]: (to jboss) root on none
Set 09 18:56:47 sbrdeapllx104.extra.caixa.gov.br jboss-eap_hc_des.sh[35544]: Starting JBoss Host1 Controller - DES: [  OK  ]
Set 09 18:56:47 sbrdeapllx104.extra.caixa.gov.br systemd[1]: PID file /opt/jboss/jboss-eap/hc/tmp/jboss-hc-des.pid not readable (yet?) after start.
Set 09 18:56:47 sbrdeapllx104.extra.caixa.gov.br systemd[1]: Failed to start JBoss EAP Systemctl - HC.
Set 09 18:56:47 sbrdeapllx104.extra.caixa.gov.br systemd[1]: Unit jboss-eap7_hc.service entered failed state.
Set 09 18:56:47 sbrdeapllx104.extra.caixa.gov.br systemd[1]: jboss-eap7_hc.service failed.
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]# journalctl -xe --no-pager | tail -40
-- A unidade zabbix-agent.service está sendo iniciada.
Set 09 18:57:44 sbrdeapllx104.extra.caixa.gov.br systemd[1]: PID file /run/zabbix/zabbix_agentd.pid not readable (yet?) after start.
Set 09 18:57:44 sbrdeapllx104.extra.caixa.gov.br systemd[1]: zabbix-agent.service never wrote its PID file. Failing.
Set 09 18:57:44 sbrdeapllx104.extra.caixa.gov.br systemd[1]: Failed to start Zabbix Agent.
-- Subject: A unidade zabbix-agent.service falhou
-- Defined-By: systemd
-- Support: http://lists.freedesktop.org/mailman/listinfo/systemd-devel
--
-- A unidade zabbix-agent.service falhou.
--
-- O resultado é failed.
Set 09 18:57:44 sbrdeapllx104.extra.caixa.gov.br systemd[1]: Unit zabbix-agent.service entered failed state.
Set 09 18:57:44 sbrdeapllx104.extra.caixa.gov.br systemd[1]: zabbix-agent.service failed.
Set 09 18:57:55 sbrdeapllx104.extra.caixa.gov.br systemd[1]: zabbix-agent.service holdoff time over, scheduling restart.
Set 09 18:57:55 sbrdeapllx104.extra.caixa.gov.br systemd[1]: Stopped Zabbix Agent.
-- Subject: A unidade zabbix-agent.service concluiu o desligamento
-- Defined-By: systemd
-- Support: http://lists.freedesktop.org/mailman/listinfo/systemd-devel
--
-- A unidade zabbix-agent.service concluiu o desligamento.
Set 09 18:57:55 sbrdeapllx104.extra.caixa.gov.br systemd[1]: Starting Zabbix Agent...
-- Subject: Unidade zabbix-agent.service sendo iniciado
-- Defined-By: systemd
-- Support: http://lists.freedesktop.org/mailman/listinfo/systemd-devel
--
-- A unidade zabbix-agent.service está sendo iniciada.
Set 09 18:57:55 sbrdeapllx104.extra.caixa.gov.br systemd[1]: PID file /run/zabbix/zabbix_agentd.pid not readable (yet?) after start.
Set 09 18:57:55 sbrdeapllx104.extra.caixa.gov.br systemd[1]: zabbix-agent.service never wrote its PID file. Failing.
Set 09 18:57:55 sbrdeapllx104.extra.caixa.gov.br systemd[1]: Failed to start Zabbix Agent.
-- Subject: A unidade zabbix-agent.service falhou
-- Defined-By: systemd
-- Support: http://lists.freedesktop.org/mailman/listinfo/systemd-devel
--
-- A unidade zabbix-agent.service falhou.
--
-- O resultado é failed.
Set 09 18:57:55 sbrdeapllx104.extra.caixa.gov.br systemd[1]: Unit zabbix-agent.service entered failed state.
Set 09 18:57:55 sbrdeapllx104.extra.caixa.gov.br systemd[1]: zabbix-agent.service failed.
Set 09 18:57:56 sbrdeapllx104.extra.caixa.gov.br bash[36058]: Comando: [p585600:root@sbrdeapllx104 /opt/jboss/jboss-eap/hc/log/servers]# systemctl status jboss-eap7_hc.service
Set 09 18:58:03 sbrdeapllx104.extra.caixa.gov.br bash[36101]: Comando: [p585600:root@sbrdeapllx104 /opt/jboss/jboss-eap/hc/log/servers]# journalctl -xe --no-pager | tail -40
[root@sbrdeapllx104 servers]# systemctl show jboss-eap7_hc -p StartLimitIntervalSec -p StartLimitBurst -p NRestarts
StartLimitBurst=5
[root@sbrdeapllx104 servers]#
