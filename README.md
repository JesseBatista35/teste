/opt/open/jboss/7.0.0/bin/jboss-cli.sh --connect controller=srjdeapllx158:9990


/host=srjdeapllx158/server-config=srjdeapllx158_sifpp_intra_8081:stop(blocking=true)

/host=srjdeapllx158/server-config=srjdeapllx158_sifpp_intra_8081:read-attribute(name=status)





/host=srjdeapllx158/server-config=srjdeapllx158_sifpp_intra_8081:start(blocking=true)

/host=srjdeapllx158/server-config=srjdeapllx158_sifpp_intra_8081:read-attribute(name=status)
