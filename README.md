Execute isto para desabilitar as probes (assim o container fica rodando):
bashoc set probe dc/sicbc-backend-des -n sicbc-des --liveness --initial-delay-seconds=0 --remove
oc set probe dc/sicbc-backend-des -n sicbc-des --readiness --initial-delay-seconds=0 --remove
Depois:
bashoc rollout latest dc/sicbc-backend-des -n sicbc-des
Aguarda 10 segundos e manda:
bashoc get pods -n sicbc-des
Compartilha o resultado.
