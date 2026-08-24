sed -n '132909,133997p' /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/console-stdout.log > /tmp/dump_recente.txt

grep -n "BLOCKED\|jcicsdirect\|Infinispan\|SessionCreation\|InfinispanLock" /tmp/dump_recente.txt

