oc debug dc/sihdg-jboss8-des -n sihdg-des -- bash -c '
  update-crypto-policies --show 2>/dev/null
  cat /etc/crypto-policies/back-ends/java.config
  cat /opt/server/bin/java.security.override'
