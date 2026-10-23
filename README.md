oc logs sicow-penhor-okd-des-61-ml9pq -n sicow-des --since=10m | grep -E "ERROR|SEVERE|Exception|veio sem valor|scowdb01" | head -40

oc delete pod sicow-penhor-okd-des-56-hxsk7-debug-8xldx -n sicow-des
