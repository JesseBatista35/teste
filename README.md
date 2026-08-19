Passo a passo pra inserir agora

1. Fazer backup antes de qualquer edição (obrigatório em servidor)

bash
sudo cp /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/configuration/standalone.xml /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/configuration/standalone.xml.bkp.$(date +%Y%m%d_%H%M)

2. Editar o arquivo

bash
sudo vi /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/configuration/standalone.xml

3. Localizar a linha 79 (a última property antes do fechamento, https.nonProxyHosts) e inserir as duas novas properties logo depois dela, antes de </system-properties> (linha 80):

xml
        <property name="https.nonProxyHosts" value="localhost|127.0.0.1|*.caixa"/>
        <property name="sismh.api.keycloak.public.key" value="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzcYY/UbvrEldbQRd4TgLeP9bS8YnaL67MZUsfozWRyocBF3S0L7UEbkPaPoCoBnhoRv8VJHp0grqe3mqEmkMuDlt20Vx6q04ADDyS0c8xaU+Ot+g1Pgwjze944ATUjZogEMko6jvqqUGTt/Nt64yCCIaMaTB119vOBExQim7vPHNe/o7hLxh6VBYINxFA/esxjz8j28/uJWIiK0Gvt07Yx7ycn2DJlQHjnH2GzCSUL87AAYmjyYxW2JZaPLLvRlpcHIWrlr9GNtLiq0++xfJ0jFYxQWs1jxhlfXdqr8NE5vfA/RRRjRFnWzFOhIsOnIHPO9eEwwYzCZSoW2zXkFDYwIDAQAB"/>
        <property name="sismh.api.clients.servico.id" value="cli-ser-smh"/>
    </system-properties>

4. Validar sintaxe antes de reiniciar (se tiver xmllint disponível)

bash
xmllint --noout /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/configuration/standalone.xml && echo "XML válido"

5. Reiniciar o JBoss (confirma com o time o método correto pra esse servidor — service, script custom, etc.)

6. Validar as properties carregadas

bash
grep -A2 "sismh.api" /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/configuration/standalone.
