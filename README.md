# procura script de init/serviço
ls -la /etc/init.d/ | grep -i jboss
ls -la /usr/local/EAP-6.0.1/jboss-eap-6.0/bin/init.d/ 2>/dev/null


sudo service jboss restart
# ou
sudo /etc/init.d/jboss restart


# 1. Shutdown gracioso
su - jboss -c "/usr/local/EAP-6.0.1/jboss-eap-6.0/bin/jboss-cli.sh --connect controller=127.0.0.1:10000 command=:shutdown"

# 2. Confirme que caiu (repita o ps até sumir)
ps -ef | grep jboss

# 3. Se o CLI não responder (comum em EAP travado), mate o processo
kill -15 8523
# aguarde ~15-20s, se não morrer:
kill -9 8523

# 4. Suba de novo (mesmo comando visto no ps, como root)
su - jboss -c "LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/usr/local/EAP-6.0.1/jboss-eap-6.0/lock/lock.file /usr/local/EAP-6.0.1/jboss-eap-6.0/bin/standalone.sh -Djboss.bind.address.management=0.0.0.0 -Djboss.socket.binding.port-offset=1 &"


tail -f /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/log/boot.log
tail -f /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/log/server.log


ls -la /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/deployments/ | grep -i sismh
