Assunto: Runners ARC arc-runner-set-default-aws-nprod sem instâncias — jobs de BUILD enfileirados desde 22/09

Desde 22/09/2026, os jobs de BUILD dos repositórios que usam o workflow caixagithub/DevSecOps-Solutions/.github/workflows/generic-s3-pipelines.yaml@main ficam indefinidamente em "Queued" ("Waiting for a runner to pick up this job...").

Label solicitada pelo job: arc-runner-set-default-aws-nprod
Na lista de runners da organização, o scale set arc-runner-set-default-aws-nprod está registrado, mas sem nenhuma instância de runner. O mesmo ocorre com imgcustom-v1-aws-nprod, default-aws-prod e imgcustom-v1-aws-prod. Os scale sets de Azure, GCP e on-premises estão com runners ativos.
Exemplo: sisfm-mfe-cardmovimentacaofinanceira, run #20 (35866856805), enfileirado há mais de 1h45. Os runs #17 e #18 de 22/09 ficaram presos por 7h58m e 3h30m. O último build com sucesso foi em 02/09.

Solicito verificar, no cluster da AWS, o listener e o controller do ARC para esse scale set: logs do pod listener, EphemeralRunners criados ou pendentes, capacidade de nós e pull de imagem do ECR.
