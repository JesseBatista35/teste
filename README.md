CON=$(nmcli -g NAME,DEVICE con show | awk -F: '$2=="ens224"{print $1}'); echo "$CON"
sudo nmcli con mod "$CON" ipv4.method manual ipv4.addresses 192.168.243.7/19 ipv4.gateway "" ipv4.never-default yes
sudo nmcli con up "$CON"

ip -br addr show ens224
ip route get 192.168.224.102
timeout 5 bash -c '</dev/tcp/nfsctcnprd.ctc.caixa/2049' && echo "2049 OK"
