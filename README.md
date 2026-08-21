Assunto: Encerramento de WO — sirmc-api-registro-interacoes-clientes-des — Falha de sincronização ArgoCD

Aplicação: sirmc-api-registro-interacoes-clientes-des
Ambiente: DES
Cluster: aks-crm-nprd

Causa raiz identificada:
Divergência entre os nomes dos secrets referenciados no values.yaml (chart caixa-base-chart) e os nomes reais dos objetos AzureKeyVaultSecret provisionados no Key Vault kv-crm-nprd, causando falha de injeção de variáveis de ambiente (CreateContainerConfigError / CrashLoopBackOff).

Correções aplicadas:

Removido secretRefs obsoleto apontando para secret inexistente akvs-sirmc-sqlserver-connectionstring (sem manifesto correspondente).
Corrigido nome do secret de Application Insights na variável ApplicationInsights__ConnectionString: de akvs-applicationinsightsconnectionstring (incorreto/sem hífen) para akvs-shared-applicationinsights-connectionstring (nome real do objeto no Key Vault).

Validação:
Após commit e resincronização automática via ArgoCD (revisão fe6c02e), os três secrets passaram a ser injetados corretamente (Database__UserId, Database__Password, ApplicationInsights__ConnectionString). Aplicação .NET iniciou normalmente, pod em estado Running 1/1, App Health: Healthy, Sync Status: Synced.

Status desta WO: Encerrada — escopo da esteira DevOps concluído.

Pendência identificada — fora do escopo da esteira:
Healthcheck /healthz reporta falha no componente "database" com TaskCanceledException (timeout), indicando problema de conectividade de rede entre o AKS e o SQL Server — não é falha de credencial (já validada).

Health check "database" with status Unhealthy completed after 898ms
System.Threading.Tasks.TaskCanceledException: A task was canceled.
   at Microsoft.Extensions.Diagnostics.HealthChecks.DefaultHealthCheckService.CheckHealthAsync

Ação necessária pelo demandante:
Abrir chamado com a equipe CETEL (rede), informando:

Origem: Cluster AKS aks-crm-nprd — VNet Brazil South, resource group rg-crm-nprd
Destino: SQL Server utilizado pela aplicação SIRMC (hostname/instância e porta — a confirmar pelo demandante/time de aplicação)
Sintoma: Timeout de conexão no healthcheck de banco de dados; credenciais já validadas e descartadas como causa
Verificações solicitadas à CETEL:
Regra de firewall/NSG liberando a porta do SQL Server entre a subnet do AKS e a rede de destino
Peering de VNet ativo entre as duas redes
Resolução DNS do hostname do SQL Server a partir da subnet do AKS
Disponibilidade da instância SQL Server no ambiente DES
