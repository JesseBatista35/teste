ot@cadtqapllx046:/# cat -n /etc/init.d/jboss-700
     1  #!/bin/bash
     2  # Script de inicialização para JBOSS
     3  #  by c101054
     4  #=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
     5  JBOSS_HOME=/opt/jboss/jboss
     6  #JAVA_HOME=`update-alternatives --query java | grep Value | cut -f 2 -d " " | sed 's|/bin/java|/|g'`
     7  export JBOSS_HOME
     8  JBOSS_STATUS=0
     9
    10  function startJBoss {
    11          echo "Starting JBoss"
    12          su jboss -c "nohup $JBOSS_HOME/bin/standalone.sh -b 0.0.0.0 -Djboss.bind.address.management=0.0.0.0 > /dev/null 2> /dev/null &"
    13          #su - jboss -c "nohup $JBOSS_HOME/bin/standalone.sh -Djboss.bind.address.management=0.0.0.0 > /dev/null 2> /dev/null &"
    14  }
    15
    16  function stopJBoss {
    17          echo "Stopping JBoss..."
    18          su - jboss -c "$JBOSS_HOME/bin/jboss-cli.sh --connect command=:shutdown"
    19          #killall -u jboss
    20          if [ $? -eq 0 ]; then
    21                  echo "...JBoss stopped!"
    22          else
    23                  echo "... error stopping JBoss"
    24                  JBOSS_STATUS=1
    25          fi
    26  }
    27
    28  case $1 in
    29          start)
    30                  startJBoss
    31                  ;;
    32          stop)
    33                  stopJBoss
    34                  ;;
    35          restart)
    36                  echo "Restarting Jboss..."
    37                  stopJBoss
    38                  if [ $JBOSS_STATUS -eq 0 ]; then
    39                          startJBoss
    40                  fi
    41                  ;;
    42          esac
    43  exit $JBOSS_STATUS
    44
root@cadtqapllx046:/# cat -n /etc/init.d/jboss-640
     1  #!/bin/bash
     2  # Script de inicialização para JBOSS
     3  #  by c101054
     4  #=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
     5  JBOSS_HOME=/opt/jboss/jboss/
     6  JAVA_HOME=`update-alternatives --query java | grep Value | cut -f 2 -d " " | sed 's|/bin/java|/|g'`
     7  #export JBOSS_HOME JAVA_HOME
     8  JBOSS_STATUS=0
     9
    10  function startJBoss {
    11          echo "Starting JBoss"
    12          #su jboss -c "nohup $JBOSS_HOME/bin/standalone.sh -b 0.0.0.0 -Djboss.bind.address.management=0.0.0.0 > /dev/null 2> /dev/null &"
    13          su - jboss -c "nohup $JBOSS_HOME/bin/standalone.sh -Djboss.bind.address.management=0.0.0.0 > /dev/null 2> /dev/null &"
    14  }
    15
    16  function stopJBoss {
    17          echo "Stopping JBoss..."
    18          su - jboss -c "$JBOSS_HOME/bin/jboss-cli.sh --connect command=:shutdown"
    19          #killall -u jboss
    20          if [ $? -eq 0 ]; then
    21                  echo "...JBoss stopped!"
    22          else
    23                  echo "... error stopping JBoss"
    24                  JBOSS_STATUS=1
    25          fi
    26  }
    27
    28  case $1 in
    29          start)
    30                  startJBoss
    31                  ;;
    32          stop)
    33                  stopJBoss
    34                  ;;
    35          restart)
    36                  echo "Restarting Jboss..."
    37                  stopJBoss
    38                  if [ $JBOSS_STATUS -eq 0 ]; then
    39                          startJBoss
    40                  fi
    41                  ;;
    42          esac
    43  exit $JBOSS_STATUS
    44
    45
root@cadtqapllx046:/#
