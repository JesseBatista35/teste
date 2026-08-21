Assunto: Solicitação de verificação de conectividade de rede — AKS (aks-crm-nprd) → SQL Server SIRMC — Ambiente DES

Aplicação: sirmc-api-registro-interacoes-clientes-des
Ambiente: DES
Cluster de origem: aks-crm-nprd (AKS, VNet Brazil South, resource group rg-crm-nprd)
Destino: SQL Server utilizado pela aplicação SIRMC (instância referenciada nos secrets sirmc-sqlserver-transacao / sirmc-sqlserver-scrmbp01)

Descrição do problema:
A aplicação sirmc-api-registro-interacoes-clientes está em execução no cluster AKS (pod Running 1/1), com todas as credenciais de banco de dados corretamente injetadas via Azure Key Vault (usuário e senha validados). No entanto, o healthcheck interno da aplicação (endpoint /healthz) reporta falha ao testar a conectividade com o banco de dados, com a exceção TaskCanceledException (timeout) durante a chamada de health check do componente "database". A conexão está sendo cancelada por estouro de tempo, e não por erro de autenticação, o que indica bloqueio ou indisponibilidade de rede entre o pod e a instância SQL Server, e não um problema de credencial.

Evidência (log da aplicação):

Health check "database" with status Unhealthy completed after 898ms
System.Threading.Tasks.TaskCanceledException: A task was canceled.
   at Microsoft.Extensions.Diagnostics.HealthChecks.DefaultHealthCheckService.CheckHealthAsync

Solicitação:

Verificar se há regra de firewall/NSG liberando a porta 1433 (ou porta customizada, a confirmar com o time de aplicação) entre a subnet do cluster AKS aks-crm-nprd (VNet Brazil South, rg-crm-nprd) e o SQL Server de destino da aplicação SIRMC.
Confirmar se existe peering de VNet ativo entre a rede do AKS e a rede onde a instância SQL Server está hospedada.
Validar se o hostname do SQL Server está resolvendo corretamente via DNS a partir da subnet do AKS.
Confirmar se a instância SQL Server está no ar e aceitando conexões externas no ambiente DES.

Impacto: Aplicação indisponível para uso funcional em DES — pod ativo, porém sem conectividade com o banco de dados, bloqueando testes e homologação.
