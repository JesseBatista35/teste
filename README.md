Prezados,

Realizamos a análise preliminar do artefato sifec-ccr-parametros.ear. A aplicação é Java EE 6, compilada em Java 8, composta por 1 módulo EJB e 2 WARs (web e api).

Cenário 1 – EAP 7.x com Java 8: esforço moderado. Os principais ajustes são: remoção de bibliotecas que o EAP 7 já fornece (JPA/Validation/JTA/Jackson), adequação ao Hibernate 5 (geração de IDs e cache L2 com Ehcache), migração do JAX-RS 1.1 para 2.x no módulo api e remoção de dependências de teste (Cucumber) empacotadas em runtime.

Cenário 2 – EAP 7.4 com Java 17: inclui todos os ajustes do cenário 1 e adiciona upgrades obrigatórios de bibliotecas incompatíveis com Java 17 (Hibernate/Javassist, JasperReports/ECJ, Keycloak, BouncyCastle, entre outras), além da validação das bibliotecas corporativas (arqref, seguranca-sso-inside). O esforço e o risco são significativamente maiores.

Dependências externas ao EAR: o pacote depende de deployments existentes no servidor atual (wmq.jmsra.rar e framework.jar) e de módulos do JBoss (org.joda.time, org.codehaus.jackson), que também precisarão ser providos no ambiente de destino. Para a etapa de migração, solicitamos informar o servidor/ambiente onde a aplicação roda hoje e a versão atual do JBoss.

Observação: o MTA não está disponível no ambiente da equipe. A análise acima foi feita por inspeção do artefato. Caso o relatório formal do MTA seja requisito, será necessário providenciar a ferramenta.
