-sh-4.1$
-sh-4.1$ awk 'NR<=13183 && /<profile /{line=NR; name=$0} END{print line": "name}' /opt/jboss/jboss-eap/dc/configuration/domain.xml
13108:         <profile name="full-ha-siouv">
-sh-4.1$ ls -la /opt/jboss/jboss-eap/dc/configuration/domain.xml
-rw-rw-r-- 1 jboss jboss 4084127 Jul 13 14:49 /opt/jboss/jboss-eap/dc/configuration/domain.xml
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ sed -n '13108p' /opt/jboss/jboss-eap/dc/configuration/domain.xml
        <profile name="full-ha-siouv">
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ ssh 10.116.88.30
The authenticity of host '10.116.88.30 (10.116.88.30)' can't be established.
RSA key fingerprint is 47:94:27:b0:1d:c9:4d:14:74:01:fa:59:44:15:e3:52.
Are you sure you want to continue connecting (yes/no)? yes
Warning: Permanently added '10.116.88.30' (RSA) to the list of known hosts.
***********************************************************************
(1) - Este e um computador privado de propriedade da Caixa Economica
Federal. Usuarios autorizados e nao autorizados nao possuem direitos de
divulgar as informacoes contidas aqui.
(2) - Ao fazer uso do sistema, o usuario esta ciente que pode estar
sendo monitorado, interceptado e auditado pelo departamento competente
da Caixa Economica Federal.
(3) - O uso nao autorizado ou improprio deste sistema pode resultar em
um processo disciplinar administrativo e/ou punicao atraves de acoes
civis ou criminais. Ao continuar o uso deste sistema, indica que voce
esta ciente e concordando com os termos e condicoes acima descritos.

Pressione <Control+D> IMEDIATAMENTE se voce nao concorda com as
condicoes deste aviso
***********************************************************************
p585600@10.116.88.30's password:
Last login: Mon Jul 13 14:29:44 2026 from 10.122.150.31
-sh-4.1$ tail -100 /logs/jboss-eap/hc/servers/siouv_node1_lx0002/server.log | grep -iE "refused|exception|error"
Caused by: org.hibernate.exception.GenericJDBCException: Could not open connection
        at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:54) [hibernate-core-4.2.27.Final-redhat-1.jar:4.2.27.Final-redhat-1]
        at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:124) [hibernate-core-4.2.27.Final-redhat-1.jar:4.2.27.Final-redhat-1]
        at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:109) [hibernate-core-4.2.27.Final-redhat-1.jar:4.2.27.Final-redhat-1]
Caused by: java.sql.SQLException: javax.resource.ResourceException: IJ000453: Unable to get managed connection for java:/jdbc/OracleSiouvDS
Caused by: javax.resource.ResourceException: IJ000453: Unable to get managed connection for java:/jdbc/OracleSiouvDS
Caused by: javax.resource.ResourceException: IJ000658: Unexpected throwable while trying to create a connection: null
Caused by: javax.resource.ResourceException: Could not create connection
Caused by: java.sql.SQLException: Listener refused the connection with the following error:
Caused by: oracle.net.ns.NetException: Listener refused the connection with the following error:
-sh-4.1$
