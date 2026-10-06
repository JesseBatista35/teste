ls -lrt /opt/ctmage/ctm/cm/AI/CustomerLogs/ | tail -2
cat $(ls -t /opt/ctmage/ctm/cm/AI/CustomerLogs/*.xml | head -1) | grep -E "<time>|<step>|<success>"


  grep -o "<details>[^<]*RC[^<]*\|Encountered the following error[^<]*" $(ls -t /opt/ctmage/ctm/cm/AI/CustomerLogs/*.xml | head -1)
