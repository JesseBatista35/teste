
for ip in 100 101 102 103 104 108 109 111; do
  echo -n "192.168.224.$ip: "
  timeout 3 bash -c "cat < /dev/null > /dev/tcp/192.168.224.$ip/2049" 2>/dev/null && echo "ABERTA" || echo "FECHADA/TIMEOUT"
done
