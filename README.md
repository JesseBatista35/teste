# 1. Causa raiz completa
grep -n -A40 "consultaOperacaoHabitacionalBean" $JBOSS_HOME/standalone/log/server.log | grep -m5 "Caused by"

# 2. Placeholders que sobraram no config
grep -nE '#\{|__[A-Z_]+__|\$\(' $JBOSS_HOME/standalone/configuration/standalone*.xml

# 3. Datasources
$JBOSS_HOME/bin/jboss-cli.sh -c --command="/subsystem=datasources:read-resource(recursive=false)"
$JBOSS_HOME/bin/jboss-cli.sh -c --command="/subsystem=datasources/data-source=<NOME>:test-connection-in-pool"

# 4. Conectividade com os destinos do config (banco, WS)
nc -zv <host_banco> <porta>
