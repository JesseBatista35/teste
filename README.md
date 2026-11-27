Bom dia, pessoal!

Encontrei e corrigi a causa: o servidor Control-M (cxextrlx038) não resolvia o nome do agente caddeapllx2501.agil.nprd.caixa.gov.br. Por isso o job ficava com "There is no machine available for job execution" e nunca era enviado à máquina. Incluí o agente na resolução de nomes do servidor, no mesmo padrão dos demais agentes da esteira, e agora ele aparece como Available no Control-M (ping OK).

Para testar:

Liberem o job CRIACAO_OS_SIGDU do Hold (botão Free). Ele está com o cadeado.
Forcem a execução de novo. O Run Now continua bloqueado pelo bypass (CTM5366), então o teste precisa ser dentro da janela configurada no job.

Me avisem aqui quando forçarem, que eu acompanho a execução no servidor.
