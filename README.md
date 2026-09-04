Resumo do atendimento (fechamento)

Serviço: Ajustar ambiente ou parametrização de software
Ambiente: DES
Sistema: Pipeline SIACM-api-audit

Diagnóstico:
A tarefa de publicação no Nexus utilizava o parâmetro -DgeneratePom=true, que gera um POM mínimo (apenas groupId/artifactId/version), sem as dependências reais do projeto.

Ação realizada:
Identificado que o Task Group já possuía suporte nativo a uma variável de controle (library), que alterna entre -DgeneratePom=true (padrão) e -DpomFile + -DgeneratePom=false (POM completo) sem necessidade de alteração no script compartilhado.

Foi adicionada a variável de pipeline library = true nas Variables do SIACM-api-audit, ativando o uso do pom.xml completo do projeto apenas para esta esteira, sem qualquer alteração no Task Group compartilhado e sem impacto em outros pipelines (ex: SINAC-sicli-api).

Validação:
Build executado com sucesso. Artefato publicado no Nexus (caixa-api-siacm_audit-2.3.0.56.pom) confirmado com todas as dependências do projeto (Spring, Hibernate, Log4j, javax, etc.), consistente com o pom.xml original do repositório.

Impacto: Nenhum — alteração restrita à variável de pipeline do próprio SIACM-api-audit; nenhuma modificação foi feita em recursos compartilhados.

Observação: Solução mais simples que a inicialmente prevista — dispensou a necessidade de clonagem do Task Group, já que a variável library já existia parametrizada para esse fim.
