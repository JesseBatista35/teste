hostname
P=$(pgrep -f 'services/ldap/index.js'); echo "PID=$P"
sudo cat /proc/$P/environ | tr '\0' '\n' | grep -E '^(STRATEGY|LDAP_URL|LDAP_USER_BASE|LDAP_GROUP_BASE)='






sudo ls /opt/sicia/server/config/passport/
sudo grep -rnEi 'bindDN|bindCredentials|bind_dn|binddn|credentials|password' \
  /opt/sicia/server/config/passport/ /opt/sicia/server/services/ldap/libs/ldap.lib.js
