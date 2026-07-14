<img width="1864" height="891" alt="image" src="https://github.com/user-attachments/assets/82c93409-094c-4e65-92b7-cbb3ca2e1fbe" />


Skip to main content
Azure DevOps
projetos
/
Caixa
/
Overview
/
Wiki
/
Azure Wiki
/
Configuração Beyondtrust JBoss EAP 7
Search


Caixa

Overview
Summary
Dashboards
Wiki

Boards

Repos

Pipelines

Test Plans

Artifacts
Project settings

Caixa.wiki

Filter pages by title


New page
Configuração Beyondtrust JBoss EAP 7

Follow
1

Edit

Rafael Augusto Soares
30 de jan.
Vault Jboss
1 Abrir chamado para equipe de esteiras solicitando a alteração da imagem imagem do Jboss na Pipeline do projeto
(Serviços.caixa > Tecnologia da Informação > Centralizadoras de Tecnologia da Informação > Suporte à Aplicação Multiplataforma > Suporte aos produtos utilizados nas Esteiras DevOps)

Versões disponíveis:
7.0.0-bt-23
7.0.5-db2-bt-23
7.0.9-bt-23
7.1.0-bt-23
7.1.0-mscore-fonts-bt-23
7.1.6-appinsights-bt-23
7.1.6-bt-23
7.1.6-jdk8-301-bt-23
7.1.6-jdk8-301-bt-23.3.1
7.1.6-jdk8-301-hsm-4.10.2-bt-23.3.1
7.2.0-bt-23
7.2.8-bt-23
7.2.9-openjdk-1.8.0.452-bt-23
7.3.0-bt-23
7.3.1-bt-23
7.3.1-jdk11-bt-23
7.3.10-jdk-11.0.11-bt-23
7.3.10-openjdk-1.8.0.452-bt-23
7.4-update4-bt-23
7.4.11-jdk8-hsm-bt-23.3.1
7.4.11-openjdk-17-bt-23
7.4.11-openjdk-8-bt-23
7.4.11-openjdk-8-ubi9-bt-23
7.4.11-openjdk11-bt-23
7.4.11-openjdk17-bt-23
7.4.14-openjdk-17-bt-23
7.4.18-jdk8-301-hsm-4.10.2-bt-23
7.4.21-openjdk-17-bt-23
7.4.22-openjdk-1.8.0.452-bt-23
7.4.22-openjdk-11.0.25-bt-23
7.4.22-openjdk-17.0.15-bt-23
7.4.4-java11-bt-23
7.4.4-java11-fonts.1-bt-23

image.png

2 Ajustes na release do projeto
2.1 Abrir chamado para equipe de esteiras solicitando a inclusão da task na stage da release.*
(Serviços.caixa > Tecnologia da Informação > Centralizadoras de Tecnologia da Informação > Suporte à Aplicação Multiplataforma > Suporte aos produtos utilizados nas Esteiras DevOps)

O pedido deve ser feito para cada stage do projeto(EC DES, EC HMP, EC PRD).

image.png

2.2 Solicitar também que a task Cria_APP_OKD esteja na versão 13 ou superior.
3 Solicitar a criação da library do VAULT para cada ambiente(VAULT DES, VAULT HMP, VAULT PRD).
image.png

4 Abrir chamado para a segurança solicitando o cadastro das senhas na folder do projeto no Beyound Trust(SIGLA_DES, SIGLA_HMP, SIGLA_PRD).
(Serviços.caixa > Tecnologia da Informação > Segurança Tecnológica > Acesso > Inserir senha de usuário de serviço)

Exemplo de chamado:

Cadastro do usuário SPIBD01 da base do Oracle no Cofre.

Usuário de serviço: SPIBD01
Produto: Oracle
Sugestão de alias: SPIBD01_ORACLE

5 Abrir chamado para a segurança solicitando a configuração da library com as credenciais usadas pelo módulo.
image.png

6 Equipe de desenvolvimento altera a library do projeto
Obs.: O valor não utiliza aspas simples.

image.png

7 Equipe de desenvolvimento altera o standalone.xml do projeto
Sugestão de criar uma nova branch para a config.

image.png

image.png

8 Equipe de desenvolvimento deve verificar no Openshift se os valores foram substituídos corretamente no ConfigMap do projeto
image.png

113 visits in last 30 days
Showing filters 1 through 1
