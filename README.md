systemctl is-active puppet; systemctl is-enabled puppet
puppet config print server 2>/dev/null
ls -lt /opt/puppetlabs/puppet/cache/state/ 2>/dev/null | head -3   # última execução
