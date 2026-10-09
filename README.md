
ls: não é possível acessar /usr/src/app/secrets_files/SIINP_DES/: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc siinp-nucleo-des -n siinp-des -o yaml | grep -A1 SECURITY_CRYPTO_KEY
                  k:{"name":"SECURITY_CRYPTO_KEY"}:
                    .: {}
--
        - name: SECURITY_CRYPTO_KEY
          value: ${SECURITY_CRYPTO_KEY}
        - name: THREAD_POOL
--
          value: SIINP_DES/CLISERACC_SSO_INTRA,SIINP_DES/REDIS_PASSWORD,SIINP_DES/SECURITY_CRYPTO_KEY,SIINP_DES/SICLI/SICLI_APIKEY,SIINP_DES/SIINP_APIKEY,SIINP_DES/SIINP_KEYSTORE_SANDBOX,SIINP_DES/SINPBD01_ORACLE,SIINP_DES/SINPBD01_PROXY,SIINP_DES/SINPSD01_HSM
        - name: BT_VERIFY_CA
--
          value: SIINP_DES/CLISERACC_SSO_INTRA,SIINP_DES/REDIS_PASSWORD,SIINP_DES/SECURITY_CRYPTO_KEY,SIINP_DES/SICLI/SICLI_APIKEY,SIINP_DES/SIINP_APIKEY,SIINP_DES/SIINP_KEYSTORE_SANDBOX,SIINP_DES/SINPBD01_ORACLE,SIINP_DES/SINPBD01_PROXY,SIINP_DES/SINPSD01_HSM
        image: default-route-openshift-image-registry.apps.produtos4.caixa/openshift/ubi:9.3-1552
-sh-4.2$
-sh-4.2$
-sh-4.2$
