
[root@caddeapllx2871 p585600]#
[root@caddeapllx2871 p585600]#
[root@caddeapllx2871 p585600]# cd /opt/jboss-eap/standalone/deployments
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]# ls -l
total 105684
-rw-r--r-- 1 jboss jboss    63527 nov 16 12:26 framework.jar
-rw-r--r-- 1 jboss jboss       13 nov 16 12:26 framework.jar.deployed
-rw-r--r-- 1 jboss jboss   129646 nov 16 12:26 framework_sisgd.jar
-rw-r--r-- 1 jboss jboss       19 nov 16 12:26 framework_sisgd.jar.deployed
-rwxrw-rw- 1 jboss jboss 95740879 nov 16 15:15 gec-ear.ear
-rw-r--r-- 1 jboss jboss   199234 nov 17 11:48 gec-ear.ear.failed
-rwxrwxr-x 1 jboss jboss     8888 jun 23  2021 README.txt
-rw-r--r-- 1 jboss jboss 12054106 nov 16 12:26 wmq.jmsra.rar
-rw-r--r-- 1 jboss jboss       13 nov 16 12:26 wmq.jmsra.rar.deployed
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]# for f in *.jar *.ear; do unzip -l "$f" 2>/dev/null | grep -q 'sisgd/framework/cm/ConectorException' && echo "TEM: $f"; done
TEM: framework_sisgd.jar
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]# unzip -l gec-ear.ear | grep -iE "sisgd|framework|jboss-deployment-structure|jboss-all|lib/"
        0  11-16-2026 15:04   lib/
     1330  11-16-2026 15:04   META-INF/jboss-deployment-structure.xml
     7846  11-16-2026 15:04   lib/br.gov.caixa.sigec-gec-azure-5.0.0-online-SNAPSHOT.jar
    19673  11-16-2026 15:04   lib/br.gov.caixa.sigec-gec-common-5.0.0-online-SNAPSHOT.jar
   235509  11-16-2026 15:04   lib/br.gov.caixa.arqref-arqref-core-3.7.2.2.jar
  5538977  11-16-2026 15:04   lib/net.sf.jasperreports-jasperreports-6.6.0.jar
  2150122  11-16-2026 15:04   lib/com.github.librepdf-openpdf-1.3.43.jar
   531308  11-16-2026 15:04   lib/org.apache.velocity-velocity-engine-core-2.3.jar
   346580  11-16-2026 15:04   lib/org.apache.velocity-velocity-tools-2.0.jar
    90001  11-16-2026 15:04   lib/commons-chain-commons-chain-1.1.jar
   138956  11-16-2026 15:04   lib/commons-validator-commons-validator-1.3.1.jar
    65261  11-16-2026 15:04   lib/oro-oro-2.0.8.jar
    26215  11-16-2026 15:04   lib/sslext-sslext-1.2-0.jar
   328896  11-16-2026 15:04   lib/org.apache.struts-struts-core-1.3.8.jar
   358273  11-16-2026 15:04   lib/antlr-antlr-2.7.2.jar
   251521  11-16-2026 15:04   lib/org.apache.struts-struts-taglib-1.3.8.jar
   119653  11-16-2026 15:04   lib/org.apache.struts-struts-tiles-1.3.8.jar
   420975  11-16-2026 15:04   lib/org.apache.velocity-velocity-1.6.2.jar
   261809  11-16-2026 15:04   lib/commons-lang-commons-lang-2.4.jar
    78493  11-16-2026 15:04   lib/io.jsonwebtoken-jjwt-api-0.11.1.jar
    78457  11-16-2026 15:04   lib/io.jsonwebtoken-jjwt-impl-0.11.1.jar
     8383  11-16-2026 15:04   lib/io.jsonwebtoken-jjwt-jackson-0.11.1.jar
    64477  11-16-2026 15:04   lib/com.auth0-java-jwt-4.4.0.jar
    75569  11-16-2026 15:04   lib/com.fasterxml.jackson.core-jackson-annotations-2.15.4.jar
   548185  11-16-2026 15:04   lib/com.fasterxml.jackson.core-jackson-core-2.15.4.jar
  1620433  11-16-2026 15:04   lib/com.fasterxml.jackson.core-jackson-databind-2.15.4.jar
    54630  11-16-2026 15:04   lib/com.fasterxml.jackson.dataformat-jackson-dataformat-yaml-2.15.4.jar
   126136  11-16-2026 15:04   lib/com.fasterxml.jackson.dataformat-jackson-dataformat-xml-2.15.4.jar
   195909  11-16-2026 15:04   lib/org.codehaus.woodstox-stax2-api-4.2.1.jar
  1586395  11-16-2026 15:04   lib/com.fasterxml.woodstox-woodstox-core-6.5.1.jar
   122937  11-16-2026 15:04   lib/com.fasterxml.jackson.datatype-jackson-datatype-jsr310-2.15.4.jar
  3175836  11-16-2026 15:04   lib/br.gov.caixa.sigec-gec-xml-5.0.0-online-SNAPSHOT.jar
   573871  11-16-2026 15:04   lib/com.azure-azure-messaging-servicebus-7.15.0.jar
   790799  11-16-2026 15:04   lib/com.azure-azure-core-1.45.1.jar
  1745134  11-16-2026 15:04   lib/io.projectreactor-reactor-core-3.4.34.jar
    11640  11-16-2026 15:04   lib/org.reactivestreams-reactive-streams-1.0.4.jar
   348522  11-16-2026 15:04   lib/com.azure-azure-core-amqp-2.9.0.jar
    68070  11-16-2026 15:04   lib/com.microsoft.azure-qpid-proton-j-extensions-1.2.4.jar
   742477  11-16-2026 15:04   lib/org.apache.qpid-proton-j-0.33.8.jar
    75994  11-16-2026 15:04   lib/com.azure-azure-core-http-netty-1.13.11.jar
   561452  11-16-2026 15:04   lib/io.netty-netty-handler-4.1.101.Final.jar
    37791  11-16-2026 15:04   lib/io.netty-netty-resolver-4.1.101.Final.jar
   497114  11-16-2026 15:04   lib/io.netty-netty-transport-4.1.101.Final.jar
    25496  11-16-2026 15:04   lib/io.netty-netty-handler-proxy-4.1.101.Final.jar
   120981  11-16-2026 15:04   lib/io.netty-netty-codec-socks-4.1.101.Final.jar
   306738  11-16-2026 15:04   lib/io.netty-netty-buffer-4.1.101.Final.jar
   345293  11-16-2026 15:04   lib/io.netty-netty-codec-4.1.101.Final.jar
   657671  11-16-2026 15:04   lib/io.netty-netty-codec-http-4.1.101.Final.jar
   487548  11-16-2026 15:04   lib/io.netty-netty-codec-http2-4.1.101.Final.jar
    43968  11-16-2026 15:04   lib/io.netty-netty-transport-native-unix-common-4.1.101.Final.jar
    39378  11-16-2026 15:04   lib/io.netty-netty-transport-native-epoll-4.1.101.Final-linux-x86_64.jar
   147146  11-16-2026 15:04   lib/io.netty-netty-transport-classes-epoll-4.1.101.Final.jar
    25021  11-16-2026 15:04   lib/io.netty-netty-transport-native-kqueue-4.1.101.Final-osx-x86_64.jar
   108435  11-16-2026 15:04   lib/io.netty-netty-transport-classes-kqueue-4.1.101.Final.jar
     3246  11-16-2026 15:04   lib/io.netty-netty-tcnative-boringssl-static-2.0.62.Final.jar
    35089  11-16-2026 15:04   lib/io.netty-netty-tcnative-classes-2.0.62.Final.jar
  1207474  11-16-2026 15:04   lib/io.netty-netty-tcnative-boringssl-static-2.0.62.Final-linux-x86_64.jar
  1125530  11-16-2026 15:04   lib/io.netty-netty-tcnative-boringssl-static-2.0.62.Final-linux-aarch_64.jar
  1104777  11-16-2026 15:04   lib/io.netty-netty-tcnative-boringssl-static-2.0.62.Final-osx-x86_64.jar
  1001481  11-16-2026 15:04   lib/io.netty-netty-tcnative-boringssl-static-2.0.62.Final-osx-aarch_64.jar
   998415  11-16-2026 15:04   lib/io.netty-netty-tcnative-boringssl-static-2.0.62.Final-windows-x86_64.jar
   369515  11-16-2026 15:04   lib/io.projectreactor.netty-reactor-netty-http-1.0.39.jar
   171804  11-16-2026 15:04   lib/io.netty-netty-resolver-dns-4.1.101.Final.jar
    66905  11-16-2026 15:04   lib/io.netty-netty-codec-dns-4.1.101.Final.jar
    19278  11-16-2026 15:04   lib/io.netty-netty-resolver-dns-native-macos-4.1.101.Final-osx-x86_64.jar
   277257  11-16-2026 15:04   lib/com.azure-azure-identity-1.13.3.jar
     9091  11-16-2026 15:04   lib/io.netty-netty-resolver-dns-classes-macos-4.1.101.Final.jar
   412253  11-16-2026 15:04   lib/io.projectreactor.netty-reactor-netty-core-1.0.39.jar
   660512  11-16-2026 15:04   lib/io.netty-netty-common-4.1.101.Final.jar
   324354  11-16-2026 15:04   lib/com.azure-azure-json-1.3.0.jar
   366669  11-16-2026 15:04   lib/com.microsoft.azure-msal4j-1.17.1.jar
   896918  11-16-2026 15:04   lib/com.nimbusds-oauth2-oidc-sdk-11.18.jar
     4722  11-16-2026 15:04   lib/com.github.stephenc.jcip-jcip-annotations-1.0-1.jar
     8877  11-16-2026 15:04   lib/com.nimbusds-content-type-2.3.jar
    11170  11-16-2026 15:04   lib/com.nimbusds-lang-tag-1.7.jar
   810931  11-16-2026 15:04   lib/com.nimbusds-nimbus-jose-jwt-9.40.jar
   120233  11-16-2026 15:04   lib/net.minidev-json-smart-2.5.0.jar
    29901  11-16-2026 15:04   lib/net.minidev-accessors-smart-2.5.0.jar
   122176  11-16-2026 15:04   lib/org.ow2.asm-asm-9.3.jar
    27005  11-16-2026 15:04   lib/com.microsoft.azure-msal4j-persistence-extension-1.3.0.jar
  1879325  11-16-2026 15:04   lib/net.java.dev.jna-jna-5.13.0.jar
  2735878  11-16-2026 15:04   lib/net.java.dev.jna-jna-platform-5.6.0.jar
   283367  11-16-2026 15:04   lib/com.google.code.gson-gson-2.10.1.jar
    62589  11-16-2026 15:04   lib/org.jboss.shrinkwrap-shrinkwrap-api-1.0.1.jar
  1350624  11-16-2026 15:04   lib/org.freemarker-freemarker-2.3.23.jar
   521157  11-16-2026 15:04   lib/javax.mail-mail-1.4.7.jar
    62983  11-16-2026 15:04   lib/javax.activation-activation-1.1.jar
   233859  11-16-2026 15:04   lib/commons-beanutils-commons-beanutils-1.9.2.jar
   334352  11-16-2026 15:04   lib/org.yaml-snakeyaml-2.2.jar
    64579  11-16-2026 15:04   lib/org.slf4j-slf4j-api-2.0.9.jar
   782603  11-16-2026 15:04   lib/com.squareup.okhttp3-okhttp-4.10.0.jar
   350780  11-16-2026 15:04   lib/com.squareup.okio-okio-jvm-3.0.0.jar
    16121  11-16-2026 15:04   lib/org.jetbrains.kotlin-kotlin-stdlib-jdk8-1.5.31.jar
    22986  11-16-2026 15:04   lib/org.jetbrains.kotlin-kotlin-stdlib-jdk7-1.5.31.jar
   198322  11-16-2026 15:04   lib/org.jetbrains.kotlin-kotlin-stdlib-common-1.5.31.jar
  1509405  11-16-2026 15:04   lib/org.jetbrains.kotlin-kotlin-stdlib-1.6.20.jar
    17536  11-16-2026 15:04   lib/org.jetbrains-annotations-13.0.jar
   196768  11-16-2026 15:04   lib/commons-digester-commons-digester-2.1.jar
    60686  11-16-2026 15:04   lib/commons-logging-commons-logging-1.1.1.jar
   330246  11-16-2026 15:04   lib/org.jfree-jcommon-1.0.23.jar
 11289823  11-16-2026 15:04   lib/com.ibm.icu-icu4j-57.1.jar
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]# unzip -p gec-ear.ear META-INF/jboss-deployment-structure.xml 2>/dev/null
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
                <!-- This corresponds to the module for a web deployment -->
                <!-- it can use all the same tags as the <deployment> entry above <dependencies>
                        <module name="deployment.emp-ear.ear.emp-ejb-0.0.1-SNAPSHOT.jar" /> </dependencies> -->
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
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]# unzip -p gec-ear.ear gec-web.war 2>/dev/null > /tmp/gec-web.war && unzip -l /tmp/gec-web.war | grep -iE "jboss-deployment-structure|jboss-web.xml|WEB-INF/lib/.*(sisgd|framework)"
      105  11-16-2026 15:02   WEB-INF/jboss-web.xml
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
