Aqui está a nota, pronta para colar na WO0000081056391:

À
TELEDATA/CETEL/REDES,

Prezados,

Realizamos a análise solicitada no servidor 10.116.201.122 referente à indisponibilidade do VIP 10.116.181.187 (siamc-dev-intranet.esteiras.des.caixa).

Diagnóstico:

Confirmamos, via acesso ao servidor, que a aplicação está ativa e íntegra, porém publicada na porta 8080, e não na porta 80:

netstat -tulpn | grep :80
tcp    0    0 0.0.0.0:8080    0.0.0.0:*    LISTEN

Testes de conectividade local confirmam que não há serviço escutando na porta 80 do servidor (conexão recusada em localhost, 127.0.0.1 e no IP 10.116.201.122, inclusive com privilégio root):

curl http://10.116.201.122:80/ → Falha na conexão: Conexão recusada

Ou seja, o VIP está configurado corretamente do ponto de vista de rede, porém o serviceGroup/bind aponta para a porta 80 no backend, enquanto a aplicação real está publicada na porta 8080. Por esse motivo o monitor de saúde (CEF_TCP_DEFAULT_MON) não consegue validar o servidor, e o VIP permanece DOWN.

Solicitação:

Favor ajustar o serviceGroup LB_SG_10.116.181.187_HTTP_80, alterando o bind do server 10.116.201.122 da porta 80 para a porta 8080, mantendo o restante da configuração do VIP (VIP 10.116.181.187, redirecionamento HTTP→HTTPS e vserver SSL 443 com o certificado já vinculado).

Ficamos no aguardo da correção para validarmos a disponibilização da aplicação.

At.te,

Jessé Batista
CTIS/CESTI — Esteira DevOps DES TQS NPRD
