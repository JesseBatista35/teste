P=sipcs-login-unico-jboss-okd-des-14-7jk5f

# 1) O artefato está lá? Qual o status do deploy?
oc exec $P -- ls -la /opt/jboss/standalone/deployments/

# 2) Se aparecer algum .failed, ver o motivo
oc exec $P -- sh -c 'cat /opt/jboss/standalone/deployments/*.failed 2>/dev/null'

# 3) Linhas-chave do log de inicialização
oc logs $P | grep -E "WFLYSRV0010|WFLYSRV0025|WFLYSRV0026|WFLYUT0021|WFLYCTL0013|WFLYCTL0186|WFLYCTL0412|ERROR" | head -50

# 4) Status do deploy pelo CLI
oc exec $P -- /opt/jboss/bin/jboss-cli.sh -c --command="deployment-info"

# 5) Linha 37 do standalone.conf (o erro do byteman)
oc exec $P -- sed -n '30,40p' /opt/jboss/bin/standalone.conf
