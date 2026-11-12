5600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$ grep -o '/log_jboss/config-log4j/[^] ]*' /logs/jboss/jboss-eap/standalone/sigsj-internet/server.log | sort -u
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$ cd /tmp && rm -rf inet && mkdir inet && cd inet
[p585600@caddeapllx2854 inet]$
[p585600@caddeapllx2854 inet]$
[p585600@caddeapllx2854 inet]$
[p585600@caddeapllx2854 inet]$
[p585600@caddeapllx2854 inet]$ unzip -o -q /opt/jboss-eap/standalone/deployments/sigsj_internet-ear.ear '*.war'
[p585600@caddeapllx2854 inet]$
[p585600@caddeapllx2854 inet]$
[p585600@caddeapllx2854 inet]$
[p585600@caddeapllx2854 inet]$ unzip -p *.war WEB-INF/web.xml | grep -A1 'log4j'
      <param-name>log4j-Caixa</param-name>
      <param-value>/log_jboss/config-log4j/sigsj_internet.xml</param-value>
    </init-param>
[p585600@caddeapllx2854 inet]$
[p585600@caddeapllx2854 inet]$
[p585600@caddeapllx2854 inet]$
[p585600@caddeapllx2854 inet]$ cd /tmp && rm -rf /tmp/inet
[p585600@caddeapllx2854 tmp]$
