cd /opt/jboss/bin   # ajusta pro path real
./jboss-cli.sh --file=/tmp/src/jboss-custom.cli
cat /opt/jboss/standalone/log/server.log | tail -100
