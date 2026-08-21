Prezados,

Segue fechamento do chamado referente à falha java.io.FileNotFoundException (permissão negada) no diretório /sigdb/sigdb/TRANSMITE, servidor caddeapllx2560.

Diagnóstico e correção

O diretório estava com proprietário root:root e permissão 755; corrigido para ctmagelx:controlm, permissão 775, restaurando a escrita do agente AgtSigdb (usuário responsável pela geração dos arquivos). Correção validada com teste de escrita.

Causa raiz identificada

Via regra de auditoria (auditd), foi capturado o evento que reverte a permissão: um chmod 755 executado através da conta de automação sansbp01, conta de serviço genérica de uso root para automações de esteira (provisionada em 2020, senha em cofre). Não foi possível, a partir dos logs disponíveis neste host, identificar qual playbook/pipeline específico dispara esse comando, já que a conta é compartilhada entre múltiplas automações.

Recomendação

Encaminhar ao time responsável pelo cofre de senhas/CESET a solicitação de levantamento de uso da credencial sansbp01 no horário do evento (21/08 13:53:49), para identificar a automação de origem e corrigir o playbook que aplica chmod 755 nesse diretório.

Status: Resolvido no imediato (correção aplicada e validada). Causa raiz parcialmente identificada — origem é uma automação via conta de serviço compartilhada; pendente identificação do playbook exato.
