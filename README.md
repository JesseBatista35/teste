grep -i "ecr-web" /var/log/httpd/*error_log* | tail -50

grep -rn "ecr-web" /etc/httpd/conf.d/ /etc/httpd/conf/

/subsystem=modcluster/mod-cluster-config=configuration:enable-context(virtualhost=default-host,context=ecr-web)
