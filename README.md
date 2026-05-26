# Quantas máquinas rodam esse sistema?
sudo find /opt/ads-agent/_work -name "inventory" -o -name "hosts" 2>/dev/null | head -5


# Ver se tem variável initial_hosts em algum lugar da esteira
sudo grep -r "initial_hosts" /opt/ads-agent/_work/ 2>/dev/null | head -10
