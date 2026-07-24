systemctl status connector.service -l --no-pager
journalctl -u connector.service -n 50 --no-pager


sudo /connector/status.sh
