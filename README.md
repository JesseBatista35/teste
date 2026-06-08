2026-06-08T19:35:54.8156877Z ##[section]Starting: Alterando Valores placeholders nos arquivos de config
2026-06-08T19:35:54.8160256Z ==============================================================================
2026-06-08T19:35:54.8160338Z Task         : Replace Tokens
2026-06-08T19:35:54.8160398Z Description  : Replace tokens in files
2026-06-08T19:35:54.8160461Z Version      : 3.3.1
2026-06-08T19:35:54.8160506Z Author       : Guillaume Rouchon
2026-06-08T19:35:54.8160561Z Help         : v3.3.1 - [More Information](https://github.com/qetza/vsts-replacetokens-task#readme)
2026-06-08T19:35:54.8160654Z ==============================================================================
2026-06-08T19:35:55.0025303Z replacing tokens in: /opt/ads-agent/_work/r791/a/_SICMU-intranet-update-config/jboss/standalone-full-ha-old.xml
2026-06-08T19:35:55.0152526Z ##[error]  variable not found: SGR_INTRA_URL
2026-06-08T19:35:55.0154400Z ##[error]  variable not found: DB2_CMU_URL
2026-06-08T19:35:55.0155972Z ##[error]  variable not found: DB2_CMU_USR
2026-06-08T19:35:55.0167555Z replacing tokens in: /opt/ads-agent/_work/r791/a/_SICMU-intranet-update-config/jboss/standalone-full-ha.xml
2026-06-08T19:35:55.0173009Z ##[error]  variable not found: SGR_INTRA_URL
2026-06-08T19:35:55.0175097Z ##[error]  variable not found: DB2_CMU_URL
2026-06-08T19:35:55.0177440Z ##[error]  variable not found: DB2_CMU_USR
2026-06-08T19:35:55.0179559Z ##[error]  variable not found: DB2_RJP4_URL
2026-06-08T19:35:55.0181868Z ##[error]  variable not found: DB2_CMU_USR
2026-06-08T19:35:55.0227760Z replacing tokens in: /opt/ads-agent/_work/r791/a/_SICMU-intranet-update-config/httpd/00-mpm.conf
2026-06-08T19:35:55.0277918Z replacing tokens in: /opt/ads-agent/_work/r791/a/_SICMU-intranet-update-config/httpd/httpd.conf
2026-06-08T19:35:55.0294073Z replacing tokens in: /opt/ads-agent/_work/r791/a/_SICMU-intranet-update-config/httpd/vhost.conf
2026-06-08T19:35:55.0309145Z replacing tokens in: /opt/ads-agent/_work/r791/a/_SICMU-intranet-update-config/jboss/standalone.conf
2026-06-08T19:35:55.0554361Z ##[section]Finishing: Alterando Valores placeholders nos arquivos de config
