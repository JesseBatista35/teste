
[jboss7@sspdeapllx0041 jboss-eap-7.0]$ exit
exit
[p585600@sspdeapllx0041 ~]$ sudo chown jboss7:jboss7 /opt/jboss/jboss-eap-7.0/domain/log/console.log

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

Senha SUDO:
Senha Incorreta, tente novamente
Senha SUDO:
[p585600@sspdeapllx0041 ~]$ suso su jboss7
-bash: suso: command not found
[p585600@sspdeapllx0041 ~]$ sudo su jboss7
[jboss7@sspdeapllx0041 p585600]$ ./jboss.sh host start &
[1] 32456
bash: ./jboss.sh: Permission denied
[1]+  Exit 126                ./jboss.sh host start
[jboss7@sspdeapllx0041 p585600]$ ps -ef | grep sisag-lx0041 | grep -v grep
[jboss7@sspdeapllx0041 p585600]$
