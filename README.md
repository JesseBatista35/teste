oc rsh siabm-autenticacao-api-des-195-zvv72 -n siabm-des


ls -la $JBOSS_HOME/modules/system/layers/base/org/wildfly/common/main/
ls -la $JBOSS_HOME/modules/system/layers/base/org/jboss/logmanager/main/
echo $JBOSS_HOME


oc debug siabm-autenticacao-api-des-195-zvv72 -n siabm-des
