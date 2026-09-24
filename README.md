
-sh-4.2$ ^C
-sh-4.2$ oc exec sigsj-alvara-des-666-2zzkm -n sigsj-des -- env | grep -Ei 'JAVA_TOOL_OPTIONS|APPLICATIONINSIGHTS'
APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL=INFO
APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL=INFO
APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE=100
APPLICATIONINSIGHTS_CONFIGURATION_CONTENT={"sampling":{"overrides":[{"telemetryType":"request","attributes":[{"key":"url.path","value":"^(\/q)?\/health\/.*","matchType":"regexp"}],"percentage":0}]}}
APPLICATIONINSIGHTS_ROLE_NAME=SIGSJ-ALVARA-DES
APPLICATIONINSIGHTS_CONNECTION_STRING=InstrumentationKey=f6b9b060-c8fc-4702-a924-a3632ca25bb1;IngestionEndpoint=https://brazilsouth-1.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsouth.livediagnostics.monitor.azure.com/;ApplicationId=3ba7c0c0-1c00-4692-8f9a-61a48d60d078
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs sigsj-alvara-des-666-2zzkm  -n sigsj-des | grep -Ei 'Picked up|ApplicationInsights'
-sh-4.2$
