bash -c 'timeout 5 bash -c "</dev/tcp/10.116.84.154/18007" && echo ABERTA || echo FECHADA'

grep -rniE "crjdeaprlx|7015|7016|ctmshost|controlm|control_m" .
