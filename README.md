cd /logs/jboss/jboss-eap/standalone/siacc-tela-branca/
tar czf /tmp/siacc-tela-branca-logs-04092026.tar.gz \
  server.log \
  siacc-caddeapllx2725.log \
  sirot-log-caddeapllx2725.log \
  ceflib-log-caddeapllx2725.log

  cp /tmp/siacc-tela-branca-logs-04092026.tar.gz /home/p585600/


  scp p585600@10.116.201.197:/home/p585600/siacc-tela-branca-logs-04092026.tar.gz .

  ls -la /logs/jboss/jboss-eap/standalone/siacc-tela-branca/sirot2/





