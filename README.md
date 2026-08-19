Estamos com falha recorrente no push de imagens para o image-registry interno do cluster OKD4 (ambiente nprd), no namespace build-images-ads.

Ocorrências:

Build sipnl-totem-frontend-15 — 19:52:43 UTC (19/08)
Build sipnl-totem-frontend-17 — 20:16:09 UTC (19/08)

Em ambos os casos, o build S2I completa normalmente (assemble, geração e commit da imagem local com sucesso), e a falha ocorre especificamente no push para image-registry.openshift-image-registry.svc:5000/build-images-ads/sipnl-totem-frontend:latest:

error: build error: Failed to push image: writing blob: initiating layer upload to /v2/build-images-ads/sipnl-totem-frontend/blobs/uploads/ in image-registry.openshift-image-registry.svc:5000: received unexpected HTTP status: 500 Internal Server Error

O erro se repete de forma idêntica nas 3 tentativas automáticas de retry, e após a falha final o processo permanece "pendurado" com mensagens repetidas de Unexpected EOF during watch stream event decoding a cada minuto, até estourar o timeout da task (~20 min depois).

Padrão observado: mesma falha, mesmo endpoint, em dois builds distintos com ~24 minutos de intervalo — indica que não é uma falha pontual/transitória, e sim uma degradação sustentada no image-registry do cluster (pod reiniciando, ou problema no backend de storage/PVC).

Como isso é uma questão de saúde do image-registry do cluster e está fora do escopo da esteira, poderiam verificar o status dos pods do image-registry e do storage subjacente no OKD4 nprd?
