
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# # Porta que o HC da 104 usa para falar com o DC
[root@sbrdeapllx104 p585600]# grep -iE 'remote|master' /opt/jboss/jboss-eap/hc/configuration/host-slave.xml
        <remote security-realm="ManagementRealm" username="admin">
                <static-discovery name="primary" protocol="${jboss.domain.master.protocol:remote}" host="${jboss.domain.master.address}" port="${jboss.domain.master.port:9999}"/>
        </remote>
[root@sbrdeapllx104 p585600]# ss -tnp | grep 10.116.89.0
ESTAB      0      0      10.116.94.211:50750              10.116.89.0:9999                users:(("java",pid=84682,fd=111))
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# # Se for 9999 (protocolo nativo):
[root@sbrdeapllx104 p585600]# /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=remote://10.116.89.0:9999
Authenticating against security realm: ManagementRealm
Username:
Failed to connect to the controller: Unable to authenticate against controller at 10.116.89.0:9999: Authentication failed: all available authentication mechanisms failed:
   DIGEST-MD5: javax.security.sasl.SaslException: No username supplied.


[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# # Se for outra porta HTTP (ex.: 9990 + offset):
[root@sbrdeapllx104 p585600]# /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:<PORTA>
bash: erro de sintaxe próximo do `token' não esperado `newline'
[root@sbrdeapllx104 p585600]#
