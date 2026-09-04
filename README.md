Pessoal, identificamos a causa exata do problema no simpf-frontend-des (WO0000081575607).

O .s2i/bin/run já foi corrigido (PR #162) e resolveu o erro de sed. Mas surgiu um novo sintoma: 403 - directory index forbidden, fazendo as probes de readiness/liveness falharem em loop até dar timeout no deploy.

Causa: o .s2i/bin/assemble está movendo a pasta inteira do build para dentro do container, em vez do conteúdo dela:

diff
- mv $DEPLOY_DIR/dist/*    $DEPLOY_DIR/.
+ mv $DEPLOY_DIR/dist/*/*  $DEPLOY_DIR/.

Com isso, o index.html fica em /opt/app-root/src/SIMPF-frontend/index.html em vez de /opt/app-root/src/index.html, que é onde o Nginx (document root da imagem) espera encontrá-lo. Por isso ele não acha nada pra servir e retorna 403.

Podem aplicar esse ajuste no .s2i/bin/assemble (reverter para dist/*/*)? É a última peça que falta pra fechar essa W.O. — o restante já está validado.
