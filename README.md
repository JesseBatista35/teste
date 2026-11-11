Oi Sandra!

Avançamos: com o ajuste no ConfigMap, a configuração correta (standalone.xml de PRD) já está sendo carregada.

Agora a release parou em "Verificando Status do Deployment", por tempo esgotado. O pod está reiniciando e não fica pronto. A suspeita principal são as probes antigas do DeploymentConfig, que apontam para um script inexistente na imagem JBoss 8 e fazem o OpenShift reiniciar o container. Outra possibilidade é erro de SSL na conexão com o banco.

Como não tenho acesso a PRD, você pode pedir para alguém com acesso ao namespace sihdg-prd rodar os comandos abaixo e me mandar a saída?

oc get pods -n sihdg-prd | grep jboss8

oc get events -n sihdg-prd --sort-by=.lastTimestamp | grep -i -E "probe|kill|back-off" | tail -20

oc logs dc/sihdg-jboss8-prd -n sihdg-prd --previous | grep -E "sihdgDS|PKIX|WFLYSRV0025|WFLYSRV0026|ERROR" | head -30

oc get dc sihdg-jboss8-prd -n sihdg-prd -o yaml | grep -A10 -E "livenessProbe:|readinessProbe:"

Com isso consigo confirmar a causa e indicar o ajuste exato.

Obrigado!
