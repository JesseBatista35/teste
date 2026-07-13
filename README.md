find /opt/jboss/jboss-eap/hc/data/content -iname "*OracleSiouvDS*" -o -iname "*-ds.xml" 2>/dev/null


find /opt/jboss/jboss-eap/hc/tmp/servers/siouv_node1_lx0002/vfs/deployment -iname "*-ds.xml" 2>/dev/null


grep -rl "OracleSiouvDS" /opt/jboss/jboss-eap/hc/data/content 2>/dev/null


grep -rl "OracleSiouvDS" /opt/jboss/jboss-eap/hc/configuration 2>/dev/null


find /opt/jboss/jboss-eap/hc -iname "*.xml" -newer /opt/jboss/jboss-eap/hc/configuration/domain.xml 2>/dev/null
