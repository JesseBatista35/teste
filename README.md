✅ AGORA VAMOS USAR O IP CORRETO:
bashcd /opt/jboss/jboss-eap/bin
./jboss-cli.sh -c --controller=10.116.94.206:9999 "/host=sbrdeapllx099/server-config=siosp_node1_lx099:stop"
Espere 15-20 segundos depois execute:
bashps aux | grep siosp_node1_lx099 | grep java
Se o servidor parou, você verá MENOS processos java.

Execute o comando de parada e compartilhe o resultado! 🚀
