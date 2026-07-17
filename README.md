[root@nfs-test /]# for ip in 100 101 102 103 104 108 109 111; do
  echo -n "192.168.224.$ip: "
  timeout 3 bash -c "cat < /dev/null > /dev/tcp/192.168.224.$ip/2049" 2>/dev/null && echo "ABERTA" || echo "FECHADA/TIMEOUT"
done
192.168.224.100:
FECHADA/TIMEOUT
192.168.224.101:
FECHADA/TIMEOUT
192.168.224.102:
FECHADA/TIMEOUT
192.168.224.103:

FECHADA/TIMEOUT
192.168.224.104:
FECHADA/TIMEOUT
192.168.224.108:
FECHADA/TIMEOUT
192.168.224.109:
FECHADA/TIMEOUT
192.168.224.111:
FECHADA/TIMEOUT
[root@nfs-test /]#
[root@nfs-test /]#
[root@nfs-test /]#
[root@nfs-test /]#
[root@nfs-test /]#
[root@nfs-test /]#
[root@nfs-test /]#
[root@nfs-test /]#
[root@nfs-test /]#
[root@nfs-test /]#
