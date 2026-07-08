Prezados,
Em análise ao problema de deployment do sistema SINCH-web-angular20-intra no ambiente DES, identificamos que o rollout do pod não concluia com sucesso, permanecendo indefinidamente em estado not ready até estourar o timeout configurado na pipeline. A investigação dos logs de aplicação apontou a causa raiz: o script de runtime do container (arquivo run) executa um sed para injetar variáveis de ambiente no arquivo main.js da aplicação Angular, buscando esse arquivo no caminho /opt/app-root/src/main.js. Porém o arquivo não era encontrado nesse local, resultando em falha silenciosa na injeção das variáveis e consequente falha no carregamento correto da aplicação pelo nginx.
A origem do problema está na estrutura de build do Angular, que a partir do builder atualmente configurado no angular.json (application) passou a gerar a saída dentro de uma subpasta adicional chamada browser, diferente da estrutura anterior onde os arquivos ficavam na raiz do diretório de saída. O script de empacotamento do S2I, arquivo assemble, não estava preparado para essa mudança de estrutura, pois copiava o conteúdo direto de dist para o diretório de deploy, sem considerar a subpasta browser.
Para validação, foi criada a branch de teste cesti-test001 a partir da tag 2.1.0.7, com o seguinte ajuste no arquivo assemble:
De:
mv $DEPLOY_DIR/dist/* $DEPLOY_DIR/.
Para:
mv $DEPLOY_DIR/dist/browser/* $DEPLOY_DIR/.
O teste realizado nessa branch confirmou que o ajuste resolve o problema, com o pod subindo corretamente e o rollout concluindo sem timeout.
A alteração foi validada apenas na branch de teste cesti-test001. Solicitamos que o time de desenvolvimento valide o ajuste e aplique a mesma correção na branch principal do repositório, garantindo que builds futuros a partir da branch oficial já contemplem essa correção.
Atenciosamente,
Jessé Mouta Pereira Batista
CTIS/CESTI
