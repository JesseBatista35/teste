Inocêncio, achei e corrigi o 500 da API REST do SICDT. 👍

Onde estava o erro: a sicdt-orig-api-rest é bearer-only. Para validar o token, o adapter do Keycloak precisa buscar a configuração do realm em https://login.des.caixa. O truststore do servidor estava apontando para um caminho de Windows (C:/Desenvolvimento/JDK/.../cacerts), herdado de configuração de dev. Sem a cadeia de certificados da Caixa, a conexão falhava com PKIX path building failed, e o adapter quebrava com NullPointerException, gerando o 500.

O que foi corrigido:

Criado o truststore /opt/jboss/truststore/sifec-cacerts.jks (cacerts do Java + AC Icptestes Raiz e AC Icptestes Sub da Caixa)
javax.net.ssl.trustStore do server-group sifec-intranet apontando para esse arquivo
Restart do sifec-intranet

Teste para você fazer:

Gere um token novo (o anterior pode ter expirado) e repita a mesma requisição:
GET https://migracaosifec.des.caixa/sicdt-orig-api-rest/sicdt/v2/contrato/liberacao/consultar/99178267365/3194
com os headers Authorization: Bearer <token> e Apikey.
O esperado é 200 com o JSON da consulta. Se vier 401, me avise: aí ajustamos o client do secure-deployment para cli-ser-cdt, como na sua configuração.
Teste também as outras chamadas da API que você usa no fluxo.

Se der qualquer erro, me manda o horário que eu pego o log.
