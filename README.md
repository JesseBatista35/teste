
sh-4.4$
sh-4.4$ command -v jar javap
sh-4.4$
sh-4.4$
sh-4.4$
sh-4.4$
sh-4.4$ cd /tmp
sh-4.4$ jar tf /deployments/SIJUR-middleware-backend-v2.jar | grep -i -E 'componentes|model/Log.class'
sh: jar: command not found
sh-4.4$
sh-4.4$
sh-4.4$
sh-4.4$
sh-4.4$  jar xf /deployments/SIJUR-middleware-backend-v2.jar BOOT-INF/classes/br/com/sijur/componentes/model/Log.class
sh: jar: command not found
sh-4.4$   javap -v BOOT-INF/classes/br/com/sijur/componentes/model/Log.class | grep -i -E '(javax|jakarta)/persistence/Entity'
sh: javap: command not found
sh-4.4$
sh-4.4$
sh-4.4$  javap -v -cp BOOT-INF/lib/ALGUMA-COISA.jar br.com.sijur.componentes.model.Log | grep -i -E '(javax|jakarta)/persistence/Entity'
sh: javap: command not found
sh-4.4$
sh-4.4$
sh-4.4$
sh-4.4$ oc cp sijur-des/sijur-middleware-backend-v2-des-35-bcrxs-debug:/deployments/SIJUR-middleware-backend-v2.jar ./sijur-v2-35.jar
sh: oc: command not found
sh-4.4$ unzip -l sijur-v2-35.jar | grep -i -E 'componentes|model/Log.class'
sh: unzip: command not found
sh-4.4$
sh-4.4$
sh-4.4$
sh-4.4$
sh-4.4$ oc get rc sijur-middleware-backend-v2-des-31 -n sijur-des -o jsonpath='{.spec.template.spec.containers[0].image}{"\n"}'
sh: oc: command not found
sh-4.4$ oc get rc sijur-middleware-backend-v2-des-35 -n sijur-des -o jsonpath='{.spec.template.spec.containers[0].image}{"\n"}'
sh: oc: command not found
sh-4.4$
sh-4.4$
sh-4.4$
