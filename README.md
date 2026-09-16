as variewave stao assim e eles usamor essa manual abaixo

SICFD-monitoramento-des (14)

Scopes: EC DES
_ENV.CRON_EXPR
"0 */5 * * * ?"
_ENV.JAVA_OPTIONS_APPEND
"-Doracle.jdbc.javaNetNio=false"
_ENV.SISTEMA_AMBIENT
SICFD-des
_ENV.SISTEMA_NOME
SICFD-monitoramento
_ENV.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS
/usr/src/app/secrets_files/SICFD_DES/
_ENV.SPRING_DATASOURCE_PASSWORD
'${SCFDRD01_ORACLE}'
_ENV.batch.qtde-registros
10
_ENV.logging.level.root
INFO
_ENV.spring.batch.initialize-schema
always
_ENV.spring.batch.jdbc.table-prefix
CFD.CFD_BCH_
_ENV.spring.batch.job.enabled
false
_ENV.spring.datasource.driver-class-name
oracle.jdbc.OracleDriver
_ENV.spring.datasource.url
jdbc:oracle:thin:@10.116.101.7:1521/orad01sc
_ENV.spring.datasource.username
SCFDRD01



Guia para Configuração de Projeto Quarkus 3 com 
Secrets no Vault (Secret Safe) 
Orientações importantes em: 
https://caixa.sharepoint.com/sites/PPTI/SitePages/Padrao-Vault.aspx 
1. Abrir chamado para equipe da esteira solicitando: 
• Adicionar a task do BeyoundTrust na release do projeto após a task 
Cria_APP_OKD(Cria_APP_OKD_ATUALIZA_VARIAVEIS) 
• Criar library para o escopo EC DES com o sufixo -BT-VAULT-DES e vincular ao 
projeto. Exemplo: SIACC-PIXAUTOMATICO-BT-VAULT-DES 
Exemplo de REQ: REQ000140735267 
1.1 Caso outro projeto for usar a mesma library de VAULT já criada, basta abrir chamado 
para adicionar a task do BeyoundTrust na release e, neste caso, solicitar a vinculação da 
library do Vault no projeto. 
Exemplo de REQ: REQ000140761949 
2. Abrir chamado para criar usuário de serviço(TE191), inserir de senhas no cofre e 
atualizar a library do VAULT: 
Nas observações preencher: 
• Solicitar a criação do usuário para ACESSAR A PASTA SIACC_DES COM PERMISSÃO 
DE LEITURA NO SECRET SAFE - SICSN (caso o usuário já exista, a segurança irá 
reaproveitá-lo) 
• Solicitar a inserção das secrets no cofre dos usuários no padrão 
USUARIO_PRODUTO, conforme exemplos a seguir: 
SACCDS01_ORACLE (inserir a secret do usuario SACCDS01) 
CLISERACC_SSO (inserir a secret do clientid CLISERACC) 
OBS: Secrets como ApiKey, KeyStore de certificados e outras que não são de 
usuários é bom informar diretamente na REQ para facilitar. Exemplo: 
WEBHOOK_KEYSTORE (inserir a secret 1234) 
• Informar a library do Vault criada para ser atualizada com usuário e a lista de secrets 
Exemplo: Atualizar library do SIACC-PIXAUTOMATICO-BT-VAULT-DES 
• Informar os IPs dos projetos para abrir a regra de comunicação com Vault – Secret. 
Os IPs podem ser localizados no infrafácil ou no log da etapa “Configurando IP de 
Saída” de alguma release do projeto,  
Exemplo de REQ: REQ000140895340 
2.1 Caso seja necessário inserir novas secrets no VAULT, pode ser aberto um chamado no 
serviços.caixa pelo formulário "Inserir senha de usuário de serviço". 
Exemplo de REQ: REQ000140776871 
3. No projeto adicionar a dependência no pom.xml 
Versão para Quarkus 3 e JAVA 17 
<dependency> 
<groupId>io.smallrye.config</groupId> 
<artifactId>smallrye-config-source-file-system</artifactId> 
<version>3.13.2</version> 
</dependency> 
4. Na library do projeto devem ser cadastradas a location do vault e as senhas no 
seguinte formato: 
_ENV.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS = /usr/src/app/secrets_files/siacc_des/ 
_ENV.QUARKUS_DATASOURCE_PASSWORD='${usuario_oracle}' 
OBS1: A secret deve ser o usuario_produto cadastrado no vault e tem como estar entre 
aspas simples, iniciando com $ e entre chaves e em letras minúsculas 
OBS2: É recomendável que propriedades estejam como ENV. 
OBS3: A location do vault geralmente é no formato: /usr/src/app/secrets_files/sigla_des/, 
/usr/src/app/secrets_files/sigla_tqs/ etc, geralmente informada é na resposta das REQ.  
5. Verificar a execução no OKD 
Após a realização de uma nova Build e Release do projeto podemos analisar os logs no OKD 
para verificar se a busca da secrets no Vault está ocorrendo conforme o esperado. 
Com a configuração da task BeyoundTrust na release do projeto, antes de subir o pod 
principal são criados subpods que possuem scripts que realizam a integração com Vault, 
conforme imagem a seguir: 
No log do secrets-agent-sidecar podemos acompanhar as requisições que estão sendo 
feitas para o Vault - Secret Safe para a buscr as secrets que definimos na library do projeto: 
OBS: É possível ocorrer erros de timeout, erros com https status code 500 e 401. Nestes 
casos, recomendação é tentar gerar novamente a release, entretanto, caso o erro persista, 
deve ser acionado o suporte da equipe de esteira/segurança responsável pelo Vault. 
Caso todas as secrets sejam recuperadas com sucesso, é apresentado no log do secret
check quantas secrets foram encontradas da lista informada na library do vault: 
Em seguida, a inicialização da aplicação é executada normalmente. 
5. Implantação em produção 
Antes de implantar em produção é importante validar o funcionamento em DES. 
Na requisição de mudança frisar que as atividades de configuração da library e de 
segurança (criação da folder do projeto no vault, criação de usuário de serviço, inserção 
das secrets no vault e etc) devem ser atendidas antes das atividades de deploy. 
Exemplo de requisição de mudança: 23627551 CRQ000001184314 
