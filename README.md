O app está falhando no fluxo de autenticação OAuth contra a plataforma da Caixa.
O que está acontecendo:

Primeiro request (401): Tenta preautenticação na API
Segundo request (302): Tenta autorização e recebe redirect – mas algo falha no processamento
Resultado: Erro genérico no app: "Houve um erro desconhecido, tente novamente em alguns instantes"

Problema identificado:
O fluxo OAuth está quebrado. O servidor retorna um redirect (302) com um código de autorização, mas o app não consegue processar corretamente.
Possíveis causas:

Certificado de segurança inválido ou expirado
Client ID não autorizado para esse fluxo OAuth
Redirect URI configurado incorretamente no app
Código de autorização expirado ou rejeitado
Política de segurança bloqueando a sequência de requests

Ação necessária:
Precisamos que o time de Backend/Segurança da Caixa verifique:

Se o client_id está autorizado para OAuth
Se o redirect_uri está configurado corretamente
Se há restrições de segurança bloqueando esse fluxo
