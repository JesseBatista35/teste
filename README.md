
[p585600@srjtqapllx0021 ~]$
[p585600@srjtqapllx0021 ~]$ find /infra_app/config/sifug -iname "*.jks" -o -iname "*.p12" -o -iname "*.pfx" 2>/dev/null
/infra_app/config/sifug/keystore.jks
/infra_app/config/sifug/IF104.p12
[p585600@srjtqapllx0021 ~]$
[p585600@srjtqapllx0021 ~]$
[p585600@srjtqapllx0021 ~]$
[p585600@srjtqapllx0021 ~]$
[p585600@srjtqapllx0021 ~]$
[p585600@srjtqapllx0021 ~]$ find /opt/open/jboss/7.0.0/domain/configuration -iname "*.jks" -o -iname "*keystore*" 2>/dev/null
/opt/open/jboss/7.0.0/domain/configuration/domain.xml.20240718_NOVO_ATUALIZADO_KEYSTORE_PARA_TESTES
/opt/open/jboss/7.0.0/domain/configuration/keystoreIF104_1.crt
[p585600@srjtqapllx0021 ~]$
[p585600@srjtqapllx0021 ~]$
[p585600@srjtqapllx0021 ~]$ grep -ri "keystore\|key.store\|certificate\|mtls\|dataprev" /infra_app/config/sifug/*.properties
/infra_app/config/sifug/sifug_roles_map.properties:#intranet.fgdcontabil.consultanotificacaodataprev                                    = 215003009
/infra_app/config/sifug/sifug_roles_map.properties:intranet.fgdcontabil.consignado.notificacaodataprev                                 = 215005001
/infra_app/config/sifug/sifug_roles_map.properties:intranet.fgdcontabil.consignado.notificacaodataprev.consultar                       = 215005001:FUG_OBJETO_TELA:CONSULTAR
/infra_app/config/sifug/sifug_roles_map.properties:intranet.fgdcontabil.consignado.notificacaodataprev.detalhar                        = 215005001:FUG_OBJETO_TELA:DETALHAR
/infra_app/config/sifug/sifug_roles_map.properties:# data: 13/11/2025 14:42 - Marcos Aurelio Ferreira - Por e-mail  SIFGD Contabil - Inclusao Recursos intranet.fgdcontabil.consultanotificacaodataprev = 215003009
/infra_app/config/sifug/sifug_roles_map.properties:# data: 28/11/2025 15:34 - Marcos Aurelio Ferreira - Por e-mail  SIFGD-contabil - Exclusao Recursos intranet.fgdcontabil.consultanotificacaodataprev = 215003009
/infra_app/config/sifug/sifug_roles_map.properties:# data: 28/11/2025 15:34 - Marcos Aurelio Ferreira - Por e-mail  SIFGD-contabil - Inclusao Recursos intranet.fgdcontabil.consignado.notificacaodataprev = 215005001
/infra_app/config/sifug/sifug_roles_map.properties:# data: 28/04/2026 13:36 - Marcos Aurelio Ferreira - Por e-mail  SIFGD-CONTABIL - Inclus▒o Recursos intranet.fgdcontabil.consignado.notificacaodataprev.detalhar = 215005001:FUG_OBJETO_TELA:DETALHAR
/infra_app/config/sifug/sifug_sifgd.properties:#Integracao CAIXA, consignado dataprev
/infra_app/config/sifug/sifug_sifgd.properties:dataprev.oauth2.url=https://hisdf.dataprev.gov.br/oauth2/token
/infra_app/config/sifug/sifug_sifgd.properties:dataprev.consignado.integracao.cef.url=https://hapibancos.dataprev.gov.br/e-consignado-integracao-cef/v1.0.0
/infra_app/config/sifug/sifug_sifgd.properties:api.dataprev.consignado.header.authorization=Basic OEJMV1FiNURZVE96WWRtMVpOTTJvblZkclhNYTozSXFTcjF1VFRxdWhLZk05NmtWU1JVZlU1d1Vh
/infra_app/config/sifug/sifug_sifgd.properties:api.dataprev.consignado.keystore.if104.path=/infra_app/config/sifug/IF104.p12
/infra_app/config/sifug/sifug_sifgd.properties:api.dataprev.consignado.keystore.if104.password=123456
/infra_app/config/sifug/sifug_siofg.properties:#uri.base.token.anexos=https://hapirj.dataprev.gov.br/pmf-clientes-externos-service/api/1.2/token-api-anexos
/infra_app/config/sifug/sifug_siofg.properties:#uri.base.pmf=https://hapirj.dataprev.gov.br/pmf-clientes-externos-service/api/1.2
/infra_app/config/sifug/sifug_siofg.properties:#uri.base.auth=https://hapi.dataprev.gov.br/token?grant_type=client_credentials
/infra_app/config/sifug/sifug_siofg.properties:uri.base.pmf=https://hapirj.dataprev.gov.br/pmf-clientes-externos-service/api/1.2
/infra_app/config/sifug/sifug_siofg.properties:uri.base.token.anexos=https://hapirj.dataprev.gov.br/pmf-clientes-externos-service/api/1.2/token-api-anexos
/infra_app/config/sifug/sifug_siofg.properties:uri.base.auth=https://hisrj.dataprev.gov.br/oauth2/token
/infra_app/config/sifug/sifug_siofg.properties:uri.base.token.inss = https://hisrj.dataprev.gov.br/oauth2/token
/infra_app/config/sifug/sifug_siofg.properties:uri.base.inss=https://hapirj.dataprev.gov.br/beneficio/cpf-cef/v1/1.0.0/beneficio/cpf-cef/v1
[p585600@srjtqapllx0021 ~]$
[p585600@srjtqapllx0021 ~]$
[p585600@srjtqapllx0021 ~]$
[p585600@srjtqapllx0021 ~]$ grep -A 10 -i "security-realm" /opt/open/jboss/7.0.0/domain/configuration/domain.xml | grep -i -B2 -A8 "ssl\|keystore"
[p585600@srjtqapllx0021 ~]$
[p585600@srjtqapllx0021 ~]$
[p585600@srjtqapllx0021 ~]$ keytool -list -v -keystore <caminho_do_arquivo> -storepass changeit | grep -i "alias\|valid\|until"
-bash: caminho_do_arquivo: No such file or directory
[p585600@srjtqapllx0021 ~]$
[p585600@srjtqapllx0021 ~]$
[p585600@srjtqapllx0021 ~]$
