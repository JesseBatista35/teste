find /opt/batch -type f \( -name "*.sh" -o -name "*.yml" -o -name "*.properties" \) 2>/dev/null
grep -rl "java" /opt/batch 2>/dev/null | head -20
crontab -l 2>/dev/null


curl -s "http://binario.caixa:8081/service/rest/v1/search?q=jdk-17" | head -c 2000
curl -s -o /dev/null -w "%{http_code}\n" http://binario.caixa:8081

