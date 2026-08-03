# ver variáveis de ambiente que apontam pra APIs externas (SISPL, gateway PIX, etc)
env | grep -i -E "sispl|pix|host|url|api"

# ou procurar no arquivo de config do datasource/propriedades
cat /opt/jboss/standalone/configuration/standalone-okd.xml | grep -i -E "outbound|host|port"

grep -i -E "17:3[0-9]:|pix|webhook|timeout|refused|connection" /opt/jboss/standalone/log/server.log | tail -n 200
