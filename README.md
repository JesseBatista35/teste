
p585600@SCTDEAPLLX0094:~$ sudo sed -n '40,75p' /opt/sicia/server/src/libs/passport/utils.lib.js
                        fulfill(user)
                } catch (e) {
                        logger.error('[libs] passport utils build user ', e)
                }
        })
}
module.exports.findUser = async (matricula) => {
        try {
                return await User.findOne({
                        where: { matricula: { $iLike: matricula } }
                })
        } catch (e) {
                logger.error('ldap-search findUser ', e)
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
p585600@SCTDEAPLLX0094:~$
