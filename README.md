
[p585600@cbrdeapllx473 ~]$ sudo grep -H "Registered web context: '/fec-web'" /opt/jboss/jboss-eap/hc/servers/*/log/server.log | tail -2

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

[sudo] password for p585600:
grep: /opt/jboss/jboss-eap/hc/servers/*/log/server.log: No such file or directory
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -viE "SECRET|PASSWORD|SENHA|API_KEY|TOKEN"
            header=Cache-Control=no-cache, no-store, must-revalidate
            header=Set-Cookie=JSESSIONID="TUW9xTeTxoIdPFNbqNI8BkKMA2s0ugSN8oSQdy_Z.hc_cbrdeapllx473:sifec-intranet_node1_lx473"; Version=1; Path=/fec-web
            header=Pragma=no-cache
            header=Location=https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/auth?response_type=code&client_id=cli-web-fec&redirect_uri=https%3A%2F%2Fmigracaosifec.des.caixa%2Ffec-web%2F&state=c55179d3-3ee2-4262-9fca-1fa2b768fe4e&login=true&scope=openid
            header=Content-Length=0
            header=Date=Tue, 03 Nov 2026 19:30:05 GMT
            status=302

==============================================================





[p585600@cbrdeapllx476 ~]$  sudo grep -H "Registered web context: '/fec-web'" /opt/jboss/jboss-eap/hc/servers/*/log/server.log | tail -2

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

[sudo] password for p585600:
grep: /opt/jboss/jboss-eap/hc/servers/*/log/server.log: No such file or directory
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$
[p585600@cbrdeapllx476 ~]$ sudo find / -name "*error*log" -path "*httpd*" 2>/dev/null | head
/opt/httpd_old_apache-2.4.37/logs/error_log
/opt/httpd/logs/error_log
/home/p695115/ambiente_aplicacoes/httpd_old_apache-2.4.37/logs/error_log
/logs/apache2/httpd_eap_des_64/error.log
[p585600@cbrdeapllx476 ~]$
