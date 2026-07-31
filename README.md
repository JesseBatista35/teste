Prezados,

Em análise técnica, identificamos que a aplicação sisaq-web está publicada e ativa no servidor caddeapllx2519.agil.nprd.caixa.gov.br (IP 10.116.201.140), com deploy realizado em 29/07/2026 17:28, compatível com a execução da pipeline da tag 1.121.0.0.

Constatamos que o VIP sisaq-web.esteiras.tqs.caixa (10.116.180.246) está configurado para balancear tráfego para o IP 10.116.198.210, servidor que não responde a testes de conectividade (sem rota para o host) e sem registro de DNS reverso, indicando se tratar de uma VM já excluída. Este é o motivo pelo qual o ambiente TQS não reflete as atualizações de deploy.

A correção do apontamento do VIP para o IP 10.116.201.140 (caddeapllx2519) é atribuição da equipe de Redes/CETEL. Por se tratar de uma alteração de infraestrutura de rede vinculada à aplicação, orientamos que a solicitação seja formalizada diretamente pela equipe responsável pela aplicação (dono/demandante) junto à CETEL, encaminhando as evidências acima.

Diante do exposto, encerramos a presente demanda dentro do escopo desta esteira.
