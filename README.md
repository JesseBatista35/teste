curl -s "http://binario.caixa:8081/service/rest/v1/search?repository=yum-internal&q=jdk" | grep -oiE '"name" *: *"[^"]*jdk[^"]*"' | sort -u
curl -s "http://binario.caixa:8081/service/rest/v1/search?repository=yum-sitdf&q=jdk" | grep -oiE '"name" *: *"[^"]*jdk[^"]*"' | sort -u
curl -s "http://binario.caixa:8081/service/rest/v1/search?repository=yum-all&q=java-17" | grep -oiE '"name" *: *"[^"]*java[^"]*"' | sort -u


cat /etc/yum.repos.d/*.repo 2>/dev/null | grep -A2 baseurl
