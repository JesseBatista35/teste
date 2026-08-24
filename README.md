sed -n '14,$p' /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/console-stdout.log > /tmp/dump_completo.txt
wc -l /tmp/dump_completo.txt

grep -n "^\"default task\|BLOCKED\|jcicsdirect\|Infinispan\|SessionCreation\|GlobalTransaction" /tmp/dump_completo.txt
