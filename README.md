P=$(pgrep -f 'services/ldap/index.js'); echo "PID=$P"
sudo cat /proc/$P/environ | tr '\0' '\n' | grep -E '^(STRATEGY|LDAP_URL|LDAP_USER_BASE|LDAP_GROUP_BASE)='
