


sed -n '855,862p' /opt/jboss/jboss-eap/dc/configuration/domain.xml




861:                </global-modules>
[root@sbrdeapllx069 p585600]# sed -n '855,862p' /opt/jboss/jboss-eap/dc/configuration/domain.xml
                    </drivers>
                </datasources>
            </subsystem>
            <subsystem xmlns="urn:jboss:domain:ee:4.0">
                <global-modules>
                    <module name="org.jboss.genericjms.provider" slot="main"/>
                </global-modules>
                <spec-descriptor-property-replacement>false</spec-descriptor-property-replacement>
[root@sbrdeapllx069 p585600]#



root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]# find . -name "*.jar" -o -name "*.war" | while read j; do unzip -l "$j" 2>/dev/null | grep -qiE "applicationinsights|microsoft/applicationinsights" && echo "$j"; done
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]# ls lib 2>/dev/null | grep -iE "insight|azure|opentelemetry|monitor"
azure-core-1.11.0.jar
azure-core-amqp-2.0.0.jar
azure-core-http-netty-1.7.0.jar
azure-identity-1.2.1.jar
azure-messaging-servicebus-7.0.0.jar
gec-azure-4.53.2-batch.build.1.jar
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]# for w in *.war; do unzip -l $w | grep -iE "WEB-INF/lib/.*(insight|azure-monitor|opentelemetry)"; done
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]# unzip -l /opt/jboss/jboss-eap/hc/data/content/be/e2a4602a1e9785994c5ddf82c3153f64c70fc7/content | grep -iE "insight|telemetry"
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]# tr '\0' '\n' < /proc/72951/environ | grep -iE "insight|APPLICATIONINSIGHTS|OTEL"
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]# cd / && rm -rf /tmp/gec
[root@sbrdeapllx104 /]# ss -tnp | grep -E "10.252.32.6[35]:80" | grep -oE 'pid=[0-9]+' | sort | uniq -c
    248 pid=72951
[root@sbrdeapllx104 /]#
[root@sbrdeapllx104 /]#
[root@sbrdeapllx104 /]#
[root@sbrdeapllx104 /]#
[root@sbrdeapllx104 /]#
[root@sbrdeapllx104 /]# timeout 30 tcpdump -i any -nn -l -s0 'tcp dst port 80 and (dst host 10.252.32.63 or dst host 10.252.32.65)' 2>/dev/null \
>  | grep --line-buffered -aoE "211\.[0-9]+ > .*CONNECT [^ ]+" \
>  | while read l; do port=$(echo "$l" | cut -d' ' -f1 | cut -d. -f2); host=$(echo "$l" | awk '{print $NF}'); pid=$(ss -tnp "sport = :$port" | grep -oE 'pid=[0-9]+' | head -1); echo "$host $pid"; done \
>  | sort | uniq -c | sort -rn

^C
[root@sbrdeapllx104 /]#
[root@sbrdeapllx104 /]#
[root@sbrdeapllx104 /]#
[root@sbrdeapllx104 /]#

[root@sbrdeapllx104 /]#
[root@sbrdeapllx104 /]#
[root@sbrdeapllx104 /]#
[root@sbrdeapllx104 /]#
[root@sbrdeapllx104 /]#
[root@sbrdeapllx104 /]#
[root@sbrdeapllx104 /]#
[root@sbrdeapllx104 /]#
[root@sbrdeapllx104 /]#

[root@sbrdeapllx104 /]#
[root@sbrdeapllx104 /]#

[root@sbrdeapllx104 /]#
[root@sbrdeapllx104 /]#
[root@sbrdeapllx104 /]# timeout 30 tcpdump -i any -nn -l -s0 'tcp dst port 80 and (dst host 10.252.32.63 or dst host 10.252.32.65)' 2>/dev/null \
>  | grep --line-buffered -aoE "211\.[0-9]+ > .*CONNECT [^ ]+" \
>  | while read l; do port=$(echo "$l" | cut -d' ' -f1 | cut -d. -f2); host=$(echo "$l" | awk '{print $NF}'); pid=$(ss -tnp "sport = :$port" | grep -oE 'pid=[0-9]+' | head -1); echo "$host $pid"; done \
>  | sort | uniq -c | sort -rn
Terminado
[root@sbrdeapllx104 /]# ps -o pid,args -p <pids_separados_por_virgula> | cut -c1-160
bash: erro de sintaxe próximo do `token' não esperado `|'
[root@sbrdeapllx104 /]#
[root@sbrdeapllx104 /]#
[root@sbrdeapllx104 /]# ps -ef | grep -iE "omsagent|azuremonitor|mdsd|azure" | grep -v grep
jboss     72951  72862  4 Out20 ?        02:11:20 /usr/lib/jvm/jdk-1.8.0_471-oracle-x64/jre/bin/java -D[Server:sigec-portabilidade-batch_node1_lx104] -Xms6144m -Xmx6144m -Xloggc:/opt/jboss/jboss-eap/hc/log/gc.log -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=10 -XX:GCLogFileSize=20M -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+PrintGCTimeStamps -XX:+PrintHeapAtGC -XX:+PrintGCCause -Duser.language=pt -Duser.country=BR -Djava.awt.headless=true -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttps.protocols=TLSv1.2 -Dhttp.proxy.bypass.enabled=true -Dhttp.nonProxyHosts=*.caixa|*.des.caixa|*.intra.caixa.gov.br|*.extracaixa|*.siapenet.gov.br|*.caixa.gov.br|apim-parceiros-sandbox.azure-api.net|api.des.caixa| -Dhttp.proxySet=true -XX:+UseG1GC -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/opt/jboss/dumps -DAMBIENTE=DES -DAPI_MANAGER_API_KEY=l714f9532275eb495c85015a769ab99181 -DAPI_MANAGER_URL_BASE=https://api.des.caixa:8443 -DCONNECTION_QUEUE_ENVIO_OPF=Endpoint=sb://servicebus-crc-nprd.servicebus.windows.net/;sharedaccesskeyname=SAScrc;SharedAccessKey=bot1WVFQWxfH23Ip+7lrT5ZBhbv1LnkzC+ASbGD2Y60=;EntityPath=sigec-opf-queue-envia-sigec-por -DCONNECTION_QUEUE_RECEBIMENTO_PAGAMENTO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=SIGEC;SharedAccessKey=8bTBB1PnMqDIYCx6g7Q4y3autRZewNkWi+ASbCO48rI=;EntityPath=topic-recebimento-ted-trc -DCONNECTION_QUEUE_RECEBIMENTO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Sender;SharedAccessKey=/w6Lkh4FKsk6iYYnnz2y4Pv4RPrchigZs+ASbL3grQM=;EntityPath=queue-recebimento-ted-des -DCONNECTION_QUEUE_REQ_ENVIO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Listner;SharedAccessKey=ZwKtWXstbi4vdaAwEMF/bqFt32Uo1b3pc+ASbKjIkbA=;EntityPath=queue-envio-ted-des -DCONNECTION_QUEUE_REQ_PAGAMENTO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Sender;SharedAccessKey=qH+NSwQ3yTLPFeGaELSKSDnvLyWYQnuz5+ASbG6XcwQ=;EntityPath=queue-req-pagamneto-ted-des -DCONNECTION_QUEUE_RSP_PAGAMENTO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Listener;SharedAccessKey=kV2eqtd4Ye3vDsItwoQb4jhGwANBa1V5O+ASbPkRCBA=;EntityPath=queue-rsp-pagamento-ted-des -DCONNECTION_QUEUE_VERIFICACAO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Sender;SharedAccessKey=AkFDPClutoUD69rzUkcbNwRFILo93ICDo+ASbD/CXb4=;EntityPath=queue-verificacao-ted-des -DNUCLEA_URL_BASE=/portabilidade -DNUCLEA_URL_HOST=https://apim-parceiros-sandbox.azure-api.net -DPROCESSAR_BATCH=SIM -DQTD_REGISTROS_ARCC001=5000 -DQTD_REGISTROS_ARCC002=5000 -DQUALIFIED_NAMESPACE_TED_NCR=sb-credito-des.servicebus.windows.net -DQUEUE_ENVIO_OPF=sigec-opf-queue-envia-sigec-por -DQUEUE_ENVIO_TED_NCR=queue-envio-ted-des -DQUEUE_RECEBIMENTO_TED_NCR=queue-recebimento-ted-des -DQUEUE_RSP_PAGAMENTO_TED_NCR=queue-rsp-pagamento-ted-des -DQUEUE_VERIFICACAO_TED_NCR=queue-verificacao-ted-des -DSIGEC_PASSWORD=SGECDB01 -DSIGEC_USUARIO=SGECDB01 -DSIMTR_BASE_URL=/simtr -DSSO_INTERNET2_AUTH_URL=https://loginxdes.caixa.gov.br/auth -DSSO_INTERNET2_BEARER_ONLY=false -DSSO_INTERNET2_PUBLIC_CLIENT=false -DSSO_INTERNET2_REALM_NAME=r_inter_siper -DSSO_INTERNET2_RESOURCE_NAME=cli-web-gec -DSSO_INTERNET2_SECRET=72dab88a-55a9-4d56-ad2e-79319cdba900 -DSSO_INTERNET2_TYPE_OF_SSL_REQUIRED=external -DSSO_INTERNET_AUTH_URL=https://logindes.caixa.gov.br/auth -DSSO_INTERNET_REALM_NAME=internet -DSSO_INTERNET_RESOURCE_NAME=cli-web-gec -DSSO_INTERNET_SECRET=72dab88a-55a9-4d56-ad2e-79319cdba900 -DSSO_INTERNET_TYPE_OF_SSL_REQUIRED=external -DSSO_INTRANET_AUTH_URL=https://login.des.caixa/auth -DSSO_INTRANET_BEARER_ONLY=false -DSSO_INTRANET_PUBLIC_CLIENT=false -DSSO_INTRANET_REALM_NAME=intranet -DSSO_INTRANET_RESOURCE_NAME=cli-web-gec -DSSO_INTRANET_SECRET=897f0b68-56da-4a9e-9f94-17feb26d4e56 -DSSO_INTRANET_TYPE_OF_SSL_REQUIRED=external -DSSO_SERVICO_URL_BASE_INTRANET=https://login.des.caixa -DSUBSCRIPTION_NAME_TED_NCR=SIGEC -DSUBSCRIPTION_RESPOSTA_NAME_TED_NCR=SIGECR1 -DTOPIC_RECEBIMENTO_TED_TRC_NCR=topic-recebimento-ted-trc -Dauth.sso.baseurl=https://login.des.caixa -Dclient.secret=385c6032-c152-465c-97cf-7ac351649caa -Dhttp.proxy.bypass.enabled=true -Djava.awt.headless=true -Djava.net.preferIPv4Stack=true -Djavax.net.ssl.trustStore=/upload/des/certificados/caixa-truststore-acteste-nprd-2025.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.bind.address=10.116.94.211 -Djboss.bind.address.management=10.116.94.211 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.89.0 -Djboss.home.dir=/opt/jboss/jboss-eap -Djboss.modules.system.pkgs=org.jboss.byteman -Djboss.server.log.dir=/opt/jboss/jboss-eap/hc/log/servers/sigec-portabilidade-batch_node1_lx104 -Djboss.server.temp.dir=/opt/jboss/jboss-eap/hc/tmp/servers/sigec-portabilidade-batch_node1_lx104 -Djboss.server.data.dir=/opt/jboss/jboss-eap/hc/data/servers/sigec-portabilidade-batch_node1_lx104 -Dorg.jboss.boot.log.file=/opt/jboss/jboss-eap/hc/log/servers/sigec-portabilidade-batch_node1_lx104/server.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/configuration/default-server-logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules org.jboss.as.server
jboss     73093  72862  0 Out20 ?        00:26:45 /usr/lib/jvm/jdk-1.8.0_471-oracle-x64/jre/bin/java -D[Server:sigec-portabilidade2_node1_lx104] -Xms1024m -Xmx2048m -Xloggc:/opt/jboss/jboss-eap/hc/log/gc.log -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=10 -XX:GCLogFileSize=20M -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+PrintGCTimeStamps -XX:+PrintHeapAtGC -XX:+PrintGCCause -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.proxySet=true -Dhttp.nonProxyHosts=*.caixa|*.des.caixa -javaagent:/upload/des/sigec/appinsights/applicationinsights-agent.jar -Dapplicationinsights.configuration.file:/upload/des/sigec/appinsights/applicationinsights.json -DAMBIENTE=DES -DAPI_MANAGER_API_KEY=l714f9532275eb495c85015a769ab99181 -DAPI_MANAGER_URL_BASE=https://api.des.caixa:8443 -DCONNECTION_QUEUE_ENVIO_OPF=Endpoint=sb://servicebus-crc-nprd.servicebus.windows.net/;sharedaccesskeyname=SAScrc;SharedAccessKey=bot1WVFQWxfH23Ip+7lrT5ZBhbv1LnkzC+ASbGD2Y60=;EntityPath=sigec-opf-queue-envia-sigec-por -DCONNECTION_QUEUE_RECEBIMENTO_PAGAMENTO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=SIGEC;SharedAccessKey=8bTBB1PnMqDIYCx6g7Q4y3autRZewNkWi+ASbCO48rI=;EntityPath=topic-recebimento-ted-trc -DCONNECTION_QUEUE_RECEBIMENTO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Sender;SharedAccessKey=/w6Lkh4FKsk6iYYnnz2y4Pv4RPrchigZs+ASbL3grQM=;EntityPath=queue-recebimento-ted-des -DCONNECTION_QUEUE_REQ_ENVIO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Listner;SharedAccessKey=ZwKtWXstbi4vdaAwEMF/bqFt32Uo1b3pc+ASbKjIkbA=;EntityPath=queue-envio-ted-des -DCONNECTION_QUEUE_REQ_PAGAMENTO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Sender;SharedAccessKey=qH+NSwQ3yTLPFeGaELSKSDnvLyWYQnuz5+ASbG6XcwQ=;EntityPath=queue-req-pagamneto-ted-des -DCONNECTION_QUEUE_RSP_PAGAMENTO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Listener;SharedAccessKey=kV2eqtd4Ye3vDsItwoQb4jhGwANBa1V5O+ASbPkRCBA=;EntityPath=queue-rsp-pagamento-ted-des -DCONNECTION_QUEUE_VERIFICACAO_TED_NCR=Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Sender;SharedAccessKey=AkFDPClutoUD69rzUkcbNwRFILo93ICDo+ASbD/CXb4=;EntityPath=queue-verificacao-ted-des -DNUCLEA_URL_BASE=/portabilidade -DNUCLEA_URL_HOST=https://apim-parceiros-sandbox.azure-api.net -DQTD_REGISTROS_ARCC001=5000 -DQTD_REGISTROS_ARCC002=5000 -DQUALIFIED_NAMESPACE_TED_NCR=sb-credito-des.servicebus.windows.net -DQUEUE_ENVIO_OPF=sigec-opf-queue-envia-sigec-por -DQUEUE_ENVIO_TED_NCR=queue-envio-ted-des -DQUEUE_RECEBIMENTO_TED_NCR=queue-recebimento-ted-des -DQUEUE_REQ_PAGAMENTO_TED_NCR=queue-req-pagamneto-ted-des -DQUEUE_RSP_PAGAMENTO_TED_NCR=queue-rsp-pagamento-ted-des -DQUEUE_VERIFICACAO_TED_NCR=queue-verificacao-ted-des -DSIGEC_PASSWORD=SGECDB01 -DSIGEC_USUARIO=SGECDB01 -DSIMTR_BASE_URL=/simtr -DSSO_INTERNET2_AUTH_URL=https://loginxdes.caixa.gov.br/auth -DSSO_INTERNET2_BEARER_ONLY=false -DSSO_INTERNET2_PUBLIC_CLIENT=false -DSSO_INTERNET2_REALM_NAME=r_inter_siper -DSSO_INTERNET2_RESOURCE_NAME=cli-web-gec -DSSO_INTERNET2_SECRET=72dab88a-55a9-4d56-ad2e-79319cdba900 -DSSO_INTERNET2_TYPE_OF_SSL_REQUIRED=external -DSSO_INTERNET_AUTH_URL=https://logindes.caixa.gov.br/auth -DSSO_INTERNET_REALM_NAME=internet -DSSO_INTERNET_RESOURCE_NAME=cli-web-gec -DSSO_INTERNET_SECRET=72dab88a-55a9-4d56-ad2e-79319cdba900 -DSSO_INTERNET_TYPE_OF_SSL_REQUIRED=all -DSSO_INTRANET_AUTH_URL=https://login.des.caixa/auth -DSSO_INTRANET_BEARER_ONLY=false -DSSO_INTRANET_PUBLIC_CLIENT=false -DSSO_INTRANET_REALM_NAME=intranet -DSSO_INTRANET_RESOURCE_NAME=cli-web-gec -DSSO_INTRANET_SECRET=897f0b68-56da-4a9e-9f94-17feb26d4e56 -DSSO_INTRANET_TYPE_OF_SSL_REQUIRED=EXTERNAL -DSSO_SERVICO_URL_BASE_INTRANET=https://login.des.caixa -DSUBSCRIPTION_NAME_TED_NCR=SIGEC -DSUBSCRIPTION_RESPOSTA_NAME_TED_NCR=SIGECR1 -DTOPIC_RECEBIMENTO_TED_TRC_NCR=topic-recebimento-ted-trc -Dclient.secret=385c6032-c152-465c-97cf-7ac351649caa -Dhttp.proxy.bypass.enabled=true -Djava.awt.headless=true -Djava.net.preferIPv4Stack=true -Djavax.net.ssl.trustStore=/upload/des/sigec/certificado/cacerts.jks -Djavax.net.ssl.trustStorePassword=jbosseap -Djboss.bind.address=10.116.94.211 -Djboss.bind.address.management=10.116.94.211 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.89.0 -Djboss.home.dir=/opt/jboss/jboss-eap -Djboss.modules.system.pkgs=org.jboss.byteman -Djboss.server.log.dir=/opt/jboss/jboss-eap/hc/log/servers/sigec-portabilidade2_node1_lx104 -Djboss.server.temp.dir=/opt/jboss/jboss-eap/hc/tmp/servers/sigec-portabilidade2_node1_lx104 -Djboss.server.data.dir=/opt/jboss/jboss-eap/hc/data/servers/sigec-portabilidade2_node1_lx104 -Dorg.jboss.boot.log.file=/opt/jboss/jboss-eap/hc/log/servers/sigec-portabilidade2_node1_lx104/server.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/configuration/default-server-logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules org.jboss.as.server
[root@sbrdeapllx104 /]#
