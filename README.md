Assunto: Solicitação de liberação de firewall — comunicação TQS → DES (SIFPP-micro / Keycloak)

Descrição:

O microserviço sifpp-micro-tqs (namespace sifpp-tqs, ambiente OKD4 NPRD/TQS) precisa se comunicar com o Keycloak em login.des.caixa (IP 10.116.81.74, porta 443) para obter token de autenticação SSO antes de chamar a API de inclusão de boletos.

Em teste realizado em 28/08/2026, a chamada ao endpoint /boletos/incluir obteve sucesso, porém somente após múltiplas tentativas de retry (aproximadamente 90 segundos, com diversos erros ConnectTimeoutException: connection timed out after 15000 ms: login.des.caixa/10.116.81.74:443) antes de a conexão finalmente ser estabelecida com sucesso.

Esse padrão indica que a comunicação entre o ambiente TQS e o ambiente DES para esse destino específico ainda não está liberada de forma estável em nível de firewall — o sucesso ocasional sugere uma liberação parcial, instável, ou dependente de rota/timing específico, não uma regra efetivamente aberta.

Solicitação:

Liberar de forma permanente e estável o tráfego:

Origem: range de saída do namespace sifpp-tqs (OKD4 NPRD-TQS) — solicito ao time de infra confirmar o IP/range de saída utilizado
Destino: 10.116.81.74:443 (login.des.caixa)
Protocolo: HTTPS/443

Evidência anexa: logs do pod sifpp-micro-tqs mostrando as tentativas de timeout seguidas do sucesso eventual.
