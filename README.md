Boa tarde! Tudo bem?

Analisei o CrashLoopBackOff do *sicql-mapsfeeder-des* (OKD4, namespace sicql-des). Segue o que levantamos até agora:

*O que o log mostra*
O WildFly não consegue resolver as variáveis de conexão com o ActiveMQ:
```
WFLYCTL0211: Cannot resolve expression '${env.ACTIVEMQ_URL}'
WFLYCTL0211: Cannot resolve expression '${env.ACTIVEMQ_USERNAME}'
WFLYCTL0211: Cannot resolve expression '${env.ACTIVEMQ_PASSWORD}'
```
Com isso o resource adapter *activemq-rar* sobe sem configuração, e o *feeder.war* fica sem acesso às filas (FeederToPrecificador, PegasusDigester, PegasusPassivoDigester). O container é reiniciado em seguida.

O log também mostra falta de LDAP_BIND_DN e LDAP_BIND_PASSWORD. Elas existem na Library, mas estão vazias. Como LDAP_ANONYMOUS_READ_ONLY está como true, acreditamos que não seja o que derruba o pod, mas vale vocês confirmarem.

*Suspeita*
A release *SICQL-mapsfeeder* está vinculada aos variable groups do *mapspegasusenquadramento*:
• SICQL-mapspegasusenquadramento-des
• SICQL-mapspegasusenquadramento-tqs
• SICQL-mapspegasusenquadramento-hmp
• SICQL-mapspegasusenquadramento-prd

Nenhum desses grupos tem as variáveis de ActiveMQ. Além disso, eles carregam valores específicos do enquadramento (CERTIFICATE_NAME, REVERSE_PROXY_URL, schema enq).

*O que precisamos de vocês*
Não temos os valores do ActiveMQ. Peço que incluam na Library do feeder as variáveis abaixo, seguindo o padrão do pipeline:
• _ENV.ACTIVEMQ_URL
• _ENV.ACTIVEMQ_USERNAME
• ACTIVEMQ_PASSWORD (com cadeado) + _SECRET.ACTIVEMQ_PASSWORD = #{ACTIVEMQ_PASSWORD}#

Também precisamos que confirmem se o feeder deveria ter um variable group próprio (ex.: SICQL-mapsfeeder-des) em vez de usar o do enquadramento. Se for o caso, as variáveis do ActiveMQ entram nesse grupo novo.

Depois da inclusão, é necessário criar uma *release nova*, porque o redeploy de uma release existente não carrega as variáveis novas. Fico à disposição para acompanhar o deploy.

Obrigado!
