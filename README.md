
Boa trade, 
Jesse Mouta.
 
Gerei o artefato do SICDT nesse endereço:
http://binario.caixa:8081/repository/releases/br/gov/caixa/sicdt/sifec-cdt/3.24.3.001/sifec-cdt-3.24.3.001.ear
 
Coloquei as propriedades que o SICDT está utilizando no JBoss 7.4 localhost



Propriedades do sistema:

<property name="SICDT_URLBASE" value="http://localhost:8080/sicdt-orig-api-rest/sicdt"/>
<property name="SSO_INTRANET_SERVICE_CDT_CLIENT_ID" value="cli-ser-cdt"/>
<property name="SSO_INTRANET_SERVICE_CDT_CLIENT_SECRET" value="f470c180-6fa5-4408-a78c-9b8a2e967c9a"/>
<property name="APIM_CDT_API_KEY" value="l790ce8632e39048e6a73aca22e279800a"/>
<property name="APIM_CDT_API_SECRET" value="19527ce0ec5f486293151e7ecd1af043"/>
<property name="CCR_API_URL" value="https://api.des.caixa:8443/credito"/>
<property name="CCR_PATH_CONCESSAO_SIMULACAO" value="/calculo-iof/v3/concessao/simulacao"/>
<property name="CCR_PATH_CONCESSAO" value="/calculo-iof/v3/concessao"/>
<property name="CCR_PATH_IOF_ATRASO_SIMULACAO" value="/calculo-iof/v2/atraso/simulacao"/>
<property name="CCR_PATH_IOF_ATRASO" value="/calculo-iof/v2/atraso"/>

Propriedade do sistema que usada para token provider (mas já deve existir):

<property name="SSO_INTRANET_TOKEN_URL" value="https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token"/>

Subsistema para provider de intranet:

<secure-deployment name="sifec-cdt-web.war">
    <realm>intranet</realm>
    <resource>cli-web-fec</resource>
    <credential name="secret">36ab01d0-f1a5-4b1b-9a76-839553c7a6a9</credential>
</secure-deployment>
<secure-deployment name="sicdt-orig-api-rest.war">
    <realm>intranet</realm>
    <resource>cli-ser-cdt</resource>
    <bearer-only>true</bearer-only>
</secure-deployment>

Subsistema para o banco de dados (ambiente de DES) driver utilizado aqui é 8 - oracle.jdbc.OracleDriver - ojdbc8:

<datasource jndi-name="java:/jdbc/OracleSicdtDS" pool-name="jdbc/OracleSicdtDS" enabled="true" use-java-context="true">
    <connection-url>jdbc:oracle:thin:@//oracle-nprd-1000.caixa:1521/prim_D01NGSRV</connection-url>
    <driver>oracle</driver>
    <pool>
        <min-pool-size>10</min-pool-size>
        <max-pool-size>30</max-pool-size>
        <prefill>true</prefill>
    </pool>
    <security>
        <user-name>SCDTBD01</user-name>
        <password>pwcdtbd01</password>
    </security>
    <validation>
        <check-valid-connection-sql>SELECT 1 FROM DUAL</check-valid-connection-sql>
        <validate-on-match>true</validate-on-match>
        <background-validation>true</background-validation>
        <background-validation-millis>700000</background-validation-millis>
    </validation>
</datasource>





Para as dependências Jackson2 e RESTEasy coloquei como scope provided para utilizar a do próprio EAP.
 
resteasy-jaxrs
resteasy-jackson2-provider
jackson-core
jackson-annotations
jackson-databind
jackson-jaxrs-json-provider
 
Não fiz alteração na Java EE em relação as versões anteriores. Também não alterei as versões do Hibernate e do SSO da Caixa, no entanto, farei os ajustes caso necessite de adequação e melhorias.
