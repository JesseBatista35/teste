oc port-forward svc/siinp-nucleo-web-tqs 8080:8080 &
sleep 2
curl -X POST http://localhost:8080/inic-pagto/nucleo/v1/jornada \
  -H "Content-Type: application/json" \
  -d '{"valor": "25.00"}'
