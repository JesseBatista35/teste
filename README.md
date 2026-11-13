Ainda não é a comparação certa. Os blocos do 6.4 que apareceram (linhas 5916 e 6475) são de outros profiles. O ccr-api do sifec-intranet do 6.4 está na linha 20560, então o realm internet desse profile deve estar perto dela, e o head -15 cortou antes de chegar lá.

O que já sabemos do 7.4: o realm internet aponta para https://logindes.caixa.gov.br/auth.

No 6.4 (10.116.88.20): listar todos os realms internet e intranet com o endereço
sudo grep -n -A4 -E '<realm name="(internet|intranet)"' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -E 'realm name|auth-server-url|realm-public-key' | cut -c1-150

Na saída, procure as linhas entre 18000 e 20972: são as do profile do sifec-intranet, próximas do ccr-api (20560).

Na 471: o realm intranet do 7.4, para comparar
grep -n -A4 -E '<realm name="(internet|intranet)"' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -E 'realm name|auth-server-url|realm-public-key' | cut -c1-150

Se o realm internet do sifec-intranet no 6.4 apontar para outro endereço (por exemplo login.des.caixa) ou tiver uma realm-public-key fixa, achamos a diferença. Me manda as duas saídas.




-sh-4.1$ sudo grep -n -A4 -E '<realm name="(internet|intranet)"' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -E 'realm name|auth-server-url|realm-public-key' | cut -c1-150
5911:                <realm name="intranet">
5912-                    <auth-server-url>https://login.des.caixa/auth</auth-server-url>
5916:                <realm name="internet">
5917-                    <auth-server-url>https://logindes.caixa.gov.br/auth</auth-server-url>
6470:                <realm name="intranet">
6471-                    <auth-server-url>https://login.des.caixa/auth</auth-server-url>
6475:                <realm name="internet">
6476-                    <auth-server-url>https://logindes.caixa.gov.br/auth</auth-server-url>
20403:                <realm name="intranet">
20404-                    <auth-server-url>https://login.des.caixa/auth</auth-server-url>
20408:                <realm name="internet">
20409-                    <auth-server-url>https://logindes.caixa.gov.br/auth</auth-server-url>
22047:                <realm name="intranet">
22048-                    <auth-server-url>https://login.des.caixa/auth</auth-server-url>
22052:                <realm name="internet">
22053-                    <auth-server-url>https://logindes.caixa.gov.br/auth</auth-server-url>
23693:                <realm name="intranet">
23694-                    <auth-server-url>https://login.des.caixa/auth</auth-server-url>
23698:                <realm name="internet">
23699-                    <auth-server-url>https://logindes.caixa.gov.br/auth</auth-server-url>
25343:                <realm name="intranet">
25344-                    <auth-server-url>https://login.des.caixa/auth</auth-server-url>
25348:                <realm name="internet">
25349-                    <auth-server-url>https://logindes.caixa.gov.br/auth</auth-server-url>
26987:                <realm name="intranet">
26988-                    <auth-server-url>https://login.des.caixa/auth</auth-server-url>
26992:                <realm name="internet">
26993-                    <auth-server-url>https://logindes.caixa.gov.br/auth</auth-server-url>
28467:                <realm name="intranet">
28468-                    <auth-server-url>https://login.des.caixa/auth</auth-server-url>
28472:                <realm name="internet">
28473-                    <auth-server-url>https://logindes.caixa.gov.br/auth</auth-server-url>
29850:                <realm name="internet">
29851-                    <auth-server-url>https://logindes.caixa.gov.br/auth</auth-server-url>
52713:                <realm name="intranet">
52714-                    <auth-server-url>https://login.des.caixa/auth</auth-server-url>
52718:                <realm name="internet">
52719-                    <auth-server-url>https://logindes.caixa.gov.br/auth</auth-server-url>
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$



[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]# grep -n -A4 -E '<realm name="(internet|intranet)"' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -E 'realm name|auth-server-url|realm-public-key' | cut -c1-150
1424:                <realm name="intranet">
1425-                    <auth-server-url>https://login.des.caixa/auth</auth-server-url>
1429:                <realm name="internet">
1430-                    <auth-server-url>https://logindes.caixa.gov.br/auth</auth-server-url>
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#

