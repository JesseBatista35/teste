# 1. O nome curto resolve? Para qual IP?
getent hosts crjdeaprlx038
getent hosts crjdeaprlx039
cat /etc/hosts

# 2. A porta 7015 do servidor está acessível?
bash -c 'timeout 5 bash -c "</dev/tcp/crjdeaprlx038/7015" && echo ABERTA || echo FECHADA'
bash -c 'timeout 5 bash -c "</dev/tcp/crjdeaprlx039/7015" && echo ABERTA || echo FECHADA'
