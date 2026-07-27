container secrets-check

ERRO: Nao foram encontrados arquivos com segredos no diretorio '/usr/src/app/secrets_files'.


secretis-agent-sidecar


2026-07-27 13:57:43,351 INFO Getting secrets just once, POLLING_WAIT_BETWEEN_REQUESTS_MINUTES was not configured
2026-07-27 13:57:43,351 INFO (2390d31a-89c3-11f1-ac87-0a58190123e9) APP VERSION: 2.1.0
2026-07-27 13:57:43,351 INFO (2390d31a-89c3-11f1-ac87-0a58190123e9) Starting Execution...2390d31a-89c3-11f1-ac87-0a58190123e9
2026-07-27 13:57:43,351 INFO (2390d31a-89c3-11f1-ac87-0a58190123e9) You are using: <,> as List delimiter
2026-07-27 13:57:43,352 WARNING (2390d31a-89c3-11f1-ac87-0a58190123e9) InsecureRequestWarning: Unverified HTTPS request is being made to host https://sicsn.caixa/BeyondTrust/api/public/v3'. Adding certificate verification isstrongly advised. See: https://urllib3.readthedocs.io/en/1.26.x/advanced-usage.html#ssl-warnings
2026-07-27 13:57:43,352 INFO (2390d31a-89c3-11f1-ac87-0a58190123e9) Certificate was not configured
2026-07-27 13:57:43,355 DEBUG (2390d31a-89c3-11f1-ac87-0a58190123e9) How long to wait for the server to connect and send data before giving up: connection timeout: 30 seconds, request timeout 30 seconds
2026-07-27 13:57:43,355 WARNING (2390d31a-89c3-11f1-ac87-0a58190123e9) verify_ca=false is insecure, it instructs the caller to not verify the certificate authority when making API calls.
2026-07-27 13:57:43,425 INFO (2390d31a-89c3-11f1-ac87-0a58190123e9) Calling sign_app_in endpoint: https://sicsn.caixa/BeyondTrust/api/public/v3
2026-07-27 13:57:43,489 DEBUG (2390d31a-89c3-11f1-ac87-0a58190123e9) Running get_secret method in SecretsSafe class
2026-07-27 13:57:43,490 INFO (2390d31a-89c3-11f1-ac87-0a58190123e9) **************** secret path: 0 *****************
2026-07-27 13:57:43,490 INFO (2390d31a-89c3-11f1-ac87-0a58190123e9) Secrets folder Path /usr/src/app/secrets_files
2026-07-27 13:57:43,490 INFO (2390d31a-89c3-11f1-ac87-0a58190123e9) Creating files with the secrets as content, number of files 0
2026-07-27 13:57:43,490 DEBUG (2390d31a-89c3-11f1-ac87-0a58190123e9) Calling sign_app_out endpoint: https://sicsn.caixa/BeyondTrust/api/public/v3/Auth/Signout
2026-07-27 13:57:43,501 INFO (2390d31a-89c3-11f1-ac87-0a58190123e9) {
    "execution_id": "2390d31a-89c3-11f1-ac87-0a58190123e9",
    "input": {
        "secret_list": [
            "0"
        ],
        "folder_list": [],
        "managed_account_list": [],
        "secret_safe_url": "https://sicsn.caixa/BeyondTrust/api/public/v3",
        "user": {
            "UserId": 1645,
            "SID": null,
            "EmailAddress": null,
            "UserName": "SGFADB02",
            "Name": "SGFADB02"
        }
    },
    "output": {
        "secrets": [],
        "messages": [
            {
                "message": "Creating files with the secrets as content, number of files 0",
                "type": "INFO"
            }
        ],
        "errors": [
            {
                "message": "Error while calling get_secret_with_metadata: Invalid secret path: 0, check your path and title separator, separator must be: /",
                "type": "ERROR"
            }
        ]
    }
}
2026-07-27 13:57:43,502 INFO (2390d31a-89c3-11f1-ac87-0a58190123e9) Ending Execution...2390d31a-89c3-11f1-ac87-0a58190123e9




