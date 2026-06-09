-sh-4.2$ tail -500 /opt/jboss/jboss-eap/hc/log/servers/siosp_node1_lx099/server.log
2026-06-09 08:02:08,405 ERROR [org.jboss.modcluster] (UndertowEventHandlerAdapter - 1) MODCLUSTER000042: Error MEM sending STATUS command to SBRDEAPRLX052.extra.caixa.gov.br/10.116.98.52:6666, configuration will be reset: MEM: Can't read node with "sbrdeapllx099_habitacao:siosp_node1_lx099" JVMRoute
2026-06-09 12:02:05,017 ERROR [org.jboss.modcluster] (UndertowEventHandlerAdapter - 1) MODCLUSTER000042: Error MEM sending STATUS command to SBRDEAPRLX052.extra.caixa.gov.br/10.116.98.52:6666, configuration will be reset: MEM: Can't read node with "sbrdeapllx099_habitacao:siosp_node1_lx099" JVMRoute
2026-06-09 14:02:08,052 ERROR [org.jboss.modcluster] (UndertowEventHandlerAdapter - 1) MODCLUSTER000042: Error MEM sending STATUS command to SBRDEAPRLX052.extra.caixa.gov.br/10.116.98.52:6666, configuration will be reset: MEM: Can't read node with "sbrdeapllx099_habitacao:siosp_node1_lx099" JVMRoute
2026-06-09 14:08:12,511 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0027: Iniciando a implantação do "SIOSP" (runtime-name: "siosp-1.0.0.59-1.0.0.59-b370.ear")
2026-06-09 14:08:13,702 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0207: Inciando a subimplantação (runtime-name: "siosp-api.war")
2026-06-09 14:08:13,702 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0207: Inciando a subimplantação (runtime-name: "siosp-web.war")
2026-06-09 14:08:15,232 WARN  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0119: [EJB3.1 spec, section 4.9.2]  A classe da implementação do bean de sessão PRECISA ser publica, mas não abstrata ou final - o br.gov.caixa.siosp.cronogramacalculo.CronogramaCalculoAS não será considerado como um bean de sessão, uma vez uma vez que isto não satisfaz o seu requerimento
2026-06-09 14:08:15,248 INFO  [org.jboss.as.jpa] (MSC service thread 1-2) WFLYJPA0002: Leia a persistence.xml para OracleSiospDS
2026-06-09 14:08:15,355 INFO  [org.jboss.weld.deployer] (MSC service thread 1-7) WFLYWELD0003: Processamento da implantação weld siosp-1.0.0.59-1.0.0.59-b370.ear
2026-06-09 14:08:15,355 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 105) WFLYJPA0010: Iniciando unidade de persistência (fase 1 de 2) Serviço'siosp-1.0.0.59-1.0.0.59-b370.ear/siosp-api.war#OracleSiospDS'
2026-06-09 14:08:15,355 INFO  [org.hibernate.jpa.internal.util.LogHelper] (ServerService Thread Pool -- 105) HHH000204: Processing PersistenceUnitInfo [
        name: OracleSiospDS
        ...]
2026-06-09 14:08:15,359 INFO  [org.jboss.weld.deployer] (MSC service thread 1-7) WFLYWELD0003: Processamento da implantação weld siosp-web.war
2026-06-09 14:08:15,383 INFO  [org.jboss.keycloak] (MSC service thread 1-4) Keycloak subsystem override for deployment siosp-api.war
2026-06-09 14:08:15,383 INFO  [org.jboss.weld.deployer] (MSC service thread 1-4) WFLYWELD0003: Processamento da implantação weld siosp-api.war
2026-06-09 14:08:15,385 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para sessão bean chamada 'UsuarioFacade' na unidade de implementação 'subdeployment "siosp-api.war" of deployment "siosp-1.0.0.59-1.0.0.59-b370.ear"' são como segue:

        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/UsuarioFacade!br.gov.caixa.arquitetura.javaee.core.comum.seguranca.IUsuarioFacade
        java:app/siosp-api/UsuarioFacade!br.gov.caixa.arquitetura.javaee.core.comum.seguranca.IUsuarioFacade
        java:module/UsuarioFacade!br.gov.caixa.arquitetura.javaee.core.comum.seguranca.IUsuarioFacade
        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/UsuarioFacade
        java:app/siosp-api/UsuarioFacade
        java:module/UsuarioFacade

2026-06-09 14:08:15,385 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para sessão bean chamada 'NumeroOperacaoDeCreditoAS' na unidade de implementação 'subdeployment "siosp-api.war" of deployment "siosp-1.0.0.59-1.0.0.59-b370.ear"' são como segue:

        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/NumeroOperacaoDeCreditoAS!br.gov.caixa.auditoria.numerooperacao.INumeroOperacaoFacade
        java:app/siosp-api/NumeroOperacaoDeCreditoAS!br.gov.caixa.auditoria.numerooperacao.INumeroOperacaoFacade
        java:module/NumeroOperacaoDeCreditoAS!br.gov.caixa.auditoria.numerooperacao.INumeroOperacaoFacade
        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/NumeroOperacaoDeCreditoAS
        java:app/siosp-api/NumeroOperacaoDeCreditoAS
        java:module/NumeroOperacaoDeCreditoAS

2026-06-09 14:08:15,385 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para sessão bean chamada 'EstadoOperacaoAS' na unidade de implementação 'subdeployment "siosp-api.war" of deployment "siosp-1.0.0.59-1.0.0.59-b370.ear"' são como segue:

        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/EstadoOperacaoAS!br.gov.caixa.siosp.servicos.EstadoOperacaoAS
        java:app/siosp-api/EstadoOperacaoAS!br.gov.caixa.siosp.servicos.EstadoOperacaoAS
        java:module/EstadoOperacaoAS!br.gov.caixa.siosp.servicos.EstadoOperacaoAS
        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/EstadoOperacaoAS
        java:app/siosp-api/EstadoOperacaoAS
        java:module/EstadoOperacaoAS

2026-06-09 14:08:15,386 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para sessão bean chamada 'RemessaAS' na unidade de implementação 'subdeployment "siosp-api.war" of deployment "siosp-1.0.0.59-1.0.0.59-b370.ear"' são como segue:

        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/RemessaAS!br.gov.caixa.siosp.servicos.RemessaAS
        java:app/siosp-api/RemessaAS!br.gov.caixa.siosp.servicos.RemessaAS
        java:module/RemessaAS!br.gov.caixa.siosp.servicos.RemessaAS
        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/RemessaAS
        java:app/siosp-api/RemessaAS
        java:module/RemessaAS

2026-06-09 14:08:15,386 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para sessão bean chamada 'ErroAS' na unidade de implementação 'subdeployment "siosp-api.war" of deployment "siosp-1.0.0.59-1.0.0.59-b370.ear"' são como segue:

        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/ErroAS!br.gov.caixa.siosp.servicos.ErroAS
        java:app/siosp-api/ErroAS!br.gov.caixa.siosp.servicos.ErroAS
        java:module/ErroAS!br.gov.caixa.siosp.servicos.ErroAS
        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/ErroAS
        java:app/siosp-api/ErroAS
        java:module/ErroAS

2026-06-09 14:08:15,386 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para sessão bean chamada 'TipoArquivoAS' na unidade de implementação 'subdeployment "siosp-api.war" of deployment "siosp-1.0.0.59-1.0.0.59-b370.ear"' são como segue:

        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/TipoArquivoAS!br.gov.caixa.siosp.servicos.TipoArquivoAS
        java:app/siosp-api/TipoArquivoAS!br.gov.caixa.siosp.servicos.TipoArquivoAS
        java:module/TipoArquivoAS!br.gov.caixa.siosp.servicos.TipoArquivoAS
        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/TipoArquivoAS
        java:app/siosp-api/TipoArquivoAS
        java:module/TipoArquivoAS

2026-06-09 14:08:15,386 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para sessão bean chamada 'AuditoriaCampoAS' na unidade de implementação 'subdeployment "siosp-api.war" of deployment "siosp-1.0.0.59-1.0.0.59-b370.ear"' são como segue:

        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/AuditoriaCampoAS!br.gov.caixa.siosp.servicos.AuditoriaCampoAS
        java:app/siosp-api/AuditoriaCampoAS!br.gov.caixa.siosp.servicos.AuditoriaCampoAS
        java:module/AuditoriaCampoAS!br.gov.caixa.siosp.servicos.AuditoriaCampoAS
        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/AuditoriaCampoAS
        java:app/siosp-api/AuditoriaCampoAS
        java:module/AuditoriaCampoAS

2026-06-09 14:08:15,386 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para sessão bean chamada 'OrgaoAS' na unidade de implementação 'subdeployment "siosp-api.war" of deployment "siosp-1.0.0.59-1.0.0.59-b370.ear"' são como segue:

        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/OrgaoAS!br.gov.caixa.siosp.servicos.OrgaoAS
        java:app/siosp-api/OrgaoAS!br.gov.caixa.siosp.servicos.OrgaoAS
        java:module/OrgaoAS!br.gov.caixa.siosp.servicos.OrgaoAS
        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/OrgaoAS
        java:app/siosp-api/OrgaoAS
        java:module/OrgaoAS

2026-06-09 14:08:15,386 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para sessão bean chamada 'CalculoPriceAS' na unidade de implementação 'subdeployment "siosp-api.war" of deployment "siosp-1.0.0.59-1.0.0.59-b370.ear"' são como segue:

        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/CalculoPriceAS!br.gov.caixa.siosp.cronogramacalculo.CalculoPriceAS
        java:app/siosp-api/CalculoPriceAS!br.gov.caixa.siosp.cronogramacalculo.CalculoPriceAS
        java:module/CalculoPriceAS!br.gov.caixa.siosp.cronogramacalculo.CalculoPriceAS
        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/CalculoPriceAS
        java:app/siosp-api/CalculoPriceAS
        java:module/CalculoPriceAS

2026-06-09 14:08:15,386 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para sessão bean chamada 'HistoricoOperacaoCreditoAS' na unidade de implementação 'subdeployment "siosp-api.war" of deployment "siosp-1.0.0.59-1.0.0.59-b370.ear"' são como segue:

        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/HistoricoOperacaoCreditoAS!br.gov.caixa.siosp.servicos.HistoricoOperacaoCreditoAS
        java:app/siosp-api/HistoricoOperacaoCreditoAS!br.gov.caixa.siosp.servicos.HistoricoOperacaoCreditoAS
        java:module/HistoricoOperacaoCreditoAS!br.gov.caixa.siosp.servicos.HistoricoOperacaoCreditoAS
        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/HistoricoOperacaoCreditoAS
        java:app/siosp-api/HistoricoOperacaoCreditoAS
        java:module/HistoricoOperacaoCreditoAS

2026-06-09 14:08:15,386 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para sessão bean chamada 'UnidadeAS' na unidade de implementação 'subdeployment "siosp-api.war" of deployment "siosp-1.0.0.59-1.0.0.59-b370.ear"' são como segue:

        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/UnidadeAS!br.gov.caixa.siosp.servicos.UnidadeAS
        java:app/siosp-api/UnidadeAS!br.gov.caixa.siosp.servicos.UnidadeAS
        java:module/UnidadeAS!br.gov.caixa.siosp.servicos.UnidadeAS
        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/UnidadeAS
        java:app/siosp-api/UnidadeAS
        java:module/UnidadeAS

2026-06-09 14:08:15,386 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para sessão bean chamada 'OperacaoCreditoRelatorioAS' na unidade de implementação 'subdeployment "siosp-api.war" of deployment "siosp-1.0.0.59-1.0.0.59-b370.ear"' são como segue:

        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/OperacaoCreditoRelatorioAS!br.gov.caixa.relatorio.OperacaoCreditoRelatorioAS
        java:app/siosp-api/OperacaoCreditoRelatorioAS!br.gov.caixa.relatorio.OperacaoCreditoRelatorioAS
        java:module/OperacaoCreditoRelatorioAS!br.gov.caixa.relatorio.OperacaoCreditoRelatorioAS
        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/OperacaoCreditoRelatorioAS
        java:app/siosp-api/OperacaoCreditoRelatorioAS
        java:module/OperacaoCreditoRelatorioAS

2026-06-09 14:08:15,386 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para sessão bean chamada 'IntegracaoAS' na unidade de implementação 'subdeployment "siosp-api.war" of deployment "siosp-1.0.0.59-1.0.0.59-b370.ear"' são como segue:

        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/IntegracaoAS!br.gov.caixa.siosp.servicos.IntegracaoAS
        java:app/siosp-api/IntegracaoAS!br.gov.caixa.siosp.servicos.IntegracaoAS
        java:module/IntegracaoAS!br.gov.caixa.siosp.servicos.IntegracaoAS
        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/IntegracaoAS
        java:app/siosp-api/IntegracaoAS
        java:module/IntegracaoAS

2026-06-09 14:08:15,386 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para sessão bean chamada 'CampoAS' na unidade de implementação 'subdeployment "siosp-api.war" of deployment "siosp-1.0.0.59-1.0.0.59-b370.ear"' são como segue:

        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/CampoAS!br.gov.caixa.siosp.servicos.CampoAS
        java:app/siosp-api/CampoAS!br.gov.caixa.siosp.servicos.CampoAS
        java:module/CampoAS!br.gov.caixa.siosp.servicos.CampoAS
        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/CampoAS
        java:app/siosp-api/CampoAS
        java:module/CampoAS

2026-06-09 14:08:15,386 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para sessão bean chamada 'RenovacaoContratoAS' na unidade de implementação 'subdeployment "siosp-api.war" of deployment "siosp-1.0.0.59-1.0.0.59-b370.ear"' são como segue:

        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/RenovacaoContratoAS!br.gov.caixa.siosp.servicos.RenovacaoContratoAS
        java:app/siosp-api/RenovacaoContratoAS!br.gov.caixa.siosp.servicos.RenovacaoContratoAS
        java:module/RenovacaoContratoAS!br.gov.caixa.siosp.servicos.RenovacaoContratoAS
        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/RenovacaoContratoAS
        java:app/siosp-api/RenovacaoContratoAS
        java:module/RenovacaoContratoAS

2026-06-09 14:08:15,386 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para sessão bean chamada 'PeriodicidadeAS' na unidade de implementação 'subdeployment "siosp-api.war" of deployment "siosp-1.0.0.59-1.0.0.59-b370.ear"' são como segue:

        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/PeriodicidadeAS!br.gov.caixa.siosp.servicos.PeriodicidadeAS
        java:app/siosp-api/PeriodicidadeAS!br.gov.caixa.siosp.servicos.PeriodicidadeAS
        java:module/PeriodicidadeAS!br.gov.caixa.siosp.servicos.PeriodicidadeAS
        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/PeriodicidadeAS
        java:app/siosp-api/PeriodicidadeAS
        java:module/PeriodicidadeAS

2026-06-09 14:08:15,386 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para sessão bean chamada 'ModalidadeAS' na unidade de implementação 'subdeployment "siosp-api.war" of deployment "siosp-1.0.0.59-1.0.0.59-b370.ear"' são como segue:

        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/ModalidadeAS!br.gov.caixa.siosp.servicos.ModalidadeAS
        java:app/siosp-api/ModalidadeAS!br.gov.caixa.siosp.servicos.ModalidadeAS
        java:module/ModalidadeAS!br.gov.caixa.siosp.servicos.ModalidadeAS
        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/ModalidadeAS
        java:app/siosp-api/ModalidadeAS
        java:module/ModalidadeAS

2026-06-09 14:08:15,386 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para sessão bean chamada 'AuditAS' na unidade de implementação 'subdeployment "siosp-api.war" of deployment "siosp-1.0.0.59-1.0.0.59-b370.ear"' são como segue:

        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/AuditAS!br.gov.caixa.auditoria.listener.AuditAS
        java:app/siosp-api/AuditAS!br.gov.caixa.auditoria.listener.AuditAS
        java:module/AuditAS!br.gov.caixa.auditoria.listener.AuditAS
        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/AuditAS
        java:app/siosp-api/AuditAS
        java:module/AuditAS

2026-06-09 14:08:15,386 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para sessão bean chamada 'OperacaoErroAS' na unidade de implementação 'subdeployment "siosp-api.war" of deployment "siosp-1.0.0.59-1.0.0.59-b370.ear"' são como segue:

        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/OperacaoErroAS!br.gov.caixa.siosp.servicos.OperacaoErroAS
        java:app/siosp-api/OperacaoErroAS!br.gov.caixa.siosp.servicos.OperacaoErroAS
        java:module/OperacaoErroAS!br.gov.caixa.siosp.servicos.OperacaoErroAS
        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/OperacaoErroAS
        java:app/siosp-api/OperacaoErroAS
        java:module/OperacaoErroAS

2026-06-09 14:08:15,386 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para sessão bean chamada 'TipoEventoAS' na unidade de implementação 'subdeployment "siosp-api.war" of deployment "siosp-1.0.0.59-1.0.0.59-b370.ear"' são como segue:

        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/TipoEventoAS!br.gov.caixa.siosp.servicos.TipoEventoAS
        java:app/siosp-api/TipoEventoAS!br.gov.caixa.siosp.servicos.TipoEventoAS
        java:module/TipoEventoAS!br.gov.caixa.siosp.servicos.TipoEventoAS
        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/TipoEventoAS
        java:app/siosp-api/TipoEventoAS
        java:module/TipoEventoAS

2026-06-09 14:08:15,386 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para sessão bean chamada 'CalculoSacAS' na unidade de implementação 'subdeployment "siosp-api.war" of deployment "siosp-1.0.0.59-1.0.0.59-b370.ear"' são como segue:

        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/CalculoSacAS!br.gov.caixa.siosp.cronogramacalculo.CalculoSacAS
        java:app/siosp-api/CalculoSacAS!br.gov.caixa.siosp.cronogramacalculo.CalculoSacAS
        java:module/CalculoSacAS!br.gov.caixa.siosp.cronogramacalculo.CalculoSacAS
        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/CalculoSacAS
        java:app/siosp-api/CalculoSacAS
        java:module/CalculoSacAS

2026-06-09 14:08:15,386 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para sessão bean chamada 'RepactuacaoContratoAS' na unidade de implementação 'subdeployment "siosp-api.war" of deployment "siosp-1.0.0.59-1.0.0.59-b370.ear"' são como segue:

        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/RepactuacaoContratoAS!br.gov.caixa.siosp.servicos.RepactuacaoContratoAS
        java:app/siosp-api/RepactuacaoContratoAS!br.gov.caixa.siosp.servicos.RepactuacaoContratoAS
        java:module/RepactuacaoContratoAS!br.gov.caixa.siosp.servicos.RepactuacaoContratoAS
        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/RepactuacaoContratoAS
        java:app/siosp-api/RepactuacaoContratoAS
        java:module/RepactuacaoContratoAS

2026-06-09 14:08:15,386 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para sessão bean chamada 'TabelaAS' na unidade de implementação 'subdeployment "siosp-api.war" of deployment "siosp-1.0.0.59-1.0.0.59-b370.ear"' são como segue:

        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/TabelaAS!br.gov.caixa.siosp.servicos.TabelaAS
        java:app/siosp-api/TabelaAS!br.gov.caixa.siosp.servicos.TabelaAS
        java:module/TabelaAS!br.gov.caixa.siosp.servicos.TabelaAS
        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/TabelaAS
        java:app/siosp-api/TabelaAS
        java:module/TabelaAS

2026-06-09 14:08:15,386 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para sessão bean chamada 'GarantiaAS' na unidade de implementação 'subdeployment "siosp-api.war" of deployment "siosp-1.0.0.59-1.0.0.59-b370.ear"' são como segue:

        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/GarantiaAS!br.gov.caixa.siosp.servicos.GarantiaAS
        java:app/siosp-api/GarantiaAS!br.gov.caixa.siosp.servicos.GarantiaAS
        java:module/GarantiaAS!br.gov.caixa.siosp.servicos.GarantiaAS
        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/GarantiaAS
        java:app/siosp-api/GarantiaAS
        java:module/GarantiaAS

2026-06-09 14:08:15,386 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para sessão bean chamada 'AuditoriaTabelaAS' na unidade de implementação 'subdeployment "siosp-api.war" of deployment "siosp-1.0.0.59-1.0.0.59-b370.ear"' são como segue:

        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/AuditoriaTabelaAS!br.gov.caixa.siosp.servicos.AuditoriaTabelaAS
        java:app/siosp-api/AuditoriaTabelaAS!br.gov.caixa.siosp.servicos.AuditoriaTabelaAS
        java:module/AuditoriaTabelaAS!br.gov.caixa.siosp.servicos.AuditoriaTabelaAS
        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/AuditoriaTabelaAS
        java:app/siosp-api/AuditoriaTabelaAS
        java:module/AuditoriaTabelaAS

2026-06-09 14:08:15,386 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para sessão bean chamada 'LiquidacaoAS' na unidade de implementação 'subdeployment "siosp-api.war" of deployment "siosp-1.0.0.59-1.0.0.59-b370.ear"' são como segue:

        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/LiquidacaoAS!br.gov.caixa.siosp.servicos.LiquidacaoAS
        java:app/siosp-api/LiquidacaoAS!br.gov.caixa.siosp.servicos.LiquidacaoAS
        java:module/LiquidacaoAS!br.gov.caixa.siosp.servicos.LiquidacaoAS
        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/LiquidacaoAS
        java:app/siosp-api/LiquidacaoAS
        java:module/LiquidacaoAS

2026-06-09 14:08:15,386 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para sessão bean chamada 'ReativacaoContratoAS' na unidade de implementação 'subdeployment "siosp-api.war" of deployment "siosp-1.0.0.59-1.0.0.59-b370.ear"' são como segue:

        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/ReativacaoContratoAS!br.gov.caixa.siosp.servicos.ReativacaoContratoAS
        java:app/siosp-api/ReativacaoContratoAS!br.gov.caixa.siosp.servicos.ReativacaoContratoAS
        java:module/ReativacaoContratoAS!br.gov.caixa.siosp.servicos.ReativacaoContratoAS
        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/ReativacaoContratoAS
        java:app/siosp-api/ReativacaoContratoAS
        java:module/ReativacaoContratoAS

2026-06-09 14:08:15,386 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para sessão bean chamada 'MoedaAS' na unidade de implementação 'subdeployment "siosp-api.war" of deployment "siosp-1.0.0.59-1.0.0.59-b370.ear"' são como segue:

        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/MoedaAS!br.gov.caixa.siosp.servicos.MoedaAS
        java:app/siosp-api/MoedaAS!br.gov.caixa.siosp.servicos.MoedaAS
        java:module/MoedaAS!br.gov.caixa.siosp.servicos.MoedaAS
        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/MoedaAS
        java:app/siosp-api/MoedaAS
        java:module/MoedaAS

2026-06-09 14:08:15,386 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para sessão bean chamada 'Relatorio' na unidade de implementação 'subdeployment "siosp-api.war" of deployment "siosp-1.0.0.59-1.0.0.59-b370.ear"' são como segue:

        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/Relatorio!br.gov.caixa.relatorio.Relatorio
        java:app/siosp-api/Relatorio!br.gov.caixa.relatorio.Relatorio
        java:module/Relatorio!br.gov.caixa.relatorio.Relatorio
        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/Relatorio
        java:app/siosp-api/Relatorio
        java:module/Relatorio

2026-06-09 14:08:15,386 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para sessão bean chamada 'OperacaoCreditoAS' na unidade de implementação 'subdeployment "siosp-api.war" of deployment "siosp-1.0.0.59-1.0.0.59-b370.ear"' são como segue:

        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/OperacaoCreditoAS!br.gov.caixa.siosp.servicos.OperacaoCreditoAS
        java:app/siosp-api/OperacaoCreditoAS!br.gov.caixa.siosp.servicos.OperacaoCreditoAS
        java:module/OperacaoCreditoAS!br.gov.caixa.siosp.servicos.OperacaoCreditoAS
        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/OperacaoCreditoAS
        java:app/siosp-api/OperacaoCreditoAS
        java:module/OperacaoCreditoAS

2026-06-09 14:08:15,386 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para sessão bean chamada 'ExemploAS' na unidade de implementação 'subdeployment "siosp-api.war" of deployment "siosp-1.0.0.59-1.0.0.59-b370.ear"' são como segue:

        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/ExemploAS!br.gov.caixa.arquitetura.javaee.core.exemplo.ExemploAS
        java:app/siosp-api/ExemploAS!br.gov.caixa.arquitetura.javaee.core.exemplo.ExemploAS
        java:module/ExemploAS!br.gov.caixa.arquitetura.javaee.core.exemplo.ExemploAS
        java:global/siosp-1.0.0.59-1.0.0.59-b370/siosp-api/ExemploAS
        java:app/siosp-api/ExemploAS
        java:module/ExemploAS

2026-06-09 14:08:15,463 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-3) WFLYJCA0004: Implantação do driver compatível-JDBC class oracle.jdbc.OracleDriver (versão 11.2)
2026-06-09 14:08:15,468 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-8) WFLYJCA0018: Serviço de driver iniciado com driver-name = siosp-api.war_oracle.jdbc.OracleDriver_11_2
2026-06-09 14:08:15,470 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 105) WFLYJPA0010: Iniciando unidade de persistência (fase 2 de 2) Serviço'siosp-1.0.0.59-1.0.0.59-b370.ear/siosp-api.war#OracleSiospDS'
2026-06-09 14:08:15,471 INFO  [org.hibernate.dialect.Dialect] (ServerService Thread Pool -- 105) HHH000400: Using dialect: org.hibernate.dialect.Oracle10gDialect
2026-06-09 14:08:15,471 INFO  [org.hibernate.engine.jdbc.env.internal.LobCreatorBuilderImpl] (ServerService Thread Pool -- 105) HHH000422: Disabling contextual LOB creation as connection was null
2026-06-09 14:08:15,473 INFO  [org.hibernate.envers.boot.internal.EnversServiceImpl] (ServerService Thread Pool -- 105) Envers integration enabled? : true
2026-06-09 14:08:15,489 ERROR [org.jboss.msc.service.fail] (ServerService Thread Pool -- 105) MSC000001: Failed to start service jboss.persistenceunit."siosp-1.0.0.59-1.0.0.59-b370.ear/siosp-api.war#OracleSiospDS": org.jboss.msc.service.StartException in service jboss.persistenceunit."siosp-1.0.0.59-1.0.0.59-b370.ear/siosp-api.war#OracleSiospDS": java.lang.ClassCastException: org.dom4j.DocumentFactory cannot be cast to org.dom4j.DocumentFactory
        at org.jboss.as.jpa.service.PersistenceUnitServiceImpl$1$1.run(PersistenceUnitServiceImpl.java:195)
        at org.jboss.as.jpa.service.PersistenceUnitServiceImpl$1$1.run(PersistenceUnitServiceImpl.java:125)
        at org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:640)
        at org.jboss.as.jpa.service.PersistenceUnitServiceImpl$1.run(PersistenceUnitServiceImpl.java:209)
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
        at java.lang.Thread.run(Thread.java:750)
        at org.jboss.threads.JBossThread.run(JBossThread.java:320)
Caused by: java.lang.ClassCastException: org.dom4j.DocumentFactory cannot be cast to org.dom4j.DocumentFactory
        at org.dom4j.DocumentFactory.getInstance(DocumentFactory.java:92)
        at org.hibernate.internal.util.xml.XMLHelper$1.doWork(XMLHelper.java:33)
        at org.hibernate.internal.util.xml.XMLHelper$1.doWork(XMLHelper.java:27)
        at org.hibernate.boot.registry.classloading.internal.ClassLoaderServiceImpl.workWithClassLoader(ClassLoaderServiceImpl.java:358)
        at org.hibernate.internal.util.xml.XMLHelper.<init>(XMLHelper.java:26)
        at org.hibernate.envers.boot.internal.EnversServiceImpl.initialize(EnversServiceImpl.java:115)
        at org.hibernate.envers.boot.internal.AdditionalJaxbMappingProducerImpl.produceAdditionalMappings(AdditionalJaxbMappingProducerImpl.java:99)
        at org.hibernate.boot.model.process.spi.MetadataBuildingProcess.complete(MetadataBuildingProcess.java:288)
        at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.metadata(EntityManagerFactoryBuilderImpl.java:848)
        at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:875)
        at org.jboss.as.jpa.hibernate5.TwoPhaseBootstrapImpl.build(TwoPhaseBootstrapImpl.java:44)
        at org.jboss.as.jpa.service.PersistenceUnitServiceImpl$1$1.run(PersistenceUnitServiceImpl.java:167)
        ... 7 more

2026-06-09 14:08:15,494 ERROR [org.jboss.as.controller.management-operation] (ServerService Thread Pool -- 102) WFLYCTL0013: Falha na operação ("deploy") - endereço ([("deployment" => "SIOSP")]) - falha na descrição: {"WFLYCTL0080: Falha de serviços" => {"jboss.persistenceunit.\"siosp-1.0.0.59-1.0.0.59-b370.ear/siosp-api.war#OracleSiospDS\"" => "java.lang.ClassCastException: org.dom4j.DocumentFactory cannot be cast to org.dom4j.DocumentFactory
    Caused by: java.lang.ClassCastException: org.dom4j.DocumentFactory cannot be cast to org.dom4j.DocumentFactory"}}
2026-06-09 14:08:15,495 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 102) WFLYSRV0021: O procedimento da implantação "siosp-1.0.0.59-1.0.0.59-b370.ear" foi revertido com falha de mensagem
{"WFLYCTL0080: Falha de serviços" => {"jboss.persistenceunit.\"siosp-1.0.0.59-1.0.0.59-b370.ear/siosp-api.war#OracleSiospDS\"" => "java.lang.ClassCastException: org.dom4j.DocumentFactory cannot be cast to org.dom4j.DocumentFactory
    Caused by: java.lang.ClassCastException: org.dom4j.DocumentFactory cannot be cast to org.dom4j.DocumentFactory"}}
2026-06-09 14:08:15,497 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 105) WFLYJPA0011: Interrompendo unidade de persistência (fase 1 de 2) Serviço 'siosp-1.0.0.59-1.0.0.59-b370.ear/siosp-api.war#OracleSiospDS'
2026-06-09 14:08:15,497 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0019: Serviço de driver interrompido com driver-name = siosp-api.war_oracle.jdbc.OracleDriver_11_2
2026-06-09 14:08:15,525 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0208: Interrompendo a subimplantação (runtime-name: siosp-web.war) em 30ms
2026-06-09 14:08:15,539 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0208: Interrompendo a subimplantação (runtime-name: siosp-api.war) em 43ms
2026-06-09 14:08:15,552 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0028: Implantação encerrada SIOSP (runtime-name: siosp-1.0.0.59-1.0.0.59-b370.ear) em 56ms
-sh-4.2$ ls -la /opt/jboss/jboss-eap/hc/log/servers/siosp_node1_lx099/
total 61440
drwxrwxr-x 2 jboss jboss     4096 Jun  9 08:02 .
drwxrwxr-x 4 jboss jboss       58 Jun  3 16:14 ..
-rw-rw-r-- 1 jboss jboss        0 Mai 19 19:15 audit.log
-rw-rw-r-- 1 jboss jboss    29772 Jun  9 14:08 server.log
-rw-rw-r-- 1 jboss jboss    59330 Mai 19 23:02 server.log.2026-05-19
-rw-rw-r-- 1 jboss jboss     1963 Mai 20 23:02 server.log.2026-05-20
-rw-rw-r-- 1 jboss jboss     1361 Mai 21 23:02 server.log.2026-05-21
-rw-rw-r-- 1 jboss jboss     1433 Mai 22 23:02 server.log.2026-05-22
-rw-rw-r-- 1 jboss jboss     1734 Mai 23 23:02 server.log.2026-05-23
-rw-rw-r-- 1 jboss jboss     1505 Mai 24 23:02 server.log.2026-05-24
-rw-rw-r-- 1 jboss jboss  1378807 Mai 25 23:02 server.log.2026-05-25
-rw-rw-r-- 1 jboss jboss 48497023 Mai 26 23:02 server.log.2026-05-26
-rw-rw-r-- 1 jboss jboss   663411 Mai 27 23:02 server.log.2026-05-27
-rw-rw-r-- 1 jboss jboss   847392 Mai 28 23:02 server.log.2026-05-28
-rw-rw-r-- 1 jboss jboss  9836695 Mai 29 23:02 server.log.2026-05-29
-rw-rw-r-- 1 jboss jboss     1505 Mai 30 23:02 server.log.2026-05-30
-rw-rw-r-- 1 jboss jboss     1505 Mai 31 23:02 server.log.2026-05-31
-rw-rw-r-- 1 jboss jboss     1505 Jun  1 23:02 server.log.2026-06-01
-rw-rw-r-- 1 jboss jboss    72935 Jun  2 23:02 server.log.2026-06-02
-rw-rw-r-- 1 jboss jboss  1249819 Jun  3 23:02 server.log.2026-06-03
-rw-rw-r-- 1 jboss jboss     1505 Jun  4 23:02 server.log.2026-06-04
-rw-rw-r-- 1 jboss jboss    31538 Jun  5 23:02 server.log.2026-06-05
-rw-rw-r-- 1 jboss jboss     1145 Jun  6 23:02 server.log.2026-06-06
-rw-rw-r-- 1 jboss jboss     1217 Jun  7 23:02 server.log.2026-06-07
-rw-rw-r-- 1 jboss jboss   176939 Jun  8 23:02 server.log.2026-06-08
-sh-4.2$
-sh-4.2$ ls -la /opt/jboss/jboss-eap/hc/deployments/
ls: não é possível acessar /opt/jboss/jboss-eap/hc/deployments/: Arquivo ou diretório não encontrado
-sh-4.2$ find /opt -name "*simcn*" -type f 2>/dev/null
-sh-4.2$

