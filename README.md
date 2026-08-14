scp SicemWEB_6.1.0.11.31.war p585600@10.116.88.24:/caixa/usr/p585600/

ssh p585600@10.116.88.24
ls -la /caixa/usr/p585600/SicemWEB_6.1.0.11.31.war




/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.88.20:9999

deploy /caixa/usr/p585600/SicemWEB_6.1.0.11.31.war --server-groups=<nome_do_server_group>

