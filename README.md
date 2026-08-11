Identificamos e corrigimos um problema que estava causando falha no deploy do siifx-caixinhas-api-aplicacao-des (crash no boot da aplicação por timeout no rollout).

Causa raiz: conflito de versão do snakeyaml. A dependência javafaker (usada em SaldoDataGeneratorService.java) trazia transitivamente uma versão antiga do snakeyaml (~1.23), incompatível com o método exigido pelo smallrye-openapi (LoaderOptions.setCodePointLimit), causando NoSuchMethodError no startup do Quarkus.

Ajustes aplicados no pom.xml:

Exclusão do snakeyaml transitivo dentro da dependência javafaker.
Declaração direta do snakeyaml na versão 2.2, compatível com o smallrye-openapi gerenciado pelo Quarkus BOM 3.33.2.1.

Os ajustes já foram testados e validados na branch cesti_test — build passou e o pod subiu saudável (Running/Ready).

Poderia avaliar as alterações no pom.xml dessa branch e, estando de acordo, aplicar/mergear na branch principal?

Qualquer dúvida, fico à disposição.

Obrigado!
