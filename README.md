curl -s "http://binario.caixa:8081/service/rest/v1/search?repository=raw" | grep -i "jdk\|temurin" -A3
curl -s "http://binario.caixa:8081/service/rest/v1/repositories" | python3 -m json.tool 2>/dev/null | grep -B2 -i "raw\|jdk"


find / -iname "*.jsl" -o -iname "*controlm*" 2>/dev/null | grep -v proc
grep -r "sirsa" /etc/profile.d/ 2>/dev/null
env | grep -i java
cat /etc/profile.d/*.sh 2>/dev/null | grep -i java


