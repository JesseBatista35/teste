// 1) O evento chegou como customEvent?
customEvents
| where timestamp > ago(1d)
| where name == "alvara_ac_snapshot"
| take 10


// 2) Chegou como trace? (o agente recebeu, mas não converteu em evento)
traces
| where timestamp > ago(1d)
| where cloud_RoleName =~ "sigsj-alvara-des"
| where customDimensions has "snapshot_id"
| take 10




oc get pod -n sigsj-des -l name=sigsj-alvara-des -o wide
oc logs <pod> -n sigsj-des | grep -i 'custom events emitidos' | tail -3

