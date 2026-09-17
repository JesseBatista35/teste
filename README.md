
-sh-4.2$ oc get pods -o wide
NAME                           READY     STATUS      RESTARTS   AGE       IP            NODE                       NOMINATED NODE   READINESS GATES
simcn-backend-des-250-deploy   0/1       Completed   0          25h       25.0.42.238   ceadecldlx080.nprd.caixa   <none>           <none>
simcn-backend-des-250-wfg6x    1/1       Running     0          25h       25.0.20.15    ceadecldlx044.nprd.caixa   <none>           <none>
simcn-frontend-des-57-t7jb2    2/2       Running     0          47h       25.0.23.27    ceadecldlx047.nprd.caixa   <none>           <none>
-sh-4.2$ oc get pods --all-namespaces -o wide | grep 10.116.208.100
filebeat                                           filebeat-novo-wrgbp                                               1/1       Running             0                  12d       10.116.208.100   ceadecldlx080.nprd.caixa   <none>           <none>
illumio-system                                     illumio-ven-s5k2m                                                 0/1       ContainerCreating   0                  4h7m      10.116.208.100   ceadecldlx080.nprd.caixa   <none>           <none>
openshift-cluster-node-tuning-operator             tuned-dc9jr                                                       1/1       Running             4                  458d      10.116.208.100   ceadecldlx080.nprd.caixa   <none>           <none>
openshift-debug-m7p7j                              ceadecldlx080.nprd.caixa-debug                                    0/1       Completed           0                  336d      10.116.208.100   ceadecldlx080.nprd.caixa   <none>           <none>
openshift-dns                                      node-resolver-n5mkv                                               1/1       Running             0                  405d      10.116.208.100   ceadecldlx080.nprd.caixa   <none>           <none>
openshift-image-registry                           node-ca-8gnnm                                                     1/1       Running             0                  402d      10.116.208.100   ceadecldlx080.nprd.caixa   <none>           <none>
openshift-machine-config-operator                  machine-config-daemon-9clnw                                       2/2       Running             7                  458d      10.116.208.100   ceadecldlx080.nprd.caixa   <none>           <none>
openshift-monitoring                               node-exporter-jgnxk                                               2/2       Running             7                  458d      10.116.208.100   ceadecldlx080.nprd.caixa   <none>           <none>
openshift-multus                                   multus-8f2sp                                                      1/1       Running             4                  458d      10.116.208.100   ceadecldlx080.nprd.caixa   <none>           <none>
openshift-multus                                   multus-additional-cni-plugins-5wrt7                               1/1       Running             4                  458d      10.116.208.100   ceadecldlx080.nprd.caixa   <none>           <none>
openshift-sdn                                      sdn-lfhrq                                                         2/2       Running             0                  405d      10.116.208.100   ceadecldlx080.nprd.caixa   <none>           <none>
rook-ceph                                          csi-cephfsplugin-cqn5r                                            2/2       Running             13 (439d ago)      458d      10.116.208.100   ceadecldlx080.nprd.caixa   <none>           <none>
rook-ceph                                          csi-rbdplugin-b2ph7                                               2/2       Running             13 (439d ago)      458d      10.116.208.100   ceadecldlx080.nprd.caixa   <none>           <none>
-sh-4.2$
