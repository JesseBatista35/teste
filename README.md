Prezados,

Análise:
O erro no passo "Configurando Stack de Monitoração" não é específico do SIGFA-batch. É um problema conhecido que afeta todas as releases de aplicações em VM no modelo Ansible (esteira-jboss-vm), em DES e TQS. A falha ocorre na etapa de cadastro da monitoração (Zabbix) e não interfere no deploy da aplicação.

Ação realizada:
Foi aplicado um paliativo no task group global da esteira: a task "Configurando Stack de Monitoração" está configurada com "Continue on error". Com isso, o passo ainda registra o erro, mas a release segue e conclui com o status "Partially succeeded".

Executamos um novo deploy (release SIGFA-batch-1618, versão 1.96.3.30), que concluiu nos stages EC DES e EC TQS com status "Partially succeeded" e a aplicação implantada normalmente (evidência em anexo).

A correção definitiva da etapa de monitoração está em andamento com o time de suporte da esteira, referência WO0000081840070. Após a correção, as releases voltarão a concluir com sucesso total, sem necessidade de ação por parte de vocês.

Sobre o ambiente de Produção:

O escopo de atuação desta equipe (CESTI – Esteira DevOps DES/TQS NPRD) não inclui os ambientes HMP e PRD. Não temos acesso a esses ambientes para validar o comportamento da release.
No último deploy em PRD (SIGFA-batch-1592, 20/07/2026), o passo "Configurando Stack de Monitoração" não consta na execução do stage EC PRD.
Antes do deploy em Produção, recomendamos que a equipe valide com a equipe de Infraestrutura/Produção responsável por esse ambiente se a etapa de monitoração será executada no stage de PRD e se há algum impacto.

Encerramos esta demanda por ter sido restabelecido o deploy em DES e TQS. Para dúvidas sobre o ambiente de Produção, orientamos o acionamento da equipe responsável.

Atenciosamente,
Jessé Batista – CTIS/CESTI Esteira DevOps DES/TQS NPRD
