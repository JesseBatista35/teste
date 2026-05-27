[p585600@sspdeapllx0041 ~]$ sudo -u jboss7 python -c " content = open('/opt/jboss/jboss-eap-7.0/domain/configuration/host.xml', 'r').read() old = ' <server name="sisag-lx0041" group="sisag" auto-start="true">\n <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="6"/>\n ' new = ' <server name="sisag-lx0041" group="sisag" auto-start="true">\n <jvm name="default" debug-enabled="false" env-classpath-ignored="false">\n \n <variable name="APPLICATIONINSIGHTS_ROLE_INSTANCE" value="${env.HOSTNAME}_sisag-lx0041"/>\n \n \n <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="6"/>\n ' if old in content: print('ENCONTRADO - aplicando alteracao...') content = content.replace(old, new) open('/opt/jboss/jboss-eap-7.0/domain/configuration/host.xml', 'w').write(content) print('CONCLUIDO com sucesso!') else: print('ATENCAO: trecho nao encontrado - nenhuma alteracao feita') "
-bash: !': event not found
[p585600@sspdeapllx0041 ~]$
[p585600@sspdeapllx0041 ~]$
[p585600@sspdeapllx0041 ~]$

