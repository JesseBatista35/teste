echo "=== HOSTNAME ===" && hostname -f && \
echo "=== IPs ===" && ip addr show | grep "inet " | grep -v 127 && \
echo "=== JBOSS ===" && systemctl status jboss && \
echo "=== APACHE ===" && systemctl status apache2 && \
echo "=== PORTAS ===" && netstat -tulpn 2>/dev/null | grep -E ":(80|443|8080)"
