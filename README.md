ip -4 -br addr                           # quais IPs o host tem (procurar 192.168.236.197 / 10.188.x)
ip route get $(getent hosts nfsctcnprd.ctc.caixa | awk '{print $1}')   # IP de origem usado até o storage
showmount -e nfsctcnprd.ctc.caixa | grep -i SIGOT
mkdir -p /SIGOT && mount -t nfs nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIGOT /SIGOT && touch /SIGOT/.teste_wo && rm /SIGOT/.teste_wo


