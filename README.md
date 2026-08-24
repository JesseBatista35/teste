# 1. Ver se o generator do systemd tem algum ExecStart com offset
cat /run/systemd/generator.late/jboss-eap6-CSD2.service

# 2. Ver o vhost do Apache, que provavelmente faz proxy pra porta HTTP real do CSD2
cat /opt/httpd/conf.d/*csd2* 2>/dev/null | grep -i "proxy\|8080\|880\|900"
ls /opt/httpd/conf.d/ | grep -i csd2

# 3. Conferir o offset de management/http definido no próprio standaloneCSD2.xml (caso hardcoded)
grep -A3 "socket-binding-group" /home/jboss-eap-6.4/standaloneCSD2/configuration/standaloneCSD2.xml | head -10
