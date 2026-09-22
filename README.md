oc -n selenium-grid rsh firefox-3-rwpfb \
  curl -sv --max-time 15 -x http://proxydes.caixa:80 -o /dev/null https://cdn.perfdrive.com/


  oc -n selenium-grid get dc   # confirmar os nomes dos nós

NOPROXY="localhost,127.0.0.1,.caixa,.caixa.gov.br,.svc,.cluster.local,10.0.0.0/8"
for dc in chrome firefox edge; do   # ajustar aos nomes reais
  oc -n selenium-grid set env dc/$dc \
    HTTP_PROXY=http://proxydes.caixa:80  http_proxy=http://proxydes.caixa:80 \
    HTTPS_PROXY=http://proxydes.caixa:80 https_proxy=http://proxydes.caixa:80 \
    NO_PROXY="$NOPROXY" no_proxy="$NOPROXY"
done

  
