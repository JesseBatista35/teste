
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ /opt/ads-agent/ansible/bin/python -c "import psycopg2; psycopg2.connect(host='10.244.74.86', port=5432, dbname='monitordb001', user='monitdbadm', password='COLE_A_SENHA_AQUI', sslmode='require'); print('OK')"
/opt/ads-agent/ansible/lib/python2.7/site-packages/psycopg2/__init__.py:144: UserWarning: The psycopg2 wheel package will be renamed from release 2.8; in order to keep installing from binary please use "pip install psycopg2-binary" instead. For details see: <http://initd.org/psycopg/docs/install.html#binary-install-from-pypi>.
  """)
Traceback (most recent call last):
  File "<string>", line 1, in <module>
  File "/opt/ads-agent/ansible/lib/python2.7/site-packages/psycopg2/__init__.py", line 130, in connect
    conn = _connect(dsn, connection_factory=connection_factory, **kwasync)
psycopg2.OperationalError: FATAL:  password authentication failed for user "monitdbadm"

-sh-4.2$
