
Pressione <Control+D> IMEDIATAMENTE se voce nao concorda com as
condicoes deste aviso
***********************************************************************
p585600@10.116.94.88's password:
stat local "Sectigo_Public_Server_Auth_CA_DV_R36.crt": No such file or directory
[p585600@cadsvitrlx100 ~]$ ls -la
total 442400
drwx------.   6 p585600   927      4096 Jul 27 14:41  .
drwxr-xr-x. 500 root    root      12288 Jul 27 14:43  ..
-rw-r--r--.   1 p585600   927  46275771 Jun  3 16:12  applicationinsights-agent-3.7.8.jar
-rw-------.   1 p585600   927     26905 Jul 27 10:00  .bash_history
-rw-------.   1 p585600   927        18 Mar  2 11:07  .bash_logout
-rw-------.   1 p585600   927       141 Mar  2 11:07  .bash_profile
-rw-------.   1 p585600   927       492 Mar  2 11:07  .bashrc
-r--------.   1 p585600 supso       165 Jul 27 14:41  .google_authenticator
-rw-r--r--.   1 p585600   927       848 Mar 25 09:04  .google_auth_setup.log
-rwxr-xr-x.   1 p585600   927      2967 Mar 26 09:55  host-controller.log
-rw-r--r--.   1 p585600   927       506 Apr  1 17:27 'jboss (1).keystore'
drwxr-xr-x.   2 p585600   927        65 Apr 20 11:04  jesse
-rw-------.   1 p585600   927       172 Mar  2 11:07  .kshrc
drwxr-xr-x.   2 p585600   927        86 Mar 12 16:35  main
drwx------.   4 p585600   927        39 Mar  2 11:07  .mozilla
-rw-r--r--.   1 p585600   927 193335385 Jul 21 15:55  OpenJDK17U-jdk_x64_linux_hotspot_17.0.19_10.tar.gz
-rw-r--r--.   1 p585600   927 207513939 Jul 21 16:17  OpenJDK21U-jdk_x64_linux_hotspot_21.0.11_10.tar.gz
-rw-r--r--.   1 p585600   927   1089312 Apr 20 10:49  postgresql-42.7.3.jar
-rw-r--r--.   1 p585600 supso      2280 Jul 27 14:41 'Sectigo_Public_Server-Authentication_CA_DV_R36 1 (1).crt'
-rw-r--r--.   1 p585600 supso      2012 Jul 27 14:41 'Sectigo_Public_Server_Authentication_Root_R46 1 (1).crt'
-rw-r--r--.   1 p585600   927   4689761 Apr 13 16:04  server_log_2026-04-13.log
drwx------.   2 p585600   927        48 Jul 27 14:44  .ssh
-rw-r--r--.   1 p585600   927      1885 Apr  1 17:27 'VAULT (1).dat'
-rw-------.   1 p585600   927      1892 Mar 16 16:12  .viminfo
-rw-------.   1 p585600 supso      3009 Jul 27 14:41  .Xauthority
-rw-------.   1 p585600   927       658 Mar  2 11:07  .zshrc
[p585600@cadsvitrlx100 ~]$


priemour coloeuiq qle aqui no basitna prinicial patraves do moba depois eu mando mais ta dano erro


scp Sectigo_Public_Server_Auth_CA_DV_R36.crt p585600@10.116.94.88:/tmp/


scp Sectigo_Public_Server_Auth_Root_R46.crt p585600@10.116.94.88:/tmp/





ssh srjdeapllx130
ls -la /tmp/*.crt


openssl x509 -in /tmp/Sectigo_Public_Server_Auth_CA_DV_R36.crt -noout -subject -issuer
openssl x509 -in /tmp/Sectigo_Public_Server_Auth_Root_R46.crt -noout -subject -issuer



cp /infra_app/config/certificados/cacerts /infra_app/config/certificados/cacerts.bkp-$(date +%Y%m%d_%H%M%S)


keytool -importcert -keystore /infra_app/config/certificados/cacerts -storepass changeit -alias sectigo-pubserverauth-dv-r36 -file /tmp/Sectigo_Public_Server_Auth_CA_DV_R36.crt -noprompt

keytool -importcert -keystore /infra_app/config/certificados/cacerts -storepass changeit -alias sectigo-pubserverauth-root-r46 -file /tmp/Sectigo_Public_Server_Auth_Root_R46.crt -noprompt



keytool -list -keystore /infra_app/config/certificados/cacerts -storepass changeit -alias sectigo-pubserverauth-dv-r36
keytool -list -keystore /infra_app/config/certificados/cacerts -storepass changeit -alias sectigo-pubserverauth-root-r46



