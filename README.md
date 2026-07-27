
[p585600@cadsvitrlx100 ~]$
[p585600@cadsvitrlx100 ~]$ ssh 10.116.89.101
#########################################################################
#          Ambiente administrado e monitorado por Brasilia
#########################################################################
#
# Site: CTC
# Hostname: sspdeaplux0100.caixa
# SO Release: Solaris 11.4.53.132.2
# Serial Number: AK00289677
# Memoria Total: 32.00 GB
# VCPUs: 16 Modelo: SPARC M6-32
# Control domain: cadcogerux031
# Ambiente:
# Descricao: SIGOV Aplicacao SJSAS8
(p585600@10.116.89.101) Password: #######################################
Last login: Mon Mar 30 11:49:47 2026 from 10.122.150.31
Could not chdir to home directory /caixa/usr/p585600: No such file or directory
-bash-5.1$
-bash-5.1$
-bash-5.1$
-bash-5.1$ sudo -u sjsas8 /opt/SUNWas8/bin/asadmin list-domains

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

Senha SUDO:
das01 not running
Command list-domains executed successfully.
-bash-5.1$ sudo -u sjsas8 netstat -an | grep 14848
-bash-5.1$ sudo -u sjsas8 /opt/SUNWas8/bin/asadmin list-instances --host 10.116.89.101 --port 14848 --user ASadmin --passwordfile /opt/SUNWas8/config/passwordfile.conf
Unable to connect to admin-server.  Please check if the server is up and running and that the host and port provided are correct.
CLI137 Command list-instances failed.
-bash-5.1$
-bash-5.1$
-bash-5.1$
