Felipe, o sicql-mapsfeeder subiu em TQS. Pod 1/1 Running, sem restarts, aplicação respondendo em /feeder.

O que foi necessário para subir:
1. Senha do banco: a release gera o Secret sicql-mapsfeeder-tqs vazio, então a DATABASE_PASSWORD não chegava ao pod. Preenchi o Secret manualmente com a senha que já funciona no enquadramento (mesmo usuário scqlbt01) e vinculei ao DC.
2. Memória: o limite era 1Gi e o container tomava OOMKilled. Subi para 2Gi.
3. Probes: liveness e readiness apontavam para /actuator/health, que não existe nesse WAR (a aplicação responde em /feeder), e o pod era reiniciado. Troquei para TCP na 8080 (readiness com 90s, liveness com 180s, porque o startup leva uns 80s).
4. Na primeira subida o Liquibase criou as tabelas do schema odin, que estava vazio. Agora o Odin inicia normal e agendou os 34 arquivos.

Atenção: os itens 1, 2 e 3 foram ajustes manuais no OpenShift. A próxima release vai desfazer tudo e o pod volta a cair. Para ficar definitivo, precisamos:
1. Descobrir por que a _SECRET.DATABASE_PASSWORD da Library chega vazia no Secret (no enquadramento a variável PASSWORD está sem cadeado, no feeder está com cadeado; pode ser isso).
2. Colocar o limite de 2Gi na release.
3. Ajustar as probes na release para TCP 8080 ou para um caminho que exista em /feeder.

Outros pontos:
- Quando os agendamentos rodarem, os downloads (BACEN, ANBIMA, B3) podem esbarrar em proxy ou firewall de saída. Vale acompanhar o primeiro ciclo.
- As Libraries de DES, HMP e PRD do feeder continuam vazias.
- O DC antigo sicql-maps-feeder-tqs e os objetos dele foram removidos.

Qualquer coisa, me chama.
