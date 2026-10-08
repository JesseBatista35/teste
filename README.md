Skip to main content
Azure DevOps
projetos
/
Caixa
/
Overview
/
Wiki
/
Azure Wiki
/
Configuração do agent SIGDB ambiente Terraform
Search


Caixa

Overview
Summary
Dashboards
Wiki

Boards

Repos

Pipelines

Test Plans

Artifacts
Project settings

Caixa.wiki

sigdb


New page
Configuração do agent SIGDB ambiente Terraform

Follow
2

Edit

Roger Costa Machado
segunda-feira
REQUISITOS:

Segue abaixo os requisitos para utilização do SIGDB no ambiente Terraform.
Exemplo utilizado no módulo SICEA-intranet ambiente DES.
1.1. Verificar se existe as regras de firewall entre VM > MF e MF > VM.

Mainframe DES SP = IP: 10.192.224.66 PORTA: 21 e 7002
Mainframe TQS SP = IP: 10.192.224.63 PORTA: 21 e 7002

Exemplo abaixo feito para o ambiente de DES:

ORIGEM:				                        DESTINO:                                             PORTA:
caddeapllx2337.agil.nprd.caixa.gov.br (servidor)	10.192.224.66 (mainframe)	                     21, 7002
10.192.224.66 (mainframe)                               caddeapllx2337.agil.nprd.caixa.gov.br (servidor)     35000
1.2. Segue abaixo os comandos como exemplo para teste de regra de firewall do servidor de origem VM para o Mainframe DES:

curl -v telnet://10.192.224.66:21
curl -v telnet://10.192.224.66:7002
image.png

1.3. Para testes de regra entre Mainframe > VM acionar equipe mainframe responsável para verificação das regras.

CONFIGURAÇÕES:

Editar a release do projeto e adicionar a task group SIGDB_VM_TERRAFORM no final após a task group "Deploy_Config_Pacote_JBOSS".
image.png

No repositório .conf do projeto na branch master criar a pasta sigdb e as sub pastas des, tqs, hmp e prd.
image.png

3.1. Na pasta sigdb criar o arquivo com o nome sigdb com o conteúdo abaixo:

image.png

### BEGIN INIT INFO
# Provides: Sigdb Agent
# Required-Start: $local_fs $network $syslog
# Required-Stop: $local_fs $syslog
# Should-Start: $syslog
# Should-Stop: $network $syslog
# Default-Start: 2 3 4 5
# Default-Stop: 0 1 6
# Short-Description: Start Sigdb Agent
# Description: Start Start Sigdb Agent
### END INIT INFO
cd /sigdb;nohup ./run &
3.2. Nas sub pastas DES, TQS, HMP e PRD criar o arquivo run com o conteúdo abaixo trocando os parâmetros <ip-do-mainframe>, <ip-do-servidor> e <alias-desse-host> na última linha.

OBS: ATENÇÃO O parâmetro -m<alias-desse-host> DEVE CONTER 11 CARACTERES, não 10 e nem 12, somente 11.
Esse parâmetro <alias-desse-host> é o nome que o server SIGDB irá reconhecer para se comunicar.

#  AgtSigdb -m<alias-desse-host> -h<ip-do-destino> -i<ip-desse-servidor>
#  onde:
#    nome-desse-host    -
#    ip-do-destino      -
#    ip-desse-servidor  -
LD_LIBRARY_PATH=/usr/lib
export LD_LIBRARY_PATH

umask 000
nohup ./AgtSigdb -m<alias-desse-host> -h<ip-do-mainframe> -i<ip-do-servidor> &
Exemplo:
image.png

3.3. Caso o projeto tenha arquivos para "descida" provindo do Mainframe, nas sub pastas DES, TQS, HMP e PRD criar o arquivo <SIGLA>.sys, esse arquivo é responsável para informar o path da descida dos arquivos, onde serão gavados os arquivos vindos do mainframe. Caso não tenha arquivos para descida não é necessário criar.

OBS: Caso o sistema necessite armazenar os arquivos, sugerimos criar um compartilhamento NFS no Islon e o ponto de montagem seria o PATH definido no arquivo .sys.

Exemplo do arquivo SICEA.sys

<SIGLA>;<PATH>;;1

image.png

3.4. Configurar na release em Pipeline Variable > Variable a propriedade vm_destroy_before_create com o valor true com Scope release.

image.png

MANUTENÇÃO:

STOP/START/STATUS
4.1. Verificar o status do SIGDB.
ps -ef|grep -i agtsigdb

image.png

4.2. START do processo é reexecutando uma release ou executando o script /etc/init.d/sigdb manualmente no servidor.

4.3. STOP do processo executar o comando kill -9.

16 visits in last 30 days
Expanded

Collapsed

Showing filters 1 through 1

1000 results found

314 results found

58 results found

2 results found

1 result found
