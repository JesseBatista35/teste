Se preferir rodar um por um pra não travar tudo de uma vez (já que o curl direto travou 5min na pipeline):

bash
env | grep -i proxy

primeiro — isso é rápido e já diz muito: se não retornar nada, o agente não tem proxy configurado.

Depois:

bash
timeout 10 curl -v -o /dev/null https://firebase.googleapis.com

Com timeout 10 ele não vai travar 5 minutos de novo, corta em 10 segundos e mostra o motivo do erro (timeout de conexão = bloqueio de firewall; erro de proxy = falta configurar variável).

Manda o output desses dois primeiro.****
