Prezados,

Solicito verificação da credencial (Client ID) utilizada pela aplicação siico-bff-produto-des para autenticação no BeyondTrust, pois os pods novos estão falhando na inicialização por erro de autenticação.

Aplicação: siico-bff-produto-des
Client ID: d0a91405-3db6-4ac9-8228-36def2ee8d37
Endpoint: https://sicsn.caixa/BeyondTrust/api/public/v3/Auth/connect/token
Erro: HTTP 400 Bad Request

Impacto:
Novos pods não conseguem autenticar no BeyondTrust. Nenhum segredo é criado em /usr/src/app/secrets_files. O init container secrets-check finaliza com Exit Code 4, impedindo o início do container principal (siico-bff-produto-des), que permanece em PodInitializing.

Evidência:
A mesma imagem 0.0.6.0-SNAPSHOT que subiu com sucesso em 27/08 está falhando hoje na autenticação OAuth, com a mensagem: "Nao foram encontrados arquivos com segredos no diretorio '/usr/src/app/secrets_files'". Como não houve alteração na imagem, o comportamento indica problema relacionado à credencial (expiração, revogação ou alteração de secret) no lado do BeyondTrust, e não na aplicação.

Solicito verificação da validade/status do Client ID acima e do secret associado, para restabelecer a autenticação.

Link da release: https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=525826&environmentId=2442294

Agradeço a atenção.
