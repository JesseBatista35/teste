Oi, Lucas, boa tarde!

Vi a solicitação do VIP para a CETEL, está correta. Agora é aguardar o atendimento deles.

Próximos passos depois que a CETEL atender:

1. Na resposta, a CETEL vai informar o IP do novo VIP exclusivo. Me passa esse IP assim que chegar.
2. Com o IP em mãos, abrir a REQ de DNS pedindo a alteração do registro sigpf-vendas.esteiras.tqs.caixa de 10.116.180.23 (VIP compartilhado) para o IP do novo VIP, citando a REQ do VIP.
3. Depois da propagação do DNS, testamos a URL https://sigpf-vendas.esteiras.tqs.caixa/sigpf_internet. Se der timeout na 443 a partir da rede de vocês, vai ser preciso pedir a liberação de regra para o VIP na porta 443.
4. Com a URL respondendo, rodamos a release de TQS de novo para a URL ficar registrada na InfraDevops (no último deploy esse passo deu timeout).

Qualquer retorno da CETEL, me avisa por aqui.

Obrigado!
