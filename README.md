Após a substituição da task CRIA_IMAGE_OKD_QUARKUS por CRIA_IMAGE_OKD_QUARKUS - Application Insights, a Build passou a ser concluída com sucesso, incluindo geração da imagem, publicação no registry e criação da tag:

build-images-ads/sirex-agenda-api-esteiras:20260929.1437-0.2.4.5-SNAPSHOT

Entretanto, a Release falha na etapa:

Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP

Conforme log da Release, a etapa realiza consulta ao ImageStream:

build-images-ads/sirex-agenda-api

com retorno:

HTTP 404

A tag 20260929.1437-0.2.4.5-SNAPSHOT não foi encontrada no ImageStream de Build.

Durante a análise, verificamos que a Build conclui com sucesso e cria a tag:

build-images-ads/sirex-agenda-api-esteiras:20260929.1437-0.2.4.5-SNAPSHOT

Solicitamos apoio para validar a configuração da etapa de Release responsável pela localização da imagem, uma vez que a Build é concluída com sucesso e a tag é criada normalmente.

Links para análise:
 
Release:
https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=534107&environmentId=2481273

Build/Pipeline:
https://devops.caixa/projetos/Caixa/_build/results?buildId=836929&view=logs&j=275f1d19-1bd8-5591-b06b-07d489ea915a

Evidências anexadas:

- Log da etapa Criando Image Tag - Build.BuildNumber;
- Log da etapa Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP.

Atenciosamente,

Ronaldo C. Oliveira



Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000081750843
Criado em	 30/09/2026 09:45:01
Criado por	 C140030
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezados,

Solicito a reavaliação da análise registrada nesse atendimento.

A devolutiva informa que as imagens deixaram de ser geradas. Entretanto, os logs anexados comprovam que a Build foi concluída com sucesso e publicou a tag:

build-images-ads/sirex-agenda-api-esteiras:20260929.1437-0.2.4.5-SNAPSHOT


A Release, porém, consulta outro ImageStream:

build-images-ads/sirex-agenda-api

e retorna:

HTTP 404
A tag não foi encontrada no ImageStream de Build

A evidência apresentada no atendimento confirma apenas que sirex-agenda-api não recebe novas tags desde 22/09/2026, mas não invalida a geração comprovada em sirex-agenda-api-esteiras.

Também foi informado que a task CRIA_IMAGE_OKD_QUARKUS - Application Insights não é atualizada desde 2022, porém não foi apresentada evidência sobre seu histórico ou data de atualização.

Solicitamos esclarecer:

Se a publicação em sirex-agenda-api-esteiras é o comportamento esperado da task;
Se a Release deve consultar esse mesmo ImageStream;

Release:
https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=534107&environmentId=2481273

Build/Pipeline:
https://devops.caixa/projetos/Caixa/_build/results?buildId=836929&view=logs&j=275f1d19-1bd8-5591-b06b-07d489ea915a


Atenciosamente,


Ronaldo C. Oliveira
c140030
ID da Ordem de Trabalho	 WO0000081750843
Criado em	 29/09/2026 21:02:47
Criado por	 P744064
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Boa noite!

Em análise do ambiente, foi evidenciado que após a execução da WO0000081716490 as imagens do okd pararam de ser geradas e a última foi a "sirex-agenda-api:20260922.1331-0.2.4.5-SNAPSHOT".

A task "CRIA_IMAGE_OKD_QUARKUS - Application Insights" está muito antiga com última atualização em 2022. Deve ser verificado uma possível volta destas configurações para a anterior.

At.te,

Wellington Silva
ID da Ordem de Trabalho	 WO0000081750843
Criado em	 29/09/2026 16:36:54
Criado por	 P779123
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda inicial sem viés de falha, erro, degradação ou esgotamento de infraestrutura, serviço, máquina, armazenamento, rotina ou situação que não esteja na iminência de tornar-se incidente. Previsto atendimento em até 24 horas.[CENTRAL-SID]
OBS: Saneamento realizado considerando a nota anterior da equipe técnica que informa atendimento em até 24 horas
ID da Ordem de Trabalho	 WO0000081750843
Criado em	 29/09/2026 15:37:13
Criado por	 P768728
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a),

Informamos que sua solicitação foi recebida.

Nosso SLA para atendimento é de até 24h úteis, analisaremos a solicitação para nos certificarmos que o atendimento está dentro do escopo de atuação da nossa equipe.

Caso seja identificado que o atendimento não corresponde ao nosso escopo, a solicitação será redirecionada à equipe responsável.

Novas informações e atualizações serão registradas diretamente nesta WO.

Atte.

Esteira Devops DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081750843
Criado em	 29/09/2026 15:33:30
Criado por	 C140030
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Anexo do Registro de Solicitação.
ID da Ordem de Trabalho	 WO0000081750843
Criado em	 29/09/2026 15:33:28
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Quarta-feira, 30/09/2026 10:04:50


