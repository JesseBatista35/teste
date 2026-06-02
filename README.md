[p585600@sspdeapllx0041 ~]$ cat /opt/azure/config/appinsights/applicationinsights.json
{
    "connectionString": "InstrumentationKey=b0142390-50c9-495e-85b4-7b2ade8fc1cf;IngestionEndpoint=https://brazilsoutheast-0.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsoutheast.livediagnostics.monitor.azure.com/",
    "role": {
        "name": "SISAG-PROVISIONAMENTO-SAQUE-BACKEND-DES"
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
[p585600@sspdeapllx0041 ~]$
