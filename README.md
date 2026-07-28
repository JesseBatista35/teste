
-sh-4.2$ oc get configmap vaultkeystore-sispl-canal-webhook-pix -n sispl-des
No resources found.
Error from server (NotFound): configmaps "vaultkeystore-sispl-canal-webhook-pix" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get secret vaultkeystore-sispl-canal-webhook-pix -n sispl-des
No resources found.
Error from server (NotFound): secrets "vaultkeystore-sispl-canal-webhook-pix" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get deployment sispl-canal-webhook-pix-des -n sispl-des -o yaml | grep -A5 vaultkeystore
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec sispl-canal-webhook-pix-des-59dbb59bc5-g2z5z -n sispl-des -- ls -la /opt/jboss/standalone/configuration/ | grep -i vault
-rw-r--r--. 1 root root  3601 Jul 28 15:21 VAULT.dat
-rw-r--r--. 1 root root   504 Jul 28 15:21 vaultcaixa-des.keystore
-rw-r--r--. 1 root root   504 Jul 28 15:21 vaultcaixa-sispl-des.keystore
-sh-4.2$
