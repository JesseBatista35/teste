
[root@caddeapllx2862 p585600]#
[root@caddeapllx2862 p585600]#
[root@caddeapllx2862 p585600]# cd /tmp
unzip -l /opt/jboss-eap/standalone/deployments/boletoService-ear.ear | grep -i '\.war'
unzip -o -q /opt/jboss-eap/standalone/deployments/boletoService-ear.ear '*.war' -d /tmp/boleto
unzip -p /tmp/boleto/*.war WEB-INF/web.xml | grep -iE -A3 'url-pattern|resteasy'
 14531399  11-06-2026 09:36   boletoService-war-2.0.2.8.war
    <param-name>resteasy.scan.resources</param-name>
    <param-value>true</param-value>
  </context-param>
  <servlet>
    <servlet-name>Resteasy</servlet-name>
    <servlet-class>org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher</servlet-class>
    <load-on-startup>1</load-on-startup>
  </servlet>
  <servlet>
--
    <url-pattern>/imprimeboleto</url-pattern>
  </servlet-mapping>
  <servlet-mapping>
    <servlet-name>Resteasy</servlet-name>
    <url-pattern>/*</url-pattern>
  </servlet-mapping>
</web-app>
[root@caddeapllx2862 tmp]#
[root@caddeapllx2862 tmp]#
[root@caddeapllx2862 tmp]#
[root@caddeapllx2862 tmp]#
[root@caddeapllx2862 tmp]#


ha ja ta obm to com pressao vamos para o prixmo
