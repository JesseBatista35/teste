Três frentes hoje. Vou na ordem mais rápida: SICDT, depois SIRUR, depois o SIEMP.

1. SICDT 3.24.3.004 (build novo do Inocêncio)

Na 471, como root, baixe o pacote:

curl -s -o /tmp/sifec-cdt-3.24.3.004.ear http://binario.caixa:8081/repository/releases/br/gov/caixa/sicdt/sifec-cdt/3.24.3.004/sifec-cdt-3.24.3.004.ear && ls -l /tmp/sifec-cdt-3.24.3.004.ear

Depois, no CLI, substitua o pacote atual. O --force troca o conteúdo do SICDT-FEC e faz o redeploy no sifec-intranet:

deploy /tmp/sifec-cdt-3.24.3.004.ear --name=SICDT-FEC --runtime-name=sifec-cdt-3.24.3.004.ear --force

Log na 473:

sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -E "WFLYSRV0010|WFLYSRV0027|WFLYSRV0021|ERROR|Caused by|cdt|ConectorException"

2. SIRUR 3.55.51.01 (persistence.xml ajustado pelo Michael)

Antes do deploy, confira o banco. Ficou pendente o ORA-01017, que é nosso. No CLI da 471:

/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473/subsystem=datasources/data-source="jdbc/OracleSirurDS":test-connection-in-pool
[true]: o banco está ok, pode seguir.
Falhou: me manda a saída antes do deploy. Pode ser o mesmo caso do SIBAN, com credencial diferente do 6.4.

Para o deploy, falta o link do Nexus da 3.55.51.01. Peça ao Michael ou procure no Nexus por sifec-sirur. Com o link em mãos:

curl -s -o /tmp/sifec-sirur-3.55.51.01.ear "LINK_DO_NEXUS"

Me passe o link que eu monto esse comando já pronto.

Depois do download, no CLI:

deploy /tmp/sifec-sirur-3.55.51.01.ear --name=SIRUR --runtime-name=sifec-sirur-3.55.51.01.ear --force
/server-group=sifec-intranet/deployment=SIRUR:add(enabled=true)

3. SIEMP: o DNS foi atendido, e agora?

O DNS já resolve: siemp.des.caixa → 10.116.180.9 (VIP). Pela esteira não falta nada, porque o caminho VIP → VM já está funcionando. O 404 - Not Found da tela é a página padrão do JBoss, o que mostra que a requisição chegou no servidor. O problema é o caminho: o EAR do SIEMP publica o contexto /siemp (contextRoot no pom), e não /siemp_java.

Teste:

<img width="1899" height="1031" alt="image" src="https://github.com/user-attachments/assets/71ded979-0aea-450b-b6ba-1de7a04e5dfe" />


https://siemp.des.caixa/siemp

Se abrir, só falta conferir dois pontos:

“Não seguro” no navegador: pode ser a cadeia do certificado. Clique no cadeado → certificado e veja se o nome é siemp.des.caixa e quem é o emissor.
Login (SSO): se o SIEMP usa Keycloak, o client precisa aceitar o redirect https://siemp.des.caixa/*. Se o login voltar com erro de redirect, esse ajuste é no Keycloak.
Respostas

Para o Denilson (SIEMP):

Bom dia, Denilson! O DNS siemp.des.caixa foi criado hoje (WO0000082275737) e já aponta para o VIP. O 404 que você viu vem do próprio JBoss, ou seja, a requisição está chegando no servidor. O contexto publicado pelo EAR é /siemp. Consegue testar em https://siemp.des.caixa/siemp?

Para o Michael (SIRUR):

Obrigado, Michael! Pode me passar o link do Nexus da 3.55.51.01? Já faço o deploy no 7.4 e acompanho o log para ver se o ajuste no persistence.xml resolve.

Para o Inocêncio (SICDT):

Obrigado, Inocêncio! Vou fazer o redeploy da 3.24.3.004 agora e te aviso quando estiver no ar para a validação final.





[domain@localhost:9999 /] /host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473/subsystem=datasources/data-source="jdbc/OracleSirurDS":test-connection-in-pool
{
    "outcome" => "failed",
    "result" => undefined,
    "failure-description" => "WFLYJCA0040: falha ao invocar a operação: WFLYJCA0047: A conexão não é válida",
    "rolled-back" => true
}

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]








[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -E "WFLYSRV0010|WFLYSRV0027|WFLYSRV0021|ERROR|Caused by|cdt|ConectorException"

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

[sudo] password for p585600:
10:31:30,906 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0207: Iniciando a subimplantação (runtime-name: "sifec-cdt-ejb.jar")
10:31:30,906 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0207: Iniciando a subimplantação (runtime-name: "sicdt-orig-api-rest.war")
10:31:30,909 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0207: Iniciando a subimplantação (runtime-name: "br.gov.caixa.sicdt-sicdt-orig-api-ejb-client-3.24.3.004.jar")
10:31:30,909 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0207: Iniciando a subimplantação (runtime-name: "sifec-cdt-web.war")
10:31:30,912 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0207: Iniciando a subimplantação (runtime-name: "sicdt-orig-api-ejb.jar")
10:31:37,239 INFO  [org.jipijapa] (MSC service thread 1-2) JIPIORMV53020253: Cache de segundo nível habilitado para sifec-cdt-3.24.3.004.ear#SIEMP-PU
10:31:37,244 INFO  [org.jipijapa] (MSC service thread 1-2) JIPIORMV53020253: Cache de segundo nível habilitado para sifec-cdt-3.24.3.004.ear#CDT-PU
10:31:37,244 INFO  [org.jipijapa] (MSC service thread 1-2) JIPIORMV53020253: Cache de segundo nível habilitado para sifec-cdt-3.24.3.004.ear#fecDS
10:31:37,245 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 121) WFLYJPA0010: Iniciando unidade de persistência (fase 1 de 2) Serviço'sifec-cdt-3.24.3.004.ear#fecDS'
10:31:37,245 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 122) WFLYJPA0010: Iniciando unidade de persistência (fase 1 de 2) Serviço'sifec-cdt-3.24.3.004.ear#SIEMP-PU'
10:31:37,246 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 124) WFLYJPA0010: Iniciando unidade de persistência (fase 1 de 2) Serviço'sifec-cdt-3.24.3.004.ear#CDT-PU'
10:31:37,271 INFO  [org.jipijapa] (MSC service thread 1-1) JIPIORMV53020253: Cache de segundo nível habilitado para sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU
10:31:37,276 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 125) WFLYJPA0010: Iniciando unidade de persistência (fase 1 de 2) Serviço'sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU'
10:31:37,298 INFO  [org.jipijapa] (MSC service thread 1-5) JIPIORMV53020253: Cache de segundo nível habilitado para sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU
10:31:37,304 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 126) WFLYJPA0010: Iniciando unidade de persistência (fase 1 de 2) Serviço'sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU'
10:31:37,304 INFO  [org.jboss.weld.deployer] (MSC service thread 1-5) WFLYWELD0003: Processando da implantação weld sifec-cdt-3.24.3.004.ear
10:31:37,401 INFO  [org.jboss.weld.deployer] (MSC service thread 1-1) WFLYWELD0003: Processando da implantação weld br.gov.caixa.sicdt-sicdt-orig-api-ejb-client-3.24.3.004.jar
10:31:37,536 INFO  [org.jboss.keycloak] (MSC service thread 1-2) Keycloak subsystem override for deployment sicdt-orig-api-rest.war
10:31:37,536 INFO  [org.jboss.keycloak] (MSC service thread 1-6) Keycloak subsystem override for deployment sifec-cdt-web.war
10:31:37,536 INFO  [org.jboss.weld.deployer] (MSC service thread 1-2) WFLYWELD0003: Processando da implantação weld sicdt-orig-api-rest.war
10:31:37,536 INFO  [org.jboss.weld.deployer] (MSC service thread 1-6) WFLYWELD0003: Processando da implantação weld sifec-cdt-web.war
10:31:37,553 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SwaggerConverterService' na unidade de implementação 'subdeployment "sicdt-orig-api-rest.war" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-rest/SwaggerConverterService!br.gov.caixa.sicdt.originador.api.service.impl.SwaggerConverterServiceImpl
        java:app/sicdt-orig-api-rest/SwaggerConverterService!br.gov.caixa.sicdt.originador.api.service.impl.SwaggerConverterServiceImpl
        java:module/SwaggerConverterService!br.gov.caixa.sicdt.originador.api.service.impl.SwaggerConverterServiceImpl
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-rest/SwaggerConverterService
        java:app/sicdt-orig-api-rest/SwaggerConverterService
10:31:37,553 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'InternalEntityDaoImpl' na unidade de implementação 'subdeployment "sicdt-orig-api-rest.war" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-rest/InternalEntityDaoImpl!br.gov.caixa.sicdt.dao.IInternalEntityDao
        java:app/sicdt-orig-api-rest/InternalEntityDaoImpl!br.gov.caixa.sicdt.dao.IInternalEntityDao
        java:module/InternalEntityDaoImpl!br.gov.caixa.sicdt.dao.IInternalEntityDao
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-rest/InternalEntityDaoImpl!br.gov.caixa.sicdt.dao.impl.InternalEntityDaoImpl
        java:app/sicdt-orig-api-rest/InternalEntityDaoImpl!br.gov.caixa.sicdt.dao.impl.InternalEntityDaoImpl
        java:module/InternalEntityDaoImpl!br.gov.caixa.sicdt.dao.impl.InternalEntityDaoImpl
10:31:37,553 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AssinaturaOperacionalDaoImpl' na unidade de implementação 'subdeployment "sicdt-orig-api-rest.war" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-rest/AssinaturaOperacionalDaoImpl!br.gov.caixa.sicdt.dao.AssinaturaOperacionalDao
        java:app/sicdt-orig-api-rest/AssinaturaOperacionalDaoImpl!br.gov.caixa.sicdt.dao.AssinaturaOperacionalDao
        java:module/AssinaturaOperacionalDaoImpl!br.gov.caixa.sicdt.dao.AssinaturaOperacionalDao
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-rest/AssinaturaOperacionalDaoImpl!br.gov.caixa.sicdt.dao.impl.AssinaturaOperacionalDaoImpl
        java:app/sicdt-orig-api-rest/AssinaturaOperacionalDaoImpl!br.gov.caixa.sicdt.dao.impl.AssinaturaOperacionalDaoImpl
        java:module/AssinaturaOperacionalDaoImpl!br.gov.caixa.sicdt.dao.impl.AssinaturaOperacionalDaoImpl
10:31:37,553 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SecurityKeycloakUtils' na unidade de implementação 'subdeployment "sicdt-orig-api-rest.war" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-rest/SecurityKeycloakUtils!br.gov.caixa.sifec.security.sso.utils.SecurityKeycloakUtils
        java:app/sicdt-orig-api-rest/SecurityKeycloakUtils!br.gov.caixa.sifec.security.sso.utils.SecurityKeycloakUtils
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-rest/SecurityKeycloakUtils
        java:app/sicdt-orig-api-rest/SecurityKeycloakUtils
10:31:37,553 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'seguranca-sso-SecurityKeycloakUtils' na unidade de implementação 'subdeployment "sicdt-orig-api-rest.war" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-rest/seguranca-sso-SecurityKeycloakUtils!br.gov.caixa.sifec.componentes.seguranca.sso.utils.SecurityKeycloakUtils
        java:app/sicdt-orig-api-rest/seguranca-sso-SecurityKeycloakUtils!br.gov.caixa.sifec.componentes.seguranca.sso.utils.SecurityKeycloakUtils
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-rest/seguranca-sso-SecurityKeycloakUtils
        java:app/sicdt-orig-api-rest/seguranca-sso-SecurityKeycloakUtils
10:31:37,553 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DominioEvolucaoDaoImpl' na unidade de implementação 'subdeployment "sicdt-orig-api-rest.war" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-rest/DominioEvolucaoDaoImpl!br.gov.caixa.sicdt.dao.impl.DominioEvolucaoDaoImpl
        java:app/sicdt-orig-api-rest/DominioEvolucaoDaoImpl!br.gov.caixa.sicdt.dao.impl.DominioEvolucaoDaoImpl
        java:module/DominioEvolucaoDaoImpl!br.gov.caixa.sicdt.dao.impl.DominioEvolucaoDaoImpl
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-rest/DominioEvolucaoDaoImpl!br.gov.caixa.sicdt.dao.DominioEvolucaoDao
        java:app/sicdt-orig-api-rest/DominioEvolucaoDaoImpl!br.gov.caixa.sicdt.dao.DominioEvolucaoDao
        java:module/DominioEvolucaoDaoImpl!br.gov.caixa.sicdt.dao.DominioEvolucaoDao
10:31:37,555 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'InternalEntityDaoImpl' na unidade de implementação 'subdeployment "sifec-cdt-web.war" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-web/InternalEntityDaoImpl!br.gov.caixa.sicdt.dao.IInternalEntityDao
        java:app/sifec-cdt-web/InternalEntityDaoImpl!br.gov.caixa.sicdt.dao.IInternalEntityDao
        java:module/InternalEntityDaoImpl!br.gov.caixa.sicdt.dao.IInternalEntityDao
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-web/InternalEntityDaoImpl!br.gov.caixa.sicdt.dao.impl.InternalEntityDaoImpl
        java:app/sifec-cdt-web/InternalEntityDaoImpl!br.gov.caixa.sicdt.dao.impl.InternalEntityDaoImpl
        java:module/InternalEntityDaoImpl!br.gov.caixa.sicdt.dao.impl.InternalEntityDaoImpl
10:31:37,555 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AssinaturaOperacionalDaoImpl' na unidade de implementação 'subdeployment "sifec-cdt-web.war" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-web/AssinaturaOperacionalDaoImpl!br.gov.caixa.sicdt.dao.AssinaturaOperacionalDao
        java:app/sifec-cdt-web/AssinaturaOperacionalDaoImpl!br.gov.caixa.sicdt.dao.AssinaturaOperacionalDao
        java:module/AssinaturaOperacionalDaoImpl!br.gov.caixa.sicdt.dao.AssinaturaOperacionalDao
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-web/AssinaturaOperacionalDaoImpl!br.gov.caixa.sicdt.dao.impl.AssinaturaOperacionalDaoImpl
        java:app/sifec-cdt-web/AssinaturaOperacionalDaoImpl!br.gov.caixa.sicdt.dao.impl.AssinaturaOperacionalDaoImpl
        java:module/AssinaturaOperacionalDaoImpl!br.gov.caixa.sicdt.dao.impl.AssinaturaOperacionalDaoImpl
10:31:37,555 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SecurityKeycloakUtils' na unidade de implementação 'subdeployment "sifec-cdt-web.war" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-web/SecurityKeycloakUtils!br.gov.caixa.sifec.security.sso.utils.SecurityKeycloakUtils
        java:app/sifec-cdt-web/SecurityKeycloakUtils!br.gov.caixa.sifec.security.sso.utils.SecurityKeycloakUtils
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-web/SecurityKeycloakUtils
        java:app/sifec-cdt-web/SecurityKeycloakUtils
10:31:37,555 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DominioEvolucaoDaoImpl' na unidade de implementação 'subdeployment "sifec-cdt-web.war" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-web/DominioEvolucaoDaoImpl!br.gov.caixa.sicdt.dao.impl.DominioEvolucaoDaoImpl
        java:app/sifec-cdt-web/DominioEvolucaoDaoImpl!br.gov.caixa.sicdt.dao.impl.DominioEvolucaoDaoImpl
        java:module/DominioEvolucaoDaoImpl!br.gov.caixa.sicdt.dao.impl.DominioEvolucaoDaoImpl
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-web/DominioEvolucaoDaoImpl!br.gov.caixa.sicdt.dao.DominioEvolucaoDao
        java:app/sifec-cdt-web/DominioEvolucaoDaoImpl!br.gov.caixa.sicdt.dao.DominioEvolucaoDao
        java:module/DominioEvolucaoDaoImpl!br.gov.caixa.sicdt.dao.DominioEvolucaoDao
10:31:37,598 INFO  [org.jboss.weld.deployer] (MSC service thread 1-7) WFLYWELD0003: Processando da implantação weld sicdt-orig-api-ejb.jar
10:31:37,599 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-7) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DetalheContratoAPIServiceImpl' na unidade de implementação 'subdeployment "sicdt-orig-api-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/DetalheContratoAPIServiceImpl!br.gov.caixa.sicdt.originador.api.service.impl.DetalheContratoAPIServiceImpl
        java:app/sicdt-orig-api-ejb/DetalheContratoAPIServiceImpl!br.gov.caixa.sicdt.originador.api.service.impl.DetalheContratoAPIServiceImpl
        java:module/DetalheContratoAPIServiceImpl!br.gov.caixa.sicdt.originador.api.service.impl.DetalheContratoAPIServiceImpl
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/DetalheContratoAPIServiceImpl!br.gov.caixa.sicdt.originador.api.service.IDetalheContratoAPIService
        java:app/sicdt-orig-api-ejb/DetalheContratoAPIServiceImpl!br.gov.caixa.sicdt.originador.api.service.IDetalheContratoAPIService
        java:module/DetalheContratoAPIServiceImpl!br.gov.caixa.sicdt.originador.api.service.IDetalheContratoAPIService
10:31:37,600 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-7) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ContratoSimularEvolucaoService' na unidade de implementação 'subdeployment "sicdt-orig-api-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/ContratoSimularEvolucaoService!br.gov.caixa.sicdt.originador.api.client.service.simular.IContratoSimularEvolucaoService
        java:app/sicdt-orig-api-ejb/ContratoSimularEvolucaoService!br.gov.caixa.sicdt.originador.api.client.service.simular.IContratoSimularEvolucaoService
        java:module/ContratoSimularEvolucaoService!br.gov.caixa.sicdt.originador.api.client.service.simular.IContratoSimularEvolucaoService
        java:jboss/exported/sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/ContratoSimularEvolucaoService!br.gov.caixa.sicdt.originador.api.client.service.simular.IContratoSimularEvolucaoService
        ejb:sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/ContratoSimularEvolucaoService!br.gov.caixa.sicdt.originador.api.client.service.simular.IContratoSimularEvolucaoService
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/ContratoSimularEvolucaoService!br.gov.caixa.sicdt.originador.api.client.service.simular.IContratoSimularEvolucaoServiceLocal
        java:app/sicdt-orig-api-ejb/ContratoSimularEvolucaoService!br.gov.caixa.sicdt.originador.api.client.service.simular.IContratoSimularEvolucaoServiceLocal
        java:module/ContratoSimularEvolucaoService!br.gov.caixa.sicdt.originador.api.client.service.simular.IContratoSimularEvolucaoServiceLocal
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/ContratoSimularEvolucaoService!br.gov.caixa.sicdt.originador.api.service.impl.ContratoSimularEvolucaoServiceImpl
        java:app/sicdt-orig-api-ejb/ContratoSimularEvolucaoService!br.gov.caixa.sicdt.originador.api.service.impl.ContratoSimularEvolucaoServiceImpl
        java:module/ContratoSimularEvolucaoService!br.gov.caixa.sicdt.originador.api.service.impl.ContratoSimularEvolucaoServiceImpl
10:31:37,600 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-7) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ContratoInsertService' na unidade de implementação 'subdeployment "sicdt-orig-api-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/ContratoInsertService!br.gov.caixa.sicdt.originador.api.client.service.insert.IContratoInsertService
        java:app/sicdt-orig-api-ejb/ContratoInsertService!br.gov.caixa.sicdt.originador.api.client.service.insert.IContratoInsertService
        java:module/ContratoInsertService!br.gov.caixa.sicdt.originador.api.client.service.insert.IContratoInsertService
        java:jboss/exported/sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/ContratoInsertService!br.gov.caixa.sicdt.originador.api.client.service.insert.IContratoInsertService
        ejb:sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/ContratoInsertService!br.gov.caixa.sicdt.originador.api.client.service.insert.IContratoInsertService
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/ContratoInsertService!br.gov.caixa.sicdt.originador.api.service.impl.ContratoInsertServiceImpl
        java:app/sicdt-orig-api-ejb/ContratoInsertService!br.gov.caixa.sicdt.originador.api.service.impl.ContratoInsertServiceImpl
        java:module/ContratoInsertService!br.gov.caixa.sicdt.originador.api.service.impl.ContratoInsertServiceImpl
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/ContratoInsertService!br.gov.caixa.sicdt.originador.api.client.service.insert.IContratoInsertServiceLocal
        java:app/sicdt-orig-api-ejb/ContratoInsertService!br.gov.caixa.sicdt.originador.api.client.service.insert.IContratoInsertServiceLocal
        java:module/ContratoInsertService!br.gov.caixa.sicdt.originador.api.client.service.insert.IContratoInsertServiceLocal
10:31:37,600 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-7) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AuditoriaApiServiceImpl' na unidade de implementação 'subdeployment "sicdt-orig-api-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/AuditoriaApiServiceImpl!br.gov.caixa.sicdt.originador.api.service.impl.AuditoriaApiServiceImpl
        java:app/sicdt-orig-api-ejb/AuditoriaApiServiceImpl!br.gov.caixa.sicdt.originador.api.service.impl.AuditoriaApiServiceImpl
        java:module/AuditoriaApiServiceImpl!br.gov.caixa.sicdt.originador.api.service.impl.AuditoriaApiServiceImpl
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/AuditoriaApiServiceImpl!br.gov.caixa.sicdt.originador.api.client.service.IAuditoriaApiService
        java:app/sicdt-orig-api-ejb/AuditoriaApiServiceImpl!br.gov.caixa.sicdt.originador.api.client.service.IAuditoriaApiService
        java:module/AuditoriaApiServiceImpl!br.gov.caixa.sicdt.originador.api.client.service.IAuditoriaApiService
10:31:37,600 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-7) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SaqueAniversarioServiceImpl' na unidade de implementação 'subdeployment "sicdt-orig-api-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/SaqueAniversarioServiceImpl!br.gov.caixa.sicdt.originador.api.client.service.saqueaniversario.ISaqueAniversarioService
        java:app/sicdt-orig-api-ejb/SaqueAniversarioServiceImpl!br.gov.caixa.sicdt.originador.api.client.service.saqueaniversario.ISaqueAniversarioService
        java:module/SaqueAniversarioServiceImpl!br.gov.caixa.sicdt.originador.api.client.service.saqueaniversario.ISaqueAniversarioService
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/SaqueAniversarioServiceImpl!br.gov.caixa.sicdt.originador.api.service.impl.SaqueAniversarioServiceImpl
        java:app/sicdt-orig-api-ejb/SaqueAniversarioServiceImpl!br.gov.caixa.sicdt.originador.api.service.impl.SaqueAniversarioServiceImpl
        java:module/SaqueAniversarioServiceImpl!br.gov.caixa.sicdt.originador.api.service.impl.SaqueAniversarioServiceImpl
10:31:37,600 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-7) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AssinaturaOperacionalServiceImpl' na unidade de implementação 'subdeployment "sicdt-orig-api-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/AssinaturaOperacionalServiceImpl!br.gov.caixa.sicdt.originador.api.client.service.IAssinaturaOperacionalService
        java:app/sicdt-orig-api-ejb/AssinaturaOperacionalServiceImpl!br.gov.caixa.sicdt.originador.api.client.service.IAssinaturaOperacionalService
        java:module/AssinaturaOperacionalServiceImpl!br.gov.caixa.sicdt.originador.api.client.service.IAssinaturaOperacionalService
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/AssinaturaOperacionalServiceImpl!br.gov.caixa.sicdt.originador.api.service.impl.AssinaturaOperacionalServiceImpl
        java:app/sicdt-orig-api-ejb/AssinaturaOperacionalServiceImpl!br.gov.caixa.sicdt.originador.api.service.impl.AssinaturaOperacionalServiceImpl
        java:module/AssinaturaOperacionalServiceImpl!br.gov.caixa.sicdt.originador.api.service.impl.AssinaturaOperacionalServiceImpl
10:31:37,600 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-7) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ModuloTributarioService' na unidade de implementação 'subdeployment "sicdt-orig-api-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/ModuloTributarioService!br.gov.caixa.sicdt.originador.api.service.impl.ModuloTributarioServiceImpl
        java:app/sicdt-orig-api-ejb/ModuloTributarioService!br.gov.caixa.sicdt.originador.api.service.impl.ModuloTributarioServiceImpl
        java:module/ModuloTributarioService!br.gov.caixa.sicdt.originador.api.service.impl.ModuloTributarioServiceImpl
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/ModuloTributarioService!br.gov.caixa.sicdt.core.calculo.service.ModuloTributarioService
        java:app/sicdt-orig-api-ejb/ModuloTributarioService!br.gov.caixa.sicdt.core.calculo.service.ModuloTributarioService
        java:module/ModuloTributarioService!br.gov.caixa.sicdt.core.calculo.service.ModuloTributarioService
10:31:37,600 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-7) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'PosicaoDividaServiceImpl' na unidade de implementação 'subdeployment "sicdt-orig-api-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/PosicaoDividaServiceImpl!br.gov.caixa.sicdt.originador.api.service.impl.PosicaoDividaServiceImpl
        java:app/sicdt-orig-api-ejb/PosicaoDividaServiceImpl!br.gov.caixa.sicdt.originador.api.service.impl.PosicaoDividaServiceImpl
        java:module/PosicaoDividaServiceImpl!br.gov.caixa.sicdt.originador.api.service.impl.PosicaoDividaServiceImpl
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/PosicaoDividaServiceImpl!br.gov.caixa.sicdt.originador.api.client.service.IPosicaoDividaService
        java:app/sicdt-orig-api-ejb/PosicaoDividaServiceImpl!br.gov.caixa.sicdt.originador.api.client.service.IPosicaoDividaService
        java:module/PosicaoDividaServiceImpl!br.gov.caixa.sicdt.originador.api.client.service.IPosicaoDividaService
10:31:37,600 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-7) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ContratoValidatorService' na unidade de implementação 'subdeployment "sicdt-orig-api-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/ContratoValidatorService!br.gov.caixa.sicdt.originador.api.client.service.validator.IContratoValidatorService
        java:app/sicdt-orig-api-ejb/ContratoValidatorService!br.gov.caixa.sicdt.originador.api.client.service.validator.IContratoValidatorService
        java:module/ContratoValidatorService!br.gov.caixa.sicdt.originador.api.client.service.validator.IContratoValidatorService
        java:jboss/exported/sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/ContratoValidatorService!br.gov.caixa.sicdt.originador.api.client.service.validator.IContratoValidatorService
        ejb:sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/ContratoValidatorService!br.gov.caixa.sicdt.originador.api.client.service.validator.IContratoValidatorService
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/ContratoValidatorService!br.gov.caixa.sicdt.originador.api.client.service.validator.IContratoValidatorServiceLocal
        java:app/sicdt-orig-api-ejb/ContratoValidatorService!br.gov.caixa.sicdt.originador.api.client.service.validator.IContratoValidatorServiceLocal
        java:module/ContratoValidatorService!br.gov.caixa.sicdt.originador.api.client.service.validator.IContratoValidatorServiceLocal
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/ContratoValidatorService!br.gov.caixa.sicdt.originador.api.service.impl.ContratoValidatorServiceImpl
        java:app/sicdt-orig-api-ejb/ContratoValidatorService!br.gov.caixa.sicdt.originador.api.service.impl.ContratoValidatorServiceImpl
        java:module/ContratoValidatorService!br.gov.caixa.sicdt.originador.api.service.impl.ContratoValidatorServiceImpl
10:31:37,600 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-7) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ContratoConverterService' na unidade de implementação 'subdeployment "sicdt-orig-api-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/ContratoConverterService!br.gov.caixa.sicdt.originador.api.client.service.converter.IContratoConverterServiceLocal
        java:app/sicdt-orig-api-ejb/ContratoConverterService!br.gov.caixa.sicdt.originador.api.client.service.converter.IContratoConverterServiceLocal
        java:module/ContratoConverterService!br.gov.caixa.sicdt.originador.api.client.service.converter.IContratoConverterServiceLocal
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/ContratoConverterService!br.gov.caixa.sicdt.originador.api.client.service.converter.IContratoConverterService
        java:app/sicdt-orig-api-ejb/ContratoConverterService!br.gov.caixa.sicdt.originador.api.client.service.converter.IContratoConverterService
        java:module/ContratoConverterService!br.gov.caixa.sicdt.originador.api.client.service.converter.IContratoConverterService
        java:jboss/exported/sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/ContratoConverterService!br.gov.caixa.sicdt.originador.api.client.service.converter.IContratoConverterService
        ejb:sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/ContratoConverterService!br.gov.caixa.sicdt.originador.api.client.service.converter.IContratoConverterService
10:31:37,600 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-7) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ContratoCancellerService' na unidade de implementação 'subdeployment "sicdt-orig-api-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/ContratoCancellerService!br.gov.caixa.sicdt.originador.api.client.service.cancel.IContratoCancellerServiceLocal
        java:app/sicdt-orig-api-ejb/ContratoCancellerService!br.gov.caixa.sicdt.originador.api.client.service.cancel.IContratoCancellerServiceLocal
        java:module/ContratoCancellerService!br.gov.caixa.sicdt.originador.api.client.service.cancel.IContratoCancellerServiceLocal
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/ContratoCancellerService!br.gov.caixa.sicdt.originador.api.service.impl.ContratoCancelarServiceImpl
        java:app/sicdt-orig-api-ejb/ContratoCancellerService!br.gov.caixa.sicdt.originador.api.service.impl.ContratoCancelarServiceImpl
        java:module/ContratoCancellerService!br.gov.caixa.sicdt.originador.api.service.impl.ContratoCancelarServiceImpl
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/ContratoCancellerService!br.gov.caixa.sicdt.originador.api.client.service.cancel.IContratoCancellerService
        java:app/sicdt-orig-api-ejb/ContratoCancellerService!br.gov.caixa.sicdt.originador.api.client.service.cancel.IContratoCancellerService
        java:module/ContratoCancellerService!br.gov.caixa.sicdt.originador.api.client.service.cancel.IContratoCancellerService
        java:jboss/exported/sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/ContratoCancellerService!br.gov.caixa.sicdt.originador.api.client.service.cancel.IContratoCancellerService
        ejb:sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/ContratoCancellerService!br.gov.caixa.sicdt.originador.api.client.service.cancel.IContratoCancellerService
10:31:37,600 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-7) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SIICOServiceImpl' na unidade de implementação 'subdeployment "sicdt-orig-api-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/SIICOServiceImpl!br.gov.caixa.sicdt.originador.api.service.ISIICOService
        java:app/sicdt-orig-api-ejb/SIICOServiceImpl!br.gov.caixa.sicdt.originador.api.service.ISIICOService
        java:module/SIICOServiceImpl!br.gov.caixa.sicdt.originador.api.service.ISIICOService
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/SIICOServiceImpl!br.gov.caixa.sicdt.originador.api.service.impl.SIICOServiceImpl
        java:app/sicdt-orig-api-ejb/SIICOServiceImpl!br.gov.caixa.sicdt.originador.api.service.impl.SIICOServiceImpl
        java:module/SIICOServiceImpl!br.gov.caixa.sicdt.originador.api.service.impl.SIICOServiceImpl
10:31:37,600 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-7) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ContratoLiquidarService' na unidade de implementação 'subdeployment "sicdt-orig-api-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/ContratoLiquidarService!br.gov.caixa.sicdt.originador.api.client.service.liquida.IContratoLiquidarService
        java:app/sicdt-orig-api-ejb/ContratoLiquidarService!br.gov.caixa.sicdt.originador.api.client.service.liquida.IContratoLiquidarService
        java:module/ContratoLiquidarService!br.gov.caixa.sicdt.originador.api.client.service.liquida.IContratoLiquidarService
        java:jboss/exported/sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/ContratoLiquidarService!br.gov.caixa.sicdt.originador.api.client.service.liquida.IContratoLiquidarService
        ejb:sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/ContratoLiquidarService!br.gov.caixa.sicdt.originador.api.client.service.liquida.IContratoLiquidarService
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/ContratoLiquidarService!br.gov.caixa.sicdt.originador.api.service.impl.ContratoLiquidarServiceImpl
        java:app/sicdt-orig-api-ejb/ContratoLiquidarService!br.gov.caixa.sicdt.originador.api.service.impl.ContratoLiquidarServiceImpl
        java:module/ContratoLiquidarService!br.gov.caixa.sicdt.originador.api.service.impl.ContratoLiquidarServiceImpl
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/ContratoLiquidarService!br.gov.caixa.sicdt.originador.api.client.service.liquida.IContratoLiquidarServiceLocal
        java:app/sicdt-orig-api-ejb/ContratoLiquidarService!br.gov.caixa.sicdt.originador.api.client.service.liquida.IContratoLiquidarServiceLocal
        java:module/ContratoLiquidarService!br.gov.caixa.sicdt.originador.api.client.service.liquida.IContratoLiquidarServiceLocal
10:31:37,600 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-7) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ContratoServiceImpl' na unidade de implementação 'subdeployment "sicdt-orig-api-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/ContratoServiceImpl!br.gov.caixa.sicdt.originador.api.service.impl.ContratoServiceImpl
        java:app/sicdt-orig-api-ejb/ContratoServiceImpl!br.gov.caixa.sicdt.originador.api.service.impl.ContratoServiceImpl
        java:module/ContratoServiceImpl!br.gov.caixa.sicdt.originador.api.service.impl.ContratoServiceImpl
        java:global/sifec-cdt-3.24.3.004/sicdt-orig-api-ejb/ContratoServiceImpl!br.gov.caixa.sicdt.originador.api.client.service.IDetalheContratoServiceAPI
        java:app/sicdt-orig-api-ejb/ContratoServiceImpl!br.gov.caixa.sicdt.originador.api.client.service.IDetalheContratoServiceAPI
        java:module/ContratoServiceImpl!br.gov.caixa.sicdt.originador.api.client.service.IDetalheContratoServiceAPI
10:31:37,712 INFO  [org.jboss.weld.deployer] (MSC service thread 1-5) WFLYWELD0003: Processando da implantação weld sifec-cdt-ejb.jar
10:31:37,714 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'RetornoMovimentoFinanceiroCoreServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/RetornoMovimentoFinanceiroCoreServiceImpl!br.gov.caixa.sicdt.ejb.service.calculo.RetornoMovimentoFinanceiroCoreServiceImpl
        java:app/sifec-cdt-ejb/RetornoMovimentoFinanceiroCoreServiceImpl!br.gov.caixa.sicdt.ejb.service.calculo.RetornoMovimentoFinanceiroCoreServiceImpl
        java:module/RetornoMovimentoFinanceiroCoreServiceImpl!br.gov.caixa.sicdt.ejb.service.calculo.RetornoMovimentoFinanceiroCoreServiceImpl
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/RetornoMovimentoFinanceiroCoreServiceImpl
        java:app/sifec-cdt-ejb/RetornoMovimentoFinanceiroCoreServiceImpl
10:31:37,715 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AuditoriaServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/AuditoriaServiceImpl!br.gov.caixa.sicdt.ejb.service.auditoria.impl.AuditoriaServiceImpl
        java:app/sifec-cdt-ejb/AuditoriaServiceImpl!br.gov.caixa.sicdt.ejb.service.auditoria.impl.AuditoriaServiceImpl
        java:module/AuditoriaServiceImpl!br.gov.caixa.sicdt.ejb.service.auditoria.impl.AuditoriaServiceImpl
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/AuditoriaServiceImpl!br.gov.caixa.sicdt.ejb.service.auditoria.IAuditoriaService
        java:app/sifec-cdt-ejb/AuditoriaServiceImpl!br.gov.caixa.sicdt.ejb.service.auditoria.IAuditoriaService
        java:module/AuditoriaServiceImpl!br.gov.caixa.sicdt.ejb.service.auditoria.IAuditoriaService
10:31:37,715 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ProdutorLog' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ProdutorLog!br.gov.caixa.sicdt.ejb.log.ProdutorLog
        java:app/sifec-cdt-ejb/ProdutorLog!br.gov.caixa.sicdt.ejb.log.ProdutorLog
        java:module/ProdutorLog!br.gov.caixa.sicdt.ejb.log.ProdutorLog
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ProdutorLog
        java:app/sifec-cdt-ejb/ProdutorLog
10:31:37,715 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ProcessoExecucaoRotinaServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ProcessoExecucaoRotinaServiceImpl!br.gov.caixa.sicdt.ejb.service.processo.operacional.IProcessoExecucaoRotinaService
        java:app/sifec-cdt-ejb/ProcessoExecucaoRotinaServiceImpl!br.gov.caixa.sicdt.ejb.service.processo.operacional.IProcessoExecucaoRotinaService
        java:module/ProcessoExecucaoRotinaServiceImpl!br.gov.caixa.sicdt.ejb.service.processo.operacional.IProcessoExecucaoRotinaService
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ProcessoExecucaoRotinaServiceImpl!br.gov.caixa.sicdt.ejb.service.processo.operacional.impl.ProcessoExecucaoRotinaServiceImpl
        java:app/sifec-cdt-ejb/ProcessoExecucaoRotinaServiceImpl!br.gov.caixa.sicdt.ejb.service.processo.operacional.impl.ProcessoExecucaoRotinaServiceImpl
        java:module/ProcessoExecucaoRotinaServiceImpl!br.gov.caixa.sicdt.ejb.service.processo.operacional.impl.ProcessoExecucaoRotinaServiceImpl
10:31:37,715 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ReembolsoServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ReembolsoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IReembolsoService
        java:app/sifec-cdt-ejb/ReembolsoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IReembolsoService
        java:module/ReembolsoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IReembolsoService
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ReembolsoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.ReembolsoServiceImpl
        java:app/sifec-cdt-ejb/ReembolsoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.ReembolsoServiceImpl
        java:module/ReembolsoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.ReembolsoServiceImpl
10:31:37,715 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DetalheItemContratoServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/DetalheItemContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.DetalheItemContratoServiceImpl
        java:app/sifec-cdt-ejb/DetalheItemContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.DetalheItemContratoServiceImpl
        java:module/DetalheItemContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.DetalheItemContratoServiceImpl
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/DetalheItemContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IDetalheItemContratoService
        java:app/sifec-cdt-ejb/DetalheItemContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IDetalheItemContratoService
        java:module/DetalheItemContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IDetalheItemContratoService
10:31:37,715 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'InterfaceDetalheServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/InterfaceDetalheServiceImpl!br.gov.caixa.sicdt.ejb.service.processo.operacional.impl.InterfaceDetalheServiceImpl
        java:app/sifec-cdt-ejb/InterfaceDetalheServiceImpl!br.gov.caixa.sicdt.ejb.service.processo.operacional.impl.InterfaceDetalheServiceImpl
        java:module/InterfaceDetalheServiceImpl!br.gov.caixa.sicdt.ejb.service.processo.operacional.impl.InterfaceDetalheServiceImpl
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/InterfaceDetalheServiceImpl!br.gov.caixa.sicdt.ejb.service.processo.operacional.IInterfaceDetalheService
        java:app/sifec-cdt-ejb/InterfaceDetalheServiceImpl!br.gov.caixa.sicdt.ejb.service.processo.operacional.IInterfaceDetalheService
        java:module/InterfaceDetalheServiceImpl!br.gov.caixa.sicdt.ejb.service.processo.operacional.IInterfaceDetalheService
10:31:37,715 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'MarcaServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/MarcaServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IMarcaService
        java:app/sifec-cdt-ejb/MarcaServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IMarcaService
        java:module/MarcaServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IMarcaService
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/MarcaServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.MarcaServiceImpl
        java:app/sifec-cdt-ejb/MarcaServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.MarcaServiceImpl
        java:module/MarcaServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.MarcaServiceImpl
10:31:37,715 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'EstagioRiscoCreditoServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/EstagioRiscoCreditoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IEstagioRiscoCreditoService
        java:app/sifec-cdt-ejb/EstagioRiscoCreditoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IEstagioRiscoCreditoService
        java:module/EstagioRiscoCreditoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IEstagioRiscoCreditoService
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/EstagioRiscoCreditoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.EstagioRiscoCreditoServiceImpl
        java:app/sifec-cdt-ejb/EstagioRiscoCreditoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.EstagioRiscoCreditoServiceImpl
        java:module/EstagioRiscoCreditoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.EstagioRiscoCreditoServiceImpl
10:31:37,715 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SinadServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/SinadServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.SinadServiceImpl
        java:app/sifec-cdt-ejb/SinadServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.SinadServiceImpl
        java:module/SinadServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.SinadServiceImpl
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/SinadServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.ISinadService
        java:app/sifec-cdt-ejb/SinadServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.ISinadService
        java:module/SinadServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.ISinadService
10:31:37,715 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DominioServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/DominioServiceImpl!br.gov.caixa.sicdt.ejb.service.core.IDominioService
        java:app/sifec-cdt-ejb/DominioServiceImpl!br.gov.caixa.sicdt.ejb.service.core.IDominioService
        java:module/DominioServiceImpl!br.gov.caixa.sicdt.ejb.service.core.IDominioService
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/DominioServiceImpl!br.gov.caixa.sicdt.ejb.service.core.impl.DominioServiceImpl
        java:app/sifec-cdt-ejb/DominioServiceImpl!br.gov.caixa.sicdt.ejb.service.core.impl.DominioServiceImpl
        java:module/DominioServiceImpl!br.gov.caixa.sicdt.ejb.service.core.impl.DominioServiceImpl
10:31:37,715 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'MovimentoAcertoServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/MovimentoAcertoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IMovimentoAcertoService
        java:app/sifec-cdt-ejb/MovimentoAcertoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IMovimentoAcertoService
        java:module/MovimentoAcertoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IMovimentoAcertoService
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/MovimentoAcertoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.MovimentoAcertoServiceImpl
        java:app/sifec-cdt-ejb/MovimentoAcertoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.MovimentoAcertoServiceImpl
        java:module/MovimentoAcertoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.MovimentoAcertoServiceImpl
10:31:37,715 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DesbloqueioGarantiaFGTSServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/DesbloqueioGarantiaFGTSServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.DesbloqueioGarantiaFGTSServiceImpl
        java:app/sifec-cdt-ejb/DesbloqueioGarantiaFGTSServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.DesbloqueioGarantiaFGTSServiceImpl
        java:module/DesbloqueioGarantiaFGTSServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.DesbloqueioGarantiaFGTSServiceImpl
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/DesbloqueioGarantiaFGTSServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IDesbloqueioGarantiaFGTSService
        java:app/sifec-cdt-ejb/DesbloqueioGarantiaFGTSServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IDesbloqueioGarantiaFGTSService
        java:module/DesbloqueioGarantiaFGTSServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IDesbloqueioGarantiaFGTSService
10:31:37,715 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AssinaturaOperacionalRepositoryImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/AssinaturaOperacionalRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.AssinaturaOperacionalRepository
        java:app/sifec-cdt-ejb/AssinaturaOperacionalRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.AssinaturaOperacionalRepository
        java:module/AssinaturaOperacionalRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.AssinaturaOperacionalRepository
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/AssinaturaOperacionalRepositoryImpl
        java:app/sifec-cdt-ejb/AssinaturaOperacionalRepositoryImpl
10:31:37,715 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'RetornoMovimentoCobrancaRepositoryImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/RetornoMovimentoCobrancaRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.RetornoMovimentoCobrancaRepository
        java:app/sifec-cdt-ejb/RetornoMovimentoCobrancaRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.RetornoMovimentoCobrancaRepository
        java:module/RetornoMovimentoCobrancaRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.RetornoMovimentoCobrancaRepository
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/RetornoMovimentoCobrancaRepositoryImpl
        java:app/sifec-cdt-ejb/RetornoMovimentoCobrancaRepositoryImpl
10:31:37,715 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ContaServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ContaServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.manutencao.impl.ContaServiceImpl
        java:app/sifec-cdt-ejb/ContaServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.manutencao.impl.ContaServiceImpl
        java:module/ContaServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.manutencao.impl.ContaServiceImpl
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ContaServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.manutencao.IContaService
        java:app/sifec-cdt-ejb/ContaServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.manutencao.IContaService
        java:module/ContaServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.manutencao.IContaService
10:31:37,715 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SaldoRepositoryImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/SaldoRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.SaldoRepository
        java:app/sifec-cdt-ejb/SaldoRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.SaldoRepository
        java:module/SaldoRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.SaldoRepository
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/SaldoRepositoryImpl
        java:app/sifec-cdt-ejb/SaldoRepositoryImpl
10:31:37,715 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ContratoRepositoryImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ContratoRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.ContratoRepository
        java:app/sifec-cdt-ejb/ContratoRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.ContratoRepository
        java:module/ContratoRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.ContratoRepository
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ContratoRepositoryImpl
        java:app/sifec-cdt-ejb/ContratoRepositoryImpl
10:31:37,715 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'RetornoMovimentoContaRepositoryImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/RetornoMovimentoContaRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.RetornoMovimentoContaRepository
        java:app/sifec-cdt-ejb/RetornoMovimentoContaRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.RetornoMovimentoContaRepository
        java:module/RetornoMovimentoContaRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.RetornoMovimentoContaRepository
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/RetornoMovimentoContaRepositoryImpl
        java:app/sifec-cdt-ejb/RetornoMovimentoContaRepositoryImpl
10:31:37,715 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ContratoServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.ContratoServiceImpl
        java:app/sifec-cdt-ejb/ContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.ContratoServiceImpl
        java:module/ContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.ContratoServiceImpl
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IContratoService
        java:app/sifec-cdt-ejb/ContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IContratoService
        java:module/ContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IContratoService
10:31:37,715 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ContabilRepositoryImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ContabilRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.ContabilRepository
        java:app/sifec-cdt-ejb/ContabilRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.ContabilRepository
        java:module/ContabilRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.ContabilRepository
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ContabilRepositoryImpl
        java:app/sifec-cdt-ejb/ContabilRepositoryImpl
10:31:37,716 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ErroExecucaoServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ErroExecucaoServiceImpl!br.gov.caixa.sicdt.ejb.service.processo.operacional.IErroExecucaoService
        java:app/sifec-cdt-ejb/ErroExecucaoServiceImpl!br.gov.caixa.sicdt.ejb.service.processo.operacional.IErroExecucaoService
        java:module/ErroExecucaoServiceImpl!br.gov.caixa.sicdt.ejb.service.processo.operacional.IErroExecucaoService
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ErroExecucaoServiceImpl!br.gov.caixa.sicdt.ejb.service.processo.operacional.impl.ErroExecucaoServiceImpl
        java:app/sifec-cdt-ejb/ErroExecucaoServiceImpl!br.gov.caixa.sicdt.ejb.service.processo.operacional.impl.ErroExecucaoServiceImpl
        java:module/ErroExecucaoServiceImpl!br.gov.caixa.sicdt.ejb.service.processo.operacional.impl.ErroExecucaoServiceImpl
10:31:37,716 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'EvolucaoDividaService' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/EvolucaoDividaService!br.gov.caixa.sicdt.ejb.service.divida.EvolucaoDividaService
        java:app/sifec-cdt-ejb/EvolucaoDividaService!br.gov.caixa.sicdt.ejb.service.divida.EvolucaoDividaService
        java:module/EvolucaoDividaService!br.gov.caixa.sicdt.ejb.service.divida.EvolucaoDividaService
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/EvolucaoDividaService
        java:app/sifec-cdt-ejb/EvolucaoDividaService
10:31:37,716 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'CacheDataService' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/CacheDataService!br.gov.caixa.sicdt.ejb.repository.impl.CacheDataService
        java:app/sifec-cdt-ejb/CacheDataService!br.gov.caixa.sicdt.ejb.repository.impl.CacheDataService
        java:module/CacheDataService!br.gov.caixa.sicdt.ejb.repository.impl.CacheDataService
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/CacheDataService
        java:app/sifec-cdt-ejb/CacheDataService
10:31:37,716 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'IndexadorRepositoryImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/IndexadorRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.IndexadorRepository
        java:app/sifec-cdt-ejb/IndexadorRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.IndexadorRepository
        java:module/IndexadorRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.IndexadorRepository
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/IndexadorRepositoryImpl
        java:app/sifec-cdt-ejb/IndexadorRepositoryImpl
10:31:37,716 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ArredondamentoRepositoryImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ArredondamentoRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.ArredondamentoRepository
        java:app/sifec-cdt-ejb/ArredondamentoRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.ArredondamentoRepository
        java:module/ArredondamentoRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.ArredondamentoRepository
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ArredondamentoRepositoryImpl
        java:app/sifec-cdt-ejb/ArredondamentoRepositoryImpl
10:31:37,716 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AliquotaServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/AliquotaServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.AliquotaServiceImpl
        java:app/sifec-cdt-ejb/AliquotaServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.AliquotaServiceImpl
        java:module/AliquotaServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.AliquotaServiceImpl
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/AliquotaServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IAliquotaService
        java:app/sifec-cdt-ejb/AliquotaServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IAliquotaService
        java:module/AliquotaServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IAliquotaService
10:31:37,716 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DashboardServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/DashboardServiceImpl!br.gov.caixa.sicdt.ejb.service.processo.operacional.impl.DashboardServiceImpl
        java:app/sifec-cdt-ejb/DashboardServiceImpl!br.gov.caixa.sicdt.ejb.service.processo.operacional.impl.DashboardServiceImpl
        java:module/DashboardServiceImpl!br.gov.caixa.sicdt.ejb.service.processo.operacional.impl.DashboardServiceImpl
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/DashboardServiceImpl!br.gov.caixa.sicdt.ejb.service.processo.operacional.IDashboardService
        java:app/sifec-cdt-ejb/DashboardServiceImpl!br.gov.caixa.sicdt.ejb.service.processo.operacional.IDashboardService
        java:module/DashboardServiceImpl!br.gov.caixa.sicdt.ejb.service.processo.operacional.IDashboardService
10:31:37,716 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'MovimentoLoteRepositoryImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/MovimentoLoteRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.MovimentoLoteRepository
        java:app/sifec-cdt-ejb/MovimentoLoteRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.MovimentoLoteRepository
        java:module/MovimentoLoteRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.MovimentoLoteRepository
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/MovimentoLoteRepositoryImpl
        java:app/sifec-cdt-ejb/MovimentoLoteRepositoryImpl
10:31:37,716 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AssinaturaContabilServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/AssinaturaContabilServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.impl.AssinaturaContabilServiceImpl
        java:app/sifec-cdt-ejb/AssinaturaContabilServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.impl.AssinaturaContabilServiceImpl
        java:module/AssinaturaContabilServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.impl.AssinaturaContabilServiceImpl
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/AssinaturaContabilServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.IAssinaturaContabilService
        java:app/sifec-cdt-ejb/AssinaturaContabilServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.IAssinaturaContabilService
        java:module/AssinaturaContabilServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.IAssinaturaContabilService
10:31:37,716 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SinadRepositoryImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/SinadRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.SinadRepository
        java:app/sifec-cdt-ejb/SinadRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.SinadRepository
        java:module/SinadRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.SinadRepository
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/SinadRepositoryImpl
        java:app/sifec-cdt-ejb/SinadRepositoryImpl
10:31:37,716 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'RelatorioValoresPendentesDevolucaoServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/RelatorioValoresPendentesDevolucaoServiceImpl!br.gov.caixa.sicdt.ejb.service.relatorio.IRelatorioValoresPendentesDevolucaoService
        java:app/sifec-cdt-ejb/RelatorioValoresPendentesDevolucaoServiceImpl!br.gov.caixa.sicdt.ejb.service.relatorio.IRelatorioValoresPendentesDevolucaoService
        java:module/RelatorioValoresPendentesDevolucaoServiceImpl!br.gov.caixa.sicdt.ejb.service.relatorio.IRelatorioValoresPendentesDevolucaoService
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/RelatorioValoresPendentesDevolucaoServiceImpl
        java:app/sifec-cdt-ejb/RelatorioValoresPendentesDevolucaoServiceImpl
10:31:37,716 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'InformacaoAdicionalServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/InformacaoAdicionalServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.InformacaoAdicionalServiceImpl
        java:app/sifec-cdt-ejb/InformacaoAdicionalServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.InformacaoAdicionalServiceImpl
        java:module/InformacaoAdicionalServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.InformacaoAdicionalServiceImpl
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/InformacaoAdicionalServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IInformacaoAdicionalService
        java:app/sifec-cdt-ejb/InformacaoAdicionalServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IInformacaoAdicionalService
        java:module/InformacaoAdicionalServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IInformacaoAdicionalService
10:31:37,716 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'CronogramaRepositoryImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/CronogramaRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.CronogramaRepository
        java:app/sifec-cdt-ejb/CronogramaRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.CronogramaRepository
        java:module/CronogramaRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.CronogramaRepository
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/CronogramaRepositoryImpl
        java:app/sifec-cdt-ejb/CronogramaRepositoryImpl
10:31:37,716 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ParcelaServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ParcelaServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.ParcelaServiceImpl
        java:app/sifec-cdt-ejb/ParcelaServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.ParcelaServiceImpl
        java:module/ParcelaServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.ParcelaServiceImpl
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ParcelaServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IParcelaService
        java:app/sifec-cdt-ejb/ParcelaServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IParcelaService
        java:module/ParcelaServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IParcelaService
10:31:37,716 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ListagemServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ListagemServiceImpl!br.gov.caixa.sicdt.ejb.service.core.impl.ListagemServiceImpl
        java:app/sifec-cdt-ejb/ListagemServiceImpl!br.gov.caixa.sicdt.ejb.service.core.impl.ListagemServiceImpl
        java:module/ListagemServiceImpl!br.gov.caixa.sicdt.ejb.service.core.impl.ListagemServiceImpl
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ListagemServiceImpl!br.gov.caixa.sicdt.ejb.service.core.IListagemService
        java:app/sifec-cdt-ejb/ListagemServiceImpl!br.gov.caixa.sicdt.ejb.service.core.IListagemService
        java:module/ListagemServiceImpl!br.gov.caixa.sicdt.ejb.service.core.IListagemService
10:31:37,716 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'LiberacaoServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/LiberacaoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.ILiberacaoService
        java:app/sifec-cdt-ejb/LiberacaoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.ILiberacaoService
        java:module/LiberacaoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.ILiberacaoService
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/LiberacaoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.LiberacaoServiceImpl
        java:app/sifec-cdt-ejb/LiberacaoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.LiberacaoServiceImpl
        java:module/LiberacaoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.LiberacaoServiceImpl
10:31:37,716 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AssinaturaOperacionalServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/AssinaturaOperacionalServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.impl.AssinaturaOperacionalServiceImpl
        java:app/sifec-cdt-ejb/AssinaturaOperacionalServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.impl.AssinaturaOperacionalServiceImpl
        java:module/AssinaturaOperacionalServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.impl.AssinaturaOperacionalServiceImpl
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/AssinaturaOperacionalServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.IAssinaturaOperacionalService
        java:app/sifec-cdt-ejb/AssinaturaOperacionalServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.IAssinaturaOperacionalService
        java:module/AssinaturaOperacionalServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.IAssinaturaOperacionalService
10:31:37,716 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'CobrancaBoletoServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/CobrancaBoletoServiceImpl!br.gov.caixa.sicdt.ejb.service.cobranca.impl.CobrancaBoletoServiceImpl
        java:app/sifec-cdt-ejb/CobrancaBoletoServiceImpl!br.gov.caixa.sicdt.ejb.service.cobranca.impl.CobrancaBoletoServiceImpl
        java:module/CobrancaBoletoServiceImpl!br.gov.caixa.sicdt.ejb.service.cobranca.impl.CobrancaBoletoServiceImpl
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/CobrancaBoletoServiceImpl!br.gov.caixa.sicdt.ejb.service.cobranca.ICobrancaBoletoService
        java:app/sifec-cdt-ejb/CobrancaBoletoServiceImpl!br.gov.caixa.sicdt.ejb.service.cobranca.ICobrancaBoletoService
        java:module/CobrancaBoletoServiceImpl!br.gov.caixa.sicdt.ejb.service.cobranca.ICobrancaBoletoService
10:31:37,717 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ApropriacaoRepositoryImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ApropriacaoRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.ApropriacaoRepository
        java:app/sifec-cdt-ejb/ApropriacaoRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.ApropriacaoRepository
        java:module/ApropriacaoRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.ApropriacaoRepository
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ApropriacaoRepositoryImpl
        java:app/sifec-cdt-ejb/ApropriacaoRepositoryImpl
10:31:37,717 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ContratoViaArquivoServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ContratoViaArquivoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.via.arquivo.IContratoViaArquivoService
        java:app/sifec-cdt-ejb/ContratoViaArquivoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.via.arquivo.IContratoViaArquivoService
        java:module/ContratoViaArquivoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.via.arquivo.IContratoViaArquivoService
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ContratoViaArquivoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.via.arquivo.impl.ContratoViaArquivoServiceImpl
        java:app/sifec-cdt-ejb/ContratoViaArquivoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.via.arquivo.impl.ContratoViaArquivoServiceImpl
        java:module/ContratoViaArquivoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.via.arquivo.impl.ContratoViaArquivoServiceImpl
10:31:37,717 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'RenegociacaoContratoHospitaisServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/RenegociacaoContratoHospitaisServiceImpl!br.gov.caixa.sicdt.ejb.service.renegociacao.IRenegociacaoContratoHospitaisService
        java:app/sifec-cdt-ejb/RenegociacaoContratoHospitaisServiceImpl!br.gov.caixa.sicdt.ejb.service.renegociacao.IRenegociacaoContratoHospitaisService
        java:module/RenegociacaoContratoHospitaisServiceImpl!br.gov.caixa.sicdt.ejb.service.renegociacao.IRenegociacaoContratoHospitaisService
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/RenegociacaoContratoHospitaisServiceImpl!br.gov.caixa.sicdt.ejb.service.renegociacao.impl.RenegociacaoContratoHospitaisServiceImpl
        java:app/sifec-cdt-ejb/RenegociacaoContratoHospitaisServiceImpl!br.gov.caixa.sicdt.ejb.service.renegociacao.impl.RenegociacaoContratoHospitaisServiceImpl
        java:module/RenegociacaoContratoHospitaisServiceImpl!br.gov.caixa.sicdt.ejb.service.renegociacao.impl.RenegociacaoContratoHospitaisServiceImpl
10:31:37,717 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ApropriacaoCoreServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ApropriacaoCoreServiceImpl!br.gov.caixa.sicdt.ejb.service.calculo.ApropriacaoCoreServiceImpl
        java:app/sifec-cdt-ejb/ApropriacaoCoreServiceImpl!br.gov.caixa.sicdt.ejb.service.calculo.ApropriacaoCoreServiceImpl
        java:module/ApropriacaoCoreServiceImpl!br.gov.caixa.sicdt.ejb.service.calculo.ApropriacaoCoreServiceImpl
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ApropriacaoCoreServiceImpl
        java:app/sifec-cdt-ejb/ApropriacaoCoreServiceImpl
10:31:37,717 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'MovimentoFinanceiroServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/MovimentoFinanceiroServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IMovimentoFinanceiroService
        java:app/sifec-cdt-ejb/MovimentoFinanceiroServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IMovimentoFinanceiroService
        java:module/MovimentoFinanceiroServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IMovimentoFinanceiroService
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/MovimentoFinanceiroServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.MovimentoFinanceiroServiceImpl
        java:app/sifec-cdt-ejb/MovimentoFinanceiroServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.MovimentoFinanceiroServiceImpl
        java:module/MovimentoFinanceiroServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.MovimentoFinanceiroServiceImpl
10:31:37,717 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ProdutoServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ProdutoServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.impl.ProdutoServiceImpl
        java:app/sifec-cdt-ejb/ProdutoServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.impl.ProdutoServiceImpl
        java:module/ProdutoServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.impl.ProdutoServiceImpl
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ProdutoServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.IProdutoService
        java:app/sifec-cdt-ejb/ProdutoServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.IProdutoService
        java:module/ProdutoServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.IProdutoService
10:31:37,717 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ArredondamentoServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ArredondamentoServiceImpl!br.gov.caixa.sicdt.ejb.service.arredondamento.impl.ArredondamentoServiceImpl
        java:app/sifec-cdt-ejb/ArredondamentoServiceImpl!br.gov.caixa.sicdt.ejb.service.arredondamento.impl.ArredondamentoServiceImpl
        java:module/ArredondamentoServiceImpl!br.gov.caixa.sicdt.ejb.service.arredondamento.impl.ArredondamentoServiceImpl
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ArredondamentoServiceImpl!br.gov.caixa.sicdt.ejb.service.arredondamento.IArredondamentoService
        java:app/sifec-cdt-ejb/ArredondamentoServiceImpl!br.gov.caixa.sicdt.ejb.service.arredondamento.IArredondamentoService
        java:module/ArredondamentoServiceImpl!br.gov.caixa.sicdt.ejb.service.arredondamento.IArredondamentoService
10:31:37,717 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ContaMovimentoFinanceiroImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ContaMovimentoFinanceiroImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.ContaMovimentoFinanceiroImpl
        java:app/sifec-cdt-ejb/ContaMovimentoFinanceiroImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.ContaMovimentoFinanceiroImpl
        java:module/ContaMovimentoFinanceiroImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.ContaMovimentoFinanceiroImpl
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ContaMovimentoFinanceiroImpl!br.gov.caixa.sicdt.ejb.service.contrato.IContaMovimentoFinanceiroService
        java:app/sifec-cdt-ejb/ContaMovimentoFinanceiroImpl!br.gov.caixa.sicdt.ejb.service.contrato.IContaMovimentoFinanceiroService
        java:module/ContaMovimentoFinanceiroImpl!br.gov.caixa.sicdt.ejb.service.contrato.IContaMovimentoFinanceiroService
10:31:37,717 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SIICOServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/SIICOServiceImpl!br.gov.caixa.sicdt.ejb.service.siico.impl.SIICOServiceImpl
        java:app/sifec-cdt-ejb/SIICOServiceImpl!br.gov.caixa.sicdt.ejb.service.siico.impl.SIICOServiceImpl
        java:module/SIICOServiceImpl!br.gov.caixa.sicdt.ejb.service.siico.impl.SIICOServiceImpl
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/SIICOServiceImpl!br.gov.caixa.sicdt.ejb.service.siico.ISIICOService
        java:app/sifec-cdt-ejb/SIICOServiceImpl!br.gov.caixa.sicdt.ejb.service.siico.ISIICOService
        java:module/SIICOServiceImpl!br.gov.caixa.sicdt.ejb.service.siico.ISIICOService
10:31:37,717 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'LiberacaoContratoServiceApiImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/LiberacaoContratoServiceApiImpl!br.gov.caixa.sicdt.ejb.service.api.ILiberacaoContratoServiceApi
        java:app/sifec-cdt-ejb/LiberacaoContratoServiceApiImpl!br.gov.caixa.sicdt.ejb.service.api.ILiberacaoContratoServiceApi
        java:module/LiberacaoContratoServiceApiImpl!br.gov.caixa.sicdt.ejb.service.api.ILiberacaoContratoServiceApi
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/LiberacaoContratoServiceApiImpl!br.gov.caixa.sicdt.ejb.service.api.impl.LiberacaoContratoServiceApiImpl
        java:app/sifec-cdt-ejb/LiberacaoContratoServiceApiImpl!br.gov.caixa.sicdt.ejb.service.api.impl.LiberacaoContratoServiceApiImpl
        java:module/LiberacaoContratoServiceApiImpl!br.gov.caixa.sicdt.ejb.service.api.impl.LiberacaoContratoServiceApiImpl
10:31:37,717 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'IndexadorServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/IndexadorServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.impl.IndexadorServiceImpl
        java:app/sifec-cdt-ejb/IndexadorServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.impl.IndexadorServiceImpl
        java:module/IndexadorServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.impl.IndexadorServiceImpl
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/IndexadorServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.IIndexadorService
        java:app/sifec-cdt-ejb/IndexadorServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.IIndexadorService
        java:module/IndexadorServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.IIndexadorService
10:31:37,717 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ApropriacaoIncorporacaoJurosServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ApropriacaoIncorporacaoJurosServiceImpl!br.gov.caixa.sicdt.ejb.service.relatorio.IApropriacaoIncorporacaoJurosService
        java:app/sifec-cdt-ejb/ApropriacaoIncorporacaoJurosServiceImpl!br.gov.caixa.sicdt.ejb.service.relatorio.IApropriacaoIncorporacaoJurosService
        java:module/ApropriacaoIncorporacaoJurosServiceImpl!br.gov.caixa.sicdt.ejb.service.relatorio.IApropriacaoIncorporacaoJurosService
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ApropriacaoIncorporacaoJurosServiceImpl
        java:app/sifec-cdt-ejb/ApropriacaoIncorporacaoJurosServiceImpl
10:31:37,717 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DominioCacheService' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/DominioCacheService!br.gov.caixa.sicdt.ejb.repository.impl.DominioCacheService
        java:app/sifec-cdt-ejb/DominioCacheService!br.gov.caixa.sicdt.ejb.repository.impl.DominioCacheService
        java:module/DominioCacheService!br.gov.caixa.sicdt.ejb.repository.impl.DominioCacheService
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/DominioCacheService
        java:app/sifec-cdt-ejb/DominioCacheService
10:31:37,718 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'InternalNativeServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/InternalNativeServiceImpl!br.gov.caixa.sicdt.ejb.service.internal.IInternalNativeService
        java:app/sifec-cdt-ejb/InternalNativeServiceImpl!br.gov.caixa.sicdt.ejb.service.internal.IInternalNativeService
        java:module/InternalNativeServiceImpl!br.gov.caixa.sicdt.ejb.service.internal.IInternalNativeService
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/InternalNativeServiceImpl!br.gov.caixa.sicdt.ejb.service.internal.impl.InternalNativeServiceImpl
        java:app/sifec-cdt-ejb/InternalNativeServiceImpl!br.gov.caixa.sicdt.ejb.service.internal.impl.InternalNativeServiceImpl
        java:module/InternalNativeServiceImpl!br.gov.caixa.sicdt.ejb.service.internal.impl.InternalNativeServiceImpl
10:31:37,718 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'InformacaoAdicionalRepositoryImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/InformacaoAdicionalRepositoryImpl!br.gov.caixa.sicdt.ejb.repository.impl.InformacaoAdicionalRepositoryImpl
        java:app/sifec-cdt-ejb/InformacaoAdicionalRepositoryImpl!br.gov.caixa.sicdt.ejb.repository.impl.InformacaoAdicionalRepositoryImpl
        java:module/InformacaoAdicionalRepositoryImpl!br.gov.caixa.sicdt.ejb.repository.impl.InformacaoAdicionalRepositoryImpl
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/InformacaoAdicionalRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.InformacaoAdicionalRepository
        java:app/sifec-cdt-ejb/InformacaoAdicionalRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.InformacaoAdicionalRepository
        java:module/InformacaoAdicionalRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.InformacaoAdicionalRepository
10:31:37,718 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ValorRenegociadoRepositoryImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ValorRenegociadoRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.ValorRenegociadoRepository
        java:app/sifec-cdt-ejb/ValorRenegociadoRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.ValorRenegociadoRepository
        java:module/ValorRenegociadoRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.ValorRenegociadoRepository
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ValorRenegociadoRepositoryImpl
        java:app/sifec-cdt-ejb/ValorRenegociadoRepositoryImpl
10:31:37,718 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AssinaturaContabilRepositoryImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/AssinaturaContabilRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.AssinaturaContabilRepository
        java:app/sifec-cdt-ejb/AssinaturaContabilRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.AssinaturaContabilRepository
        java:module/AssinaturaContabilRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.AssinaturaContabilRepository
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/AssinaturaContabilRepositoryImpl
        java:app/sifec-cdt-ejb/AssinaturaContabilRepositoryImpl
10:31:37,718 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DemonstrativoSaldoServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/DemonstrativoSaldoServiceImpl!br.gov.caixa.sicdt.ejb.service.relatorio.IDemonstrativoSaldoService
        java:app/sifec-cdt-ejb/DemonstrativoSaldoServiceImpl!br.gov.caixa.sicdt.ejb.service.relatorio.IDemonstrativoSaldoService
        java:module/DemonstrativoSaldoServiceImpl!br.gov.caixa.sicdt.ejb.service.relatorio.IDemonstrativoSaldoService
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/DemonstrativoSaldoServiceImpl
        java:app/sifec-cdt-ejb/DemonstrativoSaldoServiceImpl
10:31:37,718 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'MarcaRepositoryImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/MarcaRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.MarcaRepository
        java:app/sifec-cdt-ejb/MarcaRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.MarcaRepository
        java:module/MarcaRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.MarcaRepository
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/MarcaRepositoryImpl
        java:app/sifec-cdt-ejb/MarcaRepositoryImpl
10:31:37,718 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'IndicadorEconomicoServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/IndicadorEconomicoServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.impl.IndicadorEconomicoServiceImpl
        java:app/sifec-cdt-ejb/IndicadorEconomicoServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.impl.IndicadorEconomicoServiceImpl
        java:module/IndicadorEconomicoServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.impl.IndicadorEconomicoServiceImpl
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/IndicadorEconomicoServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.IIndicadorEconomicoService
        java:app/sifec-cdt-ejb/IndicadorEconomicoServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.IIndicadorEconomicoService
        java:module/IndicadorEconomicoServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.IIndicadorEconomicoService
10:31:37,718 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'FiltroContratoServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/FiltroContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.FiltroContratoServiceImpl
        java:app/sifec-cdt-ejb/FiltroContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.FiltroContratoServiceImpl
        java:module/FiltroContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.FiltroContratoServiceImpl
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/FiltroContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IFiltroContratoService
        java:app/sifec-cdt-ejb/FiltroContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IFiltroContratoService
        java:module/FiltroContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IFiltroContratoService
10:31:37,718 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DetalheXMLInterfaceServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/DetalheXMLInterfaceServiceImpl!br.gov.caixa.sicdt.ejb.service.interfaces.IDetalheXMLInterfaceService
        java:app/sifec-cdt-ejb/DetalheXMLInterfaceServiceImpl!br.gov.caixa.sicdt.ejb.service.interfaces.IDetalheXMLInterfaceService
        java:module/DetalheXMLInterfaceServiceImpl!br.gov.caixa.sicdt.ejb.service.interfaces.IDetalheXMLInterfaceService
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/DetalheXMLInterfaceServiceImpl
        java:app/sifec-cdt-ejb/DetalheXMLInterfaceServiceImpl
10:31:37,718 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'CronogramaServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/CronogramaServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.ICronogramaService
        java:app/sifec-cdt-ejb/CronogramaServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.ICronogramaService
        java:module/CronogramaServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.ICronogramaService
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/CronogramaServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.CronogramaServiceImpl
        java:app/sifec-cdt-ejb/CronogramaServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.CronogramaServiceImpl
        java:module/CronogramaServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.CronogramaServiceImpl
10:31:37,718 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SiicoRepositoryImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/SiicoRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.SiicoRepository
        java:app/sifec-cdt-ejb/SiicoRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.SiicoRepository
        java:module/SiicoRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.SiicoRepository
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/SiicoRepositoryImpl
        java:app/sifec-cdt-ejb/SiicoRepositoryImpl
10:31:37,718 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SistemaOrigemServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/SistemaOrigemServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.ISistemaOrigemService
        java:app/sifec-cdt-ejb/SistemaOrigemServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.ISistemaOrigemService
        java:module/SistemaOrigemServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.ISistemaOrigemService
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/SistemaOrigemServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.impl.SistemaOrigemServiceImpl
        java:app/sifec-cdt-ejb/SistemaOrigemServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.impl.SistemaOrigemServiceImpl
        java:module/SistemaOrigemServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.impl.SistemaOrigemServiceImpl
10:31:37,718 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'CaracteristicaServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/CaracteristicaServiceImpl!br.gov.caixa.sicdt.ejb.service.caracteristica.impl.CaracteristicaServiceImpl
        java:app/sifec-cdt-ejb/CaracteristicaServiceImpl!br.gov.caixa.sicdt.ejb.service.caracteristica.impl.CaracteristicaServiceImpl
        java:module/CaracteristicaServiceImpl!br.gov.caixa.sicdt.ejb.service.caracteristica.impl.CaracteristicaServiceImpl
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/CaracteristicaServiceImpl!br.gov.caixa.sicdt.ejb.service.caracteristica.ICaracteristicaService
        java:app/sifec-cdt-ejb/CaracteristicaServiceImpl!br.gov.caixa.sicdt.ejb.service.caracteristica.ICaracteristicaService
        java:module/CaracteristicaServiceImpl!br.gov.caixa.sicdt.ejb.service.caracteristica.ICaracteristicaService
10:31:37,718 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ModalidadeOperacaoServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ModalidadeOperacaoServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.impl.ModalidadeOperacaoServiceImpl
        java:app/sifec-cdt-ejb/ModalidadeOperacaoServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.impl.ModalidadeOperacaoServiceImpl
        java:module/ModalidadeOperacaoServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.impl.ModalidadeOperacaoServiceImpl
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ModalidadeOperacaoServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.IModalidadeOperacaoService
        java:app/sifec-cdt-ejb/ModalidadeOperacaoServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.IModalidadeOperacaoService
        java:module/ModalidadeOperacaoServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.IModalidadeOperacaoService
10:31:37,718 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DominioEvolucaoRepositoryImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/DominioEvolucaoRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.DominioEvolucaoRepository
        java:app/sifec-cdt-ejb/DominioEvolucaoRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.DominioEvolucaoRepository
        java:module/DominioEvolucaoRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.DominioEvolucaoRepository
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/DominioEvolucaoRepositoryImpl
        java:app/sifec-cdt-ejb/DominioEvolucaoRepositoryImpl
10:31:37,718 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'MovimentoLoteCoreServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/MovimentoLoteCoreServiceImpl!br.gov.caixa.sicdt.ejb.service.calculo.MovimentoLoteCoreServiceImpl
        java:app/sifec-cdt-ejb/MovimentoLoteCoreServiceImpl!br.gov.caixa.sicdt.ejb.service.calculo.MovimentoLoteCoreServiceImpl
        java:module/MovimentoLoteCoreServiceImpl!br.gov.caixa.sicdt.ejb.service.calculo.MovimentoLoteCoreServiceImpl
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/MovimentoLoteCoreServiceImpl
        java:app/sifec-cdt-ejb/MovimentoLoteCoreServiceImpl
10:31:37,718 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'FiltroMovimentoAcertoContratoServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/FiltroMovimentoAcertoContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IFiltroMovimentoAcertoContratoService
        java:app/sifec-cdt-ejb/FiltroMovimentoAcertoContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IFiltroMovimentoAcertoContratoService
        java:module/FiltroMovimentoAcertoContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IFiltroMovimentoAcertoContratoService
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/FiltroMovimentoAcertoContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.FiltroMovimentoAcertoContratoServiceImpl
        java:app/sifec-cdt-ejb/FiltroMovimentoAcertoContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.FiltroMovimentoAcertoContratoServiceImpl
        java:module/FiltroMovimentoAcertoContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.FiltroMovimentoAcertoContratoServiceImpl
10:31:37,718 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SimuladorParcelaFuturaCoreServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/SimuladorParcelaFuturaCoreServiceImpl!br.gov.caixa.sicdt.ejb.service.calculo.SimuladorParcelaFuturaCoreServiceImpl
        java:app/sifec-cdt-ejb/SimuladorParcelaFuturaCoreServiceImpl!br.gov.caixa.sicdt.ejb.service.calculo.SimuladorParcelaFuturaCoreServiceImpl
        java:module/SimuladorParcelaFuturaCoreServiceImpl!br.gov.caixa.sicdt.ejb.service.calculo.SimuladorParcelaFuturaCoreServiceImpl
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/SimuladorParcelaFuturaCoreServiceImpl
        java:app/sifec-cdt-ejb/SimuladorParcelaFuturaCoreServiceImpl
10:31:37,718 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DetalheContratoServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/DetalheContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IDetalheContratoService
        java:app/sifec-cdt-ejb/DetalheContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IDetalheContratoService
        java:module/DetalheContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IDetalheContratoService
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/DetalheContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.DetalheContratoServiceImpl
        java:app/sifec-cdt-ejb/DetalheContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.DetalheContratoServiceImpl
        java:module/DetalheContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.DetalheContratoServiceImpl
10:31:37,719 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AssinaturaInterfaceServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/AssinaturaInterfaceServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.impl.AssinaturaInterfaceServiceImpl
        java:app/sifec-cdt-ejb/AssinaturaInterfaceServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.impl.AssinaturaInterfaceServiceImpl
        java:module/AssinaturaInterfaceServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.impl.AssinaturaInterfaceServiceImpl
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/AssinaturaInterfaceServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.IAssinaturaInterfaceService
        java:app/sifec-cdt-ejb/AssinaturaInterfaceServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.IAssinaturaInterfaceService
        java:module/AssinaturaInterfaceServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.IAssinaturaInterfaceService
10:31:37,719 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'MovimentoFinanceiroRepositoryImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/MovimentoFinanceiroRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.MovimentoFinanceiroRepository
        java:app/sifec-cdt-ejb/MovimentoFinanceiroRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.MovimentoFinanceiroRepository
        java:module/MovimentoFinanceiroRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.MovimentoFinanceiroRepository
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/MovimentoFinanceiroRepositoryImpl
        java:app/sifec-cdt-ejb/MovimentoFinanceiroRepositoryImpl
10:31:37,719 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ContratoRenegociadoServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ContratoRenegociadoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IRenegociacaoService
        java:app/sifec-cdt-ejb/ContratoRenegociadoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IRenegociacaoService
        java:module/ContratoRenegociadoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.IRenegociacaoService
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ContratoRenegociadoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.ContratoRenegociadoServiceImpl
        java:app/sifec-cdt-ejb/ContratoRenegociadoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.ContratoRenegociadoServiceImpl
        java:module/ContratoRenegociadoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.impl.ContratoRenegociadoServiceImpl
10:31:37,719 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'RelatoriosOperacionaisServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/RelatoriosOperacionaisServiceImpl!br.gov.caixa.sicdt.ejb.service.relatorio.impl.RelatoriosOperacionaisServiceImpl
        java:app/sifec-cdt-ejb/RelatoriosOperacionaisServiceImpl!br.gov.caixa.sicdt.ejb.service.relatorio.impl.RelatoriosOperacionaisServiceImpl
        java:module/RelatoriosOperacionaisServiceImpl!br.gov.caixa.sicdt.ejb.service.relatorio.impl.RelatoriosOperacionaisServiceImpl
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/RelatoriosOperacionaisServiceImpl!br.gov.caixa.sicdt.ejb.service.relatorio.IRelatoriosOperacionais
        java:app/sifec-cdt-ejb/RelatoriosOperacionaisServiceImpl!br.gov.caixa.sicdt.ejb.service.relatorio.IRelatoriosOperacionais
        java:module/RelatoriosOperacionaisServiceImpl!br.gov.caixa.sicdt.ejb.service.relatorio.IRelatoriosOperacionais
10:31:37,719 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'RelatorioSinafServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/RelatorioSinafServiceImpl!br.gov.caixa.sicdt.ejb.service.relatorio.IRelatorioSinafService
        java:app/sifec-cdt-ejb/RelatorioSinafServiceImpl!br.gov.caixa.sicdt.ejb.service.relatorio.IRelatorioSinafService
        java:module/RelatorioSinafServiceImpl!br.gov.caixa.sicdt.ejb.service.relatorio.IRelatorioSinafService
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/RelatorioSinafServiceImpl
        java:app/sifec-cdt-ejb/RelatorioSinafServiceImpl
10:31:37,719 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'RelatorioExtratoImpostoRendaServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/RelatorioExtratoImpostoRendaServiceImpl!br.gov.caixa.sicdt.ejb.service.relatorio.IRelatorioExtratoImpostoRendaService
        java:app/sifec-cdt-ejb/RelatorioExtratoImpostoRendaServiceImpl!br.gov.caixa.sicdt.ejb.service.relatorio.IRelatorioExtratoImpostoRendaService
        java:module/RelatorioExtratoImpostoRendaServiceImpl!br.gov.caixa.sicdt.ejb.service.relatorio.IRelatorioExtratoImpostoRendaService
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/RelatorioExtratoImpostoRendaServiceImpl
        java:app/sifec-cdt-ejb/RelatorioExtratoImpostoRendaServiceImpl
10:31:37,719 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ManutencaoContratoServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ManutencaoContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.manutencao.IManutencaoContratoService
        java:app/sifec-cdt-ejb/ManutencaoContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.manutencao.IManutencaoContratoService
        java:module/ManutencaoContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.manutencao.IManutencaoContratoService
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ManutencaoContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.manutencao.impl.ManutencaoContratoServiceImpl
        java:app/sifec-cdt-ejb/ManutencaoContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.manutencao.impl.ManutencaoContratoServiceImpl
        java:module/ManutencaoContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.contrato.manutencao.impl.ManutencaoContratoServiceImpl
10:31:37,719 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'RenegociacaoServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/RenegociacaoServiceImpl!br.gov.caixa.sicdt.ejb.service.renegociacao.IRenegociacaoService
        java:app/sifec-cdt-ejb/RenegociacaoServiceImpl!br.gov.caixa.sicdt.ejb.service.renegociacao.IRenegociacaoService
        java:module/RenegociacaoServiceImpl!br.gov.caixa.sicdt.ejb.service.renegociacao.IRenegociacaoService
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/RenegociacaoServiceImpl!br.gov.caixa.sicdt.ejb.service.renegociacao.impl.RenegociacaoServiceImpl
        java:app/sifec-cdt-ejb/RenegociacaoServiceImpl!br.gov.caixa.sicdt.ejb.service.renegociacao.impl.RenegociacaoServiceImpl
        java:module/RenegociacaoServiceImpl!br.gov.caixa.sicdt.ejb.service.renegociacao.impl.RenegociacaoServiceImpl
10:31:37,719 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ParcelaRepositoryImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ParcelaRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.ParcelaRepository
        java:app/sifec-cdt-ejb/ParcelaRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.ParcelaRepository
        java:module/ParcelaRepositoryImpl!br.gov.caixa.sicdt.core.calculo.repository.ParcelaRepository
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/ParcelaRepositoryImpl
        java:app/sifec-cdt-ejb/ParcelaRepositoryImpl
10:31:37,719 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'MovimentoFinanceiroCoreServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/MovimentoFinanceiroCoreServiceImpl!br.gov.caixa.sicdt.ejb.service.calculo.MovimentoFinanceiroCoreServiceImpl
        java:app/sifec-cdt-ejb/MovimentoFinanceiroCoreServiceImpl!br.gov.caixa.sicdt.ejb.service.calculo.MovimentoFinanceiroCoreServiceImpl
        java:module/MovimentoFinanceiroCoreServiceImpl!br.gov.caixa.sicdt.ejb.service.calculo.MovimentoFinanceiroCoreServiceImpl
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/MovimentoFinanceiroCoreServiceImpl
        java:app/sifec-cdt-ejb/MovimentoFinanceiroCoreServiceImpl
10:31:37,719 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'FiltroArquivosInterfacesServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/FiltroArquivosInterfacesServiceImpl!br.gov.caixa.sicdt.ejb.service.processo.operacional.IFiltroArquivosInterfacesService
        java:app/sifec-cdt-ejb/FiltroArquivosInterfacesServiceImpl!br.gov.caixa.sicdt.ejb.service.processo.operacional.IFiltroArquivosInterfacesService
        java:module/FiltroArquivosInterfacesServiceImpl!br.gov.caixa.sicdt.ejb.service.processo.operacional.IFiltroArquivosInterfacesService
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/FiltroArquivosInterfacesServiceImpl!br.gov.caixa.sicdt.ejb.service.processo.operacional.impl.FiltroArquivosInterfacesServiceImpl
        java:app/sifec-cdt-ejb/FiltroArquivosInterfacesServiceImpl!br.gov.caixa.sicdt.ejb.service.processo.operacional.impl.FiltroArquivosInterfacesServiceImpl
        java:module/FiltroArquivosInterfacesServiceImpl!br.gov.caixa.sicdt.ejb.service.processo.operacional.impl.FiltroArquivosInterfacesServiceImpl
10:31:37,719 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'RecalculoContratoServiceImpl' na unidade de implementação 'subdeployment "sifec-cdt-ejb.jar" of deployment "sifec-cdt-3.24.3.004.ear"' são como segue:
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/RecalculoContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.impl.RecalculoContratoServiceImpl
        java:app/sifec-cdt-ejb/RecalculoContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.impl.RecalculoContratoServiceImpl
        java:module/RecalculoContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.impl.RecalculoContratoServiceImpl
        java:global/sifec-cdt-3.24.3.004/sifec-cdt-ejb/RecalculoContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.IRecalculoContratoService
        java:app/sifec-cdt-ejb/RecalculoContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.IRecalculoContratoService
        java:module/RecalculoContratoServiceImpl!br.gov.caixa.sicdt.ejb.service.manter.IRecalculoContratoService
10:31:37,729 INFO  [org.jipijapa] (MSC service thread 1-6) JIPIORMV53020253: Cache de segundo nível habilitado para sifec-cdt-3.24.3.004.ear#SIEMP-PU
10:31:37,731 INFO  [org.jipijapa] (MSC service thread 1-6) JIPIORMV53020253: Cache de segundo nível habilitado para sifec-cdt-3.24.3.004.ear#CDT-PU
10:31:37,731 INFO  [org.jipijapa] (MSC service thread 1-6) JIPIORMV53020253: Cache de segundo nível habilitado para sifec-cdt-3.24.3.004.ear#fecDS
10:31:37,834 INFO  [org.jipijapa] (MSC service thread 1-3) JIPIORMV53020253: Cache de segundo nível habilitado para sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU
10:31:37,846 WARN  [org.jboss.as.ejb3] (MSC service thread 1-8) WFLYEJB0131: Jakarta Enterprise Beans br.gov.caixa.sicdt.ejb.service.contrato.impl.MarcaServiceImpl não devem ter um método final ou estático (recuperarDataSemHora)
10:31:37,846 WARN  [org.jboss.as.ejb3] (MSC service thread 1-8) WFLYEJB0131: Jakarta Enterprise Beans br.gov.caixa.sicdt.ejb.service.contrato.impl.MarcaServiceImpl não devem ter um método final ou estático (recuperarDataHoraMeioDia)
10:31:37,856 INFO  [org.jipijapa] (MSC service thread 1-7) JIPIORMV53020253: Cache de segundo nível habilitado para sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU
10:31:37,865 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 124) WFLYJPA0010: Iniciando unidade de persistência (fase 2 de 2) Serviço'sifec-cdt-3.24.3.004.ear#SIEMP-PU'
10:31:37,865 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 121) WFLYJPA0010: Iniciando unidade de persistência (fase 2 de 2) Serviço'sifec-cdt-3.24.3.004.ear#CDT-PU'
10:31:37,865 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 126) WFLYJPA0010: Iniciando unidade de persistência (fase 2 de 2) Serviço'sifec-cdt-3.24.3.004.ear#fecDS'
10:31:37,893 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 125) WFLYJPA0010: Iniciando unidade de persistência (fase 2 de 2) Serviço'sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU'
10:31:37,895 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 122) WFLYJPA0010: Iniciando unidade de persistência (fase 2 de 2) Serviço'sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU'
10:31:38,017 WARN  [org.jboss.as.ejb3] (MSC service thread 1-8) WFLYEJB0131: Jakarta Enterprise Beans br.gov.caixa.sicdt.ejb.service.arredondamento.impl.ArredondamentoServiceImpl não devem ter um método final ou estático (getArredondamentoType)
10:31:38,017 WARN  [org.jboss.as.ejb3] (MSC service thread 1-8) WFLYEJB0131: Jakarta Enterprise Beans br.gov.caixa.sicdt.ejb.service.arredondamento.impl.ArredondamentoServiceImpl não devem ter um método final ou estático (setArredondamentoType)
10:31:41,066 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.dominio.Evento inicializado a partir do recipiente hibernate
10:31:41,067 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.Evento inicializado a partir do recipiente hibernate
10:31:41,066 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.ProcessoOperacional inicializado a partir do recipiente hibernate
10:31:41,069 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.dominio.Evento-pending-puts inicializado a partir do recipiente hibernate
10:31:41,070 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.Evento-pending-puts inicializado a partir do recipiente hibernate
10:31:41,072 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.dominio.Dominio inicializado a partir do recipiente hibernate
10:31:41,072 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.ProcessoOperacional-pending-puts inicializado a partir do recipiente hibernate
10:31:41,073 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.dominio.Dominio-pending-puts inicializado a partir do recipiente hibernate
10:31:41,075 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoRecebimentoLiberacao inicializado a partir do recipiente hibernate
10:31:41,075 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.indicadoreconomico.DetalheIndicadorEconomico inicializado a partir do recipiente hibernate
10:31:41,077 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.FormaRecebimento inicializado a partir do recipiente hibernate
10:31:41,077 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoRecebimentoLiberacao-pending-puts inicializado a partir do recipiente hibernate
10:31:41,077 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.indicadoreconomico.DetalheIndicadorEconomico-pending-puts inicializado a partir do recipiente hibernate
10:31:41,079 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.FormaRecebimento-pending-puts inicializado a partir do recipiente hibernate
10:31:41,079 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.indicadoreconomico.FonteIndicadorEconomico inicializado a partir do recipiente hibernate
10:31:41,079 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.Dominio inicializado a partir do recipiente hibernate
10:31:41,081 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.assinatura.contabil.AssinaturaContabil inicializado a partir do recipiente hibernate
10:31:41,081 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.indicadoreconomico.FonteIndicadorEconomico-pending-puts inicializado a partir do recipiente hibernate
10:31:41,081 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.Dominio-pending-puts inicializado a partir do recipiente hibernate
10:31:41,083 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.assinatura.contabil.AssinaturaContabil-pending-puts inicializado a partir do recipiente hibernate
10:31:41,083 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoRecebimentoLiberacao inicializado a partir do recipiente hibernate
10:31:41,083 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.CaracteristicaEvlco inicializado a partir do recipiente hibernate
10:31:41,084 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoRecebimentoLiberacao-pending-puts inicializado a partir do recipiente hibernate
10:31:41,085 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.CaracteristicaEvlco-pending-puts inicializado a partir do recipiente hibernate
10:31:41,085 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.produto.Produto inicializado a partir do recipiente hibernate
10:31:41,086 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoEvento inicializado a partir do recipiente hibernate
10:31:41,087 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.produto.Produto-pending-puts inicializado a partir do recipiente hibernate
10:31:41,087 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoSaldo inicializado a partir do recipiente hibernate
10:31:41,088 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoEvento-pending-puts inicializado a partir do recipiente hibernate
10:31:41,089 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.modalidadebacen.ModalidadeOperacaoBacen inicializado a partir do recipiente hibernate
10:31:41,090 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoSaldo-pending-puts inicializado a partir do recipiente hibernate
10:31:41,090 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.dominio.ProcessoOperacional inicializado a partir do recipiente hibernate
10:31:41,091 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.modalidadebacen.ModalidadeOperacaoBacen-pending-puts inicializado a partir do recipiente hibernate
10:31:41,092 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.dominio.ProcessoOperacional-pending-puts inicializado a partir do recipiente hibernate
10:31:41,093 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoReembolso inicializado a partir do recipiente hibernate
10:31:41,094 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.produto.Produto inicializado a partir do recipiente hibernate
10:31:41,095 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoReembolso-pending-puts inicializado a partir do recipiente hibernate
10:31:41,096 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.produto.Produto-pending-puts inicializado a partir do recipiente hibernate
10:31:41,096 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoParcela inicializado a partir do recipiente hibernate
10:31:41,097 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoUnidade inicializado a partir do recipiente hibernate
10:31:41,097 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.dominio.CaracteristicaEvlco inicializado a partir do recipiente hibernate
10:31:41,099 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoUnidade-pending-puts inicializado a partir do recipiente hibernate
10:31:41,099 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.dominio.CaracteristicaEvlco-pending-puts inicializado a partir do recipiente hibernate
10:31:41,101 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.CaracteristicaEvlco inicializado a partir do recipiente hibernate
10:31:41,101 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.situacao.Situacao inicializado a partir do recipiente hibernate
10:31:41,102 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoParcela-pending-puts inicializado a partir do recipiente hibernate
10:31:41,103 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.situacao.Situacao-pending-puts inicializado a partir do recipiente hibernate
10:31:41,103 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.CaracteristicaEvlco-pending-puts inicializado a partir do recipiente hibernate
10:31:41,104 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.situacao.TipoSituacao inicializado a partir do recipiente hibernate
10:31:41,106 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.ProcessoOperacional inicializado a partir do recipiente hibernate
10:31:41,106 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.situacao.TipoSituacao-pending-puts inicializado a partir do recipiente hibernate
10:31:41,107 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.modalidadebacen.CaracteristicaModalidadeOperacao inicializado a partir do recipiente hibernate
10:31:41,108 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoDominio inicializado a partir do recipiente hibernate
10:31:41,110 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoDominio-pending-puts inicializado a partir do recipiente hibernate
10:31:41,111 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.modalidadebacen.CaracteristicaModalidadeOperacao-pending-puts inicializado a partir do recipiente hibernate
10:31:41,111 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.ProcessoOperacional-pending-puts inicializado a partir do recipiente hibernate
10:31:41,111 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoCaracteristica inicializado a partir do recipiente hibernate
10:31:41,113 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoCaracteristica-pending-puts inicializado a partir do recipiente hibernate
10:31:41,114 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.conta.TipoConta inicializado a partir do recipiente hibernate
10:31:41,116 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.conta.OrigemContaCaixa inicializado a partir do recipiente hibernate
10:31:41,116 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.assinatura.contabil.AssinaturaContabilProduto inicializado a partir do recipiente hibernate
10:31:41,117 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.conta.OrigemContaCaixa-pending-puts inicializado a partir do recipiente hibernate
10:31:41,119 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.dominio.DominioEvolucao inicializado a partir do recipiente hibernate
10:31:41,119 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.conta.TipoConta-pending-puts inicializado a partir do recipiente hibernate
10:31:41,120 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.dominio.DominioEvolucao-pending-puts inicializado a partir do recipiente hibernate
10:31:41,120 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.assinatura.contabil.AssinaturaContabilProduto-pending-puts inicializado a partir do recipiente hibernate
10:31:41,121 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.DominioEvolucao inicializado a partir do recipiente hibernate
10:31:41,122 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.assinatura.contabil.AssinaturaContabilProduto inicializado a partir do recipiente hibernate
10:31:41,123 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.assinatura.contabil.AssinaturaContabilProduto-pending-puts inicializado a partir do recipiente hibernate
10:31:41,123 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoEvento inicializado a partir do recipiente hibernate
10:31:41,125 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.DominioEvolucao-pending-puts inicializado a partir do recipiente hibernate
10:31:41,125 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoLiberacao inicializado a partir do recipiente hibernate
10:31:41,125 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoEvento-pending-puts inicializado a partir do recipiente hibernate
10:31:41,126 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoLiberacao-pending-puts inicializado a partir do recipiente hibernate
10:31:41,126 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.indicadoreconomico.DetalheIndicadorEconomico inicializado a partir do recipiente hibernate
10:31:41,127 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.situacao.Situacao inicializado a partir do recipiente hibernate
10:31:41,128 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.modalidadebacen.CaracteristicaModalidadeOperacao inicializado a partir do recipiente hibernate
10:31:41,128 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.indicadoreconomico.DetalheIndicadorEconomico-pending-puts inicializado a partir do recipiente hibernate
10:31:41,129 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.situacao.Situacao-pending-puts inicializado a partir do recipiente hibernate
10:31:41,129 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.modalidadebacen.CaracteristicaModalidadeOperacao-pending-puts inicializado a partir do recipiente hibernate
10:31:41,130 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoEvento inicializado a partir do recipiente hibernate
10:31:41,131 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.conta.TipoConta inicializado a partir do recipiente hibernate
10:31:41,131 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoEvento-pending-puts inicializado a partir do recipiente hibernate
10:31:41,131 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.indicadoreconomico.DetalheIndicadorEconomico inicializado a partir do recipiente hibernate
10:31:41,132 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.conta.TipoConta-pending-puts inicializado a partir do recipiente hibernate
10:31:41,133 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoSaldo inicializado a partir do recipiente hibernate
10:31:41,133 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.indicadoreconomico.DetalheIndicadorEconomico-pending-puts inicializado a partir do recipiente hibernate
10:31:41,133 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoReembolso inicializado a partir do recipiente hibernate
10:31:41,134 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoSaldo-pending-puts inicializado a partir do recipiente hibernate
10:31:41,135 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoReembolso-pending-puts inicializado a partir do recipiente hibernate
10:31:41,135 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoLiberacao inicializado a partir do recipiente hibernate
10:31:41,136 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.indicadoreconomico.FonteIndicadorEconomico inicializado a partir do recipiente hibernate
10:31:41,136 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.assinatura.operacional.AssinaturaOperacionalProduto inicializado a partir do recipiente hibernate
10:31:41,137 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoLiberacao-pending-puts inicializado a partir do recipiente hibernate
10:31:41,137 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.indicadoreconomico.FonteIndicadorEconomico-pending-puts inicializado a partir do recipiente hibernate
10:31:41,137 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.assinatura.operacional.AssinaturaOperacionalProduto-pending-puts inicializado a partir do recipiente hibernate
10:31:41,138 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoReembolso inicializado a partir do recipiente hibernate
10:31:41,139 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoLiberacao inicializado a partir do recipiente hibernate
10:31:41,139 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoUnidade inicializado a partir do recipiente hibernate
10:31:41,140 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoReembolso-pending-puts inicializado a partir do recipiente hibernate
10:31:41,140 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoLiberacao-pending-puts inicializado a partir do recipiente hibernate
10:31:41,140 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoUnidade-pending-puts inicializado a partir do recipiente hibernate
10:31:41,141 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.situacao.TipoSituacao inicializado a partir do recipiente hibernate
10:31:41,142 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.assinatura.operacional.AssinaturaOperacional inicializado a partir do recipiente hibernate
10:31:41,142 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.conta.OrigemContaCaixa inicializado a partir do recipiente hibernate
10:31:41,143 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.situacao.TipoSituacao-pending-puts inicializado a partir do recipiente hibernate
10:31:41,143 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.assinatura.operacional.AssinaturaOperacional-pending-puts inicializado a partir do recipiente hibernate
10:31:41,144 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.conta.OrigemContaCaixa-pending-puts inicializado a partir do recipiente hibernate
10:31:41,144 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.assinatura.contabil.AssinaturaContabilEvento inicializado a partir do recipiente hibernate
10:31:41,145 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.assinatura.contabil.AssinaturaContabil inicializado a partir do recipiente hibernate
10:31:41,145 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.assinatura.operacional.AssinaturaOperacionalDominio inicializado a partir do recipiente hibernate
10:31:41,146 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.assinatura.contabil.AssinaturaContabil-pending-puts inicializado a partir do recipiente hibernate
10:31:41,146 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.assinatura.contabil.AssinaturaContabilEvento-pending-puts inicializado a partir do recipiente hibernate
10:31:41,147 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.assinatura.operacional.AssinaturaOperacionalDominio-pending-puts inicializado a partir do recipiente hibernate
10:31:41,147 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoParcela inicializado a partir do recipiente hibernate
10:31:41,148 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.DominioEvolucao inicializado a partir do recipiente hibernate
10:31:41,148 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoCaracteristica inicializado a partir do recipiente hibernate
10:31:41,149 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoParcela-pending-puts inicializado a partir do recipiente hibernate
10:31:41,149 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.DominioEvolucao-pending-puts inicializado a partir do recipiente hibernate
10:31:41,150 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoCaracteristica-pending-puts inicializado a partir do recipiente hibernate
10:31:41,159 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.modalidadebacen.ModalidadeOperacaoBacen inicializado a partir do recipiente hibernate
10:31:41,160 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoDominio inicializado a partir do recipiente hibernate
10:31:41,163 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.modalidadebacen.ModalidadeOperacaoBacen-pending-puts inicializado a partir do recipiente hibernate
10:31:41,164 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.assinatura.operacional.AssinaturaOperacionalDominio inicializado a partir do recipiente hibernate
10:31:41,166 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.assinatura.operacional.AssinaturaOperacionalDominio-pending-puts inicializado a partir do recipiente hibernate
10:31:41,166 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoDominio-pending-puts inicializado a partir do recipiente hibernate
10:31:41,166 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.modalidadebacen.CaracteristicaModalidadeOperacao inicializado a partir do recipiente hibernate
10:31:41,167 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.assinatura.contabil.AssinaturaContabilEvento inicializado a partir do recipiente hibernate
10:31:41,167 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.modalidadebacen.CaracteristicaModalidadeOperacao-pending-puts inicializado a partir do recipiente hibernate
10:31:41,167 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.Evento inicializado a partir do recipiente hibernate
10:31:41,169 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.Evento-pending-puts inicializado a partir do recipiente hibernate
10:31:41,169 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.conta.TipoConta inicializado a partir do recipiente hibernate
10:31:41,169 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.assinatura.contabil.AssinaturaContabilEvento-pending-puts inicializado a partir do recipiente hibernate
10:31:41,170 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.situacao.Situacao inicializado a partir do recipiente hibernate
10:31:41,170 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.conta.TipoConta-pending-puts inicializado a partir do recipiente hibernate
10:31:41,171 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.dominio.FormaRecebimento inicializado a partir do recipiente hibernate
10:31:41,171 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.situacao.Situacao-pending-puts inicializado a partir do recipiente hibernate
10:31:41,172 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoDominio inicializado a partir do recipiente hibernate
10:31:41,173 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoParcela inicializado a partir do recipiente hibernate
10:31:41,173 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.dominio.FormaRecebimento-pending-puts inicializado a partir do recipiente hibernate
10:31:41,173 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoDominio-pending-puts inicializado a partir do recipiente hibernate
10:31:41,174 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoParcela-pending-puts inicializado a partir do recipiente hibernate
10:31:41,175 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoUnidade inicializado a partir do recipiente hibernate
10:31:41,175 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoSaldo inicializado a partir do recipiente hibernate
10:31:41,175 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.assinatura.contabil.AssinaturaContabilProduto inicializado a partir do recipiente hibernate
10:31:41,176 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoUnidade-pending-puts inicializado a partir do recipiente hibernate
10:31:41,176 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 121) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoSaldo-pending-puts inicializado a partir do recipiente hibernate
10:31:41,177 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.assinatura.contabil.AssinaturaContabilProduto-pending-puts inicializado a partir do recipiente hibernate
10:31:41,177 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.assinatura.operacional.AssinaturaOperacionalDominio inicializado a partir do recipiente hibernate
10:31:41,178 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.assinatura.contabil.AssinaturaContabilEvento inicializado a partir do recipiente hibernate
10:31:41,178 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.assinatura.operacional.AssinaturaOperacionalDominio-pending-puts inicializado a partir do recipiente hibernate
10:31:41,179 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.assinatura.contabil.AssinaturaContabilEvento-pending-puts inicializado a partir do recipiente hibernate
10:31:41,180 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.produto.Produto inicializado a partir do recipiente hibernate
10:31:41,181 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.assinatura.operacional.AssinaturaOperacionalProduto inicializado a partir do recipiente hibernate
10:31:41,182 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.produto.Produto-pending-puts inicializado a partir do recipiente hibernate
10:31:41,182 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.assinatura.operacional.AssinaturaOperacionalProduto-pending-puts inicializado a partir do recipiente hibernate
10:31:41,183 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.FormaRecebimento inicializado a partir do recipiente hibernate
10:31:41,184 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.assinatura.operacional.AssinaturaOperacional inicializado a partir do recipiente hibernate
10:31:41,184 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.FormaRecebimento-pending-puts inicializado a partir do recipiente hibernate
10:31:41,186 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.indicadoreconomico.FonteIndicadorEconomico inicializado a partir do recipiente hibernate
10:31:41,186 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.assinatura.operacional.AssinaturaOperacional-pending-puts inicializado a partir do recipiente hibernate
10:31:41,187 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.indicadoreconomico.FonteIndicadorEconomico-pending-puts inicializado a partir do recipiente hibernate
10:31:41,188 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoCaracteristica inicializado a partir do recipiente hibernate
10:31:41,189 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.situacao.TipoSituacao inicializado a partir do recipiente hibernate
10:31:41,189 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoCaracteristica-pending-puts inicializado a partir do recipiente hibernate
10:31:41,191 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.modalidadebacen.ModalidadeOperacaoBacen inicializado a partir do recipiente hibernate
10:31:41,192 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.modalidadebacen.ModalidadeOperacaoBacen-pending-puts inicializado a partir do recipiente hibernate
10:31:41,192 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.situacao.TipoSituacao-pending-puts inicializado a partir do recipiente hibernate
10:31:41,193 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoRecebimentoLiberacao inicializado a partir do recipiente hibernate
10:31:41,194 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.assinatura.operacional.AssinaturaOperacionalProduto inicializado a partir do recipiente hibernate
10:31:41,195 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.assinatura.operacional.AssinaturaOperacionalProduto-pending-puts inicializado a partir do recipiente hibernate
10:31:41,195 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.TipoRecebimentoLiberacao-pending-puts inicializado a partir do recipiente hibernate
10:31:41,196 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.Dominio inicializado a partir do recipiente hibernate
10:31:41,197 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.assinatura.contabil.AssinaturaContabil inicializado a partir do recipiente hibernate
10:31:41,198 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 125) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sicdt-orig-api-rest.war#CDT-PU.br.gov.caixa.sicdt.entity.dominio.Dominio-pending-puts inicializado a partir do recipiente hibernate
10:31:41,199 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.assinatura.contabil.AssinaturaContabil-pending-puts inicializado a partir do recipiente hibernate
10:31:41,202 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.assinatura.operacional.AssinaturaOperacional inicializado a partir do recipiente hibernate
10:31:41,203 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.assinatura.operacional.AssinaturaOperacional-pending-puts inicializado a partir do recipiente hibernate
10:31:41,206 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.conta.OrigemContaCaixa inicializado a partir do recipiente hibernate
10:31:41,208 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 122) WFLYCLINF0002: Cache sifec-cdt-3.24.3.004.ear/sifec-cdt-web.war#CDT-PU.br.gov.caixa.sicdt.entity.conta.OrigemContaCaixa-pending-puts inicializado a partir do recipiente hibernate
10:31:43,280 WARN  [io.undertow.servlet] (ServerService Thread Pool -- 143) UT015020: Path /sicdt/swagger/convert is secured for some HTTP methods, however it is not secured for [TRACE, HEAD, DELETE, GET, CONNECT, OPTIONS, PUT]
10:31:43,280 WARN  [io.undertow.servlet] (ServerService Thread Pool -- 143) UT015020: Path /sicdt/swagger.json is secured for some HTTP methods, however it is not secured for [TRACE, HEAD, DELETE, CONNECT, OPTIONS, PUT]
10:31:43,280 WARN  [io.undertow.servlet] (ServerService Thread Pool -- 143) UT015020: Path /sicdt/* is secured for some HTTP methods, however it is not secured for [TRACE, HEAD, DELETE, CONNECT, OPTIONS, PUT]
10:31:43,384 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 127) RESTEASY002225: Deploying javax.ws.rs.core.Application: class br.gov.caixa.sicdt.web.application.JaxRsApplication$Proxy$_$$_WeldClientProxy
10:31:43,466 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 127) WFLYUT0021: Contexto web registrado: '/sifec-cdt-web' para servidor 'default-server'
10:31:43,821 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 143) RESTEASY002225: Deploying javax.ws.rs.core.Application: class br.gov.caixa.sicdt.originador.api.JaxRsActivator$Proxy$_$$_WeldClientProxy
10:31:43,896 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 143) RESTEASY002205: Adding provider class io.swagger.jaxrs.listing.SwaggerSerializers from Application class br.gov.caixa.sicdt.originador.api.JaxRsActivator$Proxy$_$$_WeldClientProxy
10:31:43,896 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 143) RESTEASY002200: Adding class resource br.gov.caixa.sicdt.originador.api.rest.ContratoAgregadoRest from Application class br.gov.caixa.sicdt.originador.api.JaxRsActivator$Proxy$_$$_WeldClientProxy
10:31:43,896 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 143) RESTEASY002200: Adding class resource br.gov.caixa.sicdt.originador.api.rest.SaqueAniversarioRest from Application class br.gov.caixa.sicdt.originador.api.JaxRsActivator$Proxy$_$$_WeldClientProxy
10:31:43,896 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 143) RESTEASY002200: Adding class resource io.swagger.jaxrs.listing.ApiListingResource from Application class br.gov.caixa.sicdt.originador.api.JaxRsActivator$Proxy$_$$_WeldClientProxy
10:31:43,896 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 143) RESTEASY002200: Adding class resource br.gov.caixa.sicdt.originador.api.rest.SwaggerConverterRest from Application class br.gov.caixa.sicdt.originador.api.JaxRsActivator$Proxy$_$$_WeldClientProxy
10:31:43,896 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 143) RESTEASY002200: Adding class resource br.gov.caixa.sicdt.originador.api.rest.ContratoAgregadorRest from Application class br.gov.caixa.sicdt.originador.api.JaxRsActivator$Proxy$_$$_WeldClientProxy
10:31:43,896 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 143) RESTEASY002205: Adding provider class br.gov.caixa.sicdt.originador.api.rest.exception.BodyContentParseExceptionMapper from Application class br.gov.caixa.sicdt.originador.api.JaxRsActivator$Proxy$_$$_WeldClientProxy
10:31:43,896 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 143) RESTEASY002200: Adding class resource br.gov.caixa.sicdt.originador.api.rest.ContratoRest from Application class br.gov.caixa.sicdt.originador.api.JaxRsActivator$Proxy$_$$_WeldClientProxy
10:31:43,896 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 143) RESTEASY002200: Adding class resource br.gov.caixa.sicdt.originador.api.rest.DetalheContratoRest from Application class br.gov.caixa.sicdt.originador.api.JaxRsActivator$Proxy$_$$_WeldClientProxy
10:31:43,896 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 143) RESTEASY002200: Adding class resource br.gov.caixa.sicdt.originador.api.rest.RenegociacaoRest from Application class br.gov.caixa.sicdt.originador.api.JaxRsActivator$Proxy$_$$_WeldClientProxy
10:31:43,896 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 143) RESTEASY002200: Adding class resource br.gov.caixa.sicdt.originador.api.rest.SimuladorEvolucaoContratoRest from Application class br.gov.caixa.sicdt.originador.api.JaxRsActivator$Proxy$_$$_WeldClientProxy
10:31:45,898 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 143) WFLYUT0021: Contexto web registrado: '/sicdt-orig-api-rest' para servidor 'default-server'
10:31:49,516 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 109) WFLYSRV0016: A implantação "sifec-cdt-3.24.3.003.ear" foi substituída pela implantação "sifec-cdt-3.24.3.004.ear"




[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]# curl -s -o /tmp/sifec-cdt-3.24.3.004.ear http://binario.caixa:8081/repository/releases/br/gov/caixa/sicdt/sifec-cdt/3.24.3.004/sifec-cdt-3.24.3.004.ear && ls -l /tmp/sifec-cdt-3.24.3.004.ear
-rw-r--r-- 1 root root 106315028 Nov 12 10:30 /tmp/sifec-cdt-3.24.3.004.ear
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]# /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=localhost:9999                                                                                              [domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] deploy /tmp/sifec-cdt-3.24.3.004.ear --name=SICDT-FEC --runtime-name=sifec-cdt-3.24.3.004.ear --force
[domain@localhost:9999 /]




