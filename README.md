
-sh-4.2$ oc rollout cancel dc/sipgc-api-informacoes-tqs -n sipgc-tqs
sNo rollout is in progress (latest rollout #61 complete about a minute ago)
-sh-4.2$ sllep 40
-sh: sllep: comando não encontrado
-sh-4.2$ oc rollout cancel dc/sipgc-api-informacoes-tqs -n sipgc-tqs
No rollout is in progress (latest rollout #61 complete about a minute ago)
-sh-4.2$ oc rollout delete dc/sipgc-api-informacoes-tqs -n sipgc-tqs
error: unknown command "delete dc/sipgc-api-informacoes-tqs"
See 'oc rollout -h' for help and examples.
-sh-4.2$ oc rollout delete dc/sipgc-api-informacoes-tqs -n sipgc-tqs
error: unknown command "delete dc/sipgc-api-informacoes-tqs"
See 'oc rollout -h' for help and examples.
-sh-4.2$
