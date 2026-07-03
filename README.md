<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns="http://java.sun.com/xml/ns/javaee"
	xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd"
	metadata-complete="false" version="3.0">
	<display-name>SIARG</display-name>
	<context-param>
		<param-name>javax.faces.PROJECT_STAGE</param-name>
		<param-value>Development</param-value>
	</context-param>
	<context-param>
		<param-name>javax.faces.FACELETS_BUFFER_SIZE</param-name>
		<param-value>65535</param-value>
	</context-param>
	<context-param>
		<param-name>javax.faces.FACELETS_REFRESH_PERIOD</param-name>
		<param-value>0</param-value>
	</context-param>
	<context-param>
		<param-name>javax.faces.FACELETS_SKIP_COMMENTS</param-name>
		<param-value>true</param-value>
	</context-param>
	<context-param>
		<param-name>javax.faces.INTERPRET_EMPTY_STRING_SUBMITTED_VALUES_AS_NULL</param-name>
		<param-value>true</param-value>
	</context-param>
	<context-param>
		<param-name>javax.faces.STATE_SAVING_METHOD</param-name>
		<param-value>client</param-value>
	</context-param>
	<context-param>
		<param-name>com.sun.faces.defaultResourceMaxAge</param-name>
		<param-value>3628800000</param-value>
	</context-param>
	<context-param>
		<param-name>org.omnifaces.FACES_VIEWS_SCAN_PATHS</param-name>
		<param-value>/*.xhtml</param-value>
	</context-param>
	<context-param>
		<param-name>javax.faces.DATETIMECONVERTER_DEFAULT_TIMEZONE_IS_SYSTEM_TIMEZONE</param-name>
		<param-value>true</param-value>
	</context-param>
	
	<mime-mapping>
		<extension>zip</extension>
		<mime-type>application/zip</mime-type>
	</mime-mapping>

	<context-param>
		<param-name>primefaces.THEME</param-name>
		<param-value>none</param-value>
	</context-param>

	<listener>
		<listener-class>br.gov.caixa.gitecsa.arquitetura.listener.MyServletContextListener</listener-class>
	</listener>
	<session-config>
		<session-timeout>30</session-timeout>
	</session-config>
	<welcome-file-list>
		<welcome-file>index.xhtml</welcome-file>
	</welcome-file-list>
	<error-page>
		<error-code>500</error-code>
		<location>/WEB-INF/errorpages/500.xhtml</location>
	</error-page>
	<error-page>
		<error-code>404</error-code>
		<location>/WEB-INF/errorpages/404.xhtml</location>
	</error-page>
	<error-page>
		<exception-type>javax.faces.application.ViewExpiredException</exception-type>
		<location>/login.xhtml?faces-redirect=true</location>
	</error-page>
	<error-page>
		<exception-type>java.sql.SQLException</exception-type>
		<location>/WEB-INF/errorpages/database.xhtml</location>
	</error-page>
	<error-page>
		<exception-type>java.lang.RuntimeException</exception-type>
		<location>/WEB-INF/errorpages/bug.xhtml</location>
	</error-page>
	<servlet>
		<servlet-name>facesServlet</servlet-name>
		<servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
		<load-on-startup>1</load-on-startup>
	</servlet>
	<servlet-mapping>
		<servlet-name>facesServlet</servlet-name>
		<url-pattern>*.xhtml</url-pattern>
	</servlet-mapping>
	<filter>
		<filter-name>facesExceptionFilter</filter-name>
		<filter-class>org.omnifaces.filter.FacesExceptionFilter</filter-class>
	</filter>
	<filter>
		<filter-name>characterEncodingFilter</filter-name>
		<filter-class>org.omnifaces.filter.CharacterEncodingFilter</filter-class>
	</filter>
	<filter-mapping>
		<filter-name>facesExceptionFilter</filter-name>
		<servlet-name>facesServlet</servlet-name>
	</filter-mapping>
	<filter-mapping>
		<filter-name>characterEncodingFilter</filter-name>
		<url-pattern>/*</url-pattern>
	</filter-mapping>
	<filter>
		<filter-name>NoCacheFilter</filter-name>
		<filter-class>br.gov.caixa.gitecsa.arquitetura.filter.NoCacheFilter</filter-class>
	</filter>
	<filter-mapping>
		<filter-name>NoCacheFilter</filter-name>
		<url-pattern>/*</url-pattern>
	</filter-mapping>
	<filter>
		<filter-name>PrimeFaces FileUpload Filter</filter-name>
		<filter-class>org.primefaces.webapp.filter.FileUploadFilter</filter-class>
	</filter>
	<filter-mapping>
		<filter-name>PrimeFaces FileUpload Filter</filter-name>
		<servlet-name>facesServlet</servlet-name>
	</filter-mapping>
	<filter>
	    <filter-name>RateLimitFilter</filter-name>
	    <filter-class>br.gov.caixa.gitecsa.arquitetura.filter.RateLimitFilter</filter-class>
	</filter>	
	<filter-mapping>
	    <filter-name>RateLimitFilter</filter-name>
	    <url-pattern>/*</url-pattern>
	</filter-mapping>	
</web-app>


========================================



<?xml version="1.0" encoding="UTF-8"?>
<!-- This file is not required if you don't need any extra configuration. -->

<faces-config version="2.3"
    xmlns="http://xmlns.jcp.org/xml/ns/javaee"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="
        http://xmlns.jcp.org/xml/ns/javaee
        http://xmlns.jcp.org/xml/ns/javaee/web-facesconfig_2_3.xsd">


	<navigation-rule>
		<from-view-id>*</from-view-id>
		<navigation-case>
			<from-outcome>loginPage</from-outcome>
			<to-view-id>/login.xhtml</to-view-id>
			<redirect />
		</navigation-case>
	</navigation-rule>

	<lifecycle>
		<phase-listener>br.gov.caixa.gitecsa.arquitetura.listener.AuthorizationListener
		</phase-listener>
	</lifecycle>

	<application>

		<message-bundle>Messages</message-bundle>

		<locale-config>
			<default-locale>pt_BR</default-locale>
		</locale-config>

		<resource-bundle>
			<base-name>bundle</base-name>
			<var>bundle</var>
		</resource-bundle>

	</application>

	<factory>
		<exception-handler-factory>
			org.omnifaces.exceptionhandler.FullAjaxExceptionHandlerFactory
		</exception-handler-factory>
		<!-- 
		<render-kit-factory>
			org.omnifaces.renderkit.Html5RenderKitFactory
		</render-kit-factory>
		-->
	</factory>
</faces-config>



[p585600@caddeapllx2577 ~]$ find . -iname "login.xhtml" -o -iname "index.xhtml"
[p585600@caddeapllx2577 ~]$ git log --oneline -10 -- src/main/webapp/WEB-INF/
-sh: git: comando não encontrado
[p585600@caddeapllx2577 ~]$

