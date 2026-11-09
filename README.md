oc get pod sismn-gecci-tqs-28-glhxs -n sismn-tqs -o yaml | grep -B2 -A6 QUARKUS_DATASOURCE
oc get dc sismn-gecci-tqs -n sismn-tqs -o jsonpath='{.spec.triggers}'; echo

oc get secret sismn-gecci-tqs -n sismn-tqs -o jsonpath='{.data}' | sed 's/:.*//'; echo
