[p585600@caddeapllx2876 ~]$
[p585600@caddeapllx2876 ~]$ echo "===== HOST ====="; hostname -f
echo; echo "===== INTERFACES / IPs ====="; ip -br addr
echo; echo "===== ROTAS ====="; ip route

NFS_IP=$(getent hosts nfsctcnprd.ctc.caixa | awk '{print $1}' | head -1)
echo; echo "===== NFS: nfsctcnprd.ctc.caixa -> ${NFS_IP:-NAO RESOLVEU} ====="
[ -n "$NFS_IP" ] && ip route get "$NFS_IP"

teste() { timeout 5 bash -c "</dev/tcp/$1/$2" 2>/dev/null && echo "OK      $1:$2" || echo "FALHOU  $1:$2"; }

echo; echo "===== PORTAS ====="
teste nfsctcnprd.ctc.caixa 2049
teste nfsctcnprd.ctc.caixa 111
teste crjtqaprlx006 18007
teste crjtqaprlx007 18007
teste sicsn.caixa 443
teste binario.caixa 8081

echo; echo "===== EXPORTS VISIVEIS ====="
showmount -e nfsctcnprd.ctc.caixa 2>&1 | head -20

echo; echo "===== MONTAGENS ATUAIS ====="
mount | grep -i nfs || echo "nenhum NFS montado"
===== HOST =====
caddeapllx2876.agil.nprd.caixa.gov.br

===== INTERFACES / IPs =====
lo               UNKNOWN        127.0.0.1/8 ::1/128
ens192           UP             10.116.202.64/19 fe80::250:56ff:fe82:c644/64

===== ROTAS =====
default via 10.116.192.1 dev ens192 proto static metric 100
10.116.192.0/19 dev ens192 proto kernel scope link src 10.116.202.64 metric 100

===== NFS: nfsctcnprd.ctc.caixa -> 192.168.224.111 =====
192.168.224.111 via 10.116.192.1 dev ens192 src 10.116.202.64 uid 10585600
    cache

===== PORTAS =====

FALHOU  nfsctcnprd.ctc.caixa:2049
FALHOU  nfsctcnprd.ctc.caixa:111
FALHOU  crjtqaprlx006:18007
FALHOU  crjtqaprlx007:18007
FALHOU  sicsn.caixa:443
OK      binario.caixa:8081

===== EXPORTS VISIVEIS =====

