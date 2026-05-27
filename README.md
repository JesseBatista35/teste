2026-05-27T19:17:11.8949147Z ##[section]Starting: Exporta Variáveis de Ambiente "_SECRET."
2026-05-27T19:17:11.8954101Z ==============================================================================
2026-05-27T19:17:11.8954242Z Task         : Bash
2026-05-27T19:17:11.8954314Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-05-27T19:17:11.8954453Z Version      : 3.227.0
2026-05-27T19:17:11.8954521Z Author       : Microsoft Corporation
2026-05-27T19:17:11.8954608Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-05-27T19:17:11.8955187Z ==============================================================================
2026-05-27T19:17:12.0370500Z Generating script.
2026-05-27T19:17:12.0380893Z ========================== Starting Command Output ===========================
2026-05-27T19:17:12.0389995Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/6a0bc800-3b14-498c-9f42-8ce272379f0b.sh
2026-05-27T19:17:12.0513513Z API_KEY='${SISGF_APIKEY}'
2026-05-27T19:17:12.0515595Z DB2_SIICO_PASSWORD='${SSGFRD01_DB2}'
2026-05-27T19:17:12.0515874Z QUARKUS_DATASOURCE_PASSWORD='${SSGFRD02_ORA}'
2026-05-27T19:17:12.0516156Z QUARKUS_HTTP_SSL_CERTIFICATE_KEY-STORE-PASSWORD=#{JKS_PASS}#
2026-05-27T19:17:12.0516491Z QUARKUS_OIDC_CREDENTIALS_SECRET='${CLISERSGF_SSO_INTRA}'
2026-05-27T19:17:12.0517264Z SFTP_CLIENT_SECRET='${SSGFDR01_SFTP}'
2026-05-27T19:17:12.0517694Z SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS=#{VAULT_LOCATION}#
2026-05-27T19:17:12.0533209Z tem_secret é igual a true
2026-05-27T19:17:12.0588309Z ##[section]Finishing: Exporta Variáveis de Ambiente "_SECRET."
