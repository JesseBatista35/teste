Olá! Sobre os pontos levantados:

A publicação atual foi construída com a configuração “production”. O bundle publicado em DES contém os marcadores API...PATH, presentes apenas no environment.prod.ts, que são substituídos na inicialização a partir das variáveis _ENV.* da Library.
As sete rotas listadas no environment.des.ts existem no OKD em DES, no namespace sibec-des: sibec-micro, sibec-parametrizacao, sibec-dados-familia, sibec-arquivos, sibec-relatorios, sibec-manutencao e sibec-gestao.
A definição dos endereços de API é da equipe de desenvolvimento. Como os valores vêm do próprio environment.des.ts do projeto, posso cadastrá-los no grupo SIEPR-CURSO-BEC3-FRONTEND-DES, incluindo a correção do _ENV.API_BASE_PATH para https://sibec-micro-des.apps.nprd.caixa/api.
A HTTP_SERVICE_API não tem o prefixo _ENV., portanto não é entregue ao frontend. Como não há referência a ela no código, será mantida sem alteração.



Variável	Valor
_ENV.API_BASE_PATH	https://sibec-micro-des.apps.nprd.caixa/api (alterar)
_ENV.API_PARAMETRIZACAO_PATH	https://sibec-parametrizacao-des.apps.nprd.caixa/api
_ENV.API_DADOS_FAMILIA_PATH	https://sibec-dados-familia-des.apps.nprd.caixa/api
_ENV.API_ARQUIVOS_PATH	https://sibec-arquivos-des.apps.nprd.caixa/api
_ENV.API_RELATORIOS_PATH	https://sibec-relatorios-des.apps.nprd.caixa/api
_ENV.API_MANUTENCAO_PATH	https://sibec-manutencao-des.apps.nprd.caixa/api
_ENV.API_GESTAO_PATH	https://sibec-gestao-des.apps.nprd.caixa/api
_ENV.HORARIO_ACESSO_INTERNET_INICIO	07:00
_ENV.HORARIO_ACESSO_INTERNET_FINAL	21:00
