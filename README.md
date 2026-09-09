# ver quais outros hosts também montam esse mesmo export (se tiver acesso a mais de um host)
showmount -e 10.116.95.13 2>/dev/null

# no host, ver se dá pra saber IPs conectados ao export (só root do NFS server veria isso de verdade, mas vale tentar)
cat /proc/mounts | grep jboss_modules64
