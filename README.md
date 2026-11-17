Coleta por arquivo

Shell (como root):

bash
cat > /tmp/coleta.sh <<'EOF'
nproc
free -m
ps -ef | grep -o -- '-D\[Server:[^]]*\] -Xms[0-9a-zA-Z]* -Xmx[0-9a-zA-Z]*'
cat /infra_app/config/sigaf/sigaf_jconnector.properties
EOF
bash /tmp/coleta.sh

CLI:

bash
cat > /tmp/sigaf.cli <<'EOF'
/host=srjtqapllx0056/server=srjtqapllx0056_sigaf_intra_8083/subsystem=datasources/data-source=idmsapf/statistics=pool:read-resource(include-runtime=true)
/host=srjtqapllx0056/server=srjtqapllx0056_sigaf_intra_8083/subsystem=datasources/data-source=db2gaf:read-resource
/server-group=sigaf:read-resource
/server-group=sigaf/jvm=*:read-resource
EOF
sudo -u spjbotr2 /opt/open/jboss/7.0.0/bin/jboss-cli.sh --connect --controller=srjtqapllx0056:9990 --file=/tmp/sigaf.cli | grep -v -i password

As estatísticas do pool são uma foto do momento. O que mais interessa é rodar o comando de estatísticas do idmsapf enquanto a atualização em massa estiver rodando: se ActiveCount chegar a 20 e WaitCount/TimedOut crescerem, está confirmado que o gargalo é o pool do IDMS. Dá para pedir ao Cauan ou à Karina que disparem a atualização enquanto você coleta.
