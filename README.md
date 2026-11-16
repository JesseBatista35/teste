oc logs -n siepr-des --tail=150 $(oc get pods -n siepr-des -o name | grep -i bec3 | grep -iv frontend | head -1)
