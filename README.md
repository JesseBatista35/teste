[root@caddeapllx2484 p585600]# find / -name "*.esteiras*" -o -name "*wildcard*" 2>/dev/null | grep -iE "crt|pem|cer" | head -10
[root@caddeapllx2484 p585600]# find /etc/pki /opt/httpd/conf -name "*.crt" -o -name "*.pem" 2>/dev/null | head -10
/etc/pki/product-default/69.pem
/etc/pki/ca-trust/extracted/openssl/ca-bundle.trust.crt
/etc/pki/ca-trust/extracted/pem/tls-ca-bundle.pem
/etc/pki/ca-trust/extracted/pem/email-ca-bundle.pem
/etc/pki/ca-trust/extracted/pem/objsign-ca-bundle.pem
/etc/pki/ca-trust/source/anchors/katello-server-ca.pem
/etc/pki/ca-trust/source/ca-bundle.legacy.crt
/etc/pki/tls/cert.pem
/etc/pki/tls/certs/ca-bundle.crt
/etc/pki/tls/certs/ca-bundle.trust.crt
[root@caddeapllx2484 p585600]# openssl s_client -connect sicmu-intranet-update.esteiras.des.caixa:443 2>/dev/null | openssl x509 -text | grep -E "Subject:|Issuer:|DNS:"
        Issuer: C=BR, O=Caixa Economica Federal, CN=AC Icptestes Sub
        Subject: C=BR, O=Caixa Economica Federal, CN=*.esteiras.des.caixa
                DNS:*.esteiras.des.caixa, email:thiago-alves.silva@caixa.gov.br, othername:<unsupported>, othername:<unsupported>, othername:<unsupported>, othername:<unsupported>
[root@caddeapllx2484 p585600]#
