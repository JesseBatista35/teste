
Bom dia, ao executar a pipeline da tag 1.121.0.0, e gerar a release, o ambiente de DES é atualizado com a versão correta, mas o de TQS não atualiza, verificar se o deploy acontece na pasta correta do Jboss, segue as evidencias. 

RELEASE DES:
https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=503638&environmentId=2339636

RELEASE TQS:
https://devops.caixa/projetos/Caixa/_releaseProgress?releaseId=503638&environmentId=2339637&itemType=VariableGroups&_a=release-environment-logs

de acordo com a release implantada, os dois ambientes deveriam está na versão 1.121.0.0








Last failed login: Thu Jul 30 17:35:09 -03 2026 from 10.122.150.31 on ssh:notty
There were 2 failed login attempts since the last successful login.
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$





Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000081208458
Criado em	 30/07/2026 17:16:46
Criado por	 P558217
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a),



Informamos que sua solicitação foi recebida.  



Nosso SLA para atendimento é de até 24h úteis, analisaremos a solicitação para nos certificarmos que o atendimento está dentro do escopo de atuação da nossa equipe.



Caso seja identificado que o atendimento não corresponde ao nosso escopo, a solicitação será redirecionada à equipe responsável.



Novas informações e atualizações serão registradas diretamente nesta WO.



Atte.



Esteira Devops DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081208458
Criado em	 30/07/2026 17:15:12
Criado por	 P705973
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Segue posicionamento técnico.

Atenciosamente,
Susane de Oliveira
Preposta de Redes Datacenter
ID da Ordem de Trabalho	 WO0000081208458
Criado em	 30/07/2026 17:12:25
Criado por	 P751081
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezados,

Segue as informações solicitadas:

VIP: sisaq-web.esteiras.des.caixa (10.116.180.245)

-VIP configurado nas portas TCP/80 e TCP/443.
-Balanceamento direcionado para o servidor SR_CADDEAPLLX1908 na porta 80.
-Certificado SSL configurado no VIP: CT_esteiras.des.caixa_18042029.

VIP: sisaq-web.esteiras.tqs.caixa (10.116.180.246)

-VIP configurado nas portas TCP/80 e TCP/443.
-Balanceamento direcionado para o servidor/IP 10.116.198.210 na porta 80.
-Certificado SSL configurado no VIP: CT_esteiras.tqs.caixa_03052029.

Att,
João Victor Sousa Prudencio
Analista de Datacenter - Redes
TELEDATA/CETEL/REDES
ID da Ordem de Trabalho	 WO0000081208458
Criado em	 30/07/2026 16:50:40
Criado por	 P686198
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À Equipe rede CETEL,

1. Favor informar qual IP e PORTA de como está configurado nos VIPs abaixo o balanceamento para as VMs e informar se os VIPs estão com certificado configurado no VIP.

sisaq-web.esteiras.des.caixa - 10.116.180.245
sisaq-web.esteiras.tqs.caixa - 10.116.180.246

2. Após atendimento favor devolver para CTIS > CESTI > Esteira - Devops DES E TQS para nova analise.
Atenciosamente,

Rainier Barbosa dos Santos Viana

Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081208458
Criado em	 29/07/2026 17:37:36
Criado por	 P686198
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À CAIXA
Prezado(a),
Informamos que estamos em processo de configuração do JBOSS, devido ao fato da aplicação estar referenciando uma outra VM.

Atenciosamente,

Rainier Barbosa dos Santos Viana

Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081208458
Criado em	 29/07/2026 12:45:06
Criado por	 P730708
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda inicial sem viés de falha, erro, degradação ou
esgotamento de infraestrutura, serviço, máquina, armazenamento,
rotina ou situação que não esteja na iminência de tornar-se
incidente. Previsto atendimento em até 24 horas úteis.

[CENTRAL-SID]
ID da Ordem de Trabalho	 WO0000081208458
Criado em	 29/07/2026 12:16:09
Criado por	 P768728
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a),

Informamos que sua solicitação foi recebida.

Nosso SLA para atendimento é de até 24h úteis, analisaremos a solicitação para nos certificarmos que o atendimento está dentro do escopo de atuação da nossa equipe.

Caso seja identificado que o atendimento não corresponde ao nosso escopo, a solicitação será redirecionada à equipe responsável.

Novas informações e atualizações serão registradas diretamente nesta WO.

Atte.

Esteira Devops DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081208458
Criado em	 29/07/2026 11:55:51
Criado por	 F512424
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Anexo do Registro de Solicitação.
ID da Ordem de Trabalho	 WO0000081208458
Criado em	 29/07/2026 11:55:50
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Quinta-feira, 30/07/2026 17:36:29



estou logoado no jbos me ajuda a verificar para qual vip esta apontaod a configuraçao 

me ajuda com os comandos para verifiar se bate com que a cetel a mandou








Prezados,
 
Segue as informações solicitadas:
 
VIP: sisaq-web.esteiras.des.caixa (10.116.180.245)
 
-VIP configurado nas portas TCP/80 e TCP/443.
-Balanceamento direcionado para o servidor SR_CADDEAPLLX1908 na porta 80.
-Certificado SSL configurado no VIP: CT_esteiras.des.caixa_18042029.
 
VIP: sisaq-web.esteiras.tqs.caixa (10.116.180.246)
 
-VIP configurado nas portas TCP/80 e TCP/443.
-Balanceamento direcionado para o servidor/IP 10.116.198.210 na porta 80.
-Certificado SSL configurado no VIP: CT_esteiras.tqs.caixa_03052029.
 
Att,
João Victor Sousa Prudencio
Analista de Datacenter - Redes
TELEDATA/CETEL/REDES
