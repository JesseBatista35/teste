TÍTULO: Falha CodeQL "Nenhuma linguagem detectada" – sirmc-api-suitability (PR #3)

RESPONSÁVEL: Time de Desenvolvimento

PROBLEMA: A action de segurança (CodeQL) falha no job "Create language matrix" com "Nenhuma linguagem detectada" (exit 1).

CAUSA: A detecção de linguagem da pipeline de segurança lê o branch main, que hoje só tem documentação (Markdown/YAML) e nenhum código-fonte. O código da aplicação (.NET / C#) está apenas no branch feat/ini-project. Sem .cs na main, nenhuma linguagem suportada é detectada e a action aborta. Linguagem correta: csharp.

AÇÃO (Time de Desenvolvimento):
1. Levar o código-fonte C#/.NET para a main e reexecutar a action de segurança.
2. Verificar se a pipeline da DevSecOps permite informar a linguagem manualmente; se sim, passar csharp no "with:" do call-generic-sec-pipelines.yaml.
3. Confirmar suporte a build-mode .NET (csharp aceita build-mode: none) — a pipeline parece orientada a Java/Maven.
4. Alinhar os dois fluxos de CodeQL (codeql.yml analisa só "actions" e não cobre a aplicação).
