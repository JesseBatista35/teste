-bash-5.1$ sudo -u sjsas8 /opt/SUNWas8/bin/asadmin start-domain das01
Starting Domain das01, please wait.
Default Log location is /opt/SUNWas8/domains/das01/logs/server.log.
CLI152 user is a required option.
CLI156 Could not start the domain das01.
-bash-5.1$ sudo -u sjsas8 /opt/SUNWas8/bin/asadmin list-domains
das01 not running
Command list-domains executed successfully.
-bash-5.1$ sudo -u sjsas8 netstat -an | grep 14848
-bash-5.1$

