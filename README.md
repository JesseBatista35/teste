tenho acesso a partir de uma vm jumper integrada a mesma vnet. O que consegui validar foi o seguinte:
 
azurelocaladm@AZJUMPDEAPLLX975:~$ kubectl get pods -n sigaq-api-gestao-documental

NAME                                               READY   STATUS    RESTARTS       AGE
sigaq-api-gestao-documental-des-645499956f-4q69t   1/1     Running   1 (105m ago)   108m
 
 
azurelocaladm@AZJUMPDEAPLLX975:~$ kubectl exec -it -n sigaq-api-gestao-documental sigaq-api-gestao-documental-des-645499956f-4q69t -- /bin/sh

Defaulted container "sigaq-api-gestao-documental-des" out of: sigaq-api-gestao-documental-des, copy-azurekeyvault-env (init)

# 

# getent hosts sigda-api-quarkus-des.apps.nprd.caixa
10.116.180.64   sigda-api-quarkus-des.apps.nprd.caixa
 
 
Isso indica que:
 
✅ O pod conseguiu consultar o DNS.

✅ O nome sigda-api-quarkus-des.apps.nprd.caixa foi resolvido.

✅ O destino aponta para o IP 10.116.180.64.

✅ Não há indícios de problema de resolução de nomes entre o AKS e o ambiente on-premises.
 
 
validando a ferramenta de diagnóstico TLS/SSL (RESUMO):
 
# openssl s_client -connect sigda-api-quarkus-des.apps.nprd.caixa:443
CONNECTED(00000003)
 
New, TLSv1.3, Cipher is TLS_AES_128_GCM_SHA256
 
SSL handshake has read 3668 bytes and written 407 bytes
 
subject=C = BR, O = Caixa Economica Federal, CN = *.apps.nprd.caixa
 
HTTP/1.1 408 Request Time-out
 
 
A saída so SSL indica que:
 
✅O pod conseguiu estabelecer sessão TCP com o destino na porta 443.

✅O handshake TLS foi concluído com sucesso.

✅O tráfego chegou até a aplicação ou balanceador remoto.

✅ Houve resposta do servidor.

✅ Não existe bloqueio de rede entre AKS DES e o ambiente on-premises DES para esse destino.

 
Sobre o erro de certificado, recebi o seguinte:
 
Verify return code: 21 (unable to verify the first certificate)
 
Isso significa apenas que o container não possui na truststore a cadeia certificadora necessária para validar o certificado apresentado pelo servidor. Como o handshake TLS ocorreu normalmente, a rede está funcional.
 
saída completa do SSL, se precisar: 
 
# openssl s_client -connect sigda-api-quarkus-des.apps.nprd.caixa:443

CONNECTED(00000003)

depth=0 C = BR, O = Caixa Economica Federal, CN = *.apps.nprd.caixa

verify error:num=20:unable to get local issuer certificate

verify return:1

depth=0 C = BR, O = Caixa Economica Federal, CN = *.apps.nprd.caixa

verify error:num=21:unable to verify the first certificate

verify return:1

depth=0 C = BR, O = Caixa Economica Federal, CN = *.apps.nprd.caixa

verify return:1

---

Certificate chain

0 s:C = BR, O = Caixa Economica Federal, CN = *.apps.nprd.caixa

   i:C = BR, O = Caixa Economica Federal, CN = AC Icptestes Sub

   a:PKEY: rsaEncryption, 2048 (bit); sigalg: RSA-SHA512

   v:NotBefore: Jul 18 15:07:38 2024 GMT; NotAfter: Jul 18 15:17:38 2029 GMT

1 s:C = BR, O = Caixa Economica Federal, CN = AC Icptestes Raiz

   i:C = BR, O = Caixa Economica Federal, CN = AC Icptestes Raiz

   a:PKEY: rsaEncryption, 4096 (bit); sigalg: RSA-SHA512

   v:NotBefore: Dec 23 14:55:17 2022 GMT; NotAfter: Dec 23 15:05:14 2042 GMT

---

Server certificate

-----BEGIN CERTIFICATE-----

MIIGGTCCBAGgAwIBAgITfgAAAl3BLYZF8uPFMQAAAAACXTANBgkqhkiG9w0BAQ0F

ADBKMQswCQYDVQQGEwJCUjEgMB4GA1UEChMXQ2FpeGEgRWNvbm9taWNhIEZlZGVy

YWwxGTAXBgNVBAMTEEFDIEljcHRlc3RlcyBTdWIwHhcNMjQwNzE4MTUwNzM4WhcN

MjkwNzE4MTUxNzM4WjBLMQswCQYDVQQGEwJCUjEgMB4GA1UEChMXQ2FpeGEgRWNv

bm9taWNhIEZlZGVyYWwxGjAYBgNVBAMMESouYXBwcy5ucHJkLmNhaXhhMIIBIjAN

BgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmTrcEcti2MtHHvbB7DXNoErEZNCT

fgMJV5M75kD/SrXOlkcK2PmIEmVcADGwTgNyxF+rDZ1keb3cQ2KBRWbH6q1phWL2

clBpSRHJueCKK3PNgH52DXFZtkJBmOHnbHJ/xW9ntJ6tvcWi+rCJMcZjL1ML6UX/

dNf7q2+CkaYXyidls0WLFPoUacYRx8pPWJQOzOxvJPAYdWN82XZMduf2zdT5qgR5

ABA6iGpqEXMmaiPM+/hB4uGzqhXj279QkOaAx22Tzz+ZFj3PgY6BKCIYlAwlYSWx

cY9cZ9jyD+dYCD7FPiY9bBDw19qGiZKabqWigsIzLgIjs6HGo6EkA+ZVMQIDAQAB

o4IB9TCCAfEwDgYDVR0PAQH/BAQDAgXgMB0GA1UdDgQWBBRlP5xePOmXByiIEo6j

ufIh7LuJLzAfBgNVHSMEGDAWgBQUNM1us7/MpVNcKLJ3I9gRRc86jDBrBgNVHR8E

ZDBiMGCgXqBchi5odHRwOi8vaWNwdGVzdGVzLmNhaXhhL2xjcnMvYWNpY3B0ZXN0

ZXNzdWIuY3JshipEOlxpY3B0ZXN0ZXMuY2FpeGFcbGNyc1xhY2ljcHRlc3Rlc3N1

Yi5jcmwwSwYIKwYBBQUHAQEEPzA9MDsGCCsGAQUFBzAChi9odHRwOi8vaWNwdGVz

dGVzLmNhaXhhL2NlcnRzL2FjaWNwdGVzdGVzc3ViLmNlcjAMBgNVHRMBAf8EAjAA

MIHWBgNVHREEgc4wgcuCESouYXBwcy5ucHJkLmNhaXhhgRthbGV4LmMucGVyZWly

YUBjYWl4YS5nb3YuYnKgIgYFYEwBAwigGQQXQ0FJWEEgRUNPTk9NSUNBIEZFREVS

QUygOgYFYEwBAwSgMQQvMDMxMTE5ODM3Mjc3ODY5NTE2ODAwMDAwMDAwMDAwMDAw

MDI4NTcwMDdTU1AgREagGQYFYEwBAwOgEAQOMDAzNjAzMDUwMDAxMDSgHgYFYEwB

AwKgFQQTQWxleCBDb3JyZWEgUGVyZWlyYTANBgkqhkiG9w0BAQ0FAAOCAgEAhJCT

3jfFIbSEe4o0/TpaTRAg2/8LnBu+x896GpYjbdCSyLnSu7shl/GtebF6/yyJ6hr1

oW0LJKVzrXQ0dACkThByk7xtj3pLCPWhWta/lD7MKHIvbv01eV2jwi0mCGJCy7+e

NJEyYOlub88psJiZvM5/rSjoAAA+ppnRdQEi1HSTh6bOUuRbojFyUsN/F40l+/jk

nwnovJXGk0aeinIcw0Iy7AP1Ob0aaLwfuoayO/0/PIxU6v7ht5CUGG3b0UJY4Oom

hOn6DDZXXGkpUmBzdbkoJ18hlnavvwzLrYDX7HXqFVBiClfFMoQEJn9x1i3hM+IJ

q+St0HfRh0O+e8gggPQN9wXR5bePg2Sg0GlwlMYoY6a1fR2XH6zYEwqfudM83VsE

4/D56ADmOowzmK2vh6dJUk4WTAqeA0OLorFQVLNY85YO5oOxqvV1KrXv4LlKCXQv

zUaAdbPdJgQNCGVXcCAJsCIsUcQIK2/UmcpEQX9Xzf9I8GJA8va9r5o79O5DSrh6

3KdFkuz8jJgq0Z5HCMkfi3WtwZfdva7LAikavQRylBU5gmHnhI4cMUcbHsh0HifG

3ItyvMFlfO+Ck+GuBD+TriVgHLkgRdjUW23WIDnvmr8/qqXQtb8nPhsbj6Wur5FL

2ygLgrZ3fP4tPRiow85puPcI75i9fiBkWsI+5DE=

-----END CERTIFICATE-----

subject=C = BR, O = Caixa Economica Federal, CN = *.apps.nprd.caixa

issuer=C = BR, O = Caixa Economica Federal, CN = AC Icptestes Sub

---

No client certificate CA names sent

Peer signing digest: SHA256

Peer signature type: RSA-PSS

Server Temp Key: X25519, 253 bits

---

SSL handshake has read 3668 bytes and written 407 bytes

Verification error: unable to verify the first certificate

---

New, TLSv1.3, Cipher is TLS_AES_128_GCM_SHA256

Server public key is 2048 bit

Secure Renegotiation IS NOT supported

Compression: NONE

Expansion: NONE

No ALPN negotiated

Early data was not sent

Verify return code: 21 (unable to verify the first certificate)

---

---

Post-Handshake New Session Ticket arrived:

SSL-Session:

    Protocol  : TLSv1.3

    Cipher    : TLS_AES_128_GCM_SHA256

    Session-ID: 6CFECBF066466EB9B9B4893E755D4D3C9CEEC7F1F328FB5478F7682C46300B3D

    Session-ID-ctx: 

    Resumption PSK: BA7FF2757D569B16492E75C15A473B13868A069176E62F0D149E9A1B288094FB

    PSK identity: None

    PSK identity hint: None

    SRP username: None

    TLS session ticket lifetime hint: 7200 (seconds)

    TLS session ticket:

    0000 - 5f 77 31 29 19 02 73 37-39 a7 ec 9a 7d 8e 8e f7   _w1)..s79...}...

    0010 - 5d 02 cb 7a ac e6 9d 7a-70 a1 20 c3 d7 3e ea d8   ]..z...zp. ..>..

    0020 - 65 c2 90 41 d9 f4 34 d4-61 21 61 3e 31 71 7f 2f   e..A..4.a!a>1q./

    0030 - c4 25 76 ef 59 14 87 98-66 99 b1 8b 2d 92 00 82   .%v.Y...f...-...

    0040 - 2a 99 91 61 c4 c2 20 90-3b 07 fe 43 f2 7e 68 b1   *..a.. .;..C.~h.

    0050 - 6e 99 6d a6 e8 a5 96 5f-47 87 25 59 99 b1 82 73   n.m...._G.%Y...s

    0060 - 89 6b 6d 80 db cc c8 9f-63 93 8c 9e 13 ee fa 28   .km.....c......(

    0070 - f4 7b 59 15 19 b7 a2 27-ac ab a8 16 29 a7 2c a3   .{Y....'....).,.

    0080 - af 82 cd 79 2a 41 68 66-22 17 bd e1 08 a1 de 1f   ...y*Ahf".......

    0090 - 02 52 a9 2a 79 85 61 46-22 d8 f5 43 9b 43 b9 13   .R.*y.aF"..C.C..

    00a0 - aa 48 8f 4b dd 44 7f ff-da ca 26 61 e2 a9 d9 c6   .H.K.D....&a....

    00b0 - a8 b2 52 87 e5 20 16 8c-37 71 dc 3e 8c 1d ae 12   ..R.. ..7q.>....

    00c0 - 34 66 02 6d 05 59 9a 0e-28 da d1 31 08 2e 33 06   4f.m.Y..(..1..3.

    00d0 - 31 81 70 be d2 7e b8 54-08 b1 91 12 32 8d 99 f7   1.p..~.T....2...
 
    Start Time: 1788968009

    Timeout   : 7200 (sec)

    Verify return code: 21 (unable to verify the first certificate)

    Extended master secret: no

    Max Early Data: 0

---

read R BLOCK

---

Post-Handshake New Session Ticket arrived:

SSL-Session:

    Protocol  : TLSv1.3

    Cipher    : TLS_AES_128_GCM_SHA256

    Session-ID: 9CF6920A9A36BB9F6C2BB77B931ACF23AF7CBE80320FE14EE411EC5FAFDDC487

    Session-ID-ctx: 

    Resumption PSK: 9386CCDB1D1BC9CEBF94A06D17EE8007C000829AEBFD3482FABA62E11CACD512

    PSK identity: None

    PSK identity hint: None

    SRP username: None

    TLS session ticket lifetime hint: 7200 (seconds)

    TLS session ticket:

    0000 - 5f 77 31 29 19 02 73 37-39 a7 ec 9a 7d 8e 8e f7   _w1)..s79...}...

    0010 - 3b dd 51 ec 2d a6 29 81-99 1a 4e d8 ee 9a de 0a   ;.Q.-.)...N.....

    0020 - ba bb 46 a6 25 6c 17 5d-cc b4 b9 ed 9c 6d 39 16   ..F.%l.].....m9.

    0030 - 93 49 0a c9 77 34 21 6e-b7 12 bb 6c 40 93 cc 49   .I..w4!n...l@..I

    0040 - 38 82 bd 7f 83 67 b3 5d-12 cd 5b f7 4a e3 e1 04   8....g.]..[.J...

    0050 - 17 f3 ab 42 14 3d 4f 45-ff 7a 60 25 3e d3 22 dc   ...B.=OE.z`%>.".

    0060 - 20 dc 23 63 04 f3 5e 41-7d 0a 4f 84 8f 69 30 cd    .#c..^A}.O..i0.

    0070 - 37 43 3e 2a 06 97 78 fd-d4 78 76 c1 3f 32 c8 3c   7C>*..x..xv.?2.<

    0080 - 1a 09 92 ee 95 7a ff a2-df 32 a5 3c b1 8e 3d 83   .....z...2.<..=.

    0090 - 5d 5f c1 1a c4 79 39 5e-f5 a7 64 e3 28 a4 f9 54   ]_...y9^..d.(..T

    00a0 - e7 dd 9e e7 6b 47 0d 26-18 58 0a b5 b8 09 98 90   ....kG.&.X......

    00b0 - d2 3b d7 8b 87 9f 95 d0-1d 57 49 4e 23 f7 04 80   .;.......WIN#...

    00c0 - 3e 4f 4c 82 5b 04 0d 42-20 d5 04 a8 3b 3a cf 37   >OL.[..B ...;:.7

    00d0 - e8 46 a8 5a c1 81 e1 7d-05 13 b5 22 a5 75 02 ae   .F.Z...}...".u..
 
    Start Time: 1788968009

    Timeout   : 7200 (sec)

    Verify return code: 21 (unable to verify the first certificate)

    Extended master secret: no

    Max Early Data: 0

---

read R BLOCK

HTTP/1.1 408 Request Time-out

content-length: 110

cache-control: no-cache

Content-Type: text/html

connection: close
 
<html><body><h1>408 Request Time-out</h1>

Your browser didn't send a complete request in time.
</body></html>

closed

# azurelocaladm@AZJUMPDEAPLLX975:~$ 

azurelocaladm@AZJUMPDEAPLLX975:~$ kubectl get pods -n sigaq-api-gestao-documental

NAME                                               READY   STATUS    RESTARTS       AGE

sigaq-api-gestao-documental-des-645499956f-4q69t   1/1     Running   1 (105m ago)   108m/bin/sh: 16: azurelocaladm@AZJUMPDEAPLLX975:~$: 

not found

# /bin/sh: 17: azurelocaladm@AZJUMPDEAPLLX975:~$: not found

# /bin/sh: 18: NAME: not found

# 
 
estou indo para o intervalo, se precisar de mais alguma informação na volta coletamos!
 
