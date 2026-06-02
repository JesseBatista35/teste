
[p585600@sspdeapllx0041 ~]$ sudo -u jboss7 -s
[jboss7@sspdeapllx0041 p585600]$
[jboss7@sspdeapllx0041 p585600]$
[jboss7@sspdeapllx0041 p585600]$ sed -i 's/"name": "SISAG-PROVISIONAMENTO-SAQUE-BACKEND-DES"/"name": "SISAG-PROV"/' /opt/azure/config/appinsights/applicationinsights.json
[jboss7@sspdeapllx0041 p585600]$ cat /opt/azure/config/appinsights/applicationinsights.json
{
    "connectionString": "InstrumentationKey=b0142390-50c9-495e-85b4-7b2ade8fc1cf;IngestionEndpoint=https://brazilsoutheast-0.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsoutheast.livediagnostics.monitor.azure.com/",
    "role": {
        "name": "SISAG-PROV"
    },
    "proxy": {
        "host": "proxydes.caixa",
        "port": 80
    },
    "sampling": {
        "percentage": 100
    },
    "instrumentation": {
        "logging": {
            "level": "INFO"
        }
    },
    "selfDiagnostics": {
        "destination": "file+console",
        "level": "INFO",
        "file": {
            "path": "applicationinsights.log",
            "maxSizeMb": 5,
            "maxHistory": 1
        }
    }
}
[jboss7@sspdeapllx0041 p585600]$
