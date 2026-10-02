
[root@caddeapllx1567 p585600]#
[root@caddeapllx1567 p585600]# keytool -list -keystore /opt/batch/securefiles/caixa-truststore-acteste-nprd.jks | grep -i -E "caixa|ac"
Informe a senha da área de armazenamento de chaves:

*****************  WARNING WARNING WARNING  *****************
* A integridade das informações armazenadas na sua área de armazenamento de chaves  *
* NÃO foi verificada!  Para que seja possível verificar sua integridade, *
* você deve fornecer a senha da área de armazenamento de chaves.                  *
*****************  WARNING WARNING WARNING  *****************

ac icptestes raiz, 28 de jun. de 2024, trustedCertEntry,
ac icptestes sub (ac icptestes raiz), 28 de jun. de 2024, trustedCertEntry,
ac_interna_apl, 5 de abr. de 2023, trustedCertEntry,
ac_interna_caixa, 5 de abr. de 2023, trustedCertEntry,
Fingerprint (SHA-256) do certificado: 35:33:05:81:E9:22:4B:72:CB:34:0F:A4:4B:8F:57:DA:79:AC:0A:3C:95:16:0C:BD:45:19:EC:C1:1B:AB:5C:12
Fingerprint (SHA-256) do certificado: 7B:B6:47:A6:2A:EE:AC:88:BF:25:7A:A5:22:D0:1F:FE:A3:95:E0:AB:45:C7:3F:93:F6:56:54:EC:38:F2:5A:06
Fingerprint (SHA-256) do certificado: 7F:A4:FF:68:EC:04:A9:9D:75:28:D5:08:5F:94:90:7F:4D:1D:D1:C5:38:1B:AC:DC:83:2E:D5:C9:60:21:46:76
Fingerprint (SHA-256) do certificado: 7F:A4:FF:68:EC:04:A9:9D:75:28:D5:08:5F:94:90:7F:4D:1D:D1:C5:38:1B:AC:DC:83:2E:D5:C9:60:21:46:76
[root@caddeapllx1567 p585600]# openssl s_client -connect login.des.caixa:443 -showcerts </dev/null 2>/dev/null | grep -E "s:|i:"
 0 s:/C=BR/O=Caixa Economica Federal/CN=login.des.caixa
   i:/C=BR/O=Caixa Economica Federal/CN=AC Icptestes Sub
 1 s:/C=BR/O=Caixa Economica Federal/CN=AC Icptestes Sub
   i:/C=BR/O=Caixa Economica Federal/CN=AC Icptestes Raiz
 2 s:/C=BR/O=Caixa Economica Federal/CN=AC Icptestes Raiz
   i:/C=BR/O=Caixa Economica Federal/CN=AC Icptestes Raiz
[root@caddeapllx1567 p585600]#
[root@caddeapllx1567 p585600]#
[root@caddeapllx1567 p585600]#
