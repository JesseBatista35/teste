customEvents
| where timestamp > ago(1d)
| where name == "alvara_ac_snapshot"
| take 10


