
-sh-4.2$ oc logs pod/debug-token-sisou-96vpp
=== PAYLOAD DECODIFICADO DO TOKEN ===
{
    "jti": "d050be97-f6e7-4885-85db-34949e2e9bc2",
    "exp": 1785851359,
    "nbf": 0,
    "iat": 1785851059,
    "iss": "https://login.des.caixa/auth/realms/intranet",
    "aud": "cli-ser-sou",
    "sub": "0e83d1de-afcf-43b4-9061-c9ef50320d44",
    "typ": "Bearer",
    "azp": "cli-ser-sou",
    "auth_time": 0,
    "session_state": "08064aa9-b94f-49eb-bf90-38a01308714b",
    "acr": "1",
    "allowed-origins": [
        "https://sisou-api-ouv-des.apps.nprd.caixa",
        "https://sisou-api-tqs2-tqs.apps.nprd.caixa",
        "https://sisou-front-des.apps.nprd.caixa"
    ],
    "realm_access": {
        "roles": [
            "SET_SERVICO",
            "offline_access",
            "uma_authorization"
        ]
    },
    "scope": "email profile",
    "co-unidade": "5552",
    "clientId": "cli-ser-sou",
    "email_verified": false,
    "clientHost": "10.116.222.199",
    "service_username": "SSOUTAED",
    "preferred_username": "service-account-cli-ser-sou",
    "clientAddress": "10.116.222.199",
    "email": "service-account-cli-ser-sou@placeholder.org"
}
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods | grep debug-token
debug-token-sisou-96vpp                      0/1       Completed   0             2m38s
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$


