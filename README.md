Prezados,
Estamos com falha na pipeline SIMPF-frontend no Azure DevOps (projeto Caixa/SIMPF), na etapa de Get sources, ao tentar realizar checkout do repositório caixagithub/SIMPF-frontend hospedado no GitHub Enterprise.
O erro retornado no fetch é o seguinte:
remote: Your account is suspended. Please visit https://support.github.com for more information.
fatal: unable to access 'https://github.com/caixagithub/SIMPF-frontend.git/': The requested URL returned error: 403
O erro indica que a conta de serviço utilizada pela Service Connection do Azure DevOps para autenticação no GitHub Enterprise está suspensa, impedindo qualquer operação de fetch no repositório.
Solicito verificação do status dessa conta de serviço e a reativação, para que as pipelines que dependem desse repositório voltem a funcionar.
Repositório: caixagithub/SIMPF-frontend
Pipeline: SIMPF-frontend (Azure DevOps)
Service Connection: SIMPF-frontend
Fico à disposição para mais informações.
