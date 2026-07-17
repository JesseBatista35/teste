
-sh-4.2$ oc run nfs-test -n sifof-tqs --image=default-route-openshift-image-registry.apps.produtos4.caixa/openshift/ubi:9.3-1552 --rm -it --restart=Never -- bash
If you don't see a command prompt, try pressing enter.
[root@nfs-test /]# nc -zv nfsctcnprd.ctc.caixa 2049
bash: nc: command not found
[root@nfs-test /]# getent hosts nfsctcnprd.ctc.caixa
192.168.224.108 nfsctcnprd.ctc.caixa
[root@nfs-test /]#
[root@nfs-test /]#
[root@nfs-test /]# ping -C 4 nfsctcnprd.ctc.caixa
^C
[root@nfs-test /]# ping -c 4 nfsctcnprd.ctc.caixa
bash: ping: command not found
[root@nfs-test /]#
[root@nfs-test /]#
[root@nfs-test /]#
