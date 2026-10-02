# dono/permissão do arquivo E de cada diretório do caminho (falta de x no diretório também causa isso)
namei -l /opt/batch/securefiles/caixa-truststore-acteste-nprd.jks
id f517263

# teste com o próprio usuário da rotina
sudo -u f517263 head -c1 /opt/batch/securefiles/caixa-truststore-acteste-nprd.jks >/dev/null && echo OK


chgrp <grupo_do_f517263> /opt/batch/securefiles/caixa-truststore-acteste-nprd.jks
chmod 640 /opt/batch/securefiles/caixa-truststore-acteste-nprd.jks
chmod 750 /opt/batch/securefiles     # se o diretório também estiver bloqueado

keytool -list -keystore /opt/batch/securefiles/caixa-truststore-acteste-nprd.jks | grep -i -E "caixa|ac"
openssl s_client -connect login.des.caixa:443 -showcerts </dev/null 2>/dev/null | grep -E "s:|i:"
