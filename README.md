export no_proxy="$no_proxy,sicsn.caixa"
J=/tmp/bt_cookies.txt; rm -f $J
CA="--cacert /tmp/ac_interna_apl.pem"

TOKEN=$(curl -sS $CA -c $J -b $J -X POST https://sicsn.caixa/BeyondTrust/api/public/v3/auth/connect/token \
  -H "Content-Type: application/x-www-form-urlencoded" -d "grant_type=client_credentials&$BODY" | jq -r .access_token)
echo "token: ${TOKEN:0:10}..."

curl -sS $CA -o /dev/null -w "signappin HTTP %{http_code}\n" -c $J -b $J -X POST https://sicsn.caixa/BeyondTrust/api/public/v3/Auth/SignAppin -H "Authorization: Bearer $TOKEN" -H "Content-Type: application/json" -d ""

curl -sS $CA -o /dev/null -w "secrets HTTP %{http_code}\n" -c $J -b $J "https://sicsn.caixa/BeyondTrust/api/public/v3/Secrets-Safe/Secrets?FolderPath=SIIFX_BATCH_DES"

curl -sS $CA -o /dev/null -c $J -b $J -X POST https://sicsn.caixa/BeyondTrust/api/public/v3/Auth/Signout; rm -f $J
unset BODY TOKEN LOG
