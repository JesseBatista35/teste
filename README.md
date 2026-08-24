# Ver detalhes do erro mais recente
systemctl status jboss-eap6-CSD2.service --no-pager -l
journalctl -xe --no-pager | tail -60

# Ver log específico do JBoss para CSD2, que deve ter sido criado/atualizado no start
tail -50 /var/log/jboss-as/consoleCSD2.log
tail -50 /home/siaoi/jboss-eap-6.4/CSD2/log/server.log

/etc/rc.d/init.d/jboss-eap6-CSD2.sh start
