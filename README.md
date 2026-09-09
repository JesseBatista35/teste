
su - jboss -c "/etc/init.d/jboss-7.0_hc_des.sh restart"


/opt/jboss/jboss-eap-7.0/bin/jboss-cli.sh --connect controller=10.192.222.239:9999
:shutdown(restart=true)
