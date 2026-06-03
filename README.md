Está escutando no IP 10.116.88.98, não em localhost. Tenta:
bash/opt/jboss/jboss-eap-7.0/bin/jboss-cli.sh --connect --controller=10.116.88.98:9990
Se conectar, aí dentro rode:
bash:read-children-names(child-type=host)
