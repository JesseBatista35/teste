sudo systemctl stop sirpl.service
sudo systemctl disable sirpl.service
systemctl status sirpl.service
ps -ef | grep sirpl


sudo systemctl disable sirpldb.service


sudo rm /etc/systemd/system/multi-user.target.wants/sirpldb.service

sudo mv /opt/open/nodejs/sirpl /opt/open/nodejs/sirpl.desmobilizado_20260616

sudo systemctl list-units --all | grep -i sirpl
ps -ef | grep -i node

