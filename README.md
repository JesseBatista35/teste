p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$ keytool -list -v -storetype PKCS12 -keystore /tmp/s-4570-5_CERT_legacy.p12 -storepass 'G8KwaJ'
Tipo de ▒rea de armazenamento de chaves: PKCS12
Fornecedor da ▒rea de armazenamento de chaves: SunJSSE

Sua ▒rea de armazenamento de chaves cont▒m 1 entrada

Nome do alias: sincad-b3
Data de cria▒▒o: 21/08/2026
Tipo de entrada: PrivateKeyEntry
Comprimento da cadeia de certificados: 3
Certificado[1]:
Propriet▒rio: CN=s-4570-5, OU=GCMC-CAAP, O=B3 SA, L=Sao Paulo, ST=SP, C=BR
Emissor: CN=Intermed Certificate PROD, OU=GCMC, O=B3 SA, L=Sao Paulo, ST=SP, C=BR
N▒mero de s▒rie: add0de2bdf064a42b6de73145a39aacb
V▒lido de Thu May 21 18:37:37 BRT 2026 at▒ Sat May 20 18:37:37 BRT 2028
Fingerprints do certificado:
         MD5:  48:ED:C3:FB:C1:1F:18:7E:6D:AE:52:A7:55:7C:56:7E
         SHA1: 35:E6:2A:71:16:DA:4A:6A:B8:7C:13:D0:9D:73:30:5F:6F:B3:91:CD
         SHA256: 6D:7C:24:DB:D0:2D:39:48:C9:8E:3A:CE:79:E7:48:F6:C7:D9:FB:77:21:CC:BF:F1:EB:35:B2:C1:49:EC:AC:A3
Nome do algoritmo de assinatura: SHA256withRSA
Algoritmo de Chave P▒blica do Assunto: Chave RSA de 2048 bits
Vers▒o: 3
Certificado[2]:
Propriet▒rio: CN=Intermed Certificate PROD, OU=GCMC, O=B3 SA, L=Sao Paulo, ST=SP, C=BR
Emissor: CN=CA Certificate - PROD, OU=GCMC, O=B3 SA, L=Sao Paulo, ST=SP, C=BR
N▒mero de s▒rie: c7ba63ca2c17fc22
V▒lido de Wed Oct 03 11:50:07 BRT 2018 at▒ Sat Sep 30 11:50:07 BRT 2028
Fingerprints do certificado:
         MD5:  ED:26:FD:0D:9B:27:90:16:9D:82:FC:9B:56:47:39:80
         SHA1: 3D:61:16:58:EC:C7:2A:55:A5:FF:B0:47:BF:28:36:FB:21:F2:9B:BB
         SHA256: 4A:15:A4:E4:D2:54:98:5E:5A:CB:89:42:37:46:05:7C:2E:E4:BC:F6:C7:77:B6:00:50:E6:48:79:22:F7:E4:3F
Nome do algoritmo de assinatura: SHA256withRSA
Algoritmo de Chave P▒blica do Assunto: Chave RSA de 2048 bits
Vers▒o: 3

Extens▒es:

#1: ObjectId: 2.5.29.35 Criticality=false
AuthorityKeyIdentifier [
KeyIdentifier [
0000: 25 E0 DE 79 3B 0D 99 AC   6E 6F D3 86 9F 78 10 57  %..y;...no...x.W
0010: 4A 3E 77 33                                        J>w3
]
[CN=CA Certificate - PROD, OU=GCMC, O=B3 SA, L=Sao Paulo, ST=SP, C=BR]
SerialNumber: [    f2059fea 55700ee1]
]

#2: ObjectId: 2.5.29.19 Criticality=false
BasicConstraints:[
  CA:true
  PathLen:1
]

#3: ObjectId: 2.5.29.15 Criticality=true
KeyUsage [
  DigitalSignature
  Key_CertSign
  Crl_Sign
]

#4: ObjectId: 2.5.29.14 Criticality=false
SubjectKeyIdentifier [
KeyIdentifier [
0000: 47 66 3C 85 42 5E F8 1E   AA 4E AF B4 B4 63 E6 1C  Gf<.B^...N...c..
0010: 2A C5 AE 7E                                        *...
]
]

#5: ObjectId: 2.5.29.18 Criticality=false
Unparseable IssuerAlternativeName extension due to
java.io.IOException: No data available in passed DER encoded value.

0000: 30 00                                              0.

Certificado[3]:
Propriet▒rio: CN=CA Certificate - PROD, OU=GCMC, O=B3 SA, L=Sao Paulo, ST=SP, C=BR
Emissor: CN=CA Certificate - PROD, OU=GCMC, O=B3 SA, L=Sao Paulo, ST=SP, C=BR
N▒mero de s▒rie: f2059fea55700ee1
V▒lido de Wed Oct 03 11:45:20 BRT 2018 at▒ Tue Sep 28 11:45:20 BRT 2038
Fingerprints do certificado:
         MD5:  6B:45:9C:A7:22:10:8C:DD:C3:A6:DB:03:72:B6:CD:EF
         SHA1: E4:11:5E:95:3F:B6:0A:FC:E1:72:6E:F6:08:AA:F0:DF:EF:CD:B4:F9
         SHA256: 89:CF:65:0C:82:FE:02:2B:99:0C:EE:94:41:26:59:52:60:75:5B:F4:30:E6:C0:0C:AE:47:63:B7:03:EB:13:06
Nome do algoritmo de assinatura: SHA256withRSA
Algoritmo de Chave P▒blica do Assunto: Chave RSA de 2048 bits
Vers▒o: 3

Extens▒es:

#1: ObjectId: 2.5.29.35 Criticality=false
AuthorityKeyIdentifier [
KeyIdentifier [
0000: 25 E0 DE 79 3B 0D 99 AC   6E 6F D3 86 9F 78 10 57  %..y;...no...x.W
0010: 4A 3E 77 33                                        J>w3
]
[CN=CA Certificate - PROD, OU=GCMC, O=B3 SA, L=Sao Paulo, ST=SP, C=BR]
SerialNumber: [    f2059fea 55700ee1]
]

#2: ObjectId: 2.5.29.19 Criticality=false
BasicConstraints:[
  CA:true
  PathLen:2147483647
]

#3: ObjectId: 2.5.29.15 Criticality=true
KeyUsage [
  DigitalSignature
  Key_CertSign
  Crl_Sign
]

#4: ObjectId: 2.5.29.14 Criticality=false
SubjectKeyIdentifier [
KeyIdentifier [
0000: 25 E0 DE 79 3B 0D 99 AC   6E 6F D3 86 9F 78 10 57  %..y;...no...x.W
0010: 4A 3E 77 33                                        J>w3
]
]

#5: ObjectId: 2.5.29.18 Criticality=false
Unparseable IssuerAlternativeName extension due to
java.io.IOException: No data available in passed DER encoded value.

0000: 30 00                                              0.



*******************************************
*******************************************


[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$ openssl x509 -in /tmp/cert_full.pem -noout -subject -dates
subject= /C=BR/ST=SP/L=Sao Paulo/O=B3 SA/OU=GCMC-CAAP/CN=s-4570-5
notBefore=May 21 21:37:37 2026 GMT
notAfter=May 20 21:37:37 2028 GMT
[p585600@cspdeapllx011 ~]$
