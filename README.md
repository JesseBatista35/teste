sudo -u jboss7 /opt/jboss/jboss-eap-7.0/bin/jboss-cli.sh --connect --controller=localhost:9990 --command="/host=master/server=sisag-lx0041:restart"


ps -ef | grep sisag-lx0041 | grep -v grep

