
p585600@SCTDEAPLLX0094:~$ sudo sed -n '1,40p' /opt/sicia/server/services/ldap/libs/ldap.lib.js
const {
        promisify
} = require('bluebird')
const LDAP = require('ldap-client')
const rest = require('./rest.lib.js')

const start = function (done) {
        try {
                let ldap_server = new LDAP({
                        uri: process.env.LDAP_URL,
                        validatecert: false,
                        connecttimeout: -1,
                        base: 'o=caixa',
                        timeout: 10000,
                        ntimeout: 5000,
                        attrs: '*',
                        filter: '(objectClass=*)',
                        scope: LDAP.SUBTREE,
                }, function (err) {
                        if (err) {
                                global.logger.log('error', '[ldap-service] conexão ldap' + err)
                                return done(err)
                        }
                        return done(null, ldap_server)
                })
        } catch (err) {
                global.logger.log('error', '[ldap-service] conexão ldap catch' + err)
                return done(err)
        }
}

const getPerfil = (ldaps, matricula, done) => {
        try {
                let search_options = {
                        base: process.env.LDAP_USER_BASE,
                        scope: LDAP.SUBTREE,
                        filter: 'uid=' + matricula,
                        attrs: '*'
                }

p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$ sudo sed -n '20,50p' /opt/sicia/server/config/passport/user.js
        passport.use(
                'user',
                new LocalStrategy(
                        {
                                usernameField: 'matricula',
                                passwordField: 'password',
                        },
                        async (matricula, password, done) => {
                                try {
                                        let user = await utils.findUser(matricula)
                                        // let users = await User.findAll()
                                        // for (let i in users) {
                                        //      users[i] = users[i].usuario
                                        // }
                                        if (!user) {
                                                return done(
                                                        null,
                                                        false,
                                                        'Matricula ou senha de usuário inválida.'
                                                )
                                        }

                                        user = user.toJSON()

                                        if (user.tipo == 0) user.nu_giseg_siico = null

                                        user.type = 'user'

                                        return done(null, user)
                                } catch (e) {
                                        return done(e)
p585600@SCTDEAPLLX0094:~$
