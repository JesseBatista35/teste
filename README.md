[root@crjtqapllx036 tmp]# ls -la /opt/open/sso/7.3.0/bin/init.d/
total 20
drwxr-xr-x 2 spssodr1 singlesignon 4096 Jan  9  2019 .
drwxr-x--x 4 spssodr1 singlesignon 4096 May  6  2025 ..
-rw-r--r-- 1 spssodr1 singlesignon  866 Jan  9  2019 jboss-eap.conf
-rwxr-xr-x 1 spssodr1 singlesignon 5116 Dec  3  2019 jboss-eap-rhel.sh
[root@crjtqapllx036 tmp]#
[root@crjtqapllx036 tmp]#
[root@crjtqapllx036 tmp]#
[root@crjtqapllx036 tmp]#
[root@crjtqapllx036 tmp]#
[root@crjtqapllx036 tmp]# cat /opt/open/sso/7.3.0/bin/init.d/*
# General configuration for the init.d scripts,
# not necessarily for JBoss EAP itself.
# default location: /etc/default/jboss-eap

## Location of JDK
# JAVA_HOME="/usr/lib/jvm/default-java"

## Location of JBoss EAP
# JBOSS_HOME="/opt/jboss-eap"

## The username who should own the process.
# JBOSS_USER=jboss-eap

## The mode JBoss EAP should start, standalone or domain
# JBOSS_MODE=standalone

## Configuration for standalone mode
# JBOSS_CONFIG=standalone.xml

## Configuration for domain mode
# JBOSS_DOMAIN_CONFIG=domain.xml
# JBOSS_HOST_CONFIG=host-master.xml

## The amount of time to wait for startup
# STARTUP_WAIT=60

## The amount of time to wait for shutdown
# SHUTDOWN_WAIT=60

## Location to keep the console log
# JBOSS_CONSOLE_LOG="/var/log/jboss-eap/console.log"

## Additionals args to include in startup
# JBOSS_OPTS="--admin-only -b 127.0.0.1"
#!/bin/sh
#
# JBoss EAP control script
#
# chkconfig: - 80 20
# description: JBoss EAP startup script
# processname: jboss-eap
# pidfile: /var/run/jboss-eap/jboss-eap.pid
# config: /etc/default/jboss-eap.conf
#

# Source function library.
. /etc/init.d/functions

# Load Java configuration.
[ -r /etc/java/java.conf ] && . /etc/java/java.conf
export JAVA_HOME

if [ -z "$JBOSS_NAME" ]; then
  JBOSS_NAME='jboss-eap'
fi

# Load JBoss EAP init.d configuration.
if [ -z "$JBOSS_CONF" ]; then
        JBOSS_CONF="/etc/default/$JBOSS_NAME.conf"
fi

[ -r "$JBOSS_CONF" ] && . "${JBOSS_CONF}"

# Set defaults.

if [ -z "$JBOSS_HOME" ]; then
        JBOSS_HOME=/opt/$JBOSS_NAME
fi
export JBOSS_HOME

if [ -z "$JBOSS_PIDFILE" ]; then
        JBOSS_PIDFILE=/var/run/jboss-eap/$JBOSS_NAME.pid
fi
export JBOSS_PIDFILE

if [ -z "$JBOSS_CONSOLE_LOG" ]; then
        JBOSS_CONSOLE_LOG=/var/log/$JBOSS_NAME/console.log
fi

if [ -z "$STARTUP_WAIT" ]; then
        STARTUP_WAIT=30
fi

if [ -z "$SHUTDOWN_WAIT" ]; then
        SHUTDOWN_WAIT=30
fi

if [ -z "$JBOSS_LOCKFILE" ]; then
        JBOSS_LOCKFILE=/var/lock/subsys/$JBOSS_NAME
fi

# Startup mode of jboss-eap
if [ -z "$JBOSS_MODE" ]; then
        JBOSS_MODE=standalone
fi

if [ -z "$JBOSS_BASE_DIR" ]; then
        JBOSS_BASE_DIR="$JBOSS_HOME/$JBOSS_MODE"
else
        JBOSS_OPTS="$JBOSS_OPTS -Djboss.server.base.dir=$JBOSS_BASE_DIR"
fi

JBOSS_MARKERFILE=$JBOSS_BASE_DIR/tmp/startup-marker

# Startup mode script
if [ "$JBOSS_MODE" = "standalone" ]; then
        JBOSS_SCRIPT=$JBOSS_HOME/bin/standalone.sh
        if [ -z "$JBOSS_CONFIG" ]; then
                JBOSS_CONFIG=standalone.xml
        fi
else
        JBOSS_SCRIPT=$JBOSS_HOME/bin/domain.sh
        if [ -z "$JBOSS_DOMAIN_CONFIG" ]; then
                JBOSS_DOMAIN_CONFIG=domain.xml
        fi
        if [ -z "$JBOSS_HOST_CONFIG" ]; then
                JBOSS_HOST_CONFIG=host.xml
        fi
fi

prog=$JBOSS_NAME
currenttime=$(date +%s%N | cut -b1-13)

start() {
        echo -n "Starting $prog: "
        if [ -f $JBOSS_PIDFILE ]; then
                read ppid < $JBOSS_PIDFILE
                if [ `ps --pid $ppid 2> /dev/null | grep -c $ppid 2> /dev/null` -eq '1' ]; then
                        echo -n "$prog is already running"
                        failure
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

        if [ ! -z "$JBOSS_USER" ]; then
                if [ "$JBOSS_MODE" = "standalone" ]; then
                        if [ -r /etc/rc.d/init.d/functions ]; then
                                cd $JBOSS_HOME
                                daemon --user $JBOSS_USER LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=$JBOSS_PIDFILE "$JBOSS_SCRIPT -c $JBOSS_CONFIG $JBOSS_OPTS &" >> $JBOSS_CONSOLE_LOG 2>&1
                                cd -
                        else
                                su - $JBOSS_USER -c "cd $JBOSS_HOME; LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=$JBOSS_PIDFILE $JBOSS_SCRIPT -c $JBOSS_CONFIG $JBOSS_OPTS" >> $JBOSS_CONSOLE_LOG 2>&1 &
                        fi
                else
                        if [ -r /etc/rc.d/init.d/functions ]; then
                                cd $JBOSS_HOME
                                daemon --user $JBOSS_USER LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=$JBOSS_PIDFILE "$JBOSS_SCRIPT --domain-config=$JBOSS_DOMAIN_CONFIG --host-config=$JBOSS_HOST_CONFIG $JBOSS_OPTS &" >> $JBOSS_CONSOLE_LOG 2>&1
                                cd -
                        else
                                su - $JBOSS_USER -c "cd $JBOSS_HOME; LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=$JBOSS_PIDFILE $JBOSS_SCRIPT --domain-config=$JBOSS_DOMAIN_CONFIG --host-config=$JBOSS_HOST_CONFIG $JBOSS_OPTS" >> $JBOSS_CONSOLE_LOG 2>&1 &
                        fi
                fi
        fi

        count=0
        launched=false

        until [ $count -gt $STARTUP_WAIT ]
        do
                sleep 1
                let count=$count+1;
                if [ -f $JBOSS_MARKERFILE ]; then
                        markerfiletimestamp=$(grep -o '[0-9]*' $JBOSS_MARKERFILE) > /dev/null
                        if [ "$markerfiletimestamp" -gt "$currenttime" ] ; then
                                grep -i 'success:' $JBOSS_MARKERFILE > /dev/null
                                if [ $? -eq 0 ] ; then
                                        launched=true
                                        break
                                fi
                        fi
                fi
        done

        if [ "$launched" = "false" ] ; then
                echo "$prog started with errors, please see server log for details"
        fi

        touch $JBOSS_LOCKFILE
        success
        echo
        return 0
}

stop() {
        echo -n $"Stopping $prog: "
        count=0;

        if [ -f $JBOSS_PIDFILE ]; then
                read kpid < $JBOSS_PIDFILE
                let kwait=$SHUTDOWN_WAIT

                # Try issuing SIGTERM
                su -s /bin/sh -c "kill -15 $kpid" $JBOSS_USER
                until [ `ps --pid $kpid 2> /dev/null | grep -c $kpid 2> /dev/null` -eq '0' ] || [ $count -gt $kwait ]
                        do
                        sleep 1
                        let count=$count+1;
                done

                if [ $count -gt $kwait ]; then
                       su -s /bin/sh -c "kill -9 $kpid" $JBOSS_USER 2> /dev/null
                       if [ "$?" != 0  ]; then
                               failure
                               exit 1
                       fi
                fi
        fi
        rm -f $JBOSS_PIDFILE
        rm -f $JBOSS_LOCKFILE
        success
        echo
}

status() {
        if [ -f $JBOSS_PIDFILE ]; then
                read ppid < $JBOSS_PIDFILE
                if [ `ps --pid $ppid 2> /dev/null | grep -c $ppid 2> /dev/null` -eq '1' ]; then
                        echo "$prog is running (pid $ppid)"
                        return 0
                else
                        echo "$prog dead but pid file exists"
                        return 1
                fi
        fi
        echo "$prog is not running"
        return 3
}

case "$1" in
        start)
                start
                ;;
        stop)
                stop
                ;;
        restart)
                $0 stop
                $0 start
                ;;
        status)
                status
                ;;
        *)
                ## If no parameters are given, print which are avaiable.
                echo "Usage: $0 {start|stop|status|restart}"
                exit 1
                ;;
esac
[root@crjtqapllx036 tmp]#
[root@crjtqapllx036 tmp]#
[root@crjtqapllx036 tmp]#
[root@crjtqapllx036 tmp]# su - spssodr1
Last login: Fri May  2 17:34:38 -03 2025 on pts/3
[spssodr1@crjtqapllx036 ~]$
[spssodr1@crjtqapllx036 ~]$
[spssodr1@crjtqapllx036 ~]$
[spssodr1@crjtqapllx036 ~]$ cd /opt/open/sso/7.3.0/bin
[spssodr1@crjtqapllx036 bin]$ nohup ./standalone.sh -c standalone.xml > /tmp/jboss_start.log 2>&1 &
[1] 111393
[spssodr1@crjtqapllx036 bin]$
[spssodr1@crjtqapllx036 bin]$
[spssodr1@crjtqapllx036 bin]$ tail -f /infra_app/logs/siset/server-*.log
==> /infra_app/logs/siset/server-crjdeapllx003.log <==
2023-08-08 17:54:15,628 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0010: Deployed "OTPCaixaCond.jar" (runtime-name : "OTPCaixaCond.jar")
2023-08-08 17:54:15,628 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0010: Deployed "validaLogin-jar-with-dependencies.jar" (runtime-name : "validaLogin-jar-with-dependencies.jar")
2023-08-08 17:54:15,628 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0010: Deployed "resource-provider-jar-with-dependencies.jar" (runtime-name : "resource-provider-jar-with-dependencies.jar")
2023-08-08 17:54:15,628 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0010: Deployed "directgrantpassword-jar-with-dependencies.jar" (runtime-name : "directgrantpassword-jar-with-dependencies.jar")
2023-08-08 17:54:15,629 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0010: Deployed "user-storage-jpa-siper-jar-with-dependencies.jar" (runtime-name : "user-storage-jpa-siper-jar-with-dependencies.jar")
2023-08-08 17:54:15,635 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 43) WFLYSRV0010: Deployed "keycloak-server.war" (runtime-name : "keycloak-server.war")
2023-08-08 17:54:15,703 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Resuming server
2023-08-08 17:54:15,706 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: Http management interface listening on http://0.0.0.0:9990/management
2023-08-08 17:54:15,707 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0051: Admin console listening on http://0.0.0.0:9990
2023-08-08 17:54:15,707 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: Red Hat Single Sign-On 7.3.3.GA (WildFly Core 6.0.15.Final-redhat-00001) started in 18901ms - Started 902 of 1172 services (608 services are lazy, passive or on-demand)

==> /infra_app/logs/siset/server-siset_crjdeapllx003_inter_8080.log <==
        at org.keycloak.common.util.Base64.decode(Base64.java:1201)
        at org.keycloak.common.util.Base64.decode(Base64.java:1256)
        at org.keycloak.common.util.Base64.decode(Base64.java:1224)
        at org.keycloak.common.util.PemUtils.pemToDer(PemUtils.java:149)
        at org.keycloak.common.util.PemUtils.decodeCertificate(PemUtils.java:60)
        ... 84 more

2026-07-21 15:02:12,562 INFO  [class br.gov.caixa.comum.LoginCaixaUtils] (default task-3887) Login CAIXA: Valida SIPON - Validando...)
2026-07-21 15:02:12,563 INFO  [class br.gov.caixa.comum.LoginCaixaUtils] (default task-3887) Login CAIXA: Valida SIPON - Validado(userpj40965423859): true)
2026-07-21 15:02:12,565 INFO  [br.gov.caixa.keycloak.OTPFormAuthenticatorCaixa] (default task-3887) voteForClient

