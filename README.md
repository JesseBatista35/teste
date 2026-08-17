oc get events -n simpi-des --sort-by='.lastTimestamp' | grep -i dict-api | tail -30

oc rollout latest dc/simpi-dict-api-des -n simpi-des

for i in $(seq 1 60); do
  POD=$(oc get pod -n simpi-des -l deploymentconfig=simpi-dict-api-des --sort-by=.metadata.creationTimestamp -o jsonpath='{.items[-1:].metadata.name}' 2>/dev/null)
  if [ -n "$POD" ]; then
    STATUS=$(oc get pod $POD -n simpi-des -o jsonpath='{.status.phase}' 2>/dev/null)
    echo "pod=$POD status=$STATUS"
    if [ "$STATUS" = "Running" ]; then
      oc exec $POD -c simpi-dict-api-des -n simpi-des -- sh -c 'echo VAULT_LOCATION=$VAULT_LOCATION; echo ---; ls -la $VAULT_LOCATION 2>&1; echo ---; find /usr/src/app/secrets_files -type f 2>&1' && break
    fi
  fi
  sleep 1
done
