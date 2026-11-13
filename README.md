Ainda não é a comparação certa. Os blocos do 6.4 que apareceram (linhas 5916 e 6475) são de outros profiles. O ccr-api do sifec-intranet do 6.4 está na linha 20560, então o realm internet desse profile deve estar perto dela, e o head -15 cortou antes de chegar lá.

O que já sabemos do 7.4: o realm internet aponta para https://logindes.caixa.gov.br/auth.

No 6.4 (10.116.88.20): listar todos os realms internet e intranet com o endereço
sudo grep -n -A4 -E '<realm name="(internet|intranet)"' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -E 'realm name|auth-server-url|realm-public-key' | cut -c1-150

Na saída, procure as linhas entre 18000 e 20972: são as do profile do sifec-intranet, próximas do ccr-api (20560).

Na 471: o realm intranet do 7.4, para comparar
grep -n -A4 -E '<realm name="(internet|intranet)"' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -E 'realm name|auth-server-url|realm-public-key' | cut -c1-150

Se o realm internet do sifec-intranet no 6.4 apontar para outro endereço (por exemplo login.des.caixa) ou tiver uma realm-public-key fixa, achamos a diferença. Me manda as duas saídas.
