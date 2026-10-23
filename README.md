oc logs <pod-penhor> -n sicow-des --since=3m | grep -iE "scowdb01|password authentication|IJ000453|Unable to get managed connection|Exception" | head -20
