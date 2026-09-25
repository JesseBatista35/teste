oc logs sigsj-alvara-des-669-bsj5j -n sigsj-des | grep -Ei 'LogRecordExporter|BatchLogRecordProcessor|v1/logs' | tail -5

union *
| where timestamp > ago(1d)
| where * has "alvara_ac_snapshot"
| summarize count() by itemType

