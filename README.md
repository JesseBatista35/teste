1️⃣ Teste novamente via Postman
Tente agora em:
POST https://integra.iniciadora.caixa.gov.br/inic-pagto/nucleo/v1/jornada
SEM /api (como os logs mostram que funciona)
2️⃣ Se ainda receber 405 Not Allowed:
É um problema de rota/nginx, não da aplicação. Nesse caso:
bash# Verifique a rota com mais detalhes
oc get route integra.iniciadora -o yaml

# Veja qual é o targetPort exato
oc get svc siinp-nucleo-tqs -o yaml | grep -A 5 "ports:"
3️⃣ Verifique em qual endpoint o Postman conseguiu sucesso
Mande aí o print mostrando que URL funcionou para correlacionarmos com os logs.

A aplicação está healthy e respondendo. O problema é provavelmente na rota OKD ou configuração do nginx. Vamos diagnosticar daí! 🔍
