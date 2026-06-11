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
-sh-4.2$ cat /opt/jboss-eap/standalone/deployments/wmq.jmsra.rar.failed
{"WFLYCTL0062: A operação de composição falhou e foi revertida. Segue abaixo as etapas que falharam:" => {"Operação step-1" => "WFLYCTL0158: Falha no manipulador da operação: java.lang.IllegalStateException: WFLYDR0006: O diretório /opt/jboss-eap/standalone/data/content/e7 não é gravável"}}-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ sudo find /logs -name "server.log" 2>/dev/null
[sudo] senha para p585600:
/logs/jboss/server.log
-sh-4.2$ sudo systemctl status jboss-eap-standalone
● jboss-eap-standalone.service - JBoss EAP Systemctl - STANDALONE
   Loaded: loaded (/etc/systemd/system/jboss-eap-standalone.service; enabled; vendor preset: disabled)
   Active: inactive (dead) since Qui 2026-06-11 16:01:57 -03; 55min ago
  Process: 23066 ExecStop=/opt/jboss-eap/bin/init.d/jboss-eap-standalone.sh stop (code=exited, status=0/SUCCESS)
  Process: 22825 ExecStart=/opt/jboss-eap/bin/init.d/jboss-eap-standalone.sh start (code=exited, status=0/SUCCESS)

Jun 11 16:01:51 caddeapllx2540.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[22825]: at org.jboss.logmanager.handlers.FileHandler.setFile(FileHandler.java:151)
Jun 11 16:01:51 caddeapllx2540.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[22825]: at org.jboss.logmanager.handlers.PeriodicRotatingFileHandler.setFile(PeriodicRotatingF...va:109)
Jun 11 16:01:51 caddeapllx2540.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[22825]: at org.jboss.logmanager.handlers.FileHandler.setFileName(FileHandler.java:189)
Jun 11 16:01:51 caddeapllx2540.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[22825]: at org.jboss.logmanager.handlers.FileHandler.<init>(FileHandler.java:119)
Jun 11 16:01:51 caddeapllx2540.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[22825]: at org.jboss.logmanager.handlers.PeriodicRotatingFileHandler.<init>(PeriodicRotatingFi...ava:77)
Jun 11 16:01:51 caddeapllx2540.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[22825]: ... 33 more
Jun 11 16:01:54 caddeapllx2540.agil.nprd.caixa.gov.br runuser[22840]: pam_unix(runuser:session): session closed for user jboss
Jun 11 16:01:57 caddeapllx2540.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[22825]: [  OK  ]
Jun 11 16:01:57 caddeapllx2540.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[23066]: Stopping JBoss EAP: [  OK  ]
Jun 11 16:01:57 caddeapllx2540.agil.nprd.caixa.gov.br systemd[1]: Started JBoss EAP Systemctl - STANDALONE.
Hint: Some lines were ellipsized, use -l to show in full.
-sh-4.2$
