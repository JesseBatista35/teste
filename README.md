# pega o UID do pod (já está no describe que você rodou: 0424ffe0-924f-4481-9244-f23fa1760b6f)
oc debug node/ceadecldlx077.nprd.caixa
chroot /host
cat /var/lib/kubelet/pods/0424ffe0-924f-4481-9244-f23fa1760b6f/volumes/kubernetes.io~empty-dir/secrets/SIGFA_DES/CLISERGFA_SSO_INTRA | xxd | head
