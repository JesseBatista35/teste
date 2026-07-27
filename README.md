No momento da realização do deploy via PuTTY, no servidor host 10.116.89.101, estamos recebendo a seguinte mensagem de falha:

login as: c159641
Pre-authentication banner message from server:
| #########################################################################
| #          Ambiente administrado e monitorado por Brasilia
| #########################################################################
| #
| # Site: CTC
| # Hostname: sspdeaplux0100.caixa
| # SO Release: Solaris 11.4.53.132.2
| # Serial Number: AK00289677
| # Memoria Total: 32.00 GB
| # VCPUs: 16 Modelo: SPARC M6-32
| # Control domain: cadcogerux031
| # Ambiente:
| # Descricao: SIGOV Aplicacao SJSAS8
| #########################################################################
End of banner message from server
Keyboard-interactive authentication prompts from server:
| Password:
End of keyboard-interactive prompts from server
Last login: Mon Jul 27 14:41:36 2026 from 10.205.248.239
-bash-5.1$ sudo -u sjsas8 /opt/SUNWas8/bin/asadmin deploy --host 10.116.89.101 --port 14848 --user ASadmin --passwordfile /opt/SUNWas8/config/passwordfile.conf --target dsv05 sitcs_internet.ear

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

Senha SUDO:
Jul 27, 2026 2:42:30 PM com.sun.appserv.management.client.ProxyFactory getInstance
SEVERE: ProxyFactory.getInstance: Failure trying to create a new ProxyFactory: java.io.IOException: Unable to connect to admin-server.  Please check if the server is up and running and that the host and port provided are correct.
CLI175 The target dsv05 is invalid. Valid target types are cluster, domain, unclustered server instance, domain administration server.
CLI137 Command deploy failed.
