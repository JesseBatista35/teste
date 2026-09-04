
Qual o tipo de serviço?*:	Ajustar ambiente ou parametrização de software
Informar o Ambiente:*:	DES
Nome do serviço ou sistema:*:	Pipeline SIACM-api-audit
https://devops.caixa/projetos/Caixa/_build?definitionId=17
Janela de atendimento:*:	04/09/2026 00:00:00
Prazo final da janela de atendimento:*:	08/09/2026 00:00:00
Haverá previsão de indisponibilidade durante a execução do serviço:*:	Não
Contato do responsável pela validação do ambiente após alteração:*:	Wallacen Ribeiro Veloso/Thiago Sousa da Silva
Descrição da solicitação:*:	Solicitamos que o parâmetro -DgeneratePom=true seja removido do comando da tarefa de publicação no nexus
, pois gera apenas um pom mínimo sem as dependências necessárias, e seja substituído pelo parâmetro -DpomFile=pom.xml para que possamos receber as dependências do pacote jar.
Segue a chamada da tarefa Publica no Nexus:
/opt/apache-maven/apache-maven-3.8.5/bin/mvn deploy:deploy-file \
  -DgroupId=br.gov.caixa.api \
  -DartifactId=caixa-api-siacm_audit \
  -Dversion=2.3.0.54 \
  -Dpackaging=jar \
  -Dfile=target/caixa-api-siacm_audit-2.3.0.54.jar \
  -DrepositoryId=NEXUS_INTERNO \
  -DgeneratePom=true \ (substituir por -DpomFile=pom.xml)
  -Durl=http://binario.caixa:8081/repository/releases
Informar formas de contato:*:	21983446836 Teams whatsapp
