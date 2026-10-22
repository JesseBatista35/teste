essoal, atualização do SIGSJ-internet (DES):

O que já foi feito:

VM: nova, caddeapllx2854 (10.116.202.45), criada pela esteira. A VM de teste antiga da esteira (CADDEAPLLX1121) foi pausada e retirada do Infrafácil, conforme decidido em sala.
JBoss: no ar. O deploy do sigsj_internet-ear.ear falha somente pela falta da datasource java:jboss/datasources/SIGSJ04, usada pela persistence-unit SIGSJ04.
Config: a datasource SIGSJ04 (Oracle) foi incluída no standalone-full-ha.xml, e o driver Oracle (ojdbc8) no jboss-deployments do SIGSJ-internet-config.
Library: as variáveis da datasource já estão criadas no grupo SIGSJ-INTERNET-DES:
SIGSJ04_CONNECTION_STRING
SIGSJ04_USER
SIGSJ04_PASSWORD

O que precisamos de vocês:
Vocês conseguem preencher na Library SIGSJ-INTERNET-DES os dados de conexão do banco SIGSJ04 em DES?

SIGSJ04_CONNECTION_STRING: no formato jdbc:oracle:thin:@//HOST:PORTA/SERVICE_NAME
SIGSJ04_USER: usuário do banco
SIGSJ04_PASSWORD: senha, marcando o cadeado para ficar como variável secreta


SIROT: por enquanto o internet continua com o SIROT externo, como está hoje. Quando a build com o SIROT empacotado estiver pronta, nos avisem que ajustamos o config na mesma release. Lembrando que, além do sirotcon-ejb, essa build precisa levar o CeflogEAP e o ceflib, como vimos no intranet.
