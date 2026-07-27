Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000081177585
Criado em	 27/07/2026 12:39:43
Criado por	 P779479
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda inicial sem viés de falha, erro, degradação ou
esgotamento de infraestrutura, serviço, máquina, armazenamento,
rotina ou situação que não esteja na iminência de tornar-se
incidente. Previsto atendimento em até 24 horas.

[CENTRAL-SID]
ID da Ordem de Trabalho	 WO0000081177585
Criado em	 27/07/2026 12:36:30
Criado por	 P768728
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a),

Informamos que por ter reaberto sua solicitação hoje o atendimento será retomado nesta data.

Iremos realizar uma nova análise conforme as informações adicionais registradas na sua última nota.

Ressaltamos que um novo SLA de 24h úteis passa a vigorar a partir de agora.

Todas as atualizações e evoluções do atendimento serão registradas diretamente nesta WO.

Atte.

CTIS / CESTI Esteira DEVOPS DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081177585
Criado em	 27/07/2026 12:16:24
Criado por	 F526225
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Bom dia. O log enviado não reflete a realidade do servidor jboss7 URL https://acessoseguro.sso.des.intra.corerj.caixa/, em anexo o erro que ocorre, solicito o ajuste do ambiente.
ID da Ordem de Trabalho	 WO0000081177585
Criado em	 27/07/2026 11:16:57
Criado por	 P515324
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À CAIXA,

Realizado envio do arquivo de log em anexo.

Atenciosamente,
Murilo Silva Andrade Souza
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081177585
Criado em	 27/07/2026 10:32:40
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
ID da Ordem de Trabalho	 WO0000081177585
Criado em	 27/07/2026 10:29:43
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Segunda-feira, 27/07/2026 14:09:48



<img width="1409" height="618" alt="image" src="https://github.com/user-attachments/assets/fb4adf25-b03e-481b-84be-9c580ed55538" />




[p585600@srjdeaprlx049 ~]$
[p585600@srjdeaprlx049 ~]$
[p585600@srjdeaprlx049 ~]$
[p585600@srjdeaprlx049 ~]$
[p585600@srjdeaprlx049 ~]$ ps -ef | grep jboss
p585600   8941  8656  0 13:41 pts/1    00:00:00 grep jboss
[p585600@srjdeaprlx049 ~]$
[p585600@srjdeaprlx049 ~]$
[p585600@srjdeaprlx049 ~]$ cd /opt/jboss
-bash: cd: /opt/jboss: No such file or directory
[p585600@srjdeaprlx049 ~]$ cd /opt
[p585600@srjdeaprlx049 opt]$ ls -la
total 56
drwxr-xr-x. 11 root     root      4096 May 26 13:31 .
dr-xr-xr-x. 31 root     root      4096 May 26 13:31 ..
drwxr-xr-x   3 root     root      4096 Jul 11  2019 BESClient
drwx---r-x.  6 spctmdr3 controlm  4096 Jun 14  2017 ctmage8
drwx------.  2 root     root     16384 May 27  2016 lost+found
drwxr-xr-x   6 root     root      4096 May 26 13:31 networker
drwxr-xr-x   7 root     root      4096 May 26 13:31 nsr
drwxr-xr-x.  4 root     root      4096 Jun 14  2017 open
drwxr-xr-x   6 root     root      4096 Jul 16  2024 puppetlabs
drwxr-xr-x.  2 root     root      4096 Aug 10  2017 rh
drwxr-xr-x.  4 root     root      4096 Jun  8  2021 tivoli
[p585600@srjdeaprlx049 opt]$ ps -ef | grep java
p585600   9012  8656  0 13:42 pts/1    00:00:00 grep java
[p585600@srjdeaprlx049 opt]$ hostname -f
srjdeaprlx049
[p585600@srjdeaprlx049 opt]$ ps -ef | grep service
root      2889     1  0 Jul21 ?        00:00:22 /opt/open/apache/2.4.6/bin/httpd -f /opt/open/apache/2.4.6/https-webservice.acessoseguro.sso.des.intra.corerj.caixa/httpd/httpd.conf -d /opt/open/apache/2.4.6/https-webservice.acessoseguro.sso.des.intra.corerj.caixa
root      2891  2889  0 Jul21 ?        00:00:00 /opt/open/apache/2.4.6/bin/rotatelogs -l -f /opt/open/apache/2.4.6/https-webservice.acessoseguro.sso.des.intra.corerj.caixa/logs/error.log.%Y%m%d 86400
root      2892  2889  0 Jul21 ?        00:00:02 /opt/open/apache/2.4.6/bin/rotatelogs -l -f /opt/open/apache/2.4.6/https-webservice.acessoseguro.sso.des.intra.corerj.caixa/logs/access.log.%Y%m%d 86400
spapadr1  2893  2889  0 Jul21 ?        00:00:08 /opt/open/apache/2.4.6/bin/httpd -f /opt/open/apache/2.4.6/https-webservice.acessoseguro.sso.des.intra.corerj.caixa/httpd/httpd.conf -d /opt/open/apache/2.4.6/https-webservice.acessoseguro.sso.des.intra.corerj.caixa
spapadr1  2894  2889  0 Jul21 ?        00:00:08 /opt/open/apache/2.4.6/bin/httpd -f /opt/open/apache/2.4.6/https-webservice.acessoseguro.sso.des.intra.corerj.caixa/httpd/httpd.conf -d /opt/open/apache/2.4.6/https-webservice.acessoseguro.sso.des.intra.corerj.caixa
spapadr1  2895  2889  0 Jul21 ?        00:00:08 /opt/open/apache/2.4.6/bin/httpd -f /opt/open/apache/2.4.6/https-webservice.acessoseguro.sso.des.intra.corerj.caixa/httpd/httpd.conf -d /opt/open/apache/2.4.6/https-webservice.acessoseguro.sso.des.intra.corerj.caixa
spapadr1  3201  2889  0 Jul21 ?        00:00:08 /opt/open/apache/2.4.6/bin/httpd -f /opt/open/apache/2.4.6/https-webservice.acessoseguro.sso.des.intra.corerj.caixa/httpd/httpd.conf -d /opt/open/apache/2.4.6/https-webservice.acessoseguro.sso.des.intra.corerj.caixa
p585600  15058  8656  0 14:09 pts/1    00:00:00 grep service
[p585600@srjdeaprlx049 opt]$




2 novas atividades
Há menu de contexto
Chat




Não lido
Canais
Chats
Chats de reunião
Mensagem não lidaÚltima mensagemChats em grupoChat de reuniãoChatFuncionários mencionadosMencionar todosImportanteUrgenteRascunhoRascunhoMudo ativadoReunião em andamentoReunião agora em andamentoVocê não pode enviar mensagens porque não é membro do chat.Não é possível enviar mensagens a este botPrivadoCompartilhadoTem um menu de contextoCanal mencionadoEquipe mencionadaFuncionários mencionadosNão lidoNão lidoReunião em andamentoNão lidoCanalEquipeTem mensagens fixadasVer maisComunidadeMostrar temporariamenteTem um menu de contextoChat com emblemaChats com emblema
Tem um menu de contexto

Equipes e canais
Leandro Paranhos Carvalho de Souza

Chat

Compartilhado

Recapitular

Há menu de contexto







Lista de Mensagens
Leandro   Paranhos   Carvalho   de   Souza por Jesse Mouta Pereira Batista
13:55
Jesse Mouta Pereira Batista

Leandro Paranhos Carvalho de Souza

boa tarde por Jesse Mouta Pereira Batista
13:55
Jesse Mouta Pereira Batista

boa tarde

tudo bem? por Jesse Mouta Pereira Batista
13:55
Jesse Mouta Pereira Batista

tudo bem?

recebi a WO0000081177585. por Jesse Mouta Pereira Batista
13:55
Jesse Mouta Pereira Batista

recebi a WO0000081177585.

Última lida
 Boa tarde. por Leandro Paranhos Carvalho de Souza
Leandro Paranhos Carvalho de Souza
13:56

 Boa tarde.

Tudo bem. por Leandro Paranhos Carvalho de Souza
Leandro Paranhos Carvalho de Souza
13:56

Tudo bem.

vi que inicialmente você solicitou o log do... por Jesse Mouta Pereira Batista
13:57
Jesse Mouta Pereira Batista

vi que inicialmente você solicitou o log do jboss, outro analista fez o envio dos logs, você retornou que não é o que reflete a aplicação porem na demanda você não informa qual o modulo que reflete a aplicação.

voce poderia me informar, qual modulo do  S... por Jesse Mouta Pereira Batista
13:57
Jesse Mouta Pereira Batista

voce poderia me informar, qual modulo do  SISGR

que reflete a aplicação por Jesse Mouta Pereira Batista
13:57
Jesse Mouta Pereira Batista

que reflete a aplicação

Eu sempre peço o log desse jeito passando U... por Leandro Paranhos Carvalho de Souza
Leandro Paranhos Carvalho de Souza
13:58

Eu sempre peço o log desse jeito passando URL, pois não tenho acesso aos dados do servidor, Sherlock por exemplo

pela url o servidor é  esse imagem   o mesm... por Jesse Mouta Pereira Batista
13:58
Jesse Mouta Pereira Batista

pela url o servidor é  esse

imagem

 

o mesmo o qual o analista te enviou os logs

imagem   temos esses módulos aqui por Jesse Mouta Pereira Batista
13:59
Jesse Mouta Pereira Batista

imagem

 

temos esses módulos aqui

dos SISGR por Jesse Mouta Pereira Batista
13:59
Jesse Mouta Pereira Batista

dos SISGR

Início da citação, Jesse Mouta Pereira Bati... por Leandro Paranhos Carvalho de Souza
Leandro Paranhos Carvalho de Souza
13:59

Jesse Mouta Pereira Batista
27/07/2026 13:57
vi que inicialmente você solicitou o log do jboss, outro analista fez o envio dos logs, você retornou que não é o que reflete a aplicação porem na demanda você não informa qual o modulo que reflete a…
O analista, provavelmente não soube fazer os link corretos até chegar no servidor de aplicação

o jboss é único equivalente a URL que passe... por Leandro Paranhos Carvalho de Souza
Leandro Paranhos Carvalho de Souza
14:00

o jboss é único equivalente a URL que passei, independente dos módulos apresentado

temos dois jboss7 sso.intra e sso.inter que... por Leandro Paranhos Carvalho de Souza
Leandro Paranhos Carvalho de Souza
14:01

temos dois jboss7 sso.intra e sso.inter que atende várias aplicações

Início da citação, Leandro Paranhos Carvalh... por Jesse Mouta Pereira Batista
14:02
Jesse Mouta Pereira Batista

Leandro Paranhos Carvalho de Souza
27/07/2026 14:00
o jboss é único equivalente a URL que passei, independente dos módulos apresentado
não mesmo, cada modulo tem um hostname diferente, 

imagem por Jesse Mouta Pereira Batista
14:02
Jesse Mouta Pereira Batista

imagem

vou verificar aqui por Jesse Mouta Pereira Batista
14:03
Jesse Mouta Pereira Batista

vou verificar aqui

pois pela url é um legado por Jesse Mouta Pereira Batista
14:03
Jesse Mouta Pereira Batista

pois pela url é um legado

não esta na esteira por Jesse Mouta Pereira Batista
14:04
Jesse Mouta Pereira Batista

não esta na esteira

então esses prints que te mandei pode ignor... por Jesse Mouta Pereira Batista
14:05
Jesse Mouta Pereira Batista

então esses prints que te mandei pode ignorar. 

pois ela esta fora da esteira por Jesse Mouta Pereira Batista
14:05
Jesse Mouta Pereira Batista

pois ela esta fora da esteira

Ja adiantando o motivo pelo qual eu solicit... por Leandro Paranhos Carvalho de Souza
Leandro Paranhos Carvalho de Souza
14:06

Ja adiantando o motivo pelo qual eu solicitei o log, está ocorrendo um problema de comunicação entre o servidor é a URL do SISET

beleza, vou dar uma verificada e ja te info... por Jesse Mouta Pereira Batista
14:07
Jesse Mouta Pereira Batista

beleza, vou dar uma verificada e ja te informou


👍
1 Curtir reação.

Agradeço por Leandro Paranhos Carvalho de Souza
Leandro Paranhos Carvalho de Souza
14:07

Agradeço


👍
1 Curtir reação.

tem menu de contexto




<img width="1389" height="789" alt="image" src="https://github.com/user-attachments/assets/a3cea3ce-9a72-44d6-952c-c34ce9e4db90" />







