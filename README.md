timeout 15 showmount -e nfsctcnprd.ctc.caixa | grep -i SIGOT
mkdir -p /SIGOT && timeout 30 mount -t nfs nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIGOT /SIGOT; echo rc=$?
