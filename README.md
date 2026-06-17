value: '-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Dcom.sun.jndi.ldap.connect.pool=false'


- name: ca-logintqs
              mountPath: /etc/ca-certs
              readOnly: true



  - name: ca-logintqs
          configMap:
            name: ca-logintqs
            defaultMode: 420





    # 1. Criar ConfigMap
oc create configmap ca-logintqs --from-file=/tmp/logintqs.pem -n sispl-tqs

# 2. Aplicar o arquivo
oc apply -f deploymentconfig-sispl-corrigido.yaml

# 3. Acompanhar restart
oc get pods -w -n sispl-tqs | grep sispl-consulta-transacao-ocp4-tqs

# 4. Verificar logs
oc logs -f deployment/sispl-consulta-transacao-ocp4-tqs -n sispl-tqs --tail=100
