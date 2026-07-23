
I0723 19:26:42.768203       1 version.go:31] "version info" version="" commit="1e11cd2" buildDate="2024-10-04T10:20:06Z" component="vaultenv"
I0723 19:26:42.768297       1 main.go:184] "azure key vault env injector initializing"
I0723 19:26:42.768483       1 main.go:253] "found original container command" cmd="/usr/bin/java" args=["java","-jar","/opt/deploy/quarkus-run.jar"]
I0723 19:26:42.768538       1 authentication.go:110] "checking if current auth service credentials are stale" url="http://akv2k8s-envinjector.akv2k8s.svc:80/auth/silce-backend-valida-assinatura/silce-backend-valida-assinatura-tqs-779bb89578-gmjmc?secret=akv2k8s-silce-backend-valida-assinatura-tqs"
I0723 19:26:42.840349       1 authentication.go:123] "auth service credentials ok" url="http://akv2k8s-envinjector.akv2k8s.svc:80/auth/silce-backend-valida-assinatura/silce-backend-valida-assinatura-tqs-779bb89578-gmjmc?secret=akv2k8s-silce-backend-valida-assinatura-tqs"
I0723 19:26:42.840602       1 authentication.go:159] "requesting azure key vault oauth token" url="https://akv2k8s-envinjector.akv2k8s.svc:9443/auth/silce-backend-valida-assinatura/silce-backend-valida-assinatura-tqs-779bb89578-gmjmc"
I0723 19:26:42.889442       1 authentication.go:179] "successfully received oauth token"
E0723 19:26:43.011916       1 main.go:330] "failed to read secret from azure key vault" err=<
	GET https://kv-silce-des.vault.azure.net/secrets/VALIDA-ASSINATURA-APP-DES--ENV-SIPER-PASSWORD/
	--------------------------------------------------------------------------------
	RESPONSE 403: 403 Forbidden
	ERROR CODE: Forbidden
	--------------------------------------------------------------------------------
	{
	  "error": {
	    "code": "Forbidden",
	    "message": "Caller is not authorized to perform action on resource.\r\nIf role assignments, deny assignments or role definitions were changed recently, please observe propagation time.\r\nCaller: appid=7f91e84a-06ce-4e4d-9e0b-3b56af905e2c;oid=2fa137be-8e51-4220-a7c2-0e78525c9d23;iss=https://sts.windows.net/ab9bba98-684a-43fb-add8-9c2bebede229/\r\nAction: 'Microsoft.KeyVault/vaults/secrets/getSecret/action'\r\nResource: '/subscriptions/6f4fbd3a-59af-4d73-85dc-a8b37f48d892/resourcegroups/rg-silce-des/providers/microsoft.keyvault/vaults/kv-silce-des/secrets/valida-assinatura-app-des--env-siper-password'\r\nAssignment: (not found)\r\nDenyAssignmentId: null\r\nDecisionReason: null \r\nVault: kv-silce-des;location=brazilsouth\r\n",
	    "innererror": {
	      "code": "ForbiddenByRbac"
	    }
	  }
	}
	--------------------------------------------------------------------------------
 > azurekeyvaultsecret="silce-backend-valida-assinatura/akvs-env-siper-password"


 REASON
MESSAGE
COUNT
FIRST OCCURRED
LAST OCCURRED
BackOff
Back-off restarting failed container silce-backend-valida-assinatura-tqs in pod silce-backend-valida-assinatura-tqs-779bb89578-gmjmc_silce-backend-valida-assinatura(2327e340-f8d8-49d2-af37-7cc6f27f8c02)
9
2m ago
Today at 7:25 PM
52s ago
Today at 7:26 PM
Pulling
Pulling image "acrcentralcaixanprd.azurecr.io/silce/backend-valida-assinatura/silce-backend-valida-assinatura:30045899652"
5
2m ago
Today at 7:25 PM
1m ago
Today at 7:26 PM
Created
Container created
5
2m ago
Today at 7:25 PM
1m ago
Today at 7:26 PM
Started
Container started
5
2m ago
Today at 7:25 PM
1m ago
Today at 7:26 PM
Pulled
Successfully pulled image "acrcentralcaixanprd.azurecr.io/silce/backend-valida-assinatura/silce-backend-valida-assinatura:30045899652" in 97ms (97ms including waiting). Image size: 513098977 bytes.
1
1m ago
Today at 7:26 PM
1m ago
Today at 7:26 PM
Pulled
Successfully pulled image "acrcentralcaixanprd.azurecr.io/silce/backend-valida-assinatura/silce-backend-valida-assinatura:30045899652" in 88ms (88ms including waiting). Image size: 513098977 bytes.
1
1
