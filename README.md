oc port-forward pod/sispl-consulta-transacao-ocp4-tqs-15-r82zf 8080:8080 -n sispl-tqs


curl -v http://localhost:8080/q/health









- name: JAVA_OPTIONS_APPEND
              value: '-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Dcom.sun.jndi.ldap.connect.pool=false'
