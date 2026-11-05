1. No 6.4, liste as properties do server-group sifec-intranet (linhas 57701 a 58040; só nomes, sem valores) e confira onde está o PJ:

sed -n '57701,58040p' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -oE '<property name="[^"]*"' | sed 's/<property name=//;s/"//g' | sort -u > /tmp/props64.txt; wc -l /tmp/props64.txt; cat /tmp/props64.txt
sed -n '57701,58040p' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -i workflow

Se o PJ não aparecer no segundo comando, me avise. Ele pode estar em outro server-group (sifec-intranet2..5 ou sifec-api), e aí a lista certa é a desse grupo.

2. No 7.4 (CLI do 471):

/server-group=sifec-intranet:read-children-names(child-type=system-property)

Pode me mandar as duas listas, que eu faço a comparação e te devolvo só as properties que faltam no 7.4, já com os comandos para criar (o valor você copia do 6.4).
