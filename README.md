[p585600@sspdeapllx0041 ~]$ sudo -u jboss7 bash -c 'cat > /home/jboss7/fix_hostxml.py << '"'"'EOF'"'"' content = open("/opt/jboss/jboss-eap-7.0/domain/configuration/host.xml", "r").read() old = " <server name="sisag-lx0041" group="sisag" auto-start="true">\n <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="6"/>\n " new = " <server name="sisag-lx0041" group="sisag" auto-start="true">\n <jvm name="default" debug-enabled="false" env-classpath-ignored="false">\n \n <variable name="APPLICATIONINSIGHTS_ROLE_INSTANCE" value="${env.HOSTNAME}_sisag-lx0041"/>\n \n \n <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="6"/>\n " if old in content: print("ENCONTRADO - aplicando alteracao...") content = content.replace(old, new) open("/opt/jboss/jboss-eap-7.0/domain/configuration/host.xml", "w").write(content) print("CONCLUIDO com sucesso") else: print("ATENCAO: trecho nao encontrado - nenhuma alteracao feita") EOF'

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

Senha SUDO:
bash: warning: here-document at line 0 delimited by end-of-file (wanted `EOF')
bash: -c: line 0: syntax error near unexpected token `('
bash: -c: line 0: `cat > /home/jboss7/fix_hostxml.py << 'EOF' content = open("/opt/jboss/jboss-eap-7.0/domain/configuration/host.xml", "r").read() old = " <server name="sisag-lx0041" group="sisag" auto-start="true">\n <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="6"/>\n " new = " <server name="sisag-lx0041" group="sisag" auto-start="true">\n <jvm name="default" debug-enabled="false" env-classpath-ignored="false">\n \n <variable name="APPLICATIONINSIGHTS_ROLE_INSTANCE" value="${env.HOSTNAME}_sisag-lx0041"/>\n \n \n <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="6"/>\n " if old in content: print("ENCONTRADO - aplicando alteracao...") content = content.replace(old, new) open("/opt/jboss/jboss-eap-7.0/domain/configuration/host.xml", "w").write(content) print("CONCLUIDO com sucesso") else: print("ATENCAO: trecho nao encontrado - nenhuma alteracao feita") EOF'
[p585600@sspdeapllx0041 ~]$




sudo -u jboss7 python /home/jboss7/fix_hostxml.py
