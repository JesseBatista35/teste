Prezados,

Informamos que a alteração solicitada no CronJob agendamento-sisou, no namespace sisou-des (ambiente DES), foi realizada com sucesso.

O campo comando do container foi atualizado conforme especificado na solicitação, substituindo a chamada direta ao endpoint interno do serviço sisou-sac-okd-des por uma chamada autenticada via Keycloak, utilizando client credentials para obtenção de token de acesso antes da requisição ao endpoint sac/cronjob/indecx/pesquisa-satisfacao.

A alteração foi aplicada via patch no cluster OKD, com backup do manifesto original realizado previamente à mudança. A configuração atual do CronJob foi validada por meio do comando oc get cronjob, confirmando que o comando e os argumentos refletem exatamente o que foi solicitado.

Dessa forma, consideramos concluído o item solicitado nesta W.O.

Registramos, no entanto, que durante a validação da execução do CronJob após a alteração foi identificado um erro de certificado SSL, impedindo a conclusão bem-sucedida das execuções agendadas. Tal ocorrência não integra o escopo desta solicitação e está sendo tratada em registro específico, conforme detalhado a seguir.

Atenciosamente,
Jessé Batista
CTIS/CESTI — DES/TQS NPRD
