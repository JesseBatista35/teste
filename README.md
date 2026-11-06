Oi, Inocêncio! O teste foi em http:// (porta 80), e o ambiente do 7.4 só responde em HTTPS (443). Por isso o timeout.
Acessa por https://migracaosifec.des.caixa/fec-web/, faz o login e entra no SICDT pelo menu do SIFEC. Validamos o PJ hoje por esse mesmo endereço.
Se for testar por curl: curl -k https://migracaosifec.des.caixa/fec-web/
