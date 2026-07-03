<img width="1597" height="700" alt="image" src="https://github.com/user-attachments/assets/fc1d300e-a14a-4c12-a8bc-fbadd8fa5baf" />


outro analista me mandou isso aqui;


Agora apareceu a evidência mais importante de toda a investigação:
 
10:02:42,019 ERROR [io.undertow.request]
UT005023: Exception handling request to /siarg/index:
 
java.lang.IllegalArgumentException:
Either HTTP 500 or java.lang.Throwable error page is required in web.xml or web-fragment.xml. Neither was found.
 
at org.omnifaces.filter.FacesExceptionFilter.doFilter(FacesExceptionFilter.java:118)
 
Até agora estávamos vendo apenas o erro ao renderizar a página 404. Neste trecho aparece o erro original vindo do próprio OmniFaces.
Conclusão técnica
O problema não parece estar em:
login.xhtml
index.xhtml
páginas de erro
WAR gerado
deploy incompleto
Porque tudo isso foi validado.
O problema está no fato de que o OmniFaces 3.14 não está enxergando nenhuma configuração de error-page durante a execução.
Apesar de existirem no web.xml, o OmniFaces entende que elas não existem.
Hipótese mais provável
Existe algum conflito entre:
 
OmniFaces 3.14
JSF 2.3
Wildfly/Undertow
 
e a configuração de tratamento de exceções.
Observe que seu web.xml possui:
 
<error-page>
    <error-code>500</error-code>
    <location>/WEB-INF/errorpages/500.xhtml</location>
</error-page>
 
Mas NÃO possui:
 
<error-page>
    <exception-type>java.lang.Throwable</exception-type>
    <location>/WEB-INF/errorpages/500.xhtml</location>
</error-page>
 
E o texto do OmniFaces é bem específico:
Either HTTP 500 or java.lang.Throwable error page is required
Ele deveria aceitar o 500, mas aparentemente não está encontrando-o.
Primeira correção que eu faria
Adicionar no web.xml:
 
<error-page>
    <exception-type>java.lang.Throwable</exception-type>
    <location>/WEB-INF/errorpages/500.xhtml</location>
</error-page>
 
Ficando:
 
<error-page>
    <error-code>500</error-code>
    <location>/WEB-INF/errorpages/500.xhtml</location>
</error-page>
 
<error-page>
    <exception-type>java.lang.Throwable</exception-type>
    <location>/WEB-INF/errorpages/500.xhtml</location>
</error-page>
 
Segundo ponto
O fato de aparecer:
GET /siarg/WEB-INF/errorpages/bug.xhtml
é um forte indicativo de que já existe alguma exceção sendo disparada e o OmniFaces está tentando redirecionar para:
 
<exception-type>java.lang.RuntimeException</exception-type>
<location>/WEB-INF/errorpages/bug.xhtml</location>
``
 
mas falha antes disso.
O que responder no chamado
Foram realizadas validações do artefato implantado e verificou-se que o WAR contém corretamente as páginas 404.xhtml, 500.xhtml, bug.xhtml e o respectivo mapeamento HTTP 500 no web.xml.
A análise dos logs indica que a exceção está sendo lançada pelo componente org.omnifaces.exceptionhandler.FullAjaxExceptionHandler (OmniFaces 3.14), que não está reconhecendo os tratamentos de erro configurados no web.xml, apesar de eles existirem no artefato publicado.
Como consequência, qualquer exceção gerada pela aplicação é interceptada pelo OmniFaces e resulta no erro:
Either HTTP 500 or java.lang.Throwable error page is required
Recomenda-se incluir explicitamente o mapeamento:
 
<error-page>
    <exception-type>java.lang.Throwable</exception-type>
    <location>/WEB-INF/errorpages/500.xhtml</location>
</error-page>
 
e realizar nova publicação para validação. Há indícios também de que uma exceção de aplicação está ocorrendo anteriormente e sendo mascarada pelo mecanismo de tratamento de exceções do OmniFaces, impedindo a identificação da causa raiz pelo log atual.



 a questao que fica é sera se nao estamos perdnedo tempo e relamente eles precisar testar o codigo deles testar a apalicação localmente?
