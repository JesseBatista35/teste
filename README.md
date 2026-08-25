ps -ef | grep java | grep "jboss-eap-7.0" | /usr/xpg4/bin/grep -oE "jboss.bind.address(.management)?=[0-9.]+|jboss.domain.base.dir=[^ ]+"


ps -ef | grep java | grep "jboss-eap-7.0" | egrep "jboss.bind.address|jboss.domain.base.dir"


