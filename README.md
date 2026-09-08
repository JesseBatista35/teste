
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ openssl x509 -inform DER -in acicptestessub.cer -outform PEM -out acicptestessub.pem
Error opening Certificate acicptestessub.cer
47576412976272:error:02001002:system library:fopen:No such file or directory:bss_file.c:402:fopen('acicptestessub.cer','r')
47576412976272:error:20074002:BIO routines:FILE_CTRL:system lib:bss_file.c:404:
unable to load certificate
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get secret caixa-truststore-acteste-nprd -o jsonpath='{.data.caixa-truststore-acteste-nprd\.jks}' | base64 -d > caixa-truststore-acteste-nprd.jks
-sh-4.2$
-sh-4.2$
-sh-4.2$ keytool -list -keystore caixa-truststore-acteste-nprd.jks -storepass <senha_do_keystore> | grep -i icptestes
-sh: erro de sintaxe próximo do `token' não esperado `|'
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ keytool -list -keystore caixa-truststore-acteste-nprd.jks -storepass changeit | grep -i icptestes
ac icptestes raiz, 28/06/2024, trustedCertEntry,
ac icptestes sub (ac icptestes raiz), 28/06/2024, trustedCertEntry,
-sh-4.2$
-sh-4.2$
-sh-4.2$ keytool -importcert -noprompt -alias ac-icptestes-sub -file acicptestessub.pem -keystore caixa-truststore-acteste-nprd.jks -storepass changeir
erro de keytool: java.io.IOException: Keystore was tampered with, or password was incorrect
-sh-4.2$ keytool -importcert -noprompt -alias ac-icptestes-sub -file acicptestessub.pem -keystore caixa-truststore-acteste-nprd.jks -storepass changeit
erro de keytool: java.io.FileNotFoundException: acicptestessub.pem (Arquivo ou diretório não encontrado)
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ base64 -w0 caixa-truststore-acteste-nprd.jks > jks-b64.txt
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc patch secret caixa-truststore-acteste-nprd --type='json' -p="[{'op':'replace','path':'/data/caixa-truststore-acteste-nprd.jks','value':'$(cat jks-b64.txt)'}]"
secret/caixa-truststore-acteste-nprd not patched
-sh-4.2$
-sh-4.2$
-sh-4.2$
