O que verificar no 2501:

bash
# agente escutando na porta servidor->agente
ss -ltnp | grep 7016

# houve tentativa de conexão do servidor depois de 12/11 11:31?
grep -i "cxextrlx038" /opt/ctmage/ctm/dailylog/daily_ctmag_2026111*.log | tail -20
ls -ltr /opt/ctmage/ctm/proclog | tail -20

Se o agente estiver escutando na 7016 e não aparecer nenhuma conexão vinda do cxextrlx038, a causa provável é firewall no sentido servidor → agente.

Sugestão de resposta para o Iury:

Bom dia, Iury! Verifiquei: o job não chegou a ser executado no agente. Ele ficou em “Wait Host”, que é quando o servidor Control-M não consegue entregar o job para o host. Por isso não existe output.

Consegue me passar duas informações?

Na definição do job CRIACAO_OS_SIGDU, qual está no campo Host/Host Group? O agente está registrado como caddeapllx2501.agil.nprd.caixa.gov.br.
Se possível, peça para quem administra o Control-M verificar se esse agente aparece como Available no servidor BR DES - Negocial.

Do meu lado, estou verificando a comunicação no sentido servidor → agente (porta 7016). A validação anterior cobriu o sentido agente → servidor.

Me passa a saída dos comandos e o host que estiver no job, e a gente fecha a causa.
