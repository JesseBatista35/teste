
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc set env dc/sicfd-monitoramento-des -n sicfd-des --list | grep -i -E "URL|DATASOURCE|HOST|SERVICE|TNS"
SPRING_DATASOURCE_DRIVER-CLASS-NAME=oracle.jdbc.OracleDriver
SPRING_DATASOURCE_PASSWORD=${SCFDRD01_ORACLE}
SPRING_DATASOURCE_URL=jdbc:oracle:thin:@10.116.101.7:1521/orad01sc
SPRING_DATASOURCE_USERNAME=SCFDRD01
-sh-4.2$
-sh-4.2$
-sh-4.2$
