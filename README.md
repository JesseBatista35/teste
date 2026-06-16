
[root@caddeapllx1945 bin]# find /opt/jboss-eap -name "vaultcaixa.keystore" -o -name "*.keystore" 2>/dev/null
/opt/jboss-eap/standalone/configuration/vault-des/vault.keystore
/opt/jboss-eap/standalone/configuration/vault-des/vaultcaixa.keystore
/opt/jboss-eap/standalone/configuration/vault-tqs/vaultcaixa.keystore
[root@caddeapllx1945 bin]#
[root@caddeapllx1945 bin]#
[root@caddeapllx1945 bin]#
[root@caddeapllx1945 bin]#
[root@caddeapllx1945 bin]# ls -la /opt/jboss-eap/standalone/configuration/vault-des/
total 28
drwxr-xr-x 2 jboss jboss  114 jun 16 11:47 .
drwxr-xr-x 6 jboss jboss 4096 jun 16 14:57 ..
-rwxr-xr-x 1 jboss jboss    0 jun 16 11:47 .placeholder
-rwxr-xr-x 1 jboss jboss 8494 jun 16 11:47 saidavault.txt
-rwxr-xr-x 1 jboss jboss  500 jun 16 11:47 vaultcaixa.keystore
-rwxr-xr-x 1 jboss jboss 1552 jun 16 11:47 VAULT.dat
-rwxr-xr-x 1 jboss jboss  506 jun 16 11:47 vault.keystore
[root@caddeapllx1945 bin]#
[root@caddeapllx1945 bin]#
[root@caddeapllx1945 bin]#
[root@caddeapllx1945 bin]# ls -la /opt/jboss-eap/standalone/configuration/ | grep vault
drwxr-xr-x 2 jboss jboss   114 jun 16 11:47 vault-des
drwxr-xr-x 2 jboss jboss    26 jun 16 11:47 vault-prd
drwxr-xr-x 2 jboss jboss    92 jun 16 11:47 vault-tqs
[root@caddeapllx1945 bin]#
