cat /opt/jboss-eap/modules/system/layers/base/br/gov/caixa/framework/main/module.xml

ls -la /opt/jboss-eap/modules/system/layers/base/br/gov/caixa/framework/main/

unzip -p /opt/jboss-eap/standalone/deployments/SICMU-ear.ear META-INF/jboss-deployment-structure.xml



O erro atual é este:

Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
at br.gov.caixa.sgr.publico.portal.comunicacao.factory.autorizacao.AutorizacaoFactory.getConexao
at br.gov.caixa.sicmu.seguranca.service.ValidadorAcessoServiceBean.validaAcesso

Isso não é mais sobre o arquivo jconnector.properties (isso já está corrigido). Agora é uma falha de carregamento de classe Java (NoClassDefFoundError) - o JBoss não está conseguindo carregar a classe JConnectorException na hora de validar o acesso do usuário.
