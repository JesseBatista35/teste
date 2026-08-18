
-sh-4.2$
-sh-4.2$
-sh-4.2$ # pega o UID do pod (já está no describe que você rodou: 0424ffe0-924f-4481-9244-f23fa1760b6f)
-sh-4.2$ oc debug node/ceadecldlx077.nprd.caixa
error: cannot debug ceadecldlx077.nprd.caixa: unable to extract pod template from type *v1.Node
-sh-4.2$ chroot /host
chroot: não foi possível mudar o diretório raiz para /host: Arquivo ou diretório não encontrado
-sh-4.2$ cat /var/lib/kubelet/pods/0424ffe0-924f-4481-9244-f23fa1760b6f/volumes/kubernetes.io~empty-dir/secrets/SIGFA_DES/CLISERGFA_SSO_INTRA | xxd | head
cat: /var/lib/kubelet/pods/0424ffe0-924f-4481-9244-f23fa1760b6f/volumes/kubernetes.io~empty-dir/secrets/SIGFA_DES/CLISERGFA_SSO_INTRA: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
