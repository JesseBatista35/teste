
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$ sudo grep -rn -A10 'groups_name *=' /opt/sicia/server/services/ldap/ --include=*.js
/opt/sicia/server/services/ldap/libs/ldap.lib.js:170:module.exports.groups_name = [
/opt/sicia/server/services/ldap/libs/ldap.lib.js-171-   'CIA_GESTORGESFI',
/opt/sicia/server/services/ldap/libs/ldap.lib.js-172-   'CIA_GERENTEGISEG',
/opt/sicia/server/services/ldap/libs/ldap.lib.js-173-   'CIA_GISEG',
/opt/sicia/server/services/ldap/libs/ldap.lib.js-174-   'CIA_AUDITOR',
/opt/sicia/server/services/ldap/libs/ldap.lib.js-175-   'CIA_TI',
/opt/sicia/server/services/ldap/libs/ldap.lib.js-176-   'CIA_OPERADORCENTRAL', // 'CIA_OPERADORMONIT',
/opt/sicia/server/services/ldap/libs/ldap.lib.js-177-   'CIA_MANTENEDORA',
/opt/sicia/server/services/ldap/libs/ldap.lib.js-178-   'CIA_VISUALNACIONAL',
/opt/sicia/server/services/ldap/libs/ldap.lib.js-179-   'CIA_VISUALREGIONAL',
/opt/sicia/server/services/ldap/libs/ldap.lib.js-180-]
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$ sudo grep -rn 'groups_name' /opt/sicia/server/services/ldap/ --include=*.js | head
/opt/sicia/server/services/ldap/libs/ldap.lib.js:108:                   filter: `(&(cn=${this.groups_name[tipo]})(uniqueMember=uid=${matricula},ou=People,o=caixa))`,
/opt/sicia/server/services/ldap/libs/ldap.lib.js:134:           for (let i = 0; i < this.groups_name.length; i++) {
/opt/sicia/server/services/ldap/libs/ldap.lib.js:135:                   search_options.filter = `(&(cn=${this.groups_name[i]})(uniqueMember=uid=${matricula},ou=People,o=caixa))`
/opt/sicia/server/services/ldap/libs/ldap.lib.js:170:module.exports.groups_name = [
/opt/sicia/server/services/ldap/libs/dataman.lib.js:52:         for (let i in lib.groups_name) {
/opt/sicia/server/services/ldap/libs/dataman.lib.js:54:                         let pgroup = await lib.searchGroup(ldapServer, lib.groups_name[i])
p585600@SCTDEAPLLX0094:~$
