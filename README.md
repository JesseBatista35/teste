Pessoal, atualização do LCR (sifec_lcr_1.117.1): o pacote da planilha foi implantado no JBoss 7.4 às 14:59, mas o deploy foi revertido por erros de CDI no código. O ambiente não tem pendência para o LCR.

1. Nove DAOs não são reconhecidos como beans CDI (WELD-001408):
SirmcDao, MatrizIndexadoresDao, AliquotasIofDao, ConformidadeDao, FuncionalidadeEspecialDao, ParametrosProdutoCanalDao, DadosSICLIDao e AmortizacaoDao.
Ajuste: garantir que o jar com as implementações tenha META-INF/beans.xml com bean-discovery-mode="all", ou anotar as implementações com @Stateless, @ApplicationScoped ou @Dependent.

2. SecurityInterceptor não é carregado (WELD-000119): a classe br.gov.caixa.lcr.core.security.SecurityInterceptor usa org.jboss.resteasy.core.ResourceMethod, que é do RESTEasy 2 e foi removida no JBoss 7.4. É preciso migrar para ContainerRequestFilter com ResourceInfo; sem isso, o interceptor de segurança não atua.
