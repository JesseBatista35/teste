Jesse, precisamos apenas dos ajustes no repositório do sistema SICCP-intra-config com os arquivos para funcionamento do SIGDB neste.
https://devops.caixa/projetos/Caixa/_git/SICCP-intra-config
 
O Roger havia feito esses ajustes já no SIEXC-web-aplicacao para usarmos como exemplo:
https://devops.caixa/projetos/Caixa/_git/SIEXC-web-aplicacao-config?path=/sigdb/des/run



 Skip to main content
Azure DevOps
projetos
/
Caixa
/
Repos
/
Files
/

SICCP-intra-config
Search


Caixa

Overview

Boards

Repos
Files
Commits
Pushes
Branches
Tags
Pull requests

Pipelines

Test Plans

Artifacts
Project settings
SICCP-intra-config

etc
httpd
jboss
configuration
properties
custom-deploy.sh
custom.sh
java.security
jboss-custom.cli
jboss-deployments
jboss-modules-custom
standalone-full-ha.xml
standalone.conf
README.md

master-CESTI36

/
Type to find a file or folder...
Files
failed

Clone

Contents
History

etc
22 de abr.
dd5d2850
Updated hosts-des Thiago Augusto Jardim
httpd
22 de abr.
1ad328c2
Updated vhost.conf Thiago Augusto Jardim
jboss
23 de abr.
d5031893
Updated standalone-full-ha.xml Thiago Augusto Jardim
README.md
22 de abr.
8bfaef90
Added README.md Thiago Augusto Jardim
Introduction
TODO: Give a short introduction of your project. Let this section explain the objectives or the motivation behind this project.

Getting Started
TODO: Guide users through getting your code up and running on their own system. In this section you can talk about:

Installation process
Software dependencies
Latest releases
API references
Build and Test
TODO: Describe and show how to build your code and run the tests.

Contribute
TODO: Explain how other users and developers can contribute to make your code better.

If you want to learn more about creating good readme files then refer the following guidelines . You can also seek inspiration from the below readme files:

ASP.NET Core 
Visual Studio Code 
Chakra Core 
Expanded




Skip to main content
Azure DevOps
projetos
/
Caixa
/
Repos
/
Files
/

SIEXC-web-aplicacao-config
Search


Caixa

Overview

Boards

Repos
Files
Commits
Pushes
Branches
Tags
Pull requests

Pipelines

Test Plans

Artifacts
Project settings
SIEXC-web-aplicacao-config

configuration
jboss
sigdb
des
run
prd
tqs
sigdb
README.md

master

/
sigdb
/
des
/
run
run

Edit

Contents
History
Compare
Blame

12345678910
#  AgtSigdb -m<alias-desse-host> -h<ip-do-destino> -i<ip-desse-servidor>
#  onde:
#    nome-desse-host    -
#    ip-do-destino      -
#    ip-desse-servidor  -
LD_LIBRARY_PATH=/usr/lib
export LD_LIBRARY_PATH

umask 000
nohup ./AgtSigdb -mtr7259lx193 -h10.192.224.66 -i10.116.199.181 &
