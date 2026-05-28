[jboss@caddeapllx2484 log]$ sudo sed -i 's/<invalidation-cache name="entity" mode="SYNC">/<local-cache name="entity">/' /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml

Presumimos que você recebeu as instruções de sempre do administrador
de sistema local. Basicamente, resume-se a estas três coisas:

    #1) Respeite a privacidade dos outros.
    #2) Pense antes de digitar.
    #3) Com grandes poderes vêm grandes responsabilidades.

[sudo] senha para jboss:
Sinto muito, tente novamente.
[sudo] senha para jboss:
Sinto muito, tente novamente.
[sudo] senha para jboss:
sudo: 3 tentativas de senha incorreta
[jboss@caddeapllx2484 log]$ exit
exit
-sh-4.2$ sudo sed -i 's/<invalidation-cache name="entity" mode="SYNC">/<local-cache name="entity">/' /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
-sh-4.2$ sudo sed -i 's/<\/invalidation-cache>/<\/local-cache>/' /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
-sh-4.2$ grep -n "entity\|invalidation\|local-cache" /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml | grep -A2 -B2 "entity"
307:                <local-cache name="local-query">
310:                </local-cache>
311:                <local-cache name="entity">
315:                </local-cache>
316:                <local-cache name="timestamps"/>
321:            <initializers transactions="spec" security="identity"/>
-sh-4.2$




bashsudo systemctl restart $(sudo systemctl list-units | grep jboss | awk '{print $1}')
