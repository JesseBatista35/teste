Prezados, boa tarde.

Encaminhamos a demanda para avaliação do time de Nuvem / DevSecOps, responsável pelas actions compartilhadas do repositório caixagithub/DevSecOps-Actions.

Aplicação: sisfm-mfe-host (DES)
Workflow: CI/CD Workflow Generic, job CI_DES / DEPLOY (DES)
Execução: https://github.com/caixagithub/sisfm-mfe-host/actions/runs/36154830896/job/108137376620
Step com falha: Purge Cache (caixagithub/DevSecOps-Actions/.github/integrations/azion/purge@main)

Erro apresentado:
curl: (3) URL rejected: No host part in the URL
Error: Process completed with exit code 3.

Análise realizada:
A action .github/integrations/azion/purge declara três inputs obrigatórios: API_URL, API_TOKEN e CUSTOM_DOMAIN. No log da execução, o workflow chamador repassa somente API_TOKEN e CUSTOM_DOMAIN. O input API_URL não é informado.

Em actions do tipo composite, o GitHub não valida o required: true dos inputs. Com isso, API_URL chega vazio e o comando curl é executado contra a URL "/v4/workspace/purge/wildcard", sem esquema e sem host. Essa URL é rejeitada pelo curl com o erro acima.

O domínio informado (supergerenciador.des.caixa.gov.br) está correto e não é a causa da falha. Não identificamos problema na configuração do repositório sisfm-mfe-host.

Possível causa:
Inclusão ou alteração recente do input API_URL na action de purge da Azion sem a correspondente atualização do workflow genérico que a consome. Nesse caso, a falha deve afetar todos os repositórios que utilizam o purge da Azion, não apenas o sisfm-mfe-host.

Sugestão de correção (uma das opções):

Incluir o parâmetro API_URL (URL base da API da Azion) na chamada da action dentro do workflow genérico.
Definir um valor default para API_URL na própria action e incluir uma validação que interrompa a execução com mensagem clara quando o valor estiver vazio.

Solicitamos a avaliação e a correção da action ou do workflow genérico, bem como a confirmação da URL base correta da API da Azion a ser utilizada.

Atenciosamente,
Jessé Batista – P585600
CTIS/CESTI – Esteiras DevOps DES/TQS NPRD
