Resumo do incidente:

O componente sipcs-digital-pay-provisionamento-visa-des, no ambiente DES (OpenShift/OKD4), apresentava falha recorrente de rollout, com os pods entrando em CrashLoopBackOff e o deployment expirando por timeout durante a validação de status.

Causa raiz identificada:

Após análise dos logs da aplicação e testes diretos nos endpoints de health check dentro do pod, foi identificado que os probes de liveness e readiness configurados no DeploymentConfig apontavam para o caminho incorreto, incluindo o root-path da aplicação (/cartoes/cartao-credito/digital-pay/provisionamento/visa/health/live e /health/ready). O endpoint de health do Quarkus, por padrão, é exposto de forma isolada sob o caminho non-application-root-path (/q), independente do root-path configurado para os endpoints de negócio da API. Dessa forma, as probes retornavam 404 Not Found continuamente, impedindo que o pod atingisse o estado Ready e provocando reinícios sucessivos por falha de liveness.

Correção aplicada:

Os caminhos das probes foram corrigidos para /q/health/live e /q/health/ready, compatibilizando a configuração do DeploymentConfig com o comportamento padrão do Quarkus SmallRye Health. Após a correção, o rollout foi concluído com sucesso e o pod atingiu o estado Running de forma estável.

Validação:

Foi executada nova release da esteira de build/deploy, com o rollout finalizado com sucesso e o componente operando normalmente no ambiente DES.

Observação:

Recomenda-se validar se a configuração dos probes está versionada corretamente no manifesto/values de deploy do componente, a fim de evitar reincidência em builds futuras.
