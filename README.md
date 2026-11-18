Esta etapa tem dois problemas. O do commons-lang3 está confirmado. O do ELY01148 ainda é hipótese, e vou separar uma coisa da outra.

1. commons-lang3 (causa confirmada)

O EAR só tem commons-lang-2.4, sem nenhum commons-lang3.
No pom raiz, commons-lang3 está com <scope>provided</scope> no dependencyManagement. É o mesmo padrão do arqref e do POI: o jar não é empacotado e o JBoss não o fornece.
O fix é um <scope>compile</scope> explícito no módulo certo. Os poms já estão dentro dos artefatos, então rode isto para eu escrever o fix exato:
bash
cd /opt/jboss-eap/standalone/deployments
unzip -p gec-ear.ear META-INF/maven/br.gov.caixa.sigec/gec-ear/pom.xml
echo ===== gec-ejb =====
unzip -p gec-ear.ear gec-ejb.jar 'META-INF/maven/br.gov.caixa.sigec/gec-ejb/pom.xml'
Outras dependências provided do pom raiz podem aparecer como NoClassDefFound na sequência: guava, commons-codec, commons-collections, reflections, swagger-* e jasperreports. Algumas o JBoss já fornece. Quando eu tiver os poms, já digo quais empacotar de uma vez, para evitar um ciclo de build por classe.

2. ELY01148 (causa ainda não confirmada)

O que sei: os dois WARs falham no mesmo ponto. Nenhum tem security-domain no jboss-web.xml, então os dois caem no mapeamento padrão do Undertow para um domínio Elytron. O gec-web usa FORM, e o gec-api usa o resolver do Keycloak.
O terceiro stacktrace do log, na linha 35166, parece ser a nova tentativa de deploy do pipeline.
Minha principal suspeita é o ear-subdeployments-isolated=false, mas é só suspeita. Não confirmei a causa, e um build inteiro para testar é caro.

Faça o teste direto no host, só para diagnóstico. A correção definitiva vai para o repo depois:

bash
mkdir -p /tmp/t_iso && cd /tmp/t_iso && rm -rf * 
cp /opt/jboss-eap/standalone/deployments/gec-ear.ear .
mkdir META-INF
unzip -p gec-ear.ear META-INF/jboss-deployment-structure.xml \
  | sed 's#<ear-subdeployments-isolated>false#<ear-subdeployments-isolated>true#' > META-INF/jboss-deployment-structure.xml
zip -q gec-ear.ear META-INF/jboss-deployment-structure.xml
unzip -p gec-ear.ear META-INF/jboss-deployment-structure.xml | grep isolated

Depois dispare o deploy:

bash
cd /opt/jboss-eap/standalone/deployments
rm -f gec-ear.ear.failed
cp /tmp/t_iso/gec-ear.ear gec-ear.ear
touch gec-ear.ear.dodeploy
sleep 90; ls -l gec-ear.ear.*; cat gec-ear.ear.failed 2>/dev/null | head -c 1500
Se subir .deployed, a causa é o isolamento. Aí o fix é mudar ear-subdeployments-isolated para true no jboss-deployment-structure.xml do gec-ear e ajustar as dependências que os WARs perderem.
Se continuar o ELY01148, ou aparecer ClassNotFound de classes do gec-ejb, não é o isolamento. Me mande o .failed e eu analiso o Elytron.

Se continuar o ELY01148, rode também este comando, que não expõe senha:

bash
/opt/jboss-eap/bin/jboss-cli.sh -c --command="/subsystem=undertow:read-resource(recursive=true)" | grep -iE "application-security-domain|default-security-domain|elytron|name" | head -30
grep -nE "application-security-domain|default-security-domain|<secure-deployment|keycloak" /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml | head -30

O host é de DES e a mudança manual é só para o teste. A alteração permanente fica no repo (gec-ear), e o EAR volta ao estado da esteira no próximo release.




[root@caddeapllx2871 ear_chk]# cd /opt/jboss-eap/standalone/deployments
unzip -p gec-ear.ear META-INF/maven/br.gov.caixa.sigec/gec-ear/pom.xml
echo ===== gec-ejb =====
unzip -p gec-ear.ear gec-ejb.jar 'META-INF/maven/br.gov.caixa.sigec/gec-ejb/pom.xml'
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
        <modelVersion>4.0.0</modelVersion>
        <parent>
                <artifactId>gec</artifactId>
                <groupId>br.gov.caixa.sigec</groupId>
                <version>${sigec.version}</version>
        </parent>
        <artifactId>gec-ear</artifactId>
        <name>GEC EAR module</name>
        <packaging>ear</packaging>

        <dependencies>
                <dependency>
                        <groupId>br.gov.caixa.sigec</groupId>
                        <artifactId>gec-ejb</artifactId>
                        <type>ejb</type>
                        <exclusions>
                                <exclusion>
                                        <groupId>dom4j</groupId>
                                        <artifactId>dom4j</artifactId>
                                </exclusion>
                        </exclusions>
                </dependency>

                <!-- Dependência dom4j com escopo provided para não empacotar no EAR -->
                <dependency>
                        <groupId>dom4j</groupId>
                        <artifactId>dom4j</artifactId>
                        <version>1.6.1</version>
                        <scope>provided</scope>
                </dependency>

                <dependency>
                        <groupId>br.gov.caixa.sigec</groupId>
                        <artifactId>gec-xml</artifactId>
                        <type>jar</type>
                </dependency>

                <dependency>
                        <groupId>br.gov.caixa.sigec</groupId>
                        <artifactId>gec-api</artifactId>
                        <type>war</type>
                </dependency>

                <dependency>
                        <groupId>br.gov.caixa.sigec</groupId>
                        <artifactId>gec-azure</artifactId>
                        <type>jar</type>
                </dependency>

                <dependency>
                        <groupId>br.gov.caixa.sigec</groupId>
                        <artifactId>gec-common</artifactId>
                        <type>jar</type>
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
                        <groupId>br.gov.caixa.arqref</groupId>
                        <artifactId>arqref-services</artifactId>
                </dependency>

                <dependency>
                        <groupId>org.apache.poi</groupId>
                        <artifactId>poi</artifactId>
                </dependency>

                <dependency>
                        <groupId>org.apache.poi</groupId>
                        <artifactId>poi-ooxml</artifactId>
                        <exclusions>
                                <exclusion>
                                        <groupId>dom4j</groupId>
                                        <artifactId>dom4j</artifactId>
                                </exclusion>
                        </exclusions>
                </dependency>

                <!-- JasperReports/OpenPDF/olap4j: declarados somente no profile online (ver abaixo) -->

                <dependency>
                        <groupId>commons-codec</groupId>
                        <artifactId>commons-codec</artifactId>
                </dependency>

                <dependency>
                        <groupId>br.gov.caixa</groupId>
                        <artifactId>framework</artifactId>
                </dependency>

                <dependency>
                        <groupId>com.ibm.mq</groupId>
                        <artifactId>jmqi</artifactId>
                </dependency>

                <dependency>
                        <groupId>io.swagger</groupId>
                        <artifactId>swagger-jaxrs</artifactId>
                </dependency>

                <dependency>
                        <groupId>io.swagger</groupId>
                        <artifactId>swagger-models</artifactId>
                </dependency>

                <dependency>
                        <groupId>io.swagger</groupId>
                        <artifactId>swagger-core</artifactId>
                </dependency>

                <dependency>
                        <groupId>org.reflections</groupId>
                        <artifactId>reflections</artifactId>
                </dependency>

                <dependency>
                        <groupId>com.google.guava</groupId>
                        <artifactId>guava</artifactId>
                </dependency>

                <dependency>
                        <groupId>io.swagger</groupId>
                        <artifactId>swagger-annotations</artifactId>
                </dependency>

                <dependency>
                        <groupId>org.apache.commons</groupId>
                        <artifactId>commons-lang3</artifactId>
                </dependency>

                <dependency>
                        <groupId>commons-collections</groupId>
                        <artifactId>commons-collections</artifactId>
                </dependency>

                <dependency>
                        <groupId>com.squareup.okhttp3</groupId>
                        <artifactId>okhttp</artifactId>
                </dependency>

        </dependencies>

        <profiles>
                <!-- Profile BATCH: Exclui gec-web do pacote EAR para ambientes batch -->
                <profile>
                        <id>batch</id>
                        <activation>
                                <activeByDefault>true</activeByDefault>
                        </activation>
                        <dependencies>
                                <dependency>
                                        <groupId>br.gov.caixa.sigec</groupId>
                                        <artifactId>gec-batch</artifactId>
                                        <type>ejb</type>
                                </dependency>
                        </dependencies>
                        <build>
                                <plugins>
                                        <plugin>
                                                <groupId>org.apache.maven.plugins</groupId>
                                                <artifactId>maven-ear-plugin</artifactId>
                                                <version>${ear.plugin.version}</version>
                                                <configuration>
                                                        <version>6</version>
                                                        <defaultLibBundleDir>lib</defaultLibBundleDir>
                                                        <!-- Usa um descritor jboss-deployment-structure.xml específico do
                                                                profile batch, sem o sub-deployment gec-web.war (não empacotado neste profile) -->
                                                        <earSourceDirectory>${project.basedir}/src/main/application-batch</earSourceDirectory>
                                                        <modules>
                                                                <ejbModule>
                                                                        <groupId>br.gov.caixa.sigec</groupId>
                                                                        <artifactId>gec-ejb</artifactId>
                                                                        <uri>gec-ejb.jar</uri>
                                                                </ejbModule>

                                                                <!-- gec-web excluído no profile batch -->

                                                                <webModule>
                                                                        <groupId>br.gov.caixa.sigec</groupId>
                                                                        <artifactId>gec-api</artifactId>
                                                                        <uri>gec-api.war</uri>
                                                                </webModule>

                                                                <jarModule>
                                                                        <groupId>br.gov.caixa.sigec</groupId>
                                                                        <artifactId>gec-azure</artifactId>
                                                                </jarModule>

                                                                <jarModule>
                                                                        <groupId>br.gov.caixa.sigec</groupId>
                                                                        <artifactId>gec-common</artifactId>
                                                                </jarModule>

                                                                <ejbModule>
                                                                        <groupId>br.gov.caixa.sigec</groupId>
                                                                        <artifactId>gec-batch</artifactId>
                                                                        <uri>gec-batch.jar</uri>
                                                                </ejbModule>

                                                                <jarModule>
                                                                        <groupId>br.gov.caixa.arqref</groupId>
                                                                        <artifactId>arqref-core</artifactId>
                                                                </jarModule>

                                                                <jarModule>
                                                                        <groupId>br.gov.caixa.arqref</groupId>
                                                                        <artifactId>arqref-web</artifactId>
                                                                </jarModule>

                                                                <jarModule>
                                                                        <groupId>br.gov.caixa.arqref</groupId>
                                                                        <artifactId>arqref-services</artifactId>
                                                                </jarModule>

                                                                <jarModule>
                                                                        <groupId>org.apache.poi</groupId>
                                                                        <artifactId>poi</artifactId>
                                                                </jarModule>

                                                                <jarModule>
                                                                        <groupId>org.apache.poi</groupId>
                                                                        <artifactId>poi-ooxml</artifactId>
                                                                </jarModule>

                                                                <jarModule>
                                                                        <groupId>commons-codec</groupId>
                                                                        <artifactId>commons-codec</artifactId>
                                                                </jarModule>

                                                                <jarModule>
                                                                        <groupId>io.swagger</groupId>
                                                                        <artifactId>swagger-jaxrs</artifactId>
                                                                </jarModule>

                                                                <jarModule>
                                                                        <groupId>io.swagger</groupId>
                                                                        <artifactId>swagger-models</artifactId>
                                                                </jarModule>

                                                                <jarModule>
                                                                        <groupId>io.swagger</groupId>
                                                                        <artifactId>swagger-core</artifactId>
                                                                </jarModule>

                                                                <jarModule>
                                                                        <groupId>org.reflections</groupId>
                                                                        <artifactId>reflections</artifactId>
                                                                </jarModule>

                                                                <jarModule>
                                                                        <groupId>com.google.guava</groupId>
                                                                        <artifactId>guava</artifactId>
                                                                </jarModule>

                                                                <jarModule>
                                                                        <groupId>io.swagger</groupId>
                                                                        <artifactId>swagger-annotations</artifactId>
                                                                </jarModule>

                                                                <jarModule>
                                                                        <groupId>org.apache.commons</groupId>
                                                                        <artifactId>commons-lang3</artifactId>
                                                                </jarModule>

                                                                <jarModule>
                                                                        <groupId>commons-collections</groupId>
                                                                        <artifactId>commons-collections</artifactId>
                                                                </jarModule>
                                                        </modules>
                                                        <archive>
                                                                <manifestEntries>
                                                                        <Dependencies>deployment.framework.jar, deployment.wmq.jmsra.rar</Dependencies>
                                                                </manifestEntries>
                                                        </archive>
                                                </configuration>
                                        </plugin>
                                </plugins>
                        </build>
                </profile>

                <!-- Profile ONLINE: Inclui gec-web no pacote EAR para ambientes online/web -->
                <profile>
                        <id>online</id>
                        <activation>
                                <activeByDefault>false</activeByDefault>
                        </activation>
                        <dependencies>
                                <dependency>
                                        <groupId>br.gov.caixa.sigec</groupId>
                                        <artifactId>gec-web</artifactId>
                                        <type>war</type>
                                </dependency>

                                <!-- Relatorios (JasperReports/OpenPDF) somente no EAR online: ficam em lib/ do EAR e
                                        sao consumidos pelo gec-web (scope provided). O EAR batch nao os empacota.
                                        Exclusoes de transitivas definidas no dependencyManagement do pom pai. -->
                                <dependency>
                                        <groupId>net.sf.jasperreports</groupId>
                                        <artifactId>jasperreports</artifactId>
                                        <scope>compile</scope>
                                </dependency>
                                <!-- OpenPDF substitui iText 2.1.7 (fork LGPL, API compatível, suporte Java 17) -->
                                <dependency>
                                        <groupId>com.github.librepdf</groupId>
                                        <artifactId>openpdf</artifactId>
                                        <scope>compile</scope>
                                </dependency>
                                <dependency>
                                        <groupId>org.olap4j</groupId>
                                        <artifactId>olap4j</artifactId>
                                </dependency>
                        </dependencies>
                        <build>
                                <plugins>
                                        <plugin>
                                                <groupId>org.apache.maven.plugins</groupId>
                                                <artifactId>maven-ear-plugin</artifactId>
                                                <version>${ear.plugin.version}</version>
                                                <configuration>
                                                        <version>6</version>
                                                        <defaultLibBundleDir>lib</defaultLibBundleDir>
                                                        <!-- Usa o descritor jboss-deployment-structure.xml padrão (src/main/application),
                                                                que inclui o sub-deployment gec-web.war empacotado neste profile -->
                                                        <earSourceDirectory>${project.basedir}/src/main/application</earSourceDirectory>
                                                        <modules>
                                                                <ejbModule>
                                                                        <groupId>br.gov.caixa.sigec</groupId>
                                                                        <artifactId>gec-ejb</artifactId>
                                                                        <uri>gec-ejb.jar</uri>
                                                                </ejbModule>

                                                                <webModule>
                                                                        <groupId>br.gov.caixa.sigec</groupId>
                                                                        <artifactId>gec-web</artifactId>
                                                                        <contextRoot>/gec-web/por</contextRoot>
                                                                        <uri>gec-web.war</uri>
                                                                </webModule>

                                                                <webModule>
                                                                        <groupId>br.gov.caixa.sigec</groupId>
                                                                        <artifactId>gec-api</artifactId>
                                                                        <uri>gec-api.war</uri>
                                                                </webModule>

                                                                <jarModule>
                                                                        <groupId>br.gov.caixa.sigec</groupId>
                                                                        <artifactId>gec-azure</artifactId>
                                                                </jarModule>

                                                                <jarModule>
                                                                        <groupId>br.gov.caixa.sigec</groupId>
                                                                        <artifactId>gec-common</artifactId>
                                                                </jarModule>

                                                                <!-- gec-batch excluído no profile online -->

                                                                <jarModule>
                                                                        <groupId>br.gov.caixa.arqref</groupId>
                                                                        <artifactId>arqref-core</artifactId>
                                                                </jarModule>

                                                                <jarModule>
                                                                        <groupId>br.gov.caixa.arqref</groupId>
                                                                        <artifactId>arqref-web</artifactId>
                                                                </jarModule>

                                                                <jarModule>
                                                                        <groupId>br.gov.caixa.arqref</groupId>
                                                                        <artifactId>arqref-services</artifactId>
                                                                </jarModule>

                                                                <jarModule>
                                                                        <groupId>org.apache.poi</groupId>
                                                                        <artifactId>poi</artifactId>
                                                                </jarModule>

                                                                <jarModule>
                                                                        <groupId>org.apache.poi</groupId>
                                                                        <artifactId>poi-ooxml</artifactId>
                                                                </jarModule>

                                                                <jarModule>
                                                                        <groupId>net.sf.jasperreports</groupId>
                                                                        <artifactId>jasperreports</artifactId>
                                                                </jarModule>

                                                                <jarModule>
                                                                        <groupId>com.github.librepdf</groupId>
                                                                        <artifactId>openpdf</artifactId>
                                                                </jarModule>

                                                                <jarModule>
                                                                        <groupId>commons-codec</groupId>
                                                                        <artifactId>commons-codec</artifactId>
                                                                </jarModule>

                                                                <jarModule>
                                                                        <groupId>org.olap4j</groupId>
                                                                        <artifactId>olap4j</artifactId>
                                                                </jarModule>

                                                                <jarModule>
                                                                        <groupId>io.swagger</groupId>
                                                                        <artifactId>swagger-jaxrs</artifactId>
                                                                </jarModule>

                                                                <jarModule>
                                                                        <groupId>io.swagger</groupId>
                                                                        <artifactId>swagger-models</artifactId>
                                                                </jarModule>

                                                                <jarModule>
                                                                        <groupId>io.swagger</groupId>
                                                                        <artifactId>swagger-core</artifactId>
                                                                </jarModule>

                                                                <jarModule>
                                                                        <groupId>org.reflections</groupId>
                                                                        <artifactId>reflections</artifactId>
                                                                </jarModule>

                                                                <jarModule>
                                                                        <groupId>com.google.guava</groupId>
                                                                        <artifactId>guava</artifactId>
                                                                </jarModule>

                                                                <jarModule>
                                                                        <groupId>io.swagger</groupId>
                                                                        <artifactId>swagger-annotations</artifactId>
                                                                </jarModule>

                                                                <jarModule>
                                                                        <groupId>org.apache.commons</groupId>
                                                                        <artifactId>commons-lang3</artifactId>
                                                                </jarModule>

                                                                <jarModule>
                                                                        <groupId>commons-collections</groupId>
                                                                        <artifactId>commons-collections</artifactId>
                                                                </jarModule>
                                                        </modules>
                                                        <archive>
                                                                <manifestEntries>
                                                                        <Dependencies>deployment.framework.jar, deployment.wmq.jmsra.rar</Dependencies>
                                                                </manifestEntries>
                                                        </archive>
                                                </configuration>
                                        </plugin>
                                </plugins>
                        </build>
                </profile>

                <profile>
                        <id>deployJBoss</id>
                        <activation>
                                <activeByDefault>false</activeByDefault>
                        </activation>
                        <build>
                                <plugins>
                                        <plugin>
                                                <groupId>org.jboss.as.plugins</groupId>
                                                <artifactId>jboss-as-maven-plugin</artifactId>
                                                <configuration>
                                                        <hostname>${deploy.jboss.host}</hostname>
                                                        <port>${deploy.jboss.port}</port>
                                                        <username>${deploy.jboss.user}</username>
                                                        <password>${deploy.jboss.password}</password>
                                                        <name>${backend.deployment-name}</name>
                                                        <filename>${project.build.finalName}.ear</filename>
                                                        <skip>${skipDeployment}</skip>
                                                </configuration>
                                                <executions>
                                                        <execution>
                                                                <id>deploy-jar</id>
                                                                <phase>install</phase>
                                                                <goals>
                                                                        <goal>deploy</goal>
                                                                </goals>
                                                        </execution>
                                                </executions>
                                        </plugin>
                                </plugins>
                        </build>
                </profile>
                <profile>
                        <!-- When built in OpenShift the 'openshift' profile will be used
                        when
                                invoking mvn. -->
                        <!-- Use this profile for any OpenShift specific customization your
                        app
                                will need. -->
                        <!-- By default that is to put the resulting archive into the
                        'deployments'
                                folder. -->
                        <!--
                        http://maven.apache.org/guides/mini/guide-building-for-different-environments.html -->
                        <id>openshift</id>
                        <build>
                                <plugins>
                                        <plugin>
                                                <artifactId>maven-ear-plugin</artifactId>
                                                <version>${ear.plugin.version}</version>
                                                <configuration>
                                                        <outputDirectory>deployments</outputDirectory>
                                                </configuration>
                                        </plugin>
                                </plugins>
                        </build>
                </profile>
        </profiles>

</project>===== gec-ejb =====                                                                                                                                                                        uVr]     META-INF/MANIFEST.MFUTn▒▒j▒Xێ▒6
}`▒!?@▒vn3▒[▒(
l▒▒}-YI▒ؒ#▒I▒__R▒▒v.▒▒E`[V▒#▒DR▒µZK▒▒i▒2▒m▒▒▒▒W+▒▒)|▒|*▒▒▒▒~▒z2e/l▒▒▒R▒▒Zc|▒▒▒▒,b▒s▒▒+▒۷I▒V▒▒,ۘ\▒8sj#▒▒▒▒▒▒9▒D`t▒▒▒~▒▒▒▒▒f▒▒▒▒ir▒[▒▒0▒{▒▒;▒{+▒▒<▒▒▒l▒▒,Zz▒▒▒▒Ji▒,▒▒▒o▒D
                                                                                                                                                                     ▒▒[▒▒m▒▒V+▒▒H▒▒▒R▒3fS6▒v▒▒nfE$v▒▒ʿC7▒zC▒▒v▒▒     ▒▒;▒r ▒\i▒▒,▒▒;▒\!Rʽ▒П▒gH▒▒'▒▒h▒nֹ\▒<▒▒p▒▒k:8o+4c▒▒g(▒}n▒▒dq\g▒▒▒M ▒7▒▒▒F▒
Yv▒▒K▒▒▒▒▒(s▒OHQh3.v8?&▒ ▒▒FHp▒@▒3▒p▒k▒<▒Ξ▒▒5@,▒▒E▒Z▒"5▒{Jv7"]4▒▒▒1▒▒▒WJ▒▒q▒▒؂▒-▒▒▒}▒E▒SP▒▒̞.▒(▒▒I▒W▒▒I▒7'▒$l▒a*▒2g▒Q▒▒▒I
qRy}/▒s▒▒▒▒%$iW9XҒ▒M▒&▒▒/▒ɤ▒X▒f!▒▒f▒f▒▒▒▒W▒l8*▒▒▒N`▒c3ʾwE▒žD3▒▒D.▒▒ƙ▒o8▒%U▒PN▒v▒▒▒.l▒~▒▒h▒ʾ▒sDlZ▒▒w▒▒z_V▒▒▒▒)m▒?▒▒t▒K▒Q▒▒Q▒~S▒▒▒t&?\▒▒k▒▒[▒U▒▒𷜄       y▒>▒?▒E▒G▒3▒#▒^▒▒▒▒Q▒   ▒▒G▒    >▒JO;▒&K▒▒▒YC~▒▒J▒S▒▒|$ P▒@▒o▒▒!;▒f▒NpzY▒}▒▒▒▒▒d▒▒▒)▒J▒▒1▒aQ:9i▒▒ĺ     V▒br▒▒▒▒W▒[$▒$▒L▒▒{t▒▒g▒8▒▒▒g▒▒▒龏Ƣx
nFcW▒!▒`▒H▒▒*▒▒@˱vQ=▒▒8z▒W6;▒▒▒▒▒h▒Cm)WpL▒q▒/0▒Xk:/D▒▒▒B`▒f▒]▒9&▒▒▒zm▒G▒[-Qc▒>+▒մ▒▒h▒:▒#T▒g(𖣖I▒bU▒ԁ▒~8▒R,4▒▒▒"R▒2▒nv▒e▒[▒˄*!▒▒0Z▒▒P
                                                                                            ▒4L▒S
ɱ▒ٷ$▒)D&W9▒▒=▒▒▒E▒▒▒i▒Jr]▒▒uG▒▒L▒▒▒▒N8N▒l▒:I▒wD▒▒5▒▒▒▒▒▒Z_▒▒▒▒▒*▒▒Q▒▒B▒rft▒▒▒P9sS▒▒+˕vlg<V+▒t▒|J▒▒,ݽ▒Ns6▒▒r▒▒▒n▒▒M▒:3▒▒▒o▒,pCC▒O▒T1▒▒&▒C▒▒b"D"5▒▒&▒▒O▒;▒Hm
Q▒X▒zQ▒▒ӆZ▒%*▒
              #a▒d▒▒▒▒PI4▒▒▒'PK                                                                                                                                                                      uVr]     META-INF/PK                                                                                                                                                                                  mVr]data/PK                                                                                                                                                                                           mVrscripts/PK                                                                                                                                                                                         rVr]br/PK                                                                                                                                                                                             rVr]br/gov/PK                                                                                                                                                                                         rbr/gov/caixa/PK                                                                                                                                                                                      rVr]br/gov/caixa/azure/PK                                                                                                                                                                             rVr]br/gov/caixa/azure/servicebus/PK                                                                                                                                                                  rVr]"br/gov/caixa/azure/servicebus/dto/PK                                                                                                                                                             rVr]br/gov/caixa/desenrola/PK                                                                                                                                                                         rVr]r/gov/caixa/desenrola/dao/PK                                                                                                                                                                      tVr]br/gov/caixa/desenrola/entity/PK                                                                                                                                                                  rVr]r/gov/caixa/desenrola/dto/PK                                                                                                                                                                      rVr]br/gov/caixa/desenrola/service/PK                                                                                                                                                                 tVr]br/gov/caixa/sigec/PK                                                                                                                                                                             tVr] br/gov/caixa/sigec/persistencia/PK                                                                                                                                                               tVr]$br/gov/caixa/sigec/persistencia/jpa/PK                                                                                                                                                           sVr]*br/gov/caixa/sigec/persistencia/jpa/enums/PK                                                                                                                                                     tVr](br/gov/caixa/sigec/persistencia/jpa/ico/PK                                                                                                                                                       tVr]1br/gov/caixa/sigec/persistencia/jpa/relatorioctc/PK                                                                                                                                              sVr]$br/gov/caixa/sigec/persistencia/ico/PK                                                                                                                                                           tVr]-br/gov/caixa/sigec/persistencia/relatorioctc/PK                                                                                                                                                  tVr]br/gov/caixa/sigec/util/PK                                                                                                                                                                        tVr]"br/gov/caixa/sigec/util/adaptador/PK                                                                                                                                                             tVr]r/gov/caixa/sigec/dominio/PK                                                                                                                                                                      sVr]br/gov/caixa/sigec/dominio/dto/PK                                                                                                                                                                 sVr]%br/gov/caixa/sigec/dominio/dto/cemoc/PK                                                                                                                                                          sVr],br/gov/caixa/sigec/dominio/dto/relatorioctc/PK                                                                                                                                                   sVr]$br/gov/caixa/sigec/dominio/dto/srcc/PK                                                                                                                                                           tVr]%br/gov/caixa/sigec/dominio/auditoria/PK                                                                                                                                                          tVr](br/gov/caixa/sigec/dominio/relatorioctc/PK                                                                                                                                                       sVr]!br/gov/caixa/sigec/dominio/enums/PK                                                                                                                                                              tVr]br/gov/caixa/sigec/dominio/ico/PK                                                                                                                                                                 rVr]br/gov/caixa/sigec/anotacoes/PK                                                                                                                                                                   sVr]br/gov/caixa/sigec/enums/PK                                                                                                                                                                       tVr]r/gov/caixa/sigec/negocio/PK                                                                                                                                                                      sVr]&br/gov/caixa/sigec/negocio/integracao/PK                                                                                                                                                         tVr]'br/gov/caixa/sigec/negocio/processador/PK                                                                                                                                                        tVr]3br/gov/caixa/sigec/negocio/processador/contestacao/PK                                                                                                                                            tVr]=br/gov/caixa/sigec/negocio/processador/contestacao/adaptador/PK                                                                                                                                  sVr]%br/gov/caixa/sigec/negocio/documento/PK                                                                                                                                                          sVr]3br/gov/caixa/sigec/negocio/inicializadorbancodados/PK                                                                                                                                            sVr]*br/gov/caixa/sigec/negocio/preprocessador/PK                                                                                                                                                     sVr]%br/gov/caixa/sigec/negocio/auditoria/PK                                                                                                                                                          sVr],br/gov/caixa/sigec/negocio/auditoria/audita/PK                                                                                                                                                   sVr]!br/gov/caixa/sigec/negocio/cemoc/PK                                                                                                                                                              tVr]%br/gov/caixa/sigec/negocio/processor/PK                                                                                                                                                          tVr].br/gov/caixa/sigec/negocio/processor/calculos/PK                                                                                                                                                 tVr]#br/gov/caixa/sigec/negocio/service/PK                                                                                                                                                            sVr]br/gov/caixa/sigec/api/PK                                                                                                                                                                         sVr]br/gov/caixa/sigec/api/sicli/PK                                                                                                                                                                   sVr]"br/gov/caixa/sigec/api/connection/PK                                                                                                                                                             sVr]br/gov/caixa/sigec/api/nuclea/PK                                                                                                                                                                  sVr]"br/gov/caixa/sigec/api/nuclea/dto/PK                                                                                                                                                             sVr]*br/gov/caixa/sigec/api/nuclea/dto/request/PK                                                                                                                                                     sVr]+br/gov/caixa/sigec/api/nuclea/dto/response/PK                                                                                                                                                    sVr]#br/gov/caixa/sigec/api/nuclea/mock/PK                                                                                                                                                            sVr]%br/gov/caixa/sigec/api/nuclea/evento/PK                                                                                                                                                          sVr]$br/gov/caixa/sigec/api/nuclea/enums/PK                                                                                                                                                           sVr](br/gov/caixa/sigec/api/nuclea/exception/PK                                                                                                                                                       sVr]"br/gov/caixa/sigec/api/nuclea/ssl/PK                                                                                                                                                             sVr](br/gov/caixa/sigec/api/nuclea/validator/PK                                                                                                                                                       sVr]br/gov/caixa/sigec/api/service/PK                                                                                                                                                                 sVr]r/gov/caixa/sigec/api/ssl/PK                                                                                                                                                                      sVr]br/gov/caixa/sigec/api/siico/PK                                                                                                                                                                   sVr]br/gov/caixa/sigec/api/silcr/PK                                                                                                                                                                   sVr]br/gov/caixa/sigec/api/simtr/PK                                                                                                                                                                   sVr]!br/gov/caixa/sigec/api/simtr/dto/PK                                                                                                                                                              sVr]"br/gov/caixa/sigec/api/simtr/mock/PK                                                                                                                                                             sVr]$br/gov/caixa/sigec/api/simtr/filter/PK                                                                                                                                                           sVr]'br/gov/caixa/sigec/api/simtr/exception/PK                                                                                                                                                        sVr]%br/gov/caixa/sigec/api/simtr/factory/PK                                                                                                                                                          sVr]'br/gov/caixa/sigec/api/simtr/validator/PK                                                                                                                                                        sVr]br/gov/caixa/sigec/api/sincr/PK                                                                                                                                                                   sVr]r/gov/caixa/sigec/api/sso/PK                                                                                                                                                                      sVr]r/gov/caixa/sigec/excecao/PK                                                                                                                                                                      sVr]br/gov/caixa/sigec/comum/PK                                                                                                                                                                       sVr]#br/gov/caixa/sigec/comum/exception/PK                                                                                                                                                            sVr]br/gov/caixa/sigec/comum/dao/PK                                                                                                                                                                   sVr]br/gov/caixa/sigec/barramento/PK                                                                                                                                                                  sVr]"br/gov/caixa/sigec/barramento/dao/PK                                                                                                                                                             tVr]$br/gov/caixa/sigec/barramento/sicli/PK                                                                                                                                                           sVr]-br/gov/caixa/sigec/barramento/sicli/consulta/PK                                                                                                                                                  sVr]br/gov/caixa/sigec/cics/PK                                                                                                                                                                        sVr]br/gov/caixa/sigec/config/PK                                                                                                                                                                      sVr]br/gov/caixa/sigec/dto/PK                                                                                                                                                                         sVr]br/gov/caixa/sigec/mdb/PK                                                                                                                                                                         tVr]br/gov/caixa/sigec/simulador/PK                                                                                                                                                                   tVr]!br/gov/caixa/sigec/simulador/dto/PK                                                                                                                                                              tVr]br/gov/caixa/sigec/provider/PK                                                                                                                                                                    tVr]br/gov/caixa/sigec/qualifier/PK                                                                                                                                                                   tVr] br/gov/caixa/sigec/solicitacoes/PK                                                                                                                                                               tVr]$br/gov/caixa/sigec/solicitacoes/dto/PK                                                                                                                                                           rVr]r/gov/caixa/portabilidade/PK                                                                                                                                                                      tVr]"br/gov/caixa/portabilidade/entity/PK                                                                                                                                                             rVr]&br/gov/caixa/portabilidade/annotation/PK                                                                                                                                                         rVr]"br/gov/caixa/portabilidade/config/PK                                                                                                                                                             rVr]br/gov/caixa/portabilidade/dao/PK                                                                                                                                                                 rVr]br/gov/caixa/portabilidade/dto/PK                                                                                                                                                                 rVr]#br/gov/caixa/portabilidade/service/PK                                                                                                                                                            rVr] br/gov/caixa/portabilidade/util/PK                                                                                                                                                               uVr]META-INF/maven/PK                                                                                                                                                                                 uVr]"META-INF/maven/br.gov.caixa.sigec/PK                                                                                                                                                             uVr]*META-INF/maven/br.gov.caixa.sigec/gec-ejb/PK                                                                                                                                                   mVr'META-INF/beans.xml▒P=k▒0▒▒_a▒[▒ۥ▒▒Z
Ҁ▒@B▒▒▒▒s▒▒+q▒▒n▒TB▒h:I▒▒▒▒0▒▒i▒▒▒^▒▒8▒▒>▒▒▒R}▒l^▒OPX▒=x▒dlW▒^7d▒O▒▒▒▒ߦ▒Ta[nK9q▒▒J▒▒㢱l(▒▒5X    pN▒▒B[▒c0▒▒8▒6▒▒]▒-
'PK~▒ۼ9j▒▒▒E▒Wr▒▒▒▒▒▒P▒▒U▒                                                                                                                                                                         mVr]s▒▒z
     F"data/nuclea-retencao-pdf-mock.json▒T▒▒0▒▒+▒▒@▒▒▒.▒FKWB▒▒▒▒▒L▒▒dm▒▒UՏYq@▒▒▒ǘiӒ▒m▒R▒▒3▒y▒ŋ▒Q
V;▒>z"▒▒\▒▒▒M▒
|▒L▒▒B▒ų3▒▒p▒V_▒/(r▒▒▒e B▒EW▒-S▒▒▒▒(▒▒ޔ▒E[▒#▒▒▒
@▒K▒{▒▒▒i!▒tF̅_3"▒▒M|)_  ▒:▒▒▒0ľJ)▒▒q▒/▒zh▒▒%l▒▒▒u+▒▒1>u▒▒▒▒▒▒E1▒΃A▒Ȧ
▒G▒j▒N▒[▒▒▒h▒`▒rJ}▒▒B<▒#▒z▒▒i|▒ɝJl▒▒n▒▒▒;QJ▒^K$▒▒4▒
                                                   ▒9▒▒▒(▒y▒0▒f,Z3▒sq▒J▒u▒l:▒▒I▒▒/▒O▒l41▒U
▒>▒▒▒MV▒u)▒▒▒dM^|r▒▒A▒
                      <▒▒▒▒     ▒]a5▒eϫ?1o▒▒▒$r▒?▒_=▒!▒=gԷ▒▒
▒(▒n▒]6▒k4▒nf▒,▒x▒▒A^▒▒?w▒▒d▒▒▒l▒2▒▒▒▒B,▒xa▒?▒▒▒/▒▒f<▒R▒▒▒▒Wg/▒▒&])▒▒▒▒E;x▒▒;▒ʲ▒Ps▒▒z
                                                                                     FPK                                                                                                           mVr-s,}s▒k߼▒▒w▒foas▒▒▒Rms1Ӭo▒▒zp▒▒▒bdLިAL_VERSAO_FINAL_GEC.sql▒]▒▒▒F▒▒▒▒d仑D▒W9�.▒▒ApJ▒▒▒▒H▒▒)▒▒▒▒7▒▒▒]▒▒V9▒^▒▒▒▒%▒
                                   ▒▒▒mV▒▒_▒e.▒▒e▒w▒▒▒▒▒
                                                        ▒▒Z?̍▒▒▒n53Þ▒▒j x}@▒▒▒Fk16m▒م/L▒ޖ}b▒6▒▒W#W▒▒ԉ▒▒▒1|▒▒@▒▒շj▒{▒1▒▒▒▒▒▒w▒▒}K▒7▒▒B[58z#m}P▒j?{uj▒w▒▒▒▒▒W▒▒▒▒h▒~Y▒▒▒▒X▒m▒▒▒a▒▒▒▒@
'1▒▒▒N▒J▒▒▒]%▒▒{▒▒ 2O▒P▒_Q2`▒▒▒˗▒d▒[▒l!V▒▒▒f▒K0▒FK▒▒y▒▒-▒u▒▒▒▒▒o▒u4▒g/▒▒ҍ▒▒▒;▒_▒▒▒
x▒▒ͭ▒▒▒oT▒▒]▒L▒~]y▒@▒▒Q8▒k▒Pǃ{▒m▒_▒|▒▒▒▒i▒▒'▒nI P1.▒▒c▒=▒
prӾe▒.E▒&▒FR▒▒▒▒#▒\i▒<]▒hs▒qy
▒▒▒▒▒л▒h▒2▒a�▒▒▒EEa▒0▒.▒އ▒▒▒"o#?▒▒▒sٮ▒b▒
�C▒r▒▒▒2▒`▒v▒▒r▒g▒70$▒ѠB▒▒޺▒▒▒▒[)
▒▒&▒߹▒▒W)▒▒▒CBC▒▒▒▒Y▒▒▒o▒l▒▒▒lR
▒▒`l[:▒i▒▒▒▒5▒▒"▒▒▒▒▒▒▒▒g▒▒MC▒▒F]m<ߋ▒▒G!▒▒|Q▒▒▒▒có
mQ▒`▒▒▒▒D~▒                                       ax(mL}▒▒▒▒=▒  ؓ▒▒▒▒▒&▒Zڡ▒▒▒?▒&▒▒7▒Y▒m  ▒"g▒B▒▒9&▒▒k|"▒▒▒g▒Ӓ▒▒▒▒▒▒p▒▒U$▒▒▒Uf['$0▒▒j▒▒▒ ▒MjG▒2▒▒2▒N▒}H▒▒7AH▒S$
Bn▒▒+f3▒ P▒09▒qÀ6B▒A&M▒7▒6
v▒▒▒▒▒▒'▒▒
          ▒▒ഏ٩▒▒.x▒▒@Y▒▒}x▒q{▒z▒▒▒▒▒bj)▒▒▒▒9▒▒▒▒
▒       <}▒ق▒▒▒]S1J8▒▒:▒r▒▒▒▒ңG▒▒▒11Sŉ1b8`doLH▒`$▒9▒▒[9▒▒▒X4弿ڹ~▒>9>▒▒▒▒R▒▒rhk▒%f2▒[Ӓ>p▒Bn▒▒Cw▒▒М▒\N▒▒!-Dr▒p▒"▒Qr▒▒▒▒V▒#Xr$▒▒W▒7▒ƍ6▒▒▒▒▒▒d*▒q▒6▒QG▒6▒^j▒▒▒E▒#▒"▒▒▒6▒Why▒"("-▒8%4▒r▒▒9D▒▒`▒▒ţ▒▒▒▒▒z!▒
&sCH4▒▒;▒hr▒8
             ▒▒▒▒▒▒▒▒▒mC$8N▒,8[▒w"b▒CX▒{<▒▒m3aBBm▒&L▒$▒wV!V▒▒P▒h'▒L▒▒▒▒I.▒▒▒▒n▒AB▒V▒Ww▒;j7▒c▒$`▒▒▒D>▒t▒▒:▒Sn,▒06▒.)x▒T▒;▒ɠ▒r>▒.6▒Y,v▒}▒=▒▒▒ ▒5!▒▒▒▒J▒5▒▒6▒▒r▒v;▒▒s"Jo▒<ũB▒▒▒sZ>▒▒▒lvOC▒K5▒2▒|▒D▒▒e^\▒▒9;▒▒_{▒▒▒F▒a6▒▒'k▒▒
                   ▒▒(▒_▒%<▒BBq▒8N,▒
Q.7<"▒▒?
Rq▒▒W̋▒!U^▒/*/▒d▒R▒▒0!▒▒..%&▒ԫөB▒n▒▒
R▒▒%▒;=▒▒▒RrɅ▒5▒▒▒B޹t▒6m▒75;▒A;$y鲈`:$▒K▒q▒▒u<Z▒▒L
▒▒o▒֫▒4▒▒▒▒$|▒
B7▒D▒▒▒▒Ș)g▒p▒O▒▒▒▒▒4▒CTR▒▒▒i▒ٽ▒▒#▒▒▒▒▒cf▒▒)Q▒`̦w▒▒▒ ▒
                                                     ▒  ▒4y▒▒%▒▒▒▒▒T▒▒@\?▒*C i怰|▒*▒▒▒ւ▒
▒▒v$▒▒z▒▒^
▒▒▒ ▒C▒M▒+▒▒>F▒▒N&{sz▒Q▒▒J▒V-▒)▒▒#▒k▒Gǳ▒▒▒▒▒RE▒m▒▒▒E▒▒4|▒L▒▒f▒zBP▒▒▒ŋeq▒▒p7q▒▒▒▒4g▒▒▒bT▒▒7▒ ▒T▒▒Y΢▒▒GΓ{▒▒▒AɊ▒▒ ▒▒▒▒_#
                                                                                                                     y▒▒▒KAhݖC▒:H5▒▒X▒▒D▒▒Q▒E▒ڞ▒?H▒▒▒,$▒cr▒▒~▒▒▒▒̶H▒5▒▒[$▒Ԥ▒▒g}k▒▒7G▒(▒f`q▒▒b▒▒▒u#0z▒▒%▒▒@K▒{▒B▒▒B▒▒▒V?▒/      ▒▒:^▒Ԅ▒▒▒.8P▒
▒▒▒▒▒▒iKMxI▒ԈY▒▒ݦ
                 ▒      ▒!▒
▒>A,2/t0▒~D▒8▒▒▒cW^▒&▒|▒▒▒▒l=▒▒/▒▒NG▒l▒▒q▒▒▒t9HH▒▒▒M▒9▒▒{▒▒30n|▒lM;▒s▒▒O▒b▒▒ј"▒▒▒a▒     ▒tY▒▒▒▒}%▒▒5 nP▒7▒▒sj▒▒gRk\▒▒pఞ▒▒▒▒▒▒▒▒▒Hh▒▒▒▒b<۝▒"▒|j'u▒TIt▒fj&▒▒▒bk▒t>k▒y▒9▒▒34r▒rI/y▒+▒
▒U▒▒▒Gϧ▒X$@J9Z!-|▒▒▒D.▒▒▒8▒۹.kB▒}▒▒▒%`▒▒▒5
R▒▒Z▒   e▒?▒=Aq<k▒x9▒▒
▒FAc
▒-{▒▒͉S▒l̬▒jH▒QXpK▒("▒{▒▒ogV▒,▒▒▒ҍ"▒M▒`)%.U▒\/▒▒g"▒HxZ▒▒▒u▒▒
@▒/▒▒▒▒▒t▒r▒▒▒d▒▒▒▒+8▒▒▒v▒E'̂>B▒▒                          ▒▒    ▒▒▒▒▒u▒3BJ>▒"]Q▒▒g▒▒▒m▒a▒▒yq▒h\
                                ▒
                                 ▒$▒
▒Ǌ▒▒▒▒▒_▒h▒@▒▒zƋ▒▒s▒p   ▒▒▒2&▒ZO▒)▒"6▒▒9n▒i0▒▒3▒Nac▒▒%▒d▒7▒E]▒<▒d▒▒▒▒^,▒ҏqK▒▒v>7!1qC▒v9▒>▒▒hA▒▒ޑ;r▒▒q▒b^3n|▒gQ▒▒q▒
                                                                                                                  ▒▒▒▒Ҍ▒_▒pG▒▒0▒▒:t$▒▒▒}▒▒▒ؐ▒Q▒l_▒y▒▒▒s▒J|׌{f▒\d▒▒y▒y▒4▒̃▒a@1y͸▒▒8▒D▒▒▒▒HVX▒Ga▒▒l64▒▒ǗO|▒▒P▒▒1▒n▒[▒UQ▒j▒P▒
▒w▒n ▒Q
▒^FY/
▒~▒eq▒ɍ▒R8p▒▒6J˖H`r▒
▒2▒▒ͦ▒Uf▒▒Y▒9▒nqfPÿfܩ2▒▒▒e▒▒R▒/y)▒%{#0▒▒P4▒▒%▒2A▒▒U8▒8|▒zUR▒▒p▒▒i▒▒▒▒▒▒▒z▒dA
                                                                           ▒▒▒▒▒첊▒▒>t▒▒/▒%<a3P▒q▒Q▒▒w▒ܵ%▒"▒E▒,▒▒pb▒&▒D▒p0▒,0▒n▒%▒GO▒h▒▒8c▒▒D▒▒V▒       ▒▒^▒
▒▒▒▒▒!▒ ▒eqCb*p ▒B▒▒▒▒v_#▒▒▒▒▒▒▒▒mXp▒▒▒▒▒-▒▒%▒f▒m▒▒BR4D▒H@▒}▒▒▒Fa▒>t
L▒▒t
`\▒▒Oz▒▒m▒▒m▒▒▒▒▒▒▒[▒U▒0▒E      N▒▒=;▒znR▒▒.5▒z▒▒Mܓ▒F̘K¡v▒▒&Z▒▒▒:▒▒▒▒U
k▒▒▒L<▒6ݦ▒▒F▒W▒▒▒0[zf'5z▒▒▒▒V▒▒▒"▒W▒9▒Ӊ▒▒նk*▒=▒▒▒▒#▒%c▒▒▒zUh▒e>▒        ▒▒H[▒s▒▒▒▒ș▒▒▒▒(ua▒▒▒▒'▒cɄҡ▒Ds▒▒~▒▒▒{▒#�▒▒<▒▒▒▒▒▒       ▒@ ▒▒ҋ}j.?▒▒V▒▒▒f       ! ▒)▒
                                                                                                                                                             ~▒▒x▒$=▒=▒?7VU▒5▒k▒▒+▒^▒M▒C;▒h▒▒▒C▒i▒*֟pJ▒.▒G;'u▒▒@▒8▒▒*▒EhI▒qš$?▒▒▒▒▒OA▒▒8▒▒pA▒▒▒▒▒%A▒K7{Z▒▒[    ▒2>▒^M▒
▒#▒▒I`▒▒0?Ek▒▒F>Amr▒z#▒▒|▒▒▒`▒▒F▒▒Ro▒A▒Jwl▒▒+T▒-▒a▒˨N▒/-d▒▒J▒Kةޥ▒▒]Z▒w▒▒Z▒▒▒w.▒Ĺ▒▒▒▒"-|▒Bo▒▒▒   ▒▒▒▒X▒Y▒▒Q▒VZ▒n▒▒▒▒S▒E▒_[b▒R!▒▒.▒▒▒RZ▒K9dI[▒
▒▒Ժ▒▒o▒▒▒▒(Sw▒s7▒▒▒Od"'▒▒▒▒T▒"▒;9q(▒ ▒:ߡȉC9dQGd|▒"S▒"▒\▒▒▒Rd▒R▒5▒ާ▒▒>EN|▒I
#▒▒1r▒▒T{߫ȉW9eIe▒݊L▒▒Q▒▒▒+2▒+x▒▒U▒▒@Os)
▒KQ▒▒▒:՟(▒▒DI▒_▒3Q𝉒8▒▒▒B▒▒$
▒$▒;▒(▒nD▒n▒B%▒}▒▒▒C▒ć▒k▒▒▒▒5*R▒=|▒$▒▒4▒%Aw
ub▒▒
▒▒▒
71 ▒x▒J▒E▒Q▒b`▒▒▒j▒▒▒NE▒▒@▒▒/o▒▒▒▒W▒Q1▒8▒▒▒▒p1▒
r&▒▒▒▒7F▒▒r▒K▒▒▒Q9s▒▒▒VY▒rPR▒r2T▒b▒*▒UU,V▒X▒▒Wq!)Xr.▒-673Þ▒▒j.F▒6VpB▒>c▒▒▒▒.x▒▒I▒06▒▒Cr&5iIaWGd▒#▒x▒)▒VOӹ▒J▒▒y▒;▒▒A▒["▒▒▒l▒]\▒|{3:▒΂▒SVn▒E▒▒g▒▒۷7▒(wjh▒▒M@▒)▒;w▒:5▒▒e▒E▒▒▒▒b▒▒▒.▒▒w�In▒e▒O▒A▒▒v▒#0E&▒▒▒▒g▒狊▒o\1y▒▒▒;ft▒▒_yK▒▒d▒▒▒K"Iw▒.vYυ4▒p▒▒ ▒z▒▒5"▒▒A▒▒8▒2▒S▒Y▒Ol▒▒Mf▒z▒/s)<▒▒▒▒▒▒▒▒▒▒䭳▒▒ƃ~▒▒+▒'▒▒|▒."X`▒ș2▒▒o'^▒zSҸ▒▒In▒H`▒▒▒A▒Hv▒▒▒▒
                                                                              ̌͜▒:▒u:أ▒▒VJ;▒؞1▒f7▒V
▒\b▒▒▒▒^▒v▒▒▒:ޑP#t"▒P▒▒ԉ▒▒▒1|▒*▒▒▒▒▒▒L▒▒yy▒▒▒Eg▒f▒▒?3"
▒▒/▒]▒▒`}▒m▒-▒▒g▒▒וW▒A▒
▒▒#▒▒v▒.▒e▒]b▒▒I▒▒iM/af▒▒P▒▒▒▒▒U+ν▒▒    ▒▒▒.▒▒▒c
▒'▒▒▒'▒▒Y▒O'A▒▒▒{T Q▒▒▒▒!▒1▒▒▒▒▒▒▒▒'▒▒▒|▒[4▒M▒R▒(▒;ö▒w▒▒&<5vM]▒4▒▒aI▒▒AJ
a▒▒▒Dt(▒M▒▒S▒▒▒4t▒ƾk▒ѻ▒▒▒@▒G▒▒▒q▒}b▒▒p  ▒29L▒▒o▒▒▒▒gJG⅊O▒]▒▒▒▒▒.{▒▒▒P▒VeH'x▒cF▒Ix▒▒
▒▒▒▒▒B▒▒]▒▒▒([▒u▒▒}▒▒▒O[$~▒▒▒k▒
>▒_,▒▒▒▒-_▒▒▒g▒m▒Jyc,MLk▒▒▒▒▒▒t▒▒<▒▒Ƀ▒T,B▒▒▒▒▒}"▒j▒ݼ1-▒2L▒X▒▒Ԝ▒H▒▒▒*▒YǩNfC▒▒'▒▒▒▒▒#▒▒▒Mukl@r
▒▒▒▒l▒▒+h▒▒ϴ$▒N5ޚ▒▒Aϰ▒Q▒q▒5c▒^▒x▒▒܍1▒▒;▒r`▒▒a▒▒
H▒▒`▒▒▒h▒v▒*6M▒▒▒▒&x▒eI$▒▒P▒{▒▒▒s▒4▒E&)▒HṈ.i#X▒cS▒▒▒,SJ/▒▒▒▒▒▒d▒ȿ"▒~f۞▒ࣚN▒χ▒=▒h6Hx▒I▒dZƽ>"▒▒.Jw▒R▒▒▒▒A▒8▒T▒kd▒E▒▒        ▒V▒▒▒X▒L▒p▒
▒▒`▒▒▒▒▒F▒/▒2▒:QR▒▒^▒Z▒]▒▒U▒U▒fr▒x▒▒▒▒>I8▒↝Y▒▒▒▒▒
▒▒Ų▒ka▒▒Uk▒Ndq▒▒0C▒΂رF▒▒
▒T▒zX▒K▒▒끡G|▒▒LMД/Er:9Pq^{%,▒<▒▒▒\
                                   K/▒%▒▒k▒aG*r+O_▒▒▒sȮk|▒#▒s▒▒▒▒OZ▒]▒
▒▒▒▒˒,]▒R▒s]b▒sU3Ďc▒▒\▒▒▒▒9˿▒KуnCC▒▒C▒▒\c▒Ƒ▒A▒▒#▒▒▒▒C▒0▒܆▒▒G2▒▒2▒▒1▒p▒(CK▒▒▒▒Vl▒        ▒@▒▒;}▒6▒->▒0}v\▒2▒▒▒▒&6▒▒▒▒Eȗ2sraT▒▒i-l,ƥy▒▒%
▒▒V▒▒|6'▒▒Į▒▒
             n▒)˥?▒E▒u  ▒ Ö{ly/▒▒▒A▒E▒垤ˊ▒▒▒Cz)▒1WQ▒▒▒▒▒▒s▒▒T2v▒▒uE "▒▒▒+▒▒▒-▒W▒▒k▒<▒n▒▒OR▒▒▒ܠ'▒▒sҋW▒q▒A۠▒▒▒T▒܎A^▒▒o▒׽?▒E▒▒▒bl?▒▒▒▒▒▒▒*Ց/▒:!▒9▒▒▒7▒V.▒[#▒▒[l▒f▒u▒t▒▒N▒▒▒K▒▒▒rO▒"o▒mgIc▒▒6▒շ'.▒5nS▒>▒▒▒▒POՇ:
R▒▒c|▒▒Z2▒t▒SNQN▒q▒▒▒-R▒Lb▒U▒Z▒▒>▒▒+▒}▒7▒M�r▒2▒^J▒▒ڼ▒▒W▒▒▒@▒6aryM▒*▒TrY▒▒C▒▒9▒▒7{▒
                                                               ▒녎▒▒x▒.i▒Ď▒\z▒_Ua!▒▒▒yv▒ڍsX▒▒▒▒▒4▒▒▒▒Q▒ ▒%▒9▒!!C+▒\p▒▒▒$▒giHe▒▒T▒Ro9a▒▒▒25}6▒i▒▒▒▒▒P▒▒5s▒rd▒▒▒\v▒m▒Ĥ▒wF▒▒8n▒▒I▒▒
                                                                                                                                                                                 ~▒▒P▒▒"▒K▒▒PK     rVr]9C▒6:6br/gov/caixa/azure/servicebus/dto/DadosNCRTedDTO.class▒Z
                                                               x▒u>wV▒}h▒▒4▒lK▒,K▒▒▒▒▒m▒%;H▒▒▒]n▒Z▒▒▒▒]ywe▒%▒JB▒:       ▒hӤi▒▒▒▒#m▒▒$MKڴ▒i▒#-=▒Ν▒▒▒▒▒▒▒ׯ▒̜{▒▒▒▒Νs▒=k▒՟>▒E▒̶xAb▒c▒▒▒▒Ke▒▒[ҩ􉅂▒*j▒cٌ6▒PLM▒▒▒d▒86▒g▒69▒oWWys▒BvvR+▒A▒
n▒0▒l▒沥-
\=▒▒▒▒▒2Af▒▒|▒C▒L~r▒8▒ 6r$},▒▒M▒R{K▒lnj▒▒▒2DH:▒[▒▒
f"w▒
1▒L▒▒;▒▒
▒▒e▒▒۟-▒O
▒&▒▒*C
5▒+iSZ▒▒▒X▒vX▒▒L▒▒6▒H^Lh▒
|▒Ln▒▒▒lV▒▒\▒|▒\~▒򮔡▒▒▒▒
▒Ir▒▒▒Ky▒S▒▒O▒$weJ▒k▒
)▒#▒▒dX▒/       ▒p_!▒:▒gp,=▒/▒▒s▒▒E▒/L▒j▒6Ȱ▒|▒▒▒▒Bi▒▒▒a▒9▒▒▒X▒▒-2\▒_l:[,▒
                                                                         ▒L▒▒W˰▒{i▒G▒▒J▒;$▒v▒zggg5▒▒▒&▒N▒▒▒▒G▒F▒k▒▒▒G▒\1=▒▒     dT▒1▒Lj▒n▒▒=8▒<▒▒X▒▒▒▒'▒▒▒)▒4(b▒▒▒▒:▒▒▒32▒@▒▒▒̀"▒Fn2▒!3▒Y▒N▒▒ȰV▒e▒\dW▒/▒-"k2▒)▒<▒▒W▒▒▒▒▒Y▒34c▒▒Y挙▒aF@^▒y▒˰i▒d(Ұ~>Gû ▒1▒;X2▒▒▒p▒T▒▒▒▒n5▒͌:B~N▒▒▒▒▒[▒W▒D▒▒]2▒IJA▒▒▒#▒▒ex▒▒▒$▒2▒▒x▒F
▒~▒5▒!#
        ▒y>`▒▒▒▒▒
2▒c<▒▒
      2|▒▒Q>▒▒#▒ex▒▒▒
▒s▒t▒@▒4▒V▒▒Ε▒▒=▒S▒▒1B▒2▒.Z▒R▒BTE▒▒▒Ey▒▒▒#▒▒O෷▒]G▒L▒▒▒▒▒I8▒▒9▒▒m?▒▒▒▒▒?R▒▒'▒_▒▒1"{4b▒uF▒O▒▒▒t▒▒11▒▒▒▒▒▒u▒L6▒ګ▒▒▒▒4.Σț▒B1▒▒]?<▒  ▒▒/FD▒▒[▒▒S▒?~▒▒▒▒0▒z'▒▒5▒/M0▒e▒>▒▒H6▒a▒▒
hu`▒)▒2?~▒▒▒▒[z▒▒B▒▒z*▒ ▒▒▒M▒gRo▒rZ!]▒&ș▒▒▒/tJx▒0X{▒SF▒:▒۫▒▒▒V▒▒O▒N▒sZ   Wװh?
+▒▒c▒9]▒▒L▒▒▒▒▒▒[▒t;\,▒▒▒]▒
▒▒▒▒r٪▒▒H▒      ▒tl▒▒'a]▒L▒z▒L▒▒|▒4▒▒zr▒[▒RuWY"▒▒l▒g▒▒_)3▒▒▒▒yK▒▒▒▒▒U▒▒tX4▒K▒ڿ]▒▒r▒▒▒!Q\                                                                               ▒ElÕi▒]!▒JFd8▒I▒6#å▒ٴ▒Iě▒<as▒Ev▒X                                                                                      ▒h▒^"h▒nz3(▒F3▒A[▒q▒G▒▒▒▒/▒▒l▒?▒▒.▒4i▒  ▒dw▒3▒Z▒B▒▒▒▒gb▒▒B▒▒▒urV2:v▒m(}▒▒▒>▒▒j,
▒<▒e▒o▒▒▒▒▒x▒/▒5▒;\▒▒▒ʥ▒&#ʼ:uRs▒VxC{K▒▒▒hz^▒`▒▒{▒G▒▒V▒3▒|a▒▒▒▒  <F▒{▒▒▒▒▒▒▒׌▒`Y0ˢ.`▒▒`Y ▒!,▒
                       ▒▒/2▒▒nM▒▒▒jJ2
QW▒w▒*֏d▒s▒▒▒"▒▒▒ͦ▒▒w(▒s▒▒IJ]▒▒▒\▒▒▒.▒▒B)▒1[▒▒▒w}n&▒▒9▒�▒Ỏ▒[▒jTԠxt[>_*▒
▒y▒b(F<lM▒]▒▒z▒▒Xݳ+tY▒0▒;▒▒▒D▒▒
                               ▒▒
                                                                                       +6▒e▒}▒z▒▒z▒R▒
▒▒q؏0A▒Ew▒s▒▒Z▒k$▒▒Y▒4\▒q▒▒y▒▒F▒"▒Zb0=;▒7[▒|▒J▒.+_▒=▒6▒d▒uԲ▒▒Zf▒Q▒▒6<▒▒a▒!2▒▒▒I▒▒w5,}▒:
O▒▒qڡ▒▒{▒▒▒▒hT▒C▒g▒▒,G▒▒▒g▒.5▒▒▒c▒▒e*▒▒u}y/▒▒`▒[S1w▒d▒ğ ▒▒▒@'▒h▒ư▒▒2▒#▒ϸx▒▒�▒?;▒xv▒g▒▒▒▒▒▒▒▒ύ▒▒I<▒▒m▒]<w▒▒▒9&▒▒▒|▒?<Oc▒▒▒▒▒'▒▒{▒
[▒p'>▒▒▒V▒E▒x▒u▒П▒▒
                   ▒▒(▒j▒)t▒▒P▒RhiM▒▒;
5U
u▒▒▒▒▒PK▒▒▒B▒a▒AhQ▒PWM▒#▒▒▒▒R▒▒▒М▒Pg▒POM▒yG▒▒J▒DM▒▒▒▒▒J▒:▒(▒▒Z]S▒▒▒W
▒▒)t▒▒КJ▒▒5▒n▒w]^)tEM▒;g▒▒R▒ʚB▒qR+▒6▒z▒▒▒▒J!▒▒н▒B[+▒6▒▒▒`▒Ж▒Br▒Q)▒▒▒Ї▒▒+▒▒▒z▒Qh▒Rh▒▒▒G▒!▒]g*▒v▒▒m▒▒▒▒▒=▒(▒$▒▒J!▒Ԣ3▒YA▒▒e▒ǲ▒▒▒,▒W>b▒▒T▒Y>Z▒|▒.▒▒▒]g▒z▒▒v▒x▒▒▒▒sN▒-▒▒SydʷU▒?▒▒$▒▒^y▒▒L▒▒*▒▒gi▒▒▒▒騒▒▒▒|g▒▒+▒▒+▒▒▒▒Y▒▒^▒n▒|w▒▒▒k▒▒^▒^▒▒▒V▒▒▒▒|▒^▒]>Y%▒G΋▒_▒|ʾ8▒*▒9˯▒W~▒]~m▒▒ß8▒_^▒<▒Z0▒▒U▒▒▒▒▒▒▒+▒▒>▒U▒,▒▒+▒▒.▒▒J▒▒▒▒땿▒U▒▒;▒o▒W~▒]~[▒▒_8▒▒+▒▒.▒▒J▒▒;▒▒i▒▒Y%▒Mg▒▒z寵▒_[%▒-g▒z▒▒▒▒cU▒/▒_V▒/~v▒+O?▒M▒▒▒▒▒,▒▒V.4▒x
▒▒u▒q▒▒▒I▒▒▒▒+▒▒Q▒Jx݌▒  ▒n▒▒▒▒▒▒n▒▒▒▒>▒N▒u?^▒▒z▒▒%▒ʺ+d+▒&▒%7|[_F▒W6▒4|▒▒L▒$6▒~,?JV              ō▒yB▒▒P▒x4&▒`   ŏMB     ▒y▒P▒▒▒▒▒▒5▒▒0  &▒0檄▒▒P▒▒▒J#nЄ▒}▒P▒0▒J3FeB▒c▒$▒▒Ɖx▒ç▒▒▒▒g}▒槸WmdQ}%q▒J!▒▒ji▒n▒Q-▒▒▒^n▒▒ӕ▒@:▒▒0▒▒Oi▒r'%8▒B▒*h?Ӧ▒▒Q▒n▒+e▒(▒(▒4r▒▒A▒[▒u▒▒E▒▒▒[▒!▒ܢ▒m▒▒Y+▒▒▒▒ ▒▒▒J;▒▒▒H▒J▒▒
                                        r
▒▒/▒Y▒?▒▒▒▒,p▒З▒$▒▒}|▒▒Lߗ▒7▒▒(~▒7)▒▒x}L4▒a▒▒▒▒<▒▒▒▒4▒▒J▒S▒}Ru'▒▒Q▒▒▒<▒▒R܊▒F:▒z▒t▒)^"▒ɫ▒l▒▒▒O▒=▒▒$▒▒▒nS▒I▒▒J▒H▒ ▒e#▒UCI▒▒▒▒�R▒6▒5▒▒{T▒)*H%j#▒▒▒I▒ǔF"▒▒Q▒▒Hզ$ݛ▒&"5
                                                                                                                                                                R▒▒l#M▒▒$▒[▒8▒Z)▒▒▒H3jk▒▒mJ+▒▒▒Ui▒▒r▒▒▒▒"E!▒"AR▒E6▒▒▒▒$▒ە▒Dj▒▒J▒▒tB]▒▒▒Re     ▒▒
▒e▒▒t▒▒,I▒e▒:i▒▒a#ݥv&▒\▒$▒rA▒T▒▒Hw▒+▒t▒RV▒K▒V(]6▒=▒▒$ݻ▒▒D▒▒▒J▒▒t▒▒*I▒e▒zi▒▒c#▒T{▒tO(▒DR▒▒▒▒▒W▒tO*}DJ
R▒Zv▒6g#mN▒M}▒▒▒▒▒Y▒▒!x}\▒▒▒▒▒]▒▒{h5▒>▒-7▒Ko▒▒▒▒▒q▒e▒▒p▒▒▒-Z>xXz^A▒▒JO▒▒
▒W▒S▒wh▒▒$▒=Z2▒@:
?D+▒J3▒h▒YHD+�▒▒*ZQ▒VZ?B▒▒m▒:▒Њ▒▒?F▒▒d▒c▒?
▒▒V▒e▒▒_h-▒Z▒ ▒▒▒Ri▒sh-▒▒R▒)Z▒8▒▒▒▒▒N▒▒▒,,▒n▒▒Ck▒▒n▒:▒▒▒▒'▒▒h▒▒▒▒▒oh▒▒▒▒▒▒▒h)▒Ev▒Z▒▒Y~▒▒b▒c6
                                                           ▒▒▒c▒րV▒▒▒dn▒VI_▒{▒▒▒U▒a^▒z▒▒@c>▒▒&▒▒▒h▒▒▒h%]▒▒▒wm▒y▒h▒ft▒^▒▒▒O>-^x▒▒sЦ▒▒▒ӦQ~}▒▒▒j▒▒$&▒▒▒裒▒M▒M▒(5ڊ;▒YQ▒qc▒▒▒▒▒▒N▒O▒▒▒1▒
>▒<▒԰▒=:@▒܃▒/▒▒4▒▒▒C▒▒  F▒[_▒▒4x▒_▒▒I▒▒▒A >:▒t▒▒▒ۄ▒TR=▒ǀnS▒▒׀▒>▒L▒g@T?▒▒&▒7▒q5▒▒
▒▒PЄ▒4▒▒▒MH6▒5ġ▒        ▒
(▒▒96▒▒ݬF81▒▒▒P▒▒▒PԀ▒P▒hB▒t▒▒P̄bt▒▒ġ&j2▒{▒f5▒P▒ݧ▒97▒▒▒T[8▒bB-t▒▒ʡVj5▒Sj▒L▒▒C▒Y3▒B▒.i

term-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256colorxterm-256color




[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]# mkdir -p /tmp/t_iso && cd /tmp/t_iso && rm -rf *
cp /opt/jboss-eap/standalone/deployments/gec-ear.ear .
mkdir META-INF
unzip -p gec-ear.ear META-INF/jboss-deployment-structure.xml \
  | sed 's#<ear-subdeployments-isolated>false#<ear-subdeployments-isolated>true#' > META-INF/jboss-deployment-structure.xml
zip -q gec-ear.ear META-INF/jboss-deployment-structure.xml
unzip -p gec-ear.ear META-INF/jboss-deployment-structure.xml | grep isolated
        <!-- Make sub deployments isolated by default, so they cannot see each others
        <ear-subdeployments-isolated>true</ear-subdeployments-isolated>
[root@caddeapllx2871 t_iso]#
[root@caddeapllx2871 t_iso]#
[root@caddeapllx2871 t_iso]#
[root@caddeapllx2871 t_iso]#
[root@caddeapllx2871 t_iso]#
[root@caddeapllx2871 t_iso]#




