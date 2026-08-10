Prezados,

O pipeline do sistema SIMSC-Android-Nativo está falhando na etapa "Android - Firebase Distribution App" tanto em TQS quanto em HMP, com o erro:

`Error: failed to upload distribution. HTTP Error: 500, Unknown Error`

Todas as etapas anteriores do pipeline (build, assinatura, SonarQube, Nexus) completam normalmente — a falha é só no upload pro Firebase, em mais de um ambiente. Solicito verificação do lado da conta/serviço do Firebase (token, quota, status do serviço).

Atenciosamente,
Jessé Batista, CTIS/CESTI — Esteira DevOps DES TQS NPRD
