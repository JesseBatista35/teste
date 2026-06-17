PASSO 1: Encontrar o Truststore
bashfind /usr/lib/jvm -name "cacerts" 2>/dev/null
ou
bashls -la /usr/lib/jvm/*/jre/lib/security/cacerts
Se não encontrar, tente:
bashreadlink -f /usr/bin/java
E veja qual é o caminho real.
