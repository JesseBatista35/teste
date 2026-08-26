<?xml version="1.0"?>
<web-app version="3.0" xmlns="http://java.sun.com/xml/ns/javaee"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd">
	<display-name>sicmu</display-name>

	<welcome-file-list>
		<welcome-file>/principal/index.html</welcome-file>
	</welcome-file-list>

	<distributable />

	<servlet>
		<servlet-name>Faces Servlet</servlet-name>
		<servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
		<load-on-startup>1</load-on-startup>
	</servlet>
	<servlet-mapping>
		<servlet-name>Faces Servlet</servlet-name>
		<url-pattern>*.jsf</url-pattern>
	</servlet-mapping>

	<servlet>
		<servlet-name>SimpleCaptcha</servlet-name>
		<servlet-class>nl.captcha.servlet.StickyCaptchaServlet</servlet-class>
		
		<init-param>
			<!-- Time To Live, in ms. Optional; Defaults to 600000ms. -->
			<param-name>ttl</param-name>
			<param-value>100000</param-value>
		</init-param>
	</servlet>
	<servlet-mapping>
		<servlet-name>SimpleCaptcha</servlet-name>
		<url-pattern>/captcha</url-pattern>
	</servlet-mapping>

	<filter>
		<filter-name>PrimeFaces FileUpload Filter</filter-name>
		<filter-class>org.primefaces.webapp.filter.FileUploadFilter</filter-class>
	</filter>

	<filter-mapping>
		<filter-name>PrimeFaces FileUpload Filter</filter-name>
		<servlet-name>Faces Servlet</servlet-name>
	</filter-mapping>

	<context-param>
		<param-name>javax.faces.FACELETS_SKIP_COMMENTS</param-name>
		<param-value>true</param-value>
	</context-param>

	<context-param>
		<param-name>PARAMETER_ENCODING</param-name>
		<param-value>UTF-8</param-value>
	</context-param>

	<error-page>
		<error-code>403</error-code>
		<location>/principal/acesso-negado.jsf</location>
	</error-page>

	<error-page>
		<error-code>500</error-code>
		<location>/principal/erro.jsf</location>
	</error-page>

	<context-param>
		<param-name>javax.faces.DATETIMECONVERTER_DEFAULT_TIMEZONE_IS_SYSTEM_TIMEZONE</param-name>
		<param-value>true</param-value>
	</context-param>



</web-app>
