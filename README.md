
[root@caddeapllx955 earchk]#
[root@caddeapllx955 earchk]#
[root@caddeapllx955 earchk]#
[root@caddeapllx955 earchk]# cd /tmp/earchk
unzip -o -q /tmp/bkp_sirotcon/sirotcon-ejb.jar CeflogEAP-2.5.0.0.jar ceflib-2.5.0.1.jar
unzip -l CeflogEAP-2.5.0.0.jar | grep -i "br/gov/caixa/log/Log"
unzip -l /tmp/earchk/sigsj_intranet.war | grep -iE "WEB-INF/lib/.*(ceflog|ceflib|log4j)"
     3423  12-03-2013 20:13   br/gov/caixa/log/Log.class
     4904  12-03-2013 20:13   br/gov/caixa/log/LogFactory.class
[root@caddeapllx955 earchk]#
[root@caddeapllx955 earchk]#
[root@caddeapllx955 earchk]#
[root@caddeapllx955 earchk]#
[root@caddeapllx955 earchk]#
