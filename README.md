Próximo passo: comparar a versão do adaptador Keycloak

Na 471 (7.4):

ls /opt/jboss/jboss-eap/modules/system/add-ons/keycloak/org/keycloak/keycloak-core/main/ 2>/dev/null || find /opt/jboss/jboss-eap/modules -name "keycloak-core*.jar" | head -3

No 6.4 (10.116.88.20):

sudo find /opt/jboss/jboss-eap/modules -name "keycloak-core*.jar" | head -3

Se a versão do 6.4 for bem mais antiga, ele provavelmente não faz a mesma checagem de chave que o 7.4 faz. Nesse caso, o 6.4 só “funciona” porque valida de forma menos rígida, e o caminho correto continua sendo o time do CCR usar um token do realm internet, ou decidir em conjunto mudar o realm do ccr-api.

Me manda as duas saídas.
