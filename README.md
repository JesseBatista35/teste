
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]# systemctl is-active puppet; systemctl is-enabled puppet
active
enabled
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]# puppet config print server 2>/dev/null
puppet
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]#
[root@cbrdeapllx010 p585600]# ls -lt /opt/puppetlabs/puppet/cache/state/ 2>/dev/null | head -3   # última execução
total 96
-rw-r----- 1 root root 54255 Set 29 15:12 last_run_report.yaml
-rw-rw---- 1 root root  9690 Set 29 15:12 state.yaml
[root@cbrdeapllx010 p585600]#
