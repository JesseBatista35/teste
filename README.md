2026-05-29 21:24:09,246 INFO Getting secrets just once, POLLING_WAIT_BETWEEN_REQUESTS_MINUTES was not configured
2026-05-29 21:24:09,247 INFO (bad4d5ca-5ba4-11f1-9125-0a5819011def) APP VERSION: 2.1.0
2026-05-29 21:24:09,247 INFO (bad4d5ca-5ba4-11f1-9125-0a5819011def) Starting Execution...bad4d5ca-5ba4-11f1-9125-0a5819011def
2026-05-29 21:24:09,247 INFO (bad4d5ca-5ba4-11f1-9125-0a5819011def) You are using: <,> as List delimiter
2026-05-29 21:24:09,247 WARNING (bad4d5ca-5ba4-11f1-9125-0a5819011def) InsecureRequestWarning: Unverified HTTPS request is being made to host https://sicsn.caixa/BeyondTrust/api/public/v3'. Adding certificate verification isstrongly advised. See: https://urllib3.readthedocs.io/en/1.26.x/advanced-usage.html#ssl-warnings
2026-05-29 21:24:09,247 INFO (bad4d5ca-5ba4-11f1-9125-0a5819011def) Certificate was not configured
2026-05-29 21:24:09,250 DEBUG (bad4d5ca-5ba4-11f1-9125-0a5819011def) How long to wait for the server to connect and send data before giving up: connection timeout: 30 seconds, request timeout 30 seconds
2026-05-29 21:24:09,250 WARNING (bad4d5ca-5ba4-11f1-9125-0a5819011def) verify_ca=false is insecure, it instructs the caller to not verify the certificate authority when making API calls.
2026-05-29 21:24:09,299 INFO (bad4d5ca-5ba4-11f1-9125-0a5819011def) Calling sign_app_in endpoint: https://sicsn.caixa/BeyondTrust/api/public/v3
2026-05-29 21:24:09,345 DEBUG (bad4d5ca-5ba4-11f1-9125-0a5819011def) Running get_secret method in SecretsSafe class
2026-05-29 21:24:09,345 INFO (bad4d5ca-5ba4-11f1-9125-0a5819011def) **************** secret path: SIOFG_DES/SIFUG_DATASOURCE_02 *****************
2026-05-29 21:24:09,350 DEBUG (bad4d5ca-5ba4-11f1-9125-0a5819011def) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SIOFG_DES&separator=%2F&version=3.1&title=SIFUG_DATASOURCE_02
2026-05-29 21:24:09,350 DEBUG (bad4d5ca-5ba4-11f1-9125-0a5819011def) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SIOFG_DES&separator=%2F&version=3.1&title=SIFUG_DATASOURCE_02
2026-05-29 21:24:09,506 DEBUG (bad4d5ca-5ba4-11f1-9125-0a5819011def) Secret type: Text
2026-05-29 21:24:09,506 INFO (bad4d5ca-5ba4-11f1-9125-0a5819011def) Secret was successfully retrieved
2026-05-29 21:24:09,507 DEBUG (bad4d5ca-5ba4-11f1-9125-0a5819011def) Running get_secret method in SecretsSafe class
2026-05-29 21:24:09,507 INFO (bad4d5ca-5ba4-11f1-9125-0a5819011def) **************** secret path: SIOFG_DES/SIFUG_DATASOURCE_15 *****************
2026-05-29 21:24:09,507 DEBUG (bad4d5ca-5ba4-11f1-9125-0a5819011def) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SIOFG_DES&separator=%2F&version=3.1&title=SIFUG_DATASOURCE_15
2026-05-29 21:24:09,507 DEBUG (bad4d5ca-5ba4-11f1-9125-0a5819011def) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SIOFG_DES&separator=%2F&version=3.1&title=SIFUG_DATASOURCE_15
2026-05-29 21:24:09,586 DEBUG (bad4d5ca-5ba4-11f1-9125-0a5819011def) Secret type: Text
2026-05-29 21:24:09,586 INFO (bad4d5ca-5ba4-11f1-9125-0a5819011def) Secret was successfully retrieved
2026-05-29 21:24:09,586 DEBUG (bad4d5ca-5ba4-11f1-9125-0a5819011def) Running get_secret method in SecretsSafe class
2026-05-29 21:24:09,586 INFO (bad4d5ca-5ba4-11f1-9125-0a5819011def) **************** secret path: SIOFG_DES/SIFUG_XMQD1 *****************
2026-05-29 21:24:09,587 DEBUG (bad4d5ca-5ba4-11f1-9125-0a5819011def) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SIOFG_DES&separator=%2F&version=3.1&title=SIFUG_XMQD1
2026-05-29 21:24:09,587 DEBUG (bad4d5ca-5ba4-11f1-9125-0a5819011def) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SIOFG_DES&separator=%2F&version=3.1&title=SIFUG_XMQD1
2026-05-29 21:24:09,667 DEBUG (bad4d5ca-5ba4-11f1-9125-0a5819011def) Secret type: Text
2026-05-29 21:24:09,667 INFO (bad4d5ca-5ba4-11f1-9125-0a5819011def) Secret was successfully retrieved
2026-05-29 21:24:09,668 DEBUG (bad4d5ca-5ba4-11f1-9125-0a5819011def) Running get_secret method in SecretsSafe class
2026-05-29 21:24:09,668 INFO (bad4d5ca-5ba4-11f1-9125-0a5819011def) **************** secret path: SIOFG_DES/SIFUG_BT_APIKEY *****************
2026-05-29 21:24:09,668 DEBUG (bad4d5ca-5ba4-11f1-9125-0a5819011def) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SIOFG_DES&separator=%2F&version=3.1&title=SIFUG_BT_APIKEY
2026-05-29 21:24:09,668 DEBUG (bad4d5ca-5ba4-11f1-9125-0a5819011def) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SIOFG_DES&separator=%2F&version=3.1&title=SIFUG_BT_APIKEY
2026-05-29 21:24:09,745 DEBUG (bad4d5ca-5ba4-11f1-9125-0a5819011def) Secret type: Text
2026-05-29 21:24:09,745 INFO (bad4d5ca-5ba4-11f1-9125-0a5819011def) Secret was successfully retrieved
2026-05-29 21:24:09,745 DEBUG (bad4d5ca-5ba4-11f1-9125-0a5819011def) Running get_secret method in SecretsSafe class
2026-05-29 21:24:09,745 INFO (bad4d5ca-5ba4-11f1-9125-0a5819011def) **************** secret path: SIOFG_DES/CLISERFUG_SSO_INTER *****************
2026-05-29 21:24:09,745 DEBUG (bad4d5ca-5ba4-11f1-9125-0a5819011def) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SIOFG_DES&separator=%2F&version=3.1&title=CLISERFUG_SSO_INTER
2026-05-29 21:24:09,746 DEBUG (bad4d5ca-5ba4-11f1-9125-0a5819011def) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SIOFG_DES&separator=%2F&version=3.1&title=CLISERFUG_SSO_INTER
2026-05-29 21:24:09,819 DEBUG (bad4d5ca-5ba4-11f1-9125-0a5819011def) Secret type: Text
2026-05-29 21:24:09,819 INFO (bad4d5ca-5ba4-11f1-9125-0a5819011def) Secret was successfully retrieved
2026-05-29 21:24:09,819 INFO (bad4d5ca-5ba4-11f1-9125-0a5819011def) Secrets folder Path /usr/src/app/secrets_files
2026-05-29 21:24:09,819 INFO (bad4d5ca-5ba4-11f1-9125-0a5819011def) Creating files with the secrets as content, number of files 10
2026-05-29 21:24:09,819 INFO (bad4d5ca-5ba4-11f1-9125-0a5819011def) File saved succesfully: /usr/src/app/secrets_files/SIOFG_DES/SIFUG_DATASOURCE_02_Metadata
2026-05-29 21:24:09,819 INFO (bad4d5ca-5ba4-11f1-9125-0a5819011def) File saved succesfully: /usr/src/app/secrets_files/SIOFG_DES/SIFUG_DATASOURCE_02
2026-05-29 21:24:09,819 INFO (bad4d5ca-5ba4-11f1-9125-0a5819011def) File saved succesfully: /usr/src/app/secrets_files/SIOFG_DES/SIFUG_DATASOURCE_15_Metadata
2026-05-29 21:24:09,819 INFO (bad4d5ca-5ba4-11f1-9125-0a5819011def) File saved succesfully: /usr/src/app/secrets_files/SIOFG_DES/SIFUG_DATASOURCE_15
2026-05-29 21:24:09,819 INFO (bad4d5ca-5ba4-11f1-9125-0a5819011def) File saved succesfully: /usr/src/app/secrets_files/SIOFG_DES/SIFUG_XMQD1_Metadata
2026-05-29 21:24:09,819 INFO (bad4d5ca-5ba4-11f1-9125-0a5819011def) File saved succesfully: /usr/src/app/secrets_files/SIOFG_DES/SIFUG_XMQD1
2026-05-29 21:24:09,820 INFO (bad4d5ca-5ba4-11f1-9125-0a5819011def) File saved succesfully: /usr/src/app/secrets_files/SIOFG_DES/SIFUG_BT_APIKEY_Metadata
2026-05-29 21:24:09,820 INFO (bad4d5ca-5ba4-11f1-9125-0a5819011def) File saved succesfully: /usr/src/app/secrets_files/SIOFG_DES/SIFUG_BT_APIKEY
2026-05-29 21:24:09,820 INFO (bad4d5ca-5ba4-11f1-9125-0a5819011def) File saved succesfully: /usr/src/app/secrets_files/SIOFG_DES/CLISERFUG_SSO_INTER_Metadata
2026-05-29 21:24:09,820 INFO (bad4d5ca-5ba4-11f1-9125-0a5819011def) File saved succesfully: /usr/src/app/secrets_files/SIOFG_DES/CLISERFUG_SSO_INTER
2026-05-29 21:24:09,820 DEBUG (bad4d5ca-5ba4-11f1-9125-0a5819011def) Calling sign_app_out endpoint: https://sicsn.caixa/BeyondTrust/api/public/v3/Auth/Signout
2026-05-29 21:24:09,831 INFO (bad4d5ca-5ba4-11f1-9125-0a5819011def) {
    "execution_id": "bad4d5ca-5ba4-11f1-9125-0a5819011def",
    "input": {
        "secret_list": [
            "SIOFG_DES/SIFUG_DATASOURCE_02",
            "SIOFG_DES/SIFUG_DATASOURCE_15",
            "SIOFG_DES/SIFUG_XMQD1",
            "SIOFG_DES/SIFUG_BT_APIKEY",
            "SIOFG_DES/CLISERFUG_SSO_INTER"
        ],
        "folder_list": [],
        "managed_account_list": [],
        "secret_safe_url": "https://sicsn.caixa/BeyondTrust/api/public/v3",
        "user": {
            "UserId": 1612,
            "SID": null,
            "EmailAddress": null,
            "UserName": "clientid_SOFGD01",
            "Name": "clientid_SOFGD01"
        }
    },
    "output": {
        "secrets": [
            {
                "path": "SIOFG_DES/SIFUG_DATASOURCE_02_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"b102b0c5-81b7-4ac2-fd5e-08deb1ca7e32\", \"Title\": \"SIFUG_DATASOURCE_02\", \"Description\": \"usu\\u00e1rio SFUGDR02 do RACF\", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"033a310c-c67e-4068-121a-08deb1d51032\", \"CreatedOn\": \"2026-05-20T12:51:06.98Z\", \"CreatedBy\": \"Marco Silva\", \"ModifiedOn\": \"2026-05-20T12:55:39.4610229Z\", \"ModifiedBy\": \"Marco Silva\", \"Owner\": null, \"Folder\": \"SIOFG_DES\", \"FolderPath\": \"SIOFG_DES\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": null, \"UserId\": 1612, \"Owner\": null, \"Name\": \"clientid_SOFGD01\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"\", \"Urls\": []}"
            },
            {
                "path": "SIOFG_DES/SIFUG_DATASOURCE_02",
                "content": "***************"
            },
            {
                "path": "SIOFG_DES/SIFUG_DATASOURCE_15_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"87b9ffc6-0df1-456d-fd5f-08deb1ca7e32\", \"Title\": \"SIFUG_DATASOURCE_15\", \"Description\": \"usu\\u00e1rio SFUGDR15 do RACF\", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"033a310c-c67e-4068-121a-08deb1d51032\", \"CreatedOn\": \"2026-05-20T12:51:50.59Z\", \"CreatedBy\": \"Marco Silva\", \"ModifiedOn\": \"2026-05-20T12:55:56.5482983Z\", \"ModifiedBy\": \"Marco Silva\", \"Owner\": null, \"Folder\": \"SIOFG_DES\", \"FolderPath\": \"SIOFG_DES\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": null, \"UserId\": 1612, \"Owner\": null, \"Name\": \"clientid_SOFGD01\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"\", \"Urls\": []}"
            },
            {
                "path": "SIOFG_DES/SIFUG_DATASOURCE_15",
                "content": "***************"
            },
            {
                "path": "SIOFG_DES/SIFUG_XMQD1_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"9d37ce75-be5d-4bfc-fd60-08deb1ca7e32\", \"Title\": \"SIFUG_XMQD1\", \"Description\": \"usu\\u00e1rio SPFUGDB1 do MQ de Baixa Plataforma de BSB\", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"033a310c-c67e-4068-121a-08deb1d51032\", \"CreatedOn\": \"2026-05-20T12:52:44.08Z\", \"CreatedBy\": \"Marco Silva\", \"ModifiedOn\": \"2026-05-20T12:56:11.5332482Z\", \"ModifiedBy\": \"Marco Silva\", \"Owner\": null, \"Folder\": \"SIOFG_DES\", \"FolderPath\": \"SIOFG_DES\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": null, \"UserId\": 1612, \"Owner\": null, \"Name\": \"clientid_SOFGD01\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"\", \"Urls\": []}"
            },
            {
                "path": "SIOFG_DES/SIFUG_XMQD1",
                "content": "***************"
            },
            {
                "path": "SIOFG_DES/SIFUG_BT_APIKEY_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"40909b7e-c134-451b-fd61-08deb1ca7e32\", \"Title\": \"SIFUG_BT_APIKEY\", \"Description\": \"APIKey do SIFUG\", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"033a310c-c67e-4068-121a-08deb1d51032\", \"CreatedOn\": \"2026-05-20T12:53:29.83Z\", \"CreatedBy\": \"Marco Silva\", \"ModifiedOn\": \"2026-05-20T12:55:05.718298Z\", \"ModifiedBy\": \"Marco Silva\", \"Owner\": null, \"Folder\": \"SIOFG_DES\", \"FolderPath\": \"SIOFG_DES\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": null, \"UserId\": 1612, \"Owner\": null, \"Name\": \"clientid_SOFGD01\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"\", \"Urls\": []}"
            },
            {
                "path": "SIOFG_DES/SIFUG_BT_APIKEY",
                "content": "***************"
            },
            {
                "path": "SIOFG_DES/CLISERFUG_SSO_INTER_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"2d637ca2-8a74-4d01-fd62-08deb1ca7e32\", \"Title\": \"CLISERFUG_SSO_INTER\", \"Description\": \"cli-ser-fug (SSO desenvolvimento Internet)\", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"033a310c-c67e-4068-121a-08deb1d51032\", \"CreatedOn\": \"2026-05-20T12:54:13.83Z\", \"CreatedBy\": \"Marco Silva\", \"ModifiedOn\": \"2026-05-20T12:54:43.371318Z\", \"ModifiedBy\": \"Marco Silva\", \"Owner\": null, \"Folder\": \"SIOFG_DES\", \"FolderPath\": \"SIOFG_DES\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": null, \"UserId\": 1612, \"Owner\": null, \"Name\": \"clientid_SOFGD01\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"\", \"Urls\": []}"
            },
            {
                "path": "SIOFG_DES/CLISERFUG_SSO_INTER",
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
2026-05-29 21:24:09,831 INFO (bad4d5ca-5ba4-11f1-9125-0a5819011def) Ending Execution...bad4d5ca-5ba4-11f1-9125-0a5819011def





