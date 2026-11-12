
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$ sudo grep -a -oE "(Caused by: [a-zA-Z.]+(Exception|Error)[^\n]{0,80})" /logs/jboss/jboss-eap/standalone/siemp-java-web/server.log | sort | uniq -c | sort -rn | head -15
     73 Caused by: javax.servlet.jsp.JspException: ServletExceptio
     73 Caused by: java.lang.NoSuchFieldError: value
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$

