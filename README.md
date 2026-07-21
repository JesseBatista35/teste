curl -s "http://binario.caixa:8081/service/rest/v1/search?repository=raw" -o /tmp/raw.json
grep -oiE "jdk[^\"]*|temurin[^\"]*" /tmp/raw.json | sort -u


curl -s "http://binario.caixa:8081/service/rest/v1/repositories" | grep -oE '"name" *: *"[^"]*"'


find / -iname "*.jsl" -o -iname "*.ctm" 2>/dev/null | grep -v proc
find / -path "*controlm*" -iname "*.sh" 2>/dev/null
systemctl cat controlm_agent.service 2>/dev/null | grep -i exec
