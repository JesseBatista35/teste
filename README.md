5600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$ sudo grep -n -A25 'ldap_getGroup' /opt/sicia/server/src/libs/passport/utils.lib.js
90:module.exports.ldap_getGroup = async (matricula, tipo) => {
91-     let response = null
92-     try {
93-             response = await global.axios({
94-                     method: 'get',
95-                     url: `${process.env.SERVICE_LDAP}/api/ldap/group/`,
96-                     timeout: 1000,
97-                     params: {
98-                             matricula: matricula,
99-                             tipo: tipo
100-                    }
101-            })
102-            return response.data
103-    } catch (e) {
104-            return null
105-    }
106-}
107-module.exports.ldap_authenticate = async (dn, password) => {
108-    let response = null
109-    try {
110-            response = await global.axios({
111-                    method: 'get',
112-                    url: `${process.env.SERVICE_LDAP}/api/ldap/authenticate/`,
113-                    timeout: 1000,
114-                    data: {
115-                            dn: dn,
p585600@SCTDEAPLLX0094:~$ sudo sed -n '75,140p' /opt/sicia/server/services/ldap/libs/ldap.lib.js
                return done(err)
        }
}

const searchGroup = function (ldaps, group_name, done) {
        try {
                let search_options = {
                        base: process.env.LDAP_GROUP_BASE,
                        scope: LDAP.SUBTREE,
                        filter: 'cn=' + group_name,
                        attrs: '*'
                }

                ldaps.search(search_options, function (err, data) {
                        if (err) {
                                global.logger.log('error', '[ldap-service] aquisição grupo ldap: ' + group_name + err)
                                return done(err)
                        }
                        if (data.length != 0)
                                return done(null, data[0])
                        return done('Grupo Inexistente')
                })
        } catch (err) {
                global.logger.log('error', '[ldap-service] aquisicao grupo ldap catch ' + group_name + err)
                return done(err)
        }
}

const getGroup = (ldaps, matricula, tipo, done) => {
        try {
                let search_options = {
                        base: process.env.LDAP_GROUP_BASE,
                        scope: LDAP.SUBTREE,
                        filter: `(&(cn=${this.groups_name[tipo]})(uniqueMember=uid=${matricula},ou=People,o=caixa))`,
                        attrs: '*'
                }
                ldaps.search(search_options, function (err, data) {
                        if (err) {
                                global.logger.log('error', '[ldap-service] get group: ' + matricula + tipo + err)
                                return done(err)
                        }
                        if (data.length != 0)
                                return done(null, tipo) //group index
                        return done(null)
                })
        } catch (err) {
                global.logger.log('error', '[ldap-service] get group catch ' + matricula + tipo + err)
                return done(null)
        }
}

const findGroup = (ldaps, matricula, done) => {
        try {
                let search_options = {
                        base: process.env.LDAP_GROUP_BASE,
                        scope: LDAP.SUBTREE,
                        attrs: '*'
                }

                for (let i = 0; i < this.groups_name.length; i++) {
                        search_options.filter = `(&(cn=${this.groups_name[i]})(uniqueMember=uid=${matricula},ou=People,o=caixa))`
                        ldaps.search(search_options, function (err, data) {
                                if (data.length != 0) {
                                        return done(null, i)
                                }
                        })
p585600@SCTDEAPLLX0094:~$
