 
Acho que finalmente conseguimos fechar um diagnóstico mais consistente do problema.
Primeiro ponto importante: o código realmente foi preparado para Java 17. O POM está configurado com:
<maven.compiler.release>17</maven.compiler.release> <maven.compiler.source>17</maven.compiler.source> <maven.compiler.target>17</maven.compiler.target>
Além disso, tem várias adequações típicas de migração para Java 17, como JAXB fora do JDK, OpenPDF substituindo iText, Jackson 2.15, Mockito 5 e uso de --add-opens nos testes.
O que encontramos é que existe um desalinhamento entre a aplicação e a configuração do servidor.
Com a imagem Java 8 (v015):
O JBoss sobe normalmente.
DB2 sobe.
WMQ sobe.
ActiveMQ sobe.
O EAR é processado.
Mas o deploy do gec-api.war falha.
O erro é:
Legacy WildFly security layer is no longer supported by the Keycloak WildFly adapter
Chegamos a decompilar a classe do próprio Keycloak 22.0.5 e ela literalmente faz:
if (Elytron.isElytronEnabled()) { ... } else { throw RuntimeException("Legacy WildFly security layer is no longer supported by the Keycloak WildFly adapter"); }
Ou seja, o Keycloak 22 está rejeitando a configuração de segurança legada.
Já com a imagem Java 17 (v012), o problema muda completamente.
O JBoss nem consegue concluir o boot porque vários serviços de segurança antiga simplesmente não existem mais:
jboss.security.jaas jboss.security.security-management jboss.security.subject-factory jboss.security.simple-security-manager
Por isso quebram todos os security-domains:
keycloak
jaas-sigec
jaas-sifec
jaas-siric
jaas-sinad
other
other2
etc.
Resumindo:
Aplicação:
preparada para Java 17 
Configuração do servidor:
ainda baseada em Security Legacy / PicketBox 
Imagem Java 8:
aceita Security Legacy
mas esbarra no Keycloak 22.0.5
Imagem Java 17:
não aceita mais os componentes legacy
e o servidor não consegue nem terminar a inicialização
Minha impressão é que estamos diante de uma migração incompleta: o código foi atualizado para Java 17, mas o standalone-full-ha.xml ainda está preso ao modelo antigo de segurança.
Agora acho que precisamos descobrir uma destas três coisas:
Se existe um standalone mais novo do SIGEC já migrado para Elytron.
Se existe uma imagem homologada específica para esse sistema.
Ou se a versão do Keycloak entregue na imagem está incompatível com a configuração que ainda existe no standalone.
Pelo menos agora temos evidências concretas e conseguimos sair do campo das hipóteses. O problema não está em DB2, WMQ, datasource ou no EAR em si. Tudo aponta para a camada de segurança (legacy x Elytron) e para a integração com o Keycloak.
 
 
Segue um resumo do que consegui levantar até agora sobre o problema do SIGEC Portabilidade.
Situação atual
O código da aplicação está claramente preparado para Java 17. O próprio POM define:
 
<maven.compiler.release>17</maven.compiler.release>
<maven.compiler.source>17</maven.compiler.source>
<maven.compiler.target>17</maven.compiler.target>
 
 
Além disso, existem várias adequações para Java 17 (JAXB fora do JDK, OpenPDF, Jackson 2.15, Mockito 5, uso de --add-opens nos testes etc.).
Testes realizados
Imagem v015 (Java 8)
JBoss sobe normalmente.
DB2 sobe.
WMQ sobe.
ActiveMQ sobe.
Datasources carregam.
EAR é processado.
Porém o deploy do gec-api.war falha com:
 
Legacy WildFly security layer is no longer supported by the Keycloak WildFly adapter
 
Inclusive decompilei a classe:
 
org.keycloak.subsystem.adapter.extension.KeycloakDependencyProcessorWildFly
 
e o código faz exatamente:
 
if (Elytron.isElytronEnabled()) {
   ...
} else {
   throw new RuntimeException(
      "Legacy WildFly security layer is no longer supported by the Keycloak WildFly adapter");
}
 
Ou seja, o próprio Keycloak 22 rejeita o modelo de segurança legado.
Também confirmei que os módulos instalados são:
 
keycloak-* 22.0.5
 
Imagem v012 (Java 17)
Nesse cenário o JBoss nem conclui o boot.
Os erros são diferentes:
 
jboss.security.jaas
jboss.security.security-management
jboss.security.subject-factory
jboss.security.simple-security-manager
 
e vários security-domains falham:
 
keycloak
jaas-sigec
jaas-sifec
jaas-siric
jaas-sinad
other
other2
 
Além disso falham dependências de:
 
ApplicationRealm
ManagementRealm
jboss.security.bootstrap
 
Ou seja, a imagem Java 17 não está disponibilizando os componentes de segurança legados esperados pelo standalone atual.
Descoberta importante
Encontrei o repositório de referência da esteira EAP 7.4 (modelo-jboss-eap-7.4-vm-config).
Comparando o standalone de referência com o standalone atual do SIGEC, há uma diferença grande na parte de segurança.
No modelo oficial:
não existe org.jboss.as.security
não existe subsystem security:2.0
não existe security-domain keycloak
não existe KeycloakLoginModule
Tudo é baseado em:
 
Elytron
ApplicationDomain
ManagementDomain
application-security-domains
http-authentication-factory
ssl-context
 
Exatamente o padrão esperado pelas versões mais novas do EAP.
Já o standalone do SIGEC continua utilizando o modelo legado:
 
security-domain
JAAS
KeycloakLoginModule
subsystem security:2.0
 
Conclusão atual
Hoje a principal evidência aponta para um desalinhamento entre:
 
Aplicação:
- preparada para Java 17
 
Configuração do servidor:
- baseada em Security Legacy/PicketBox
 
Por isso estamos vendo dois comportamentos diferentes:
Java 8
ambiente sobe
Keycloak 22 rejeita o modelo legacy
Java 17
ambiente nem sobe
vários serviços de segurança legacy não existem mais
Minha impressão neste momento é que o problema principal não está em DB2, WMQ, datasource ou EAR.
Tudo aponta para a camada de segurança, provavelmente porque estamos usando um standalone-full-ha.xml herdado de um ambiente legado, enquanto as imagens mais novas seguem o modelo Elytron da esteira oficial.
Acho que o próximo passo é comparar formalmente o standalone atual do SIGEC com o standalone de referência da esteira e identificar tudo que ainda depende de Security Legacy para entender qual deveria ser a configuração homologada para a versão Java 17 do sistema.



  OJEGFERSON MANDOU ISSO DO ONLINE ONTEM


<img width="1810" height="850" alt="image" src="https://github.com/user-attachments/assets/07fb7664-bec0-4d13-999a-a9bf46118080" />


OP BATCH RECONFIGUREI A ESTEIRA E ESTOU RODANDO A PRIMEIRA RELEASE
  
