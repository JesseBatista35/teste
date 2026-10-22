analise do outro analsita jeferson

[root@caddeapllx2854 sigsj-internet]# cat /tmp/sigsj/war/WEB-INF/classes/META-INF/persistence.xml
<?xml version="1.0" encoding="UTF-8"?>
<persistence version="1.0"
  xmlns="http://java.sun.com/xml/ns/persistence" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://java.sun.com/xml/ns/persistence http://java.sun.com/xml/ns/persistence/persistence_1_0.xsd">
  <persistence-unit name="SIGSJ04" transaction-type="JTA">
    <jta-data-source>java:jboss/datasources/SIGSJ04</jta-data-source>
    <non-jta-data-source>java:jboss/datasources/SIGSJ04</non-jta-data-source>
    <class>br.gov.caixa.sigsj.internet.jpa.Gsjtb004Usuario</class>
    <class>br.gov.caixa.sigsj.internet.jpa.Gsjtb003Contacnpj</class>
    <class>br.gov.caixa.sigsj.internet.jpa.Gsjtb002FavoritoPK</class>
    <class>br.gov.caixa.sigsj.internet.jpa.Gsjtb002Favorito</class>
    <class>br.gov.caixa.sigsj.internet.jpa.Gsjtb001DownloadPK</class>
    <class>br.gov.caixa.sigsj.internet.jpa.Gsjtb001Download</class>
    <properties>
      <property name="hibernate.connection.driver_class" value="oracle.jdbc.driver.OracleDriver" />
      <property name="hibernate.dialect" value="org.hibernate.dialect.Oracle10gDialect" />
      <property name="hibernate.show_sql" value="false" />
      <property name="hibernate.format_sql" value="true" />
      <property name="hibernate.use_sql_comments" value="true" />
    </properties>
  </persistence-unit>
</persistence>
[root@caddeapllx2854 sigsj-internet]# grep -n -A10 -B3 "SIGSJ04" \
/tmp/sigsj/war/WEB-INF/classes/META-INF/persistence.xml
2-<persistence version="1.0"
3-  xmlns="http://java.sun.com/xml/ns/persistence" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
4-  xsi:schemaLocation="http://java.sun.com/xml/ns/persistence http://java.sun.com/xml/ns/persistence/persistence_1_0.xsd">
5:  <persistence-unit name="SIGSJ04" transaction-type="JTA">
6:    <jta-data-source>java:jboss/datasources/SIGSJ04</jta-data-source>
7:    <non-jta-data-source>java:jboss/datasources/SIGSJ04</non-jta-data-source>
8-    <class>br.gov.caixa.sigsj.internet.jpa.Gsjtb004Usuario</class>
9-    <class>br.gov.caixa.sigsj.internet.jpa.Gsjtb003Contacnpj</class>
10-    <class>br.gov.caixa.sigsj.internet.jpa.Gsjtb002FavoritoPK</class>
11-    <class>br.gov.caixa.sigsj.internet.jpa.Gsjtb002Favorito</class>
12-    <class>br.gov.caixa.sigsj.internet.jpa.Gsjtb001DownloadPK</class>
13-    <class>br.gov.caixa.sigsj.internet.jpa.Gsjtb001Download</class>
14-    <properties>
15-      <property name="hibernate.connection.driver_class" value="oracle.jdbc.driver.OracleDriver" />
16-      <property name="hibernate.dialect" value="org.hibernate.dialect.Oracle10gDialect" />
17-      <property name="hibernate.show_sql" value="false" />
[root@caddeapllx2854 sigsj-internet]# grep -n "persistence-unit" \
/tmp/sigsj/war/WEB-INF/classes/META-INF/persistence.xml
5:  <persistence-unit name="SIGSJ04" transaction-type="JTA">
21:  </persistence-unit>
[root@caddeapllx2854 sigsj-internet]# find /tmp/sigsj -iname "*ds.xml"
/tmp/sigsj/war/WEB-INF/classes/br/gov/caixa/sigsj/internet/isoXML/GJDS.xml
[root@caddeapllx2854 sigsj-internet]# cat /tmp/sigsj/war/WEB-INF/jboss-web.xml
<?xml version="1.0" encoding="UTF-8"?>
<jboss-web>
    <security-domain>java:/jaas/ldapRealm</security-domain>

    <ejb-ref>
        <ejb-ref-name>ejb/caixa.sirotcon.SIROTConEJB</ejb-ref-name>


        <jndi-name>
            java:global/sirotcon-ejb-2.3.0.1-farm/SIROTConBean!br.gov.caixa.sirot.ejb.SIROTCon
        </jndi-name>

    </ejb-ref>

    <context-root>/sigsj_internet</context-root>
</jboss-web>[root@caddeapllx2854 sigsjgrep -n -i "resource-ref" \ource-ref" \
/tmp/sigsj/war/WEB-INF/web.xml
[root@caddeapllx2854 sigsj-internet]# sed -n '/resource-ref/,/<\/resource-ref>/p' \
/tmp/sigsj/war/WEB-INF/web.xml
[root@caddeapllx2854 sigsj-internet]# grep -Rni "java:jboss" /tmp/sigsj/war
/tmp/sigsj/war/WEB-INF/classes/META-INF/persistence.xml:6:    <jta-data-source>java:jboss/datasources/SIGSJ04</jta-data-source>
/tmp/sigsj/war/WEB-INF/classes/META-INF/persistence.xml:7:    <non-jta-data-source>java:jboss/datasources/SIGSJ04</non-jta-data-source>
[root@caddeapllx2854 sigsj-internet]#
 


O JBoss encontra-se operacional, com inicialização concluída e porta de gerenciamento disponível. O deploy falha devido à persistence-unit SIGSJ04, definida no arquivo persistence.xml e utilizada pela classe EntityManagerProvider, que referencia a datasource java:jboss/datasources/SIGSJ04. Não foi encontrada configuração correspondente no runtime do JBoss nem em servidores de referência analisados. Solicita-se validação da aplicação quanto à datasource esperada ou mecanismo de provisionamento da mesma




2026-10-22T17:13:41.0664423Z ##[section]Starting: Check Deployments [JBOSS]
2026-10-22T17:13:41.0667892Z ==============================================================================
2026-10-22T17:13:41.0667985Z Task         : Bash
2026-10-22T17:13:41.0668027Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-22T17:13:41.0668086Z Version      : 3.227.0
2026-10-22T17:13:41.0668141Z Author       : Microsoft Corporation
2026-10-22T17:13:41.0668186Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-22T17:13:41.0668254Z ==============================================================================
2026-10-22T17:13:41.8308540Z Generating script.
2026-10-22T17:13:41.8317002Z Script contents:
2026-10-22T17:13:41.8317500Z ansible-playbook /opt/ads-agent/_work/r18040/a/esteira-jboss-vm-v2/site.yml --tags check_deployments -e sistema_ambiente=des -e sistema_nome=sigsj-internet -e site=ctc_nprd
2026-10-22T17:13:41.8320065Z ========================== Starting Command Output ===========================
2026-10-22T17:13:41.8327758Z [command]/bin/bash /opt/ads-agent/_work/_temp/1546c3ac-3c0c-4c79-8ad1-899025572092.sh
2026-10-22T17:13:44.0027129Z 
2026-10-22T17:13:44.0028272Z PLAY [local] *******************************************************************
2026-10-22T17:13:44.0324033Z 
2026-10-22T17:13:44.0324547Z PLAY [Configurando o DNS] ******************************************************
2026-10-22T17:13:44.2134401Z 
2026-10-22T17:13:44.2134859Z PLAY [local] *******************************************************************
2026-10-22T17:13:44.2166506Z 
2026-10-22T17:13:44.2166908Z PLAY [Verificando serviços] ****************************************************
2026-10-22T17:13:44.2249705Z 
2026-10-22T17:13:44.2250203Z PLAY [Configuração LDAP] *******************************************************
2026-10-22T17:13:44.2282041Z [WARNING]: Found variable using reserved name: when
2026-10-22T17:13:44.2286173Z 
2026-10-22T17:13:44.2286557Z PLAY [jboss] *******************************************************************
2026-10-22T17:13:44.2372492Z 
2026-10-22T17:13:44.2372707Z PLAY [Stack Jboss] *************************************************************
2026-10-22T17:13:44.2603199Z Thursday 22 October 2026  14:13:44 -0300 (0:00:00.319)       0:00:00.319 ****** 
2026-10-22T17:13:44.7529179Z 
2026-10-22T17:13:44.7530498Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-10-22T17:13:44.7533411Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-10-22T17:13:44.7533667Z caddeapllx2854.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-10-22T17:13:44.7533821Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-10-22T17:13:44.7533990Z releases. A future Ansible release will default to using the discovered 
2026-10-22T17:13:44.7534151Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-10-22T17:13:44.7534620Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-10-22T17:13:44.7534792Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-10-22T17:13:44.7534937Z setting deprecation_warnings=False in ansible.cfg.
2026-10-22T17:13:44.7535184Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-10-22T17:13:44.7556191Z 
2026-10-22T17:13:44.7556810Z PLAY [jboss] *******************************************************************
2026-10-22T17:13:44.7598400Z 
2026-10-22T17:13:44.7599040Z PLAY [jboss] *******************************************************************
2026-10-22T17:13:44.7635799Z 
2026-10-22T17:13:44.7636166Z PLAY [jboss] *******************************************************************
2026-10-22T17:13:44.7661804Z 
2026-10-22T17:13:44.7662146Z PLAY [Copiando deployments adicionais] *****************************************
2026-10-22T17:13:44.7685513Z 
2026-10-22T17:13:44.7685776Z PLAY [Copiando modules adicionais] *********************************************
2026-10-22T17:13:44.7714486Z 
2026-10-22T17:13:44.7714898Z PLAY [jboss] *******************************************************************
2026-10-22T17:13:44.7754747Z 
2026-10-22T17:13:44.7755290Z PLAY [jboss] *******************************************************************
2026-10-22T17:13:44.7783292Z 
2026-10-22T17:13:44.7783836Z PLAY [jboss] *******************************************************************
2026-10-22T17:13:44.7821910Z Thursday 22 October 2026  14:13:44 -0300 (0:00:00.522)       0:00:00.842 ****** 
2026-10-22T17:13:45.1412468Z 
2026-10-22T17:13:45.1413058Z TASK [Wait for Jboss Management port] ******************************************
2026-10-22T17:13:45.1413216Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-10-22T17:13:45.1439955Z Thursday 22 October 2026  14:13:45 -0300 (0:00:00.361)       0:00:01.203 ****** 
2026-10-22T17:13:45.7131488Z 
2026-10-22T17:13:45.7132067Z TASK [Check if Jboss is Running] ***********************************************
2026-10-22T17:13:45.7132397Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-10-22T17:13:45.7166711Z Thursday 22 October 2026  14:13:45 -0300 (0:00:00.572)       0:00:01.776 ****** 
2026-10-22T17:13:46.1338770Z FAILED - RETRYING: Check Deployment details looking for status OK (60 retries left).
2026-10-22T17:13:51.4974123Z FAILED - RETRYING: Check Deployment details looking for status OK (59 retries left).
2026-10-22T17:13:56.9205263Z FAILED - RETRYING: Check Deployment details looking for status OK (58 retries left).
2026-10-22T17:14:02.3231118Z FAILED - RETRYING: Check Deployment details looking for status OK (57 retries left).
2026-10-22T17:14:14.4859714Z FAILED - RETRYING: Check Deployment details looking for status OK (56 retries left).
2026-10-22T17:14:19.9086212Z FAILED - RETRYING: Check Deployment details looking for status OK (55 retries left).
2026-10-22T17:14:25.3147689Z FAILED - RETRYING: Check Deployment details looking for status OK (54 retries left).
2026-10-22T17:14:30.6990538Z FAILED - RETRYING: Check Deployment details looking for status OK (53 retries left).
2026-10-22T17:14:36.1008793Z FAILED - RETRYING: Check Deployment details looking for status OK (52 retries left).
2026-10-22T17:14:41.4644443Z FAILED - RETRYING: Check Deployment details looking for status OK (51 retries left).
2026-10-22T17:14:46.8303756Z FAILED - RETRYING: Check Deployment details looking for status OK (50 retries left).
2026-10-22T17:14:52.2296886Z FAILED - RETRYING: Check Deployment details looking for status OK (49 retries left).
2026-10-22T17:14:57.6075458Z FAILED - RETRYING: Check Deployment details looking for status OK (48 retries left).
2026-10-22T17:15:02.9904757Z FAILED - RETRYING: Check Deployment details looking for status OK (47 retries left).
2026-10-22T17:15:08.3793993Z FAILED - RETRYING: Check Deployment details looking for status OK (46 retries left).
2026-10-22T17:15:13.7464851Z FAILED - RETRYING: Check Deployment details looking for status OK (45 retries left).
2026-10-22T17:15:19.1269561Z FAILED - RETRYING: Check Deployment details looking for status OK (44 retries left).
2026-10-22T17:15:24.5129690Z FAILED - RETRYING: Check Deployment details looking for status OK (43 retries left).
2026-10-22T17:15:29.8982831Z FAILED - RETRYING: Check Deployment details looking for status OK (42 retries left).
2026-10-22T17:15:35.2682107Z FAILED - RETRYING: Check Deployment details looking for status OK (41 retries left).
2026-10-22T17:15:40.6454832Z FAILED - RETRYING: Check Deployment details looking for status OK (40 retries left).
2026-10-22T17:15:46.0174750Z FAILED - RETRYING: Check Deployment details looking for status OK (39 retries left).
2026-10-22T17:15:51.3779136Z FAILED - RETRYING: Check Deployment details looking for status OK (38 retries left).
2026-10-22T17:15:56.7474851Z FAILED - RETRYING: Check Deployment details looking for status OK (37 retries left).
2026-10-22T17:16:02.1213650Z FAILED - RETRYING: Check Deployment details looking for status OK (36 retries left).
2026-10-22T17:16:07.5002179Z FAILED - RETRYING: Check Deployment details looking for status OK (35 retries left).
2026-10-22T17:16:12.8747141Z FAILED - RETRYING: Check Deployment details looking for status OK (34 retries left).
2026-10-22T17:16:18.2381831Z FAILED - RETRYING: Check Deployment details looking for status OK (33 retries left).
2026-10-22T17:16:23.6075470Z FAILED - RETRYING: Check Deployment details looking for status OK (32 retries left).
2026-10-22T17:16:28.9881832Z FAILED - RETRYING: Check Deployment details looking for status OK (31 retries left).
2026-10-22T17:16:34.3508682Z FAILED - RETRYING: Check Deployment details looking for status OK (30 retries left).
2026-10-22T17:16:39.7395288Z FAILED - RETRYING: Check Deployment details looking for status OK (29 retries left).
2026-10-22T17:16:45.0988933Z FAILED - RETRYING: Check Deployment details looking for status OK (28 retries left).
2026-10-22T17:16:50.4673635Z FAILED - RETRYING: Check Deployment details looking for status OK (27 retries left).
2026-10-22T17:16:55.8347389Z FAILED - RETRYING: Check Deployment details looking for status OK (26 retries left).
2026-10-22T17:17:01.2278035Z FAILED - RETRYING: Check Deployment details looking for status OK (25 retries left).
2026-10-22T17:17:06.5999915Z FAILED - RETRYING: Check Deployment details looking for status OK (24 retries left).
2026-10-22T17:17:11.9728568Z FAILED - RETRYING: Check Deployment details looking for status OK (23 retries left).
2026-10-22T17:17:17.3440753Z FAILED - RETRYING: Check Deployment details looking for status OK (22 retries left).
2026-10-22T17:17:22.7193249Z FAILED - RETRYING: Check Deployment details looking for status OK (21 retries left).
2026-10-22T17:17:28.1030476Z FAILED - RETRYING: Check Deployment details looking for status OK (20 retries left).
2026-10-22T17:17:33.4894737Z FAILED - RETRYING: Check Deployment details looking for status OK (19 retries left).
2026-10-22T17:17:38.8620603Z FAILED - RETRYING: Check Deployment details looking for status OK (18 retries left).
2026-10-22T17:17:44.2362125Z FAILED - RETRYING: Check Deployment details looking for status OK (17 retries left).
2026-10-22T17:17:49.6150473Z FAILED - RETRYING: Check Deployment details looking for status OK (16 retries left).
2026-10-22T17:17:54.9889148Z FAILED - RETRYING: Check Deployment details looking for status OK (15 retries left).
2026-10-22T17:18:00.3648586Z FAILED - RETRYING: Check Deployment details looking for status OK (14 retries left).
2026-10-22T17:18:05.7475417Z FAILED - RETRYING: Check Deployment details looking for status OK (13 retries left).
2026-10-22T17:18:11.1263554Z FAILED - RETRYING: Check Deployment details looking for status OK (12 retries left).
2026-10-22T17:18:16.5061002Z FAILED - RETRYING: Check Deployment details looking for status OK (11 retries left).
2026-10-22T17:18:21.8936423Z FAILED - RETRYING: Check Deployment details looking for status OK (10 retries left).
2026-10-22T17:18:27.2601515Z FAILED - RETRYING: Check Deployment details looking for status OK (9 retries left).
2026-10-22T17:18:32.6337371Z FAILED - RETRYING: Check Deployment details looking for status OK (8 retries left).
2026-10-22T17:18:38.0137650Z FAILED - RETRYING: Check Deployment details looking for status OK (7 retries left).
2026-10-22T17:18:43.3795618Z FAILED - RETRYING: Check Deployment details looking for status OK (6 retries left).
2026-10-22T17:18:48.7434350Z FAILED - RETRYING: Check Deployment details looking for status OK (5 retries left).
2026-10-22T17:18:54.1246725Z FAILED - RETRYING: Check Deployment details looking for status OK (4 retries left).
2026-10-22T17:18:59.4900721Z FAILED - RETRYING: Check Deployment details looking for status OK (3 retries left).
2026-10-22T17:19:04.8610506Z FAILED - RETRYING: Check Deployment details looking for status OK (2 retries left).
2026-10-22T17:19:10.2426852Z FAILED - RETRYING: Check Deployment details looking for status OK (1 retries left).
2026-10-22T17:19:15.6184708Z 
2026-10-22T17:19:15.6185358Z TASK [Check Deployment details looking for status OK] **************************
2026-10-22T17:19:15.6194574Z fatal: [caddeapllx2854.agil.nprd.caixa.gov.br]: FAILED! => {"attempts": 60, "changed": false, "connection": "close", "content": "{\"outcome\" : \"success\", \"result\" : {\"sigsj_internet-ear.ear\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"i4m/NPLo01FBhW0uc/YA3Jd2i+Y=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1792683449295, \"enabled-timestamp\" : \"2026-10-22 12:37:29,295 BRT\", \"managed\" : true, \"name\" : \"sigsj_internet-ear.ear\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"sigsj_internet-ear.ear\", \"status\" : \"FAILED\", \"subdeployment\" : {\"sigsj_internet-war-2.67.war\" : null}, \"subsystem\" : {\"logging\" : null}}, \"sirotcon-ejb.jar\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"cLE7JH7Axwql5UcepAdPvwrhtws=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1792683449307, \"enabled-timestamp\" : \"2026-10-22 12:37:29,307 BRT\", \"managed\" : true, \"name\" : \"sirotcon-ejb.jar\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"sirotcon-ejb.jar\", \"status\" : \"OK\", \"subdeployment\" : null, \"subsystem\" : {\"ejb3\" : null, \"logging\" : null}}}}", "content_encoding": "identity", "content_length": "1137", "content_type": "application/json; charset=utf-8", "cookies": {}, "cookies_string": "", "date": "Thu, 22 Oct 2026 17:19:15 GMT", "elapsed": 0, "json": {"outcome": "success", "result": {"sigsj_internet-ear.ear": {"content": [{"hash": {"BYTES_VALUE": "i4m/NPLo01FBhW0uc/YA3Jd2i+Y="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1792683449295, "enabled-timestamp": "2026-10-22 12:37:29,295 BRT", "managed": true, "name": "sigsj_internet-ear.ear", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "sigsj_internet-ear.ear", "status": "FAILED", "subdeployment": {"sigsj_internet-war-2.67.war": null}, "subsystem": {"logging": null}}, "sirotcon-ejb.jar": {"content": [{"hash": {"BYTES_VALUE": "cLE7JH7Axwql5UcepAdPvwrhtws="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1792683449307, "enabled-timestamp": "2026-10-22 12:37:29,307 BRT", "managed": true, "name": "sirotcon-ejb.jar", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "sirotcon-ejb.jar", "status": "OK", "subdeployment": null, "subsystem": {"ejb3": null, "logging": null}}}}, "msg": "OK (1137 bytes)", "redirected": false, "status": 200, "url": "http://10.116.202.45:9990/management/", "x_content_type_options": "nosniff", "x_frame_options": "SAMEORIGIN"}
2026-10-22T17:19:15.6224826Z Thursday 22 October 2026  14:19:15 -0300 (0:05:29.905)       0:05:31.682 ****** 
2026-10-22T17:19:28.4138432Z 
2026-10-22T17:19:28.4139369Z TASK [systemd] *****************************************************************
2026-10-22T17:19:28.4139575Z changed: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-10-22T17:19:28.4175246Z Thursday 22 October 2026  14:19:28 -0300 (0:00:12.794)       0:05:44.477 ****** 
2026-10-22T17:19:28.7288604Z 
2026-10-22T17:19:28.7289222Z TASK [Wait for Jboss Management port] ******************************************
2026-10-22T17:19:28.7289380Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-10-22T17:19:28.7316415Z Thursday 22 October 2026  14:19:28 -0300 (0:00:00.314)       0:05:44.791 ****** 
2026-10-22T17:19:29.4733568Z FAILED - RETRYING: Check if Jboss is Running (120 retries left).
2026-10-22T17:19:34.9468238Z FAILED - RETRYING: Check if Jboss is Running (119 retries left).
2026-10-22T17:19:40.3439576Z 
2026-10-22T17:19:40.3440082Z TASK [Check if Jboss is Running] ***********************************************
2026-10-22T17:19:40.3440239Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-10-22T17:19:40.3468128Z Thursday 22 October 2026  14:19:40 -0300 (0:00:11.615)       0:05:56.406 ****** 
2026-10-22T17:19:40.8061449Z FAILED - RETRYING: Check Deployment details looking for status OK (60 retries left).
2026-10-22T17:19:46.2555151Z FAILED - RETRYING: Check Deployment details looking for status OK (59 retries left).
2026-10-22T17:19:51.7590975Z FAILED - RETRYING: Check Deployment details looking for status OK (58 retries left).
2026-10-22T17:19:57.1342212Z FAILED - RETRYING: Check Deployment details looking for status OK (57 retries left).
2026-10-22T17:20:02.5303895Z FAILED - RETRYING: Check Deployment details looking for status OK (56 retries left).
2026-10-22T17:20:07.9139886Z FAILED - RETRYING: Check Deployment details looking for status OK (55 retries left).
2026-10-22T17:20:13.2924892Z FAILED - RETRYING: Check Deployment details looking for status OK (54 retries left).
2026-10-22T17:20:18.6824312Z FAILED - RETRYING: Check Deployment details looking for status OK (53 retries left).
2026-10-22T17:20:24.0495922Z FAILED - RETRYING: Check Deployment details looking for status OK (52 retries left).
2026-10-22T17:20:29.4252298Z FAILED - RETRYING: Check Deployment details looking for status OK (51 retries left).
2026-10-22T17:20:34.8145731Z FAILED - RETRYING: Check Deployment details looking for status OK (50 retries left).
2026-10-22T17:20:40.1934142Z FAILED - RETRYING: Check Deployment details looking for status OK (49 retries left).
2026-10-22T17:20:45.5674449Z FAILED - RETRYING: Check Deployment details looking for status OK (48 retries left).
2026-10-22T17:20:50.9452002Z FAILED - RETRYING: Check Deployment details looking for status OK (47 retries left).
2026-10-22T17:20:56.3169279Z FAILED - RETRYING: Check Deployment details looking for status OK (46 retries left).
2026-10-22T17:21:01.7044717Z FAILED - RETRYING: Check Deployment details looking for status OK (45 retries left).
2026-10-22T17:21:07.1211405Z FAILED - RETRYING: Check Deployment details looking for status OK (44 retries left).
2026-10-22T17:21:12.4986777Z FAILED - RETRYING: Check Deployment details looking for status OK (43 retries left).
2026-10-22T17:21:17.8691312Z FAILED - RETRYING: Check Deployment details looking for status OK (42 retries left).
2026-10-22T17:21:23.2493659Z FAILED - RETRYING: Check Deployment details looking for status OK (41 retries left).
2026-10-22T17:21:28.6245384Z FAILED - RETRYING: Check Deployment details looking for status OK (40 retries left).
2026-10-22T17:21:34.0122685Z FAILED - RETRYING: Check Deployment details looking for status OK (39 retries left).
2026-10-22T17:21:39.4052605Z FAILED - RETRYING: Check Deployment details looking for status OK (38 retries left).
2026-10-22T17:21:44.7738971Z FAILED - RETRYING: Check Deployment details looking for status OK (37 retries left).
2026-10-22T17:21:50.1510800Z FAILED - RETRYING: Check Deployment details looking for status OK (36 retries left).
2026-10-22T17:21:55.5440281Z FAILED - RETRYING: Check Deployment details looking for status OK (35 retries left).
2026-10-22T17:22:00.9405536Z FAILED - RETRYING: Check Deployment details looking for status OK (34 retries left).
2026-10-22T17:22:06.3167420Z FAILED - RETRYING: Check Deployment details looking for status OK (33 retries left).
2026-10-22T17:22:11.7241643Z FAILED - RETRYING: Check Deployment details looking for status OK (32 retries left).
2026-10-22T17:22:17.0938499Z FAILED - RETRYING: Check Deployment details looking for status OK (31 retries left).
2026-10-22T17:22:22.4720263Z FAILED - RETRYING: Check Deployment details looking for status OK (30 retries left).
2026-10-22T17:22:27.8473867Z FAILED - RETRYING: Check Deployment details looking for status OK (29 retries left).
2026-10-22T17:22:33.2163103Z FAILED - RETRYING: Check Deployment details looking for status OK (28 retries left).
2026-10-22T17:22:38.5903522Z FAILED - RETRYING: Check Deployment details looking for status OK (27 retries left).
2026-10-22T17:22:43.9662992Z FAILED - RETRYING: Check Deployment details looking for status OK (26 retries left).
2026-10-22T17:22:49.3245375Z FAILED - RETRYING: Check Deployment details looking for status OK (25 retries left).
2026-10-22T17:22:54.6862165Z FAILED - RETRYING: Check Deployment details looking for status OK (24 retries left).
2026-10-22T17:23:00.0656145Z FAILED - RETRYING: Check Deployment details looking for status OK (23 retries left).
2026-10-22T17:23:05.4288886Z FAILED - RETRYING: Check Deployment details looking for status OK (22 retries left).
2026-10-22T17:23:10.7890553Z FAILED - RETRYING: Check Deployment details looking for status OK (21 retries left).
2026-10-22T17:23:16.1701635Z FAILED - RETRYING: Check Deployment details looking for status OK (20 retries left).
2026-10-22T17:23:21.5552251Z FAILED - RETRYING: Check Deployment details looking for status OK (19 retries left).
2026-10-22T17:23:26.9209322Z FAILED - RETRYING: Check Deployment details looking for status OK (18 retries left).
2026-10-22T17:23:32.3009125Z FAILED - RETRYING: Check Deployment details looking for status OK (17 retries left).
2026-10-22T17:23:37.6640799Z FAILED - RETRYING: Check Deployment details looking for status OK (16 retries left).
2026-10-22T17:23:43.0193617Z FAILED - RETRYING: Check Deployment details looking for status OK (15 retries left).
2026-10-22T17:23:48.3865337Z FAILED - RETRYING: Check Deployment details looking for status OK (14 retries left).
2026-10-22T17:23:53.7486744Z FAILED - RETRYING: Check Deployment details looking for status OK (13 retries left).
2026-10-22T17:23:59.1066180Z FAILED - RETRYING: Check Deployment details looking for status OK (12 retries left).
2026-10-22T17:24:04.4982694Z FAILED - RETRYING: Check Deployment details looking for status OK (11 retries left).
2026-10-22T17:24:09.8622026Z FAILED - RETRYING: Check Deployment details looking for status OK (10 retries left).
2026-10-22T17:24:15.2206307Z FAILED - RETRYING: Check Deployment details looking for status OK (9 retries left).
2026-10-22T17:24:20.5908025Z FAILED - RETRYING: Check Deployment details looking for status OK (8 retries left).
2026-10-22T17:24:25.9537312Z FAILED - RETRYING: Check Deployment details looking for status OK (7 retries left).
2026-10-22T17:24:31.3119343Z FAILED - RETRYING: Check Deployment details looking for status OK (6 retries left).
2026-10-22T17:24:36.6794430Z FAILED - RETRYING: Check Deployment details looking for status OK (5 retries left).
2026-10-22T17:24:42.0463692Z FAILED - RETRYING: Check Deployment details looking for status OK (4 retries left).
2026-10-22T17:24:47.4059029Z FAILED - RETRYING: Check Deployment details looking for status OK (3 retries left).
2026-10-22T17:24:52.7792151Z FAILED - RETRYING: Check Deployment details looking for status OK (2 retries left).
2026-10-22T17:24:58.1484114Z FAILED - RETRYING: Check Deployment details looking for status OK (1 retries left).
2026-10-22T17:25:03.5171909Z 
2026-10-22T17:25:03.5172420Z TASK [Check Deployment details looking for status OK] **************************
2026-10-22T17:25:03.5181210Z fatal: [caddeapllx2854.agil.nprd.caixa.gov.br]: FAILED! => {"attempts": 60, "changed": false, "connection": "close", "content": "{\"outcome\" : \"success\", \"result\" : {\"sigsj_internet-ear.ear\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"i4m/NPLo01FBhW0uc/YA3Jd2i+Y=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1792689567445, \"enabled-timestamp\" : \"2026-10-22 14:19:27,445 BRT\", \"managed\" : true, \"name\" : \"sigsj_internet-ear.ear\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"sigsj_internet-ear.ear\", \"status\" : \"FAILED\", \"subdeployment\" : {\"sigsj_internet-war-2.67.war\" : null}, \"subsystem\" : {\"logging\" : null}}, \"sirotcon-ejb.jar\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"cLE7JH7Axwql5UcepAdPvwrhtws=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1792689567470, \"enabled-timestamp\" : \"2026-10-22 14:19:27,470 BRT\", \"managed\" : true, \"name\" : \"sirotcon-ejb.jar\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"sirotcon-ejb.jar\", \"status\" : \"OK\", \"subdeployment\" : null, \"subsystem\" : {\"ejb3\" : null, \"logging\" : null}}}}", "content_encoding": "identity", "content_length": "1137", "content_type": "application/json; charset=utf-8", "cookies": {}, "cookies_string": "", "date": "Thu, 22 Oct 2026 17:25:03 GMT", "elapsed": 0, "json": {"outcome": "success", "result": {"sigsj_internet-ear.ear": {"content": [{"hash": {"BYTES_VALUE": "i4m/NPLo01FBhW0uc/YA3Jd2i+Y="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1792689567445, "enabled-timestamp": "2026-10-22 14:19:27,445 BRT", "managed": true, "name": "sigsj_internet-ear.ear", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "sigsj_internet-ear.ear", "status": "FAILED", "subdeployment": {"sigsj_internet-war-2.67.war": null}, "subsystem": {"logging": null}}, "sirotcon-ejb.jar": {"content": [{"hash": {"BYTES_VALUE": "cLE7JH7Axwql5UcepAdPvwrhtws="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1792689567470, "enabled-timestamp": "2026-10-22 14:19:27,470 BRT", "managed": true, "name": "sirotcon-ejb.jar", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "sirotcon-ejb.jar", "status": "OK", "subdeployment": null, "subsystem": {"ejb3": null, "logging": null}}}}, "msg": "OK (1137 bytes)", "redirected": false, "status": 200, "url": "http://10.116.202.45:9990/management/", "x_content_type_options": "nosniff", "x_frame_options": "SAMEORIGIN"}
2026-10-22T17:25:03.5195190Z 
2026-10-22T17:25:03.5195443Z PLAY RECAP *********************************************************************
2026-10-22T17:25:03.5198465Z caddeapllx2854.agil.nprd.caixa.gov.br : ok=6    changed=1    unreachable=0    failed=1    skipped=0    rescued=1    ignored=0   
2026-10-22T17:25:03.5198645Z 
2026-10-22T17:25:03.5198944Z Thursday 22 October 2026  14:25:03 -0300 (0:05:23.172)       0:11:19.579 ****** 
2026-10-22T17:25:03.5199137Z =============================================================================== 
2026-10-22T17:25:03.5199360Z Check Deployment details looking for status OK ------------------------ 329.91s
2026-10-22T17:25:03.5199578Z Check Deployment details looking for status OK ------------------------ 323.17s
2026-10-22T17:25:03.5201489Z systemd ---------------------------------------------------------------- 12.79s
2026-10-22T17:25:03.5201715Z Check if Jboss is Running ---------------------------------------------- 11.62s
2026-10-22T17:25:03.5201931Z Check if Jboss is Running ----------------------------------------------- 0.57s
2026-10-22T17:25:03.5202305Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.52s
2026-10-22T17:25:03.5202532Z Wait for Jboss Management port ------------------------------------------ 0.36s
2026-10-22T17:25:03.5202913Z Wait for Jboss Management port ------------------------------------------ 0.31s
2026-10-22T17:25:03.5203057Z Playbook run took 0 days, 0 hours, 11 minutes, 19 seconds
2026-10-22T17:25:03.5868822Z ##[error]Bash exited with code '2'.
2026-10-22T17:25:03.5901753Z ##[section]Finishing: Check Deployments [JBOSS]



Are you sure you want to continue connecting (yes/no/[fingerprint])? yes
Warning: Permanently added '10.116.202.45' (ED25519) to the list of known hosts.
p585600@10.116.202.45's password:
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$


bora verififcar?


