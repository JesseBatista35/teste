Configuração Beyondtrust Quarkus

Follow
6

Edit

Rafael Augusto Soares
30 de jul. de 2025
Instruções para Integração do BeyondTrust no Projeto Quarkus
1. A equipe de projeto deve abrir chamado para a equipe de esteiras.
Solicitar as seguintes ações:

Adicionar a task do BeyondTrust na release do projeto após a task Cria_APP_OKD.
⚠️ Certifique-se de que a task Cria_APP_OKD_ATUALIZA_VARIAVEIS esteja na última versão.

Criar uma library para o escopo desejado, que pode ser DES, TQS e/ou HMP, com o sufixo -BT-VAULT-<AMBIENTE>.
Exemplos:

meu-projeto-BT-VAULT-DES
meu-projeto-BT-VAULT-TQS
meu-projeto-BT-VAULT-HMP
A equipe da esteira deve informar à equipe de segurança o endereço IP do servidor de origem do sistema, que deverá ser configurado no BeyondTrust.

Caminho para abertura da requisição no servicos.caixa:

Tecnologia da Informação e Comunicação > Centralizadoras de Tecnologia da Informação > Suporte a Infraestrutura de TI NPRD > Suporte à Aplicação Multiplataforma > Suporte ao ambiente de aplicação nas esteiras DevOps

2. Abrir chamado para a Segurança: Cadastro de Senhas
Solicitar o cadastro das senhas na folder do projeto, conforme o(s) ambiente(s) desejado(s): SIGLA_DES, SIGLA_TQS, SIGLA_HMP.

Informar:

Nome do usuário: usuario
Produto: oracle
3. Abrir chamado para a Segurança: Preenchimento da Library
Solicitar o preenchimento da library criada (meu-projeto-BT-VAULT-<AMBIENTE>).

Informar os dados do cofre:

Preencher a variável BT_SECRETS_LIST com a lista de credenciais que serão utilizadas no módulo.
4. Adicionar dependência no pom.xml do projeto
Para projetos com Quarkus 3, adicionar:

<dependency>
  <groupId>io.smallrye.config</groupId>
  <artifactId>smallrye-config-source-file-system</artifactId>
  <version>3.13.2</version>
</dependency>
5. Configurar variável de ambiente na Library
Cadastrar a variável _ENV.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS com o caminho das secrets no pod.

Composição do caminho
O caminho será composto por:

/usr/src/app/secrets_files/<nome_da_secret_em_minusculo>
Exemplo de configuração
BT_SECRETS_LIST=SIXXX_DES/SXXXBD01_Oracle,SIXXX_DES/SXXXSD01_MQ,SIXXX_DES/SIYYY/SYYYBD01
_ENV.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS=/usr/src/app/secrets_files/sixxx_des/,/usr/src/app/secrets_files/sixxx_des/siyyy
6. Cadastrar senha no formato esperado
Na library do projeto, cadastrar a senha no seguinte formato:

_ENV.QUARKUS_DATASOURCE_PASSWORD='${sxxxbd01_oracle}'
_ENV.QUARKUS_MQ_PASSWORD='${sxxxsd01_mq}'
_ENV.QUARKUS_DATASOURCE_SIYYY_PASSWORD='${syyybd01}'
69 visits in last 30 days
