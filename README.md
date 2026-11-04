# É egress IP?
oc get egressip -o wide | grep 192.168.236.173
oc get hostsubnet 2>/dev/null | grep 236.173        # se o cluster for OpenShift SDN

# Está na interface do nó?
oc debug node/ceadecldlx071.nprd.caixa -- chroot /host sh -c \
  'ip -4 addr | grep -B2 236.173; nmcli -f NAME,DEVICE,FILENAME con show; grep -rn 192.168 /etc/NetworkManager/system-connections/'

# A config de rede vem de MachineConfig ou NMState? (se vier, editar no nó é sobrescrito)
oc get nncp 2>/dev/null
oc get mc | grep -iE 'net|nm|ens'
