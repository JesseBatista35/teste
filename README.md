# log principal do server (erros mais recentes)
tail -n 300 /opt/jboss/standalone/log/server.log | grep -i -E "pix|webhook|exception|error"

# acompanhar em tempo real enquanto reproduz o teste
tail -f /opt/jboss/standalone/log/server.log


# ver se dá pra resolver e alcançar o host de origem do webhook (ajusta o host/porta pro real)
curl -v telnet://<host-sispl-api>:<porta> --connect-timeout 3

# ou, se souber a URL do endpoint que deveria chamar de volta
curl -v -m 5 https://<host-que-deveria-notificar>/healthcheck
