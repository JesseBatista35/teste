sudo nmcli -f NAME,DEVICE,STATE,FILENAME con show
sudo grep -rn 192.168 /etc/NetworkManager/system-connections/ /etc/sysconfig/network-scripts/ 2>/dev/null
