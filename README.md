oc get pod -n siavl-des -l name=siavl-gestaomodelonota-des

POD=$(oc get pod -n siavl-des -l name=siavl-gestaomodelonota-des -o jsonpath='{.items[0].metadata.name}')
oc exec $POD -n siavl-des -- curl -s -i http://localhost:8080/actuator/health/liveness
oc exec $POD -n siavl-des -- curl -s -i http://localhost:8080/actuator/health/readiness

.requestMatchers("/actuator/health/**").permitAll()

oc set probe dc/siavl-gestaomodelonota-des -n siavl-des --liveness --readiness --remove
oc set probe dc/siavl-gestaomodelonota-des -n siavl-des --liveness --readiness --open-tcp=8080 --initial-delay-seconds=60 --period-seconds=10 --timeout-seconds=3
