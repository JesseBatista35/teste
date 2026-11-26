Prezados,

No ambiente de DES, o login das aplicações está falhando. Isso impede o time de desenvolvimento de evoluir nas tarefas.

A chamada abaixo retorna HTTP 525, gerado pelo próprio API Gateway:

https://api.caixa.gov.br/sandbox/integramais/privado/empregado/cadastro/089319?$format=JSON&sap-client=710&saml2=disabled

Retorno: {"erro":"525","mensagem":"Não foi possível acessar o backend. ERRO [Erro indefinido na Conexão]"}
Data/hora: 24/11/2026 14:58:25 GMT
x-azion-request-id: 0e9576376558e0934b9a6f6f602383f5

A requisição chega ao API Gateway, mas a conexão com o backend SAP Integra+ (mandante 710) falha. O erro não tem relação com a esteira ou com o deploy da aplicação.

Pedimos que verifiquem a disponibilidade e o certificado SSL do backend, além da conectividade entre o Gateway e o SAP.

Atenciosamente,
Jessé Batista – Esteiras DevOps DES/TQS
