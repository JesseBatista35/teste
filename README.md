Prezados,

Solicito a reabertura da solicitação, pois o problema permanece ocorrendo na estação cliente e continua impedindo a utilização do sistema.

Embora a análise tenha confirmado que o backend e a rota estão operacionais, a evidência apresentada no navegador continua demonstrando erro de SSL/TLS:

net::ERR_CERT_AUTHORITY_INVALID

As chamadas para os endpoints do backend são bloqueadas pelo navegador, gerando erro 0 (Unknown Error) no frontend e impossibilitando o carregamento das funcionalidades da aplicação.

Solicito apoio para identificar qual autoridade certificadora (Root CA e intermediárias) deve estar presente na estação e para validar se a cadeia de certificação utilizada pelo ambiente DES é a mesma esperada para acesso pelos usuários finais.

Necessitamos de orientação de infraestrutura quanto aos certificados corporativos exigidos, bem como procedimento de validação da cadeia de confiança na estação cliente, uma vez que o problema continua ocorrendo mesmo com o backend operacional.

Evidências:
- Erro no navegador: ERR_CERT_AUTHORITY_INVALID
- APIs bloqueadas por falha de validação SSL/TLS
- Frontend recebendo erro 0 (Unknown Error)

Atenciosamente.
Christian Vladimir Uhdre Mulato.


Jesse Mouta Pereira Batista Poderia me ajudar?
 
Impedimento:
 
O SIEPR em DES continua apresentando falha de SSL/TLS nas chamadas do frontend para o backend. O navegador retorna ERR_CERT_AUTHORITY_INVALID, bloqueando o consumo das APIs e impedindo o carregamento das funcionalidades da aplicação.
 
A análise anterior confirmou backend e rota operacionais, porém o problema de confiança do certificado permanece na estação cliente.
 
Ação:
 
Chamado REQ000146468560 reaberto e será encaminhado ao Jesse (Infra Azure) para apoio na validação da cadeia de certificados e da configuração SSL do ambiente DES.
 
 
