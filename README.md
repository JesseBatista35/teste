
-sh-4.2$ oc get pods
NAME                                              READY     STATUS    RESTARTS   AGE
sispl-api-apostas-tqs-57bd798f68-28rlx            1/1       Running   0          130m
sispl-api-mkp-tqs-5bb584bddf-x58wp                1/1       Running   0          5d
sispl-canal-webhook-pix-tqs-74b9cc974c-7488v      1/1       Running   0          20m
sispl-captacao-mkp-tqs-7846f8d97d-fsq8j           1/1       Running   0          22h
sispl-consulta-apostas-api-tqs-6ff9dcb845-vsntt   1/1       Running   0          22h
sispl-parametros-tqs-65b94bffbf-dnfbl             1/1       Running   0          5d
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh sispl-api-apostas-tqs-57bd798f68-28rlx
sh-4.4$
sh-4.4$
sh-4.4$ env | grep -i trust
sh-4.4$
sh-4.4$
sh-4.4$
sh-4.4$ find / -iname "*.jks" 2>/dev/null
/deployments/caixa-truststore-acteste-nprd.jks
/deployments/caixa-truststore-cedesbr_azurepush_atualizado2024.jks
sh-4.4$
sh-4.4$
sh-4.4$
sh-4.4$ find / -iname "*truststore*" 2>/dev/null
/deployments/caixa-truststore-acteste-nprd.jks
/deployments/caixa-truststore-cedesbr_azurepush_atualizado2024.jks
sh-4.4$
sh-4.4$
sh-4.4$
sh-4.4$ keytool -list -v -keystore /caminho/do/truststore.jks -storepass changeit | grep -i "alias\|issuer\|owner"
sh-4.4$ echo | openssl s_client -connect logindes.caixa.gov.br:443 -showcerts 2>/dev/null | grep -i "subject\|issuer"
subject=CN = logindes.caixa.gov.br
issuer=C = GB, O = Sectigo Limited, CN = Sectigo Public Server Authentication CA DV R36
Verification error: unable to get local issuer certificate
    Verify return code: 20 (unable to get local issuer certificate)
sh-4.4$
sh-4.4$
sh-4.4$
