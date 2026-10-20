ps -ef | grep [j]ava | tr ' ' '\n' | grep -E "^-Xm[sx]|MetaspaceSize|MaxMetaspaceSize"

grep -E "Xms|Xmx|Metaspace" /opt/jboss*/bin/standalone.conf /opt/*/bin/standalone.conf 2>/dev/null

grep -nE "JVM_HEAP|JVM_METASPACE" jboss/standalone.conf

