[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]# curl -x http://<proxy_corporativo>:<porta> -o /tmp/jboss-logmanager-1.5.4.Final-redhat-1.jar \
>   "https://maven.repository.redhat.com/ga/org/jboss/logmanager/jboss-logmanager/1.5.4.Final-redhat-1/jboss-logmanager-1.5.4.Final-redhat-1.jar"
bash: proxy_corporativo: Arquivo ou diretório não encontrado
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]# find / -path /proc -prune -o -iname "jboss-logmanager*.jar" -print 2>/dev/null
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-6.4.23.CP/org/jboss/logmanager/main/jboss-logmanager-1.5.8.Final-redhat-1.jar
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-6.4.21.CP/org/jboss/logmanager/main/jboss-logmanager-1.5.8.Final-redhat-1.jar
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-6.4.17.CP/org/jboss/logmanager/main/jboss-logmanager-1.5.7.Final-redhat-1.jar
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-6.4.15.CP/org/jboss/logmanager/main/jboss-logmanager-1.5.6.Final-redhat-1.jar
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-6.4.20.CP/org/jboss/logmanager/main/jboss-logmanager-1.5.8.Final-redhat-1.jar
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-6.4.22.CP/org/jboss/logmanager/main/jboss-logmanager-1.5.8.Final-redhat-1.jar
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-6.4.24.CP/org/jboss/logmanager/main/jboss-logmanager-1.5.8.Final-redhat-1.jar
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-6.4.10.CP/org/jboss/logmanager/main/jboss-logmanager-1.5.6.Final-redhat-1.jar
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-6.4.11.CP/org/jboss/logmanager/main/jboss-logmanager-1.5.6.Final-redhat-1.jar
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-6.4.12.CP/org/jboss/logmanager/main/jboss-logmanager-1.5.6.Final-redhat-1.jar
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-6.4.13.CP/org/jboss/logmanager/main/jboss-logmanager-1.5.6.Final-redhat-1.jar
/opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-6.4.19.CP/org/jboss/logmanager/main/jboss-logmanager-1.5.8.Final-redhat-1.jar
/opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-1.5.4.Final-redhat-1.jar
/opt/jboss/jboss-eap/modules_bkp/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.0.7.Final-redhat-1.jar
/opt/jboss/jboss-eap/modules_bkp/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/org/jboss/logmanager/main/jboss-logmanager-2.0.11.Final-redhat-00001.jar

