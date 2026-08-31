
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
[root@sspdeaprlx0027 siavl]# df -h /opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl/
Filesystem            Size  Used Avail Use% Mounted on
/dev/mapper/vg_optapache-lv_optapache
                       13G  4.0G  8.1G  33% /opt/apache
[root@sspdeaprlx0027 siavl]# mount | grep -i "conf.d\|nfs\|gpfs"
[root@sspdeaprlx0027 siavl]# puppet agent --test --noop 2>&1 | grep -B 2 -A 10 -i "siavl.conf"
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
