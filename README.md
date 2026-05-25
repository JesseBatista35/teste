
[p585600@sspdeapllx0041 ~]$ grep -n "javaagent\sisag" /opt/jboss/jboss-eap-7.0/domain/configuration/domain.xml | head -60
[p585600@sspdeapllx0041 ~]$ grep -n "javaagent\sisag" /opt/jboss/jboss-eap-7.0/domain/configuration/host.xml | head -40
[p585600@sspdeapllx0041 ~]$ grep -n "javaagent\|sisag" /opt/jboss/jboss-eap-7.0/domain/configuration/host.xml | head -40
147:        <server name="sisag-lx0041" group="sisag" auto-start="true">
156:        <server name="sisag-teste-lx0041" group="sisag-teste" auto-start="true">
179:        <server name="sisag02-lx0041" group="sisag02" auto-start="true">
182:        <server name="sisag03-lx0041" group="sisag03" auto-start="true" update-auto-start-with-server-status="false">
185:        <server name="sisag04-lx0041" group="sisag04" auto-start="true" update-auto-start-with-server-status="false">
188:        <server name="sisag05-lx0041" group="sisag05" auto-start="true">
[p585600@sspdeapllx0041 ~]$ grep -n "javaagent\|sisag" /opt/jboss/jboss-eap-7.0/domain/configuration/domain.xml | head -60
[p585600@sspdeapllx0041 ~]$
