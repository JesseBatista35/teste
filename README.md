curl -v telnet://10.216.80.110:448 2>&1 | head -5

timeout 5 bash -c "echo > /dev/tcp/10.216.80.110/448" && echo "CONECTOU" || echo "FALHOU"
