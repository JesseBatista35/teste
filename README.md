root@sspdeapllx0039 p585600]#
[root@sspdeapllx0039 p585600]#
[root@sspdeapllx0039 p585600]#
[root@sspdeapllx0039 p585600]#
[root@sspdeapllx0039 p585600]# cd /tmp && rm -rf cefl && mkdir cefl && cd cefl
[root@sspdeapllx0039 cefl]#
[root@sspdeapllx0039 cefl]#
[root@sspdeapllx0039 cefl]# unzip -o /tmp/sirotjar/ceflib2.0.5.jar >/dev/null 2>&1
[root@sspdeapllx0039 cefl]#
[root@sspdeapllx0039 cefl]# grep -rin "log_ias\|config-log4j\|ceflib.xml\|log4j" . 2>/dev/null | head -40
Binary file ./br/gov/caixa/libsp/CEFApplication.class matches
Binary file ./br/gov/caixa/libsp/sirot/CEFSIROTCon.class matches
Binary file ./br/gov/caixa/libsp/sirot/CEFSirotStat2.class matches
Binary file ./br/gov/caixa/libsp/sirot/CEFSirotStat1.class matches
Binary file ./br/gov/caixa/libsp/generic/CEFUtil.class matches
Binary file ./br/gov/caixa/libsp/log/LogFactory.class matches
Binary file ./br/gov/caixa/libsp/log/Log.class matches
Binary file ./br/gov/caixa/libsp/logs/CEFLogSearch.class matches
Binary file ./br/gov/caixa/libsp/logs/CEFLog4j.class matches
Binary file ./br/gov/caixa/libsp/logs/CEFTools.class matches
./ceflib_cefsystem.properties:79:java.class.path=/opt/SUNWas8/jdk/lib/tools.jar:/opt/SUNWas8/lib/appserv-rt.jar:/opt/SUNWas8/lib/j2ee.jar:/opt/SUNWas8/lib/activation.jar:/opt/SUNWas8/lib/appserv-cmp.jar:/opt/SUNWas8/lib/admin-cli.jar:/opt/SUNWas8/lib/appserv-admin.jar:/opt/SUNWas8/lib/appserv-jstl.jar:/opt/SUNWas8/lib/mail.jar:/opt/SUNWas8/lib/commons-launcher.jar:/opt/SUNWas8/lib/commons-logging.jar:/opt/SUNWas8/lib/j2ee-svc.jar:/opt/SUNWas8/lib/jax-qname.jar:/opt/SUNWas8/lib/jaxr-api.jar:/opt/SUNWas8/lib/dom.jar:/opt/SUNWas8/lib/jaxr-impl.jar:/opt/SUNWas8/lib/jaxrpc-api.jar:/opt/SUNWas8/lib/jaxrpc-impl.jar:/opt/SUNWas8/lib/relaxngDatatype.jar:/opt/SUNWas8/lib/saaj-api.jar:/opt/SUNWas8/lib/saaj-impl.jar:/opt/SUNWas8/lib/jmxremote.jar:/opt/SUNWas8/lib/jsf-api.jar:/opt/SUNWas8/lib/jmxremote_optional.jar:/opt/SUNWas8/lib/xsdlib.jar:/opt/SUNWas8/lib/jsf-impl.jar:/opt/SUNWas8/lib/rmissl.jar:/opt/SUNWas8/lib/xalan.jar:/opt/SUNWas8/lib/xercesImpl.jar:/opt/SUNWas8/lib/appserv-upgrade.jar:/opt/SUNWas8/lib/admin-cli-ee.jar:/opt/SUNWas8/lib/appserv-se.jar:/opt/SUNWas8/lib/appserv-ee.jar:/opt/SUNWas8/lib/appserv-ext.jar:/opt/SUNWas8/lib/install/applications/jmsra/imqjmsra.jar:/opt/SUNWas8/imq/lib/jaxm-api.jar:/opt/SUNWas8/imq/lib/fscontext.jar:/opt/SUNWas8/lib/ant/lib/ant.jar:/opt/SUNWas8/hadb/4.4.2-20/lib/hadbjdbc4.jar:/opt/SUNWas8/lib/SUNWjdmk/5.1/lib/jdmkrt.jar:/opt/SUNWas8/pointbase/lib/pbclient.jar:/opt/SUNWas8/pointbase/lib/pbembedded.jar:/opt/SUNWas8/componentes/crypto.jar:/opt/SUNWas8/componentes/edi7rapi.jar:/opt/SUNWas8/componentes/ceflib.jar:/opt/SUNWas8/componentes/componenteLDAP.jar:/opt/SUNWas8/componentes/jakarta-regexp-1.2.jar:/opt/SUNWas8/componentes/ldapjdk-4.13.jar:/opt/SUNWas8/componentes/log4j-1.2.8.jar:/opt/SUNWas8/componentes/siibc-server.jar:/opt/SUNWas8/componentes/siico.jar:/opt/SUNWas8/componentes/sirotconEjb.jar:/oracle/app/oracle/product/9.2.0/jdbc/lib/ojdbc14.jar
./ceflib_cefsirotcon.properties:15:#######*******LOG4J_CONFIG_FILE=/log_ias/config-log4j/ceflog/ceflog-dsvsptf.xml
./ceflib_ceflogsearch.properties:36:ibc_dsvsp01=/log_ias/dsvsp01/siibc
./ceflib_ceflogsearch.properties:37:ibc_dsvsp02=/log_ias/dsvsp02/siibc
./ceflib_ceflogsearch.properties:38:ibc_dsvsp03=/log_ias/dsvsp03/siibc
./ceflib_ceflogsearch.properties:39:ibc_dsvsp04=/log_ias/dsvsp04/siibc
./ceflib_ceflogsearch.properties:40:ibc_dsvsp05=/log_ias/dsvsp05/siibc
./ceflib_ceflogsearch.properties:41:ibc_dsvsp06=/log_ias/dsvsp06/siibc
./ceflib_ceflogsearch.properties:42:ibc_dsvsp07=/log_ias/dsvsp07/siibc
./ceflib_ceflogsearch.properties:43:ibc_dsvsp08=/log_ias/dsvsp08/siibc
./ceflib_ceflogsearch.properties:44:ibc_dsvsp09=/log_ias/dsvsp09/siibc
./ceflib_ceflogsearch.properties:45:ibc_dsvspic=/log_ias/dsvspic/siibc
./ceflib_ceflogsearch.properties:46:ibc_dsvsptf=/log_ias/dsvsptf/siibc
./ceflib_ceflogsearch.properties:47:ibc_extra=/log_ias/extra/siibc
./ceflib_ceflogsearch.properties:48:ibc_inter=/log_ias/inter/siibc
./ceflib_ceflogsearch.properties:49:ibc_interic=/log_ias/interic/siibc
./ceflib_ceflogsearch.properties:50:ibc_interic1=/log_ias/interic1/siibc
./ceflib_ceflogsearch.properties:51:ibc_interic2=/log_ias/interic2/siibc
./ceflib_ceflogsearch.properties:52:ibc_intra=/log_ias/intra/siibc
./ceflib_ceflogsearch.properties:53:ibc_intra1=/log_ias/intra1/siibc
./ceflib_ceflogsearch.properties:54:ibc_intraic=/log_ias/intraic/siibc
./ceflib_ceflogsearch.properties:55:ibc_intraic1=/log_ias/intraic1/siibc
./ceflib_ceflogsearch.properties:82:log_sirot2_part1=/log_ias/
./ceflib_monitorcics.properties:30:###***applic.monitor.sirot1.1.cics.logfile=/log_ias/connector/sirot1_cics_1.log
./ceflib_monitorcics.properties:38:###***applic.monitor.sirot1.2.cics.logfile=/log_ias/connector/sirot1_cics_2.log
./ceflib_monitorcics.properties:46:###***applic.monitor.sirot1.3.cics.logfile=/log_ias/connector/sirot1_cics_3.log
./ceflib_monitorcics.properties:54:###***applic.monitor.sirot1.4.cics.logfile=/log_ias/connector/sirot1_cics_4.log
./ceflib_monitorcics.properties:62:###***applic.monitor.sirot1.5.cics.logfile=/log_ias/connector/sirot1_cics_5.log
./ceflib_monitorcics.properties:71:###***applic.monitor.sirot2.1.cics.logfile=/log_ias/connector/sirot2_cics_1.log
./ceflib_monitorcics.properties:80:###***applic.monitor.sirot2.2.cics.logfile=/log_ias/connector/sirot2_cics_2.log
[root@sspdeapllx0039 cefl]#
[root@sspdeapllx0039 cefl]#
[root@sspdeapllx0039 cefl]# grep -rin "log_ias\|config-log4j\|ceflib" /opt/jboss/jboss-5.1.0.GA/bin 2>/dev/null
/opt/jboss/jboss-5.1.0.GA/bin/hs_err_pid91919.log:297:7f6a46aa0000-7f6a46aa4000 r-xs 0004d000 fd:02 396232                     /opt/jboss/jboss-5.1.0.GA/server/sigsj_intranet/tmp/vfs-nested.tmp/8b6c5547_ceflib2.0.5.jar
/opt/jboss/jboss-5.1.0.GA/bin/hs_err_pid40324.log:283:7f4cebc1e000-7f4cebc22000 r-xs 0004d000 fd:02 396232                     /opt/jboss/jboss-5.1.0.GA/server/sigsj_intranet/tmp/vfs-nested.tmp/325cf9a8_ceflib2.0.5.jar
[root@sspdeapllx0039 cefl]# grep -rin "log_ias\|config-log4j\|ceflib" /opt/jboss/jboss-5.1.0.GA/server/sigsj_intranet/conf 2>/dev/null
[root@sspdeapllx0039 cefl]#
[root@sspdeapllx0039 cefl]#
[root@sspdeapllx0039 cefl]#
[root@sspdeapllx0039 cefl]# find /opt/jboss/jboss-5.1.0.GA/server/sigsj_intranet -iname "*log4j*" -o -iname "ceflib*.xml" 2>/dev/null
/opt/jboss/jboss-5.1.0.GA/server/sigsj_intranet/conf/xmdesc/Log4jService-xmbean.xml
/opt/jboss/jboss-5.1.0.GA/server/sigsj_intranet/conf/jboss-log4j.xml_bkp
/opt/jboss/jboss-5.1.0.GA/server/sigsj_intranet/conf/jboss-log4j.xml
/opt/jboss/jboss-5.1.0.GA/server/sigsj_intranet/tmp/vfs-nested.tmp/b1ddf02d_log4j-1.2.8.jar
[root@sspdeapllx0039 cefl]#
[root@sspdeapllx0039 cefl]#
[root@sspdeapllx0039 cefl]# ls -la /opt/jboss/jboss-5.1.0.GA/server/sigsj_intranet/conf 2>/dev/null
total 300
drwxr-xr-x  6 jboss4 jboss4   4096 2025-03-06 17:55 .
drwxr-xr-x 13 jboss4 jboss4   4096 2026-11-25 11:45 ..
drwxr-xr-x  3 jboss4 jboss4   4096 2011-11-21 17:46 bindingservice.beans
drwxr-xr-x  2 jboss4 jboss4   4096 2012-09-04 08:45 bootstrap
-rw-r--r--  1 jboss4 jboss4    485 2011-11-21 17:46 bootstrap.xml
-rw-r--r--  1 jboss4 jboss4     95 2011-11-21 17:46 java.policy
-rw-r--r--  1 jboss4 jboss4   7923 2011-11-21 17:46 jax-ws-catalog.xml
-rw-r--r--  1 jboss4 jboss4  14112 2018-07-04 07:41 jboss-log4j.xml
-rw-r--r--  1 jboss4 jboss4  14135 2012-03-23 11:13 jboss-log4j.xml_bkp
-rw-r--r--  1 jboss4 jboss4  16354 2012-03-23 11:20 jboss-service.xml
-rw-r--r--  1 jboss4 jboss4  14810 2011-11-21 17:46 jbossts-properties.xml
-rw-r--r--  1 jboss4 jboss4    194 2011-11-21 17:46 jndi.properties
-rw-r--r--  1 jboss4 jboss4   6331 2012-03-26 15:24 login-config.xml
drwxr-xr-x  2 jboss4 jboss4   4096 2011-11-21 17:46 props
-rw-r--r--  1 jboss4 jboss4 116992 2011-11-21 17:46 standardjbosscmp-jdbc.xml
-rw-r--r--  1 jboss4 jboss4  65565 2011-11-21 17:46 standardjboss.xml
drwxr-xr-x  2 jboss4 jboss4   4096 2011-11-21 17:46 xmdesc
[root@sspdeapllx0039 cefl]#
[root@sspdeapllx0039 cefl]#
[root@sspdeapllx0039 cefl]#
[root@sspdeapllx0039 cefl]#
