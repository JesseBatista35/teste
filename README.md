Identificamos que o problema dos restarts/502-503 não era de rede ou proxy — era falta de memória na aplicação (OOMKilled). O pod estava configurado com limite de 1Gi de memória, mas o consumo já ficava em torno de 970Mi mesmo em repouso, praticamente no teto. Qualquer variação (uma chamada, um health check) era suficiente para estourar o limite e o Kubernetes matar o processo, causando os restarts constantes e os erros 502/503 que vocês viam.

Como ação imediata, aumentamos o limite de memória do pod de 1Gi para 2Gi e fizemos um novo deploy. Com isso, o consumo atual ficou em 783Mi de 2Gi — bem mais estável.

Poderiam testar novamente, por gentileza? Agora o pod deve suportar a chamada sem reiniciar.

Vamos continuar acompanhando para confirmar se o aumento de memória resolve de vez, ou se ainda existe algo consumindo memória de forma anormal (o que investigaríamos como um ajuste de código a médio prazo).
