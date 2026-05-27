[jboss7@sspdeapllx0041 p585600]$ ^C
[jboss7@sspdeapllx0041 p585600]$ /opt/jboss/jboss-eap-7.0/bin/jboss-cli.sh --connect --controller=10.116.88.97:9999 --command="/host=sspdeapllx0041/server=sisag-lx0041:restart"
Authenticating against security realm: ManagementRealm
Username: p585600
Password:
Failed to connect to the controller: Unable to authenticate against controller at 10.116.88.97:9999: Authentication failed: all available authentication mechanisms failed:
   DIGEST-MD5: Server rejected authentication
[jboss7@sspdeapllx0041 p585600]$ history
    1  27/05/26 11:55:11 -> ./jboss.sh sippm-lx0041 stop
    2  27/02/18 14:48:17 -> ./jboss.sh sippm-lx0041 start
    3  27/02/18 14:49:32 -> tail -f domain/servers/sippm-lx0041/log/server.log
    4  12/03/18 13:20:57 -> cd /opt/jboss/jboss-eap-7.0
    5  12/03/18 13:21:10 -> mv /var/tmp/rh-sso-7.1.0-eap7-adapter.zip .
    6  12/03/18 13:21:15 -> cp /var/tmp/rh-sso-7.1.0-eap7-adapter.zip .
    7  12/03/18 13:21:38 -> rm -rf modules/system/add-ons/keycloak
    8  12/03/18 13:21:44 -> cd bin/
    9  12/03/18 13:21:45 -> ll
   10  12/03/18 13:21:46 -> ls -alrtty
   11  12/03/18 13:21:48 -> ls -lart
   12  12/03/18 13:21:58 -> ls -lart *.cli
   13  12/03/18 13:22:05 -> rm -f *.cli
   14  12/03/18 13:22:17 -> cd ..
   15  12/03/18 13:22:38 -> unzip rh-sso-7.1.0-eap7-adapter.zip
   16  12/03/18 13:23:26 -> tail -f domain/servers/sippm-lx0041/log/server.log
   17  12/03/18 13:25:59 -> ./jboss.sh host stop
   18  12/03/18 13:26:34 -> ps -ef | grep jboss
   19  12/03/18 13:26:43 -> ./jboss.sh host start
   20  12/03/18 13:29:45 -> tail -f domain/servers/sippm-lx0041/log/server.log
   21  12/03/18 13:30:23 -> ps -ef | grep ppm
   22  12/03/18 13:30:27 -> tail -f domain/servers/sippm-lx0041/log/server.log
   23  12/03/18 14:40:51 -> tail -10000f domain/servers/sippm-lx0041/log/server.log
   24  12/03/18 14:46:02 -> tail -f domain/servers/sippm-*/log/server.log
   25  12/03/18 14:52:43 -> ps -ef | grep ppm
   26  12/03/18 14:52:59 -> tail -f domain/servers/sippm-*/log/server.log
   27  12/03/18 14:53:35 -> tail -f domain/servers/sippm-*/log/server.log /log_jboss/*/*.log
   28  12/03/18 14:54:49 -> tail -f domain/servers/*/log/server.log /log_jboss/*/*.log
   29  12/03/18 14:55:38 -> df -kh
   30  12/03/18 14:55:41 -> tail -f domain/servers/*/log/server.log /log_jboss/*/*.log
   31  12/03/18 15:14:21 -> ps -ef | grep siavl
   32  12/03/18 15:19:59 -> tail -f domain/servers/*/log/server.log /log_jboss/*/*.log
   33  14/03/18 17:58:31 -> ls
   34  14/03/18 17:58:36 -> ls -l
   35  14/03/18 17:58:39 -> pwd
   36  14/03/18 17:58:42 -> exit
   37  14/03/18 18:00:52 -> ls -ltr
   38  14/03/18 18:01:18 -> chown 755  threaddump_linux.sh threaddump_linux-continuous.sh
   39  14/03/18 19:08:40 -> id
   40  14/03/18 19:08:41 -> ls
   41  14/03/18 19:08:46 -> d /opt/jboss/jboss-eap-7.0/domain/servers/sippm-lx0041/log
   42  14/03/18 19:08:50 -> cd /opt/jboss/jboss-eap-7.0/domain/servers/sippm-lx0041/log
   43  14/03/18 19:08:51 -> id
   44  14/03/18 19:08:52 -> ls -lr
   45  14/03/18 19:08:56 -> tail -f server.log
   46  14/03/18 19:09:29 -> less server.log
   47  14/03/18 19:10:49 ->  grep -i vsf /opt/jboss/jboss-eap-7.0/domain/configuration/*
   48  14/03/18 19:10:53 -> cd /opt/jboss/jboss-eap-7.0/domain/configuration/
   49  14/03/18 19:10:59 ->  grep -i vsf  *
   50  14/03/18 19:11:02 -> ls -ltr
   51  14/03/18 19:11:15 ->  grep -ir vsf  *
   52  14/03/18 19:18:01 -> cd -
   53  14/03/18 19:18:04 -> cd ..
   54  14/03/18 19:18:48 -> tail -100 log/server.log
   55  14/03/18 19:18:54 -> ps -ef | grep siavl
   56  14/03/18 19:18:58 -> ps -ef | grep sippm
   57  14/03/18 19:19:00 -> cd ..
   58  14/03/18 19:19:01 -> ls -ltr
   59  14/03/18 19:19:06 -> rm -fr  sippm-lx0041
   60  14/03/18 19:19:08 -> id
   61  14/03/18 19:19:22 -> cd sippm-lx0041/log/
   62  14/03/18 19:19:23 -> ls -ltr
   63  14/03/18 19:19:25 -> less server.log
   64  14/03/18 19:45:48 -> tail -f server.log
   65  14/03/18 19:54:03 -> cat server.log
   66  14/03/18 19:56:41 ->  ls -ltr
   67  14/03/18 19:56:44 -> less server.log
   68  14/03/18 20:03:43 -> tail -f server.log
   69  14/03/18 20:05:36 -> id
   70  14/03/18 20:05:40 -> cd ..
   71  14/03/18 20:05:49 -> ./jboss.sh host stop
   72  14/03/18 20:12:51 -> ./jboss.sh host start &
   73  14/03/18 20:12:56 -> cd domain/servers/
   74  14/03/18 20:12:58 -> ls -ltr
   75  14/03/18 20:13:20 -> tail */log/server.log
   76  14/03/18 20:13:26 -> tail -f */log/server.log
   77  14/03/18 20:25:46 -> jobs
   78  14/03/18 20:25:48 -> ps -ef | grep sippm
   79  14/03/18 20:25:58 -> ps -fu jboss7
   80  14/03/18 20:26:05 -> cd sippm-lx0041/log/
   81  14/03/18 20:26:06 -> ls -ltr
   82  14/03/18 20:26:08 -> less server.log
   83  14/03/18 20:26:25 -> cd  -
   84  14/03/18 20:26:26 -> ls -ltr
   85  14/03/18 20:26:34 -> less sipje-lx0041/log/server.log
   86  14/03/18 20:27:17 -> ls -ltr
   87  14/03/18 20:27:19 -> ps -fu jboss7
   88  14/03/18 20:27:38 -> less sipdi-lx0041/log/server.log
   89  14/03/18 20:28:30 -> id
   90  14/03/18 20:28:36 -> ls -ltr
   91  14/03/18 20:28:44 -> less  siavl-lx0041/log/server.log
   92  14/03/18 20:29:12 -> tail */log/server.log
   93  14/03/18 20:29:40 -> less siagt-lx0041/log/server.log
   94  14/03/18 20:30:25 -> ls -ltr
   95  14/03/18 20:30:31 -> less sipdi-lx0041/log/server.log
   96  14/03/18 20:32:26 -> tail -f sippm-lx0041/log/server.log
   97  14/03/18 20:34:35 -> cd ~/
   98  14/03/18 20:34:38 -> ls
   99  14/03/18 20:35:03 -> ps -ef|grep -i sippm
  100  14/03/18 20:35:11 -> kill -3 26009
  101  14/03/18 20:35:32 -> ls -ltr
  102  14/03/18 20:35:37 -> cd -
  103  14/03/18 20:35:45 -> tail -f sippm-lx0041/log/server.log
  104  14/03/18 20:35:52 -> less  sippm-lx0041/log/server.log
  105  14/03/18 20:37:40 -> cd -
  106  14/03/18 20:37:51 -> ./threaddump_linux.sh 26009
  107  14/03/18 20:38:03 -> chmod +x ./threaddump*
  108  14/03/18 20:38:08 -> ./threaddump_linux.sh 26009
  109  14/03/18 20:40:10 -> ./threaddump_linux-continuous.sh 26009
  110  14/03/18 20:45:15 -> ls -lre
  111  14/03/18 20:45:17 -> ls -ltr
  112  14/03/18 20:45:19 -> pwd
  113  14/03/18 20:45:30 -> cd /opt/jboss
  114  14/03/18 20:45:32 -> ls
  115  14/03/18 20:45:36 -> cd jboss-eap-7.0/
  116  14/03/18 20:45:37 -> ls
  117  14/03/18 20:45:39 -> ls -ltr
  118  14/03/18 20:53:46 -> less  mqjms.log.0
  119  14/03/18 20:54:08 -> less   mqjms.log.0.2
  120  14/03/18 20:54:20 -> ls -ltr
  121  14/03/18 20:54:23 -> cd domain/
  122  14/03/18 20:54:24 -> ls
  123  14/03/18 20:54:26 -> cd servers/
  124  14/03/18 20:54:27 -> ls
  125  14/03/18 20:54:30 -> cd sippm-lx0041/
  126  14/03/18 20:54:31 -> ls -ltr
  127  14/03/18 20:54:34 -> cd log/
  128  14/03/18 20:54:35 -> ls -ltr
  129  14/03/18 20:55:00 -> cd ~/
  130  14/03/18 20:55:02 -> cat ./threaddump_linux.sh
  131  14/03/18 20:55:33 -> cat ./threaddump_linux-continuous.sh
  132  14/03/18 20:56:00 -> ls -ltr
  133  14/03/18 21:21:53 -> cd /opt/jboss/jboss-eap-7.0/domain/servers/
  134  14/03/18 21:21:54 -> ls
  135  14/03/18 21:21:58 -> cd sippm-lx0041/log/
  136  14/03/18 21:21:58 -> ls -lr
  137  14/03/18 21:22:00 -> ls -ltr
  138  14/03/18 21:22:04 -> pwd
  139  14/03/18 21:22:05 -> cd ../../
  140  14/03/18 21:22:06 -> ls
  141  14/03/18 21:22:07 -> cd ..
  142  14/03/18 21:22:07 -> ls
  143  14/03/18 21:22:08 -> cd ..
  144  14/03/18 21:22:09 -> ls
  145  14/03/18 21:22:10 -> ls -ltr
  146  14/03/18 21:22:21 -> id
  147  14/03/18 21:22:23 -> exit
  148  14/03/18 21:24:02 ->  JBOSS_HOME=/opt/jboss/jboss-eap-7.0
  149  14/03/18 21:24:02 ->  export JBOSS_HOME
  150  14/03/18 21:24:09 -> echo $JBOSS_HOME
  151  14/03/18 21:24:20 -> cat /etc/jboss-as/jboss-as.conf
  152  14/03/18 21:24:50 -> cd $JBOSS_HOME/domain/log/
  153  14/03/18 21:24:51 -> ls -ltr
  154  14/03/18 21:24:56 -> less console.log
  155  14/03/18 21:26:12 -> tial -f console.log
  156  14/03/18 21:26:15 -> tail -f console.log
  157  14/03/18 21:30:02 ->  kill -3  26009
  158  14/03/18 21:30:09 -> tail -f console.log
  159  14/03/18 21:31:44 -> ls -ltr
  160  14/03/18 21:31:50 -> cp console.log ~/
  161  14/03/18 21:31:51 -> ls -ltr
  162  14/03/18 21:31:52 -> id
  163  14/03/18 21:31:54 -> cd ~/
  164  14/03/18 21:31:55 -> ls -ltr
  165  14/03/18 21:32:06 -> mv  console.log sippm.console.log
  166  14/03/18 21:32:12 -> pwd
  167  14/03/18 21:32:13 -> exit
  168  14/03/18 20:40:36 -> cd /opt/jboss7
  169  14/03/18 20:40:37 -> ls -ltr
  170  14/03/18 20:40:46 -> cat  threaddump_linux.sh
  171  14/03/18 20:40:56 -> cat threaddump_linux-continuous.sh
  172  14/03/18 20:41:25 -> cd /opt/jboss/jboss-eap-7.0/domain/servers/sippm-lx0041/log/
  173  14/03/18 20:41:26 -> ls -ltr
  174  14/03/18 20:41:29 -> less server.log
  175  14/03/18 20:42:23 -> ls -l $JBOSS_HOME/bin/run.sh
  176  14/03/18 20:42:27 -> env
  177  14/03/18 20:42:37 -> ls -l /bin/
  178  14/03/18 20:43:30 -> ls -l $JBOSS_HOME/
  179  14/03/18 20:43:33 -> pwd
  180  14/03/18 20:43:44 -> echo  $JBOSS_HOME
  181  14/03/18 20:43:47 -> history
  182  14/03/18 20:43:54 -> cd ~/
  183  14/03/18 20:43:55 -> ls -ltr
  184  14/03/18 20:43:58 -> ls -lta
  185  14/03/18 20:44:01 -> cat  .bash_profile
  186  14/03/18 20:44:16 -> pwd
  187  14/03/18 20:44:41 -> cd -
  188  14/03/18 20:44:42 -> ls -ltr
  189  14/03/18 20:44:46 -> less server.log
  190  14/03/18 21:20:07 -> history
  191  14/03/18 21:20:29 -> ps -ef|grep -i sippm
  192  14/03/18 21:20:44 -> kill -3 26009
  193  14/03/18 21:20:49 -> ./threaddump_linux.sh
  194  14/03/18 21:20:54 -> cd ~/
  195  14/03/18 21:21:00 -> ps -ef|grep -i sippm
  196  14/03/18 21:21:03 -> kill -3 26009
  197  14/03/18 21:21:06 -> ./threaddump_linux.sh
  198  14/03/18 21:21:19 -> kill -3 26009
  199  14/03/18 21:21:24 -> ps -ef|grep -i sippm
  200  14/03/18 21:21:25 -> kill -3 26009
  201  14/03/18 21:21:36 -> ./threaddump_linux.sh 26009
  202  14/03/18 21:25:54 -> ./threaddump_linux-continuous.sh
  203  14/03/18 21:25:59 -> ./threaddump_linux-continuous.sh 26009
  204  14/03/18 21:30:17 -> ls -ltr
  205  14/03/18 21:32:20 -> id
  206  14/03/18 21:32:21 -> exit
  207  15/03/18 09:57:05 -> pwd
  208  15/03/18 09:57:06 -> ls l-
  209  15/03/18 09:57:08 -> ls -l
  210  15/03/18 09:57:13 -> pwd
  211  15/03/18 09:57:15 -> cd ..
  212  15/03/18 09:58:05 -> ls -l /caixa/usr/p984222/threaddump*
  213  15/03/18 09:59:59 -> cp -p /caixa/usr/p984222/threaddump_linux_jstack-continuous.sh.tar.gz .
  214  15/03/18 10:00:08 -> pwd
  215  15/03/18 10:00:11 -> cd
  216  15/03/18 10:00:12 -> ls -l
  217  15/03/18 10:00:18 -> cp -p /caixa/usr/p984222/threaddump_linux_jstack-continuous.sh.tar.gz .
  218  15/03/18 10:00:19 -> ls -l
  219  15/03/18 10:00:27 -> gunzip threaddump_linux_jstack-continuous.sh.tar.gz
  220  15/03/18 10:00:29 -> ls -l
  221  15/03/18 10:00:42 -> tar tvf threaddump_linux_jstack-continuous.sh.tar
  222  15/03/18 10:00:53 -> tar xvf threaddump_linux_jstack-continuous.sh.tar
  223  15/03/18 10:00:55 -> ls -l
  224  15/03/18 10:01:03 -> rm -f threaddump_linux_jstack-continuous.sh.tar
  225  15/03/18 10:01:29 -> chmod 755 threaddump_linux_jstack-continuous.sh
  226  15/03/18 10:01:30 -> ls -l
  227  15/03/18 10:01:36 -> less threaddump_linux.sh
  228  15/03/18 10:01:54 -> less threaddump_linux-continuous.sh
  229  15/03/18 10:02:08 -> less threaddump_linux_jstack-continuous.sh
  230  15/03/18 10:03:54 -> gzcat sippm.console.log.gz
  231  15/03/18 10:04:06 -> gunzip sippm.console.log.gz
  232  15/03/18 10:04:07 -> ls -l
  233  15/03/18 10:04:11 -> less sippm.console.log
  234  15/03/18 10:09:10 -> ps -ef |grep -i jboss |grep -i sidcn
  235  15/03/18 10:09:26 -> who am i
  236  15/03/18 10:09:29 -> id
  237  15/03/18 10:12:11 -> kill -3 20381
  238  15/03/18 10:18:31 -> ls -l
  239  15/03/18 10:20:38 -> ./threaddump_linux.sh 20381 >threaddump_linux.txt
  240  15/03/18 10:22:12 -> ./threaddump_linux.sh 20381
  241  15/03/18 10:27:05 -> pwd
  242  15/03/18 10:27:40 -> ls -l
  243  15/03/18 10:27:51 -> vi threaddump_linux.txt
  244  15/03/18 10:30:34 -> mv threaddump_linux.txt SIDCN-threaddump_linux.txt
  245  15/03/18 10:30:35 -> ls -l
  246  15/03/18 10:32:19 -> ./threaddump_linux-continuous.sh 20381
  247  15/03/18 10:40:03 -> ./threaddump_linux_jstack-continuous.sh 20381
  248  15/03/18 10:43:03 -> nohup /opt/jboss/jboss-eap-7.0/jboss.sh -c sidcn-lx0041 $JBOSS_OPTS >> console-$(date +%Y%m%d).out  2>&1 < /dev/null &
  249  15/03/18 10:43:31 -> ls -l
  250  15/03/18 10:43:49 -> less console-20180315.out
  251  15/03/18 10:45:21 -> nohup $JBOSS_HOME/bin/run.sh -c sidcn-lx0041 $JBOSS_OPTS >> console-$(date +%Y%m%d).out  2>&1 < /dev/null &
  252  15/03/18 10:45:25 -> ls -l
  253  15/03/18 10:45:31 -> less console-20180315.out
  254  15/03/18 10:47:34 -> pwd
  255  15/03/18 10:48:10 -> ls -l
  256  15/03/18 10:48:23 -> less sippm.console.log
  257  15/03/18 10:49:03 -> mv sippm.console.log SIPPM-threaddump_linux.txt
  258  15/03/18 10:49:05 -> ls -l
  259  15/03/18 10:49:24 -> chmod 664 SIPPM-threaddump_linux.txt
  260  15/03/18 10:49:25 -> ls -l
  261  15/03/18 10:50:22 -> jstack -l 20381 >jstack.out
  262  15/03/18 10:51:22 -> ./opt/jboss/jdk1.8.0_131/bin/jstack 20381 >jstack.out
  263  15/03/18 10:51:31 -> /opt/jboss/jdk1.8.0_131/bin/jstack 20381 >jstack.out
  264  15/03/18 10:51:34 -> ls -l
  265  15/03/18 10:51:42 -> less jstack.out
  266  15/03/18 10:52:45 -> ps -ef | grep child1
  267  15/03/18 10:53:11 -> ps -ef | grep sidcn
  268  15/03/18 10:53:39 -> ps -ef | grep sidcn >SIDCN-PS.txt
  269  15/03/18 10:53:43 -> less SIDCN-PS.txt
  270  15/03/18 10:54:16 -> ps -ef | grep sippm >SIPPM-PS.txt
  271  15/03/18 10:54:20 -> less SIPPM-PS.txt
  272  15/03/18 10:58:45 -> id
  273  15/03/18 10:58:47 -> pwd
  274  15/03/18 10:58:50 -> cd ..
  275  15/03/18 10:58:51 -> ls -l
  276  15/03/18 10:58:54 -> cd jboss
  277  15/03/18 10:58:56 -> ls -l
  278  15/03/18 10:58:59 -> cd jboss-eap-7.0/
  279  15/03/18 10:58:59 -> ls -l
  280  15/03/18 10:59:11 -> cd bin
  281  15/03/18 10:59:12 -> ls -l
  282  15/03/18 10:59:13 -> ls
  283  15/03/18 10:59:24 -> ./jboss-cli.sh --connect
  284  15/03/18 11:01:36 -> pwd
  285  15/03/18 11:01:36 -> ls
  286  15/03/18 11:01:45 -> pwd
  287  15/03/18 11:01:51 -> cd /opt/jboss7
  288  15/03/18 11:01:52 -> ls -l
  289  15/03/18 11:02:19 -> /opt/jboss/jboss-eap-7.0/bin/jdr.sh
  290  15/03/18 11:14:43 -> pwd
  291  15/03/18 11:14:45 -> cd ..
  292  15/03/18 14:21:50 -> pwd
  293  15/03/18 14:21:52 -> cd jboss7
  294  15/03/18 14:21:53 -> ls -l
  295  15/03/18 20:56:55 -> cd -
  296  15/03/18 21:04:01 -> ls -ltr
  297  15/03/18 21:04:10 -> w
  298  15/03/18 21:04:21 -> less /log_jboss/simtx/simtx-lx0041.log
  299  15/03/18 21:04:37 -> ls -ltr
  300  15/03/18 21:04:43 -> sudo su
  301  15/03/18 21:04:47 -> exit
  302  15/03/18 21:15:48 -> ls -ltr
  303  15/03/18 21:15:56 -> less   host-controller.log
  304  15/03/18 21:16:04 -> pwd
  305  15/03/18 21:16:06 -> exit
  306  15/03/18 21:22:52 -> history
  307  15/03/18 21:22:53 -> exit
  308  15/03/18 21:22:56 -> history
  309  15/03/18 21:23:25 -> cd /opt/jboss/jboss-eap-7.0/
  310  15/03/18 21:23:25 -> ls
  311  15/03/18 21:23:28 -> ls -ltr
  312  15/03/18 21:23:39 -> ls -l domain/servers/
  313  15/03/18 21:23:48 -> ./jboss.sh sippm-lx0041 stop
  314  15/03/18 21:24:02 -> ps -ef|grep  sippm-lx0041
  315  15/03/18 21:25:04 -> ./jboss.sh sippm-lx0041 start
  316  15/03/18 21:25:20 -> cd domain/servers/sippm-lx0041/log/
  317  15/03/18 21:25:24 -> tail -100f server.log
  318  15/03/18 21:25:35 -> less  server.log
  319  15/03/18 21:36:18 -> pwd
  320  15/03/18 21:36:21 -> cd ../../
  321  15/03/18 21:36:23 -> ls
  322  15/03/18 21:36:32 -> find . -name VFSLogger*
  323  15/03/18 21:36:42 -> find . -name *ogger*
  324  15/03/18 21:36:55 -> ls -l ./domain/servers/sidcn-lx0041/tmp/vfs/temp/tempa90106a6af9dd454/content-1e5e47affd008d9/WEB-INF/classes/br/gov/caixa/sidcn/rs/util/interceptors/log/LoggerProducer.class
  325  15/03/18 21:36:59 -> less ./domain/servers/sidcn-lx0041/tmp/vfs/temp/tempa90106a6af9dd454/content-1e5e47affd008d9/WEB-INF/classes/br/gov/caixa/sidcn/rs/util/interceptors/log/LoggerProducer.class
  326  15/03/18 21:37:29 -> find . -name vfs
  327  15/03/18 21:37:37 -> ls -l  ./domain/servers/sippm-lx0041/tmp/vfs
  328  15/03/18 21:37:38 -> ls -l  ./domain/servers/sippm-lx0041/tmp/vfs/temp/
  329  15/03/18 21:37:41 -> ls -l  ./domain/servers/sippm-lx0041/tmp/vfs/temp/tempdf1273c05d513177/content-4242ac7d9180d88c/
  330  15/03/18 21:46:24 ->  cd domain/sippm
  331  15/03/18 21:46:31 ->  cd domain/servers/sippm-lx0041/log/
  332  15/03/18 21:46:33 -> less server.log
  333  18/03/18 09:23:45 -> ls -la
  334  18/03/18 09:23:57 -> ./jboss.sh status
  335  18/03/18 09:24:13 -> cd /opt/jboss7/
  336  18/03/18 09:24:14 -> ls -la
  337  18/03/18 09:24:18 -> cd .oracle_jre_usage
  338  18/03/18 09:24:20 -> ls -la
  339  18/03/18 09:24:23 -> hsitory
  340  18/03/18 09:24:26 -> history
  341  18/03/18 09:24:42 -> /opt/jboss/jboss-eap-7.0/jboss.sh status
  342  18/03/18 09:24:53 -> ls -la
  343  18/03/18 09:24:55 -> cd /opt/jboss/jboss-eap-7.0/jboss.sh
  344  18/03/18 09:24:58 -> cd /opt/jboss/jboss-eap-7.0/
  345  18/03/18 09:24:59 -> ls -la
  346  18/03/18 09:25:02 -> cd bin
  347  18/03/18 09:25:03 -> ls -la
  348  18/03/18 09:25:22 -> ./jboss.sh status
  349  18/03/18 09:25:32 -> ./jboss.sh version
  350  18/03/18 09:25:55 -> ./jboss-cli.sh status
  351  18/03/18 09:26:02 -> ./jboss-cli.sh version
  352  18/03/18 09:26:25 -> ./jboss-cli.sh --help
  353  18/03/18 09:26:37 -> ./jboss-cli.sh version
  354  18/03/18 09:27:26 -> ./jboss-cli.sh --version
  355  18/03/18 09:27:36 -> ls -la
  356  18/03/18 09:27:39 -> hsitory
  357  18/03/18 09:27:45 -> cat /etc/fstab
  358  18/03/18 09:27:54 -> cat /etc/hosts
  359  18/03/18 09:28:02 -> exit
  360  19/03/18 04:00:17 -> ssh sspdeapllx0076
  361  19/03/18 04:15:29 -> cd /opt/jboss7
  362  19/03/18 04:15:30 -> ls -l
  363  19/03/18 04:15:34 -> cd ..
  364  19/03/18 04:15:35 -> ls -l
  365  19/03/18 04:15:38 -> cd jboss
  366  19/03/18 04:15:38 -> ls -l
  367  19/03/18 04:15:42 -> cd ..
  368  19/03/18 04:15:48 -> ls -l jboss
  369  19/03/18 04:15:50 -> ls -l jboss6
  370  19/03/18 04:15:54 -> sudo su
  371  27/05/26 11:55:11 -> id
  372  27/05/26 11:55:11 -> ls -rlt
  373  27/05/26 11:55:11 -> tar -cvf log.tar log
  374  27/05/26 11:55:11 -> ls -rlt
  375  27/05/26 11:55:11 -> mv log.tar 0041_log.tar
  376  27/05/26 11:55:11 -> ls -rlt
  377  27/05/26 11:55:11 -> chmod 777 0041_log.tar
  378  27/05/26 11:55:11 -> ls -rlt
  379  27/05/26 11:55:11 -> df -h .
  380  27/05/26 11:55:11 -> ls -rlt
  381  27/05/26 11:55:11 -> cd /opt/jboss/jboss-eap-7.0/domain
  382  27/05/26 11:55:11 -> ls -rlt
  383  27/05/26 11:55:11 -> tar -cvf log.tar log
  384  27/05/26 11:55:11 -> ls -rlt
  385  27/05/26 11:55:11 -> chmod 777 log.tar
  386  27/05/26 11:55:11 -> ls -rlt
  387  27/05/26 11:55:11 -> ls -lt
  388  27/05/26 11:55:11 -> ls -rlt
  389  27/05/26 11:55:11 -> pwd
  390  27/05/26 11:55:11 -> cd -
  391  27/05/26 11:55:11 -> ls -rlt
  392  27/05/26 11:55:11 -> pwd
  393  27/05/26 11:55:11 -> cd -
  394  27/05/26 11:55:11 -> ls -rlt
  395  27/05/26 11:55:11 -> rm log.tar
  396  27/05/26 11:55:11 -> ls -rlt
  397  27/05/26 11:55:11 -> cd -
  398  27/05/26 11:55:11 -> ls -rlt
  399  27/05/26 11:55:11 -> rm 0041_log.tar
  400  27/05/26 11:55:11 -> ls -rlt
  401  27/05/26 11:55:11 -> pwd
  402  27/05/26 11:55:11 -> id
  403  27/05/26 11:55:11 -> cd /opt/jboss/
  404  27/05/26 11:55:11 -> find ./ -name "*" | xargs grep 'gc'
  405  27/05/26 11:55:11 -> find ./ -name "*" | xargs grep 'log'
  406  27/05/26 11:55:11 -> exit
  407  03/07/18 17:58:40 -> cd /opt/keystore/
  408  03/07/18 17:58:42 -> keytool -list -keystore certchain.jks -storepass donotchangeit
  409  03/07/18 19:08:26 -> exit
  410  03/07/18 19:17:51 -> cd /opt/keystore/
  411  03/07/18 19:18:02 -> keytool -list -keystore certchain.jks -storepass donotchangeit
  412  03/07/18 19:20:16 -> exit
  413  04/07/18 19:16:22 -> cd /opt/keystore/
  414  04/07/18 19:16:41 -> exit
  415  04/07/18 19:24:19 -> cd /opt/keystore
  416  04/07/18 19:24:22 -> ls -la
  417  04/07/18 19:24:35 -> cd
  418  04/07/18 19:24:44 -> cd /caixa/usr/c082368
  419  04/07/18 19:24:47 -> ls -la
  420  04/07/18 19:24:59 -> cp VAULT.dat /opt/keystore/
  421  04/07/18 19:25:05 -> cd /caixa/usr/c082368
  422  04/07/18 19:25:12 -> cd /opt/keystore
  423  04/07/18 19:25:14 -> ls -la
  424  04/07/18 19:25:20 -> exit
  425  28/08/18 00:51:06 -> id -a
  426  28/08/18 00:51:14 -> pwd
  427  28/08/18 00:51:18 -> ls -lart
  428  28/08/18 00:52:26 -> cd /opt/keystore/
  429  28/08/18 00:52:30 -> ls -lart
  430  28/08/18 00:52:57 -> strings VAULT.dat
  431  28/08/18 00:54:49 -> cp VAULT.dat VAULT.dat.20180828
  432  28/08/18 00:54:54 -> ls -lart
  433  28/08/18 00:56:31 -> pwd
  434  28/08/18 00:56:34 -> cd
  435  28/08/18 00:56:37 -> pwd
  436  28/08/18 01:00:42 -> cd
  437  28/08/18 03:34:52 -> vi .bash_history
  438  28/08/18 03:35:31 -> history
  439  28/08/18 17:43:54 -> echo $JBOSS_HOME
  440  28/08/18 17:44:47 -> ps -ef |grep -i jboss |grep -i sidcn
  441  28/08/18 18:46:39 -> /opt/jboss/jboss-eap-7.0/bin/vault.sh -x f343fb5f-e5db-4b65-aad5-5349df3aea7c -e /opt/keystore -i 33 -k /opt/keystore/jboss.keystore -p TuxRsp01 -s F3d3r4d0 -v jboss -a password -b SIPPMAPIKEY
  442  28/08/18 18:46:58 -> exit
  443  29/08/18 15:58:21 -> cd /opt/keystore/
  444  29/08/18 15:58:42 -> cp /caixa/usr/c082368/VAULT.dat .
  445  29/08/18 15:58:45 -> ls -la
  446  29/08/18 15:59:05 -> exit
  447  31/08/18 18:10:21 -> cd /opt/keystore/
  448  31/08/18 18:10:37 -> cp VAULT.dat VAULT.dat.20180831
  449  31/08/18 18:10:41 -> ls -la
  450  31/08/18 18:11:02 -> cd /caixa/usr/c082368
  451  31/08/18 18:11:05 -> ls -la
  452  31/08/18 18:11:27 -> cp VAULT.dat /opt/keystore/
  453  31/08/18 18:11:32 -> cd /opt/keystore/
  454  31/08/18 18:11:35 -> ls -la
  455  31/08/18 18:11:40 -> exit
  456  29/11/18 12:11:47 -> cd /opt/keystore/
  457  29/11/18 12:12:09 -> cp -p VAULT.dat VAULT.dat.20181129
  458  29/11/18 12:12:12 -> ls -la
  459  09/02/19 06:28:55 -> clear
  460  09/02/19 06:29:04 -> /opt/jboss/jboss-eap-7.0/bin/vault.sh -x kADaC2u7 -e /opt/keystore -i 33 -k /opt/keystore/jboss.keystore -p TuxRsp01 -s F3d3r4d0 -v jboss -a password -b SIAVLMAILKEY
  461  09/02/19 06:29:13 -> pwd
  462  09/02/19 06:29:17 -> ls -l
  463  09/02/19 06:29:22 -> pwd
  464  09/02/19 06:29:28 -> clear
  465  09/02/19 06:29:52 -> strings VAULT.dat |grep -i ds
  466  09/02/19 06:30:04 -> pwd
  467  09/02/19 06:30:12 -> cd /opt/keystore/
  468  09/02/19 06:30:13 -> clear
  469  09/02/19 06:30:22 -> strings VAULT.dat |grep -i ds
  470  09/02/19 06:40:23 -> cd /tmp/
  471  09/02/19 06:40:25 -> clear
  472  09/02/19 06:40:25 -> ls -l
  473  09/02/19 06:40:49 -> sudo cp jboss.keystore /opt/keystore/
  474  09/02/19 06:41:09 -> cp jboss.keystore /opt/keystore/
  475  09/02/19 06:41:36 -> cp VAULT.dat /opt/keystore/
  476  09/02/19 06:41:41 -> cd /opt/keystore/
  477  09/02/19 06:41:42 -> clear
  478  09/02/19 06:41:44 -> ls -l
  479  09/02/19 06:42:07 -> exit
  480  27/05/26 11:55:11 -> ls -lah
  481  27/05/26 11:55:11 -> mv hsm_34041.log hsm_34041_20190504.log
  482  27/05/26 11:55:11 -> id
  483  27/05/26 11:55:11 -> exit
  484  30/05/19 14:13:22 -> fc-list|grep Futura
  485  11/06/19 15:45:26 -> cd /opt/keystore/
  486  11/06/19 15:45:28 -> ls -la
  487  11/06/19 15:45:52 -> cp VAULT.dat VAULT.dat.20190611
  488  11/06/19 15:46:10 -> cp /caixa/usr/c082368/VAULT.dat .
  489  11/06/19 15:46:13 -> ls -la
  490  11/06/19 15:46:21 -> exit
  491  27/05/26 11:55:11 -> iq
  492  27/05/26 11:55:11 -> iw
  493  27/05/26 11:55:11 -> iw
  494  27/05/26 11:55:11 -> ls -lhrt
  495  27/05/26 11:55:11 -> gzip -9 hsm_75114.log hsm_100644.log hsm_34619.log hsm_108040.log hsm_14121.log hsm_20919.log hsm_25972.log hsm_62389.log hsm_66298.log hsm_35767.log
  496  27/05/26 11:55:11 -> df -lh
  497  27/05/26 11:55:11 -> pwd
  498  27/05/26 11:55:11 -> df -lh /log_jboss/
  499  27/05/26 11:55:11 -> date
  500  27/05/26 11:55:11 -> exit
  501  02/09/20 15:27:37 -> pwd
  502  02/09/20 15:27:41 -> unalias ls
  503  02/09/20 15:27:47 -> cd /opt/keystore
  504  02/09/20 15:27:48 -> ls
  505  02/09/20 15:27:49 -> ls -0lat
  506  02/09/20 15:27:51 -> ls -lat
  507  02/09/20 15:28:20 -> cp -p VAULT.dat VAULT.dat_02092020_1528
  508  02/09/20 15:28:22 -> ls -lat
  509  02/09/20 15:28:30 -> cd /opt/jboss7
  510  02/09/20 15:28:32 -> ls -lat
  511  02/09/20 15:28:43 -> ls
  512  02/09/20 15:28:44 -> pwd
  513  02/09/20 15:28:46 -> cd ..
  514  02/09/20 15:28:48 -> cd jboss
  515  02/09/20 15:28:50 -> ls -lat
  516  02/09/20 15:28:56 -> cd jboss-eap-7.0
  517  02/09/20 15:28:57 -> clear
  518  02/09/20 15:28:58 -> pwd
  519  02/09/20 15:29:00 -> clear
  520  02/09/20 15:29:29 -> /opt/jboss/jboss-eap-7.0/bin/vault.sh -x debe4abb-209f-4f7b-950e-f3de8214d41e -e /opt/keystore -i 33 -k /opt/keystore/jboss.keystore -p TuxRsp01 -s F3d3r4d0 -v jboss -a password -b SICDCSERINTRAKEY
  521  02/09/20 15:32:12 -> . /opt/jboss/jboss-eap-7.0/bin/init.d/jboss-eap.conf
  522  02/09/20 15:32:16 -> pwd
  523  02/09/20 15:32:23 -> . /opt/jboss/jboss-eap-7.0/bin/init.d/
  524  02/09/20 15:32:31 -> pwd
  525  02/09/20 15:32:34 -> cd bin
  526  02/09/20 15:32:36 -> ls
  527  02/09/20 15:32:52 -> cd init.d
  528  02/09/20 15:32:53 -> ls
  529  02/09/20 15:33:21 -> pwd
  530  02/09/20 15:35:08 -> ls
  531  02/09/20 15:35:16 -> cat jboss-eap.conf
  532  02/09/20 15:35:40 -> vi jboss-eap.conf
  533  02/09/20 15:36:51 -> cd /opt/jboss
  534  02/09/20 15:36:53 -> ls
  535  02/09/20 15:36:57 -> cd jboss-eap-7.0
  536  02/09/20 15:37:00 -> ls
  537  02/09/20 15:37:02 -> clear
  538  02/09/20 15:37:12 -> /opt/jboss/jboss-eap-7.0/bin/vault.sh -x debe4abb-209f-4f7b-950e-f3de8214d41e -e /opt/keystore -i 33 -k /opt/keystore/jboss.keystore -p TuxRsp01 -s F3d3r4d0 -v jboss -a password -b SICDCSERINTRAKEY
  539  02/09/20 16:10:40 -> pwd
  540  02/09/20 16:10:43 -> cd ..
  541  02/09/20 16:10:44 -> cd jboss
  542  02/09/20 16:10:45 -> ls
  543  02/09/20 16:10:47 -> unalias ls
  544  02/09/20 16:10:49 -> ls -lat
  545  02/09/20 16:10:54 -> cd jboss-eap-7.0
  546  02/09/20 16:11:05 -> /opt/jboss/jboss-eap-7.0/bin/vault.sh -x debe4abb-209f-4f7b-950e-f3de8214d41e -e /opt/keystore -i 33 -k /opt/keystore/jboss.keystore -p TuxRsp01 -s F3d3r4d0 -v jboss -a password -b SICDCSERINTRAKEY
  547  02/09/20 16:11:58 -> pwd
  548  02/09/20 16:12:01 -> cd bin
  549  02/09/20 16:12:08 -> vi vault.sh
  550  02/09/20 16:13:55 -> less vault.sh
  551  02/09/20 16:14:57 -> vi vault.sh
  552  02/09/20 16:17:05 -> pwd
  553  02/09/20 16:17:09 -> cd ..
  554  02/09/20 16:17:10 -> pwd
  555  02/09/20 16:17:23 -> /opt/jboss/jboss-eap-7.0/bin/vault.sh -x debe4abb-209f-4f7b-950e-f3de8214d41e -e /opt/keystore -i 33 -k /opt/keystore/jboss.keystore -p TuxRsp01 -s F3d3r4d0 -v jboss -a password -b SICDCSERINTRAKEY
  556  02/09/20 16:18:40 -> pwd
  557  02/09/20 16:18:53 -> less vault.sh
  558  02/09/20 16:19:00 -> pwd
  559  02/09/20 16:19:03 -> cd bin
  560  02/09/20 16:19:07 -> less vault.sh
  561  02/09/20 16:23:39 -> cler
  562  02/09/20 16:23:42 -> clear
  563  02/09/20 16:23:48 -> date
  564  02/09/20 16:24:05 -> strings VAULT.dat |grep ^SICDCSERINTRAKEY
  565  02/09/20 16:24:09 -> pwd
  566  02/09/20 16:24:18 -> cd /opt/keystore
  567  02/09/20 16:24:19 -> ls-0lkat
  568  02/09/20 16:24:20 -> ls -lat
  569  02/09/20 16:24:22 -> clear
  570  02/09/20 16:24:24 -> date
  571  02/09/20 16:24:31 -> strings VAULT.dat |grep ^SICDCSERINTRAKEY
  572  02/09/20 18:08:39 -> pwd
  573  02/09/20 18:08:42 -> cd ..
  574  02/09/20 18:08:44 -> cd jboss7
  575  02/09/20 18:08:45 -> ls -lat
  576  02/09/20 18:09:03 -> df -k
  577  11/11/20 20:56:25 -> cd /opt/jboss/jboss-eap-7.0/modules/system/
  578  11/11/20 20:56:27 -> ls -ltrh
  579  27/05/22 15:15:52 -> cd /opt/jboss
  580  27/05/22 15:15:53 -> ls -lrt
  581  27/05/22 15:15:57 -> sh ./high_cpu_linux_jstack.sh 110809
  582  27/05/22 15:16:33 -> ls -lrt
  583  27/05/22 15:16:43 -> pwd
  584  19/09/22 18:41:07 -> cd /opt/keystore
  585  19/09/22 18:41:10 -> ls -l
  586  19/09/22 18:41:32 -> cp VAULT.dat VAULT.dat.20220919
  587  19/09/22 18:41:39 -> ls -l
  588  19/09/22 18:41:51 -> strings /opt/keystore/VAULT.dat | grep -i SAVLST01
  589  19/09/22 18:41:59 -> /opt/jboss/jboss-eap-7.0/bin/vault.sh -x Ajb83DxQ9yH -e /opt/keystore -i 33 -k /opt/keystore/jboss.keystore -p TuxRsp01 -s F3d3r4d0 -v jboss -a password -b SAVLST01
  590  19/09/22 18:42:04 -> strings /opt/keystore/VAULT.dat | grep -i SAVLST01
  591  19/09/22 18:42:28 -> exit
  592  06/02/24 12:32:23 -> cd /siavl/
  593  06/02/24 12:32:24 -> ll
  594  06/02/24 12:32:29 -> touch teste.txt
  595  06/02/24 12:32:31 -> ll
  596  06/02/24 12:32:42 -> rm -f teste.txt
  597  06/02/24 12:33:24 -> df -h
  598  06/02/24 12:33:27 -> cd /siavl/imagens
  599  06/02/24 12:33:28 -> ll
  600  06/02/24 12:33:34 -> touch teste.txt
  601  06/02/24 12:33:36 -> ll
  602  06/02/24 12:33:48 -> rm -f teste.txt
  603  06/02/24 12:33:50 -> ll
  604  23/05/24 00:13:26 -> /opt/jboss/jboss-eap-7.0/bin/vault.sh -x MTQYCr6s3 -e /opt/keystore -i 33 -k /opt/keystore/jboss.keystore -p TuxRsp01 -s F3d3r4d0 -v jboss -a password -b SIPDIDS
  605  23/05/24 00:13:33 -> exit
  606  02/09/25 17:18:22 -> cd /opt/jboss
  607  02/09/25 17:18:24 -> cd jboss-eap-7.0/
  608  02/09/25 17:18:40 -> ./jboss.sh sipdi-lx0041 stop
  609  02/09/25 17:19:09 -> ps -ef |grep sipdi
  610  02/09/25 17:19:15 -> ./jboss.sh sipdi-lx0041 start
  611  02/09/25 17:21:02 -> ps -ef |grep sipdi
  612  02/09/25 17:24:02 -> ls -lart
  613  02/09/25 17:24:08 -> ls
  614  02/09/25 17:24:12 -> cd standalone/
  615  02/09/25 17:24:13 -> ls
  616  02/09/25 17:24:14 -> cd log
  617  02/09/25 17:24:14 -> ls
  618  02/09/25 17:24:16 -> ls -lart
  619  02/09/25 17:24:20 -> tail -100 server.log
  620  02/09/25 17:24:28 -> date
  621  02/09/25 17:24:31 -> cd ..
  622  02/09/25 17:24:31 -> ls
  623  02/09/25 17:24:32 -> cd ..
  624  02/09/25 17:24:33 -> ls
  625  02/09/25 17:24:42 -> cd domain
  626  02/09/25 17:24:43 -> ls
  627  02/09/25 17:24:45 -> cd log
  628  02/09/25 17:24:45 -> ls
  629  02/09/25 17:24:46 -> ls -lart
  630  02/09/25 17:24:53 -> tail -f console.log
  631  02/09/25 17:25:23 -> tail -100 host-controller.log
  632  02/09/25 17:42:03 -> ps -fu jboss7
  633  29/03/26 10:14:51 -> ps -ef | grep pmon
  634  29/03/26 10:14:55 -> ps -ef
  635  29/03/26 10:15:05 -> cd /opt/jboss/jboss-eap-7.0/domain
  636  29/03/26 10:15:07 -> ls -ltrh
  637  29/03/26 10:15:08 -> cd configuration/
  638  29/03/26 10:15:09 -> ls -ltrh
  639  29/03/26 10:15:12 -> cat domain.xml
  640  29/03/26 10:16:42 -> ls -ltrh
  641  29/03/26 10:16:51 -> cd ..
  642  29/03/26 10:16:52 -> ls -ltrh
  643  29/03/26 10:16:55 -> cd ..
  644  29/03/26 10:16:56 -> ls -ltrh
  645  29/03/26 10:17:02 -> cd standalone/
  646  29/03/26 10:17:03 -> ls -ltrh
  647  29/03/26 10:17:06 -> cd configuration/
  648  29/03/26 10:17:07 -> ls -ltrh
  649  29/03/26 10:17:14 -> cat standalone-full-ha.xml
  650  29/03/26 10:17:38 -> ps -ef
  651  29/03/26 10:18:30 -> cd /opt/jboss/jboss-eap-7.0/
  652  29/03/26 10:18:32 -> ls -ltrh
  653  29/03/26 10:18:51 -> cat domain/
  654  29/03/26 10:18:56 -> cat domain.xml
  655  29/03/26 10:19:02 -> cd domain/
  656  29/03/26 10:19:03 -> ls -ltrh
  657  29/03/26 10:19:05 -> cd configuration/
  658  29/03/26 10:19:07 -> ls -ltrh
  659  29/03/26 10:19:14 -> cat host.xml
  660  29/03/26 10:19:27 -> cd ..
  661  29/03/26 10:19:28 -> ls -ltrh
  662  29/03/26 10:19:30 -> cd configuration/
  663  29/03/26 10:19:31 -> ls -ltrh
  664  29/03/26 10:19:39 -> cat domain.xml
  665  29/03/26 10:21:49 -> vi domain.xml
  666  29/03/26 10:22:57 -> pwd
  667  29/03/26 10:23:13 -> ps -ef
  668  29/03/26 10:24:54 -> cat /etc/host
  669  29/03/26 10:24:55 -> cat /etc/hosts
  670  29/03/26 10:25:25 -> exit
  671  29/03/26 10:40:49 -> history
  672  29/03/26 10:41:33 -> zgrep -i WFLYJCA0005 /backup/log_optjboss/sspdeapllx0041.sisag-lx0041.server.log.2026-03-24.gz
  673  29/03/26 10:41:46 -> exit
  674  27/05/26 11:57:24 -> /opt/jboss/jboss-eap-7.0/bin/jboss-cli.sh --connect --controller=10.116.88.97:9999 --command="/host=sspdeapllx0041/server=sisag-lx0041:restart"
  675  27/05/26 11:57:40 -> history
[jboss7@sspdeapllx0041 p585600]$ ^C
[jboss7@sspdeapllx0041 p585600]$

