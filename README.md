
Every 60,0s: stat -c "%U:%G %a %y" /sigdb/sigdb/TRANSMITE                                                                                  caddeapllx2560.agil.nprd.caixa.gov.br: Fri Aug 21 11:37:06 2026

ctmagelx:controlm 775 2026-08-21 11:34:01.000755597 -0300




[root@caddeapllx2560 opt]#
[root@caddeapllx2560 opt]# watch -n 60 'stat -c "%U:%G %a %y" /sigdb/sigdb/TRANSMITE'
[root@caddeapllx2560 opt]#
[root@caddeapllx2560 opt]#
[root@caddeapllx2560 opt]#
[root@caddeapllx2560 opt]# ausearch -f /sigdb/sigdb/TRANSMITE 2>/dev/null | tail -50
[root@caddeapllx2560 opt]#
[root@caddeapllx2560 opt]#
[root@caddeapllx2560 opt]#
[root@caddeapllx2560 opt]# systemctl status auditd
● auditd.service - Security Auditing Service
     Loaded: loaded (/usr/lib/systemd/system/auditd.service; enabled; preset: enabled)
     Active: active (running) since Mon 2026-06-29 11:31:15 -03; 1 month 22 days ago
       Docs: man:auditd(8)
             https://github.com/linux-audit/audit-documentation
   Main PID: 829 (auditd)
      Tasks: 2 (limit: 23075)
     Memory: 42.9M
        CPU: 7.489s
     CGroup: /system.slice/auditd.service
             └─829 /sbin/auditd

jun 29 11:31:15 caddeapllx2560.agil.nprd.caixa.gov.br augenrules[842]: lost 0
jun 29 11:31:15 caddeapllx2560.agil.nprd.caixa.gov.br augenrules[842]: backlog 4
jun 29 11:31:15 caddeapllx2560.agil.nprd.caixa.gov.br augenrules[842]: backlog_wait_time 60000
jun 29 11:31:15 caddeapllx2560.agil.nprd.caixa.gov.br augenrules[842]: backlog_wait_time_actual 0
jun 29 11:31:15 caddeapllx2560.agil.nprd.caixa.gov.br systemd[1]: Started Security Auditing Service.
jun 29 12:20:07 caddeapllx2560.agil.nprd.caixa.gov.br auditd[829]: Audit daemon rotating log files
jul 16 14:39:49 caddeapllx2560.agil.nprd.caixa.gov.br auditd[829]: Audit daemon rotating log files
jul 22 14:13:26 caddeapllx2560.agil.nprd.caixa.gov.br auditd[829]: Audit daemon rotating log files
ago 18 14:11:14 caddeapllx2560.agil.nprd.caixa.gov.br auditd[829]: Audit daemon rotating log files
ago 19 17:48:10 caddeapllx2560.agil.nprd.caixa.gov.br auditd[829]: Audit daemon rotating log files
[root@caddeapllx2560 opt]#
