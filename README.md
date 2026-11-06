# no cbrdeapllx473: pegue o IP de origem
hostname -I

# no caddeapllx2835: deixe rodando
sudo tcpdump -ni any 'tcp and (port 80 or port 443) and host <IP_do_473>'

# no cbrdeapllx473: repita
nc -zv 10.116.202.37 80
nc -zv 10.116.202.37 8080      # se até a 8080 der timeout, é bloqueio/rota geral
