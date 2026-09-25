
-sh-4.2$ oc logs dc/chrome -n selenium-grid --since=24h | grep -iE "crash|shm|session.*(deleted|stopp)|killed"
15:56:26.265 INFO [SessionSlot.stop] - Stopping session ec45959f67c730ed7ebafbae86885518
15:58:43.412 INFO [SessionSlot.stop] - Stopping session ed836479db7ce5ae5b44798530270ea6
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get events -n selenium-grid --sort-by=.lastTimestamp | tail -20
No resources found.
-sh-4.2$
-sh-4.2$
-sh-4.2$
