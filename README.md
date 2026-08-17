2026-08-17 14:58:18,448 INFO Getting secrets just once, POLLING_WAIT_BETWEEN_REQUESTS_MINUTES was not configured
2026-08-17 14:58:18,448 INFO (14ed46f6-9a4c-11f1-a0ae-0a581982075a) APP VERSION: 2.1.0
2026-08-17 14:58:18,448 INFO (14ed46f6-9a4c-11f1-a0ae-0a581982075a) Starting Execution...14ed46f6-9a4c-11f1-a0ae-0a581982075a
2026-08-17 14:58:18,448 INFO (14ed46f6-9a4c-11f1-a0ae-0a581982075a) You are using: <,> as List delimiter
2026-08-17 14:58:18,448 WARNING (14ed46f6-9a4c-11f1-a0ae-0a581982075a) InsecureRequestWarning: Unverified HTTPS request is being made to host https://sicsn.caixa/BeyondTrust/api/public/v3'. Adding certificate verification isstrongly advised. See: https://urllib3.readthedocs.io/en/1.26.x/advanced-usage.html#ssl-warnings
2026-08-17 14:58:18,448 INFO (14ed46f6-9a4c-11f1-a0ae-0a581982075a) Certificate was not configured
2026-08-17 14:58:18,451 DEBUG (14ed46f6-9a4c-11f1-a0ae-0a581982075a) How long to wait for the server to connect and send data before giving up: connection timeout: 30 seconds, request timeout 30 seconds
2026-08-17 14:58:18,451 WARNING (14ed46f6-9a4c-11f1-a0ae-0a581982075a) verify_ca=false is insecure, it instructs the caller to not verify the certificate authority when making API calls.
2026-08-17 14:58:18,592 INFO (14ed46f6-9a4c-11f1-a0ae-0a581982075a) Calling sign_app_in endpoint: https://sicsn.caixa/BeyondTrust/api/public/v3
2026-08-17 14:58:18,631 DEBUG (14ed46f6-9a4c-11f1-a0ae-0a581982075a) Running get_secret method in SecretsSafe class
2026-08-17 14:58:18,631 INFO (14ed46f6-9a4c-11f1-a0ae-0a581982075a) **************** secret path: SIMPI_DES/SMPISD01_HSM *****************
2026-08-17 14:58:18,637 DEBUG (14ed46f6-9a4c-11f1-a0ae-0a581982075a) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SIMPI_DES&separator=%2F&version=3.1&title=SMPISD01_HSM
2026-08-17 14:58:18,638 DEBUG (14ed46f6-9a4c-11f1-a0ae-0a581982075a) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SIMPI_DES&separator=%2F&version=3.1&title=SMPISD01_HSM
2026-08-17 14:58:18,728 DEBUG (14ed46f6-9a4c-11f1-a0ae-0a581982075a) Secret type: Text
2026-08-17 14:58:18,728 INFO (14ed46f6-9a4c-11f1-a0ae-0a581982075a) Secret was successfully retrieved
2026-08-17 14:58:18,728 DEBUG (14ed46f6-9a4c-11f1-a0ae-0a581982075a) Running get_secret method in SecretsSafe class
2026-08-17 14:58:18,729 INFO (14ed46f6-9a4c-11f1-a0ae-0a581982075a) **************** secret path: SIMPI_DES/SIMPI_ALIAS_CERT *****************
2026-08-17 14:58:18,729 DEBUG (14ed46f6-9a4c-11f1-a0ae-0a581982075a) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SIMPI_DES&separator=%2F&version=3.1&title=SIMPI_ALIAS_CERT
2026-08-17 14:58:18,729 DEBUG (14ed46f6-9a4c-11f1-a0ae-0a581982075a) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SIMPI_DES&separator=%2F&version=3.1&title=SIMPI_ALIAS_CERT
2026-08-17 14:58:18,783 DEBUG (14ed46f6-9a4c-11f1-a0ae-0a581982075a) Secret type: Text
2026-08-17 14:58:18,784 INFO (14ed46f6-9a4c-11f1-a0ae-0a581982075a) Secret was successfully retrieved
2026-08-17 14:58:18,784 DEBUG (14ed46f6-9a4c-11f1-a0ae-0a581982075a) Running get_secret method in SecretsSafe class
2026-08-17 14:58:18,784 INFO (14ed46f6-9a4c-11f1-a0ae-0a581982075a) **************** secret path: SIMPI_DES/SIMPI_SN_CERT *****************
2026-08-17 14:58:18,784 DEBUG (14ed46f6-9a4c-11f1-a0ae-0a581982075a) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SIMPI_DES&separator=%2F&version=3.1&title=SIMPI_SN_CERT
2026-08-17 14:58:18,784 DEBUG (14ed46f6-9a4c-11f1-a0ae-0a581982075a) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SIMPI_DES&separator=%2F&version=3.1&title=SIMPI_SN_CERT
2026-08-17 14:58:18,853 DEBUG (14ed46f6-9a4c-11f1-a0ae-0a581982075a) Secret type: Text
2026-08-17 14:58:18,853 INFO (14ed46f6-9a4c-11f1-a0ae-0a581982075a) Secret was successfully retrieved
2026-08-17 14:58:18,853 DEBUG (14ed46f6-9a4c-11f1-a0ae-0a581982075a) Running get_secret method in SecretsSafe class
2026-08-17 14:58:18,853 INFO (14ed46f6-9a4c-11f1-a0ae-0a581982075a) **************** secret path: SIMPI_DES/SIMPI_ISSUER_CERT *****************
2026-08-17 14:58:18,854 DEBUG (14ed46f6-9a4c-11f1-a0ae-0a581982075a) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SIMPI_DES&separator=%2F&version=3.1&title=SIMPI_ISSUER_CERT
2026-08-17 14:58:18,854 DEBUG (14ed46f6-9a4c-11f1-a0ae-0a581982075a) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SIMPI_DES&separator=%2F&version=3.1&title=SIMPI_ISSUER_CERT
2026-08-17 14:58:19,246 DEBUG (14ed46f6-9a4c-11f1-a0ae-0a581982075a) Secret type: Text
2026-08-17 14:58:19,246 INFO (14ed46f6-9a4c-11f1-a0ae-0a581982075a) Secret was successfully retrieved
2026-08-17 14:58:19,246 DEBUG (14ed46f6-9a4c-11f1-a0ae-0a581982075a) Running get_secret method in SecretsSafe class
2026-08-17 14:58:19,246 INFO (14ed46f6-9a4c-11f1-a0ae-0a581982075a) **************** secret path: SIMPI_DES/SIMPI_KSPIX_01 *****************
2026-08-17 14:58:19,246 DEBUG (14ed46f6-9a4c-11f1-a0ae-0a581982075a) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SIMPI_DES&separator=%2F&version=3.1&title=SIMPI_KSPIX_01
2026-08-17 14:58:19,246 DEBUG (14ed46f6-9a4c-11f1-a0ae-0a581982075a) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SIMPI_DES&separator=%2F&version=3.1&title=SIMPI_KSPIX_01
2026-08-17 14:58:19,322 DEBUG (14ed46f6-9a4c-11f1-a0ae-0a581982075a) Secret type: Text
2026-08-17 14:58:19,323 INFO (14ed46f6-9a4c-11f1-a0ae-0a581982075a) Secret was successfully retrieved
2026-08-17 14:58:19,323 INFO (14ed46f6-9a4c-11f1-a0ae-0a581982075a) Secrets folder Path /usr/src/app/secrets_files
2026-08-17 14:58:19,323 INFO (14ed46f6-9a4c-11f1-a0ae-0a581982075a) Creating files with the secrets as content, number of files 10
2026-08-17 14:58:19,323 INFO (14ed46f6-9a4c-11f1-a0ae-0a581982075a) File saved succesfully: /usr/src/app/secrets_files/SIMPI_DES/SMPISD01_HSM_Metadata
2026-08-17 14:58:19,323 INFO (14ed46f6-9a4c-11f1-a0ae-0a581982075a) File saved succesfully: /usr/src/app/secrets_files/SIMPI_DES/SMPISD01_HSM
2026-08-17 14:58:19,323 INFO (14ed46f6-9a4c-11f1-a0ae-0a581982075a) File saved succesfully: /usr/src/app/secrets_files/SIMPI_DES/SIMPI_ALIAS_CERT_Metadata
2026-08-17 14:58:19,323 INFO (14ed46f6-9a4c-11f1-a0ae-0a581982075a) File saved succesfully: /usr/src/app/secrets_files/SIMPI_DES/SIMPI_ALIAS_CERT
2026-08-17 14:58:19,323 INFO (14ed46f6-9a4c-11f1-a0ae-0a581982075a) File saved succesfully: /usr/src/app/secrets_files/SIMPI_DES/SIMPI_SN_CERT_Metadata
2026-08-17 14:58:19,323 INFO (14ed46f6-9a4c-11f1-a0ae-0a581982075a) File saved succesfully: /usr/src/app/secrets_files/SIMPI_DES/SIMPI_SN_CERT
2026-08-17 14:58:19,323 INFO (14ed46f6-9a4c-11f1-a0ae-0a581982075a) File saved succesfully: /usr/src/app/secrets_files/SIMPI_DES/SIMPI_ISSUER_CERT_Metadata
2026-08-17 14:58:19,324 INFO (14ed46f6-9a4c-11f1-a0ae-0a581982075a) File saved succesfully: /usr/src/app/secrets_files/SIMPI_DES/SIMPI_ISSUER_CERT
2026-08-17 14:58:19,324 INFO (14ed46f6-9a4c-11f1-a0ae-0a581982075a) File saved succesfully: /usr/src/app/secrets_files/SIMPI_DES/SIMPI_KSPIX_01_Metadata
2026-08-17 14:58:19,324 INFO (14ed46f6-9a4c-11f1-a0ae-0a581982075a) File saved succesfully: /usr/src/app/secrets_files/SIMPI_DES/SIMPI_KSPIX_01
2026-08-17 14:58:19,324 DEBUG (14ed46f6-9a4c-11f1-a0ae-0a581982075a) Calling sign_app_out endpoint: https://sicsn.caixa/BeyondTrust/api/public/v3/Auth/Signout
2026-08-17 14:58:19,335 INFO (14ed46f6-9a4c-11f1-a0ae-0a581982075a) {
    "execution_id": "14ed46f6-9a4c-11f1-a0ae-0a581982075a",
    "input": {
        "secret_list": [
            "SIMPI_DES/SMPISD01_HSM",
            "SIMPI_DES/SIMPI_ALIAS_CERT",
            "SIMPI_DES/SIMPI_SN_CERT",
            "SIMPI_DES/SIMPI_ISSUER_CERT",
            "SIMPI_DES/SIMPI_KSPIX_01"
        ],
        "folder_list": [],
        "managed_account_list": [],
        "secret_safe_url": "https://sicsn.caixa/BeyondTrust/api/public/v3",
        "user": {
            "UserId": 1629,
            "SID": null,
            "EmailAddress": null,
            "UserName": "SPMPID03",
            "Name": "SPMPID03"
        }
    },
    "output": {
        "secrets": [
            {
                "path": "SIMPI_DES/SMPISD01_HSM_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"997c7e57-ef59-4257-c2c6-08ddc484607c\", \"Title\": \"SMPISD01_HSM\", \"Description\": \"Usu\\u00e1rio SIMPI - HSM - Desenvolvimento\", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"2e7a7319-9813-4f12-f1b2-08ddc3ae9059\", \"CreatedOn\": \"2025-07-16T16:38:39.8Z\", \"CreatedBy\": \"Santos, Lucas\", \"ModifiedOn\": \"2025-07-17T14:09:33.0426629Z\", \"ModifiedBy\": \"Moreira, Gentil\", \"Owner\": null, \"Folder\": \"SIMPI_DES\", \"FolderPath\": \"SIMPI_DES\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": null, \"UserId\": 1157, \"Owner\": null, \"Name\": \"Clientid_SPMPID02\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"\", \"Urls\": []}"
            },
            {
                "path": "SIMPI_DES/SMPISD01_HSM",
                "content": "***************"
            },
            {
                "path": "SIMPI_DES/SIMPI_ALIAS_CERT_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"e80ece2d-9164-4109-ad98-08dde6fe9a01\", \"Title\": \"SIMPI_ALIAS_CERT\", \"Description\": \"\", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"2e7a7319-9813-4f12-f1b2-08ddc3ae9059\", \"CreatedOn\": \"2025-09-02T17:25:25.0966667Z\", \"CreatedBy\": \"bt_master\", \"ModifiedOn\": \"2025-09-25T17:51:19.3791587Z\", \"ModifiedBy\": \"Souza, Pedro\", \"Owner\": null, \"Folder\": \"SIMPI_DES\", \"FolderPath\": \"SIMPI_DES\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": null, \"UserId\": 1157, \"Owner\": null, \"Name\": \"Clientid_SPMPID02\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"\", \"Urls\": []}"
            },
            {
                "path": "SIMPI_DES/SIMPI_ALIAS_CERT",
                "content": "***************"
            },
            {
                "path": "SIMPI_DES/SIMPI_SN_CERT_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"0f98508b-83d1-4f25-ad99-08dde6fe9a01\", \"Title\": \"SIMPI_SN_CERT\", \"Description\": \"\", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"2e7a7319-9813-4f12-f1b2-08ddc3ae9059\", \"CreatedOn\": \"2025-09-02T17:26:07.6Z\", \"CreatedBy\": \"bt_master\", \"ModifiedOn\": \"2025-09-25T17:52:11.3171745Z\", \"ModifiedBy\": \"Souza, Pedro\", \"Owner\": null, \"Folder\": \"SIMPI_DES\", \"FolderPath\": \"SIMPI_DES\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": null, \"UserId\": 1157, \"Owner\": null, \"Name\": \"Clientid_SPMPID02\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"\", \"Urls\": []}"
            },
            {
                "path": "SIMPI_DES/SIMPI_SN_CERT",
                "content": "***************"
            },
            {
                "path": "SIMPI_DES/SIMPI_ISSUER_CERT_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"120714cf-a62f-48dd-ad9a-08dde6fe9a01\", \"Title\": \"SIMPI_ISSUER_CERT\", \"Description\": \"\", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"2e7a7319-9813-4f12-f1b2-08ddc3ae9059\", \"CreatedOn\": \"2025-09-02T17:27:15Z\", \"CreatedBy\": \"bt_master\", \"ModifiedOn\": \"2025-09-02T17:27:15Z\", \"ModifiedBy\": \"bt_master\", \"Owner\": null, \"Folder\": \"SIMPI_DES\", \"FolderPath\": \"SIMPI_DES\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": null, \"UserId\": 1157, \"Owner\": null, \"Name\": \"Clientid_SPMPID02\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"\", \"Urls\": []}"
            },
            {
                "path": "SIMPI_DES/SIMPI_ISSUER_CERT",
                "content": "***************"
            },
            {
                "path": "SIMPI_DES/SIMPI_KSPIX_01_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"f9635773-17ba-44cd-d358-08ddca133698\", \"Title\": \"SIMPI_KSPIX_01\", \"Description\": \"Keystore Pix\", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"2e7a7319-9813-4f12-f1b2-08ddc3ae9059\", \"CreatedOn\": \"2025-07-23T18:35:04.02Z\", \"CreatedBy\": \"Santos, Lucas\", \"ModifiedOn\": \"2025-07-23T18:35:04.02Z\", \"ModifiedBy\": \"Santos, Lucas\", \"Owner\": null, \"Folder\": \"SIMPI_DES\", \"FolderPath\": \"SIMPI_DES\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": null, \"UserId\": 1157, \"Owner\": null, \"Name\": \"Clientid_SPMPID02\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"\", \"Urls\": []}"
            },
            {
                "path": "SIMPI_DES/SIMPI_KSPIX_01",
                "content": "***************"
            }
        ],
        "messages": [
            {
                "message": "Creating files with the secrets as content, number of files 10",
                "type": "INFO"
            }
        ],
        "errors": []
    }
}
2026-08-17 14:58:19,335 INFO (14ed46f6-9a4c-11f1-a0ae-0a581982075a) Ending Execution...14ed46f6-9a4c-11f1-a0ae-0a581982075a
