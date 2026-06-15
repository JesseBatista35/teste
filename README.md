À CAIXA,
Prezados,
Informamos que os ajustes solicitados na REQ000095661629 foram realizados conforme especificado, no pipeline de Release do SIAPT-iOS (Azure DevOps).
Ajustes realizados:

Criada a variável SD_KEY_BIOMETRIA (Type: Secret) nas 3 variable groups: SIAPT-DES, SIAPT-PILOTO e SIAPT-PRD, com o valor recebido por e-mail na caixa postal cepro20@caixa.gov.br.
Adicionado o parâmetro SD_KEY_BIOMETRIA na task group BUILD-DEPLOY_DEFAULT_IOS (default $(SD_KEY_BIOMETRIA)), garantindo a propagação da variável para as tasks de execução.
Ajustado o script "Sequence e Version" para injetar a variável no project.pbxproj via sed.
Criada a task bash "Exporta SD_KEY_BIOMETRIA", que exporta a variável antes do pod install.

Os ajustes estão concluídos e prontos para a próxima execução da Release (deploy) no ambiente DES, momento em que a injeção da variável será validada nos logs (pod install e Xcode archive recebendo SD_KEY_BIOMETRIA=*** por mascaramento de Secret).
Atenciosamente,
