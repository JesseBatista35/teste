
[sudo] senha para p585600:
[root@caddeapllx1572 p585600]# find /opt/ads-agent -type f | grep -i control
find: ‘/opt/ads-agent’: Arquivo ou diretório não encontrado
[root@caddeapllx1572 p585600]# grep -R "bmcjava-V2" .
[root@caddeapllx1572 p585600]# systemctl status controlm_agent.service
● controlm_agent.service - Control-M Agent
   Loaded: loaded (/etc/systemd/system/controlm_agent.service; enabled; vendor preset: disabled)
   Active: failed (Result: timeout) since Qua 2026-07-22 12:13:59 -03; 6min ago
  Process: 28216 ExecStop=/opt/ctmage/ctm/scripts/rc.agent_user stop (code=exited, status=0/SUCCESS)
  Process: 3524 ExecStart=/opt/ctmage/ctm/scripts/rc.agent_user start (code=killed, signal=TERM)

Jul 22 12:12:29 caddeapllx1572.agil.nprd.caixa.gov.br su[3680]: (to ctmagelx) root on none
Jul 22 12:12:29 caddeapllx1572.agil.nprd.caixa.gov.br su[3710]: (to ctmagelx) root on none
Jul 22 12:12:29 caddeapllx1572.agil.nprd.caixa.gov.br rc.agent_user[3524]: Starting the agent as 'root' user
Jul 22 12:12:29 caddeapllx1572.agil.nprd.caixa.gov.br su[3749]: (to ctmagelx) root on none
Jul 22 12:12:29 caddeapllx1572.agil.nprd.caixa.gov.br su[3762]: (to ctmagelx) root on none
Jul 22 12:13:59 caddeapllx1572.agil.nprd.caixa.gov.br systemd[1]: controlm_agent.service start operation timed out. Terminating.
Jul 22 12:13:59 caddeapllx1572.agil.nprd.caixa.gov.br rc.agent_user[3524]: Waiting for pid file of process agj to be created..............................
Jul 22 12:13:59 caddeapllx1572.agil.nprd.caixa.gov.br systemd[1]: Failed to start Control-M Agent.
Jul 22 12:13:59 caddeapllx1572.agil.nprd.caixa.gov.br systemd[1]: Unit controlm_agent.service entered failed state.
Jul 22 12:13:59 caddeapllx1572.agil.nprd.caixa.gov.br systemd[1]: controlm_agent.service failed.
[root@caddeapllx1572 p585600]#
[root@caddeapllx1572 p585600]#
[root@caddeapllx1572 p585600]#
[root@caddeapllx1572 p585600]#
[root@caddeapllx1572 p585600]# journalctl -u controlm_agent.service -n 100 --no-pager
-- Logs begin at Qua 2026-07-22 10:06:04 -03, end at Qua 2026-07-22 12:20:12 -03. --
Jul 22 10:18:40 caddeapllx1572.agil.nprd.caixa.gov.br rc.agent_user[16459]: Waiting for pid file of process agj to be created..............................
Jul 22 10:18:40 caddeapllx1572.agil.nprd.caixa.gov.br systemd[1]: Failed to start Control-M Agent.
Jul 22 10:18:40 caddeapllx1572.agil.nprd.caixa.gov.br systemd[1]: Unit controlm_agent.service entered failed state.
Jul 22 10:18:40 caddeapllx1572.agil.nprd.caixa.gov.br systemd[1]: controlm_agent.service failed.
Jul 22 11:43:59 caddeapllx1572.agil.nprd.caixa.gov.br systemd[1]: Starting Control-M Agent...
Jul 22 11:43:59 caddeapllx1572.agil.nprd.caixa.gov.br su[21961]: (to ctmagelx) root on none
Jul 22 11:43:59 caddeapllx1572.agil.nprd.caixa.gov.br rc.agent_user[21953]: Starting the agent as 'ctmagelx' user
Jul 22 11:44:02 caddeapllx1572.agil.nprd.caixa.gov.br rc.agent_user[21953]: Waiting for pid file of process agj to be created..
Jul 22 11:44:02 caddeapllx1572.agil.nprd.caixa.gov.br rc.agent_user[21953]: Control-M/Agent Agent Java Process started. pid: 21566
Jul 22 11:44:03 caddeapllx1572.agil.nprd.caixa.gov.br rc.agent_user[21953]: Control-M/Agent Listener started. pid: 21649
Jul 22 11:44:04 caddeapllx1572.agil.nprd.caixa.gov.br rc.agent_user[21953]: Control-M/Agent Tracker started. pid: 21745
Jul 22 11:44:05 caddeapllx1572.agil.nprd.caixa.gov.br rc.agent_user[21953]: Control-M/Agent started successfully.
Jul 22 11:44:05 caddeapllx1572.agil.nprd.caixa.gov.br systemd[1]: Started Control-M Agent.
Jul 22 11:50:32 caddeapllx1572.agil.nprd.caixa.gov.br systemd[1]: Stopping Control-M Agent...
Jul 22 11:50:32 caddeapllx1572.agil.nprd.caixa.gov.br su[28237]: (to ctmagelx) root on none
Jul 22 11:50:32 caddeapllx1572.agil.nprd.caixa.gov.br su[28253]: (to ctmagelx) root on none
Jul 22 11:50:32 caddeapllx1572.agil.nprd.caixa.gov.br su[28271]: (to ctmagelx) root on none
Jul 22 11:50:32 caddeapllx1572.agil.nprd.caixa.gov.br su[28288]: (to ctmagelx) root on none
Jul 22 11:50:32 caddeapllx1572.agil.nprd.caixa.gov.br su[28308]: (to ctmagelx) root on none
Jul 22 11:50:32 caddeapllx1572.agil.nprd.caixa.gov.br su[28320]: (to ctmagelx) root on none
Jul 22 11:50:32 caddeapllx1572.agil.nprd.caixa.gov.br su[28358]: (to ctmagelx) root on none
Jul 22 11:50:33 caddeapllx1572.agil.nprd.caixa.gov.br rc.agent_user[28216]: Killing Control-M/Agent Listener pid:21649
Jul 22 11:50:34 caddeapllx1572.agil.nprd.caixa.gov.br rc.agent_user[28216]: 2026-07-22 11:50:34 Listener process stopped
Jul 22 11:50:34 caddeapllx1572.agil.nprd.caixa.gov.br rc.agent_user[28216]: Killing Control-M/Agent Tracker pid:21745
Jul 22 11:50:35 caddeapllx1572.agil.nprd.caixa.gov.br rc.agent_user[28216]: 2026-07-22 11:50:35 Tracker process stopped
Jul 22 11:50:35 caddeapllx1572.agil.nprd.caixa.gov.br rc.agent_user[28216]: Killing Control-M/Agent Agent Java Process pid:21566
Jul 22 11:50:36 caddeapllx1572.agil.nprd.caixa.gov.br rc.agent_user[28216]: 2026-07-22 11:50:36 Agent Java Process process stopped
Jul 22 11:50:36 caddeapllx1572.agil.nprd.caixa.gov.br systemd[1]: Stopped Control-M Agent.
Jul 22 11:50:36 caddeapllx1572.agil.nprd.caixa.gov.br systemd[1]: Starting Control-M Agent...
Jul 22 11:50:36 caddeapllx1572.agil.nprd.caixa.gov.br su[28554]: (to ctmagelx) root on none
Jul 22 11:50:36 caddeapllx1572.agil.nprd.caixa.gov.br su[28571]: (to ctmagelx) root on none
Jul 22 11:50:36 caddeapllx1572.agil.nprd.caixa.gov.br su[28587]: (to ctmagelx) root on none
Jul 22 11:50:36 caddeapllx1572.agil.nprd.caixa.gov.br su[28604]: (to ctmagelx) root on none
Jul 22 11:50:36 caddeapllx1572.agil.nprd.caixa.gov.br su[28630]: (to ctmagelx) root on none
Jul 22 11:50:36 caddeapllx1572.agil.nprd.caixa.gov.br su[28643]: (to ctmagelx) root on none
Jul 22 11:50:36 caddeapllx1572.agil.nprd.caixa.gov.br su[28679]: (to ctmagelx) root on none
Jul 22 11:50:36 caddeapllx1572.agil.nprd.caixa.gov.br su[28692]: (to ctmagelx) root on none
Jul 22 11:50:36 caddeapllx1572.agil.nprd.caixa.gov.br su[28722]: (to ctmagelx) root on none
Jul 22 11:50:36 caddeapllx1572.agil.nprd.caixa.gov.br rc.agent_user[28537]: Starting the agent as 'root' user
Jul 22 11:50:36 caddeapllx1572.agil.nprd.caixa.gov.br su[28761]: (to ctmagelx) root on none
Jul 22 11:50:36 caddeapllx1572.agil.nprd.caixa.gov.br su[28774]: (to ctmagelx) root on none
Jul 22 11:52:06 caddeapllx1572.agil.nprd.caixa.gov.br systemd[1]: controlm_agent.service start operation timed out. Terminating.
Jul 22 11:52:06 caddeapllx1572.agil.nprd.caixa.gov.br rc.agent_user[28537]: Waiting for pid file of process agj to be created..............................
Jul 22 11:52:06 caddeapllx1572.agil.nprd.caixa.gov.br systemd[1]: Failed to start Control-M Agent.
Jul 22 11:52:06 caddeapllx1572.agil.nprd.caixa.gov.br systemd[1]: Unit controlm_agent.service entered failed state.
Jul 22 11:52:06 caddeapllx1572.agil.nprd.caixa.gov.br systemd[1]: controlm_agent.service failed.
Jul 22 11:53:12 caddeapllx1572.agil.nprd.caixa.gov.br systemd[1]: Starting Control-M Agent...
Jul 22 11:53:12 caddeapllx1572.agil.nprd.caixa.gov.br su[31516]: (to ctmagelx) root on none
Jul 22 11:53:12 caddeapllx1572.agil.nprd.caixa.gov.br su[31532]: (to ctmagelx) root on none
Jul 22 11:53:12 caddeapllx1572.agil.nprd.caixa.gov.br su[31549]: (to ctmagelx) root on none
Jul 22 11:53:12 caddeapllx1572.agil.nprd.caixa.gov.br su[31567]: (to ctmagelx) root on none
Jul 22 11:53:12 caddeapllx1572.agil.nprd.caixa.gov.br su[31592]: (to ctmagelx) root on none
Jul 22 11:53:12 caddeapllx1572.agil.nprd.caixa.gov.br su[31605]: (to ctmagelx) root on none
Jul 22 11:53:12 caddeapllx1572.agil.nprd.caixa.gov.br su[31641]: (to ctmagelx) root on none
Jul 22 11:53:12 caddeapllx1572.agil.nprd.caixa.gov.br su[31653]: (to ctmagelx) root on none
Jul 22 11:53:12 caddeapllx1572.agil.nprd.caixa.gov.br su[31683]: (to ctmagelx) root on none
Jul 22 11:53:12 caddeapllx1572.agil.nprd.caixa.gov.br rc.agent_user[31499]: Starting the agent as 'root' user
Jul 22 11:53:12 caddeapllx1572.agil.nprd.caixa.gov.br su[31722]: (to ctmagelx) root on none
Jul 22 11:53:12 caddeapllx1572.agil.nprd.caixa.gov.br su[31735]: (to ctmagelx) root on none
Jul 22 11:54:42 caddeapllx1572.agil.nprd.caixa.gov.br systemd[1]: controlm_agent.service start operation timed out. Terminating.
Jul 22 11:54:42 caddeapllx1572.agil.nprd.caixa.gov.br rc.agent_user[31499]: Waiting for pid file of process agj to be created..............................
Jul 22 11:54:42 caddeapllx1572.agil.nprd.caixa.gov.br systemd[1]: Failed to start Control-M Agent.
Jul 22 11:54:42 caddeapllx1572.agil.nprd.caixa.gov.br systemd[1]: Unit controlm_agent.service entered failed state.
Jul 22 11:54:42 caddeapllx1572.agil.nprd.caixa.gov.br systemd[1]: controlm_agent.service failed.
Jul 22 11:55:49 caddeapllx1572.agil.nprd.caixa.gov.br systemd[1]: Starting Control-M Agent...
Jul 22 11:55:49 caddeapllx1572.agil.nprd.caixa.gov.br su[2136]: (to ctmagelx) root on none
Jul 22 11:55:49 caddeapllx1572.agil.nprd.caixa.gov.br su[2152]: (to ctmagelx) root on none
Jul 22 11:55:49 caddeapllx1572.agil.nprd.caixa.gov.br su[2170]: (to ctmagelx) root on none
Jul 22 11:55:49 caddeapllx1572.agil.nprd.caixa.gov.br su[2187]: (to ctmagelx) root on none
Jul 22 11:55:49 caddeapllx1572.agil.nprd.caixa.gov.br su[2212]: (to ctmagelx) root on none
Jul 22 11:55:49 caddeapllx1572.agil.nprd.caixa.gov.br su[2225]: (to ctmagelx) root on none
Jul 22 11:55:49 caddeapllx1572.agil.nprd.caixa.gov.br su[2260]: (to ctmagelx) root on none
Jul 22 11:55:49 caddeapllx1572.agil.nprd.caixa.gov.br su[2273]: (to ctmagelx) root on none
Jul 22 11:55:49 caddeapllx1572.agil.nprd.caixa.gov.br su[2304]: (to ctmagelx) root on none
Jul 22 11:55:49 caddeapllx1572.agil.nprd.caixa.gov.br rc.agent_user[2119]: Starting the agent as 'root' user
Jul 22 11:55:49 caddeapllx1572.agil.nprd.caixa.gov.br su[2343]: (to ctmagelx) root on none
Jul 22 11:55:49 caddeapllx1572.agil.nprd.caixa.gov.br su[2356]: (to ctmagelx) root on none
Jul 22 11:57:19 caddeapllx1572.agil.nprd.caixa.gov.br systemd[1]: controlm_agent.service start operation timed out. Terminating.
Jul 22 11:57:19 caddeapllx1572.agil.nprd.caixa.gov.br rc.agent_user[2119]: Waiting for pid file of process agj to be created..............................
Jul 22 11:57:19 caddeapllx1572.agil.nprd.caixa.gov.br systemd[1]: Failed to start Control-M Agent.
Jul 22 11:57:19 caddeapllx1572.agil.nprd.caixa.gov.br systemd[1]: Unit controlm_agent.service entered failed state.
Jul 22 11:57:19 caddeapllx1572.agil.nprd.caixa.gov.br systemd[1]: controlm_agent.service failed.
Jul 22 12:12:29 caddeapllx1572.agil.nprd.caixa.gov.br systemd[1]: Starting Control-M Agent...
Jul 22 12:12:29 caddeapllx1572.agil.nprd.caixa.gov.br su[3541]: (to ctmagelx) root on none
Jul 22 12:12:29 caddeapllx1572.agil.nprd.caixa.gov.br su[3557]: (to ctmagelx) root on none
Jul 22 12:12:29 caddeapllx1572.agil.nprd.caixa.gov.br su[3575]: (to ctmagelx) root on none
Jul 22 12:12:29 caddeapllx1572.agil.nprd.caixa.gov.br su[3591]: (to ctmagelx) root on none
Jul 22 12:12:29 caddeapllx1572.agil.nprd.caixa.gov.br su[3617]: (to ctmagelx) root on none
Jul 22 12:12:29 caddeapllx1572.agil.nprd.caixa.gov.br su[3630]: (to ctmagelx) root on none
Jul 22 12:12:29 caddeapllx1572.agil.nprd.caixa.gov.br su[3667]: (to ctmagelx) root on none
Jul 22 12:12:29 caddeapllx1572.agil.nprd.caixa.gov.br su[3680]: (to ctmagelx) root on none
Jul 22 12:12:29 caddeapllx1572.agil.nprd.caixa.gov.br su[3710]: (to ctmagelx) root on none
Jul 22 12:12:29 caddeapllx1572.agil.nprd.caixa.gov.br rc.agent_user[3524]: Starting the agent as 'root' user
Jul 22 12:12:29 caddeapllx1572.agil.nprd.caixa.gov.br su[3749]: (to ctmagelx) root on none
Jul 22 12:12:29 caddeapllx1572.agil.nprd.caixa.gov.br su[3762]: (to ctmagelx) root on none
Jul 22 12:13:59 caddeapllx1572.agil.nprd.caixa.gov.br systemd[1]: controlm_agent.service start operation timed out. Terminating.
Jul 22 12:13:59 caddeapllx1572.agil.nprd.caixa.gov.br rc.agent_user[3524]: Waiting for pid file of process agj to be created..............................
Jul 22 12:13:59 caddeapllx1572.agil.nprd.caixa.gov.br systemd[1]: Failed to start Control-M Agent.
Jul 22 12:13:59 caddeapllx1572.agil.nprd.caixa.gov.br systemd[1]: Unit controlm_agent.service entered failed state.
Jul 22 12:13:59 caddeapllx1572.agil.nprd.caixa.gov.br systemd[1]: controlm_agent.service failed.
[root@caddeapllx1572 p585600]#
