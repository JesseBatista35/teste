Você tem razão — faltou registrar o que já foi corrigido, para dar o histórico completo. Segue a versão atualizada:

Assunto: Solicitação de liberação de firewall — comunicação TQS → DES (SIFPP-micro / Keycloak)

Contexto / Ajuste já realizado:

O serviço sifpp-micro-tqs apresentava inicialmente erro de inicialização (Unable to determine the proper baseUrl/baseUri) ao chamar /boletos/incluir, causado pela variável URL_BOLETO não estar sendo injetada no container — o pod em execução estava rodando desde 19/08 e não havia capturado o snapshot atualizado do variable group SIFPP-MICRO-TQS no Azure DevOps. Foi realizado um novo deploy (release nova, não reexecução), e a variável passou a ser corretamente injetada no ambiente, confirmado via env no pod (URL_BOLETO=https://api.des.caixa:8443). Esse problema está resolvido.

Problema atual (objeto desta solicitação):

Após o redeploy, ao chamar o SSO (Keycloak) em login.des.caixa (IP 10.116.81.74, porta 443) para obter o token de autenticação, o serviço passou a apresentar ConnectTimeoutException: connection timed out after 15000 ms, indicando bloqueio de rede entre os ambientes TQS e DES.

Em teste realizado em 28/08/2026, a chamada obteve sucesso, porém somente após múltiplas tentativas de retry (aproximadamente 90 segundos, com diversos timeouts) antes de a conexão finalmente ser estabelecida. Esse padrão sugere que a comunicação entre TQS e DES para esse destino específico ainda não está liberada de forma estável em nível de firewall — o sucesso ocasional indica liberação parcial, instável, ou dependente de rota/timing específico, não uma regra efetivamente aberta.

Solicitação:

Liberar de forma permanente e estável o tráfego:

Origem: range de saída do namespace sifpp-tqs (OKD4 NPRD-TQS) — solicito ao time de infra confirmar o IP/range de saída utilizado
Destino: 10.116.81.74:443 (login.des.caixa)
Protocolo: HTTPS/443

Evidência anexa: logs do pod sifpp-micro-tqs mostrando as tentativas de timeout seguidas do sucesso eventual, e log confirmando a inclusão de boleto bem-sucedida após a liberação parcial.
