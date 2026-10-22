# 1. O proxy libera essas URLs?
curl -sv -m 20 -x http://proxydes.caixa:80 https://brazilsouth-1.in.applicationinsights.azure.com/ -o /dev/null 2>&1 | grep -E "HTTP/|Connected|timed out|refused"
curl -sv -m 20 -x http://proxydes.caixa:80 https://brazilsouth.livediagnostics.monitor.azure.com/ -o /dev/null 2>&1 | grep -E "HTTP/|Connected|timed out|refused"

# 2. Onde está o App Insights no deploy (conteúdo atual, hash 2b6dcb33...)
C=$(ls -d /opt/jboss/jboss-eap/hc/data/content/2b/6dcb33bec92c787d6792fb3d58005f2a271760/content)
unzip -l $C | grep -iE "applicationinsights|ApplicationInsights.xml|applicationinsights.json"


mkdir -p /tmp/gec && cd /tmp/gec && unzip -oq $C && for f in *.jar *.war; do unzip -l $f | grep -iE "applicationinsights" | sed "s|^|$f: |"; done
