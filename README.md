Temos um ambiente no Premise da nuvem caixa na url:
https://sipgc-front-des.apps.nprd.caixa/gestao/tipo-agrupamento
que chama um microserviço no OKD na url:
https://sipgc-api-agrupamento-des.apps.nprd.caixa/api/v1/TipoAgrupamentos?pagina=1&TamanhoPagina=1000

Porem ao tentar fazer esta chamada do front para o back-end esta dando 504, mas direto pelo browser funciona. Acredito que o problema seja porque o pod chama https://login.microsoftonline.com para validar o token
