Prezado Erico Macedo, bom dia/tarde.

Estou atuando na correção do pipeline de release SISOU-sac-okd (Definição 6486), que está apresentando falha na etapa "Valida Variáveis Obrigatórias" por ausência da variável CGC_UNIDADE_OPS.

Ao verificar o histórico da CRQ000001454659, identifiquei que essa variável (valor 7259) foi removida na revisão 35, com modificação registrada em 20/07/2026 pelo usuário Allysson de Oliveira Vieira.

Como essa remoção está impactando diretamente a execução do release, gostaria de validar com o senhor, como demandante, se essa exclusão foi intencional (por exemplo, decorrente de alguma mudança de unidade ou processo) ou se ocorreu de forma inadvertida durante o atendimento da CRQ.

Enquanto aguardo esse retorno, vou restaurar o valor da variável (CGC_UNIDADE_OPS = 7259) na definição do release para destravar o pipeline, evitando impacto às demais atividades em andamento. Caso haja algum motivo específico para a remoção que eu deva considerar, peço a gentileza de me informar o quanto antes.

Fico à disposição para mais esclarecimentos.

Atenciosamente,
Jessé Batista
