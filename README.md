
-sh-4.2$
-sh-4.2$
-sh-4.2$ PGPASSWORD='<db_password do main.yml>' psql "host=10.244.74.86 port=5432 dbname=monitordb001 user=monitdbadm sslmode=require" -c "select 1"
-sh: psql: comando não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$ PGPASSWORD='<db_password do main.yml>' psql "host=10.244.74.86 port=5432 dbname=monitordb001 user=monitdbadm sslmode=disable" -c "select 1"
-sh: psql: comando não encontrado
-sh-4.2$ /opt/ads-agent/ansible/bin/python -c "import psycopg2; psycopg2.connect(host='10.244.74.86', port=5432, dbname='monitordb001', user='monitdbadm', password='<senha>', sslmode='require'); print('OK')"
/opt/ads-agent/ansible/lib/python2.7/site-packages/psycopg2/__init__.py:144: UserWarning: The psycopg2 wheel package will be renamed from release 2.8; in order to keep installing from binary please use "pip install psycopg2-binary" instead. For details see: <http://initd.org/psycopg/docs/install.html#binary-install-from-pypi>.
  """)
Traceback (most recent call last):
  File "<string>", line 1, in <module>
  File "/opt/ads-agent/ansible/lib/python2.7/site-packages/psycopg2/__init__.py", line 130, in connect
    conn = _connect(dsn, connection_factory=connection_factory, **kwasync)
psycopg2.OperationalError: FATAL:  password authentication failed for user "monitdbadm"

-sh-4.2$


outro analiste me peerunto use isso faz sentido 

Durante a execução da etapa "Configuração da Stack de Monitoração" a esteira falhou ao consultar a base PostgreSQL.
 
Origem:
cadsvaprlx072 (10.122.155.67)
 
Destino:
10.244.74.86:5432
 
Database:
monitordb001
 
Usuário:
monitdbadm
 
Validações realizadas:
 
- Conectividade OK via nc e telnet para 10.244.74.86:5432.
- Banco acessível na rede.
- Falha retornada pelo PostgreSQL:
 
FATAL: password authentication failed for user 'monitdbadm'
FATAL: no pg_hba.conf entry for host '10.122.155.67'
 
Necessário validar:
- senha do usuário monitdbadm;
- regras do pg_hba.conf para o host 10.122.155.67;
- permissões de acesso ao banco monitordb001.
