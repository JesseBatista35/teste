
Last login: Wed May 27 13:46:16 2026 from 10.122.150.31
id: cannot find name for group ID 927
[p585600@sspdeapllx0040 ~]$ sudo su jboss7

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

Senha SUDO:
[jboss7@sspdeapllx0040 p585600]$ cd /opt/jboss/jboss-eap-7.0
[jboss7@sspdeapllx0040 jboss-eap-7.0]$ ./jboss.sh sisag-lx0041 stop
Executando stop da instancia. (sisag-lx0041).
{
    "outcome" => "success",
    "result" => "STOPPED"
}
[jboss7@sspdeapllx0040 jboss-eap-7.0]$ ./jboss.sh sisag-lx0041 start
Removendo pasta tmp da instancia sisag-lx0041.
Removendo pasta data da instancia sisag-lx0041.
Executando start da instancia. (sisag-lx0041).
{
    "outcome" => "failed",
    "failure-description" => "WFLYCTL0158: Operation handler failed: java.util.NoSuchElementException: No child 'server-config' exists",
    "rolled-back" => true
}
[jboss7@sspdeapllx0040 jboss-eap-7.0]$ ./jboss.sh sisag-lx0041 start
Removendo pasta tmp da instancia sisag-lx0041.
Removendo pasta data da instancia sisag-lx0041.
Executando start da instancia. (sisag-lx0041).
{
    "outcome" => "failed",
    "failure-description" => "WFLYCTL0158: Operation handler failed: java.util.NoSuchElementException: No child 'server-config' exists",
    "rolled-back" => true
}
[jboss7@sspdeapllx0040 jboss-eap-7.0]$
