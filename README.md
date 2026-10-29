
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh sibec-arquivos-des-209-r7dn8 sh -c 'id; ls -ln /sibec/Folha | head -5; ls -ln /sibec/BECD.E2.BOD1.F03.C2505.P1466.ABR.C.TXT; du -sh /sibec /sibec3; find /sibec -type f | wc -l; find /sibec3 -type f | wc -l'
error: Internal error occurred: error executing command in container: container is not created or running
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh sibec-arquivos-des-209-r7dn8 sh -c 'id; ls -ln /sibec/Folha | head -5; ls -ln /sibec/BECD.E2.BOD1.F03.C2505.P1466.ABR.C.TXT; du -sh /sibec /sibec3; find /sibec -type f | wc -l; find /sibec3 -type f | wc -l'
Error from server (NotFound): pods "sibec-arquivos-des-209-r7dn8" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -n sibec-des | grep arquivos
sibec-arquivos-des-209-deploy            0/1       Completed   0               32m
sibec-arquivos-des-210-deploy            0/1       Completed   0               105s
sibec-arquivos-des-210-hkjgk             1/1       Running     0               102s
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc sibec-arquivos-des -n sibec-des -o jsonpath='{.status.latestVersion}{"\n"}{range .spec.template.spec.containers[*].volumeMounts[*]}{.name}{" -> "}{.mountPath}{"\n"}{end}'
210
secrets -> /usr/src/app/secrets_files
sibec-arquivos-nfs-data-des -> /sibec
sibec-arquivos-data-des -> /sibec3
caixa-truststore-acteste-nprd -> /deployments/caixa-truststore-acteste-nprd.jks
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get events -n sibec-des --sort-by=.metadata.creationTimestamp | tail -8
1m          1m           1         sibec-arquivos-des-210-hkjgk.18e311cf173e3a5d             Pod                     spec.containers{sibec-arquivos-des}                     Normal    Pulling                       kubelet, ceadecldlx037.nprd.caixa   Pulling image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sibec-arquivos:1.6.9.5"
1m          1m           1         sibec-arquivos-des-210-hkjgk.18e311cee9c9a769             Pod                     spec.initContainers{secrets-check}                      Normal    Created                       kubelet, ceadecldlx037.nprd.caixa   Created container secrets-check
1m          1m           1         sibec-arquivos-des-210-hkjgk.18e311d06dbe1db4             Pod                     spec.containers{sibec-arquivos-des}                     Normal    Created                       kubelet, ceadecldlx037.nprd.caixa   Created container sibec-arquivos-des
1m          1m           1         sibec-arquivos-des-210-hkjgk.18e311d06f4675ed             Pod                     spec.containers{sibec-arquivos-des}                     Normal    Started                       kubelet, ceadecldlx037.nprd.caixa   Started container sibec-arquivos-des
1m          1m           1         sibec-arquivos-des-210-hkjgk.18e311d061ec90d2             Pod                     spec.containers{sibec-arquivos-des}                     Normal    Pulled                        kubelet, ceadecldlx037.nprd.caixa   Successfully pulled image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sibec-arquivos:1.6.9.5" in 5.547877092s (5.547888464s including waiting)
1m          1m           2         sibec-arquivos-des-210-hkjgk.18e311d0ba63de6f             Pod                     spec.containers{sibec-arquivos-des}                     Warning   Unhealthy                     kubelet, ceadecldlx037.nprd.caixa   Readiness probe failed: Get "http://25.1.16.64:8080/ready": dial tcp 25.1.16.64:8080: connect: connection refused
1m          1m           1         sibec-arquivos-des-209-r7dn8.18e311d2e8060195             Pod                     spec.containers{sibec-arquivos-des}                     Normal    Killing                       kubelet, ceadecldlx048.nprd.caixa   Stopping container sibec-arquivos-des
1m          1m           1         sibec-arquivos-des-209.18e311d2e79b45e0                   ReplicationController                                                           Normal    SuccessfulDelete              replication-controller              Deleted pod: sibec-arquivos-des-209-r7dn8
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods
NAME                                     READY     STATUS      RESTARTS        AGE
sibec-api-consulta-des-147-deploy        0/1       Completed   0               3d3h
sibec-api-consulta-des-147-f9x68         1/1       Running     0               3d3h
sibec-api-faturamento-des-24-deploy      0/1       Completed   0               419d
sibec-api-faturamento-des-25-8j4wb       1/1       Running     17 (294d ago)   317d
sibec-api-faturamento-des-25-deploy      0/1       Completed   0               418d
sibec-api-manutencao-des-58-deploy       0/1       Completed   0               14d
sibec-api-manutencao-des-59-785t6        1/1       Running     0               6d2h
sibec-api-manutencao-des-59-deploy       0/1       Completed   0               13d
sibec-arquivos-des-209-deploy            0/1       Completed   0               32m
sibec-arquivos-des-210-deploy            0/1       Completed   0               2m14s
sibec-arquivos-des-210-hkjgk             1/1       Running     0               2m11s
sibec-dados-familia-des-226-deploy       0/1       Completed   0               3d1h
sibec-dados-familia-des-227-deploy       0/1       Completed   0               2d5h
sibec-dados-familia-des-227-fm44t        1/1       Running     0               2d5h
sibec-des-35-deploy                      0/1       Completed   0               367d
sibec-des-36-5jbrv                       1/1       Running     0               367d
sibec-des-36-deploy                      0/1       Completed   0               367d
sibec-estatico-des-1028-deploy           0/1       Completed   0               21h
sibec-estatico-des-1029-9594d            2/2       Running     1 (172m ago)    173m
sibec-estatico-des-1029-deploy           0/1       Completed   0               173m
sibec-estatico-internet-des-964-deploy   0/1       Completed   0               21h
sibec-estatico-internet-des-965-deploy   0/1       Completed   0               174m
sibec-estatico-internet-des-965-sphzf    2/2       Running     1 (174m ago)    174m
sibec-gestao-des-72-deploy               0/1       Completed   0               20d
sibec-gestao-des-73-deploy               0/1       Completed   0               13d
sibec-gestao-des-73-hxrz7                1/1       Running     0               13d
sibec-internet-des-33-deploy             0/1       Completed   0               384d
sibec-internet-des-34-deploy             0/1       Completed   0               367d
sibec-internet-des-34-r9l72              1/1       Running     1 (177d ago)    367d
sibec-manutencao-des-31-deploy           0/1       Completed   0               19d
sibec-manutencao-des-32-9bcvb            1/1       Running     0               13d
sibec-manutencao-des-32-deploy           0/1       Completed   0               13d
sibec-micro-des-81-deploy                0/1       Completed   0               16d
sibec-micro-des-82-deploy                0/1       Completed   0               13d
sibec-micro-des-82-gd7gx                 1/1       Running     0               13d
sibec-parametrizacao-des-235-deploy      0/1       Completed   0               28h
sibec-parametrizacao-des-236-deploy      0/1       Completed   0               27h
sibec-parametrizacao-des-236-wz48l       1/1       Running     0               27h
sibec-relatorios-des-37-deploy           0/1       Completed   0               19d
sibec-relatorios-des-38-deploy           0/1       Completed   0               13d
sibec-relatorios-des-38-rm47r            1/1       Running     0               13d
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc oc rsh sibec-arquivos-des-210-hkjgk sh -c 'id; ls -ln /sibec/Folha | head -5; du -sh /sibec /sibec3; find /sibec -type f | wc -l; find /sibec3 -type f | wc -l'
Error: unknown command "oc" for "oc"

Did you mean this?
        cp
        ex

Run 'oc --help' for usage.
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
