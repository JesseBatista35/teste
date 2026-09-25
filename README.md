
p585600@SCTDEAPLLX0094:~$ sudo ls /opt/sicia/server/config/passport/
controladora.js  desktop.js  ldap-search.js  user.js
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$ sudo grep -rnEi 'bindDN|bindCredentials|bind_dn|binddn|credentials|password' \
>   /opt/sicia/server/config/passport/ /opt/sicia/server/services/ldap/libs/ldap.lib.js
/opt/sicia/server/config/passport/ldap-search.js:15:            passwordField: 'password',
/opt/sicia/server/config/passport/ldap-search.js:16:    }, async (matricula, password, done) => {
/opt/sicia/server/config/passport/ldap-search.js:24:                            let user_authenticated = await utils.buildUser(user, password)
/opt/sicia/server/config/passport/ldap-search.js:41:                    if (!(await utils.ldap_authenticate(user.dn, password)))
/opt/sicia/server/config/passport/ldap-search.js:56:                    let user_authenticated = await utils.buildUser(user, user_local, password)
/opt/sicia/server/config/passport/desktop.js:18:                passwordField: 'key',
/opt/sicia/server/config/passport/user.js:25:                           passwordField: 'password',
/opt/sicia/server/config/passport/user.js:27:                   async (matricula, password, done) => {
/opt/sicia/server/services/ldap/libs/ldap.lib.js:148:const bind = (ldaps, dn, password, done) => {
/opt/sicia/server/services/ldap/libs/ldap.lib.js:151:                   binddn: dn,
/opt/sicia/server/services/ldap/libs/ldap.lib.js:152:                   password: password
/opt/sicia/server/services/ldap/libs/ldap.lib.js:156:                           if (err == 'Error: Invalid credentials')
/opt/sicia/server/services/ldap/libs/ldap.lib.js:247:module.exports.authenticate = async (ldapServer, dn, password) => {
/opt/sicia/server/services/ldap/libs/ldap.lib.js:249:           return await promisify(bind)(ldapServer, dn, password)
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$
