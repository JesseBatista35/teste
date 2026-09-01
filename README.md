

Qual o tipo de serviço?*:	Ajustar ambiente ou parametrização de software
Informar o Ambiente:*:	DES
Nome do serviço ou sistema:*:	SIPGC NPRD
Janela de atendimento:*:	01/09/2026 00:00:00
Prazo final da janela de atendimento:*:	01/09/2026 00:00:00
Haverá previsão de indisponibilidade durante a execução do serviço:*:	Não
Contato do responsável pela validação do ambiente após alteração:*:	F540797 - Teams
F556565 - Teams
Descrição da solicitação:*:	Temos um ambiente no Premise da nuvem caixa na url:
https://sipgc-front-des.apps.nprd.caixa/gestao/papel
que chama um microserviço no OKD na url:
https://sipgc-api-papel-des.apps.nprd.caixa/api/v1/papeis?pagina=1&tamanhoPagina=100

Porem ao tentar fazer esta chamada do front para o back-end esta dando 504, mas direto pelo browser funciona. Acredito que o problema seja porque o pod chama https://login.microsoftonline.com para validar o token
Informar formas de contato:*:	F540797 - Teams
F556565 - Teams




Qual o tipo de serviço?*:	Ajustar ambiente ou parametrização de software
Informar o Ambiente:*:	DES
Nome do serviço ou sistema:*:	SIPGC NPRD
Janela de atendimento:*:	01/09/2026 00:00:00
Prazo final da janela de atendimento:*:	01/09/2026 00:00:00
Haverá previsão de indisponibilidade durante a execução do serviço:*:	Não
Contato do responsável pela validação do ambiente após alteração:*:	F540797 - Teams
F556565 - Teams
Descrição da solicitação:*:	Temos um ambiente no Premise da nuvem caixa na url:
https://sipgc-front-des.apps.nprd.caixa/gestao/membro
que chama um microserviço no OKD na url:
https://sipgc-api-membros-des.apps.nprd.caixa/api/v1/membros/Filtrar?pagina=1&tamanhoPagina=10

Porem ao tentar fazer esta chamada do front para o back-end esta dando 504, mas direto pelo browser funciona. Acredito que o problema seja porque o pod chama https://login.microsoftonline.com para validar o token
Informar formas de contato:*:	F540797 - Teams
F556565 - Teams


eu falei isso na sala teasm
WO0000081544393
WO0000081544560
Wladimir Vieira de Souza essas duas REQs, abertas pelo Pablo Messias Rodrigues dos Santos tem a mesma solicitação, da  WO0000081532778. 



ele disse isso agora:
Eu tentei indicar pelas rotas que se tratavam de serviços diferentes.  No caso, só essa solicitação do tipo proxy vai ser o suficiente para os outros serviços também ou apenas para sipgc-api-agrupamento-des.?
