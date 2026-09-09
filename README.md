systemctl status jboss-eap7_hc.service
journalctl -xe --no-pager | tail -40
systemctl show jboss-eap7_hc -p StartLimitIntervalSec -p StartLimitBurst -p NRestarts
