
oc patch dc sicbc-backend-des -n sicbc-des -p '
{
  "spec": {
    "template": {
      "spec": {
        "containers": [
          {
            "name": "sicbc-backend-des",
            "livenessProbe": null,
            "readinessProbe": null
          }
        ]
      }
    }
  }
}'
