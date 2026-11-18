Bom dia, Matheus!

É o CCR. O ccr-api faz parte do pacote SIFEC-CCR, e o endpoint é o da simulação do consignado v8.

Contexto: o Edson tinha reportado que, no JBoss 7.4, a chamada ao /v8/contratos/simular do ccr-api retornava 401, enquanto no 6.4 (sifec5) funcionava. A causa era configuração do JBoss 7.4: o servidor passou a validar o token antes da aplicação e só aceitava o realm internet. Ontem fizemos o ajuste para ficar igual ao 6.4. Como o Edson está de férias, preciso de alguém para validar.

O que precisa fazer:

Repetir a mesma chamada que vocês já fazem ao /v8/contratos/simular, mas apontando para o ambiente do 7.4: https://migracaosifec.des.caixa/ccr-api/..., com o mesmo caminho usado hoje no 6.4.
Testar com um token do realm intranet (login.des.caixa), por exemplo o do CleWeb PNC, que era o caso do Edson.
Se tiver como, testar também com um token do realm internet (logindes.caixa.gov.br), que é o fluxo dos clientes Caixa Aqui.

Resultado esperado: não retornar mais 401. Se vier a resposta da simulação ou algum erro de negócio, a autenticação passou. Se der qualquer erro, me passa o horário e a resposta que eu vejo no log do servidor.
