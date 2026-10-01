Prezados,

Foram executadas no MTR (Migration Toolkit for Runtimes) duas análises do artefato SIFEC-CCR.ear (origem: JBoss EAP 6 / Java 8). Os relatórios seguem anexos.

Cenário 1 – JBoss EAP 7 mantendo Java 8: 38 incidentes obrigatórios (54 story points). Principais pontos:

bibliotecas Hibernate embutidas no EAR (remover e usar o módulo do EAP 7, ou manter embutidas com configuração específica);
lookups JNDI e InitialContext proprietário, majoritariamente nas bibliotecas corporativas (arqref-core, arqref-services, componentes convenente-dataprev);
ajuste de dialeto Oracle no persistence.xml (Hibernate 5.3);
revisão do MANIFEST.MF e do jboss-deployment-structure.xml.

Como opcional, recomenda-se teste de regressão das 30 chaves compostas (@Embeddable) devido à mudança de comportamento no Hibernate 5.

Cenário 2 – JBoss EAP 7 com Java 17: 50 incidentes obrigatórios (68 story points). Inclui todos os itens do cenário 1, mais:

Lombok incompatível com Java 17 (lib srcc-rest), com upgrade necessário;
uso de javax.annotation e javax.activation, removidos do JDK 11+ (11 ocorrências; no EAP 7 essas APIs são fornecidas pelo servidor);
6 pontos de atenção por mudança na hierarquia de ClassLoader (framework.jar, arqref-core e módulos da aplicação).

Observação importante: a análise considerou o código da aplicação e das bibliotecas corporativas (pacote br). As bibliotecas de terceiros embutidas no EAR (Hibernate/Javassist, Jersey, Jackson 1.x, JasperReports, iText, PDFBox, Guava, entre outras) estão em versões antigas e, no cenário Java 17, provavelmente exigirão atualização de versão. Esse esforço não é quantificado pelo MTR e representa o principal risco adicional do cenário 2.

Conclusão: pelo MTR, o cenário 2 acrescenta cerca de 26% de esforço obrigatório (+14 story points) em relação ao cenário 1. Considerando a atualização das bibliotecas de terceiros, o cenário 2 tem complexidade e risco sensivelmente maiores. A compatibilidade das bibliotecas corporativas (arqref, framework.jar, componentes SIFEC) com o EAP 7 e com o Java 17 deve ser validada junto às equipes responsáveis.
