# 1. Ver se há acesso a repositório Maven via proxy corporativo (não vai direto à internet)
curl -x http://<proxy_corporativo>:<porta> -o /tmp/jboss-logmanager-1.5.4.Final-redhat-1.jar \
  "https://maven.repository.redhat.com/ga/org/jboss/logmanager/jboss-logmanager/1.5.4.Final-redhat-1/jboss-logmanager-1.5.4.Final-redhat-1.jar"

# 2. Alternativa: procurar se esse jar (ou uma cópia dele) está embutido em algum outro pacote local, como dentro de outra instalação EAP não corrompida no mesmo host, ou dentro de algum .ear/.war antigo em backup
find / -path /proc -prune -o -iname "jboss-logmanager*.jar" -print 2>/dev/null
