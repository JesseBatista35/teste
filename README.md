Nota de Fechamento

Identificado que o pacote EAR do SIMCN, mesmo com deploy indicando sucesso, não estava sendo efetivamente substituído no ambiente (permanecia a versão anterior).

Realizada remoção completa do deployment SIMCN do Domain Controller (server-group e repositório), eliminando o conteúdo que estava causando o conflito.

Efetuado reinício controlado dos processos JBoss do servidor, com validação de que todas as aplicações do host voltaram a operar normalmente.

Ambiente disponibilizado para nova tentativa de deploy da versão atualizada.

Jessé Batista, CTIS/CESTI — Esteira DevOps DES TQS NPRD
