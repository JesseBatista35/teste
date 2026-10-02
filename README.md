getfacl /opt/batch/securefiles/caixa-truststore-acteste-nprd.jks
su - f517263 -c "head -c1 /opt/batch/securefiles/caixa-truststore-acteste-nprd.jks >/dev/null && echo LEITURA OK || echo SEM PERMISSAO"

setfacl -m u:f517263:r /opt/batch/securefiles/caixa-truststore-acteste-nprd.jks

grep -r "JAVA_TOOL_OPTIONS\|ssl-sirsa" /producao/rotina/RSADB001/ /opt/batch/ 2>/dev/null

stat /opt/batch/securefiles/caixa-truststore-acteste-nprd.jks | grep -E "Modify|Change"
