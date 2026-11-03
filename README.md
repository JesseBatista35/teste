# no antigo (sbrdeaprlx052)
grep -RniE 'CreateBalancers|UseAlias' /opt/jbcs-httpd24-2.4/httpd/*.conf /opt/jbcs-httpd24-2.4/httpd/conf /opt/jbcs-httpd24-2.4/httpd/conf.d 2>/dev/null

# no novo (caddeapllx2794)
grep -RniE 'CreateBalancers|UseAlias' /opt/httpd/conf /opt/httpd/conf.d


httpd -t && httpd -k graceful

No sbrdeapllx104 (10.116.94.211):

bash
tail -100 /opt/jboss/jboss-eap/domain/servers/sigec-portabilidade-batch_node1_lx104/log/server.log

Procure onde o boot parou: um deploy pendurado, timers, ou conexão com fila ou banco.

Para validar o Apache novo, o Online já basta. O teste do Batch fica para quando ele estiver STARTED.

