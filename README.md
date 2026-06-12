-sh-4.2$ -sh-4.2$ oc describe resourcequota -n sicia-tqs
 * Matches all pods that have at least one resource requirement set. These pods have a burstable or guaranteed quality of service.
Resource       Used    Hard
--------       ----    ----
limits.cpu     3500m   4
limits.memory  3584Mi  8Gi
pods           4       8
-sh-4.2$ oc patch resourcequota -n sicia-tqs -p \
>   '{"spec":{"hard":{"limits.cpu":"10"}}}'  --type merge
error: resource(s) were provided, but no name, label selector, or --all flag specified
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc describe resourcequota -n sicia-tqs
Name:       quota-resources
Namespace:  sicia-tqs
Scopes:     NotBestEffort
 * Matches all pods that have at least one resource requirement set. These pods have a b-sh: -sh-4.2$: comando não encontrado
urstable or guaranteed quality of service.
Resource       Used    Hard
--------       ----    ----
limits.cpu     3500m   4
limits.memory  3584Mi  8Gi
pods           4       8
-sh-4.2$
-sh-4.2$ Name:       quota-resources
-sh-4.2$
-sh-4.2$
-sh: Name:: comando não encontrado
-sh-4.2$ Namespace:  sicia-tqs
-sh: Namespace:: comando não encontrado
-sh-4.2$ Scopes:     NotBestEffort
-sh: Scopes:: comando não encontrado
-sh-4.2$  * Matches all pods that have at least one resource requirement set. These pods have a burstable or guaranteed quality of service.
-sh: Accept:: comando não encontrado
-sh-4.2$ Resource       Used    Hard
-sh: Resource: comando não encontrado
-sh-4.2$ --------       ----    ----
-sh: --------: comando não encontrado
-sh-4.2$ limits.cpu     3500m   4
-sh: limits.cpu: comando não encontrado
-sh-4.2$ limits.memory  3584Mi  8Gi
-sh: limits.memory: comando não encontrado
-sh-4.2$ pods           4       8
-sh: pods: comando não encontrado
-sh-4.2$ -sh-4.2$ oc patch resourcequota -n sicia-tqs -p \
> >   '{"spec":{"hard":{"limits.cpu":"10"}}}'  --type merge
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ error: resource(s) were provided, but no name, label selector, or --all flag specified
-sh: erro de sintaxe próximo do `token' não esperado `('
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$ oc describe resourcequota -n sicia-tqs
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ Name:       quota-resources
-sh: Name:: comando não encontrado
-sh-4.2$ Namespace:  sicia-tqs
-sh: Namespace:: comando não encontrado
-sh-4.2$ Scopes:     NotBestEffort
-sh: Scopes:: comando não encontrado
-sh-4.2$  * Matches all pods that have at least one resource requirement set. These pods have a burstable or guaranteed quality of service.
-sh: Accept:: comando não encontrado
-sh-4.2$ Resource       Used    Hard
-sh: Resource: comando não encontrado
-sh-4.2$ --------       ----    ----
-sh: --------: comando não encontrado
-sh-4.2$ limits.cpu     3500m   4
-sh: limits.cpu: comando não encontrado
-sh-4.2$ limits.memory  3584Mi  8Gi
-sh: limits.memory: comando não encontrado
-sh-4.2$ pods           4       8
-sh: pods: comando não encontrado
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
