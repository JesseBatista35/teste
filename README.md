Prezados,

O pipeline do sistema SIMSC-Android-Nativo está falhando na etapa "Android - Firebase Distribution App" tanto em TQS quanto em HMP, com o erro:

Error: failed to upload distribution. HTTP Error: 500, Unknown Error

O mesmo erro se repete de forma consistente também no sistema SIAME-Android-Nativo, na mesma etapa, ao longo do dia — confirmando que não é problema pontual de um app específico.

Agente: cadsvaprlx015.intra.caixa.gov.br (pool Mobilidade-Linux-Proxy)
Usuário de execução: sadscp01

O que já foi descartado:

Rede/proxy: testado com curl via proxyprd.caixa, conexão TLS completa até firebase.googleapis.com sem erro.
Token/autenticação: rodando a task com --debug, as 3 chamadas de autenticação e consulta ao app antes do upload retornam HTTP 200 normalmente.
Integridade do artefato: o APK gerado (59MB) foi validado com unzip -t (sem erros) e contém AndroidManifest.xml e classes.dex íntegros.

Causa raiz identificada (via --debug): o ambiente roda Node.js v10.14.0, de 2018 e sem suporte, com firebase-tools 9.6.1, de 2021 — o próprio CLI acusa estar 6 versões major desatualizado (versão atual: 15.26.0). No log de debug, na requisição de upload do binário (POST /app-binary-uploads), o corpo enviado não é o conteúdo do arquivo, e sim a serialização do objeto interno de stream do Node (campos como _readableState, fd, flags). O servidor do Firebase aguarda cerca de 10 segundos por um upload válido, não recebe, e retorna HTTP 500 vazio — exatamente o erro genérico relatado. Isso é uma incompatibilidade conhecida de versões antigas do Node/firebase-tools com a forma atual como a API do Firebase espera o streaming do binário.

Solicito que a equipe responsável pela infraestrutura do pool de agentes Mobilidade-Linux-Proxy atualize o Node.js padrão (nvm default, hoje travado em v10.14.0) para uma versão LTS suportada, como 18 ou 20, e reinstale o firebase-tools na versão atual (15.x), replicando a correção em todos os agentes do pool, já que o problema é generalizado e não pontual.

Fico à disposição para repassar o log completo de --debug ou repetir validações, caso necessário.

Atenciosamente,
Jessé Batista, CTIS/CESTI — Esteira DevOps DES TQS NPRD
