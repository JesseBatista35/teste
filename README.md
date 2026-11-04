ip link show                                   # nome da 2ª NIC (ens224?) e estado
nmcli -f NAME,DEVICE,STATE con show
grep -rl 192.168.236.173 /etc/NetworkManager/system-connections/ 2>/dev/null
sudo journalctl -u NetworkManager --since "2026-10-01" | grep -iE 'conflict|duplicate|192.168.236'
