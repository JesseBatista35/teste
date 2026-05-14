
Rode estes 2 comandos agora

Primeiro o log do container principal:

oc logs sitop-frontend-des-5-mzzkd -c sitop-frontend-des --previous --tail=200

Depois o log do exporter:

oc logs sitop-frontend-des-5-mzzkd -c sitop-frontend-des-exporter --previous --tail=200

Não coloque -it no comando de logs. -it é só para exec.

Para tentar entrar no container principal
oc exec -it sitop-frontend-des-5-mzzkd -c sitop-frontend-des -- sh

Se entrar, rode um comando por linha:

pwd
ls -la /
find / -name "*.js" 2>/dev/null | head -100
find / -name "main*.js" 2>/dev/null | head -50

Você estava digitando:

find / -name ".js"

Mas o correto é:

find / -name "*.js"
Atenção ao projeto

No login apareceu:

Utilizando o projeto "sitep-des".

Então por enquanto use os comandos sem -n, como você fez agora, porque já está no projeto certo.

Para confirmar:

oc project
Segurança

Você colou um token de acesso no chat. Depois que resolver, gere outro token/login novo ou faça logout:

oc logout

Agora manda o resultado deste comando aqui:

oc logs sitop-frontend-des-5-mzzkd -c sitop-frontend-des --previous --tail=200
