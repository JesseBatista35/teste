
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]# puppet config print runinterval
1800
[root@cbrdeapllx010 p585600]# grep -iE 'Mount\[' /opt/puppetlabs/puppet/cache/state/state.yaml | head
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]# puppet agent -t --noop 2>&1 | grep -iE 'fstab|mount|SIGOT|Resources\[mount\]'



JA IFZEMOS O QUE TIHA QUE FZER ENTOA VAMOS FINALIZAR
