Prezados,

Em atenção à solicitação, esclarecemos que a análise de impacto entregue na WO0000081742003 mapeou os workflows afetados pela migração do label ubuntu-latest para Ubuntu 26.04 e as ações recomendadas. A execução de builds e a validação dos testes, porém, são responsabilidade das comunidades donas das aplicações, e não da equipe de Esteiras DevOps DES/TQS NPRD.

Para o teste, cada comunidade deve executar o build dos seus repositórios utilizando runs-on: ubuntu-26.04 e validar o resultado. Os principais pontos de atenção são:

Java default 17 → 25: jobs sem setup-java declarado
Java 8: removido da imagem
Helm 3 → 4
Docker 28 → 29
Python do sistema 3.12 → 3.14: jobs sem setup-python declarado

A relação dos workflows centrais e dos repositórios de aplicação impactados está no documento em anexo, com os riscos e a ação recomendada para cada item.

Caso a comunidade identifique falha durante os testes, a equipe de Esteiras permanece à disposição para apoiar na análise. Até o fim do rollout (19/11), o label ubuntu-24.04 pode ser usado como contingência.

Atenciosamente,
Jessé Mouta Pereira Batista
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD
