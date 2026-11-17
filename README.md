
You have access to 1004 projects, the list has been suppressed. You can list all projects with 'oc projects'

Using project "default".
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc,deploy -n sibec-des | grep -i micro
deploymentconfig.apps.openshift.io/sibec-micro-des               87         1         1
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc sibec-micro-des -n sibec-des -o jsonpath='{..image}{"\n"}'
default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.2 default-route-openshift-image-registry.apps.produtos4.caixa/openshift/ubi:9.3-1552 default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sibec-micro:1.7.2.2
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc set env dc/sibec-micro-des -n sibec-des --list | grep -iE "sisgr|portal"
SISGR_API_MP_REST_URL=https://webservice.acessoseguro.sso.des.intra.corerj.caixa/sisgrauth-web
-sh-4.2$ oc logs dc/sibec-micro-des -n sibec-des --since=24h | grep -iE -A15 "parametros-portal|parametroPortal|sisgr" | head -60
log4j:WARN No appenders could be found for logger (br.gov.caixa.sisgr.parametros.SisgrParametros).
log4j:WARN Please initialize the log4j system properly.
log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.
[Hibernate]
    select
        ua1_0.CO_USUARIO,
        ua1_0.TS_ULTIMO_ACESSO
    from
        BECVWS69_ULTIMO_ACESSO ua1_0
    where
        ua1_0.CO_USUARIO=?
[Hibernate]
    update
        BECVWS69_ULTIMO_ACESSO
    set
        TS_ULTIMO_ACESSO=?
--
2026-11-16 13:31:46,618 ERROR [br.gov.caixa.sibec.autorizacao.api.service.AutorizacaoService] (executor-thread-12) Erro de autorização do portal: br.gov.caixa.sibec.autorizacao.api.exception.AutorizacaoPortalException: parametroPortal é obrigatório
        at br.gov.caixa.sibec.autorizacao.api.service.AutorizacaoService.recuperarParametroPortal(AutorizacaoService.java:155)
        at br.gov.caixa.sibec.autorizacao.api.service.AutorizacaoService.getParametros(AutorizacaoService.java:30)
        at br.gov.caixa.sibec.autorizacao.api.service.AutorizacaoService_ClientProxy.getParametros(Unknown Source)
        at br.gov.caixa.sibec.api.domain.service.ClientAutorizacaoServiceImpl.getParametros(ClientAutorizacaoServiceImpl.java:37)
        at br.gov.caixa.sibec.api.domain.service.ClientAutorizacaoServiceImpl_ClientProxy.getParametros(Unknown Source)
        at br.gov.caixa.sibec.api.controllers.AutorizacaoController.carregarParametrosPortal(AutorizacaoController.java:50)
        at br.gov.caixa.sibec.api.controllers.AutorizacaoController_ClientProxy.carregarParametrosPortal(Unknown Source)
        at br.gov.caixa.sibec.api.controllers.AutorizacaoController$quarkusrestinvoker$carregarParametrosPortal_fb3c4a8073eafa7d17d487aed78d998f7c5a4b90.invoke(Unknown Source)
        at org.jboss.resteasy.reactive.server.handlers.InvocationHandler.handle(InvocationHandler.java:29)
        at io.quarkus.resteasy.reactive.server.runtime.QuarkusResteasyReactiveRequestContext.invokeHandler(QuarkusResteasyReactiveRequestContext.java:195)
        at org.jboss.resteasy.reactive.common.core.AbstractResteasyReactiveContext.run(AbstractResteasyReactiveContext.java:150)
        at io.quarkus.vertx.core.runtime.VertxCoreRecorder$15.runWith(VertxCoreRecorder.java:695)
        at org.jboss.threads.EnhancedQueueExecutor$Task.doRunWith(EnhancedQueueExecutor.java:2651)
        at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2630)
        at org.jboss.threads.EnhancedQueueExecutor.runThreadBody(EnhancedQueueExecutor.java:1622)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1589)
--
2026-11-16 13:31:46,621 ERROR [br.gov.caixa.sibec.api.exception.SIBECExceptionMapper] (executor-thread-12) Falha ao executar operação: br.gov.caixa.sibec.autorizacao.api.exception.AutorizacaoPortalException: parametroPortal é obrigatório
        at br.gov.caixa.sibec.autorizacao.api.service.AutorizacaoService.recuperarParametroPortal(AutorizacaoService.java:155)
        at br.gov.caixa.sibec.autorizacao.api.service.AutorizacaoService.getParametros(AutorizacaoService.java:30)
        at br.gov.caixa.sibec.autorizacao.api.service.AutorizacaoService_ClientProxy.getParametros(Unknown Source)
        at br.gov.caixa.sibec.api.domain.service.ClientAutorizacaoServiceImpl.getParametros(ClientAutorizacaoServiceImpl.java:37)
        at br.gov.caixa.sibec.api.domain.service.ClientAutorizacaoServiceImpl_ClientProxy.getParametros(Unknown Source)
        at br.gov.caixa.sibec.api.controllers.AutorizacaoController.carregarParametrosPortal(AutorizacaoController.java:50)
        at br.gov.caixa.sibec.api.controllers.AutorizacaoController_ClientProxy.carregarParametrosPortal(Unknown Source)
        at br.gov.caixa.sibec.api.controllers.AutorizacaoController$quarkusrestinvoker$carregarParametrosPortal_fb3c4a8073eafa7d17d487aed78d998f7c5a4b90.invoke(Unknown Source)
        at org.jboss.resteasy.reactive.server.handlers.InvocationHandler.handle(InvocationHandler.java:29)
        at io.quarkus.resteasy.reactive.server.runtime.QuarkusResteasyReactiveRequestContext.invokeHandler(QuarkusResteasyReactiveRequestContext.java:195)
        at org.jboss.resteasy.reactive.common.core.AbstractResteasyReactiveContext.run(AbstractResteasyReactiveContext.java:150)
        at io.quarkus.vertx.core.runtime.VertxCoreRecorder$15.runWith(VertxCoreRecorder.java:695)
        at org.jboss.threads.EnhancedQueueExecutor$Task.doRunWith(EnhancedQueueExecutor.java:2651)
        at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2630)
        at org.jboss.threads.EnhancedQueueExecutor.runThreadBody(EnhancedQueueExecutor.java:1622)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1589)
--
        at br.gov.caixa.sibec.autorizacao.api.service.ParametroPortalHeaderService.obterDosHeaders(ParametroPortalHeaderService.java:36)
        at br.gov.caixa.sibec.autorizacao.api.service.ParametroPortalHeaderService_ClientProxy.obterDosHeaders(Unknown Source)
        at br.gov.caixa.sibec.api.domain.service.ClientAutorizacaoServiceImpl.obterParametroPortalDosHeaders(ClientAutorizacaoServiceImpl.java:132)
        at br.gov.caixa.sibec.api.domain.service.ClientAutorizacaoServiceImpl.invalidarCertificacao(ClientAutorizacaoServiceImpl.java:89)
        at br.gov.caixa.sibec.api.domain.service.ClientAutorizacaoServiceImpl_ClientProxy.invalidarCertificacao(Unknown Source)
        at br.gov.caixa.sibec.api.controllers.AutorizacaoController.invalidarCertificacao(AutorizacaoController.java:99)
        at br.gov.caixa.sibec.api.controllers.AutorizacaoController_ClientProxy.invalidarCertificacao(Unknown Source)
-sh-4.2$






eu acho que acabei abrindu uma nova conversa mais nossa ultima analsie foi essa


À CAIXA

Prezados

Análise concluída – Login CAIXA / SIBEC3 (DES)

Os erros relatados na página de CPF (Uncaught ReferenceError: waitOFDB is not defined e HTTP 400 no favicon.ico) vêm do tema da própria página do Login CAIXA (realm internet, logindes.caixa.gov.br). Não são gerados pelo SIBEC3 e não impedem a autenticação.

Validação realizada: acesso a https://siepr-curso-bec3-frontend-des.apps.nprd.caixa com o CPF de teste 03848489074 (client cli-web-epr). O login no Login CAIXA foi concluído e o retorno ao SIBEC3 ocorreu normalmente, com o usuário identificado na tela e o token obtido com sucesso (HTTP 200).

Observação: depois do login, o SIBEC3 exibe “Usuário sem acesso ao sistema” porque as chamadas ao backend (parametros-portal, hora, invalidar) retornam HTTP 500 (“Parâmetro da certificação não informado no header”). Esse comportamento é do backend do SIEPR e não tem relação com o SSO. Identificamos que o siepr-backend-des está indisponível desde 13/11 por falha de autenticação no cofre de senhas (BeyondTrust), e que a origem do SIBEC3 não está liberada no CORS desse backend. Esses pontos devem ser tratados em demanda própria. 


A massa de dados citada pelo time (cadastro pendente em outro sistema) também deve ser concluída para o perfil de acesso.

Demanda encerrada.


Atenciosamente,

Jessé Mouta Pereira Batista
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD







