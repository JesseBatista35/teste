Boa tarde, pessoal. Obrigado pelo retorno e pelas capturas. Concordo com a explicação sobre as duas camadas do OKD (IP do cluster e IP de saída do projeto), e é justamente por isso que investigamos: se o pacote saísse com o egress IP, a captura da origem 10.116.221.46 deveria ter registrado bytes.

Do nosso lado, conferimos a configuração do egress (namespace, nó e interface) e não encontramos divergência. Também refizemos o teste a partir de pods do sihdg-tqs; desconsiderem o das 11:27, que era de um host fora do OKD. Do nó de egress, com origem 10.116.221.46, a conexão em 10.116.29.201:31153 foi estabelecida normalmente às ~14:21 (-03).

Vocês conseguem verificar se as capturas JV e JV1 (origem 10.116.221.46) registraram algum byte por volta de 14:21? Isso confirma se a regra da CRQ funciona com essa origem.

Se sim, passo na sequência os horários dos testes feitos a partir dos pods, que deram timeout.
