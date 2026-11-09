1. A versão do framework. Coloquei 2.0.1, mas o jar do servidor se chama 2.0.1-des. Confira no 471:

unzip -p /tmp/framework-2.0.1-des.jar META-INF/maven/br.gov.caixa/framework/pom.properties

Se aparecer version=2.0.1-des (ou outra), troque a <version> no pom. Vale também conferir se essa versão existe no Nexus (binario.caixa), senão o build falha ao baixar.

2. O siemp-web/pom.xml precisa manter o framework como <scope>provided</scope>, para não sair duplicado dentro do WAR. O Denilson disse que já está assim.

Depois do build da branch:

tar -tf siemp.ear | findstr /i "framework MANIFEST"

O esperado é aparecer lib/framework-2.0.1.jar (ou o nome com a versão certa). Depois é deploy pela esteira e acompanhar no 2864:

sudo tail -f /logs/jboss/jboss-eap/standalone/siemp-java-web/server.log | grep -E "WFLYSRV0010|WFLYSRV0025|WFLYSRV0026|WFLYCTL0013|ERROR|ClassNotFound|NoClassDefFound"

O esperado é WFLYSRV0010 ... siemp-ear.ear e WFLYSRV0025 ... started sem “com erros”. Se aparecer erro de datasource/JNDI, é o próximo item (datasources do SIEMP no standalone-full-ha.xml), como comentei antes.

Pom
