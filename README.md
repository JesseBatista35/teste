
root@srjtqapllx0021 sifug]# openssl pkcs12 -in /infra_app/config/sifug/IF104.p12 -clcerts -nokeys | openssl x509 -noout -subject -issuer -serial -dates
Enter Import Password:
MAC verified OK
subject= /C=BR/O=ICP-Brasil/OU=videoconferencia/OU=33683111000107/OU=CBC T006/OU=00360305/OU=CAIXA ECONOMICA FEDERAL/CN=ECO.DATAPREV.DES.CAIXA.GOV.BR
issuer= /C=BR/O=ICP-Brasil/OU=CSPB-1/OU=Servico Federal de Processamento de Dados - SERPRO/CN=Autoridade Certificadora do SERPRO Final SSL
serial=E31235862D4665882B374BA5
notBefore=Dec 22 18:11:30 2025 GMT
notAfter=Dec 22 18:11:30 2026 GMT
[root@srjtqapllx0021 sifug]# openssl pkcs12 -in /infra_app/config/sifug/IF104.p12 -clcerts -nokeys | openssl x509 -noout -subject -issuer -serial -dates
Enter Import Password:
MAC verified OK
subject= /C=BR/O=ICP-Brasil/OU=videoconferencia/OU=33683111000107/OU=CBC T006/OU=00360305/OU=CAIXA ECONOMICA FEDERAL/CN=ECO.DATAPREV.DES.CAIXA.GOV.BR
issuer= /C=BR/O=ICP-Brasil/OU=CSPB-1/OU=Servico Federal de Processamento de Dados - SERPRO/CN=Autoridade Certificadora do SERPRO Final SSL
serial=E31235862D4665882B374BA5
notBefore=Dec 22 18:11:30 2025 GMT
notAfter=Dec 22 18:11:30 2026 GMT
[root@srjtqapllx0021 sifug]#
