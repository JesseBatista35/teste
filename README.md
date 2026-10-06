LOG=$(grep -l "client_secret=" /opt/ctmage/ctm/cm/AI/CustomerLogs/*.xml | tail -1)
BODY=$(grep -o "client_id=[^<]*" $LOG | head -1 | sed 's/&amp;/\&/g')
J=/tmp/bt.txt; rm -f $J; CA="--cacert /tmp/ac_interna_apl.pem"

echo "--- token ---"
R=$(curl -sS $CA -D /tmp/h1 -c $J -b $J -X POST https://sicsn.caixa/BeyondTrust/api/public/v3/auth/connect/token -H "Content-Type: application/x-www-form-urlencoded" -d "grant_type=client_credentials&$BODY")
grep -i "^set-cookie" /tmp/h1 | cut -d= -f1
TOKEN=$(echo "$R" | jq -r .access_token)

echo "--- signappin ---"
curl -sS $CA -D /tmp/h2 -o /dev/null -c $J -b $J -X POST https://sicsn.caixa/BeyondTrust/api/public/v3/Auth/SignAppin -H "Authorization: Bearer $TOKEN" -H "Content-Type: application/json" -d ""
grep -i "^set-cookie" /tmp/h2 | cut -d= -f1

curl -sS $CA -o /dev/null -b $J -X POST https://sicsn.caixa/BeyondTrust/api/public/v3/Auth/Signout
rm -f $J /tmp/h1 /tmp/h2; unset BODY TOKEN R LOG
