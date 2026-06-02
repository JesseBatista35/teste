O vivavoz está em Failed. Tenta com o outro:
bashoc exec -n sisou-des sisou-sac-okd-des-42-9xlw2 -- cat /opt/jboss/bin/standalone.conf > /tmp/sac.conf && oc exec -n sisou-des sisou-vivavoz-okd-des-41-deploy -- cat /opt/jboss/bin/standalone.conf > /tmp/vivavoz.conf && diff /tmp/sac.conf /tmp/vivavoz.conf
Se não conseguir nesse também, executa só:
bashcat /tmp/sac.conf | head -35
