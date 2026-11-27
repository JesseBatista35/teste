Problema: a build SICAP-webhook (definição 1019) falhava no passo Login Cluster com o erro Proxy Error (Forefront TMG denied the specified URL) ao executar o oc login em api.produtos4.caixa:6443.

Causa: a definição de build tem a variável HTTPS_PROXY=http://proxynuvem.caixa:80, necessária para o acesso ao repositório no GitHub (SICAP-webhook_GITHUB). O Azure DevOps exporta essa variável para o ambiente de todas as tasks, então o oc também passou a mandar a conexão com o cluster interno pelo proxy, que a recusava. Não havia exceção (NO_PROXY) para os domínios internos. Testado no agente cadsvaprlx373: o acesso direto à API do cluster funciona normalmente.

Correção: incluída nas variáveis da build a variável NO_PROXY com .caixa,.caixa.gov.br,localhost,127.0.0.1. O tráfego externo (GitHub) continua saindo pelo proxy, e o tráfego interno (cluster OKD, Nexus, Sonar) passa a ir direto. A build foi executada novamente com sucesso.
