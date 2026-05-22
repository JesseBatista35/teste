		<property name="br.gov.caixa.psc.connector.util.Config" value="__SICRF_JCONNECTOR__"/>
            <property name="token.client.id"            value="__TOKEN_CLIENT_ID__"/>
            <property name="token.client.secret"        value="__TOKEN_CLIENT_SECRET__"/>
            <property name="token.client.url"           value="__TOKEN_URL__"/>            
            <property name="url.sicfd"                  value="__URL_SICFD__"/>
            <property name="jcics.crf.pwd"              value="${SCRFDR01_DB2}"/>
            
        
            <!-- <property name="http.nonProxyHosts" value="*.caixa|*.caixa.gov.br|*broker" boot-time="true"/>
			<property name="http.proxyHost" value="proxydes.caixa" boot-time="true"/>
			<property name="http.proxyPort" value="80" boot-time="true"/>
			<property name="https.proxyHost" value="proxydes.caixa" boot-time="true"/>
			<property name="https.proxyPort" value="80" boot-time="true"/  -->         
        </system-properties>
    <vault>
        <vault-option name="KEYSTORE_URL" value="__VAULT_KEYSTORE_URL__"/>
        <vault-option name="KEYSTORE_PASSWORD" value="__VAULT_KEYSTORE_PASSWORD__"/>
        <vault-option name="KEYSTORE_ALIAS" value="__VAULT_KEYSTORE_ALIAS__"/>
        <vault-option name="SALT" value="__VAULT_SALT__"/>
        <vault-option name="ITERATION_COUNT" value="__VAULT_ITERATION_COUNT__"/>
        <vault-option name="ENC_FILE_DIR" value="__VAULT_ENC_FILE_DIR__"/>
    </vault>    
    <management>
        <security-realms>
            <security-realm name="ManagementRealm">
                <authentication>
                    <local default-user="$local" skip-group-loading="true"/>
                    <properties path="mgmt-users.properties" relative-to="jboss.server.config.dir"/>
                </authentication>
                <authorization map-groups-to-roles="false">
                    <properties path="mgmt-groups.properties" relative-to="jboss.server.config.dir"/>
                </authorization>
            </security-realm>
            <security-realm name="ApplicationRealm">
                <authentication>
                    <local default-user="$local" allowed-users="*" skip-group-loading="true"/>
                    <properties path="application-users.properties" relative-to="jboss.server.config.dir"/>
                </authentication>
                <authorization>
                    <properties path="application-roles.properties" relative-to="jboss.server.config.dir"/>
                </authorization>
            </security-realm>
        </security-realms>
        <audit-log>
            <formatters>
                <json-formatter name="json-formatter"/>
            </formatters>
            <handlers>
                <file-handler name="file" formatter="json-formatter" path="audit-log.log" relative-to="jboss.server.data.dir"/>
            </handlers>
            <logger log-boot="true" log-read-only="false" enabled="false">
                <handlers>
                    <handler name="file"/>
                </handlers>


				as variese estaoassim:



				SICRF-digital-des (37)
SICRF-digital-des
Scopes: EC DES,OKD4 EC DES
APIKEY
********
CHAVE_PUBLICA_INTER
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxz8PNmiUW5J1669pWY0APB4flqqDnghAv/QV5DIHyXE39fj9u1DPXbgfDUhUfK0i/B0CHJukbI44Rgo/vuhCMImTnLjS49XuTH6GI4lU/CtdzE/qACMO/GUky73m0Uszo2Bh1wNV+fvw/mMQVAGKj6/qXjSB9npRZKydoXnwGPIepcrqF6KkMJIFtZ+0w35J9SYwgLNezUbAJgs9dq3yMj4ussSfxMFcUC9UKziJJSg0UQfl0fOQGMsrsnUbS2GgXeDqdskbZq9/wfL0ikU2pWf0hKjX+PXtqZI0SVWurVyydc0efbTE7qIlrwF8lWZ8NZ8zcV2oVk7TjoIktZ4zBwIDAQAB
CHAVE_PUBLICA_INTRA
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzcYY/UbvrEldbQRd4TgLeP9bS8YnaL67MZUsfozWRyocBF3S0L7UEbkPaPoCoBnhoRv8VJHp0grqe3mqEmkMuDlt20Vx6q04ADDyS0c8xaU+Ot+g1Pgwjze944ATUjZogEMko6jvqqUGTt/Nt64yCCIaMaTB119vOBExQim7vPHNe/o7hLxh6VBYINxFA/esxjz8j28/uJWIiK0Gvt07Yx7ycn2DJlQHjnH2GzCSUL87AAYmjyYxW2JZaPLLvRlpcHIWrlr9GNtLiq0++xfJ0jFYxQWs1jxhlfXdqr8NE5vfA/RRRjRFnWzFOhIsOnIHPO9eEwwYzCZSoW2zXkFDYwIDAQAB
JCICS_CRF_HOST
10.216.80.110
JCICS_CRF_PORT
7054
JCICS_CRF_PWD
${SCRFDR01_DB2}
JCICS_CRF_USR
SCRFDR01
JCICS_PROGRAM_DI1
PSCPSDI1
JCICS_PROGRAM_DI3
PSCPSDI3
JVM_HEAP_MAX
2048m
JVM_HEAP_MIN
1024m
JVM_METASPACE_MAX
512m
JVM_METASPACE_MIN
256m
SICRF_API
/tmp/sicrf_api.properties
SICRF_JCONNECTOR
/tmp/sicrf_jconnector.properties
TOKEN_CLIENT_ID
cli-ser-crf
TOKEN_CLIENT_SECRET
${CLISERCRF_SSO_INTER}
TOKEN_URL
https://logindes.caixa.gov.br/auth/realms/internet/protocol/openid-connect/token
TRUSTSTORE_FILE
cacerts-sicrf-des.jks
TRUSTSTORE_SENHA
changeit
URL_APM_SERVER
https://login.des.caixa/auth/realms/intranet
URL_PROXY
proxydes.caixa
URL_SICFD
https://sicfd-consultas-des.apps.nprd.caixa/ecaixa/consultas/consultacrf
URL_VALIDACAO_CHAVE
https://login.des.caixa/auth/realms/intranet
URL_VALIDACAO_CHAVE_INTER
https://logindes.caixa.gov.br/auth/realms/internet
VAULT_ENC_FILE_DIR
********
VAULT_ITERATION_COUNT
********
VAULT_KEYSTORE_ALIAS
********
VAULT_KEYSTORE_PASSWORD
********
VAULT_KEYSTORE_URL
********
VAULT_SALT
