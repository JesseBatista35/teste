2026-05-27 19:11:42,414 INFO Getting secrets just once, POLLING_WAIT_BETWEEN_REQUESTS_MINUTES was not configured
2026-05-27 19:11:42,414 INFO (e552f850-59ff-11f1-8004-0a58190219c3) APP VERSION: 2.1.0
2026-05-27 19:11:42,415 INFO (e552f850-59ff-11f1-8004-0a58190219c3) Starting Execution...e552f850-59ff-11f1-8004-0a58190219c3
2026-05-27 19:11:42,415 INFO (e552f850-59ff-11f1-8004-0a58190219c3) You are using: <,> as List delimiter
2026-05-27 19:11:42,415 WARNING (e552f850-59ff-11f1-8004-0a58190219c3) InsecureRequestWarning: Unverified HTTPS request is being made to host https://sicsn.caixa/BeyondTrust/api/public/v3'. Adding certificate verification isstrongly advised. See: https://urllib3.readthedocs.io/en/1.26.x/advanced-usage.html#ssl-warnings
2026-05-27 19:11:42,415 INFO (e552f850-59ff-11f1-8004-0a58190219c3) Certificate was not configured
2026-05-27 19:11:42,419 DEBUG (e552f850-59ff-11f1-8004-0a58190219c3) How long to wait for the server to connect and send data before giving up: connection timeout: 30 seconds, request timeout 30 seconds
2026-05-27 19:11:42,420 WARNING (e552f850-59ff-11f1-8004-0a58190219c3) verify_ca=false is insecure, it instructs the caller to not verify the certificate authority when making API calls.
2026-05-27 19:11:42,560 INFO (e552f850-59ff-11f1-8004-0a58190219c3) Calling sign_app_in endpoint: https://sicsn.caixa/BeyondTrust/api/public/v3
2026-05-27 19:11:42,600 DEBUG (e552f850-59ff-11f1-8004-0a58190219c3) Running get_secret method in SecretsSafe class
2026-05-27 19:11:42,600 INFO (e552f850-59ff-11f1-8004-0a58190219c3) **************** secret path: SISGF_DES/SSGFDR01_SFTP *****************
2026-05-27 19:11:42,613 DEBUG (e552f850-59ff-11f1-8004-0a58190219c3) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SISGF_DES&separator=%2F&version=3.1&title=SSGFDR01_SFTP
2026-05-27 19:11:42,614 DEBUG (e552f850-59ff-11f1-8004-0a58190219c3) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SISGF_DES&separator=%2F&version=3.1&title=SSGFDR01_SFTP
2026-05-27 19:11:42,712 DEBUG (e552f850-59ff-11f1-8004-0a58190219c3) Secret type: Text
2026-05-27 19:11:42,712 INFO (e552f850-59ff-11f1-8004-0a58190219c3) Secret was successfully retrieved
2026-05-27 19:11:42,712 DEBUG (e552f850-59ff-11f1-8004-0a58190219c3) Running get_secret method in SecretsSafe class
2026-05-27 19:11:42,712 INFO (e552f850-59ff-11f1-8004-0a58190219c3) **************** secret path: SISGF_DES/CLISERSGF_SSO_INTRA *****************
2026-05-27 19:11:42,713 DEBUG (e552f850-59ff-11f1-8004-0a58190219c3) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SISGF_DES&separator=%2F&version=3.1&title=CLISERSGF_SSO_INTRA
2026-05-27 19:11:42,713 DEBUG (e552f850-59ff-11f1-8004-0a58190219c3) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SISGF_DES&separator=%2F&version=3.1&title=CLISERSGF_SSO_INTRA
2026-05-27 19:11:42,788 DEBUG (e552f850-59ff-11f1-8004-0a58190219c3) Secret type: Text
2026-05-27 19:11:42,789 INFO (e552f850-59ff-11f1-8004-0a58190219c3) Secret was successfully retrieved
2026-05-27 19:11:42,789 DEBUG (e552f850-59ff-11f1-8004-0a58190219c3) Running get_secret method in SecretsSafe class
2026-05-27 19:11:42,789 INFO (e552f850-59ff-11f1-8004-0a58190219c3) **************** secret path: SISGF_DES/SISGF_APIKEY *****************
2026-05-27 19:11:42,789 DEBUG (e552f850-59ff-11f1-8004-0a58190219c3) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SISGF_DES&separator=%2F&version=3.1&title=SISGF_APIKEY
2026-05-27 19:11:42,790 DEBUG (e552f850-59ff-11f1-8004-0a58190219c3) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SISGF_DES&separator=%2F&version=3.1&title=SISGF_APIKEY
2026-05-27 19:11:42,865 DEBUG (e552f850-59ff-11f1-8004-0a58190219c3) Secret type: Text
2026-05-27 19:11:42,865 INFO (e552f850-59ff-11f1-8004-0a58190219c3) Secret was successfully retrieved
2026-05-27 19:11:42,865 DEBUG (e552f850-59ff-11f1-8004-0a58190219c3) Running get_secret method in SecretsSafe class
2026-05-27 19:11:42,865 INFO (e552f850-59ff-11f1-8004-0a58190219c3) **************** secret path: SISGF_DES/SSGFRD01_DB2 *****************
2026-05-27 19:11:42,866 DEBUG (e552f850-59ff-11f1-8004-0a58190219c3) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SISGF_DES&separator=%2F&version=3.1&title=SSGFRD01_DB2
2026-05-27 19:11:42,866 DEBUG (e552f850-59ff-11f1-8004-0a58190219c3) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SISGF_DES&separator=%2F&version=3.1&title=SSGFRD01_DB2
2026-05-27 19:11:42,981 DEBUG (e552f850-59ff-11f1-8004-0a58190219c3) Secret type: Text
2026-05-27 19:11:42,981 INFO (e552f850-59ff-11f1-8004-0a58190219c3) Secret was successfully retrieved
2026-05-27 19:11:42,981 DEBUG (e552f850-59ff-11f1-8004-0a58190219c3) Running get_secret method in SecretsSafe class
2026-05-27 19:11:42,981 INFO (e552f850-59ff-11f1-8004-0a58190219c3) **************** secret path: SISGF_DES/SSGFRD02_ORA *****************
2026-05-27 19:11:42,981 DEBUG (e552f850-59ff-11f1-8004-0a58190219c3) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SISGF_DES&separator=%2F&version=3.1&title=SSGFRD02_ORA
2026-05-27 19:11:42,982 DEBUG (e552f850-59ff-11f1-8004-0a58190219c3) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SISGF_DES&separator=%2F&version=3.1&title=SSGFRD02_ORA
2026-05-27 19:11:43,072 DEBUG (e552f850-59ff-11f1-8004-0a58190219c3) Secret type: Text
2026-05-27 19:11:43,072 INFO (e552f850-59ff-11f1-8004-0a58190219c3) Secret was successfully retrieved
2026-05-27 19:11:43,072 INFO (e552f850-59ff-11f1-8004-0a58190219c3) Secrets folder Path /usr/src/app/secrets_files
2026-05-27 19:11:43,072 INFO (e552f850-59ff-11f1-8004-0a58190219c3) Creating files with the secrets as content, number of files 10
2026-05-27 19:11:43,073 INFO (e552f850-59ff-11f1-8004-0a58190219c3) File saved succesfully: /usr/src/app/secrets_files/SISGF_DES/SSGFDR01_SFTP_Metadata
2026-05-27 19:11:43,073 INFO (e552f850-59ff-11f1-8004-0a58190219c3) File saved succesfully: /usr/src/app/secrets_files/SISGF_DES/SSGFDR01_SFTP
2026-05-27 19:11:43,073 INFO (e552f850-59ff-11f1-8004-0a58190219c3) File saved succesfully: /usr/src/app/secrets_files/SISGF_DES/CLISERSGF_SSO_INTRA_Metadata
2026-05-27 19:11:43,073 INFO (e552f850-59ff-11f1-8004-0a58190219c3) File saved succesfully: /usr/src/app/secrets_files/SISGF_DES/CLISERSGF_SSO_INTRA
2026-05-27 19:11:43,073 INFO (e552f850-59ff-11f1-8004-0a58190219c3) File saved succesfully: /usr/src/app/secrets_files/SISGF_DES/SISGF_APIKEY_Metadata
2026-05-27 19:11:43,073 INFO (e552f850-59ff-11f1-8004-0a58190219c3) File saved succesfully: /usr/src/app/secrets_files/SISGF_DES/SISGF_APIKEY
2026-05-27 19:11:43,073 INFO (e552f850-59ff-11f1-8004-0a58190219c3) File saved succesfully: /usr/src/app/secrets_files/SISGF_DES/SSGFRD01_DB2_Metadata
2026-05-27 19:11:43,073 INFO (e552f850-59ff-11f1-8004-0a58190219c3) File saved succesfully: /usr/src/app/secrets_files/SISGF_DES/SSGFRD01_DB2
2026-05-27 19:11:43,073 INFO (e552f850-59ff-11f1-8004-0a58190219c3) File saved succesfully: /usr/src/app/secrets_files/SISGF_DES/SSGFRD02_ORA_Metadata
2026-05-27 19:11:43,073 INFO (e552f850-59ff-11f1-8004-0a58190219c3) File saved succesfully: /usr/src/app/secrets_files/SISGF_DES/SSGFRD02_ORA
2026-05-27 19:11:43,073 DEBUG (e552f850-59ff-11f1-8004-0a58190219c3) Calling sign_app_out endpoint: https://sicsn.caixa/BeyondTrust/api/public/v3/Auth/Signout
2026-05-27 19:11:43,097 INFO (e552f850-59ff-11f1-8004-0a58190219c3) {
    "execution_id": "e552f850-59ff-11f1-8004-0a58190219c3",
    "input": {
        "secret_list": [
            "SISGF_DES/SSGFDR01_SFTP",
            "SISGF_DES/CLISERSGF_SSO_INTRA",
            "SISGF_DES/SISGF_APIKEY",
            "SISGF_DES/SSGFRD01_DB2",
            "SISGF_DES/SSGFRD02_ORA"
        ],
        "folder_list": [],
        "managed_account_list": [],
        "secret_safe_url": "https://sicsn.caixa/BeyondTrust/api/public/v3",
        "user": {
            "UserId": 1535,
            "SID": null,
            "EmailAddress": null,
            "UserName": "clientid_SSGFRD01",
            "Name": "clientid_SSGFRD01"
        }
    },
    "output": {
        "secrets": [
            {
                "path": "SISGF_DES/SSGFDR01_SFTP_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"0c90f8c0-e61a-467d-fb12-08de9bb25522\", \"Title\": \"SSGFDR01_SFTP\", \"Description\": \"usuario criado no servidor srjdeapllx064\", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"d498bafa-ffa5-45c9-b593-08de956188ae\", \"CreatedOn\": \"2026-04-24T14:28:41.9866667Z\", \"CreatedBy\": \"Marco Silva\", \"ModifiedOn\": \"2026-04-24T14:29:12.3345305Z\", \"ModifiedBy\": \"Marco Silva\", \"Owner\": null, \"Folder\": \"SISGF_DES\", \"FolderPath\": \"SISGF_DES\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": null, \"UserId\": 1535, \"Owner\": null, \"Name\": \"clientid_SSGFRD01\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"\", \"Urls\": []}"
            },
            {
                "path": "SISGF_DES/SSGFDR01_SFTP",
                "content": "***************"
            },
            {
                "path": "SISGF_DES/CLISERSGF_SSO_INTRA_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"0de9601d-7346-42bf-eaea-08de9494f9ea\", \"Title\": \"CLISERSGF_SSO_INTRA\", \"Description\": \"clientid cli-ser-sgf na intranet de DES\", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"d498bafa-ffa5-45c9-b593-08de956188ae\", \"CreatedOn\": \"2026-04-08T11:43:52.75Z\", \"CreatedBy\": \"Marco Silva\", \"ModifiedOn\": \"2026-04-08T11:44:18.7997197Z\", \"ModifiedBy\": \"Marco Silva\", \"Owner\": null, \"Folder\": \"SISGF_DES\", \"FolderPath\": \"SISGF_DES\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": null, \"UserId\": 1535, \"Owner\": null, \"Name\": \"clientid_SSGFRD01\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"secret do clientID cli-ser-sgf na intranet de DES\", \"Urls\": []}"
            },
            {
                "path": "SISGF_DES/CLISERSGF_SSO_INTRA",
                "content": "***************"
            },
            {
                "path": "SISGF_DES/SISGF_APIKEY_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"0b6decb2-13f9-497d-eaeb-08de9494f9ea\", \"Title\": \"SISGF_APIKEY\", \"Description\": \"APIKEY do SISGF NPRD\", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"d498bafa-ffa5-45c9-b593-08de956188ae\", \"CreatedOn\": \"2026-04-08T11:45:36.4066667Z\", \"CreatedBy\": \"Marco Silva\", \"ModifiedOn\": \"2026-04-08T11:45:55.3143458Z\", \"ModifiedBy\": \"Marco Silva\", \"Owner\": null, \"Folder\": \"SISGF_DES\", \"FolderPath\": \"SISGF_DES\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": null, \"UserId\": 1535, \"Owner\": null, \"Name\": \"clientid_SSGFRD01\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"ambiente NPRD\", \"Urls\": []}"
            },
            {
                "path": "SISGF_DES/SISGF_APIKEY",
                "content": "***************"
            },
            {
                "path": "SISGF_DES/SSGFRD01_DB2_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"0daab837-902e-4fb6-eae9-08de9494f9ea\", \"Title\": \"SSGFRD01_DB2\", \"Description\": \"Usuario do DB2 \", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"d498bafa-ffa5-45c9-b593-08de956188ae\", \"CreatedOn\": \"2026-04-08T11:40:58.7233333Z\", \"CreatedBy\": \"Marco Silva\", \"ModifiedOn\": \"2026-04-08T11:42:17.4357475Z\", \"ModifiedBy\": \"Marco Silva\", \"Owner\": null, \"Folder\": \"SISGF_DES\", \"FolderPath\": \"SISGF_DES\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": null, \"UserId\": 1535, \"Owner\": null, \"Name\": \"clientid_SSGFRD01\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"verificado no cofre\", \"Urls\": []}"
            },
            {
                "path": "SISGF_DES/SSGFRD01_DB2",
                "content": "***************"
            },
            {
                "path": "SISGF_DES/SSGFRD02_ORA_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"f4eeee33-98c7-4df9-728e-08dea4601b92\", \"Title\": \"SSGFRD02_ORA\", \"Description\": \"usuario criado na instancia ORAD01SC com as mesmas permissoes do SSGFRD01 \", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"d498bafa-ffa5-45c9-b593-08de956188ae\", \"CreatedOn\": \"2026-04-27T13:23:01.96Z\", \"CreatedBy\": \"Marco Silva\", \"ModifiedOn\": \"2026-04-27T13:23:26.1252263Z\", \"ModifiedBy\": \"Marco Silva\", \"Owner\": null, \"Folder\": \"SISGF_DES\", \"FolderPath\": \"SISGF_DES\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": null, \"UserId\": 1535, \"Owner\": null, \"Name\": \"clientid_SSGFRD01\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"WO0000080183167\", \"Urls\": []}"
            },
            {
                "path": "SISGF_DES/SSGFRD02_ORA",
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
2026-05-27 19:11:43,097 INFO (e552f850-59ff-11f1-8004-0a58190219c3) Ending Execution...e552f850-59ff-11f1-8004-0a58190219c3

