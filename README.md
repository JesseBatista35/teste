o everton disse isso


Este urimap não está sendo utilizado, a Karen executou o job DFHLS2WS que fez a cinfiguração do URIMAP em todos os CICS de TQS.


###################################################
# Configuration file - SID01-lancamentos-financeiros
# key = value
###################################################

quarkus.http.root-path=/

###################################################
# CICS WEB SERVICE
###################################################

#Cics Web Service - Basic Auth
# Para executar na máquina local: Run Configurations, Maven Build, Goals: 
# clean compile quarkus:dev -Dquarkus.http.port=8080 -Ddebug=5006 -DUSER_BASIC_AUTH=xxxusuario -DPASS_BASIC_AUTH=xxxsenha
%dev.USER_BASIC_AUTH=${USER_BASIC_AUTH:""}
%dev.PASS_BASIC_AUTH=${PASS_BASIC_AUTH:""}

#CicsWeb Root URL - transaction N1W1
%dev.CICSWEB_ROOT_ENDPOINT_HTTPS=https://cicsweb.des.caixa:32587
#%dev.CICSWEB_ROOT_ENDPOINT_HTTPS=https://cicsweb.prd.caixa:2587

###################################################
# SWAGGER
###################################################
mp.openapi.extensions.smallrye.info.version=1.5.0.2
mp.openapi.extensions.smallrye.info.title=SID01 - API Conta Depósito - Lançamentos Financeiros
#mp.openapi.extensions.smallrye.info.description=API responsável pelos lançamentos financeiros em contas NSGD. Processa somente transações de 2 pernas de crédito, débito, estorno e desfazimento.  \r\n  \r\n  Aplicação: SID01-lancamentos-financeiros. Base path API Manager: /conta-deposito/lancamentos-financeiros. Item de Configuração: 7261API-CONTA DEPOSITO - LANCAMENTOS FINANCEIROS  \r\n  \r\n ATENÇÃO API DE USO RESTRITO:  \r\n  Consulte o arquiteto da Comunidade Depósitos e Captação, para a liberação do consumo da api no API Manager em DES.  \r\n  Consulte o gestor, para obter o CIF que deve ser utilizado para transação de 2 pernas e para que sejam associados o segmento(sistema) e canal ao CIF.   
mp.openapi.extensions.smallrye.info.description=API respons\u00E1vel pelos lan\u00E7amentos financeiros em contas NSGD. Processa somente transa\u00E7\u00F5es de 2 pernas de cr\u00E9dito, d\u00E9bito, estorno e desfazimento.  \r\n  \r\n  Aplica\u00E7\u00E3o\: SID01-lancamentos-financeiros. Base path API Manager\: /conta-deposito/lancamentos-financeiros. Item de Configura\u00E7\u00E3o\: 7261API-CONTA DEPOSITO - LANCAMENTOS FINANCEIROS  \r\n  \r\n  ATEN\u00C7\u00C3O\:  \r\n  Consulte o arquiteto da Comunidade Dep\u00F3sitos e Capta\u00E7\u00E3o, para a libera\u00E7\u00E3o do consumo da api no API Manager em DES.  \r\n  Verifique com o gestor ou equipe NSGD, qual \u00E9 o CIF com coreografia de duas pernas, que deve ser utilizado e para a associa\u00E7\u00E3o do CIF ao segmento(sistema) e ao canal.  \r\n  O token de acesso deve ter a claim segmento_sistema.   

mp.openapi.extensions.smallrye.info.contact.name=Comunidade Depósitos e Captação - CESOB200 - NSGD
mp.openapi.extensions.smallrye.info.contact.email=cesob200@caixa.gov.br

mp.openapi.servers=https://api.caixa:8443/conta-deposito/lancamentos-financeiros, https://api.des.caixa:8443/conta-deposito/lancamentos-financeiros/tqs, https://api.des.caixa:8443/conta-deposito/lancamentos-financeiros
%dev.mp.openapi.servers=http://localhost:8080, https://sid01-lancamentos-financeiros-okd4-des.apps.nprd.caixa/, https://api.des.caixa:8443/conta-deposito/lancamentos-financeiros, https://sid01-lancamentos-financeiros-okd4-tqs.apps.nprd.caixa, https://api.des.caixa:8443/conta-deposito/lancamentos-financeiros/tqs

quarkus.swagger-ui.always-include=true

###################################################
# TOKEN SSO
###################################################
#SSO Internet
caixa.mp.jwt.verify.ssointer.publicKey=MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxz8PNmiUW5J1669pWY0APB4flqqDnghAv/QV5DIHyXE39fj9u1DPXbgfDUhUfK0i/B0CHJukbI44Rgo/vuhCMImTnLjS49XuTH6GI4lU/CtdzE/qACMO/GUky73m0Uszo2Bh1wNV+fvw/mMQVAGKj6/qXjSB9npRZKydoXnwGPIepcrqF6KkMJIFtZ+0w35J9SYwgLNezUbAJgs9dq3yMj4ussSfxMFcUC9UKziJJSg0UQfl0fOQGMsrsnUbS2GgXeDqdskbZq9/wfL0ikU2pWf0hKjX+PXtqZI0SVWurVyydc0efbTE7qIlrwF8lWZ8NZ8zcV2oVk7TjoIktZ4zBwIDAQAB
caixa.mp.jwt.verify.ssointer.issuer=https://logindes.caixa.gov.br/auth/realms/internet

#SSO Internet Login2
caixa.mp.jwt.verify.ssointer2.publicKey=MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxz8PNmiUW5J1669pWY0APB4flqqDnghAv/QV5DIHyXE39fj9u1DPXbgfDUhUfK0i/B0CHJukbI44Rgo/vuhCMImTnLjS49XuTH6GI4lU/CtdzE/qACMO/GUky73m0Uszo2Bh1wNV+fvw/mMQVAGKj6/qXjSB9npRZKydoXnwGPIepcrqF6KkMJIFtZ+0w35J9SYwgLNezUbAJgs9dq3yMj4ussSfxMFcUC9UKziJJSg0UQfl0fOQGMsrsnUbS2GgXeDqdskbZq9/wfL0ikU2pWf0hKjX+PXtqZI0SVWurVyydc0efbTE7qIlrwF8lWZ8NZ8zcV2oVk7TjoIktZ4zBwIDAQAB
caixa.mp.jwt.verify.ssointer2.issuer=https://login2des.caixa.gov.br/auth/realms/internet

#SSO Intranet
caixa.mp.jwt.verify.ssointra.publicKey=MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzcYY/UbvrEldbQRd4TgLeP9bS8YnaL67MZUsfozWRyocBF3S0L7UEbkPaPoCoBnhoRv8VJHp0grqe3mqEmkMuDlt20Vx6q04ADDyS0c8xaU+Ot+g1Pgwjze944ATUjZogEMko6jvqqUGTt/Nt64yCCIaMaTB119vOBExQim7vPHNe/o7hLxh6VBYINxFA/esxjz8j28/uJWIiK0Gvt07Yx7ycn2DJlQHjnH2GzCSUL87AAYmjyYxW2JZaPLLvRlpcHIWrlr9GNtLiq0++xfJ0jFYxQWs1jxhlfXdqr8NE5vfA/RRRjRFnWzFOhIsOnIHPO9eEwwYzCZSoW2zXkFDYwIDAQAB
caixa.mp.jwt.verify.ssointra.issuer=https://login.des.caixa/auth/realms/intranet

###################################################
# LOG
###################################################
#quarkus.log.category."io.quarkus".level=DEBUG
quarkus.log.category."io.quarkus".level=INFO

###################################################
# TEST
###################################################
quarkus.http.test-port=8888
quarkus.test.continuous-testing=disabled

###################################################
# Enable instrumentation based reload. 
# This allows small changes to take effect without restarting Quarkus.
###################################################
%dev.quarkus.live-reload.instrumentation=true

#
