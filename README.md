Prezados,

Em resposta: a solicitação de proxy referente a esta demanda já foi aberta, sob o número REQ000145427528.

Dados da solicitação:

Ambiente: Não produção (TQS)
Projeto: SISOU-SAC-OKD
Origem (hostname/IP): 10.116.222.251
Destino: https://app.hugme.com.br
Protocolo/Porta: 443
Aprovador: C110509 – Henrique C dos Reis Nascimento

Essa é a mesma origem que está apresentando o erro reportado (Forefront TMG denied the specified URL), confirmado via teste direto do pod do ambiente TQS com o proxy proxydes.caixa:80. Reforçamos também que esse mesmo destino já é acessado normalmente a partir do ambiente DES, indicando que se trata apenas de liberação da origem TQS na regra de proxy correspondente (conforme precedente da WO0000081440537, em que a origem do SISOU já participava da regra "PND - SISOU" e apenas a URL precisou ser incluída após validação de reputação).

Evidências de reputação do destino (sem ocorrência em blocklist) seguem anexas para agilizar a etapa de Cibersegurança, caso ainda não tenham sido avaliadas na REQ000145427528.

Ficamos à disposição para o que for necessário.

Atenciosamente,
CTIS / CESTI Esteira DEVOPS DES TQS NPRD
