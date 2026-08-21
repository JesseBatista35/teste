
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$ keytool -list -v -storetype PKCS12 -keystore /opt/keystore/s-4570-5_CERT.p12 -storepass 'G8KwaJ'
erro de keytool: java.io.IOException: parseAlgParameters failed: DER input not an octet string
java.io.IOException: parseAlgParameters failed: DER input not an octet string
        at sun.security.pkcs12.PKCS12KeyStore.parseAlgParameters(PKCS12KeyStore.java:788)
        at sun.security.pkcs12.PKCS12KeyStore.engineLoad(PKCS12KeyStore.java:1933)
        at java.security.KeyStore.load(KeyStore.java:1381)
        at sun.security.tools.keytool.Main.doCommands(Main.java:826)
        at sun.security.tools.keytool.Main.run(Main.java:360)
        at sun.security.tools.keytool.Main.main(Main.java:353)
Caused by: java.io.IOException: DER input not an octet string
        at sun.security.util.DerInputStream.getOctetString(DerInputStream.java:283)
        at com.sun.crypto.provider.PBEParameters.engineInit(PBEParameters.java:90)
        at java.security.AlgorithmParameters.init(AlgorithmParameters.java:293)
        at sun.security.pkcs12.PKCS12KeyStore.parseAlgParameters(PKCS12KeyStore.java:785)
        ... 5 more
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$
