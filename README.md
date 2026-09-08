oot@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]# /opt/jboss-eap/standalone/deployments/siarg.war
bash: /opt/jboss-eap/standalone/deployments/siarg.war: impossível executar o arquivo binário: Erro no formato exec
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]# unzip -p /opt/jboss-eap/standalone/deployments/siarg.war WEB-INF/web.xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xmlns="http://java.sun.com/xml/ns/javaee"
        xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd"
        metadata-complete="false" version="3.0">
        <display-name>SIARG</display-name>
        <context-param>
                <param-name>javax.faces.PROJECT_STAGE</param-name>
                <param-value>Development</param-value>
        </context-param>
        <context-param>
                <param-name>javax.faces.FACELETS_BUFFER_SIZE</param-name>
                <param-value>65535</param-value>
        </context-param>
        <context-param>
                <param-name>javax.faces.FACELETS_REFRESH_PERIOD</param-name>
                <param-value>0</param-value>
        </context-param>
        <context-param>
                <param-name>javax.faces.FACELETS_SKIP_COMMENTS</param-name>
                <param-value>true</param-value>
        </context-param>
        <context-param>
                <param-name>javax.faces.INTERPRET_EMPTY_STRING_SUBMITTED_VALUES_AS_NULL</param-name>
                <param-value>true</param-value>
        </context-param>
        <context-param>
                <param-name>javax.faces.STATE_SAVING_METHOD</param-name>
                <param-value>client</param-value>
        </context-param>
        <context-param>
                <param-name>com.sun.faces.defaultResourceMaxAge</param-name>
                <param-value>3628800000</param-value>
        </context-param>
        <context-param>
                <param-name>org.omnifaces.FACES_VIEWS_SCAN_PATHS</param-name>
                <param-value>/*.xhtml</param-value>
        </context-param>
        <context-param>
                <param-name>javax.faces.DATETIMECONVERTER_DEFAULT_TIMEZONE_IS_SYSTEM_TIMEZONE</param-name>
                <param-value>true</param-value>
        </context-param>

        <mime-mapping>
                <extension>zip</extension>
                <mime-type>application/zip</mime-type>
        </mime-mapping>

        <context-param>
                <param-name>primefaces.THEME</param-name>
                <param-value>none</param-value>
        </context-param>

        <listener>
                <listener-class>br.gov.caixa.gitecsa.arquitetura.listener.MyServletContextListener</listener-class>
        </listener>
        <session-config>
                <session-timeout>30</session-timeout>
        </session-config>
        <welcome-file-list>
                <welcome-file>index.xhtml</welcome-file>
        </welcome-file-list>
        <error-page>
                <error-code>500</error-code>
                <location>/WEB-INF/errorpages/500.xhtml</location>
        </error-page>
        <error-page>
                <error-code>404</error-code>
                <location>/WEB-INF/errorpages/404.xhtml</location>
        </error-page>
        <error-page>
                <exception-type>java.lang.Throwable</exception-type>
                <location>/WEB-INF/errorpages/500.xhtml</location>
        </error-page>
        <error-page>
                <exception-type>javax.faces.application.ViewExpiredException</exception-type>
                <location>/login.xhtml?faces-redirect=true</location>
        </error-page>
        <error-page>
                <exception-type>java.sql.SQLException</exception-type>
                <location>/WEB-INF/errorpages/database.xhtml</location>
        </error-page>
        <error-page>
                <exception-type>java.lang.RuntimeException</exception-type>
                <location>/WEB-INF/errorpages/bug.xhtml</location>
        </error-page>
        <servlet>
                <servlet-name>facesServlet</servlet-name>
                <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
                <load-on-startup>1</load-on-startup>
        </servlet>
        <servlet-mapping>
                <servlet-name>facesServlet</servlet-name>
                <url-pattern>*.xhtml</url-pattern>
        </servlet-mapping>
        <filter>
                <filter-name>facesExceptionFilter</filter-name>
                <filter-class>org.omnifaces.filter.FacesExceptionFilter</filter-class>
        </filter>
        <filter>
                <filter-name>characterEncodingFilter</filter-name>
                <filter-class>org.omnifaces.filter.CharacterEncodingFilter</filter-class>
        </filter>
        <filter-mapping>
                <filter-name>facesExceptionFilter</filter-name>
                <servlet-name>facesServlet</servlet-name>
        </filter-mapping>
        <filter-mapping>
                <filter-name>characterEncodingFilter</filter-name>
                <url-pattern>/*</url-pattern>
        </filter-mapping>
        <filter>
                <filter-name>NoCacheFilter</filter-name>
                <filter-class>br.gov.caixa.gitecsa.arquitetura.filter.NoCacheFilter</filter-class>
        </filter>
        <filter-mapping>
                <filter-name>NoCacheFilter</filter-name>
                <url-pattern>/*</url-pattern>
        </filter-mapping>
        <filter>
                <filter-name>PrimeFaces FileUpload Filter</filter-name>
                <filter-class>org.primefaces.webapp.filter.FileUploadFilter</filter-class>
        </filter>
        <filter-mapping>
                <filter-name>PrimeFaces FileUpload Filter</filter-name>
                <servlet-name>facesServlet</servlet-name>
        </filter-mapping>
        <filter>
            <filter-name>RateLimitFilter</filter-name>
            <filter-class>br.gov.caixa.gitecsa.arquitetura.filter.RateLimitFilter</filter-class>
        </filter>
        <filter-mapping>
            <filter-name>RateLimitFilter</filter-name>
            <url-pattern>/*</url-pattern>
        </filter-mapping>
</web-app>[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]# jar xf /opt/jboss-eap/standalone/deployments/siarg.war WEB-INF/web.xml -C /tmp/
Uso: jar {ctxui}[vfmn0Mek] [jar-file] [manifest-file] [entry-point] [-C dir] arquivos ...
Opções:
    -c  cria novo arquivo compactado
    -t  lista o sumário do arquivo compactado
    -x  extrai arquivos com o nome (ou todos) do arquivo compactado
    -u  atualiza o arquivo compactado existente
    -v  gera saída detalhada na saída padrão
    -f  especifica o nome do arquivo do arquivo compactado
    -m  inclui as informações do manifesto do arquivo de manifesto especificado
    -n   executa a normalização Pack200 após a criação de um novo arquivo compactado
    -e  especifica o ponto de entrada da aplicativo para aplicativo stand-alone
        empacotada em um arquivo jar executável
    -0  armazena somente; não usa compactação ZIP
    -P  preserva os componentes '/' inicial (caminho absoluto) e ".." (diretório pai) nos nomes dos arquivos
    -M  não cria um arquivo de manifesto para as entradas
    -i  gera informações de índice para os arquivos especificados
    -C  passa para o diretório especificado e inclui o arquivo a seguir
Se um arquivo também for um diretório, ele será processado repetidamente.
O nome do arquivo de manifesto, o nome do arquivo compactado e o nome do ponto de entrada são
especificados na mesma ordem dos flags 'm', 'f' e 'e'.

Exemplo 1: para arquivar dois arquivos de classe em um arquivo compactado denominado classes.jar:
       jar cvf classes.jar Foo.class Bar.class
Exemplo 2: use um arquivo de manifesto existente 'mymanifest' e arquive todos os
           arquivos no diretório foo/ na 'classes.jar':
       jar cvfm classes.jar mymanifest -C foo/ .

[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]# cat /tmp/WEB-INF/web.xml
cat: /tmp/WEB-INF/web.xml: Arquivo ou diretório inexistente
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]# cd /tmp && cp /opt/jboss-eap/standalone/deployments/siarg.war . && unzip -o siarg.war -d siarg-extracted WEB-INF/web.xml WEB-INF/faces-config.xml 2>/dev/null
Archive:  siarg.war
  inflating: siarg-extracted/WEB-INF/faces-config.xml
  inflating: siarg-extracted/WEB-INF/web.xml
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]# cat /tmp/siarg-extracted/WEB-INF/web.xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xmlns="http://java.sun.com/xml/ns/javaee"
        xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd"
        metadata-complete="false" version="3.0">
        <display-name>SIARG</display-name>
        <context-param>
                <param-name>javax.faces.PROJECT_STAGE</param-name>
                <param-value>Development</param-value>
        </context-param>
        <context-param>
                <param-name>javax.faces.FACELETS_BUFFER_SIZE</param-name>
                <param-value>65535</param-value>
        </context-param>
        <context-param>
                <param-name>javax.faces.FACELETS_REFRESH_PERIOD</param-name>
                <param-value>0</param-value>
        </context-param>
        <context-param>
                <param-name>javax.faces.FACELETS_SKIP_COMMENTS</param-name>
                <param-value>true</param-value>
        </context-param>
        <context-param>
                <param-name>javax.faces.INTERPRET_EMPTY_STRING_SUBMITTED_VALUES_AS_NULL</param-name>
                <param-value>true</param-value>
        </context-param>
        <context-param>
                <param-name>javax.faces.STATE_SAVING_METHOD</param-name>
                <param-value>client</param-value>
        </context-param>
        <context-param>
                <param-name>com.sun.faces.defaultResourceMaxAge</param-name>
                <param-value>3628800000</param-value>
        </context-param>
        <context-param>
                <param-name>org.omnifaces.FACES_VIEWS_SCAN_PATHS</param-name>
                <param-value>/*.xhtml</param-value>
        </context-param>
        <context-param>
                <param-name>javax.faces.DATETIMECONVERTER_DEFAULT_TIMEZONE_IS_SYSTEM_TIMEZONE</param-name>
                <param-value>true</param-value>
        </context-param>

        <mime-mapping>
                <extension>zip</extension>
                <mime-type>application/zip</mime-type>
        </mime-mapping>

        <context-param>
                <param-name>primefaces.THEME</param-name>
                <param-value>none</param-value>
        </context-param>

        <listener>
                <listener-class>br.gov.caixa.gitecsa.arquitetura.listener.MyServletContextListener</listener-class>
        </listener>
        <session-config>
                <session-timeout>30</session-timeout>
        </session-config>
        <welcome-file-list>
                <welcome-file>index.xhtml</welcome-file>
        </welcome-file-list>
        <error-page>
                <error-code>500</error-code>
                <location>/WEB-INF/errorpages/500.xhtml</location>
        </error-page>
        <error-page>
                <error-code>404</error-code>
                <location>/WEB-INF/errorpages/404.xhtml</location>
        </error-page>
        <error-page>
                <exception-type>java.lang.Throwable</exception-type>
                <location>/WEB-INF/errorpages/500.xhtml</location>
        </error-page>
        <error-page>
                <exception-type>javax.faces.application.ViewExpiredException</exception-type>
                <location>/login.xhtml?faces-redirect=true</location>
        </error-page>
        <error-page>
                <exception-type>java.sql.SQLException</exception-type>
                <location>/WEB-INF/errorpages/database.xhtml</location>
        </error-page>
        <error-page>
                <exception-type>java.lang.RuntimeException</exception-type>
                <location>/WEB-INF/errorpages/bug.xhtml</location>
        </error-page>
        <servlet>
                <servlet-name>facesServlet</servlet-name>
                <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
                <load-on-startup>1</load-on-startup>
        </servlet>
        <servlet-mapping>
                <servlet-name>facesServlet</servlet-name>
                <url-pattern>*.xhtml</url-pattern>
        </servlet-mapping>
        <filter>
                <filter-name>facesExceptionFilter</filter-name>
                <filter-class>org.omnifaces.filter.FacesExceptionFilter</filter-class>
        </filter>
        <filter>
                <filter-name>characterEncodingFilter</filter-name>
                <filter-class>org.omnifaces.filter.CharacterEncodingFilter</filter-class>
        </filter>
        <filter-mapping>
                <filter-name>facesExceptionFilter</filter-name>
                <servlet-name>facesServlet</servlet-name>
        </filter-mapping>
        <filter-mapping>
                <filter-name>characterEncodingFilter</filter-name>
                <url-pattern>/*</url-pattern>
        </filter-mapping>
        <filter>
                <filter-name>NoCacheFilter</filter-name>
                <filter-class>br.gov.caixa.gitecsa.arquitetura.filter.NoCacheFilter</filter-class>
        </filter>
        <filter-mapping>
                <filter-name>NoCacheFilter</filter-name>
                <url-pattern>/*</url-pattern>
        </filter-mapping>
        <filter>
                <filter-name>PrimeFaces FileUpload Filter</filter-name>
                <filter-class>org.primefaces.webapp.filter.FileUploadFilter</filter-class>
        </filter>
        <filter-mapping>
                <filter-name>PrimeFaces FileUpload Filter</filter-name>
                <servlet-name>facesServlet</servlet-name>
        </filter-mapping>
        <filter>
            <filter-name>RateLimitFilter</filter-name>
            <filter-class>br.gov.caixa.gitecsa.arquitetura.filter.RateLimitFilter</filter-class>
        </filter>
        <filter-mapping>
            <filter-name>RateLimitFilter</filter-name>
            <url-pattern>/*</url-pattern>
        </filter-mapping>
