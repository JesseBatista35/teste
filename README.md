hostname -f
for f in $(grep -alE 'LDAP_URL|STRATEGY' /proc/[0-9]*/environ 2>/dev/null); do
  p=${f#/proc/}; p=${p%/environ}
  echo "== $p $(tr '\0' ' ' < /proc/$p/cmdline)"
  tr '\0' '\n' < $f | grep -E '^(SICIA_ENV|STRATEGY|LDAP_URL|LDAP_USER_BASE|LDAP_GROUP_BASE)='
done | head -30
