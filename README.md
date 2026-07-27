keytool -list -keystore /infra_app/config/certificados/cacerts -storepass changeit -alias sectigo-pubserverauth-dv-r36
keytool -list -keystore /infra_app/config/certificados/cacerts -storepass changeit -alias sectigo-pubserverauth-root-r46



[root@srjdeapllx130 p585600]#
[root@srjdeapllx130 p585600]#
[root@srjdeapllx130 p585600]# keytool -list -keystore /infra_app/config/certificados/cacerts -storepass changeit -alias sectigo-pubserverauth-dv-r36
sectigo-pubserverauth-dv-r36, Jul 27, 2026, trustedCertEntry,
Certificate fingerprint (SHA-256): 8C:54:C3:34:B6:6B:A4:E4:26:77:2A:F4:A3:F9:13:6C:19:A1:AE:C7:29:FD:B2:8C:53:5C:07:A5:A4:EF:22:E0
[root@srjdeapllx130 p585600]# keytool -list -keystore /infra_app/config/certificados/cacerts -storepass changeit -alias sectigo-pubserverauth-root-r46
sectigo-pubserverauth-root-r46, Jul 27, 2026, trustedCertEntry,
Certificate fingerprint (SHA-256): 7B:B6:47:A6:2A:EE:AC:88:BF:25:7A:A5:22:D0:1F:FE:A3:95:E0:AB:45:C7:3F:93:F6:56:54:EC:38:F2:5A:06
[root@srjdeapllx130 p585600]#
