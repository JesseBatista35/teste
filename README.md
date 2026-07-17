oc get dc sihdg-jboss8-des -n sihdg-des -o jsonpath='{.spec.template.spec.containers[*].name}'


oc patch dc sihdg-jboss8-des -n sihdg-des --type=json -p='[
  {"op":"replace","path":"/spec/template/spec/containers/0/volumeMounts/0/mountPath","value":"/opt/server/standalone/configuration/standalone.xml"},
  {"op":"replace","path":"/spec/template/spec/containers/0/volumeMounts/0/subPath","value":"standalone.xml"}
]'

oc rollout latest dc/sihdg-jboss8-des -n sihdg-des


oc rollout status dc/sihdg-jboss8-des -n sihdg-des --watch
