Vamos encontrar onde as aplicações estão configuradas para deploy:
bashgrep -i "deployment\|artifact" /opt/jboss/jboss-eap/hc/configuration/domain.xml | grep -v "permission\|deployment-permissions" | head -20
E procure especificamente por SIOSP:
bashgrep -A 3 "name=\"siosp" /opt/jboss/jboss-eap/hc/configuration/domain.xml

Execute estes dois comandos! Aí vamos ver exatamente qual versão da aplicação deveria estar deployada e onde procurar o arquivo .ear!
