oc get dc sibec-arquivos-tqs -n sibec-tqs -o yaml > /tmp/dc.yaml
grep -n "volumes:" /tmp/dc.yaml
grep -n "volumeMounts:" /tmp/dc.yaml
grep -n "name: sibec-arquivos-tqs" /tmp/dc.yaml


sed -n '1,400p' /tmp/dc.yaml


cat /tmp/dc.yaml


sed -n '/^  template:/,/^status:/p' /tmp/dc.yaml
