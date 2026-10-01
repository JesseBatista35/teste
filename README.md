Disponibilzar certificado digital para instalação em ambiente não produção (anexar o PKCS12) do certificado.

1.2. Indicar os comandos de conversão de formatos do certificado, caso pertinente;
1.3. Ajuste da WO conforme a Janela de Instalação indicada nesta REQ;
1.4. Designar esta WO à área indicada na REQ como responsável pela instalação.


Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000081765245
Criado em	 30/09/2026 16:17:54
Criado por	 P995963
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda inicial sem viés de falha, erro, degradação ou esgotamento de infraestrutura, serviço, máquina, armazenamento, rotina ou situação que não esteja na iminência de tornar-se incidente. Previsto atendimento em até 24 horas úteis. [CENTRAL-SID]

OBS: Saneamento realizado considerando a nota anterior da equipe técnica que informa atendimento em até 24 horas úteis.
ID da Ordem de Trabalho	 WO0000081765245
Criado em	 30/09/2026 15:46:04
Criado por	 P507043
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a),



Informamos que sua solicitação foi recebida.  



Nosso SLA para atendimento é de até 24h úteis, analisaremos a solicitação para nos certificarmos que o atendimento está dentro do escopo de atuação da nossa equipe.



Caso seja identificado que o atendimento não corresponde ao nosso escopo, a solicitação será redirecionada à equipe responsável.



Novas informações e atualizações serão registradas diretamente nesta WO.



Atte.



Esteira Devops DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081765245
Criado em	 30/09/2026 15:42:27
Criado por	 P502678
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezados(as),

1 – Disponibilizaremos o arquivo PKCS#12 através de compartilhamento de arquivo no OneDrive.

2 - Para solicitar o arquivo PKCS#12 e a inserção da senha do certificado no momento da instalação no ambiente o técnico deverá ingressar em um dos canais na equipe criada no Teams para essa finalidade. As orientações de como acessar a equipe e o link para os canais estão disponíveis através do link https://caixa.sharepoint.com/:w:/r/teams/O365GRP-CESET-Inserodesenhas/Documentos%20Compartilhados/General/Instru%C3%A7%C3%B5es%20da%20Equipe.docx?d=w427f7e74198a45bb91f6335e8595bde2&csf=1&web=1&e=0iQbhI

03 – Caso seja necessário extrair do arquivo PKCS#12 os arquivos .crt e .key, executar os comandos abaixo:

openssl pkcs12 -in INFILE.p12 -out OUTFILE.key -nodes -nocerts
openssl pkcs12 -in INFILE.p12 -out OUTFILE.crt -nokeys

Obs.: será solicitada a senha do arquivo PKCS#12.

Duvidas: https://www.ssl.com/pt/como/chave-privada-de-certificados-de-exporta%C3%A7%C3%A3o-do-arquivo-pkcs12-com-openssl/

4 - Informamos que a cadeia de certificados NPRD (ACInternaIcptestes) está disponível em http://icptestes.caixa/ .

 
Atenciosamente,
CAIXA/CEPRO/CN de Segurança Cibernética
ID da Ordem de Trabalho	 WO0000081765245
Criado em	 30/09/2026 15:41:22
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Quinta-feira, 01/10/2026 15:15:56
