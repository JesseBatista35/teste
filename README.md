<jboss-deployment-structure>
	<!-- Make sub deployments isolated by default, so they cannot see each others 
		classes without a Class-Path entry -->
	<ear-subdeployments-isolated>false</ear-subdeployments-isolated>
	<!-- This corresponds to the top level deployment. For a war this is the 
		war's module, for an ear -->
	<!-- This is the top level ear module, which contains all the classes in 
		the EAR's lib folder -->
	<deployment>
		<resources>
			<resource-root path="gec-ejb.jar" />
		</resources>
		<exclusions>
			<module name="cef" />
		</exclusions>
		<dependencies>
			<module name="deployment.framework.jar" />
			<module name="deployment.framework_sisgd.jar" />
			<!-- module name="org.jboss.ejb-client" / -->
		</dependencies>

	</deployment>
	<sub-deployment name="gec-web.war">
		<!-- gec-web.war carrega o proprio WEB-INF/lib/arqref-core, que usa
			br.gov.caixa.bsb.sisgd.framework.cm.ConectorException (framework_sisgd.jar).
			As dependencias do <deployment> nao sao herdadas pelo subdeployment,
			entao precisam ser declaradas aqui, como no gec-api.war. -->
		<dependencies>
			<module name="deployment.framework.jar" />
			<module name="deployment.framework_sisgd.jar" />
		</dependencies>
	</sub-deployment>
	<sub-deployment name="gec-api.war">
		<exclusions>
			<module name="cef" />
		</exclusions>
		<dependencies>
			<module name="deployment.framework.jar" />
			<module name="deployment.framework_sisgd.jar" />
		</dependencies>
	</sub-deployment>
</jboss-deployment-structure>
