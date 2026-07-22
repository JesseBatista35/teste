Prezados,

Identificamos que o namespace simil-des, no cluster OKD4 NPRD, está com a ResourceQuota "quota-resources" praticamente saturada em CPU (limits.cpu: 7/8 a 7.5/8, conforme momento), o que está impedindo a conclusão de rollouts de novas releases. Especificamente, a release 9 da aplicação simil-api-des falhou repetidamente ao criar o pod, com o erro "exceeded quota: quota-resources, requested: limits.cpu=1, used: limits.cpu=7500m, limited: limits.cpu=8", resultando em timeout no pipeline de deploy e reversão automática do rollout pelo DeploymentConfig.

O namespace hospeda atualmente 7 sistemas em execução simultânea (simil-api-des, simil-precificacao-api-des, simil-precificacao-frontend-des, simil-precificacao-internet-api-des, simil-precificacao-internet-frontend-des, simil-precificacao-intranet-api-des, simil-precificacao-queue-des), vários com container exporter adicional, o que eleva o consumo agregado de CPU e reduz a margem disponível para rolling updates.

Solicitamos avaliação e ampliação do limite de limits.cpu na ResourceQuota "quota-resources" do namespace simil-des, de forma a comportar com folga os rollouts futuros sem impacto às aplicações já em execução.
