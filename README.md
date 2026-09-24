oc exec sigsj-alvara-des-664-mc49j -n sigsj-des -- env | grep -Ei 'JAVA_TOOL_OPTIONS|APPLICATIONINSIGHTS'
oc logs sigsj-alvara-des-664-mc49j -n sigsj-des | grep -Ei 'Picked up|ApplicationInsights'
