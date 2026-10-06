
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# LOG=$(grep -l "client_secret=" /opt/ctmage/ctm/cm/AI/CustomerLogs/*.xml | tail -1)
BODY=$(grep -o "client_id=[^<]*" $LOG | head -1 | sed 's/&amp;/\&/g')
echo "credencial carregada: ${#BODY} caracteres"
credencial carregada: 117 caracteres
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# export no_proxy="$no_proxy,sicsn.caixa"
J=/tmp/bt_cookies.txt; rm -f $J
CA="--cacert /tmp/ac_interna_apl.pem"

TOKEN=$(curl -sS $CA -c $J -b $J -X POST https://sicsn.caixa/BeyondTrust/api/public/v3/auth/connect/token \
  -H "Content-Type: application/x-www-form-urlencoded" -d "grant_type=client_credentials&$BODY" | jq -r .access_token)
echo "token: ${TOKEN:0:10}..."

curl -sS $CA -o /dev/null -w "signappin HTTP %{http_code}\n" -c $J -b $J -X POST https://sicsn.caixa/BeyondTrust/api/public/v3/Auth/SignAppin -H "Authorization: Bearer $TOKEN" -H "Content-Type: application/json" -d ""

curl -sS $CA -o /dev/null -w "secrets HTTP %{http_code}\n" -c $J -b $J "https://sicsn.caixa/BeyondTrust/api/public/v3/Secrets-Safe/Secrets?FolderPath=SIIFX_BATCH_DES"

curl -sS $CA -o /dev/null -c $J -b $J -X POST https://sicsn.caixa/BeyondTrust/api/public/v3/Auth/Signout; rm -f $J
unset BODY TOKEN LOG
token: eyJhbGciOi...
signappin HTTP 200
secrets HTTP 200
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
