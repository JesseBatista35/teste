for N in ns57r gp64t lbxr9 rjg8j; do
/usr/local/bin/oc-v4.13 debug node/pixnprd4-x44wk-worker-0-$N -- chroot /host bash -c '
echo "===== '$N': EgressIP / mark / classe Illumio ====="
iptables -t nat -S OPENSHIFT-MASQUERADE | while read -r l; do
  m=$(echo "$l" | sed -n "s/.*--mark \([^ ]*\).*/\1/p")
  ip=$(echo "$l" | sed -n "s/.*--to-source \([^ ]*\).*/\1/p")
  [ -n "$m" ] && printf "%-15s %-12s classe=0x%x\n" "$ip" "$m" $(( m & 0x70 ))
done' 2>/dev/null | grep -E "=====|classe"
done

echo "===== CADEIAS ILLUMIO EM OUTRAS TABELAS (ns57r) ====="
/usr/local/bin/oc-v4.13 debug node/pixnprd4-x44wk-worker-0-ns57r -- chroot /host bash -c '
for t in raw mangle nat filter; do echo "--- $t ---"; iptables-save -c -t $t | grep -E "^\[.*ILO|^-A (PREROUTING|OUTPUT|POSTROUTING|INPUT).*ILO" | head -15; done' 2>/dev/null
