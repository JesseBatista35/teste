A consulta /cliente/cnpj/{cnpj} chega normalmente à aplicação.
 
ClienteAPI não retorna null e apenas delega para ClienteFacade.
 
Não foram encontrados erros, BusinessException ou falhas de deploy.
 
Todas as consultas geram:
 
UT010024:
Response br.gov.caixa.wpj.app.filter.BufferedResponseWrapper
was not original or a wrapper
 
Origem:
br.gov.caixa.wpj.app.filter.RequestFilter.doFilter()
RequestFilter.java:99
 
Indício forte de incompatibilidade da implementação
RequestFilter/BufferedResponseWrapper com Undertow (JBoss EAP 7.4),
podendo ocasionar perda do corpo da resposta e retorno nulo ao frontend.


o jeferson disse isso aqui faz sentido?
