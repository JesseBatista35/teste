1. Histórico do server.log (o mais importante)
bash
LOG=/opt/open/jboss/7.0.0/domain/servers/srjtqapllx0056_sigaf_intra_8083/log
ls -lt $LOG | head -20
grep -c -iE "APFAP327" $LOG/server.log*
grep -n -iE "APFAP327|indisponibilidade|IdmsJdbc|jcicsdirect|IJ0|SQLException|Exception" $LOG/server.log* | tail -150

Quero ver o stack trace completo de uma ocorrência do APFAP327. As classes envolvidas vão mostrar se a chamada vai pelo IDMS (ca.idms.jdbc) ou pelo CICS (psc.connector.jcicsdirect), e qual erro a aplicação traduz como “indisponibilidade temporária”. Se achar uma ocorrência, pegue umas 40 linhas em volta dela:

bash
grep -n "APFAP327" $LOG/server.log | tail -3        # pega o número da linha
sed -n 'LINHA-10,LINHA+40p' $LOG/server.log          # troque LINHA
2. Quem conversa com a instância (o Apache e o backend)
bash
ss -tnp | grep "pid=69590"
As conexões de entrada na 8083 (ou na AJP) mostram o IP do Apache. É lá que se verifica o ProxyTimeout e o 502 no error_log.
As de saída para as portas 3740 (IDMS) e 7002 (CICS) mostram quais backends estão em uso agora.

Se tiver acesso ao Apache:

bash
grep -riE "ProxyTimeout|^\s*Timeout|sigaf" /etc/httpd/conf* 2>/dev/null
grep -i "sigaf" /var/log/httpd/*error* | grep -iE "timeout|502" | tail -20
3. Saúde atual da JVM (GC)
bash
sudo -u spjbotr2 /opt/open/java/jdk1.8.0_121/bin/jstat -gcutil 69590 1000 5

A coluna FGC conta os full GCs desde o start, e FGCT é o tempo total gasto neles. Se esses números forem baixos e a O (old gen) não estiver perto de 100%, o argumento de “precisa de mais memória” deixa de se sustentar.

4. Histórico de CPU nos dias dos testes (se o sysstat estiver instalado)
bash
ls /var/log/sa/
sar -u -f /var/log/sa/saDD     # DD = dia do teste
sar -q -f /var/log/sa/saDD     # load average

Cruze os horários com os erros do log. Se a CPU bater em 100% com load acima de 4 nesses momentos, a contenção das 10 JVMs em 4 vCPU entra no diagnóstico.

5. Conectividade e latência com os backends
bash
time (echo > /dev/tcp/idms.caixa/3740) && echo IDMS ok
time (echo > /dev/tcp/jcicsdirect.caixa/7002) && echo CICS ok

Com o 1 e o 2 a gente provavelmente fecha o quadro hoje: a causa real do erro de integração e quem devolve o 502. Amanhã, com o time na sala, fica só a coleta durante uma execução para confirmar.
