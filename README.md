Diagnóstico:
A tarefa de publicação no Nexus ("Publica no Nexus") estava localizada dentro do Task Group "Build Default - jar", compartilhado com outro pipeline (SINAC-sicli-api). Como não havia autorização para alterar um recurso compartilhado, os Task Groups "Java-Build - jar" e "Build Default - jar" foram clonados como cópias exclusivas do SIACM-api-audit, permitindo a validação da solução sem impactar outros pipelines.

Ação realizada:
No script da tarefa "Publica no Nexus" (dentro da cópia exclusiva do Task Group), o parâmetro -DgeneratePom=true foi substituído por -DpomFile=$(POM_PATH), permitindo que o deploy no Nexus utilize o pom.xml completo do projeto (com todas as dependências) em vez de gerar um POM mínimo.

Caráter da ação: Esta implementação foi realizada em ambiente de testes (cópia exclusiva do Task Group), para validação da solução proposta. Assim que a validação for confirmada, será encaminhada nova solicitação para obtenção de autorização formal de alteração no Task Group compartilhado original, de forma que a correção seja aplicada de maneira definitiva e oficial, com ciência do time responsável pelo pipeline SINAC-sicli-api.

Validação:
Build de teste executado com sucesso; deploy no Nexus concluído gerando o POM completo com as dependências do projeto.

Impacto: Nenhum — alteração aplicada apenas em cópia exclusiva do Task Group, sem afetar o pipeline SINAC-sicli-api ou qualquer outro consumidor do Task Group original.
