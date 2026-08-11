echo "Hostname: $(hostname)"
echo "IP interno:"
hostname -I
echo "IP público (se tiver saída internet):"
curl -s ifconfig.me || curl -s ifconfig.co


