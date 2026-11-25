Achou. O serviço do JBoss é o jboss-eap-standalone:

bash
systemctl restart jboss-eap-standalone
systemctl status jboss-eap-standalone --no-pager -l

Depois acompanha a subida no log:

bash
journalctl -u jboss-eap-standalone --since "3 min ago" --no-pager | tail -40

Também apareceu o httpd-eap.service em failed. Para o restart que pediram não faz diferença. Mas se o batch ou alguma URL dele passa por esse Apache, vale olhar por que caiu:

bash
systemctl status httpd-eap --no-pager -l
journalctl -u httpd-eap -n 30 --no-pager

Se o pedido é só o JBoss, eu não mexeria no httpd sem combinar com quem pediu. Pode ser que ele esteja parado de propósito nessa VM.
