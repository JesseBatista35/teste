oc logs sihdg-jboss8-des-19-6r65j -n sihdg-des --previous | grep -iE "sihdgDS|WFLYJCA|datasource|cli-script|reload|ERROR|WARN"


oc get is -n build-images-ads


oc logs sihdg-jboss8-des-19-6r65j -n sihdg-des --previous | grep -iE -B3 -A20 "Processing CLI script|WFLYCLI"


