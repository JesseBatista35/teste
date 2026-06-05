# 1. Ver quais portas estão abertas em ibmaplacs
# (do servidor SIPEN - sbrdeapllx0006)
nmap -p- 10.192.228.146
# Ou testar portas comuns:
for port in 9080 5432 3306 1433 8000 8888 80 443; do 
  echo "Testando porta $port..."
  nc -zv 10.192.228.146 $port
done

# 2. Encontrar logs do SIPEN
find / -name "*sipen*" -o -name "*ibmaplacs*" 2>/dev/null | grep -i log

# 3. Ver configuração da aplicação
find / -name "sipen*" -type f 2>/dev/null | grep -E "(config|properties|xml)"

# 4. Ver processos Java (se SIPEN for Java)
ps aux | grep -i sipen
ps aux | grep -i java
