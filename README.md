Prezado(a),

Informo que a aplicação silce-backend-valida-assinatura foi implantada com sucesso nos ambientes DES e TQS via ArgoCD, porém o pod está apresentando status Degraded devido a falhas recorrentes nos probes de liveness e readiness.

Ao analisar os logs da aplicação, verifiquei que ela inicializa corretamente e fica ativa na porta 8080, entretanto os probes configurados retornam HTTP 404 ao consultar os endpoints de health check padrão do Quarkus (/q/health/live e /q/health/ready). Isso está causando reinicializações contínuas do container (CrashLoopBackOff), mesmo com a aplicação funcionando normalmente por dentro.

Ao inspecionar as features instaladas no log de subida da aplicação, não identifiquei a presença da extensão smallrye-health, o que indica que os endpoints de health check padrão não estão habilitados no build atual.

Dessa forma, solicito a gentileza de confirmar:

1. Se a aplicação expõe algum endpoint de health check próprio (e, em caso positivo, qual o path e a porta correta a serem utilizados nos probes de liveness e readiness);

2. Ou, caso contrário, se é possível incluir a dependência quarkus-smallrye-health no projeto para habilitar os endpoints padrão (/q/health/live e /q/health/ready).

Essa informação é necessária para o ajuste correto dos probes no values.yaml do repositório GitOps, permitindo a estabilização do deploy nos ambientes não produtivos.

Fico à disposição para maiores esclarecimentos.

Atenciosamente,
Jessé Batista
CTIS/CESTI - DES/TQS NPRD
