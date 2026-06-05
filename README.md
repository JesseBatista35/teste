# 1. Aumentar delays das probes para 120s
oc patch dc sicbc-backend-des -n sicbc-des -p '
{
  "spec": {
    "template": {
      "spec": {
        "containers": [
          {
            "name": "sicbc-backend-des",
            "readinessProbe": {"initialDelaySeconds": 120},
            "livenessProbe": {"initialDelaySeconds": 120}
          }
        ]
      }
    }
  }
}'

# 2. Esperar novo pod subir
sleep 5
oc get pods -n sicbc-des -w

# 3. Ver logs enquanto ainda está "Running"
oc logs -n sicbc-des sicbc-backend-des-15-XXXXX -f
