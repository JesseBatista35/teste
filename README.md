ls -la /sihdg_tqs /sihdg_tqs/Arquivos_SINAF 2>&1 | head
touch /sihdg_tqs/.teste_escrita && echo ESCRITA_OK && rm -f /sihdg_tqs/.teste_escrita

getent hosts CBRDEDADNT002.extra.caixa.gov.br
timeout 5 bash -c '</dev/tcp/10.116.29.201/31153' && echo PORTA_OK_IP || echo FALHOU_IP
