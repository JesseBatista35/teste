Prezados,

Solicito análise do time responsável pelas soluções iOS do CAIXAPLATFORM referente a uma demanda do time do app FGTS (caixagithub/sifgm-ios).

Demanda: o time do app precisa distribuir builds de DES e PLT também para testers externos do TestFlight. Hoje apenas builds de PRD chegam aos externos.

Diagnóstico realizado:

github-solutions (ios--deploy.yaml e ios--release-promotion.yaml): o job build define fixo testflight-internal-only: ${{ inputs.environment != ‘PRD’ }}. Isso aplica testFlightInternalTestingOnly no export do IPA, e a Apple marca o build como “somente teste interno”, impedindo a inclusão em grupo externo inclusive manualmente no App Store Connect. Não existe input para o caller sobrescrever esse comportamento.
github-actions/actions/ios/distribute-testflight: o fastlane pilot upload não recebe --distribute_external, portanto não ocorre submissão ao Beta App Review nem liberação para grupos externos.
O default skip-waiting-for-build-processing = “true” faz o pilot encerrar logo após o upload, sem aplicar --groups e --changelog.
O modo altool (usado hoje pelo caller do sifgm-ios) faz apenas upload e ignora grupos e changelog. Esse ponto será tratado no caller, migrando para api-key.

Proposta de ajuste (retrocompatível, default false, sem impacto para os demais apps):

github-solutions: novo input testflight-distribute-external (boolean, default false). Quando true: testflight-internal-only passa a false, skip-waiting-for-build-processing é forçado para “false” e distribute-external é repassado ao workflow-job.
testflight-internal-only: ${{ inputs.environment != ‘PRD’ && inputs.testflight-distribute-external != true }}
github-workflow-jobs (ios--distribute.yaml): novo input distribute-external, repassado à action.
github-actions (distribute-testflight): com distribute-external = “true”, adicionar --distribute_external true --notify_external_testers true nos modos api-key e apple-id, validando que changelog esteja preenchido e que skip-waiting seja “false”.

Pontos para avaliação do time:

Existe restrição de governança ou segurança para builds de DES/PLT serem distribuídos a testers externos? O comentário no código menciona “paridade com o legado”.
Observação de segurança na action distribute-testflight: os inputs changelog, groups e ipa-path são interpolados diretamente no bloco run. A sugestão é repassá-los via env para evitar quebra do step ou injeção de comando.
O comentário do step de upload api-key (“apenas upload, distribuição manual”) está desatualizado em relação ao código, que já repassa --groups.

Pendências do lado do time do app, após a liberação da plataforma: ajuste do caller (input de distribuição externa e upload-method api-key), cadastro dos secrets da API Key do App Store Connect com papel App Manager, criação do grupo externo e preenchimento da Test Information no App Store Connect.

Fico à disposição para apoiar nos ajustes ou abrir os PRs nas três camadas, caso prefiram.

Atenciosamente,
Jessé Batista
CTIS/CESTI - Esteiras DevOps DES/TQS
