
-sh-4.2$ oc exec -n openshift-sdn sdn-rprgw -c sdn -- ovs-ofctl -O OpenFlow13 dump-flows br0 table=100
OFPST_FLOW reply (OF1.3) (xid=0x6):
 cookie=0x0, duration=36878604.349s, table=100, n_packets=8222354997, n_bytes=2855552906356, priority=0 actions=goto_table:101
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -n sisam-tqs -o wide
NAME                                     READY     STATUS      RESTARTS   AGE       IP            NODE                       NOMINATED NODE   READINESS GATES
sisam-backend-internet-tqs-19-deploy     0/1       Completed   0          43h       25.1.28.244   ceadecldlx061.nprd.caixa   <none>           <none>
sisam-backend-internet-tqs-19-nc4h5      1/1       Running     0          43h       25.3.31.147   ceadecldlx064.nprd.caixa   <none>           <none>
sisam-backend-tqs-62-skwqm               1/1       Running     0          17d       25.0.32.117   ceadecldlx066.nprd.caixa   <none>           <none>
sisam-bell-tqs-20-deploy                 0/1       Completed   0          15d       25.2.33.53    ceadecldlx068.nprd.caixa   <none>           <none>
sisam-bell-tqs-20-mqdpf                  1/1       Running     0          15d       25.2.26.99    ceadecldlx056.nprd.caixa   <none>           <none>
sisam-frontend-patrocinio-tqs-5-deploy   0/1       Completed   0          42h       25.0.35.30    ceadecldlx070.nprd.caixa   <none>           <none>
sisam-frontend-patrocinio-tqs-6-deploy   0/1       Completed   0          42h       25.0.35.47    ceadecldlx070.nprd.caixa   <none>           <none>
sisam-frontend-patrocinio-tqs-6-j2kjn    2/2       Running     0          42h       25.1.10.2     ceadecldlx028.nprd.caixa   <none>           <none>
sisam-frontend-tqs-26-b7mqf              2/2       Running     0          66d       25.0.37.253   ceadecldlx076.nprd.caixa   <none>           <none>
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc run teste-egress -n sihdg-tqs --rm -it --restart=Never --image=<imagem-com-bash-disponivel> \
>   --overrides='{"spec":{"nodeName":"ceadecldlx077.nprd.caixa"}}' -- bash
-sh: imagem-com-bash-disponivel: Arquivo ou diretório não encontrado
-sh-4.2$
