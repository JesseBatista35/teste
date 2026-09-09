cat /etc/systemd/system/jboss-eap7_hc.service | grep -i limit
systemctl show jboss-eap7_hc -p LimitNPROC -p LimitNOFILE
cat /etc/systemd/system.conf | grep -i DefaultLimit
