# cadeia do sicsn.caixa
echo | openssl s_client -connect sicsn.caixa:443 -showcerts 2>/dev/null | grep -E "^ *[0-9] s:|i:"

# Java usado pelo agente/AI e se ele tem as CAs da Caixa
ls -la /opt/ctmage/JRE/lib/security/cacerts
/opt/ctmage/JRE/bin/keytool -list -cacerts -storepass changeit 2>/dev/null | grep -i caixa \
 || /opt/ctmage/JRE/bin/keytool -list -keystore /opt/ctmage/JRE/lib/security/cacerts -storepass changeit | grep -i caixa
