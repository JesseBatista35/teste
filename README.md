oc logs sicow-penhor-okd-des-64-c7wx4 -n sicow-des --since=3m | grep -viE "TelemetryPipeline|applicationinsights" | tail -60
