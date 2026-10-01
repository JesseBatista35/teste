
-sh-4.2$ oc get pv sihdg-jboss8-pwc-tqs sihdg-jboss8-data-tqs -o custom-columns=PV:.metadata.name,SERVER:.spec.nfs.server,PATH:.spec.nfs.path,CAP:.spec.capacity.storage,CLAIM:.spec.claimRef.name
PV                      SERVER                 PATH                    CAP       CLAIM
sihdg-jboss8-pwc-tqs    hypernprd12.ad.caixa   /fs_sihdg_powercenter   50Gi      sihdg-jboss8-pwc-tqs
sihdg-jboss8-data-tqs   hypernprd12.ad.caixa   /fs_sihdg_tqs           20Gi      sihdg-jboss8-data-tqs
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc sihdg-jboss8-tqs -n sihdg-tqs -o jsonpath='{range .spec.template.spec.containers[*].volumeMounts[*]}{.name}{" -> "}{.mountPath}{"\n"}{end}'
sihdg-jboss8-pwc-tqs -> /sihdg_powercenter
sihdg-jboss8-data-tqs -> /sihdg_tqs
caixa-truststore-acteste-nprd -> /opt/server/standalone/configuration/caixa-truststore-acteste-nprd.jks
jboss-config-sihdg-jboss8 -> /opt/server/standalone/configuration/standalone.xml
java-config-sihdg-jboss8 -> /opt/server/bin/standalone.conf
-sh-4.2$
