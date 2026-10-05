Beleza, vou ajustar isso nas properties
 
isso, mais temos que adicionar na library tambem
 
WFLYCTL0211: Cannot resolve expression '${env.ACTIVEMQ_URL}'

WFLYCTL0211: Cannot resolve expression '${env.ACTIVEMQ_USERNAME}'

WFLYCTL0211: Cannot resolve expression '${env.ACTIVEMQ_PASSWORD}'
 
Isso, library. Tô acostumado com JBoss mexendo nas properties
 
Aí eu adiciono na library só _ENV.ACTIVEMQ_URL e já era?
 
URL, username e password no caso
 
podia adicionar essas
 
ACTIVEMQ_PASSWORD	

_ENV.ACTIVEMQ_URL	tcp://<host>:<porta> tem que confirmar

_ENV.ACTIVEMQ_USERNAME	(usuário)	

_SECRET.ACTIVEMQ_PASSWORD	#{ACTIVEMQ_PASSWORD}#	
 
ACTIVEMQ_PASSWORD essa como secret 
 
Aaaaah eu não setei em DES essas libraries
 
Em tqs deixa eu ver o que deu
 
quebrou tambem
 
ver o log
 
Reclamou igual
 
Beleza, esse tem que resolver com a fornecedora
 
Muito obrigado de qualquer forma
 
Quer que eu abra uma REQ pra formalizar?
 
beleza mano.
 
bom final de semana. vou indo nessa.
 
qualquer coisa na segunda a gente continua. 
 
Igualmente
 
Cara, vou dizer agora porque se não eu esqueço na segunda...
 
Adicionei essas properties na library de TQS e rodei a pipeline da release de novo (criei uma nova release pra garantir que refletisse). Notei que a task
 
Exportando Variáveis de Ambiente "_ENV."
2026-10-02T20:49:05.3349072Z CERTIFICATE_NAME=mapspegasusenquadramento
2026-10-02T20:49:05.3350621Z CERTIFICATE_PASSWORD=#{CERTIFICATE_PASSWORD}#
2026-10-02T20:49:05.3350892Z DATABASE_HOST=10.116.28.37
2026-10-02T20:49:05.3351230Z DATABASE_NAME=cqldb001
2026-10-02T20:49:05.3351415Z DATABASE_PORT=5204
2026-10-02T20:49:05.3351561Z DATABASE_SCHEMA=enq
2026-10-02T20:49:05.3351827Z DATABASE_USERNAME=scqlbt01
2026-10-02T20:49:05.3352040Z ENQUADRAMENTO_OAUTH2_ATIVO_CLIENT_SECRET=enquadramentosecret
2026-10-02T20:49:05.3352276Z ENQUADRAMENTO_SYSTEM_SYSADMIN_ACTIVE=false
2026-10-02T20:49:05.3352459Z HTTP_BASIC_INTEGRATION_USERNAME=SCQLTB03
2026-10-02T20:49:05.3352676Z LDAP_ANONYMOUS_READ_ONLY=true
2026-10-02T20:49:05.3352851Z LDAP_BIND_DN=
2026-10-02T20:49:05.3353029Z LDAP_BIND_PASSWORD=
2026-10-02T20:49:05.3353165Z LDAP_DOMAIN=
2026-10-02T20:49:05.3353361Z LDAP_GROUP_BASE_DN=cn=SICQL,ou=groups,o=caixa
2026-10-02T20:49:05.3353609Z LDAP_GROUP_FILTER="(&(objectClass=groupOfUniqueNames)(uniqueMember=uid={0},ou=people,o=caixa))"
2026-10-02T20:49:05.3353783Z LDAP_GROUP_NAME_ATTRIBUTE=cn
2026-10-02T20:49:05.3353932Z LDAP_URL=ldap://10.192.230.65:2489
2026-10-02T20:49:05.3354810Z LDAP_USER_BASE_DN="ou=people,o=caixa"
2026-10-02T20:49:05.3355480Z LDAP_USER_FILTER="(&(objectClass=inetOrgPerson)(objectClass=cefusuario)(uid={0}))"
2026-10-02T20:49:05.3355849Z MAPS_PEGASUS_ATIVO_URL=http://sicql-sp.tqs.desenvolvimento.extracaixa/sicql/api/
2026-10-02T20:49:05.3356094Z MAPS_PEGASUS_PASSIVO_URL=http://sicql-sp.tqs.desenvolvimento.extracaixa/sicqp/api/
2026-10-02T20:49:05.3356320Z REVERSE_PROXY_URL=https://sicql-mapspegasusenquadramento-tqs.apps.nprd.caixa
 
Tá com essas propriedades aqui. Só que essas propriedades são de outro módulo (enquadramento). Parece que essa release só replicou as libraries do outro módulo:
 
Sabe se dá pra arrumar isso?
 
Execute um script Bash no macOS, Linux ou Windows.
 
