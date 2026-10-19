# 1. Porta da VIP alcançável?
Test-NetConnection sigpd-backend.esteiras.des.caixa -Port 443
Test-NetConnection sigpd-backend.esteiras.des.caixa -Port 80

# 2. Direto, sem proxy
curl.exe -kv --noproxy "*" -m 15 https://sigpd-backend.esteiras.des.caixa/sigpd-api/v1/health-check/live

# 3. Caminho até a VIP
tracert -d -h 15 10.116.180.22
