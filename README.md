**JBIN=$(dirname $(sudo readlink -f /proc/8867/exe)); echo $JBIN; ls $JBIN | grep -E "jcmd|jstack|jmap"

# Se existir jcmd: histograma de objetos (rápido, é o mais útil pro dev)
sudo -u jboss $JBIN/jcmd 8867 GC.class_histogram > /tmp/sigpd_histo_$(date +%H%M).txt; head -40 /tmp/sigpd_histo_*.txt
sudo -u jboss $JBIN/jcmd 8867 Thread.print > /tmp/sigpd_td_$(date +%H%M).txt

# Se for só JRE: thread dump via sinal (sai no console-stdout.log)
sudo kill -3 8867
**
