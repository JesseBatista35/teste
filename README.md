
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$ sudo sed -n '10,75p' /opt/sicia/server/config/passport/ldap-search.js
const logger = require(`${process.env.ROOT_DIR}/src/logger`)

module.exports = function () {
        passport.use('ldap-search', new LocalStrategy({
                usernameField: 'matricula',
                passwordField: 'password',
        }, async (matricula, password, done) => {
                try {
                        if (utils.matriculas.includes(matricula)) {
                                matricula = utils.getGiseg(matricula.toUpperCase())
                                let user = await utils.ldap_getUser(matricula)
                                let user_local = await utils.findUser(matricula)
                                let user_local_group = user_local ? user_local.tipo : null
                                user.tipo = await utils.ldap_getGroup(matricula, user_local_group)
                                let user_authenticated = await utils.buildUser(user, password)
                                done(null, user_authenticated)
                        }

                        // validate ldap user
                        let user = await utils.ldap_getUser(matricula)
                        if (!user)
                                return done(null, false, utils.msg.not_auth)

                        // validate ldap group
                        let user_local = await utils.findUser(matricula)
                        let user_local_group = user_local ? user_local.tipo : null
                        user.tipo = await utils.ldap_getGroup(matricula, user_local_group)
                        if (!Number.isInteger(user.tipo))
                                return done(null, false, utils.msg.not_group)

                        // authenticate ldap user
                        if (!(await utils.ldap_authenticate(user.dn, password)))
                                return done(null, false, utils.msg.not_auth)

                        user = fixGiseg(user)
                        if (!user_local) {
                                user_local = await utils.createUser(user)
                        } else {
                                await utils.updateUser(user_local, {
                                        nome: user.nome,
                                        matricula: user.matricula,
                                        tipo: user.tipo,
                                        nu_giseg_siico: user.nu_giseg_siico
                                })
                        }

                        let user_authenticated = await utils.buildUser(user, user_local, password)
                        done(null, user_authenticated)
                } catch (e) {
                        logger.error(e)
                        return done(null, false, utils.msg.internnal_error)
                }
        }))

        passport.use('jwt', new JWTStrategy({
                jwtFromRequest: function (req) {
                        let token = null
                        if (req && req.cookies) token = req.cookies['siciaToken']

                        return token
                },
                secretOrKey: process.env.JWT_SECRET
        },
        async function (jwtPayload, cb) {
                const user = await User.findById(jwtPayload.id)

p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$ p585600@SCTDEAPLLX0094:~$ sudo sed -n '40,75p' /opt/sicia/server/src/libs/passport/utils.lib.js
                return null
        }
}
module.exports.createUser = async (user) => {
        try {
                let u = await User.create(user)
                return await JSONAPISerializer(u.toJSON())
        } catch (e) {
                logger.error('ldap-search createUser ', e)
                return null
        }
}
module.exports.updateUser = async (user, data) => {
        try {
                return user.update(data)
        } catch (e) {
                logger.error('ldap-search updateUser ', e)
                return null
        }
}
// ldap functions
module.exports.ldap_getUser = async (matricula) => {
        let response = null
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$
-bash: p585600@SCTDEAPLLX0094:~$: comando não encontrado
p585600@SCTDEAPLLX0094:~$                         fulfill(user)
-bash: erro de sintaxe próximo do `token' não esperado `user'
p585600@SCTDEAPLLX0094:~$                 } catch (e) {
-bash: erro de sintaxe próximo do `token' não esperado `}'
p585600@SCTDEAPLLX0094:~$                         logger.error('[libs] passport utils build user ', e)
-bash: erro de sintaxe próximo do `token' não esperado `'[libs] passport utils build user ','
p585600@SCTDEAPLLX0094:~$                 }
-bash: erro de sintaxe próximo do `token' não esperado `}'
p585600@SCTDEAPLLX0094:~$         })
-bash: erro de sintaxe próximo do `token' não esperado `}'
p585600@SCTDEAPLLX0094:~$ }
-bash: erro de sintaxe próximo do `token' não esperado `}'
p585600@SCTDEAPLLX0094:~$ module.exports.findUser = async (matricula) => {
-bash: erro de sintaxe próximo do `token' não esperado `('
p585600@SCTDEAPLLX0094:~$         try {
-bash: try: comando não encontrado
p585600@SCTDEAPLLX0094:~$                 return await User.findOne({
-bash: erro de sintaxe próximo do `token' não esperado `('
p585600@SCTDEAPLLX0094:~$                         where: { matricula: { $iLike: matricula } }
-bash: where:: comando não encontrado
p585600@SCTDEAPLLX0094:~$                 })
-bash: erro de sintaxe próximo do `token' não esperado `}'
p585600@SCTDEAPLLX0094:~$         } catch (e) {
-bash: erro de sintaxe próximo do `token' não esperado `}'
p585600@SCTDEAPLLX0094:~$                 logger.error('ldap-search findUser ', e)
-bash: erro de sintaxe próximo do `token' não esperado `'ldap-search findUser ','
p585600@SCTDEAPLLX0094:~$                 return null
-bash: return: null: numeric argument required
-bash: return: can only `return' from a function or sourced script
p585600@SCTDEAPLLX0094:~$         }
-bash: erro de sintaxe próximo do `token' não esperado `}'
p585600@SCTDEAPLLX0094:~$ }
-bash: erro de sintaxe próximo do `token' não esperado `}'
p585600@SCTDEAPLLX0094:~$ module.exports.createUser = async (user) => {
-bash: erro de sintaxe próximo do `token' não esperado `('
p585600@SCTDEAPLLX0094:~$         try {
-bash: try: comando não encontrado
p585600@SCTDEAPLLX0094:~$                 let u = await User.create(user)
-bash: erro de sintaxe próximo do `token' não esperado `('
p585600@SCTDEAPLLX0094:~$                 return await JSONAPISerializer(u.toJSON())
-bash: erro de sintaxe próximo do `token' não esperado `('
p585600@SCTDEAPLLX0094:~$         } catch (e) {
-bash: erro de sintaxe próximo do `token' não esperado `}'
p585600@SCTDEAPLLX0094:~$                 logger.error('ldap-search createUser ', e)
-bash: erro de sintaxe próximo do `token' não esperado `'ldap-search createUser ','
p585600@SCTDEAPLLX0094:~$                 return null
-bash: return: null: numeric argument required
-bash: return: can only `return' from a function or sourced script
p585600@SCTDEAPLLX0094:~$         }
-bash: erro de sintaxe próximo do `token' não esperado `}'
p585600@SCTDEAPLLX0094:~$ }
-bash: erro de sintaxe próximo do `token' não esperado `}'
p585600@SCTDEAPLLX0094:~$ module.exports.updateUser = async (user, data) => {
-bash: erro de sintaxe próximo do `token' não esperado `('
p585600@SCTDEAPLLX0094:~$         try {
-bash: try: comando não encontrado
p585600@SCTDEAPLLX0094:~$                 return user.update(data)
-bash: erro de sintaxe próximo do `token' não esperado `('
p585600@SCTDEAPLLX0094:~$         } catch (e) {
-bash: erro de sintaxe próximo do `token' não esperado `}'
p585600@SCTDEAPLLX0094:~$                 logger.error('ldap-search updateUser ', e)
-bash: erro de sintaxe próximo do `token' não esperado `'ldap-search updateUser ','
p585600@SCTDEAPLLX0094:~$                 return null
-bash: return: null: numeric argument required
-bash: return: can only `return' from a function or sourced script
p585600@SCTDEAPLLX0094:~$         }
-bash: erro de sintaxe próximo do `token' não esperado `}'
p585600@SCTDEAPLLX0094:~$ }
-bash: erro de sintaxe próximo do `token' não esperado `}'
p585600@SCTDEAPLLX0094:~$ // ldap functions
-bash: //: É um diretório
p585600@SCTDEAPLLX0094:~$ module.exports.ldap_getUser = async (matricula) => {
-bash: erro de sintaxe próximo do `token' não esperado `('
p585600@SCTDEAPLLX0094:~$         let response = null
-bash: let: =: syntax error: operand expected (error token is "=")
p585600@SCTDEAPLLX0094:~$ p585600@SCTDEAPLLX0094:~$
-bash: p585600@SCTDEAPLLX0094:~$: comando não encontrado
p585600@SCTDEAPLLX0094:~$ p585600@SCTDEAPLLX0094:~$
-bash: p585600@SCTDEAPLLX0094:~$: comando não encontrado
p585600@SCTDEAPLLX0094:~$ p585600@SCTDEAPLLX0094:~$
-bash: p585600@SCTDEAPLLX0094:~$: comando não encontrado
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$
}
module.exports.findUser = async (matricula) => {
        try {
                return await User.findOne({
p585600@SCTDEAPLLX0094:~$ p585600@SCTDEAPLLX0094:~$ sudo sed -n '40,75p' /opt/sicia/server/src/libs/passport/utils.lib.js
-bash: p585600@SCTDEAPLLX0094:~$: comando não encontrado
p585600@SCTDEAPLLX0094:~$                         fulfill(user)
-bash: erro de sintaxe próximo do `token' não esperado `user'
p585600@SCTDEAPLLX0094:~$                 } catch (e) {
-bash: erro de sintaxe próximo do `token' não esperado `}'
p585600@SCTDEAPLLX0094:~$                         logger.error('[libs] passport utils build user ', e)
-bash: erro de sintaxe próximo do `token' não esperado `'[libs] passport utils build user ','
p585600@SCTDEAPLLX0094:~$                 }
-bash: erro de sintaxe próximo do `token' não esperado `}'
p585600@SCTDEAPLLX0094:~$         })
-bash: erro de sintaxe próximo do `token' não esperado `}'
p585600@SCTDEAPLLX0094:~$ }
-bash: erro de sintaxe próximo do `token' não esperado `}'
p585600@SCTDEAPLLX0094:~$ module.exports.findUser = async (matricula) => {
-bash: erro de sintaxe próximo do `token' não esperado `('
p585600@SCTDEAPLLX0094:~$         try {
-bash: try: comando não encontrado
p585600@SCTDEAPLLX0094:~$                 return await User.findOne({
-bash: erro de sintaxe próximo do `token' não esperado `('
p585600@SCTDEAPLLX0094:~$                         where: { matricula: { $iLike: matricula } }
-bash: where:: comando não encontrado
p585600@SCTDEAPLLX0094:~$                 })
-bash: erro de sintaxe próximo do `token' não esperado `}'
p585600@SCTDEAPLLX0094:~$         } catch (e) {
-bash: erro de sintaxe próximo do `token' não esperado `}'
p585600@SCTDEAPLLX0094:~$                 logger.error('ldap-search findUser ', e)
-bash: erro de sintaxe próximo do `token' não esperado `'ldap-search findUser ','
p585600@SCTDEAPLLX0094:~$                 return null
-bash: return: null: numeric argument required
-bash: return: can only `return' from a function or sourced script
p585600@SCTDEAPLLX0094:~$         }
-bash: erro de sintaxe próximo do `token' não esperado `}'
p585600@SCTDEAPLLX0094:~$ }
-bash: erro de sintaxe próximo do `token' não esperado `}'
p585600@SCTDEAPLLX0094:~$ module.exports.createUser = async (user) => {
-bash: erro de sintaxe próximo do `token' não esperado `('
p585600@SCTDEAPLLX0094:~$         try {
-bash: try: comando não encontrado
p585600@SCTDEAPLLX0094:~$                 let u = await User.create(user)
-bash: erro de sintaxe próximo do `token' não esperado `('
p585600@SCTDEAPLLX0094:~$                 return await JSONAPISerializer(u.toJSON())
-bash: erro de sintaxe próximo do `token' não esperado `('
p585600@SCTDEAPLLX0094:~$         } catch (e) {
-bash: erro de sintaxe próximo do `token' não esperado `}'
p585600@SCTDEAPLLX0094:~$                 logger.error('ldap-search createUser ', e)
-bash: erro de sintaxe próximo do `token' não esperado `'ldap-search createUser ','
p585600@SCTDEAPLLX0094:~$                 return null
-bash: return: null: numeric argument required
-bash: return: can only `return' from a function or sourced script
p585600@SCTDEAPLLX0094:~$         }
-bash: erro de sintaxe próximo do `token' não esperado `}'
p585600@SCTDEAPLLX0094:~$ }
-bash: erro de sintaxe próximo do `token' não esperado `}'
p585600@SCTDEAPLLX0094:~$ module.exports.updateUser = async (user, data) => {
-bash: erro de sintaxe próximo do `token' não esperado `('
p585600@SCTDEAPLLX0094:~$         try {
-bash: try: comando não encontrado
p585600@SCTDEAPLLX0094:~$                 return user.update(data)
-bash: erro de sintaxe próximo do `token' não esperado `('
p585600@SCTDEAPLLX0094:~$         } catch (e) {
-bash: erro de sintaxe próximo do `token' não esperado `}'
p585600@SCTDEAPLLX0094:~$                 logger.error('ldap-search updateUser ', e)
-bash: erro de sintaxe próximo do `token' não esperado `'ldap-search updateUser ','
p585600@SCTDEAPLLX0094:~$                 return null
-bash: return: null: numeric argument required
-bash: return: can only `return' from a function or sourced script
p585600@SCTDEAPLLX0094:~$         }
-bash: erro de sintaxe próximo do `token' não esperado `}'
p585600@SCTDEAPLLX0094:~$ }
-bash: erro de sintaxe próximo do `token' não esperado `}'
p585600@SCTDEAPLLX0094:~$ // ldap functions
-bash: //: É um diretório
p585600@SCTDEAPLLX0094:~$ module.exports.ldap_getUser = async (matricula) => {
-bash: erro de sintaxe próximo do `token' não esperado `('
p585600@SCTDEAPLLX0094:~$         let response = null
-bash: let: =: syntax error: operand expected (error token is "=")
p585600@SCTDEAPLLX0094:~$ p585600@SCTDEAPLLX0094:~$
-bash: p585600@SCTDEAPLLX0094:~$: comando não encontrado
p585600@SCTDEAPLLX0094:~$ p585600@SCTDEAPLLX0094:~$
-bash: p585600@SCTDEAPLLX0094:~$: comando não encontrado
p585600@SCTDEAPLLX0094:~$ p585600@SCTDEAPLLX0094:~$
-bash: p585600@SCTDEAPLLX0094:~$: comando não encontrado
p585600@SCTDEAPLLX0094:~$
