domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /] exit
[root@sbrdeapllx069 p585600]# ps -ef | grep "Host Controller" | grep -o "org.jboss.boot.log.file=[^ ]*"
org.jboss.boot.log.file=/opt/jboss/jboss-eap/dc/log/host-controller.log
[root@sbrdeapllx069 p585600]# grep -nE "SIGEC-PORTABILIDADE-BATCH|deploy" <arquivo_retornado_acima> | tail -40
bash: erro de sintaxe próximo do `token' não esperado `|'
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#




[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# LOG=/opt/jboss/jboss-eap/hc/log/servers/sigec-portabilidade-batch_node1_lx104/server.log
[root@sbrdeapllx104 p585600]# awk 'NR<=735 && /^[0-9]{4}-/{l=NR": "$0} NR==735{print l}' $LOG | cut -c1-400
594: 2026-10-22 14:25:01,203SEVERE(EJB default - 7)Erro NUCLEA para portabilidade 53559: NucleaException(statusCode=400, erro=ErroNucleaDTO(mensagemErro=Erro de validacao do arquivo de evidencia. Resposta de teste com 2000 caracteres para validar a gravacao na GECTB194. ............................................................................[0200]...............................................
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# grep -oE "^[a-zA-Z_.$]+(Exception|Error)[^ ]*(: .{0,150})?" $LOG | sort | uniq -c | sort -rn | head -15
[root@sbrdeapllx104 p585600]# grep -oE "^[0-9]{4}-[0-9-]+ [0-9:,]+(ERROR|WARN).{0,180}" $LOG | cut -c24- | sed 's/[0-9]\{3,\}/N/g' | sort | uniq -c | sort -rn | head -15
     14 WARNING(EJB default - 7)MTR batch da portabilidade 53.N: ERRO_NUCLEA — Requisição inválida: {"mensagemErro":"Erro de validacao do arquivo de evidencia. Resposta de teste com N car
     14 WARNING(EJB default - 7)Erro de negócio ao processar documento: documentoId=N, numeroSigec=N, tipo=PROSPECAO, causa=Requisição inválida: {"mensagemErro":"Erro de validacao do
     14 WARNING(EJB default - 7)Erro de negócio ao consultar evidência N na API NUCLEA: Evidência N não encontrada ou ainda em processamento: br.gov.caixa.sigec.comum.excep
      7 WARNING(EJB default - 4)MTR batch da portabilidade 53.N: ERRO_NUCLEA — Requisição inválida: {"mensagemErro":"Erro de validacao do arquivo de evidencia. Resposta de teste com N car
      7 WARNING(EJB default - 4)Erro de negócio ao processar documento: documentoId=N, numeroSigec=N, tipo=PROSPECAO, causa=Requisição inválida: {"mensagemErro":"Erro de validacao do
      7 WARNING(EJB default - 4)Erro de negócio ao consultar evidência N na API NUCLEA: Evidência N não encontrada ou ainda em processamento: br.gov.caixa.sigec.comum.excep
      5 WARNING(EJB default - 4)obj null
      4 WARNING(EJB default - 6)Portabilidades encontradas: 3
      2 WARNING(EJB default - 9)Portabilidades encontradas: 3
      2 WARNING(EJB default - 8)Portabilidades encontradas: 3
      2 WARNING(EJB default - 4)Portabilidades encontradas: 3
      1 WARNING(EJB default - 2)Portabilidades encontradas: 3
      1 WARNING(EJB default - 1)Portabilidades encontradas: 3
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# date; ss -tnp | grep "pid=72951" | grep -cE "10.252.32.6[35]:80"
Qui Out 22 14:35:51 -03 2026
297
[root@sbrdeapllx104 p585600]# ss -tnp | grep "pid=72951" | awk '{print $5}' | sort | uniq -c | sort -rn | head
    211 10.252.32.65:80
     86 10.252.32.63:80
     14 10.116.80.221:8443
      3 10.192.224.76:5021
      2 10.245.230.209:5671
      1 127.0.0.1:43781
      1 127.0.0.1:39544
      1 10.116.98.51:59276
      1 10.116.98.51:59274
      1 10.116.98.51:44430
[root@sbrdeapllx104 p585600]# getent hosts proxydes.caixa 10.252.32.63 10.252.32.65
10.252.32.65    proxydes.caixa
10.252.32.63    proxydes.caixa
10.252.32.63    DADNGITRNT002.intra.caixa.gov.br
10.252.32.65    proxydes.corecaixa
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
