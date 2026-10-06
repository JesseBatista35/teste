grep -o "status code[^<]*\|Error Executing[^<]*" $(ls -t /opt/ctmage/ctm/cm/AI/CustomerLogs/*.xml | head -1) | sort -u

