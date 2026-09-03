env:
  - name: HTTP_PROXY
    value: "http://proxydes.caixa:80"
  - name: HTTPS_PROXY
    value: "http://proxydes.caixa:80"
  - name: NO_PROXY
    value: "<hosts internos que não devem passar pelo proxy>"
