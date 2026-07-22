Prezados, bom dia/tarde.

Durante a sincronização via ArgoCD da aplicação sisva-frontend-transacional (ambiente DES, cluster aks-aixa-des), a sincronização está falhando com timeout no controller, apresentando o seguinte erro:

"one or more objects failed to apply, reason: namespaces \"aks-istio-ingress\" not found"

Verificamos diretamente no portal Azure a lista de namespaces do cluster aks-aixa-des e confirmamos que o namespace aks-istio-ingress não existe entre os namespaces ativos, o que indica que o add-on de Istio Service Mesh não está habilitado nesse cluster.

Além disso, identificamos que a Application do ArgoCD referencia uma segunda fonte de valores compartilhada (sourcevar), no repositório sisva-globalnprd, path des, arquivo global.yaml. Não temos acesso a esse repositório para verificar se a referência ao namespace aks-istio-ingress está definida nessa configuração global.

Solicito:
1) Verificação quanto à criação/habilitação do namespace aks-istio-ingress (ou do add-on de Istio) no cluster aks-aixa-des; e
2) Apoio de alguém com acesso ao repositório sisva-globalnprd para confirmar se há referência a esse namespace no arquivo global.yaml (path des), de forma a identificar se o ajuste necessário é de infraestrutura ou de configuração compartilhada.

O deployment da aplicação em si está saudável (pod Running, 1/1), o problema está restrito à sincronização de recursos relacionados ao Istio Ingress.

Fico à disposição para mais informações ou logs adicionais, caso necessário.

Atenciosamente.
