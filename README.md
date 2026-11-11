Bom dia!

Tudo bem, e com vocês?

Para formalizar, podem abrir a REQ no serviço de suporte às esteiras DevOps NPRD (categoria [AJUSTAR: nome do item de catálogo de esteira/release DES]), direcionada à nossa equipe (CESTI – DES/TQS NPRD).

Para agilizar o atendimento, peço que a REQ contenha:

Sistema/módulo: SIBEC3, com o nome exato do repositório/pipeline no Azure DevOps.
Build: pipeline 874372, com o link da execução e a tag/versão da imagem gerada.
Release: nome da release e o stage DES, com o link da última execução, se houver.
Ambiente: DES, com o namespace no OKD, se souberem.
Versão esperada x versão atual: qual versão deveria estar publicada e qual vocês observam hoje (ex.: endpoint de versão, tela “sobre” ou log da aplicação).
Variáveis SSO: nome do grupo de variáveis (Library) e a lista das variáveis SSO que devem chegar à aplicação. Não é necessário informar os valores sensíveis, apenas os nomes.
Como a aplicação lê essas variáveis: env do pod, arquivo de configuração, secret etc.
Sintoma atual, se houver: erro de login/redirect, prints ou trecho de log.
Referência à REQ000147011905 (ClientID), para mantermos a rastreabilidade entre as demandas.
Contato técnico do lado de vocês e alinhamento com o Rafael para a janela de atualização em DES.

Com isso, confirmamos a versão publicada, executamos a release para DES se necessário e validamos se as variáveis da Library estão sendo injetadas corretamente no pod.
