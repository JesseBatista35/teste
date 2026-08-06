-sh-4.2$ cd /tmp
-sh-4.2$ openssl s_client -connect api.des.caixa:8443 -showcerts </dev/null 2>/dev/null | \
> awk '/BEGIN CERT/,/END CERT/{print > ("cert" n ".pem")} /END CERT/{n++}'
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ ls -la cert*.pem
-rw-r--r-- 1 p585600 usucef 2208 Ago  6 16:44 cert1.pem
-rw-r--r-- 1 p585600 usucef 2159 Ago  6 16:44 cert2.pem
-rw-r--r-- 1 p585600 usucef 2199 Ago  6 16:44 cert.pem
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ sudo keytool -importcert -alias icptestes-raiz -file cert2.pem \
>   -keystore /usr/lib/jvm/jdk-1.8.0_471-oracle-x64/jre/lib/security/cacerts -storepass changeit
Proprietário: CN=AC Icptestes Raiz, O=Caixa Economica Federal, C=BR
Emissor: CN=AC Icptestes Raiz, O=Caixa Economica Federal, C=BR
Número de série: 47b583ffce303b8047ba716d908e88d2
Válido de: Fri Dec 23 11:55:17 BRT 2022 até: Tue Dec 23 12:05:14 BRT 2042
Fingerprints do certificado:
         SHA1: 55:B9:40:BF:89:E8:31:E4:DB:67:09:24:30:29:AC:D2:75:CE:DA:E7
         SHA256: 1A:65:82:0E:CD:DC:A7:30:87:03:F9:1D:80:C1:C3:12:29:00:C2:BF:25:DA:5F:B0:5F:3D:60:A7:A9:3C:F8:F1
Nome do algoritmo de assinatura: SHA512withRSA
Algoritmo de Chave Pública do Assunto: Chave RSA de 4096 bits
Versão: 3

Extensões:

#1: ObjectId: 1.3.6.1.4.1.311.21.1 Criticality=false
0000: 02 01 00                                           ...


#2: ObjectId: 2.5.29.19 Criticality=true
BasicConstraints:[
  CA:true
  PathLen:2147483647
]

#3: ObjectId: 2.5.29.31 Criticality=false
CRLDistributionPoints [
  [DistributionPoint:
     [URIName: http://icptestes.caixa/lcrs/acicptestesraiz.crl]
]]

#4: ObjectId: 2.5.29.32 Criticality=false
CertificatePolicies [
  [CertificatePolicyId: [2.16.76.1.1.9]
[PolicyQualifierInfo: [
  qualifierID: 1.3.6.1.5.5.7.2.1
  qualifier: 0000: 16 32 68 74 74 70 3A 2F   2F 61 63 69 6E 74 65 72  .2http://acinter
0010: 6E 61 2E 63 61 69 78 61   2F 64 6F 63 75 6D 65 6E  na.caixa/documen
0020: 74 6F 73 2F 64 70 63 61   63 69 6E 74 65 72 6E 61  tos/dpcacinterna
0030: 2E 70 64 66                                        .pdf

]]  ]
]

#5: ObjectId: 2.5.29.15 Criticality=true
KeyUsage [
  Key_CertSign
  Crl_Sign
]

#6: ObjectId: 2.5.29.14 Criticality=false
SubjectKeyIdentifier [
KeyIdentifier [
0000: F2 E6 C1 67 81 C9 B2 67   C8 3A AD A6 EA 47 99 5E  ...g...g.:...G.^
0010: A7 08 9D 48                                        ...H
]
]

Confiar neste certificado? [não]:  yes
Resposta errada; tente novamente
Confiar neste certificado? [não]:  sim
O certificado foi adicionado à área de armazenamento de chaves
-sh-4.2$
-sh-4.2$
-sh-4.2$  sudo keytool -importcert -alias icptestes-sub -file cert1.pem \
>   -keystore /usr/lib/jvm/jdk-1.8.0_471-oracle-x64/jre/lib/security/cacerts -storepass changeit
O certificado foi adicionado à área de armazenamento de chaves
-sh-4.2$
-sh-4.2$
-sh-4.2$   sudo keytool -importcert -alias apim-des-caixa -file cert0.pem \
>   -keystore /usr/lib/jvm/jdk-1.8.0_471-oracle-x64/jre/lib/security/cacerts -storepass changeit
erro de keytool: java.io.FileNotFoundException: cert0.pem (Arquivo ou diretório não encontrado)
-sh-4.2$
-sh-4.2$
-sh-4.2$  sudo keytool -list -keystore /usr/lib/jvm/jdk-1.8.0_471-oracle-x64/jre/lib/security/cacerts -storepass changeit | grep -i icptestes
icptestes-raiz, 06/08/2026, trustedCertEntry,
icptestes-sub, 06/08/2026, trustedCertEntry,
-sh-4.2$
-sh-4.2$
-sh-4.2$

