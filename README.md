Prezados,

O pipeline do sistema SIMSC-Android-Nativo está falhando na etapa "Android - Firebase Distribution App" tanto em TQS quanto em HMP, com o erro:

Error: failed to upload distribution. HTTP Error: 500, Unknown Error

O mesmo erro está se repetindo de forma consistente também em outras aplicações, na mesma etapa "TQS - Firebase", no mesmo pool de agentes (Mobilidade-Linux-Proxy). Seguem exemplos concretos observados no histórico de execuções de hoje:

- SIAME-Android-Nativo 5.12.0, ID 512762 — falhas às 15:19, 15:15, 15:13, 15:07 e 15:06 (jobs 1636685, 1636662, 1636655, 1636618, 1636616, entre outros)
- SIMSC-Android-Nativo 7.1.2, ID 512900 — falha às 14:59 (job 1636581)

Todas essas execuções falham no mesmo ponto, com o mesmo erro genérico, confirmando que não é problema pontual de um app específico, e sim do ambiente do agente.

Agente: cadsvaprlx015.intra.caixa.gov.br (pool Mobilidade-Linux-Proxy)
Usuário de execução: sadscp01

O que já foi descartado:
- Rede/proxy: testado com curl via proxyprd.caixa, conexão TLS completa até firebase.googleapis.com sem erro.
- Token/autenticação: rodando a task com --debug, as 3 chamadas de autenticação e consulta ao app antes do upload retornam HTTP 200 normalmente.
- Integridade do artefato: o APK gerado (59MB, bem dentro do limite de 2048 MiB da documentação oficial) foi validado com unzip -t (sem erros) e contém AndroidManifest.xml e classes.dex íntegros.
- App ID: confirmado que o App ID configurado no APK (extraído do resources.arsc) é idêntico ao usado na task (1:978309264263:android:fb2ea54ff4fdfdc1b95922).

Causa raiz identificada (via --debug): o ambiente roda Node.js v10.14.0, de 2018 e sem suporte, com firebase-tools 9.6.1, de 2021 — o próprio CLI acusa estar 6 versões major desatualizado (versão atual: 15.26.0). No log de debug, na requisição de upload do binário (POST /app-binary-uploads), o corpo enviado não é o conteúdo do arquivo, e sim a serialização do objeto interno de stream do Node (campos como _readableState, fd, flags). O servidor do Firebase aguarda cerca de 10 segundos por um upload válido, não recebe, e retorna HTTP 500 vazio — exatamente o erro genérico relatado. Isso é uma incompatibilidade conhecida de versões antigas do Node/firebase-tools com a forma atual como a API do Firebase espera o streaming do binário.

Vale registrar que a documentação oficial do Firebase (https://firebase.google.com/docs/app-distribution/troubleshooting) orienta que, em caso de erros 400, 409 ou 500 recorrentes durante o provisionamento, o contato com o suporte do Firebase deve ser feito informando o número do projeto (978309264263) e o identificador do app. Ou seja, mesmo o fabricante trata esse erro genérico como algo que pode exigir escalonamento direto com eles caso a atualização do ambiente não resolva.

Solicito que a equipe responsável pela infraestrutura do pool de agentes Mobilidade-Linux-Proxy atualize o Node.js padrão (nvm default, hoje travado em v10.14.0) para uma versão LTS suportada, como 18 ou 20, e reinstale o firebase-tools na versão atual (15.x), replicando a correção em todos os agentes do pool, já que o problema é generalizado e não pontual. Caso a atualização não resolva, o próximo passo recomendado pela própria documentação do Firebase é abrir chamado direto com o suporte deles.

Fico à disposição para repassar o log completo de --debug ou repetir validações, caso necessário.

Atenciosamente,
Jessé Batista, CTIS/CESTI — Esteira DevOps DES TQS NPRD


