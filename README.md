cat > /tmp/fix_hostxml.py << 'EOF'
content = open('/opt/jboss/jboss-eap-7.0/domain/configuration/host.xml', 'r').read()
old = '        <server name="sisag-lx0041" group="sisag" auto-start="true">\n            <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="6"/>\n        </server>'
new = '        <server name="sisag-lx0041" group="sisag" auto-start="true">\n            <jvm name="default" debug-enabled="false" env-classpath-ignored="false">\n                <environment-variables>\n                    <variable name="APPLICATIONINSIGHTS_ROLE_INSTANCE" value="${env.HOSTNAME}_sisag-lx0041"/>\n                </environment-variables>\n            </jvm>\n            <socket-bindings socket-binding-group="cef-full-ha-sockets" port-offset="6"/>\n        </server>'
if old in content:
    print('ENCONTRADO - aplicando alteracao...')
    content = content.replace(old, new)
    open('/opt/jboss/jboss-eap-7.0/domain/configuration/host.xml', 'w').write(content)
    print('CONCLUIDO com sucesso!')
else:
    print('ATENCAO: trecho nao encontrado - nenhuma alteracao feita')
EOF
