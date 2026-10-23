POD=sicow-penhor-okd-des-60-ndhzc
oc exec $POD -n sicow-des -- ls -la /tmp/ | grep -i jar
oc exec $POD -n sicow-des -- sh -c 'echo JBOSS_VERSION=$JBOSS_VERSION'
oc exec $POD -n sicow-des -- sh -c 'cat -A /tmp/src/jboss-modules 2>/dev/null; cat -A /tmp/src/cli-offline.sh 2>/dev/null'
