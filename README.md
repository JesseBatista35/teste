
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#  systemctl status controlm_agent.service
● controlm_agent.service - Control-M Agent
     Loaded: loaded (/etc/systemd/system/controlm_agent.service; enabled; preset: disabled)
     Active: active (exited) since Sat 2026-09-26 11:28:53 -03; 2 days ago
    Process: 1142162 ExecStart=/opt/ctmage/ctm/scripts/rc.agent_user start (code=exited, status=0/SUCCESS)
        CPU: 4min 25.532s

set 26 11:28:49 caddeapllx2695.agil.nprd.caixa.gov.br rc.agent_user[1142170]: Control-M/Agent Agent Java Process started. pid: 1142950
set 26 11:28:49 caddeapllx2695.agil.nprd.caixa.gov.br su[1143050]: (to ctmagelx) root on none
set 26 11:28:49 caddeapllx2695.agil.nprd.caixa.gov.br su[1143050]: pam_systemd(su-l:session): Failed to stat() runtime directory '/run/user/20003596': Arquivo ou diretório inexistente
set 26 11:28:49 caddeapllx2695.agil.nprd.caixa.gov.br su[1143050]: pam_systemd(su-l:session): Not setting $XDG_RUNTIME_DIR, as the directory is not in order.
set 26 11:28:49 caddeapllx2695.agil.nprd.caixa.gov.br su[1143050]: pam_unix(su-l:session): session opened for user ctmagelx(uid=20003596) by (uid=0)
set 26 11:28:49 caddeapllx2695.agil.nprd.caixa.gov.br su[1143050]: pam_unix(su-l:session): session closed for user ctmagelx
set 26 11:28:51 caddeapllx2695.agil.nprd.caixa.gov.br rc.agent_user[1142170]: Control-M/Agent Listener started. pid: 1143116
set 26 11:28:52 caddeapllx2695.agil.nprd.caixa.gov.br rc.agent_user[1142170]: Control-M/Agent Tracker started. pid: 1143182
set 26 11:28:53 caddeapllx2695.agil.nprd.caixa.gov.br rc.agent_user[1142170]: Control-M/Agent started successfully.
set 26 11:28:53 caddeapllx2695.agil.nprd.caixa.gov.br systemd[1]: Started Control-M Agent.
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# /opt/ctmage/ctm/scripts/shut-ag -u ctmagelx -p ALL && systemctl restart controlm_agent.service
Killing Control-M/Agent Listener pid:1169402
1 seconds - 1169402 is still alive
2 seconds - 1169402 is still alive
3 seconds - 1169402 is still alive
2026-09-28 12:56:21 Listener process stopped
Killing Control-M/Agent Tracker pid:1169468
2026-09-28 12:56:22 Tracker process stopped
Killing Control-M/Agent Java Process pid:1169228
1 seconds - 1169228 is still alive
 Agent ping to Control-M/Server        : Failed

 Agent processes status:
 -----------------------------------------------
 Java Services                         : Running ([]  on port 30577)
 Uploader Service                      : Not Running ()
 Agent Listener                        : Not Running
 Agent Tracker                         : Not Running
 Agent Tracker-Worker                  : Not Running

 DNS Translation of Server crjdeaprlx038
 -----------------------------------------------
 Server Host Address #1                : 10.116.99.99
--- End of Report ---
2 seconds - 1169228 is still alive
2026-09-28 12:56:25 Java Process process stopped
Control-M/Agent Remote Host is not running
[root@caddeapllx2695 p585600]#
