oc -n selenium-grid rsh firefox-4-n5rkq bash -c \
 'getent hosts proxyprd.caixa; for ip in $(getent ahostsv4 proxyprd.caixa | awk "{print \$1}" | sort -u); do timeout 5 bash -c "</dev/tcp/$ip/80" && echo "$ip OK" || echo "$ip FALHA"; done'

oc -n selenium-grid rsh firefox-4-n5rkq \
  curl -sv --max-time 15 -x http://proxyprd.caixa:80 -o /dev/null https://cdn.perfdrive.com/
