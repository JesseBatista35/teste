Verificar  o ambiente do simpg-monolito em DES pois não está realizando deploy na VM: caddeapllx1945.agil.nprd.caixa.gov.br

A pipeline/release é a seguinte: https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=486099

O único erro que identifiquei é o abaixo quando ele tenta mapear o JDBC, mas, os arquivos e arquivos de configuração estão no local esperado.

2026-06-16 11:47:09,927 ERROR [org.jboss.as.controller.management-operation] (pool-4-thread-1) WFLYCTL0013: Falha na operação ("list-resource-loader-paths") - endereço ([("core-service" => "module-loading")]) - falha na descrição: "org.postgresql"

