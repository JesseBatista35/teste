curl -v -X POST https://integra.iniciadora.caixa.gov.br/inic-pagto/nucleo/v1/jornada \
  -H "Content-Type: application/json" \
  -d '{
    "idConvenioParceiro": 138,
    "usuarioLogado": {
      "documento": {
        "identificacao": "49317484905",
        "tipoDocumento": "CPF",
        "nome": "TEST"
      }
    },
    "valor": "25.00"
  }'





  # Veja os logs do nginx/router do OKD
oc logs -n openshift-ingress deployment/router-default | tail -50



oc port-forward pod/siinp-nucleo-tqs-513-7hgs9 8080:8080



curl -v -X POST http://localhost:8080/inic-pagto/nucleo/v1/jornada \
  -H "Content-Type: application/json" \
  -d '{"valor": "25.00"}'
