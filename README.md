
-sh-4.2$ oc project sispl-tqs
Now using project "sispl-tqs" on server "https://api.pixnprd4.caixa:6443".
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ keytool -list -v -keystore $JAVA_HOME/lib/security/cacerts -storepass changeit | grep -i "logintqs|sectigo"
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ echo | openssl s_client -connect logintqs.caixa.gov.br:443 -showcerts 2>/dev/null | openssl x509 -outform PEM > /tmp/logintqs.pem
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ openssl x509 -in /tmp/logintqs.pem -text -noout
Certificate:
    Data:
        Version: 3 (0x2)
        Serial Number:
            78:f2:d5:b2:a8:e8:af:00:51:b1:5f:7e:08:f8:30:4f
    Signature Algorithm: sha256WithRSAEncryption
        Issuer: C=GB, O=Sectigo Limited, CN=Sectigo Public Server Authentication CA DV R36
        Validity
            Not Before: May 18 00:00:00 2026 GMT
            Not After : Dec  2 23:59:59 2026 GMT
        Subject: CN=logintqs.caixa.gov.br
        Subject Public Key Info:
            Public Key Algorithm: rsaEncryption
                Public-Key: (2048 bit)
                Modulus:
                    00:e0:38:fd:64:43:95:18:20:44:04:d0:d4:9b:1b:
                    41:14:71:72:9c:2a:86:ca:2b:95:9b:2f:66:c9:6a:
                    ca:2f:47:79:8a:8b:8f:09:0c:ec:63:6b:09:13:cd:
                    0a:34:35:85:b7:c9:79:fd:08:80:49:2c:e2:68:b7:
                    a6:f3:b9:36:89:e9:e0:d0:1b:f5:84:65:61:bb:85:
                    d9:8f:d6:10:4f:86:e7:21:72:8c:88:ad:06:95:e5:
                    54:81:97:f4:a4:f7:a3:40:34:b9:64:5f:2c:0b:16:
                    f0:97:72:7d:44:89:b4:02:af:ba:57:eb:48:75:d8:
                    4c:58:d2:a9:24:c7:93:d4:e4:fe:16:bd:d9:93:6f:
                    55:fe:79:43:27:86:b6:51:8d:4d:3a:20:ac:a1:cb:
                    09:d1:93:c2:b6:f8:69:13:b2:ac:5e:97:3d:ef:d4:
                    d3:48:c0:fa:dd:8f:19:c4:66:32:76:9e:f7:ce:af:
                    11:33:58:62:50:b4:17:7a:a6:ca:86:ac:72:ce:bd:
                    36:ec:75:44:a6:e4:a9:af:c6:2b:6e:16:b6:ea:02:
                    50:2e:92:c4:61:10:bd:5f:2e:b7:7f:a6:20:e7:0c:
                    c3:9d:c1:42:51:51:cf:80:8a:50:4e:03:fa:5b:8a:
                    58:e0:69:3a:0a:20:0c:1e:ed:a9:55:fb:7a:75:65:
                    64:71
                Exponent: 65537 (0x10001)
        X509v3 extensions:
            X509v3 Authority Key Identifier:
                keyid:68:C0:12:16:18:0E:AF:CE:F6:87:A6:32:57:A3:46:51:5D:CB:07:27

            X509v3 Subject Key Identifier:
                38:60:9D:E9:BB:19:6C:AA:FB:38:38:4A:EE:9A:D7:01:D3:54:CA:7D
            X509v3 Key Usage: critical
                Digital Signature, Key Encipherment
            X509v3 Basic Constraints: critical
                CA:FALSE
            X509v3 Extended Key Usage:
                TLS Web Server Authentication
            X509v3 Certificate Policies:
                Policy: 1.3.6.1.4.1.6449.1.2.2.7
                  CPS: https://sectigo.com/CPS
                Policy: 2.23.140.1.2.1

            Authority Information Access:
                CA Issuers - URI:http://crt.sectigo.com/SectigoPublicServerAuthenticationCADVR36.crt
                OCSP - URI:http://ocsp.sectigo.com

            X509v3 Subject Alternative Name:
                DNS:logintqs.caixa.gov.br, DNS:www.logintqs.caixa.gov.br
            CT Precertificate SCTs:
                Signed Certificate Timestamp:
                    Version   : v1(0)
                    Log ID    : D7:6D:7D:10:D1:A7:F5:77:C2:C7:E9:5F:D7:00:BF:F9:
                                82:C9:33:5A:65:E1:D0:B3:01:73:17:C0:C8:C5:69:77
                    Timestamp : May 18 15:22:51.319 2026 GMT
                    Extensions: none
                    Signature : ecdsa-with-SHA256
                                30:45:02:20:11:CA:DB:3F:80:7D:FE:F2:9E:3B:8D:49:
                                90:25:E7:DC:EF:BF:BD:5D:9A:B1:D4:4A:C6:23:A9:08:
                                15:0F:20:C8:02:21:00:9B:EE:C4:FD:2A:C2:BC:57:CB:
                                92:06:12:24:B1:13:9E:34:78:08:31:08:32:9A:60:F3:
                                E8:B4:79:F4:44:BA:FF
                Signed Certificate Timestamp:
                    Version   : v1(0)
                    Log ID    : C8:A3:C4:7F:C7:B3:AD:B9:35:6B:01:3F:6A:7A:12:6D:
                                E3:3A:4E:43:A5:C6:46:F9:97:AD:39:75:99:1D:CF:9A
                    Timestamp : May 18 15:22:51.408 2026 GMT
                    Extensions: none
                    Signature : ecdsa-with-SHA256
                                30:45:02:21:00:C7:B6:37:2F:13:DE:17:25:B7:5D:49:
                                AF:6B:BD:E9:DD:7B:99:35:FD:9E:8C:0C:83:0F:E6:04:
                                25:81:DA:68:99:02:20:2A:50:71:B5:77:1F:BD:89:F6:
                                38:5E:6C:EF:DE:A4:26:51:8B:85:98:C6:72:DF:3D:A0:
                                90:1C:23:B2:6F:84:6C
                Signed Certificate Timestamp:
                    Version   : v1(0)
                    Log ID    : 6C:FE:50:19:43:A8:5E:A9:16:BC:52:D1:33:E4:DC:C9:
                                1E:F1:41:1C:7D:25:84:20:D1:73:80:9E:18:18:EB:3A
                    Timestamp : May 18 15:22:52.150 2026 GMT
                    Extensions: 00:00:05:00:0C:20:81:4F
                    Signature : ecdsa-with-SHA256
                                30:45:02:21:00:CB:80:56:FB:16:73:F7:20:D8:A0:A2:
                                A0:DC:41:87:86:A4:B1:54:AB:77:40:B1:71:1D:7F:CD:
                                0D:43:E1:32:33:02:20:77:88:08:FB:44:B5:5E:04:07:
                                6F:A6:44:AE:C9:14:75:76:77:F1:A4:75:04:60:14:60:
                                16:AD:D1:AE:98:EF:02
    Signature Algorithm: sha256WithRSAEncryption
         75:d3:93:e7:a0:fa:dd:bc:49:5d:78:13:41:32:de:15:61:29:
         41:88:89:f0:db:25:e3:6c:e1:2b:10:b3:88:17:b9:80:54:f1:
         9b:c6:59:59:5a:6d:4b:7f:23:36:23:ea:cd:23:18:62:7e:4f:
         c0:4e:85:3b:8e:1d:84:30:41:b2:91:ae:e1:d4:d4:0e:7b:ce:
         f9:03:8a:8f:c3:cc:89:65:4d:3d:67:ab:ec:25:85:bd:9a:60:
         ce:4e:ab:35:23:32:68:16:2a:55:af:73:95:ef:7c:37:48:78:
         99:5e:6c:80:66:31:28:d1:1d:db:af:64:fb:dd:eb:84:e0:d5:
         ec:bc:c7:ad:d7:7f:de:ea:b7:04:64:55:2d:de:2e:38:b0:c1:
         11:07:db:03:90:0e:5a:c5:ca:a7:ca:30:c2:6c:c6:43:23:bf:
         ba:80:d2:a9:71:0b:7c:55:3e:eb:59:db:a8:ab:d2:64:f2:0d:
         c4:c7:96:10:34:45:bd:86:e2:1f:30:eb:c5:fa:7f:b8:5d:20:
         13:b7:6f:c2:55:f3:45:2d:c5:38:83:30:5d:5a:1c:0e:0d:36:
         a6:4c:b1:38:01:98:d2:11:62:2e:bc:2c:ee:2e:77:a1:09:c1:
         10:55:06:fa:d1:48:c3:e4:52:ae:85:6e:a6:a7:6d:68:5e:61:
         5f:d0:b0:1f:e1:d8:00:92:8a:e3:48:2e:33:17:9f:38:2e:00:
         ea:5c:23:71:63:70:d0:56:08:ce:55:63:71:bf:cf:2c:e8:56:
         d4:4d:59:75:b6:e5:cf:9f:fb:35:d3:be:95:b0:c9:f1:1d:94:
         32:e9:2d:f7:48:65:c0:a9:11:f1:69:1e:1a:fb:54:a8:cf:7f:
         7b:96:51:e9:d1:26:c6:5a:9e:c7:33:0b:13:09:ab:07:1a:54:
         fa:41:fa:7d:bb:1c:c2:b9:52:9e:bf:8e:b8:3b:a1:86:14:e0:
         4b:12:f9:9c:45:25:61:ae:8a:65:cf:f9:ca:50:92:ca:ee:be:
         9d:86:e4:10:bb:0f
-sh-4.2$
-sh-4.2$
-sh-4.2$


pode contiuar??




keytool -import -alias logintqs-caixa -file /tmp/logintqs.pem -keystore $JAVA_HOME/lib/security/cacerts -storepass changeit -noprompt

keytool -list -v -keystore $JAVA_HOME/lib/security/cacerts -storepass changeit | grep -A5 "logintqs-caixa"

oc rollout restart deployment/sispl-consulta-transacao-ocp4-tqs -n [seu-namespace]




echo | openssl s_client -connect logintqs.caixa.gov.br:443 -showcerts 2>/dev/null | grep -A30 "BEGIN CERTIFICATE" > /tmp/chain.pem
