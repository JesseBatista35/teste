# backup do perfil
sudo cp -p /etc/NetworkManager/system-connections/VMware-customization-ens224.nmconnection \
  /root/VMware-customization-ens224.nmconnection.bkp_$(date +%Y%m%d)

# ver o que tem hoje (gateway/rotas)
sudo nmcli con show "VMware customization ens224" | grep -E 'ipv4\.(method|addresses|gateway|routes)'

# aplicar o novo IP
sudo nmcli con mod "VMware customization ens224" ipv4.method manual ipv4.addresses 10.188.8.190/16

# validar
sudo grep -n -E 'address|gateway|route' /etc/NetworkManager/system-connections/VMware-customization-ens224.nmconnection
sudo grep -rn 192.168.236.173 /etc/NetworkManager/system-connections/    # tem que voltar vazio
