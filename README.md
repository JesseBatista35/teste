
[jboss7@sspdeapllx0041 jboss-eap-7.0]$ cat /opt/azure/config/appinsights/applicationinsights.json
{
    "proxy": {
        "host": "proxydes.caixa",
        "port": 80
    },
    "sampling": {
        "percentage": 10
    },
    "customDimensions": {
        "centralizadora": "CEPTISP"
    },
    "selfDiagnostics": {
        "destination": "console",
        "level": "INFO",
        "file": {
            "maxHistory": 1,
            "maxSizeMb": 5,
            "path": ""
        }
    }
}
[jboss7@sspdeapllx0041 jboss-eap-7.0]$

