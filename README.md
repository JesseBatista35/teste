
Use "keytool -help" for all available commands
[root@srjtqapllx0021 sifug]#
[root@srjtqapllx0021 sifug]#
[root@srjtqapllx0021 sifug]# keytool -list -keystore /infra_app/config/sifug/IF104.p12 -storetype PKCS12
Enter keystore password:

*****************  WARNING WARNING WARNING  *****************
* The integrity of the information stored in your keystore  *
* has NOT been verified!  In order to verify its integrity, *
* you must provide your keystore password.                  *
*****************  WARNING WARNING WARNING  *****************

Keystore type: PKCS12
Keystore provider: SunJSSE

Your keystore contains 1 entry

dinamo hsm, Sep 17, 2026, PrivateKeyEntry,
[root@srjtqapllx0021 sifug]# keytool -list -v -keystore /infra_app/config/sifug/IF104.p12 -storetype PKCS12
Enter keystore password:

*****************  WARNING WARNING WARNING  *****************
* The integrity of the information stored in your keystore  *
* has NOT been verified!  In order to verify its integrity, *
* you must provide your keystore password.                  *
*****************  WARNING WARNING WARNING  *****************

Keystore type: PKCS12
Keystore provider: SunJSSE

Your keystore contains 1 entry

Alias name: dinamo hsm
Creation date: Sep 17, 2026
Entry type: PrivateKeyEntry


*******************************************
*******************************************


[root@srjtqapllx0021 sifug]# grep -ri "pkcs11\|dinamo" /opt/open/java/jdk1.8.0_121/jre/lib/security/java.security
[root@srjtqapllx0021 sifug]# find / -iname "*dinamo*" 2>/dev/null
[root@srjtqapllx0021 sifug]#
[root@srjtqapllx0021 sifug]#
[root@srjtqapllx0021 sifug]#
