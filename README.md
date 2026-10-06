cd /tmp
cp -p /opt/ctmage/JRE/lib/security/cacerts /opt/ctmage/JRE/lib/security/cacerts.bkp.$(date +%Y%m%d%H%M)

echo | openssl s_client -connect sicsn.caixa:443 -showcerts 2>/dev/null \
 | awk '/BEGIN CERT/{n++} n==2{print} /END CERT/&&n==2{exit}' > ac_interna_apl.pem
openssl x509 -in ac_interna_apl.pem -noout -subject -issuer


for f in /etc/pki/ca-trust/source/anchors/*; do echo "$f: $(openssl x509 -in $f -noout -subject 2>/dev/null)"; done | grep -i interna

KS=/opt/ctmage/JRE/lib/security/cacerts
/opt/ctmage/JRE/bin/keytool -importcert -noprompt -alias ac-interna-apl -file /tmp/ac_interna_apl.pem -keystore $KS -storepass changeit
# se achou a raiz no passo 2:
# /opt/ctmage/JRE/bin/keytool -importcert -noprompt -alias ac-interna-caixa -file <arquivo_da_raiz> -keystore $KS -storepass changeit

/opt/ctmage/JRE/bin/keytool -list -keystore $KS -storepass changeit | grep -i "ac-interna"

/opt/ctmage/ctm/scripts/shut-ag -u ctmagelx -p ALL
/opt/ctmage/ctm/scripts/start-ag -u ctmagelx -p ALL
su - ctmagelx -c "ag_diag_comm" | grep -E "ping"



root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# cd /tmp
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# cp -p /opt/ctmage/JRE/lib/security/cacerts /opt/ctmage/JRE/lib/security/cacerts.bkp.$(date +%Y%m%d%H%M)
[root@caddeapllx2695 tmp]# echo | openssl s_client -connect sicsn.caixa:443 -showcerts 2>/dev/null \
 | awk '/BEGIN CERT/{n++} n==2{print} /END CERT/&&n==2{exit}' > ac_interna_apl.pem
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# openssl x509 -in ac_interna_apl.pem -noout -subject -issuer
subject=C = BR, O = Caixa Economica Federal, CN = AC Interna APL
issuer=C = BR, O = Caixa Economica Federal, CN = AC Interna Caixa
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# for f in /etc/pki/ca-trust/source/anchors/*; do echo "$f: $(openssl x509 -in $f -noout -subject 2>/dev/null)"; done | grep -i interna
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# KS=/opt/ctmage/JRE/lib/security/cacerts
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# /opt/ctmage/JRE/bin/keytool -importcert -noprompt -alias ac-interna-apl -file /tmp/ac_interna_apl.pem -keystore $KS -storepass changeit
Advertência: use a opção -cacerts para acessar a área de armazenamento de chaves cacerts
O certificado foi adicionado à área de armazenamento de chaves
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
