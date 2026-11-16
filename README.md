Próximos passos (no oc)

a) De qual secret o pod lê a credencial do cofre:

oc get pod -n siepr-des siepr-backend-des-244-t982x -o jsonpath='{range .spec.initContainers[0].env[*]}{.name}{" -> "}{.valueFrom.secretKeyRef.name}{"/"}{.valueFrom.secretKeyRef.key}{"\n"}{end}'

b) O mesmo no backend da intranet, que está rodando:

oc get pod -n siepr-des siepr-backend-intranet-des-142-xfmps -o jsonpath='{range .spec.initContainers[0].env[*]}{.name}{" -> "}{.valueFrom.secretKeyRef.name}{"/"}{.valueFrom.secretKeyRef.key}{"\n"}{end}'

O backend da intranet está de pé há 4 dias, ou seja, subiu antes do problema. Se ele usa o mesmo secret, a credencial provavelmente mudou depois disso, e ele também vai cair se reiniciar. Se usa outro secret, o problema está só na credencial do backend internet.

Me mande as duas saídas e a Request URL do hora. Com isso a gente define se o caminho é corrigir a credencial no secret ou acionar o time do cofre, e já incluímos o ajuste do CORS.
