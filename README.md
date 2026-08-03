oc rsh sispl-consulta-apostas-api-tqs-54846995bc-jwgvm

timeout 5 bash -c "</dev/tcp/cics.des.coredf.caixa/8080" && echo "CONECTOU" || echo "TIMEOUT/BLOQUEADO"
