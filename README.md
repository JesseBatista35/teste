X=/opt/ctmage/ctm/cm/AI/apps-repo/IIFX/IIFX.xml
for k in "Secrets-Safe" "SignAppin" "Signout"; do
  echo "===== $k ====="
  grep -n -B60 -A20 "$k" $X | grep -E "URLPath|<cookies|<headers|headersPairs|<name|stepName|Name\"|SESSIONID|TOKEN" | grep -v "client_secret" | head -15
done
