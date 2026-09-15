
  500  history
root@cadtqapllx046:/home/p585600# cd /etc/init.d
root@cadtqapllx046:/etc/init.d# ./nginx force-reload
[....] Reloading nginx configuration (via systemctl): nginx.serviceFailed to reload-or-try-restart nginx.service: Connection reset by peer
 failed!
root@cadtqapllx046:/etc/init.d# ./nginx force-stop
Usage: nginx {start|stop|restart|reload|force-reload|status|configtest|rotate|upgrade}
root@cadtqapllx046:/etc/init.d# ./nginx force-restart
Usage: nginx {start|stop|restart|reload|force-reload|status|configtest|rotate|upgrade}
root@cadtqapllx046:/etc/init.d# ./nginx restart
[....] Restarting nginx (via systemctl): nginx.serviceFailed to restart nginx.service: Connection reset by peer
 failed!
root@cadtqapllx046:/etc/init.d# ps auxw | grep nginx
root       3360  0.0  0.0  12732  2200 pts/0    S+   11:47   0:00 grep nginx
root      70525  0.0  0.0  82996  2524 ?        Ss   May11   0:00 nginx: master process nginx
www-data  70526  0.0  0.0  84424  6456 ?        S    May11   7:06 nginx: worker process
www-data  70527  0.0  0.0  84364  6192 ?        S    May11   6:29 nginx: worker process
www-data  70528  0.0  0.0  84416  6452 ?        S    May11   7:31 nginx: worker process
www-data  70529  0.0  0.0  84204  6192 ?        S    May11   7:15 nginx: worker process
root@cadtqapllx046:/etc/init.d# ps -ef | grep nginx
root       3362   3208  0 11:47 pts/0    00:00:00 grep nginx
root      70525      1  0 May11 ?        00:00:00 nginx: master process nginx
www-data  70526  70525  0 May11 ?        00:07:06 nginx: worker process
www-data  70527  70525  0 May11 ?        00:06:29 nginx: worker process
www-data  70528  70525  0 May11 ?        00:07:31 nginx: worker process
www-data  70529  70525  0 May11 ?        00:07:15 nginx: worker process
root@cadtqapllx046:/etc/init.d# cd ..
root@cadtqapllx046:/etc# cd ..
root@cadtqapllx046:/# systemclt restart jboss
bash: systemclt: command not found
root@cadtqapllx046:/# ps -ef | grep jboss
root       3373   3208  0 11:48 pts/0    00:00:00 grep jboss
jboss     85982      1  0 Jul16 ?        00:00:00 /bin/sh /opt/jboss/jboss//bin/standalone.sh -Djboss.bind.address.management=0.0.0.0
jboss     86105  85982  0 Jul16 ?        11:03:33 /opt/java/java8/jdk1.8.0_201/bin/java -D[Standalone] -server -XX:+UseCompressedOops -verbose:gc -Xloggc:/opt/jboss/jboss/standalone/log/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1303m -Xmx1303m -XX:MaxPermSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djboss.modules.policy-permissions=true -Dorg.jboss.boot.log.file=/opt/jboss/jboss/standalone/log/server.log -Dlogging.configuration=file:/opt/jboss/jboss/standalone/configuration/logging.properties -jar /opt/jboss/jboss/jboss-modules.jar -mp /opt/jboss/jboss/modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.standalone -Djboss.home.dir=/opt/jboss/jboss -Djboss.server.base.dir=/opt/jboss/jboss/standalone -Djboss.bind.address.management=0.0.0.0
root@cadtqapllx046:/# systemctl -a | grep -i jboss
Failed to list units: Connection reset by peer
root@cadtqapllx046:/#




root@cadtqapllx046:/# history
   14  cd ..
   15  ls -lrt
   16  cd configuration/
   17  ls -lrth
   18  less -I standalone.xml
   19  cd ..
   20  ls -lrt
   21  cd bin/
   22  ls -lrth
   23  pwd
   24  ls -lrt
   25  ps -fu jboss
   26  kill -9 94735 94861
   27  ps -fu jboss
   28  nohup sudo -u jboss ./standalone.sh -Djboss.bind.address.management=0.0.0.0 &
   29  cd ..
   30  cd standalone/log/
   31  ls -lrt
   32  less -I server.log
   33  cd ..
   34  cd bin/
   35  ls -lrt
   36  pwd
   37  cd ..
   38  ls -lrt /var/tmp/keycloak
   39  ls -lrt /var/tmp/keycloak.zip
   40  ls -ls /opt/jboss/jboss/modules.20251029/
   41  sha1sum /opt/jboss/jboss/modules/system/add-ons/keycloak/org/keycloak/keycloak-adapter-core/main/keycloak-adapter-core-15.0.2.jar
   42  ps -ef | grep httpd
   43  ps -ef | grep nginx
   44  cd /etc/nginx/conf.d/
   45  ls -ltr
   46  cd ..
   47  cd sites-enabled/
   48  ls -ltr
   49  cat des.sigoc
   50  cd /opt/
   51  ll
   52  ls -ltrh
   53  cd jboss/
   54  ls -ltrh
   55  rm -f jboss-eap-6.4.tar.gz
   56  cd jboss-eap-6.4/
   57  l s-ltrh
   58  ls -ltrh
   59  ps aux | grep /opt/jboss/jboss-eap-6.4
   60  ls -lash /opt/jboss/jboss/bin/jboss-cli.sh
   61  /opt/jboss/jboss-eap-6.4/bin/jboss-cli.sh -c --controller=10.116.26.110:9999
   62  cd /opt/jboss/jboss-eap-6.4/
   63  cd bin/
   64  ps aux | grep /opt/jboss/jboss-eap-6.4
   65  cd ../standalone/configuration/
   66  ll
   67  ls -tlrh
   68  cat application-users.properties
   69  cat mgmt-users.properties
   70  cd ../../bin/
   71  ./add-user.sh
   72  cd /opt/
   73  mv /tmp/jboss-eap-6.4.* .
   74  /opt/jboss/jboss-eap-6.4/bin/jboss-cli.sh "patch apply /opt/jboss-eap-6.4.8-patch.zip"
   75  /opt/jboss/jboss-eap-6.4/bin/jboss-cli.sh "patch apply /opt/jboss-eap-6.4.19-patch.zip"
   76  cat /opt/jboss/jboss-eap-6.4/version.txt
   77  mv /tmp/jboss-eap-6.4.9-patch.zip .
   78  /opt/jboss/jboss-eap-6.4/bin/jboss-cli.sh "patch apply /opt/jboss-eap-6.4.9-patch.zip"
   79  /opt/jboss/jboss-eap-6.4/bin/jboss-cli.sh "patch apply /opt/jboss-eap-6.4.19-patch.zip"
   80  /opt/jboss/jboss-eap-6.4/bin/jboss-cli.sh "patch apply /opt/jboss-eap-6.4.19-patch.zip --override-all"
   81  /opt/jboss/jboss-eap-6.4/bin/jboss-cli.sh "patch apply /opt/jboss-eap-6.4.24-patch.zip --override-all"
   82  cat /opt/jboss/jboss-eap-6.4/version.txt
   83  rpm -ivh /tmp/jdk-8u471-linux-x64.rpm
   84  cat /etc/os-release
   85  apt install default-jdk
   86  tail -f /opt/jboss/jboss/standalone/log/server.log
   87  df -kh
   88  /etc/init.d/jboss-640 stop
   89  history |grep -i stop
   90  history |grep -i start
   91  ps -ef | grep jboss
   92  df -kh
   93  cd /
   94  df -kh .
   95  du -sh *
   96  cd var/
   97  du -sh *
   98  cd tmp/
   99  du -sh *
  100  ls -ltr
  101  rm -rf mkinitr*
  102  df -kh .
  103  ls -ltr
  104  gzip icosm001_with_column_inserts.sql sifit_des_26042019.sql gocdb001_PRD_220721.sql sigoc_prd_23082021.sql
  105  df -kh .
  106  ls -ltr
  107  gzip sigoc*
  108  df -kh .
  109  ls -ltr
  110  df -kh
  111  history |grep -i stop
  112  history |grep -i start
  113  /etc/init.d/jboss-640 stop
  114  /etc/profile.d/caixa.sh stop
  115  /etc/profile.d/caixa.sh
  116  vim /etc/profile.d/caixa.sh
  117  mv /etc/profile.d/caixa.sh /etc/profile.d/caixa.sh.bkp
  118  /etc/profile.d/caixa.sh stop
  119  /etc/init.d/jboss-640 stop
  120  ps -ef | grep jboss
  121  /etc/init.d/jboss-640 start
  122  ps -ef | grep jboss
  123  mv /etc/profile.d/caixa.sh.bkp /etc/profile.d/caixa.sh
  124  tail -900f /opt/jboss/jboss/standalone/log/server.log
  125  ps -ef | grep jboss
  126  tail -900f /opt/jboss/jboss/standalone/log/server.log
  127  ps -ef | grep jboss
  128  whereis java
  129  cd /usr/bin/java
  130  cd /usr/bin/
  131  ls -ltr
  132  ls -ltr java
  133  cd /etc/alternatives/
  134  ls -ltr
  135  java -version
  136  history
  137  sudo -u jboss /etc/init.d/jboss-640 stop
  138  ps -ef | gep jboss
  139  ps -ef | grep jboss
  140  exit
  141  ps -ef | grep jboss
  142  vim  /etc/init.d/jboss-640 start
  143  sudo -u jboss /etc/init.d/jboss-640 force stop
  144  ps -ef |GREP JBOSS
  145  ps -ef |grep jboss
  146  sudo -u jboss /etc/init.d/jboss-640 stop
  147  exit
  148  less -I /etc/init.d/jboss-640
  149  history
  150  less -I /etc/profile.d/caixa.sh
  151  mv /etc/profile.d/caixa.sh /etc/profile.d/caixa.sh.bkp
  152  cd /opt/jboss/jboss/bin/
  153  ps -ef | grep jboss
  154  kill -9 70339
  155  ps -ef | grep jboss
  156  nohup sudo -u jboss ./standalone.sh -Djboss.bind.address.management=0.0.0.0 &
  157  ps -ef | grep jboss
  158  tail -900f /opt/jboss/jboss/standalone/log/server.log
  159  history
  160  mv /etc/profile.d/caixa.sh.bkp /etc/profile.d/caixa.sh
  161  ps -ef | grep jboss
  162  tail -900f /opt/jboss/jboss/standalone/log/server.log
  163  cd /usr/
  164  ls -ltr
  165  whereis java
  166  cd bin/
  167  ls -ltr
  168  ls -ltr jdk
  169  ls -ltr java
  170  ps -ef | grep jboss
  171  tail -900f /opt/jboss/jboss/standalone/log/server.log
  172  java -versio
  173  java -version
  174  w
  175  ps -ef | grep jboss
  176  history
  177  less -I /etc/profile.d/caixa.sh
  178  find / -iname "java"
  179  cd /opt/java/java8/jdk1.8.0_201/jre/
  180  l s-ltr
  181  ls ltr
  182  ls -ltr
  183  ps -ef | grep jboss
  184  cd /opt/jboss/jboss-eap-6.4/
  185  cd bin/
  186  cd init.d/
  187  ls -ltr
  188  cat jboss-as-standalone.sh
  189  cat /etc/java/java.conf
  190  history
  191  ps -ef | grep jboss
  192  ls -ltr
  193  find / -iname "java"
  194  ls -ltr
  195  pwd
  196  exit
  197  cd /opt/jboss/jboss-eap-6.4/bin/init.d
  198  ls -ltr
  199  sudo vim -u jboss jboss-as-standalone.sh
  200  vim /etc/java/java.conf
  201  vim jboss-as-standalone.sh
  202  vim /etc/java/java.conf
  203  cat /etc/java/java.conf
  204  mkdir -r /etc/java/
  205  mkdir /etc/java/
  206  vim /etc/java/java.conf
  207  export JAVA_HOME
  208  ls -ltr
  209  env
  210  vim jboss-as-standalone.sh
  211  ls -ltr
  212  ps -ef | grep jboss
  213  ls -ltr
  214  pwd
  215  cd ..
  216  ls -ltr
  217  cat standalone.conf
  218  vim standalone.conf
  219  find / -iname "java"
  220  vim standalone.conf
  221  mv /etc/profile.d/caixa.sh /etc/profile.d/caixa.sh.bkp
  222  ls -ltr /etc/profile.d/caixa.sh.bkp
  223  ls -ltr
  224  cd init.d/
  225  ls -ltr
  226  sudo -u jboss /etc/init.d/jboss-640 stop
  227  ls -ltr
  228  cd ..
  229  ls -ltr
  230  cd ..
  231  ls -ltr
  232  cd standalone/
  233  ls -ltr
  234  history
  235  cd /opt/jboss/jboss/bin/
  236  ps -ef | grep jboss
  237  kill -9 75731
  238  nohup sudo -u jboss ./standalone.sh -Djboss.bind.address.management=0.0.0.0 &
  239  ps -ef | grep jboss
  240  tail -900f /opt/jboss/jboss/standalone/log/server.log
  241  whereis java
  242  cd /opt/jboss/jboss-eap-6.4/standalone/
  243  ls -ltr
  244  cd deployments/
  245  ls -ltr
  246  cd ..
  247  ls -ltr
  248  cd log/
  249  ls -ltr
  250  df -kh .
  251  gzip server.log.202*
  252  ps -ef | grep jboss
  253  tail -900f /opt/jboss/jboss/standalone/log/server.log
  254  vim  /etc/init.d/jboss-640 stop
  255   /etc/init.d/jboss-640 stop
  256  ps -ef | grep jboss
  257   /etc/init.d/jboss-640 start
  258  ps -ef | grep jboss
  259  tail -900f /opt/jboss/jboss/standalone/log/server.log
  260  ps -ef | grep jboss
  261  cd /opt/jboss/jboss/standalone/configuration/
  262  cat standalone.xml | grep -i -n3 "jackson.deserialization.whitelist.packages"
  263  history
  264  /etc/init.d/jboss-640 stop
  265  /etc/init.d/jboss-640 start
  266  ls
  267  sudo su -
  268  sudo su -
  269  df -kh /
  270  du -sh *
  271  cd /opt/
  272  du -sh *
  273  df -kh .
  274  lsof | grep dele
  275  kill -9 35469 68467 68468 68471 68472 68473 35469 35131
  276  lsof | grep dele
  277  df -kill -9 5960 5961 5962
  278  df -kh .
  279  du -sh *
  280  cd jboss/
  281  du -sh *
  282  cd jboss-eap-6.4
  283  ls -ltr
  284  du -sh *
  285  cd standalone/
  286  du -sh *
  287  cd tmp/
  288  ls -ltr
  289  du -sh *
  290  cd sigoc_uploads/
  291  ls -ltr
  292  df -kh
  293  cd /opt/jboss/jboss-eap-6.4/standalone/tmp/sigoc_uploads
  294  ls -ltr
  295  df -kh .
  296  pwd
  297  df -kh .
  298  du -sh *
  299  cd /opt/jboss/jboss-eap-6.4/standalone/tmp/sigoc_uploads
  300  ls -ltr
  301  df -kh .
  302  rm -rf *
  303  df -kh .
  304  /etc/init.d/jboss-640 stop
  305  ps -ef | grep jboss
  306  /etc/init.d/jboss-640 start
  307  ps -ef | grep jboss
  308  tail -900f /opt/jboss/jboss/standalone/log/server.log
  309  ps -ef | grep jboss
  310  cd /opt/jboss/jboss/standalone/configuration/
  311  ls -ltr
  312  vim standalone.xml
  313  df -kh
  314  ps -ef | grep postgree
  315  telnet 127.0.0.1 5432
  316  vim standalone.xml
  317  history |grep -i start
  318  cd /opt/postgres/
  319  ls -ltr
  320  cd 9.1/
  321  cd bin/
  322  ls -ltr
  323  ps -ef | grep pg
  324  ps -ef | grep p
  325  df -kh
  326  tail -900f /opt/jboss/jboss/standalone/log/server.log
  327  ls -ltr
  328  sudo su postgres
  329  tail -900f /opt/jboss/jboss/standalone/log/server.log
  330  telnet 127.0.0.1 5432
  331  pwd
  332  sudo su postgres
  333  pwd
  334  sudo su postgres
  335  sudo systemctl start postgres
  336  history
  337  history | grep start
  338  sudo su postgres
  339  tail -900f /opt/jboss/jboss/standalone/log/server.log
  340  df -kh
  341  ps -ef | grep post
  342  tail -900f /opt/jboss/jboss/standalone/log/server.log
  343  ip a |grep
  344  ip a |grep 10.116.26.110
  345  ps -ef | grep http
  346  ps -ef | grep apache
  347  ps -ef | grep nginx
  348  systemctl start nginx
  349  cd /etc/nginx/
  350  ls -ltr
  351  cd ssl/
  352  ls -ltr
  353  cat des.sigoc.caixa/
  354  cd des.sigoc.caixa/
  355  ls -ltr
  356  cd ..
  357  cd ..
  358  cd sites-enabled/
  359  ls -ltr
  360  cat des.sigoc
  361  tail -900f /var/log/nginx/des.sigoc.caixa_access.log
  362  tail -900f /var/log/nginx/des.sigoc.caixa_access.log
  363  nginx -t
  364  ls -ltr /opt/postgres/9.1/lib/l
  365  ls -ltr /opt/postgres/9.1/lib
  366  ps -ef | grep nginx
  367  cd ..
  368  ls -ltr
  369  systemctl start nginx
  370  service nginx start
  371  ps -ef | grep ngix
  372  ps -ef | grep nginx
  373  cd conf.d/
  374  ls -ltr
  375  cd ..
  376  ls -ltr
  377  cd /etc/init.d/
  378  ls -ltr
  379  ./nginx start
  380  ls -ltr
  381  ps -ef | grep nginx
  382  ./nginx force-stop
  383  ./nginx force-reload
  384  systemctl start nginx.service
  385  cd /usr/sbin/nginx
  386  cd /usr/sbin/
  387  ls -ltr
  388  ps -ef | grep nginx
  389  cd /etc/nginx/
  390  ls -ltr
  391  df -kh
  392  cat /etc/fstab
  393  nginx -t
  394  ps auxww | grep nginx
  395  cat /etc/nginx/nginx.conf
  396  cat /var/log/nginx/error.log
  397  cat /var/log/nginx/access.log
  398  nginx --help
  399  nginx -help
  400  nginx -?
  401  uname -a
  402  /etc/init.d/nginx status
  403  vim +12 /etc/nginx/sites-enabled/des.sigoc
  404  /etc/init.d/nginx status
  405  /etc/init.d/nginx start
  406  bg
  407  ps auxw | grep nginx
  408  nginx -t
  409  lexit
  410  fg
  411  vim /etc/nginx/nginx.conf
  412  vim +12 /etc/nginx/sites-enabled/des.sigoc
  413  nginx -t
  414  /etc/init.d/nginx start
  415  nginx -t
  416  /etc/init.d/nginx status
  417  fg
  418  nginx -t
  419  /etc/init.d/nginx status
  420  date
  421  nginx -t
  422  ps auxw | grepginx
  423  ps auxw | grep nginx
  424  vim +12 /etc/nginx/sites-enabled/des.sigoc
  425  cat /etc/hosts
  426  ip a
  427  vi /etc/hosts
  428  /etc/init.d/nginx start
  429  cat /etc/hosts
  430  bash -x /etc/init.d/nginx start
  431  bash -x /etc/init.d/nginx stop
  432  ps auxw | grep ngin
  433  ls -al
  434  bash -x /etc/init.d/nginx start
  435  nginx
  436  ps auxw | grep nginx
  437  vim /etc/hosts
  438  psa uxw | grep nginx
  439  ps auxw
  440  ps auxw | grep nginx
  441  kill -9 70489
  442  ps auxw | grep nginx
  443  pkill -9 nginx
  444  ps auxw | grep nginx
  445  nginx
  446  pgrep nginx
  447  ps -ef | grep nginx
  448  tail -900f /opt/jboss/jboss/standalone/log/server.log
  449  /etc/init.d/jboss-640 stop
  450  ps -ef | grep jboss
  451  /etc/init.d/jboss-640 start
  452  tail -900f /opt/jboss/jboss/standalone/log/server.log
  453  uptime
  454  df -kh
  455  ps auxww | grep -i jboss
  456  ps auxww | grep -i jboss
  457  cd /opt/jboss/
  458  ls
  459  ls -lhtr
  460  cd jboss
  461  ls
  462  /etc/init.d/jboss-640 stop
  463  ps auxww | grep -i jboss
  464  ps -ef | grep jboss
  465  df -kh
  466  ps -ef | grep httpd
  467  ps -ef | grep nginx
  468  history
  469  /etc/init.d/jboss-640 start
  470  ps -ef | grep jboss
  471  tail -900f /opt/jboss/jboss/standalone/log/server.log
  472  cd /etc/nginx/
  473  cd conf.d/
  474  ls -ltr
  475  ls -ltr
  476  cd ..
  477  ls -ltr
  478  cd sites-enabled/
  479  ps -ef | grep jboss
  480  tail -900f /opt/jboss/jboss/standalone/log/server.log
  481  history
  482  bash -x /etc/init.d/nginx stop
  483  bash -x /etc/init.d/nginx start
  484  df -h
  485  history
  486  history | grep start
  487  bash -x /etc/init.d/nginx stop
  488  history | grep start
  489  bash -x /etc/init.d/nginx start
  490  history | grep start
  491  systemctl start nginx.service
  492  systemctl status
  493  Mostrar mais linhas
  494  systemctl --version
  495  ps -p 1 -f
  496  PID 1 -> /sbin/init
  497  PID 1 -> /sbin/init
  498  sbin/init
  499  readlink -f /sbin/init
  500  history
  501  cd /etc/init.d
  502  ./nginx force-reload
  503  ./nginx force-stop
  504  ./nginx force-restart
  505  ./nginx restart
  506  ps auxw | grep nginx
  507  ps -ef | grep nginx
  508  cd ..
  509  cd ..
  510  systemclt restart jboss
  511  ps -ef | grep jboss
  512  systemctl -a | grep -i jboss
  513  history
root@cadtqapllx046:/#

