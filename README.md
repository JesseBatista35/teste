
-sh-4.2$ JDK=/usr/java/jdk1.8.0_221/bin; ls $JDK | grep -E "jcmd|jstack|jmap"
jcmd
jmap
jstack
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ sudo -u jboss $JDK/jcmd 8867 GC.class_histogram > /tmp/sigpd_histo_$(date +%H%M).txt; head -40 /tmp/sigpd_histo_*.txt
Sinto muito, usuário p585600 não tem permissão para executar "/usr/java/jdk1.8.0_221/bin/jcmd 8867 GC.class_histogram" como jboss em caddeapllx929.extra.caixa.gov.br.
==> /tmp/sigpd_histo_1520.txt <==

==> /tmp/sigpd_histo_1522.txt <==
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ sudo -u jboss $JDK/jstack -l 8867 > /tmp/sigpd_td_$(date +%H%M).txt; wc -l /tmp/sigpd_td_*.txt
Sinto muito, usuário p585600 não tem permissão para executar "/usr/java/jdk1.8.0_221/bin/jstack -l 8867" como jboss em caddeapllx929.extra.caixa.gov.br.
0 /tmp/sigpd_td_1520.txt
0 /tmp/sigpd_td_1522.txt
0 total
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ ls -la --time-style=+%H:%M /logs/jboss/jboss-eap/standalone/sigpd-backend/console-stdout.log
-rw-r--r-- 1 jboss jboss 376265 15:21 /logs/jboss/jboss-eap/standalone/sigpd-backend/console-stdout.log
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep -c '"default task' /logs/jboss/jboss-eap/standalone/sigpd-backend/console-stdout.log
27
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ systemctl status 8867 | head -3
]● jboss-eap-standalone.service - JBoss EAP Systemctl - STANDALONE
   Loaded: loaded (/etc/systemd/system/jboss-eap-standalone.service; enabled; vendor preset: disabled)
   Active: active (running) since Qua 2026-10-14 13:41:25 -03; 5 days ago
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
