Prezados,
Segue informações pertinentes ao Servidor cctcoitrlx008
 
 
Swift
root@cctcoitrlx008:/opt/sicia# for f in $(grep -alE 'LDAP_URL|STRATEGY' /proc/[0-9]*/environ 2>/dev/null); do p=${f#/proc/}; p=${p%/environ}; echo "== $p $(tr '\0' ' ' < /proc/$p/cmdline)"; tr '\0' '\n' < $f | grep -E '^(SICIA_ENV|STRATEGY|LDAP_URL|LDAP_USER_BASE|LDAP_GROUP_BASE)='; done | head -30
== 10845 node /opt/sicia/server/services/ldap/index.js
LDAP_GROUP_BASE=ou=Groups, o=caixa
LDAP_USER_BASE=ou=People,o=caixa
LDAP_URL=ldap://ldapcluster.corecaixa:489
STRATEGY=ldap-search
SICIA_ENV=PILOTO_PRD
== 14423 /opt/sicia/.nvm/versions/node/v8.1.3/bin/node --max-old-space-size=2048 /opt/sicia/server/node_modules/workerpool/dist/worker.js
LDAP_GROUP_BASE=ou=Groups, o=caixa
LDAP_USER_BASE=ou=People,o=caixa
LDAP_URL=ldap://ldapcluster.corecaixa:489
STRATEGY=ldap-search
SICIA_ENV=PILOTO_PRD
== 14429 /opt/sicia/.nvm/versions/node/v8.1.3/bin/node --max-old-space-size=2048 /opt/sicia/server/node_modules/workerpool/dist/worker.js
LDAP_GROUP_BASE=ou=Groups, o=caixa
LDAP_USER_BASE=ou=People,o=caixa
LDAP_URL=ldap://ldapcluster.corecaixa:489
STRATEGY=ldap-search
SICIA_ENV=PILOTO_PRD
== 14435 /opt/sicia/.nvm/versions/node/v8.1.3/bin/node --max-old-space-size=2048 /opt/sicia/server/node_modules/workerpool/dist/worker.js
LDAP_GROUP_BASE=ou=Groups, o=caixa
LDAP_USER_BASE=ou=People,o=caixa
LDAP_URL=ldap://ldapcluster.corecaixa:489
STRATEGY=ldap-search
SICIA_ENV=PILOTO_PRD
== 25491 /opt/sicia/.nvm/versions/node/v8.1.3/bin/node --max-old-space-size=2048 /opt/sicia/server/node_modules/workerpool/dist/worker.js
LDAP_GROUP_BASE=ou=Groups, o=caixa
LDAP_USER_BASE=ou=People,o=caixa
LDAP_URL=ldap://ldapcluster.corecaixa:489
STRATEGY=ldap-search
SICIA_ENV=PILOTO_PRD
 
