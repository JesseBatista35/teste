Rode no 6.4 (se der “Permission denied”, repita com sudo na frente):

1. Datasource do SICCR (o comando não mostra senha):

grep -A8 'OracleSiccrDS"' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -E "jndi-name|connection-url|user-name|<profile"

Compare com o 7.4: oracle-nprd-1000.caixa:1521/prim_D01NGSRV, usuário SCCRBD01.

2. Em qual profile e server-group o PJ roda no 6.4:

grep -nE '<profile name=|<server-group name=' /opt/jboss/jboss-eap/dc/configuration/domain.xml

Se aparecerem vários profiles, o datasource do passo 1 pode ter mais de uma versão. A que vale é a do profile do server-group do PJ.

3. Keycloak do PJ no 6.4 (sem o secret):

grep -A15 'secure-deployment name="workflow-credito-pj-web.war"' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -vi secret

Interessa se aparece principal-attribute.

4. Nomes das system properties do 6.4, sem valores, para comparar com as do 7.4:

grep -oE '<property name="[^"]*"' /opt/jboss/jboss-eap/dc/configuration/domain.xml | sort -u

Pode me mandar as quatro saídas. Se o banco do passo 1 for o mesmo, descartamos a falta de dados e a comparação dos passos 3 e 4 deve mostrar o que está diferente. Se você notar algum valor sensível na saída (senha ou secret), apague antes de colar na sala.
