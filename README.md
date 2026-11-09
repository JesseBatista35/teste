
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc set env dc/sismn-gecci-tqs --list -n sismn-tqs | grep -i datasource
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec sismn-gecci-tqs-28-glhxs -c sismn-gecci-tqs -n sismn-tqs -- env | grep -iE 'datasource|jdbc'
QUARKUS_DATASOURCE_USERNAME=f710695
QUARKUS_DATASOURCE_PASSWORD=E5BP9ZXp
QUARKUS_DATASOURCE_JDBC_URL=jdbc:sybase:Tds:bbrdedadux001.corecaixa:20113?ServiceName=SMNDB001
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc sismn-gecci-tqs -n sismn-tqs -o yaml | grep -iE -A4 'envFrom|secretRef|configMapRef'
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get secret,cm -n sismn-tqs | grep -i gecci

secret/sismn-gecci-tqs                 Opaque                                1         244d
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec sismn-gecci-tqs-28-glhxs -c sismn-gecci-tqs -n sismn-tqs -- sh -c 'grep -ri "datasource" /deployments/config/ /deployments/*.properties 2>/dev/null'
command terminated with exit code 2
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
