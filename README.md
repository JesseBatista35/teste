echo "===== HOST ====="; hostname -f
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
