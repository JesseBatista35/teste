# Ver se tem script de controle do conector
find /connector -maxdepth 2 -iname "*.sh" 2>/dev/null
ls -la /connector/bin 2>/dev/null

# Ver se é gerenciado por systemd
systemctl list-units --type=service | grep -i sirot
systemctl list-units --type=service | grep -i connector


# Troca pro usuário sirot (ou sudo se você não tiver acesso direto ao user)
sudo -u sirot kill 1989284

# Confirma que caiu
ps -ef | grep jboss

# Sobe de novo com o mesmo comando (ajuste o path se for diferente)
cd /connector/config
sudo -u sirot /opt/jboss/jdk/bin/java -server -classpath /connector/lib/ceflib2.0.5.jar:/connector/lib/connector-2.2.2.jar:/connector/lib/parser.jar:/connector/lib/xercesImpl.jar:/connector/lib/xml-apis.jar:/connector/lib/crimson.jar:/connector/lib/jaxp-api.jar:/connector/lib/ceflog2.0.1.jar:/connector/lib/mail.jar:/connector/lib/activation.jar:/connector/lib/sirotconEjb-lib_v2.2.7.jar:/connector/lib/log4j-1.2.8.jar:/connector/config:/connector/lib/jcert.jar:/connector/lib/jnet.jar:/connector/lib/jsse.jar br.gov.caixa.sirot.connector.Connector /connector/config/connector.properties /connector/config/map.properties &



cadtqapllx044
[p585600@cadtqapllx044 ~]$
[p585600@cadtqapllx044 ~]$
[p585600@cadtqapllx044 ~]$
[p585600@cadtqapllx044 ~]$
[p585600@cadtqapllx044 ~]$
[p585600@cadtqapllx044 ~]$
[p585600@cadtqapllx044 ~]$ find /connector -maxdepth 2 -iname "*.sh" 2>/dev/null
/connector/save/start-connector.sh
/connector/save/commonLib.sh
/connector/commonLib.sh
/connector/connector.sh
/connector/exec-connector.sh
/connector/kill-connector.sh
/connector/showpids.sh
/connector/shutdown-connector.sh
/connector/start-connector.sh
/connector/start.sh
/connector/status.sh
/connector/stop.sh
[p585600@cadtqapllx044 ~]$
[p585600@cadtqapllx044 ~]$
[p585600@cadtqapllx044 ~]$ ls -la /connector/bin 2>/dev/null
[p585600@cadtqapllx044 ~]$ systemctl list-units --type=service | grep -i sirot
[p585600@cadtqapllx044 ~]$ systemctl list-units --type=service | grep -i connector
  connector.service                  loaded active exited  LSB: Connector com CICS
[p585600@cadtqapllx044 ~]$
[p585600@cadtqapllx044 ~]$
[p585600@cadtqapllx044 ~]$
[p585600@cadtqapllx044 ~]$
