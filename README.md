union requests, dependencies, traces, customEvents
| where timestamp > ago(3h)
| where cloud_RoleName =~ "sigsj-alvara-des"
| summarize count() by itemType

customEvents
| where timestamp > ago(1d)
| where name == "alvara_ac_snapshot"
| take 10

<img width="1862" height="903" alt="image" src="https://github.com/user-attachments/assets/f0a8a026-bdcb-4331-896c-badde61ab93d" />


<img width="1563" height="808" alt="image" src="https://github.com/user-attachments/assets/0450b16d-7e10-4e2b-b606-f022bbfeb74e" />

