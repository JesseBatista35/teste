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
