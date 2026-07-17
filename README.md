oc run nfs-test -n sifof-tqs --image=default-route-openshift-image-registry.apps.produtos4.caixa/openshift/ubi:9.3-1552 --rm -it --restart=Never -- bash


nc -zv nfsctcnprd.ctc.caixa 2049


getent hosts nfsctcnprd.ctc.caixa
ping -c 4 nfsctcnprd.ctc.caixa
