
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$ openssl pkcs12 -info -in /opt/keystore/s-4570-5_CERT.p12 -noout -passin pass:'G8KwaJ'
MAC Iteration 10000
MAC verified OK
PKCS7 Data
Shrouded Keybag: PKCS7 Encrypted data: Certificate bag
Certificate bag
Certificate bag
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$ openssl pkcs12 -in /opt/keystore/s-4570-5_CERT.p12 -out /tmp/cert_full.pem -nodes -passin pass:'G8KwaJ'
MAC verified OK
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$ openssl pkcs12 -export -in /tmp/cert_full.pem -inkey /tmp/cert_full.pem \
>   -out /tmp/s-4570-5_CERT_legacy.p12 \
>   -name sincad-b3 \
>   -passout pass:'G8KwaJ' \
>   -certpbe PBE-SHA1-3DES -keypbe PBE-SHA1-3DES -macalg sha1
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$  keytool -list -v -storetype PKCS12 -keystore /tmp/s-4570-5_CERT_legacy.p12 -storepass 'G8KwaJ' 2>&1 | grep -E "Alias|Valid from|Owner"
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$  keytool -list -v -storetype PKCS12 -keystore /tmp/s-4570-5_CERT_legacy.p12 -storepass 'G8KwaJ' 2>&1 | grep -E "Alias|Valid from|Owner"
[p585600@cspdeapllx011 ~]$
