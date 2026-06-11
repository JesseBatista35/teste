Mostrar mais
17:01
Tá subindo! Aguarda uns segundos e verifica se todos os deployments ficaram OK:

bash
ls /opt/jboss-eap/standalone/deployments/*.failed 2>/dev/null || echo "Nenhum .failed - tudo OK!"
bash
ls /opt/jboss-eap/standalone/deployments/*.deployed
