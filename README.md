Fechamento do chamado – SIARG DES – Erro 500 em /siarg/login
Causa raiz identificada:
O web.xml da aplicação possuía o mapeamento de error-page apenas por error-code:
<error-page>
    <error-code>500</error-code>
    <location>/WEB-INF/errorpages/500.xhtml</location>
</error-page>
O OmniFaces 3.14 (componente FullAjaxExceptionHandler), na stack JSF 2.3 / Undertow em uso, não reconhece esse mapeamento apenas por error-code, exigindo declaração explícita por exception-type. Como consequência, qualquer exceção lançada pela aplicação era interceptada pelo próprio mecanismo de tratamento de erro do OmniFaces e resultava em falha secundária:
java.lang.IllegalArgumentException: Either HTTP 500 or java.lang.Throwable error page is required in web.xml or web-fragment.xml. Neither was found.
at org.omnifaces.exceptionhandler.FullAjaxExceptionHandler.handleAjaxException(FullAjaxExceptionHandler.java:414)
Isso mascarava completamente a causa original e retornava HTTP 500 genérico em qualquer navegação, incluindo /siarg/login e /siarg/index.
Correção aplicada e validada:
Foi criada a branch de teste Cesti-teste001 com a inclusão do seguinte mapeamento no web.xml:
<error-page>
    <exception-type>java.lang.Throwable</exception-type>
    <location>/WEB-INF/errorpages/500.xhtml</location>
</error-page>
Build gerado a partir dessa branch, deploy realizado em DES e validado com sucesso: /siarg/login retornando HTTP 200, página de login renderizando normalmente com todos os recursos (CSS, JS, imagens), versão 2.0.0.5 confirmada no rodapé.
Próximos passos para o time de desenvolvimento:
Validar a alteração feita na branch Cesti-teste001 e aplicar o mesmo ajuste na branch principal do projeto, para que a correção seja incorporada ao fluxo normal de build e não fique restrita à branch de teste.
Encerrando com análise concluída.
