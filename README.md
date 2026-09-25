
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$ sudo grep -n -A10 'findUser' /opt/sicia/server/config/passport/utils.js 2>/dev/null || \
> sudo grep -rn 'findUser *=' /opt/sicia/server --include=*.js --exclude-dir=node_modules | head
/opt/sicia/server/src/libs/passport/utils.lib.js:46:module.exports.findUser = async (matricula) => {
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$
p585600@SCTDEAPLLX0094:~$


ele disse isso
esse legado vai continuar funcionando por um tempo, e ele não vai ser atualizado, então não podemos alterar essas configurações ou vai dar pau
