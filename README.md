grep -A 1 "br.gov.caixa.psc.connector.util.Config" /opt/jboss-eap/standalone/configuration/standalone.xml

<property name="br.gov.caixa.psc.connector.util.Config" value="/opt/jboss-eap/standalone/configuration/sicmu_jconnector.properties" />

ls -la /opt/jboss-eap/standalone/configuration/sicmu_jconnector.properties

tail -f /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log

grep -i "jconnector" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | tail -30

curl -Ik https://servicossociais.des.corerj.caixa/LoginIntranetAction.do





Prezados,

Identificamos uma nova ocorrência do mesmo erro reportado anteriormente (SIMSC/SIAME), agora no projeto SIECO-Android, na etapa "Android - Firebase Distribution App":

Error: failed to upload distribution. HTTP Error: 500, Unknown Error

Atenção — esse caso é num agente diferente do já reportado:

Agente anterior (SIMSC/SIAME): cadsvaprlx015 (pool Mobilidade-Linux-Proxy), Node 10
Este novo caso (SIECO): pool agent-mobile-linux-2024, usando Node 16 (externals/node16/bin/node)

Como esse agente já roda uma versão de Node mais recente, isso é um dado importante: ou o problema também afeta versões mais novas de Node/firebase-tools, ou é uma causa adicional/diferente da que identificamos no outro agente. Vale investigar a versão do firebase-tools especificamente nesse agente agent-mobile-linux-2024 também.

Contexto da falha:

Release ID 506493 / 504400, ambientes DES e HMP - Firebase e Google Play
App: Ecobranca 1.0.0
App ID: 1:312090002901:android:7f86585e9c7483a3dc695c
A falha ocorre ~4-5 segundos após iniciar o upload, mesmo padrão de erro genérico já visto

Observação adicional no log: aparece um warning de certificado (Ignoring extra certs from /etc/pki/ca-trust/source/anchors/AC-V4.cer, load failed) — não necessariamente relacionado à causa raiz, mas registrando caso seja relevante na investigação.

Solicito que, ao tratar a correção já solicitada para o pool Mobilidade-Linux-Proxy, verifiquem também a versão do firebase-tools no pool agent-mobile-linux-2024, já que o mesmo sintoma está aparecendo lá com uma versão de Node diferente.
