cat > java.security.override <<'EOF'
jdk.certpath.disabledAlgorithms=MD2, MD5withDSA, MD5withECDSARIPEMD160withRSA, RIPEMD160withECDSA, RIPEMD160withRSAandMGF1, MD5withRSA, SHA1withDSA, SHA1withECDSA, SHA224withDSA, SHA256withDSA, SHA384withDSA, SHA512withDSA, SHA1withRSAandMGF1, RSA keySize < 2048, DSA keySize < 2048, DH keySize < 2048, EC keySize < 256, MD5
jdk.tls.disabledAlgorithms=MD2, MD5withDSA, MD5withECDSARIPEMD160withRSA, RIPEMD160withECDSA, RIPEMD160withRSAandMGF1, MD5withRSA, SHA1withDSA, SHA1withECDSA, SHA224withDSA, SHA256withDSA, SHA384withDSA, SHA512withDSA, SHA1withRSAandMGF1, RSA keySize < 2048, DSA keySize < 2048, DH keySize < 2048, EC keySize < 256, include jdk.disabled.namedCurves, TLSv1.1, TLSv1, SSLv3, SSLv2, DTLSv1.0, DHE_DSS, RSA_EXPORT, DHE_DSS_EXPORT, DHE_RSA_EXPORT, DH_DSS_EXPORT, DH_RSA_EXPORT, DH_anon, ECDH_anon, DH_RSA, DH_DSS, ECDH, 3DES_EDE_CBC, DES_CBC, RC4_40, RC4_128, DES40_CBC, RC2, anon, NULL, HmacMD5
EOF

oc create configmap sihdg-java-security --from-file=java.security.override -n sihdg-des

oc set volume dc/sihdg-jboss8-des -n sihdg-des --add \
  --name=java-security-override --type=configmap \
  --configmap-name=sihdg-java-security \
  --mount-path=/opt/server/bin/java.security.override \
  --sub-path=java.security.override

    java -Djava.security.properties=/opt/server/bin/java.security.override \
       -XshowSettings:security:properties -version 2>&1 | grep disabledAlgorithms
