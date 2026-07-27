
[root@srjdeapllx130 p585600]#
[root@srjdeapllx130 p585600]# ls -la "/tmp/Sectigo_Public_Server-Authentication_CA_DV_R36 1 (1).crt" "/tmp/Sectigo_Public_Server_Authentication_Root_R46 1 (1).crt"
-rw-r--r-- 1 p585600 cetad 2280 Jul 27 14:47 /tmp/Sectigo_Public_Server-Authentication_CA_DV_R36 1 (1).crt
-rw-r--r-- 1 p585600 cetad 2012 Jul 27 14:47 /tmp/Sectigo_Public_Server_Authentication_Root_R46 1 (1).crt
[root@srjdeapllx130 p585600]# exit
exit
[p585600@srjdeapllx130 ~]$ cp /infra_app/config/certificados/cacerts /infra_app/config/certificados/cacerts.bkp-$(date +%Y%m%d_%H%M%S)
cp: cannot create regular file ‘/infra_app/config/certificados/cacerts.bkp-20260727_145114’: Permission denied
[p585600@srjdeapllx130 ~]$ sudo su
[root@srjdeapllx130 p585600]# cp /infra_app/config/certificados/cacerts /infra_app/config/certificados/cacerts.bkp-$(date +%Y%m%d_%H%M%S)
[root@srjdeapllx130 p585600]# openssl x509 -in "/tmp/Sectigo_Public_Server-Authentication_CA_DV_R36 1 (1).crt" -noout -subject -issuer
subject= /C=GB/O=Sectigo Limited/CN=Sectigo Public Server Authentication CA DV R36
issuer= /C=GB/O=Sectigo Limited/CN=Sectigo Public Server Authentication Root R46
[root@srjdeapllx130 p585600]#
[root@srjdeapllx130 p585600]#
[root@srjdeapllx130 p585600]# openssl x509 -in "/tmp/Sectigo_Public_Server_Authentication_Root_R46 1 (1).crt" -noout -subject -issuer
subject= /C=GB/O=Sectigo Limited/CN=Sectigo Public Server Authentication Root R46
issuer= /C=GB/O=Sectigo Limited/CN=Sectigo Public Server Authentication Root R46
[root@srjdeapllx130 p585600]# exit
exit
[p585600@srjdeapllx130 ~]$ keytool -importcert -keystore /infra_app/config/certificados/cacerts -storepass changeit -alias sectigo-pubserverauth-dv-r36 -file "/tmp/Sectigo_Public_Server-Authentication_CA_DV_R36 1 (1).crt" -noprompt
Certificate was added to keystore
keytool error: java.io.FileNotFoundException: /infra_app/config/certificados/cacerts (Permission denied)
[p585600@srjdeapllx130 ~]$ sudo su
[root@srjdeapllx130 p585600]# keytool -importcert -keystore /infra_app/config/certificados/cacerts -storepass changeit -alias sectigo-pubserverauth-dv-r36 -file "/tmp/Sectigo_Public_Server-Authentication_CA_DV_R36 1 (1).crt" -noprompt
Certificate was added to keystore
[root@srjdeapllx130 p585600]# keytool -importcert -keystore /infra_app/config/certificados/cacerts -storepass changeit -alias sectigo-pubserverauth-root-r46 -file "/tmp/Sectigo_Public_Server_Authentication_Root_R46 1 (1).crt" -noprompt
Certificate was added to keystore
[root@srjdeapllx130 p585600]#
