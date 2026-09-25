



[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# wc -l /tmp/batch-tdF.txt; head -5 /tmp/batch-tdF.txt
58106 /tmp/batch-tdF.txt
Attaching to process ID 84756, please wait...
Debugger attached successfully.
Server compiler detected.
JVM version is 25.471-b09
Deadlock Detection:
[root@sbrdeapllx104 p585600]# grep -n "oracle.jdbc\|socketRead\|br\.gov\.caixa\|\.gec\." /tmp/batch-tdF.txt | head -40
239: - java.net.SocketInputStream.socketRead0(java.io.FileDescriptor, byte[], int, int, int) @bci=0 (Compiled frame; information may be imprecise)
240: - java.net.SocketInputStream.socketRead(java.io.FileDescriptor, byte[], int, int, int) @bci=8, line=116 (Compiled frame)
21102: - br.gov.caixa.sigec.persistencia.jpa.DAOSuporteComAuditoriaJPA.listarJPAQL() @bci=4, line=94 (Compiled frame)
21103: - br.gov.caixa.sigec.persistencia.jpa.DAOSuporteComAuditoriaJPA.listar() @bci=1, line=78 (Compiled frame)
21104: - br.gov.caixa.sigec.persistencia.jpa.DAOSuporteComAuditoriaJPA.primeiro() @bci=1, line=84 (Compiled frame)
21105: - br.gov.caixa.sigec.negocio.SentinelaScheduleBean.verificarNovasParametrizacoes() @bci=14, line=89 (Compiled frame)
21106: - br.gov.caixa.sigec.negocio.SentinelaScheduleBean.lambda$inicializar$0() @bci=1, line=80 (Compiled frame)
21107: - br.gov.caixa.sigec.negocio.SentinelaScheduleBean$$Lambda$1837.run() @bci=4 (Compiled frame)
55824: - br.gov.caixa.sigec.negocio.TransferenciaEletronicaLegacyCallNCRBean.criarContextoEnvioFilaVerificacao() @bci=35, line=440 (Compiled frame)
55825: - br.gov.caixa.sigec.negocio.TransferenciaEletronicaLegacyCallNCRBean.processarRecebimentosBaseEnvioNCR() @bci=54, line=321 (Compiled frame)
55835: - br.gov.caixa.arqrefcore.log.LoggerIntercepter.intercept(javax.interceptor.InvocationContext) @bci=114, line=50 (Compiled frame)
55897: - br.gov.caixa.sigec.negocio.TransferenciaEletronicaLegacyCallNCRBean$$$view1626.processarRecebimentosBaseEnvioNCR() @bci=24 (Compiled frame)
55906: - br.gov.caixa.sigec.negocio.TransferenciaEletronicaLegacyCallNCRBean$Proxy$_$$_Weld$EnterpriseProxy$.processarRecebimentosBaseEnvioNCR() @bci=25 (Compiled frame)
55907: - br.gov.caixa.sigec.negocio.ProcessadorLegacyCallTEDNCRBean.processarRecebimento() @bci=40, line=80 (Compiled frame)
55908: - br.gov.caixa.sigec.negocio.AbstractGerenciadorTimers.timeout(javax.ejb.Timer) @bci=67, line=118 (Compiled frame)
55909: - br.gov.caixa.sigec.negocio.ProcessadorLegacyCallTEDNCRBean.timeout(javax.ejb.Timer) @bci=2, line=53 (Compiled frame)
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# # Conexões abertas do batch com o banco (porta 1521) e com o Service Bus (5671)
[root@sbrdeapllx104 p585600]# ss -tnp | grep "pid=$P," | awk '{print $5}' | sort | uniq -c | sort -rn | head
   1282 10.252.32.63:80
     96 10.252.32.65:80
      6 10.192.224.76:5021
      1 127.0.0.1:44297
      1 10.116.98.52:6666
      1 10.116.98.51:57704
      1 10.116.98.51:37500
      1 10.116.98.51:37488
      1 10.116.98.51:37444
      1 10.116.98.51:37438
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#

