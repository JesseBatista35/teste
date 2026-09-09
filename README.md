df -h /opt/jboss
mount | grep -E "opt|jboss"
dmesg -T | grep -i -E "error|fail|i/o" | tail -30
cat /var/log/messages | grep -i -E "error|i/o error" | tail -30
