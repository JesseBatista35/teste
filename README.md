Solicitação de validação — VIP SIARG/DES (10.116.180.5)

Contexto: Após a migração de SSL para o balanceador (VIP), conforme diretriz de Infraestrutura/Segurança, foram validadas e confirmadas como corretas todas as camadas sob responsabilidade do CESTI:

Apache (caddeapllx2577, porta 443) ajustado corretamente para o novo modelo: SSL local desabilitado, respondendo em HTTP puro.
Proxy reverso Apache → JBoss via AJP (porta 8009): funcionando normalmente.
Aplicação SIARG (JBoss EAP): respondendo corretamente às requisições.

Testes realizados diretamente na VM (curl http://10.116.201.44:443/siarg/...) confirmam que a aplicação está 100% operacional nesse novo modelo (sem SSL local).

Problema: A aplicação não está acessível através do VIP (https://siarg-interno.esteiras.des.caixa → 10.116.180.5), apesar de acessível via porta 8443 diretamente pelo servidor. Como o backend na VM não possui mais SSL, esse comportamento indica que o problema está na configuração do VIP em si, não na aplicação ou no Apache.

Solicitamos validação dos seguintes pontos no VIP:

Backend pool: confirmar se o pool está apontando para 10.116.201.44 na porta 443 em HTTP (não mais HTTPS/8443, conforme configuração antiga).
Healthcheck: confirmar se o healthcheck do VIP está configurado para bater via HTTP (não HTTPS) no backend, e se está retornando sucesso.
Certificado SSL: confirmar se o certificado instalado no VIP (REQ000145748985) está corretamente vinculado/associado ao hostname siarg-interno.esteiras.des.caixa (SNI, se aplicável).

REQs de referência:

REQ000145741048 — Criação do VIP
REQ000145749435 — DNS apontar pro VIP
REQ000145748985 — Certificado SSL instalado no VIP
