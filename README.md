
-sh-4.2$ oc exec siinp-nucleo-tqs-654-fr4q8 -n siinp-tqs -- ls -la /usr/src/app/secrets_files/SIINP_TQS/
total 64
drwxr-xr-x. 3 1337 root 380 Nov 12 14:55 .
drwxrwxrwt. 3 root root  60 Nov 12 14:55 ..
-rw-r--r--. 1 1337 root  36 Nov 12 14:55 CLISERACC_SSO_INTRA
-rw-r--r--. 1 1337 root 665 Nov 12 14:55 CLISERACC_SSO_INTRA_Metadata
-rw-r--r--. 1 1337 root  10 Nov 12 14:55 REDIS_PASSWORD
-rw-r--r--. 1 1337 root 652 Nov 12 14:55 REDIS_PASSWORD_Metadata
-rw-r--r--. 1 1337 root  44 Nov 12 14:55 SECURITY_CRYPTO_KEY
-rw-r--r--. 1 1337 root 661 Nov 12 14:55 SECURITY_CRYPTO_KEY_Metadata
drwxr-xr-x. 2 1337 root  80 Nov 12 14:55 SICLI
-rw-r--r--. 1 1337 root  34 Nov 12 14:55 SIINP_APIKEY
-rw-r--r--. 1 1337 root 647 Nov 12 14:55 SIINP_APIKEY_Metadata
-rw-r--r--. 1 1337 root  13 Nov 12 14:55 SIINP_KEYSTORE_SANDBOX
-rw-r--r--. 1 1337 root 703 Nov 12 14:55 SIINP_KEYSTORE_SANDBOX_Metadata
-rw-r--r--. 1 1337 root  15 Nov 12 14:55 SINPBD01_PROXY
-rw-r--r--. 1 1337 root 649 Nov 12 14:55 SINPBD01_PROXY_Metadata
-rw-r--r--. 1 1337 root   9 Nov 12 14:55 SINPBT01_ORACLE
-rw-r--r--. 1 1337 root 650 Nov 12 14:55 SINPBT01_ORACLE_Metadata
-rw-r--r--. 1 1337 root   8 Nov 12 14:55 SINPSD01_HSM
-rw-r--r--. 1 1337 root 657 Nov 12 14:55 SINPSD01_HSM_Metadata
-sh-4.2$ oc logs siinp-nucleo-tqs-654-fr4q8 -n siinp-tqs | grep -i "Failed to load config"
-sh-4.2$
