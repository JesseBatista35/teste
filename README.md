achamos aqui sao outros ip

AMBIENTE PILOTO SICIA SERVIDORES

### WO0000019989829
upstream siciaRest {
                server 10.123.38.230:8444;
               # server cctdcapllx0632.df.caixa:8444;
}

upstream siciaSocket{
                ip_hash;
                server 10.123.38.230:8443;
                server 10.123.38.230:9001;
                server 10.123.38.230:9002;
}


 

AMBIENTE PILOTO SICIA VARIAVEIS

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


AMBIENTE SICIA SERVIDOR cctdcapllx0632 -> 10.123.40.149  VARIAVEIS
 
 
== 14532 node /opt/sicia/server/index.js
== 14542 /opt/sicia/.nvm/versions/node/v8.1.3/bin/node --max-old-space-size=2048 /opt/sicia/server/node_modules/workerpool/dist/worker.js
SICIA_ENV=PRD
STRATEGY=ldap-search
LDAP_URL=ldap://ldapcluster.corecaixa:489
LDAP_USER_BASE=ou=People,o=caixa
LDAP_GROUP_BASE=ou=Groups, o=caixa
== 14561 node /opt/sicia/server/index.js
== 14571 /opt/sicia/.nvm/versions/node/v8.1.3/bin/node --max-old-space-size=2048 /opt/sicia/server/node_modules/workerpool/dist/worker.js
SICIA_ENV=PRD
STRATEGY=ldap-search
LDAP_URL=ldap://ldapcluster.corecaixa:489
LDAP_USER_BASE=ou=People,o=caixa
LDAP_GROUP_BASE=ou=Groups, o=caixa
== 16881 node /opt/sicia/server/index.js
== 16891 /opt/sicia/.nvm/versions/node/v8.1.3/bin/node --max-old-space-size=2048 /opt/sicia/server/node_modules/workerpool/dist/worker.js
SICIA_ENV=PRD
STRATEGY=ldap-search
LDAP_URL=ldap://ldapcluster.corecaixa:489
LDAP_USER_BASE=ou=People,o=caixa
LDAP_GROUP_BASE=ou=Groups, o=caixa
== 16928 node /opt/sicia/server/index.js
== 16938 /opt/sicia/.nvm/versions/node/v8.1.3/bin/node --max-old-space-size=2048 /opt/sicia/server/node_modules/workerpool/dist/worker.js
SICIA_ENV=PRD
STRATEGY=ldap-search
LDAP_URL=ldap://ldapcluster.corecaixa:489
LDAP_USER_BASE=ou=People,o=caixa
LDAP_GROUP_BASE=ou=Groups, o=caixa
== 16955 node /opt/sicia/server/index.js
== 16965 /opt/sicia/.nvm/versions/node/v8.1.3/bin/node --max-old-space-size=2048 /opt/sicia/server/node_modules/workerpool/dist/worker.js
root@cctdcapllx0632:/opt/sicia#
 
 
 
 
 == 14532 node /opt/sicia/server/index.js
== 14542 /opt/sicia/.nvm/versions/node/v8.1.3/bin/node --max-old-space-size=2048 /opt/sicia/server/node_modules/workerpool/dist/worker.js
SICIA_ENV=PRD
STRATEGY=ldap-search
LDAP_URL=ldap://ldapcluster.corecaixa:489
LDAP_USER_BASE=ou=People,o=caixa
LDAP_GROUP_BASE=ou=Groups, o=caixa
== 14561 node /opt/sicia/server/index.js
== 14571 /opt/sicia/.nvm/versions/node/v8.1.3/bin/node --max-old-space-size=2048 /opt/sicia/server/node_modules/workerpool/dist/worker.js
SICIA_ENV=PRD
STRATEGY=ldap-search
LDAP_URL=ldap://ldapcluster.corecaixa:489
LDAP_USER_BASE=ou=People,o=caixa
LDAP_GROUP_BASE=ou=Groups, o=caixa
== 16881 node /opt/sicia/server/index.js
== 16891 /opt/sicia/.nvm/versions/node/v8.1.3/bin/node --max-old-space-size=2048 /opt/sicia/server/node_modules/workerpool/dist/worker.js
SICIA_ENV=PRD
STRATEGY=ldap-search
LDAP_URL=ldap://ldapcluster.corecaixa:489
LDAP_USER_BASE=ou=People,o=caixa
LDAP_GROUP_BASE=ou=Groups, o=caixa
== 16928 node /opt/sicia/server/index.js
== 16938 /opt/sicia/.nvm/versions/node/v8.1.3/bin/node --max-old-space-size=2048 /opt/sicia/server/node_modules/workerpool/dist/worker.js
SICIA_ENV=PRD
STRATEGY=ldap-search
LDAP_URL=ldap://ldapcluster.corecaixa:489
LDAP_USER_BASE=ou=People,o=caixa
LDAP_GROUP_BASE=ou=Groups, o=caixa
== 16955 node /opt/sicia/server/index.js
== 16965 /opt/sicia/.nvm/versions/node/v8.1.3/bin/node --max-old-space-size=2048 /opt/sicia/server/node_modules/workerpool/dist/worker.js
root@cctdcapllx0632:/opt/sicia#


 me ajdua achao o do hmp possivelmete ta errado



C:\Users\p585600>nslookup hmp.sicia.proinfo.caixa
Servidor:  dfaddssd001.corp.caixa.gov.br
Address:  10.222.149.10

Nome:    sp.frontend.proinfo.caixa
Address:  10.116.114.124
Aliases:  hmp.sicia.proinfo.caixa


C:\Users\p585600>
