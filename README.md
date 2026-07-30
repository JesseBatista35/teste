
-sh-4.2$
-sh-4.2$ ip addr show | grep inet
    inet 127.0.0.1/8 scope host lo
    inet6 ::1/128 scope host
    inet 10.116.201.140/19 brd 10.116.223.255 scope global noprefixroute ens192
    inet6 fe80::250:56ff:fe82:1a27/64 scope link noprefixroute
    inet 192.168.234.87/19 brd 192.168.255.255 scope global noprefixroute ens224
    inet6 fe80::250:56ff:fe82:c735/64 scope link
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ netstat -tlnp | grep -E ':80|:443|:8080|:8443'
(Não foi possível ler informações para "-p": geteuid()=10585600 mas você deve ser root.)
tcp        0      0 0.0.0.0:8009            0.0.0.0:*               OUÇA       -
tcp        0      0 0.0.0.0:8080            0.0.0.0:*               OUÇA       -
tcp        0      0 0.0.0.0:8443            0.0.0.0:*               OUÇA       -
tcp6       0      0 :::80                   :::*                    OUÇA       -
tcp6       0      0 :::8027                 :::*                    OUÇA       -
tcp6       0      0 :::443                  :::*                    OUÇA       -
-sh-4.2$
-sh-4.2$ ss -tlnp | grep -E ':80|:443|:8080|:8443'
LISTEN     0      10000        *:8009                     *:*
LISTEN     0      10000        *:8080                     *:*
LISTEN     0      10000        *:8443                     *:*
LISTEN     0      511       [::]:80                    [::]:*
LISTEN     0      65535     [::]:8027                  [::]:*
LISTEN     0      511       [::]:443                   [::]:*
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep -A 5 "interfaces" $JBOSS_HOME/standalone/configuration/standalone.xml
grep: /standalone/configuration/standalone.xml: Arquivo ou diretório não encontrado
-sh-4.2$ grep -A 5 "interfaces" $JBOSS_HOME/domain/configuration/host.xml
grep: /domain/configuration/host.xml: Arquivo ou diretório não encontrado
-sh-4.2$ nslookup sisaq-web.esteiras.tqs.caixa
Server:         10.116.193.77
Address:        10.116.193.77#53

Non-authoritative answer:
Name:   sisaq-web.esteiras.tqs.caixa
Address: 10.116.180.246

-sh-4.2$ nslookup sisaq-web.esteiras.des.caixa
Server:         10.116.193.77
Address:        10.116.193.77#53

Non-authoritative answer:
Name:   sisaq-web.esteiras.des.caixa
Address: 10.116.180.245

-sh-4.2$ getent hosts sisaq-web.esteiras.des.caixa
10.116.180.245  sisaq-web.esteiras.des.caixa
-sh-4.2$ getent hosts sisaq-web.esteiras.tqs.caixa
10.116.180.246  sisaq-web.esteiras.tqs.caixa
-sh-4.2$
