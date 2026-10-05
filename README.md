
psycopg2.OperationalError: FATAL:  password authentication failed for user "monitdbadm"

-sh-4.2$ sudo /opt/ads-agent/ansible/bin/python -c "import yaml,psycopg2; d=yaml.safe_load(open('/opt/ads-agent/esteira-jboss-vm/roles/zabbix/defaults/main.yml')); psycopg2.connect(host=d['db_ip'], port=d['db_porta'], dbname=d['db_name'], user=d['db_user'], password=str(d['db_password']), sslmode='require'); print('OK')"

Presumimos que você recebeu as instruções de sempre do administrador
de sistema local. Basicamente, resume-se a estas três coisas:

    #1) Respeite a privacidade dos outros.
    #2) Pense antes de digitar.
    #3) Com grandes poderes vêm grandes responsabilidades.

[sudo] senha para p585600:
/opt/ads-agent/ansible/lib/python2.7/site-packages/psycopg2/__init__.py:144: UserWarning: The psycopg2 wheel package will be renamed from release 2.8; in order to keep installing from binary please use "pip install psycopg2-binary" instead. For details see: <http://initd.org/psycopg/docs/install.html#binary-install-from-pypi>.
  """)
Traceback (most recent call last):
  File "<string>", line 1, in <module>
  File "/opt/ads-agent/ansible/lib/python2.7/site-packages/psycopg2/__init__.py", line 130, in connect
    conn = _connect(dsn, connection_factory=connection_factory, **kwasync)
psycopg2.OperationalError: FATAL:  password authentication failed for user "monitdbadm"

-sh-4.2$
