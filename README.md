Erik, bom dia. Consolidando o que já foi levantado até aqui sobre a origem desses recursos.

Fizemos uma investigação completa do lado de infraestrutura e pipeline, e já podemos descartar essa hipótese com evidência concreta:

O WAR do SICMU (SICMU-web.war, versão 01.05.05.004, mesma publicada nos releases mais recentes) não contém esses arquivos em nenhum lugar do pacote, nem há referência a eles nos templates ou páginas xhtml do projeto.
Verificamos a pipeline de build (Maven/Nexus) e não há nenhuma task relacionada a esses arquivos.
Verificamos a pipeline de Release/deploy (Ansible, role Apache) e confirmamos que o vhost.conf do Apache não possui nenhum Alias ou DocumentRoot apontando para arquivos estáticos. Toda requisição é redirecionada via proxy AJP diretamente para o JBoss, incluindo as chamadas para esses scripts. Ou seja, o 404 recebido é gerado pela própria aplicação dentro do JBoss, não por configuração de rota ou proxy do Apache.
Existe uma pasta genérica (htdocs_httpd_eap_esteiraagil) na VM que contém um vendor.js, mas essa pasta é usada por uma role Ansible compartilhada entre múltiplos sistemas e não tem nenhuma relação com o vhost do SICMU, conforme confirmado no ponto 3.

Com isso, conseguimos descartar com segurança: pipeline de build, pipeline de deploy, configuração de Apache/proxy e empacotamento do WAR.

Como você já havia identificado que essas referências nunca existiram no código-fonte do projeto, o próximo passo que sugerimos é uma verificação no lado do frontend em tempo de execução: se há algum script de terceiros, biblioteca JS, ou funcionalidade do próprio framework (JSF/Struts) que injete essas chamadas dinamicamente, já que elas não estão em nenhum arquivo estático do projeto nem são geradas pela infraestrutura.
