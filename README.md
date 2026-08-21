ps -ef | grep "Server:srjdeapllx158_sifpp_intra_8081" | grep -v grep


/opt/open/jboss/7.0.0/bin/jboss-cli.sh --connect controller=srjdeapllx158:9990

/host=srjdeapllx158/server=srjdeapllx158_sifpp_intra_8081/subsystem=logging/periodic-rotating-file-handler=FILE:read-resource

/host=srjdeapllx158/server=srjdeapllx158_sifpp_intra_8081/deployment=sifpp-ear.ear:read-attribute(name=status)

