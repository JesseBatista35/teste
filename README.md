oc get pods -n <namespace-do-sispl>
oc rsh <nome-do-pod>


curl -v -x http://proxydes.caixa:80 https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track --max-time 10
curl -v -x http://proxydes.caixa:80 https://brazilsouth.livediagnostics.monitor.azure.com/QuickPulseService.svc --max-time 10
curl -v -x http://proxydes.caixa:80 https://agent.azureserviceprofiler.net --max-time 10


curl -v -x http://proxydes.caixa:80 --connect-to ::agent.azureserviceprofiler.net:443 https://agent.azureserviceprofiler.net --max-time 10 -o /dev/null
