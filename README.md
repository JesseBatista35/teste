Prezados,

Informamos que a esteira DES TQS NPRD identificou falha de teste unitário durante o build do projeto SISPI-dict-batch-polling (revision 790980), impedindo a conclusão do pipeline no módulo sispi-dict-batch-polling-ejb.

Teste com falha:
Classe: br.gov.caixa.spi.dict.ejb.EventoDevolucaoBacenHelperEjbTest
Método: testTrataNovaDevolucaoPixAutomaticoSucesso
Resultado: Tests run: 684, Failures: 1, Errors: 0, Skipped: 0

Possível causa identificada (para avaliação do time de desenvolvimento):
Ao analisar o código do teste, observamos que o método testTrataNovaDevolucaoPixAutomaticoSucesso constrói o DevolucaoDto informando apenas o campo razao (RazaoDevolucao.PIX_AUTOMATICO), sem definir o campo idTransacao. Na mesma classe de teste, há outro caso (testTrataNovaDevolucaoSemIdTransacao) que indica que o método trataNovaDevolucao trata idTransacao nulo como retorno false, sem interagir com pagamentoDao. Isso sugere que o teste em questão pode estar desatualizado em relação a uma validação de idTransacao incluída posteriormente na regra de negócio, e não necessariamente um bug na aplicação.

Esta é apenas uma hipótese levantada a partir da leitura do código de teste, sem acesso ao stack trace completo do Surefire. Solicitamos a avaliação do time de desenvolvimento para confirmar a causa raiz e definir o ajuste necessário (no teste ou na regra de negócio, conforme o caso).

Ficamos à disposição para mais detalhes.

Atenciosamente,
Jessé Batista, CTIS/CESTI — Esteira DevOps DES TQS NPRD
