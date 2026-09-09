
[p585600@srjtqapllx0021 ~]$ keytool -list -v -keystore /infra_app/config/sifug/IF104.p12 -storetype PKCS12 -storepass 123456 -alias 1
Alias name: 1
Creation date: Sep 9, 2026
Entry type: PrivateKeyEntry
Certificate chain length: 2
Certificate[1]:
Owner: OU=CBC H104, O=IF 104, EMAILADDRESS=if@eco.com, C=BR, ST=SC, CN=Eco Caixa
Issuer: CN=Dataprev ECO, O=Dataprev, C=BR
Serial number: 84
Valid from: Mon Aug 25 13:53:04 BRT 2025 until: Tue Aug 25 13:53:04 BRT 2026
Certificate fingerprints:
         MD5:  46:D0:FA:8C:1D:C2:8F:2C:4F:2A:44:9E:E5:D0:4F:30
         SHA1: 8C:F1:8F:7B:7E:A1:3B:FA:5D:67:B6:BC:98:19:92:00:A2:52:F7:98
         SHA256: 51:73:C7:2C:C9:99:DB:AE:6F:D2:47:49:32:38:46:3A:48:36:DC:2A:10:B9:78:FE:02:D3:E5:C7:B3:3C:09:D2
Signature algorithm name: SHA1withRSA
Subject Public Key Algorithm: 2048-bit RSA key
Version: 3

Extensions:

#1: ObjectId: 2.5.29.35 Criticality=false
AuthorityKeyIdentifier [
[CN=Dataprev ECO, O=Dataprev, C=BR]
SerialNumber: [    72a0a0ab 1c0b471a 768e049b 11bd2baa e9ba59c2]
]

#2: ObjectId: 2.5.29.19 Criticality=false
BasicConstraints:[
  CA:false
  PathLen: undefined
]

#3: ObjectId: 2.5.29.31 Criticality=false
CRLDistributionPoints [
  [DistributionPoint:
     [URIName: http://portal.dataprev.gov.br/]
]]

#4: ObjectId: 2.5.29.37 Criticality=false
ExtendedKeyUsages [
  clientAuth
  serverAuth
]

#5: ObjectId: 2.5.29.15 Criticality=false
KeyUsage [
  DigitalSignature
  Non_repudiation
  Key_Encipherment
]

#6: ObjectId: 2.5.29.14 Criticality=false
SubjectKeyIdentifier [
KeyIdentifier [
0000: C9 09 BC 36 A1 A9 D3 14   D0 7D 8B BB 8D 5F BA 18  ...6........._..
0010: D1 E3 C7 FB                                        ....
]
]

Certificate[2]:
Owner: CN=Dataprev ECO, O=Dataprev, C=BR
Issuer: CN=Dataprev ECO, O=Dataprev, C=BR
Serial number: 72a0a0ab1c0b471a768e049b11bd2baae9ba59c2
Valid from: Wed Nov 08 11:29:23 BRT 2023 until: Mon Nov 06 11:29:23 BRT 2028
Certificate fingerprints:
         MD5:  7C:26:B2:C7:9F:35:2E:39:01:E3:37:22:8E:BE:42:61
         SHA1: E2:E4:30:65:74:20:8B:08:3C:4E:9E:6F:6A:5F:B8:4E:BA:8A:3B:B5
         SHA256: 7F:D3:B8:9D:CE:A8:32:01:81:34:4B:13:52:FB:8E:12:D4:DD:C2:50:8E:16:69:6F:E0:4D:F6:88:F5:32:7A:41
Signature algorithm name: SHA1withRSA
Subject Public Key Algorithm: 2048-bit RSA key
Version: 3

Extensions:

#1: ObjectId: 2.5.29.19 Criticality=false
BasicConstraints:[
  CA:true
  PathLen:2147483647
]

#2: ObjectId: 2.5.29.31 Criticality=false
CRLDistributionPoints [
  [DistributionPoint:
     [URIName: http://portal.dataprev.gov.br/]
]]

[p585600@srjtqapllx0021 ~]$
[p585600@srjtqapllx0021 ~]$
[p585600@srjtqapllx0021 ~]$
[p585600@srjtqapllx0021 ~]$ openssl pkcs12 -in /infra_app/config/sifug/IF104.p12 -clcerts -nokeys -passin pass:123456 | openssl x509 -noout -subject -issuer -serial -dates
MAC verified OK
subject= /CN=Eco Caixa/ST=SC/C=BR/emailAddress=if@eco.com/O=IF 104/OU=CBC H104
issuer= /C=BR/O=Dataprev/CN=Dataprev ECO
serial=84
notBefore=Aug 25 16:53:04 2025 GMT
notAfter=Aug 25 16:53:04 2026 GMT
[p585600@srjtqapllx0021 ~]$
