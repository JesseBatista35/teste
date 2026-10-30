oc get cm jboss-config-sihdg-jboss8 -n sihdg-des -o go-template='{{range $k,$v := .data}}{{$k}}{{"\n"}}{{end}}'

oc get cm jboss-config-sihdg-jboss8 -n sihdg-des -o jsonpath='{.data.standalone\.xml}' > /tmp/standalone-des.xml
wc -l /tmp/standalone-des.xml
grep -c sihdgDS /tmp/standalone-des.xml
grep -n -i -E "\.des\.|_des|-des" /tmp/standalone-des.xml

oc create configmap jboss-config-sihdg-jboss8 -n sihdg-hmp \
  --from-file=standalone.xml=/tmp/standalone-des.xml \
  --dry-run -o yaml | oc replace -f -

oc get cm jboss-config-sihdg-jboss8 -n sihdg-hmp -o jsonpath='{.data.standalone\.xml}' | grep -c sihdgDS

oc get pods -n sihdg-hmp | grep jboss8
oc delete pod <pod-novo-do-jboss8> -n sihdg-hmp

