Você está na caddeapllx756 (10.116.193.244), que é a segunda VM do JBoss de DES, não um Apache. Por isso não achou nada de httpd. Aproveite que já está como root e aplique o ajuste:

bash
CFG=/opt/jboss/jboss-eap/standalone/configuration/standalone-full-ha.xml
grep -n 'ajp-listener\|node-timeout' $CFG

CLI="/opt/jboss/jboss-eap/bin/jboss-cli.sh -c --controller=10.116.193.244:9990"
$CLI '/subsystem=undertow/server=default-server/ajp-listener=ajp:write-attribute(name=max-post-size,value=209715200)'
$CLI '/subsystem=modcluster/mod-cluster-config=configuration:write-attribute(name=node-timeout,value=600)'
$CLI ':reload'

Espere uns 30 s e confirme nas duas VMs (aqui e na 763, trocando o IP):

bash
$CLI ':read-attribute(name=server-state)'
$CLI '/subsystem=undertow/server=default-server/ajp-listener=ajp:read-attribute(name=max-post-size)'

O esperado é running e 209715200. Com as duas corrigidas, peça ao Ilson para repetir o upload de 16,8 MB, de preferência já com a aba Rede do DevTools aberta.

Se ainda falhar, aí o próximo suspeito é o Apache de DES. Os hosts dele aparecem no PLAY [apache_des] da task "Configurando o Apache" na release de DES.
