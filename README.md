Prezados,

Reportando falha recorrente ao criar novo microsserviço no FusionX para a sigla SINCR.

Task: https://fusionx.caixa/create/tasks/9f440f12-e94d-47c5-bfb1-8f8bdf69a47a
Erro: GithubResponseError - Pull request creation failed; caused by HttpError: Not Found - https://docs.github.com/rest/repos/repos#get-a-repository

Variáveis preenchidas na execução:
- Sigla: SINCR
- Tipo de Repositório: API (mesmo erro também ocorreu testando tipo Backend)
- Módulo: teste-fusionx
- Modelo: Padrão
- Linguagem: .NET
- Implantação: Azure
- Associar Aplicação: G_AZ_GITHUB_SINCR_DESENVOLVEDOR

O demandante já testou múltiplos ciclos de vida e tipos de repositório (API e Backend), sempre com o mesmo erro. O GitHub Status está operando normalmente (All Systems Operational), descartando instabilidade externa. Já verificamos também o grupo G_AZ_GITHUB_SINCR_DESENVOLVEDOR no Backstage, que está corretamente catalogado e segue o mesmo padrão dos demais grupos da plataforma, descartando problema de cadastro do grupo.

Solicitamos verificação da integração/permissão do GitHub App do FusionX especificamente para a organização/repositórios da sigla SINCR, já que o erro se repete de forma consistente independente do tipo de repositório escolhido.

Fico à disposição para mais detalhes.

Atenciosamente,
Jessé Batista
