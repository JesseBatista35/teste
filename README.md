siaci-lib-integracao-core-java/lib-integracao-core-java-autorizacao
/pom.xml



GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
siaci-lib-integracao-core-java
Repository navigation
Code
Issues
Pull requests
Actions
Projects
Wiki
Security and quality
4
 (4)
Insights
Settings
Files
Go to file
t
T
lib-integracao-core-java-resolver content loaded
.github
workflows
pull_request_template.md
.mvn/wrapper
maven-wrapper.properties
docs
section1
authorization.md
index.md
lib-integracao-core-java-autorizacao
src
README.md
pom.xml
lib-integracao-core-java-bom
pom.xml
lib-integracao-core-java-comunicacao
src
pom.xml
lib-integracao-core-java-resolver
src
dependency-reduced-pom.xml
pom.xml
.dockerignore
.gitattributes
.gitignore
README.md
catalog-info.yaml
mkdocs.yaml
mvnw
mvnw.cmd
pom.xml
sisph-codeql-trigger.md
siaci-lib-integracao-core-java/.github
/pull_request_template.md
c148183_caixa
c148183_caixa
chore(pull-request-template): sync pull_request_template.md


siaci-lib-integracao-core-java/lib-integracao-core-java-comunicacao
/pom.xml



<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <parent>
        <groupId>br.gov.caixa.siaci</groupId>
        <artifactId>lib-integracao-core-java-parent</artifactId>
		<version>0.1.2</version>
		<relativePath>../pom.xml</relativePath>
    </parent>

    <artifactId>lib-integracao-core-java-comunicacao</artifactId>
    <name>lib-integracao-core-java :: comunicacao</name>

    <distributionManagement>
		<repository>
			<id>github</id>
			<url>https://maven.pkg.github.com/caixagithub/siaci-lib-integracao-core-java</url>
		</repository>
	</distributionManagement>

    
	<repositories>
		<repository>
			<id>github</id>
			<url>https://maven.pkg.github.com/caixagithub/siaci-lib-integracao-core-java</url>
		</repository>
	</repositories>


    <dependencies>
        <!-- Web / REST (se a comunicação for tanto COBOL quanto HTTP) -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <!-- Feign para comunicação HTTP tipada -->
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-openfeign</artifactId>
        </dependency>

        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
        <!--Conector oracle dependencia-->
		<dependency>
		    <groupId>org.hibernate.orm</groupId>
		    <artifactId>hibernate-core</artifactId>
		    <version>6.6.18.Final</version>
		</dependency> 
		<!--Conector JRAC dependencias-->
		<dependency>
		    <groupId>javax.xml.bind</groupId>
		    <artifactId>jaxb-api</artifactId>
		    <version>2.3.1</version>
		</dependency>
		<dependency>
			<groupId>com.unisys.br.jrac</groupId>
			<artifactId>jrac</artifactId>
			<version>17.0</version>
		</dependency>
		<dependency>
			<groupId>javax.resource</groupId>
			<artifactId>connector-api</artifactId>
			<version>1.5</version>
		</dependency>							         

        <!-- Testes -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
        
    </dependencies>


	<pluginRepositories>
		<pluginRepository>
			<id>github</id>
			<name>GitHub Packages</name>
			<url>https://maven.pkg.github.com/caixagithub/siaci-lib-integracao-core-java</url>
		</pluginRepository>
	</pluginRepositories>
    <build>
        <plugins>
            <plugin>
                <groupId>org.jacoco</groupId>
                <artifactId>jacoco-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
</project>


siaci-lib-integracao-core-java/lib-integracao-core-java-resolver
/pom.xml

<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <parent>
        <groupId>br.gov.caixa.siaci</groupId>
        <artifactId>lib-integracao-core-java-parent</artifactId>
        <version>0.1.2</version>
    </parent>

    <artifactId>lib-integracao-core-java-resolver</artifactId>
    <name>lib-integracao-core-java :: resolver</name>

    <dependencies>
        <!-- Web / REST (se a comunicação for tanto COBOL quanto HTTP) -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <!-- Feign para comunicação HTTP tipada -->
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-openfeign</artifactId>
        </dependency>

        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>

        <!-- Testes -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
		<dependency>
		    <groupId>br.gov.caixa.siaci</groupId>
		    <artifactId>lib-integracao-core-java-comunicacao</artifactId>
		</dependency>        
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.jacoco</groupId>
                <artifactId>jacoco-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
</project>

