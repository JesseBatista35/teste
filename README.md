
-sh-4.2$        87d
-sh: 87d: comando não encontrado
-sh-4.2$ sipcs-transacao-des-62-deploy                          0/1       Completed   0
-sh: sipcs-transacao-des-62-deploy: comando não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ P=sipcs-login-unico-jboss-okd-des-14-7jk5f
-sh-4.2$
-sh-4.2$ oc exec $P -- ls -la /opt/jboss/standalone/deployments/
total 12224
drwxrwxr-x. 1 185 root       54 Oct  2 18:55 .
drwxrwxr-x. 1 185 root       80 Feb  6  2024 ..
-rwxrwxr--. 1 185 root     8888 Jun 23  2021 README.txt
-rw-r--r--. 1 185 root 12500595 Oct  2 14:38 sipcs-login-unico-jboss-okd.war
-rw-r--r--. 1 185 root       31 Oct  2 14:38 sipcs-login-unico-jboss-okd.war.deployed
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec $P -- sh -c 'cat /opt/jboss/standalone/deployments/*.failed 2>/dev/null'
command terminated with exit code 1
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs $P | grep -E "WFLYSRV0010|WFLYSRV0025|WFLYSRV0026|WFLYUT0021|WFLYCTL0013|WFLYCTL0186|WFLYCTL0412|ERROR" | head -50
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec $P -- /opt/jboss/bin/jboss-cli.sh -c --command="deployment-info"
NAME                            RUNTIME-NAME                    PERSISTENT ENABLED STATUS
sipcs-login-unico-jboss-okd.war sipcs-login-unico-jboss-okd.war false      true    OK
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec $P -- sed -n '30,40p' /opt/jboss/bin/standalone.conf

#
# Specify the exact Java VM executable to use.
#
#JAVA=""

if [ "x$JBOSS_MODULES_SYSTEM_PKGS" = "x" ]; then
  $JBOSS_MODULES_SYSTEM_PKGS="org.jboss.byteman"
fi

# Uncomment the following line to prevent manipulation of JVM options
-sh-4.2$
