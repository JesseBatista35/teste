oot@cadtqapllx044 p585600]# systemctl status connector.service -l --no-pager
● connector.service - LSB: Connector com CICS
   Loaded: loaded (/etc/rc.d/init.d/connector; generated)
   Active: active (exited) since Fri 2026-07-24 13:10:59 -03; 29min ago
     Docs: man:systemd-sysv-generator(8)
  Process: 3013547 ExecStop=/etc/rc.d/init.d/connector stop (code=exited, status=0/SUCCESS)
  Process: 3013604 ExecStart=/etc/rc.d/init.d/connector start (code=exited, status=0/SUCCESS)
    Tasks: 0 (limit: 139268)
   Memory: 0B
   CGroup: /system.slice/connector.service
[root@cadtqapllx044 p585600]#
[root@cadtqapllx044 p585600]#
[root@cadtqapllx044 p585600]#
[root@cadtqapllx044 p585600]# journalctl -u connector.service -n 50 --no-pager
-- Logs begin at Fri 2026-02-27 14:00:09 -03, end at Tue 2026-03-24 23:14:30 -03. --
-- No entries --
[root@cadtqapllx044 p585600]# sudo /connector/status.sh
Sorry, user root is not allowed to execute '/connector/status.sh' as root on cadtqapllx044.intra.caixa.gov.br.
[root@cadtqapllx044 p585600]#
