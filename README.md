APPLICATIONINSIGHTS_CONNECTION_STRING = <connection string da Azure, sem aspas>
APPLICATIONINSIGHTS_ROLE_NAME = SILCE
APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE = 100
APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL = INFO
APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL = INFO
URL_PROXY = proxydes.caixa



curl -v -x proxydes.caixa:80 https://southcentralus-3.in.applicationinsights.azure.com


curl -v -x proxydes.caixa:80 https://rt.services.visualstudio.com
