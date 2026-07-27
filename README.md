cd /opt/open/jboss/7.0.0/bin
./jboss-cli.sh --connect controller=srjdeapllx130:9990


/host=srjdeapllx130/server-config=srjdeapllx130_acessoseguro_intra_5500:restart
/host=srjdeapllx130/server-config=srjdeapllx130_webservice_intra_5502:restart


exit



