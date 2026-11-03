sudo grep -n "migracaosifec" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | tail -20


ssh p585600@10.116.78.12
sudo grep -rn -i "migracaosifec" /opt/httpd/conf /opt/httpd/conf.d 2>/dev/null

sudo grep -nE "ServerName|ErrorLog|CustomLog|ProxyPass|BalancerMember" <arquivo-que-apareceu>

sudo tail -f <caminho-do-CustomLog>





[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ sudo grep -n "migracaosifec" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | tail -20

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

[sudo] password for p585600:
35461:              host=migracaosifec.des.caixa
35574:            header=Origin=https://migracaosifec.des.caixa
35580:            header=Referer=https://migracaosifec.des.caixa/fec-web/
35581:            header=Host=migracaosifec.des.caixa
35582:            header=X-Forwarded-Host=migracaosifec.des.caixa
35600:              host=migracaosifec.des.caixa
35713:            header=Origin=https://migracaosifec.des.caixa
35719:            header=Referer=https://migracaosifec.des.caixa/fec-web/
35720:            header=Host=migracaosifec.des.caixa
35721:            header=X-Forwarded-Host=migracaosifec.des.caixa
35739:              host=migracaosifec.des.caixa
35767:            header=Host=migracaosifec.des.caixa
35768:            header=X-Forwarded-Host=migracaosifec.des.caixa
35785:              host=migracaosifec.des.caixa
35798:            header=Location=https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/auth?response_type=code&client_id=cli-web-fec&redirect_uri=https%3A%2F%2Fmigracaosifec.des.caixa%2Ffec-web%2F&state=c55179d3-3ee2-4262-9fca-1fa2b768fe4e&login=true&scope=openid
35902:            header=Origin=https://migracaosifec.des.caixa
35908:            header=Referer=https://migracaosifec.des.caixa/fec-web/
35909:            header=Host=migracaosifec.des.caixa
35910:            header=X-Forwarded-Host=migracaosifec.des.caixa
35928:              host=migracaosifec.des.caixa
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$







[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$ sudo grep -rn -i "migracaosifec" /opt/httpd/conf /opt/httpd/conf.d 2>/dev/null

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

[sudo] password for p585600:
/opt/httpd/conf.d/.httpd-sifec1.conf.20261030151044.p515324:3:        ServerName  migracaosifec.des.caixa
/opt/httpd/conf.d/.httpd-sifec1.conf.20261030151044.p515324:4:  #ServerAlias migracaosifec1.des.caixa
/opt/httpd/conf.d/httpd-sifec1.conf.bkp:3:        ServerName  migracaosifec.des.caixa
/opt/httpd/conf.d/httpd-sifec1.conf.bkp:4:      #ServerAlias migracaosifec1.des.caixa
/opt/httpd/conf.d/httpd-sifec1.conf:3:    ServerName migracaosifec.des.caixa
/opt/httpd/conf.d/httpd-sifec1.conf:9:    RequestHeader set X-Forwarded-Host "migracaosifec.des.caixa"
/opt/httpd/conf.d/.httpd-sifec1.conf.20261030151014.p515324:3:    ServerName migracaosifec.des.caixa
/opt/httpd/conf.d/.httpd-sifec1.conf.20261030161032.p515324:3:    ServerName migracaosifec.des.caixa
/opt/httpd/conf.d/.httpd-sifec1.conf.20261030161056.p515324:3:    ServerName migracaosifec.des.caixa
/opt/httpd/conf.d/.httpd-sifec1.conf.20261030161056.p515324:9:    RequestHeader set X-Forwarded-Host "migracaosifec.des.caixa"
/opt/httpd/conf.d/.httpd-sifec1.conf.20261029181019.p515324:3:        ServerName  migracaosifec.des.caixa
/opt/httpd/conf.d/.httpd-sifec1.conf.20261029181019.p515324:4:  #ServerAlias migracaosifec1.des.caixa
/opt/httpd/conf.d/.httpd-sifec1.conf.20261030101017.p515324:3:        ServerName  migracaosifec.des.caixa
/opt/httpd/conf.d/.httpd-sifec1.conf.20261030101017.p515324:4:  #ServerAlias migracaosifec1.des.caixa
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$

