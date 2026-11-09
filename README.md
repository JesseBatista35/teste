Pessoal, o primeiro deploy do SIEMP pela esteira funcionou ✅ (release SIEMP-java-web-8, servidor caddeapllx2864, JBoss EAP 7.4 standalone)

Log do servidor:

WFLYSRV0010: "framework.jar" foi implantado
WFLYSRV0010: "siemp-ear.ear" foi implantado
WFLYSRV0025: JBoss EAP 7.4.18.GA iniciado (sem erros)

Ajustes feitos no SIEMP-java-web-config:

mod_cluster no jboss/standalone-full-ha.xml: extensão org.jboss.as.modcluster e socket-binding modcluster
framework.jar como deployment adicional em jboss/jboss-deployments, mantendo o cabeçalho do arquivo:
  group_id:artifact_id:version:extension
  br.gov.caixa:framework:2.0.1:jar

Como o Sosthenes e o Denilson definiram, foi mantido o modelo atual (framework fornecido pelo ambiente). O pom do SIEMP não foi alterado.

Um alinhamento importante para as próximas etapas: os ajustes no repositório de configuração (SIEMP-java-web-config) e no código da aplicação são de responsabilidade do time da fábrica. Desta vez, aplicamos as alterações diretamente para apoiar o primeiro deploy e destravar a migração, em caráter excepcional.

A partir de agora, seguiremos este fluxo: o time de esteiras faz a análise (logs, servidor e configuração) e repassa aqui na sala o diagnóstico e o que precisa ser ajustado, e o time da fábrica aplica as alterações no config ou no código e executa a release. Seguimos à disposição para apoiar na análise e no acompanhamento dos deploys. 🙂
