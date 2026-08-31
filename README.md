
[root@sspdeaprlx0027 siavl]# cp backup/siavl.conf.$(date +%Y%m%d).WO0000081522583 siavl.conf
cp: overwrite `siavl.conf'? yes
[root@sspdeaprlx0027 siavl]# grep -n "Location /siavl-web" siavl.conf
70:    <Location /siavl-web>
[root@sspdeaprlx0027 siavl]#
