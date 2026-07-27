[p585600@srjdeapllx130 ~]$ curl -vk --max-time 10 https://logindes.caixa.gov.br/
* About to connect() to logindes.caixa.gov.br port 443 (#0)
*   Trying 10.116.81.75...
* Connected to logindes.caixa.gov.br (10.116.81.75) port 443 (#0)
* Initializing NSS with certpath: sql:/etc/pki/nssdb
* skipping SSL peer certificate verification
* SSL connection using TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256
* Server certificate:
*       subject: CN=logindes.caixa.gov.br
*       start date: Jun 16 00:00:00 2026 GMT
*       expire date: Dec 31 23:59:59 2026 GMT
*       common name: logindes.caixa.gov.br
*       issuer: CN=Sectigo Public Server Authentication CA DV R36,O=Sectigo Limited,C=GB
> GET / HTTP/1.1
> User-Agent: curl/7.29.0
> Host: logindes.caixa.gov.br
> Accept: */*
>
< HTTP/1.1 302 Found
< Date: Mon, 27 Jul 2026 17:32:28 GMT
< Server: Apache/2.4.46 (Unix)
< Location: https://logindes.caixa.gov.br/regotp/
< Content-Length: 0
< X-FRAME-OPTIONS: SAMEORIGIN
< X-XSS-Protection: 1;mode=block
< X-Content-type-options: nosniff
< Set-Cookie: ROUTEID=.; path=/; Secure; SameSite=Lax
<
* Connection #0 to host logindes.caixa.gov.br left intact
[p585600@srjdeapllx130 ~]$
[p585600@srjdeapllx130 ~]$
[p585600@srjdeapllx130 ~]$
[p585600@srjdeapllx130 ~]$ nslookup logindes.caixa.gov.br
Server:         10.116.76.216
Address:        10.116.76.216#53

Non-authoritative answer:
Name:   logindes.caixa.gov.br
Address: 10.116.81.75

[p585600@srjdeapllx130 ~]$ openssl s_client -connect logindes.caixa.gov.br:443 -servername logindes.caixa.gov.br 2>&1 | head -30
depth=1 C = GB, O = Sectigo Limited, CN = Sectigo Public Server Authentication CA DV R36
verify error:num=20:unable to get local issuer certificate
CONNECTED(00000003)
---
Certificate chain
 0 s:/CN=logindes.caixa.gov.br
   i:/C=GB/O=Sectigo Limited/CN=Sectigo Public Server Authentication CA DV R36
 1 s:/C=GB/O=Sectigo Limited/CN=Sectigo Public Server Authentication CA DV R36
   i:/C=GB/O=Sectigo Limited/CN=Sectigo Public Server Authentication Root R46
---
Server certificate
-----BEGIN CERTIFICATE-----
MIIGnDCCBQSgAwIBAgIRAL+RFfaSDrqc/cEBWHp0AswwDQYJKoZIhvcNAQELBQAw
YDELMAkGA1UEBhMCR0IxGDAWBgNVBAoTD1NlY3RpZ28gTGltaXRlZDE3MDUGA1UE
AxMuU2VjdGlnbyBQdWJsaWMgU2VydmVyIEF1dGhlbnRpY2F0aW9uIENBIERWIFIz
NjAeFw0yNjA2MTYwMDAwMDBaFw0yNjEyMzEyMzU5NTlaMCAxHjAcBgNVBAMTFWxv
Z2luZGVzLmNhaXhhLmdvdi5icjCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoC
ggEBAL+wlwY8Wli/qYUR72zycgjxMn/SUWYh9bUv+ZS9MN+Ji3vwtJnzToDI/Cpd
G9H0PoTi9TNKmlMZ5NxD4gCe81Oz35m9ST7DDXqnD98M3zOlg3Z9q/6rPAHs4Y7u
yuWSbK4k7mBB7JpAkHclzUGK3oXqerSPjlY2mMUDHzy+U2hoKbbRdIRMEJgoWX72
yZMBIfRmHQWHndK65wvDlL+5r9xVNU8BQ130PG6BZEfXmAq6lKqfA9JTokVjmNqv
mSe0s/vqc2culq0HeYqRbdRndLBZRXwnx98htcOo2nvaSz92h8yEiBG8CSwGW27G
YEuxsspykkZ0BZnyPTSbI6s/OUMCAwEAAaOCAw8wggMLMB8GA1UdIwQYMBaAFGjA
EhYYDq/O9oemMlejRlFdywcnMB0GA1UdDgQWBBTRPD2/vNxGy3sN81InihJkCAOo
vzAOBgNVHQ8BAf8EBAMCBaAwDAYDVR0TAQH/BAIwADATBgNVHSUEDDAKBggrBgEF
BQcDATBJBgNVHSAEQjBAMDQGCysGAQQBsjEBAgIHMCUwIwYIKwYBBQUHAgEWF2h0
dHBzOi8vc2VjdGlnby5jb20vQ1BTMAgGBmeBDAECATCBhAYIKwYBBQUHAQEEeDB2
ME8GCCsGAQUFBzAChkNodHRwOi8vY3J0LnNlY3RpZ28uY29tL1NlY3RpZ29QdWJs
aWNTZXJ2ZXJBdXRoZW50aWNhdGlvbkNBRFZSMzYuY3J0MCMGCCsGAQUFBzABhhdo
dHRwOi8vb2NzcC5zZWN0aWdvLmNvbTA7BgNVHREENDAyghVsb2dpbmRlcy5jYWl4

