Pessoal, bom dia/tarde.

Passando um aviso sobre o namespace simil-des (OKD4 NPRD): a ResourceQuota do namespace (quota-resources) está praticamente saturada em CPU (limits.cpu no limite de 8/8 em vários momentos hoje).

Isso já causou falha de rollout em pelo menos 2 releases hoje (simil-precificacao-frontend-des-75 e simil-precificacao-api-des-128), com o pod novo travando em "exceeded quota" e o pipeline estourando timeout.

Se vocês forem fazer release de qualquer app do namespace simil-des nos próximos dias, fiquem atentos:

Se o deploy travar em "Waiting for rollout to finish" por muito tempo, verifiquem os events do namespace (oc get events -n simil-des) antes de reabrir o pipeline — provavelmente é a mesma quota.
Se pegarem erro "exceeded quota: quota-resources" no describe do pod/RC, é o mesmo problema.
Contorno temporário: escalar pra 0 a réplica da versão anterior do próprio app que está subindo, pra liberar CPU (oc scale rc <nome-rc-antiga> --replicas=0 -n simil-des) — só fazer isso com atenção, pois gera breve indisponibilidade do app.

Já abri chamado/nota formal pra infra solicitando aumento da quota. Assim que tiver retorno, aviso por aqui.
