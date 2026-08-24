ls -l /proc/9952/fd/1
ls -l /proc/9952/fd/2

find /logs/jboss -newer /tmp -iname "*.log" -mmin -10 2>/dev/null -ls
find /opt/jboss-eap -newer /tmp -iname "*.log" -mmin -10 2>/dev/null -ls
