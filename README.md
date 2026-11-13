   ip -br addr
   ip route get 192.168.224.111
   timeout 5 bash -c '</dev/tcp/192.168.224.111/2049' && echo OK || echo FALHOU

     teste() { timeout 5 bash -c "</dev/tcp/$1/$2" 2>/dev/null && echo "OK      $1:$2" || echo "FALHOU  $1:$2"; }
  getent hosts sspdeaprlx0028 ctm.caixa
  teste sspdeaprlx0028 18007
  teste ctm.caixa 18007

  
