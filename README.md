# 1) desfaz o teste anterior (volta o placeholder original)
oc set env dc/sifug-siofg-api-des QUARKUS_SIOFG_IBM_MQ_PASSWORD='${SIFUG_XMQD1}' -n sifug-des

# 2) teste correto: injeta a variavel REFERENCIADA direto como env var
oc set env dc/sifug-siofg-api-des SIFUG_XMQD1='teste123' -n sifug-des

# 3) acompanha o novo pod
oc get pods -n sifug-des -w | grep siofg-api-des



