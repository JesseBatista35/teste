oc patch dc sicbc-backend-des -n sicbc-des -p '
{
  "spec": {
    "template": {
      "spec": {
        "containers": [
          {
            "name": "sicbc-backend-des",
            "readinessProbe": {
              "httpGet": {
                "path": "/q/health/live",
                "port": 8080
              },
              "initialDelaySeconds": 10,
              "periodSeconds": 10,
              "failureThreshold": 3
            },
            "livenessProbe": {
              "httpGet": {
                "path": "/q/health/live",
                "port": 8080
              },
              "initialDelaySeconds": 10,
              "periodSeconds": 10,
              "failureThreshold": 3
            }
          }
        ]
      }
    }
  }
}'
