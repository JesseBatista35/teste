grep -o "Error Executing[^<]*" $(ls -t /opt/ctmage/ctm/cm/AI/CustomerLogs/*.xml | head -1) | sort -u

ps -ef | grep -i java | grep -v grep | grep -o "^[^ ]*\|/[^ ]*/bin/java" | sort -u
ps -ef | grep -i java | grep -v grep | grep -oE "trustStore[^ ]*" | sort -u
ls -la /opt/ctmage/ctm/cm/AI/data/security/
find /opt/ctmage -name cacerts -path "*security*" 2>/dev/null

