# Ver detalhes do erro mais recente
systemctl status jboss-eap6-CSD2.service --no-pager -l
journalctl -xe --no-pager | tail -60

# Ver log específico do JBoss para CSD2, que deve ter sido criado/atualizado no start
tail -50 /var/log/jboss-as/consoleCSD2.log
tail -50 /home/siaoi/jboss-eap-6.4/CSD2/log/server.log

/etc/rc.d/init.d/jboss-eap6-CSD2.sh start




[root@caddeapllx698 p585600]# systemctl status jboss-eap6-CSD2.service --no-pager -l
● jboss-eap6-CSD2.service - SYSV: JBoss AS Standalone
   Loaded: loaded (/etc/rc.d/init.d/jboss-eap6-CSD2.sh; bad; vendor preset: disabled)
   Active: failed (Result: protocol) since Mon 2026-08-24 15:49:51 -03; 3min 54s ago
     Docs: man:systemd-sysv-generator(8)
  Process: 1324 ExecStart=/etc/rc.d/init.d/jboss-eap6-CSD2.sh start (code=exited, status=0/SUCCESS)

Aug 24 15:49:20 caddeapllx698.extra.caixa.gov.br systemd[1]: Starting SYSV: JBoss AS Standalone...
Aug 24 15:49:20 caddeapllx698.extra.caixa.gov.br runuser[1339]: pam_unix(runuser:session): session opened for user root by (uid=0)
Aug 24 15:49:20 caddeapllx698.extra.caixa.gov.br runuser[1339]: pam_unix(runuser:session): session closed for user root
Aug 24 15:49:51 caddeapllx698.extra.caixa.gov.br jboss-eap6-CSD2.sh[1324]: Inicializando JBOSS_CSDA: JBOSS_CSDA JBOSS startado com sucesso
Aug 24 15:49:51 caddeapllx698.extra.caixa.gov.br jboss-eap6-CSD2.sh[1324]: [  OK  ]
Aug 24 15:49:51 caddeapllx698.extra.caixa.gov.br systemd[1]: Can't open PID file /var/run/jboss-as/jboss-as-standalone.pid (yet?) after start: No such file or directory
Aug 24 15:49:51 caddeapllx698.extra.caixa.gov.br systemd[1]: Failed to start SYSV: JBoss AS Standalone.
Aug 24 15:49:51 caddeapllx698.extra.caixa.gov.br systemd[1]: Unit jboss-eap6-CSD2.service entered failed state.
Aug 24 15:49:51 caddeapllx698.extra.caixa.gov.br systemd[1]: jboss-eap6-CSD2.service failed.
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]# journalctl -xe --no-pager | tail -60
Aug 24 15:53:28 caddeapllx698.extra.caixa.gov.br himds[2054]: Failed to write to log, can't rename log file: rename /var/opt/azcmagent/log/himds.log /var/opt/azcmagent/log/himds-2026-08-24T18-53-28.663.log: permission denied
Aug 24 15:53:28 caddeapllx698.extra.caixa.gov.br himds[2054]: Failed to write to log, can't rename log file: rename /var/opt/azcmagent/log/himds.log /var/opt/azcmagent/log/himds-2026-08-24T18-53-28.664.log: permission denied
Aug 24 15:53:29 caddeapllx698.extra.caixa.gov.br himds[2054]: Failed to write to log, can't rename log file: rename /var/opt/azcmagent/log/himds.log /var/opt/azcmagent/log/himds-2026-08-24T18-53-29.665.log: permission denied
Aug 24 15:53:30 caddeapllx698.extra.caixa.gov.br himds[2054]: Failed to write to log, can't rename log file: rename /var/opt/azcmagent/log/himds.log /var/opt/azcmagent/log/himds-2026-08-24T18-53-30.665.log: permission denied
Aug 24 15:53:31 caddeapllx698.extra.caixa.gov.br himds[2054]: Failed to write to log, can't rename log file: rename /var/opt/azcmagent/log/himds.log /var/opt/azcmagent/log/himds-2026-08-24T18-53-31.665.log: permission denied
Aug 24 15:53:32 caddeapllx698.extra.caixa.gov.br himds[2054]: Failed to write to log, can't rename log file: rename /var/opt/azcmagent/log/himds.log /var/opt/azcmagent/log/himds-2026-08-24T18-53-32.665.log: permission denied
Aug 24 15:53:33 caddeapllx698.extra.caixa.gov.br himds[2054]: Failed to write to log, can't rename log file: rename /var/opt/azcmagent/log/himds.log /var/opt/azcmagent/log/himds-2026-08-24T18-53-33.665.log: permission denied
Aug 24 15:53:34 caddeapllx698.extra.caixa.gov.br himds[2054]: Failed to write to log, can't rename log file: rename /var/opt/azcmagent/log/himds.log /var/opt/azcmagent/log/himds-2026-08-24T18-53-34.666.log: permission denied
Aug 24 15:53:35 caddeapllx698.extra.caixa.gov.br himds[2054]: Failed to write to log, can't rename log file: rename /var/opt/azcmagent/log/himds.log /var/opt/azcmagent/log/himds-2026-08-24T18-53-35.666.log: permission denied
Aug 24 15:53:36 caddeapllx698.extra.caixa.gov.br himds[2054]: Failed to write to log, can't rename log file: rename /var/opt/azcmagent/log/himds.log /var/opt/azcmagent/log/himds-2026-08-24T18-53-36.666.log: permission denied
Aug 24 15:53:37 caddeapllx698.extra.caixa.gov.br himds[2054]: Failed to write to log, can't rename log file: rename /var/opt/azcmagent/log/himds.log /var/opt/azcmagent/log/himds-2026-08-24T18-53-37.666.log: permission denied
Aug 24 15:53:38 caddeapllx698.extra.caixa.gov.br himds[2054]: Failed to write to log, can't rename log file: rename /var/opt/azcmagent/log/himds.log /var/opt/azcmagent/log/himds-2026-08-24T18-53-38.667.log: permission denied
Aug 24 15:53:38 caddeapllx698.extra.caixa.gov.br systemd[1]: himdsd.service: main process exited, code=exited, status=1/FAILURE
Aug 24 15:53:38 caddeapllx698.extra.caixa.gov.br systemd[1]: Unit himdsd.service entered failed state.
Aug 24 15:53:38 caddeapllx698.extra.caixa.gov.br systemd[1]: himdsd.service failed.
Aug 24 15:53:43 caddeapllx698.extra.caixa.gov.br systemd[1]: himdsd.service holdoff time over, scheduling restart.
Aug 24 15:53:43 caddeapllx698.extra.caixa.gov.br systemd[1]: Stopping Extension Service...
-- Subject: Unit extd.service has begun shutting down
-- Defined-By: systemd
-- Support: http://lists.freedesktop.org/mailman/listinfo/systemd-devel
--
-- Unit extd.service has begun shutting down.
Aug 24 15:53:45 caddeapllx698.extra.caixa.gov.br bash[2096]: Comando: [p585600:root@caddeapllx698 /home/p585600]# systemctl status jboss-eap6-CSD2.service --no-pager -l
Aug 24 15:53:50 caddeapllx698.extra.caixa.gov.br systemd[1]: Stopped Extension Service.
-- Subject: Unit extd.service has finished shutting down
-- Defined-By: systemd
-- Support: http://lists.freedesktop.org/mailman/listinfo/systemd-devel
--
-- Unit extd.service has finished shutting down.
Aug 24 15:53:50 caddeapllx698.extra.caixa.gov.br systemd[1]: Stopped Azure Connected Machine Agent Service.
-- Subject: Unit himdsd.service has finished shutting down
-- Defined-By: systemd
-- Support: http://lists.freedesktop.org/mailman/listinfo/systemd-devel
--
-- Unit himdsd.service has finished shutting down.
Aug 24 15:53:50 caddeapllx698.extra.caixa.gov.br systemd[1]: Started Azure Connected Machine Agent Service.
-- Subject: Unit himdsd.service has finished start-up
-- Defined-By: systemd
-- Support: http://lists.freedesktop.org/mailman/listinfo/systemd-devel
--
-- Unit himdsd.service has finished starting up.
--
-- The start-up result is done.
Aug 24 15:53:50 caddeapllx698.extra.caixa.gov.br systemd[1]: Started Extension Service.
-- Subject: Unit extd.service has finished start-up
-- Defined-By: systemd
-- Support: http://lists.freedesktop.org/mailman/listinfo/systemd-devel
--
-- Unit extd.service has finished starting up.
--
-- The start-up result is done.
Aug 24 15:53:50 caddeapllx698.extra.caixa.gov.br himds[2139]: Failed to write to log, can't rename log file: rename /var/opt/azcmagent/log/himds.log /var/opt/azcmagent/log/himds-2026-08-24T18-53-50.966.log: permission denied
Aug 24 15:53:50 caddeapllx698.extra.caixa.gov.br himds[2139]: Failed to write to log, invalid argument
Aug 24 15:53:50 caddeapllx698.extra.caixa.gov.br himds[2139]: Failed to write to log, can't rename log file: rename /var/opt/azcmagent/log/himds.log /var/opt/azcmagent/log/himds-2026-08-24T18-53-50.967.log: permission denied
Aug 24 15:53:50 caddeapllx698.extra.caixa.gov.br himds[2139]: Failed to write to log, can't rename log file: rename /var/opt/azcmagent/log/himds.log /var/opt/azcmagent/log/himds-2026-08-24T18-53-50.967.log: permission denied
Aug 24 15:53:50 caddeapllx698.extra.caixa.gov.br himds[2139]: Failed to write to log, can't rename log file: rename /var/opt/azcmagent/log/himds.log /var/opt/azcmagent/log/himds-2026-08-24T18-53-50.967.log: permission denied
Aug 24 15:53:50 caddeapllx698.extra.caixa.gov.br himds[2139]: Failed to write to log, can't rename log file: rename /var/opt/azcmagent/log/himds.log /var/opt/azcmagent/log/himds-2026-08-24T18-53-50.967.log: permission denied
Aug 24 15:53:51 caddeapllx698.extra.caixa.gov.br himds[2139]: Failed to write to log, can't rename log file: rename /var/opt/azcmagent/log/himds.log /var/opt/azcmagent/log/himds-2026-08-24T18-53-51.967.log: permission denied
Aug 24 15:53:52 caddeapllx698.extra.caixa.gov.br himds[2139]: Failed to write to log, can't rename log file: rename /var/opt/azcmagent/log/himds.log /var/opt/azcmagent/log/himds-2026-08-24T18-53-52.967.log: permission denied
Aug 24 15:53:53 caddeapllx698.extra.caixa.gov.br bash[2184]: Comando: [p585600:root@caddeapllx698 /home/p585600]# journalctl -xe --no-pager | tail -60
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]#
[root@caddeapllx698 p585600]# tail -50 /var/log/jboss-as/consoleCSD2.log
bash: /home/siaoi/jboss-eap-6.4/bin/standaloneCSD2.sh: No such file or directory
[root@caddeapllx698 p585600]# tail -50 /home/siaoi/jboss-eap-6.4/CSD2/log/server.log

[root@caddeapllx698 p585600]# /etc/rc.d/init.d/jboss-eap6-CSD2.sh start
Reloading systemd:                                         [  OK  ]
Starting jboss-eap6-CSD2.sh (via systemctl):  Failed to start jboss-eap6-CSD2.sh.service: Unit not found.
                                                           [FAILED]
[root@caddeapllx698 p585600]#
