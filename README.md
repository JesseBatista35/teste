sudo su
/opt/open/jboss/7.0.0/bin/jboss-cli.sh --connect controller=crjtqapllx003:9990

/host=crjtqapllx003/server=crjtqapllx003_sifpp_intra_8080/deployment=sifpp-ear.ear:read-attribute(name=status)




tail -50 /infra_app/logs/sifpp/server-crjtqapllx003_sifpp_intra_8080.log

