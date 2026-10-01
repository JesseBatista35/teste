Projeto 1: SIFEC-CCR-PARAMETROS-EAP7-JDK8
Projects → Create project
Name: SIFEC-CCR-PARAMETROS-EAP7-JDK8
Description: REQ000146319054 - Cenário 1: JBoss EAP 7 mantendo Java 8
Add applications: upload do sifec-ccr-parametros.ear.
Set transformation target: só o card JBoss EAP 7. OpenJDK fica desmarcado.
Select packages: só br.
Custom rules / Custom labels: clique em Next.
Options:
Target: eap7
Source: eap6
Export CSV ligado
Review → Save and run
Projeto 2: SIFEC-CCR-PARAMETROS-EAP7-JDK17
Name: SIFEC-CCR-PARAMETROS-EAP7-JDK17
Description: REQ000146319054 - Cenário 2: JBoss EAP 7 com Java 17
Upload do mesmo sifec-ccr-parametros.ear.
Targets: card JBoss EAP 7 + card OpenJDK.
Packages: só br.
Options, onde estava o erro da vez anterior:
Target: eap7 + openjdk11 + openjdk17
Source: eap6 + openjdk (o genérico, não o openjdk11)
Export CSV ligado
Review → Save and run

Para conferir: na aba Logs, a primeira linha [0/XXXX] do JDK17 tem que mostrar um número maior que o do JDK8. Se mostrar o mesmo, os targets de Java não entraram.

Os dois podem rodar em paralelo. Quando terminarem, cole aqui os dois CSVs, como fez com o SIFEC-CCR. Eu comparo e monto o texto da REQ.

O que deve aparecer, pela análise manual de ontem:

Cenário 1: Hibernate 4.1.1 embutido, JNDI na arqref, persistence.xml (dialeto e cache Ehcache), MANIFEST com wmq.jmsra.rar e framework.jar, e jsr311/JAX-RS 1.1 no api.war.
Cenário 2: itens a mais de javax.annotation/activation e possivelmente Lombok.

Lembre que o resultado deve ser menor que o do SIFEC-CCR, porque essa aplicação tem bem menos integrações embutidas.
