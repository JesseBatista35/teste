echo | openssl s_client -connect login.des.caixa:443 -servername login.des.caixa -showcerts 2>/dev/null | \
awk '/-----BEGIN CERTIFICATE-----/,/-----END CERTIFICATE-----/' > ~/login-des-caixa-chain.pem


cat ~/login-des-caixa-chain.pem

oc create configmap sso-des-ca-bundle \
  --from-file=ca-bundle.pem=~/login-des-caixa-chain.pem \
  -n sisou-des


  cat > ~/patch-add-ca-volume.json << 'EOF'
[
  {
    "op": "add",
    "path": "/spec/jobTemplate/spec/template/spec/volumes",
    "value": [
      {
        "name": "sso-ca-bundle",
        "configMap": {
          "name": "sso-des-ca-bundle"
        }
      }
    ]
  },
  {
    "op": "add",
    "path": "/spec/jobTemplate/spec/template/spec/containers/0/volumeMounts",
    "value": [
      {
        "name": "sso-ca-bundle",
        "mountPath": "/etc/ssl/custom-ca",
        "readOnly": true
      }
    ]
  }
]
EOF

oc patch cronjob agendamento-sisou --type='json' -p="$(cat ~/patch-add-ca-volume.json)"


--cacert /etc/ssl/custom-ca/ca-bundle.pem








-sh-4.2$ echo | openssl s_client -connect login.des.caixa:443 -servername login.des.caixa -showcerts 2>/dev/null | \
> awk '/-----BEGIN CERTIFICATE-----/,/-----END CERTIFICATE-----/' > ~/login-des-caixa-chain.pem
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ cat ~/login-des-caixa-chain.pem
-----BEGIN CERTIFICATE-----
MIIGETCCA/mgAwIBAgITfgAAAUOuXT7qpUIoqAAAAAABQzANBgkqhkiG9w0BAQ0F
ADBKMQswCQYDVQQGEwJCUjEgMB4GA1UEChMXQ2FpeGEgRWNvbm9taWNhIEZlZGVy
YWwxGTAXBgNVBAMTEEFDIEljcHRlc3RlcyBTdWIwHhcNMjQwNjA0MTYxNDE2WhcN
MjkwNjA0MTYyNDE2WjBJMQswCQYDVQQGEwJCUjEgMB4GA1UEChMXQ2FpeGEgRWNv
bm9taWNhIEZlZGVyYWwxGDAWBgNVBAMTD2xvZ2luLmRlcy5jYWl4YTCCASIwDQYJ
KoZIhvcNAQEBBQADggEPADCCAQoCggEBAOusG5L8tv58TfBQdEG97I/uLffR622e
n7xJE1fy7KrsoFL3Cs9jhPMdB0i+/nZNmkesj03jh4PIjW/92WleC2xMmtj383Wy
wH9oMWo+gDx05ui4xqVpQUanZjDhjNv2uFiP29NwFmfLDnO7fZvgeOXSRUBGKqER
eARNTRYO39KuANLuBsCZewraJ3uhyN5wvArQ/7IlI/ukv4SrWUtDWe51C+nM3lrD
QWkjVnLpoIcAjq9iEA//kdWoH8PoGlzXm6wweB1VZhVpSExTxrrq1M6Z1o3myDWq
9KYLl9mkaItz7UxAhKg495amepuAt2e9i2piUDHBJDyDeORL82l7AicCAwEAAaOC
Ae8wggHrMA4GA1UdDwEB/wQEAwIF4DAdBgNVHQ4EFgQU0GC7+pZIMlADctUm/mgy
MVPGubswHwYDVR0jBBgwFoAUFDTNbrO/zKVTXCiydyPYEUXPOowwawYDVR0fBGQw
YjBgoF6gXIYuaHR0cDovL2ljcHRlc3Rlcy5jYWl4YS9sY3JzL2FjaWNwdGVzdGVz
c3ViLmNybIYqRDpcaWNwdGVzdGVzLmNhaXhhXGxjcnNcYWNpY3B0ZXN0ZXNzdWIu
Y3JsMEsGCCsGAQUFBwEBBD8wPTA7BggrBgEFBQcwAoYvaHR0cDovL2ljcHRlc3Rl
cy5jYWl4YS9jZXJ0cy9hY2ljcHRlc3Rlc3N1Yi5jZXIwDAYDVR0TAQH/BAIwADCB
0AYDVR0RBIHIMIHFgg9sb2dpbi5kZXMuY2FpeGGBG2FsZXguYy5wZXJlaXJhQGNh
aXhhLmdvdi5icqAiBgVgTAEDCKAZBBdDQUlYQSBFQ09OT01JQ0EgRkVERVJBTKA6
BgVgTAEDBKAxBC8wMzExMTk4MzcyNzc4Njk1MTY4MDAwMDAwMDAwMDAwMDAwMjg1
NzAwN1NTUCBERqAZBgVgTAEDA6AQBA4wMDM2MDMwNTAwMDEwNKAaBgVgTAEDAqAR
BA9SRVEwMDAxMjU5ODM5NzEwDQYJKoZIhvcNAQENBQADggIBAJIfsyQ3MBcFtWXv
X4NonP/yVj3/rYC4y9IGVJbTWkNEnSoThvdBWp6SojMaz01tCcKqStTkzFbLfZx2
+BbwwLGtilSCGkJyWlfE3yqowApMjB31MfFqbePRFvfOf8Li4W4UtTIAE0mTevkV
cn59vEljc4HLN/T/d3lrhC8DJEnEge9k5bHOExyjzKlhJ1DOwQnXRQ2onTlCApln
0K35v4ISRzW+iHpCw1+u2KA8SIUM7mZwCheuBgV47yUt7GWMT+smhsbY09iPIQIA
H9WvZ+AyQ+ASOQcz6Ab5Y7CufNsIdygR6dIgh6VgPHWox5/L+tEbTw2LB+85p1kn
fMmiXmaY+SMmm+5t0m9y1tRMhVc1owZGh3Y3oCdnrODtf1Ox+asOHCx0IRmUCsp2
01irG452TYS5YC9ybWVhRPva9vB1JoYgD13Cnz2CZscamTlpOhSR/b9mVNHBRywb
9wswcq/p+kDWY6pFMq//qaolF7GmKnDx3SbJmuDbXtRas0kD1UJl9wy6O02RbL+z
1dxcZ4+6Rim3hnlx+qSarP5aVUiq2YIlsATBipgmgbcIk6227IvoE0KufKIro2Cy
+wN9ptnD9vRTw6qONgzwJ9zAkqHN1+drIM/EhtyhAwPq3Ok5Wa9PQS8PpOjFGCWI
O6BEyJltrmvIehbPDL7oFO5CeUEP
-----END CERTIFICATE-----
-----BEGIN CERTIFICATE-----
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
37Qdxg==
-----END CERTIFICATE-----
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
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc create configmap sso-des-ca-bundle \
>   --from-file=ca-bundle.pem=~/login-des-caixa-chain.pem \
>   -n sisou-des
error: error reading ~/login-des-caixa-chain.pem: no such file or directory
-sh-4.2$
-sh-4.2$
-sh-4.2$
