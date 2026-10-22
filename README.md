
[root@caddeapllx955 earchk]#
[root@caddeapllx955 earchk]# unzip -p /tmp/bkp_sirotcon/sirotcon-ejb.jar 'META-INF/maven/*/pom.xml' 2>/dev/null | grep -B2 -A4 -iE "log|<scope>"
[root@caddeapllx955 earchk]#
[root@caddeapllx955 earchk]#
[root@caddeapllx955 earchk]#
[root@caddeapllx955 earchk]# unzip -p /tmp/earchk/sigsj_intranet.war WEB-INF/lib/sirotcon-ejb-2.3.0.1-farm.jar > /tmp/earchk/farm.jar
unzip -p /tmp/earchk/farm.jar br/gov/caixa/sirot/ejb/SIROTConImpl.class | strings | grep -c "br/gov/caixa/log"
unzip -p /tmp/bkp_sirotcon/sirotcon-ejb.jar br/gov/caixa/sirot/ejb/SIROTConImpl.class | strings | grep -c "br/gov/caixa/log"
5
5
[root@caddeapllx955 earchk]#
[root@caddeapllx955 earchk]#
[root@caddeapllx955 earchk]#
[root@caddeapllx955 earchk]#
[root@caddeapllx955 earchk]# unzip -l /tmp/bkp_sirotcon/sirotcon-ejb.jar | grep -ciE "\.class$"
unzip -l /tmp/bkp_sirotcon/sirotcon-ejb.jar | grep -iE "lib|\.jar$" | head
2
Archive:  /tmp/bkp_sirotcon/sirotcon-ejb.jar
   327394  03-10-2015 15:50   ceflib-2.5.0.1.jar
     6436  03-10-2015 15:50   CeflogEAP-2.5.0.0.jar
   489884  03-10-2015 15:50   log4j-1.2.17.jar
   109896  03-10-2015 15:50   sirotcon-ejb-lib.jar
[root@caddeapllx955 earchk]#
[root@caddeapllx955 earchk]#
[root@caddeapllx955 earchk]#
[root@caddeapllx955 earchk]#
