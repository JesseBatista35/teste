
Senha Incorreta, tente novamente
[sudo] password for p585600:
5568:10:10:28,794 WARN  [org.hibernate.engine.jdbc.spi.SqlExceptionHelper] (default task-3) Origination unknown: [10228][11541][4.16.53] Ocorreram exceções de segurança ao carregar o driver. ERRORCODE=4223, SQLSTATE=null
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ sudo sed -n '<linha-80>,<linha>p' /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -E "URI=|task-3"
sed: -e expression #1, char 1: unknown command: `<'
[p585600@cbrdeapllx473 ~]$
