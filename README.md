*********************************************************************
p585600@10.116.24.145's password:
,Last login: Thu Sep 17 15:49:13 2026 from 10.122.150.31
,[p585600@srjtqapllx0021 ~]$ ,
-bash: ,: command not found
[p585600@srjtqapllx0021 ~]$
[p585600@srjtqapllx0021 ~]$
[p585600@srjtqapllx0021 ~]$ /opt/open/jboss/7.0.0/bin/jboss-cli.sh --connect --controller=srjtqapllx0021:9990
Authenticating against security realm: ManagementRealm
Username: p585600
Password:
Failed to connect to the controller: Unable to authenticate against controller at srjtqapllx0021:9990: Authentication failed: all available authentication mechanisms failed:
   JBOSS-LOCAL-USER: javax.security.sasl.SaslException: Failed to read server challenge [Caused by java.io.FileNotFoundException: /opt/open/jboss/7.0.0/domain/tmp/auth/local6618860042202094437.challenge (Permission denied)]
   DIGEST-MD5: Server rejected authentication
[p585600@srjtqapllx0021 ~]$ sudo su
[root@srjtqapllx0021 p585600]# /opt/open/jboss/7.0.0/bin/jboss-cli.sh --connect --controller=srjtqapllx0021:9990
[domain@srjtqapllx0021:9990 /]
[domain@srjtqapllx0021:9990 /]
[domain@srjtqapllx0021:9990 /]
[domain@srjtqapllx0021:9990 /] /host=srjtqapllx0021/server-config=srjtqapllx0021_sifug_inter_8080/system-property=javax.net.debug:add(value=ssl)
{
    "outcome" => "success",
    "result" => undefined,
    "server-groups" => {"sifug" => {"host" => {"srjtqapllx0021" => {"srjtqapllx0021_sifug_inter_8080" => {"response" => {"outcome" => "success"}}}}}}
}
[domain@srjtqapllx0021:9990 /] /host=srjtqapllx0021/server-config=srjtqapllx0021_sifug_inter_8080:restart
{
    "outcome" => "success",
    "result" => "STARTING"
}
[domain@srjtqapllx0021:9990 /] exit
[root@srjtqapllx0021 p585600]# tail -f /opt/open/jboss/7.0.0/domain/servers/srjtqapllx0021_sifug_inter_8080/log/server.log | grep -i "alias\|handshake\|certificate\|dataprev\|keystore"


