echo "=== HOSTNAME ===" && hostname -f && \
echo "=== IPs ===" && ip addr show | grep "inet " | grep -v 127 && \
echo "=== JBOSS ===" && systemctl status jboss && \
echo "=== APACHE ===" && systemctl status apache2 && \
echo "=== PORTAS ===" && netstat -tulpn 2>/dev/null | grep -E ":(80|443|8080)"



nehuma da duas ta abrindo o console:

Couldn't establish a connection to the VM web console.


comssegui entrar pelo moba 



Last login: Wed Jun 17 12:15:35 2026 from 10.122.150.31
[p585600@caddeapllx2520 ~]$
[p585600@caddeapllx2520 ~]$
[p585600@caddeapllx2520 ~]$
[p585600@caddeapllx2520 ~]$
[p585600@caddeapllx2520 ~]$
[p585600@caddeapllx2520 ~]$ echo "=== HOSTNAME ===" && hostname -f && \
echo "=== IPs ===" && ip addr show | grep "inet " | grep -v 127 && \
echo "=== JBOSS ===" && systemctl status jboss && \
echo "=== APACHE ===" && systemctl status apache2 && \
echo "=== PORTAS ===" && netstat -tulpn 2>/dev/null | grep -E ":(80|443|8080)"
=== HOSTNAME ===
caddeapllx2520.agil.nprd.caixa.gov.br
=== IPs ===
    inet 10.116.201.129/19 brd 10.116.223.255 scope global noprefixroute ens192
=== JBOSS ===
Unit jboss.service could not be found.
[p585600@caddeapllx2520 ~]$
[p585600@caddeapllx2520 ~]$
[p585600@caddeapllx2520 ~]$
[p585600@caddeapllx2520 ~]$
