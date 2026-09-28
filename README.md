Se o erro persistir, peço ao time de Mainframe a verificação de: CEMT I URIMAP(D01UMTQS) (USAGE, PIPELINE, WEBSERVICE, PROGRAM, TRANSACTION); CEMT I WEBS(lancamentoV4) (URIMAP associado e STATE); a definição da N1W1 (DFHPIDSH como primeiro programa nos AORs, routable/dynamic no TOR); e se o D01POSOL está instalado somente nos AORs, já que o ASRA foi registrado no CICQTWB3, que é TOR.

eu nao mandie essa parte aqui acima 


oc rollout latest dc/sid01-lancamentos-financeiros-okd4-tqs -n sid01-tqs

oc get pods -n sid01-tqs

oc set env dc/sid01-lancamentos-financeiros-okd4-tqs --list -n sid01-tqs | grep CICSWEB

oc logs -f <nome-do-pod-52> -n sid01-tqs
