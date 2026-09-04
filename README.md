NOTA TÉCNICA — W.O. 0000081575607
Sistema: SIMPF-frontend | Ambiente: DES

Problema 1 — Pod indisponível (causa raiz confirmada)

Commit "Removido a pasta web" (a98bdb8) alterou .s2i/bin/assemble:

diff
- mv $DEPLOY_DIR/dist/*/*  $DEPLOY_DIR/.
+ mv $DEPLOY_DIR/dist/*    $DEPLOY_DIR/.

Resultado: artefato passou a ficar em /opt/app-root/src/SIMPF-frontend/main*.js, mas o .s2i/bin/run continua com caminho fixo /opt/app-root/src/main*.js. O sed falha, set -e aborta o container, Nginx não sobe → pod indisponível.

Ajuste necessário (repo SIMPF-frontend):

Reverter o mv no assemble para dist/*/*, ou
Tornar o run dinâmico: find /opt/app-root/src -maxdepth 3 -name "main*.js"
Problema 2 — Gate de QA bloqueando validação da correção

Workflow reutilizável DevSecOps-Qualidade/.../sonar_unico/angular@main ainda espera o projeto Angular em subpasta web/, removida há 3 semanas. Erro:

The build command requires to be run in an Angular project, but a project definition could not be found.

Isso impede o merge/validação de qualquer PR no repositório, incluindo a correção do Problema 1.

Ajuste necessário (repo DevSecOps-Qualidade): atualizar o workflow para localizar o projeto Angular na raiz do repositório (estrutura atual), não mais em web/.

Risco preventivo a verificar

Precedente no SIGRM-frontend: atualização do builder Angular (@angular/build:application) passou a gerar saída em dist/<projeto>/browser/*, exigindo ajuste em assemble e angular.json. Não identificado no SIMPF-frontend até o momento, mas recomenda-se validação preventiva do time de dev caso o Angular CLI seja atualizado futuramente.

Status

Causa raiz identificada; correções pendentes de aplicação pelo time de desenvolvimento (repos SIMPF-frontend e DevSecOps-Qualidade). Validação em DES depende da conclusão de ambos ajustes.
