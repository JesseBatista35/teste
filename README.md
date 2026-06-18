o repo ta vazio:



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

ECAPT-bancario
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
ECAPT-bancario

README.md

main

/
Type to find a file or folder...
Files
failed

Clone

Contents
History

README.md
6 de mai.
db2e7d5c
Added README.md Roger Costa Machado
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


tem esse repo

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

ECAPT-bancario-config
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
ECAPT-bancario-config

httpd
httpd.conf
vhost.conf
jboss
jboss-custom.cli
jboss-deployments
jboss-modules-custom
standalone-full-ha.xml
standalone.conf
README.md

main

/
httpd
httpd

New

Contents
History

httpd.conf
14 de mai.
6632b77a
Added httpd.conf Flavio Longue Guimaraes
vhost.conf
18 de mai.
5e1336df
Updated vhost.conf Bruno Judson de Almeida do Lago

tem esse cara:


Skip to main content
Azure DevOps
projetos
/
Infraestrutura
/
Repos
/
Files
/

esteira-vm-release-terraform
Search


Infraestrutura

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
esteira-vm-release-terraform

backend.tfvars.json
get_tag_vcenter.py
main.tf
provider.tf
README.md
terraform.tfvars.json
variables.tf

main

/
Type to find a file or folder...
Files
failed

Clone

Contents
History

backend.tfvars.json
20 de dez. de 2022
fa2de7c3
Ajuste nas variaveis do backendá Rafael Augusto Soares
get_tag_vcenter.py
10 de mar.
f812df61
Updated get_tag_vcenter.py Dyego dos Santos Barros
main.tf
12 de mar.
19d5edfd
Updated main.tf Dyego dos Santos Barros
provider.tf
28 de nov. de 2023
32086c2b
Updated provider.tf api timeout Valdir Alves Cardoso
README.md
10 de mar.
5560ddaf
Updated README.md Dyego dos Santos Barros
terraform.tfvars.json
5 de mar.
f5106311
Updated terraform.tfvars.json Dyego dos Santos Barros
variables.tf
6 de mar.
1f21c2b0
Updated variables.tf Dyego dos Santos Barros
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
Tag Vcenter
O script get_tag_vcenter.py foi desenvolvido para interagir diretamente com a API REST do VMware vCenter a fim de validar e recuperar Tags pertencentes à categoria ADDR. O objetivo principal é contornar a rigidez do Terraform, que interrompe a execução da Pipeline caso uma Tag não exista previamente no vCenter.

PROBLEMA A SER RESOLVIDO:

O Terraform exige que todas as Tags referenciadas durante a execução já estejam devidamente criadas e associadas à categoria correta no vCenter. Se a Tag não existir na categoria, o Terraform retorna erro e quebra a Pipeline. Este script evita esse comportamento, realizando uma validação prévia via API e retornando somente valores seguros.

Remover Insights
Adicionado codigo terraform, que resolve problema para remover o registro do insights da Rehat.

PROBLEMA A SER RESOLVIDO: O Terraform com ao executar o comando de destroy, realizara conexão ssh com a vm e executara o comando de remover o registro do insights da RedHat.


e tem esse cara:


Skip to main content
Azure DevOps
projetos
/
Infraestrutura
/
Repos
/
Files
/

esteira-jboss-vm-v2
Search


Infraestrutura

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
esteira-jboss-vm-v2

group_vars
inventory
library
roles

validadores
.gitignore
.vault.sh
ansible.cfg
hsi.yml
LICENSE
README.md
requirements.txt
restart_jboss.yml
secure-files.yml
site.yml
stack_apache.yml
stack_batch.yml
stack_controlm.yml
stack_custom.yml
stack_deployments_custom.yml
stack_disable_unit_jboss.yml
stack_hosts.yml
stack_jboss_handlers.yml
stack_jboss.yml
stack_ldap.yml
stack_modules_custom.yml
stack_monitoracao.yml
stack_tsm.yml
stack_vm.yml
stop_jboss.yml
summary.j2

master

/
Type to find a file or folder...
Files
failed

Clone

Contents
History

You updated fix/teste-cesti terça-feira
Create a pull request

group_vars
2 de abr.
9b73c6b2
Updated all Dyego dos Santos Barros
inventory
8 de abr.
16de621e
Updated inventory_portal.py Dyego dos Santos Barros
library
3 de mar. de 2020
299410cd
Removido os arquivos que não estão sendo utilizados root
roles
terça-feira
8858cd66
Updated main.yml Dyego dos Santos Barros
validadores
8 de abr. de 2021
5f7b28ee
Habilitando usuário de serviço root
.gitignore
9 de abr. de 2020
c1e02bb0
ajuste nas variaveis root
.vault.sh
9 de abr. de 2020
c1e02bb0
ajuste nas variaveis root
ansible.cfg
17 de jun. de 2024
eac4da96
Mellhoria na task de ldap Rafael Soares
hsi.yml
7 de mai.
230fa99d
Updated hsi.yml Ronaldo Amysterdam Alves Neres
LICENSE
21 de fev. de 2020
bd61528f
carga inicial root
README.md
21 de fev. de 2020
bd61528f
carga inicial root
requirements.txt
30 de mar. de 2020
09f12097
Validação do retordo e tratativa de erro de IP, Máscara e Gateway. root
restart_jboss.yml
13 de set. de 2023
af5bd542
Refatoração do código fonte Rafael Augusto Soares
secure-files.yml
17 de jun. de 2024
eac4da96
Mellhoria na task de ldap Rafael Soares
site.yml
16 de abr.
fdccd357
Ajuste do logrotate Rafael Soares
stack_apache.yml
9 de fev. de 2023
09330a57
Correções de automação Rafael Augusto Soares
stack_batch.yml
24 de jun. de 2025
11a29960
Updated stack_batch.yml Henrique Coutinho Guimaraes
stack_controlm.yml
19 de ago. de 2021
2e48b6d4
Ajustes Control-M root
stack_custom.yml
3 de mar.
f272b7e4
Cria o custom.sh para VM sem jboss e control-m Rafael Soares
stack_deployments_custom.yml
21 de jan. de 2025
2fa93804
Correção do nome do Repo Rafael Soares
stack_disable_unit_jboss.yml
14 de set. de 2023
1cfabdbc
Refatoração do código fonte Rafael Augusto Soares
stack_hosts.yml
22 de jan. de 2025
baa30a1c
Correção de diretório de config Rafael Soares
stack_jboss_handlers.yml
22 de jan. de 2025
535bcfba
Correção de diretório de config Rafael Soares
stack_jboss.yml
27 de set. de 2023
d0afbfa6
Padronização do código fonte Rafael Augusto Soares
stack_ldap.yml
6 de dez. de 2024
69464582
Updated stack_ldap.yml Jailson Martins Alves
stack_modules_custom.yml
22 de jan. de 2025
450b9987
Correção de diretório de config Rafael Soares
stack_monitoracao.yml
16 de abr.
fdccd357
Ajuste do logrotate Rafael Soares
stack_tsm.yml
19 de ago. de 2021
2e48b6d4
Ajustes Control-M root
ansible-role-jboss
ansible-role-jboss



