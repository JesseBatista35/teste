
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ POD=sicow-penhor-okd-des-60-ndhzc
-sh-4.2$ oc exec $POD -n sicow-des -- ls -la /tmp/ | grep -i jar
-sh-4.2$ oc exec $POD -n sicow-des -- sh -c 'echo JBOSS_VERSION=$JBOSS_VERSION'
JBOSS_VERSION=
-sh-4.2$ oc exec $POD -n sicow-des -- sh -c 'cat -A /tmp/src/jboss-modules 2>/dev/null; cat -A /tmp/src/cli-offline.sh 2>/dev/null'
module add --name=br.gov.caixa.siusr --resource-delimiter=, --resources=/tmp/siusr-loginModule-1.11.0.jar --dependencies=javax.api,sun.jdk,org.apache.commons.lang,javaee.api,org.picketbox-sh-4.2$
