Leandro Paranhos Carvalho de Souza
Rebecca Six Zamagna
pode sim, só pede, favor, para o nosso gestor criar uma história no Snow. Francisco Braz Mendes Junior.
OK, Rebecca Six Zamagna
 
Estou fazendo isso 
 
Leandro Paranhos Carvalho de Souza:
 
Fiquei só na dúvida: esse erro (inclusão da dependência do módulo jconnector) não afetaria todos os outros sistemas que dependem do SISGR?.... Todos não estariam utilizando o jconnector?.... 
 
Grato!
 
Oi Marcelo, não entendi ainda sobre essa inclusão da dependência.
 
Leandro Paranhos Carvalho de Souza.
 
a análise inicial do erro, quando levantamos a inclusão da dependencia é essa:
 
 
O erro acontecia na validação de acesso do usuário e é uma falha de carregamento de classe Java, não de configuração:
 
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException

at br.gov.caixa.sgr.publico.portal.comunicacao.factory.autorizacao.AutorizacaoFactory.getConexao

at br.gov.caixa.sicmu.seguranca.service.ValidadorAcessoServiceBean.validaAcesso
 
Investigamos: a classe AutorizacaoFactory pertence ao módulo br.gov.caixa.sisgr (não ao SICMU), e essa classe usa a classe JConnectorException, que pertence ao módulo br.gov.caixa.psc.jconnector.
 
O problema é que o module.xml do sisgr não declara dependência do módulo jconnector:
 
/opt/jboss-eap/modules/system/layers/base/br/gov/caixa/sisgr/main/module.xml
 
<dependencies> <module name="javax.faces.api"/> <module name="org.apache.log4j"/> <module name="javax.api"/> </dependencies>
 
Falta a linha:

<module name="br.gov.caixa.psc.jconnector"/>
 
Sem essa dependência declarada, o classloader do JBoss não consegue enxergar a classe JConnectorException quando o módulo sisgr tenta usá-la, por isso o erro.
 
Importante: esse módulo sisgr é usado por outras aplicações no mesmo servidor (não só o SICMU), então essa correção pode ter impacto além do SICMU e deve ser avaliada/aplicada por quem administra esses módulos de infraestrutura compartilhada, não apenas no escopo do SICMU.
 
 
 
Sem saber qual é o componente do SISGR que estão utilizando eu não vou conseguir ajudar.
 
