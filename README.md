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
                "path": "/auth/user-config",
                "port": 8080
              },
              "initialDelaySeconds": 30,
              "periodSeconds": 10,
              "timeoutSeconds": 5,
              "failureThreshold": 3
            },
            "livenessProbe": {
              "httpGet": {
                "path": "/auth/user-config",
                "port": 8080
              },
              "initialDelaySeconds": 60,
              "periodSeconds": 10,
              "timeoutSeconds": 5,
              "failureThreshold": 3
            }
          }
        ]
      }
    }
  }
}'
