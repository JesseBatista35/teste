
-sh-4.2$ oc debug dc/sihdg-jboss8-des -n sihdg-des -- bash -c '
>   update-crypto-policies --show 2>/dev/null
>   cat /etc/crypto-policies/back-ends/java.config
>   cat /opt/server/bin/java.security.override'
Defaulting container name to sihdg-jboss8-des.
Use 'oc describe pod/sihdg-jboss8-des-debug -n sihdg-des' to see all of the containers in this pod.

Debugging with pod/sihdg-jboss8-des-debug, original command: <image entrypoint>
Waiting for pod to start ...
DEFAULT
jdk.certpath.disabledAlgorithms=MD2, MD5withDSA, MD5withECDSARIPEMD160withRSA, RIPEMD160withECDSA, RIPEMD160withRSAandMGF1, MD5withRSA, SHA1withRSA, SHA1withDSA, SHA1withECDSA, SHA224withDSA, SHA256withDSA, SHA384withDSA, SHA512withDSA, SHA1withRSAandMGF1, RSA keySize < 2048, DSA keySize < 2048, DH keySize < 2048, EC keySize < 256, SHA1, MD5
jdk.tls.disabledAlgorithms=MD2, MD5withDSA, MD5withECDSARIPEMD160withRSA, RIPEMD160withECDSA, RIPEMD160withRSAandMGF1, MD5withRSA, SHA1withRSA, SHA1withDSA, SHA1withECDSA, SHA224withDSA, SHA256withDSA, SHA384withDSA, SHA512withDSA, SHA1withRSAandMGF1, RSA keySize < 2048, DSA keySize < 2048, DH keySize < 2048, EC keySize < 256, include jdk.disabled.namedCurves, TLSv1.1, TLSv1, SSLv3, SSLv2, DTLSv1.0, DHE_DSS, RSA_EXPORT, DHE_DSS_EXPORT, DHE_RSA_EXPORT, DH_DSS_EXPORT, DH_RSA_EXPORT, DH_anon, ECDH_anon, DH_RSA, DH_DSS, ECDH, 3DES_EDE_CBC, DES_CBC, RC4_40, RC4_128, DES40_CBC, RC2, anon, NULL, HmacMD5
jdk.disabled.namedCurves=brainpoolP256r1, brainpoolP384r1, brainpoolP512r1, secp112r1, secp112r2, secp128r1, secp128r2, secp160k1, secp160r1, secp160r2, secp192k1, secp192r1, secp224k1, secp224r1, secp256k1, sect113r1, sect113r2, sect131r1, sect131r2, sect163k1, sect163r1, sect163r2, sect193r1, sect193r2, sect233k1, sect233r1, sect239k1, sect283k1, sect283r1, sect409k1, sect409r1, sect571k1, sect571r1, c2tnb191v1, c2tnb191v2, c2tnb191v3, c2tnb239v1, c2tnb239v2, c2tnb239v3, c2tnb359v1, c2tnb431r1, prime192v2, prime192v3, prime239v1, prime239v2, prime239v3, brainpoolP320r1
jdk.tls.legacyAlgorithms=
cat: /opt/server/bin/java.security.override: No such file or directory

Removing debug pod ...
-sh-4.2$ cat > java.security.override <<'EOF'
> jdk.certpath.disabledAlgorithms=MD2, MD5withDSA, MD5withECDSARIPEMD160withRSA, RIPEMD160withECDSA, RIPEMD160withRSAandMGF1, MD5withRSA, SHA1withDSA, SHA1withECDSA, SHA224withDSA, SHA256withDSA, SHA384withDSA, SHA512withDSA, SHA1withRSAandMGF1, RSA keySize < 2048, DSA keySize < 2048, DH keySize < 2048, EC keySize < 256, MD5
> jdk.tls.disabledAlgorithms=MD2, MD5withDSA, MD5withECDSARIPEMD160withRSA, RIPEMD160withECDSA, RIPEMD160withRSAandMGF1, MD5withRSA, SHA1withDSA, SHA1withECDSA, SHA224withDSA, SHA256withDSA, SHA384withDSA, SHA512withDSA, SHA1withRSAandMGF1, RSA keySize < 2048, DSA keySize < 2048, DH keySize < 2048, EC keySize < 256, include jdk.disabled.namedCurves, TLSv1.1, TLSv1, SSLv3, SSLv2, DTLSv1.0, DHE_DSS, RSA_EXPORT, DHE_DSS_EXPORT, DHE_RSA_EXPORT, DH_DSS_EXPORT, DH_RSA_EXPORT, DH_anon, ECDH_anon, DH_RSA, DH_DSS, ECDH, 3DES_EDE_CBC, DES_CBC, RC4_40, RC4_128, DES40_CBC, RC2, anon, NULL, HmacMD5
> EOF
-sh-4.2$
-sh-4.2$ oc create configmap sihdg-java-security --from-file=java.security.override -n sihdg-des
configmap/sihdg-java-security created
-sh-4.2$
-sh-4.2$ oc set volume dc/sihdg-jboss8-des -n sihdg-des --add \
>   --name=java-security-override --type=configmap \
>   --configmap-name=sihdg-java-security \
>   --mount-path=/opt/server/bin/java.security.override \
>   --sub-path=java.security.override
deploymentconfig.apps.openshift.io/sihdg-jboss8-des volume updated
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ java -Djava.security.properties=/opt/server/bin/java.security.override \
>        -XshowSettings:security:properties -version 2>&1 | grep disabledAlgorithms
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
