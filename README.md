p585600@10.116.94.221's password:
Last login: Wed Aug  5 16:25:11 2026 from 10.122.150.31
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ ip a
1: lo: <LOOPBACK,UP,LOWER_UP> mtu 65536 qdisc noqueue state UNKNOWN group default qlen 1000
    link/loopback 00:00:00:00:00:00 brd 00:00:00:00:00:00
    inet 127.0.0.1/8 scope host lo
       valid_lft forever preferred_lft forever
    inet6 ::1/128 scope host
       valid_lft forever preferred_lft forever
2: eth0: <BROADCAST,MULTICAST,UP,LOWER_UP> mtu 1500 qdisc mq state UP group default qlen 1000
    link/ether 00:50:56:8e:10:60 brd ff:ff:ff:ff:ff:ff
    inet 10.116.94.221/23 brd 10.116.95.255 scope global noprefixroute eth0
       valid_lft forever preferred_lft forever
    inet6 fe80::250:56ff:fe8e:1060/64 scope link
       valid_lft forever preferred_lft forever
3: eth1: <BROADCAST,MULTICAST,UP,LOWER_UP> mtu 1500 qdisc mq state UP group default qlen 1000
    link/ether 00:50:56:86:7d:9d brd ff:ff:ff:ff:ff:ff
    inet 192.168.229.113/19 brd 192.168.255.255 scope global noprefixroute eth1
       valid_lft forever preferred_lft forever
    inet6 fe80::250:56ff:fe86:7d9d/64 scope link
       valid_lft forever preferred_lft forever
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ openssl s_client -connect api.des,caixa:8443 -showcerts
getaddrinfo: Name or service not known
connect:errno=0
-sh-4.2$ openssl s_client -connect api.des.caixa:8443 -showcerts
CONNECTED(00000003)
depth=2 C = BR, O = Caixa Economica Federal, CN = AC Icptestes Raiz
verify error:num=19:self signed certificate in certificate chain
---
Certificate chain
 0 s:/C=BR/O=Caixa Economica Federal/CN=api.des.caixa
   i:/C=BR/O=Caixa Economica Federal/CN=AC Icptestes Sub
-----BEGIN CERTIFICATE-----
MIIGLDCCBBSgAwIBAgITfgAACGBHHE7tx+oGUAAAAAAIYDANBgkqhkiG9w0BAQ0F
ADBKMQswCQYDVQQGEwJCUjEgMB4GA1UEChMXQ2FpeGEgRWNvbm9taWNhIEZlZGVy
YWwxGTAXBgNVBAMTEEFDIEljcHRlc3RlcyBTdWIwHhcNMjYwMjA2MTQ0NTM1WhcN
MzEwMjA2MTQ1NTM1WjBHMQswCQYDVQQGEwJCUjEgMB4GA1UEChMXQ2FpeGEgRWNv
bm9taWNhIEZlZGVyYWwxFjAUBgNVBAMTDWFwaS5kZXMuY2FpeGEwggEiMA0GCSqG
SIb3DQEBAQUAA4IBDwAwggEKAoIBAQCjk/nvBDgsnAqzbrAsYZQ8MT3sTLDk5vsS
G+X0RSI5Ux2GQkb1z32gcY+PBvVq+gZH21SXGODJt0dCdP843/4eldbPpqy4xfkh
4LsUceo5bA9ZktfmuL+MD0WJKSPtF27yAFkFg3VlYKqH8J8qa8G/rgMs5Cmj5vqW
Ewp7kxhBcTRfKcfnbBQfMOyMCLJsG9T2rg9gHJ1jWFwgf7JGIvL300mQL7fybZo6
hiOsQ872SHoH3hFcVdidRWbMxW7nPCd0WAFgSry98BuZ9gZ0oTzgnWJDmGs4Ie/F
S3XUw2P4R5JFyUnJxV8kUgPjK2vH5DIM8e4iRhjiGsiSjoWoJ4hDAgMBAAGjggIM
MIICCDAOBgNVHQ8BAf8EBAMCBeAwHQYDVR0OBBYEFEpovJ94v/YoMTPt4L+2k8mV
UTV3MB8GA1UdIwQYMBaAFBQ0zW6zv8ylU1wosncj2BFFzzqMMGsGA1UdHwRkMGIw
YKBeoFyGLmh0dHA6Ly9pY3B0ZXN0ZXMuY2FpeGEvbGNycy9hY2ljcHRlc3Rlc3N1
Yi5jcmyGKkQ6XGljcHRlc3Rlcy5jYWl4YVxsY3JzXGFjaWNwdGVzdGVzc3ViLmNy
bDBLBggrBgEFBQcBAQQ/MD0wOwYIKwYBBQUHMAKGL2h0dHA6Ly9pY3B0ZXN0ZXMu
Y2FpeGEvY2VydHMvYWNpY3B0ZXN0ZXNzdWIuY2VyMAwGA1UdEwEB/wQCMAAwgc4G
A1UdEQSBxjCBw4INYXBpLmRlcy5jYWl4YYEbYWxleC5jLnBlcmVpcmFAY2FpeGEu
Z292LmJyoCIGBWBMAQMIoBkEF0NBSVhBIEVDT05PTUlDQSBGRURFUkFMoDoGBWBM
AQMEoDEELzAzMTExOTgzNzI3Nzg2OTUxNjgwMDAwMDAwMDAwMDAwMDAyODU3MDA3
U1NQIERGoBkGBWBMAQMDoBAEDjAwMzYwMzA1MDAwMTA0oBoGBWBMAQMCoBEED1JF
UTAwMDE0MjkzNzg3MzAdBgNVHSUEFjAUBggrBgEFBQcDAQYIKwYBBQUHAwIwDQYJ
KoZIhvcNAQENBQADggIBAA1STWSWw7kKqbCcVfhKFBp87Ks3YnlbqOWpUCyEqP4V
k+hOiqEaecHUrhxWO52zejRjKP0HQ9OKBV2qwsAG9V8Wv4mNGVcp/RZjys0PyAnm
VdJ0PmdwzBmyl1HMRbY3dybDk0hsD9UfoWwcyXE3oerWCBwaF/cnwtA5FbgZC0wP
+m4FiFJTDSuaV/4BqWj9Us0DIajHe64oPwlD/AenJ8ZLBm/tBAweULhYO3PqWSPw
q9kLwaOQE59bAvCfRyZ2Sj1GARqH7Daly3xEghE2aMOjryA6hx3NZQXjR0lOCMxk
GDXK2O0KkD6bVeVl/W+EiCbLm86lWT1V2DE5ZXFAKHgsyrLvQCKUpirQQcMrkdF1
FFBGx+PYQYqUMNPIU+wp85W9UoT3L6VKwx9Ud/PwIPgZrD1H0ccP2/GA0AOQ3A2j
2E6mJTY/F04M5Y7NrWD1I11DYf+N5AlkwvQkS7C6lfSGbwb/yuSNQ9X410ib8U1V
lp4r+kw8abx1WVc9+QtMJWx6YSHiTaXoZ/UDY8ZQPvSRTixgnuFMwHuy6rcbSQ4a
hc/c0XOAR/a08wrNRl52S07M2q87EGYBXlZKFWTwIdweQy+p16hjOcJa5aTTUvkE
WaMoHvBXTLHauayzonHC19CsErPX6kUDlX88cv8/sYe0l2OIrJGHcwOLMAwM35w9
-----END CERTIFICATE-----
 1 s:/C=BR/O=Caixa Economica Federal/CN=AC Icptestes Sub
   i:/C=BR/O=Caixa Economica Federal/CN=AC Icptestes Raiz
-----BEGIN CERTIFICATE-----
MIIGMDCCBBigAwIBAgITYAAAAAKZskudeQHqhAAAAAAAAjANBgkqhkiG9w0BAQ0F
ADBLMQswCQYDVQQGEwJCUjEgMB4GA1UEChMXQ2FpeGEgRWNvbm9taWNhIEZlZGVy
YWwxGjAYBgNVBAMTEUFDIEljcHRlc3RlcyBSYWl6MB4XDTIyMTIyMzE1NDcxN1oX
DTQyMTIyMzE1MDUxNFowSjELMAkGA1UEBhMCQlIxIDAeBgNVBAoTF0NhaXhhIEVj
b25vbWljYSBGZWRlcmFsMRkwFwYDVQQDExBBQyBJY3B0ZXN0ZXMgU3ViMIICIjAN
BgkqhkiG9w0BAQEFAAOCAg8AMIICCgKCAgEAst2nGAa3ECfF9eWbVoJpD6vSclO9
/T8on0+GON3QWWHebe4s50GWAUmHSUrLOIav/U4VmG17mp6KqSRpx98D/HpC3mr0
bhBtvLBIYjW/1K2TDIqTVNWOFZdncoAWse2DGqcrQf6aHmlx4GuYgun/xmcytSDc
75eUK+SGbwMvTwqiLL/zmOYjkKPiYeturUK1raQccN4NUyqpLwlhaNMOLiCJTJk6
m9ZzmBfCe4EplDjYw7xla3K7X+HgC3xgsfI0lXNbgEDq2bX7VEaRPtNoo4rcKd3k
0uQKYe1nVhYhfpDVjmxSEmQGL0OSoUMd8a/gX8atfSDroVOKiaUS2yL64Tlo2wo8
EmwhkTstKlf1oiyzo42wotvVshhZKsriG/URJBlz3bSJ5kd0zWNisHSoB/5uY11L
l9Ld3AP3b/IHiaTPnsTHi/EINfBW4vS1HwFA1FjA03zktWvQ5HDtL/eDGL4LWFem
iDEOcVihIBeqk8RkWw5brtJdO0INk57CuWTHlkcCPD1jAbl3Tej1iYEfAplRkrb3
qLGMXS44AclBWutcraM7fIEsI3xCEW/8/2sA2PUTvWtxgGHYmBitKLbJeyzjwFL0
1XZrCc2RZdX6B0Sloc+HEFdDxhgSgcUerh7/Ps2ySRMT6Qe+jFCt/Hf70ZBN0nkm
/sG7DSX5Ief9PFkCAwEAAaOCAQwwggEIMA4GA1UdDwEB/wQEAwIBBjAQBgkrBgEE
AYI3FQEEAwIBADAdBgNVHQ4EFgQUFDTNbrO/zKVTXCiydyPYEUXPOowwTgYDVR0g
BEcwRTBDBgVgTAEBCTA6MDgGCCsGAQUFBwIBFixodHRwOi8vYWNpbnRlcm5hLmNh
aXhhL2RvY3MvZHBjYWNpbnRlcm5hLnBkZjASBgNVHRMBAf8ECDAGAQH/AgEAMB8G
A1UdIwQYMBaAFPLmwWeBybJnyDqtpupHmV6nCJ1IMEAGA1UdHwQ5MDcwNaAzoDGG
L2h0dHA6Ly9pY3B0ZXN0ZXMuY2FpeGEvbGNycy9hY2ljcHRlc3Rlc3JhaXouY3Js
MA0GCSqGSIb3DQEBDQUAA4ICAQBDnd8halb3ewgCBVhLqrLuqZ2o5wFRvYD3x6RM
eeQtV8BjDjie39Y7tASUBEIeMGrmN/scdi/DS5kfUFMKgEPVZgcN87Drpx2ThG56
u5brRJhB2mnpoqKqyX2Zs5d+/FYGXyAt5ay+PAkaTj0rw/tD0oImm9krrCFVXoW1
QQyTR76qPow7xGeeBFfWGDS5xt2Rkt8V9VvMJkuU52UtUJE7nPl+pwtM66eRro4Y
bJRigZCMdEqRTXWiKFbKparIHxX7GEENZskazDgCIkPGykmBkzrgSTtqyzYYxd3J
Id9q5hunjR8gJflicZ4Vhd9RH8QMJhpEl1XCeTudnASgHtZGi0+LZ4KoRDLsunUJ
qdrNXkIxxhekBDYG50oikpJSbkwuJnF3TLl/ebnGQ9AyMpm/1j+l7SPLHdlikOTj
9dpo4KWbUvxKAsQIQsc7ialZcg3dK8CFUIzHiBwJ5sj2BlRtAHD2EkrGZcMHyaTx
s8iWKw1qoPsKJsByq+W5VGeg76kDiKX8MlCRUiNBLV9FeZsMyyPU54fbEBAXgEub
RpndoCQCoxKYSOWP/1GcEyOBwMp+kDrXJdPn+/udJwDRdVGQ64zFxluOFIhmfmLC
1Fz39Q2WQaGp17gCiZ2mY0GZsMuJSbtELE1Kchv2cavAzk1J9RGtFLX4FzeJEwFJ
37Qdxg==
-----END CERTIFICATE-----
 2 s:/C=BR/O=Caixa Economica Federal/CN=AC Icptestes Raiz
   i:/C=BR/O=Caixa Economica Federal/CN=AC Icptestes Raiz
-----BEGIN CERTIFICATE-----
MIIGDjCCA/agAwIBAgIQR7WD/84wO4BHunFtkI6I0jANBgkqhkiG9w0BAQ0FADBL
MQswCQYDVQQGEwJCUjEgMB4GA1UEChMXQ2FpeGEgRWNvbm9taWNhIEZlZGVyYWwx
GjAYBgNVBAMTEUFDIEljcHRlc3RlcyBSYWl6MB4XDTIyMTIyMzE0NTUxN1oXDTQy
MTIyMzE1MDUxNFowSzELMAkGA1UEBhMCQlIxIDAeBgNVBAoTF0NhaXhhIEVjb25v
bWljYSBGZWRlcmFsMRowGAYDVQQDExFBQyBJY3B0ZXN0ZXMgUmFpejCCAiIwDQYJ
KoZIhvcNAQEBBQADggIPADCCAgoCggIBAKnb8r8kcnH0A/TOd9VUKmEdVX/Xj1wA
wzQcF3kUp5HjLaOibzA2aeP4zqcOy9et/M+zJdeV/jErMXIDTG7EMiznfuxqByUd
MTHA1OB2KaYaR7XLsue0gPojTXjCl8ozBgwQOoYQFe8BoZHXL47ElpXSc2HRO951
c1extWDbo93FriY03Eu0sQY9hnORhPkB2Xyi1nc6WBOKybyEp1kSJNyAhV/6il4Y
riQB9r+1UodjeT8ULdr8FdTo5ffkLuLR18UQchj9A3IiwFgvN42sXYAqbyf0kG9Q
rgurIz8nhrskJsma+On8el8NMHeWL8j3v03r+eYpeEtvn1DAyQ0RY8OSBsH8LH6o
ylwQ29v6fJhQJzG1DHWsnWI1xCIi4H1LWDSShcl+mTBQNU7GYzH4JlJ6cSl9E2xD
RMItSmqKusSGIrx015Vpt1TqSzyTFUQPTwJ5wL6AQS4r5D0fGlhkD0zIuN46bFON
pfxEqVAYtbelbafcSNaDOI1yA0awX4CPO87RPAIo72H2GY0ZKS1NVTnwgbBed8wG
hF2cOIE5XrUVhwRM9O5O0XgzARvZimzTN1yIedQySC+/2VxTXTuVdq1j56J+9G/r
6hfILE/ziTp+DkKZbYTQCUVu1yyTalBRfZ2kxysj6QpeJshBl1nicRXfYBumF8Fk
u3lPckLNLpnVAgMBAAGjge0wgeowDgYDVR0PAQH/BAQDAgEGMA8GA1UdEwEB/wQF
MAMBAf8wHQYDVR0OBBYEFPLmwWeBybJnyDqtpupHmV6nCJ1IMEAGA1UdHwQ5MDcw
NaAzoDGGL2h0dHA6Ly9pY3B0ZXN0ZXMuY2FpeGEvbGNycy9hY2ljcHRlc3Rlc3Jh
aXouY3JsMBAGCSsGAQQBgjcVAQQDAgEAMFQGA1UdIARNMEswSQYFYEwBAQkwQDA+
BggrBgEFBQcCARYyaHR0cDovL2FjaW50ZXJuYS5jYWl4YS9kb2N1bWVudG9zL2Rw
Y2FjaW50ZXJuYS5wZGYwDQYJKoZIhvcNAQENBQADggIBAAmjd169D4f0Ue/CIqYc
3BRPHATZWydQ0UNU5Zwqq0kRDyHNpjF8jC1ZLcBUj1agtxlNqX/zo9brv6QsEtF4
rrrwJfQVsHUDIWEfaRYpO2zZdDGgn/MYb/O8XazsnGql7rHFy7vXGufbaNs6B4px
2oGmiUEyth2b8MFqt4vEWd0AXDXV33ZlrCXG1KPzsZis7sHbR2uuFDgoBAPYSTwp
n2IAyo6N/3IG6cENOqJ2Y15gqSOTNacsIEo4OgkuvlLy9bpj2wLCwA4VUscCXI5d
JruMTuLwM4EpeKhy8N/J0zMyJFS1/K/y1JVku5pEtkLQcbgqR21q9pnEDwUXgOAC
zMP/eEfhIqbL9WBLKTbvQktP8ZodGHfBZ1EQjW6b+CJzHH8BVdpqTzDlxKblcYRX
uraltOd+RBQdMLQRN/KiHxIbsEUoz0ReZewfFn0I4Y5V/WvyfgVRzIY4WzptkFZj
/tpE8eu/EaCZKrIBMmR9ch6y7/1j3pR68pbauf5CWu9u1lsre4eN1CDpssNkszoH
s7ao7IILeVTmaIybULacQM9G46QDs4LOGCqjzhlXb3o52MHM1dHDAdIcZHs6q182
OwuyYG1hNlcp8Zwhu0JlJ58zm0rnzjsUJ5Eq+vjvK5RwWM4UTotJXwzukeSzZn1s
8CBSA9oB/0MkE3U97ysdi+xl
-----END CERTIFICATE-----
---
Server certificate
subject=/C=BR/O=Caixa Economica Federal/CN=api.des.caixa
issuer=/C=BR/O=Caixa Economica Federal/CN=AC Icptestes Sub
---
No client certificate CA names sent
Client Certificate Types: RSA sign, ECDSA sign
Requested Signature Algorithms: RSA+SHA512:ECDSA+SHA512:RSA+SHA384:ECDSA+SHA384:RSA+SHA256:ECDSA+SHA256:RSA+SHA224:ECDSA+SHA224:RSA+SHA1:ECDSA+SHA1
Shared Requested Signature Algorithms: RSA+SHA512:ECDSA+SHA512:RSA+SHA384:ECDSA+SHA384:RSA+SHA256:ECDSA+SHA256:RSA+SHA224:ECDSA+SHA224:RSA+SHA1:ECDSA+SHA1
Peer signing digest: SHA512
Server Temp Key: ECDH, P-256, 256 bits
---
SSL handshake has read 5258 bytes and written 427 bytes
---
New, TLSv1/SSLv3, Cipher is ECDHE-RSA-AES256-GCM-SHA384
Server public key is 2048 bit
Secure Renegotiation IS supported
Compression: NONE
Expansion: NONE
No ALPN negotiated
SSL-Session:
    Protocol  : TLSv1.2
    Cipher    : ECDHE-RSA-AES256-GCM-SHA384
    Session-ID: 63BE825E9BDE28517CA7D563ED14F76D6E2EAC353532F36DC34207BBEC1E8E60
    Session-ID-ctx:
    Master-Key: D650A6FEC6B21C057CD015BD5100BA9A6CE3F52C28CE12470941BDCD28CB3DA778A7744E1B2282188B48C703EAAB44F0
    Key-Arg   : None
    Krb5 Principal: None
    PSK identity: None
    PSK identity hint: None
    Start Time: 1786045028
    Timeout   : 300 (sec)
    Verify return code: 19 (self signed certificate in certificate chain)
---
^C
-sh-4.2$
-sh-4.2$
-sh-4.2$ curl -v https://api.des.caixa:8443
* About to connect() to api.des.caixa port 8443 (#0)
*   Trying 10.116.80.221...
* Connected to api.des.caixa (10.116.80.221) port 8443 (#0)
* Initializing NSS with certpath: sql:/etc/pki/nssdb
*   CAfile: /etc/pki/tls/certs/ca-bundle.crt
  CApath: none
* Server certificate:
*       subject: CN=api.des.caixa,O=Caixa Economica Federal,C=BR
*       start date: Fev 06 14:45:35 2026 GMT
*       expire date: Fev 06 14:55:35 2031 GMT
*       common name: api.des.caixa
*       issuer: CN=AC Icptestes Sub,O=Caixa Economica Federal,C=BR
* NSS error -8172 (SEC_ERROR_UNTRUSTED_ISSUER)
* Peer's certificate issuer has been marked as not trusted by the user.
* Closing connection 0
curl: (60) Peer's certificate issuer has been marked as not trusted by the user.
More details here: http://curl.haxx.se/docs/sslcerts.html

curl performs SSL certificate verification by default, using a "bundle"
 of Certificate Authority (CA) public keys (CA certs). If the default
 bundle file isn't adequate, you can specify an alternate file
 using the --cacert option.
If this HTTPS server uses a certificate signed by a CA represented in
 the bundle, the certificate verification probably failed due to a
 problem with the certificate (it might be expired, or the name might
 not match the domain name in the URL).
If you'd like to turn off curl's verification of the certificate, use
 the -k (or --insecure) option.
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ ps -ef | grep sinad_node1_lx114 | grep -i '/usr[^ ]*java'
jboss      7777  27391  0 Jul31 ?        00:20:06 /usr/lib/jvm/jdk-1.8.0_471-oracle-x64/jre/bin/java -D[Server:sinad_node1_lx114] -Xms64m -Xmx256m -DSINAD.APIKEY=l7c40399e43fa140f7ae3bb42c15c5e9c5 -DSINAD.APIM_URL=https://api.des.caixa:8443 -DSINAD.CLIENT_ID=cli-ser-nad -DSINAD.CLIENT_SECRET=05530aab-6257-4c52-a6b3-91bf29626b65 -DSINAD.JCICS.SENHA=S7017256 -DSINAD.JCICS.USUARIO=SNADBD01 -DSINAD.SSO_URL=https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token -Djava.awt.headless=true -Djava.net.preferIPv4Stack=true -Djboss.bind.address=10.116.94.221 -Djboss.bind.address.management=10.116.94.221 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.89.0 -Djboss.home.dir=/opt/jboss/jboss-eap -Djboss.modules.system.pkgs=org.jboss.byteman -Djboss.server.log.dir=/opt/jboss/jboss-eap/hc/servers/sinad_node1_lx114/log -Djboss.server.temp.dir=/opt/jboss/jboss-eap/hc/servers/sinad_node1_lx114/tmp -Djboss.server.data.dir=/opt/jboss/jboss-eap/hc/servers/sinad_node1_lx114/data -Dlogging.configuration=file:/opt/jboss/jboss-eap/hc/servers/sinad_node1_lx114/data/logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules org.jboss.as.server
-sh-4.2$
-sh-4.2$
-sh-4.2$ d
