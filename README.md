oc logs sigsj-alvara-des-669-bsj5j -n sigsj-des | grep -Ei 'Application Insights Java Agent|set calls are ignored'
oc exec sigsj-alvara-des-669-bsj5j -n sigsj-des -- env | grep JAVA_OPTIONS_APPEND
