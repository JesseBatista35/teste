
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# ps -ef | grep sigec-portabilidade-batch | grep -v grep
jboss     72951  72862  4 Out20 ?        02:07:56 /usr/lib/jvm/jdk-1.8.0_471-oracle-x64/jre/bin/java -D[Server:sigec-portabilidade-batch_node1_lx104] -Xms6144m -Xmx6144m -Xloggc:/opt/jboss/jboss-eap/hc/log/gc.log -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=10 -XX:GCLogFileSize=20M -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+PrintGCTimeStamps -XX:+PrintHeapAtGC -XX:+PrintGCCause -Duser.language=pt -Duser.country=BR -Djava.awt.headless=true -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttps.protocols=TLSv1.2 -Dhttp.proxy.bypass.enabled=true -Dhttp.nonProxyHosts=*.caixa|*.des.caixa|*.intra.caixa.gov.br|*.extracaixa|*.siapenet.gov.br|*.caixa.gov.br|apim-parceiros-sandbox.azure-api.net|api.des.caixa| -Dhttp.proxySet=true -XX:+UseG1GC -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/opt/jboss/dumps -DAMBIENTE=DES -DAPI_MANAGER_API_KEY=l714f9532275eb495c85015a769ab99181 -DAPI_MANAGER_URL_BASE=https://api.des.caixa:8443 -DCONNECTION_QUEUE_ENVIO_OPF=Endpoint=sb://servicebus-crc-nprd.servicebus.windows.net/;sharedaccesskeyname=SAScrc;SharedAccessKey=bot1WVFQWxfH23Ip+7lrT5ZBhbv1LnkzC+ASbGD2Y60=;EntityPath=sigec-opf-queue-envia-sigec-por -DCONNECTION_QUEUE_RECEBIMENTO_PAGAMENTO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=SIGEC;SharedAccessKey=8bTBB1PnMqDIYCx6g7Q4y3autRZewNkWi+ASbCO48rI=;EntityPath=topic-recebimento-ted-trc -DCONNECTION_QUEUE_RECEBIMENTO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Sender;SharedAccessKey=/w6Lkh4FKsk6iYYnnz2y4Pv4RPrchigZs+ASbL3grQM=;EntityPath=queue-recebimento-ted-des -DCONNECTION_QUEUE_REQ_ENVIO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Listner;SharedAccessKey=ZwKtWXstbi4vdaAwEMF/bqFt32Uo1b3pc+ASbKjIkbA=;EntityPath=queue-envio-ted-des -DCONNECTION_QUEUE_REQ_PAGAMENTO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Sender;SharedAccessKey=qH+NSwQ3yTLPFeGaELSKSDnvLyWYQnuz5+ASbG6XcwQ=;EntityPath=queue-req-pagamneto-ted-des -DCONNECTION_QUEUE_RSP_PAGAMENTO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Listener;SharedAccessKey=kV2eqtd4Ye3vDsItwoQb4jhGwANBa1V5O+ASbPkRCBA=;EntityPath=queue-rsp-pagamento-ted-des -DCONNECTION_QUEUE_VERIFICACAO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Sender;SharedAccessKey=AkFDPClutoUD69rzUkcbNwRFILo93ICDo+ASbD/CXb4=;EntityPath=queue-verificacao-ted-des -DNUCLEA_URL_BASE=/portabilidade -DNUCLEA_URL_HOST=https://apim-parceiros-sandbox.azure-api.net -DPROCESSAR_BATCH=SIM -DQTD_REGISTROS_ARCC001=5000 -DQTD_REGISTROS_ARCC002=5000 -DQUALIFIED_NAMESPACE_TED_NCR=sb-credito-des.servicebus.windows.net -DQUEUE_ENVIO_OPF=sigec-opf-queue-envia-sigec-por -DQUEUE_ENVIO_TED_NCR=queue-envio-ted-des -DQUEUE_RECEBIMENTO_TED_NCR=queue-recebimento-ted-des -DQUEUE_RSP_PAGAMENTO_TED_NCR=queue-rsp-pagamento-ted-des -DQUEUE_VERIFICACAO_TED_NCR=queue-verificacao-ted-des -DSIGEC_PASSWORD=SGECDB01 -DSIGEC_USUARIO=SGECDB01 -DSIMTR_BASE_URL=/simtr -DSSO_INTERNET2_AUTH_URL=https://loginxdes.caixa.gov.br/auth -DSSO_INTERNET2_BEARER_ONLY=false -DSSO_INTERNET2_PUBLIC_CLIENT=false -DSSO_INTERNET2_REALM_NAME=r_inter_siper -DSSO_INTERNET2_RESOURCE_NAME=cli-web-gec -DSSO_INTERNET2_SECRET=72dab88a-55a9-4d56-ad2e-79319cdba900 -DSSO_INTERNET2_TYPE_OF_SSL_REQUIRED=external -DSSO_INTERNET_AUTH_URL=https://logindes.caixa.gov.br/auth -DSSO_INTERNET_REALM_NAME=internet -DSSO_INTERNET_RESOURCE_NAME=cli-web-gec -DSSO_INTERNET_SECRET=72dab88a-55a9-4d56-ad2e-79319cdba900 -DSSO_INTERNET_TYPE_OF_SSL_REQUIRED=external -DSSO_INTRANET_AUTH_URL=https://login.des.caixa/auth -DSSO_INTRANET_BEARER_ONLY=false -DSSO_INTRANET_PUBLIC_CLIENT=false -DSSO_INTRANET_REALM_NAME=intranet -DSSO_INTRANET_RESOURCE_NAME=cli-web-gec -DSSO_INTRANET_SECRET=897f0b68-56da-4a9e-9f94-17feb26d4e56 -DSSO_INTRANET_TYPE_OF_SSL_REQUIRED=external -DSSO_SERVICO_URL_BASE_INTRANET=https://login.des.caixa -DSUBSCRIPTION_NAME_TED_NCR=SIGEC -DSUBSCRIPTION_RESPOSTA_NAME_TED_NCR=SIGECR1 -DTOPIC_RECEBIMENTO_TED_TRC_NCR=topic-recebimento-ted-trc -Dauth.sso.baseurl=https://login.des.caixa -Dclient.secret=385c6032-c152-465c-97cf-7ac351649caa -Dhttp.proxy.bypass.enabled=true -Djava.awt.headless=true -Djava.net.preferIPv4Stack=true -Djavax.net.ssl.trustStore=/upload/des/certificados/caixa-truststore-acteste-nprd-2025.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.bind.address=10.116.94.211 -Djboss.bind.address.management=10.116.94.211 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.89.0 -Djboss.home.dir=/opt/jboss/jboss-eap -Djboss.modules.system.pkgs=org.jboss.byteman -Djboss.server.log.dir=/opt/jboss/jboss-eap/hc/log/servers/sigec-portabilidade-batch_node1_lx104 -Djboss.server.temp.dir=/opt/jboss/jboss-eap/hc/tmp/servers/sigec-portabilidade-batch_node1_lx104 -Djboss.server.data.dir=/opt/jboss/jboss-eap/hc/data/servers/sigec-portabilidade-batch_node1_lx104 -Dorg.jboss.boot.log.file=/opt/jboss/jboss-eap/hc/log/servers/sigec-portabilidade-batch_node1_lx104/server.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/configuration/default-server-logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules org.jboss.as.server
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# tail -300 /opt/jboss/jboss-eap/hc/servers/sigec-portabilidade-batch_node1_lx104/log/server.log
tail: não foi possível abrir “/opt/jboss/jboss-eap/hc/servers/sigec-portabilidade-batch_node1_lx104/log/server.log” para leitura: Arquivo ou diretório não encontrado
[root@sbrdeapllx104 p585600]# grep -nE "ACTC403|WFLYEJB0241|WFLYEJB0043|OutOfMemory|native thread|stopped" /opt/jboss/jboss-eap/hc/servers/sigec-portabilidade-batch_node1_lx104/log/server.log | tail -50
grep: /opt/jboss/jboss-eap/hc/servers/sigec-portabilidade-batch_node1_lx104/log/server.log: Arquivo ou diretório não encontrado
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# /usr/lib/jvm/jdk-1.8.0_471-oracle-x64/bin/jstack -F <pid> > /tmp/jstack_batch_$(date +%Y%m%d_%H%M).txt
bash: erro de sintaxe próximo do `token' não esperado `>'
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# ss -tnp | grep "pid=<pid>" | grep -cE "10.252.32.6[35]:80"
0
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# exit
exit
-sh-4.2$ ssh 10.116.89.0
***********************************************************************
(1) - Este e um computador privado de propriedade da Caixa Economica
Federal. Usuarios autorizados e nao autorizados nao possuem direitos de
divulgar as informacoes contidas aqui.
(2) - Ao fazer uso do sistema, o usuario esta ciente que pode estar
sendo monitorado, interceptado e auditado pelo departamento competente
da Caixa Economica Federal.
(3) - O uso nao autorizado ou improprio deste sistema pode resultar em
um processo disciplinar administrativo e/ou punicao atraves de acoes
civis ou criminais. Ao continuar o uso deste sistema, indica que voce
esta ciente e concordando com os termos e condicoes acima descritos.

Pressione <Control+D> IMEDIATAMENTE se voce nao concorda com as
condicoes deste aviso
***********************************************************************
p585600@10.116.89.0's password:
Last login: Wed Oct 14 10:08:35 2026 from 10.122.150.31
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ sudo su
[sudo] senha para p585600:
[root@sbrdeapllx069 p585600]# /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /] /host=sbrdeapllx104_credito/server-config=sigec-portabilidade-batch_node1_lx104:read-attribute(name=status)
{
    "outcome" => "success",
    "result" => "STARTED"
}
[domain@10.116.89.0:9999 /]
