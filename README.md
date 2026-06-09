Vamos verificar a configuração correta:
bashgrep -A 5 -B 5 "siosp\|simcn" /opt/jboss/jboss-eap/hc/configuration/host-slave.xml | head -30
E depois:
bashls -la /opt/jboss/jboss-eap/hc/deployments.d/ 2>/dev/null || echo "Diretório não existe"

A boa notícia: Você estava certo em questionar! Mas a correção do DOM4J que fizemos foi CORRETA porque afeta TODA aplicação Java que usa Hibernate (incluindo SIMCN se for parte do SIOSP).
Execute os comandos acima! Aí vamos encontrar exatamente onde a aplicação deveria estar deployada.
