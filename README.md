Prezados,
Solicito apoio da equipe de infraestrutura para investigação de falha de conexão ocorrida durante a execução de build S2I binário no cluster OKD4 (endpoint api.produtos4.caixa:6443), namespace build-images-ads, BuildConfig sifap-front-v2.
Descrição do problema:
Na execução de 20/07/2026, às 09:08:22, o comando "oc start-build" foi iniciado normalmente e o upload do diretório binário teve início. Após aproximadamente 2 minutos de transferência, a conexão foi interrompida com o seguinte erro:
Connection error: Post https://api.produtos4.caixa:6443/apis/build.openshift.io/v1/namespaces/build-images-ads/buildconfigs/sifap-front-v2/instantiatebinary: unexpected EOF
Unable to connect to the server: unexpected EOF
O build não chegou a ser criado no cluster, uma vez que a falha ocorreu durante a fase de upload, antes da instanciação do objeto Build. Uma segunda tentativa automática (retry da pipeline) apresentou o mesmo comportamento, com a conexão caindo novamente durante o upload.
Comparativo com execução bem-sucedida:
Em execução anterior do mesmo BuildConfig, realizada em 17/07/2026 às 20:24:26, o upload do mesmo tipo de payload foi concluído em poucos segundos, sem intercorrências, e o build sifap-front-v2-245 foi criado e executado normalmente.
Verificações já realizadas por nossa equipe (fora do escopo de atuação DES/TQS):

Confirmado que não há builds órfãos ou pendentes associados ao BuildConfig sifap-front-v2 no namespace build-images-ads
Confirmado que o BuildConfig sifap-front-v2 não estava presente no momento da verificação, sugerindo que o objeto não chegou a ser criado devido à falha ocorrida na fase de upload
Nossa equipe não possui acesso de autenticação ao cluster api.produtos4.caixa:6443 para verificação adicional (retorno "Unauthorized")

Solicitação:
Solicitamos verificação da saúde do kube-apiserver e da rota/load balancer do cluster no intervalo entre 09:08 e 09:10 de 20/07/2026, incluindo eventual instabilidade, reinicialização de componentes do control plane ou timeout de conexões longas em proxy/gateway intermediário. Solicitamos também confirmação sobre eventual diferença entre os endpoints api.produtos4.caixa:6443 e api.nprd.caixa:6443, caso relevante para o diagnóstico.
Ficamos à disposição para fornecer logs completos da pipeline, caso necessário.
