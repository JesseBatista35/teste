2026-10-09 21:27:15,392 INFO Getting secrets just once, POLLING_WAIT_BETWEEN_REQUESTS_MINUTES was not configured
2026-10-09 21:27:15,392 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) APP VERSION: 2.1.0
2026-10-09 21:27:15,392 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) Starting Execution...32b9156a-c428-11f1-9dca-0a5819000e84
2026-10-09 21:27:15,392 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) You are using: <,> as List delimiter
2026-10-09 21:27:15,392 WARNING (32b9156a-c428-11f1-9dca-0a5819000e84) InsecureRequestWarning: Unverified HTTPS request is being made to host https://sicsn.caixa/BeyondTrust/api/public/v3'. Adding certificate verification isstrongly advised. See: https://urllib3.readthedocs.io/en/1.26.x/advanced-usage.html#ssl-warnings
2026-10-09 21:27:15,392 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) Certificate was not configured
2026-10-09 21:27:15,395 DEBUG (32b9156a-c428-11f1-9dca-0a5819000e84) How long to wait for the server to connect and send data before giving up: connection timeout: 30 seconds, request timeout 30 seconds
2026-10-09 21:27:15,395 WARNING (32b9156a-c428-11f1-9dca-0a5819000e84) verify_ca=false is insecure, it instructs the caller to not verify the certificate authority when making API calls.
2026-10-09 21:27:15,457 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) Calling sign_app_in endpoint: https://sicsn.caixa/BeyondTrust/api/public/v3
2026-10-09 21:27:15,525 DEBUG (32b9156a-c428-11f1-9dca-0a5819000e84) Running get_secret method in SecretsSafe class
2026-10-09 21:27:15,525 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) **************** secret path: SIINP_DES/CLISERACC_SSO_INTRA *****************
2026-10-09 21:27:15,529 DEBUG (32b9156a-c428-11f1-9dca-0a5819000e84) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SIINP_DES&separator=%2F&version=3.1&title=CLISERACC_SSO_INTRA
2026-10-09 21:27:15,530 DEBUG (32b9156a-c428-11f1-9dca-0a5819000e84) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SIINP_DES&separator=%2F&version=3.1&title=CLISERACC_SSO_INTRA
2026-10-09 21:27:15,608 DEBUG (32b9156a-c428-11f1-9dca-0a5819000e84) Secret type: Text
2026-10-09 21:27:15,609 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) Secret was successfully retrieved
2026-10-09 21:27:15,609 DEBUG (32b9156a-c428-11f1-9dca-0a5819000e84) Running get_secret method in SecretsSafe class
2026-10-09 21:27:15,609 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) **************** secret path: SIINP_DES/REDIS_PASSWORD *****************
2026-10-09 21:27:15,609 DEBUG (32b9156a-c428-11f1-9dca-0a5819000e84) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SIINP_DES&separator=%2F&version=3.1&title=REDIS_PASSWORD
2026-10-09 21:27:15,609 DEBUG (32b9156a-c428-11f1-9dca-0a5819000e84) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SIINP_DES&separator=%2F&version=3.1&title=REDIS_PASSWORD
2026-10-09 21:27:15,681 DEBUG (32b9156a-c428-11f1-9dca-0a5819000e84) Secret type: Text
2026-10-09 21:27:15,681 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) Secret was successfully retrieved
2026-10-09 21:27:15,681 DEBUG (32b9156a-c428-11f1-9dca-0a5819000e84) Running get_secret method in SecretsSafe class
2026-10-09 21:27:15,681 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) **************** secret path: SIINP_DES/SECURITY_CRYPTO_KEY *****************
2026-10-09 21:27:15,681 DEBUG (32b9156a-c428-11f1-9dca-0a5819000e84) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SIINP_DES&separator=%2F&version=3.1&title=SECURITY_CRYPTO_KEY
2026-10-09 21:27:15,681 DEBUG (32b9156a-c428-11f1-9dca-0a5819000e84) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SIINP_DES&separator=%2F&version=3.1&title=SECURITY_CRYPTO_KEY
2026-10-09 21:27:15,753 DEBUG (32b9156a-c428-11f1-9dca-0a5819000e84) Secret type: Text
2026-10-09 21:27:15,753 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) Secret was successfully retrieved
2026-10-09 21:27:15,753 DEBUG (32b9156a-c428-11f1-9dca-0a5819000e84) Running get_secret method in SecretsSafe class
2026-10-09 21:27:15,753 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) **************** secret path: SIINP_DES/SICLI/SICLI_APIKEY *****************
2026-10-09 21:27:15,754 DEBUG (32b9156a-c428-11f1-9dca-0a5819000e84) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SIINP_DES%2FSICLI&separator=%2F&version=3.1&title=SICLI_APIKEY
2026-10-09 21:27:15,754 DEBUG (32b9156a-c428-11f1-9dca-0a5819000e84) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SIINP_DES%2FSICLI&separator=%2F&version=3.1&title=SICLI_APIKEY
2026-10-09 21:27:15,840 DEBUG (32b9156a-c428-11f1-9dca-0a5819000e84) Secret type: Text
2026-10-09 21:27:15,841 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) Secret was successfully retrieved
2026-10-09 21:27:15,841 DEBUG (32b9156a-c428-11f1-9dca-0a5819000e84) Running get_secret method in SecretsSafe class
2026-10-09 21:27:15,841 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) **************** secret path: SIINP_DES/SIINP_APIKEY *****************
2026-10-09 21:27:15,841 DEBUG (32b9156a-c428-11f1-9dca-0a5819000e84) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SIINP_DES&separator=%2F&version=3.1&title=SIINP_APIKEY
2026-10-09 21:27:15,841 DEBUG (32b9156a-c428-11f1-9dca-0a5819000e84) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SIINP_DES&separator=%2F&version=3.1&title=SIINP_APIKEY
2026-10-09 21:27:15,908 DEBUG (32b9156a-c428-11f1-9dca-0a5819000e84) Secret type: Text
2026-10-09 21:27:15,908 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) Secret was successfully retrieved
2026-10-09 21:27:15,908 DEBUG (32b9156a-c428-11f1-9dca-0a5819000e84) Running get_secret method in SecretsSafe class
2026-10-09 21:27:15,908 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) **************** secret path: SIINP_DES/SIINP_KEYSTORE_SANDBOX *****************
2026-10-09 21:27:15,909 DEBUG (32b9156a-c428-11f1-9dca-0a5819000e84) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SIINP_DES&separator=%2F&version=3.1&title=SIINP_KEYSTORE_SANDBOX
2026-10-09 21:27:15,909 DEBUG (32b9156a-c428-11f1-9dca-0a5819000e84) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SIINP_DES&separator=%2F&version=3.1&title=SIINP_KEYSTORE_SANDBOX
2026-10-09 21:27:15,985 DEBUG (32b9156a-c428-11f1-9dca-0a5819000e84) Secret type: Text
2026-10-09 21:27:15,985 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) Secret was successfully retrieved
2026-10-09 21:27:15,985 DEBUG (32b9156a-c428-11f1-9dca-0a5819000e84) Running get_secret method in SecretsSafe class
2026-10-09 21:27:15,985 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) **************** secret path: SIINP_DES/SINPBD01_ORACLE *****************
2026-10-09 21:27:15,986 DEBUG (32b9156a-c428-11f1-9dca-0a5819000e84) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SIINP_DES&separator=%2F&version=3.1&title=SINPBD01_ORACLE
2026-10-09 21:27:15,986 DEBUG (32b9156a-c428-11f1-9dca-0a5819000e84) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SIINP_DES&separator=%2F&version=3.1&title=SINPBD01_ORACLE
2026-10-09 21:27:16,053 DEBUG (32b9156a-c428-11f1-9dca-0a5819000e84) Secret type: Text
2026-10-09 21:27:16,053 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) Secret was successfully retrieved
2026-10-09 21:27:16,053 DEBUG (32b9156a-c428-11f1-9dca-0a5819000e84) Running get_secret method in SecretsSafe class
2026-10-09 21:27:16,053 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) **************** secret path: SIINP_DES/SINPBD01_PROXY *****************
2026-10-09 21:27:16,054 DEBUG (32b9156a-c428-11f1-9dca-0a5819000e84) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SIINP_DES&separator=%2F&version=3.1&title=SINPBD01_PROXY
2026-10-09 21:27:16,054 DEBUG (32b9156a-c428-11f1-9dca-0a5819000e84) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SIINP_DES&separator=%2F&version=3.1&title=SINPBD01_PROXY
2026-10-09 21:27:16,122 DEBUG (32b9156a-c428-11f1-9dca-0a5819000e84) Secret type: Text
2026-10-09 21:27:16,122 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) Secret was successfully retrieved
2026-10-09 21:27:16,122 DEBUG (32b9156a-c428-11f1-9dca-0a5819000e84) Running get_secret method in SecretsSafe class
2026-10-09 21:27:16,122 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) **************** secret path: SIINP_DES/SINPSD01_HSM *****************
2026-10-09 21:27:16,123 DEBUG (32b9156a-c428-11f1-9dca-0a5819000e84) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SIINP_DES&separator=%2F&version=3.1&title=SINPSD01_HSM
2026-10-09 21:27:16,123 DEBUG (32b9156a-c428-11f1-9dca-0a5819000e84) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SIINP_DES&separator=%2F&version=3.1&title=SINPSD01_HSM
2026-10-09 21:27:16,205 DEBUG (32b9156a-c428-11f1-9dca-0a5819000e84) Secret type: Text
2026-10-09 21:27:16,205 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) Secret was successfully retrieved
2026-10-09 21:27:16,205 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) Secrets folder Path /usr/src/app/secrets_files
2026-10-09 21:27:16,205 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) Creating files with the secrets as content, number of files 18
2026-10-09 21:27:16,205 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) File saved succesfully: /usr/src/app/secrets_files/SIINP_DES/CLISERACC_SSO_INTRA_Metadata
2026-10-09 21:27:16,205 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) File saved succesfully: /usr/src/app/secrets_files/SIINP_DES/CLISERACC_SSO_INTRA
2026-10-09 21:27:16,205 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) File saved succesfully: /usr/src/app/secrets_files/SIINP_DES/REDIS_PASSWORD_Metadata
2026-10-09 21:27:16,205 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) File saved succesfully: /usr/src/app/secrets_files/SIINP_DES/REDIS_PASSWORD
2026-10-09 21:27:16,205 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) File saved succesfully: /usr/src/app/secrets_files/SIINP_DES/SECURITY_CRYPTO_KEY_Metadata
2026-10-09 21:27:16,205 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) File saved succesfully: /usr/src/app/secrets_files/SIINP_DES/SECURITY_CRYPTO_KEY
2026-10-09 21:27:16,205 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) File saved succesfully: /usr/src/app/secrets_files/SIINP_DES/SICLI/SICLI_APIKEY_Metadata
2026-10-09 21:27:16,205 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) File saved succesfully: /usr/src/app/secrets_files/SIINP_DES/SICLI/SICLI_APIKEY
2026-10-09 21:27:16,206 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) File saved succesfully: /usr/src/app/secrets_files/SIINP_DES/SIINP_APIKEY_Metadata
2026-10-09 21:27:16,206 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) File saved succesfully: /usr/src/app/secrets_files/SIINP_DES/SIINP_APIKEY
2026-10-09 21:27:16,206 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) File saved succesfully: /usr/src/app/secrets_files/SIINP_DES/SIINP_KEYSTORE_SANDBOX_Metadata
2026-10-09 21:27:16,206 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) File saved succesfully: /usr/src/app/secrets_files/SIINP_DES/SIINP_KEYSTORE_SANDBOX
2026-10-09 21:27:16,206 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) File saved succesfully: /usr/src/app/secrets_files/SIINP_DES/SINPBD01_ORACLE_Metadata
2026-10-09 21:27:16,206 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) File saved succesfully: /usr/src/app/secrets_files/SIINP_DES/SINPBD01_ORACLE
2026-10-09 21:27:16,206 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) File saved succesfully: /usr/src/app/secrets_files/SIINP_DES/SINPBD01_PROXY_Metadata
2026-10-09 21:27:16,206 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) File saved succesfully: /usr/src/app/secrets_files/SIINP_DES/SINPBD01_PROXY
2026-10-09 21:27:16,206 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) File saved succesfully: /usr/src/app/secrets_files/SIINP_DES/SINPSD01_HSM_Metadata
2026-10-09 21:27:16,206 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) File saved succesfully: /usr/src/app/secrets_files/SIINP_DES/SINPSD01_HSM
2026-10-09 21:27:16,206 DEBUG (32b9156a-c428-11f1-9dca-0a5819000e84) Calling sign_app_out endpoint: https://sicsn.caixa/BeyondTrust/api/public/v3/Auth/Signout
2026-10-09 21:27:16,230 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) {
    "execution_id": "32b9156a-c428-11f1-9dca-0a5819000e84",
    "input": {
        "secret_list": [
            "SIINP_DES/CLISERACC_SSO_INTRA",
            "SIINP_DES/REDIS_PASSWORD",
            "SIINP_DES/SECURITY_CRYPTO_KEY",
            "SIINP_DES/SICLI/SICLI_APIKEY",
            "SIINP_DES/SIINP_APIKEY",
            "SIINP_DES/SIINP_KEYSTORE_SANDBOX",
            "SIINP_DES/SINPBD01_ORACLE",
            "SIINP_DES/SINPBD01_PROXY",
            "SIINP_DES/SINPSD01_HSM"
        ],
        "folder_list": [],
        "managed_account_list": [],
        "secret_safe_url": "https://sicsn.caixa/BeyondTrust/api/public/v3",
        "user": {
            "UserId": 1711,
            "SID": null,
            "EmailAddress": null,
            "UserName": "SINPDB02",
            "Name": "SINPDB02"
        }
    },
    "output": {
        "secrets": [
            {
                "path": "SIINP_DES/CLISERACC_SSO_INTRA_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"03eccf2f-e68d-4d57-8b22-08dddc22300c\", \"Title\": \"CLISERACC_SSO_INTRA\", \"Description\": \"cli-ser-inp\", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"ffe39931-1df3-4f2c-f1fa-08dddc21331e\", \"CreatedOn\": \"2025-08-15T17:38:01.3333333Z\", \"CreatedBy\": \"bt_master\", \"ModifiedOn\": \"2025-08-15T17:38:01.3333333Z\", \"ModifiedBy\": \"bt_master\", \"Owner\": null, \"Folder\": \"SIINP_DES\", \"FolderPath\": \"SIINP_DES\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": null, \"UserId\": 1196, \"Owner\": null, \"Name\": \"clientid_SINPDB01\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"\", \"Urls\": []}"
            },
            {
                "path": "SIINP_DES/CLISERACC_SSO_INTRA",
                "content": "***************"
            },
            {
                "path": "SIINP_DES/REDIS_PASSWORD_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"f5823dbe-9a52-4c33-72be-08dea4601b92\", \"Title\": \"REDIS_PASSWORD\", \"Description\": \"\", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"ffe39931-1df3-4f2c-f1fa-08dddc21331e\", \"CreatedOn\": \"2026-05-04T14:24:56.9733333Z\", \"CreatedBy\": \"Joao Oliveira\", \"ModifiedOn\": \"2026-05-04T14:24:56.9733333Z\", \"ModifiedBy\": \"Joao Oliveira\", \"Owner\": null, \"Folder\": \"SIINP_DES\", \"FolderPath\": \"SIINP_DES\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": null, \"UserId\": 1118, \"Owner\": null, \"Name\": \"Joao Oliveira\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"\", \"Urls\": []}"
            },
            {
                "path": "SIINP_DES/REDIS_PASSWORD",
                "content": "***************"
            },
            {
                "path": "SIINP_DES/SECURITY_CRYPTO_KEY_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"bf765a81-0566-43a9-d512-08df26282428\", \"Title\": \"SECURITY_CRYPTO_KEY\", \"Description\": \"\", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"ffe39931-1df3-4f2c-f1fa-08dddc21331e\", \"CreatedOn\": \"2026-10-09T20:30:58.0633333Z\", \"CreatedBy\": \"Lucas Santos\", \"ModifiedOn\": \"2026-10-09T20:31:11.649235Z\", \"ModifiedBy\": \"Lucas Santos\", \"Owner\": null, \"Folder\": \"SIINP_DES\", \"FolderPath\": \"SIINP_DES\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": 194, \"UserId\": null, \"Owner\": null, \"Name\": \"SIINP_DES\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"\", \"Urls\": []}"
            },
            {
                "path": "SIINP_DES/SECURITY_CRYPTO_KEY",
                "content": "***************"
            },
            {
                "path": "SIINP_DES/SICLI/SICLI_APIKEY_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"15b61bcf-579d-47cc-11a0-08ddde664381\", \"Title\": \"SICLI_APIKEY\", \"Description\": \"\", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"2e47f2f0-4106-466a-4193-08ddde7768e6\", \"CreatedOn\": \"2025-08-18T16:51:31.5266667Z\", \"CreatedBy\": \"Santos, Lucas\", \"ModifiedOn\": \"2025-11-10T18:03:03.7578169Z\", \"ModifiedBy\": \"Joao Oliveira\", \"Owner\": null, \"Folder\": \"SICLI\", \"FolderPath\": \"SIINP_DES/SICLI\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": null, \"UserId\": 1196, \"Owner\": null, \"Name\": \"clientid_SINPDB01\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"\", \"Urls\": []}"
            },
            {
                "path": "SIINP_DES/SICLI/SICLI_APIKEY",
                "content": "***************"
            },
            {
                "path": "SIINP_DES/SIINP_APIKEY_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"8ae0d192-e607-4d11-119f-08ddde664381\", \"Title\": \"SIINP_APIKEY\", \"Description\": \"\", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"ffe39931-1df3-4f2c-f1fa-08dddc21331e\", \"CreatedOn\": \"2025-08-18T16:50:50.11Z\", \"CreatedBy\": \"Santos, Lucas\", \"ModifiedOn\": \"2025-08-18T16:50:50.11Z\", \"ModifiedBy\": \"Santos, Lucas\", \"Owner\": null, \"Folder\": \"SIINP_DES\", \"FolderPath\": \"SIINP_DES\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": null, \"UserId\": 1196, \"Owner\": null, \"Name\": \"clientid_SINPDB01\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"\", \"Urls\": []}"
            },
            {
                "path": "SIINP_DES/SIINP_APIKEY",
                "content": "***************"
            },
            {
                "path": "SIINP_DES/SIINP_KEYSTORE_SANDBOX_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"df308369-09e0-43db-11a1-08ddde664381\", \"Title\": \"SIINP_KEYSTORE_SANDBOX\", \"Description\": \"siinp_mtls_sandbox_of_072025_new.p12\", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"ffe39931-1df3-4f2c-f1fa-08dddc21331e\", \"CreatedOn\": \"2025-08-18T16:58:23.4033333Z\", \"CreatedBy\": \"Santos, Lucas\", \"ModifiedOn\": \"2025-08-18T16:58:38.8248069Z\", \"ModifiedBy\": \"Santos, Lucas\", \"Owner\": null, \"Folder\": \"SIINP_DES\", \"FolderPath\": \"SIINP_DES\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": null, \"UserId\": 1196, \"Owner\": null, \"Name\": \"clientid_SINPDB01\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"\", \"Urls\": []}"
            },
            {
                "path": "SIINP_DES/SIINP_KEYSTORE_SANDBOX",
                "content": "***************"
            },
            {
                "path": "SIINP_DES/SINPBD01_ORACLE_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"9816cc3d-7d67-4b3e-8b21-08dddc22300c\", \"Title\": \"SINPBD01_ORACLE\", \"Description\": \"\", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"ffe39931-1df3-4f2c-f1fa-08dddc21331e\", \"CreatedOn\": \"2025-08-15T17:35:54.9666667Z\", \"CreatedBy\": \"bt_master\", \"ModifiedOn\": \"2025-08-15T17:35:54.9666667Z\", \"ModifiedBy\": \"bt_master\", \"Owner\": null, \"Folder\": \"SIINP_DES\", \"FolderPath\": \"SIINP_DES\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": null, \"UserId\": 1196, \"Owner\": null, \"Name\": \"clientid_SINPDB01\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"\", \"Urls\": []}"
            },
            {
                "path": "SIINP_DES/SINPBD01_ORACLE",
                "content": "***************"
            },
            {
                "path": "SIINP_DES/SINPBD01_PROXY_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"69fc7201-e1cc-4f6a-119d-08ddde664381\", \"Title\": \"SINPBD01_PROXY\", \"Description\": \"\", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"ffe39931-1df3-4f2c-f1fa-08dddc21331e\", \"CreatedOn\": \"2025-08-18T14:48:15.74Z\", \"CreatedBy\": \"bt_master\", \"ModifiedOn\": \"2025-08-18T14:48:15.74Z\", \"ModifiedBy\": \"bt_master\", \"Owner\": null, \"Folder\": \"SIINP_DES\", \"FolderPath\": \"SIINP_DES\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": null, \"UserId\": 1196, \"Owner\": null, \"Name\": \"clientid_SINPDB01\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"\", \"Urls\": []}"
            },
            {
                "path": "SIINP_DES/SINPBD01_PROXY",
                "content": "***************"
            },
            {
                "path": "SIINP_DES/SINPSD01_HSM_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"82718e14-5872-4302-119e-08ddde664381\", \"Title\": \"SINPSD01_HSM\", \"Description\": \"Usuario servico HSM DES\", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"ffe39931-1df3-4f2c-f1fa-08dddc21331e\", \"CreatedOn\": \"2025-08-18T16:49:27.1533333Z\", \"CreatedBy\": \"Santos, Lucas\", \"ModifiedOn\": \"2025-08-18T16:49:27.1533333Z\", \"ModifiedBy\": \"Santos, Lucas\", \"Owner\": null, \"Folder\": \"SIINP_DES\", \"FolderPath\": \"SIINP_DES\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": null, \"UserId\": 1196, \"Owner\": null, \"Name\": \"clientid_SINPDB01\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"\", \"Urls\": []}"
            },
            {
                "path": "SIINP_DES/SINPSD01_HSM",
                "content": "***************"
            }
        ],
        "messages": [
            {
                "message": "Creating files with the secrets as content, number of files 18",
                "type": "INFO"
            }
        ],
        "errors": []
    }
}
2026-10-09 21:27:16,230 INFO (32b9156a-c428-11f1-9dca-0a5819000e84) Ending Execution...32b9156a-c428-11f1-9dca-0a5819000e84




siinp-nucleo-des-315-46f2f
CrashLoopBackOff
