1. Descobrir quem é o Domain Controller
bash
grep -A4 "<domain-controller" /opt/open/jboss/7.0.0/domain/configuration/host*.xml
ps -ef | grep "Host Controller" | grep -v grep
Se aparecer <local/>, o DC é este próprio host (srjtqapllx0056).
Se aparecer <remote host="..."/>, o DC é esse outro host. Nesse caso, rode o CLI de lá ou conecte apontando para ele.
2. Abrir o CLI com o usuário dono do JBoss (assim a autenticação local funciona sem senha)
bash
sudo -u spjbotr2 /opt/open/jboss/7.0.0/bin/jboss-cli.sh --connect --controller=srjtqapllx0056:9990

Se o DC for remoto, troque pelo host dele. Fora da máquina do DC, o CLI vai pedir um usuário de management.

3. Dentro do CLI, descobrir os nomes e depois ler
ls /host
/host=<host>/server-config=srjtqapllx0056_sigaf_intra_8083:read-attribute(name=group)
/server-group=<grupo>:read-attribute(name=profile)
/server-group=<grupo>/jvm=*:read-resource
ls /profile=<profile>/subsystem=datasources/data-source
/profile=<profile>/subsystem=datasources/data-source=<ds>:read-resource
/host=<host>/server=srjtqapllx0056_sigaf_intra_8083/subsystem=datasources/data-source=<ds>/statistics=pool:read-resource(include-runtime=true)
/profile=<profile>/subsystem=transactions:read-attribute(name=default-timeout)
/profile=<profile>/subsystem=io/worker=default:read-resource
O que o ps já mostra
Instância: srjtqapllx0056_sigaf_intra_8083, JBoss EAP 7.0.0, JDK 1.8.0_121, PID 69590, de pé desde 15/jan.
Heap já está em 1 GB fixo (-Xms1024m -Xmx1024m). O “512 ou 1 GB” que o Cauan pediu é o que já existe hoje, então esse pedido não muda nada. Para justificar aumento, só com evidência de GC/OOM.
-Dbr.gov.caixa.psc.connector.util.Config=/infra_app/config/sigaf/sigaf_jconnector.properties: isso pode ser o conector com o mainframe. Se a chamada ao APFAP327 passa por ele e não por um datasource, os limites de conexão e timeout estão nesse arquivo, e não no subsystem de datasources. Vale olhar primeiro:
bash
cat /infra_app/config/sigaf/sigaf_jconnector.properties
Coletar junto, de preferência durante uma execução da atualização
bash
LOG=/opt/open/jboss/7.0.0/domain/servers/srjtqapllx0056_sigaf_intra_8083/log/server.log
grep -iE "IJ000453|ARJUNA|OutOfMemory|APFAP327|timeout" $LOG | tail -50

# 3 thread dumps com ~10 s de intervalo
for i in 1 2 3; do sudo -u spjbotr2 /opt/open/java/jdk1.8.0_121/bin/jstack 69590 > /tmp/sigaf_td_$i.txt; sleep 10; done

Me manda a saída do host.xml (passo 1) e do sigaf_jconnector.properties que eu sigo com você a partir daí.
