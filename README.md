Prezados,

Segue fechamento do chamado referente à falha java.io.FileNotFoundException (permissão negada) no diretório /sigdb/sigdb/TRANSMITE, servidor caddeapllx2560.

Diagnóstico

O diretório /sigdb/sigdb/TRANSMITE estava configurado com proprietário root:root e permissão 755. O processo responsável pela gravação dos arquivos nesse diretório é o agente AgtSigdb, iniciado via script de init em /opt/batch/config/sigdb/des/run, executado sob o usuário ctmagelx (grupo controlm). Por não ser proprietário nem pertencer ao grupo do diretório, o processo não possuía permissão de escrita, resultando na falha reportada pela aplicação a cada nova geração de arquivo.

Correção aplicada

Ajustado o proprietário e a permissão do diretório para ctmagelx:controlm, modo 775, restaurando a capacidade de escrita do agente. A correção foi validada com teste de escrita utilizando o usuário ctmagelx, com resultado positivo.

Investigação da causa raiz

Foi investigada a hipótese de o reset periódico de permissão estar relacionado à esteira de release SICCV-batch (Azure DevOps), por essa ser a esteira que atende o servidor. Análise detalhada dos logs de execução e do código-fonte das roles Ansible (repositório esteira-jboss-vm-v2) não identificou nenhuma task que manipule o diretório /sigdb ou TRANSMITE. A execução analisada não acionou sequer a tag jboss, tratando-se de deploy batch/Control-M apenas.

Identificado que o host possui o serviço EMC Networker (backup) ativo, reiniciado a cada execução da esteira, o que constitui um candidato a investigar caso a falha reincida, por poder alterar propriedade/permissão de arquivos em rotinas de restore.

Como a causa raiz do reset periódico não foi confirmada, foi configurada regra de auditoria (auditd) persistente no diretório TRANSMITE (chave: transmite_watch), monitorando alterações de escrita e atributos (owner/permissão). Caso a falha reincida, o comando ausearch -k transmite_watch permitirá identificar processo, usuário e horário exatos responsáveis pelo evento.

Status: Resolvido / Em monitoramento (auditoria ativa para captura de causa raiz em caso de reincidência).

Observação adicional

Identificado, de forma independente, que o agente Control-M nesse servidor apresenta alerta de variável AG_JAVA_HOME apontando para caminho inexistente (/opt/ctmage/bmcjava/bmcjava-V2). Registrado como achado, sem impacto confirmado sobre o SIGDB até o momento.
