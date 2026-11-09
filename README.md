<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xmlns="http://java.sun.com/xml/ns/javaee" xmlns:web="http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd"
  xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd"
  id="WebApp_ID" version="2.5">
  <display-name>sigsj_intranet_2.0</display-name>
  <context-param>
    <param-name>com.sun.faces.numberOfLogicalViews</param-name>
    <param-value>10</param-value>
  </context-param>
  <context-param>
    <param-name>com.sun.faces.numberOfViewsInSession</param-name>
    <param-value>20</param-value>
  </context-param>
  <context-param>
    <param-name>com.sun.faces.validateXml</param-name>
    <param-value>false</param-value>
  </context-param>
  <context-param>
    <param-name>com.sun.faces.verifyObjects</param-name>
    <param-value>false</param-value>
  </context-param>
  <context-param>
    <param-name>facelets.DEVELOPMENT</param-name>
    <param-value>false</param-value>
  </context-param>
  <context-param>
    <param-name>facelets.LIBRARIES</param-name>
    <param-value>/WEB-INF/facelet/confirm.taglib.xml;/WEB-INF/facelet/guia/guias.taglib.xml</param-value>
  </context-param>
  <context-param>
    <param-name>javax.faces.DEFAULT_SUFFIX</param-name>
    <param-value>.xhtml</param-value>
  </context-param>
  <context-param>
    <param-name>javax.faces.STATE_SAVING_METHOD</param-name>
    <param-value>server</param-value>
  </context-param>
  <context-param>
    <param-name>org.ajax4jsf.COMPRESS_SCRIPT</param-name>
    <param-value>false</param-value>
  </context-param>
  
  <!--  -->
  <context-param>
    <param-name>org.ajax4jsf.VIEW_HANDLERS</param-name>
    <param-value>com.sun.facelets.FaceletViewHandler</param-value>
  </context-param>
  <context-param>
    <param-name>org.ajax4jsf.xmlparser.NEKO</param-name>
    <param-value>.*\..*</param-value>
  </context-param>
  <context-param>
    <param-name>org.ajax4jsf.xmlparser.ORDER</param-name>
    <param-value>NEKO</param-value>
  </context-param>
  <context-param>
    <param-name>org.richfaces.LoadScriptStrategy</param-name>
    <param-value>ALL</param-value>
  </context-param>
  <context-param>
    <param-name>org.richfaces.LoadStyleStrategy</param-name>
    <param-value>ALL</param-value>
  </context-param>
  <context-param>
    <param-name>org.richfaces.SKIN</param-name>
    <param-value>classic</param-value>
  </context-param>
  
  
  <!-- 2. Força o JSF antigo a tratar valores vazios/nulos sem estourar NullPointerException -->
  <context-param>
      <param-name>javax.faces.INTERPRET_EMPTY_STRING_SUBMITTED_VALUES_AS_NULL</param-name>
      <param-value>false</param-value>
  </context-param> 

  <!-- 3. Garante que o JBoss use as bibliotecas antigas do JSF guardadas no projeto -->
  <context-param>
      <param-name>org.jboss.jbossfaces.WAR_BUNDLES_JSF_IMPL</param-name>
      <param-value>true</param-value>
  </context-param>

  <!-- 4. Desativa o Weld moderno para evitar conflito com os Managed Beans legados -->
  <context-param>
      <param-name>org.jboss.as.jsf.WELD_INTEGRATION_ENABLED</param-name>
      <param-value>false</param-value>
  </context-param>

	<context-param>
	    <param-name>facelets.encoding</param-name>
	    <param-value>ISO-8859-1</param-value> 
	</context-param>

	<context-param>
	    <param-name>org.apache.el.parser.COERCE_TO_ZERO</param-name>
	    <param-value>true</param-value>
	</context-param>


  <context-param>
    <param-name>javax.faces.CONFIG_FILES</param-name>
    <param-value>/WEB-INF/managed-beans.xml,/WEB-INF/navigation-rules.xml</param-value>
  </context-param>
  <context-param>
  	<param-name>releaseBundle</param-name>
  	<param-value>/apl/sigsj/properties/config.properties</param-value>
  </context-param>
  <filter>
    <display-name>RichFaces Filter</display-name>
    <filter-name>richfaces</filter-name>
    <filter-class>org.ajax4jsf.Filter</filter-class>
    <init-param>
      <param-name>forceparser</param-name>
      <param-value>false</param-value>
    </init-param>
    <init-param>
      <param-name>enable-cache</param-name>
      <param-value>true</param-value>
    </init-param>
    <init-param>
      <param-name>createTempFiles</param-name>
      <param-value>false</param-value>
    </init-param>
  </filter>
  <filter-mapping>
    <filter-name>richfaces</filter-name>
    <servlet-name>Faces Servlet</servlet-name>
    <dispatcher>FORWARD</dispatcher>
    <dispatcher>REQUEST</dispatcher>
    <dispatcher>INCLUDE</dispatcher>
  </filter-mapping>
  
  
  <filter>
  	<filter-name>exceptionfilter</filter-name>
    <filter-class>br.gov.caixa.sigsj.intranet.filter.ExceptionFilter</filter-class>
  </filter>
  <filter-mapping>
  	<filter-name>exceptionfilter</filter-name>
    <url-pattern>/*</url-pattern>
  </filter-mapping> 
  <servlet>
    <servlet-name>Faces Servlet</servlet-name>
    <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
    <load-on-startup>1</load-on-startup>
  </servlet>
  <servlet>
    <servlet-name>Caixa Config</servlet-name>
    <servlet-class>br.gov.caixa.sigsj.intranet.servlet.CaixaConfigServlet</servlet-class>
    <init-param>
      <param-name>log4j-Caixa</param-name>
      <param-value>/log_jboss/config-log4j/sigsj_intranet.xml</param-value>
    </init-param>
    <init-param>
      <param-name>nome_sistema</param-name>
      <param-value>SIGSJ</param-value>
    </init-param>
    <load-on-startup>1</load-on-startup>
  </servlet>
  <servlet>
    <display-name>Autenticacao</display-name>
    <servlet-name>Autenticacao</servlet-name>
    <servlet-class>br.gov.caixa.sigsj.intranet.servlet.AutenticadorServlet</servlet-class>
  </servlet>
  <servlet>
    <servlet-name>BaixaDeArquivosServlet</servlet-name>
    <servlet-class>br.gov.caixa.sigsj.intranet.servlet.BaixaDeArquivosServlet</servlet-class>
    <load-on-startup>-1</load-on-startup>
  </servlet>
  <servlet-mapping>
    <servlet-name>Faces Servlet</servlet-name>
    <url-pattern>*.xhtml</url-pattern>
	</servlet-mapping>
  <servlet-mapping>
    <servlet-name>Autenticacao</servlet-name>
    <url-pattern>/Autenticacao</url-pattern>
  </servlet-mapping>
  <servlet-mapping>
    <servlet-name>BaixaDeArquivosServlet</servlet-name>
    <url-pattern>/BaixaDeArquivos</url-pattern>
  </servlet-mapping>
  <welcome-file-list>
    <welcome-file>index.xhtml</welcome-file>
  </welcome-file-list>
  <error-page>
    <error-code>500</error-code>
    <location>/mensagem/erro.jsp</location>
  </error-page>
  <error-page>
    <error-code>404</error-code>
    <location>/mensagem/404.xhtml</location>
  </error-page>
  <error-page>
    <error-code>403</error-code>
    <location>/mensagem/erro_403.jsp</location>
  	
  </error-page>
  <error-page>
    <exception-type>
      javax.faces.application.ViewExpiredException
    </exception-type>
    <location>/login.jsp</location>
  </error-page>
  <security-constraint>
    <web-resource-collection>
      <web-resource-name>SecureCaixa</web-resource-name>
      <url-pattern>*.xhtml</url-pattern>
      <url-pattern>/Autenticacao</url-pattern>
      <http-method>GET</http-method>
      <http-method>POST</http-method>
    </web-resource-collection>
    <auth-constraint>
      <role-name>GSJ001</role-name>
      <role-name>GSJ002</role-name>
      <role-name>GSJ003</role-name>
      <role-name>GSJ004</role-name>
      <role-name>GSJ005</role-name>
      <role-name>GSJ006</role-name>
      <role-name>GSJ007</role-name>
      <role-name>GSJ008</role-name>
      <role-name>GSJ009</role-name>
      <role-name>GSJ010</role-name>
    </auth-constraint>
  </security-constraint>
  <login-config>
    <auth-method>FORM</auth-method>
    <realm-name>ldapRealm</realm-name>
    <form-login-config>
      <form-login-page>/login.jsp</form-login-page>
      <form-error-page>/errorLogin.jsp</form-error-page>
    </form-login-config>
  </login-config>
  <security-role>
    <description>Perfil</description>
    <role-name>GSJ002</role-name>
  </security-role>
  <security-role>
    <description>Perfil</description>
    <role-name>GSJ005</role-name>
  </security-role>
  <security-role>
    <description>Perfil</description>
    <role-name>GSJ006</role-name>
  </security-role>
  <security-role>
    <description>Perfil</description>
    <role-name>GSJ007</role-name>
  </security-role>
  <security-role>
    <description>Perfil</description>
    <role-name>GSJ008</role-name>
  </security-role>
  <security-role>
    <description>Perfil</description>
    <role-name>GSJ009</role-name>
  </security-role>
  <security-role>
    <description>Perfil</description>
    <role-name>GSJ010</role-name>
  </security-role>
  <security-role>
    <description>Perfil Todos</description>
    <role-name>GSJ001</role-name>
  </security-role>
  <security-role>
    <description>Sr</description>
    <role-name>GSJ003</role-name>
  </security-role>
  <security-role>
    <description>Perfil Gestor</description>
    <role-name>GSJ004</role-name>
  </security-role>
  
  


<!--  
  <ejb-ref>
    <ejb-ref-name>ejb/caixa.sirotcon.SIROTConEJB</ejb-ref-name>
    <ejb-ref-type>Session</ejb-ref-type>
    <home>br.gov.caixa.sirot.ejb.SIROTConHome</home>
    <remote>br.gov.caixa.sirot.ejb.SIROTCon</remote>
  </ejb-ref> -->
  
</web-app>


<img width="1877" height="925" alt="image" src="https://github.com/user-attachments/assets/fb1e3864-91e2-41c2-b70b-9aa5638974aa" />
