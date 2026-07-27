[p585600@srjdeapllx130 ~]$ cat /opt/open/jboss/7.0.0/domain/servers/srjdeapllx130_acessoseguro_intra_5500/data/logging.properties
# Note this file has been generated and will be overwritten if a
# logging subsystem has been defined in the XML configuration.


# Additional loggers to configure (the root logger is always configured)
loggers=sun.rmi,org.jboss.as.config,com.arjuna

logger.level=DEBUG
logger.handlers=FILE,CONSOLE

logger.sun.rmi.level=WARN
logger.sun.rmi.useParentHandlers=true

logger.org.jboss.as.config.level=DEBUG
logger.org.jboss.as.config.useParentHandlers=true

logger.com.arjuna.level=WARN
logger.com.arjuna.useParentHandlers=true

handler.CONSOLE=org.jboss.logmanager.handlers.ConsoleHandler
handler.CONSOLE.level=INFO
handler.CONSOLE.formatter=COLOR-PATTERN
handler.CONSOLE.properties=autoFlush,target,enabled
handler.CONSOLE.autoFlush=true
handler.CONSOLE.target=SYSTEM_OUT
handler.CONSOLE.enabled=true

handler.FILE=org.jboss.logmanager.handlers.PeriodicRotatingFileHandler
handler.FILE.level=ALL
handler.FILE.formatter=PATTERN
handler.FILE.properties=append,autoFlush,enabled,suffix,fileName
handler.FILE.constructorProperties=fileName,append
handler.FILE.append=true
handler.FILE.autoFlush=true
handler.FILE.enabled=true
handler.FILE.suffix=.yyyy-MM-dd
handler.FILE.fileName=/infra_app/logs/sisgr/server-srjdeapllx130_acessoseguro_intra_5500.log

formatter.PATTERN=org.jboss.logmanager.formatters.PatternFormatter
formatter.PATTERN.properties=pattern
formatter.PATTERN.pattern=%d{yyyy-MM-dd HH\:mm\:ss,SSS} %-5p [%c] (%t) %s%e%n

formatter.COLOR-PATTERN=org.jboss.logmanager.formatters.PatternFormatter
formatter.COLOR-PATTERN.properties=pattern
formatter.COLOR-PATTERN.pattern=%K{level}%d{HH\:mm\:ss,SSS} %-5p [%c] (%t) %s%e%n
[p585600@srjdeapllx130 ~]$
[p585600@srjdeapllx130 ~]$
[p585600@srjdeapllx130 ~]$
[p585600@srjdeapllx130 ~]$ find /infra_app -iname "*.log" -newer /opt/open/jboss/7.0.0/domain/servers/srjdeapllx130_acessoseguro_intra_5500/log/server.log 2>/dev/null
/infra_app/logs/sisgr/srjdeapllx130_acessoseguro_intra_5500.log
/infra_app/logs/sisgr/server-srjdeapllx130_acessoseguro_intra_5500.log
/infra_app/logs/sisgr/server-srjdeapllx130_webservice_intra_5502.log
/infra_app/logs/sisgr/srjdeapllx130_webservice_intra_5502.log
[p585600@srjdeapllx130 ~]$
[p585600@srjdeapllx130 ~]$
[p585600@srjdeapllx130 ~]$
[p585600@srjdeapllx130 ~]$ find / -iname "*sisgr*.log" -mtime -7 2>/dev/null
[p585600@srjdeapllx130 ~]$

