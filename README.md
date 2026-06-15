Próximas Steps Obrigatórias:
1️⃣ Verificar os logs do pod
bashoc logs pod/siinp-nucleo-tqs-513-7hgs9
Ou veja os últimos logs:
bashoc logs pod/siinp-nucleo-tqs-513-7hgs9 --tail=100
2️⃣ Descrever o pod para ver status/eventos
bashoc describe pod/siinp-nucleo-tqs-513-7hgs9
Procure por:

Erros de health check (readiness/liveness)
Mensagens de erro na seção "Events"
Status dos containers

3️⃣ Verificar se há outro pod rodando melhor
bashoc get pods -l name=siinp-nucleo-tqs
Vejo que você tem múltiplos pods. Tente com outro:
bashoc logs pod/siinp-nucleo-tqs-513-58zt9

⚠️ NÃO rode o patch da rota ainda!
Primeiro precisamos entender por que a aplicação não está respondendo. O problema de /api é secundário. A aplicação não está healthy.
Manda aí os logs do pod que a gente descobre o que está errado! 🔍
