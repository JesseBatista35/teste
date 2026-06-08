oc patch dc sicbc-backend-des -n sicbc-des -p '
{
  "spec": {
    "template": {
      "spec": {
        "containers": [
          {
            "name": "sicbc-backend-des",
            "startupProbe": null,
            "readinessProbe": null,
            "livenessProbe": null
          }
        ]
      }
    }
  }
}'
