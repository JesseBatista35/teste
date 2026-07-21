Prezados,
Em atendimento à solicitação de alteração da ordem dos Variable Groups no Release Pipeline do projeto SIACC-pixautomatico-batch-remessa, informamos que a reordenação foi realizada com sucesso através do processo de desvinculação e revinculação sequencial dos grupos, uma vez que o Azure DevOps (Release Pipeline clássico) não disponibiliza opção de reordenação direta na interface.
Adicionalmente, conforme confirmado pelo solicitante, os grupos SIACC-PIXAUTOMATICO-BATCH-REPASSE-TQS e SIACC-PIXAUTOMATICO-BATCH-REPASSE-HMP foram desvinculados do pipeline, por não estarem mais em uso.
A ordem final dos Variable Groups está conforme solicitado, contemplando os ambientes DES, TQS, HMP e PRD na sequência requisitada.
Recomenda-se a execução de um release de teste em ambiente DES para validar que a nova ordem de precedência das variáveis não impacta o comportamento esperado da aplicação, especialmente em casos de variáveis com mesmo nome presentes em múltiplos grupos.
Atenciosamente,
Jessé Batista
