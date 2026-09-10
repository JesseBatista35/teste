
-sh-4.2$
-sh-4.2$ for pod in $(oc get pods -n openshift-ingress -o jsonpath='{.items[*].metadata.name}'); do
>   echo "=== $pod ==="
>   oc logs $pod -n openshift-ingress --tail=1000 | grep -i "sigda-api-quarkus-des\|10.245.153"
> done
=== router-default-556cdc9cb7-4lgb7 ===
=== router-default-556cdc9cb7-bjj7f ===
=== router-default-556cdc9cb7-kr77m ===
=== router-default-556cdc9cb7-rrqln ===
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get ingresscontroller default -n openshift-ingress-operator -o yaml | grep -A5 "accessLogging\|logging"
        f:logging:
          .: {}
          f:access:
            .: {}
            f:destination: {}
            f:httpLogFormat: {}
--
        f:logging:
          f:access:
            f:destination:
              f:syslog:
                .: {}
                f:address: {}
--
  logging:
    access:
      destination:
        syslog:
          address: 10.221.24.35
          maxLength: 1024
-sh-4.2$
