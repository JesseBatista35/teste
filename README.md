
-sh-4.2$
-sh-4.2$ oc get dc sihdg-jboss8-tqs -n sihdg-tqs -o jsonpath='{range .spec.template.spec.volumes[*]}{.name}{" -> "}{.persistentVolumeClaim.claimName}{.nfs.server}{":"}{.nfs.path}{"\n"}{end}'
sihdg-jboss8-pwc-tqs -> sihdg-jboss8-pwc-tqs:
sihdg-jboss8-data-tqs -> sihdg-jboss8-data-tqs:
caixa-truststore-acteste-nprd -> :
jboss-config-sihdg-jboss8 -> :
java-config-sihdg-jboss8 -> :
-sh-4.2$ oc get pvc -n sihdg-tqs
NAME                     STATUS    VOLUME                   CAPACITY   ACCESS MODES   STORAGECLASS   AGE
sihdg-backend-data-tqs   Bound     sihdg-backend-data-tqs   20Gi       RWX                           174d
sihdg-jboss8-data-tqs    Bound     sihdg-jboss8-data-tqs    20Gi       RWX                           14d
sihdg-jboss8-pwc-tqs     Bound     sihdg-jboss8-pwc-tqs     50Gi       RWX                           14d
-sh-4.2$
