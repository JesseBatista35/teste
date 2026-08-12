
-sh-4.2$ ls -la /opt/jboss-eap/standalone/configuration/sicmu_jconnector.properties
-rwxr-xr-x 1 jboss jboss 5079 Ago 12 16:07 /opt/jboss-eap/standalone/configuration/sicmu_jconnector.properties
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep -i "jconnector\|JConnectorConfigException\|JConnectorException" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | grep -iv "WFLYSRV0018"
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$



