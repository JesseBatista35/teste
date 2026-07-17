Assunto: Escalonamento — SIHDG-JBOSS8-DES — CrashLoopBackOff persistente / incompatibilidade de módulos na imagem builder
Prezados,
A aplicação SIHDG (namespace sihdg-des, ambiente DES) está com CrashLoopBackOff persistente há mais de 24 horas, com múltiplas tentativas de deploy falhando (revisões 20 a 32 do DeploymentConfig).
Durante a investigação, identificamos e corrigimos os seguintes problemas de configuração local, dentro do nosso escopo:

O ConfigMap jboss-config-sihdg-jboss8 continha um standalone.xml customizado com o datasource sihdgDS declarado com jndi-name incorreto (apontando para java:jboss/datasources/ExampleDS em vez de java:jboss/jdbc/sihdgDS). Essa configuração divergia do arquivo correto mantido no repositório SIHDG-jboss8-config (branch jboss-8.0). Corrigimos o ConfigMap para refletir o conteúdo correto do repositório.
O volumeMount do DeploymentConfig montava esse arquivo customizado sob o nome standalone-okd.xml, mas o processo de boot do JBoss (via entrypoint padrão da imagem) sempre carrega o arquivo standalone.xml. Como resultado, o arquivo customizado nunca era efetivamente utilizado — o JBoss sempre inicializava com o standalone.xml embutido na própria imagem da aplicação.

Ao corrigir esse ponto (montando o ConfigMap corretamente como standalone.xml), o boot passou a processar nosso arquivo customizado, porém falhou com um novo erro:
WFLYCTL0083: Failed to load module org.jboss.as.ejb3
Caused by: org.jboss.modules.ModuleNotFoundException: org.jboss.as.ejb3
Isso indica que o módulo org.jboss.as.ejb3, referenciado nas extensions do standalone.xml padrão do time, não está presente na imagem base atual (build-images-ads/sihdg-jboss8, originada da imagem builder eap81-openjdk21-builder-openshift-rhel9, versão 1.0.0.GA).
Tentamos extrair o conteúdo da imagem para confirmar quais módulos estão de fato disponíveis, tanto pelo hostname interno do registry (image-registry.openshift-image-registry.svc:5000) quanto pela rota externa (default-route-openshift-image-registry.apps.produtos4.caixa), sem sucesso: o primeiro não é resolvível a partir do nosso ambiente de acesso, e o segundo retorna "unauthorized: authentication required" com as credenciais disponíveis em nosso escopo.
Diante disso, revertemos temporariamente o volumeMount do DeploymentConfig para o estado anterior, de forma que a aplicação volte a subir com o standalone.xml embutido na imagem (ainda com erro de datasource, mas sem o novo erro de módulo ausente), evitando piorar o estado atual enquanto aguardamos a análise.
Solicitamos:

Verificação de quais módulos EAP estão de fato disponíveis na imagem builder eap81-openjdk21-builder-openshift-rhel9 (versão 1.0.0.GA), em especial org.jboss.as.ejb3 e módulos correlatos (org.jboss.as.jpa, org.jboss.as.naming, etc.).
Confirmação se essa é a versão de imagem builder esperada para aplicações que dependem de EJB3/Timer Service, como é o caso do SIHDG.
Caso o módulo realmente não exista, orientação sobre imagem builder alternativa a ser utilizada, ou inclusão do módulo na imagem atual.
