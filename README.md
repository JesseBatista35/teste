Boa tarde.
 
sobre o chamado: REQ000145901481
 
deixa eu ver se entendi ocorretamente.
 
O ideal seria ter um nova variável BT com o SAS TOKEN?
 
e com isso tbm ter uma nova task do BT é isso?
 
Configuração Beyondtrust Quarkus - Overview
 
boa tarde
 
da uma olhda nessa wiki
 
a configuração correta para o beyondtrust 
 
já usamos BT, só pedi para adicionar o TOKEN SAS do BT_SECRET_LIST
 
entendi, mas ele nao esta no padrão 
 
SISTEMA-MODULO-BT-VAULT-(AMBIENTE), contendo a variável:
 
BT_SECRETS_LIST
 
 
SISTEMA-BT-VAULT-SECRET-(AMBIENTE), contendo as variáveis:
 
BT_CLIENT_ID

BT_CLIENT_SECRET
 
o BT-VAULT deve ser 1 para cada modulo, conforme a wiki
 
 
e também tem que solicitar a segurança para incluir o token sas 
 
vocês estao compartilhando o mesmo. para todos os módulos do SISAG.
 
o secret pode ser para todos os modulos
 
ai no caso tem que ter 1 para cada ambiente
 
pode ser que ele tem:
SISAG_DES/TOKEN_SAS/SISAG_TEAMS_IMAGENS_SAS ?
 
 
os demais são assim:
SISAG_DES/CLISERSAG_SSO_INTER,SISAG_DES/CLISERSAG_SSO_INTRA,SISAG_DES/SISAG_BT_APIKEY,SISAG_DES/SAGUSR01_POSTGRES,SISAG_DES/SSAGDS07_ORACLE,SISAG_DES/SSAGMQBD_MQ
 
 
ele ta reclamdno exatamente deles, estao na secret-list  do vault mais nao estao no secret no cofre de senhas


 o cara ta me questinando aqui no teamns me ajdua a repsonde ele
