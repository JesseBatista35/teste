
[root@sspdeaprlx0027 siavl]# puppet resource file /opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl/siavl.conf
file { '/opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl/siavl.conf':
  ensure   => 'file',
  content  => '{sha256}63cab678cfcfa62df6a2bca72187369fdb104d0d3ea7becbdc7403f17a647a91',
  ctime    => '2026-08-31 12:10:56 -0300',
  group    => 0,
  mode     => '0644',
  mtime    => '2026-08-31 12:10:30 -0300',
  owner    => 0,
  provider => 'posix',
  type     => 'file',
}
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]# grep -i "siavl.conf" /var/log/puppetlabs/puppet/agent.log 2>/dev/null | tail -20
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]# puppet agent --disable "Ajuste manual siavl CORS - Jesse - $(date +%Y%m%d)"
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
