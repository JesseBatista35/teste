command -v jar javap


cd /tmp
jar tf /deployments/SIJUR-middleware-backend-v2.jar | grep -i -E 'componentes|model/Log.class'

  jar xf /deployments/SIJUR-middleware-backend-v2.jar BOOT-INF/classes/br/com/sijur/componentes/model/Log.class
  javap -v BOOT-INF/classes/br/com/sijur/componentes/model/Log.class | grep -i -E '(javax|jakarta)/persistence/Entity'

    jar xf /deployments/SIJUR-middleware-backend-v2.jar BOOT-INF/lib/ALGUMA-COISA.jar
  javap -v -cp BOOT-INF/lib/ALGUMA-COISA.jar br.com.sijur.componentes.model.Log | grep -i -E '(javax|jakarta)/persistence/Entity'

  oc cp sijur-des/sijur-middleware-backend-v2-des-35-bcrxs-debug:/deployments/SIJUR-middleware-backend-v2.jar ./sijur-v2-35.jar
unzip -l sijur-v2-35.jar | grep -i -E 'componentes|model/Log.class'

oc get rc sijur-middleware-backend-v2-des-31 -n sijur-des -o jsonpath='{.spec.template.spec.containers[0].image}{"\n"}'
oc get rc sijur-middleware-backend-v2-des-35 -n sijur-des -o jsonpath='{.spec.template.spec.containers[0].image}{"\n"}'
