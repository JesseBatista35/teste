O arquivo sicmu_jconnector.properties no servidor DES está com os valores devidamente preenchidos - não há mais nenhum placeholder (tokens do tipo CICSISO_USR, CICS_PORT, etc) no arquivo. Confirmamos via:

cat /opt/jboss-eap/standalone/configuration/sicmu_jconnector.properties | grep "__"

Resultado vazio, ou seja, a substituição de variáveis pelos valores reais do ambiente foi feita corretamente durante o deploy.
