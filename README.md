
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get cm jboss-config-sihdg-jboss8 -n sihdg-des -o go-template='{{range $k,$v := .data}}{{$k}}{{"\n"}}{{end}}'
standalone.xml
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get cm jboss-config-sihdg-jboss8 -n sihdg-des -o jsonpath='{.data.standalone\.xml}' > /tmp/standalone-des.xml
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ wc -l /tmp/standalone-des.xml
447 /tmp/standalone-des.xml
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep -c sihdgDS /tmp/standalone-des.xml
1
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep -n -i -E "\.des\.|_des|-des" /tmp/standalone-des.xml
56:        <property name="SIHDG-path.arquivo.sinaf" value="/sihdg_des/Arquivos_SINAF/"/>
157:            <spec-descriptor-property-replacement>false</spec-descriptor-property-replacement>
337:                <auth-server-url>https://login.des.caixa/auth</auth-server-url>
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc create configmap jboss-config-sihdg-jboss8 -n sihdg-hmp \
>   --from-file=standalone.xml=/tmp/standalone-des.xml \
>   --dry-run -o yaml | oc replace -f -
configmap/jboss-config-sihdg-jboss8 replaced
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get cm jboss-config-sihdg-jboss8 -n sihdg-hmp -o jsonpath='{.data.standalone\.xml}' | grep -c sihdgDS
1
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -n sihdg-hmp | grep jboss8
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc delete pod <pod-novo-do-jboss8> -n sihdg-hmp
-sh: pod-novo-do-jboss8: Arquivo ou diretório não encontrado
-sh-4.2$
