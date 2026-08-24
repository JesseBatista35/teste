grep -i "GMS\|new view\|joined\|left\|suspected\|JGRP0" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | tail -30

grep -i "ISPN0000\|topology\|rebalance\|cluster" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | tail -30

grep "ISPN000299" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | awk '{print $1, $2}' | sort | uniq -c | tail -30

