
-sh-4.2$
-sh-4.2$ oc exec -it sipgc-api-informacoes-tqs-90-zczmd -n sipgc-tqs -- bash -c "env | grep -i -E 'url|host|prestador|colaborador' | sed 's/password=[^;]*/password=***/I'"
SIPGC_API_PORTFOLIO_TQS_SERVICE_HOST=25.128.248.176
SIPGC_API_SEGURANCA_TQS_METRICS_SERVICE_HOST=25.128.249.11
SIPGC_API_PAPEL_TQS_METRICS_SERVICE_HOST=25.128.205.181
SIPGC_API_AGRUPAMENTO_TQS_SERVICE_HOST=25.128.199.210
SIPGC_API_PORTFOLIO_TQS_METRICS_SERVICE_HOST=25.128.126.83
SIPGC_API_PORTFOLIO_TQS_ESTEIRAS_SERVICE_HOST=25.128.182.205
HOSTNAME=sipgc-api-informacoes-tqs-90-zczmd
SIPGC_API_PORTFOLIO_TQS_ESTEIRAS_METRICS_SERVICE_HOST=25.128.180.80
ASPNETCORE_URLS=http://*:8080
SIPGC_API_AGRUPAMENTO_TQS_METRICS_SERVICE_HOST=25.128.157.130
SIPGC_API_MEMBROS_TQS_SERVICE_HOST=25.128.219.144
SIPGC_API_INFORMACOES_TQS_SERVICE_HOST=25.128.149.71
SIPGC_API_SEGURANCA_TQS_SERVICE_HOST=25.128.114.167
SIPGC_API_INFORMACOES_TQS_METRICS_SERVICE_HOST=25.128.215.168
NO_PROXY=.caixa,localhost,127.0.0.1,10.116.92.247,.svc,.svc.cluster.local,10.0.0.0/8
SIPGC_FRONT_TQS_SERVICE_HOST=25.128.169.128
SIPGC_API_MEMBROS_TQS_METRICS_SERVICE_HOST=25.128.149.252
SIPGC_API_PAPEL_TQS_SERVICE_HOST=25.128.117.218
KUBERNETES_SERVICE_HOST=25.128.0.1
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -it sipgc-api-informacoes-tqs-90-zczmd -n sipgc-tqs -- bash -c "grep -ril sigoc /opt/app-root/app 2>/dev/null | head"
/opt/app-root/app/Resources/colaboradores_mock.json
/opt/app-root/app/SIPGC-api-informacoes.Tests/bin/Release/net8.0/Resources/colaboradores_mock.json
/opt/app-root/app/SIPGC-api-informacoes.Tests/bin/Release/net8.0/SIPGC-api-informacoes.Tests/bin/Release/net8.0/Resources/colaboradores_mock.json
/opt/app-root/app/SIPGC-api-informacoes.Tests/bin/Release/net8.0/SIPGC-api-informacoes.Tests/bin/Release/net8.0/SIPGC-api-informacoes.Tests/bin/Release/net8.0/Resources/colaboradores_mock.json
/opt/app-root/app/SIPGC-api-informacoes.Tests/bin/Release/net8.0/SIPGC-api-informacoes.Tests/bin/Release/net8.0/SIPGC-api-informacoes.Tests/bin/Release/net8.0/appsettings.json
/opt/app-root/app/SIPGC-api-informacoes.Tests/bin/Release/net8.0/SIPGC-api-informacoes.Tests/bin/Release/net8.0/appsettings.json
/opt/app-root/app/SIPGC-api-informacoes.Tests/bin/Release/net8.0/appsettings.json
/opt/app-root/app/SIPGC-api-informacoes.dll
/opt/app-root/app/SIPGC-api-informacoes.pdb
/opt/app-root/app/appsettings.json
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -it sipgc-api-informacoes-tqs-90-zczmd -n sipgc-tqs -- bash -c "grep -i sigoc /opt/app-root/app/appsettings*.json"
/opt/app-root/app/appsettings.json:  "Sigoc": {
/opt/app-root/app/appsettings.json:    "BaseUrl": "https://des.sigoc.caixa/sigoc-web/rest",
-sh-4.2$
