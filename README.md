/opt/jboss/jboss-eap-7.0/bin/jboss-cli.sh --connect --controller=10.192.222.239:9999 --command=":shutdown(restart=true)"

/opt/jboss/jboss-eap-7.0/bin/jboss-cli.sh --connect --controller=remote://10.192.222.239:9999 --command=":shutdown(restart=true)"


/opt/jboss/jboss-eap-7.0/bin/jboss-cli.sh
[disconnected /] connect 10.192.222.239:9999
