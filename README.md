Fazer a Disponibilização do certificado digital para instalação em ambiente não produção (anexar o PKCS12) do certificado.


loginxdes.caixa.gov.br - AZION/CESTI


Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000081973727
Criado em	 20/10/2026 09:20:05
Criado por	 P768728
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Desconsiderar nota anterior
ID da Ordem de Trabalho	 WO0000081973727
Criado em	 20/10/2026 09:19:49
Criado por	 P768728
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Á Equipe

Esteira Devops

Demanda fora do escopo de atendimento da equipe Esteira NPRD DES e TQS.

Por se tratar de HMP.

Segue para avaliação do atendimento, caso não pertinente por favor encaminhar para a equipe responsável.

Atte.

Esteira Devops DES TQS
NPRD
ID da Ordem de Trabalho	 WO0000081973727
Criado em	 16/10/2026 12:06:16
Criado por	 P730708
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 
Campo "Notas" ajustado pelo Operação Datacenter conforme abaixo:

Fazer a Disponibilização do certificado digital para instalação em ambiente não produção (anexar o PKCS12) do certificado.


OBS: Mais informações detalhadas na REQ.
ID da Ordem de Trabalho	 WO0000081973727
Criado em	 16/10/2026 12:06:05
Criado por	 P730708
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda inicial sem viés de falha, erro, degradação ou esgotamento de infraestrutura, serviço, máquina, armazenamento, rotina ou situação que não esteja na iminência de tornar-se incidente. Previsto atendimento em até 24 horas úteis.
[CENTRAL-SID]
ID da Ordem de Trabalho	 WO0000081973727
Criado em	 16/10/2026 11:32:22
Criado por	 P558217
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a),

 

Informamos que sua solicitação foi recebida.

 

Conforme definição da Coordenação NPRD (CESTI36) e em conformidade com o fluxo de atendimento estabelecido para a Esteira DevOps NPRD, os atendimentos realizados por esta equipe seguem SLAs específicos, distintos dos praticados pelas demais macrocélulas.  

 

Dessa forma, o SLA desta solicitação foi ajustado para até 24 horas úteis, prazo aplicável à sua classificação.

 

Nesse período, a demanda será analisada para validação do escopo de atuação da equipe e definição do tratamento adequado.

 

Caso seja identificado que a solicitação não pertence ao escopo de atendimento da Esteira DevOps NPRD, a demanda será direcionada à equipe responsável, observando os fluxos e processos vigentes.

 

Novas informações e atualizações serão registradas diretamente nesta WO.

 

Atenciosamente,

 

Esteira DevOps NPRD
ID da Ordem de Trabalho	 WO0000081973727
Criado em	 16/10/2026 11:30:07
Criado por	 P600750
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
CAIXA/CESET/CN de Segurança Cibernética
ID da Ordem de Trabalho	 WO0000081973727
Criado em	 16/10/2026 11:29:31
Criado por	 P600750
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À CESTI;

Segue para análise e tratamento.
Retificando : O ambiente é Desenvolvimento.

Segue demanda anterior: WO0000080410589

Att,
CEPRO


ID da Ordem de Trabalho	 WO0000081973727
Criado em	 16/10/2026 11:25:43
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Terça-feira, 20/10/2026 09:39:08
