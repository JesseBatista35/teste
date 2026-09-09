
-sh-4.2$ openssl s_client -connect api.des.caixa:8443 -showcerts </dev/null > /tmp/siali_chain.txt 2>&1
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ cd /tmp
-sh-4.2$ csplit -z -f cert- -b '%d.pem' siali_chain.txt '/-----BEGIN CERTIFICATE-----/' '{*}'
286
2314
2324
3521
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ awk '/-----BEGIN CERTIFICATE-----/{n++} /-----BEGIN CERTIFICATE-----/,/-----END CERTIFICATE-----/{print > "/tmp/cert-" n ".pem"}' /tmp/siali_chain.txt
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ for f in /tmp/cert-*.pem; do echo "== $f =="; openssl x509 -in $f -noout -subject; done
== /tmp/cert-0.pem ==
unable to load certificate
47767808230544:error:0906D06C:PEM routines:PEM_read_bio:no start line:pem_lib.c:707:Expecting: TRUSTED CERTIFICATE
== /tmp/cert-1.pem ==
subject= /C=BR/O=Caixa Economica Federal/CN=api.des.caixa
== /tmp/cert-2.pem ==
subject= /C=BR/O=Caixa Economica Federal/CN=AC Icptestes Sub
== /tmp/cert-3.pem ==
subject= /C=BR/O=Caixa Economica Federal/CN=AC Icptestes Raiz
-sh-4.2$
-sh-4.2$
-sh-4.2$ openssl x509 -in <arquivo-da-sub>.pem -noout -fingerprint -sha256
-sh: arquivo-da-sub: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$ openssl x509 -in <arquivo-da-raiz>.pem -noout -fingerprint -sha256
-sh: arquivo-da-raiz: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$ ac icptestes raiz  → 1A:65:82:0E:CD:DC:A7:30:87:03:F9:1D:80:C1:C3:12:29:00:C2:BF:25:DA:5F:B0:5F:3D:60:A7:A9:3C:F8:F1
-sh: ac: comando não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$ ac icptestes sub   → 90:83:77:EE:86:C2:38:33:98:9F:40:17:E2:D7:7E:37:AD:9E:7C:46:3B:68:DC:CA:9C:43:3E:8C:3F:36:B2:E2
-sh: ac: comando não encontrado
-sh-4.2$
