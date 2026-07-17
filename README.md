oc get dc sihdg-jboss8-des -n sihdg-des -o yaml | grep -B5 -A30 "initContainers\|command:\|args:\|lifecycle:"

oc get dc sihdg-jboss8-des -n sihdg-des -o yaml | grep -B10 "standalone.xml"
