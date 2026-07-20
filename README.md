Prezados,
Identificado erro de conexão durante upload binário do BuildConfig sifap-front-v2, no namespace build-images-ads (cluster OKD4 - api.produtos4.caixa:6443), com a seguinte mensagem:
Connection error: Post .../buildconfigs/sifap-front-v2/instantiatebinary: unexpected EOF
Unable to connect to the server: unexpected EOF
O erro é conhecido e decorre de build travada no cluster, conforme procedimento padrão documentado. Foi realizado o cancelamento da build pendente associada ao BuildConfig através do comando "oc cancel-build bc/sifap-front-v2", seguido de nova execução da pipeline, que foi concluída com sucesso.
Não foi necessária intervenção da equipe de infraestrutura, uma vez que o problema foi resolvido através do procedimento operacional padrão para esse tipo de ocorrência.
Encerro o chamado como resolvido.
