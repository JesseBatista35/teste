
[root@caddeapllx1945 bin]# ls -la /opt/jboss-eap/standalone/configuration/vault-des/vaultcaixa.keystore
-rwxr-xr-x 1 jboss jboss 500 jun 16 11:47 /opt/jboss-eap/standalone/configuration/vault-des/vaultcaixa.keystore
[root@caddeapllx1945 bin]#
[root@caddeapllx1945 bin]#
[root@caddeapllx1945 bin]#
[root@caddeapllx1945 bin]# keytool -list -keystore /opt/jboss-eap/standalone/configuration/vault-des/vaultcaixa.keystore -storepass "changeit" 2>&1 | head -20
erro de keytool: java.io.IOException: Invalid keystore format
[root@caddeapllx1945 bin]#
[root@caddeapllx1945 bin]#
[root@caddeapllx1945 bin]#
