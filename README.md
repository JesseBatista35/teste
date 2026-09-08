Bom dia a release do sistema citado está apresentando o seguinte erro:

Error from server (BadRequest): container "siico-bff-produto-des" in pod "siico-bff-produto-des-113-r6kwn" is waiting to start: PodInitializing

link: https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=525826&environmentId=2442294

Poderiam verificar por favor?


Obrigado


Aplicação: siico-bff-produto-des


Client ID:

d0a91405-3db6-4ac9-8228-36def2ee8d37


Endpoint:

https://sicsn.caixa/BeyondTrust/api/public/v3/Auth/connect/token


Erro:

HTTP 400 Bad Request


Impacto:

Novos pods não conseguem autenticar no BeyondTrust.

Nenhum segredo é criado em:


/usr/src/app/secrets_files


O init container secrets-check finaliza com Exit Code 4.


Evidência:

A mesma imagem 0.0.6.0-SNAPSHOT que subiu em 27/08 hoje falha na autenticação OAuth.



ERRO: Nao foram encontrados arquivos com segredos no diretorio '/usr/src/app/secrets_files'.


me ajuda com o texto para encaiomhar a demanda para segurnaçlai verificar o cfre de senhar
