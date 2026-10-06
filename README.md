ls -lrt /opt/ctmage/ctm/cm/AI/CustomerLogs/
cat $(ls -t /opt/ctmage/ctm/cm/AI/CustomerLogs/*.xml | head -1) | grep -E "<time>|<step>|<operation>|<success>"
