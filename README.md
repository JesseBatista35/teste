oc exec <pod> -- keytool -list -keystore /opt/jboss/standalone/configuration/cacerts_sinfs_intra_des_2026.jks -storepass changeit | grep -i -E "digicert|microsoft"

curl -v -x proxydes.caixa:80 https://southcentralus-3.in.applicationinsights.azure.com

