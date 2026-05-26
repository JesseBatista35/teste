

5. Identificação da causa raiz final: a variável SISTEMA_NOME no pipeline de release estava com valor incorreto, fazendo o deploy sobrescrever o arquivo de configuração do Apache sem preservar os BalancerMember.

CAUSA RAIZ
Variável SISTEMA_NOME com valor incorreto no pipeline de release do SIGPF-internet-backend, causando sobrescrita indevida do arquivo de configuração do Apache ModCluster e remoção dos BalancerMember nos ambientes DES, TQS e HMP.

SOLUÇÃO APLICADA
Corrigida a variável SISTEMA_NOME no pipeline de release. Após o ajuste, novo deploy foi executado com sucesso e a aplicação voltou a responder corretamente nos três ambientes.

RECOMENDAÇÕES
1. Revisar o pipeline para garantir que futuros deploys não sobrescrevam configurações críticas do Apache sem validação.
2. Corrigir as variáveis SIGPF_URL_API e SIGPF_URL_STATIC da library SIGPF-internet-hmp de HTTP para HTTPS.
3. Incluir validação automática da rota após cada deploy nos três ambientes.

Atendimento encerrado com ambiente normalizado e aplicação disponível para os parceiros externos (Caixa Seguridade, Caixa Vida e Previdência, Caixa Consórcios e Caixa Capitalização).

