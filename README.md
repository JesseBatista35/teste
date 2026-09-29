puppet config print runinterval
grep -iE 'Mount\[' /opt/puppetlabs/puppet/cache/state/state.yaml | head


puppet agent -t --noop 2>&1 | grep -iE 'fstab|mount|SIGOT|Resources\[mount\]'

