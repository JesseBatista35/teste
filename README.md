oc -n selenium-grid rsh firefox-3-rwpfb \
  curl -sv --max-time 15 -x http://proxydes.caixa:80 -o /dev/null https://cdn.perfdrive.com/

  
