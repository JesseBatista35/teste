Correção (mover o atributo)

1. Tira o default-encoding="ISO-8859-1" da linha do <subsystem> (linha 579) — deixa ela assim:

xml
<subsystem xmlns="urn:jboss:domain:undertow:12.0" default-server="default-server" default-virtual-host="default-host" default-servlet-container="default" default-security-domain="other" statistics-enabled="${wildfly.undertow.statistics-enabled:${wildfly.statistics-enabled:false}}">

2. Coloca o default-encoding="ISO-8859-1" na tag <servlet-container> (linha 590) — fica assim:

xml
<servlet-container name="default" default-encoding="ISO-8859-1">
    <jsp-config/>
    <websockets/>
</servlet-container>
