env | grep -i proxy
cat /opt/ads-agent/.env /opt/ads-agent/.proxy /opt/ads-agent/.proxybypass 2>/dev/null
systemctl cat 'vsts.agent*' 2>/dev/null | grep -i -E 'proxy|Environment'

# teste direto
curl -vk https://api.produtos4.caixa:6443/version                 # deve falhar igual (via TMG)
curl -vk --noproxy '*' https://api.produtos4.caixa:6443/version   # se responder, está confirmado
