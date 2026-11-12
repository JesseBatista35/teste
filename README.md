Complemento — valores encontrados no código do frontend (12/11/2026):

No arquivo src/environments/environment.des.ts, os endpoints estão definidos assim:
- endpoint / API_BASE_PATH: https://sibec-micro-des.apps.nprd.caixa/api
- parametrizacao / API_PARAMETRIZACAO_PATH: https://sibec-parametrizacao-des.apps.nprd.caixa/api
- dadosFamilia / API_DADOS_FAMILIA_PATH: https://sibec-dados-familia-des.apps.nprd.caixa/api
- arquivos / API_ARQUIVOS_PATH: https://sibec-arquivos-des.apps.nprd.caixa/api
- relatorios / API_RELATORIOS_PATH: https://sibec-relatorios-des.apps.nprd.caixa/api
- manutencao / API_MANUTENCAO_PATH: https://sibec-manutencao-des.apps.nprd.caixa/api
- gestao / API_GESTAO_PATH: https://sibec-gestao-des.apps.nprd.caixa/api
- HORARIO_ACESSO_INTERNET_INICIO: 07:00
- HORARIO_ACESSO_INTERNET_FINAL: 21:00

O valor de API_BASE_PATH encontrado no código aponta para a API sibec-micro DES, não para o endereço do frontend. Também não encontramos referência a HTTP_SERVICE_API no código-fonte deste frontend.

Importante: estes são valores versionados no arquivo de ambiente DES, não uma confirmação dos valores atualmente cadastrados na Library ou efetivos na release 1.0.0-SNAPSHOT(23). O angular.json usa environment.des.ts somente na configuração de build “des”; a configuração “production” usa environment.prod.ts com marcadores, que o script de inicialização substitui a partir das variáveis de ambiente. Poderiam confirmar se os valores listados são os valores oficiais/atuais de DES para a Library e orientar se a publicação atual foi construída com a configuração “des” ou “production”? Favor também confirmar com a equipe técnica se HTTP_SERVICE_API ainda é necessária fora do código deste frontend.

Não alteramos a Library e não solicitamos nova publicação. Aguardaremos a confirmação por esta REQ antes de prosseguir.
