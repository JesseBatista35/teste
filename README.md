
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ JBIN=$(dirname $(sudo readlink -f /proc/8867/exe)); echo $JBIN; ls $JBIN | grep -E "jcmd|jstack|jmap"
/usr/java/jdk1.8.0_221/jre/bin
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ sudo -u jboss $JBIN/jcmd 8867 GC.class_histogram > /tmp/sigpd_histo_$(date +%H%M).txt; head -40 /tmp/sigpd_histo_*.txt
sudo: /usr/java/jdk1.8.0_221/jre/bin/jcmd: comando não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ sudo -u jboss $JBIN/jcmd 8867 Thread.print > /tmp/sigpd_td_$(date +%H%M).txt
sudo: /usr/java/jdk1.8.0_221/jre/bin/jcmd: comando não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$ sudo kill -3 8867
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
