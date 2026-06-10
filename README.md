SOLUÇÃO IMPLEMENTADA - VARIÁVEL SD_KEY_BIOMETRIA INJETADA COM SUCESSO

Status: RESOLVIDO ✅

PROBLEMA IDENTIFICADO:
A variável de ambiente SD_KEY_BIOMETRIA não estava sendo injetada automaticamente nas tasks do Xcode durante a execução do pipeline de build.

CAUSA RAIZ:
A variável estava configurada no Azure DevOps (Release variables), mas não estava sendo propagada para as tasks individuais (pod install e Xcode archive) por falta de injeção explícita no contexto de execução.

SOLUÇÃO APLICADA:
1. Adicionado parâmetro "SD_KEY_BIOMETRIA" na task group BUILD-DEPLOY_DEFAULT_IOS
2. Modificado o script "Sequence e Version" para injetar a variável no project.pbxproj:
   - sed: 's/SD_KEY_BIOMETRIA =\s*.*/SD_KEY_BIOMETRIA = $(SD_KEY_BIOMETRIA);/g'
3. Criado novo bash script que exporta a variável antes do pod install:
   - export SD_KEY_BIOMETRIA="$(SD_KEY_BIOMETRIA)"
   - pod install com variável exportada

VALIDAÇÃO:
✅ Pod install executado com sucesso
✅ Xcode archive recebeu SD_KEY_BIOMETRIA=*** (confirmado nos logs)
✅ Build passou sem erros

PRÓXIMOS PASSOS:
Nenhum - solução completa e validada em ambiente DES.

Responsável pela Validação: Teams C111482
Data de Implementação: 10/06/2026
