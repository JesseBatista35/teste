-sh-4.2$
-sh-4.2$ for N in ns57r gp64t lbxr9 rjg8j; do
> /usr/local/bin/oc-v4.13 debug node/pixnprd4-x44wk-worker-0-$N -- chroot /host bash -c '
> echo "===== '$N': EgressIP / mark / classe Illumio ====="
> iptables -t nat -S OPENSHIFT-MASQUERADE | while read -r l; do
>   m=$(echo "$l" | sed -n "s/.*--mark \([^ ]*\).*/\1/p")
>   ip=$(echo "$l" | sed -n "s/.*--to-source \([^ ]*\).*/\1/p")
>   [ -n "$m" ] && printf "%-15s %-12s classe=0x%x\n" "$ip" "$m" $(( m & 0x70 ))
> done' 2>/dev/null | grep -E "=====|classe"
> done
===== ns57r: EgressIP / mark / classe Illumio =====
                0x108c32b0   classe=0x30
10.116.223.13   0x108c32b0   classe=0x30
                0x1b96e0e    classe=0x0
10.116.223.9    0x1b96e0e    classe=0x0
                0x11bc4032   classe=0x30
10.116.223.20   0x11bc4032   classe=0x30
                0x10f709f8   classe=0x70
10.116.223.18   0x10f709f8   classe=0x70
                0x117e6d1a   classe=0x10
10.116.223.22   0x117e6d1a   classe=0x10
                0x1/0x1      classe=0x0
===== gp64t: EgressIP / mark / classe Illumio =====
                0xbc701a     classe=0x10
10.116.223.17   0xbc701a     classe=0x10
                0x117000f2   classe=0x70
10.116.223.12   0x117000f2   classe=0x70
                0x105d7d02   classe=0x0
10.116.223.14   0x105d7d02   classe=0x0
                0x1332da8    classe=0x20
10.116.223.4    0x1332da8    classe=0x20
                0x19b41f6    classe=0x70
10.116.223.5    0x19b41f6    classe=0x70
                0x10402fa0   classe=0x20
10.116.223.24   0x10402fa0   classe=0x20
                0x1/0x1      classe=0x0
===== lbxr9: EgressIP / mark / classe Illumio =====
                0x15e5f48    classe=0x40
10.116.223.11   0x15e5f48    classe=0x40
                0x10519c8    classe=0x40
10.116.223.16   0x10519c8    classe=0x40
                0x10322f38   classe=0x30
10.116.223.10   0x10322f38   classe=0x30
                0x10186b66   classe=0x60
10.116.223.19   0x10186b66   classe=0x60
                0x70057e     classe=0x70
10.116.223.21   0x70057e     classe=0x70
                0x7d4282     classe=0x0
10.116.223.15   0x7d4282     classe=0x0
                0x1/0x1      classe=0x0
===== rjg8j: EgressIP / mark / classe Illumio =====
                0x1f529e2    classe=0x60
10.116.223.26   0x1f529e2    classe=0x60
                0x10c3659a   classe=0x10
10.116.223.25   0x10c3659a   classe=0x10
                0x11ad2b5a   classe=0x50
10.116.223.6    0x11ad2b5a   classe=0x50
                0x14b6174    classe=0x70
10.116.223.23   0x14b6174    classe=0x70
                0x1/0x1      classe=0x0
-sh-4.2$
-sh-4.2$ echo "===== CADEIAS ILLUMIO EM OUTRAS TABELAS (ns57r) ====="
===== CADEIAS ILLUMIO EM OUTRAS TABELAS (ns57r) =====
-sh-4.2$ /usr/local/bin/oc-v4.13 debug node/pixnprd4-x44wk-worker-0-ns57r -- chroot /host bash -c '
> for t in raw mangle nat filter; do echo "--- $t ---"; iptables-save -c -t $t | grep -E "^\[.*ILO|^-A (PREROUTING|OUTPUT|POSTROUTING|INPUT).*ILO" | head -15; done' 2>/dev/null
--- raw ---
# Warning: iptables-legacy tables present, use iptables-legacy-save to see them
[284726619:1209832425089] -A PREROUTING -j ILO-RAW-PREROUTING
[182510416:3238766513723] -A OUTPUT -j ILO-RAW-OUTPUT
[46613502:1331569229721] -A ILO-RAW-OUTPUT -p tcp -g ILO-RAW-OUTPUT-TCP
[135892204:1907196720491] -A ILO-RAW-OUTPUT -p udp -g ILO-RAW-OUTPUT-UDP
[4710:563511] -A ILO-RAW-OUTPUT -p icmp -g ILO-RAW-OUTPUT-ICMP
[0:0] -A ILO-RAW-OUTPUT -g ILO-RAW-OUTPUT-OTHER
[4710:563511] -A ILO-RAW-OUTPUT-ICMP -p icmp -g ILO-RAW-OUTPUT-OTHER
[46613502:1331569229721] -A ILO-RAW-OUTPUT-TCP -g ILO-RAW-OUTPUT-OTHER
[135892204:1907196720491] -A ILO-RAW-OUTPUT-UDP -p udp -g ILO-RAW-OUTPUT-OTHER
[89717375:137716098164] -A ILO-RAW-PREROUTING -p tcp -g ILO-RAW-PREROUTING-TCP
[194848405:1072106278180] -A ILO-RAW-PREROUTING -p udp -g ILO-RAW-PREROUTING-UDP
[9978:4014305] -A ILO-RAW-PREROUTING -p icmp -g ILO-RAW-PREROUTING-ICMP
[150861:6034440] -A ILO-RAW-PREROUTING -g ILO-RAW-PREROUTING-OTHER
[9978:4014305] -A ILO-RAW-PREROUTING-ICMP -g ILO-RAW-PREROUTING-OTHER
[89717375:137716098164] -A ILO-RAW-PREROUTING-TCP -g ILO-RAW-PREROUTING-OTHER
--- mangle ---
# Warning: iptables-legacy tables present, use iptables-legacy-save to see them
[284726780:1209833332935] -A PREROUTING -j ILO-MANGLE-PREROUTING
[223804837:1086780544771] -A INPUT -j ILO-MANGLE-INPUT
[60804420:123041434188] -A FORWARD -j ILO-MANGLE-FORWARD
[182510547:3238767291314] -A OUTPUT -j ILO-MANGLE-OUTPUT
[231909567:3361123732096] -A POSTROUTING -j ILO-MANGLE-POSTROUTING
[60804420:123041434188] -A ILO-MANGLE-FORWARD -g ILO-MANGLE-FORWARD-USR
[223804837:1086780544771] -A ILO-MANGLE-INPUT -j MARK --set-xmark 0x0/0x70
[223804837:1086780544771] -A ILO-MANGLE-INPUT -g ILO-MANGLE-INPUT-USR
[1961983:115564915] -A ILO-MANGLE-NODEPORT -g ILO-MANGLE-NP-ENFORCE
[0:0] -A ILO-MANGLE-NP-ACCEPT -j MARK --set-xmark 0x10/0x70
[0:0] -A ILO-MANGLE-NP-ACCEPT -j RETURN
[1961983:115564915] -A ILO-MANGLE-NP-ENFORCE -j MARK --set-xmark 0x60/0x70
[1961983:115564915] -A ILO-MANGLE-NP-ENFORCE -j RETURN
[0:0] -A ILO-MANGLE-NP-INP-ND-REJECT -j MARK --set-xmark 0x30/0x70
[0:0] -A ILO-MANGLE-NP-INP-ND-REJECT -j RETURN
--- nat ---
# Warning: iptables-legacy tables present, use iptables-legacy-save to see them
[15547607:1099057619] -A PREROUTING -j ILO-NAT-PREROUTING
[1591794:154061857] -A INPUT -j ILO-NAT-INPUT
[1581601:95855251] -A OUTPUT -j ILO-NAT-OUTPUT
[4025901:345855669] -A POSTROUTING -j ILO-NAT-POSTROUTING
[1591794:154061857] -A ILO-NAT-INPUT -g ILO-NAT-INPUT-USR
[1581601:95855251] -A ILO-NAT-OUTPUT -g ILO-NAT-OUTPUT-USR
[4025901:345855669] -A ILO-NAT-POSTROUTING -g ILO-NAT-POSTROUTING-USR
[15547607:1099057619] -A ILO-NAT-PREROUTING -g ILO-NAT-PREROUTING-USR
--- filter ---
[223804956:1086780588670] -A INPUT -j ILO-FILTER-INPUT
[60804471:123043306000] -A FORWARD -j ILO-FILTER-FORWARD
[182509934:3238769583905] -A OUTPUT -j ILO-FILTER-OUTPUT
[93595:10379670] -A ILO-FILTER-ACCEPT -j NFLOG --nflog-prefix "ilo 0x1020803 d2079ab7-5ab5-4d71-bcfe-e548dcef0ce2" --nflog-threshold 1
[93595:10379670] -A ILO-FILTER-ACCEPT -j RETURN
[1828352:95074875] -A ILO-FILTER-CONNTRACK -p tcp -m tcp --tcp-flags FIN,SYN,RST FIN -m conntrack --ctstate RELATED,ESTABLISHED -j NFLOG --nflog-prefix "ilo 0x1020c02 d2079ab7-5ab5-4d71-bcfe-e548dcef0ce2" --nflog-threshold 1
[946328:56775280] -A ILO-FILTER-CONNTRACK -p tcp -m tcp --tcp-flags FIN,SYN,RST SYN -m conntrack --ctstate RELATED,ESTABLISHED -j NFLOG --nflog-prefix "ilo 0x1020d02 d2079ab7-5ab5-4d71-bcfe-e548dcef0ce2" --nflog-threshold 1
[1356833:54287384] -A ILO-FILTER-CONNTRACK -p tcp -m tcp --tcp-flags FIN,SYN,RST RST -m conntrack --ctstate RELATED,ESTABLISHED -j NFLOG --nflog-prefix "ilo 0x1020e02 d2079ab7-5ab5-4d71-bcfe-e548dcef0ce2" --nflog-threshold 1
[81798336:1341976502762] -A ILO-FILTER-CONNTRACK -j RETURN
[0:0] -A ILO-FILTER-DROP -m conntrack --ctstate NEW -j NFLOG --nflog-prefix "ilo 0x1020009 d2079ab7-5ab5-4d71-bcfe-e548dcef0ce2" --nflog-threshold 1
[0:0] -A ILO-FILTER-DROP -m conntrack --ctstate NEW -j DROP
[0:0] -A ILO-FILTER-DROP -m conntrack --ctstate INVALID -j NFLOG --nflog-prefix "ilo 0x1020129 d2079ab7-5ab5-4d71-bcfe-e548dcef0ce2" --nflog-threshold 1
[0:0] -A ILO-FILTER-DROP -m conntrack --ctstate INVALID -j DROP
[0:0] -A ILO-FILTER-DROP -m conntrack --ctstate ESTABLISHED -j NFLOG --nflog-prefix "ilo 0x1020209 d2079ab7-5ab5-4d71-bcfe-e548dcef0ce2" --nflog-threshold 1
[0:0] -A ILO-FILTER-DROP -m conntrack --ctstate ESTABLISHED -j DROP
# Warning: iptables-legacy tables present, use iptables-legacy-save to see them
-sh-4.2$
