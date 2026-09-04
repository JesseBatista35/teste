W.O. 0000081575607 — Nota de Encerramento

Sistema: SIMPF-frontend
Ambiente: DES (OpenShift/OKD4)
Sintoma relatado: Pod simpf-frontend-des indisponível — erro sed: can't read /opt/app-root/src/main*.js: No such file or directory no runtime, causando falha na inicialização do Nginx e indisponibilidade da aplicação.

Causa raiz identificada:
Regressão introduzida pelo commit "Removido a pasta web" (a98bdb8), que alterou o script .s2i/bin/assemble:

diff
-    mv $DEPLOY_DIR/dist/*/*  $DEPLOY_DIR/.
+    mv $DEPLOY_DIR/dist/*  $DEPLOY_DIR/.

Antes, o comando movia o conteúdo da subpasta gerada pelo build (dist/SIMPF-frontend/*) diretamente para /opt/app-root/src, deixando main*.js na raiz esperada pelo runtime. Após a alteração, é movida a subpasta inteira, deixando o artefato em /opt/app-root/src/SIMPF-frontend/main*.js — um nível de diretório a mais do que o .s2i/bin/run espera:

bash
sed -i "s#__SIMPF_API_URI__#$SIMPF_API_URI#g" /opt/app-root/src/main*.js

Como o run usa set -e, a falha do sed aborta o container antes do exec nginx, resultando no pod indisponível.

Precedente: mesmo padrão de problema já identificado e corrigido no repositório SIGRM-frontend (mudança de estrutura de output do Angular builder), onde a correção envolveu ajuste equivalente em assemble e angular.json.

Correção proposta (aplicada/solicitada ao time responsável pelo repositório SIMPF-frontend):

Reverter o mv no .s2i/bin/assemble para dist/*/*, restaurando o alinhamento com o .s2i/bin/run;
Tornar o .s2i/bin/run resiliente a futuras mudanças de estrutura de output, substituindo o caminho fixo por busca dinâmica:
bash
   MAIN_JS=$(find /opt/app-root/src -maxdepth 3 -name "main*.js" | head -n1)
Validar o outputPath do angular.json quanto à compatibilidade com a versão do Angular builder em uso, evitando recorrência em futuras atualizações do Angular CLI.

Ação realizada nesta W.O.: diagnóstico da causa raiz via análise de logs de build/runtime e comparação de configuração de pipeline (Azure DevOps) e histórico de commits (GitHub). Ajuste solicitado ao time mantenedor do repositório SIMPF-frontend (fora do escopo de acesso da esteira DevOps/DES — ajuste de código-fonte da aplicação).

Status: Encerrada — causa raiz identificada e correção repassada ao time de desenvolvimento responsável pelo repositório.
