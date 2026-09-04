Segue nota de encerramento/acompanhamento:

Solicitação de liberação de proxy para integração STA BACEN aberta via SIGSC, formulário Proxy, protocolo REQ000145767642 (ARNOTE 150370).

Dados enviados na requisição:
Ambiente: Não Produção (TQS/DES/HMP)
Origem: namespace sicvr-des / EgressIP 10.116.220.120
Destino: sta-h.bcb.gov.br; sta.bcb.gov.br; www9.bcb.gov.br
Protocolo/Porta: HTTPS / 443

Pendência: aguardando execução pela CETEL. Após a liberação confirmada, não é necessária nenhuma ação adicional de rede — basta configurar as variáveis de proxy (HTTP_PROXY/HTTPS_PROXY/NO_PROXY) no grupo de variáveis SICVR-API-INTEGRACOES-DES (escopo EC DES), no Azure DevOps, seguindo o padrão já usado no grupo EGRESS_IP_OKD para configuração de NO_PROXY. Com isso, o proxy será propagado ao DeploymentConfig no próximo release e a aplicação passa a acessar os endpoints do BACEN corretamente.

Acompanhar o status da REQ000145767642 até a CETEL confirmar a execução.
