union requests, dependencies, traces, customEvents
| where timestamp > ago(3h)
| where cloud_RoleName =~ "sigsj-alvara-des"
| summarize count() by itemType

customEvents
| where timestamp > ago(1d)
| where name == "alvara_ac_snapshot"
| take 10

