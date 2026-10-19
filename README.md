JDK=/usr/java/jdk1.8.0_221/bin; ls $JDK | grep -E "jcmd|jstack|jmap"

sudo -u jboss $JDK/jcmd 8867 GC.class_histogram > /tmp/sigpd_histo_$(date +%H%M).txt; head -40 /tmp/sigpd_histo_*.txt
sudo -u jboss $JDK/jstack -l 8867 > /tmp/sigpd_td_$(date +%H%M).txt; wc -l /tmp/sigpd_td_*.txt

ls -la --time-style=+%H:%M /logs/jboss/jboss-eap/standalone/sigpd-backend/console-stdout.log
grep -c '"default task' /logs/jboss/jboss-eap/standalone/sigpd-backend/console-stdout.log

systemctl status 8867 | head -3
sudo systemctl restart <serviço>
