Prezados, bom dia/tarde.

Informa-se que o incidente de falha na etapa "Valida Variáveis Obrigatórias" do pipeline de release SISOU-sac-okd foi solucionado.

Diagnóstico: a variável CGC_UNIDADE_OPS não havia sido removida, mas teve seu escopo alterado exclusivamente para EC PRD em decorrência do atendimento da CRQ000001454659, deixando de estar disponível para o escopo Release (utilizado pelos demais estágios, incluindo EC DES).

A situação foi validada em reunião via Teams com o demandante, que autorizou o retorno da variável CGC_UNIDADE_OPS (valor 7259) ao escopo Release.

A alteração foi aplicada e o release SISOU-sac-okd-2.1.0.19-SNAPSHOT(2) foi executado com sucesso no ambiente EC DES em 22/07/2026, às 12:41:12, confirmando a correção.

Dessa forma, encerra-se o atendimento referente a essa ocorrência.

Atenciosamente,
Jessé Batista
