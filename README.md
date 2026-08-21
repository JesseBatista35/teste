# 1. Achar o serviço
systemctl list-units --type=service | grep -iE "jboss|wildfly|siccp|sig"

# 2. Se não achar nada rodando, procurar unit files instalados (mesmo parados)
systemctl list-unit-files | grep -iE "jboss|wildfly|siccp|sig"

# 3. Também vale procurar processo batch/cron, já que não tem java rodando agora
crontab -l -u root 2>/dev/null
crontab -l 2>/dev/null
ls -la /etc/cron.d/ | grep -iE "sig|siccp"
