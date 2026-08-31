puppet resource file /opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl/siavl.conf



grep -i "siavl.conf" /var/log/puppetlabs/puppet/agent.log 2>/dev/null | tail -20


puppet agent --disable "Ajuste manual siavl CORS - Jesse - $(date +%Y%m%d)"

