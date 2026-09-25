ps -ef | grep -Ei 'java|node|python|gunicorn|uvicorn|php|docker|containerd' | grep -v grep
systemctl list-units --type=service --state=running | grep -viE 'systemd|dbus|ssh|cron|rsyslog'

sudo grep -alE 'LDAP_URL|STRATEGY' /proc/[0-9]*/environ 2>/dev/null
# para cada PID retornado:
sudo cat /proc/<PID>/environ | tr '\0' '\n' | grep -E '^(STRATEGY|LDAP_URL|LDAP_USER_BASE|LDAP_GROUP_BASE)='

sudo docker ps --format '{{.Names}}\t{{.Image}}'
sudo docker inspect <container> --format '{{range .Config.Env}}{{println .}}{{end}}' \
  | grep -E '^(STRATEGY|LDAP_URL|LDAP_USER_BASE|LDAP_GROUP_BASE)='

  systemctl cat <servico> | grep -E 'Environment|EnvironmentFile'


  sudo grep -rEsn '(STRATEGY|LDAP_URL|LDAP_USER_BASE|LDAP_GROUP_BASE)\s*[=:]' \
  /etc /opt /srv /var/www /app /home 2>/dev/null | grep -v '\.log:'
sudo find / -xdev \( -name '.env' -o -name '*.env' -o -name 'docker-compose*.yml' \) 2>/dev/null
