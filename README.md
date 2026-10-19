# 1. Log da aplicação (caminho absoluto)
tail -n 300 /logs/jboss/jboss-eap/standalone/sigpd-backend/server.log
grep -iE "OutOfMemory|MODCLUSTER|ERROR|WFLYUT|Full GC" /logs/jboss/jboss-eap/standalone/sigpd-backend/server.log | tail -n 50

# 2. Saúde do GC (procure Full GC em sequência ou pausas longas)
tail -n 50 /logs/jboss/jboss-eap/standalone/sigpd-backend/gc.log
grep -c "Full GC" /logs/jboss/jboss-eap/standalone/sigpd-backend/gc.log

# 3. Portas em que o Java está escutando (http/ajp/offset)
ss -ltnp 2>/dev/null | grep -E "8080|8009|8443|9990" ; ss -ltn | grep 10.116.194.156

# 4. A aplicação responde localmente? (ajuste a porta conforme o item 3)
curl -sv -m 10 http://10.116.194.156:8080/sigpd-api/v1/health-check/live

# 5. O nó alcança os proxies mod_cluster?
curl -s -m 10 http://caddeapllx135.extra.caixa.gov.br:6666/mod_cluster_manager | grep -i -A3 caddeapllx929
curl -s -m 10 http://caddeapllx136.extra.caixa.gov.br:6666/mod_cluster_manager | grep -i -A3 caddeapllx929

# 6. Para onde o nome aponta e se o front responde
nslookup sigpd-backend.esteiras.des.caixa
curl -skv -m 10 https://sigpd-backend.esteiras.des.caixa/sigpd-api/v1/health-check/live -o /dev/null
curl -sv  -m 10 http://sigpd-backend.esteiras.des.caixa/sigpd-api/v1/health-check/live  -o /dev/null




-sh-4.2$
-sh-4.2$ tail -n 300 /logs/jboss/jboss-eap/standalone/sigpd-backend/server.log
2026-10-19 00:00:00,491 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 5) Inicio inativação de Conjuntos Tratamento.
2026-10-19 00:00:00,491 INFO  [br.gov.caixa.sigpd.api.tipo_canal.services.impl.TipoCanalImpl] (EJB default - 2) C00X-11 - [API] getListagemTipoCanal()
2026-10-19 00:00:04,914 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 5) Sem Conjuntos Tratamento para inativação.
2026-10-19 00:15:01,915 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 3) Inicio inativação de Conjuntos Tratamento.
2026-10-19 00:15:20,895 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 3) Sem Conjuntos Tratamento para inativação.
2026-10-19 00:30:02,683 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 6) Inicio inativação de Conjuntos Tratamento.
2026-10-19 00:30:03,075 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 6) Sem Conjuntos Tratamento para inativação.
2026-10-19 00:45:00,001 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 7) Inicio inativação de Conjuntos Tratamento.
2026-10-19 00:45:04,167 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 7) Sem Conjuntos Tratamento para inativação.
2026-10-19 01:00:10,432 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 9) Inicio inativação de Conjuntos Tratamento.
2026-10-19 01:00:10,436 INFO  [br.gov.caixa.sigpd.batch.descarteDados.schedulers.DescarteDadosSchedule] (EJB default - 8) >>> Iniciando schedule de descarte de dados
2026-10-19 01:00:10,437 INFO  [br.gov.caixa.sigpd.batch.descarteDados.services.DescarteDadosService] (EJB default - 8) >>> Iniciando rotina de descarte LGPD
2026-10-19 01:00:10,778 INFO  [br.gov.caixa.sigpd.batch.descarteDados.services.DescarteDadosService] (EJB default - 8) LGPD - Registros removidos:
2026-10-19 01:00:10,778 INFO  [br.gov.caixa.sigpd.batch.descarteDados.services.DescarteDadosService] (EJB default - 8)   ENVIO (054):      0
2026-10-19 01:00:10,778 INFO  [br.gov.caixa.sigpd.batch.descarteDados.services.DescarteDadosService] (EJB default - 8)   EMISSÃO (053):    0
2026-10-19 01:00:10,778 INFO  [br.gov.caixa.sigpd.batch.descarteDados.services.DescarteDadosService] (EJB default - 8)   DECLARAÇÃO (048): 0
2026-10-19 01:00:10,778 INFO  [br.gov.caixa.sigpd.batch.descarteDados.services.DescarteDadosService] (EJB default - 8)   SOLICITAÇÃO (044): 0
2026-10-19 01:00:10,778 INFO  [br.gov.caixa.sigpd.batch.descarteDados.services.DescarteDadosService] (EJB default - 8) >>> Rotina de descarte LGPD finalizada com sucesso
2026-10-19 01:00:10,778 INFO  [br.gov.caixa.sigpd.batch.descarteDados.schedulers.DescarteDadosSchedule] (EJB default - 8) >>> Schedule de descarte de dados finalizado
2026-10-19 01:00:10,833 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 9) Sem Conjuntos Tratamento para inativação.
2026-10-19 01:15:04,106 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 10) Inicio inativação de Conjuntos Tratamento.
2026-10-19 01:15:04,505 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 10) Sem Conjuntos Tratamento para inativação.
2026-10-19 01:30:01,521 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 1) Inicio inativação de Conjuntos Tratamento.
2026-10-19 01:30:09,363 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 1) Sem Conjuntos Tratamento para inativação.
2026-10-19 01:45:00,008 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 2) Inicio inativação de Conjuntos Tratamento.
2026-10-19 01:45:00,417 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 2) Sem Conjuntos Tratamento para inativação.
2026-10-19 02:00:03,641 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 4) Inicio inativação de Conjuntos Tratamento.
2026-10-19 02:00:04,108 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 4) Sem Conjuntos Tratamento para inativação.
2026-10-19 02:15:00,007 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 3) Inicio inativação de Conjuntos Tratamento.
2026-10-19 02:15:00,364 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 3) Sem Conjuntos Tratamento para inativação.
2026-10-19 02:30:03,491 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 6) Inicio inativação de Conjuntos Tratamento.
2026-10-19 02:30:07,534 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 6) Sem Conjuntos Tratamento para inativação.
2026-10-19 02:45:00,008 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 7) Inicio inativação de Conjuntos Tratamento.
2026-10-19 02:45:11,667 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 7) Sem Conjuntos Tratamento para inativação.
2026-10-19 03:00:00,241 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 8) Inicio inativação de Conjuntos Tratamento.
2026-10-19 03:00:00,899 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 8) Sem Conjuntos Tratamento para inativação.
2026-10-19 03:15:06,600 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 9) Inicio inativação de Conjuntos Tratamento.
2026-10-19 03:15:07,013 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 9) Sem Conjuntos Tratamento para inativação.
2026-10-19 03:30:02,031 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 10) Inicio inativação de Conjuntos Tratamento.
2026-10-19 03:30:02,438 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 10) Sem Conjuntos Tratamento para inativação.
2026-10-19 03:45:01,617 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 1) Inicio inativação de Conjuntos Tratamento.
2026-10-19 03:45:05,824 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 1) Sem Conjuntos Tratamento para inativação.
2026-10-19 04:00:01,326 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 2) Inicio inativação de Conjuntos Tratamento.
2026-10-19 04:00:01,810 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 2) Sem Conjuntos Tratamento para inativação.
2026-10-19 04:15:02,968 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 5) Inicio inativação de Conjuntos Tratamento.
2026-10-19 04:15:03,391 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 5) Sem Conjuntos Tratamento para inativação.
2026-10-19 04:30:02,839 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 4) Inicio inativação de Conjuntos Tratamento.
2026-10-19 04:30:03,245 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 4) Sem Conjuntos Tratamento para inativação.
2026-10-19 04:45:00,001 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 3) Inicio inativação de Conjuntos Tratamento.
2026-10-19 04:45:07,811 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 3) Sem Conjuntos Tratamento para inativação.
2026-10-19 05:00:00,314 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 6) Inicio inativação de Conjuntos Tratamento.
2026-10-19 05:00:00,679 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 6) Sem Conjuntos Tratamento para inativação.
2026-10-19 05:15:01,501 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 7) Inicio inativação de Conjuntos Tratamento.
2026-10-19 05:15:01,894 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 7) Sem Conjuntos Tratamento para inativação.
2026-10-19 05:30:02,185 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 8) Inicio inativação de Conjuntos Tratamento.
2026-10-19 05:30:17,025 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 8) Sem Conjuntos Tratamento para inativação.
2026-10-19 05:45:00,001 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 9) Inicio inativação de Conjuntos Tratamento.
2026-10-19 05:45:07,770 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 9) Sem Conjuntos Tratamento para inativação.
2026-10-19 06:00:07,236 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 10) Inicio inativação de Conjuntos Tratamento.
2026-10-19 06:00:07,626 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 10) Sem Conjuntos Tratamento para inativação.
2026-10-19 06:15:02,655 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 1) Inicio inativação de Conjuntos Tratamento.
2026-10-19 06:15:10,413 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 1) Sem Conjuntos Tratamento para inativação.
2026-10-19 06:30:00,294 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 2) Inicio inativação de Conjuntos Tratamento.
2026-10-19 06:30:00,784 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 2) Sem Conjuntos Tratamento para inativação.
2026-10-19 06:45:01,124 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 5) Inicio inativação de Conjuntos Tratamento.
2026-10-19 06:45:05,153 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 5) Sem Conjuntos Tratamento para inativação.
2026-10-19 07:00:00,000 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 4) Inicio inativação de Conjuntos Tratamento.
2026-10-19 07:00:07,996 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 4) Sem Conjuntos Tratamento para inativação.
2026-10-19 07:15:03,610 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 3) Inicio inativação de Conjuntos Tratamento.
2026-10-19 07:15:07,635 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 3) Sem Conjuntos Tratamento para inativação.
2026-10-19 07:30:00,001 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 6) Inicio inativação de Conjuntos Tratamento.
2026-10-19 07:30:00,460 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 6) Sem Conjuntos Tratamento para inativação.
2026-10-19 07:45:00,000 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 7) Inicio inativação de Conjuntos Tratamento.
2026-10-19 07:45:00,540 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 7) Sem Conjuntos Tratamento para inativação.
2026-10-19 08:00:00,000 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 8) Inicio inativação de Conjuntos Tratamento.
2026-10-19 08:00:11,486 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 8) Sem Conjuntos Tratamento para inativação.
2026-10-19 08:15:04,822 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 9) Inicio inativação de Conjuntos Tratamento.
2026-10-19 08:15:08,838 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 9) Sem Conjuntos Tratamento para inativação.
2026-10-19 08:30:00,000 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 10) Inicio inativação de Conjuntos Tratamento.
2026-10-19 08:30:00,399 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 10) Sem Conjuntos Tratamento para inativação.
2026-10-19 08:45:03,724 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 1) Inicio inativação de Conjuntos Tratamento.
2026-10-19 08:45:04,117 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 1) Sem Conjuntos Tratamento para inativação.
2026-10-19 09:00:06,768 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 2) Inicio inativação de Conjuntos Tratamento.
2026-10-19 09:00:10,905 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 2) Sem Conjuntos Tratamento para inativação.
2026-10-19 09:15:03,237 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 5) Inicio inativação de Conjuntos Tratamento.
2026-10-19 09:15:03,621 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 5) Sem Conjuntos Tratamento para inativação.
2026-10-19 09:30:01,994 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 4) Inicio inativação de Conjuntos Tratamento.
2026-10-19 09:30:06,037 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 4) Sem Conjuntos Tratamento para inativação.
2026-10-19 09:45:01,091 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 3) Inicio inativação de Conjuntos Tratamento.
2026-10-19 09:45:05,195 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 3) Sem Conjuntos Tratamento para inativação.
2026-10-19 10:00:03,035 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 6) Inicio inativação de Conjuntos Tratamento.
2026-10-19 10:00:14,842 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 6) Sem Conjuntos Tratamento para inativação.
2026-10-19 10:15:02,872 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 7) Inicio inativação de Conjuntos Tratamento.
2026-10-19 10:15:03,282 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 7) Sem Conjuntos Tratamento para inativação.
2026-10-19 10:30:06,355 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 8) Inicio inativação de Conjuntos Tratamento.
2026-10-19 10:30:06,871 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 8) Sem Conjuntos Tratamento para inativação.
2026-10-19 10:45:02,683 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 9) Inicio inativação de Conjuntos Tratamento.
2026-10-19 10:45:06,766 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 9) Sem Conjuntos Tratamento para inativação.
2026-10-19 11:00:00,638 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 10) Inicio inativação de Conjuntos Tratamento.
2026-10-19 11:00:04,914 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 10) Sem Conjuntos Tratamento para inativação.
2026-10-19 11:15:03,057 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 1) Inicio inativação de Conjuntos Tratamento.
2026-10-19 11:15:10,767 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 1) Sem Conjuntos Tratamento para inativação.
2026-10-19 11:30:00,001 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 2) Inicio inativação de Conjuntos Tratamento.
2026-10-19 11:30:07,751 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 2) Sem Conjuntos Tratamento para inativação.
2026-10-19 11:45:00,000 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 5) Inicio inativação de Conjuntos Tratamento.
2026-10-19 11:45:00,333 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 5) Sem Conjuntos Tratamento para inativação.
2026-10-19 12:00:01,771 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 4) Inicio inativação de Conjuntos Tratamento.
2026-10-19 12:00:06,049 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 4) Sem Conjuntos Tratamento para inativação.
2026-10-19 12:15:01,912 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 3) Inicio inativação de Conjuntos Tratamento.
2026-10-19 12:15:02,373 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 3) Sem Conjuntos Tratamento para inativação.
2026-10-19 12:30:06,069 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 6) Inicio inativação de Conjuntos Tratamento.
2026-10-19 12:30:06,541 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 6) Sem Conjuntos Tratamento para inativação.
2026-10-19 12:45:00,411 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 7) Inicio inativação de Conjuntos Tratamento.
2026-10-19 12:45:00,825 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 7) Sem Conjuntos Tratamento para inativação.
2026-10-19 13:00:03,317 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 8) Inicio inativação de Conjuntos Tratamento.
2026-10-19 13:00:03,647 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 8) Sem Conjuntos Tratamento para inativação.
2026-10-19 13:15:00,000 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 9) Inicio inativação de Conjuntos Tratamento.
2026-10-19 13:15:00,407 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 9) Sem Conjuntos Tratamento para inativação.
2026-10-19 13:30:00,000 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 10) Inicio inativação de Conjuntos Tratamento.
2026-10-19 13:30:15,347 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 10) Sem Conjuntos Tratamento para inativação.
2026-10-19 13:45:00,882 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 1) Inicio inativação de Conjuntos Tratamento.
2026-10-19 13:45:01,379 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 1) Sem Conjuntos Tratamento para inativação.
2026-10-19 14:00:02,738 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 2) Inicio inativação de Conjuntos Tratamento.
2026-10-19 14:00:06,923 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 2) Sem Conjuntos Tratamento para inativação.
2026-10-19 14:15:07,074 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 5) Inicio inativação de Conjuntos Tratamento.
2026-10-19 14:15:07,449 INFO  [br.gov.caixa.sigpd.api.conjuntos.services.impl.RotinaOperacionalServiceImpl] (EJB default - 5) Sem Conjuntos Tratamento para inativação.
2026-10-19 14:22:37,243 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-29) 1 - ##### MultiTenancyConfigResolver->resolve
2026-10-19 14:22:37,243 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-31) 1 - ##### MultiTenancyConfigResolver->resolve
2026-10-19 14:22:37,244 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-29) 1.2 - ##### MultiTenancyConfigResolver->RealmCache.getDefaultKeycloakDeploymentConfig()
2026-10-19 14:22:37,244 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-31) 1.2 - ##### MultiTenancyConfigResolver->RealmCache.getDefaultKeycloakDeploymentConfig()
2026-10-19 14:22:37,243 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-25) 1 - ##### MultiTenancyConfigResolver->resolve
2026-10-19 14:22:37,244 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-25) 1.2 - ##### MultiTenancyConfigResolver->RealmCache.getDefaultKeycloakDeploymentConfig()
2026-10-19 14:22:37,245 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-25) 1 - ##### MultiTenancyConfigResolver->resolve
2026-10-19 14:22:37,245 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-25) 1.2 - ##### MultiTenancyConfigResolver->RealmCache.getDefaultKeycloakDeploymentConfig()
2026-10-19 14:22:37,245 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-31) 1 - ##### MultiTenancyConfigResolver->resolve
2026-10-19 14:22:37,245 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-31) 1.2 - ##### MultiTenancyConfigResolver->RealmCache.getDefaultKeycloakDeploymentConfig()
2026-10-19 14:22:37,245 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-29) 1 - ##### MultiTenancyConfigResolver->resolve
2026-10-19 14:22:37,245 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-29) 1.2 - ##### MultiTenancyConfigResolver->RealmCache.getDefaultKeycloakDeploymentConfig()
2026-10-19 14:22:41,080 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-28) 1 - ##### MultiTenancyConfigResolver->resolve
2026-10-19 14:22:41,080 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-28) 1.2 - ##### MultiTenancyConfigResolver->RealmCache.getDefaultKeycloakDeploymentConfig()
2026-10-19 14:22:41,080 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-28) 1 - ##### MultiTenancyConfigResolver->resolve
2026-10-19 14:22:41,080 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-28) 1.2 - ##### MultiTenancyConfigResolver->RealmCache.getDefaultKeycloakDeploymentConfig()
2026-10-19 14:22:41,157 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-27) 1 - ##### MultiTenancyConfigResolver->resolve
2026-10-19 14:22:41,163 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-10) 1 - ##### MultiTenancyConfigResolver->resolve
2026-10-19 14:22:41,223 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-10) 2 - #### ClientID ####cli-web-gpd
2026-10-19 14:22:41,223 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-10) 3 - ##### tokenRoles: [GPD_ENCARREGADO, APD_LGPD_REG_ACESSO_DADOS_API, uma_authorization]
2026-10-19 14:22:41,223 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-10)  4- ##### facade: org.keycloak.adapters.servlet.ServletHttpFacade$RequestFacade@69d88d81
2026-10-19 14:22:41,223 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-10)  5- ##### getHostName: sigpd-backend.esteiras.des.caixa
2026-10-19 14:22:41,223 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-10) 6 - ##### MultiTenancyConfigResolver Resolvido com Sucesso
2026-10-19 14:22:41,223 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-10) 1 - ##### MultiTenancyConfigResolver->resolve
2026-10-19 14:22:41,224 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-10) 2 - #### ClientID ####cli-web-gpd
2026-10-19 14:22:41,224 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-10) 3 - ##### tokenRoles: [GPD_ENCARREGADO, APD_LGPD_REG_ACESSO_DADOS_API, uma_authorization]
2026-10-19 14:22:41,224 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-10)  4- ##### facade: org.keycloak.adapters.servlet.ServletHttpFacade$RequestFacade@69d88d81
2026-10-19 14:22:41,224 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-10)  5- ##### getHostName: sigpd-backend.esteiras.des.caixa
2026-10-19 14:22:41,224 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-10) 6 - ##### MultiTenancyConfigResolver Resolvido com Sucesso
2026-10-19 14:22:41,221 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-27) 2 - #### ClientID ####cli-web-gpd
2026-10-19 14:22:41,224 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-27) 3 - ##### tokenRoles: [GPD_ENCARREGADO, APD_LGPD_REG_ACESSO_DADOS_API, uma_authorization]
2026-10-19 14:22:41,224 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-27)  4- ##### facade: org.keycloak.adapters.servlet.ServletHttpFacade$RequestFacade@65ff69a
2026-10-19 14:22:41,224 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-27)  5- ##### getHostName: sigpd-backend.esteiras.des.caixa
2026-10-19 14:22:41,224 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-27) 6 - ##### MultiTenancyConfigResolver Resolvido com Sucesso
2026-10-19 14:22:41,224 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-27) 1 - ##### MultiTenancyConfigResolver->resolve
2026-10-19 14:22:45,168 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-9) 1 - ##### MultiTenancyConfigResolver->resolve
2026-10-19 14:22:56,360 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-9) 2 - #### ClientID ####cli-web-gpd
2026-10-19 14:22:56,361 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-9) 3 - ##### tokenRoles: [GPD_ENCARREGADO, APD_LGPD_REG_ACESSO_DADOS_API, uma_authorization]
2026-10-19 14:22:56,361 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-9)  4- ##### facade: org.keycloak.adapters.servlet.ServletHttpFacade$RequestFacade@61a24b65
2026-10-19 14:22:56,361 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-9)  5- ##### getHostName: sigpd-backend.esteiras.des.caixa
2026-10-19 14:22:56,361 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-9) 6 - ##### MultiTenancyConfigResolver Resolvido com Sucesso
2026-10-19 14:22:56,361 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-9) 1 - ##### MultiTenancyConfigResolver->resolve
2026-10-19 14:22:56,362 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-9) 2 - #### ClientID ####cli-web-gpd
2026-10-19 14:22:56,362 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-9) 3 - ##### tokenRoles: [GPD_ENCARREGADO, APD_LGPD_REG_ACESSO_DADOS_API, uma_authorization]
2026-10-19 14:22:56,362 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-9)  4- ##### facade: org.keycloak.adapters.servlet.ServletHttpFacade$RequestFacade@61a24b65
2026-10-19 14:22:56,362 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-9)  5- ##### getHostName: sigpd-backend.esteiras.des.caixa
2026-10-19 14:22:56,362 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-9) 6 - ##### MultiTenancyConfigResolver Resolvido com Sucesso
2026-10-19 14:22:56,363 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-27) 2 - #### ClientID ####cli-web-gpd
2026-10-19 14:22:56,363 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-27) 3 - ##### tokenRoles: [GPD_ENCARREGADO, APD_LGPD_REG_ACESSO_DADOS_API, uma_authorization]
2026-10-19 14:22:56,363 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-27)  4- ##### facade: org.keycloak.adapters.servlet.ServletHttpFacade$RequestFacade@65ff69a
2026-10-19 14:22:56,363 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-27)  5- ##### getHostName: sigpd-backend.esteiras.des.caixa
2026-10-19 14:22:56,363 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-27) 6 - ##### MultiTenancyConfigResolver Resolvido com Sucesso
2026-10-19 14:24:07,834 INFO  [br.gov.caixa.sigpd.api.tipo_canal.services.impl.TipoCanalImpl] (default task-9) C00X-11 - [API] getListagemTipoCanal()
2026-10-19 14:24:22,601 INFO  [br.gov.caixa.sigpd.api.commons.providers.LoggerRequestFilter] (default task-9) Request GET /v1/finalidades/get/finalidades from IP 10.116.4.158
2026-10-19 14:24:30,196 INFO  [br.gov.caixa.sigpd.api.tipo_canal.services.impl.TipoCanalImpl] (default task-10) C00X-11 - [API] getListagemTipoCanal()
2026-10-19 14:24:30,197 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.producers.SecurityContextProducer] (default task-9) br.gov.caixa.sigpd.api.infraestrutura.seguranca.services.ApplicationSecurityImpl@5d23690e
2026-10-19 14:24:30,199 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.producers.SecurityContextProducer] (default task-9) br.gov.caixa.sigpd.api.infraestrutura.seguranca.services.ApplicationSecurityImpl@5d23690e
2026-10-19 14:24:30,201 INFO  [br.gov.caixa.sigpd.api.commons.providers.LoggerRequestFilter] (default task-10) Request GET /v1/titulares/declaracoes from IP 10.116.4.145
2026-10-19 14:24:41,372 INFO  [br.gov.caixa.sigpd.api.commons.interceptors.TrilhaAuditoriaInterceptor] (default task-9) Grava trilha de auditoria.
2026-10-19 14:24:56,440 INFO  [br.gov.caixa.sigpd.api.trilha_auditoria.services.impl.TrilhaAuditoriaServiceImpl] (default task-9) TrilhaAuditoriaServiceImpl.insert() chamado com: TrilhaAuditoria(id=null, funcionalidade=FuncionalidadeSistema(id=7), tipoEvento=3)
2026-10-19 14:24:48,925 INFO  [br.gov.caixa.sigpd.api.tipo_canal.services.impl.TipoCanalImpl] (default task-27) C00X-11 - [API] getListagemTipoCanal()
2026-10-19 14:25:18,750 INFO  [br.gov.caixa.sigpd.api.commons.providers.LoggerRequestFilter] (default task-27) Request GET /v1/titulares/declaracoes from IP 10.116.4.149
2026-10-19 14:25:26,234 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.producers.SecurityContextProducer] (default task-27) br.gov.caixa.sigpd.api.infraestrutura.seguranca.services.ApplicationSecurityImpl@651cf40d
2026-10-19 14:25:26,234 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.producers.SecurityContextProducer] (default task-27) br.gov.caixa.sigpd.api.infraestrutura.seguranca.services.ApplicationSecurityImpl@651cf40d
2026-10-19 14:25:29,974 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.producers.SecurityContextProducer] (default task-10) br.gov.caixa.sigpd.api.infraestrutura.seguranca.services.ApplicationSecurityImpl@36e81ede
2026-10-19 14:25:29,974 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.producers.SecurityContextProducer] (default task-10) br.gov.caixa.sigpd.api.infraestrutura.seguranca.services.ApplicationSecurityImpl@36e81ede
2026-10-19 14:25:29,974 INFO  [br.gov.caixa.sigpd.api.trilha_auditoria.services.impl.TrilhaAuditoriaServiceImpl] (default task-9) Data/Hora atual recuperada: 2026-10-19T14:25:11
2026-10-19 14:25:52,274 INFO  [br.gov.caixa.sigpd.api.trilha_auditoria.services.impl.TrilhaAuditoriaServiceImpl] (default task-9) Trilha de auditoria gravada com sucesso.
2026-10-19 14:27:21,804 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-3) 1 - ##### MultiTenancyConfigResolver->resolve
2026-10-19 14:27:21,806 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-3) 1.2 - ##### MultiTenancyConfigResolver->RealmCache.getDefaultKeycloakDeploymentConfig()
2026-10-19 14:27:21,806 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-3) 1 - ##### MultiTenancyConfigResolver->resolve
2026-10-19 14:27:21,806 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-3) 1.2 - ##### MultiTenancyConfigResolver->RealmCache.getDefaultKeycloakDeploymentConfig()
2026-10-19 14:27:25,540 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-26) 1 - ##### MultiTenancyConfigResolver->resolve
2026-10-19 14:27:25,540 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-26) 1.2 - ##### MultiTenancyConfigResolver->RealmCache.getDefaultKeycloakDeploymentConfig()
2026-10-19 14:27:25,540 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-26) 1 - ##### MultiTenancyConfigResolver->resolve
2026-10-19 14:27:25,540 INFO  [br.gov.caixa.sigpd.api.infraestrutura.seguranca.components.multitenancy.MultiTenancyConfigResolver] (default task-26) 1.2 - ##### MultiTenancyConfigResolver->RealmCache.getDefaultKeycloakDeploymentConfig()
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep -iE "OutOfMemory|MODCLUSTER|ERROR|WFLYUT|Full GC" /logs/jboss/jboss-eap/standalone/sigpd-backend/server.log | tail -n 50
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ tail -n 50 /logs/jboss/jboss-eap/standalone/sigpd-backend/gc.log
tail: não foi possível abrir “/logs/jboss/jboss-eap/standalone/sigpd-backend/gc.log” para leitura: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep -c "Full GC" /logs/jboss/jboss-eap/standalone/sigpd-backend/gc.log
grep: /logs/jboss/jboss-eap/standalone/sigpd-backend/gc.log: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ ss -ltnp 2>/dev/null | grep -E "8080|8009|8443|9990" ; ss -ltn | grep 10.116.194.156
LISTEN     0      128    10.116.194.156:8443                     *:*
LISTEN     0      50     10.116.194.156:9990                     *:*
LISTEN     129    128    10.116.194.156:8009                     *:*
LISTEN     0      128    10.116.194.156:8080                     *:*
LISTEN     0      128    10.116.194.156:8443                     *:*
LISTEN     0      50     10.116.194.156:9990                     *:*
LISTEN     129    128    10.116.194.156:8009                     *:*
LISTEN     0      50     10.116.194.156:34700                    *:*
LISTEN     0      50     10.116.194.156:7600                     *:*
LISTEN     0      128    10.116.194.156:8080                     *:*
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ curl -sv -m 10 http://10.116.194.156:8080/sigpd-api/v1/health-check/live
* About to connect() to 10.116.194.156 port 8080 (#0)
*   Trying 10.116.194.156...
* Connected to 10.116.194.156 (10.116.194.156) port 8080 (#0)
> GET /sigpd-api/v1/health-check/live HTTP/1.1
> User-Agent: curl/7.29.0
> Host: 10.116.194.156:8080
> Accept: */*
>
* Operation timed out after 10001 milliseconds with 0 out of -1 bytes received
* Closing connection 0
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ curl -s -m 10 http://caddeapllx135.extra.caixa.gov.br:6666/mod_cluster_manager | grep -i -A3 caddeapllx929
-sh-4.2$
-sh-4.2$
-sh-4.2$ curl -s -m 10 http://caddeapllx136.extra.caixa.gov.br:6666/mod_cluster_manager | grep -i -A3 caddeapllx929
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ nslookup sigpd-backend.esteiras.des.caixa
-sh: nslookup: comando não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$ curl -skv -m 10 https://sigpd-backend.esteiras.des.caixa/sigpd-api/v1/health-check/live -o /dev/null
* About to connect() to sigpd-backend.esteiras.des.caixa port 443 (#0)
*   Trying 10.116.180.22...
* Connected to sigpd-backend.esteiras.des.caixa (10.116.180.22) port 443 (#0)
* Initializing NSS with certpath: sql:/etc/pki/nssdb
* skipping SSL peer certificate verification
* SSL connection using TLS_RSA_WITH_AES_256_CBC_SHA
* Server certificate:
*       subject: CN=*.esteiras.des.caixa,O=Caixa Economica Federal,C=BR
*       start date: Abr 18 14:57:45 2024 GMT
*       expire date: Abr 18 15:07:45 2029 GMT
*       common name: *.esteiras.des.caixa
*       issuer: CN=AC Icptestes Sub,O=Caixa Economica Federal,C=BR
> GET /sigpd-api/v1/health-check/live HTTP/1.1
> User-Agent: curl/7.29.0
> Host: sigpd-backend.esteiras.des.caixa
> Accept: */*
>
< HTTP/1.1 403 Forbidden
< Date: Mon, 19 Oct 2026 18:16:01 GMT
< Server: Apache/2.4.29 (Red Hat)
< Last-Modified: Fri, 17 Jan 2020 13:41:12 GMT
< ETag: "10f0-59c5618474e00"
< Accept-Ranges: bytes
< Content-Length: 4336
< Connection: close
< Content-Type: text/html; charset=UTF-8
<
{ [data not shown]
* Closing connection 0
-sh-4.2$
-sh-4.2$
-sh-4.2$ curl -sv  -m 10 http://sigpd-backend.esteiras.des.caixa/sigpd-api/v1/health-check/live  -o /dev/null
* About to connect() to sigpd-backend.esteiras.des.caixa port 80 (#0)
*   Trying 10.116.180.22...
* Connected to sigpd-backend.esteiras.des.caixa (10.116.180.22) port 80 (#0)
> GET /sigpd-api/v1/health-check/live HTTP/1.1
> User-Agent: curl/7.29.0
> Host: sigpd-backend.esteiras.des.caixa
> Accept: */*
>
< HTTP/1.1 302 Found : Moved Temporarily
< Location: https://sigpd-backend.esteiras.des.caixa/sigpd-api/v1/health-check/live
< Connection: close
< Cache-Control: no-cache
< Pragma: no-cache
<
{ [data not shown]
* Closing connection 0
-sh-4.2$
-sh-4.2$
-sh-4.2$




Microsoft Windows [versão 10.0.26200.9448]
(c) Microsoft Corporation. Todos os direitos reservados.

C:\Users\p585600>nslookup sigpd-backend.esteiras.des.caixa
Servidor:  dfaddssd001.corp.caixa.gov.br
Address:  10.222.149.10

Nome:    sigpd-backend.esteiras.des.caixa
Address:  10.116.180.22


C:\Users\p585600>


