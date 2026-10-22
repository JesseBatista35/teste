Realizar o processo do agente SIGDB que não está em execução ou não está se conectando ao mainframe, conforme detalhamento em REQ.


Unidade do Solicitante*:	7260
Empresa Designada*:	HITSS
Organização Designada*:	CEMOT
Nome do Grupo Designado*:	BR - Produção de Sistemas Batch
Sumário*:	Suporte à Aplicação Multiplataforma
Descrição*:	Conforme tratado pelo INC00150780, Foi identificada a ausência do agente SIGDB nos servidores caddeapllx2480.agil.nprd.caixa.gov.br (Ambiente de Desenvolvimento) e cadnpcldlx1508.agil.caixa.gov.br (Ambiente de Produção).

Não esta inicializando o agente SIGDB automaticamente, pois os arquivo RUN, disponivel.
Impacto*:	Não
Justificativa para a execução*:	No novo AMBIENTE NA ESTEIRA DEVOPS (BATCH no Terraform), o processo do agente SIGDB não está em execução ou não está se conectando ao mainframe.


Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000082023686
Criado em	 22/10/2026 11:25:01
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
ID da Ordem de Trabalho	 WO0000082023686
Criado em	 22/10/2026 10:15:04
Criado por	 P512077
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À CAIXA.

O problema no systemctl sigdb.service, ocorre pq o script run não possui a instrução #!/bin/bash

no inicio do arquivo

Atte
Dyego dos Santos Barros
CTIS/CESTI/ESTEIRA - DEVOPS
ID da Ordem de Trabalho	 WO0000082023686
Criado em	 21/10/2026 23:14:41
Criado por	 P744064
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Boa noite!

Seguem observações do ambiente:

1 - Processo sigdb no ar:

[root@caddeapllx2480 sigdb]# ps -ef | grep -i sigdb
root      143707       1  0 21:45 pts/1    00:00:00 ./AgtSigdb -mtr7261lx480 -h10.192.224.66 -i10.116.200.237
root      143812  143437  0 22:19 pts/1    00:00:00 grep --color=auto -i sig
[root@caddeapllx2480 sigdb]#

2 - Processo manual está funcionando normalmente:

[root@caddeapllx2480 sigdb]# /etc/init.d/sigdb
[root@caddeapllx2480 sigdb]# nohup: anexando saída a 'nohup.out'

3 - Teste local funcionando:

[root@caddeapllx2480 sigdb]# ./Sigdb /c SIHEX /var/sistemas/SIHEX/ENTRADA/
/tmp/fileVI9ZAj
Tentando conectar...
Recebido Pacote de 35 Bytes GDBA            002-1006
Fechando Conexao
Erro -1006 no Cadastramento
[root@caddeapllx2480 sigdb]#

4 - pelo systemctl está ocorrendo erro:
[root@caddeapllx2480 sigdb]# systemctl status sigdb.service
× sigdb.service - Agente SIGDB
    Loaded: loaded (/etc/systemd/system/sigdb.service; enabled; preset: disabled)
    Active: failed (Result: exit-code) since Wed 2026-10-21 21:14:44 -03; 1h 13min ago
   Process: 143529 ExecStart=/sigdb/run (code=exited, status=203/EXEC)
       CPU: 736us

out 21 21:14:43 caddeapllx2480.agil.nprd.caixa.gov.br systemd[1]: sigdb.service: Failed with result 'exit-code'.
out 21 21:14:43 caddeapllx2480.agil.nprd.caixa.gov.br systemd[1]: Failed to start Agente SIGDB.
out 21 21:14:44 caddeapllx2480.agil.nprd.caixa.gov.br systemd[1]: sigdb.service: Scheduled restart job, restart counter is at 5.
out 21 21:14:44 caddeapllx2480.agil.nprd.caixa.gov.br systemd[1]: Stopped Agente SIGDB.
out 21 21:14:44 caddeapllx2480.agil.nprd.caixa.gov.br systemd[1]: sigdb.service: Start request repeated too quickly.
out 21 21:14:44 caddeapllx2480.agil.nprd.caixa.gov.br systemd[1]: sigdb.service: Failed with result 'exit-code'.
out 21 21:14:44 caddeapllx2480.agil.nprd.caixa.gov.br systemd[1]: Failed to start Agente SIGDB.
out 21 21:14:49 caddeapllx2480.agil.nprd.caixa.gov.br systemd[1]: sigdb.service: Start request repeated too quickly.
out 21 21:14:49 caddeapllx2480.agil.nprd.caixa.gov.br systemd[1]: sigdb.service: Failed with result 'exit-code'.
out 21 21:14:49 caddeapllx2480.agil.nprd.caixa.gov.br systemd[1]: Failed to start Agente SIGDB.
[root@caddeapllx2480 sigdb]#

Obs. Será direcionado para infra para análise do start do systemctl que está apresentando erro.

At.te,

Wellington Silva
ID da Ordem de Trabalho	 WO0000082023686
Criado em	 21/10/2026 20:54:57
Criado por	 P730574
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 
À
CAIXA,

1- Qual erro ou problema identificado?
Falha no start do serviço

2- O que foi feito? (Ações, Procedimentos, Acionamentos)

Verificado que o serviço configurado não esta funcionando corretamente, tendo em vista que o mesmo esta ativo desde o dia 09/10[anexo]. Sendo assim solicito a configuração correta dos serviço em DES para seguir a configuração em produção.

[root@caddeapllx2480 sigdb]# systemctl status sigdb.service
○ sigdb.service - Agente SIGDB
    Loaded: loaded (/etc/systemd/system/sigdb.service; enabled; preset: disabled)
    Active: inactive (dead)
[root@caddeapllx2480 sigdb]# systemctl start  sigdb.service
Job for sigdb.service failed because the control process exited with error code.
See "systemctl status sigdb.service" and "journalctl -xeu sigdb.service" for details.
[root@caddeapllx2480 sigdb]# systemctl status sigdb.service
× sigdb.service - Agente SIGDB
    Loaded: loaded (/etc/systemd/system/sigdb.service; enabled; preset: disabled)
    Active: failed (Result: exit-code) since Wed 2026-10-21 20:45:56 -03; 4s ago
   Process: 143350 ExecStart=/sigdb/run (code=exited, status=203/EXEC)
       CPU: 818us

out 21 20:45:56 caddeapllx2480.agil.nprd.caixa.gov.br systemd[1]: sigdb.service: Scheduled restart job, restart counter is at 5.
out 21 20:45:56 caddeapllx2480.agil.nprd.caixa.gov.br systemd[1]: Stopped Agente SIGDB.
out 21 20:45:56 caddeapllx2480.agil.nprd.caixa.gov.br systemd[1]: sigdb.service: Start request repeated too quickly.
out 21 20:45:56 caddeapllx2480.agil.nprd.caixa.gov.br systemd[1]: sigdb.service: Failed with result 'exit-code'.
out 21 20:45:56 caddeapllx2480.agil.nprd.caixa.gov.br systemd[1]: Failed to start Agente SIGDB.
[root@caddeapllx2480 sigdb]# ls /usr/lib^C
[root@caddeapllx2480 sigdb]# ss -tuanp | grep AgtSigdb
tcp   LISTEN    0      3             0.0.0.0:35000         0.0.0.0:*     users:(("AgtSigdb",pid=86352,fd=5))
[root@caddeapllx2480 sigdb]# ps -ef | grep 86352
root       86352       1  0 out09 ?        00:01:54 ./AgtSigdb -mtr7261lx480 -h10.192.224.66 -i10.116.200.237
root      143358  143039  0 20:47 pts/0    00:00:00 grep --color=auto 86352
[root@caddeapllx2480 sigdb]# date
qua 21 out 2026 20:50:29 -03
[root@caddeapllx2480 sigdb]#






3- Envolvimento em Alguma Sala (SIM/NÃO - Se sim, postar o link e informar os Participantes Envolvidos:):


4- Causa Raiz/Motivação (REQ / MUD):
WO0000082023686

5- Solução Aplicada: Definitiva ou de Contorno (Nesse caso necessita abrir PBI para investigar?):


6- Verificar se há necessidade de reclassificar o incidente para ajustes de conformidade.

Atenciosamente,
Danilo Albuquerque - P730574
CTIS/CESTI/ESTEIRAS DEVOPS
ID da Ordem de Trabalho	 WO0000082023686
Criado em	 21/10/2026 15:27:13
Criado por	 P558217
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À Equipe  

Esteira Devops

Segue para análise conforme nota técnica anterior.

Atte.

CTIS / CESTI Esteira DEVOPS DES TQS
ID da Ordem de Trabalho	 WO0000082023686
Criado em	 21/10/2026 15:22:47
Criado por	 P573448
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a),
Identificado que o agente SIGDB não possuía serviço registrado no systemd para inicialização automática no boot. Foi criada e habilitada a unit sigdb.service apontando para o binário /sigdb/run no servidor de desenvolvimento.

Evidência:

[root@caddeapllx2480 p573448]# systemctl enable sigdb
Created symlink /etc/systemd/system/multi-user.target.wants/sigdb.service → /etc/systemd/system/sigdb.service.
[root@caddeapllx2480 p573448]# systemctl is-enabled sigdb
enabled
[root@caddeapllx2480 p573448]# systemctl status sigdb
○ sigdb.service - Agente SIGDB
    Loaded: loaded (/etc/systemd/system/sigdb.service; enabled; preset: disabled)
    Active: active (running)
[root@caddeapllx2480 p573448]# ps -ef|grep -i sigdb
root       86352       1  0 out09 ?        00:01:51 ./AgtSigdb -mtr7261lx480 -h10.192.224.66 -i10.116.200.237
root      142045  141932  0 13:35 pts/0    00:00:00 grep --color=auto -i sigdb
[root@caddeapllx2480 p573448]#

Quanto à comunicação com o mainframe, o processo encontra-se em escuta local na porta TCP 35000 e os testes de conectividade e rota de rede a partir da interface local foram concluídos com sucesso.
Evidência:

[root@caddeapllx2480 p573448]# ss -tuanp | grep AgtSigdb
tcp   LISTEN    0      3             0.0.0.0:35000         0.0.0.0:*     users:(("AgtSigdb",pid=86352,fd=5))
[root@caddeapllx2480 p573448]# ls -la /var/sistemas/SIHEX/ENTRADA/
total 2
drwxrwxrwx+ 2 f708258 desenv   0 fev  6  2026 .
drwxrwxrwx+ 7     185 nobody 126 fev  6  2026 ..
[root@caddeapllx2480 p573448]# ip a | grep 10.116.200.237
   inet 10.116.200.237/19 brd 10.116.223.255 scope global noprefixroute ens192
[root@caddeapllx2480 p573448]# ip route get 10.192.224.66
10.192.224.66 via 10.116.192.1 dev ens192 src 10.116.200.237 uid 0
   cache
[root@caddeapllx2480 p573448]# ping -c 4 -I 10.116.200.237 10.192.224.66
PING 10.192.224.66 (10.192.224.66) de 10.116.200.237 : 56(84) bytes de dados.
64 bytes de 10.192.224.66: icmp_seq=1 ttl=59 tempo=0.562 ms
64 bytes de 10.192.224.66: icmp_seq=2 ttl=59 tempo=0.614 ms
64 bytes de 10.192.224.66: icmp_seq=3 ttl=59 tempo=0.669 ms
64 bytes de 10.192.224.66: icmp_seq=4 ttl=59 tempo=0.652 ms

--- 10.192.224.66 estatísticas de ping ---
4 pacotes transmitidos, 4 recebidos, 0% packet loss, time 3077ms
rtt min/avg/max/mdev = 0.562/0.624/0.669/0.041 ms

Observação:
O time de esteira devops DES e TQS não realiza suporte em ambiente produtivo, para tratativa e verificação no ambiente produtivo (cadnpcldlx1508.agil.caixa.gov.br) estamos encaminhando o atendimento para a equipe responsável.
ID da Ordem de Trabalho	 WO0000082023686
Criado em	 21/10/2026 11:07:37
Criado por	 P779479
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Campo ''Notas'' ajustado pela Operação Datacenter conforme abaixo:

Realizar o processo do agente SIGDB que não está em execução ou não está se conectando ao mainframe, conforme detalhamento em REQ.
ID da Ordem de Trabalho	 WO0000082023686
Criado em	 21/10/2026 11:06:24
Criado por	 P779479
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda inicial com viés de falha, erro, degradação ou esgotamento de infraestrutura, serviço, máquina, armazenamento, rotina ou situação que esteja na iminência de tornar-se incidente. Previsto atendimento em até 8 horas.

[CENTRAL-SID]
ID da Ordem de Trabalho	 WO0000082023686
Criado em	 19/10/2026 17:27:52
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Quinta-feira, 22/10/2026 11:54:19




<img width="1065" height="435" alt="WO0000082023686-sigdb-001" src="https://github.com/user-attachments/assets/51883060-c517-4c23-8294-c4be9a38285b" />


