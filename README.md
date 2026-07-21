À CAIXA,
A alteração da ordem dos Variable Groups é possível, porém o Azure DevOps (Release Pipeline clássico) não oferece uma opção de reordenação direta (drag-and-drop) na tela. A ordem é definida pela sequência de vinculação dos grupos ao pipeline.
Para atender à ordem solicitada, será necessário desvincular todos os Variable Groups atualmente associados ao ambiente e revinculá-los na sequência exata solicitada.
Antes de prosseguir, identificamos que os ambientes TQS e HMP possuem hoje vinculados tanto os grupos "BATCH-REPASSE" quanto "BATCH-REMESSA" (ex: SIACC-PIXAUTOMATICO-BATCH-REPASSE-TQS e SIACC-PIXAUTOMATICO-BATCH-REMESSA-TQS), mas a ordem solicitada menciona apenas os grupos "REMESSA". Solicitamos confirmação: os grupos "REPASSE" devem permanecer vinculados (e em qual posição), ou podem ser desvinculados do pipeline?
Aguardamos retorno para prosseguir com o ajuste.
