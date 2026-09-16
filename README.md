
-sh-4.2$ oc debug dc/sicfd-monitoramento-des -n sicfd-des
Defaulting container name to sicfd-monitoramento-des.
Use 'oc describe pod/sicfd-monitoramento-des-debug -n sicfd-des' to see all of the containers in this pod.

Debugging with pod/sicfd-monitoramento-des-debug, original command: <image entrypoint>
Waiting for pod to start ...
If you don't see a command prompt, try pressing enter.
sh-4.4$ oc get pods
sh: oc: command not found
sh-4.4$ xxd /usr/src/app/secrets_files/SICFD_DES/SCFDRD01_ORACLE
sh: xxd: command not found
sh-4.4$
sh-4.4$
sh-4.4$ wc -c /usr/src/app/secrets_files/SICFD_DES/SCFDRD01_ORACLE
9 /usr/src/app/secrets_files/SICFD_DES/SCFDRD01_ORACLE
sh-4.4$
sh-4.4$
sh-4.4$ ls -la /usr/src/app/secrets_files/SICFD_DES/
total 24
drwxr-xr-x. 2 1337 root 160 Sep 16 15:25 .
drwxrwxrwt. 3 root root  60 Sep 16 15:25 ..
-rw-r--r--. 1 1337 root  36 Sep 16 15:25 CLISERCFD_SSO_INTRA
-rw-r--r--. 1 1337 root 661 Sep 16 15:25 CLISERCFD_SSO_INTRA_Metadata
-rw-r--r--. 1 1337 root   8 Sep 16 15:25 SCFDDR02_DB2
-rw-r--r--. 1 1337 root 649 Sep 16 15:25 SCFDDR02_DB2_Metadata
-rw-r--r--. 1 1337 root   9 Sep 16 15:25 SCFDRD01_ORACLE
-rw-r--r--. 1 1337 root 652 Sep 16 15:25 SCFDRD01_ORACLE_Metadata
sh-4.4$
sh-4.4$
sh-4.4$
sh-4.4$ which sqlplus tnsping 2>/dev/null
sh-4.4$
