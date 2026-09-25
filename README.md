

Debian GNU/Linux comes with ABSOLUTELY NO WARRANTY, to the extent
permitted by applicable law.
p585600@SCTTQAPLLX0013:~$
p585600@SCTTQAPLLX0013:~$
p585600@SCTTQAPLLX0013:~$
p585600@SCTTQAPLLX0013:~$
p585600@SCTTQAPLLX0013:~$ P=$(pgrep -f 'services/ldap/index.js'); echo "PID=$P"
PID=24846
p585600@SCTTQAPLLX0013:~$ sudo cat /proc/$P/environ | tr '\0' '\n' | grep -E '^(STRATEGY|LDAP_URL|LDAP_USER_BASE|LDAP_GROUP_BASE)='
LDAP_GROUP_BASE=ou=Groups, o=caixa
LDAP_USER_BASE=ou=People,o=caixa
LDAP_URL=ldap://ldapcluster.corecaixa:489
STRATEGY=user
p585600@SCTTQAPLLX0013:~$ P=$(pgrep -f 'services/ldap/index.js'); echo "PID=$P"
PID=24846
p585600@SCTTQAPLLX0013:~$ sudo cat /proc/$P/environ | tr '\0' '\n' | grep -E '^(STRATEGY|LDAP_URL|LDAP_USER_BASE|LDAP_GROUP_BASE)='
LDAP_GROUP_BASE=ou=Groups, o=caixa
LDAP_USER_BASE=ou=People,o=caixa
LDAP_URL=ldap://ldapcluster.corecaixa:489
STRATEGY=user
p585600@SCTTQAPLLX0013:~$
