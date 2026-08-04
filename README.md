-sh-4.2$ cat > ~/debug-token.sh << 'EOF'
> set -euo pipefail
> KEYCLOAK_AUTH_SERVER_URL="$(printenv KEYCLOAK_AUTH_SERVER_URL)/realms/intranet/protocol/openid-connect/token"
> CLIENT_ID="cli-ser-sou"
> CLIENT_SECRET="$(printenv KEYCLOAK_CREDENTIAL_SECRET)"
> CA_BUNDLE="/etc/ssl/custom-ca/ca-bundle.pem"
>
> TOKEN=$(curl -s --cacert "${CA_BUNDLE}" -X POST "${KEYCLOAK_AUTH_SERVER_URL}" \
>   -H "Content-Type: application/x-www-form-urlencoded" \
>   -d "grant_type=client_credentials" \
>   -d "client_id=${CLIENT_ID}" \
>   -d "client_secret=${CLIENT_SECRET}" \
>   | sed -n 's/.*"access_token":"\([^"]*\)".*/\1/p')
>
> echo "=== PAYLOAD DECODIFICADO DO TOKEN ==="
> PAYLOAD=$(echo "$TOKEN" | cut -d '.' -f2)
> # ajusta padding base64
> MOD=$(( ${#PAYLOAD} % 4 ))
> if [ $MOD -eq 2 ]; then PAYLOAD="${PAYLOAD}=="; fi
> if [ $MOD -eq 3 ]; then PAYLOAD="${PAYLOAD}="; fi
> echo "$PAYLOAD" | base64 -d 2>/dev/null | python3 -m json.tool
> EOF
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get cronjob agendamento-sisou -o json | python3 -c "
> import json, sys
> cj = json.load(sys.stdin)
> job_spec = cj['spec']['jobTemplate']['spec']
> with open('/home/p585600/debug-token.sh') as f:
>     script = f.read()
> job_spec['template']['spec']['containers'][0]['args'] = [script]
> job = {
>     'apiVersion': 'batch/v1',
>     'kind': 'Job',
>     'metadata': {'name': 'debug-token-sisou', 'namespace': 'sisou-des'},
>     'spec': job_spec
> }
> print(json.dumps(job))
> " > ~/job-debug-token.json

-sh-4.2$
-sh-4.2$ oc create -f ~/job-debug-token.json
job.batch/debug-token-sisou created
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -l job-name=debug-token-sisou -w
NAME                      READY     STATUS      RESTARTS   AGE
debug-token-sisou-96vpp   0/1       Completed   0          7s
debug-token-sisou-96vpp   0/1       Completed   0         7s
^C-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs -l job-name=debug-token-siso
error: You must provide one or more resources by argument or filename.
Example resource specifications include:
   '-f rsrc.yaml'
   '--filename=rsrc.json'
   '<resource> <name>'
   '<resource>'
-sh-4.2$
