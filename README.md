
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# grep -n -A40 "Obter credencial" /opt/ctmage/ctm/cm/AI/apps-repo/IIFX/IIFX.xml | grep -E "stepName|<cookies|<headers|URLPath|WSheaders" | head
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# X=/opt/ctmage/ctm/cm/AI/apps-repo/IIFX/IIFX.xml
for k in "Secrets-Safe" "SignAppin" "Signout"; do
  echo "===== $k ====="
  grep -n -B60 -A20 "$k" $X | grep -E "URLPath|<cookies|<headers|headersPairs|<name|stepName|Name\"|SESSIONID|TOKEN" | grep -v "client_secret" | head -15
done
===== Secrets-Safe =====
660-              <name type="string">Obter credencial</name>
713:              <restURLPath type="string">/BeyondTrust/api/public/v3/Secrets-Safe/Secrets?FolderPath={{FOLDER}}</restURLPath>
===== SignAppin =====
491-              <name type="string">Login no Beyond Trust</name>
544:              <restURLPath type="string">/BeyondTrust/api/public/v3/Auth/SignAppin</restURLPath>
===== Signout =====
780-              <name type="string">Logout no Beyond Trust</name>
833:              <restURLPath type="string">/BeyondTrust/api/public/v3/Auth/Signout</restURLPath>
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
