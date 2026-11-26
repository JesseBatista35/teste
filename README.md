# 1. esta máquina está na mesma rede (10.116.208.0/20)?
ip -br addr

# 2. comparar o MAC do .11 com o MAC do nó (10.116.222.69)
ping -c 2 10.116.223.11
ping -c 2 10.116.222.69
ip neigh show | grep -E '10\.116\.223\.11 |10\.116\.222\.69 |10\.116\.223\.22 '

# 3. arping, se existir (troque eth0 pela interface do passo 1)
IFACE=$(ip -br addr | awk '/10\.116\.(2(0[8-9]|1[0-9]|2[0-3]))\./{print $1; exit}')
echo $IFACE
sudo arping -D -I $IFACE -c 3 10.116.223.11
sudo arping -I $IFACE -c 3 10.116.223.11

# 4. oc mais novo para o debug do nó
ls /usr/local/bin/oc-v4* 2>/dev/null
/usr/local/bin/oc-v4.13 debug node/pixnprd4-x44wk-worker-0-ns57r -- chroot /host ip -br addr | grep -E '10\.116\.223\.(11|22)'
