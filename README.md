Esse tipo de cache precisa de transporte de cluster, que não existe mais no modo local. Precisa trocar para local-cache. Faça direto no servidor:
bashsudo sed -i 's/<invalidation-cache name="entity" mode="SYNC">/<local-cache name="entity">/' /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml

sudo sed -i 's/<\/invalidation-cache>/<\/local-cache>/' /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
Confirma que ficou certo:
bashgrep -n "entity\|invalidation\|local-cache" /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml | grep -A2 -B2 "entity"
Depois reinicia o JBoss:
bashsudo systemctl restart $(sudo systemctl list-units | grep jboss | awk '{print $1}')
