gec-batch/pom.xml

<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
	<modelVersion>4.0.0</modelVersion>
	
	<parent>
		<groupId>br.gov.caixa.sigec</groupId>
		<artifactId>gec</artifactId>
		<version>${sigec.version}</version>
	</parent>
	
	<artifactId>gec-batch</artifactId>
	<packaging>jar</packaging>
	<name>GEC Batch module - Processamento Assíncrono</name>
	<description>Módulo contendo componentes de processamento batch: MDBs, timers e integração Azure Service Bus</description>

	<dependencies>
		<!-- Framework Caixa (contém jcicsconnect/MensagemCics usado por arqref-core CicsException) -->
		<dependency>
			<groupId>br.gov.caixa</groupId>
			<artifactId>framework</artifactId>
			<version>2.0.1</version>
			<scope>provided</scope>
		</dependency>

		<!-- Módulo XML com classes geradas (JAXB) para processamento batch -->
		<dependency>
			<groupId>br.gov.caixa.sigec</groupId>
			<artifactId>gec-xml</artifactId>
			<scope>provided</scope>
		</dependency>

		<!-- JAXB API (removido do JDK a partir do Java 11) -->
		<dependency>
			<groupId>javax.xml.bind</groupId>
			<artifactId>jaxb-api</artifactId>
			<version>2.3.1</version>
			<scope>provided</scope>
		</dependency>

		<!-- Módulo comum com DTOs e interfaces -->
		<dependency>
			<groupId>br.gov.caixa.sigec</groupId>
			<artifactId>gec-common</artifactId>
			<version>${project.version}</version>
			<scope>provided</scope>
		</dependency>

		<!-- Módulo EJB para acesso a DAOs e serviços -->
		<dependency>
			<groupId>br.gov.caixa.sigec</groupId>
			<artifactId>gec-ejb</artifactId>
			<version>${project.version}</version>
			<type>ejb</type>
			<scope>provided</scope>
		</dependency>

		<!-- Azure Service Bus -->
		<dependency>
			<groupId>com.azure</groupId>
			<artifactId>azure-messaging-servicebus</artifactId>
			<version>7.15.0</version>
		</dependency>

		<dependency>
			<groupId>com.azure</groupId>
			<artifactId>azure-identity</artifactId>
			<version>1.13.3</version>
		</dependency>

		<!-- JMS API -->
		<dependency>
			<groupId>javax.jms</groupId>
			<artifactId>javax.jms-api</artifactId>
			<version>2.0.1</version>
			<scope>provided</scope>
		</dependency>

		<!-- EJB API -->
		<dependency>
			<groupId>org.jboss.spec.javax.ejb</groupId>
			<artifactId>jboss-ejb-api_3.1_spec</artifactId>
			<version>1.0.2.Final</version>
			<scope>provided</scope>
		</dependency>

		<!-- CDI API -->
		<dependency>
			<groupId>javax.enterprise</groupId>
			<artifactId>cdi-api</artifactId>
			<version>1.1</version>
			<scope>provided</scope>
		</dependency>

		<!-- Lombok -->
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<scope>provided</scope>
		</dependency>

		<!-- Jackson -->
		<dependency>
			<groupId>com.fasterxml.jackson.core</groupId>
			<artifactId>jackson-databind</artifactId>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>com.fasterxml.jackson.datatype</groupId>
			<artifactId>jackson-datatype-jsr310</artifactId>
			<scope>provided</scope>
		</dependency>

		<!-- Arqref Core -->
		<dependency>
			<groupId>br.gov.caixa.arqref</groupId>
			<artifactId>arqref-core</artifactId>
			<scope>provided</scope>
		</dependency>

		<!-- Apache Commons Lang -->
		<dependency>
			<groupId>org.apache.commons</groupId>
			<artifactId>commons-lang3</artifactId>
			<scope>provided</scope>
		</dependency>
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<!-- versão e configuração herdadas do parent pom -->
			</plugin>
		</plugins>
	</build>
</project>



gec-web/pom.xml



<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="https://maven.apache.org/POM/4.0.0"
	xmlns:xsi="https://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="https://maven.apache.org/POM/4.0.0 https://maven.apache.org/maven-v4_0_0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<artifactId>gec</artifactId>
		<groupId>br.gov.caixa.sigec</groupId>
		<version>${sigec.version}</version>
	</parent>
	<artifactId>gec-web</artifactId>
	<name>GEC Web module</name>
	<packaging>war</packaging>

	<scm>
		<developerConnection>scm:svn:http://10.61.1.149/caixa/emprestimo/sigec_port/trunk/03-Implementacao/Fontes/gec/gec-web</developerConnection>
		<connection>scm:svn:http://10.61.1.149/caixa/emprestimo/sigec_port/trunk/03-Implementacao/Fontes/gec/gec-web</connection>
		<url>http://10.61.1.149/caixa/emprestimo/sigec_port/trunk/03-Implementacao/Fontes/gec/gec-web</url>
	</scm>

	<dependencies>

		<dependency>
			<groupId>br.gov.caixa.sigec</groupId>
			<artifactId>gec-ejb</artifactId>
			<type>ejb</type>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>br.gov.caixa.sigec</groupId>
			<artifactId>gec-xml</artifactId>
			<type>jar</type>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>br.gov.caixa.arqref</groupId>
			<artifactId>arqref-services</artifactId>
		</dependency>

		<dependency>
			<groupId>br.gov.caixa.arqref</groupId>
			<artifactId>arqref-core</artifactId>
		</dependency>

		<dependency>
			<groupId>br.gov.caixa.arqref</groupId>
			<artifactId>arqref-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.jboss.spec.javax.annotation</groupId>
			<artifactId>jboss-annotations-api_1.1_spec</artifactId>
			<version>1.0.1.Final</version>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>org.jboss.resteasy</groupId>
			<artifactId>resteasy-jaxrs</artifactId>
			<scope>provided</scope>
		</dependency>
		
		<dependency>
			<groupId>org.jboss.resteasy</groupId>
			<artifactId>resteasy-jaxb-provider</artifactId>
			<scope>provided</scope>
		</dependency>
		
		<dependency>
			<groupId>org.jboss.resteasy</groupId>
			<artifactId>resteasy-multipart-provider</artifactId>
			<scope>provided</scope>
		</dependency>
		
		<dependency>
			<groupId>net.sf.scannotation</groupId>
			<artifactId>scannotation</artifactId>
			<version>1.0.2</version>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>javax.enterprise</groupId>
			<artifactId>cdi-api</artifactId>
			<version>1.1</version>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>javax.servlet-api</artifactId>
			<version>${servlet.version}</version>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>org.apache.commons</groupId>
			<artifactId>commons-lang3</artifactId>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>br.gov.caixa.sifec.componentes.seguranca.sso</groupId>
			<artifactId>seguranca-sso</artifactId>
			<version>1.1.1</version>
		</dependency>

		<dependency>
			<groupId>org.keycloak</groupId>
			<artifactId>keycloak-core</artifactId>
			<version>7.0.1</version>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>org.keycloak</groupId>
			<artifactId>keycloak-adapter-core</artifactId>
			<version>7.0.1</version>
			<scope>provided</scope>
		</dependency>
		
		<dependency>
            <groupId>org.keycloak</groupId>
            <artifactId>keycloak-adapter-spi</artifactId>
			<version>7.0.1</version>
			<scope>provided</scope>
        </dependency>

		<dependency>
			<groupId>org.hibernate.javax.persistence</groupId>
			<artifactId>hibernate-jpa-2.1-api</artifactId>
			<scope>provided</scope>
		</dependency>

		<!-- Relatorios: JasperReports/OpenPDF sao fornecidos pelo lib/ do EAR online (gec-ear, profile online).
			Scope provided evita duplicar no WEB-INF/lib (LinkageError/ClassCastException). -->
		<dependency>
			<groupId>net.sf.jasperreports</groupId>
			<artifactId>jasperreports</artifactId>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>com.github.librepdf</groupId>
			<artifactId>openpdf</artifactId>
			<scope>provided</scope>
		</dependency>

		<!-- Apache POI (XSSF) usado por ExportaArquivoUtil; gerenciado como provided no pom pai -->
		<dependency>
			<groupId>org.apache.poi</groupId>
			<artifactId>poi</artifactId>
		</dependency>

		<dependency>
			<groupId>org.apache.poi</groupId>
			<artifactId>poi-ooxml</artifactId>
		</dependency>


		<dependency>
    		<groupId>javax</groupId>
    		<artifactId>javaee-api</artifactId>
    		<version>8.0.1</version>
    		<scope>provided</scope>
		</dependency>

	</dependencies>

	<build>
		<resources>
			<resource>
				<directory>src/main/resources</directory>
				<filtering>true</filtering>
			</resource>
		</resources>
		<plugins>
			<plugin>
				<artifactId>maven-war-plugin</artifactId>
				<version>${war.plugin.version}</version>
				<configuration>
					<failOnMissingWebXml>false</failOnMissingWebXml>
					<webResources>
						<resource>
							<directory>src/main/webapp</directory>
							<filtering>true</filtering>
							<includes>
								<include>index.html</include>
							</includes>
						</resource>
					</webResources>
				</configuration>
			</plugin>
		</plugins>
	</build>

</project>




gec-web/src/main/java/br/gov/caixa/sigec/rest/UserProfileRest.java


package br.gov.caixa.sigec.rest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.security.PermitAll;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.gov.caixa.arqrefcore.excecao.BusinessException;
import br.gov.caixa.arqrefcore.excecao.SystemException;
import br.gov.caixa.arqrefservices.dominio.Empregado;
import br.gov.caixa.arqrefservices.negocio.EmpregadoService;
import br.gov.caixa.arqrefservices.negocio.UserProfile;
import br.gov.caixa.sifec.componentes.seguranca.sso.rest.AbstractSecurityRest;

@PermitAll
@RequestScoped
@Path("/userprofile")
public class UserProfileRest extends AbstractSecurityRest {

	private static final Logger LOG = Logger.getLogger(UserProfileRest.class.getSimpleName());
	private static final Properties GRUPOS_LDAP = new Properties();
	static {
		try {
			UserProfileRest.GRUPOS_LDAP
					.load(UserProfileRest.class.getClassLoader().getResourceAsStream("ldap_groups.properties"));
		} catch (IOException ioe) {
			LOG.log(Level.SEVERE, ioe.getMessage(), ioe);
		}
	}

	@Inject
	private EmpregadoService empregadoService;

	@POST
	@Path("/load")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public UserProfile loadUserProfile() {
		final UserProfile user = new UserProfile();
		final Empregado empregado = this.empregadoService.getEmpregadoPorMatricula(super.getUsuarioLogado());
		if (empregado == null) {
			throw new SystemException("Funcionário não encontrado no SICLI");
		}
		user.setEmpregado(empregado);
		user.getEmpregado().setNumeroIP(user.getNumeroIP());
		// user.setGrupoUsuarioList( this.loadgroups() );
		return user;
	}

	@POST
	@Path("/loadgroups")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<String> loadgroups() {
		final Set<String> roles = new TreeSet<>();
		for (Object key : UserProfileRest.GRUPOS_LDAP.keySet()) {
			if (super.possuiFuncao((String) key)) {
				roles.add(UserProfileRest.GRUPOS_LDAP.getProperty((String) key));
			}
		}
		return new ArrayList<>(roles);
	}

	@POST
	@Path("/carregarGrupos")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<String> carregarGrupos() {
		final Set<String> roles = new TreeSet<>();
		for (Object value : UserProfileRest.GRUPOS_LDAP.values()) {
			roles.add((String) value);
		}
		return new ArrayList<>(roles);
	}

	/**
	 * @param role
	 * @return
	 */
	@POST
	@Path("/hasRole/{role}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public boolean hasRole(final @PathParam("role") String role) {
		return this.loadgroups().contains(role);
	}

	/**
	 * @param role
	 * @throws BusinessException
	 */
	void validarRole(final String role) throws BusinessException {
		if (!this.hasRole(role)) {
			throw new BusinessException(
					"Usu\u00E1rio logado n\u00E3o possui permiss\u00E3o para efetuar opera\u00E7\u00E3o desejada.");
		}
	}

	@GET
	@Path("/grupos")
	public String grupos() {
		final StringBuilder buffer = new StringBuilder();
		final List<String> grupos = this.loadgroups();
		if (grupos != null && !grupos.isEmpty()) {
			for (String grupo : grupos) {
				buffer.append(grupo);
				buffer.append("<br/>");
			}
		}
		return buffer.toString();
	}

}
