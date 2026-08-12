grep -n "system-properties" /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml


sed -n '10,20p' /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
```//trocando 10 e 20 pelos números reais que aparecerem

Isso imprime só aquele trecho do arquivo, sem depender de caracteres especiais no grep.

Roda o primeiro comando (`grep -n "system-properties"`) e me manda os números de linha que aparecerem — aí eu te passo o `sed` com os números certos.
