-sh-4.2$ oc exec -it siecm-middleware-des-223-qtktl -- openssl s_client -connect 10.245.153.7:443 -servername sigaq.des.caixa
CONNECTED(00000003)
depth=0 C = BR, O = Caixa Economica Federal, CN = sigaq.des.caixa
verify error:num=20:unable to get local issuer certificate
verify return:1
depth=0 C = BR, O = Caixa Economica Federal, CN = sigaq.des.caixa
verify error:num=21:unable to verify the first certificate
verify return:1
depth=0 C = BR, O = Caixa Economica Federal, CN = sigaq.des.caixa
verify return:1
---
Certificate chain
 0 s:C = BR, O = Caixa Economica Federal, CN = sigaq.des.caixa
   i:C = BR, O = Caixa Economica Federal, CN = AC Icptestes Sub
---
Server certificate
-----BEGIN CERTIFICATE-----
MIIGNzCCBB+gAwIBAgITfgAACDnseVQBQ+a2ewAAAAAIOTANBgkqhkiG9w0BAQ0F
ADBKMQswCQYDVQQGEwJCUjEgMB4GA1UEChMXQ2FpeGEgRWNvbm9taWNhIEZlZGVy
YWwxGTAXBgNVBAMTEEFDIEljcHRlc3RlcyBTdWIwHhcNMjYwMTIyMTgzNjE3WhcN
MzEwMTIyMTg0NjE3WjBJMQswCQYDVQQGEwJCUjEgMB4GA1UEChMXQ2FpeGEgRWNv
bm9taWNhIEZlZGVyYWwxGDAWBgNVBAMTD3NpZ2FxLmRlcy5jYWl4YTCCASIwDQYJ
KoZIhvcNAQEBBQADggEPADCCAQoCggEBALNTymFuy7szrQLJzYGfTrvNTm2W6N0+
zr83nacF+qopALrQeQC+zUlnDRD7cW0rU0X3U/xLHNF2pvp4c6nLFGTyOlX/vnxo
uFw2MtMGS5IpMJdw6PF8N3R1H55Ep5nRUmRcXUawJTFVPstm437cDmNVqhb4Oweg
G3aH5Bsv6aDPkrLhDRswI/QjYQB7PhbxDeqewpTjgsMcL7TwoXY+37jlukhVzLhe
xMC4Kbhsyz1V6l2juxN6pD0gGckqY4KViqgTlrSxCUZmPlj80ateUu6N79vwAV0g
pnFVNvVGscnqAqBB/HMlce7F+2bZqwL1zNbXzL1/Doho/wPj/rEGdj0CAwEAAaOC
AhUwggIRMA4GA1UdDwEB/wQEAwIF4DAdBgNVHQ4EFgQUNL0fEO0V52x+waYu9Dmu
j9ELmwowHwYDVR0jBBgwFoAUFDTNbrO/zKVTXCiydyPYEUXPOowwawYDVR0fBGQw
YjBgoF6gXIYuaHR0cDovL2ljcHRlc3Rlcy5jYWl4YS9sY3JzL2FjaWNwdGVzdGVz
c3ViLmNybIYqRDpcaWNwdGVzdGVzLmNhaXhhXGxjcnNcYWNpY3B0ZXN0ZXNzdWIu
Y3JsMEsGCCsGAQUFBwEBBD8wPTA7BggrBgEFBQcwAoYvaHR0cDovL2ljcHRlc3Rl
cy5jYWl4YS9jZXJ0cy9hY2ljcHRlc3Rlc3N1Yi5jZXIwDAYDVR0TAQH/BAIwADCB
1wYDVR0RBIHPMIHMgg9zaWdhcS5kZXMuY2FpeGGBG2JydW5vLmIuZHVhcnRlQGNh
aXhhLmdvdi5icqAiBgVgTAEDCKAZBBdDQUlYQSBFQ09OT01JQ0EgRkVERVJBTKA6
BgVgTAEDBKAxBC8yNTAxMTk5OTA3MDIxNDY1MTA2MjEwNDY4MzE1MzYwNzAyMTQ2
NTEwNlNTUCBHT6AZBgVgTAEDA6AQBA4wMDM2MDMwNTAwMDEwNKAhBgVgTAEDAqAY
BBZCUlVOTyBCRVJOQVJERVMgRFVBUlRFMB0GA1UdJQQWMBQGCCsGAQUFBwMBBggr
BgEFBQcDAjANBgkqhkiG9w0BAQ0FAAOCAgEAdwO+412hj+3d2+jxccpNmxIa0yAl
+CAOKWrwYD3h9rKnQYROeSnt7l/484BOTj0wgfcCc6L6RysnUGFXVw1Qyy48V7iK
N1Kbf0GADbzrivJftYWMZJW55EyNXO2VGePySbEi9ZQ14riDxbD+8vfIiGoK4n+A
pFCa9GJVsiNQJWHOGrIS4RRmezmeALNKXW37ImJ/ad+hdn6fhNR8DUel82nSBBqq
Dv+I89WtB+mIfDWdaDs/eT50n09UJTihVwWQ8O7WVt4j4EywN+muojXvmkk4ajOc
+X5AohE6bt6AsbRnYCzFEZiQ2ZJWR9xF1NefRarZH0uHoD9EDz5U3B+PLYrmdlPj
AsdAOpiq4/B4FFT1aIsDa/jDsgX5vK5Q36CXAJFGjA2HvGcK2VKBJS0X4Ns4DhTr
6hgGjHrY50QkqDlnFJAj1er4Rj1rRucacv603dMkxnIL7jy052kHhdVN5/O5ccSn
f/N8seAdOxKlFzK6fERe0IPc5wzencCRskCKOA/qZL5iHxScU66hcAncPIvH3irx
gM0HwpgD+c3Rhvch62Pqi5RYv7JAeIG7wvA+pEJTOd6tN3DvvoKjFyPXg8ZAU6Lc
kGuUryd5Dw0vc7U2//eTshkzVOiWVJtnK+KsH0fzD+OAkn8uly2HrMV3l27GEO1Z
FHdW6V9rwj4dvdc=
-----END CERTIFICATE-----
subject=C = BR, O = Caixa Economica Federal, CN = sigaq.des.caixa

issuer=C = BR, O = Caixa Economica Federal, CN = AC Icptestes Sub

---
No client certificate CA names sent
Peer signing digest: SHA256
Peer signature type: RSA-PSS
Server Temp Key: X25519, 253 bits
---
SSL handshake has read 2085 bytes and written 393 bytes
Verification error: unable to verify the first certificate
---
New, TLSv1.3, Cipher is TLS_AES_256_GCM_SHA384
Server public key is 2048 bit
Secure Renegotiation IS NOT supported
Compression: NONE
Expansion: NONE
No ALPN negotiated
Early data was not sent
Verify return code: 21 (unable to verify the first certificate)
---
^Ccommand terminated with exit code 130
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -it siecm-middleware-des-223-qtktl -- which openssl
-sh-4.2$ oc exec -it siecm-middleware-des-223-qtktl -- openssl s_client -connect 10.245.153.7:443 -servername sigaq.des.caixa
CONNECTED(00000003)
depth=0 C = BR, O = Caixa Economica Federal, CN = sigaq.des.caixa
verify error:num=20:unable to get local issuer certificate
verify return:1
depth=0 C = BR, O = Caixa Economica Federal, CN = sigaq.des.caixa
verify error:num=21:unable to verify the first certificate
verify return:1
depth=0 C = BR, O = Caixa Economica Federal, CN = sigaq.des.caixa
verify return:1
---
Certificate chain
 0 s:C = BR, O = Caixa Economica Federal, CN = sigaq.des.caixa
   i:C = BR, O = Caixa Economica Federal, CN = AC Icptestes Sub
---
Server certificate
-----BEGIN CERTIFICATE-----
MIIGNzCCBB+gAwIBAgITfgAACDnseVQBQ+a2ewAAAAAIOTANBgkqhkiG9w0BAQ0F
ADBKMQswCQYDVQQGEwJCUjEgMB4GA1UEChMXQ2FpeGEgRWNvbm9taWNhIEZlZGVy
YWwxGTAXBgNVBAMTEEFDIEljcHRlc3RlcyBTdWIwHhcNMjYwMTIyMTgzNjE3WhcN
MzEwMTIyMTg0NjE3WjBJMQswCQYDVQQGEwJCUjEgMB4GA1UEChMXQ2FpeGEgRWNv
bm9taWNhIEZlZGVyYWwxGDAWBgNVBAMTD3NpZ2FxLmRlcy5jYWl4YTCCASIwDQYJ
KoZIhvcNAQEBBQADggEPADCCAQoCggEBALNTymFuy7szrQLJzYGfTrvNTm2W6N0+
zr83nacF+qopALrQeQC+zUlnDRD7cW0rU0X3U/xLHNF2pvp4c6nLFGTyOlX/vnxo
uFw2MtMGS5IpMJdw6PF8N3R1H55Ep5nRUmRcXUawJTFVPstm437cDmNVqhb4Oweg
G3aH5Bsv6aDPkrLhDRswI/QjYQB7PhbxDeqewpTjgsMcL7TwoXY+37jlukhVzLhe
xMC4Kbhsyz1V6l2juxN6pD0gGckqY4KViqgTlrSxCUZmPlj80ateUu6N79vwAV0g
pnFVNvVGscnqAqBB/HMlce7F+2bZqwL1zNbXzL1/Doho/wPj/rEGdj0CAwEAAaOC
AhUwggIRMA4GA1UdDwEB/wQEAwIF4DAdBgNVHQ4EFgQUNL0fEO0V52x+waYu9Dmu
j9ELmwowHwYDVR0jBBgwFoAUFDTNbrO/zKVTXCiydyPYEUXPOowwawYDVR0fBGQw
YjBgoF6gXIYuaHR0cDovL2ljcHRlc3Rlcy5jYWl4YS9sY3JzL2FjaWNwdGVzdGVz
c3ViLmNybIYqRDpcaWNwdGVzdGVzLmNhaXhhXGxjcnNcYWNpY3B0ZXN0ZXNzdWIu
Y3JsMEsGCCsGAQUFBwEBBD8wPTA7BggrBgEFBQcwAoYvaHR0cDovL2ljcHRlc3Rl
cy5jYWl4YS9jZXJ0cy9hY2ljcHRlc3Rlc3N1Yi5jZXIwDAYDVR0TAQH/BAIwADCB
1wYDVR0RBIHPMIHMgg9zaWdhcS5kZXMuY2FpeGGBG2JydW5vLmIuZHVhcnRlQGNh
aXhhLmdvdi5icqAiBgVgTAEDCKAZBBdDQUlYQSBFQ09OT01JQ0EgRkVERVJBTKA6
BgVgTAEDBKAxBC8yNTAxMTk5OTA3MDIxNDY1MTA2MjEwNDY4MzE1MzYwNzAyMTQ2
NTEwNlNTUCBHT6AZBgVgTAEDA6AQBA4wMDM2MDMwNTAwMDEwNKAhBgVgTAEDAqAY
BBZCUlVOTyBCRVJOQVJERVMgRFVBUlRFMB0GA1UdJQQWMBQGCCsGAQUFBwMBBggr
BgEFBQcDAjANBgkqhkiG9w0BAQ0FAAOCAgEAdwO+412hj+3d2+jxccpNmxIa0yAl
+CAOKWrwYD3h9rKnQYROeSnt7l/484BOTj0wgfcCc6L6RysnUGFXVw1Qyy48V7iK
N1Kbf0GADbzrivJftYWMZJW55EyNXO2VGePySbEi9ZQ14riDxbD+8vfIiGoK4n+A
pFCa9GJVsiNQJWHOGrIS4RRmezmeALNKXW37ImJ/ad+hdn6fhNR8DUel82nSBBqq
Dv+I89WtB+mIfDWdaDs/eT50n09UJTihVwWQ8O7WVt4j4EywN+muojXvmkk4ajOc
+X5AohE6bt6AsbRnYCzFEZiQ2ZJWR9xF1NefRarZH0uHoD9EDz5U3B+PLYrmdlPj
AsdAOpiq4/B4FFT1aIsDa/jDsgX5vK5Q36CXAJFGjA2HvGcK2VKBJS0X4Ns4DhTr
6hgGjHrY50QkqDlnFJAj1er4Rj1rRucacv603dMkxnIL7jy052kHhdVN5/O5ccSn
f/N8seAdOxKlFzK6fERe0IPc5wzencCRskCKOA/qZL5iHxScU66hcAncPIvH3irx
gM0HwpgD+c3Rhvch62Pqi5RYv7JAeIG7wvA+pEJTOd6tN3DvvoKjFyPXg8ZAU6Lc
kGuUryd5Dw0vc7U2//eTshkzVOiWVJtnK+KsH0fzD+OAkn8uly2HrMV3l27GEO1Z
FHdW6V9rwj4dvdc=
-----END CERTIFICATE-----
subject=C = BR, O = Caixa Economica Federal, CN = sigaq.des.caixa

issuer=C = BR, O = Caixa Economica Federal, CN = AC Icptestes Sub

---
No client certificate CA names sent
Peer signing digest: SHA256
Peer signature type: RSA-PSS
Server Temp Key: X25519, 253 bits
---
SSL handshake has read 2085 bytes and written 393 bytes
Verification error: unable to verify the first certificate
---
New, TLSv1.3, Cipher is TLS_AES_256_GCM_SHA384
Server public key is 2048 bit
Secure Renegotiation IS NOT supported
Compression: NONE
Expansion: NONE
No ALPN negotiated
Early data was not sent
Verify return code: 21 (unable to verify the first certificate)
---

