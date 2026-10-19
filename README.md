# 1. Mesmo curl, mas COM proxy do sistema (sem o --noproxy)
curl.exe -kv -m 15 https://sigpd-backend.esteiras.des.caixa/sigpd-api/v1/health-check/live

# 2. Qual proxy/PAC a estação usa
Get-ItemProperty 'HKCU:\Software\Microsoft\Windows\CurrentVersion\Internet Settings' | Select ProxyEnable,ProxyServer,AutoConfigURL,ProxyOverride

Start-Process msedge "--no-proxy-server --user-data-dir=$env:TEMP\edge-noproxy https://sigpd-backend.esteiras.des.caixa/sigpd-api/v1/health-check/live"
