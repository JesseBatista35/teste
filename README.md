
-sh-4.2$
-sh-4.2$ oc exec -it sipgc-api-seguranca-des-122-hws7p -n sipgc-des -- ls -la /usr/src/app/secrets_files/SIPGC_DES/
total 24
drwxr-xr-x. 2 1337 root 160 Aug 17 11:37 .
drwxrwxrwt. 3 root root  60 Aug 17 11:37 ..
-rw-r--r--. 1 1337 root  36 Aug 17 11:37 CLISERPGC_SSO_INTRA
-rw-r--r--. 1 1337 root 658 Aug 17 11:37 CLISERPGC_SSO_INTRA_Metadata
-rw-r--r--. 1 1337 root  34 Aug 17 11:37 SIPGC_BT_APIKEY
-rw-r--r--. 1 1337 root 654 Aug 17 11:37 SIPGC_BT_APIKEY_Metadata
-rw-r--r--. 1 1337 root  12 Aug 17 11:37 SPGCDR01_SQLSERVER
-rw-r--r--. 1 1337 root 658 Aug 17 11:37 SPGCDR01_SQLSERVER_Metadata
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -it sipgc-api-seguranca-des-122-hws7p -n sipgc-des -- sh -c "for f in /usr/src/app/secrets_files/SIPGC_DES/*; do echo \"== \$f ==\"; done"
== /usr/src/app/secrets_files/SIPGC_DES/CLISERPGC_SSO_INTRA ==
== /usr/src/app/secrets_files/SIPGC_DES/CLISERPGC_SSO_INTRA_Metadata ==
== /usr/src/app/secrets_files/SIPGC_DES/SIPGC_BT_APIKEY ==
== /usr/src/app/secrets_files/SIPGC_DES/SIPGC_BT_APIKEY_Metadata ==
== /usr/src/app/secrets_files/SIPGC_DES/SPGCDR01_SQLSERVER ==
== /usr/src/app/secrets_files/SIPGC_DES/SPGCDR01_SQLSERVER_Metadata ==
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
