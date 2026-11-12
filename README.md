
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec siinp-nucleo-des-335-cgvt7 -n siinp-des -- ls -la /usr/src/app/secrets_files/SIINP_DES/
total 64
drwxr-xr-x. 3 1337 root 380 Nov 12 13:00 .
drwxrwxrwt. 3 root root  60 Nov 12 13:00 ..
-rw-r--r--. 1 1337 root  36 Nov 12 13:00 CLISERACC_SSO_INTRA
-rw-r--r--. 1 1337 root 675 Nov 12 13:00 CLISERACC_SSO_INTRA_Metadata
-rw-r--r--. 1 1337 root  10 Nov 12 13:00 REDIS_PASSWORD
-rw-r--r--. 1 1337 root 663 Nov 12 13:00 REDIS_PASSWORD_Metadata
-rw-r--r--. 1 1337 root  44 Nov 12 13:00 SECURITY_CRYPTO_KEY
-rw-r--r--. 1 1337 root 661 Nov 12 13:00 SECURITY_CRYPTO_KEY_Metadata
drwxr-xr-x. 2 1337 root  80 Nov 12 13:00 SICLI
-rw-r--r--. 1 1337 root  34 Nov 12 13:00 SIINP_APIKEY
-rw-r--r--. 1 1337 root 655 Nov 12 13:00 SIINP_APIKEY_Metadata
-rw-r--r--. 1 1337 root  13 Nov 12 13:00 SIINP_KEYSTORE_SANDBOX
-rw-r--r--. 1 1337 root 711 Nov 12 13:00 SIINP_KEYSTORE_SANDBOX_Metadata
-rw-r--r--. 1 1337 root   8 Nov 12 13:00 SINPBD01_ORACLE
-rw-r--r--. 1 1337 root 660 Nov 12 13:00 SINPBD01_ORACLE_Metadata
-rw-r--r--. 1 1337 root  15 Nov 12 13:00 SINPBD01_PROXY
-rw-r--r--. 1 1337 root 649 Nov 12 13:00 SINPBD01_PROXY_Metadata
-rw-r--r--. 1 1337 root   8 Nov 12 13:00 SINPSD01_HSM
-rw-r--r--. 1 1337 root 688 Nov 12 13:00 SINPSD01_HSM_Metadata
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc siinp-nucleo-des -n siinp-des -o yaml | grep -iA1 CONFIG_CASE
-sh-4.2$ oc get dc siinp-nucleo-tqs -n siinp-tqs -o yaml | grep -iA1 CONFIG_CASE
-sh-4.2$ ^C
-sh-4.2$
