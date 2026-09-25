oc logs dc/chrome -n selenium-grid --since=24h | grep -iE "crash|shm|session.*(deleted|stopp)|killed"
oc get events -n selenium-grid --sort-by=.lastTimestamp | tail -20

