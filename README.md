Boa tarde, Inocêncio! Obrigado pelo artefato e pelas configurações, recebi tudo.

O SICDT vai subir no server-group sifec-intranet, junto com os demais módulos do SIFEC. Já vimos que os secure-deployment sifec-cdt-web.war e sicdt-orig-api-rest.war existem no 7.4.

Sobre as configurações:

Properties: vou usar os valores do servidor 6.4 de DES. O SICDT_URLBASE que você mandou aponta para localhost:8080, que é do seu ambiente local. Se o valor do 6.4 não servir para o 7.4, te aviso.
Datasource java:/jdbc/OracleSicdtDS: ainda não existe no 7.4, vou criar com o driver Oracle do servidor.
Jackson/RESTEasy como provided: ótimo, é o que o EAP 7.4 espera.

Duas confirmações:

O sifec-cdt-3.24.3.001.ear já contém os dois módulos (sifec-cdt-web.war e sicdt-orig-api-rest.war), ou a API vem em outro pacote?
@Paulo, posso subir o SICDT agora ou seguimos outra ordem?
