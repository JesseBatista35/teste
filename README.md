oc cp /tmp/cert-2.pem siali-des/siali-des-194-wrs24:/tmp/cert-2.pem
oc cp /tmp/cert-3.pem siali-des/siali-des-194-wrs24:/tmp/cert-3.pem


oc rsh siali-des-194-wrs24
keytool -cacerts -importcert -alias ac_icptestes_sub -file /tmp/cert-2.pem -storepass changeit -noprompt
keytool -cacerts -importcert -alias ac_icptestes_raiz -file /tmp/cert-3.pem -storepass changeit -noprompt
