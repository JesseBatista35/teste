sh-4.2$
-sh-4.2$ for pv in sibec-arquivos-data-des sibec-arquivos-nfs-data-des sibec-internet-data-des; do
>   echo "== $pv"
>   oc get pv $pv -o jsonpath='{.spec.storageClassName}{" | nfs: "}{.spec.nfs}{" | csi: "}{.spec.csi.driver}{" | reclaim: "}{.spec.persistentVolumeReclaimPolicy}{"\n"}'
> done
== sibec-arquivos-data-des
 | nfs: map[server:nprdnfs01.ad.caixa path:/fs_sibec_des_nprd] | csi:  | reclaim: Retain
== sibec-arquivos-nfs-data-des
 | nfs: map[server:nprdnfs01.ad.caixa path:/fs_sibec_nprd] | csi:  | reclaim: Retain
== sibec-internet-data-des
 | nfs: map[server:nfsctcnprd.ctc.caixa path:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/SIBEC] | csi:  | reclaim: Retain
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc,deploy -n sibec-des -o jsonpath='{range .items[*]}{.metadata.name}{": "}{range .spec.template.spec.volumes[*]}{.persistentVolumeClaim.claimName}{" "}{end}{"\n"}{end}'
sibec-api-consulta-des:      sibec-api-faturamento-des:  sibec-api-manutencao-des:    sibec-arquivos-des:   sibec-arquivos-nfs-data-des sibec-arquivos-data-des  sibec-batch-des: sibec-dados-familia-des:    sibec-des:  sibec-data-des   sibec-estatico-des:  sibec-estatico-internet-des:  sibec-gestao-des:    sibec-internet-des:  sibec-internet-data-des   sibec-manutencao-des:    sibec-micro-des:    sibec-parametrizacao-des:    sibec-relatorios-des:    -sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get events -n sibec-des --sort-by=.lastTimestamp | tail -20
F1029 14:48:08.926466  127575 sorter.go:306] Field {.lastTimestamp} in *unstructured.Unstructured is an unsortable type: interface, err: unsortable type: <nil>
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
