bash -c 'timeout 5 bash -c "</dev/tcp/10.116.99.99/7015" && echo ABERTA || echo FECHADA'
bash -c 'timeout 5 bash -c "</dev/tcp/10.116.99.100/7015" && echo ABERTA || echo FECHADA'
