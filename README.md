

Pessoal, o primeiro deploy do SIEMP pela esteira funcionou  (release SIEMP-java-web-8, servidor caddeapllx2864, JBoss EAP 7.4 standalone)
 
Log do servidor:
 
WFLYSRV0010: "framework.jar" foi implantado
WFLYSRV0010: "siemp-ear.ear" foi implantado
WFLYSRV0025: JBoss EAP 7.4.18.GA iniciado (sem erros)
 
Ajustes feitos no SIEMP-java-web-config:
 
mod_cluster no jboss/standalone-full-ha.xml: extensão org.jboss.as.modcluster e socket-binding modcluster 
framework.jar como deployment adicional em jboss/jboss-deployments, mantendo o cabeçalho do arquivo:
group_id:artifact_id:version:extension
br.gov.caixa:framework:2.0.1:jar
Como o 
Sosthenes e o Denilson definiram, foi mantido o modelo atual (framework fornecido pelo ambiente). O pom do SIEMP não foi alterado.


usando essa versao acima me ajdua a adicnoar um texto que o sjuastes realziados eram de repsonsabilidde do time da fabrica que equqe a pricnicipoi foram realzidos para ajustes e configuraçoes proiximas analises eserao reapsadas em sala o que  otime da fabriaca deve fazer
