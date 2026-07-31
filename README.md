Prezados,

Em análise técnica, confirmamos que a aplicação sisaq-web está publicada e ativa no servidor caddeapllx2519.agil.nprd.caixa.gov.br (IP 10.116.201.140), com deploy realizado em 29/07/2026 17:28, compatível com a execução da pipeline da tag 1.121.0.0.

Verificamos que o VIP sisaq-web.esteiras.tqs.caixa (10.116.180.246) está configurado para balancear tráfego para o IP 10.116.198.210. Testes de conectividade a este IP retornaram "sem rota para o host" e a resolução reversa não obteve registro (NXDOMAIN), indicando que este servidor não está mais ativo na rede, possivelmente uma VM já excluída.

Dessa forma, o VIP de TQS está apontando para um servidor inexistente, o que explica por que o ambiente TQS não reflete as atualizações de deploy, mesmo com a aplicação corretamente publicada na VM atual.

Solicitamos a atualização do balanceamento do VIP sisaq-web.esteiras.tqs.caixa para o IP 10.116.201.140 (caddeapllx2519), que é o servidor onde a aplicação está atualmente publicada.

Atenciosamente,
