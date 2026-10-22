À CAIXA,

1- Qual erro ou problema identificado?
O serviço sigdb.service (systemd) do servidor caddeapllx2480 (DES) falhava ao iniciar com status=203/EXEC. Com isso, o agente SIGDB não era iniciado automaticamente e só funcionava quando iniciado manualmente.

2- O que foi feito? (Ações, Procedimentos, Acionamentos)

Identificado que o script /sigdb/run, chamado pela unit do systemd, não possuía a instrução de interpretador (#!/bin/bash) na primeira linha, o que impedia sua execução pelo systemd. Foram descartadas as hipóteses de permissão, quebra de linha CRLF e SELinux (desabilitado no servidor).
Realizado backup dos arquivos (/sigdb/run.bkp.20261022 e /root/sigdb.service.bkp.20261022).
Incluída a instrução #!/bin/bash no início do /sigdb/run.
Encerrado o processo do agente iniciado manualmente, para liberar a porta 35000.
Executados daemon-reload, reset-failed e start do serviço.
Validado o ciclo stop/start: o agente sobe e para corretamente pelo systemd, com a porta 35000 em LISTEN.

Evidência:

● sigdb.service - Agente SIGDB
     Loaded: loaded (/etc/systemd/system/sigdb.service; enabled; preset: disabled)
     Active: active (running) since Thu 2026-10-22 12:41:44 -03
    Process: 147204 ExecStart=/sigdb/run (code=exited, status=0/SUCCESS)
   Main PID: 147205 (AgtSigdb)

LISTEN 0 3 0.0.0.0:35000 0.0.0.0:* users:(("AgtSigdb",pid=147220,fd=5))
MainPID=147220

3- Envolvimento em Alguma Sala: Não.

4- Causa Raiz/Motivação: O script /sigdb/run não possuía shebang (#!/bin/bash), o que impedia sua execução pelo systemd (erro 203/EXEC).

5- Solução Aplicada: Definitiva para a inicialização automática do agente SIGDB no ambiente DES.

6- Orientação para continuidade (cadastro no mainframe):

O teste de envio realizado a partir do servidor estabelece conexão com o mainframe, porém recebe o retorno de erro de cadastro:

[root@caddeapllx2480 sigdb]# ./Sigdb /c SIHEX /var/sistemas/SIHEX/ENTRADA/
Tentando conectar...
Recebido Pacote de 35 Bytes GDBA            002-1006
Fechando Conexao
Erro -1006 no Cadastramento

A comunicação de rede e o agente estão operacionais. O retorno -1006 é gerado pelo mainframe e indica ausência ou pendência de cadastro no SIGDB para este agente e/ou sistema. Por se tratar de cadastro da aplicação, a tratativa está fora do escopo da Esteira DevOps NPRD.

Orientamos que a equipe de desenvolvimento abra chamado para a equipe responsável pelo SIGDB no mainframe, solicitando o cadastro e a liberação do agente com as seguintes informações:

Item	Valor
Ambiente	Desenvolvimento (DES)
Servidor	caddeapllx2480.agil.nprd.caixa.gov.br
IP do servidor	10.116.200.237
Nome do agente (parâmetro -m)	tr7261lx480
Host de destino (mainframe)	10.192.224.66
Porta do agente	35000/TCP
Sistema	SIHEX
Diretório de entrada	/var/sistemas/SIHEX/ENTRADA/
Erro retornado	GDBA 002-1006 – Erro -1006 no Cadastramento

O chamado também deve informar os arquivos e transmissões que o sistema SIHEX precisa realizar via SIGDB, dado que somente a equipe da aplicação possui.

Observação sobre Produção: o servidor cadnpcldlx1508 (PRD) não é atendido por esta equipe. Recomenda-se que a equipe responsável pelo ambiente produtivo verifique se o /sigdb/run também está sem a instrução #!/bin/bash, pois a mesma correção se aplica.

Diante do exposto, encerramos esta demanda no âmbito da Esteira DevOps NPRD.

Atenciosamente,
Jessé Batista – P585600
CTIS/CESTI/ESTEIRAS DEVOPS
