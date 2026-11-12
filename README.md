Identificada divergência na publicação do endereço siemp.des.caixa. O DNS resolve para dois IPs:
10.116.80.1 → retorna HTTP 404 (Server: JBoss-EAP/7, certificado CN=siecm.des.caixa)
10.116.180.9 → retorna HTTP 200 (certificado CN=siemp.des.caixa e acesso normal à aplicação)
Isso explica o comportamento intermitente relatado pelos usuários. Dependendo do IP retornado na resolução DNS, o usuário recebe a aplicação corretamente ou recebe erro 404. Necessária validação da configuração/publicação associada ao endereço 10.116.80.1.

o jeferson me mandou isso
