
-sh-4.2$ cat /opt/jboss-eap/standalone/deployments/wmq.jmsra.rar.failed
"WFLYCTL0063: A operação de composição foi revertida"-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ cat /opt/jboss-eap/standalone/deployments/SICMU-ear.ear.failed
"{
    \"WFLYCTL0412: Serviços necessários que não estão instalados:\" => [
        \"jboss.naming.context.java.db2cmu\",
        \"jboss.naming.context.java.jms.SicmuConnectionFactory\",
        \"jboss.naming.context.java.jms.LQ_REQ_SICMU_ENV\"
    ],
    \"WFLYCTL0180: Os serviços com falta/indisponibilidade de dependências \" => [
        \"jboss.naming.context.java.comp.SICMU-ear.SICMU-ejb.ConsultarQualificacoesServiceBean.env.\\\"br.gov.caixa.sicmu.consultarqualificacoes.service.ConsultarQualificacoesServiceBean\\\".dataSource faltam [jboss.naming.context.java.db2cmu]\",
        \"jboss.naming.context.java.comp.SICMU-ear.SICMU-ejb.ConsultarContratosSubRogadosServiceBean.env.\\\"br.gov.caixa.sicmu.consultarcontratossubrogados.service.ConsultarContratosSubRogadosServiceBean\\\".dataSource faltam [jboss.naming.context.java.db2cmu]\",
        \"jboss.naming.context.java.comp.SICMU-ear.SICMU-ejb.ConsultarTrocaIdentificacaoServiceBean.env.\\\"br.gov.caixa.sicmu.consultartrocaidentificacoes.service.ConsultarTrocaIdentificacaoServiceBean\\\".dataSource faltam [jboss.naming.context.java.db2cmu]\",
        \"jboss.persistenceunit.\\\"SICMU-ear.ear/SICMU-ejb.jar#SICMU-ejb\\\".__FIRST_PHASE__ faltam [jboss.naming.context.java.db2cmu]\",
        \"jboss.naming.context.java.comp.SICMU-ear.SICMU-ejb.ConsultaEventoOperacaoServiceBean.env.\\\"br.gov.caixa.sicmu.eventoOperacao.service.ConsultaEventoOperacaoServiceBean\\\".dataSource faltam [jboss.naming.context.java.db2cmu]\",
        \"jboss.naming.context.java.comp.SICMU-ear.SICMU-ejb.JMSConnection.env.\\\"br.gov.caixa.sicmu.mensageria.driven.JMSConnection\\\".connectionFactory faltam [jboss.naming.context.java.jms.SicmuConnectionFactory]\",
        \"jboss.naming.context.java.comp.SICMU-ear.SICMU-ejb.ConsultarContratosExcluidosServiceBean.env.\\\"br.gov.caixa.sicmu.consultarContratosExcluidos.service.ConsultarContratosExcluidosServiceBean\\\".dataSource faltam [jboss.naming.context.java.db2cmu]\",
        \"jboss.naming.context.java.comp.SICMU-ear.SICMU-ejb.ConsultarOHServiceBean.env.\\\"br.gov.caixa.sicmu.operacaoHabitacional.service.ConsultarOHServiceBean\\\".dataSource faltam [jboss.naming.context.java.db2cmu]\",
        \"jboss.naming.context.java.comp.SICMU-ear.SICMU-ejb.ConsultaAltCadastraisServiceBean.env.\\\"br.gov.caixa.sicmu.consultaralteracoescadastrais.service.ConsultaAltCadastraisServiceBean\\\".dataSource faltam [jboss.naming.context.java.db2cmu]\",
        \"jboss.naming.context.java.comp.SICMU-ear.SICMU-ejb.JMSConnection.env.\\\"br.gov.caixa.sicmu.mensageria.driven.JMSConnection\\\".fila faltam [jboss.naming.context.java.jms.LQ_REQ_SICMU_ENV]\",
        \"jboss.naming.context.java.comp.SICMU-ear.SICMU-ejb.ConsultarContratoMutuarioCPFServiceBean.env.\\\"br.gov.caixa.sicmu.consultarcontratomutuariocpf.service.ConsultarContratoMutuarioCPFServiceBean\\\".dataSource faltam [jboss.naming.context.java.db2cmu]\",
        \"jboss.naming.context.java.comp.SICMU-ear.SICMU-ejb.PermissaoServiceBean.env.\\\"br.gov.caixa.sicmu.permissao.service.PermissaoServiceBean\\\".dataSource faltam [jboss.naming.context.java.db2cmu]\",
        \"jboss.naming.context.java.comp.SICMU-ear.SICMU-ejb.ConsultarMultiplicidadesServiceBean.env.\\\"br.gov.caixa.sicmu.consultarmultiplicidades.service.ConsultarMultiplicidadesServiceBean\\\".dataSource faltam [jboss.naming.context.java.db2cmu]\",
        \"jboss.naming.context.java.comp.SICMU-ear.SICMU-ejb.MantemTarifacaoServiceBean.env.\\\"br.gov.caixa.sicmu.manterTarifacao.service.MantemTarifacaoServiceBean\\\".dataSource faltam [jboss.naming.context.java.db2cmu]\",
        \"jboss.persistenceunit.\\\"SICMU-ear.ear/SICMU-ejb.jar#SICMU-ejb\\\" faltam [jboss.naming.context.java.db2cmu]\",
        \"jboss.naming.context.java.comp.SICMU-ear.SICMU-ejb.ConsultarSinistroServiceBean.env.\\\"br.gov.caixa.sicmu.consultarsinistro.service.ConsultarSinistroServiceBean\\\".dataSource faltam [jboss.naming.context.java.db2cmu]\",
        \"jboss.naming.context.java.comp.SICMU-ear.SICMU-ejb.ConsultaOperacaoHabitacionalServiceBean.env.\\\"br.gov.caixa.sicmu.operacaoHabitacional.service.ConsultaOperacaoHabitacionalServiceBean\\\".dataSource faltam [jboss.naming.context.java.db2cmu]\",
        \"jboss.naming.context.java.comp.SICMU-ear.SICMU-ejb.ConsultaTrilhaAuditoriaServiceBean.env.\\\"br.gov.caixa.sicmu.trilhaAuditoria.service.ConsultaTrilhaAuditoriaServiceBean\\\".dataSource faltam [jboss.naming.context.java.db2cmu]\"
    ]
}"-sh-4.2$


