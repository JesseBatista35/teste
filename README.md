Prezados,

O deploy da aplicação sisou-api-sac-internet-des (namespace sisou-des, cluster OKD4 NPRD) está falhando porque o init container secrets-agent-sidecar (imagem secrets-agent:v23.3.2) não consegue se autenticar no cofre BeyondTrust.

Evidências:

A requisição POST https://sicsn.caixa/BeyondTrust/api/public/v3/Auth/connect/token retorna HTTP 400 em todas as tentativas, e o agente aborta com too many 400 error responses.
Sem token, nenhum segredo é recuperado e o pod fica em Init:Error (pods -231-kt72h e -232-lpt5v, em 02/10/2026).
A conectividade está OK: o servidor responde, então não se trata de bloqueio de rede ou firewall.
Em 09/09/2026, o pod -227-q4cpp, com a mesma configuração, autenticou normalmente e carregou os 6 segredos. Ele segue em execução.

Solicitação: verificar o API Registration / cliente OAuth utilizado pelo SISOU em DES. Pontos a checar: se o client secret expirou ou foi rotacionado, se o registro está ativo e se há regra de autenticação impedindo o acesso. Caso o secret tenha mudado, favor informar o novo valor pelo canal adequado, para que possamos atualizar a configuração da esteira.
