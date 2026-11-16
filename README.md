Michael, fizemos o deploy da 3.55.51.03 às 14:47. O ajuste do entityManagerFactory funcionou. O deploy agora parou em outro ponto de CDI:

WELD-001408: Unsatisfied dependencies for type SiricXMLIntegracaoNegocio, injetado em br.gov.caixa.sirur.service.impl.SiricServiceImpl.siricNegocio

O EJB SiricXMLIntegracaoNegocioImpl está subindo, mas se registra apenas pela própria classe (java:module/SiricXMLIntegracaoNegocioImpl!...SiricXMLIntegracaoNegocioImpl). Ele não expõe a interface SiricXMLIntegracaoNegocio, por isso o CDI não acha o bean para injetar.

Ajuste: incluir implements SiricXMLIntegracaoNegocio na classe ou anotar com @Local(SiricXMLIntegracaoNegocio.class). Vale verificar se outros EJBs do projeto seguem o mesmo padrão (implementação sem expor a interface), para corrigirmos de uma vez.

Assim que gerar a nova versão, fazemos o deploy.
