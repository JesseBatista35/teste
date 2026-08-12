-sh-4.2$ tail -f /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInNoTx(CMTTxInterceptor.java:232)
        ... 166 more
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
        at org.jboss.modules.ModuleClassLoader.findClass(ModuleClassLoader.java:255)
        at org.jboss.modules.ConcurrentClassLoader.performLoadClassUnchecked(ConcurrentClassLoader.java:410)
        at org.jboss.modules.ConcurrentClassLoader.performLoadClass(ConcurrentClassLoader.java:398)
        at org.jboss.modules.ConcurrentClassLoader.loadClass(ConcurrentClassLoader.java:116)
        ... 202 more

^C
-sh-4.2$ grep "16:33" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log
2026-08-12 16:33:24,980 INFO  [br.gov.caixa.sicmu.filtros.SicmuFiltroAcesso] (default task-1) usuario filtro: null
2026-08-12 16:33:25,354 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> ENTRADA.TPAMBIENTE=X1
2026-08-12 16:33:25,354 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> ENTRADA.SGAMBIENTE=X8
2026-08-12 16:33:25,354 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> ENTRADA.IDEMPRESA=X1
2026-08-12 16:33:25,354 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> ENTRADA.IDENTIFICADOR=X14
2026-08-12 16:33:25,354 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> ENTRADA.TPCREDENCIAL=N4
2026-08-12 16:33:25,354 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> ENTRADA.CODCREDENCIAL=X25
2026-08-12 16:33:25,354 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> ENTRADA.NIVELAUTENTICA=X2
2026-08-12 16:33:25,354 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> ENTRADA.CERTIFICACAO=X12
2026-08-12 16:33:25,354 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> ENTRADA.SISTEMA=X5
2026-08-12 16:33:25,354 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> ENTRADA.PROCESSO=X24
2026-08-12 16:33:25,354 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> ENTRADA.TPRECURSO=X15
2026-08-12 16:33:25,354 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> ENTRADA.RECURSO=X25
2026-08-12 16:33:25,354 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> ENTRADA.ABRANGENCIA=X2
2026-08-12 16:33:25,354 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> ENTRADA.EXECUTAVEL=X30
2026-08-12 16:33:25,354 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> ENTRADA.ACESSO=N1
2026-08-12 16:33:25,354 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> ENTRADA.IPUSU=X39
2026-08-12 16:33:25,354 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> SAIDA.TAM=N5
2026-08-12 16:33:25,354 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> SAIDA.CODRETORNO=N3
2026-08-12 16:33:25,354 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> SAIDA.MSGRETORNO=X100
2026-08-12 16:33:25,354 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> SAIDA.SUBROTINA=X8
2026-08-12 16:33:25,354 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> SAIDA.PONTOERRO=X9
2026-08-12 16:33:25,354 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> SAIDA.SINAL=X1
2026-08-12 16:33:25,354 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> SAIDA.SQLCODE=N4
2026-08-12 16:33:25,354 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> SAIDA.CODIGOEXECUTAVEL=X30
2026-08-12 16:33:25,354 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> SAIDA.CODIGOACESSO=N1
2026-08-12 16:33:25,354 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> SAIDA.CODABRANGENCIA=X2
2026-08-12 16:33:25,354 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> SAIDA.ICAVISO=X1
2026-08-12 16:33:25,365 ERROR [org.jboss.as.ejb3.invocation] (default task-1) WFLYEJB0034: A invocação de Jakarta Enterprise Beans falhou no componente ValidadorAcessoServiceBean para o método public boolean br.gov.caixa.sicmu.seguranca.service.ValidadorAcessoServiceBean.validaAcesso(br.gov.caixa.sicmu.seguranca.retorno.UsuarioSGR,java.lang.String) throws br.gov.caixa.sicmu.exceptions.SicmuException: javax.ejb.EJBException: WFLYEJB0442: Erro inesperado
2026-08-12 16:33:25,372 SEVERE [javax.enterprise.resource.webcontainer.jsf.application] (default task-1) Error Rendering View[/paginas/operacaoHabitacional/consultarOperacaoHabit.xhtml]: com.sun.faces.mgbean.ManagedBeanCreationException: Um erro ocorreu ao realizar a injeção de recurso no bean gerenciado consultaOperacaoHabitacionalBean
2026-08-12 16:33:25,374 ERROR [br.gov.caixa.sicmu.exception.handler.SicmuExceptionHandler] (default task-1) Ocorreu um erro na aplicação. Código do erro: 3278097998
2026-08-12 16:33:34,288 INFO  [br.gov.caixa.sicmu.filtros.SicmuFiltroAcesso] (default task-1) usuario filtro: C048546
2026-08-12 16:33:38,706 INFO  [br.gov.caixa.sicmu.filtros.SicmuFiltroAcesso] (default task-1) usuario filtro: C048546
2026-08-12 16:33:38,775 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> ENTRADA.TPAMBIENTE=X1
2026-08-12 16:33:38,775 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> ENTRADA.SGAMBIENTE=X8
2026-08-12 16:33:38,775 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> ENTRADA.IDEMPRESA=X1
2026-08-12 16:33:38,775 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> ENTRADA.IDENTIFICADOR=X14
2026-08-12 16:33:38,775 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> ENTRADA.TPCREDENCIAL=N4
2026-08-12 16:33:38,775 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> ENTRADA.CODCREDENCIAL=X25
2026-08-12 16:33:38,775 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> ENTRADA.NIVELAUTENTICA=X2
2026-08-12 16:33:38,775 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> ENTRADA.CERTIFICACAO=X12
2026-08-12 16:33:38,775 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> ENTRADA.SISTEMA=X5
2026-08-12 16:33:38,775 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> ENTRADA.PROCESSO=X24
2026-08-12 16:33:38,775 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> ENTRADA.TPRECURSO=X15
2026-08-12 16:33:38,775 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> ENTRADA.RECURSO=X25
2026-08-12 16:33:38,775 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> ENTRADA.ABRANGENCIA=X2
2026-08-12 16:33:38,775 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> ENTRADA.EXECUTAVEL=X30
2026-08-12 16:33:38,775 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> ENTRADA.ACESSO=N1
2026-08-12 16:33:38,775 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> ENTRADA.IPUSU=X39
2026-08-12 16:33:38,775 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> SAIDA.TAM=N5
2026-08-12 16:33:38,775 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> SAIDA.CODRETORNO=N3
2026-08-12 16:33:38,775 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> SAIDA.MSGRETORNO=X100
2026-08-12 16:33:38,775 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> SAIDA.SUBROTINA=X8
2026-08-12 16:33:38,775 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> SAIDA.PONTOERRO=X9
2026-08-12 16:33:38,775 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> SAIDA.SINAL=X1
2026-08-12 16:33:38,775 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> SAIDA.SQLCODE=N4
2026-08-12 16:33:38,775 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> SAIDA.CODIGOEXECUTAVEL=X30
2026-08-12 16:33:38,775 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> SAIDA.CODIGOACESSO=N1
2026-08-12 16:33:38,775 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> SAIDA.CODABRANGENCIA=X2
2026-08-12 16:33:38,775 INFO  [br.gov.caixa.sgr.publico.portal.comunicacao.bean.Controle] (default task-1) PROP ==> SAIDA.ICAVISO=X1
2026-08-12 16:33:38,776 ERROR [org.jboss.as.ejb3.invocation] (default task-1) WFLYEJB0034: A invocação de Jakarta Enterprise Beans falhou no componente ValidadorAcessoServiceBean para o método public boolean br.gov.caixa.sicmu.seguranca.service.ValidadorAcessoServiceBean.validaAcesso(br.gov.caixa.sicmu.seguranca.retorno.UsuarioSGR,java.lang.String) throws br.gov.caixa.sicmu.exceptions.SicmuException: javax.ejb.EJBException: WFLYEJB0442: Erro inesperado
2026-08-12 16:33:38,777 SEVERE [javax.enterprise.resource.webcontainer.jsf.application] (default task-1) Error Rendering View[/paginas/consultaEnvioArquivo/consultaEnvioArquivo.xhtml]: com.sun.faces.mgbean.ManagedBeanCreationException: Um erro ocorreu ao realizar a injeção de recurso no bean gerenciado consultaEnvioArquivoBean
2026-08-12 16:33:38,778 ERROR [br.gov.caixa.sicmu.exception.handler.SicmuExceptionHandler] (default task-1) Ocorreu um erro na aplicação. Código do erro: 3278098427
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep -B 2 -A 10 "16:3[0-9]" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | grep -i "error|exception|caused by"
-sh-4.2$
