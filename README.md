rezados, boa tarde.

Referente a WO0000081161786 (sipge-frontend-intranet), gostaria de alinhar um ponto importante antes de seguirmos com a analise de permissao no ArgoCD.

O erro {"error":"permission denied","code":7} que esta sendo investigado e um sintoma, nao a causa raiz do problema.

Conforme ja registrado na WO em 27/07 e 24/07, foi identificado que o cluster desta aplicacao no Microsoft Azure ainda nao existe. Sem o cluster provisionado, ele nunca foi registrado como destination no ArgoCD, e consequentemente o Application sipge-frontend-intranet-des e o respectivo AppProject com as permissoes RBAC tambem nunca foram criados.

Ou seja, a chamada da pipeline esta tentando consultar um Application que provavelmente nem existe no ArgoCD, por isso o retorno de permission denied. Ajustar token, credencial ou RBAC neste momento nao vai resolver, porque a causa raiz esta uma etapa antes: a inexistencia do cluster.

Temos entao duas pendencias sequenciais e dependentes entre si:
1. Criacao do cluster AKS para a aplicacao (pendente desde 27/07, aguardando definicao de qual equipe fica responsavel)
2. Registro do cluster como destination no ArgoCD e criacao do Application/AppProject com as permissoes corretas (so pode ser feito apos o item 1)

Solicito apoio para definirmos a equipe responsavel pela criacao do cluster, para que possamos destravar o item 1 e, na sequencia, tratar o item 2 como causa raiz real do erro relatado.
