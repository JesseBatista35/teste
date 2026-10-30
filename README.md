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

SIHDG-jboss8-config
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
SIHDG-jboss8-config

jboss-deployments
jboss-modules-custom
README.md
standalone.conf
standalone.xml

jboss-8.0

/
Type to find a file or folder...
Files
failed

Clone

Contents
History

jboss-deployments
17 de jul.
0d9ef238
Added jboss-deployments Anderson Gabriel Fernandes Nascimento
jboss-modules-custom
17 de jul.
90fd01ec
Added jboss-modules-custom Anderson Gabriel Fernandes Nascimento
README.md
18 de jun.
b6863ffb
Added README.md Anderson Gabriel Fernandes Nascimento
standalone.conf
1 de jul.
a7f5e90b
Added standalone.conf Anderson Gabriel Fernandes Nascimento
standalone.xml
16 de out.
e57cadac
Updated standalone.xml Nelson Silva dos Santos
Exemplo de Repositório de Configuração para JBOSS (VM)
Esse repositório está organizado por pastas

Pastas Disponíveis
ansible
httpd
jboss
so
Para novos sistemas utilizar essa estrutura de pastas. Obs: A antiga estrutura ainda irá funcionar, mas futuramente será descontinuada

Template JBOSS EAP
Template de config utilizado com as aplicações Jboss em VM

Arquivos
/jboss/standalone-full-ha.xml (Obrigatório)
/jboss/standalone.conf (Obrigatório)
/jboss/jboss-deployments (Opcional)
/jboss/jboss-custom.cli (Opcional)
/jboss/jboss-modules-custom (Opcional)
/jboss/configuration/custom.sh (Opcional)
/httpd/httpd.conf (Opcional)
/httpd/vhost.conf (Opcional)
/httpd/00-mpm.conf (Opcional)
/httpd/00-proxy.conf (Opcional)
/so/etc/host-{{ ambiente }} (Opcional)
/ansible/groups_var/{{ grupo_variavel }} (Opcional)
/ansible/inventory/{{ grupo_inventário }} (Opcional)
/jboss/standalone-full-ha.xml
Arquivo responsável pelas configurações básicas do sistema com datasource, logs, system-properties, filas MQ, entre outros.

/jboss/standalone.conf
Arquivo responsável pelas configurações iniciais do JBOSS como memoria a ser utilizada, inicialização de bibliotecas, jks, configurações de proxy entre outras.

/jboss/jboss-deployments
Arquivo responsável por adicionar Deployments adicionais que não estão disponíveis por padrão nas imagens das VMs. Conforme descrito na WIKI

/jboss/jboss-custom.cli
Arquivo responsável por executar alguma configuração adcional via jboss-cli.

/jboss/jboss-modules-custom
Arquivo responsável por adicionar Módulos adicionais que não estão disponíveis por padrão nas imagens das VMs.

/jboss/configuration/custom.sh
Arquivo responsável por executar um script customizado em bash.

/httpd/httpd.conf
O arquivo "httpd.conf" é usado para definir as diretrizes que o Apache segue ao iniciar e executar, e também fornece aos administradores de sistemas a capacidade de personalizar o comportamento do Apache para atender às suas necessidades específicas. Algumas das configurações comuns incluem a porta que o Apache escuta, o local dos arquivos de log, a configuração de virtual hosts, entre outros.

/httpd/vhost.conf
O arquivo "vhost.conf" é responsável para customizar as configurações do apache.

/httpd/00-mpm.conf
O arquivo 00-mpm.conf é usado para configurar o MPM (Mod_Process_Management) do Apache. O MPM é responsável por gerenciar as solicitações HTTP para o servidor Apache e determinar como os processos serão gerenciados e escalados para atender a essas solicitações. O arquivo 00-mpm.conf permite que você configure o MPM do Apache para suas necessidades específicas.

/httpd/00-proxy.conf
Arquivo responsável para habilitar e desabilitar módulos especificos do proxy.

/so/etc/host-{{ ambiente }}
Arquivo responsável para acrescentar/modificar o arquivo de hosts do sistema operacional de acordo com o ambiente (des,tqs,hmp,prd).

/ansible/groups_var/{{ grupo_variavel }}
Arquivo responsável por alterar os grupos de variáveis para grupos específicos que contém variáveis que não se aplicam ao padrão da esteira.

/ansible/inventory/{{ grupo_inventário }}
Arquivo responsável por alterar os grupos de inventário para grupos específicos que contém invetários que não se aplicam ao padrão da esteira.

Expanded

Collapsed

Showing 3 items.

Finished loading items

Expanded

Collapsed

Showing 3 items.

Finished loading items

Expanded

Collapsed



ta nessa branch aqui
