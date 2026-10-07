Prezados,

Segue o resultado da verificação solicitada:

Servidor cspibapllx017 (RHEL 6.8):

Os comandos mail/mailx estão instalados (pacote mailx-12.4) e disponíveis em /bin/mail e /bin/mailx.
O envio de e-mail não está configurado. O MTA (Postfix 2.6.6) está parado e desabilitado na inicialização do sistema, e não há relay SMTP configurado. Um teste de envio foi feito e não saiu do servidor. Foi verificado também um acúmulo de mensagens não entregues entre 2015 e 2025, geradas por rotinas agendadas do servidor, confirmando que nenhum e-mail sai desse servidor. A fila foi limpa durante a análise.

Servidor dt7261ux372 (10.184.15.181):
Não foi possível realizar a verificação. O servidor pertence ao ambiente de produção (rede de backup de produção), fora do escopo de atuação desta equipe (DES/TQS).

Encaminhamento:
A demanda está sendo direcionada à equipe de Infraestrutura para:

verificação do mail/mailx e das configurações de envio no servidor dt7261ux372;
caso seja necessário o envio de e-mail a partir do cspibapllx017, ativação do serviço Postfix e configuração do relay SMTP corporativo.

Atenciosamente,
Jessé Batista – CESTI/DES-TQS
