Auxiliar na release do módulo SIPDI-api-bff-perfil-acesso-TQS.

Prezados,

1. Pedimos auxílio em relação à release do módulo SIPDI-api-bff-perfil-acesso-TQS.

2. Ao tentar fazer uma release, na escolha do Artifact, não aparecem as opções com as tags, mesmo tendo feito deploy utilizando a tag 0.0.0.2b.

3. Por consequência ao tentar fazer a release em TQS falha, já que é necessária a tag.

4. Pedimos suporte para conseguir rodar a release selecionando a tag no Artifact.


Grato!


2026-08-28T17:17:36.1089059Z ##[section]Starting: VEC - Aferição
2026-08-28T17:17:36.1094117Z ==============================================================================
2026-08-28T17:17:36.1094250Z Task         : Bash
2026-08-28T17:17:36.1094294Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-28T17:17:36.1094358Z Version      : 3.227.0
2026-08-28T17:17:36.1094448Z Author       : Microsoft Corporation
2026-08-28T17:17:36.1094498Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-28T17:17:36.1094596Z ==============================================================================
2026-08-28T17:17:36.2706704Z Generating script.
2026-08-28T17:17:36.2729996Z ========================== Starting Command Output ===========================
2026-08-28T17:17:36.2731753Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/6bf66048-c33d-4f73-8f09-c30eb2271145.sh
2026-08-28T17:17:36.2785628Z ==============================================================================
2026-08-28T17:17:36.2786139Z Resultado da validação: false
2026-08-28T17:17:36.2786287Z Branch/Tag: refs/tags/0.0.0.2b
2026-08-28T17:17:36.2786435Z Stage selecionado: EC TQS
2026-08-28T17:17:36.2787054Z ##[error] VEC fora do padrão estabelecido no PPDS. Este pacote não pode ser implantado em TQS/HMP/PRD
2026-08-28T17:17:36.2787296Z ##[error] Para mais informações acesse as urls:
2026-08-28T17:17:36.2787569Z ##[error] https://devops.caixa/projetos/Caixa/_wiki/wikis/Caixa.wiki/1689/Valida%C3%A7%C3%A3o-da-VEC
2026-08-28T17:17:36.2787912Z ##[error] https://caixa.sharepoint.com/sites/PPDS/SitePages/GCM_Diretrizes_Padrao_Baseline.aspx ou consulte a GEQTI04
2026-08-28T17:17:36.2857055Z ##[section]Finishing: VEC - Aferição





Validação da VEC

Follow
2

Edit

Mario Luiz Costa Marinho da Silva
2 de out. de 2025
Foi definido conforme CE GEQTI 011/2024 que apenas compilações oriundas de tag dentro do padrão PPDS poderão ser implantadas em TQS/HMP/PRD.

Para que um pacote seja aprovado na checagem da VEC o usuário deve selecionar em tempo de compilação uma TAG que esteja no padrão X.X.X.X

pic1.png

O resultado dessa validação pode ser consultado durante o processo de build no passo 'validação da vec', conforme exemplo a seguir.

pic2.png

Durante a etapa de release em ambientes TQS/HMP/PRD o resultado dessa análise será checado e a implantação interrompida caso o pacote não tenha sido aprovado.

Observações:

a variável version.app não tem impacto algum neste processo
toda compilação feita com qualquer coisa diferente de TAG no padrão ppds será considerada snapshot, isso impacta diretamente na publicação do Nexus
o GCM compete exclusivamente à equipe responsável pelo projeto, a única checagem por parte do azure será verificar se o pacote já existe ou não no Nexus
até o presente momento a CE não se aplica a projetos que não são compilados na esteira, tais como pipelines que fazem chamada a registry externo para download de imagem já pronta, produtos 'caixa-preta' , etc.
Segue abaixo detalhamento da CE GEQTI 011/2024
Obrigatoriedade de Versionamento para Implantação
A partir do início de janeiro/2025, será obrigatório que os builds possuam versionamento de 4 casas numéricas com baseline para implantação em ambiente de HMP e PRD.
Conforme definido no PPDS, o versionamento utiliza o padrão VM.Vm.Patch.Build (Versão Maior, Versão menor, patch de correção, compilação), onde:
• VM (Versão Maior): mudanças significativas e grandes, tais como: inclusão de um novo e grande módulo, troca de tecnologia/linguagem, entre outras;
• Vm (Versão menor): manutenções evolutivas corriqueiras;
• Patch: correções em produção; e
• Build: compilações.

O versionamento baseado em números, com significado comum e padronizado na empresa, busca melhorar a identificação do software em todas as fases de desenvolvimento e na própria implantação, permitindo:
• Acompanhamento visual da evolução do software;
• Identificação inequívoca das versões nos diferentes ambientes;
• Precisão na recompilação e retorno de versões;
• Rastreabilidade e auditoria do código-fonte;
• Implementação de modelos de desenvolvimento com ramos (uso de branches).

Mais informações sobre o padrão a ser seguido podem ser obtidas no site do PPDS > Capítulo de GCM > Diretrizes > Baseline de software (https://caixa.sharepoint.com/sites/PPDS/SitePages/GCM_Diretrizes_Padrao_Baseline.aspx ).

36 visits in last 30 days

<img width="1652" height="844" alt="image" src="https://github.com/user-attachments/assets/75f490b0-0d1b-4339-8e1d-00142bed1914" />


