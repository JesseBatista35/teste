
-sh-4.2$ oc get pod -n sicmo-des | grep internet-des
sicmo-internet-des-94-deploy            0/1       Completed          0             21h
sicmo-internet-des-94-swszw             0/1       CrashLoopBackOff   2 (15s ago)   97s
sicmo-internet-des-97-deploy            0/1       Error              0             106m
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get events -n sicmo-des --field-selector involvedObject.name=sicmo-internet-des-94-swszw
LAST SEEN   TYPE      REASON           OBJECT                            MESSAGE
105s        Normal    Scheduled        pod/sicmo-internet-des-94-swszw   Successfully assigned sicmo-des/sicmo-internet-des-94-swszw to ceadecldlx026.nprd.caixa
102s        Normal    AddedInterface   pod/sicmo-internet-des-94-swszw   Add eth0 [25.1.2.84/23] from openshift-sdn
102s        Normal    Pulled           pod/sicmo-internet-des-94-swszw   Container image "default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.2" already present on machine
102s        Normal    Created          pod/sicmo-internet-des-94-swszw   Created container secrets-agent-sidecar
102s        Normal    Started          pod/sicmo-internet-des-94-swszw   Started container secrets-agent-sidecar
100s        Normal    Pulled           pod/sicmo-internet-des-94-swszw   Container image "default-route-openshift-image-registry.apps.produtos4.caixa/openshift/ubi:9.3-1552" already present on machine
100s        Normal    Created          pod/sicmo-internet-des-94-swszw   Created container secrets-check
100s        Normal    Started          pod/sicmo-internet-des-94-swszw   Started container secrets-check
43s         Normal    Pulling          pod/sicmo-internet-des-94-swszw   Pulling image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicmo-backend-internet:1.6.0.2"
95s         Normal    Pulled           pod/sicmo-internet-des-94-swszw   Successfully pulled image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicmo-backend-internet:1.6.0.2" in 4.016265304s (4.016277778s including waiting)
42s         Normal    Created          pod/sicmo-internet-des-94-swszw   Created container sicmo-internet-des
42s         Normal    Started          pod/sicmo-internet-des-94-swszw   Started container sicmo-internet-des
74s         Normal    Pulled           pod/sicmo-internet-des-94-swszw   Successfully pulled image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicmo-backend-internet:1.6.0.2" in 123.925741ms (123.936965ms including waiting)
11s         Warning   BackOff          pod/sicmo-internet-des-94-swszw   Back-off restarting failed container
42s         Normal    Pulled           pod/sicmo-internet-des-94-swszw   Successfully pulled image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicmo-backend-internet:1.6.0.2" in 62.907362ms (64.41582ms including waiting)
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs sicmo-internet-des-94-swszw -c secrets-agent-sidecar -n sicmo-des
2026-10-06 17:15:48,632 INFO Getting secrets just once, POLLING_WAIT_BETWEEN_REQUESTS_MINUTES was not configured
2026-10-06 17:15:48,633 INFO (931311b2-c1a9-11f1-ac4c-0a5819010254) APP VERSION: 2.1.0
2026-10-06 17:15:48,633 INFO (931311b2-c1a9-11f1-ac4c-0a5819010254) Starting Execution...931311b2-c1a9-11f1-ac4c-0a5819010254
2026-10-06 17:15:48,633 INFO (931311b2-c1a9-11f1-ac4c-0a5819010254) You are using: <,> as List delimiter
2026-10-06 17:15:48,633 WARNING (931311b2-c1a9-11f1-ac4c-0a5819010254) InsecureRequestWarning: Unverified HTTPS request is being made to host https://sicsn.caixa/BeyondTrust/api/public/v3'. Adding certificate verification isstrongly advised. See: https://urllib3.readthedocs.io/en/1.26.x/advanced-usage.html#ssl-warnings
2026-10-06 17:15:48,633 INFO (931311b2-c1a9-11f1-ac4c-0a5819010254) Certificate was not configured
2026-10-06 17:15:48,637 DEBUG (931311b2-c1a9-11f1-ac4c-0a5819010254) How long to wait for the server to connect and send data before giving up: connection timeout: 30 seconds, request timeout 30 seconds
2026-10-06 17:15:48,637 WARNING (931311b2-c1a9-11f1-ac4c-0a5819010254) verify_ca=false is insecure, it instructs the caller to not verify the certificate authority when making API calls.
2026-10-06 17:15:48,706 INFO (931311b2-c1a9-11f1-ac4c-0a5819010254) Calling sign_app_in endpoint: https://sicsn.caixa/BeyondTrust/api/public/v3
2026-10-06 17:15:48,763 DEBUG (931311b2-c1a9-11f1-ac4c-0a5819010254) Running get_secret method in SecretsSafe class
2026-10-06 17:15:48,763 INFO (931311b2-c1a9-11f1-ac4c-0a5819010254) **************** secret path: SICMO_DES/CLISERCMO_SSO_INTER *****************
2026-10-06 17:15:48,770 DEBUG (931311b2-c1a9-11f1-ac4c-0a5819010254) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SICMO_DES&separator=%2F&version=3.1&title=CLISERCMO_SSO_INTER
2026-10-06 17:15:48,771 DEBUG (931311b2-c1a9-11f1-ac4c-0a5819010254) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SICMO_DES&separator=%2F&version=3.1&title=CLISERCMO_SSO_INTER
2026-10-06 17:15:48,919 DEBUG (931311b2-c1a9-11f1-ac4c-0a5819010254) Secret type: Text
2026-10-06 17:15:48,919 INFO (931311b2-c1a9-11f1-ac4c-0a5819010254) Secret was successfully retrieved
2026-10-06 17:15:48,920 DEBUG (931311b2-c1a9-11f1-ac4c-0a5819010254) Running get_secret method in SecretsSafe class
2026-10-06 17:15:48,920 INFO (931311b2-c1a9-11f1-ac4c-0a5819010254) **************** secret path: SICMO_DES/CLISERCMO_SSO_INTRA *****************
2026-10-06 17:15:48,920 DEBUG (931311b2-c1a9-11f1-ac4c-0a5819010254) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SICMO_DES&separator=%2F&version=3.1&title=CLISERCMO_SSO_INTRA
2026-10-06 17:15:48,920 DEBUG (931311b2-c1a9-11f1-ac4c-0a5819010254) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SICMO_DES&separator=%2F&version=3.1&title=CLISERCMO_SSO_INTRA
2026-10-06 17:15:48,999 DEBUG (931311b2-c1a9-11f1-ac4c-0a5819010254) Secret type: Text
2026-10-06 17:15:48,999 INFO (931311b2-c1a9-11f1-ac4c-0a5819010254) Secret was successfully retrieved
2026-10-06 17:15:49,000 DEBUG (931311b2-c1a9-11f1-ac4c-0a5819010254) Running get_secret method in SecretsSafe class
2026-10-06 17:15:49,000 INFO (931311b2-c1a9-11f1-ac4c-0a5819010254) **************** secret path: SICMO_DES/SASOBD01_POSTGRES *****************
2026-10-06 17:15:49,000 DEBUG (931311b2-c1a9-11f1-ac4c-0a5819010254) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SICMO_DES&separator=%2F&version=3.1&title=SASOBD01_POSTGRES
2026-10-06 17:15:49,000 DEBUG (931311b2-c1a9-11f1-ac4c-0a5819010254) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SICMO_DES&separator=%2F&version=3.1&title=SASOBD01_POSTGRES
2026-10-06 17:15:49,094 DEBUG (931311b2-c1a9-11f1-ac4c-0a5819010254) Secret type: Text
2026-10-06 17:15:49,094 INFO (931311b2-c1a9-11f1-ac4c-0a5819010254) Secret was successfully retrieved
2026-10-06 17:15:49,094 DEBUG (931311b2-c1a9-11f1-ac4c-0a5819010254) Running get_secret method in SecretsSafe class
2026-10-06 17:15:49,094 INFO (931311b2-c1a9-11f1-ac4c-0a5819010254) **************** secret path: SICMO_DES/SCMOBD01_MSSQL *****************
2026-10-06 17:15:49,095 DEBUG (931311b2-c1a9-11f1-ac4c-0a5819010254) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SICMO_DES&separator=%2F&version=3.1&title=SCMOBD01_MSSQL
2026-10-06 17:15:49,095 DEBUG (931311b2-c1a9-11f1-ac4c-0a5819010254) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SICMO_DES&separator=%2F&version=3.1&title=SCMOBD01_MSSQL
2026-10-06 17:15:49,167 DEBUG (931311b2-c1a9-11f1-ac4c-0a5819010254) Secret type: Text
2026-10-06 17:15:49,167 INFO (931311b2-c1a9-11f1-ac4c-0a5819010254) Secret was successfully retrieved
2026-10-06 17:15:49,168 INFO (931311b2-c1a9-11f1-ac4c-0a5819010254) Secrets folder Path /usr/src/app/secrets_files
2026-10-06 17:15:49,168 INFO (931311b2-c1a9-11f1-ac4c-0a5819010254) Creating files with the secrets as content, number of files 8
2026-10-06 17:15:49,168 INFO (931311b2-c1a9-11f1-ac4c-0a5819010254) File saved succesfully: /usr/src/app/secrets_files/SICMO_DES/CLISERCMO_SSO_INTER_Metadata
2026-10-06 17:15:49,168 INFO (931311b2-c1a9-11f1-ac4c-0a5819010254) File saved succesfully: /usr/src/app/secrets_files/SICMO_DES/CLISERCMO_SSO_INTER
2026-10-06 17:15:49,168 INFO (931311b2-c1a9-11f1-ac4c-0a5819010254) File saved succesfully: /usr/src/app/secrets_files/SICMO_DES/CLISERCMO_SSO_INTRA_Metadata
2026-10-06 17:15:49,168 INFO (931311b2-c1a9-11f1-ac4c-0a5819010254) File saved succesfully: /usr/src/app/secrets_files/SICMO_DES/CLISERCMO_SSO_INTRA
2026-10-06 17:15:49,168 INFO (931311b2-c1a9-11f1-ac4c-0a5819010254) File saved succesfully: /usr/src/app/secrets_files/SICMO_DES/SASOBD01_POSTGRES_Metadata
2026-10-06 17:15:49,168 INFO (931311b2-c1a9-11f1-ac4c-0a5819010254) File saved succesfully: /usr/src/app/secrets_files/SICMO_DES/SASOBD01_POSTGRES
2026-10-06 17:15:49,169 INFO (931311b2-c1a9-11f1-ac4c-0a5819010254) File saved succesfully: /usr/src/app/secrets_files/SICMO_DES/SCMOBD01_MSSQL_Metadata
2026-10-06 17:15:49,169 INFO (931311b2-c1a9-11f1-ac4c-0a5819010254) File saved succesfully: /usr/src/app/secrets_files/SICMO_DES/SCMOBD01_MSSQL
2026-10-06 17:15:49,169 DEBUG (931311b2-c1a9-11f1-ac4c-0a5819010254) Calling sign_app_out endpoint: https://sicsn.caixa/BeyondTrust/api/public/v3/Auth/Signout
2026-10-06 17:15:49,182 INFO (931311b2-c1a9-11f1-ac4c-0a5819010254) {
    "execution_id": "931311b2-c1a9-11f1-ac4c-0a5819010254",
    "input": {
        "secret_list": [
            "SICMO_DES/CLISERCMO_SSO_INTER",
            "SICMO_DES/CLISERCMO_SSO_INTRA",
            "SICMO_DES/SASOBD01_POSTGRES",
            "SICMO_DES/SCMOBD01_MSSQL"
        ],
        "folder_list": [],
        "managed_account_list": [],
        "secret_safe_url": "https://sicsn.caixa/BeyondTrust/api/public/v3",
        "user": {
            "UserId": 1455,
            "SID": null,
            "EmailAddress": null,
            "UserName": "clientid_SCMODB01",
            "Name": "clientid_SCMODB01"
        }
    },
    "output": {
        "secrets": [
            {
                "path": "SICMO_DES/CLISERCMO_SSO_INTER_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"d43ee9e4-d555-4751-6383-08de73c7b5e4\", \"Title\": \"CLISERCMO_SSO_INTER\", \"Description\": \"\", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"b5594d4d-0ef2-4546-acb9-08de73c5ff9e\", \"CreatedOn\": \"2026-02-26T12:38:14.14Z\", \"CreatedBy\": \"Pedro Souza\", \"ModifiedOn\": \"2026-08-27T13:55:35.029914Z\", \"ModifiedBy\": \"Pedro Souza\", \"Owner\": null, \"Folder\": \"SICMO_DES\", \"FolderPath\": \"SICMO_DES\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": null, \"UserId\": 1684, \"Owner\": null, \"Name\": \"SCMODB02\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"\", \"Urls\": []}"
            },
            {
                "path": "SICMO_DES/CLISERCMO_SSO_INTER",
                "content": "***************"
            },
            {
                "path": "SICMO_DES/CLISERCMO_SSO_INTRA_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"ff79923d-6f5b-42b4-6382-08de73c7b5e4\", \"Title\": \"CLISERCMO_SSO_INTRA\", \"Description\": \"\", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"b5594d4d-0ef2-4546-acb9-08de73c5ff9e\", \"CreatedOn\": \"2026-02-26T12:37:44.98Z\", \"CreatedBy\": \"Pedro Souza\", \"ModifiedOn\": \"2026-02-26T12:38:59.2906451Z\", \"ModifiedBy\": \"Pedro Souza\", \"Owner\": null, \"Folder\": \"SICMO_DES\", \"FolderPath\": \"SICMO_DES\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": null, \"UserId\": 1455, \"Owner\": null, \"Name\": \"clientid_SCMODB01\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"\", \"Urls\": []}"
            },
            {
                "path": "SICMO_DES/CLISERCMO_SSO_INTRA",
                "content": "***************"
            },
            {
                "path": "SICMO_DES/SASOBD01_POSTGRES_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"77cb2071-ae15-4ef8-637e-08de73c7b5e4\", \"Title\": \"SASOBD01_POSTGRES\", \"Description\": \"\", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"b5594d4d-0ef2-4546-acb9-08de73c5ff9e\", \"CreatedOn\": \"2026-02-25T18:46:03.3533333Z\", \"CreatedBy\": \"Pedro Souza\", \"ModifiedOn\": \"2026-02-26T12:38:43.702735Z\", \"ModifiedBy\": \"Pedro Souza\", \"Owner\": null, \"Folder\": \"SICMO_DES\", \"FolderPath\": \"SICMO_DES\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": null, \"UserId\": 1455, \"Owner\": null, \"Name\": \"clientid_SCMODB01\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"\", \"Urls\": []}"
            },
            {
                "path": "SICMO_DES/SASOBD01_POSTGRES",
                "content": "***************"
            },
            {
                "path": "SICMO_DES/SCMOBD01_MSSQL_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"6f0ef632-9984-451a-637f-08de73c7b5e4\", \"Title\": \"SCMOBD01_MSSQL\", \"Description\": \"\", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"b5594d4d-0ef2-4546-acb9-08de73c5ff9e\", \"CreatedOn\": \"2026-02-25T18:46:53.33Z\", \"CreatedBy\": \"Pedro Souza\", \"ModifiedOn\": \"2026-02-26T12:38:29.6077367Z\", \"ModifiedBy\": \"Pedro Souza\", \"Owner\": null, \"Folder\": \"SICMO_DES\", \"FolderPath\": \"SICMO_DES\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": null, \"UserId\": 1455, \"Owner\": null, \"Name\": \"clientid_SCMODB01\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"\", \"Urls\": []}"
            },
            {
                "path": "SICMO_DES/SCMOBD01_MSSQL",
                "content": "***************"
            }
        ],
        "messages": [
            {
                "message": "Creating files with the secrets as content, number of files 8",
                "type": "INFO"
            }
        ],
        "errors": []
    }
}
2026-10-06 17:15:49,182 INFO (931311b2-c1a9-11f1-ac4c-0a5819010254) Ending Execution...931311b2-c1a9-11f1-ac4c-0a5819010254
-sh-4.2$
