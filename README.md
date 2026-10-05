Bom dia, Felipe! Segue o status do sicql-mapsfeeder em TQS (namespace sicql-tqs).

O que descobrimos:
1. A release estava usando as Libraries do mapspegasusenquadramento, por isso faltavam as variáveis do feeder. Isso já foi corrigido: a release agora usa os grupos SICQL-MAPSFEEDER.
2. A mensageria em TQS é IBM MQ (MQ_TYPE=ibmmq). O wmq.jmsra.rar sobe normalmente e registra as filas.
3. O container era morto por OOMKilled: o limite era 1Gi e a JVM roda com Xmx1g mais metaspace e codecache.
4. As variáveis secretas não chegavam ao pod porque estavam com cadeado direto na _SECRET. O Secret era criado vazio e aparecia "Cannot resolve env.DATABASE_PASSWORD".
5. Depois disso, a senha do scqlbt01 estava diferente da que funciona no enquadramento (mesmo banco e usuário), gerando "password authentication failed".

O que mudamos:
1. Library TQS: a senha agora segue o padrão do enquadramento. DATABASE_PASSWORD_VALUE com cadeado e _SECRET.DATABASE_PASSWORD apontando para ela, sem cadeado. Removi a _ENV.DATABASE_PASSWORD, que estava duplicada.
2. Limite de memória do DC aumentado para 2Gi via oc set resources (paliativo).
3. Nova release gerada.

Situação atual:
O banco já conecta (PostgreSQL 11.6). O schema odin estava vazio em TQS e o Liquibase está criando as tabelas no primeiro start. Antes disso o Odin tentou iniciar e deu "relation odin.feeder_file does not exist". Isso deve se resolver no próximo start, já com as tabelas criadas. Estou acompanhando o fim do startup e as probes. Liveness e readiness apontam para /actuator/health, e preciso confirmar se esse endpoint existe no feeder.war.

Pendências / pontos para vocês:
1. O limite de 2Gi foi feito manualmente e a próxima release volta para 1Gi. Precisamos ajustar isso de forma definitiva na release.
2. A REVERSE_PROXY_URL de TQS aponta para apps.apl4.caixa (PRD). O correto seria apps.nprd.caixa.
3. O bloco LDAP está vazio, então a aplicação sobe com a segurança desabilitada. O pricing de TQS tem os valores e podemos copiá-los. Vocês confirmam?
4. Era esperado o schema odin estar vazio em TQS (primeira subida)?
5. DES, HMP e PRD estão só com INIT nas Libraries do feeder.
6. Existe um DC antigo sicql-maps-feeder-tqs (com hífen) parado no namespace. Podemos remover?
7. No grupo do enquadramento TQS, a variável PASSWORD está sem cadeado, com a senha visível. Sugiro trancar.

Assim que o pod estabilizar, te aviso.
