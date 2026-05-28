sudo find /etc/systemd /usr/lib/systemd -name "*jboss*" -o -name "*sicmu*" 2>/dev/null
bashcat /proc/$(pgrep -f standalone.sh)/cmdline | tr '\0' ' ' | head -c 200



bashsudo systemctl restart $(sudo systemctl list-units | grep jboss | awk '{print $1}')
