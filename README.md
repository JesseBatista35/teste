find /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01 -iname "*.log" -newer /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/conf/certs/00360305000104.p12

find /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01 -iname "*.log" 2>/dev/null


sleep 30
tail -150 $(find /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01 -iname "*.log" 2>/dev/null | head -1)
