namei -l /opt/batch/securefiles/caixa-truststore-acteste-nprd.jks
id f517263

sudo -u f517263 head -c1 /opt/batch/securefiles/caixa-truststore-acteste-nprd.jks >/dev/null && echo "LEITURA OK" || echo "SEM PERMISSAO"

stat /opt/batch/securefiles/caixa-truststore-acteste-nprd.jks

ls -lt /producao/rotina/RSADB001/ | head
grep -l "Truststore SSO sem permissão" /producao/rotina/RSADB001/**/*.log 2>/dev/null
