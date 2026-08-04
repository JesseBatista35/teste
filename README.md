keytool -list -v -keystore /deployments/caixa-truststore-acteste-nprd.jks -storepass changeit 2>/dev/null | grep -i "alias\|sectigo\|issuer"


exec java -Dquarkus.http.host=0.0.0.0 ... -cp . -jar /deployments/quarkus-run.jar


env | grep -i java_opts
env | grep -i quarkus



sh-4.4$ keytool -list -v -keystore /deployments/caixa-truststore-acteste-nprd.jks -storepass changeit 2>/dev/null | grep -i "alias\|sectigo\|issuer"
Alias name: aaa certificate services
Issuer: CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB
Alias name: aaa_certificate_services
Issuer: CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB
Alias name: ac icptestes raiz
Issuer: CN=AC Icptestes Raiz, O=Caixa Economica Federal, C=BR
Alias name: ac icptestes sub (ac icptestes raiz)
Issuer: CN=AC Icptestes Raiz, O=Caixa Economica Federal, C=BR
Alias name: ac_interna_apl
Issuer: CN=AC Interna Caixa, O=Caixa Economica Federal, C=BR
Alias name: ac_interna_caixa
Issuer: CN=AC Interna Caixa, O=Caixa Economica Federal, C=BR
Alias name: autoridade certificadora do serpro final ssl (autoridade certificadora serpro v4)
Issuer: CN=Autoridade Certificadora SERPRO v4, OU=Autoridade Certificadora Raiz Brasileira v5, O=ICP-Brasil, C=BR
Alias name: autoridade certificadora raiz brasileira v5
Issuer: CN=Autoridade Certificadora Raiz Brasileira v5, OU=Instituto Nacional de Tecnologia da Informacao - ITI, O=ICP-Brasil, C=BR
Alias name: autoridade certificadora serpro v4 (autoridade certificadora raiz brasileira v5)
Issuer: CN=Autoridade Certificadora Raiz Brasileira v5, OU=Instituto Nacional de Tecnologia da Informacao - ITI, O=ICP-Brasil, C=BR
Alias name: comodo rsa organization validation secure server ca (comodo rsa certification authority)
Issuer: CN=COMODO RSA Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB
   accessMethod: caIssuers
Alias name: comodorsa
Issuer: CN=COMODO RSA Certification Authority, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB
   accessMethod: caIssuers
Alias name: digicert global root ca
Issuer: CN=DigiCert Global Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US
Alias name: digicert global root g2
Issuer: CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US
Alias name: digicertglocalrootca
Issuer: CN=DigiCert Global Root CA, OU=www.digicert.com, O=DigiCert Inc, C=US
Alias name: globalsign root ca
Issuer: CN=GlobalSign Root CA, OU=Root CA, O=GlobalSign nv-sa, C=BE
Alias name: globalsign rsa ov ssl ca 2018 (globalsign)
Issuer: CN=GlobalSign, O=GlobalSign, OU=GlobalSign Root CA - R3
Alias name: globalsignrsa
Issuer: CN=GlobalSign, O=GlobalSign, OU=GlobalSign Root CA - R3
Alias name: microsoft rsa root certificate authority 2017
Issuer: CN=Microsoft RSA Root Certificate Authority 2017, O=Microsoft Corporation, C=US
Alias name: sectigo public server authentication ca dv r36 (sectigo public server authentication root r46)
Owner: CN=Sectigo Public Server Authentication CA DV R36, O=Sectigo Limited, C=GB
Issuer: CN=Sectigo Public Server Authentication Root R46, O=Sectigo Limited, C=GB
   accessMethod: caIssuers
   accessLocation: URIName: http://crt.sectigo.com/SectigoPublicServerAuthenticationRootR46.p7c
   accessLocation: URIName: http://ocsp.sectigo.com
     [URIName: http://crl.sectigo.com/SectigoPublicServerAuthenticationRootR46.crl]
Alias name: sectigo public server authentication root r46
Owner: CN=Sectigo Public Server Authentication Root R46, O=Sectigo Limited, C=GB
Issuer: CN=Sectigo Public Server Authentication Root R46, O=Sectigo Limited, C=GB
Alias name: sectigo rsa domain validation secure server ca (usertrust rsa certification authority)
Owner: CN=Sectigo RSA Domain Validation Secure Server CA, O=Sectigo Limited, L=Salford, ST=Greater Manchester, C=GB
Issuer: CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US
   accessMethod: caIssuers
Alias name: sectigo_rsa_domain_server_ca
Owner: CN=Sectigo RSA Domain Validation Secure Server CA, O=Sectigo Limited, L=Salford, ST=Greater Manchester, C=GB
Issuer: CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US
   accessMethod: caIssuers
Alias name: thawte tls rsa ca g1 (digicert global root g2)
Issuer: CN=DigiCert Global Root G2, OU=www.digicert.com, O=DigiCert Inc, C=US
Alias name: usertrust rsa certification authority
Issuer: CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US
Alias name: usertrust rsa certification authority (aaa certificate services)
Issuer: CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB
Alias name: usertrust_rsa_authority
Issuer: CN=AAA Certificate Services, O=Comodo CA Limited, L=Salford, ST=Greater Manchester, C=GB
Alias name: valid certificadora rsa dv ssl ca (usertrust rsa certification authority)
Issuer: CN=USERTrust RSA Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US
   accessMethod: caIssuers
sh-4.4$
sh-4.4$
sh-4.4$
sh-4.4$
sh-4.4$
