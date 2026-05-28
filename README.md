Assunto: Cluster ARO sem CPU — deploy bloqueado no sigec-opf-des
O nodepool Spot do cluster aroidpprd está com CPU insuficiente em todos os nós disponíveis e atingiu o limite máximo de nodes. Desde as 16:47 de hoje nenhum pod novo consegue ser agendado no namespace sigec-opf.
Erro: 0/4 nodes available — 2 Insufficient cpu — max node group size reached
Precisamos que o max node count do nodepool Spot seja aumentado urgente para desbloquear os deploys.
