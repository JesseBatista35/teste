
Prezados,

Segue atualização/fechamento do chamado referente à falha java.io.FileNotFoundException (permissão negada) no diretório /sigdb/sigdb/TRANSMITE, servidor caddeapllx2560 (10.116.201.27).

Observação sobre a abertura e reabertura do chamado

Tanto a abertura inicial quanto a reabertura deste chamado não trouxeram log de erro, horário da ocorrência, print ou qualquer evidência adicional do problema reportado — apenas a indicação do sintoma (na abertura) e do endereço do servidor (na reabertura). Todo o diagnóstico foi conduzido a partir de investigação direta no servidor, sem informações complementares fornecidas pela solicitação. Reforçamos que, para viabilizar diagnóstico preciso e ágil, é necessário o encaminhamento do erro específico apresentado (stack trace, horário, e se possível print da aplicação) já na abertura do chamado.

Diagnóstico revisado

A correção aplicada anteriormente (proprietário ctmagelx:controlm) foi baseada na identificação incorreta do processo consumidor do diretório. Por meio de nova captura via auditoria (auditd), foi identificado que o processo real responsável pela escrita em TRANSMITE é uma aplicação Java (siccv-batch26.jar, referente ao SICCV), executada sob o usuário f593268 (grupo supadmin) — não o agente AgtSigdb/ctmagelx presumido inicialmente.

Correção aplicada

Ajustado o proprietário do diretório para f593268:supadmin, permissão 775, alinhado ao padrão de propriedade já existente nos arquivos históricos do diretório. Validado com teste de escrita utilizando o usuário f593268, com resultado positivo.

Causa raiz do reset de permissão

Identificado, via auditoria, um evento de chmod 755 disparado pela conta de automação sansbp01 (Ansible, uso administrativo/root, WO0000049756814 — conta compartilhada entre múltiplas automações). Origem exata do playbook não identificada nos logs deste host, por se tratar de credencial de uso compartilhado.

Recomendação

Encaminhar ao time responsável pelo cofre de senhas o levantamento de uso da credencial sansbp01, para identificar a automação de origem e corrigir o playbook que aplica chmod 755 nesse diretório — enquanto isso não for feito, o reset de permissão pode voltar a ocorrer periodicamente.

Solicitamos validação da equipe da aplicação para confirmar que o erro não reincide após esta correção. Em caso de nova reabertura, favor anexar o erro/log específico apresentado, para viabilizar diagnóstico objetivo.
