Mensagem para a sala:

Pessoal, o primeiro deploy do SIEMP pela esteira funcionou ✅ (release SIEMP-java-web-8, servidor caddeapllx2864, JBoss EAP 7.4 standalone)

Log do servidor:

WFLYSRV0010: "framework.jar" foi implantado
WFLYSRV0010: "siemp-ear.ear" foi implantado
WFLYSRV0025: JBoss EAP 7.4.18.GA iniciado (sem erros)

Ajustes feitos no SIEMP-java-web-config:

mod_cluster no jboss/standalone-full-ha.xml: extensão org.jboss.as.modcluster e socket-binding modcluster (correção do Thiago Jeferson)
framework.jar como deployment adicional em jboss/jboss-deployments, mantendo o cabeçalho do arquivo:
group_id:artifact_id:version:extension
br.gov.caixa:framework:2.0.1:jar
Como o Sosthenes e o Denilson definiram, foi mantido o modelo atual (framework fornecido pelo ambiente). O pom do SIEMP não foi alterado.

Não há mais nenhum ajuste manual no servidor: tudo está no config da esteira.

Próximo passo: validação funcional do SIEMP pelo time. Se aparecer erro de datasource/JNDI ou de property durante os testes, me mandem o horário que eu pego o log.

Obrigado, Thiago Jeferson, Sosthenes e Denilson, pelo apoio!
