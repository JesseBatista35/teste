PGPASSWORD='<db_password do main.yml>' psql "host=10.244.74.86 port=5432 dbname=monitordb001 user=monitdbadm sslmode=require" -c "select 1"
PGPASSWORD='<db_password do main.yml>' psql "host=10.244.74.86 port=5432 dbname=monitordb001 user=monitdbadm sslmode=disable" -c "select 1"

/opt/ads-agent/ansible/bin/python -c "import psycopg2; psycopg2.connect(host='10.244.74.86', port=5432, dbname='monitordb001', user='monitdbadm', password='<senha>', sslmode='require'); print('OK')"

