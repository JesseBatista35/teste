openssl x509 -inform DER -in acicptestessub.cer -outform PEM -out acicptestessub.pem


oc get secret caixa-truststore-acteste-nprd -o jsonpath='{.data.caixa-truststore-acteste-nprd\.jks}' | base64 -d > caixa-truststore-acteste-nprd.jks

keytool -list -keystore caixa-truststore-acteste-nprd.jks -storepass <senha_do_keystore> | grep -i icptestes


keytool -importcert -noprompt -alias ac-icptestes-sub -file acicptestessub.pem -keystore caixa-truststore-acteste-nprd.jks -storepass <senha_do_keystore>


base64 -w0 caixa-truststore-acteste-nprd.jks > jks-b64.txt
oc patch secret caixa-truststore-acteste-nprd --type='json' -p="[{'op':'replace','path':'/data/caixa-truststore-acteste-nprd.jks','value':'$(cat jks-b64.txt)'}]"


oc rollout restart deployment siecm-middleware-des
