[domain@10.116.94.221:9999 /] exit
[root@sbrdeapllx114 tmp]# tail -100 /opt/jboss/jboss-eap/hc/servers/sinad_node1_lx114/log/server.log | grep -i -A3 "ssl|pkix|certificate|handshake|api.des.caixa"
[root@sbrdeapllx114 tmp]#
[root@sbrdeapllx114 tmp]#
[root@sbrdeapllx114 tmp]#
[root@sbrdeapllx114 tmp]#
[root@sbrdeapllx114 tmp]# tail -150 /opt/jboss/jboss-eap/hc/servers/sinad_node1_lx114/log/server.log | grep -iE "ssl|pkix|certificate|handshake|api.des.caixa"
[root@sbrdeapllx114 tmp]#
[root@sbrdeapllx114 tmp]#
[root@sbrdeapllx114 tmp]#
[root@sbrdeapllx114 tmp]#
[root@sbrdeapllx114 tmp]# sudo /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.94.221:9999 \
>   --command="/host=sbrdeapllx114_risco/server-config=sinad_node1_lx114:read-attribute(name=status)"
Sinto muito, usuário root não tem permissão para executar "/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.94.221:9999 --command=/host=sbrdeapllx114_risco/server-config=sinad_node1_lx114:read-attribute(name=status)" como root em sbrdeapllx114.extra.caixa.gov.br.
[root@sbrdeapllx114 tmp]#
[root@sbrdeapllx114 tmp]#
[root@sbrdeapllx114 tmp]#
[root@sbrdeapllx114 tmp]# tail -50 /opt/jboss/jboss-eap/hc/servers/sinad_node1_lx114/log/server.log
2026-08-06 16:55:10,019 DEBUG [io.undertow.request] (default I/O-4) Received CPING, sending CPONG
2026-08-06 16:55:10,111 DEBUG [io.undertow.request] (default I/O-1) Received CPING, sending CPONG
2026-08-06 16:55:14,895 DEBUG [org.jboss.modcluster] (UndertowEventHandlerAdapter - 1) MODCLUSTER000009: Sending STATUS for default-server
2026-08-06 16:55:14,897 DEBUG [io.undertow.request] (default I/O-7) Received CPING, sending CPONG
2026-08-06 16:55:14,899 DEBUG [io.undertow.request] (default I/O-8) Received CPING, sending CPONG
2026-08-06 16:55:15,024 DEBUG [io.undertow.request] (default I/O-8) Received CPING, sending CPONG
2026-08-06 16:55:15,130 DEBUG [io.undertow.request] (default I/O-1) Received CPING, sending CPONG
2026-08-06 16:55:20,029 DEBUG [io.undertow.request] (default I/O-2) Received CPING, sending CPONG
2026-08-06 16:55:20,145 DEBUG [io.undertow.request] (default I/O-7) Received CPING, sending CPONG
2026-08-06 16:55:24,900 DEBUG [org.jboss.modcluster] (UndertowEventHandlerAdapter - 1) MODCLUSTER000009: Sending STATUS for default-server
2026-08-06 16:55:24,902 DEBUG [io.undertow.request] (default I/O-7) Received CPING, sending CPONG
2026-08-06 16:55:24,904 DEBUG [io.undertow.request] (default I/O-8) Received CPING, sending CPONG
2026-08-06 16:55:25,034 DEBUG [io.undertow.request] (default I/O-4) Received CPING, sending CPONG
2026-08-06 16:55:25,162 DEBUG [io.undertow.request] (default I/O-7) Received CPING, sending CPONG
2026-08-06 16:55:26,141 FINE  [io.netty.buffer.PoolThreadCache] (threadDeathWatcher-2-1) Freed 1 thread-local buffer(s) from thread: threadDeathWatcher-2-1
2026-08-06 16:55:30,039 DEBUG [io.undertow.request] (default I/O-4) Received CPING, sending CPONG
2026-08-06 16:55:30,177 DEBUG [io.undertow.request] (default I/O-1) Received CPING, sending CPONG
2026-08-06 16:55:34,905 DEBUG [org.jboss.modcluster] (UndertowEventHandlerAdapter - 1) MODCLUSTER000009: Sending STATUS for default-server
2026-08-06 16:55:34,906 DEBUG [io.undertow.request] (default I/O-7) Received CPING, sending CPONG
2026-08-06 16:55:34,908 DEBUG [io.undertow.request] (default I/O-8) Received CPING, sending CPONG
2026-08-06 16:55:35,044 DEBUG [io.undertow.request] (default I/O-8) Received CPING, sending CPONG
2026-08-06 16:55:35,194 DEBUG [io.undertow.request] (default I/O-1) Received CPING, sending CPONG
2026-08-06 16:55:40,049 DEBUG [io.undertow.request] (default I/O-2) Received CPING, sending CPONG
2026-08-06 16:55:40,210 DEBUG [io.undertow.request] (default I/O-7) Received CPING, sending CPONG
2026-08-06 16:55:44,909 DEBUG [org.jboss.modcluster] (UndertowEventHandlerAdapter - 1) MODCLUSTER000009: Sending STATUS for default-server
2026-08-06 16:55:44,911 DEBUG [io.undertow.request] (default I/O-7) Received CPING, sending CPONG
2026-08-06 16:55:44,913 DEBUG [io.undertow.request] (default I/O-4) Received CPING, sending CPONG
2026-08-06 16:55:45,055 DEBUG [io.undertow.request] (default I/O-8) Received CPING, sending CPONG
2026-08-06 16:55:45,225 DEBUG [io.undertow.request] (default I/O-7) Received CPING, sending CPONG
2026-08-06 16:55:50,059 DEBUG [io.undertow.request] (default I/O-8) Received CPING, sending CPONG
2026-08-06 16:55:50,241 DEBUG [io.undertow.request] (default I/O-1) Received CPING, sending CPONG
2026-08-06 16:55:54,914 DEBUG [org.jboss.modcluster] (UndertowEventHandlerAdapter - 1) MODCLUSTER000009: Sending STATUS for default-server
2026-08-06 16:55:54,915 DEBUG [io.undertow.request] (default I/O-1) Received CPING, sending CPONG
2026-08-06 16:55:54,917 DEBUG [io.undertow.request] (default I/O-8) Received CPING, sending CPONG
2026-08-06 16:55:55,064 DEBUG [io.undertow.request] (default I/O-8) Received CPING, sending CPONG
2026-08-06 16:55:55,257 DEBUG [io.undertow.request] (default I/O-1) Received CPING, sending CPONG
2026-08-06 16:56:00,069 DEBUG [io.undertow.request] (default I/O-8) Received CPING, sending CPONG
2026-08-06 16:56:00,274 DEBUG [io.undertow.request] (default I/O-7) Received CPING, sending CPONG
2026-08-06 16:56:04,918 DEBUG [org.jboss.modcluster] (UndertowEventHandlerAdapter - 1) MODCLUSTER000009: Sending STATUS for default-server
2026-08-06 16:56:04,920 DEBUG [io.undertow.request] (default I/O-1) Received CPING, sending CPONG
2026-08-06 16:56:04,922 DEBUG [io.undertow.request] (default I/O-8) Received CPING, sending CPONG
2026-08-06 16:56:05,074 DEBUG [io.undertow.request] (default I/O-2) Received CPING, sending CPONG
2026-08-06 16:56:05,289 DEBUG [io.undertow.request] (default I/O-1) Received CPING, sending CPONG
2026-08-06 16:56:10,079 DEBUG [io.undertow.request] (default I/O-2) Received CPING, sending CPONG
2026-08-06 16:56:10,306 DEBUG [io.undertow.request] (default I/O-7) Received CPING, sending CPONG
2026-08-06 16:56:14,923 DEBUG [org.jboss.modcluster] (UndertowEventHandlerAdapter - 1) MODCLUSTER000009: Sending STATUS for default-server
2026-08-06 16:56:14,924 DEBUG [io.undertow.request] (default I/O-7) Received CPING, sending CPONG
2026-08-06 16:56:14,926 DEBUG [io.undertow.request] (default I/O-8) Received CPING, sending CPONG
2026-08-06 16:56:15,084 DEBUG [io.undertow.request] (default I/O-2) Received CPING, sending CPONG
2026-08-06 16:56:15,322 DEBUG [io.undertow.request] (default I/O-1) Received CPING, sending CPONG
[root@sbrdeapllx114 tmp]#

