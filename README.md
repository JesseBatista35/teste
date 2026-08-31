df -h /opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl/
mount | grep -i "conf.d\|nfs\|gpfs"



puppet agent --test --noop 2>&1 | grep -B 2 -A 10 -i "siavl.conf"
