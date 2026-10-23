oc logs sicow-penhor-okd-des-61-m19pq -n sicow-des --since=5m | grep -E "ERROR|SEVERE|Exception|veio sem valor|scowdb01" | head -40

