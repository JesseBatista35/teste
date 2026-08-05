Atenção!:	Preencha os campos abaixo com as informações do certificado a ser instalado. Deve haver informação suficiente para identificar unicamente o certificado desejado.
Informe o CN (URL):	https://api.des.caixa
Informe a data de expiração:	6/2/2031
Informe o emissor:	CN = AC Icptestes Sub O = Caixa Economica Federal C = BR
Informe o número de série:	7e00000860471c4eedc7ea0650000000000860
Ambiente*:	DES
IC do Certificado:	AC Icptestes Sub
Área responsável pela operação do Certificado*:	CEPTIBR
Dados Complementares:	Prezados,

Por gentileza, solicito a instalação do certificado digital do API MANAGER no servidor da aplicação do SINAD.

Atenciosamente,
SUDEA07



Histórico de Informações de Trabalho da Ordem de Trabalho

ID da Ordem de Trabalho 	 WO0000081277950
Criado em 	 05/08/2026 13:26:54
Criado por 	 P768728
Origem de Comunicação 	 
Exibir Acesso 	 Público
Notas 	 Prezado(a),

Informamos que sua solicitação foi recebida.

Nosso SLA para atendimento é de até 24h úteis, analisaremos a solicitação para nos certificarmos que o atendimento está dentro do escopo de atuação da nossa equipe.

Caso seja identificado que o atendimento não corresponde ao nosso escopo, a solicitação será redirecionada à equipe responsável.

Novas informações e atualizações serão registradas diretamente nesta WO.

Atte.

Esteira Devops DES TQS NPRD
ID da Ordem de Trabalho 	 WO0000081277950
Criado em 	 05/08/2026 13:14:14
Criado por 	 P734144
Origem de Comunicação 	 
Exibir Acesso 	 Público
Notas 	 ►Não se trata de instalação de certificado no APIM, se trata de certificado do APIM no servidor da aplicação do SINAD, portanto, encaminhar para a equipe NPRD.

Atenciosamente,
Aguillera Portela - P734144
CTIS/CESTI/ESTEIRA - DEVOPS
ID da Ordem de Trabalho 	 WO0000081277950
Criado em 	 05/08/2026 12:07:15
Criado por 	 P768728
Origem de Comunicação 	 
Exibir Acesso 	 Público
Notas 	 A Equipe

Esteira Devops

Demanda não pertinente a equipe Esteira Devops NPRD.

Por se tratar de Instalação do certificado digital do API MANAGER

Atte

Esteira DEVOPS DES TQS NPRD
ID da Ordem de Trabalho 	 WO0000081277950
Criado em 	 05/08/2026 11:43:09
Criado por 	 P767992
Origem de Comunicação 	 
Exibir Acesso 	 Público
Notas 	 Demanda inicial sem viés de falha, erro, degradação ou
esgotamento de infraestrutura, serviço, máquina, armazenamento,
rotina ou situação que não esteja na iminência de tornar-se
incidente. Previsto atendimento em até 24 horas úteis.

[CENTRAL-SID]
ID da Ordem de Trabalho 	 WO0000081277950
Criado em 	 05/08/2026 11:35:04
Criado por 	 C161519
Origem de Comunicação 	 
Exibir Acesso 	 Público
Notas 	 Prezados(as),

1 – Disponibilizaremos o arquivo PKCS#12 através de compatilhamento de arquivo no OneDrive.

2 - Para solicitar o arquivo PKCS#12 e a inserção da senha do certificado no momento da instalação no ambiente o técnico deverá ingressar em um dos canais na equipe criada no Teams para essa finalidade. As orientações de como acessar a equipe e o link para os canais estão disponíveis através do link https://caixa.sharepoint.com/:w:/r/teams/O365GRP-CESET-Inserodesenhas/Documentos%20Compartilhados/General/Instru%C3%A7%C3%B5es%20da%20Equipe.docx?d=w427f7e74198a45bb91f6335e8595bde2&csf=1&web=1&e=0iQbhI

3 – Caso seja necessário extrair do arquivo PKCS#12 os arquivos .crt e .key, executar os comandos abaixo:
openssl pkcs12 -in INFILE.p12 -out OUTFILE.key -nodes -nocerts
openssl pkcs12 -in INFILE.p12 -out OUTFILE.crt -nokeys

Obs.: será solicitada a senha do arquivo PKCS#12.
Duvidas: https://www.ssl.com/pt/como/chave-privada-de-certificados-de-exporta%C3%A7%C3%A3o-do-arquivo-pkcs12-com-openssl/


Atenciosamente,
CEPRO – CN Proteções em Segurança Digital

Impresso por P585600 em Quarta-feira, 05/08/2026 16:14:45 
