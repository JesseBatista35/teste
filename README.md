POD=sicql-mapsfeeder-tqs-5-q65w8

# 1) Motivo do restart e configuração das probes
oc describe pod $POD | grep -E -A6 "Last State|Liveness|Readiness"
oc get events --field-selector involvedObject.name=$POD --sort-by=.lastTimestamp | tail -15

# 2) Fim do log da execução anterior (o que estava acontecendo quando morreu)
oc logs $POD --previous | tail -60

# 3) Erros relevantes
oc logs $POD --previous | grep -Ei 'ERROR|WFLYCTL0211|Cannot resolve|JMSWMQ|MQRC|Exception' | head -40



oc set env dc/sicql-mapspricing-tqs --list | grep -Ei 'mq|queue|ldap|activemq'
oc get dc sicql-mapspricing-tqs -o jsonpath='{.spec.template.spec.containers[0].livenessProbe}{"\n"}{.spec.template.spec.containers[0].readinessProbe}{"\n"}{.spec.template.spec.containers[0].resources}{"\n"}'

oc set env dc/sicql-mapsfeeder-tqs --list | grep -Ei 'mq|queue|ldap|activemq'
oc get dc sicql-mapsfeeder-tqs -o jsonpath='{.spec.template.spec.containers[0].livenessProbe}{"\n"}{.spec.template.spec.containers[0].readinessProbe}{"\n"}{.spec.template.spec.containers[0].resources}{"\n"}'

oc get dc | grep feeder
