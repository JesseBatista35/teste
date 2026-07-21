Atualizar a JVM para versão 21 nos servidores do SIRSA caddeapllx1369.agil.nprd.caixa.gov.br.

Como é ansible não atualiza na pipeline.
A Atualização vai ter que ser via shell.

Favor entrar em contato para esclarecimentos

logado aqui no jboss
-sh-4.2$ ps -ef | grep java
p585600  13935 13885  0 13:58 pts/0    00:00:00 grep --color=auto java
-sh-4.2$ ps -ef | grep jboss
p585600  13940 13885  0 13:58 pts/0    00:00:00 grep --color=auto jboss
-sh-4.2$ sudo su

Presumimos que você recebeu as instruções de sempre do administrador
de sistema local. Basicamente, resume-se a estas três coisas:

    #1) Respeite a privacidade dos outros.
    #2) Pense antes de digitar.
    #3) Com grandes poderes vêm grandes responsabilidades.

[sudo] senha para p585600:
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]# yum repolist all
Plugins carregados: langpacks, product-id, search-disabled-repos, subscription-manager

This system is not registered with an entitlement server. You can use subscription-manager to register.

id do repo                                                                                       nome do repo                                                                                status
!RedHat-7-EPEL-x86_64                                                                            el7-epel-x86_64                                                                             habilitado: 16.294
repolist: 16.294
[root@caddeapllx1369 p585600]#

