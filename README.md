Não é a mesma correção. No online, o gec-web.war não enxergava um jar que estava implantado. No batch, os três deployments que o EAR pede (framework.jar, framework_sisgd.jar e wmq.jmsra.rar) nem estão implantados no servidor, e o log reclama dos módulos jboss.module.spec.service."deployment.framework.jar".main e dos outros dois como “faltam”. Sem esses módulos, o gec-ear.ear não consegue resolver as próprias dependências. Quem declara essas dependências é o descritor do EAR do batch (application-batch), que está correto.

No trecho do log que você mandou não aparece nenhuma implantação deles. Aparece só o gec-ear.ear falhando. Pelas três primeiras linhas do seu anexo, os arquivos parecem existir em alguma pasta, mas não sei se é a pasta que o JBoss do batch escaneia.

As causas mais prováveis, em ordem:

Os três arquivos não estão na pasta deployments do JBoss do batch (a esteira não os copiou para esse host).
Estão na pasta, mas sem o marcador .dodeploy ou .deployed, ou o scanner está olhando outro diretório.
Foram tentados e falharam antes, e há um .failed ao lado deles.

Para decidir qual é, rode no host do batch (caddeapllx2884):

ls -l /opt/jboss-eap/standalone/deployments/
/opt/jboss-eap/bin/jboss-cli.sh --connect --command="deployment-info"
grep -nE "WFLYDS0013|WFLYSRV0027|WFLYSRV0010|WFLYDS0015|framework|wmq.jmsra" /logs/jboss/jboss-eap/standalone/sigec-portabilidade-batch/server.log | head -30

O WFLYDS0013 mostra qual diretório o scanner está monitorando. Com a saída do ls, do deployment-info e do grep, eu digo se é cópia que faltou na esteira, marcador ou diretório errado.
