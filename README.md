Conclusão da Configuração — Application Insights / SISAG-PROV (DES)
Servidor: sspdeapllx0041
Módulo: SISAG-provisionamento-saque-backend
Instância JBoss: sisag-lx0041
Atividades realizadas:
Foi identificado que o ambiente opera em modo JBoss Domain, onde os parâmetros de JVM são controlados pelo domain.xml no servidor master (sspdeapllx0040) e pelo host.xml no servidor slave (sspdeapllx0041), e não via standalone.conf como em ambientes standalone.
As seguintes configurações foram aplicadas:

host.xml (sspdeapllx0041) — adicionado bloco <jvm> com environment-variables para o servidor sisag-lx0041, incluindo a variável APPLICATIONINSIGHTS_ROLE_INSTANCE.
domain.xml (sspdeapllx0040) — adicionadas jvm-options no server-group do grupo sisag com os parâmetros:

-javaagent:/opt/azure/config/appinsights/applicationinsights-agent.jar
-Dapplicationinsights.configuration.file=/opt/azure/config/appinsights/applicationinsights.json
Configurações de proxy (proxydes.caixa:80) e nonProxyHosts


applicationinsights.json — atualizado com connectionString, role.name e sampling percentage: 100 referentes ao ambiente DES do SISAG-PROV.
Reinicialização — o host-controller foi reiniciado para aplicar as novas jvm-options do domain.xml, e o servidor sisag-lx0041 subiu corretamente com o parâmetro -javaagent ativo, confirmado via ps -ef.

Evidência:
O agente Application Insights 3.3.1 iniciou com sucesso (PID 3717) conforme log em /opt/azure/config/appinsights/applicationinsights.log:
ApplicationInsights Java Agent 3.3.1 started successfully (PID 3717)
O processo sisag-lx0041 confirmado rodando com -javaagent ativo via ps -ef.
Observação: O arquivo applicationinsights.json e o agente .jar em /opt/azure/config/appinsights/ são compartilhados entre os módulos do host. Alterações nesse arquivo impactam todos os servidores que utilizam o mesmo agente. Recomenda-se avaliar a criação de um arquivo JSON exclusivo para o SISAG-PROV em demandas futuras.
Status: Configuração concluída e validada em DES. ✅
