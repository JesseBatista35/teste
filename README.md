find /opt/jboss -iname "sifec*" 2>/dev/null | grep -v "/tmp/vfs"

/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=localhost:9990

# deployments e em quais server-groups estão
deployment-info

# server-groups existentes
ls /server-group

# servidores e status em cada host
ls /host
/host=*/server-config=*:read-attribute(name=status)

