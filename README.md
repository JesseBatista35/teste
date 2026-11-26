Assunto: DES – Erro 525 no API Gateway (Sandbox Integra+) ao acessar backend SAP – time de desenvolvimento sem login em DES

Prezados,

Encaminho a demanda para análise da equipe responsável pelo API Gateway (Sandbox) e pela integração com o backend SAP Integra+.

Cenário:
No ambiente de DES, o login das aplicações está falhando. Isso está impedindo todo o time de desenvolvimento de acessar o ambiente e de avançar nas tarefas abertas.

Erro observado:
A chamada abaixo retorna HTTP 525 gerado pelo próprio API Gateway:

URL: https://api.caixa.gov.br/sandbox/integramais/privado/empregado/cadastro/089319?$format=JSON&sap-client=710&saml2=disabled
Data/hora: 24/11/2026 14:58:25 GMT
x-azion-request-id: 0e9576376558e0934b9a6f6f602383f5
x-azion-edge-location: FLN
server: API Gateway
Tempo de resposta: ~575 ms
Retorno:
{"erro":"525","mensagem":"Não foi possível acessar o backend. ERRO [Erro indefinido na Conexão]"}

Análise preliminar (Esteiras DES/TQS):

A requisição chega normalmente à borda (Azion) e ao API Gateway, e é o próprio Gateway que devolve o erro.
O código 525 e a mensagem indicam falha na conexão ou no handshake SSL entre o API Gateway e o backend SAP Integra+ (mandante 710).
A resposta é rápida (~575 ms), o que indica recusa da conexão e não timeout.
Não identificamos relação com a pipeline, com o deploy ou com a infraestrutura da aplicação.

Solicitação:
Pedimos que verifiquem:

a disponibilidade do backend SAP Integra+ (mandante 710) em DES;
a validade e a cadeia do certificado SSL do backend e a confiança configurada no Gateway;
a rota e a conectividade entre o API Gateway (Sandbox) e o backend SAP.

O x-azion-request-id acima pode ser usado para rastrear a chamada nos logs do Gateway.

Fico à disposição para apoiar nos testes.

Atenciosamente,
Jessé Batista
Esteiras DevOps – CTIS/CESTI – DES/TQS NPRD
