1. Ver se o arquivo foi atualizado na máquina (pelo pipeline):
bashcat /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml | grep -A 5 "TCPPING"
Se ainda estiver com o valor antigo, o pipeline ainda não rodou com a correção.
2. Verificar outros SICMUs que usam o mesmo config:
bashsudo find /opt -name "standalone-full-ha.xml" 2>/dev/null
ls /opt/
Pode ter outras instâncias na mesma máquina ou em outras. Qual é o nome do repositório/esteira que você editou? Assim consigo te ajudar a verificar se a mudança vai afetar outros ambientes antes de rodar o pipeline.
