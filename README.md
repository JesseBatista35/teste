h-4.2$
-sh-4.2$ oc exec siinp-nucleo-tqs-647-krllq -n siinp-tqs -- ls -laR /usr/src/app/secrets_files/siinp_tqs/
/usr/src/app/secrets_files/siinp_tqs/:
total 64
drwxr-xr-x. 3 1337 root 380 Nov 10 11:40 .
drwxrwxrwt. 3 root root  60 Nov 10 11:40 ..
-rw-r--r--. 1 1337 root  36 Nov 10 11:40 cliseracc_sso_intra
-rw-r--r--. 1 1337 root 665 Nov 10 11:40 cliseracc_sso_intra_Metadata
-rw-r--r--. 1 1337 root  10 Nov 10 11:40 redis_password
-rw-r--r--. 1 1337 root 652 Nov 10 11:40 redis_password_Metadata
-rw-r--r--. 1 1337 root  44 Nov 10 11:40 security_crypto_key
-rw-r--r--. 1 1337 root 661 Nov 10 11:40 security_crypto_key_Metadata
drwxr-xr-x. 2 1337 root  80 Nov 10 11:40 sicli
-rw-r--r--. 1 1337 root  34 Nov 10 11:40 siinp_apikey
-rw-r--r--. 1 1337 root 647 Nov 10 11:40 siinp_apikey_Metadata
-rw-r--r--. 1 1337 root  13 Nov 10 11:40 siinp_keystore_sandbox
-rw-r--r--. 1 1337 root 703 Nov 10 11:40 siinp_keystore_sandbox_Metadata
-rw-r--r--. 1 1337 root  15 Nov 10 11:40 sinpbd01_proxy
-rw-r--r--. 1 1337 root 649 Nov 10 11:40 sinpbd01_proxy_Metadata
-rw-r--r--. 1 1337 root   9 Nov 10 11:40 sinpbt01_oracle
-rw-r--r--. 1 1337 root 650 Nov 10 11:40 sinpbt01_oracle_Metadata
-rw-r--r--. 1 1337 root   8 Nov 10 11:40 sinpsd01_hsm
-rw-r--r--. 1 1337 root 657 Nov 10 11:40 sinpsd01_hsm_Metadata

/usr/src/app/secrets_files/siinp_tqs/sicli:
total 8
drwxr-xr-x. 2 1337 root  80 Nov 10 11:40 .
drwxr-xr-x. 3 1337 root 380 Nov 10 11:40 ..
-rw-r--r--. 1 1337 root  36 Nov 10 11:40 sicli_apikey
-rw-r--r--. 1 1337 root 649 Nov 10 11:40 sicli_apikey_Metadata
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get rc siinp-nucleo-tqs-647 -n siinp-tqs -o jsonpath='{.spec.template.spec.containers[*].image}{"\n"}'
default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siinp-nucleo:1.91.0.4
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc siinp-nucleo-tqs -n siinp-tqs -o yaml | grep -iA2 -E "BT_SECRETS"
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -n siinp-des | grep siinp-nucleo-des
siinp-nucleo-des-334-deploy                        0/1       Completed   0               19h
siinp-nucleo-des-335-cgvt7                         1/1       Running     0               97m
siinp-nucleo-des-335-deploy                        0/1       Completed   0               98m
siinp-nucleo-des2-des-659-deploy                   0/1       Completed   0               2d3h
siinp-nucleo-des2-des-660-deploy                   0/1       Completed   0               88m
siinp-nucleo-des2-des-660-nd7gr                    1/1       Running     0               88m
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec <pod-nucleo-des> -n siinp-des -- ls -laR /usr/src/app/secrets_files/
-sh: pod-nucleo-des: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
