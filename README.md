Prezados,

Segue atualização referente ao chamado de FileNotFoundException por permissão negada no diretório /sigdb/sigdb/TRANSMITE, servidor caddeapllx2560.

Diagnóstico

O diretório /sigdb/sigdb/TRANSMITE estava configurado com proprietário root:root e permissão 755. O processo responsável pela gravação dos arquivos nesse diretório é o agente AgtSigdb, iniciado via script de init em /opt/batch/config/sigdb/des/run, executado sob o usuário ctmagelx (grupo controlm). Por não ser proprietário nem pertencer ao grupo do diretório, o processo não possuía permissão de escrita, resultando na falha reportada pela aplicação a cada nova geração de arquivo.

Foi verificado que o pacote de deploy sigdb.zip presente no servidor não apresenta data de modificação recente, o que indica que o problema não está relacionado a uma reextração completa do pacote durante o release. A causa exata do reset periódico da permissão ainda não foi identificada.

Correção aplicada

Ajustado o proprietário e a permissão do diretório para ctmagelx:controlm, modo 775, restaurando a capacidade de escrita do agente. A correção foi validada com teste de escrita utilizando o usuário ctmagelx, com resultado positivo.

Acompanhamento

Como o mesmo ajuste já havia sido aplicado manualmente antes e retornou a falhar após um release, foi configurada uma regra de auditoria (auditd) no diretório TRANSMITE, com persistência entre reinicializações, para registrar qualquer alteração futura de propriedade ou permissão, permitindo identificar o processo, usuário e horário exatos responsáveis pelo reset, caso ocorra novamente.

Solicitamos que a equipe responsável pela esteira de release do SIGDB verifique se algum step do pipeline realiza recriação, reempacotamento ou ajuste de permissões sobre o diretório TRANSMITE, uma vez que esse é o comportamento mais provável para o reset recorrente.

Observação adicional

Identificado, de forma independente, que o agente Control-M nesse servidor apresenta alerta de variável AG_JAVA_HOME apontando para caminho inexistente (/opt/ctmage/bmcjava/bmcjava-V2). Registrado como achado, sem impacto confirmado sobre o SIGDB até o momento.

Ficamos à disposição para mais informações.
