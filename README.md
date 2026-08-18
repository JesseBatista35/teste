
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc debug pod/sigfa-api-extratos-des-16-m75ws -n sigfa-des -c sigfa-api-extratos-des
Debugging with pod/sigfa-api-extratos-des-16-m75ws-debug, original command: <image entrypoint>
Waiting for pod to start ...
If you don't see a command prompt, try pressing enter.
sh-4.4$ cat /usr/src/app/secrets_files/SIGFA_DES/CLISERGFA_SSO_INTRA | xxd | head
sh: xxd: command not found
sh-4.4$ env | grep -iE "SMALLRYE|CLISERGFA|OIDC_CLIENT_CREDENTIALS"
QUARKUS_OIDC_CLIENT_CREDENTIALS_SECRET=${CLISERGFA_SSO_INTRA}
TOKEN_CLIENT_SECRET=${CLISERGFA_SSO_INTRA}
SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS=/usr/src/app/secrets_files/SIGFA_DES/
sh-4.4$ ls -la /usr/src/app/secrets_files/SIGFA_DES/
total 24
drwxr-xr-x. 2 1337 root 160 Aug 18 16:02 .
drwxrwxrwt. 3 root root  60 Aug 18 16:02 ..
-rw-r--r--. 1 1337 root  36 Aug 18 16:02 CLISERGFA_SSO_INTRA
-rw-r--r--. 1 1337 root 673 Aug 18 16:02 CLISERGFA_SSO_INTRA_Metadata
-rw-r--r--. 1 1337 root   8 Aug 18 16:02 SGFADS01_ORACLE
-rw-r--r--. 1 1337 root 670 Aug 18 16:02 SGFADS01_ORACLE_Metadata
-rw-r--r--. 1 1337 root  34 Aug 18 16:02 SIGFA_APIKEY
-rw-r--r--. 1 1337 root 697 Aug 18 16:02 SIGFA_APIKEY_Metadata
sh-4.4$
