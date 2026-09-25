sudo cat /proc/29599/environ | tr '\0' '\n' | grep -E '^(STRATEGY|LDAP_URL|LDAP_USER_BASE|LDAP_GROUP_BASE)='

for p in 29587 29593 29599 29619 29630 29638 29649 29666; do
  echo "== $p $(sudo cat /proc/$p/cmdline | tr '\0' ' ')"
  sudo cat /proc/$p/environ | tr '\0' '\n' | grep -E '^(STRATEGY|LDAP_URL|LDAP_USER_BASE|LDAP_GROUP_BASE)='
done

sudo find /opt/sicia -maxdepth 3 -path '*/node_modules' -prune -o \
  \( -name 'ecosystem*' -o -name 'process*.json' -o -name 'pm2*.json' -o -name '*.config.js' \) -print
sudo grep -rEn --exclude-dir=node_modules --exclude-dir=.nvm \
  '(STRATEGY|LDAP_URL|LDAP_USER_BASE|LDAP_GROUP_BASE)' /opt/sicia 2>/dev/null | grep -v '\.log:'

  sudo -u sicia bash -lc 'pm2 list'
sudo -u sicia bash -lc 'pm2 env 0' | grep -E '^(STRATEGY|LDAP_URL|LDAP_USER_BASE|LDAP_GROUP_BASE)'

pgrep -af 'services/ldap/index.js'
