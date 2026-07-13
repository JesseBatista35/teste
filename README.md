[p585600@scttqapllx0032 /]$ sudo -u jboss kill -15 99496 sleep 15 ps -p 99496
kill: não foi possível localizar o processo "sleep"
kill 15: Operação não permitida
kill: não foi possível localizar o processo "ps"
kill: não foi possível localizar o processo "-p"
[p585600@scttqapllx0032 /]$
[p585600@scttqapllx0032 /]$
[p585600@scttqapllx0032 /]$ sudo -u jboss kill -15 99496
[p585600@scttqapllx0032 /]$
[p585600@scttqapllx0032 /]$
[p585600@scttqapllx0032 /]$ ps -p 99496
   PID TTY          TIME CMD
 99496 ?        00:57:29 java
[p585600@scttqapllx0032 /]$ sudo -l
Matching Defaults entries for p585600 on this host:
    env_reset, env_keep="COLORS DISPLAY HOSTNAME HISTSIZE INPUTRC KDEDIR LS_COLORS", env_keep+="MAIL PS1 PS2 QTDIR USERNAME LANG LC_ADDRESS LC_CTYPE", env_keep+="LC_COLLATE LC_IDENTIFICATION
    LC_MEASUREMENT LC_MESSAGES", env_keep+="LC_MONETARY LC_NAME LC_NUMERIC LC_PAPER LC_TELEPHONE", env_keep+="LC_TIME LC_ALL LANGUAGE LINGUAS _XKB_CHARSET XAUTHORITY", logfile=/var/log/sudo.log

User p585600 may run the following commands on this host:
    (ALL) NOPASSWD: ALL, (ALL) !/bin/su, (ALL) !/bin/sh, (ALL) !/bin/bash
    (ALL) NOPASSWD: ALL, (ALL) !/bin/su, (ALL) !/bin/sh, (ALL) !/bin/bash
    (root) NOPASSWD: /bin/chown * /opt/*, /bin/chmod * /opt/*, /bin/mv * /opt/*, /etc/init.d/jboss-slave *, /usr/bin/crontab -u jboss -l, /usr/bin/crontab -u jboss -e, /usr/bin/locate *, !/bin/bash,
    /usr/bin/vim /etc/cron.d/*, /usr/bin/crontab -l, /usr/bin/crontab -e, /usr/bin/vim /opt/*, /etc/init.d/tomcat6 *, /bin/chown * /var/lib/tomcat6/*, /bin/mv * /var/lib/tomcat6/*, /bin/chmod *
    /var/lib/tomcat6/*, /usr/sbin/service *, /etc/init.d/apache2 *, /usr/sbin/apache2ctl *, /usr/sbin/nginx  *, /bin/tar *, /bin/bunzip2 *, /bin/chown -R * /var/www/*, /bin/mv *, /bin/cp *,
    /bin/mkdir *, /bin/su www-data -c *, /bin/rm  -rf /tmp/*
[p585600@scttqapllx0032 /]$ sudo -u jboss /opt/etc/init.d/jboss-master status
JBOSS_HOME does not exist as a valid directory : /opt/jboss-master/jboss-eap-6.0/
[p585600@scttqapllx0032 /]$ cat /opt/etc/init.d/jboss-master
#!/usr/bin/env bash
### BEGIN INIT INFO
# Provides:          jboss-as
# Required-Start:    $local_fs $remote_fs $network
# Required-Stop:     $local_fs $remote_fs $network
# Should-Start:      $named
# Should-Stop:       $named
# Default-Start:     2 3 4 5
# Default-Stop:      0 1 6
# Short-Description: Start JBoss AS
# Description:       Start JBoss Application Server.
### END INIT INFO
failure () {
  echo "FAILURE"
}

### BEGIN INIT INFO
# Provides: jboss
# Required-Start: $local_fs $remote_fs $network
# Required-Stop: $local_fs $remote_fs $network
# Default-Start: 2 3 4 5
# Default-Stop: 0 1 6
# Short-Description: Start/stop jboss service
### END INIT INFO

# define where jboss is - this is the directory containing directories log, bin, conf etc
JBOSS_HOME=${JBOSS_HOME:-"/opt/jboss-master/jboss-eap-6.0/"}

# define the user under which jboss will run, or use 'RUNASIS' to run as the current user
JBOSS_USER=${JBOSS_USER:-"jboss"}

# make sure java is in your path
JAVAPTH=${JAVAPTH:-"/usr/lib/jvm/java-6-sun-1.6.0.26/bin/"}

# configuration to use
JBOSS_CONFIG=${JBOSS_CONFIG:-"domain.xml"}

#Parametros de inicialicação
JBOSS_PARAMS="-Djboss.domain.base.dir=/opt/jboss-master/jboss-eap-6.0/domain/ --host-config=host-master.xml -Djboss.bind.address.management=0.0.0.0"


# define the script to use to start jboss
JBOSS_SCRIPT="$JBOSS_HOME/bin/domain.sh $JBOSS_PARAMS"

# Pid file
JBOSS_PIDFILE=$JBOSS_HOME/lock/lock.file

# Startup and Shutdown times
if [ -z "$STARTUP_WAIT" ]; then
  STARTUP_WAIT=10
fi

if [ -z "$SHUTDOWN_WAIT" ]; then
  SHUTDOWN_WAIT=10
fi

if [ "$JBOSS_USER" = "RUNASIS" ]; then
  SUBIT=""
else
  SUBIT="su - $JBOSS_USER -c "
fi

if [ -z "$JBOSS_CONSOLE_LOG" ]; then
  JBOSS_CONSOLE_LOG=/var/log/jboss/console.log
fi

if [ -z "`echo $PATH | grep $JAVAPTH`" ]; then
  export PATH=$PATH:$JAVAPTH
fi

if [ ! -d "$JBOSS_HOME" ]; then
  echo JBOSS_HOME does not exist as a valid directory : $JBOSS_HOME
  exit 1
fi


status () {
  if [ -f $JBOSS_PIDFILE ]; then
    read ppid < $JBOSS_PIDFILE
    if [ `ps --pid $ppid 2> /dev/null | grep -c $ppid 2> /dev/null` -eq '1' ]; then
      echo "$prog is running (pid $ppid)"
      return 0
    else
      failure
      echo "$prog dead but pid file exists ($JBOSS_PIDFILE) "
      return 1
    fi
  fi
  echo "$prog is not running"
  return 3
}

start () {
  echo -n "Starting $prog: "
  if [ -f $JBOSS_PIDFILE ]; then
    read ppid < $JBOSS_PIDFILE
    if [ `ps --pid $ppid 2> /dev/null | grep -c $ppid 2> /dev/null` -eq '1' ]; then
      echo -n "$prog is already running"
      # failure
      echo
      return 1
    else
      rm -f $JBOSS_PIDFILE
    fi
  fi
  mkdir -p $(dirname $JBOSS_CONSOLE_LOG)
  cat /dev/null > $JBOSS_CONSOLE_LOG

  mkdir -p $(dirname $JBOSS_PIDFILE)
  chown $JBOSS_USER $(dirname $JBOSS_PIDFILE) || true
  #$CMD_PREFIX JBOSS_PIDFILE=$JBOSS_PIDFILE $JBOSS_SCRIPT 2>&1 > $JBOSS_CONSOLE_LOG &
  #$CMD_PREFIX JBOSS_PIDFILE=$JBOSS_PIDFILE $JBOSS_SCRIPT &

  if [ ! -z "$JBOSS_USER" ]; then
    if [ -x /etc/rc.d/init.d/functions ]; then
      daemon --user $JBOSS_USER LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=$JBOSS_PIDFILE $JBOSS_SCRIPT 2>&1 > $JBOSS_CONSOLE_LOG &
    else
      su - $JBOSS_USER -c "LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=$JBOSS_PIDFILE $JBOSS_SCRIPT" 2>&1 > $JBOSS_CONSOLE_LOG &
    fi
  fi

  count=0
  launched=false

  until [ $count -gt $STARTUP_WAIT ]
  do
    grep 'JBoss AS.*started in' $JBOSS_CONSOLE_LOG > /dev/null
    if [ $? -eq 0 ] ; then
      launched=true
      break
    fi
    sleep 1
    let count=$count+1;
  done

  echo
  return 0

}

stop () {
  echo -n $"Stopping Jboss: "
  count=0;

  if [ -f $JBOSS_PIDFILE ]; then
    read kpid < $JBOSS_PIDFILE
    let kwait=$SHUTDOWN_WAIT

    # Try issuing SIGTERM

    kill -15 $kpid
    until [ `ps --pid $kpid 2> /dev/null | grep -c $kpid 2> /dev/null` -eq '0' ] || [ $count -gt $kwait ]
    do
      sleep 1
      let count=$count+1;
    done

    if [ $count -gt $kwait ]; then
      kill -9 $kpid
    fi
  fi
  rm -f $JBOSS_PIDFILE && rm -f $LOCKFILE
  echo
}

case "$1" in
start)
    start
    ;;
stop)
    stop
    ;;
restart)
    stop
    sleep 15
    start
    ;;
status)
    status
    ;;
*)
    echo "usage: $0 (start|stop|restart|status|help)"
esac


[p585600@scttqapllx0032 /]$


