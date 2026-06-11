ssh caddeapllx2540.agil.nprd.caixa.gov.br


tail -100 /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | grep -E "ERROR|FAILED|Exception|Caused by|iniciado|interrompido"


sudo systemctl status jboss-eap-standalone
