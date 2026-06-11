[root@caddeapllx2540 p585600]# tail -100 /opt/jboss-eap/standalone/log/server.log | grep -E "ERROR|FAILED|Exception|Caused|iniciado|interrompido|implantado"
2026-06-11 15:58:18,878 ERROR [org.jboss.as.controller.management-operation] (DeploymentScanner-threads - 1) WFLYCTL0013: Falha na operação ("deploy") - endereço ([("deployment" => "SICMU-ear.ear")]) - falha na descrição: {
2026-06-11 15:58:18,968 INFO  [org.jboss.as.server] (DeploymentScanner-threads - 1) WFLYSRV0010: "SICMU-ear.ear" foi implantado (runtime-name: "SICMU-ear.ear")
[root@caddeapllx2540 p585600]#
[root@caddeapllx2540 p585600]#
[root@caddeapllx2540 p585600]#
[root@caddeapllx2540 p585600]# tail -200 /opt/jboss-eap/standalone/log/server.log
        java:app/SICMU-ejb/ConsultarQualificacoesServiceBean!br.gov.caixa.sicmu.consultarqualificacoes.service.ConsultarQualificacoesServiceBean
        java:module/ConsultarQualificacoesServiceBean!br.gov.caixa.sicmu.consultarqualificacoes.service.ConsultarQualificacoesServiceBean
        java:global/SICMU-ear/SICMU-ejb/ConsultarQualificacoesServiceBean
        java:app/SICMU-ejb/ConsultarQualificacoesServiceBean
        java:module/ConsultarQualificacoesServiceBean

2026-06-11 15:58:16,851 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ExcluirMultiplicidadeServiceBean' na unidade de implementação 'subdeployment "SICMU-ejb.jar" of deployment "SICMU-ear.ear"' são como segue:

        java:global/SICMU-ear/SICMU-ejb/ExcluirMultiplicidadeServiceBean!br.gov.caixa.sicmu.multiplicidade.service.ExcluirMultiplicidadeServiceBean
        java:app/SICMU-ejb/ExcluirMultiplicidadeServiceBean!br.gov.caixa.sicmu.multiplicidade.service.ExcluirMultiplicidadeServiceBean
        java:module/ExcluirMultiplicidadeServiceBean!br.gov.caixa.sicmu.multiplicidade.service.ExcluirMultiplicidadeServiceBean
        java:global/SICMU-ear/SICMU-ejb/ExcluirMultiplicidadeServiceBean
        java:app/SICMU-ejb/ExcluirMultiplicidadeServiceBean
        java:module/ExcluirMultiplicidadeServiceBean

2026-06-11 15:58:16,851 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'RestricaoInformacoesServiceBean' na unidade de implementação 'subdeployment "SICMU-ejb.jar" of deployment "SICMU-ear.ear"' são como segue:

        java:global/SICMU-ear/SICMU-ejb/RestricaoInformacoesServiceBean!br.gov.caixa.sicmu.manterRestricaoInformacoes.Service.RestricaoInformacoesServiceBean
        java:app/SICMU-ejb/RestricaoInformacoesServiceBean!br.gov.caixa.sicmu.manterRestricaoInformacoes.Service.RestricaoInformacoesServiceBean
        java:module/RestricaoInformacoesServiceBean!br.gov.caixa.sicmu.manterRestricaoInformacoes.Service.RestricaoInformacoesServiceBean
        java:global/SICMU-ear/SICMU-ejb/RestricaoInformacoesServiceBean
        java:app/SICMU-ejb/RestricaoInformacoesServiceBean
        java:module/RestricaoInformacoesServiceBean

2026-06-11 15:58:16,851 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'InclusaoMutuarioServiceBean' na unidade de implementação 'subdeployment "SICMU-ejb.jar" of deployment "SICMU-ear.ear"' são como segue:

        java:global/SICMU-ear/SICMU-ejb/InclusaoMutuarioServiceBean!br.gov.caixa.sicmu.mutuario.service.InclusaoMutuarioServiceBean
        java:app/SICMU-ejb/InclusaoMutuarioServiceBean!br.gov.caixa.sicmu.mutuario.service.InclusaoMutuarioServiceBean
        java:module/InclusaoMutuarioServiceBean!br.gov.caixa.sicmu.mutuario.service.InclusaoMutuarioServiceBean
        java:global/SICMU-ear/SICMU-ejb/InclusaoMutuarioServiceBean
        java:app/SICMU-ejb/InclusaoMutuarioServiceBean
        java:module/InclusaoMutuarioServiceBean

2026-06-11 15:58:16,851 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'IncluiOperacaoHabitacionalServiceBean' na unidade de implementação 'subdeployment "SICMU-ejb.jar" of deployment "SICMU-ear.ear"' são como segue:

        java:global/SICMU-ear/SICMU-ejb/IncluiOperacaoHabitacionalServiceBean!br.gov.caixa.sicmu.operacaoHabitacional.service.IncluiOperacaoHabitacionalServiceBean
        java:app/SICMU-ejb/IncluiOperacaoHabitacionalServiceBean!br.gov.caixa.sicmu.operacaoHabitacional.service.IncluiOperacaoHabitacionalServiceBean
        java:module/IncluiOperacaoHabitacionalServiceBean!br.gov.caixa.sicmu.operacaoHabitacional.service.IncluiOperacaoHabitacionalServiceBean
        java:global/SICMU-ear/SICMU-ejb/IncluiOperacaoHabitacionalServiceBean
        java:app/SICMU-ejb/IncluiOperacaoHabitacionalServiceBean
        java:module/IncluiOperacaoHabitacionalServiceBean

2026-06-11 15:58:16,851 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ConsultaResultadoAtuarialServiceBean' na unidade de implementação 'subdeployment "SICMU-ejb.jar" of deployment "SICMU-ear.ear"' são como segue:

        java:global/SICMU-ear/SICMU-ejb/ConsultaResultadoAtuarialServiceBean!br.gov.caixa.sicmu.atuarial.service.ConsultaResultadoAtuarialServiceBean
        java:app/SICMU-ejb/ConsultaResultadoAtuarialServiceBean!br.gov.caixa.sicmu.atuarial.service.ConsultaResultadoAtuarialServiceBean
        java:module/ConsultaResultadoAtuarialServiceBean!br.gov.caixa.sicmu.atuarial.service.ConsultaResultadoAtuarialServiceBean
        java:global/SICMU-ear/SICMU-ejb/ConsultaResultadoAtuarialServiceBean
        java:app/SICMU-ejb/ConsultaResultadoAtuarialServiceBean
        java:module/ConsultaResultadoAtuarialServiceBean

2026-06-11 15:58:16,851 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ConsultaAltCadastraisServiceBean' na unidade de implementação 'subdeployment "SICMU-ejb.jar" of deployment "SICMU-ear.ear"' são como segue:

        java:global/SICMU-ear/SICMU-ejb/ConsultaAltCadastraisServiceBean!br.gov.caixa.sicmu.consultaralteracoescadastrais.service.ConsultaAltCadastraisServiceBean
        java:app/SICMU-ejb/ConsultaAltCadastraisServiceBean!br.gov.caixa.sicmu.consultaralteracoescadastrais.service.ConsultaAltCadastraisServiceBean
        java:module/ConsultaAltCadastraisServiceBean!br.gov.caixa.sicmu.consultaralteracoescadastrais.service.ConsultaAltCadastraisServiceBean
        java:global/SICMU-ear/SICMU-ejb/ConsultaAltCadastraisServiceBean
        java:app/SICMU-ejb/ConsultaAltCadastraisServiceBean
        java:module/ConsultaAltCadastraisServiceBean

2026-06-11 15:58:16,851 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'JMSConnection' na unidade de implementação 'subdeployment "SICMU-ejb.jar" of deployment "SICMU-ear.ear"' são como segue:

        java:global/SICMU-ear/SICMU-ejb/JMSConnection!br.gov.caixa.sicmu.mensageria.driven.JMSConnection
        java:app/SICMU-ejb/JMSConnection!br.gov.caixa.sicmu.mensageria.driven.JMSConnection
        java:module/JMSConnection!br.gov.caixa.sicmu.mensageria.driven.JMSConnection
        java:global/SICMU-ear/SICMU-ejb/JMSConnection
        java:app/SICMU-ejb/JMSConnection
        java:module/JMSConnection

2026-06-11 15:58:16,851 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ConsultaConfiguracaoClasseServiceBean' na unidade de implementação 'subdeployment "SICMU-ejb.jar" of deployment "SICMU-ear.ear"' são como segue:

        java:global/SICMU-ear/SICMU-ejb/ConsultaConfiguracaoClasseServiceBean!br.gov.caixa.sicmu.consultaConfiguracaoClasse.service.ConsultaConfiguracaoClasseServiceBean
        java:app/SICMU-ejb/ConsultaConfiguracaoClasseServiceBean!br.gov.caixa.sicmu.consultaConfiguracaoClasse.service.ConsultaConfiguracaoClasseServiceBean
        java:module/ConsultaConfiguracaoClasseServiceBean!br.gov.caixa.sicmu.consultaConfiguracaoClasse.service.ConsultaConfiguracaoClasseServiceBean
        java:global/SICMU-ear/SICMU-ejb/ConsultaConfiguracaoClasseServiceBean
        java:app/SICMU-ejb/ConsultaConfiguracaoClasseServiceBean
        java:module/ConsultaConfiguracaoClasseServiceBean

2026-06-11 15:58:16,852 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'TrilhaAuditoriaServiceBean' na unidade de implementação 'subdeployment "SICMU-ejb.jar" of deployment "SICMU-ear.ear"' são como segue:

        java:global/SICMU-ear/SICMU-ejb/TrilhaAuditoriaServiceBean!br.gov.caixa.sicmu.trilhaAuditoria.service.TrilhaAuditoriaServiceBean
        java:app/SICMU-ejb/TrilhaAuditoriaServiceBean!br.gov.caixa.sicmu.trilhaAuditoria.service.TrilhaAuditoriaServiceBean
        java:module/TrilhaAuditoriaServiceBean!br.gov.caixa.sicmu.trilhaAuditoria.service.TrilhaAuditoriaServiceBean
        java:global/SICMU-ear/SICMU-ejb/TrilhaAuditoriaServiceBean
        java:app/SICMU-ejb/TrilhaAuditoriaServiceBean
        java:module/TrilhaAuditoriaServiceBean

2026-06-11 15:58:16,852 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'EnvioArquivoServiceBean' na unidade de implementação 'subdeployment "SICMU-ejb.jar" of deployment "SICMU-ear.ear"' são como segue:

        java:global/SICMU-ear/SICMU-ejb/EnvioArquivoServiceBean!br.gov.caixa.sicmu.movimentoarquivo.service.EnvioArquivoServiceBean
        java:app/SICMU-ejb/EnvioArquivoServiceBean!br.gov.caixa.sicmu.movimentoarquivo.service.EnvioArquivoServiceBean
        java:module/EnvioArquivoServiceBean!br.gov.caixa.sicmu.movimentoarquivo.service.EnvioArquivoServiceBean
        java:global/SICMU-ear/SICMU-ejb/EnvioArquivoServiceBean
        java:app/SICMU-ejb/EnvioArquivoServiceBean
        java:module/EnvioArquivoServiceBean

2026-06-11 15:58:16,852 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ConsultarContratosSubRogadosServiceBean' na unidade de implementação 'subdeployment "SICMU-ejb.jar" of deployment "SICMU-ear.ear"' são como segue:

        java:global/SICMU-ear/SICMU-ejb/ConsultarContratosSubRogadosServiceBean!br.gov.caixa.sicmu.consultarcontratossubrogados.service.ConsultarContratosSubRogadosServiceBean
        java:app/SICMU-ejb/ConsultarContratosSubRogadosServiceBean!br.gov.caixa.sicmu.consultarcontratossubrogados.service.ConsultarContratosSubRogadosServiceBean
        java:module/ConsultarContratosSubRogadosServiceBean!br.gov.caixa.sicmu.consultarcontratossubrogados.service.ConsultarContratosSubRogadosServiceBean
        java:global/SICMU-ear/SICMU-ejb/ConsultarContratosSubRogadosServiceBean
        java:app/SICMU-ejb/ConsultarContratosSubRogadosServiceBean
        java:module/ConsultarContratosSubRogadosServiceBean

2026-06-11 15:58:16,852 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ConsultarContratosExcluidosServiceBean' na unidade de implementação 'subdeployment "SICMU-ejb.jar" of deployment "SICMU-ear.ear"' são como segue:

        java:global/SICMU-ear/SICMU-ejb/ConsultarContratosExcluidosServiceBean!br.gov.caixa.sicmu.consultarContratosExcluidos.service.ConsultarContratosExcluidosServiceBean
        java:app/SICMU-ejb/ConsultarContratosExcluidosServiceBean!br.gov.caixa.sicmu.consultarContratosExcluidos.service.ConsultarContratosExcluidosServiceBean
        java:module/ConsultarContratosExcluidosServiceBean!br.gov.caixa.sicmu.consultarContratosExcluidos.service.ConsultarContratosExcluidosServiceBean
        java:global/SICMU-ear/SICMU-ejb/ConsultarContratosExcluidosServiceBean
        java:app/SICMU-ejb/ConsultarContratosExcluidosServiceBean
        java:module/ConsultarContratosExcluidosServiceBean

2026-06-11 15:58:16,852 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'EntidadeServiceBean' na unidade de implementação 'subdeployment "SICMU-ejb.jar" of deployment "SICMU-ear.ear"' são como segue:

        java:global/SICMU-ear/SICMU-ejb/EntidadeServiceBean!br.gov.caixa.sicmu.entidade.service.EntidadeServiceBean
        java:app/SICMU-ejb/EntidadeServiceBean!br.gov.caixa.sicmu.entidade.service.EntidadeServiceBean
        java:module/EntidadeServiceBean!br.gov.caixa.sicmu.entidade.service.EntidadeServiceBean
        java:global/SICMU-ear/SICMU-ejb/EntidadeServiceBean
        java:app/SICMU-ejb/EntidadeServiceBean
        java:module/EntidadeServiceBean

2026-06-11 15:58:16,852 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'mantemAcaoJudicialServiceBean' na unidade de implementação 'subdeployment "SICMU-ejb.jar" of deployment "SICMU-ear.ear"' são como segue:

        java:global/SICMU-ear/SICMU-ejb/mantemAcaoJudicialServiceBean!br.gov.caixa.sicmu.mantemAcaoJudicial.service.mantemAcaoJudicialServiceBean
        java:app/SICMU-ejb/mantemAcaoJudicialServiceBean!br.gov.caixa.sicmu.mantemAcaoJudicial.service.mantemAcaoJudicialServiceBean
        java:module/mantemAcaoJudicialServiceBean!br.gov.caixa.sicmu.mantemAcaoJudicial.service.mantemAcaoJudicialServiceBean
        java:global/SICMU-ear/SICMU-ejb/mantemAcaoJudicialServiceBean
        java:app/SICMU-ejb/mantemAcaoJudicialServiceBean
        java:module/mantemAcaoJudicialServiceBean

2026-06-11 15:58:16,852 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ConsultaEventoOperacaoServiceBean' na unidade de implementação 'subdeployment "SICMU-ejb.jar" of deployment "SICMU-ear.ear"' são como segue:

        java:global/SICMU-ear/SICMU-ejb/ConsultaEventoOperacaoServiceBean!br.gov.caixa.sicmu.eventoOperacao.service.ConsultaEventoOperacaoServiceBean
        java:app/SICMU-ejb/ConsultaEventoOperacaoServiceBean!br.gov.caixa.sicmu.eventoOperacao.service.ConsultaEventoOperacaoServiceBean
        java:module/ConsultaEventoOperacaoServiceBean!br.gov.caixa.sicmu.eventoOperacao.service.ConsultaEventoOperacaoServiceBean
        java:global/SICMU-ear/SICMU-ejb/ConsultaEventoOperacaoServiceBean
        java:app/SICMU-ejb/ConsultaEventoOperacaoServiceBean
        java:module/ConsultaEventoOperacaoServiceBean

2026-06-11 15:58:16,852 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ReceberArquivosServiceBean' na unidade de implementação 'subdeployment "SICMU-ejb.jar" of deployment "SICMU-ear.ear"' são como segue:

        java:global/SICMU-ear/SICMU-ejb/ReceberArquivosServiceBean!br.gov.caixa.sicmu.arquivogerado.service.ReceberArquivosServiceBean
        java:app/SICMU-ejb/ReceberArquivosServiceBean!br.gov.caixa.sicmu.arquivogerado.service.ReceberArquivosServiceBean
        java:module/ReceberArquivosServiceBean!br.gov.caixa.sicmu.arquivogerado.service.ReceberArquivosServiceBean
        java:global/SICMU-ear/SICMU-ejb/ReceberArquivosServiceBean
        java:app/SICMU-ejb/ReceberArquivosServiceBean
        java:module/ReceberArquivosServiceBean

2026-06-11 15:58:16,852 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ValidadorMovimentoInclusaoServiceBean' na unidade de implementação 'subdeployment "SICMU-ejb.jar" of deployment "SICMU-ear.ear"' são como segue:

        java:global/SICMU-ear/SICMU-ejb/ValidadorMovimentoInclusaoServiceBean!br.gov.caixa.sicmu.validadormovimento.service.ValidadorMovimentoInclusaoServiceBean
        java:app/SICMU-ejb/ValidadorMovimentoInclusaoServiceBean!br.gov.caixa.sicmu.validadormovimento.service.ValidadorMovimentoInclusaoServiceBean
        java:module/ValidadorMovimentoInclusaoServiceBean!br.gov.caixa.sicmu.validadormovimento.service.ValidadorMovimentoInclusaoServiceBean
        java:global/SICMU-ear/SICMU-ejb/ValidadorMovimentoInclusaoServiceBean
        java:app/SICMU-ejb/ValidadorMovimentoInclusaoServiceBean
        java:module/ValidadorMovimentoInclusaoServiceBean

2026-06-11 15:58:17,055 INFO  [org.jboss.weld.deployer] (MSC service thread 1-1) WFLYWELD0003: Processando da implantação weld SICMU-web.war
2026-06-11 15:58:17,737 WARN  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0131: Jakarta Enterprise Beans br.gov.caixa.sicmu.operacaoHabitacional.service.IncluiOperacaoHabitacionalServiceBean não devem ter um método final ou estático (parseData)
2026-06-11 15:58:17,850 INFO  [org.jipijapa] (MSC service thread 1-2) JIPIORMV53020253: Cache de segundo nível habilitado para SICMU-ear.ear/SICMU-ejb.jar#SICMU-ejb
2026-06-11 15:58:18,022 INFO  [org.infinispan.CONFIG] (MSC service thread 1-1) ISPN000152: Passivation configured without an eviction policy being selected. Only manually evicted entities will be passivated.
2026-06-11 15:58:18,023 INFO  [org.infinispan.CONFIG] (MSC service thread 1-1) ISPN000152: Passivation configured without an eviction policy being selected. Only manually evicted entities will be passivated.
2026-06-11 15:58:18,138 INFO  [org.infinispan.PERSISTENCE] (ServerService Thread Pool -- 22) ISPN000556: Starting user marshaller 'org.wildfly.clustering.infinispan.spi.marshalling.InfinispanProtoStreamMarshaller'
2026-06-11 15:58:18,735 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 22) WFLYCLINF0002: Cache SICMU-ear.ear.SICMU-web.war inicializado a partir do recipiente web
2026-06-11 15:58:18,878 ERROR [org.jboss.as.controller.management-operation] (DeploymentScanner-threads - 1) WFLYCTL0013: Falha na operação ("deploy") - endereço ([("deployment" => "SICMU-ear.ear")]) - falha na descrição: {
    "WFLYCTL0412: Serviços necessários que não estão instalados:" => [
        "jboss.naming.context.java.db2cmu",
        "jboss.naming.context.java.jms.SicmuConnectionFactory",
        "jboss.naming.context.java.jms.LQ_REQ_SICMU_ENV"
    ],
    "WFLYCTL0180: Os serviços com falta/indisponibilidade de dependências " => [
        "jboss.naming.context.java.comp.SICMU-ear.SICMU-ejb.ConsultarQualificacoesServiceBean.env.\"br.gov.caixa.sicmu.consultarqualificacoes.service.ConsultarQualificacoesServiceBean\".dataSource faltam [jboss.naming.context.java.db2cmu]",
        "jboss.naming.context.java.comp.SICMU-ear.SICMU-ejb.ConsultarContratosSubRogadosServiceBean.env.\"br.gov.caixa.sicmu.consultarcontratossubrogados.service.ConsultarContratosSubRogadosServiceBean\".dataSource faltam [jboss.naming.context.java.db2cmu]",
        "jboss.naming.context.java.comp.SICMU-ear.SICMU-ejb.ConsultarTrocaIdentificacaoServiceBean.env.\"br.gov.caixa.sicmu.consultartrocaidentificacoes.service.ConsultarTrocaIdentificacaoServiceBean\".dataSource faltam [jboss.naming.context.java.db2cmu]",
        "jboss.persistenceunit.\"SICMU-ear.ear/SICMU-ejb.jar#SICMU-ejb\".__FIRST_PHASE__ faltam [jboss.naming.context.java.db2cmu]",
        "jboss.naming.context.java.comp.SICMU-ear.SICMU-ejb.ConsultaEventoOperacaoServiceBean.env.\"br.gov.caixa.sicmu.eventoOperacao.service.ConsultaEventoOperacaoServiceBean\".dataSource faltam [jboss.naming.context.java.db2cmu]",
        "jboss.naming.context.java.comp.SICMU-ear.SICMU-ejb.JMSConnection.env.\"br.gov.caixa.sicmu.mensageria.driven.JMSConnection\".connectionFactory faltam [jboss.naming.context.java.jms.SicmuConnectionFactory]",
        "jboss.naming.context.java.comp.SICMU-ear.SICMU-ejb.ConsultarContratosExcluidosServiceBean.env.\"br.gov.caixa.sicmu.consultarContratosExcluidos.service.ConsultarContratosExcluidosServiceBean\".dataSource faltam [jboss.naming.context.java.db2cmu]",
        "jboss.naming.context.java.comp.SICMU-ear.SICMU-ejb.ConsultarOHServiceBean.env.\"br.gov.caixa.sicmu.operacaoHabitacional.service.ConsultarOHServiceBean\".dataSource faltam [jboss.naming.context.java.db2cmu]",
        "jboss.naming.context.java.comp.SICMU-ear.SICMU-ejb.ConsultaAltCadastraisServiceBean.env.\"br.gov.caixa.sicmu.consultaralteracoescadastrais.service.ConsultaAltCadastraisServiceBean\".dataSource faltam [jboss.naming.context.java.db2cmu]",
        "jboss.naming.context.java.comp.SICMU-ear.SICMU-ejb.JMSConnection.env.\"br.gov.caixa.sicmu.mensageria.driven.JMSConnection\".fila faltam [jboss.naming.context.java.jms.LQ_REQ_SICMU_ENV]",
        "jboss.naming.context.java.comp.SICMU-ear.SICMU-ejb.ConsultarContratoMutuarioCPFServiceBean.env.\"br.gov.caixa.sicmu.consultarcontratomutuariocpf.service.ConsultarContratoMutuarioCPFServiceBean\".dataSource faltam [jboss.naming.context.java.db2cmu]",
        "jboss.naming.context.java.comp.SICMU-ear.SICMU-ejb.PermissaoServiceBean.env.\"br.gov.caixa.sicmu.permissao.service.PermissaoServiceBean\".dataSource faltam [jboss.naming.context.java.db2cmu]",
        "jboss.naming.context.java.comp.SICMU-ear.SICMU-ejb.ConsultarMultiplicidadesServiceBean.env.\"br.gov.caixa.sicmu.consultarmultiplicidades.service.ConsultarMultiplicidadesServiceBean\".dataSource faltam [jboss.naming.context.java.db2cmu]",
        "jboss.naming.context.java.comp.SICMU-ear.SICMU-ejb.MantemTarifacaoServiceBean.env.\"br.gov.caixa.sicmu.manterTarifacao.service.MantemTarifacaoServiceBean\".dataSource faltam [jboss.naming.context.java.db2cmu]",
        "jboss.persistenceunit.\"SICMU-ear.ear/SICMU-ejb.jar#SICMU-ejb\" faltam [jboss.naming.context.java.db2cmu]",
        "jboss.naming.context.java.comp.SICMU-ear.SICMU-ejb.ConsultarSinistroServiceBean.env.\"br.gov.caixa.sicmu.consultarsinistro.service.ConsultarSinistroServiceBean\".dataSource faltam [jboss.naming.context.java.db2cmu]",
        "jboss.naming.context.java.comp.SICMU-ear.SICMU-ejb.ConsultaOperacaoHabitacionalServiceBean.env.\"br.gov.caixa.sicmu.operacaoHabitacional.service.ConsultaOperacaoHabitacionalServiceBean\".dataSource faltam [jboss.naming.context.java.db2cmu]",
        "jboss.naming.context.java.comp.SICMU-ear.SICMU-ejb.ConsultaTrilhaAuditoriaServiceBean.env.\"br.gov.caixa.sicmu.trilhaAuditoria.service.ConsultaTrilhaAuditoriaServiceBean\".dataSource faltam [jboss.naming.context.java.db2cmu]"
    ]
}
2026-06-11 15:58:18,968 INFO  [org.jboss.as.server] (DeploymentScanner-threads - 1) WFLYSRV0010: "SICMU-ear.ear" foi implantado (runtime-name: "SICMU-ear.ear")
2026-06-11 15:58:18,972 INFO  [org.jboss.as.controller] (DeploymentScanner-threads - 1) WFLYCTL0183: Relatório
 de status de serviçoWFLYCTL0184: Não falta/insatisfaz nenhuma das dependências:
service jboss.naming.context.java.db2cmu (faltam) dependentes: [service jboss.naming.context.java.comp.SICMU-ear.SICMU-ejb.ConsultaEventoOperacaoServiceBean.env."br.gov.caixa.sicmu.eventoOperacao.service.ConsultaEventoOperacaoServiceBean".dataSource, service jboss.naming.context.java.comp.SICMU-ear.SICMU-ejb.PermissaoServiceBean.env."br.gov.caixa.sicmu.permissao.service.PermissaoServiceBean".dataSource, service jboss.naming.context.java.comp.SICMU-ear.SICMU-ejb.ConsultarQualificacoesServiceBean.env."br.gov.caixa.sicmu.consultarqualificacoes.service.ConsultarQualificacoesServiceBean".dataSource, service jboss.naming.context.java.comp.SICMU-ear.SICMU-ejb.ConsultaOperacaoHabitacionalServiceBean.env."br.gov.caixa.sicmu.operacaoHabitacional.service.ConsultaOperacaoHabitacionalServiceBean".dataSource, WFLYCTL0208: ... e mais 13 ]
service jboss.naming.context.java.jms.LQ_REQ_SICMU_ENV (faltam) dependentes: [service jboss.naming.context.java.comp.SICMU-ear.SICMU-ejb.JMSConnection.env."br.gov.caixa.sicmu.mensageria.driven.JMSConnection".fila]
service jboss.naming.context.java.jms.SicmuConnectionFactory (faltam) dependentes: [service jboss.naming.context.java.comp.SICMU-ear.SICMU-ejb.JMSConnection.env."br.gov.caixa.sicmu.mensageria.driven.JMSConnection".connectionFactory]
WFLYCTL0448: 616 serviços adicionais estão inativos devido a ausência ou falha das suas dependências
[root@caddeapllx2540 p585600]#
