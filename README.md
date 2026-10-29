for pv in sibec-arquivos-data-des sibec-arquivos-nfs-data-des sibec-internet-data-des; do
  echo "== $pv"
  oc get pv $pv -o jsonpath='{.spec.storageClassName}{" | nfs: "}{.spec.nfs}{" | csi: "}{.spec.csi.driver}{" | reclaim: "}{.spec.persistentVolumeReclaimPolicy}{"\n"}'
done

# qual PVC cada deployment monta de fato
oc get dc,deploy -n sibec-des -o jsonpath='{range .items[*]}{.metadata.name}{": "}{range .spec.template.spec.volumes[*]}{.persistentVolumeClaim.claimName}{" "}{end}{"\n"}{end}'

# quem criou/alterou recentemente
oc get events -n sibec-des --sort-by=.lastTimestamp | tail -20

