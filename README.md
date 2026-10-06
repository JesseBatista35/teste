ls -lrt /opt/ctmage/ctm/cm/AI/CustomerLogs/ | tail -1
cat $(ls -t /opt/ctmage/ctm/cm/AI/CustomerLogs/*.xml | head -1) | grep -E "<time>|<step>|<success>"
