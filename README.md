Fazer Suporte ao ambiente de aplicação nas esteiras DevOps
Qual o nome do Sistema?*:	SID01-lancamentos-financeiros-OKD4
Qual o ambiente*:	TQS
Selecione a sua Comunidade*:	Depósitos e Captação
Formas de contato*:	Entrar em contato via Teams

Pedro Barrella Vasconcellos - c161251

Prestadores de serviço da REQ anterior:
p781026 - Everton Heleno de Almeida
P585600 - Jessé Mouta Pereira Batista
Descrição da necessidade*:	- Continuação da REQ000145849640.

O ambiente TQS da API sid01-lançamentos-financeiros não se comunica com o CICS Web. O erro retornado pela API com a mensagem: "Integração CicsWeb".

O programa COBOL D01POSOL e a transação N1W1 foram analisados junto ao Everton Heleno de Almeida. A análise não encontrou problema no programa COBOL. A análise não encontrou problema na transação.

Foi identificado que a chamada da transação N1W1 não está sendo recebida pelo CICS Web do TQS. A evidência de mais de 2.000 execuções, apontada pela equipe de Mainframe na REQ anterior, corresponde ao ambiente DES, não ao ambiente TQS. Não há execução da transação registrada em TQS, pois a API não consegue se comunicar com o CICS nesse ambiente.

Foi identificado que problema está na plataforma de "Baixa". O problema está na comunicação entre o ambiente TQS e o CICS. Foi apontado possível causa um problema de proxy e/ou de configuração da library.

Solicito o atendimento do time responsável pela camada de "Baixa" e pela comunicação TQS-CICS.
