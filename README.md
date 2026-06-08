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
                "path": "/",
                "port": 8080
              }
            },
            "livenessProbe": {
              "httpGet": {
                "path": "/",
                "port": 8080
              }
            }
          }
        ]
      }
    }
  }
}'
