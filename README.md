read -p "client_id: " CID; read -s -p "client_secret: " CSEC; echo
export no_proxy="$no_proxy,sicsn.caixa"
J=/tmp/bt_cookies.txt; rm -f $J

TOKEN=$(curl -s -c $J -b $J -X POST https://sicsn.caixa/BeyondTrust/api/public/v3/auth/connect/token \
  -H "Content-Type: application/x-www-form-urlencoded" \
  --data-urlencode grant_type=client_credentials --data-urlencode client_id="$CID" --data-urlencode client_secret="$CSEC" | jq -r .access_token)
echo "token: ${TOKEN:0:10}..."

curl -s -o /dev/null -w "signappin HTTP %{http_code}\n" -c $J -b $J -X POST https://sicsn.caixa/BeyondTrust/api/public/v3/Auth/SignAppin -H "Authorization: Bearer $TOKEN" -H "Content-Type: application/json" -d ""

curl -s -o /dev/null -w "secrets HTTP %{http_code}\n" -c $J -b $J "https://sicsn.caixa/BeyondTrust/api/public/v3/Secrets-Safe/Secrets?FolderPath=SIIFX_BATCH_DES"

curl -s -o /dev/null -c $J -b $J -X POST https://sicsn.caixa/BeyondTrust/api/public/v3/Auth/Signout; rm -f $J
