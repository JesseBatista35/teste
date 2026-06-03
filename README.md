bash/opt/jboss/jboss-eap-7.0/bin/jboss-cli.sh --connect --controller=localhost:9999 --command="/host=master/server=sisag-lx0041:stop"
Aguarda parar e depois:
bash/opt/jboss/jboss-eap-7.0/bin/jboss-cli.sh --connect --controller=localhost:9999 --command="/host=master/server=sisag-lx0041:start"

⚠️ O nome do host pode ser master ou slave dependendo do ambiente. Se der erro, tenta com slave no lugar de master.
