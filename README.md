oc rsh -c sihdg-jboss8-tqs sihdg-jboss8-tqs-28-q6ngx
exec 3<>/dev/tcp/10.116.29.23/1433; date -u '+%H:%M:%S UTC'; sleep 120; exec 3>&-
