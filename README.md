Instalação do Application Insights no Quarkus via Task Group - Container

Follow
2

Edit

Guilherme Gomes Soares da Silva
17 de abr. de 2025
O artigo abaixo é baseado na versão 3.7.1 Versões mais recentes podem ser obtidas em: https://github.com/microsoft/ApplicationInsights-Java/releases 

Contents
1. Adicionar o task group
2. Adicionar variável com a versão do agente
2.1 Adicionando a variável diretamente em Pipeline variables
2.2 Adicionando a variável na geração do build
3. Conferindo o resultado
1. Adicionar o task group
Adicione o task group "APP_INSIGHTS_QUARKUS" antes do task group "BUILD_DEFAULT_QUARKUS_JDK11" (ou equivalente), como na imagem abaixo:

Task_Quarkus.PNG

2. Adicionar variável com a versão do agente
Há duas formas de ajustar essa etapa:

2.1 Adicionando a variável diretamente em Pipeline variables
Navegue até Pipeline variables:

Task_JBoss2.PNG

Crie uma variável, nomeie como "VERSAO_INSIGHTS" e preencha com o número da versão do agente:

Task_JBoss3.PNG

Para trocar a versão, basta mudar o valor da variável e rodar um novo build.

2.2 Adicionando a variável na geração do build
Esse método sobrepõe a variável de pipeline, caso esteja definida. Pode ser utilizado para teste de versões do agente quando não houver necessidade ou permissão para editar o pipeline.

Durante a geração do build, em "Advanced Options", clique em "Variables" para definir uma nova, como na imagem abaixo:

Task_JBoss4.PNG

Na tela seguinte clique em "Add variable", nomeie a variável como "VERSAO_INSIGHTS" e preencha com o número da versão do agente. Clique em "Create" no canto inferior direito e em seguida na seta no canto superior esquerdo para retornar a tela de build, como na imagem abaixo:

Task_JBoss5.PNG

3. Conferindo o resultado
Nos logs do build, procure pela task "Inclui agente do Application Insights definido na variável VERSAO_INSIGHTS":

Task_Quarkus2.PNG

44 visits in last 30 days
