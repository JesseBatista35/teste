TÍTULO: Resolução de falha na pipeline de Build SIGPD-Backend versão 3.4.2.10

PROBLEMA:
A pipeline de Build (Java-Build) estava falhando ao tentar publicar o artefato .ear no Nexus com a versão 3.4.2.10-SNAPSHOT.

ERROS IDENTIFICADOS:
- Linha 28: library: comando não encontrado
- Diretório literal ${jboss.deploy.dir} sendo criado em ear/C:/

CAUSA:
A variável "library" não estava definida nas variáveis da pipeline, impossibilitando a Task Group "Build Default" de executar corretamente.

SOLUÇÃO IMPLEMENTADA:
1. Adicionada variável "library" na Pipeline SIGPD-Backend
2. Criado script Bash para remover diretórios problemáticos (ear/C:/)
3. Validada expansão correta das variáveis de ambiente

RESULTADO:
✅ Build 755011 publicou com sucesso no Nexus
✅ Artefato sigpd-ear-3.4.2.10-SNAPSHOT publicado
✅ Pipeline pronta para execução de Releases

STATUS: RESOLVIDO
