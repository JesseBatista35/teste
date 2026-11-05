<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		 xmlns="http://java.sun.com/xml/ns/javaee" xmlns:web="http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd"
		 xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd"
		 id="WebApp_ID" version="3.0">

	<display-name>workflow-credito-pj-web</display-name>

	<!-- Seguranca -->
	<session-config>
		<session-timeout>30</session-timeout>
	</session-config>

	<!--     Roles -->
	<security-role>
		<description>Agencia Tecnico bancario</description>
		<role-name>FEC0100</role-name>
	</security-role>
	<security-role>
		<description>SR Analista</description>
		<role-name>FEC0101</role-name>
	</security-role>
	<security-role>
		<description>Agencia - Gerente PJ</description>
		<role-name>FEC0102</role-name>
	</security-role>
	<security-role>
		<description>SR Gestor</description>
		<role-name>FEC0103</role-name>
	</security-role>
	<security-role>
		<description>Auditor externo: Acesso temporario</description>
		<role-name>FEC0104</role-name>
	</security-role>
	<security-role>
		<description>Tecnologia</description>
		<role-name>FEC0106</role-name>
	</security-role>
	<security-role>
		<description>DIRE Analista</description>
		<role-name>FEC0116</role-name>
	</security-role>
	<security-role>
		<description>DIRE Gestor</description>
		<role-name>FEC0117</role-name>
	</security-role>
	<security-role>
		<description>Auditor interno</description>
		<role-name>FEC0119</role-name>
	</security-role>
	<security-role>
		<description>CEOPC - gestor</description>
		<role-name>FEC0121</role-name>
	</security-role>
	<security-role>
		<description>Gestor Sistema</description>
		<role-name>FEC0126</role-name>
	</security-role>
	<security-role>
		<description>CEOPC - gestor</description>
		<role-name>FEC0127</role-name>
	</security-role>
	<security-role>
		<description>CEOPC - gestor</description>
		<role-name>FEC0128</role-name>
	</security-role>
	<security-role>
		<description>GT</description>
		<role-name>FEC0131</role-name>
	</security-role>
	<security-role>
		<description>CEOPC - analista</description>
		<role-name>FEC0136</role-name>
	</security-role>
	<security-role>
		<description>SUCNI - gestor</description>
		<role-name>FEC0137</role-name>
	</security-role>
	<security-role>
		<description>SUCNI - analista</description>
		<role-name>FEC0138</role-name>
	</security-role>
	<security-role>
		<description>SR Gerente PJ</description>
		<role-name>FEC0139</role-name>
	</security-role>
	<security-role>
		<description>RENOP Gestor</description>
		<role-name>FEC0140</role-name>
	</security-role>
	<security-role>
		<description>RENOP Analista</description>
		<role-name>FEC0141</role-name>
	</security-role>
	<security-role>
		<description>ACESSO ANALISTA CONFORMIDADE BANCARIA</description>
		<role-name>FEC0142</role-name>
	</security-role>
	<security-role>
		<description>ACESSO GESTOR ENGENHARIA</description>
		<role-name>FEC0145</role-name>
	</security-role>
	<security-role>
		<description>ACESSO TECNICO ENGENHARIA</description>
		<role-name>FEC0146</role-name>
	</security-role>
	<security-role>
		<description>ACESSO GESTOR CONFORMIDADE BANCARIA</description>
		<role-name>FEC0147</role-name>
	</security-role>
	<security-role>
		<description>ACESSO EXTERNO MGE</description>
		<role-name>FECEXT000009</role-name>
	</security-role>
	<security-role>
		<description>ANÁLISES DIVERSAS GERENCIAL</description>
		<role-name>FEC0237</role-name>
	</security-role>
	<security-role>
		<description>ANÁLISES DIVERSAS TÉCNICO</description>
		<role-name>FEC0238</role-name>
	</security-role>
	<!-- Validacao Roles -->
	<security-constraint>
		<web-resource-collection>
			<web-resource-name>Todas Requisicoes</web-resource-name>
			<description>Todas</description>
			<url-pattern>/*</url-pattern>
			<http-method>GET</http-method>
			<http-method>POST</http-method>
			<http-method>PUT</http-method>
			<http-method>DELETE</http-method>
		</web-resource-collection>
		<auth-constraint>
			<description>PERFIS ACESSO WORKFLOW PJ</description>
			<role-name>FEC0100</role-name>
			<role-name>FEC0101</role-name>
			<role-name>FEC0102</role-name>
			<role-name>FEC0103</role-name>
			<role-name>FEC0104</role-name>
			<role-name>FEC0106</role-name>
			<role-name>FEC0116</role-name>
			<role-name>FEC0117</role-name>
			<role-name>FEC0119</role-name>
			<role-name>FEC0121</role-name>
			<role-name>FEC0126</role-name>
			<role-name>FEC0127</role-name>
			<role-name>FEC0128</role-name>
			<role-name>FEC0131</role-name>
			<role-name>FEC0136</role-name>
			<role-name>FEC0137</role-name>
			<role-name>FEC0138</role-name>
			<role-name>FEC0139</role-name>
			<role-name>FEC0140</role-name>
			<role-name>FEC0141</role-name>
			<role-name>FEC0142</role-name>
			<role-name>FEC0145</role-name>
			<role-name>FEC0146</role-name>
			<role-name>FEC0147</role-name>
			<role-name>FEC0237</role-name>
			<role-name>FEC0238</role-name>
			<role-name>FECEXT000009</role-name>
		</auth-constraint>
	</security-constraint>

	<security-constraint>
		<web-resource-collection>
			<web-resource-name>Logout</web-resource-name>
			<description>Todas requisicoes</description>
			<url-pattern>/logout.jsp</url-pattern>
			<http-method>GET</http-method>
			<http-method>POST</http-method>
		</web-resource-collection>
	</security-constraint>

	<security-constraint>
		<web-resource-collection>
			<web-resource-name>Todas Requisicoes - Versao</web-resource-name>
			<description>Todas Requisicoes - Versao</description>
			<url-pattern>/versao.html</url-pattern>
			<http-method>GET</http-method>
		</web-resource-collection>
	</security-constraint>

	<security-constraint>
		<web-resource-collection>
			<web-resource-name>Todas as Requisicoes - Angular</web-resource-name>
			<description>Todas requisicoes</description>
			<url-pattern>/ng/*</url-pattern>
			<http-method>GET</http-method>
			<http-method>POST</http-method>
		</web-resource-collection>
	</security-constraint>

	<security-constraint>
		<web-resource-collection>
			<web-resource-name>Todas as Requisicoes - Angular</web-resource-name>
			<description>Todas requisicoes</description>
			<url-pattern>/init/*</url-pattern>
			<http-method>GET</http-method>
			<http-method>POST</http-method>
		</web-resource-collection>
	</security-constraint>

</web-app>


<?xml version="1.0" encoding="UTF-8"?>

<jboss-web>
	<security-domain>jaas-sifec</security-domain>
	<context-root>workflow-credito-pj-web</context-root>
</jboss-web>
