[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$ systemctl status jboss-eap --no-pager
Unit jboss-eap.service could not be found.
[p585600@caddeapllx1992 logs]$ jounalctl jboss-eap -n 200 --no-pager
-sh: jounalctl: comando não encontrado
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$
[p585600@caddeapllx1992 logs]$ find /logs/jboss -type f -name "*.log"
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/console-stdout.log
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/backupgc.log
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/audit.log
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/server.log
/logs/jboss/jboss-eap/standalone/siatd-intranet-vm/gc.log
[p585600@caddeapllx1992 logs]$ tail -n 200 /logs/jboss/jboss-eap/standalone/siatd-intranet-vm/server.log
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)             CASE
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)                 WHEN A043A.NU_TIPO_ANEXO = 24 THEN D.NU_SEQUENCIAL_DESTAQUE
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)                 WHEN A043A.NU_TIPO_ANEXO = 23
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)                 AND P.IC_DELIBERACAO = 0 THEN P.NU_PARECER
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)                 WHEN A043A.NU_TIPO_ANEXO = 23
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)                 AND P.IC_DELIBERACAO = 1 THEN P.NU_RESOLUCAO
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)                 ELSE A043A.NU_ANEXO_PROPOSICAO
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)             END AS NU_DOCUMENTO,
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)             TIPO.DE_TIPO_ANEXO,
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)             A033R.DH_PREVISAO_REUNIAO,
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)             COL.SG_COLEGIADO,
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)             A096TMC.NO_TURMA_MEMBRO_COLEGIADO,
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)             A104AA.DH_ENVIO_SLCTO_ASSINATURA,
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)             A104AA.DH_ASSINATURA,
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)             A043A.NU_TIPO_SITUACAO_ASSINATURA,
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)             A104AA.NU_ASSINATURA_ATA,
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)             A043A.NU_ANEXO_PROPOSICAO,
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)             TIPO.NU_TIPO_ANEXO
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)         FROM
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)             ATD.ATDTB104_ASSINATURA_ATA A104AA
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)         JOIN
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)             ATD.ATDTB017_ANEXO_PROPOSICAO A043A
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)                 ON A043A.NU_ANEXO_PROPOSICAO = A104AA.NU_ANEXO_PROPOSICAO
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)         JOIN
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)             ATD.ATDTB018_TIPO_ANEXO TIPO
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)                 ON TIPO.NU_TIPO_ANEXO = A043A.NU_TIPO_ANEXO
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)         JOIN
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)             ATD.ATDTB035_REUNIAO_PROPOSICAO RP
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)                 ON RP.NU_PROPOSICAO = A043A.NU_PROPOSICAO
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)         JOIN
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)             ATD.ATDTB033_REUNIAO A033R
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)                 ON A033R.NU_REUNIAO = RP.NU_REUNIAO
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)                 AND A033R.NU_COLEGIADO = A043A.NU_COLEGIADO
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)         JOIN
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)             ATD.ATDTB002_COLEGIADO COL
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)                 ON COL.NU_COLEGIADO = A033R.NU_COLEGIADO
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)         JOIN
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)             ATD.ATDTB039_MEMBRO_LISTA_PRESENCA A039MLP
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)                 ON A104AA.NU_MEMBRO_LISTA_PRESENCA = A039MLP.NU_MEMBRO_LISTA_PRESENCA
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)         LEFT JOIN
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)             ATD.ATDTB008_PROPOSICAO P
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)                 ON P.NU_PROPOSICAO = RP.NU_PROPOSICAO
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)                 AND P.NU_COLEGIADO = COL.NU_COLEGIADO
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)         LEFT JOIN
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)             ATD.ATDTB042_DESTAQUE D
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)                 ON D.NU_ANEXO_MODELO = A043A.NU_ANEXO_PROPOSICAO
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)         LEFT JOIN
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)             ATD.ATDTB096_TURMA_MMBRO_COLEGIADO A096TMC
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)                 ON A096TMC.NU_TURMA_MEMBRO_COLEGIADO = A033R.NU_TURMA_MEMBRO_COLEGIADO
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)         WHERE
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)             A043A.IC_ASSINATURA_PREVIA = 'N'
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)             AND TIPO.NU_TIPO_ANEXO IN (
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)                 23,24
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)             )
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)             AND A039MLP.NU_MATRICULA_MEMBRO = ?
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)             AND A104AA.DH_ASSINATURA  IS NULL
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)             AND A104AA.DH_ENVIO_SLCTO_ASSINATURA IS NOT NULL
2026-08-20 09:39:54,288 INFO  [stdout] (default task-1)     ) TOTAL_COUNT
2026-08-20 09:39:54,288 DEBUG [jboss.jdbc.spy] (default task-1) java:jboss/datasources/OracleSiatdDS [DataSource] getConnection()
2026-08-20 09:39:54,291 DEBUG [jboss.jdbc.spy] (default task-1) java:jboss/datasources/OracleSiatdDS [Connection] prepareStatement(SELECT COUNT(*) FROM (
 SELECT DISTINCT A033R.NU_REUNIAO,
                COALESCE(A043A.NU_ATA, AR_ASS.NU_ANEXO_REUNIAO) AS NU_DOCUMENTO,
                TIPO.DE_TIPO_ANEXO,
                A033R.DH_PREVISAO_REUNIAO,
                A002C.SG_COLEGIADO,
                A096TMC.NO_TURMA_MEMBRO_COLEGIADO,
                A104AA.DH_ENVIO_SLCTO_ASSINATURA,
                A104AA.DH_ASSINATURA,
                COALESCE(A043A.IC_ASSINATURA_ATA,
                AR_ASS.NU_TIPO_SITUACAO_ASSINATURA) AS SITUACAO_ASSINATURA,
                A104AA.NU_ASSINATURA_ATA,
                AR_ASS.NU_ANEXO_REUNIAO,
                TIPO.NU_TIPO_ANEXO
 FROM ATD.ATDTB104_ASSINATURA_ATA A104AA
         JOIN ATD.ATDTB039_MEMBRO_LISTA_PRESENCA A039MLP
              ON A104AA.NU_MEMBRO_LISTA_PRESENCA = A039MLP.NU_MEMBRO_LISTA_PRESENCA
         JOIN ATD.ATDTB044_ANEXO_REUNIAO AR_ASS
              ON A104AA.NU_ANEXO_REUNIAO  = AR_ASS.NU_ANEXO_REUNIAO
         JOIN ATD.ATDTB033_REUNIAO A033R
              ON AR_ASS.NU_REUNIAO = A033R.NU_REUNIAO
         JOIN ATD.ATDTB002_COLEGIADO A002C
              ON A033R.NU_COLEGIADO = A002C.NU_COLEGIADO
         JOIN ATD.ATDTB018_TIPO_ANEXO TIPO
               ON TIPO.NU_TIPO_ANEXO = AR_ASS.NU_TIPO_ANEXO
          LEFT JOIN ATD.ATDTB043_ATA A043A
              ON A033R.NU_REUNIAO = A043A.NU_REUNIAO AND A043A.NU_COLEGIADO = A033R.NU_COLEGIADO
               AND A104AA.NU_ANEXO_REUNIAO = A043A.NU_ANEXO_MODELO
 LEFT JOIN ATD.ATDTB096_TURMA_MMBRO_COLEGIADO A096TMC
              ON A096TMC.NU_TURMA_MEMBRO_COLEGIADO = A033R.NU_TURMA_MEMBRO_COLEGIADO
 WHERE AR_ASS.IC_ASSINATURA_PREVIA = 'N'
 AND TIPO.NU_TIPO_ANEXO IN (28,43,44,45)
 AND A039MLP.NU_MATRICULA_MEMBRO = ?  AND A104AA.DH_ASSINATURA  IS NULL AND A104AA.DH_ENVIO_SLCTO_ASSINATURA IS NOT NULL UNION ALL SELECT
 A033R.NU_REUNIAO,
 CASE
 WHEN A043A.NU_TIPO_ANEXO = 24 THEN D.NU_SEQUENCIAL_DESTAQUE
 WHEN A043A.NU_TIPO_ANEXO = 23
 AND P.IC_DELIBERACAO = 0 THEN P.NU_PARECER
 WHEN A043A.NU_TIPO_ANEXO = 23
 AND P.IC_DELIBERACAO = 1 THEN P.NU_RESOLUCAO
 ELSE A043A.NU_ANEXO_PROPOSICAO
 END AS NU_DOCUMENTO,
 TIPO.DE_TIPO_ANEXO,
 A033R.DH_PREVISAO_REUNIAO,
 COL.SG_COLEGIADO,
 A096TMC.NO_TURMA_MEMBRO_COLEGIADO,
 A104AA.DH_ENVIO_SLCTO_ASSINATURA,
 A104AA.DH_ASSINATURA,
 A043A.NU_TIPO_SITUACAO_ASSINATURA,
 A104AA.NU_ASSINATURA_ATA,
 A043A.NU_ANEXO_PROPOSICAO,
 TIPO.NU_TIPO_ANEXO
 FROM ATD.ATDTB104_ASSINATURA_ATA A104AA
 JOIN ATD.ATDTB017_ANEXO_PROPOSICAO A043A
 ON A043A.NU_ANEXO_PROPOSICAO = A104AA.NU_ANEXO_PROPOSICAO
 JOIN ATD.ATDTB018_TIPO_ANEXO TIPO
 ON TIPO.NU_TIPO_ANEXO = A043A.NU_TIPO_ANEXO
 JOIN ATD.ATDTB035_REUNIAO_PROPOSICAO RP
 ON RP.NU_PROPOSICAO = A043A.NU_PROPOSICAO
 JOIN ATD.ATDTB033_REUNIAO A033R
 ON A033R.NU_REUNIAO = RP.NU_REUNIAO AND A033R.NU_COLEGIADO = A043A.NU_COLEGIADO
 JOIN ATD.ATDTB002_COLEGIADO COL
 ON COL.NU_COLEGIADO = A033R.NU_COLEGIADO
 JOIN ATD.ATDTB039_MEMBRO_LISTA_PRESENCA A039MLP
 ON A104AA.NU_MEMBRO_LISTA_PRESENCA = A039MLP.NU_MEMBRO_LISTA_PRESENCA
 LEFT JOIN ATD.ATDTB008_PROPOSICAO P
 ON P.NU_PROPOSICAO = RP.NU_PROPOSICAO AND P.NU_COLEGIADO = COL.NU_COLEGIADO
 LEFT JOIN ATD.ATDTB042_DESTAQUE D
 ON D.NU_ANEXO_MODELO = A043A.NU_ANEXO_PROPOSICAO
LEFT JOIN ATD.ATDTB096_TURMA_MMBRO_COLEGIADO A096TMC
              ON A096TMC.NU_TURMA_MEMBRO_COLEGIADO = A033R.NU_TURMA_MEMBRO_COLEGIADO
 WHERE A043A.IC_ASSINATURA_PREVIA = 'N'
 AND TIPO.NU_TIPO_ANEXO IN (23,24)
 AND A039MLP.NU_MATRICULA_MEMBRO = ?  AND A104AA.DH_ASSINATURA  IS NULL AND A104AA.DH_ENVIO_SLCTO_ASSINATURA IS NOT NULL ) TOTAL_COUNT
)
2026-08-20 09:39:54,291 DEBUG [jboss.jdbc.spy] (default task-1) java:jboss/datasources/OracleSiatdDS [PreparedStatement] setInt(1, 891451)
2026-08-20 09:39:54,291 DEBUG [jboss.jdbc.spy] (default task-1) java:jboss/datasources/OracleSiatdDS [PreparedStatement] setInt(2, 891451)
2026-08-20 09:39:54,291 DEBUG [jboss.jdbc.spy] (default task-1) java:jboss/datasources/OracleSiatdDS [PreparedStatement] executeQuery()
2026-08-20 09:39:54,437 DEBUG [jboss.jdbc.spy] (default task-1) java:jboss/datasources/OracleSiatdDS [ResultSet] getMetaData()
2026-08-20 09:39:54,437 DEBUG [jboss.jdbc.spy] (default task-1) java:jboss/datasources/OracleSiatdDS [ResultSet] next()
2026-08-20 09:39:54,437 DEBUG [jboss.jdbc.spy] (default task-1) java:jboss/datasources/OracleSiatdDS [ResultSet] getBigDecimal(COUNT(*))
2026-08-20 09:39:54,437 DEBUG [jboss.jdbc.spy] (default task-1) java:jboss/datasources/OracleSiatdDS [ResultSet] wasNull()
2026-08-20 09:39:54,437 DEBUG [jboss.jdbc.spy] (default task-1) java:jboss/datasources/OracleSiatdDS [ResultSet] next()
2026-08-20 09:39:54,437 DEBUG [jboss.jdbc.spy] (default task-1) java:jboss/datasources/OracleSiatdDS [ResultSet] close()
2026-08-20 09:39:54,437 DEBUG [jboss.jdbc.spy] (default task-1) java:jboss/datasources/OracleSiatdDS [PreparedStatement] isClosed()
2026-08-20 09:39:54,437 DEBUG [jboss.jdbc.spy] (default task-1) java:jboss/datasources/OracleSiatdDS [PreparedStatement] getMaxRows()
2026-08-20 09:39:54,437 DEBUG [jboss.jdbc.spy] (default task-1) java:jboss/datasources/OracleSiatdDS [PreparedStatement] getQueryTimeout()
2026-08-20 09:39:54,437 DEBUG [jboss.jdbc.spy] (default task-1) java:jboss/datasources/OracleSiatdDS [PreparedStatement] close()
2026-08-20 09:39:54,437 DEBUG [jboss.jdbc.spy] (default task-1) java:jboss/datasources/OracleSiatdDS [Connection] isClosed()
2026-08-20 09:39:54,437 DEBUG [jboss.jdbc.spy] (default task-1) java:jboss/datasources/OracleSiatdDS [Connection] isClosed()
2026-08-20 09:39:54,437 DEBUG [jboss.jdbc.spy] (default task-1) java:jboss/datasources/OracleSiatdDS [Connection] getWarnings()
2026-08-20 09:39:54,437 DEBUG [jboss.jdbc.spy] (default task-1) java:jboss/datasources/OracleSiatdDS [Connection] clearWarnings()
2026-08-20 09:39:54,438 DEBUG [jboss.jdbc.spy] (default task-1) java:jboss/datasources/OracleSiatdDS [Connection] close()
2026-08-20 09:46:02,160 INFO  [org.jboss.as.server] (Thread-1) WFLYSRV0272: Servidor suspenso
2026-08-20 09:46:02,167 INFO  [org.jboss.as.ejb3] (Thread-1) WFLYEJB0493: Suspensão completa do subsistema de Jakarta Enterprise Beans
2026-08-20 09:46:02,176 INFO  [org.jboss.as.server] (Thread-1) WFLYSRV0220: Foi solicitado o desligamento do servidor através de um sinal de OS
2026-08-20 09:46:02,204 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0019: Serviço de driver interrompido com nome-do-driver = siatd-web.war_org.h2.Driver_1_3
2026-08-20 09:46:02,206 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-1) WFLYJCA0011: Sem limite de conectores de Jakarta AdminObject [java:/jms/LQ.REQ.SERVICO.SIATD]
2026-08-20 09:46:02,214 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-3) WFLYJCA0011: Sem limite de conectores de Jakarta AdminObject [java:jboss/jms/SIBAR.RSP.CONSULTA_AVALIACAO_RISCO]
2026-08-20 09:46:02,215 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-3) WFLYJCA0011: Sem limite de conectores de Jakarta AdminObject [java:jboss/jms/SIRIC.RSP.CONSULTA_AVALIACAO_RISCO]
2026-08-20 09:46:02,216 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-1) WFLYJCA0011: Sem limite de conectores de Jakarta AdminObject [java:/jms/SIBAR.RSP.CONSULTA_CLIENTE]
2026-08-20 09:46:02,216 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-1) WFLYJCA0011: Sem limite de conectores de Jakarta AdminObject [java:/jms/LQ.REQ.SERVICO.SICDU]
2026-08-20 09:46:02,219 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-1) WFLYJCA0011: Sem limite de conectores de Jakarta AdminObject [java:jboss/jms/SIBAR.REQ.CONSULTA_AVALIACAO_RISCO]
2026-08-20 09:46:02,219 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-1) WFLYJCA0011: Sem limite de conectores de Jakarta AdminObject [java:jboss/jms/SIBAR.RSP.CONSULTA_CLIENTE]
2026-08-20 09:46:02,220 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-1) WFLYJCA0119: Desfazendo o vínculo da criação de conexão chamada java:/JmsXA para o alias java:jboss/DefaultJMSConnectionFactory
2026-08-20 09:46:02,220 INFO  [org.wildfly.extension.messaging-activemq] (MSC service thread 1-1) WFLYMSGAMQ0006: Objeto de mensagem não vinculado ao nome jndi java:jboss/exported/jms/RemoteConnectionFactory
2026-08-20 09:46:02,218 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-4) WFLYJCA0011: Sem limite de conectores de Jakarta AdminObject [java:jboss/jms/SIRIC.REQ.CONSULTA_AVALIACAO_RISCO]
2026-08-20 09:46:02,216 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-2) WFLYJCA0011: Sem limite de conectores de Jakarta ConnectionFactory [java:/jms/wsmq/BARConnectionFactory]
2026-08-20 09:46:02,216 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-3) WFLYJCA0011: Sem limite de conectores de Jakarta AdminObject [java:/jms/LQ.RSP.SERVICO.SIATD]
2026-08-20 09:46:02,224 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-1) WFLYJCA0011: Sem limite de conectores de Jakarta ConnectionFactory [java:/JmsXA]
2026-08-20 09:46:02,246 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0028: Implantação interrompida wmq.jmsra.rar (runtime-name: wmq.jmsra.rar) em 55ms
2026-08-20 09:46:02,246 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0028: Implantação interrompida applicationinsights-agent.jar (runtime-name: applicationinsights-agent.jar) em 65ms
2026-08-20 09:46:02,246 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 86) WFLYUT0022: Contexto web não registrado:'/siatd-web' do servidor 'default-server'
2026-08-20 09:46:02,290 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0019: Interrompendo host default-host
2026-08-20 09:46:02,308 INFO  [org.apache.activemq.artemis.ra] (ServerService Thread Pool -- 85) AMQ151003: resource adaptor stopped
2026-08-20 09:46:02,310 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 97) WFLYJPA0011: Interrompendo unidade de persistência (fase 2 de 2) Serviço 'siatdEAR.ear/siatd-web.war#puBatch'
2026-08-20 09:46:02,310 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-3) WFLYMAIL0002: Sessão de e-mail não associada [java:jboss/mail/caixamail]
2026-08-20 09:46:02,312 INFO  [org.hibernate.orm.beans] (ServerService Thread Pool -- 97) HHH10005004: Stopping BeanContainer : org.hibernate.resource.beans.container.internal.CdiBeanContainerExtendedAccessImpl@5e17cf9b
2026-08-20 09:46:02,313 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-2) WFLYMAIL0002: Sessão de e-mail não associada [java:jboss/mail/sisou]
2026-08-20 09:46:02,315 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 96) WFLYJPA0011: Interrompendo unidade de persistência (fase 2 de 2) Serviço 'siatdEAR.ear/siatd-web.war#pu'
2026-08-20 09:46:02,316 INFO  [org.hibernate.orm.beans] (ServerService Thread Pool -- 96) HHH10005004: Stopping BeanContainer : org.hibernate.resource.beans.container.internal.CdiBeanContainerExtendedAccessImpl@2bec1d2d
2026-08-20 09:46:02,321 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 96) WFLYJPA0011: Interrompendo unidade de persistência (fase 1 de 2) Serviço 'siatdEAR.ear/siatd-web.war#pu'
2026-08-20 09:46:02,321 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 98) WFLYJPA0011: Interrompendo unidade de persistência (fase 1 de 2) Serviço 'siatdEAR.ear/siatd-web.war#puBatch'
2026-08-20 09:46:02,322 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-2) WFLYJCA0099: Fonte de dados não transacional desvinculada: java:jboss/datasources/OracleSiatdDS
2026-08-20 09:46:02,322 INFO  [org.infinispan.manager.DefaultCacheManager] (ServerService Thread Pool -- 96) Stopping cache manager null on null
2026-08-20 09:46:02,325 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0028: Implantação interrompida framework.jar (runtime-name: framework.jar) em 134ms
2026-08-20 09:46:02,328 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-4) WFLYJCA0019: Serviço de driver interrompido com nome-do-driver = ojdbc17.jar
2026-08-20 09:46:02,372 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0208: Interrompendo a subimplantação (runtime-name: siatd-web.war) em 182ms
2026-08-20 09:46:02,374 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0028: Implantação interrompida siatdEAR.ear (runtime-name: siatdEAR.ear) em 186ms
2026-08-20 09:46:02,416 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 85) WFLYCLINF0003: Cache http-remoting-connector encerrado a partir do recipiente ejb
2026-08-20 09:46:02,419 INFO  [org.infinispan.manager.DefaultCacheManager] (ServerService Thread Pool -- 96) Stopping cache manager null on null
2026-08-20 09:46:02,448 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0028: Implantação interrompida ojdbc17.jar (runtime-name: ojdbc17.jar) em 263ms
2026-08-20 09:46:02,449 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0008: Undertow AJP ouvinte ajp está suspendendo
2026-08-20 09:46:02,449 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0008: Undertow HTTPS ouvinte https está suspendendo
2026-08-20 09:46:02,452 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0007: Undertow AJP ouvinte ajp interrompido, estava vinculado a 0.0.0.0:8009
2026-08-20 09:46:02,452 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0007: Undertow HTTPS ouvinte https interrompido, estava vinculado a 0.0.0.0:8443
2026-08-20 09:46:02,505 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 97) AMQ221002: Apache ActiveMQ Artemis Message Broker version 2.16.0.redhat-00052 [8c98d7d4-094e-11ee-abda-00505682f3d2] stopped, uptime 16 hours 35 minutes
2026-08-20 09:46:02,505 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0008: Undertow HTTP ouvinte default está suspendendo
2026-08-20 09:46:02,507 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0007: Undertow HTTP ouvinte default interrompido, estava vinculado a 0.0.0.0:8080
2026-08-20 09:46:02,508 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0004: Interrompendo Undertow 2.2.33.SP1-redhat-00001
2026-08-20 09:46:02,516 INFO  [org.jboss.as] (MSC service thread 1-4) WFLYSRV0050: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) interrompido em 328ms
[p585600@caddeapllx1992 logs]$
