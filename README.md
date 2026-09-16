oc get events -n build-images-ads --sort-by='.lastTimestamp' | tail -30
oc get events -A --sort-by='.lastTimestamp' | grep -i -E "apiserver|timeout|evict" | tail -30
