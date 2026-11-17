2026-11-17T17:28:16.4268680Z ##[section]Starting: Maven
2026-11-17T17:28:16.4274094Z ==============================================================================
2026-11-17T17:28:16.4274211Z Task         : Maven
2026-11-17T17:28:16.4274259Z Description  : Build, test, and deploy with Apache Maven
2026-11-17T17:28:16.4274323Z Version      : 4.225.0
2026-11-17T17:28:16.4274423Z Author       : Microsoft Corporation
2026-11-17T17:28:16.4274479Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/build/maven
2026-11-17T17:28:16.4274639Z ==============================================================================
2026-11-17T17:28:19.4208045Z [command]/opt/apache-maven/apache-maven-3.8.5/bin/mvn -version
2026-11-17T17:28:19.5397996Z Apache Maven 3.8.5 (3599d3414f046de2324203b78ddcf9b5e4388aa0)
2026-11-17T17:28:19.5398529Z Maven home: /opt/apache-maven/apache-maven-3.8.5
2026-11-17T17:28:19.5398752Z Java version: 17.0.8, vendor: OpenLogic, runtime: /usr/java/open-jdk-17.0.8
2026-11-17T17:28:19.5398932Z Default locale: pt_BR, platform encoding: UTF-8
2026-11-17T17:28:19.5399351Z OS name: "linux", version: "5.18.5-100.fc35.x86_64", arch: "amd64", family: "unix"
2026-11-17T17:28:19.5581807Z [command]/opt/apache-maven/apache-maven-3.8.5/bin/mvn -f /opt/ads-agent/_work/21/s/pom.xml clean package -Dversion.app= -U
2026-11-17T17:28:20.2630726Z [INFO] Scanning for projects...
2026-11-17T17:28:20.4405276Z [INFO] ------------------------------------------------------------------------
2026-11-17T17:28:20.4405678Z [INFO] Reactor Build Order:
2026-11-17T17:28:20.4405825Z [INFO] 
2026-11-17T17:28:20.4415208Z [INFO] siemp application                                                  [pom]
2026-11-17T17:28:20.4417021Z [INFO] SIEMP Web module                                                   [war]
2026-11-17T17:28:20.4417346Z [INFO] SIEMP EAR module                                                   [ear]
2026-11-17T17:28:20.4476211Z [INFO] 
2026-11-17T17:28:20.4476918Z [INFO] ----------------------< br.gov.caixa.siemp:siemp >----------------------
2026-11-17T17:28:20.4477310Z [INFO] Building siemp application 14.37.0.6                               [1/3]
2026-11-17T17:28:20.4477814Z [INFO] --------------------------------[ pom ]---------------------------------
2026-11-17T17:28:20.4734898Z [INFO] 
2026-11-17T17:28:20.4735387Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ siemp ---
2026-11-17T17:28:20.5250977Z [INFO] 
2026-11-17T17:28:20.5251589Z [INFO] --------------------< br.gov.caixa.siemp:siemp-web >--------------------
2026-11-17T17:28:20.5251824Z [INFO] Building SIEMP Web module 14.37.0.6                                [2/3]
2026-11-17T17:28:20.5252111Z [INFO] --------------------------------[ war ]---------------------------------
2026-11-17T17:28:20.7221941Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jboss/spec/javax/rmi/jboss-rmi-api_1.0_spec/1.0.6.Final/jboss-rmi-api_1.0_spec-1.0.6.Final.pom
2026-11-17T17:28:20.7813921Z Progress (1): 4.1/4.4 kB
2026-11-17T17:28:20.7964233Z Progress (1): 4.4 kB    
2026-11-17T17:28:20.7964691Z                     
2026-11-17T17:28:20.7966673Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jboss/spec/javax/rmi/jboss-rmi-api_1.0_spec/1.0.6.Final/jboss-rmi-api_1.0_spec-1.0.6.Final.pom (4.4 kB at 57 kB/s)
2026-11-17T17:28:20.8171956Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/xalan/xalan/2.5.0/xalan-2.5.0.pom
2026-11-17T17:28:20.8470228Z Progress (1): 144 B
2026-11-17T17:28:20.8470429Z                    
2026-11-17T17:28:20.8470994Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/xalan/xalan/2.5.0/xalan-2.5.0.pom (144 B at 4.8 kB/s)
2026-11-17T17:28:20.9623441Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/batik/batik-util/1.6/batik-util-1.6.pom
2026-11-17T17:28:20.9855625Z Progress (1): 261 B
2026-11-17T17:28:20.9855836Z                    
2026-11-17T17:28:20.9856333Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/batik/batik-util/1.6/batik-util-1.6.pom (261 B at 11 kB/s)
2026-11-17T17:28:20.9887802Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/dwr/dwr/1.1.3/dwr-1.1.3.pom
2026-11-17T17:28:21.0139163Z Progress (1): 2.5 kB
2026-11-17T17:28:21.0139976Z                     
2026-11-17T17:28:21.0140628Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/dwr/dwr/1.1.3/dwr-1.1.3.pom (2.5 kB at 98 kB/s)
2026-11-17T17:28:21.0175134Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/bsf/bsf/2.3.0/bsf-2.3.0.pom
2026-11-17T17:28:21.0348639Z Progress (1): 140 B
2026-11-17T17:28:21.0349063Z                    
2026-11-17T17:28:21.0349820Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/bsf/bsf/2.3.0/bsf-2.3.0.pom (140 B at 8.2 kB/s)
2026-11-17T17:28:21.0499336Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/xom/xom/1.1/xom-1.1.pom
2026-11-17T17:28:21.0741654Z Progress (1): 1.8 kB
2026-11-17T17:28:21.0742020Z                     
2026-11-17T17:28:21.0742596Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/xom/xom/1.1/xom-1.1.pom (1.8 kB at 71 kB/s)
2026-11-17T17:28:21.0776688Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/xerces/xmlParserAPIs/2.6.2/xmlParserAPIs-2.6.2.pom
2026-11-17T17:28:21.1008196Z Progress (1): 153 B
2026-11-17T17:28:21.1008423Z                    
2026-11-17T17:28:21.1009187Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/xerces/xmlParserAPIs/2.6.2/xmlParserAPIs-2.6.2.pom (153 B at 6.7 kB/s)
2026-11-17T17:28:21.1046720Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/xerces/xercesImpl/2.6.2/xercesImpl-2.6.2.pom
2026-11-17T17:28:21.1207037Z Progress (1): 150 B
2026-11-17T17:28:21.1207582Z                    
2026-11-17T17:28:21.1208040Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/xerces/xercesImpl/2.6.2/xercesImpl-2.6.2.pom (150 B at 9.4 kB/s)
2026-11-17T17:28:21.1242277Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/xalan/xalan/2.7.0/xalan-2.7.0.pom
2026-11-17T17:28:21.1452381Z Progress (1): 491 B
2026-11-17T17:28:21.1452751Z                    
2026-11-17T17:28:21.1453115Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/xalan/xalan/2.7.0/xalan-2.7.0.pom (491 B at 23 kB/s)
2026-11-17T17:28:21.1570941Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/jaxen/jaxen/1.1-beta-8/jaxen-1.1-beta-8.pom
2026-11-17T17:28:21.1649172Z Progress (1): 4.1/6.7 kB
2026-11-17T17:28:21.1795406Z Progress (1): 6.7 kB    
2026-11-17T17:28:21.1796382Z                     
2026-11-17T17:28:21.1796880Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/jaxen/jaxen/1.1-beta-8/jaxen-1.1-beta-8.pom (6.7 kB at 291 kB/s)
2026-11-17T17:28:21.1833821Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/xom/xom/1.0b3/xom-1.0b3.pom
2026-11-17T17:28:21.2000741Z Progress (1): 1.1 kB
2026-11-17T17:28:21.2001324Z                     
2026-11-17T17:28:21.2002060Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/xom/xom/1.0b3/xom-1.0b3.pom (1.1 kB at 64 kB/s)
2026-11-17T17:28:21.2038835Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-beanutils/commons-beanutils-bean-collections/1.8.3/commons-beanutils-bean-collections-1.8.3.pom
2026-11-17T17:28:21.2426962Z Progress (1): 1.9 kB
2026-11-17T17:28:21.2427488Z                     
2026-11-17T17:28:21.2428030Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-beanutils/commons-beanutils-bean-collections/1.8.3/commons-beanutils-bean-collections-1.8.3.pom (1.9 kB at 48 kB/s)
2026-11-17T17:28:21.3038999Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/jboss/jboss-j2ee/4.2.2.GA/jboss-j2ee-4.2.2.GA.pom
2026-11-17T17:28:21.3251893Z Progress (1): 261 B
2026-11-17T17:28:21.3252578Z                    
2026-11-17T17:28:21.3253304Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/jboss/jboss-j2ee/4.2.2.GA/jboss-j2ee-4.2.2.GA.pom (261 B at 12 kB/s)
2026-11-17T17:28:21.3875801Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/net/sourceforge/jexcelapi/jxl/2.6.12/jxl-2.6.12.pom
2026-11-17T17:28:21.4320331Z Progress (1): 1.6 kB
2026-11-17T17:28:21.4320733Z                     
2026-11-17T17:28:21.4321490Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/net/sourceforge/jexcelapi/jxl/2.6.12/jxl-2.6.12.pom (1.6 kB at 36 kB/s)
2026-11-17T17:28:21.4598097Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/displaytag/displaytag/1.2/displaytag-1.2.pom
2026-11-17T17:28:21.4691981Z Progress (1): 4.1/5.0 kB
2026-11-17T17:28:21.4785272Z Progress (1): 5.0 kB    
2026-11-17T17:28:21.4785689Z                     
2026-11-17T17:28:21.4786227Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/displaytag/displaytag/1.2/displaytag-1.2.pom (5.0 kB at 265 kB/s)
2026-11-17T17:28:21.4811308Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/displaytag/displaytag-doc/1.2/displaytag-doc-1.2.pom
2026-11-17T17:28:21.4901013Z Progress (1): 4.1/16 kB
2026-11-17T17:28:21.4902717Z Progress (1): 7.7/16 kB
2026-11-17T17:28:21.4904736Z Progress (1): 12/16 kB 
2026-11-17T17:28:21.4906433Z Progress (1): 16/16 kB
2026-11-17T17:28:21.4973959Z Progress (1): 16 kB   
2026-11-17T17:28:21.4974188Z                    
2026-11-17T17:28:21.4974756Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/displaytag/displaytag-doc/1.2/displaytag-doc-1.2.pom (16 kB at 968 kB/s)
2026-11-17T17:28:21.5165557Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/slf4j/jcl104-over-slf4j/1.4.2/jcl104-over-slf4j-1.4.2.pom
2026-11-17T17:28:21.5363600Z Progress (1): 1.3 kB
2026-11-17T17:28:21.5363894Z                     
2026-11-17T17:28:21.5364919Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/slf4j/jcl104-over-slf4j/1.4.2/jcl104-over-slf4j-1.4.2.pom (1.3 kB at 65 kB/s)
2026-11-17T17:28:21.5395963Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/slf4j/slf4j-parent/1.4.2/slf4j-parent-1.4.2.pom
2026-11-17T17:28:21.5633623Z Progress (1): 4.1/7.1 kB
2026-11-17T17:28:21.5730647Z Progress (1): 7.1 kB    
2026-11-17T17:28:21.5731169Z                     
2026-11-17T17:28:21.5731870Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/slf4j/slf4j-parent/1.4.2/slf4j-parent-1.4.2.pom (7.1 kB at 209 kB/s)
2026-11-17T17:28:21.5771443Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/slf4j/slf4j-log4j12/1.4.2/slf4j-log4j12-1.4.2.pom
2026-11-17T17:28:21.6026556Z Progress (1): 1.3 kB
2026-11-17T17:28:21.6026782Z                     
2026-11-17T17:28:21.6027547Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/slf4j/slf4j-log4j12/1.4.2/slf4j-log4j12-1.4.2.pom (1.3 kB at 51 kB/s)
2026-11-17T17:28:21.6069854Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/slf4j/slf4j-api/1.4.2/slf4j-api-1.4.2.pom
2026-11-17T17:28:21.6299042Z Progress (1): 2.3 kB
2026-11-17T17:28:21.6299266Z                     
2026-11-17T17:28:21.6300048Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/slf4j/slf4j-api/1.4.2/slf4j-api-1.4.2.pom (2.3 kB at 99 kB/s)
2026-11-17T17:28:21.6335680Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/log4j/log4j/1.2.13/log4j-1.2.13.pom
2026-11-17T17:28:21.6493836Z Progress (1): 389 B
2026-11-17T17:28:21.6494492Z                    
2026-11-17T17:28:21.6495253Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/log4j/log4j/1.2.13/log4j-1.2.13.pom (389 B at 24 kB/s)
2026-11-17T17:28:21.6535247Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/net/sf/jasperreports/jasperreports/3.7.6/jasperreports-3.7.6.pom
2026-11-17T17:28:21.6664471Z Progress (1): 4.1/12 kB
2026-11-17T17:28:21.6665261Z Progress (1): 8.2/12 kB
2026-11-17T17:28:21.6816748Z Progress (1): 12 kB    
2026-11-17T17:28:21.6817211Z                    
2026-11-17T17:28:21.6817779Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/net/sf/jasperreports/jasperreports/3.7.6/jasperreports-3.7.6.pom (12 kB at 437 kB/s)
2026-11-17T17:28:21.7607037Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-lang/commons-lang/2.5/commons-lang-2.5.pom
2026-11-17T17:28:21.7715145Z Progress (1): 4.1/17 kB
2026-11-17T17:28:21.7715859Z Progress (1): 7.7/17 kB
2026-11-17T17:28:21.7717526Z Progress (1): 12/17 kB 
2026-11-17T17:28:21.7719333Z Progress (1): 16/17 kB
2026-11-17T17:28:21.7830256Z Progress (1): 17 kB   
2026-11-17T17:28:21.7830727Z                    
2026-11-17T17:28:21.7831324Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-lang/commons-lang/2.5/commons-lang-2.5.pom (17 kB at 779 kB/s)
2026-11-17T17:28:21.7871809Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/commons/commons-parent/12/commons-parent-12.pom
2026-11-17T17:28:21.8154626Z Progress (1): 4.1/27 kB
2026-11-17T17:28:21.8156731Z Progress (1): 7.7/27 kB
2026-11-17T17:28:21.8159935Z Progress (1): 12/27 kB 
2026-11-17T17:28:21.8162108Z Progress (1): 16/27 kB
2026-11-17T17:28:21.8163741Z Progress (1): 20/27 kB
2026-11-17T17:28:21.8165204Z Progress (1): 24/27 kB
2026-11-17T17:28:21.8248759Z Progress (1): 27 kB   
2026-11-17T17:28:21.8249082Z                    
2026-11-17T17:28:21.8249803Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/commons/commons-parent/12/commons-parent-12.pom (27 kB at 708 kB/s)
2026-11-17T17:28:21.8289841Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-collections/commons-collections/2.1.1/commons-collections-2.1.1.pom
2026-11-17T17:28:21.8476856Z Progress (1): 172 B
2026-11-17T17:28:21.8477198Z                    
2026-11-17T17:28:21.8477970Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-collections/commons-collections/2.1.1/commons-collections-2.1.1.pom (172 B at 9.1 kB/s)
2026-11-17T17:28:21.8659112Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/javax/xml/jaxp-api/1.4/jaxp-api-1.4.pom
2026-11-17T17:28:21.8825625Z Progress (1): 194 B
2026-11-17T17:28:21.8825938Z                    
2026-11-17T17:28:21.8826670Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/javax/xml/jaxp-api/1.4/jaxp-api-1.4.pom (194 B at 11 kB/s)
2026-11-17T17:28:21.8977892Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/log4j/log4j/1.2.7/log4j-1.2.7.pom
2026-11-17T17:28:21.9163310Z Progress (1): 144 B
2026-11-17T17:28:21.9163507Z                    
2026-11-17T17:28:21.9163951Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/log4j/log4j/1.2.7/log4j-1.2.7.pom (144 B at 7.6 kB/s)
2026-11-17T17:28:21.9198738Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/struts/struts/1.2.4/struts-1.2.4.pom
2026-11-17T17:28:21.9386195Z Progress (1): 4.1/9.8 kB
2026-11-17T17:28:21.9388097Z Progress (1): 7.7/9.8 kB
2026-11-17T17:28:21.9504940Z Progress (1): 9.8 kB    
2026-11-17T17:28:21.9505441Z                     
2026-11-17T17:28:21.9505977Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/struts/struts/1.2.4/struts-1.2.4.pom (9.8 kB at 326 kB/s)
2026-11-17T17:28:21.9533916Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-beanutils/commons-beanutils/1.6.1/commons-beanutils-1.6.1.pom
2026-11-17T17:28:21.9703445Z Progress (1): 2.7 kB
2026-11-17T17:28:21.9703861Z                     
2026-11-17T17:28:21.9704361Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-beanutils/commons-beanutils/1.6.1/commons-beanutils-1.6.1.pom (2.7 kB at 159 kB/s)
2026-11-17T17:28:21.9733087Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-digester/commons-digester/1.5/commons-digester-1.5.pom
2026-11-17T17:28:21.9891525Z Progress (1): 3.0 kB
2026-11-17T17:28:21.9891810Z                     
2026-11-17T17:28:21.9892323Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-digester/commons-digester/1.5/commons-digester-1.5.pom (3.0 kB at 189 kB/s)
2026-11-17T17:28:22.0008021Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-validator/commons-validator/1.1.3/commons-validator-1.1.3.pom
2026-11-17T17:28:22.0180167Z Progress (1): 168 B
2026-11-17T17:28:22.0180649Z                    
2026-11-17T17:28:22.0181162Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-validator/commons-validator/1.1.3/commons-validator-1.1.3.pom (168 B at 9.9 kB/s)
2026-11-17T17:28:22.0330762Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-lang/commons-lang/2.0/commons-lang-2.0.pom
2026-11-17T17:28:22.0553095Z Progress (1): 3.0 kB
2026-11-17T17:28:22.0553375Z                     
2026-11-17T17:28:22.0553849Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-lang/commons-lang/2.0/commons-lang-2.0.pom (3.0 kB at 132 kB/s)
2026-11-17T17:28:22.0580542Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/mysql/mysql-connector-java/5.1.22/mysql-connector-java-5.1.22.pom
2026-11-17T17:28:22.0839766Z Progress (1): 1.1 kB
2026-11-17T17:28:22.0839993Z                     
2026-11-17T17:28:22.0840504Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/mysql/mysql-connector-java/5.1.22/mysql-connector-java-5.1.22.pom (1.1 kB at 42 kB/s)
2026-11-17T17:28:22.0878181Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jboss/resteasy/resteasy-jaxrs/2.2.1.GA/resteasy-jaxrs-2.2.1.GA.pom
2026-11-17T17:28:22.1081561Z Progress (1): 3.3 kB
2026-11-17T17:28:22.1081953Z                     
2026-11-17T17:28:22.1082415Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jboss/resteasy/resteasy-jaxrs/2.2.1.GA/resteasy-jaxrs-2.2.1.GA.pom (3.3 kB at 158 kB/s)
2026-11-17T17:28:22.1109371Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jboss/resteasy/resteasy-jaxrs-all/2.2.1.GA/resteasy-jaxrs-all-2.2.1.GA.pom
2026-11-17T17:28:22.1259032Z Progress (1): 4.1/21 kB
2026-11-17T17:28:22.1260674Z Progress (1): 8.2/21 kB
2026-11-17T17:28:22.1261457Z Progress (1): 12/21 kB 
2026-11-17T17:28:22.1262555Z Progress (1): 16/21 kB
2026-11-17T17:28:22.1263660Z Progress (1): 20/21 kB
2026-11-17T17:28:22.1393207Z Progress (1): 21 kB   
2026-11-17T17:28:22.1393531Z                    
2026-11-17T17:28:22.1394055Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jboss/resteasy/resteasy-jaxrs-all/2.2.1.GA/resteasy-jaxrs-all-2.2.1.GA.pom (21 kB at 736 kB/s)
2026-11-17T17:28:22.1435767Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jboss/resteasy/jaxrs-api/2.2.1.GA/jaxrs-api-2.2.1.GA.pom
2026-11-17T17:28:22.1668693Z Progress (1): 963 B
2026-11-17T17:28:22.1668878Z                    
2026-11-17T17:28:22.1669704Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jboss/resteasy/jaxrs-api/2.2.1.GA/jaxrs-api-2.2.1.GA.pom (963 B at 42 kB/s)
2026-11-17T17:28:22.1715895Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/scannotation/scannotation/1.0.3/scannotation-1.0.3.pom
2026-11-17T17:28:22.1944295Z Progress (1): 3.1 kB
2026-11-17T17:28:22.1946078Z                     
2026-11-17T17:28:22.1946482Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/scannotation/scannotation/1.0.3/scannotation-1.0.3.pom (3.1 kB at 135 kB/s)
2026-11-17T17:28:22.2190067Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/httpcomponents/httpclient/4.0.3/httpclient-4.0.3.pom
2026-11-17T17:28:22.2304802Z Progress (1): 4.1/7.5 kB
2026-11-17T17:28:22.2418580Z Progress (1): 7.5 kB    
2026-11-17T17:28:22.2419040Z                     
2026-11-17T17:28:22.2419646Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/httpcomponents/httpclient/4.0.3/httpclient-4.0.3.pom (7.5 kB at 326 kB/s)
2026-11-17T17:28:22.2446543Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/httpcomponents/httpcomponents-client/4.0.3/httpcomponents-client-4.0.3.pom
2026-11-17T17:28:22.2550273Z Progress (1): 4.1/9.0 kB
2026-11-17T17:28:22.2551256Z Progress (1): 7.7/9.0 kB
2026-11-17T17:28:22.2626901Z Progress (1): 9.0 kB    
2026-11-17T17:28:22.2627427Z                     
2026-11-17T17:28:22.2627925Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/httpcomponents/httpcomponents-client/4.0.3/httpcomponents-client-4.0.3.pom (9.0 kB at 497 kB/s)
2026-11-17T17:28:22.3051250Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/google/code/gson/gson/2.8.2/gson-2.8.2.pom
2026-11-17T17:28:22.3224218Z Progress (1): 1.9 kB
2026-11-17T17:28:22.3224482Z                     
2026-11-17T17:28:22.3225268Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/google/code/gson/gson/2.8.2/gson-2.8.2.pom (1.9 kB at 105 kB/s)
2026-11-17T17:28:22.3253738Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/google/code/gson/gson-parent/2.8.2/gson-parent-2.8.2.pom
2026-11-17T17:28:22.3474432Z Progress (1): 3.7 kB
2026-11-17T17:28:22.3475312Z                     
2026-11-17T17:28:22.3475892Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/google/code/gson/gson-parent/2.8.2/gson-parent-2.8.2.pom (3.7 kB at 167 kB/s)
2026-11-17T17:28:22.3709352Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jboss/spec/javax/rmi/jboss-rmi-api_1.0_spec/1.0.6.Final/jboss-rmi-api_1.0_spec-1.0.6.Final.jar
2026-11-17T17:28:22.3709929Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/xalan/xalan/2.5.0/xalan-2.5.0.jar
2026-11-17T17:28:22.3710607Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/batik/batik-util/1.6/batik-util-1.6.jar
2026-11-17T17:28:22.3711894Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/dwr/dwr/1.1.3/dwr-1.1.3.jar
2026-11-17T17:28:22.3712551Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/bsf/bsf/2.3.0/bsf-2.3.0.jar
2026-11-17T17:28:22.3817166Z Progress (1): 4.1/82 kB
2026-11-17T17:28:22.3819162Z Progress (1): 7.7/82 kB
2026-11-17T17:28:22.3820517Z Progress (1): 12/82 kB 
2026-11-17T17:28:22.3827219Z Progress (1): 16/82 kB
2026-11-17T17:28:22.3828199Z Progress (2): 16/82 kB | 0/1.1 MB
2026-11-17T17:28:22.3830452Z Progress (2): 20/82 kB | 0/1.1 MB
2026-11-17T17:28:22.3832377Z Progress (3): 20/82 kB | 0/1.1 MB | 4.1/185 kB
2026-11-17T17:28:22.3834330Z Progress (3): 24/82 kB | 0/1.1 MB | 4.1/185 kB
2026-11-17T17:28:22.3836222Z Progress (3): 24/82 kB | 0/1.1 MB | 4.1/185 kB
2026-11-17T17:28:22.3838298Z Progress (3): 28/82 kB | 0/1.1 MB | 4.1/185 kB
2026-11-17T17:28:22.3839853Z Progress (3): 28/82 kB | 0/1.1 MB | 8.2/185 kB
2026-11-17T17:28:22.3841378Z Progress (3): 32/82 kB | 0/1.1 MB | 8.2/185 kB
2026-11-17T17:28:22.3843211Z Progress (3): 32/82 kB | 0/1.1 MB | 8.2/185 kB
2026-11-17T17:28:22.3846024Z Progress (3): 36/82 kB | 0/1.1 MB | 8.2/185 kB
2026-11-17T17:28:22.3848068Z Progress (4): 36/82 kB | 0/1.1 MB | 8.2/185 kB | 4.1/175 kB
2026-11-17T17:28:22.3851142Z Progress (4): 36/82 kB | 0/1.1 MB | 12/185 kB | 4.1/175 kB 
2026-11-17T17:28:22.3852951Z Progress (4): 36/82 kB | 0/1.1 MB | 12/185 kB | 7.7/175 kB
2026-11-17T17:28:22.3855340Z Progress (4): 41/82 kB | 0/1.1 MB | 12/185 kB | 7.7/175 kB
2026-11-17T17:28:22.3857559Z Progress (4): 41/82 kB | 0/1.1 MB | 12/185 kB | 7.7/175 kB
2026-11-17T17:28:22.3861443Z Progress (4): 45/82 kB | 0/1.1 MB | 12/185 kB | 7.7/175 kB
2026-11-17T17:28:22.3863043Z Progress (4): 45/82 kB | 0/1.1 MB | 12/185 kB | 12/175 kB 
2026-11-17T17:28:22.3865744Z Progress (4): 45/82 kB | 0/1.1 MB | 16/185 kB | 12/175 kB
2026-11-17T17:28:22.3867545Z Progress (4): 49/82 kB | 0/1.1 MB | 16/185 kB | 12/175 kB
2026-11-17T17:28:22.3875579Z Progress (4): 49/82 kB | 0/1.1 MB | 16/185 kB | 12/175 kB
2026-11-17T17:28:22.3877702Z Progress (4): 49/82 kB | 0/1.1 MB | 16/185 kB | 16/175 kB
2026-11-17T17:28:22.3880914Z Progress (4): 49/82 kB | 0/1.1 MB | 20/185 kB | 16/175 kB
2026-11-17T17:28:22.3883638Z Progress (5): 49/82 kB | 0/1.1 MB | 20/185 kB | 16/175 kB | 0/2.6 MB
2026-11-17T17:28:22.3890757Z Progress (5): 53/82 kB | 0/1.1 MB | 20/185 kB | 16/175 kB | 0/2.6 MB
2026-11-17T17:28:22.3892926Z Progress (5): 53/82 kB | 0/1.1 MB | 20/185 kB | 20/175 kB | 0/2.6 MB
2026-11-17T17:28:22.3895380Z Progress (5): 53/82 kB | 0/1.1 MB | 25/185 kB | 20/175 kB | 0/2.6 MB
2026-11-17T17:28:22.3898009Z Progress (5): 53/82 kB | 0/1.1 MB | 25/185 kB | 20/175 kB | 0/2.6 MB
2026-11-17T17:28:22.3908008Z Progress (5): 57/82 kB | 0/1.1 MB | 25/185 kB | 20/175 kB | 0/2.6 MB
2026-11-17T17:28:22.3909809Z Progress (5): 57/82 kB | 0/1.1 MB | 25/185 kB | 24/175 kB | 0/2.6 MB
2026-11-17T17:28:22.3913789Z Progress (5): 57/82 kB | 0/1.1 MB | 29/185 kB | 24/175 kB | 0/2.6 MB
2026-11-17T17:28:22.3922765Z Progress (5): 61/82 kB | 0/1.1 MB | 29/185 kB | 24/175 kB | 0/2.6 MB
2026-11-17T17:28:22.3924996Z Progress (5): 61/82 kB | 0.1/1.1 MB | 29/185 kB | 24/175 kB | 0/2.6 MB
2026-11-17T17:28:22.3927228Z Progress (5): 61/82 kB | 0.1/1.1 MB | 29/185 kB | 28/175 kB | 0/2.6 MB
2026-11-17T17:28:22.3929840Z Progress (5): 61/82 kB | 0.1/1.1 MB | 33/185 kB | 28/175 kB | 0/2.6 MB
2026-11-17T17:28:22.3933449Z Progress (5): 65/82 kB | 0.1/1.1 MB | 33/185 kB | 28/175 kB | 0/2.6 MB
2026-11-17T17:28:22.3940853Z Progress (5): 65/82 kB | 0.1/1.1 MB | 33/185 kB | 28/175 kB | 0/2.6 MB
2026-11-17T17:28:22.3942749Z Progress (5): 65/82 kB | 0.1/1.1 MB | 33/185 kB | 32/175 kB | 0/2.6 MB
2026-11-17T17:28:22.3945240Z Progress (5): 65/82 kB | 0.1/1.1 MB | 37/185 kB | 32/175 kB | 0/2.6 MB
2026-11-17T17:28:22.3947746Z Progress (5): 69/82 kB | 0.1/1.1 MB | 37/185 kB | 32/175 kB | 0/2.6 MB
2026-11-17T17:28:22.3956965Z Progress (5): 69/82 kB | 0.1/1.1 MB | 37/185 kB | 32/175 kB | 0/2.6 MB
2026-11-17T17:28:22.3959708Z Progress (5): 69/82 kB | 0.1/1.1 MB | 37/185 kB | 36/175 kB | 0/2.6 MB
2026-11-17T17:28:22.3963197Z Progress (5): 69/82 kB | 0.1/1.1 MB | 41/185 kB | 36/175 kB | 0/2.6 MB
2026-11-17T17:28:22.3975643Z Progress (5): 73/82 kB | 0.1/1.1 MB | 41/185 kB | 36/175 kB | 0/2.6 MB
2026-11-17T17:28:22.3976485Z Progress (5): 73/82 kB | 0.1/1.1 MB | 41/185 kB | 40/175 kB | 0/2.6 MB
2026-11-17T17:28:22.3979820Z Progress (5): 77/82 kB | 0.1/1.1 MB | 41/185 kB | 40/175 kB | 0/2.6 MB
2026-11-17T17:28:22.3980643Z Progress (5): 77/82 kB | 0.1/1.1 MB | 45/185 kB | 40/175 kB | 0/2.6 MB
2026-11-17T17:28:22.3982514Z Progress (5): 77/82 kB | 0.1/1.1 MB | 45/185 kB | 40/175 kB | 0/2.6 MB
2026-11-17T17:28:22.3984723Z Progress (5): 77/82 kB | 0.1/1.1 MB | 49/185 kB | 40/175 kB | 0/2.6 MB
2026-11-17T17:28:22.3987253Z Progress (5): 81/82 kB | 0.1/1.1 MB | 49/185 kB | 40/175 kB | 0/2.6 MB
2026-11-17T17:28:22.3989054Z Progress (5): 81/82 kB | 0.1/1.1 MB | 49/185 kB | 45/175 kB | 0/2.6 MB
2026-11-17T17:28:22.3991450Z Progress (5): 81/82 kB | 0.1/1.1 MB | 49/185 kB | 45/175 kB | 0/2.6 MB
2026-11-17T17:28:22.3993254Z Progress (5): 81/82 kB | 0.1/1.1 MB | 49/185 kB | 49/175 kB | 0/2.6 MB
2026-11-17T17:28:22.3994840Z Progress (5): 82 kB | 0.1/1.1 MB | 49/185 kB | 49/175 kB | 0/2.6 MB   
2026-11-17T17:28:22.3996570Z Progress (5): 82 kB | 0.1/1.1 MB | 53/185 kB | 49/175 kB | 0/2.6 MB
2026-11-17T17:28:22.3998111Z Progress (5): 82 kB | 0.1/1.1 MB | 53/185 kB | 49/175 kB | 0/2.6 MB
2026-11-17T17:28:22.4000358Z Progress (5): 82 kB | 0.1/1.1 MB | 57/185 kB | 49/175 kB | 0/2.6 MB
2026-11-17T17:28:22.4001740Z Progress (5): 82 kB | 0.1/1.1 MB | 57/185 kB | 53/175 kB | 0/2.6 MB
2026-11-17T17:28:22.4003595Z Progress (5): 82 kB | 0.1/1.1 MB | 57/185 kB | 53/175 kB | 0.1/2.6 MB
2026-11-17T17:28:22.4005176Z Progress (5): 82 kB | 0.1/1.1 MB | 57/185 kB | 57/175 kB | 0.1/2.6 MB
2026-11-17T17:28:22.4006438Z Progress (5): 82 kB | 0.1/1.1 MB | 61/185 kB | 57/175 kB | 0.1/2.6 MB
2026-11-17T17:28:22.4007747Z Progress (5): 82 kB | 0.1/1.1 MB | 61/185 kB | 57/175 kB | 0.1/2.6 MB
2026-11-17T17:28:22.4009310Z Progress (5): 82 kB | 0.1/1.1 MB | 66/185 kB | 57/175 kB | 0.1/2.6 MB
2026-11-17T17:28:22.4011088Z Progress (5): 82 kB | 0.1/1.1 MB | 66/185 kB | 61/175 kB | 0.1/2.6 MB
2026-11-17T17:28:22.4012542Z Progress (5): 82 kB | 0.1/1.1 MB | 66/185 kB | 61/175 kB | 0.1/2.6 MB
2026-11-17T17:28:22.4013817Z Progress (5): 82 kB | 0.1/1.1 MB | 66/185 kB | 65/175 kB | 0.1/2.6 MB
2026-11-17T17:28:22.4015180Z Progress (5): 82 kB | 0.1/1.1 MB | 70/185 kB | 65/175 kB | 0.1/2.6 MB
2026-11-17T17:28:22.4016179Z Progress (5): 82 kB | 0.1/1.1 MB | 70/185 kB | 65/175 kB | 0.1/2.6 MB
2026-11-17T17:28:22.4018088Z Progress (5): 82 kB | 0.1/1.1 MB | 74/185 kB | 65/175 kB | 0.1/2.6 MB
2026-11-17T17:28:22.4019176Z Progress (5): 82 kB | 0.1/1.1 MB | 74/185 kB | 69/175 kB | 0.1/2.6 MB
2026-11-17T17:28:22.4021950Z Progress (5): 82 kB | 0.1/1.1 MB | 74/185 kB | 69/175 kB | 0.1/2.6 MB
2026-11-17T17:28:22.4023623Z Progress (5): 82 kB | 0.1/1.1 MB | 74/185 kB | 73/175 kB | 0.1/2.6 MB
2026-11-17T17:28:22.4024828Z Progress (5): 82 kB | 0.1/1.1 MB | 78/185 kB | 73/175 kB | 0.1/2.6 MB
2026-11-17T17:28:22.4025948Z Progress (5): 82 kB | 0.1/1.1 MB | 78/185 kB | 73/175 kB | 0.1/2.6 MB
2026-11-17T17:28:22.4027400Z Progress (5): 82 kB | 0.1/1.1 MB | 82/185 kB | 73/175 kB | 0.1/2.6 MB
2026-11-17T17:28:22.4028624Z Progress (5): 82 kB | 0.1/1.1 MB | 82/185 kB | 77/175 kB | 0.1/2.6 MB
2026-11-17T17:28:22.4030180Z Progress (5): 82 kB | 0.1/1.1 MB | 82/185 kB | 77/175 kB | 0.1/2.6 MB
2026-11-17T17:28:22.4032904Z Progress (5): 82 kB | 0.1/1.1 MB | 82/185 kB | 81/175 kB | 0.1/2.6 MB
2026-11-17T17:28:22.4034117Z Progress (5): 82 kB | 0.1/1.1 MB | 86/185 kB | 81/175 kB | 0.1/2.6 MB
2026-11-17T17:28:22.4035572Z Progress (5): 82 kB | 0.1/1.1 MB | 86/185 kB | 81/175 kB | 0.1/2.6 MB
2026-11-17T17:28:22.4037094Z Progress (5): 82 kB | 0.1/1.1 MB | 90/185 kB | 81/175 kB | 0.1/2.6 MB
2026-11-17T17:28:22.4038177Z Progress (5): 82 kB | 0.1/1.1 MB | 90/185 kB | 86/175 kB | 0.1/2.6 MB
2026-11-17T17:28:22.4039475Z Progress (5): 82 kB | 0.1/1.1 MB | 90/185 kB | 86/175 kB | 0.1/2.6 MB
2026-11-17T17:28:22.4040788Z Progress (5): 82 kB | 0.1/1.1 MB | 90/185 kB | 90/175 kB | 0.1/2.6 MB
2026-11-17T17:28:22.4041812Z Progress (5): 82 kB | 0.1/1.1 MB | 94/185 kB | 90/175 kB | 0.1/2.6 MB
2026-11-17T17:28:22.4043495Z Progress (5): 82 kB | 0.1/1.1 MB | 94/185 kB | 90/175 kB | 0.1/2.6 MB
2026-11-17T17:28:22.4046016Z Progress (5): 82 kB | 0.1/1.1 MB | 98/185 kB | 90/175 kB | 0.1/2.6 MB
2026-11-17T17:28:22.4046303Z Progress (5): 82 kB | 0.1/1.1 MB | 98/185 kB | 94/175 kB | 0.1/2.6 MB
2026-11-17T17:28:22.4046833Z Progress (5): 82 kB | 0.1/1.1 MB | 98/185 kB | 94/175 kB | 0.1/2.6 MB
2026-11-17T17:28:22.4047885Z Progress (5): 82 kB | 0.1/1.1 MB | 98/185 kB | 98/175 kB | 0.1/2.6 MB
2026-11-17T17:28:22.4049067Z Progress (5): 82 kB | 0.1/1.1 MB | 98/185 kB | 98/175 kB | 0.2/2.6 MB
2026-11-17T17:28:22.4050077Z Progress (5): 82 kB | 0.1/1.1 MB | 102/185 kB | 98/175 kB | 0.2/2.6 MB
2026-11-17T17:28:22.4051759Z Progress (5): 82 kB | 0.1/1.1 MB | 102/185 kB | 98/175 kB | 0.2/2.6 MB
2026-11-17T17:28:22.4052774Z Progress (5): 82 kB | 0.1/1.1 MB | 106/185 kB | 98/175 kB | 0.2/2.6 MB
2026-11-17T17:28:22.4054474Z Progress (5): 82 kB | 0.1/1.1 MB | 106/185 kB | 98/175 kB | 0.2/2.6 MB
2026-11-17T17:28:22.4055531Z Progress (5): 82 kB | 0.1/1.1 MB | 106/185 kB | 102/175 kB | 0.2/2.6 MB
2026-11-17T17:28:22.4056569Z Progress (5): 82 kB | 0.1/1.1 MB | 106/185 kB | 102/175 kB | 0.2/2.6 MB
2026-11-17T17:28:22.4057652Z Progress (5): 82 kB | 0.1/1.1 MB | 111/185 kB | 102/175 kB | 0.2/2.6 MB
2026-11-17T17:28:22.4058807Z Progress (5): 82 kB | 0.1/1.1 MB | 111/185 kB | 102/175 kB | 0.2/2.6 MB
2026-11-17T17:28:22.4059755Z Progress (5): 82 kB | 0.1/1.1 MB | 115/185 kB | 102/175 kB | 0.2/2.6 MB
2026-11-17T17:28:22.4061355Z Progress (5): 82 kB | 0.1/1.1 MB | 115/185 kB | 102/175 kB | 0.2/2.6 MB
2026-11-17T17:28:22.4062169Z Progress (5): 82 kB | 0.1/1.1 MB | 115/185 kB | 106/175 kB | 0.2/2.6 MB
2026-11-17T17:28:22.4063628Z Progress (5): 82 kB | 0.1/1.1 MB | 115/185 kB | 106/175 kB | 0.2/2.6 MB
2026-11-17T17:28:22.4064945Z Progress (5): 82 kB | 0.1/1.1 MB | 119/185 kB | 106/175 kB | 0.2/2.6 MB
2026-11-17T17:28:22.4067020Z Progress (5): 82 kB | 0.1/1.1 MB | 119/185 kB | 106/175 kB | 0.2/2.6 MB
2026-11-17T17:28:22.4067200Z Progress (5): 82 kB | 0.1/1.1 MB | 123/185 kB | 106/175 kB | 0.2/2.6 MB
2026-11-17T17:28:22.4067666Z Progress (5): 82 kB | 0.1/1.1 MB | 123/185 kB | 106/175 kB | 0.2/2.6 MB
2026-11-17T17:28:22.4068423Z Progress (5): 82 kB | 0.1/1.1 MB | 123/185 kB | 110/175 kB | 0.2/2.6 MB
2026-11-17T17:28:22.4070321Z Progress (5): 82 kB | 0.1/1.1 MB | 123/185 kB | 110/175 kB | 0.3/2.6 MB
2026-11-17T17:28:22.4070647Z Progress (5): 82 kB | 0.1/1.1 MB | 127/185 kB | 110/175 kB | 0.3/2.6 MB
2026-11-17T17:28:22.4070937Z Progress (5): 82 kB | 0.2/1.1 MB | 127/185 kB | 110/175 kB | 0.3/2.6 MB
2026-11-17T17:28:22.4071499Z Progress (5): 82 kB | 0.2/1.1 MB | 131/185 kB | 110/175 kB | 0.3/2.6 MB
2026-11-17T17:28:22.4072060Z Progress (5): 82 kB | 0.2/1.1 MB | 131/185 kB | 110/175 kB | 0.3/2.6 MB
2026-11-17T17:28:22.4076443Z Progress (5): 82 kB | 0.2/1.1 MB | 131/185 kB | 110/175 kB | 0.3/2.6 MB
2026-11-17T17:28:22.4076794Z Progress (5): 82 kB | 0.2/1.1 MB | 131/185 kB | 114/175 kB | 0.3/2.6 MB
2026-11-17T17:28:22.4077041Z Progress (5): 82 kB | 0.2/1.1 MB | 131/185 kB | 114/175 kB | 0.3/2.6 MB
2026-11-17T17:28:22.4077356Z Progress (5): 82 kB | 0.2/1.1 MB | 135/185 kB | 114/175 kB | 0.3/2.6 MB
2026-11-17T17:28:22.4077653Z Progress (5): 82 kB | 0.2/1.1 MB | 135/185 kB | 114/175 kB | 0.3/2.6 MB
2026-11-17T17:28:22.4078273Z Progress (5): 82 kB | 0.2/1.1 MB | 135/185 kB | 118/175 kB | 0.3/2.6 MB
2026-11-17T17:28:22.4078982Z Progress (5): 82 kB | 0.2/1.1 MB | 135/185 kB | 118/175 kB | 0.3/2.6 MB
2026-11-17T17:28:22.4082495Z Progress (5): 82 kB | 0.2/1.1 MB | 135/185 kB | 122/175 kB | 0.3/2.6 MB
2026-11-17T17:28:22.4083049Z Progress (5): 82 kB | 0.2/1.1 MB | 135/185 kB | 122/175 kB | 0.3/2.6 MB
2026-11-17T17:28:22.4083886Z Progress (5): 82 kB | 0.2/1.1 MB | 135/185 kB | 127/175 kB | 0.3/2.6 MB
2026-11-17T17:28:22.4086388Z Progress (5): 82 kB | 0.2/1.1 MB | 139/185 kB | 127/175 kB | 0.3/2.6 MB
2026-11-17T17:28:22.4086688Z Progress (5): 82 kB | 0.2/1.1 MB | 139/185 kB | 131/175 kB | 0.3/2.6 MB
2026-11-17T17:28:22.4087254Z Progress (5): 82 kB | 0.2/1.1 MB | 139/185 kB | 131/175 kB | 0.3/2.6 MB
2026-11-17T17:28:22.4088130Z Progress (5): 82 kB | 0.2/1.1 MB | 139/185 kB | 131/175 kB | 0.3/2.6 MB
2026-11-17T17:28:22.4088892Z Progress (5): 82 kB | 0.2/1.1 MB | 139/185 kB | 131/175 kB | 0.3/2.6 MB
2026-11-17T17:28:22.4089733Z Progress (5): 82 kB | 0.2/1.1 MB | 139/185 kB | 135/175 kB | 0.3/2.6 MB
2026-11-17T17:28:22.4091051Z Progress (5): 82 kB | 0.2/1.1 MB | 143/185 kB | 135/175 kB | 0.3/2.6 MB
2026-11-17T17:28:22.4091547Z Progress (5): 82 kB | 0.2/1.1 MB | 143/185 kB | 139/175 kB | 0.3/2.6 MB
2026-11-17T17:28:22.4092409Z Progress (5): 82 kB | 0.2/1.1 MB | 143/185 kB | 139/175 kB | 0.3/2.6 MB
2026-11-17T17:28:22.4092986Z Progress (5): 82 kB | 0.2/1.1 MB | 143/185 kB | 139/175 kB | 0.3/2.6 MB
2026-11-17T17:28:22.4094364Z Progress (5): 82 kB | 0.2/1.1 MB | 143/185 kB | 139/175 kB | 0.3/2.6 MB
2026-11-17T17:28:22.4095057Z Progress (5): 82 kB | 0.2/1.1 MB | 143/185 kB | 143/175 kB | 0.3/2.6 MB
2026-11-17T17:28:22.4096032Z Progress (5): 82 kB | 0.2/1.1 MB | 147/185 kB | 143/175 kB | 0.3/2.6 MB
2026-11-17T17:28:22.4096691Z Progress (5): 82 kB | 0.2/1.1 MB | 147/185 kB | 147/175 kB | 0.3/2.6 MB
2026-11-17T17:28:22.4097402Z Progress (5): 82 kB | 0.2/1.1 MB | 147/185 kB | 147/175 kB | 0.3/2.6 MB
2026-11-17T17:28:22.4097954Z Progress (5): 82 kB | 0.2/1.1 MB | 147/185 kB | 147/175 kB | 0.3/2.6 MB
2026-11-17T17:28:22.4098758Z Progress (5): 82 kB | 0.2/1.1 MB | 147/185 kB | 147/175 kB | 0.3/2.6 MB
2026-11-17T17:28:22.4099358Z Progress (5): 82 kB | 0.2/1.1 MB | 147/185 kB | 151/175 kB | 0.3/2.6 MB
2026-11-17T17:28:22.4100095Z Progress (5): 82 kB | 0.2/1.1 MB | 152/185 kB | 151/175 kB | 0.3/2.6 MB
2026-11-17T17:28:22.4100834Z Progress (5): 82 kB | 0.2/1.1 MB | 152/185 kB | 155/175 kB | 0.3/2.6 MB
2026-11-17T17:28:22.4101401Z Progress (5): 82 kB | 0.2/1.1 MB | 152/185 kB | 155/175 kB | 0.4/2.6 MB
2026-11-17T17:28:22.4102380Z Progress (5): 82 kB | 0.2/1.1 MB | 152/185 kB | 155/175 kB | 0.4/2.6 MB
2026-11-17T17:28:22.4102913Z Progress (5): 82 kB | 0.2/1.1 MB | 152/185 kB | 159/175 kB | 0.4/2.6 MB
2026-11-17T17:28:22.4103650Z Progress (5): 82 kB | 0.3/1.1 MB | 152/185 kB | 159/175 kB | 0.4/2.6 MB
2026-11-17T17:28:22.4104222Z Progress (5): 82 kB | 0.3/1.1 MB | 156/185 kB | 159/175 kB | 0.4/2.6 MB
2026-11-17T17:28:22.4105343Z Progress (5): 82 kB | 0.3/1.1 MB | 156/185 kB | 159/175 kB | 0.4/2.6 MB
2026-11-17T17:28:22.4105706Z Progress (5): 82 kB | 0.3/1.1 MB | 156/185 kB | 163/175 kB | 0.4/2.6 MB
2026-11-17T17:28:22.4106333Z Progress (5): 82 kB | 0.3/1.1 MB | 156/185 kB | 163/175 kB | 0.4/2.6 MB
2026-11-17T17:28:22.4107220Z Progress (5): 82 kB | 0.3/1.1 MB | 156/185 kB | 163/175 kB | 0.4/2.6 MB
2026-11-17T17:28:22.4107579Z Progress (5): 82 kB | 0.3/1.1 MB | 156/185 kB | 163/175 kB | 0.4/2.6 MB
2026-11-17T17:28:22.4108447Z Progress (5): 82 kB | 0.3/1.1 MB | 156/185 kB | 167/175 kB | 0.4/2.6 MB
2026-11-17T17:28:22.4108808Z Progress (5): 82 kB | 0.3/1.1 MB | 156/185 kB | 167/175 kB | 0.4/2.6 MB
2026-11-17T17:28:22.4109468Z Progress (5): 82 kB | 0.3/1.1 MB | 160/185 kB | 167/175 kB | 0.4/2.6 MB
2026-11-17T17:28:22.4110179Z Progress (5): 82 kB | 0.3/1.1 MB | 160/185 kB | 167/175 kB | 0.4/2.6 MB
2026-11-17T17:28:22.4111024Z Progress (5): 82 kB | 0.3/1.1 MB | 160/185 kB | 172/175 kB | 0.4/2.6 MB
2026-11-17T17:28:22.4111605Z Progress (5): 82 kB | 0.3/1.1 MB | 160/185 kB | 172/175 kB | 0.4/2.6 MB
2026-11-17T17:28:22.4112422Z Progress (5): 82 kB | 0.3/1.1 MB | 160/185 kB | 175 kB | 0.4/2.6 MB    
2026-11-17T17:28:22.4113009Z Progress (5): 82 kB | 0.3/1.1 MB | 160/185 kB | 175 kB | 0.4/2.6 MB
2026-11-17T17:28:22.4113488Z                                                                    
2026-11-17T17:28:22.4114113Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/batik/batik-util/1.6/batik-util-1.6.jar (82 kB at 2.0 MB/s)
2026-11-17T17:28:22.4114673Z Progress (4): 0.3/1.1 MB | 164/185 kB | 175 kB | 0.4/2.6 MB
2026-11-17T17:28:22.4114810Z                                                            
2026-11-17T17:28:22.4115620Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/xom/xom/1.1/xom-1.1.jar
2026-11-17T17:28:22.4116105Z Progress (4): 0.3/1.1 MB | 164/185 kB | 175 kB | 0.4/2.6 MB
2026-11-17T17:28:22.4116373Z Progress (4): 0.3/1.1 MB | 164/185 kB | 175 kB | 0.4/2.6 MB
2026-11-17T17:28:22.4116777Z Progress (4): 0.3/1.1 MB | 168/185 kB | 175 kB | 0.4/2.6 MB
2026-11-17T17:28:22.4118067Z Progress (4): 0.3/1.1 MB | 168/185 kB | 175 kB | 0.4/2.6 MB
2026-11-17T17:28:22.4118509Z Progress (4): 0.3/1.1 MB | 172/185 kB | 175 kB | 0.4/2.6 MB
2026-11-17T17:28:22.4118889Z Progress (4): 0.3/1.1 MB | 172/185 kB | 175 kB | 0.4/2.6 MB
2026-11-17T17:28:22.4119210Z Progress (4): 0.3/1.1 MB | 176/185 kB | 175 kB | 0.4/2.6 MB
2026-11-17T17:28:22.4119860Z Progress (4): 0.3/1.1 MB | 176/185 kB | 175 kB | 0.4/2.6 MB
2026-11-17T17:28:22.4120433Z Progress (4): 0.3/1.1 MB | 180/185 kB | 175 kB | 0.4/2.6 MB
2026-11-17T17:28:22.4120859Z Progress (4): 0.3/1.1 MB | 180/185 kB | 175 kB | 0.4/2.6 MB
2026-11-17T17:28:22.4121635Z Progress (4): 0.3/1.1 MB | 184/185 kB | 175 kB | 0.4/2.6 MB
2026-11-17T17:28:22.4122144Z Progress (4): 0.3/1.1 MB | 184/185 kB | 175 kB | 0.4/2.6 MB
2026-11-17T17:28:22.4122772Z Progress (4): 0.3/1.1 MB | 185 kB | 175 kB | 0.4/2.6 MB    
2026-11-17T17:28:22.4123257Z Progress (4): 0.3/1.1 MB | 185 kB | 175 kB | 0.5/2.6 MB
2026-11-17T17:28:22.4124857Z Progress (4): 0.3/1.1 MB | 185 kB | 175 kB | 0.5/2.6 MB
2026-11-17T17:28:22.4125107Z Progress (4): 0.4/1.1 MB | 185 kB | 175 kB | 0.5/2.6 MB
2026-11-17T17:28:22.4125701Z Progress (4): 0.4/1.1 MB | 185 kB | 175 kB | 0.5/2.6 MB
2026-11-17T17:28:22.4126988Z Progress (4): 0.4/1.1 MB | 185 kB | 175 kB | 0.5/2.6 MB
2026-11-17T17:28:22.4127879Z Progress (4): 0.4/1.1 MB | 185 kB | 175 kB | 0.5/2.6 MB
2026-11-17T17:28:22.4129070Z Progress (4): 0.4/1.1 MB | 185 kB | 175 kB | 0.5/2.6 MB
2026-11-17T17:28:22.4129461Z Progress (4): 0.4/1.1 MB | 185 kB | 175 kB | 0.5/2.6 MB
2026-11-17T17:28:22.4131070Z Progress (4): 0.4/1.1 MB | 185 kB | 175 kB | 0.5/2.6 MB
2026-11-17T17:28:22.4131411Z Progress (4): 0.4/1.1 MB | 185 kB | 175 kB | 0.5/2.6 MB
2026-11-17T17:28:22.4131922Z Progress (4): 0.4/1.1 MB | 185 kB | 175 kB | 0.5/2.6 MB
2026-11-17T17:28:22.4133320Z Progress (4): 0.4/1.1 MB | 185 kB | 175 kB | 0.5/2.6 MB
2026-11-17T17:28:22.4133767Z Progress (4): 0.4/1.1 MB | 185 kB | 175 kB | 0.5/2.6 MB
2026-11-17T17:28:22.4135056Z Progress (4): 0.4/1.1 MB | 185 kB | 175 kB | 0.5/2.6 MB
2026-11-17T17:28:22.4135420Z Progress (4): 0.4/1.1 MB | 185 kB | 175 kB | 0.5/2.6 MB
2026-11-17T17:28:22.4136424Z Progress (4): 0.4/1.1 MB | 185 kB | 175 kB | 0.6/2.6 MB
2026-11-17T17:28:22.4136851Z Progress (4): 0.4/1.1 MB | 185 kB | 175 kB | 0.6/2.6 MB
2026-11-17T17:28:22.4137855Z Progress (4): 0.4/1.1 MB | 185 kB | 175 kB | 0.6/2.6 MB
2026-11-17T17:28:22.4138832Z Progress (4): 0.4/1.1 MB | 185 kB | 175 kB | 0.6/2.6 MB
2026-11-17T17:28:22.4139251Z Progress (4): 0.4/1.1 MB | 185 kB | 175 kB | 0.6/2.6 MB
2026-11-17T17:28:22.4140585Z Progress (4): 0.4/1.1 MB | 185 kB | 175 kB | 0.6/2.6 MB
2026-11-17T17:28:22.4141062Z Progress (4): 0.4/1.1 MB | 185 kB | 175 kB | 0.6/2.6 MB
2026-11-17T17:28:22.4143043Z Progress (4): 0.4/1.1 MB | 185 kB | 175 kB | 0.6/2.6 MB
2026-11-17T17:28:22.4143303Z Progress (4): 0.5/1.1 MB | 185 kB | 175 kB | 0.6/2.6 MB
2026-11-17T17:28:22.4143568Z Progress (4): 0.5/1.1 MB | 185 kB | 175 kB | 0.6/2.6 MB
2026-11-17T17:28:22.4145203Z Progress (4): 0.5/1.1 MB | 185 kB | 175 kB | 0.6/2.6 MB
2026-11-17T17:28:22.4145501Z Progress (4): 0.5/1.1 MB | 185 kB | 175 kB | 0.6/2.6 MB
2026-11-17T17:28:22.4146135Z Progress (4): 0.5/1.1 MB | 185 kB | 175 kB | 0.6/2.6 MB
2026-11-17T17:28:22.4147427Z Progress (4): 0.5/1.1 MB | 185 kB | 175 kB | 0.6/2.6 MB
2026-11-17T17:28:22.4197718Z Progress (4): 0.5/1.1 MB | 185 kB | 175 kB | 0.7/2.6 MB
2026-11-17T17:28:22.4197943Z Progress (4): 0.5/1.1 MB | 185 kB | 175 kB | 0.7/2.6 MB
2026-11-17T17:28:22.4198079Z Progress (4): 0.5/1.1 MB | 185 kB | 175 kB | 0.7/2.6 MB
2026-11-17T17:28:22.4198385Z Progress (4): 0.5/1.1 MB | 185 kB | 175 kB | 0.7/2.6 MB
2026-11-17T17:28:22.4199454Z Progress (4): 0.5/1.1 MB | 185 kB | 175 kB | 0.7/2.6 MB
2026-11-17T17:28:22.4199718Z Progress (4): 0.5/1.1 MB | 185 kB | 175 kB | 0.7/2.6 MB
2026-11-17T17:28:22.4200991Z Progress (4): 0.5/1.1 MB | 185 kB | 175 kB | 0.7/2.6 MB
2026-11-17T17:28:22.4201316Z Progress (4): 0.5/1.1 MB | 185 kB | 175 kB | 0.7/2.6 MB
2026-11-17T17:28:22.4202658Z Progress (4): 0.5/1.1 MB | 185 kB | 175 kB | 0.7/2.6 MB
2026-11-17T17:28:22.4202971Z Progress (4): 0.5/1.1 MB | 185 kB | 175 kB | 0.7/2.6 MB
2026-11-17T17:28:22.4203646Z Progress (4): 0.5/1.1 MB | 185 kB | 175 kB | 0.7/2.6 MB
2026-11-17T17:28:22.4204992Z Progress (4): 0.5/1.1 MB | 185 kB | 175 kB | 0.7/2.6 MB
2026-11-17T17:28:22.4205409Z Progress (4): 0.5/1.1 MB | 185 kB | 175 kB | 0.7/2.6 MB
2026-11-17T17:28:22.4205999Z Progress (4): 0.5/1.1 MB | 185 kB | 175 kB | 0.7/2.6 MB
2026-11-17T17:28:22.4206965Z Progress (4): 0.5/1.1 MB | 185 kB | 175 kB | 0.7/2.6 MB
2026-11-17T17:28:22.4207474Z Progress (5): 0.5/1.1 MB | 185 kB | 175 kB | 0.7/2.6 MB | 4.1/432 kB
2026-11-17T17:28:22.4208067Z Progress (5): 0.5/1.1 MB | 185 kB | 175 kB | 0.8/2.6 MB | 4.1/432 kB
2026-11-17T17:28:22.4211005Z Progress (5): 0.6/1.1 MB | 185 kB | 175 kB | 0.8/2.6 MB | 4.1/432 kB
2026-11-17T17:28:22.4211281Z Progress (5): 0.6/1.1 MB | 185 kB | 175 kB | 0.8/2.6 MB | 7.7/432 kB
2026-11-17T17:28:22.4211420Z Progress (5): 0.6/1.1 MB | 185 kB | 175 kB | 0.8/2.6 MB | 7.7/432 kB
2026-11-17T17:28:22.4211597Z Progress (5): 0.6/1.1 MB | 185 kB | 175 kB | 0.8/2.6 MB | 7.7/432 kB
2026-11-17T17:28:22.4212030Z Progress (5): 0.6/1.1 MB | 185 kB | 175 kB | 0.8/2.6 MB | 12/432 kB 
2026-11-17T17:28:22.4212751Z Progress (5): 0.6/1.1 MB | 185 kB | 175 kB | 0.8/2.6 MB | 12/432 kB
2026-11-17T17:28:22.4213154Z Progress (5): 0.6/1.1 MB | 185 kB | 175 kB | 0.8/2.6 MB | 16/432 kB
2026-11-17T17:28:22.4213970Z Progress (5): 0.6/1.1 MB | 185 kB | 175 kB | 0.8/2.6 MB | 16/432 kB
2026-11-17T17:28:22.4214487Z Progress (5): 0.6/1.1 MB | 185 kB | 175 kB | 0.8/2.6 MB | 20/432 kB
2026-11-17T17:28:22.4215005Z Progress (5): 0.6/1.1 MB | 185 kB | 175 kB | 0.8/2.6 MB | 20/432 kB
2026-11-17T17:28:22.4215318Z Progress (5): 0.6/1.1 MB | 185 kB | 175 kB | 0.8/2.6 MB | 20/432 kB
2026-11-17T17:28:22.4215554Z                                                                    
2026-11-17T17:28:22.4216302Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/bsf/bsf/2.3.0/bsf-2.3.0.jar (175 kB at 3.4 MB/s)
2026-11-17T17:28:22.4216821Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/dwr/dwr/1.1.3/dwr-1.1.3.jar (185 kB at 3.6 MB/s)
2026-11-17T17:28:22.4217064Z Progress (3): 0.6/1.1 MB | 0.8/2.6 MB | 20/432 kB
2026-11-17T17:28:22.4217246Z Progress (3): 0.6/1.1 MB | 0.8/2.6 MB | 24/432 kB
2026-11-17T17:28:22.4217411Z                                                  
2026-11-17T17:28:22.4217866Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/jaxen/jaxen/1.1-beta-8/jaxen-1.1-beta-8.jar
2026-11-17T17:28:22.4218112Z Progress (3): 0.6/1.1 MB | 0.8/2.6 MB | 24/432 kB
2026-11-17T17:28:22.4218387Z Progress (3): 0.6/1.1 MB | 0.8/2.6 MB | 24/432 kB
2026-11-17T17:28:22.4218538Z                                                  
2026-11-17T17:28:22.4218790Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/xerces/xmlParserAPIs/2.6.2/xmlParserAPIs-2.6.2.jar
2026-11-17T17:28:22.4219318Z Progress (3): 0.6/1.1 MB | 0.8/2.6 MB | 24/432 kB
2026-11-17T17:28:22.4219570Z Progress (3): 0.6/1.1 MB | 0.8/2.6 MB | 28/432 kB
2026-11-17T17:28:22.4219970Z Progress (3): 0.6/1.1 MB | 0.8/2.6 MB | 28/432 kB
2026-11-17T17:28:22.4220565Z Progress (3): 0.6/1.1 MB | 0.8/2.6 MB | 28/432 kB
2026-11-17T17:28:22.4220915Z Progress (3): 0.6/1.1 MB | 0.8/2.6 MB | 32/432 kB
2026-11-17T17:28:22.4221300Z Progress (3): 0.6/1.1 MB | 0.8/2.6 MB | 32/432 kB
2026-11-17T17:28:22.4221846Z Progress (3): 0.6/1.1 MB | 0.8/2.6 MB | 32/432 kB
2026-11-17T17:28:22.4222436Z Progress (3): 0.6/1.1 MB | 0.8/2.6 MB | 32/432 kB
2026-11-17T17:28:22.4223011Z Progress (3): 0.6/1.1 MB | 0.8/2.6 MB | 36/432 kB
2026-11-17T17:28:22.4224386Z Progress (3): 0.6/1.1 MB | 0.9/2.6 MB | 36/432 kB
2026-11-17T17:28:22.4224780Z Progress (3): 0.6/1.1 MB | 0.9/2.6 MB | 40/432 kB
2026-11-17T17:28:22.4225146Z Progress (3): 0.6/1.1 MB | 0.9/2.6 MB | 40/432 kB
2026-11-17T17:28:22.4225707Z Progress (3): 0.6/1.1 MB | 0.9/2.6 MB | 40/432 kB
2026-11-17T17:28:22.4226022Z Progress (3): 0.6/1.1 MB | 0.9/2.6 MB | 45/432 kB
2026-11-17T17:28:22.4226840Z Progress (3): 0.6/1.1 MB | 0.9/2.6 MB | 45/432 kB
2026-11-17T17:28:22.4227011Z Progress (3): 0.6/1.1 MB | 0.9/2.6 MB | 45/432 kB
2026-11-17T17:28:22.4228174Z Progress (3): 0.7/1.1 MB | 0.9/2.6 MB | 45/432 kB
2026-11-17T17:28:22.4228413Z Progress (3): 0.7/1.1 MB | 0.9/2.6 MB | 49/432 kB
2026-11-17T17:28:22.4228674Z Progress (3): 0.7/1.1 MB | 0.9/2.6 MB | 49/432 kB
2026-11-17T17:28:22.4229010Z Progress (3): 0.7/1.1 MB | 0.9/2.6 MB | 49/432 kB
2026-11-17T17:28:22.4229438Z Progress (3): 0.7/1.1 MB | 0.9/2.6 MB | 53/432 kB
2026-11-17T17:28:22.4230052Z Progress (3): 0.7/1.1 MB | 0.9/2.6 MB | 53/432 kB
2026-11-17T17:28:22.4230561Z Progress (3): 0.7/1.1 MB | 0.9/2.6 MB | 57/432 kB
2026-11-17T17:28:22.4231104Z Progress (3): 0.7/1.1 MB | 0.9/2.6 MB | 57/432 kB
2026-11-17T17:28:22.4231320Z Progress (3): 0.7/1.1 MB | 0.9/2.6 MB | 61/432 kB
2026-11-17T17:28:22.4231690Z Progress (3): 0.7/1.1 MB | 0.9/2.6 MB | 61/432 kB
2026-11-17T17:28:22.4232144Z Progress (3): 0.7/1.1 MB | 0.9/2.6 MB | 65/432 kB
2026-11-17T17:28:22.4233045Z Progress (3): 0.7/1.1 MB | 0.9/2.6 MB | 65/432 kB
2026-11-17T17:28:22.4233342Z Progress (3): 0.7/1.1 MB | 0.9/2.6 MB | 69/432 kB
2026-11-17T17:28:22.4233687Z Progress (3): 0.7/1.1 MB | 0.9/2.6 MB | 69/432 kB
2026-11-17T17:28:22.4234250Z Progress (3): 0.7/1.1 MB | 0.9/2.6 MB | 69/432 kB
2026-11-17T17:28:22.4234682Z Progress (3): 0.7/1.1 MB | 0.9/2.6 MB | 73/432 kB
2026-11-17T17:28:22.4235246Z Progress (3): 0.7/1.1 MB | 0.9/2.6 MB | 73/432 kB
2026-11-17T17:28:22.4235581Z Progress (3): 0.7/1.1 MB | 0.9/2.6 MB | 77/432 kB
2026-11-17T17:28:22.4235929Z Progress (3): 0.7/1.1 MB | 0.9/2.6 MB | 77/432 kB
2026-11-17T17:28:22.4236459Z Progress (3): 0.7/1.1 MB | 1.0/2.6 MB | 77/432 kB
2026-11-17T17:28:22.4236836Z Progress (3): 0.7/1.1 MB | 1.0/2.6 MB | 81/432 kB
2026-11-17T17:28:22.4237419Z Progress (3): 0.7/1.1 MB | 1.0/2.6 MB | 81/432 kB
2026-11-17T17:28:22.4237735Z Progress (3): 0.7/1.1 MB | 1.0/2.6 MB | 86/432 kB
2026-11-17T17:28:22.4238261Z Progress (3): 0.7/1.1 MB | 1.0/2.6 MB | 86/432 kB
2026-11-17T17:28:22.4238864Z Progress (3): 0.7/1.1 MB | 1.0/2.6 MB | 90/432 kB
2026-11-17T17:28:22.4239220Z Progress (3): 0.7/1.1 MB | 1.0/2.6 MB | 90/432 kB
2026-11-17T17:28:22.4239750Z Progress (3): 0.7/1.1 MB | 1.0/2.6 MB | 90/432 kB
2026-11-17T17:28:22.4240338Z Progress (3): 0.7/1.1 MB | 1.0/2.6 MB | 94/432 kB
2026-11-17T17:28:22.4240809Z Progress (3): 0.7/1.1 MB | 1.0/2.6 MB | 94/432 kB
2026-11-17T17:28:22.4241174Z Progress (3): 0.7/1.1 MB | 1.0/2.6 MB | 98/432 kB
2026-11-17T17:28:22.4241943Z Progress (3): 0.7/1.1 MB | 1.0/2.6 MB | 98/432 kB
2026-11-17T17:28:22.4242299Z Progress (3): 0.7/1.1 MB | 1.0/2.6 MB | 98/432 kB
2026-11-17T17:28:22.4242673Z Progress (3): 0.7/1.1 MB | 1.0/2.6 MB | 102/432 kB
2026-11-17T17:28:22.4242955Z Progress (3): 0.7/1.1 MB | 1.0/2.6 MB | 102/432 kB
2026-11-17T17:28:22.4243482Z Progress (3): 0.8/1.1 MB | 1.0/2.6 MB | 102/432 kB
2026-11-17T17:28:22.4244021Z Progress (3): 0.8/1.1 MB | 1.0/2.6 MB | 106/432 kB
2026-11-17T17:28:22.4245825Z Progress (3): 0.8/1.1 MB | 1.0/2.6 MB | 106/432 kB
2026-11-17T17:28:22.4246141Z Progress (3): 0.8/1.1 MB | 1.0/2.6 MB | 110/432 kB
2026-11-17T17:28:22.4246648Z Progress (3): 0.8/1.1 MB | 1.0/2.6 MB | 110/432 kB
2026-11-17T17:28:22.4247037Z Progress (3): 0.8/1.1 MB | 1.0/2.6 MB | 114/432 kB
2026-11-17T17:28:22.4247643Z Progress (3): 0.8/1.1 MB | 1.0/2.6 MB | 114/432 kB
2026-11-17T17:28:22.4248170Z Progress (3): 0.8/1.1 MB | 1.0/2.6 MB | 118/432 kB
2026-11-17T17:28:22.4248689Z Progress (3): 0.8/1.1 MB | 1.0/2.6 MB | 118/432 kB
2026-11-17T17:28:22.4249079Z Progress (3): 0.8/1.1 MB | 1.0/2.6 MB | 122/432 kB
2026-11-17T17:28:22.4249570Z Progress (3): 0.8/1.1 MB | 1.1/2.6 MB | 122/432 kB
2026-11-17T17:28:22.4249906Z Progress (3): 0.8/1.1 MB | 1.1/2.6 MB | 127/432 kB
2026-11-17T17:28:22.4250534Z Progress (3): 0.8/1.1 MB | 1.1/2.6 MB | 127/432 kB
2026-11-17T17:28:22.4250874Z Progress (3): 0.8/1.1 MB | 1.1/2.6 MB | 131/432 kB
2026-11-17T17:28:22.4251367Z Progress (3): 0.8/1.1 MB | 1.1/2.6 MB | 131/432 kB
2026-11-17T17:28:22.4251892Z Progress (3): 0.8/1.1 MB | 1.1/2.6 MB | 131/432 kB
2026-11-17T17:28:22.4252216Z Progress (3): 0.8/1.1 MB | 1.1/2.6 MB | 135/432 kB
2026-11-17T17:28:22.4252762Z Progress (3): 0.8/1.1 MB | 1.1/2.6 MB | 135/432 kB
2026-11-17T17:28:22.4253071Z Progress (3): 0.8/1.1 MB | 1.1/2.6 MB | 139/432 kB
2026-11-17T17:28:22.4253603Z Progress (3): 0.8/1.1 MB | 1.1/2.6 MB | 139/432 kB
2026-11-17T17:28:22.4253929Z Progress (3): 0.8/1.1 MB | 1.1/2.6 MB | 143/432 kB
2026-11-17T17:28:22.4254315Z Progress (3): 0.8/1.1 MB | 1.1/2.6 MB | 143/432 kB
2026-11-17T17:28:22.4254811Z Progress (3): 0.8/1.1 MB | 1.1/2.6 MB | 143/432 kB
2026-11-17T17:28:22.4255588Z Progress (3): 0.8/1.1 MB | 1.1/2.6 MB | 147/432 kB
2026-11-17T17:28:22.4255906Z Progress (3): 0.8/1.1 MB | 1.1/2.6 MB | 147/432 kB
2026-11-17T17:28:22.4256226Z Progress (3): 0.8/1.1 MB | 1.1/2.6 MB | 147/432 kB
2026-11-17T17:28:22.4256704Z Progress (3): 0.8/1.1 MB | 1.1/2.6 MB | 151/432 kB
2026-11-17T17:28:22.4256979Z Progress (3): 0.8/1.1 MB | 1.1/2.6 MB | 151/432 kB
2026-11-17T17:28:22.4257717Z Progress (3): 0.8/1.1 MB | 1.1/2.6 MB | 155/432 kB
2026-11-17T17:28:22.4257960Z Progress (3): 0.8/1.1 MB | 1.1/2.6 MB | 155/432 kB
2026-11-17T17:28:22.4258552Z Progress (3): 0.8/1.1 MB | 1.1/2.6 MB | 155/432 kB
2026-11-17T17:28:22.4259136Z Progress (3): 0.8/1.1 MB | 1.1/2.6 MB | 159/432 kB
2026-11-17T17:28:22.4259427Z Progress (3): 0.9/1.1 MB | 1.1/2.6 MB | 159/432 kB
2026-11-17T17:28:22.4259894Z Progress (3): 0.9/1.1 MB | 1.1/2.6 MB | 159/432 kB
2026-11-17T17:28:22.4260449Z Progress (3): 0.9/1.1 MB | 1.1/2.6 MB | 163/432 kB
2026-11-17T17:28:22.4260619Z Progress (3): 0.9/1.1 MB | 1.1/2.6 MB | 163/432 kB
2026-11-17T17:28:22.4263277Z Progress (3): 0.9/1.1 MB | 1.1/2.6 MB | 167/432 kB
2026-11-17T17:28:22.4263537Z Progress (3): 0.9/1.1 MB | 1.2/2.6 MB | 167/432 kB
2026-11-17T17:28:22.4263697Z Progress (3): 0.9/1.1 MB | 1.2/2.6 MB | 167/432 kB
2026-11-17T17:28:22.4263915Z Progress (3): 0.9/1.1 MB | 1.2/2.6 MB | 172/432 kB
2026-11-17T17:28:22.4264067Z Progress (3): 0.9/1.1 MB | 1.2/2.6 MB | 176/432 kB
2026-11-17T17:28:22.4264184Z Progress (3): 0.9/1.1 MB | 1.2/2.6 MB | 176/432 kB
2026-11-17T17:28:22.4264357Z Progress (3): 0.9/1.1 MB | 1.2/2.6 MB | 176/432 kB
2026-11-17T17:28:22.4264590Z Progress (3): 0.9/1.1 MB | 1.2/2.6 MB | 180/432 kB
2026-11-17T17:28:22.4264793Z Progress (3): 0.9/1.1 MB | 1.2/2.6 MB | 180/432 kB
2026-11-17T17:28:22.4265318Z Progress (3): 0.9/1.1 MB | 1.2/2.6 MB | 184/432 kB
2026-11-17T17:28:22.4265741Z Progress (3): 0.9/1.1 MB | 1.2/2.6 MB | 184/432 kB
2026-11-17T17:28:22.4266200Z Progress (3): 0.9/1.1 MB | 1.2/2.6 MB | 184/432 kB
2026-11-17T17:28:22.4266796Z Progress (3): 0.9/1.1 MB | 1.2/2.6 MB | 188/432 kB
2026-11-17T17:28:22.4267109Z Progress (3): 0.9/1.1 MB | 1.2/2.6 MB | 188/432 kB
2026-11-17T17:28:22.4267374Z Progress (3): 0.9/1.1 MB | 1.2/2.6 MB | 188/432 kB
2026-11-17T17:28:22.4267679Z Progress (3): 0.9/1.1 MB | 1.2/2.6 MB | 192/432 kB
2026-11-17T17:28:22.4268076Z Progress (3): 0.9/1.1 MB | 1.2/2.6 MB | 192/432 kB
2026-11-17T17:28:22.4268778Z Progress (3): 0.9/1.1 MB | 1.2/2.6 MB | 196/432 kB
2026-11-17T17:28:22.4269050Z Progress (3): 0.9/1.1 MB | 1.2/2.6 MB | 196/432 kB
2026-11-17T17:28:22.4269309Z Progress (3): 0.9/1.1 MB | 1.2/2.6 MB | 200/432 kB
2026-11-17T17:28:22.4269768Z Progress (3): 0.9/1.1 MB | 1.2/2.6 MB | 200/432 kB
2026-11-17T17:28:22.4270287Z Progress (3): 0.9/1.1 MB | 1.2/2.6 MB | 204/432 kB
2026-11-17T17:28:22.4270547Z Progress (3): 0.9/1.1 MB | 1.2/2.6 MB | 204/432 kB
2026-11-17T17:28:22.4270811Z Progress (3): 0.9/1.1 MB | 1.2/2.6 MB | 208/432 kB
2026-11-17T17:28:22.4271092Z Progress (3): 0.9/1.1 MB | 1.2/2.6 MB | 208/432 kB
2026-11-17T17:28:22.4271924Z Progress (3): 0.9/1.1 MB | 1.2/2.6 MB | 213/432 kB
2026-11-17T17:28:22.4272203Z Progress (3): 0.9/1.1 MB | 1.3/2.6 MB | 213/432 kB
2026-11-17T17:28:22.4272401Z Progress (3): 0.9/1.1 MB | 1.3/2.6 MB | 217/432 kB
2026-11-17T17:28:22.4272960Z Progress (3): 0.9/1.1 MB | 1.3/2.6 MB | 217/432 kB
2026-11-17T17:28:22.4273546Z Progress (3): 0.9/1.1 MB | 1.3/2.6 MB | 221/432 kB
2026-11-17T17:28:22.4273799Z Progress (3): 0.9/1.1 MB | 1.3/2.6 MB | 221/432 kB
2026-11-17T17:28:22.4274211Z Progress (3): 0.9/1.1 MB | 1.3/2.6 MB | 225/432 kB
2026-11-17T17:28:22.4274564Z Progress (3): 0.9/1.1 MB | 1.3/2.6 MB | 225/432 kB
2026-11-17T17:28:22.4274946Z Progress (3): 0.9/1.1 MB | 1.3/2.6 MB | 229/432 kB
2026-11-17T17:28:22.4275198Z Progress (3): 0.9/1.1 MB | 1.3/2.6 MB | 229/432 kB
2026-11-17T17:28:22.4275912Z Progress (3): 0.9/1.1 MB | 1.3/2.6 MB | 233/432 kB
2026-11-17T17:28:22.4276380Z Progress (3): 0.9/1.1 MB | 1.3/2.6 MB | 233/432 kB
2026-11-17T17:28:22.4276759Z Progress (3): 0.9/1.1 MB | 1.3/2.6 MB | 237/432 kB
2026-11-17T17:28:22.4277163Z Progress (3): 1.0/1.1 MB | 1.3/2.6 MB | 237/432 kB
2026-11-17T17:28:22.4277439Z Progress (3): 1.0/1.1 MB | 1.3/2.6 MB | 241/432 kB
2026-11-17T17:28:22.4277740Z Progress (3): 1.0/1.1 MB | 1.3/2.6 MB | 241/432 kB
2026-11-17T17:28:22.4278411Z Progress (3): 1.0/1.1 MB | 1.3/2.6 MB | 241/432 kB
2026-11-17T17:28:22.4278783Z Progress (3): 1.0/1.1 MB | 1.3/2.6 MB | 245/432 kB
2026-11-17T17:28:22.4279138Z Progress (3): 1.0/1.1 MB | 1.3/2.6 MB | 245/432 kB
2026-11-17T17:28:22.4279488Z Progress (3): 1.0/1.1 MB | 1.3/2.6 MB | 249/432 kB
2026-11-17T17:28:22.4279832Z Progress (3): 1.0/1.1 MB | 1.3/2.6 MB | 249/432 kB
2026-11-17T17:28:22.4280203Z Progress (3): 1.0/1.1 MB | 1.3/2.6 MB | 253/432 kB
2026-11-17T17:28:22.4280427Z Progress (3): 1.0/1.1 MB | 1.3/2.6 MB | 253/432 kB
2026-11-17T17:28:22.4281210Z Progress (3): 1.0/1.1 MB | 1.3/2.6 MB | 258/432 kB
2026-11-17T17:28:22.4281493Z Progress (3): 1.0/1.1 MB | 1.3/2.6 MB | 258/432 kB
2026-11-17T17:28:22.4281853Z Progress (3): 1.0/1.1 MB | 1.3/2.6 MB | 262/432 kB
2026-11-17T17:28:22.4282230Z Progress (3): 1.0/1.1 MB | 1.3/2.6 MB | 262/432 kB
2026-11-17T17:28:22.4282753Z Progress (3): 1.0/1.1 MB | 1.3/2.6 MB | 266/432 kB
2026-11-17T17:28:22.4283156Z Progress (3): 1.0/1.1 MB | 1.4/2.6 MB | 266/432 kB
2026-11-17T17:28:22.4283440Z Progress (3): 1.0/1.1 MB | 1.4/2.6 MB | 270/432 kB
2026-11-17T17:28:22.4283982Z Progress (3): 1.0/1.1 MB | 1.4/2.6 MB | 270/432 kB
2026-11-17T17:28:22.4284468Z Progress (3): 1.0/1.1 MB | 1.4/2.6 MB | 274/432 kB
2026-11-17T17:28:22.4284921Z Progress (3): 1.0/1.1 MB | 1.4/2.6 MB | 274/432 kB
2026-11-17T17:28:22.4285388Z Progress (3): 1.0/1.1 MB | 1.4/2.6 MB | 278/432 kB
2026-11-17T17:28:22.4285694Z Progress (3): 1.0/1.1 MB | 1.4/2.6 MB | 278/432 kB
2026-11-17T17:28:22.4286050Z Progress (3): 1.0/1.1 MB | 1.4/2.6 MB | 278/432 kB
2026-11-17T17:28:22.4286748Z Progress (3): 1.0/1.1 MB | 1.4/2.6 MB | 282/432 kB
2026-11-17T17:28:22.4287063Z Progress (3): 1.0/1.1 MB | 1.4/2.6 MB | 282/432 kB
2026-11-17T17:28:22.4287399Z Progress (3): 1.0/1.1 MB | 1.4/2.6 MB | 282/432 kB
2026-11-17T17:28:22.4287778Z Progress (3): 1.0/1.1 MB | 1.4/2.6 MB | 286/432 kB
2026-11-17T17:28:22.4288215Z Progress (3): 1.0/1.1 MB | 1.4/2.6 MB | 286/432 kB
2026-11-17T17:28:22.4288533Z Progress (3): 1.0/1.1 MB | 1.4/2.6 MB | 290/432 kB
2026-11-17T17:28:22.4288993Z Progress (3): 1.0/1.1 MB | 1.4/2.6 MB | 290/432 kB
2026-11-17T17:28:22.4289297Z Progress (3): 1.0/1.1 MB | 1.4/2.6 MB | 294/432 kB
2026-11-17T17:28:22.4289604Z Progress (3): 1.0/1.1 MB | 1.4/2.6 MB | 294/432 kB
2026-11-17T17:28:22.4290076Z Progress (3): 1.0/1.1 MB | 1.4/2.6 MB | 299/432 kB
2026-11-17T17:28:22.4290352Z Progress (3): 1.0/1.1 MB | 1.4/2.6 MB | 299/432 kB
2026-11-17T17:28:22.4290874Z Progress (3): 1.0/1.1 MB | 1.4/2.6 MB | 303/432 kB
2026-11-17T17:28:22.4291105Z Progress (3): 1.0/1.1 MB | 1.4/2.6 MB | 303/432 kB
2026-11-17T17:28:22.4291898Z Progress (3): 1.0/1.1 MB | 1.4/2.6 MB | 307/432 kB
2026-11-17T17:28:22.4292151Z Progress (3): 1.0/1.1 MB | 1.4/2.6 MB | 307/432 kB
2026-11-17T17:28:22.4292506Z Progress (3): 1.0/1.1 MB | 1.4/2.6 MB | 311/432 kB
2026-11-17T17:28:22.4292857Z Progress (3): 1.1/1.1 MB | 1.4/2.6 MB | 311/432 kB
2026-11-17T17:28:22.4293332Z Progress (3): 1.1/1.1 MB | 1.4/2.6 MB | 315/432 kB
2026-11-17T17:28:22.4293701Z Progress (3): 1.1/1.1 MB | 1.5/2.6 MB | 315/432 kB
2026-11-17T17:28:22.4293993Z Progress (3): 1.1/1.1 MB | 1.5/2.6 MB | 319/432 kB
2026-11-17T17:28:22.4294396Z Progress (3): 1.1/1.1 MB | 1.5/2.6 MB | 319/432 kB
2026-11-17T17:28:22.4294830Z Progress (3): 1.1/1.1 MB | 1.5/2.6 MB | 323/432 kB
2026-11-17T17:28:22.4295191Z Progress (3): 1.1/1.1 MB | 1.5/2.6 MB | 323/432 kB
2026-11-17T17:28:22.4295946Z Progress (3): 1.1/1.1 MB | 1.5/2.6 MB | 327/432 kB
2026-11-17T17:28:22.4296163Z Progress (3): 1.1 MB | 1.5/2.6 MB | 327/432 kB    
2026-11-17T17:28:22.4296557Z Progress (3): 1.1 MB | 1.5/2.6 MB | 331/432 kB
2026-11-17T17:28:22.4296955Z Progress (3): 1.1 MB | 1.5/2.6 MB | 331/432 kB
2026-11-17T17:28:22.4297605Z Progress (3): 1.1 MB | 1.5/2.6 MB | 335/432 kB
2026-11-17T17:28:22.4297924Z Progress (3): 1.1 MB | 1.5/2.6 MB | 340/432 kB
2026-11-17T17:28:22.4298398Z Progress (3): 1.1 MB | 1.5/2.6 MB | 340/432 kB
2026-11-17T17:28:22.4299119Z Progress (3): 1.1 MB | 1.5/2.6 MB | 344/432 kB
2026-11-17T17:28:22.4299416Z Progress (3): 1.1 MB | 1.5/2.6 MB | 348/432 kB
2026-11-17T17:28:22.4299904Z Progress (3): 1.1 MB | 1.5/2.6 MB | 348/432 kB
2026-11-17T17:28:22.4300536Z Progress (3): 1.1 MB | 1.5/2.6 MB | 352/432 kB
2026-11-17T17:28:22.4300813Z Progress (3): 1.1 MB | 1.5/2.6 MB | 356/432 kB
2026-11-17T17:28:22.4301261Z Progress (3): 1.1 MB | 1.5/2.6 MB | 356/432 kB
2026-11-17T17:28:22.4302605Z Progress (3): 1.1 MB | 1.5/2.6 MB | 360/432 kB
2026-11-17T17:28:22.4302866Z Progress (4): 1.1 MB | 1.5/2.6 MB | 360/432 kB | 4.1/125 kB
2026-11-17T17:28:22.4303737Z Progress (4): 1.1 MB | 1.6/2.6 MB | 360/432 kB | 4.1/125 kB
2026-11-17T17:28:22.4304785Z Progress (4): 1.1 MB | 1.6/2.6 MB | 364/432 kB | 4.1/125 kB
2026-11-17T17:28:22.4305175Z Progress (4): 1.1 MB | 1.6/2.6 MB | 364/432 kB | 8.2/125 kB
2026-11-17T17:28:22.4305986Z Progress (4): 1.1 MB | 1.6/2.6 MB | 368/432 kB | 8.2/125 kB
2026-11-17T17:28:22.4306310Z Progress (4): 1.1 MB | 1.6/2.6 MB | 368/432 kB | 12/125 kB 
2026-11-17T17:28:22.4306805Z Progress (4): 1.1 MB | 1.6/2.6 MB | 368/432 kB | 12/125 kB
2026-11-17T17:28:22.4307230Z Progress (4): 1.1 MB | 1.6/2.6 MB | 368/432 kB | 16/125 kB
2026-11-17T17:28:22.4307627Z Progress (4): 1.1 MB | 1.6/2.6 MB | 372/432 kB | 16/125 kB
2026-11-17T17:28:22.4307879Z Progress (4): 1.1 MB | 1.6/2.6 MB | 372/432 kB | 20/125 kB
2026-11-17T17:28:22.4308531Z Progress (4): 1.1 MB | 1.6/2.6 MB | 376/432 kB | 20/125 kB
2026-11-17T17:28:22.4308925Z Progress (4): 1.1 MB | 1.6/2.6 MB | 376/432 kB | 20/125 kB
2026-11-17T17:28:22.4309493Z Progress (4): 1.1 MB | 1.6/2.6 MB | 380/432 kB | 20/125 kB
2026-11-17T17:28:22.4309737Z Progress (4): 1.1 MB | 1.6/2.6 MB | 380/432 kB | 25/125 kB
2026-11-17T17:28:22.4310266Z Progress (4): 1.1 MB | 1.6/2.6 MB | 385/432 kB | 25/125 kB
2026-11-17T17:28:22.4310647Z Progress (4): 1.1 MB | 1.6/2.6 MB | 385/432 kB | 29/125 kB
2026-11-17T17:28:22.4311233Z Progress (4): 1.1 MB | 1.6/2.6 MB | 389/432 kB | 29/125 kB
2026-11-17T17:28:22.4314131Z Progress (4): 1.1 MB | 1.6/2.6 MB | 389/432 kB | 29/125 kB
2026-11-17T17:28:22.4314305Z Progress (4): 1.1 MB | 1.6/2.6 MB | 393/432 kB | 29/125 kB
2026-11-17T17:28:22.4314478Z Progress (4): 1.1 MB | 1.6/2.6 MB | 393/432 kB | 33/125 kB
2026-11-17T17:28:22.4314828Z Progress (4): 1.1 MB | 1.6/2.6 MB | 397/432 kB | 33/125 kB
2026-11-17T17:28:22.4315090Z Progress (4): 1.1 MB | 1.6/2.6 MB | 397/432 kB | 33/125 kB
2026-11-17T17:28:22.4315304Z Progress (5): 1.1 MB | 1.6/2.6 MB | 397/432 kB | 33/125 kB | 4.1/232 kB
2026-11-17T17:28:22.4315488Z Progress (5): 1.1 MB | 1.6/2.6 MB | 401/432 kB | 33/125 kB | 4.1/232 kB
2026-11-17T17:28:22.4315830Z Progress (5): 1.1 MB | 1.6/2.6 MB | 401/432 kB | 33/125 kB | 7.7/232 kB
2026-11-17T17:28:22.4316276Z Progress (5): 1.1 MB | 1.6/2.6 MB | 401/432 kB | 37/125 kB | 7.7/232 kB
2026-11-17T17:28:22.4316527Z Progress (5): 1.1 MB | 1.6/2.6 MB | 405/432 kB | 37/125 kB | 7.7/232 kB
2026-11-17T17:28:22.4316923Z Progress (5): 1.1 MB | 1.6/2.6 MB | 405/432 kB | 37/125 kB | 7.7/232 kB
2026-11-17T17:28:22.4317542Z Progress (5): 1.1 MB | 1.6/2.6 MB | 409/432 kB | 37/125 kB | 7.7/232 kB
2026-11-17T17:28:22.4317961Z Progress (5): 1.1 MB | 1.6/2.6 MB | 409/432 kB | 41/125 kB | 7.7/232 kB
2026-11-17T17:28:22.4318653Z Progress (5): 1.1 MB | 1.7/2.6 MB | 409/432 kB | 41/125 kB | 7.7/232 kB
2026-11-17T17:28:22.4319100Z Progress (5): 1.1 MB | 1.7/2.6 MB | 409/432 kB | 41/125 kB | 12/232 kB 
2026-11-17T17:28:22.4319505Z Progress (5): 1.1 MB | 1.7/2.6 MB | 409/432 kB | 45/125 kB | 12/232 kB
2026-11-17T17:28:22.4321366Z Progress (5): 1.1 MB | 1.7/2.6 MB | 413/432 kB | 45/125 kB | 12/232 kB
2026-11-17T17:28:22.4321600Z Progress (5): 1.1 MB | 1.7/2.6 MB | 413/432 kB | 49/125 kB | 12/232 kB
2026-11-17T17:28:22.4321930Z Progress (5): 1.1 MB | 1.7/2.6 MB | 413/432 kB | 49/125 kB | 12/232 kB
2026-11-17T17:28:22.4322110Z Progress (5): 1.1 MB | 1.7/2.6 MB | 413/432 kB | 49/125 kB | 16/232 kB
2026-11-17T17:28:22.4322369Z Progress (5): 1.1 MB | 1.7/2.6 MB | 413/432 kB | 53/125 kB | 16/232 kB
2026-11-17T17:28:22.4322843Z Progress (5): 1.1 MB | 1.7/2.6 MB | 413/432 kB | 53/125 kB | 20/232 kB
2026-11-17T17:28:22.4323245Z Progress (5): 1.1 MB | 1.7/2.6 MB | 417/432 kB | 53/125 kB | 20/232 kB
2026-11-17T17:28:22.4323839Z Progress (5): 1.1 MB | 1.7/2.6 MB | 417/432 kB | 53/125 kB | 24/232 kB
2026-11-17T17:28:22.4324417Z Progress (5): 1.1 MB | 1.7/2.6 MB | 417/432 kB | 57/125 kB | 24/232 kB
2026-11-17T17:28:22.4324955Z Progress (5): 1.1 MB | 1.7/2.6 MB | 417/432 kB | 57/125 kB | 24/232 kB
2026-11-17T17:28:22.4325914Z Progress (5): 1.1 MB | 1.7/2.6 MB | 417/432 kB | 61/125 kB | 24/232 kB
2026-11-17T17:28:22.4326147Z Progress (5): 1.1 MB | 1.7/2.6 MB | 417/432 kB | 61/125 kB | 28/232 kB
2026-11-17T17:28:22.4326494Z Progress (5): 1.1 MB | 1.7/2.6 MB | 417/432 kB | 61/125 kB | 28/232 kB
2026-11-17T17:28:22.4327127Z Progress (5): 1.1 MB | 1.7/2.6 MB | 421/432 kB | 61/125 kB | 28/232 kB
2026-11-17T17:28:22.4327734Z Progress (5): 1.1 MB | 1.7/2.6 MB | 421/432 kB | 61/125 kB | 32/232 kB
2026-11-17T17:28:22.4328342Z Progress (5): 1.1 MB | 1.7/2.6 MB | 421/432 kB | 66/125 kB | 32/232 kB
2026-11-17T17:28:22.4328836Z Progress (5): 1.1 MB | 1.7/2.6 MB | 421/432 kB | 66/125 kB | 36/232 kB
2026-11-17T17:28:22.4329295Z Progress (5): 1.1 MB | 1.7/2.6 MB | 421/432 kB | 66/125 kB | 36/232 kB
2026-11-17T17:28:22.4329746Z Progress (5): 1.1 MB | 1.7/2.6 MB | 426/432 kB | 66/125 kB | 36/232 kB
2026-11-17T17:28:22.4330244Z Progress (5): 1.1 MB | 1.7/2.6 MB | 426/432 kB | 66/125 kB | 40/232 kB
2026-11-17T17:28:22.4330661Z Progress (5): 1.1 MB | 1.7/2.6 MB | 426/432 kB | 70/125 kB | 40/232 kB
2026-11-17T17:28:22.4331214Z Progress (5): 1.1 MB | 1.7/2.6 MB | 426/432 kB | 70/125 kB | 45/232 kB
2026-11-17T17:28:22.4331632Z Progress (5): 1.1 MB | 1.7/2.6 MB | 426/432 kB | 70/125 kB | 45/232 kB
2026-11-17T17:28:22.4332174Z Progress (5): 1.1 MB | 1.7/2.6 MB | 430/432 kB | 70/125 kB | 45/232 kB
2026-11-17T17:28:22.4332712Z Progress (5): 1.1 MB | 1.7/2.6 MB | 430/432 kB | 70/125 kB | 49/232 kB
2026-11-17T17:28:22.4333452Z Progress (5): 1.1 MB | 1.7/2.6 MB | 430/432 kB | 74/125 kB | 49/232 kB
2026-11-17T17:28:22.4333916Z Progress (5): 1.1 MB | 1.7/2.6 MB | 430/432 kB | 74/125 kB | 49/232 kB
2026-11-17T17:28:22.4334370Z Progress (5): 1.1 MB | 1.7/2.6 MB | 430/432 kB | 74/125 kB | 53/232 kB
2026-11-17T17:28:22.4334959Z Progress (5): 1.1 MB | 1.7/2.6 MB | 432 kB | 74/125 kB | 53/232 kB    
2026-11-17T17:28:22.4336201Z Progress (5): 1.1 MB | 1.7/2.6 MB | 432 kB | 74/125 kB | 57/232 kB
2026-11-17T17:28:22.4336418Z Progress (5): 1.1 MB | 1.7/2.6 MB | 432 kB | 78/125 kB | 57/232 kB
2026-11-17T17:28:22.4336714Z Progress (5): 1.1 MB | 1.7/2.6 MB | 432 kB | 78/125 kB | 61/232 kB
2026-11-17T17:28:22.4337188Z Progress (5): 1.1 MB | 1.8/2.6 MB | 432 kB | 78/125 kB | 61/232 kB
2026-11-17T17:28:22.4337787Z Progress (5): 1.1 MB | 1.8/2.6 MB | 432 kB | 78/125 kB | 65/232 kB
2026-11-17T17:28:22.4338215Z Progress (5): 1.1 MB | 1.8/2.6 MB | 432 kB | 82/125 kB | 65/232 kB
2026-11-17T17:28:22.4339142Z Progress (5): 1.1 MB | 1.8/2.6 MB | 432 kB | 82/125 kB | 65/232 kB
2026-11-17T17:28:22.4339581Z Progress (5): 1.1 MB | 1.8/2.6 MB | 432 kB | 86/125 kB | 65/232 kB
2026-11-17T17:28:22.4340108Z Progress (5): 1.1 MB | 1.8/2.6 MB | 432 kB | 86/125 kB | 69/232 kB
2026-11-17T17:28:22.4340581Z Progress (5): 1.1 MB | 1.8/2.6 MB | 432 kB | 90/125 kB | 69/232 kB
2026-11-17T17:28:22.4341252Z Progress (5): 1.1 MB | 1.8/2.6 MB | 432 kB | 90/125 kB | 69/232 kB
2026-11-17T17:28:22.4341694Z Progress (5): 1.1 MB | 1.8/2.6 MB | 432 kB | 94/125 kB | 69/232 kB
2026-11-17T17:28:22.4342142Z Progress (5): 1.1 MB | 1.8/2.6 MB | 432 kB | 94/125 kB | 73/232 kB
2026-11-17T17:28:22.4342677Z Progress (5): 1.1 MB | 1.8/2.6 MB | 432 kB | 94/125 kB | 73/232 kB
2026-11-17T17:28:22.4343096Z Progress (5): 1.1 MB | 1.8/2.6 MB | 432 kB | 98/125 kB | 73/232 kB
2026-11-17T17:28:22.4343703Z Progress (5): 1.1 MB | 1.8/2.6 MB | 432 kB | 98/125 kB | 77/232 kB
2026-11-17T17:28:22.4344244Z Progress (5): 1.1 MB | 1.8/2.6 MB | 432 kB | 102/125 kB | 77/232 kB
2026-11-17T17:28:22.4344868Z Progress (5): 1.1 MB | 1.8/2.6 MB | 432 kB | 102/125 kB | 81/232 kB
2026-11-17T17:28:22.4345271Z Progress (5): 1.1 MB | 1.8/2.6 MB | 432 kB | 102/125 kB | 81/232 kB
2026-11-17T17:28:22.4345728Z Progress (5): 1.1 MB | 1.8/2.6 MB | 432 kB | 102/125 kB | 86/232 kB
2026-11-17T17:28:22.4346309Z Progress (5): 1.1 MB | 1.8/2.6 MB | 432 kB | 106/125 kB | 86/232 kB
2026-11-17T17:28:22.4346710Z Progress (5): 1.1 MB | 1.8/2.6 MB | 432 kB | 106/125 kB | 90/232 kB
2026-11-17T17:28:22.4347303Z Progress (5): 1.1 MB | 1.8/2.6 MB | 432 kB | 111/125 kB | 90/232 kB
2026-11-17T17:28:22.4347669Z Progress (5): 1.1 MB | 1.8/2.6 MB | 432 kB | 111/125 kB | 90/232 kB
2026-11-17T17:28:22.4348169Z Progress (5): 1.1 MB | 1.8/2.6 MB | 432 kB | 115/125 kB | 90/232 kB
2026-11-17T17:28:22.4348676Z Progress (5): 1.1 MB | 1.8/2.6 MB | 432 kB | 115/125 kB | 94/232 kB
2026-11-17T17:28:22.4349106Z Progress (5): 1.1 MB | 1.8/2.6 MB | 432 kB | 119/125 kB | 94/232 kB
2026-11-17T17:28:22.4349689Z Progress (5): 1.1 MB | 1.8/2.6 MB | 432 kB | 119/125 kB | 98/232 kB
2026-11-17T17:28:22.4350063Z Progress (5): 1.1 MB | 1.9/2.6 MB | 432 kB | 119/125 kB | 98/232 kB
2026-11-17T17:28:22.4350652Z Progress (5): 1.1 MB | 1.9/2.6 MB | 432 kB | 119/125 kB | 102/232 kB
2026-11-17T17:28:22.4351133Z Progress (5): 1.1 MB | 1.9/2.6 MB | 432 kB | 123/125 kB | 102/232 kB
2026-11-17T17:28:22.4351504Z Progress (5): 1.1 MB | 1.9/2.6 MB | 432 kB | 123/125 kB | 106/232 kB
2026-11-17T17:28:22.4352039Z Progress (5): 1.1 MB | 1.9/2.6 MB | 432 kB | 125 kB | 106/232 kB    
2026-11-17T17:28:22.4352516Z Progress (5): 1.1 MB | 1.9/2.6 MB | 432 kB | 125 kB | 106/232 kB
2026-11-17T17:28:22.4353300Z Progress (5): 1.1 MB | 1.9/2.6 MB | 432 kB | 125 kB | 110/232 kB
2026-11-17T17:28:22.4353607Z Progress (5): 1.1 MB | 1.9/2.6 MB | 432 kB | 125 kB | 114/232 kB
2026-11-17T17:28:22.4354143Z Progress (5): 1.1 MB | 1.9/2.6 MB | 432 kB | 125 kB | 114/232 kB
2026-11-17T17:28:22.4355070Z Progress (5): 1.1 MB | 1.9/2.6 MB | 432 kB | 125 kB | 118/232 kB
2026-11-17T17:28:22.4355491Z Progress (5): 1.1 MB | 1.9/2.6 MB | 432 kB | 125 kB | 122/232 kB
2026-11-17T17:28:22.4356066Z Progress (5): 1.1 MB | 1.9/2.6 MB | 432 kB | 125 kB | 122/232 kB
2026-11-17T17:28:22.4356855Z Progress (5): 1.1 MB | 1.9/2.6 MB | 432 kB | 125 kB | 127/232 kB
2026-11-17T17:28:22.4357190Z Progress (5): 1.1 MB | 1.9/2.6 MB | 432 kB | 125 kB | 131/232 kB
2026-11-17T17:28:22.4357695Z Progress (5): 1.1 MB | 1.9/2.6 MB | 432 kB | 125 kB | 131/232 kB
2026-11-17T17:28:22.4359049Z Progress (5): 1.1 MB | 1.9/2.6 MB | 432 kB | 125 kB | 135/232 kB
2026-11-17T17:28:22.4359258Z Progress (5): 1.1 MB | 1.9/2.6 MB | 432 kB | 125 kB | 139/232 kB
2026-11-17T17:28:22.4359826Z Progress (5): 1.1 MB | 1.9/2.6 MB | 432 kB | 125 kB | 139/232 kB
2026-11-17T17:28:22.4360680Z Progress (5): 1.1 MB | 1.9/2.6 MB | 432 kB | 125 kB | 143/232 kB
2026-11-17T17:28:22.4361175Z Progress (5): 1.1 MB | 1.9/2.6 MB | 432 kB | 125 kB | 147/232 kB
2026-11-17T17:28:22.4361649Z Progress (5): 1.1 MB | 2.0/2.6 MB | 432 kB | 125 kB | 147/232 kB
2026-11-17T17:28:22.4362397Z Progress (5): 1.1 MB | 2.0/2.6 MB | 432 kB | 125 kB | 151/232 kB
2026-11-17T17:28:22.4362742Z Progress (5): 1.1 MB | 2.0/2.6 MB | 432 kB | 125 kB | 155/232 kB
2026-11-17T17:28:22.4364355Z Progress (5): 1.1 MB | 2.0/2.6 MB | 432 kB | 125 kB | 155/232 kB
2026-11-17T17:28:22.4364619Z Progress (5): 1.1 MB | 2.0/2.6 MB | 432 kB | 125 kB | 159/232 kB
2026-11-17T17:28:22.4364826Z Progress (5): 1.1 MB | 2.0/2.6 MB | 432 kB | 125 kB | 163/232 kB
2026-11-17T17:28:22.4366793Z Progress (5): 1.1 MB | 2.0/2.6 MB | 432 kB | 125 kB | 163/232 kB
2026-11-17T17:28:22.4366964Z Progress (5): 1.1 MB | 2.0/2.6 MB | 432 kB | 125 kB | 167/232 kB
2026-11-17T17:28:22.4367128Z Progress (5): 1.1 MB | 2.0/2.6 MB | 432 kB | 125 kB | 167/232 kB
2026-11-17T17:28:22.4367455Z Progress (5): 1.1 MB | 2.0/2.6 MB | 432 kB | 125 kB | 172/232 kB
2026-11-17T17:28:22.4368012Z Progress (5): 1.1 MB | 2.0/2.6 MB | 432 kB | 125 kB | 176/232 kB
2026-11-17T17:28:22.4368326Z Progress (5): 1.1 MB | 2.0/2.6 MB | 432 kB | 125 kB | 176/232 kB
2026-11-17T17:28:22.4369105Z Progress (5): 1.1 MB | 2.0/2.6 MB | 432 kB | 125 kB | 180/232 kB
2026-11-17T17:28:22.4369834Z Progress (5): 1.1 MB | 2.0/2.6 MB | 432 kB | 125 kB | 184/232 kB
2026-11-17T17:28:22.4370064Z Progress (5): 1.1 MB | 2.0/2.6 MB | 432 kB | 125 kB | 184/232 kB
2026-11-17T17:28:22.4370605Z Progress (5): 1.1 MB | 2.0/2.6 MB | 432 kB | 125 kB | 188/232 kB
2026-11-17T17:28:22.4370916Z Progress (5): 1.1 MB | 2.0/2.6 MB | 432 kB | 125 kB | 192/232 kB
2026-11-17T17:28:22.4371439Z Progress (5): 1.1 MB | 2.1/2.6 MB | 432 kB | 125 kB | 192/232 kB
2026-11-17T17:28:22.4372235Z Progress (5): 1.1 MB | 2.1/2.6 MB | 432 kB | 125 kB | 196/232 kB
2026-11-17T17:28:22.4372620Z Progress (5): 1.1 MB | 2.1/2.6 MB | 432 kB | 125 kB | 200/232 kB
2026-11-17T17:28:22.4373089Z Progress (5): 1.1 MB | 2.1/2.6 MB | 432 kB | 125 kB | 200/232 kB
2026-11-17T17:28:22.4373900Z Progress (5): 1.1 MB | 2.1/2.6 MB | 432 kB | 125 kB | 204/232 kB
2026-11-17T17:28:22.4374163Z Progress (5): 1.1 MB | 2.1/2.6 MB | 432 kB | 125 kB | 208/232 kB
2026-11-17T17:28:22.4374776Z Progress (5): 1.1 MB | 2.1/2.6 MB | 432 kB | 125 kB | 208/232 kB
2026-11-17T17:28:22.4375584Z Progress (5): 1.1 MB | 2.1/2.6 MB | 432 kB | 125 kB | 213/232 kB
2026-11-17T17:28:22.4376248Z Progress (5): 1.1 MB | 2.1/2.6 MB | 432 kB | 125 kB | 217/232 kB
2026-11-17T17:28:22.4376731Z Progress (5): 1.1 MB | 2.1/2.6 MB | 432 kB | 125 kB | 217/232 kB
2026-11-17T17:28:22.4377397Z Progress (5): 1.1 MB | 2.1/2.6 MB | 432 kB | 125 kB | 221/232 kB
2026-11-17T17:28:22.4377941Z Progress (5): 1.1 MB | 2.1/2.6 MB | 432 kB | 125 kB | 225/232 kB
2026-11-17T17:28:22.4378371Z Progress (5): 1.1 MB | 2.1/2.6 MB | 432 kB | 125 kB | 225/232 kB
2026-11-17T17:28:22.4379153Z Progress (5): 1.1 MB | 2.1/2.6 MB | 432 kB | 125 kB | 229/232 kB
2026-11-17T17:28:22.4379605Z Progress (5): 1.1 MB | 2.1/2.6 MB | 432 kB | 125 kB | 232 kB    
2026-11-17T17:28:22.4381091Z Progress (5): 1.1 MB | 2.1/2.6 MB | 432 kB | 125 kB | 232 kB
2026-11-17T17:28:22.4382385Z Progress (5): 1.1 MB | 2.2/2.6 MB | 432 kB | 125 kB | 232 kB
2026-11-17T17:28:22.4383692Z Progress (5): 1.1 MB | 2.2/2.6 MB | 432 kB | 125 kB | 232 kB
2026-11-17T17:28:22.4385258Z Progress (5): 1.1 MB | 2.2/2.6 MB | 432 kB | 125 kB | 232 kB
2026-11-17T17:28:22.4387053Z Progress (5): 1.1 MB | 2.2/2.6 MB | 432 kB | 125 kB | 232 kB
2026-11-17T17:28:22.4388021Z Progress (5): 1.1 MB | 2.2/2.6 MB | 432 kB | 125 kB | 232 kB
2026-11-17T17:28:22.4389975Z Progress (5): 1.1 MB | 2.2/2.6 MB | 432 kB | 125 kB | 232 kB
2026-11-17T17:28:22.4391827Z Progress (5): 1.1 MB | 2.3/2.6 MB | 432 kB | 125 kB | 232 kB
2026-11-17T17:28:22.4393321Z Progress (5): 1.1 MB | 2.3/2.6 MB | 432 kB | 125 kB | 232 kB
2026-11-17T17:28:22.4395081Z Progress (5): 1.1 MB | 2.3/2.6 MB | 432 kB | 125 kB | 232 kB
2026-11-17T17:28:22.4396453Z Progress (5): 1.1 MB | 2.3/2.6 MB | 432 kB | 125 kB | 232 kB
2026-11-17T17:28:22.4397785Z Progress (5): 1.1 MB | 2.3/2.6 MB | 432 kB | 125 kB | 232 kB
2026-11-17T17:28:22.4399026Z Progress (5): 1.1 MB | 2.3/2.6 MB | 432 kB | 125 kB | 232 kB
2026-11-17T17:28:22.4400173Z Progress (5): 1.1 MB | 2.4/2.6 MB | 432 kB | 125 kB | 232 kB
2026-11-17T17:28:22.4401473Z Progress (5): 1.1 MB | 2.4/2.6 MB | 432 kB | 125 kB | 232 kB
2026-11-17T17:28:22.4402733Z Progress (5): 1.1 MB | 2.4/2.6 MB | 432 kB | 125 kB | 232 kB
2026-11-17T17:28:22.4404130Z Progress (5): 1.1 MB | 2.4/2.6 MB | 432 kB | 125 kB | 232 kB
2026-11-17T17:28:22.4406303Z Progress (5): 1.1 MB | 2.4/2.6 MB | 432 kB | 125 kB | 232 kB
2026-11-17T17:28:22.4407184Z Progress (5): 1.1 MB | 2.4/2.6 MB | 432 kB | 125 kB | 232 kB
2026-11-17T17:28:22.4408720Z Progress (5): 1.1 MB | 2.5/2.6 MB | 432 kB | 125 kB | 232 kB
2026-11-17T17:28:22.4409990Z Progress (5): 1.1 MB | 2.5/2.6 MB | 432 kB | 125 kB | 232 kB
2026-11-17T17:28:22.4411345Z Progress (5): 1.1 MB | 2.5/2.6 MB | 432 kB | 125 kB | 232 kB
2026-11-17T17:28:22.4412761Z Progress (5): 1.1 MB | 2.5/2.6 MB | 432 kB | 125 kB | 232 kB
2026-11-17T17:28:22.4415802Z Progress (5): 1.1 MB | 2.5/2.6 MB | 432 kB | 125 kB | 232 kB
2026-11-17T17:28:22.4416046Z Progress (5): 1.1 MB | 2.5/2.6 MB | 432 kB | 125 kB | 232 kB
2026-11-17T17:28:22.4416640Z Progress (5): 1.1 MB | 2.6/2.6 MB | 432 kB | 125 kB | 232 kB
2026-11-17T17:28:22.4418022Z Progress (5): 1.1 MB | 2.6/2.6 MB | 432 kB | 125 kB | 232 kB
2026-11-17T17:28:22.4421652Z Progress (5): 1.1 MB | 2.6/2.6 MB | 432 kB | 125 kB | 232 kB
2026-11-17T17:28:22.4421990Z Progress (5): 1.1 MB | 2.6/2.6 MB | 432 kB | 125 kB | 232 kB
2026-11-17T17:28:22.4422360Z Progress (5): 1.1 MB | 2.6/2.6 MB | 432 kB | 125 kB | 232 kB
2026-11-17T17:28:22.4423116Z Progress (5): 1.1 MB | 2.6/2.6 MB | 432 kB | 125 kB | 232 kB
2026-11-17T17:28:22.4434788Z Progress (5): 1.1 MB | 2.6 MB | 432 kB | 125 kB | 232 kB    
2026-11-17T17:28:22.4435174Z                                                         
2026-11-17T17:28:22.4435957Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jboss/spec/javax/rmi/jboss-rmi-api_1.0_spec/1.0.6.Final/jboss-rmi-api_1.0_spec-1.0.6.Final.jar (1.1 MB at 14 MB/s)
2026-11-17T17:28:22.4436639Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-beanutils/commons-beanutils-bean-collections/1.8.3/commons-beanutils-bean-collections-1.8.3.jar
2026-11-17T17:28:22.4445081Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/xom/xom/1.1/xom-1.1.jar (432 kB at 5.9 MB/s)
2026-11-17T17:28:22.4445469Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/jboss/jboss-j2ee/4.2.2.GA/jboss-j2ee-4.2.2.GA.jar
2026-11-17T17:28:22.4459657Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/xerces/xmlParserAPIs/2.6.2/xmlParserAPIs-2.6.2.jar (125 kB at 1.7 MB/s)
2026-11-17T17:28:22.4460172Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/net/sourceforge/jexcelapi/jxl/2.6.12/jxl-2.6.12.jar
2026-11-17T17:28:22.4469038Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/jaxen/jaxen/1.1-beta-8/jaxen-1.1-beta-8.jar (232 kB at 3.1 MB/s)
2026-11-17T17:28:22.4469436Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/displaytag/displaytag/1.2/displaytag-1.2.jar
2026-11-17T17:28:22.4514637Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/xalan/xalan/2.5.0/xalan-2.5.0.jar (2.6 MB at 33 MB/s)
2026-11-17T17:28:22.4515070Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/slf4j/jcl104-over-slf4j/1.4.2/jcl104-over-slf4j-1.4.2.jar
2026-11-17T17:28:22.4546741Z Progress (1): 3.6/424 kB
2026-11-17T17:28:22.4547628Z Progress (2): 3.6/424 kB | 4.1/27 kB
2026-11-17T17:28:22.4547872Z Progress (2): 7.7/424 kB | 4.1/27 kB
2026-11-17T17:28:22.4548112Z Progress (2): 12/424 kB | 4.1/27 kB 
2026-11-17T17:28:22.4548468Z Progress (2): 12/424 kB | 8.2/27 kB
2026-11-17T17:28:22.4548860Z Progress (2): 16/424 kB | 8.2/27 kB
2026-11-17T17:28:22.4549069Z Progress (2): 16/424 kB | 12/27 kB 
2026-11-17T17:28:22.4549772Z Progress (2): 20/424 kB | 12/27 kB
2026-11-17T17:28:22.4549965Z Progress (2): 20/424 kB | 16/27 kB
2026-11-17T17:28:22.4550224Z Progress (2): 24/424 kB | 16/27 kB
2026-11-17T17:28:22.4550471Z Progress (2): 24/424 kB | 20/27 kB
2026-11-17T17:28:22.4550883Z Progress (2): 28/424 kB | 20/27 kB
2026-11-17T17:28:22.4551340Z Progress (2): 28/424 kB | 25/27 kB
2026-11-17T17:28:22.4551877Z Progress (2): 32/424 kB | 25/27 kB
2026-11-17T17:28:22.4552228Z Progress (3): 32/424 kB | 25/27 kB | 4.1/726 kB
2026-11-17T17:28:22.4552796Z Progress (3): 36/424 kB | 25/27 kB | 4.1/726 kB
2026-11-17T17:28:22.4553175Z Progress (3): 36/424 kB | 27 kB | 4.1/726 kB   
2026-11-17T17:28:22.4553590Z Progress (3): 36/424 kB | 27 kB | 8.2/726 kB
2026-11-17T17:28:22.4553996Z Progress (3): 41/424 kB | 27 kB | 8.2/726 kB
2026-11-17T17:28:22.4554466Z Progress (3): 41/424 kB | 27 kB | 12/726 kB 
2026-11-17T17:28:22.4555079Z Progress (3): 45/424 kB | 27 kB | 12/726 kB
2026-11-17T17:28:22.4555288Z Progress (3): 45/424 kB | 27 kB | 16/726 kB
2026-11-17T17:28:22.4555711Z Progress (3): 49/424 kB | 27 kB | 16/726 kB
2026-11-17T17:28:22.4555961Z Progress (3): 49/424 kB | 27 kB | 20/726 kB
2026-11-17T17:28:22.4556226Z Progress (3): 53/424 kB | 27 kB | 20/726 kB
2026-11-17T17:28:22.4556611Z Progress (3): 53/424 kB | 27 kB | 25/726 kB
2026-11-17T17:28:22.4557147Z Progress (3): 57/424 kB | 27 kB | 25/726 kB
2026-11-17T17:28:22.4557475Z Progress (3): 57/424 kB | 27 kB | 29/726 kB
2026-11-17T17:28:22.4557818Z Progress (3): 61/424 kB | 27 kB | 29/726 kB
2026-11-17T17:28:22.4558032Z Progress (3): 61/424 kB | 27 kB | 33/726 kB
2026-11-17T17:28:22.4558517Z Progress (3): 65/424 kB | 27 kB | 33/726 kB
2026-11-17T17:28:22.4560503Z Progress (3): 65/424 kB | 27 kB | 37/726 kB
2026-11-17T17:28:22.4560664Z Progress (3): 69/424 kB | 27 kB | 37/726 kB
2026-11-17T17:28:22.4560789Z Progress (3): 69/424 kB | 27 kB | 41/726 kB
2026-11-17T17:28:22.4560946Z Progress (3): 73/424 kB | 27 kB | 41/726 kB
2026-11-17T17:28:22.4561096Z Progress (3): 73/424 kB | 27 kB | 45/726 kB
2026-11-17T17:28:22.4561312Z Progress (3): 77/424 kB | 27 kB | 45/726 kB
2026-11-17T17:28:22.4563169Z Progress (3): 77/424 kB | 27 kB | 49/726 kB
2026-11-17T17:28:22.4563463Z Progress (3): 81/424 kB | 27 kB | 49/726 kB
2026-11-17T17:28:22.4563627Z Progress (3): 81/424 kB | 27 kB | 53/726 kB
2026-11-17T17:28:22.4563814Z Progress (3): 86/424 kB | 27 kB | 53/726 kB
2026-11-17T17:28:22.4564017Z Progress (3): 86/424 kB | 27 kB | 57/726 kB
2026-11-17T17:28:22.4564204Z Progress (3): 90/424 kB | 27 kB | 57/726 kB
2026-11-17T17:28:22.4564383Z Progress (3): 90/424 kB | 27 kB | 61/726 kB
2026-11-17T17:28:22.4564711Z Progress (3): 94/424 kB | 27 kB | 61/726 kB
2026-11-17T17:28:22.4564913Z Progress (3): 94/424 kB | 27 kB | 66/726 kB
2026-11-17T17:28:22.4565146Z Progress (3): 98/424 kB | 27 kB | 66/726 kB
2026-11-17T17:28:22.4565359Z Progress (3): 98/424 kB | 27 kB | 70/726 kB
2026-11-17T17:28:22.4565764Z Progress (3): 102/424 kB | 27 kB | 70/726 kB
2026-11-17T17:28:22.4566206Z Progress (3): 102/424 kB | 27 kB | 74/726 kB
2026-11-17T17:28:22.4566708Z Progress (3): 102/424 kB | 27 kB | 78/726 kB
2026-11-17T17:28:22.4567152Z Progress (3): 102/424 kB | 27 kB | 82/726 kB
2026-11-17T17:28:22.4567419Z Progress (3): 106/424 kB | 27 kB | 82/726 kB
2026-11-17T17:28:22.4567968Z Progress (3): 106/424 kB | 27 kB | 86/726 kB
2026-11-17T17:28:22.4568256Z Progress (3): 110/424 kB | 27 kB | 86/726 kB
2026-11-17T17:28:22.4569087Z Progress (3): 110/424 kB | 27 kB | 90/726 kB
2026-11-17T17:28:22.4569449Z Progress (3): 110/424 kB | 27 kB | 94/726 kB
2026-11-17T17:28:22.4569883Z Progress (3): 110/424 kB | 27 kB | 98/726 kB
2026-11-17T17:28:22.4570167Z Progress (3): 114/424 kB | 27 kB | 98/726 kB
2026-11-17T17:28:22.4570633Z Progress (3): 114/424 kB | 27 kB | 102/726 kB
2026-11-17T17:28:22.4571019Z Progress (3): 118/424 kB | 27 kB | 102/726 kB
2026-11-17T17:28:22.4571245Z Progress (3): 118/424 kB | 27 kB | 106/726 kB
2026-11-17T17:28:22.4571463Z Progress (3): 122/424 kB | 27 kB | 106/726 kB
2026-11-17T17:28:22.4572027Z Progress (3): 122/424 kB | 27 kB | 111/726 kB
2026-11-17T17:28:22.4572492Z Progress (3): 127/424 kB | 27 kB | 111/726 kB
2026-11-17T17:28:22.4572968Z Progress (3): 127/424 kB | 27 kB | 115/726 kB
2026-11-17T17:28:22.4573380Z Progress (3): 127/424 kB | 27 kB | 119/726 kB
2026-11-17T17:28:22.4573912Z Progress (3): 127/424 kB | 27 kB | 123/726 kB
2026-11-17T17:28:22.4574404Z Progress (3): 127/424 kB | 27 kB | 127/726 kB
2026-11-17T17:28:22.4574811Z Progress (3): 131/424 kB | 27 kB | 127/726 kB
2026-11-17T17:28:22.4575330Z Progress (3): 131/424 kB | 27 kB | 131/726 kB
2026-11-17T17:28:22.4575697Z Progress (3): 135/424 kB | 27 kB | 131/726 kB
2026-11-17T17:28:22.4576067Z Progress (3): 135/424 kB | 27 kB | 135/726 kB
2026-11-17T17:28:22.4576493Z Progress (3): 139/424 kB | 27 kB | 135/726 kB
2026-11-17T17:28:22.4576811Z Progress (3): 139/424 kB | 27 kB | 139/726 kB
2026-11-17T17:28:22.4577328Z Progress (3): 143/424 kB | 27 kB | 139/726 kB
2026-11-17T17:28:22.4577566Z Progress (3): 143/424 kB | 27 kB | 143/726 kB
2026-11-17T17:28:22.4577986Z Progress (3): 147/424 kB | 27 kB | 143/726 kB
2026-11-17T17:28:22.4578371Z Progress (3): 147/424 kB | 27 kB | 147/726 kB
2026-11-17T17:28:22.4578709Z Progress (3): 151/424 kB | 27 kB | 147/726 kB
2026-11-17T17:28:22.4579156Z Progress (3): 151/424 kB | 27 kB | 152/726 kB
2026-11-17T17:28:22.4579466Z Progress (3): 155/424 kB | 27 kB | 152/726 kB
2026-11-17T17:28:22.4579772Z Progress (3): 155/424 kB | 27 kB | 156/726 kB
2026-11-17T17:28:22.4580165Z Progress (3): 159/424 kB | 27 kB | 156/726 kB
2026-11-17T17:28:22.4580595Z Progress (3): 159/424 kB | 27 kB | 160/726 kB
2026-11-17T17:28:22.4580890Z Progress (3): 163/424 kB | 27 kB | 160/726 kB
2026-11-17T17:28:22.4581315Z Progress (3): 163/424 kB | 27 kB | 164/726 kB
2026-11-17T17:28:22.4581624Z Progress (3): 167/424 kB | 27 kB | 164/726 kB
2026-11-17T17:28:22.4582058Z Progress (3): 167/424 kB | 27 kB | 168/726 kB
2026-11-17T17:28:22.4582884Z Progress (3): 172/424 kB | 27 kB | 168/726 kB
2026-11-17T17:28:22.4583229Z Progress (4): 172/424 kB | 27 kB | 168/726 kB | 2.3/219 kB
2026-11-17T17:28:22.4583737Z Progress (4): 176/424 kB | 27 kB | 168/726 kB | 2.3/219 kB
2026-11-17T17:28:22.4584067Z Progress (4): 176/424 kB | 27 kB | 172/726 kB | 2.3/219 kB
2026-11-17T17:28:22.4584427Z Progress (4): 180/424 kB | 27 kB | 172/726 kB | 2.3/219 kB
2026-11-17T17:28:22.4585021Z Progress (4): 180/424 kB | 27 kB | 176/726 kB | 2.3/219 kB
2026-11-17T17:28:22.4585540Z Progress (4): 180/424 kB | 27 kB | 176/726 kB | 6.4/219 kB
2026-11-17T17:28:22.4585897Z Progress (4): 180/424 kB | 27 kB | 180/726 kB | 6.4/219 kB
2026-11-17T17:28:22.4587667Z Progress (4): 180/424 kB | 27 kB | 180/726 kB | 10/219 kB 
2026-11-17T17:28:22.4587948Z Progress (4): 184/424 kB | 27 kB | 180/726 kB | 10/219 kB
2026-11-17T17:28:22.4588323Z Progress (4): 184/424 kB | 27 kB | 180/726 kB | 15/219 kB
2026-11-17T17:28:22.4588882Z Progress (4): 184/424 kB | 27 kB | 184/726 kB | 15/219 kB
2026-11-17T17:28:22.4589318Z Progress (4): 184/424 kB | 27 kB | 184/726 kB | 19/219 kB
2026-11-17T17:28:22.4589643Z Progress (4): 188/424 kB | 27 kB | 184/726 kB | 19/219 kB
2026-11-17T17:28:22.4590119Z Progress (4): 188/424 kB | 27 kB | 184/726 kB | 23/219 kB
2026-11-17T17:28:22.4590542Z Progress (4): 188/424 kB | 27 kB | 188/726 kB | 23/219 kB
2026-11-17T17:28:22.4590841Z Progress (4): 188/424 kB | 27 kB | 188/726 kB | 27/219 kB
2026-11-17T17:28:22.4591310Z Progress (4): 188/424 kB | 27 kB | 193/726 kB | 27/219 kB
2026-11-17T17:28:22.4591755Z Progress (4): 192/424 kB | 27 kB | 193/726 kB | 27/219 kB
2026-11-17T17:28:22.4592214Z Progress (4): 192/424 kB | 27 kB | 197/726 kB | 27/219 kB
2026-11-17T17:28:22.4592532Z Progress (4): 192/424 kB | 27 kB | 197/726 kB | 31/219 kB
2026-11-17T17:28:22.4593008Z Progress (4): 192/424 kB | 27 kB | 201/726 kB | 31/219 kB
2026-11-17T17:28:22.4593415Z Progress (4): 196/424 kB | 27 kB | 201/726 kB | 31/219 kB
2026-11-17T17:28:22.4594017Z Progress (4): 196/424 kB | 27 kB | 205/726 kB | 31/219 kB
2026-11-17T17:28:22.4594396Z Progress (4): 196/424 kB | 27 kB | 205/726 kB | 35/219 kB
2026-11-17T17:28:22.4595007Z Progress (4): 196/424 kB | 27 kB | 209/726 kB | 35/219 kB
2026-11-17T17:28:22.4595465Z Progress (4): 200/424 kB | 27 kB | 209/726 kB | 35/219 kB
2026-11-17T17:28:22.4595792Z Progress (4): 200/424 kB | 27 kB | 213/726 kB | 35/219 kB
2026-11-17T17:28:22.4596186Z Progress (4): 200/424 kB | 27 kB | 213/726 kB | 39/219 kB
2026-11-17T17:28:22.4596632Z Progress (4): 200/424 kB | 27 kB | 217/726 kB | 39/219 kB
2026-11-17T17:28:22.4597042Z Progress (4): 204/424 kB | 27 kB | 217/726 kB | 39/219 kB
2026-11-17T17:28:22.4597636Z Progress (4): 204/424 kB | 27 kB | 221/726 kB | 39/219 kB
2026-11-17T17:28:22.4598018Z Progress (4): 204/424 kB | 27 kB | 221/726 kB | 43/219 kB
2026-11-17T17:28:22.4598452Z Progress (4): 204/424 kB | 27 kB | 225/726 kB | 43/219 kB
2026-11-17T17:28:22.4598770Z Progress (4): 208/424 kB | 27 kB | 225/726 kB | 43/219 kB
2026-11-17T17:28:22.4599231Z Progress (4): 208/424 kB | 27 kB | 229/726 kB | 43/219 kB
2026-11-17T17:28:22.4599491Z Progress (4): 213/424 kB | 27 kB | 229/726 kB | 43/219 kB
2026-11-17T17:28:22.4599923Z Progress (4): 213/424 kB | 27 kB | 233/726 kB | 43/219 kB
2026-11-17T17:28:22.4600582Z Progress (4): 217/424 kB | 27 kB | 233/726 kB | 43/219 kB
2026-11-17T17:28:22.4600941Z Progress (4): 217/424 kB | 27 kB | 233/726 kB | 47/219 kB
2026-11-17T17:28:22.4601310Z Progress (4): 221/424 kB | 27 kB | 233/726 kB | 47/219 kB
2026-11-17T17:28:22.4601619Z Progress (4): 221/424 kB | 27 kB | 233/726 kB | 51/219 kB
2026-11-17T17:28:22.4602042Z Progress (4): 225/424 kB | 27 kB | 233/726 kB | 51/219 kB
2026-11-17T17:28:22.4602564Z Progress (4): 225/424 kB | 27 kB | 238/726 kB | 51/219 kB
2026-11-17T17:28:22.4603044Z Progress (4): 229/424 kB | 27 kB | 238/726 kB | 51/219 kB
2026-11-17T17:28:22.4603505Z Progress (4): 229/424 kB | 27 kB | 238/726 kB | 56/219 kB
2026-11-17T17:28:22.4603814Z Progress (4): 233/424 kB | 27 kB | 238/726 kB | 56/219 kB
2026-11-17T17:28:22.4604321Z Progress (4): 233/424 kB | 27 kB | 242/726 kB | 56/219 kB
2026-11-17T17:28:22.4604736Z Progress (4): 237/424 kB | 27 kB | 242/726 kB | 56/219 kB
2026-11-17T17:28:22.4605154Z Progress (4): 237/424 kB | 27 kB | 242/726 kB | 60/219 kB
2026-11-17T17:28:22.4605604Z Progress (4): 241/424 kB | 27 kB | 242/726 kB | 60/219 kB
2026-11-17T17:28:22.4606019Z Progress (4): 241/424 kB | 27 kB | 246/726 kB | 60/219 kB
2026-11-17T17:28:22.4606406Z Progress (4): 245/424 kB | 27 kB | 246/726 kB | 60/219 kB
2026-11-17T17:28:22.4606849Z Progress (4): 245/424 kB | 27 kB | 246/726 kB | 64/219 kB
2026-11-17T17:28:22.4607366Z Progress (4): 249/424 kB | 27 kB | 246/726 kB | 64/219 kB
2026-11-17T17:28:22.4607723Z Progress (4): 249/424 kB | 27 kB | 250/726 kB | 64/219 kB
2026-11-17T17:28:22.4608122Z Progress (4): 254/424 kB | 27 kB | 250/726 kB | 64/219 kB
2026-11-17T17:28:22.4608596Z Progress (4): 254/424 kB | 27 kB | 250/726 kB | 68/219 kB
2026-11-17T17:28:22.4608954Z Progress (4): 258/424 kB | 27 kB | 250/726 kB | 68/219 kB
2026-11-17T17:28:22.4609400Z Progress (4): 258/424 kB | 27 kB | 254/726 kB | 68/219 kB
2026-11-17T17:28:22.4609945Z Progress (4): 262/424 kB | 27 kB | 254/726 kB | 68/219 kB
2026-11-17T17:28:22.4610272Z Progress (4): 262/424 kB | 27 kB | 254/726 kB | 72/219 kB
2026-11-17T17:28:22.4610756Z Progress (4): 266/424 kB | 27 kB | 254/726 kB | 72/219 kB
2026-11-17T17:28:22.4611571Z Progress (4): 266/424 kB | 27 kB | 258/726 kB | 72/219 kB
2026-11-17T17:28:22.4611767Z Progress (4): 270/424 kB | 27 kB | 258/726 kB | 72/219 kB
2026-11-17T17:28:22.4612369Z Progress (4): 270/424 kB | 27 kB | 258/726 kB | 76/219 kB
2026-11-17T17:28:22.4612939Z Progress (4): 274/424 kB | 27 kB | 258/726 kB | 76/219 kB
2026-11-17T17:28:22.4613428Z Progress (4): 274/424 kB | 27 kB | 258/726 kB | 80/219 kB
2026-11-17T17:28:22.4614246Z Progress (4): 274/424 kB | 27 kB | 262/726 kB | 80/219 kB
2026-11-17T17:28:22.4614589Z Progress (4): 274/424 kB | 27 kB | 262/726 kB | 84/219 kB
2026-11-17T17:28:22.4615183Z Progress (4): 278/424 kB | 27 kB | 262/726 kB | 84/219 kB
2026-11-17T17:28:22.4615939Z Progress (4): 278/424 kB | 27 kB | 262/726 kB | 88/219 kB
2026-11-17T17:28:22.4616322Z Progress (5): 278/424 kB | 27 kB | 262/726 kB | 88/219 kB | 3.6/15 kB
2026-11-17T17:28:22.4616935Z Progress (5): 278/424 kB | 27 kB | 266/726 kB | 88/219 kB | 3.6/15 kB
2026-11-17T17:28:22.4617432Z Progress (5): 278/424 kB | 27 kB | 266/726 kB | 92/219 kB | 3.6/15 kB
2026-11-17T17:28:22.4617939Z Progress (5): 282/424 kB | 27 kB | 266/726 kB | 92/219 kB | 3.6/15 kB
2026-11-17T17:28:22.4618347Z Progress (5): 282/424 kB | 27 kB | 266/726 kB | 96/219 kB | 3.6/15 kB
2026-11-17T17:28:22.4619138Z Progress (5): 282/424 kB | 27 kB | 270/726 kB | 96/219 kB | 3.6/15 kB
2026-11-17T17:28:22.4619448Z Progress (5): 282/424 kB | 27 kB | 270/726 kB | 96/219 kB | 7.7/15 kB
2026-11-17T17:28:22.4619950Z Progress (5): 282/424 kB | 27 kB | 274/726 kB | 96/219 kB | 7.7/15 kB
2026-11-17T17:28:22.4620500Z Progress (5): 282/424 kB | 27 kB | 274/726 kB | 101/219 kB | 7.7/15 kB
2026-11-17T17:28:22.4620961Z Progress (5): 286/424 kB | 27 kB | 274/726 kB | 101/219 kB | 7.7/15 kB
2026-11-17T17:28:22.4621459Z Progress (5): 286/424 kB | 27 kB | 274/726 kB | 105/219 kB | 7.7/15 kB
2026-11-17T17:28:22.4622018Z Progress (5): 286/424 kB | 27 kB | 279/726 kB | 105/219 kB | 7.7/15 kB
2026-11-17T17:28:22.4622440Z Progress (5): 286/424 kB | 27 kB | 279/726 kB | 105/219 kB | 12/15 kB 
2026-11-17T17:28:22.4623037Z Progress (5): 286/424 kB | 27 kB | 283/726 kB | 105/219 kB | 12/15 kB
2026-11-17T17:28:22.4623441Z Progress (5): 286/424 kB | 27 kB | 283/726 kB | 109/219 kB | 12/15 kB
2026-11-17T17:28:22.4624228Z Progress (5): 290/424 kB | 27 kB | 283/726 kB | 109/219 kB | 12/15 kB
2026-11-17T17:28:22.4625681Z Progress (5): 290/424 kB | 27 kB | 283/726 kB | 113/219 kB | 12/15 kB
2026-11-17T17:28:22.4625958Z Progress (5): 290/424 kB | 27 kB | 287/726 kB | 113/219 kB | 12/15 kB
2026-11-17T17:28:22.4626202Z Progress (5): 290/424 kB | 27 kB | 287/726 kB | 113/219 kB | 15 kB   
2026-11-17T17:28:22.4626539Z Progress (5): 290/424 kB | 27 kB | 291/726 kB | 113/219 kB | 15 kB
2026-11-17T17:28:22.4627122Z Progress (5): 290/424 kB | 27 kB | 291/726 kB | 117/219 kB | 15 kB
2026-11-17T17:28:22.4627665Z Progress (5): 294/424 kB | 27 kB | 291/726 kB | 117/219 kB | 15 kB
2026-11-17T17:28:22.4628100Z Progress (5): 294/424 kB | 27 kB | 291/726 kB | 121/219 kB | 15 kB
2026-11-17T17:28:22.4628519Z Progress (5): 294/424 kB | 27 kB | 295/726 kB | 121/219 kB | 15 kB
2026-11-17T17:28:22.4629256Z Progress (5): 294/424 kB | 27 kB | 295/726 kB | 125/219 kB | 15 kB
2026-11-17T17:28:22.4629589Z Progress (5): 299/424 kB | 27 kB | 295/726 kB | 125/219 kB | 15 kB
2026-11-17T17:28:22.4630113Z Progress (5): 299/424 kB | 27 kB | 295/726 kB | 129/219 kB | 15 kB
2026-11-17T17:28:22.4630718Z Progress (5): 299/424 kB | 27 kB | 299/726 kB | 129/219 kB | 15 kB
2026-11-17T17:28:22.4631212Z Progress (5): 299/424 kB | 27 kB | 299/726 kB | 133/219 kB | 15 kB
2026-11-17T17:28:22.4631835Z Progress (5): 303/424 kB | 27 kB | 299/726 kB | 133/219 kB | 15 kB
2026-11-17T17:28:22.4632295Z Progress (5): 303/424 kB | 27 kB | 299/726 kB | 137/219 kB | 15 kB
2026-11-17T17:28:22.4632872Z Progress (5): 303/424 kB | 27 kB | 303/726 kB | 137/219 kB | 15 kB
2026-11-17T17:28:22.4633300Z Progress (5): 303/424 kB | 27 kB | 303/726 kB | 142/219 kB | 15 kB
2026-11-17T17:28:22.4633754Z Progress (5): 307/424 kB | 27 kB | 303/726 kB | 142/219 kB | 15 kB
2026-11-17T17:28:22.4634302Z Progress (5): 307/424 kB | 27 kB | 303/726 kB | 146/219 kB | 15 kB
2026-11-17T17:28:22.4642945Z Progress (5): 307/424 kB | 27 kB | 307/726 kB | 146/219 kB | 15 kB
2026-11-17T17:28:22.4643190Z Progress (5): 307/424 kB | 27 kB | 307/726 kB | 150/219 kB | 15 kB
2026-11-17T17:28:22.4643414Z Progress (5): 311/424 kB | 27 kB | 307/726 kB | 150/219 kB | 15 kB
2026-11-17T17:28:22.4643613Z Progress (5): 311/424 kB | 27 kB | 307/726 kB | 154/219 kB | 15 kB
2026-11-17T17:28:22.4643862Z Progress (5): 311/424 kB | 27 kB | 311/726 kB | 154/219 kB | 15 kB
2026-11-17T17:28:22.4644125Z Progress (5): 311/424 kB | 27 kB | 311/726 kB | 158/219 kB | 15 kB
2026-11-17T17:28:22.4644386Z Progress (5): 315/424 kB | 27 kB | 311/726 kB | 158/219 kB | 15 kB
2026-11-17T17:28:22.4644787Z Progress (5): 315/424 kB | 27 kB | 311/726 kB | 162/219 kB | 15 kB
2026-11-17T17:28:22.4645025Z Progress (5): 315/424 kB | 27 kB | 315/726 kB | 162/219 kB | 15 kB
2026-11-17T17:28:22.4645305Z Progress (5): 315/424 kB | 27 kB | 315/726 kB | 166/219 kB | 15 kB
2026-11-17T17:28:22.4645566Z Progress (5): 319/424 kB | 27 kB | 315/726 kB | 166/219 kB | 15 kB
2026-11-17T17:28:22.4645791Z Progress (5): 319/424 kB | 27 kB | 315/726 kB | 170/219 kB | 15 kB
2026-11-17T17:28:22.4645960Z Progress (5): 319/424 kB | 27 kB | 319/726 kB | 170/219 kB | 15 kB
2026-11-17T17:28:22.4646123Z Progress (5): 319/424 kB | 27 kB | 319/726 kB | 174/219 kB | 15 kB
2026-11-17T17:28:22.4646297Z Progress (5): 323/424 kB | 27 kB | 319/726 kB | 174/219 kB | 15 kB
2026-11-17T17:28:22.4646464Z Progress (5): 323/424 kB | 27 kB | 319/726 kB | 178/219 kB | 15 kB
2026-11-17T17:28:22.4646836Z Progress (5): 323/424 kB | 27 kB | 324/726 kB | 178/219 kB | 15 kB
2026-11-17T17:28:22.4647074Z Progress (5): 323/424 kB | 27 kB | 324/726 kB | 182/219 kB | 15 kB
2026-11-17T17:28:22.4647206Z Progress (5): 327/424 kB | 27 kB | 324/726 kB | 182/219 kB | 15 kB
2026-11-17T17:28:22.4647383Z Progress (5): 327/424 kB | 27 kB | 324/726 kB | 187/219 kB | 15 kB
2026-11-17T17:28:22.4647633Z Progress (5): 327/424 kB | 27 kB | 328/726 kB | 187/219 kB | 15 kB
2026-11-17T17:28:22.4647813Z Progress (5): 327/424 kB | 27 kB | 328/726 kB | 191/219 kB | 15 kB
2026-11-17T17:28:22.4647982Z Progress (5): 331/424 kB | 27 kB | 328/726 kB | 191/219 kB | 15 kB
2026-11-17T17:28:22.4648149Z Progress (5): 331/424 kB | 27 kB | 328/726 kB | 195/219 kB | 15 kB
2026-11-17T17:28:22.4648316Z Progress (5): 331/424 kB | 27 kB | 332/726 kB | 195/219 kB | 15 kB
2026-11-17T17:28:22.4648480Z Progress (5): 331/424 kB | 27 kB | 332/726 kB | 199/219 kB | 15 kB
2026-11-17T17:28:22.4648653Z Progress (5): 335/424 kB | 27 kB | 332/726 kB | 199/219 kB | 15 kB
2026-11-17T17:28:22.4648846Z Progress (5): 335/424 kB | 27 kB | 332/726 kB | 203/219 kB | 15 kB
2026-11-17T17:28:22.4649052Z Progress (5): 335/424 kB | 27 kB | 336/726 kB | 203/219 kB | 15 kB
2026-11-17T17:28:22.4649442Z Progress (5): 335/424 kB | 27 kB | 336/726 kB | 207/219 kB | 15 kB
2026-11-17T17:28:22.4649616Z Progress (5): 340/424 kB | 27 kB | 336/726 kB | 207/219 kB | 15 kB
2026-11-17T17:28:22.4650084Z Progress (5): 340/424 kB | 27 kB | 336/726 kB | 211/219 kB | 15 kB
2026-11-17T17:28:22.4650919Z Progress (5): 340/424 kB | 27 kB | 340/726 kB | 211/219 kB | 15 kB
2026-11-17T17:28:22.4651536Z Progress (5): 340/424 kB | 27 kB | 340/726 kB | 215/219 kB | 15 kB
2026-11-17T17:28:22.4652167Z Progress (5): 344/424 kB | 27 kB | 340/726 kB | 215/219 kB | 15 kB
2026-11-17T17:28:22.4652389Z Progress (5): 344/424 kB | 27 kB | 340/726 kB | 219 kB | 15 kB    
2026-11-17T17:28:22.4652981Z                                                               
2026-11-17T17:28:22.4655118Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-beanutils/commons-beanutils-bean-collections/1.8.3/commons-beanutils-bean-collections-1.8.3.jar (27 kB at 283 kB/s)
2026-11-17T17:28:22.4655422Z Progress (4): 344/424 kB | 344/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4655577Z                                                       
2026-11-17T17:28:22.4655887Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/slf4j/slf4j-log4j12/1.4.2/slf4j-log4j12-1.4.2.jar
2026-11-17T17:28:22.4656124Z Progress (4): 344/424 kB | 348/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4656292Z Progress (4): 348/424 kB | 348/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4656454Z Progress (4): 348/424 kB | 352/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4656748Z Progress (4): 352/424 kB | 352/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4656907Z Progress (4): 352/424 kB | 356/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4657094Z Progress (4): 356/424 kB | 356/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4657224Z Progress (4): 356/424 kB | 360/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4657384Z Progress (4): 360/424 kB | 360/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4657638Z Progress (4): 360/424 kB | 365/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4658024Z Progress (4): 364/424 kB | 365/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4658619Z Progress (4): 364/424 kB | 369/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4658952Z Progress (4): 368/424 kB | 369/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4659427Z Progress (4): 368/424 kB | 373/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4660094Z Progress (4): 372/424 kB | 373/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4660311Z Progress (4): 372/424 kB | 377/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4660660Z Progress (4): 376/424 kB | 377/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4661068Z Progress (4): 376/424 kB | 381/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4661469Z Progress (4): 380/424 kB | 381/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4662016Z Progress (4): 380/424 kB | 385/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4662339Z Progress (4): 385/424 kB | 385/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4662794Z Progress (4): 385/424 kB | 389/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4663139Z Progress (4): 389/424 kB | 389/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4663528Z Progress (4): 389/424 kB | 393/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4666498Z Progress (4): 393/424 kB | 393/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4666625Z Progress (4): 393/424 kB | 397/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4666806Z Progress (4): 397/424 kB | 397/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4666963Z Progress (4): 397/424 kB | 401/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4667125Z Progress (4): 401/424 kB | 401/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4667287Z Progress (4): 401/424 kB | 406/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4667489Z Progress (4): 405/424 kB | 406/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4667647Z Progress (4): 405/424 kB | 410/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4667811Z Progress (4): 409/424 kB | 410/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4668060Z Progress (4): 409/424 kB | 414/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4668728Z Progress (4): 413/424 kB | 414/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4668993Z Progress (4): 413/424 kB | 418/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4669511Z Progress (4): 417/424 kB | 418/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4670032Z Progress (4): 417/424 kB | 422/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4670668Z Progress (4): 421/424 kB | 422/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4670955Z Progress (4): 421/424 kB | 426/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4671441Z Progress (4): 424 kB | 426/726 kB | 219 kB | 15 kB    
2026-11-17T17:28:22.4673731Z Progress (4): 424 kB | 430/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4673902Z Progress (4): 424 kB | 434/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4674060Z Progress (4): 424 kB | 438/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4674230Z Progress (4): 424 kB | 442/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4674400Z Progress (4): 424 kB | 446/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4674782Z Progress (4): 424 kB | 451/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4675695Z Progress (4): 424 kB | 455/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4676010Z Progress (4): 424 kB | 459/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4676794Z Progress (4): 424 kB | 463/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4677414Z Progress (4): 424 kB | 467/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4677935Z Progress (4): 424 kB | 471/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4678481Z Progress (4): 424 kB | 475/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4678987Z Progress (4): 424 kB | 479/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4679541Z Progress (4): 424 kB | 483/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4680079Z Progress (4): 424 kB | 487/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4681268Z Progress (4): 424 kB | 492/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4681429Z Progress (4): 424 kB | 496/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4681694Z Progress (4): 424 kB | 500/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4682451Z Progress (4): 424 kB | 504/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4683451Z Progress (4): 424 kB | 508/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4683963Z Progress (4): 424 kB | 512/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4684587Z Progress (4): 424 kB | 516/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4695086Z Progress (4): 424 kB | 520/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4695207Z Progress (4): 424 kB | 524/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4695375Z Progress (4): 424 kB | 528/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4695529Z Progress (4): 424 kB | 532/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4695682Z Progress (4): 424 kB | 537/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4695835Z Progress (4): 424 kB | 541/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4696103Z Progress (4): 424 kB | 545/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4696250Z Progress (4): 424 kB | 549/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4696398Z Progress (4): 424 kB | 553/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4696565Z Progress (4): 424 kB | 557/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4696712Z Progress (4): 424 kB | 561/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4696864Z Progress (4): 424 kB | 565/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4697012Z Progress (4): 424 kB | 569/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4697162Z Progress (4): 424 kB | 573/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4697321Z Progress (4): 424 kB | 578/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4697476Z Progress (4): 424 kB | 582/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4697627Z Progress (4): 424 kB | 586/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4697774Z Progress (4): 424 kB | 590/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4697945Z Progress (4): 424 kB | 594/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4698062Z Progress (4): 424 kB | 598/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4698217Z Progress (4): 424 kB | 602/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4698366Z Progress (4): 424 kB | 606/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4698525Z Progress (4): 424 kB | 610/726 kB | 219 kB | 15 kB
2026-11-17T17:28:22.4698659Z                                                   
2026-11-17T17:28:22.4699150Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/slf4j/jcl104-over-slf4j/1.4.2/jcl104-over-slf4j-1.4.2.jar (15 kB at 158 kB/s)
2026-11-17T17:28:22.4699387Z Progress (3): 424 kB | 614/726 kB | 219 kB
2026-11-17T17:28:22.4699553Z                                           
2026-11-17T17:28:22.4699846Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/slf4j/slf4j-api/1.4.2/slf4j-api-1.4.2.jar
2026-11-17T17:28:22.4700056Z Progress (3): 424 kB | 618/726 kB | 219 kB
2026-11-17T17:28:22.4700209Z Progress (3): 424 kB | 623/726 kB | 219 kB
2026-11-17T17:28:22.4700328Z Progress (3): 424 kB | 627/726 kB | 219 kB
2026-11-17T17:28:22.4700493Z Progress (3): 424 kB | 631/726 kB | 219 kB
2026-11-17T17:28:22.4700690Z Progress (3): 424 kB | 635/726 kB | 219 kB
2026-11-17T17:28:22.4701209Z Progress (3): 424 kB | 639/726 kB | 219 kB
2026-11-17T17:28:22.4702094Z Progress (3): 424 kB | 643/726 kB | 219 kB
2026-11-17T17:28:22.4702414Z Progress (3): 424 kB | 647/726 kB | 219 kB
2026-11-17T17:28:22.4702757Z Progress (3): 424 kB | 651/726 kB | 219 kB
2026-11-17T17:28:22.4703271Z Progress (3): 424 kB | 655/726 kB | 219 kB
2026-11-17T17:28:22.4703726Z Progress (3): 424 kB | 659/726 kB | 219 kB
2026-11-17T17:28:22.4704345Z Progress (3): 424 kB | 664/726 kB | 219 kB
2026-11-17T17:28:22.4704941Z Progress (3): 424 kB | 668/726 kB | 219 kB
2026-11-17T17:28:22.4705388Z Progress (3): 424 kB | 672/726 kB | 219 kB
2026-11-17T17:28:22.4705880Z Progress (3): 424 kB | 676/726 kB | 219 kB
2026-11-17T17:28:22.4706445Z Progress (3): 424 kB | 680/726 kB | 219 kB
2026-11-17T17:28:22.4706892Z Progress (3): 424 kB | 684/726 kB | 219 kB
2026-11-17T17:28:22.4707332Z Progress (3): 424 kB | 688/726 kB | 219 kB
2026-11-17T17:28:22.4707871Z Progress (3): 424 kB | 692/726 kB | 219 kB
2026-11-17T17:28:22.4708294Z Progress (3): 424 kB | 696/726 kB | 219 kB
2026-11-17T17:28:22.4708886Z Progress (3): 424 kB | 700/726 kB | 219 kB
2026-11-17T17:28:22.4709329Z Progress (3): 424 kB | 705/726 kB | 219 kB
2026-11-17T17:28:22.4709808Z Progress (3): 424 kB | 709/726 kB | 219 kB
2026-11-17T17:28:22.4710385Z Progress (3): 424 kB | 713/726 kB | 219 kB
2026-11-17T17:28:22.4710772Z Progress (3): 424 kB | 717/726 kB | 219 kB
2026-11-17T17:28:22.4711370Z Progress (3): 424 kB | 721/726 kB | 219 kB
2026-11-17T17:28:22.4711969Z Progress (3): 424 kB | 725/726 kB | 219 kB
2026-11-17T17:28:22.4732935Z Progress (3): 424 kB | 726 kB | 219 kB    
2026-11-17T17:28:22.4734491Z Progress (4): 424 kB | 726 kB | 219 kB | 4.1/8.6 kB
2026-11-17T17:28:22.4734808Z Progress (4): 424 kB | 726 kB | 219 kB | 8.2/8.6 kB
2026-11-17T17:28:22.4754863Z Progress (4): 424 kB | 726 kB | 219 kB | 8.6 kB    
2026-11-17T17:28:22.4755151Z                                                
2026-11-17T17:28:22.4755663Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/displaytag/displaytag/1.2/displaytag-1.2.jar (219 kB at 2.1 MB/s)
2026-11-17T17:28:22.4756138Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/net/sf/jasperreports/jasperreports/3.7.6/jasperreports-3.7.6.jar
2026-11-17T17:28:22.4756764Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/jboss/jboss-j2ee/4.2.2.GA/jboss-j2ee-4.2.2.GA.jar (424 kB at 4.1 MB/s)
2026-11-17T17:28:22.4757257Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-lang/commons-lang/2.5/commons-lang-2.5.jar
2026-11-17T17:28:22.4795054Z Progress (3): 726 kB | 8.6 kB | 4.1/15 kB
2026-11-17T17:28:22.4795300Z Progress (3): 726 kB | 8.6 kB | 8.2/15 kB
2026-11-17T17:28:22.4795800Z Progress (3): 726 kB | 8.6 kB | 12/15 kB 
2026-11-17T17:28:22.4831403Z Progress (3): 726 kB | 8.6 kB | 15 kB   
2026-11-17T17:28:22.4831623Z                                      
2026-11-17T17:28:22.4832000Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/net/sourceforge/jexcelapi/jxl/2.6.12/jxl-2.6.12.jar (726 kB at 6.5 MB/s)
2026-11-17T17:28:22.4832378Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-collections/commons-collections/2.1.1/commons-collections-2.1.1.jar
2026-11-17T17:28:22.4833801Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/slf4j/slf4j-log4j12/1.4.2/slf4j-log4j12-1.4.2.jar (8.6 kB at 77 kB/s)
2026-11-17T17:28:22.4834146Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/javax/xml/jaxp-api/1.4/jaxp-api-1.4.jar
2026-11-17T17:28:22.4874329Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/slf4j/slf4j-api/1.4.2/slf4j-api-1.4.2.jar (15 kB at 132 kB/s)
2026-11-17T17:28:22.4874804Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/log4j/log4j/1.2.7/log4j-1.2.7.jar
2026-11-17T17:28:22.4895211Z Progress (1): 4.1/279 kB
2026-11-17T17:28:22.4895440Z Progress (1): 6.4/279 kB
2026-11-17T17:28:22.4895985Z Progress (1): 10/279 kB 
2026-11-17T17:28:22.4896303Z Progress (1): 15/279 kB
2026-11-17T17:28:22.4896762Z Progress (1): 19/279 kB
2026-11-17T17:28:22.4897145Z Progress (1): 23/279 kB
2026-11-17T17:28:22.4899851Z Progress (1): 27/279 kB
2026-11-17T17:28:22.4900055Z Progress (1): 31/279 kB
2026-11-17T17:28:22.4900196Z Progress (1): 35/279 kB
2026-11-17T17:28:22.4900402Z Progress (1): 39/279 kB
2026-11-17T17:28:22.4900512Z Progress (1): 43/279 kB
2026-11-17T17:28:22.4900777Z Progress (1): 47/279 kB
2026-11-17T17:28:22.4901335Z Progress (1): 51/279 kB
2026-11-17T17:28:22.4901499Z Progress (1): 56/279 kB
2026-11-17T17:28:22.4902267Z Progress (1): 60/279 kB
2026-11-17T17:28:22.4902601Z Progress (1): 64/279 kB
2026-11-17T17:28:22.4903058Z Progress (1): 68/279 kB
2026-11-17T17:28:22.4903445Z Progress (1): 72/279 kB
2026-11-17T17:28:22.4903934Z Progress (1): 76/279 kB
2026-11-17T17:28:22.4904624Z Progress (1): 80/279 kB
2026-11-17T17:28:22.4905066Z Progress (1): 84/279 kB
2026-11-17T17:28:22.4905213Z Progress (1): 88/279 kB
2026-11-17T17:28:22.4905604Z Progress (1): 92/279 kB
2026-11-17T17:28:22.4975347Z Progress (1): 96/279 kB
2026-11-17T17:28:22.4975576Z Progress (2): 96/279 kB | 0/3.0 MB
2026-11-17T17:28:22.4975728Z Progress (2): 96/279 kB | 0/3.0 MB
2026-11-17T17:28:22.4975996Z Progress (2): 96/279 kB | 0.1/3.0 MB
2026-11-17T17:28:22.4976112Z Progress (2): 96/279 kB | 0.1/3.0 MB
2026-11-17T17:28:22.4976287Z Progress (3): 96/279 kB | 0.1/3.0 MB | 4.1/175 kB
2026-11-17T17:28:22.4976520Z Progress (3): 96/279 kB | 0.1/3.0 MB | 4.1/175 kB
2026-11-17T17:28:22.4976779Z Progress (3): 96/279 kB | 0.1/3.0 MB | 8.2/175 kB
2026-11-17T17:28:22.4976940Z Progress (3): 96/279 kB | 0.1/3.0 MB | 12/175 kB 
2026-11-17T17:28:22.4977332Z Progress (3): 96/279 kB | 0.1/3.0 MB | 16/175 kB
2026-11-17T17:28:22.4977490Z Progress (3): 96/279 kB | 0.1/3.0 MB | 20/175 kB
2026-11-17T17:28:22.4977690Z Progress (3): 96/279 kB | 0.1/3.0 MB | 25/175 kB
2026-11-17T17:28:22.4977880Z Progress (3): 96/279 kB | 0.1/3.0 MB | 29/175 kB
2026-11-17T17:28:22.4978093Z Progress (3): 96/279 kB | 0.1/3.0 MB | 33/175 kB
2026-11-17T17:28:22.4978304Z Progress (3): 96/279 kB | 0.1/3.0 MB | 37/175 kB
2026-11-17T17:28:22.4978456Z Progress (3): 96/279 kB | 0.1/3.0 MB | 41/175 kB
2026-11-17T17:28:22.4978607Z Progress (3): 96/279 kB | 0.1/3.0 MB | 45/175 kB
2026-11-17T17:28:22.4978795Z Progress (3): 96/279 kB | 0.1/3.0 MB | 49/175 kB
2026-11-17T17:28:22.4979025Z Progress (3): 96/279 kB | 0.1/3.0 MB | 53/175 kB
2026-11-17T17:28:22.4979174Z Progress (3): 96/279 kB | 0.1/3.0 MB | 57/175 kB
2026-11-17T17:28:22.4979289Z Progress (3): 96/279 kB | 0.1/3.0 MB | 61/175 kB
2026-11-17T17:28:22.4979449Z Progress (3): 96/279 kB | 0.1/3.0 MB | 66/175 kB
2026-11-17T17:28:22.4979621Z Progress (3): 96/279 kB | 0.1/3.0 MB | 70/175 kB
2026-11-17T17:28:22.4979793Z Progress (3): 96/279 kB | 0.1/3.0 MB | 74/175 kB
2026-11-17T17:28:22.4979938Z Progress (3): 96/279 kB | 0.1/3.0 MB | 78/175 kB
2026-11-17T17:28:22.4980084Z Progress (3): 96/279 kB | 0.1/3.0 MB | 82/175 kB
2026-11-17T17:28:22.4980231Z Progress (3): 96/279 kB | 0.1/3.0 MB | 86/175 kB
2026-11-17T17:28:22.4980380Z Progress (3): 96/279 kB | 0.1/3.0 MB | 90/175 kB
2026-11-17T17:28:22.4980527Z Progress (3): 96/279 kB | 0.1/3.0 MB | 94/175 kB
2026-11-17T17:28:22.4980680Z Progress (3): 101/279 kB | 0.1/3.0 MB | 94/175 kB
2026-11-17T17:28:22.4980926Z Progress (3): 105/279 kB | 0.1/3.0 MB | 94/175 kB
2026-11-17T17:28:22.4981103Z Progress (3): 109/279 kB | 0.1/3.0 MB | 94/175 kB
2026-11-17T17:28:22.4981272Z Progress (3): 113/279 kB | 0.1/3.0 MB | 94/175 kB
2026-11-17T17:28:22.4981423Z Progress (3): 117/279 kB | 0.1/3.0 MB | 94/175 kB
2026-11-17T17:28:22.4981576Z Progress (3): 121/279 kB | 0.1/3.0 MB | 94/175 kB
2026-11-17T17:28:22.4981725Z Progress (3): 125/279 kB | 0.1/3.0 MB | 94/175 kB
2026-11-17T17:28:22.4981874Z Progress (3): 129/279 kB | 0.1/3.0 MB | 94/175 kB
2026-11-17T17:28:22.4981997Z Progress (3): 133/279 kB | 0.1/3.0 MB | 94/175 kB
2026-11-17T17:28:22.4982160Z Progress (3): 137/279 kB | 0.1/3.0 MB | 94/175 kB
2026-11-17T17:28:22.4982308Z Progress (3): 142/279 kB | 0.1/3.0 MB | 94/175 kB
2026-11-17T17:28:22.4982478Z Progress (3): 146/279 kB | 0.1/3.0 MB | 94/175 kB
2026-11-17T17:28:22.4982624Z Progress (3): 150/279 kB | 0.1/3.0 MB | 94/175 kB
2026-11-17T17:28:22.4982812Z Progress (3): 154/279 kB | 0.1/3.0 MB | 94/175 kB
2026-11-17T17:28:22.4983003Z Progress (3): 158/279 kB | 0.1/3.0 MB | 94/175 kB
2026-11-17T17:28:22.4983149Z Progress (3): 162/279 kB | 0.1/3.0 MB | 94/175 kB
2026-11-17T17:28:22.4983263Z Progress (3): 166/279 kB | 0.1/3.0 MB | 94/175 kB
2026-11-17T17:28:22.4983413Z Progress (3): 170/279 kB | 0.1/3.0 MB | 94/175 kB
2026-11-17T17:28:22.4983573Z Progress (3): 174/279 kB | 0.1/3.0 MB | 94/175 kB
2026-11-17T17:28:22.4983742Z Progress (3): 178/279 kB | 0.1/3.0 MB | 94/175 kB
2026-11-17T17:28:22.4983945Z Progress (3): 183/279 kB | 0.1/3.0 MB | 94/175 kB
2026-11-17T17:28:22.4984166Z Progress (3): 187/279 kB | 0.1/3.0 MB | 94/175 kB
2026-11-17T17:28:22.4984394Z Progress (3): 191/279 kB | 0.1/3.0 MB | 94/175 kB
2026-11-17T17:28:22.4984742Z Progress (3): 195/279 kB | 0.1/3.0 MB | 94/175 kB
2026-11-17T17:28:22.4984978Z Progress (3): 199/279 kB | 0.1/3.0 MB | 94/175 kB
2026-11-17T17:28:22.4985171Z Progress (3): 203/279 kB | 0.1/3.0 MB | 94/175 kB
2026-11-17T17:28:22.4985420Z Progress (3): 207/279 kB | 0.1/3.0 MB | 94/175 kB
2026-11-17T17:28:22.4985661Z Progress (3): 211/279 kB | 0.1/3.0 MB | 94/175 kB
2026-11-17T17:28:22.4985950Z Progress (3): 215/279 kB | 0.1/3.0 MB | 94/175 kB
2026-11-17T17:28:22.4986227Z Progress (3): 219/279 kB | 0.1/3.0 MB | 94/175 kB
2026-11-17T17:28:22.4986478Z Progress (3): 223/279 kB | 0.1/3.0 MB | 94/175 kB
2026-11-17T17:28:22.4986709Z Progress (3): 223/279 kB | 0.1/3.0 MB | 94/175 kB
2026-11-17T17:28:22.4986940Z Progress (3): 228/279 kB | 0.1/3.0 MB | 94/175 kB
2026-11-17T17:28:22.4987331Z Progress (3): 228/279 kB | 0.1/3.0 MB | 98/175 kB
2026-11-17T17:28:22.4987534Z Progress (4): 228/279 kB | 0.1/3.0 MB | 98/175 kB | 4.1/219 kB
2026-11-17T17:28:22.4987922Z Progress (4): 228/279 kB | 0.1/3.0 MB | 98/175 kB | 4.1/219 kB
2026-11-17T17:28:22.4988204Z Progress (4): 232/279 kB | 0.1/3.0 MB | 98/175 kB | 4.1/219 kB
2026-11-17T17:28:22.4988610Z Progress (4): 232/279 kB | 0.1/3.0 MB | 98/175 kB | 6.4/219 kB
2026-11-17T17:28:22.4988876Z Progress (4): 232/279 kB | 0.1/3.0 MB | 98/175 kB | 6.4/219 kB
2026-11-17T17:28:22.4989127Z Progress (4): 232/279 kB | 0.1/3.0 MB | 98/175 kB | 10/219 kB 
2026-11-17T17:28:22.4989394Z Progress (4): 232/279 kB | 0.1/3.0 MB | 102/175 kB | 10/219 kB
2026-11-17T17:28:22.4989665Z Progress (4): 232/279 kB | 0.1/3.0 MB | 102/175 kB | 10/219 kB
2026-11-17T17:28:22.4989929Z Progress (4): 232/279 kB | 0.1/3.0 MB | 106/175 kB | 10/219 kB
2026-11-17T17:28:22.4990156Z Progress (4): 232/279 kB | 0.1/3.0 MB | 106/175 kB | 15/219 kB
2026-11-17T17:28:22.4990425Z Progress (4): 236/279 kB | 0.1/3.0 MB | 106/175 kB | 15/219 kB
2026-11-17T17:28:22.4990685Z Progress (4): 236/279 kB | 0.1/3.0 MB | 106/175 kB | 19/219 kB
2026-11-17T17:28:22.4990977Z Progress (4): 236/279 kB | 0.2/3.0 MB | 106/175 kB | 19/219 kB
2026-11-17T17:28:22.4991243Z Progress (4): 236/279 kB | 0.2/3.0 MB | 111/175 kB | 19/219 kB
2026-11-17T17:28:22.4991518Z Progress (4): 236/279 kB | 0.2/3.0 MB | 111/175 kB | 23/219 kB
2026-11-17T17:28:22.4991795Z Progress (4): 240/279 kB | 0.2/3.0 MB | 111/175 kB | 23/219 kB
2026-11-17T17:28:22.4992054Z Progress (4): 240/279 kB | 0.2/3.0 MB | 111/175 kB | 27/219 kB
2026-11-17T17:28:22.4992316Z Progress (4): 240/279 kB | 0.2/3.0 MB | 111/175 kB | 27/219 kB
2026-11-17T17:28:22.4992580Z Progress (4): 240/279 kB | 0.2/3.0 MB | 115/175 kB | 27/219 kB
2026-11-17T17:28:22.4992884Z Progress (4): 240/279 kB | 0.2/3.0 MB | 115/175 kB | 31/219 kB
2026-11-17T17:28:22.4993103Z Progress (4): 244/279 kB | 0.2/3.0 MB | 115/175 kB | 31/219 kB
2026-11-17T17:28:22.4993395Z Progress (4): 244/279 kB | 0.2/3.0 MB | 115/175 kB | 35/219 kB
2026-11-17T17:28:22.4993668Z Progress (4): 244/279 kB | 0.2/3.0 MB | 115/175 kB | 35/219 kB
2026-11-17T17:28:22.4993933Z Progress (4): 244/279 kB | 0.2/3.0 MB | 119/175 kB | 35/219 kB
2026-11-17T17:28:22.4994211Z Progress (4): 244/279 kB | 0.2/3.0 MB | 119/175 kB | 39/219 kB
2026-11-17T17:28:22.4994450Z Progress (4): 244/279 kB | 0.2/3.0 MB | 123/175 kB | 39/219 kB
2026-11-17T17:28:22.4994794Z Progress (4): 244/279 kB | 0.2/3.0 MB | 123/175 kB | 39/219 kB
2026-11-17T17:28:22.4995044Z Progress (4): 244/279 kB | 0.2/3.0 MB | 127/175 kB | 39/219 kB
2026-11-17T17:28:22.4995326Z Progress (4): 248/279 kB | 0.2/3.0 MB | 127/175 kB | 39/219 kB
2026-11-17T17:28:22.4995543Z Progress (4): 248/279 kB | 0.2/3.0 MB | 131/175 kB | 39/219 kB
2026-11-17T17:28:22.4995827Z Progress (4): 248/279 kB | 0.2/3.0 MB | 131/175 kB | 43/219 kB
2026-11-17T17:28:22.4996089Z Progress (4): 248/279 kB | 0.2/3.0 MB | 135/175 kB | 43/219 kB
2026-11-17T17:28:22.4996363Z Progress (4): 248/279 kB | 0.2/3.0 MB | 135/175 kB | 47/219 kB
2026-11-17T17:28:22.4996624Z Progress (4): 248/279 kB | 0.2/3.0 MB | 139/175 kB | 47/219 kB
2026-11-17T17:28:22.4996882Z Progress (4): 248/279 kB | 0.2/3.0 MB | 139/175 kB | 51/219 kB
2026-11-17T17:28:22.4997145Z Progress (4): 248/279 kB | 0.2/3.0 MB | 143/175 kB | 51/219 kB
2026-11-17T17:28:22.4997404Z Progress (4): 252/279 kB | 0.2/3.0 MB | 143/175 kB | 51/219 kB
2026-11-17T17:28:22.4997662Z Progress (4): 252/279 kB | 0.2/3.0 MB | 143/175 kB | 51/219 kB
2026-11-17T17:28:22.4997953Z Progress (4): 256/279 kB | 0.2/3.0 MB | 143/175 kB | 51/219 kB
2026-11-17T17:28:22.4998171Z Progress (4): 256/279 kB | 0.2/3.0 MB | 147/175 kB | 51/219 kB
2026-11-17T17:28:22.4998408Z Progress (4): 256/279 kB | 0.2/3.0 MB | 147/175 kB | 56/219 kB
2026-11-17T17:28:22.4998680Z Progress (4): 256/279 kB | 0.2/3.0 MB | 152/175 kB | 56/219 kB
2026-11-17T17:28:22.4998938Z Progress (4): 256/279 kB | 0.2/3.0 MB | 152/175 kB | 56/219 kB
2026-11-17T17:28:22.4999286Z Progress (4): 260/279 kB | 0.2/3.0 MB | 152/175 kB | 56/219 kB
2026-11-17T17:28:22.4999520Z Progress (4): 260/279 kB | 0.2/3.0 MB | 156/175 kB | 56/219 kB
2026-11-17T17:28:22.4999760Z Progress (4): 260/279 kB | 0.2/3.0 MB | 156/175 kB | 60/219 kB
2026-11-17T17:28:22.5000054Z Progress (4): 260/279 kB | 0.2/3.0 MB | 160/175 kB | 60/219 kB
2026-11-17T17:28:22.5000387Z Progress (4): 260/279 kB | 0.3/3.0 MB | 160/175 kB | 60/219 kB
2026-11-17T17:28:22.5000611Z Progress (4): 264/279 kB | 0.3/3.0 MB | 160/175 kB | 60/219 kB
2026-11-17T17:28:22.5000857Z Progress (4): 264/279 kB | 0.3/3.0 MB | 164/175 kB | 60/219 kB
2026-11-17T17:28:22.5001125Z Progress (4): 264/279 kB | 0.3/3.0 MB | 164/175 kB | 64/219 kB
2026-11-17T17:28:22.5001388Z Progress (4): 264/279 kB | 0.3/3.0 MB | 168/175 kB | 64/219 kB
2026-11-17T17:28:22.5001643Z Progress (4): 264/279 kB | 0.3/3.0 MB | 168/175 kB | 64/219 kB
2026-11-17T17:28:22.5001913Z Progress (4): 269/279 kB | 0.3/3.0 MB | 168/175 kB | 64/219 kB
2026-11-17T17:28:22.5002180Z Progress (4): 269/279 kB | 0.3/3.0 MB | 172/175 kB | 64/219 kB
2026-11-17T17:28:22.5002476Z Progress (4): 269/279 kB | 0.3/3.0 MB | 172/175 kB | 68/219 kB
2026-11-17T17:28:22.5002749Z Progress (4): 269/279 kB | 0.3/3.0 MB | 175 kB | 68/219 kB    
2026-11-17T17:28:22.5003020Z Progress (4): 269/279 kB | 0.3/3.0 MB | 175 kB | 68/219 kB
2026-11-17T17:28:22.5003237Z Progress (4): 273/279 kB | 0.3/3.0 MB | 175 kB | 68/219 kB
2026-11-17T17:28:22.5003508Z Progress (4): 273/279 kB | 0.3/3.0 MB | 175 kB | 72/219 kB
2026-11-17T17:28:22.5003871Z Progress (4): 277/279 kB | 0.3/3.0 MB | 175 kB | 72/219 kB
2026-11-17T17:28:22.5004415Z Progress (4): 277/279 kB | 0.3/3.0 MB | 175 kB | 76/219 kB
2026-11-17T17:28:22.5004799Z Progress (4): 277/279 kB | 0.3/3.0 MB | 175 kB | 76/219 kB
2026-11-17T17:28:22.5005142Z Progress (4): 277/279 kB | 0.3/3.0 MB | 175 kB | 80/219 kB
2026-11-17T17:28:22.5005589Z Progress (4): 279 kB | 0.3/3.0 MB | 175 kB | 80/219 kB    
2026-11-17T17:28:22.5005912Z Progress (4): 279 kB | 0.3/3.0 MB | 175 kB | 84/219 kB
2026-11-17T17:28:22.5006406Z Progress (4): 279 kB | 0.3/3.0 MB | 175 kB | 84/219 kB
2026-11-17T17:28:22.5007062Z Progress (4): 279 kB | 0.3/3.0 MB | 175 kB | 88/219 kB
2026-11-17T17:28:22.5007438Z Progress (4): 279 kB | 0.3/3.0 MB | 175 kB | 92/219 kB
2026-11-17T17:28:22.5007856Z Progress (4): 279 kB | 0.3/3.0 MB | 175 kB | 92/219 kB
2026-11-17T17:28:22.5008557Z Progress (4): 279 kB | 0.3/3.0 MB | 175 kB | 96/219 kB
2026-11-17T17:28:22.5009044Z Progress (4): 279 kB | 0.3/3.0 MB | 175 kB | 101/219 kB
2026-11-17T17:28:22.5009418Z Progress (4): 279 kB | 0.4/3.0 MB | 175 kB | 101/219 kB
2026-11-17T17:28:22.5010107Z Progress (4): 279 kB | 0.4/3.0 MB | 175 kB | 105/219 kB
2026-11-17T17:28:22.5010391Z Progress (4): 279 kB | 0.4/3.0 MB | 175 kB | 109/219 kB
2026-11-17T17:28:22.5010768Z Progress (4): 279 kB | 0.4/3.0 MB | 175 kB | 109/219 kB
2026-11-17T17:28:22.5011912Z Progress (4): 279 kB | 0.4/3.0 MB | 175 kB | 113/219 kB
2026-11-17T17:28:22.5012178Z Progress (4): 279 kB | 0.4/3.0 MB | 175 kB | 117/219 kB
2026-11-17T17:28:22.5012467Z Progress (4): 279 kB | 0.4/3.0 MB | 175 kB | 117/219 kB
2026-11-17T17:28:22.5013259Z Progress (4): 279 kB | 0.4/3.0 MB | 175 kB | 121/219 kB
2026-11-17T17:28:22.5013710Z Progress (4): 279 kB | 0.4/3.0 MB | 175 kB | 125/219 kB
2026-11-17T17:28:22.5014398Z Progress (4): 279 kB | 0.4/3.0 MB | 175 kB | 125/219 kB
2026-11-17T17:28:22.5015060Z Progress (4): 279 kB | 0.4/3.0 MB | 175 kB | 129/219 kB
2026-11-17T17:28:22.5015387Z Progress (4): 279 kB | 0.4/3.0 MB | 175 kB | 133/219 kB
2026-11-17T17:28:22.5015845Z Progress (4): 279 kB | 0.4/3.0 MB | 175 kB | 133/219 kB
2026-11-17T17:28:22.5017205Z Progress (4): 279 kB | 0.4/3.0 MB | 175 kB | 137/219 kB
2026-11-17T17:28:22.5017412Z Progress (4): 279 kB | 0.4/3.0 MB | 175 kB | 142/219 kB
2026-11-17T17:28:22.5017576Z Progress (4): 279 kB | 0.4/3.0 MB | 175 kB | 142/219 kB
2026-11-17T17:28:22.5018253Z Progress (4): 279 kB | 0.4/3.0 MB | 175 kB | 146/219 kB
2026-11-17T17:28:22.5019321Z Progress (4): 279 kB | 0.4/3.0 MB | 175 kB | 150/219 kB
2026-11-17T17:28:22.5019797Z Progress (4): 279 kB | 0.5/3.0 MB | 175 kB | 150/219 kB
2026-11-17T17:28:22.5021241Z Progress (4): 279 kB | 0.5/3.0 MB | 175 kB | 154/219 kB
2026-11-17T17:28:22.5021527Z Progress (4): 279 kB | 0.5/3.0 MB | 175 kB | 158/219 kB
2026-11-17T17:28:22.5021696Z Progress (4): 279 kB | 0.5/3.0 MB | 175 kB | 158/219 kB
2026-11-17T17:28:22.5021861Z Progress (4): 279 kB | 0.5/3.0 MB | 175 kB | 162/219 kB
2026-11-17T17:28:22.5022419Z Progress (4): 279 kB | 0.5/3.0 MB | 175 kB | 166/219 kB
2026-11-17T17:28:22.5022792Z Progress (4): 279 kB | 0.5/3.0 MB | 175 kB | 166/219 kB
2026-11-17T17:28:22.5023736Z Progress (4): 279 kB | 0.5/3.0 MB | 175 kB | 170/219 kB
2026-11-17T17:28:22.5024356Z Progress (4): 279 kB | 0.5/3.0 MB | 175 kB | 174/219 kB
2026-11-17T17:28:22.5024761Z Progress (4): 279 kB | 0.5/3.0 MB | 175 kB | 174/219 kB
2026-11-17T17:28:22.5025408Z Progress (4): 279 kB | 0.5/3.0 MB | 175 kB | 178/219 kB
2026-11-17T17:28:22.5026106Z Progress (4): 279 kB | 0.5/3.0 MB | 175 kB | 183/219 kB
2026-11-17T17:28:22.5026458Z Progress (4): 279 kB | 0.5/3.0 MB | 175 kB | 183/219 kB
2026-11-17T17:28:22.5027287Z Progress (4): 279 kB | 0.5/3.0 MB | 175 kB | 187/219 kB
2026-11-17T17:28:22.5028031Z Progress (4): 279 kB | 0.5/3.0 MB | 175 kB | 191/219 kB
2026-11-17T17:28:22.5028322Z Progress (4): 279 kB | 0.5/3.0 MB | 175 kB | 191/219 kB
2026-11-17T17:28:22.5029121Z Progress (4): 279 kB | 0.5/3.0 MB | 175 kB | 195/219 kB
2026-11-17T17:28:22.5029656Z Progress (4): 279 kB | 0.5/3.0 MB | 175 kB | 199/219 kB
2026-11-17T17:28:22.5030412Z Progress (4): 279 kB | 0.5/3.0 MB | 175 kB | 203/219 kB
2026-11-17T17:28:22.5032189Z Progress (4): 279 kB | 0.6/3.0 MB | 175 kB | 203/219 kB
2026-11-17T17:28:22.5032352Z Progress (4): 279 kB | 0.6/3.0 MB | 175 kB | 207/219 kB
2026-11-17T17:28:22.5032525Z Progress (4): 279 kB | 0.6/3.0 MB | 175 kB | 211/219 kB
2026-11-17T17:28:22.5033345Z Progress (4): 279 kB | 0.6/3.0 MB | 175 kB | 215/219 kB
2026-11-17T17:28:22.5033508Z Progress (4): 279 kB | 0.6/3.0 MB | 175 kB | 215/219 kB
2026-11-17T17:28:22.5034921Z Progress (4): 279 kB | 0.6/3.0 MB | 175 kB | 219 kB    
2026-11-17T17:28:22.5036388Z Progress (4): 279 kB | 0.6/3.0 MB | 175 kB | 219 kB
2026-11-17T17:28:22.5037940Z Progress (4): 279 kB | 0.6/3.0 MB | 175 kB | 219 kB
2026-11-17T17:28:22.5039751Z Progress (4): 279 kB | 0.6/3.0 MB | 175 kB | 219 kB
2026-11-17T17:28:22.5040378Z Progress (4): 279 kB | 0.6/3.0 MB | 175 kB | 219 kB
2026-11-17T17:28:22.5041581Z Progress (5): 279 kB | 0.6/3.0 MB | 175 kB | 219 kB | 4.1/351 kB
2026-11-17T17:28:22.5042208Z Progress (5): 279 kB | 0.7/3.0 MB | 175 kB | 219 kB | 4.1/351 kB
2026-11-17T17:28:22.5043610Z Progress (5): 279 kB | 0.7/3.0 MB | 175 kB | 219 kB | 8.2/351 kB
2026-11-17T17:28:22.5044468Z Progress (5): 279 kB | 0.7/3.0 MB | 175 kB | 219 kB | 12/351 kB 
2026-11-17T17:28:22.5044907Z Progress (5): 279 kB | 0.7/3.0 MB | 175 kB | 219 kB | 12/351 kB
2026-11-17T17:28:22.5045746Z Progress (5): 279 kB | 0.7/3.0 MB | 175 kB | 219 kB | 16/351 kB
2026-11-17T17:28:22.5046469Z Progress (5): 279 kB | 0.7/3.0 MB | 175 kB | 219 kB | 20/351 kB
2026-11-17T17:28:22.5046950Z Progress (5): 279 kB | 0.7/3.0 MB | 175 kB | 219 kB | 20/351 kB
2026-11-17T17:28:22.5047693Z Progress (5): 279 kB | 0.7/3.0 MB | 175 kB | 219 kB | 25/351 kB
2026-11-17T17:28:22.5048248Z Progress (5): 279 kB | 0.7/3.0 MB | 175 kB | 219 kB | 29/351 kB
2026-11-17T17:28:22.5048879Z Progress (5): 279 kB | 0.7/3.0 MB | 175 kB | 219 kB | 29/351 kB
2026-11-17T17:28:22.5049850Z Progress (5): 279 kB | 0.7/3.0 MB | 175 kB | 219 kB | 33/351 kB
2026-11-17T17:28:22.5050149Z Progress (5): 279 kB | 0.7/3.0 MB | 175 kB | 219 kB | 37/351 kB
2026-11-17T17:28:22.5050734Z Progress (5): 279 kB | 0.7/3.0 MB | 175 kB | 219 kB | 37/351 kB
2026-11-17T17:28:22.5051580Z Progress (5): 279 kB | 0.7/3.0 MB | 175 kB | 219 kB | 41/351 kB
2026-11-17T17:28:22.5051882Z Progress (5): 279 kB | 0.7/3.0 MB | 175 kB | 219 kB | 45/351 kB
2026-11-17T17:28:22.5052370Z Progress (5): 279 kB | 0.7/3.0 MB | 175 kB | 219 kB | 45/351 kB
2026-11-17T17:28:22.5053401Z Progress (5): 279 kB | 0.7/3.0 MB | 175 kB | 219 kB | 49/351 kB
2026-11-17T17:28:22.5053821Z Progress (5): 279 kB | 0.8/3.0 MB | 175 kB | 219 kB | 49/351 kB
2026-11-17T17:28:22.5054765Z Progress (5): 279 kB | 0.8/3.0 MB | 175 kB | 219 kB | 53/351 kB
2026-11-17T17:28:22.5055179Z Progress (5): 279 kB | 0.8/3.0 MB | 175 kB | 219 kB | 57/351 kB
2026-11-17T17:28:22.5055651Z Progress (5): 279 kB | 0.8/3.0 MB | 175 kB | 219 kB | 57/351 kB
2026-11-17T17:28:22.5056464Z Progress (5): 279 kB | 0.8/3.0 MB | 175 kB | 219 kB | 61/351 kB
2026-11-17T17:28:22.5056829Z Progress (5): 279 kB | 0.8/3.0 MB | 175 kB | 219 kB | 66/351 kB
2026-11-17T17:28:22.5057364Z Progress (5): 279 kB | 0.8/3.0 MB | 175 kB | 219 kB | 66/351 kB
2026-11-17T17:28:22.5058263Z Progress (5): 279 kB | 0.8/3.0 MB | 175 kB | 219 kB | 70/351 kB
2026-11-17T17:28:22.5058616Z Progress (5): 279 kB | 0.8/3.0 MB | 175 kB | 219 kB | 74/351 kB
2026-11-17T17:28:22.5059427Z Progress (5): 279 kB | 0.8/3.0 MB | 175 kB | 219 kB | 74/351 kB
2026-11-17T17:28:22.5060223Z Progress (5): 279 kB | 0.8/3.0 MB | 175 kB | 219 kB | 78/351 kB
2026-11-17T17:28:22.5060532Z Progress (5): 279 kB | 0.8/3.0 MB | 175 kB | 219 kB | 82/351 kB
2026-11-17T17:28:22.5061142Z Progress (5): 279 kB | 0.8/3.0 MB | 175 kB | 219 kB | 82/351 kB
2026-11-17T17:28:22.5061967Z Progress (5): 279 kB | 0.8/3.0 MB | 175 kB | 219 kB | 86/351 kB
2026-11-17T17:28:22.5062452Z Progress (5): 279 kB | 0.8/3.0 MB | 175 kB | 219 kB | 90/351 kB
2026-11-17T17:28:22.5062916Z Progress (5): 279 kB | 0.8/3.0 MB | 175 kB | 219 kB | 90/351 kB
2026-11-17T17:28:22.5063862Z Progress (5): 279 kB | 0.8/3.0 MB | 175 kB | 219 kB | 94/351 kB
2026-11-17T17:28:22.5064149Z Progress (5): 279 kB | 0.8/3.0 MB | 175 kB | 219 kB | 98/351 kB
2026-11-17T17:28:22.5064988Z Progress (5): 279 kB | 0.9/3.0 MB | 175 kB | 219 kB | 98/351 kB
2026-11-17T17:28:22.5065554Z Progress (5): 279 kB | 0.9/3.0 MB | 175 kB | 219 kB | 102/351 kB
2026-11-17T17:28:22.5066032Z Progress (5): 279 kB | 0.9/3.0 MB | 175 kB | 219 kB | 106/351 kB
2026-11-17T17:28:22.5066418Z Progress (5): 279 kB | 0.9/3.0 MB | 175 kB | 219 kB | 106/351 kB
2026-11-17T17:28:22.5067254Z Progress (5): 279 kB | 0.9/3.0 MB | 175 kB | 219 kB | 111/351 kB
2026-11-17T17:28:22.5067524Z Progress (5): 279 kB | 0.9/3.0 MB | 175 kB | 219 kB | 115/351 kB
2026-11-17T17:28:22.5068122Z Progress (5): 279 kB | 0.9/3.0 MB | 175 kB | 219 kB | 115/351 kB
2026-11-17T17:28:22.5068805Z Progress (5): 279 kB | 0.9/3.0 MB | 175 kB | 219 kB | 119/351 kB
2026-11-17T17:28:22.5069446Z Progress (5): 279 kB | 0.9/3.0 MB | 175 kB | 219 kB | 123/351 kB
2026-11-17T17:28:22.5069939Z Progress (5): 279 kB | 0.9/3.0 MB | 175 kB | 219 kB | 123/351 kB
2026-11-17T17:28:22.5070677Z Progress (5): 279 kB | 0.9/3.0 MB | 175 kB | 219 kB | 127/351 kB
2026-11-17T17:28:22.5070995Z Progress (5): 279 kB | 0.9/3.0 MB | 175 kB | 219 kB | 131/351 kB
2026-11-17T17:28:22.5071414Z Progress (5): 279 kB | 0.9/3.0 MB | 175 kB | 219 kB | 131/351 kB
2026-11-17T17:28:22.5072462Z Progress (5): 279 kB | 0.9/3.0 MB | 175 kB | 219 kB | 135/351 kB
2026-11-17T17:28:22.5072735Z Progress (5): 279 kB | 0.9/3.0 MB | 175 kB | 219 kB | 139/351 kB
2026-11-17T17:28:22.5073249Z Progress (5): 279 kB | 0.9/3.0 MB | 175 kB | 219 kB | 139/351 kB
2026-11-17T17:28:22.5074008Z Progress (5): 279 kB | 0.9/3.0 MB | 175 kB | 219 kB | 143/351 kB
2026-11-17T17:28:22.5074860Z Progress (5): 279 kB | 0.9/3.0 MB | 175 kB | 219 kB | 147/351 kB
2026-11-17T17:28:22.5075366Z Progress (5): 279 kB | 1.0/3.0 MB | 175 kB | 219 kB | 147/351 kB
2026-11-17T17:28:22.5075963Z Progress (5): 279 kB | 1.0/3.0 MB | 175 kB | 219 kB | 152/351 kB
2026-11-17T17:28:22.5076788Z Progress (5): 279 kB | 1.0/3.0 MB | 175 kB | 219 kB | 156/351 kB
2026-11-17T17:28:22.5077189Z Progress (5): 279 kB | 1.0/3.0 MB | 175 kB | 219 kB | 156/351 kB
2026-11-17T17:28:22.5077956Z Progress (5): 279 kB | 1.0/3.0 MB | 175 kB | 219 kB | 160/351 kB
2026-11-17T17:28:22.5078526Z Progress (5): 279 kB | 1.0/3.0 MB | 175 kB | 219 kB | 164/351 kB
2026-11-17T17:28:22.5078918Z Progress (5): 279 kB | 1.0/3.0 MB | 175 kB | 219 kB | 164/351 kB
2026-11-17T17:28:22.5079686Z Progress (5): 279 kB | 1.0/3.0 MB | 175 kB | 219 kB | 168/351 kB
2026-11-17T17:28:22.5080250Z Progress (5): 279 kB | 1.0/3.0 MB | 175 kB | 219 kB | 172/351 kB
2026-11-17T17:28:22.5080714Z Progress (5): 279 kB | 1.0/3.0 MB | 175 kB | 219 kB | 172/351 kB
2026-11-17T17:28:22.5081448Z Progress (5): 279 kB | 1.0/3.0 MB | 175 kB | 219 kB | 176/351 kB
2026-11-17T17:28:22.5081857Z Progress (5): 279 kB | 1.0/3.0 MB | 175 kB | 219 kB | 180/351 kB
2026-11-17T17:28:22.5083511Z Progress (5): 279 kB | 1.0/3.0 MB | 175 kB | 219 kB | 180/351 kB
2026-11-17T17:28:22.5083815Z Progress (5): 279 kB | 1.0/3.0 MB | 175 kB | 219 kB | 184/351 kB
2026-11-17T17:28:22.5084092Z Progress (5): 279 kB | 1.0/3.0 MB | 175 kB | 219 kB | 188/351 kB
2026-11-17T17:28:22.5084373Z Progress (5): 279 kB | 1.0/3.0 MB | 175 kB | 219 kB | 188/351 kB
2026-11-17T17:28:22.5084818Z Progress (5): 279 kB | 1.0/3.0 MB | 175 kB | 219 kB | 193/351 kB
2026-11-17T17:28:22.5085275Z Progress (5): 279 kB | 1.0/3.0 MB | 175 kB | 219 kB | 197/351 kB
2026-11-17T17:28:22.5085784Z Progress (5): 279 kB | 1.0/3.0 MB | 175 kB | 219 kB | 197/351 kB
2026-11-17T17:28:22.5086562Z Progress (5): 279 kB | 1.0/3.0 MB | 175 kB | 219 kB | 201/351 kB
2026-11-17T17:28:22.5087327Z Progress (5): 279 kB | 1.0/3.0 MB | 175 kB | 219 kB | 205/351 kB
2026-11-17T17:28:22.5087617Z Progress (5): 279 kB | 1.1/3.0 MB | 175 kB | 219 kB | 205/351 kB
2026-11-17T17:28:22.5088150Z Progress (5): 279 kB | 1.1/3.0 MB | 175 kB | 219 kB | 209/351 kB
2026-11-17T17:28:22.5088529Z Progress (5): 279 kB | 1.1/3.0 MB | 175 kB | 219 kB | 213/351 kB
2026-11-17T17:28:22.5089094Z Progress (5): 279 kB | 1.1/3.0 MB | 175 kB | 219 kB | 213/351 kB
2026-11-17T17:28:22.5089914Z Progress (5): 279 kB | 1.1/3.0 MB | 175 kB | 219 kB | 217/351 kB
2026-11-17T17:28:22.5090222Z Progress (5): 279 kB | 1.1/3.0 MB | 175 kB | 219 kB | 221/351 kB
2026-11-17T17:28:22.5090663Z Progress (5): 279 kB | 1.1/3.0 MB | 175 kB | 219 kB | 221/351 kB
2026-11-17T17:28:22.5091907Z Progress (5): 279 kB | 1.1/3.0 MB | 175 kB | 219 kB | 225/351 kB
2026-11-17T17:28:22.5092165Z Progress (5): 279 kB | 1.1/3.0 MB | 175 kB | 219 kB | 229/351 kB
2026-11-17T17:28:22.5092693Z Progress (5): 279 kB | 1.1/3.0 MB | 175 kB | 219 kB | 229/351 kB
2026-11-17T17:28:22.5093576Z Progress (5): 279 kB | 1.1/3.0 MB | 175 kB | 219 kB | 233/351 kB
2026-11-17T17:28:22.5093946Z Progress (5): 279 kB | 1.1/3.0 MB | 175 kB | 219 kB | 238/351 kB
2026-11-17T17:28:22.5094448Z Progress (5): 279 kB | 1.1/3.0 MB | 175 kB | 219 kB | 238/351 kB
2026-11-17T17:28:22.5095366Z Progress (5): 279 kB | 1.1/3.0 MB | 175 kB | 219 kB | 242/351 kB
2026-11-17T17:28:22.5095718Z Progress (5): 279 kB | 1.1/3.0 MB | 175 kB | 219 kB | 246/351 kB
2026-11-17T17:28:22.5096379Z Progress (5): 279 kB | 1.1/3.0 MB | 175 kB | 219 kB | 246/351 kB
2026-11-17T17:28:22.5096976Z Progress (5): 279 kB | 1.1/3.0 MB | 175 kB | 219 kB | 250/351 kB
2026-11-17T17:28:22.5097404Z Progress (5): 279 kB | 1.1/3.0 MB | 175 kB | 219 kB | 254/351 kB
2026-11-17T17:28:22.5097806Z Progress (5): 279 kB | 1.2/3.0 MB | 175 kB | 219 kB | 254/351 kB
2026-11-17T17:28:22.5098664Z Progress (5): 279 kB | 1.2/3.0 MB | 175 kB | 219 kB | 258/351 kB
2026-11-17T17:28:22.5099011Z Progress (5): 279 kB | 1.2/3.0 MB | 175 kB | 219 kB | 262/351 kB
2026-11-17T17:28:22.5099698Z Progress (5): 279 kB | 1.2/3.0 MB | 175 kB | 219 kB | 262/351 kB
2026-11-17T17:28:22.5100317Z Progress (5): 279 kB | 1.2/3.0 MB | 175 kB | 219 kB | 266/351 kB
2026-11-17T17:28:22.5100758Z Progress (5): 279 kB | 1.2/3.0 MB | 175 kB | 219 kB | 270/351 kB
2026-11-17T17:28:22.5101356Z Progress (5): 279 kB | 1.2/3.0 MB | 175 kB | 219 kB | 270/351 kB
2026-11-17T17:28:22.5102226Z Progress (5): 279 kB | 1.2/3.0 MB | 175 kB | 219 kB | 274/351 kB
2026-11-17T17:28:22.5102559Z Progress (5): 279 kB | 1.2/3.0 MB | 175 kB | 219 kB | 279/351 kB
2026-11-17T17:28:22.5103157Z Progress (5): 279 kB | 1.2/3.0 MB | 175 kB | 219 kB | 279/351 kB
2026-11-17T17:28:22.5103904Z Progress (5): 279 kB | 1.2/3.0 MB | 175 kB | 219 kB | 283/351 kB
2026-11-17T17:28:22.5104424Z Progress (5): 279 kB | 1.2/3.0 MB | 175 kB | 219 kB | 287/351 kB
2026-11-17T17:28:22.5105162Z Progress (5): 279 kB | 1.2/3.0 MB | 175 kB | 219 kB | 287/351 kB
2026-11-17T17:28:22.5106200Z Progress (5): 279 kB | 1.2/3.0 MB | 175 kB | 219 kB | 291/351 kB
2026-11-17T17:28:22.5106454Z Progress (5): 279 kB | 1.2/3.0 MB | 175 kB | 219 kB | 295/351 kB
2026-11-17T17:28:22.5106884Z Progress (5): 279 kB | 1.2/3.0 MB | 175 kB | 219 kB | 295/351 kB
2026-11-17T17:28:22.5107681Z Progress (5): 279 kB | 1.2/3.0 MB | 175 kB | 219 kB | 299/351 kB
2026-11-17T17:28:22.5107990Z Progress (5): 279 kB | 1.2/3.0 MB | 175 kB | 219 kB | 303/351 kB
2026-11-17T17:28:22.5108644Z Progress (5): 279 kB | 1.3/3.0 MB | 175 kB | 219 kB | 303/351 kB
2026-11-17T17:28:22.5109516Z Progress (5): 279 kB | 1.3/3.0 MB | 175 kB | 219 kB | 307/351 kB
2026-11-17T17:28:22.5109836Z Progress (5): 279 kB | 1.3/3.0 MB | 175 kB | 219 kB | 311/351 kB
2026-11-17T17:28:22.5110626Z Progress (5): 279 kB | 1.3/3.0 MB | 175 kB | 219 kB | 311/351 kB
2026-11-17T17:28:22.5111729Z Progress (5): 279 kB | 1.3/3.0 MB | 175 kB | 219 kB | 315/351 kB
2026-11-17T17:28:22.5111928Z Progress (5): 279 kB | 1.3/3.0 MB | 175 kB | 219 kB | 319/351 kB
2026-11-17T17:28:22.5112415Z Progress (5): 279 kB | 1.3/3.0 MB | 175 kB | 219 kB | 319/351 kB
2026-11-17T17:28:22.5113377Z Progress (5): 279 kB | 1.3/3.0 MB | 175 kB | 219 kB | 324/351 kB
2026-11-17T17:28:22.5113645Z Progress (5): 279 kB | 1.3/3.0 MB | 175 kB | 219 kB | 328/351 kB
2026-11-17T17:28:22.5114233Z Progress (5): 279 kB | 1.3/3.0 MB | 175 kB | 219 kB | 328/351 kB
2026-11-17T17:28:22.5114971Z Progress (5): 279 kB | 1.3/3.0 MB | 175 kB | 219 kB | 332/351 kB
2026-11-17T17:28:22.5115459Z Progress (5): 279 kB | 1.3/3.0 MB | 175 kB | 219 kB | 336/351 kB
2026-11-17T17:28:22.5116021Z Progress (5): 279 kB | 1.3/3.0 MB | 175 kB | 219 kB | 336/351 kB
2026-11-17T17:28:22.5116682Z Progress (5): 279 kB | 1.3/3.0 MB | 175 kB | 219 kB | 340/351 kB
2026-11-17T17:28:22.5117020Z Progress (5): 279 kB | 1.3/3.0 MB | 175 kB | 219 kB | 344/351 kB
2026-11-17T17:28:22.5117552Z Progress (5): 279 kB | 1.3/3.0 MB | 175 kB | 219 kB | 344/351 kB
2026-11-17T17:28:22.5118265Z Progress (5): 279 kB | 1.3/3.0 MB | 175 kB | 219 kB | 348/351 kB
2026-11-17T17:28:22.5118847Z Progress (5): 279 kB | 1.3/3.0 MB | 175 kB | 219 kB | 351 kB    
2026-11-17T17:28:22.5120443Z Progress (5): 279 kB | 1.4/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5121653Z Progress (5): 279 kB | 1.4/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5123127Z Progress (5): 279 kB | 1.4/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5124830Z Progress (5): 279 kB | 1.4/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5126187Z Progress (5): 279 kB | 1.4/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5127497Z Progress (5): 279 kB | 1.4/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5129008Z Progress (5): 279 kB | 1.5/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5130399Z Progress (5): 279 kB | 1.5/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5131498Z Progress (5): 279 kB | 1.5/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5133041Z Progress (5): 279 kB | 1.5/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5134261Z Progress (5): 279 kB | 1.5/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5135573Z Progress (5): 279 kB | 1.5/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5136930Z Progress (5): 279 kB | 1.6/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5138237Z Progress (5): 279 kB | 1.6/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5139647Z Progress (5): 279 kB | 1.6/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5141390Z Progress (5): 279 kB | 1.6/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5142670Z Progress (5): 279 kB | 1.6/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5144112Z Progress (5): 279 kB | 1.6/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5145472Z Progress (5): 279 kB | 1.7/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5146835Z Progress (5): 279 kB | 1.7/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5148283Z Progress (5): 279 kB | 1.7/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5149660Z Progress (5): 279 kB | 1.7/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5150988Z Progress (5): 279 kB | 1.7/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5152320Z Progress (5): 279 kB | 1.7/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5153656Z Progress (5): 279 kB | 1.8/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5155123Z Progress (5): 279 kB | 1.8/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5156420Z Progress (5): 279 kB | 1.8/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5157747Z Progress (5): 279 kB | 1.8/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5159480Z Progress (5): 279 kB | 1.8/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5160825Z Progress (5): 279 kB | 1.8/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5162163Z Progress (5): 279 kB | 1.9/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5163498Z Progress (5): 279 kB | 1.9/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5164917Z Progress (5): 279 kB | 1.9/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5166019Z Progress (5): 279 kB | 1.9/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5167410Z Progress (5): 279 kB | 1.9/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5168734Z Progress (5): 279 kB | 1.9/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5170176Z Progress (5): 279 kB | 1.9/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5171498Z Progress (5): 279 kB | 2.0/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5172788Z Progress (5): 279 kB | 2.0/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5174193Z Progress (5): 279 kB | 2.0/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5175673Z Progress (5): 279 kB | 2.0/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5176614Z Progress (5): 279 kB | 2.0/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5178086Z Progress (5): 279 kB | 2.0/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5179650Z Progress (5): 279 kB | 2.1/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5181503Z Progress (5): 279 kB | 2.1/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5183369Z Progress (5): 279 kB | 2.1/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5184640Z Progress (5): 279 kB | 2.1/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5185864Z Progress (5): 279 kB | 2.1/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5187145Z Progress (5): 279 kB | 2.1/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5188445Z Progress (5): 279 kB | 2.2/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5189544Z Progress (5): 279 kB | 2.2/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5191142Z Progress (5): 279 kB | 2.2/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5192411Z Progress (5): 279 kB | 2.2/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5194317Z Progress (5): 279 kB | 2.2/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5195739Z Progress (5): 279 kB | 2.2/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5197170Z Progress (5): 279 kB | 2.3/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5198553Z Progress (5): 279 kB | 2.3/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5199991Z Progress (5): 279 kB | 2.3/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5201328Z Progress (5): 279 kB | 2.3/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5202666Z Progress (5): 279 kB | 2.3/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5203827Z Progress (5): 279 kB | 2.3/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5205195Z Progress (5): 279 kB | 2.4/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5206486Z Progress (5): 279 kB | 2.4/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5207943Z Progress (5): 279 kB | 2.4/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5209413Z Progress (5): 279 kB | 2.4/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5210587Z Progress (5): 279 kB | 2.4/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5212832Z Progress (5): 279 kB | 2.4/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5214412Z Progress (5): 279 kB | 2.5/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5215569Z Progress (5): 279 kB | 2.5/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5216817Z Progress (5): 279 kB | 2.5/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5218071Z Progress (5): 279 kB | 2.5/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5219292Z Progress (5): 279 kB | 2.5/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5220562Z Progress (5): 279 kB | 2.5/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5221821Z Progress (5): 279 kB | 2.6/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5223045Z Progress (5): 279 kB | 2.6/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5224259Z Progress (5): 279 kB | 2.6/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5226207Z Progress (5): 279 kB | 2.6/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5227519Z Progress (5): 279 kB | 2.6/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5228769Z Progress (5): 279 kB | 2.6/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5230091Z Progress (5): 279 kB | 2.7/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5231481Z Progress (5): 279 kB | 2.7/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5232781Z Progress (5): 279 kB | 2.7/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5234094Z Progress (5): 279 kB | 2.7/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5235338Z Progress (5): 279 kB | 2.7/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5236664Z Progress (5): 279 kB | 2.7/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5237937Z Progress (5): 279 kB | 2.8/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5239198Z Progress (5): 279 kB | 2.8/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5240483Z Progress (5): 279 kB | 2.8/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5241649Z Progress (5): 279 kB | 2.8/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5242852Z Progress (5): 279 kB | 2.8/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5244095Z Progress (5): 279 kB | 2.8/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5245466Z Progress (5): 279 kB | 2.9/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5246739Z Progress (5): 279 kB | 2.9/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5247983Z Progress (5): 279 kB | 2.9/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5249474Z Progress (5): 279 kB | 2.9/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5250785Z Progress (5): 279 kB | 2.9/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5252024Z Progress (5): 279 kB | 2.9/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5253402Z Progress (5): 279 kB | 2.9/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5254630Z Progress (5): 279 kB | 3.0/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5255855Z Progress (5): 279 kB | 3.0/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5257027Z Progress (5): 279 kB | 3.0/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5257959Z Progress (5): 279 kB | 3.0/3.0 MB | 175 kB | 219 kB | 351 kB
2026-11-17T17:28:22.5277728Z Progress (5): 279 kB | 3.0 MB | 175 kB | 219 kB | 351 kB    
2026-11-17T17:28:22.5277866Z                                                         
2026-11-17T17:28:22.5279020Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/log4j/log4j/1.2.7/log4j-1.2.7.jar (351 kB at 2.2 MB/s)
2026-11-17T17:28:22.5279806Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-lang/commons-lang/2.5/commons-lang-2.5.jar (279 kB at 1.8 MB/s)
2026-11-17T17:28:22.5280425Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/javax/xml/jaxp-api/1.4/jaxp-api-1.4.jar (219 kB at 1.4 MB/s)
2026-11-17T17:28:22.5281085Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/mysql/mysql-connector-java/5.1.22/mysql-connector-java-5.1.22.jar
2026-11-17T17:28:22.5281887Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/struts/struts/1.2.4/struts-1.2.4.jar
2026-11-17T17:28:22.5282527Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-collections/commons-collections/2.1.1/commons-collections-2.1.1.jar (175 kB at 1.1 MB/s)
2026-11-17T17:28:22.5283182Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jboss/resteasy/resteasy-jaxrs/2.2.1.GA/resteasy-jaxrs-2.2.1.GA.jar
2026-11-17T17:28:22.5283779Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jboss/resteasy/jaxrs-api/2.2.1.GA/jaxrs-api-2.2.1.GA.jar
2026-11-17T17:28:22.5443640Z Progress (2): 3.0 MB | 2.3/577 kB
2026-11-17T17:28:22.5444124Z Progress (2): 3.0 MB | 6.4/577 kB
2026-11-17T17:28:22.5444661Z Progress (3): 3.0 MB | 6.4/577 kB | 7.7/833 kB
2026-11-17T17:28:22.5444935Z Progress (3): 3.0 MB | 10/577 kB | 7.7/833 kB 
2026-11-17T17:28:22.5445196Z Progress (3): 3.0 MB | 15/577 kB | 7.7/833 kB
2026-11-17T17:28:22.5445445Z Progress (3): 3.0 MB | 15/577 kB | 16/833 kB 
2026-11-17T17:28:22.5445607Z Progress (3): 3.0 MB | 19/577 kB | 16/833 kB
2026-11-17T17:28:22.5445826Z Progress (3): 3.0 MB | 19/577 kB | 24/833 kB
2026-11-17T17:28:22.5446372Z Progress (3): 3.0 MB | 23/577 kB | 24/833 kB
2026-11-17T17:28:22.5446604Z Progress (3): 3.0 MB | 23/577 kB | 32/833 kB
2026-11-17T17:28:22.5447107Z Progress (3): 3.0 MB | 27/577 kB | 32/833 kB
2026-11-17T17:28:22.5447604Z Progress (3): 3.0 MB | 27/577 kB | 40/833 kB
2026-11-17T17:28:22.5447989Z Progress (3): 3.0 MB | 31/577 kB | 40/833 kB
2026-11-17T17:28:22.5448264Z Progress (3): 3.0 MB | 31/577 kB | 49/833 kB
2026-11-17T17:28:22.5448809Z Progress (3): 3.0 MB | 35/577 kB | 49/833 kB
2026-11-17T17:28:22.5449825Z Progress (3): 3.0 MB | 35/577 kB | 57/833 kB
2026-11-17T17:28:22.5450118Z Progress (4): 3.0 MB | 35/577 kB | 57/833 kB | 4.1/527 kB
2026-11-17T17:28:22.5450575Z Progress (4): 3.0 MB | 35/577 kB | 65/833 kB | 4.1/527 kB
2026-11-17T17:28:22.5451050Z Progress (4): 3.0 MB | 39/577 kB | 65/833 kB | 4.1/527 kB
2026-11-17T17:28:22.5452116Z Progress (4): 3.0 MB | 39/577 kB | 65/833 kB | 7.7/527 kB
2026-11-17T17:28:22.5452376Z Progress (4): 3.0 MB | 43/577 kB | 65/833 kB | 7.7/527 kB
2026-11-17T17:28:22.5461187Z Progress (4): 3.0 MB | 43/577 kB | 73/833 kB | 7.7/527 kB
2026-11-17T17:28:22.5461412Z Progress (4): 3.0 MB | 47/577 kB | 73/833 kB | 7.7/527 kB
2026-11-17T17:28:22.5461581Z Progress (4): 3.0 MB | 47/577 kB | 73/833 kB | 12/527 kB 
2026-11-17T17:28:22.5461774Z Progress (4): 3.0 MB | 51/577 kB | 73/833 kB | 12/527 kB
2026-11-17T17:28:22.5462005Z Progress (4): 3.0 MB | 51/577 kB | 73/833 kB | 16/527 kB
2026-11-17T17:28:22.5462169Z Progress (4): 3.0 MB | 51/577 kB | 81/833 kB | 16/527 kB
2026-11-17T17:28:22.5462499Z Progress (4): 3.0 MB | 51/577 kB | 81/833 kB | 20/527 kB
2026-11-17T17:28:22.5462666Z Progress (4): 3.0 MB | 56/577 kB | 81/833 kB | 20/527 kB
2026-11-17T17:28:22.5462832Z Progress (4): 3.0 MB | 56/577 kB | 81/833 kB | 24/527 kB
2026-11-17T17:28:22.5463007Z Progress (4): 3.0 MB | 56/577 kB | 90/833 kB | 24/527 kB
2026-11-17T17:28:22.5463174Z Progress (4): 3.0 MB | 56/577 kB | 90/833 kB | 28/527 kB
2026-11-17T17:28:22.5463297Z Progress (4): 3.0 MB | 60/577 kB | 90/833 kB | 28/527 kB
2026-11-17T17:28:22.5463463Z Progress (4): 3.0 MB | 60/577 kB | 90/833 kB | 32/527 kB
2026-11-17T17:28:22.5463622Z Progress (4): 3.0 MB | 60/577 kB | 98/833 kB | 32/527 kB
2026-11-17T17:28:22.5463762Z                                                         
2026-11-17T17:28:22.5464628Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/net/sf/jasperreports/jasperreports/3.7.6/jasperreports-3.7.6.jar (3.0 MB at 17 MB/s)
2026-11-17T17:28:22.5464911Z Progress (3): 60/577 kB | 98/833 kB | 36/527 kB
2026-11-17T17:28:22.5465154Z Progress (3): 64/577 kB | 98/833 kB | 36/527 kB
2026-11-17T17:28:22.5465349Z Progress (3): 64/577 kB | 98/833 kB | 40/527 kB
2026-11-17T17:28:22.5465521Z                                                
2026-11-17T17:28:22.5466019Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/scannotation/scannotation/1.0.3/scannotation-1.0.3.jar
2026-11-17T17:28:22.5466231Z Progress (3): 68/577 kB | 98/833 kB | 40/527 kB
2026-11-17T17:28:22.5466357Z Progress (3): 68/577 kB | 102/833 kB | 40/527 kB
2026-11-17T17:28:22.5466576Z Progress (3): 68/577 kB | 102/833 kB | 45/527 kB
2026-11-17T17:28:22.5466766Z Progress (3): 72/577 kB | 102/833 kB | 45/527 kB
2026-11-17T17:28:22.5466933Z Progress (3): 72/577 kB | 102/833 kB | 49/527 kB
2026-11-17T17:28:22.5467085Z Progress (3): 76/577 kB | 102/833 kB | 49/527 kB
2026-11-17T17:28:22.5467236Z Progress (3): 76/577 kB | 102/833 kB | 53/527 kB
2026-11-17T17:28:22.5467400Z Progress (3): 76/577 kB | 111/833 kB | 53/527 kB
2026-11-17T17:28:22.5467549Z Progress (3): 76/577 kB | 111/833 kB | 57/527 kB
2026-11-17T17:28:22.5467669Z Progress (3): 80/577 kB | 111/833 kB | 57/527 kB
2026-11-17T17:28:22.5467823Z Progress (3): 80/577 kB | 111/833 kB | 61/527 kB
2026-11-17T17:28:22.5467977Z Progress (3): 80/577 kB | 119/833 kB | 61/527 kB
2026-11-17T17:28:22.5468163Z Progress (3): 80/577 kB | 119/833 kB | 65/527 kB
2026-11-17T17:28:22.5468325Z Progress (3): 80/577 kB | 127/833 kB | 65/527 kB
2026-11-17T17:28:22.5468481Z Progress (3): 80/577 kB | 135/833 kB | 65/527 kB
2026-11-17T17:28:22.5469492Z Progress (3): 80/577 kB | 143/833 kB | 65/527 kB
2026-11-17T17:28:22.5471484Z Progress (3): 80/577 kB | 152/833 kB | 65/527 kB
2026-11-17T17:28:22.5471699Z Progress (3): 80/577 kB | 160/833 kB | 65/527 kB
2026-11-17T17:28:22.5472311Z Progress (3): 80/577 kB | 168/833 kB | 65/527 kB
2026-11-17T17:28:22.5472891Z Progress (4): 80/577 kB | 168/833 kB | 65/527 kB | 4.1/46 kB
2026-11-17T17:28:22.5473323Z Progress (4): 84/577 kB | 168/833 kB | 65/527 kB | 4.1/46 kB
2026-11-17T17:28:22.5474201Z Progress (4): 84/577 kB | 176/833 kB | 65/527 kB | 4.1/46 kB
2026-11-17T17:28:22.5474493Z Progress (4): 84/577 kB | 176/833 kB | 69/527 kB | 4.1/46 kB
2026-11-17T17:28:22.5475543Z Progress (4): 84/577 kB | 184/833 kB | 69/527 kB | 4.1/46 kB
2026-11-17T17:28:22.5476161Z Progress (4): 84/577 kB | 184/833 kB | 73/527 kB | 4.1/46 kB
2026-11-17T17:28:22.5476803Z Progress (4): 88/577 kB | 184/833 kB | 73/527 kB | 4.1/46 kB
2026-11-17T17:28:22.5477263Z Progress (4): 88/577 kB | 184/833 kB | 73/527 kB | 7.7/46 kB
2026-11-17T17:28:22.5477952Z Progress (4): 92/577 kB | 184/833 kB | 73/527 kB | 7.7/46 kB
2026-11-17T17:28:22.5478134Z Progress (4): 92/577 kB | 184/833 kB | 73/527 kB | 12/46 kB 
2026-11-17T17:28:22.5478395Z Progress (4): 96/577 kB | 184/833 kB | 73/527 kB | 12/46 kB
2026-11-17T17:28:22.5479284Z Progress (4): 96/577 kB | 184/833 kB | 73/527 kB | 16/46 kB
2026-11-17T17:28:22.5479615Z Progress (4): 96/577 kB | 184/833 kB | 77/527 kB | 16/46 kB
2026-11-17T17:28:22.5480413Z Progress (4): 96/577 kB | 193/833 kB | 77/527 kB | 16/46 kB
2026-11-17T17:28:22.5480867Z Progress (4): 96/577 kB | 193/833 kB | 81/527 kB | 16/46 kB
2026-11-17T17:28:22.5481961Z Progress (4): 96/577 kB | 193/833 kB | 81/527 kB | 20/46 kB
2026-11-17T17:28:22.5482141Z Progress (4): 101/577 kB | 193/833 kB | 81/527 kB | 20/46 kB
2026-11-17T17:28:22.5482277Z Progress (4): 101/577 kB | 193/833 kB | 81/527 kB | 24/46 kB
2026-11-17T17:28:22.5482550Z Progress (4): 105/577 kB | 193/833 kB | 81/527 kB | 24/46 kB
2026-11-17T17:28:22.5483013Z Progress (4): 105/577 kB | 193/833 kB | 86/527 kB | 24/46 kB
2026-11-17T17:28:22.5483451Z Progress (4): 105/577 kB | 201/833 kB | 86/527 kB | 24/46 kB
2026-11-17T17:28:22.5484011Z Progress (4): 105/577 kB | 201/833 kB | 90/527 kB | 24/46 kB
2026-11-17T17:28:22.5484393Z Progress (4): 109/577 kB | 201/833 kB | 90/527 kB | 24/46 kB
2026-11-17T17:28:22.5485188Z Progress (4): 109/577 kB | 201/833 kB | 90/527 kB | 28/46 kB
2026-11-17T17:28:22.5485441Z Progress (4): 113/577 kB | 201/833 kB | 90/527 kB | 28/46 kB
2026-11-17T17:28:22.5485759Z Progress (4): 113/577 kB | 201/833 kB | 94/527 kB | 28/46 kB
2026-11-17T17:28:22.5486278Z Progress (4): 117/577 kB | 201/833 kB | 94/527 kB | 28/46 kB
2026-11-17T17:28:22.5486757Z Progress (4): 117/577 kB | 209/833 kB | 94/527 kB | 28/46 kB
2026-11-17T17:28:22.5487416Z Progress (4): 121/577 kB | 209/833 kB | 94/527 kB | 28/46 kB
2026-11-17T17:28:22.5487737Z Progress (4): 121/577 kB | 209/833 kB | 98/527 kB | 28/46 kB
2026-11-17T17:28:22.5488075Z Progress (4): 121/577 kB | 209/833 kB | 98/527 kB | 32/46 kB
2026-11-17T17:28:22.5488596Z Progress (4): 121/577 kB | 209/833 kB | 102/527 kB | 32/46 kB
2026-11-17T17:28:22.5489002Z Progress (4): 121/577 kB | 209/833 kB | 102/527 kB | 36/46 kB
2026-11-17T17:28:22.5489437Z Progress (4): 125/577 kB | 209/833 kB | 102/527 kB | 36/46 kB
2026-11-17T17:28:22.5489939Z Progress (4): 125/577 kB | 217/833 kB | 102/527 kB | 36/46 kB
2026-11-17T17:28:22.5490428Z Progress (4): 129/577 kB | 217/833 kB | 102/527 kB | 36/46 kB
2026-11-17T17:28:22.5490949Z Progress (4): 129/577 kB | 225/833 kB | 102/527 kB | 36/46 kB
2026-11-17T17:28:22.5491303Z Progress (4): 129/577 kB | 225/833 kB | 102/527 kB | 41/46 kB
2026-11-17T17:28:22.5491617Z Progress (4): 129/577 kB | 233/833 kB | 102/527 kB | 41/46 kB
2026-11-17T17:28:22.5492185Z Progress (4): 129/577 kB | 233/833 kB | 102/527 kB | 45/46 kB
2026-11-17T17:28:22.5492494Z Progress (4): 129/577 kB | 233/833 kB | 106/527 kB | 45/46 kB
2026-11-17T17:28:22.5492967Z Progress (4): 129/577 kB | 233/833 kB | 106/527 kB | 46 kB   
2026-11-17T17:28:22.5493380Z Progress (4): 129/577 kB | 242/833 kB | 106/527 kB | 46 kB
2026-11-17T17:28:22.5494047Z Progress (4): 133/577 kB | 242/833 kB | 106/527 kB | 46 kB
2026-11-17T17:28:22.5494865Z Progress (4): 133/577 kB | 250/833 kB | 106/527 kB | 46 kB
2026-11-17T17:28:22.5495186Z Progress (4): 133/577 kB | 250/833 kB | 110/527 kB | 46 kB
2026-11-17T17:28:22.5495609Z Progress (4): 133/577 kB | 258/833 kB | 110/527 kB | 46 kB
2026-11-17T17:28:22.5496273Z Progress (4): 137/577 kB | 258/833 kB | 110/527 kB | 46 kB
2026-11-17T17:28:22.5496603Z Progress (4): 137/577 kB | 258/833 kB | 114/527 kB | 46 kB
2026-11-17T17:28:22.5497129Z Progress (4): 142/577 kB | 258/833 kB | 114/527 kB | 46 kB
2026-11-17T17:28:22.5497499Z Progress (4): 142/577 kB | 258/833 kB | 118/527 kB | 46 kB
2026-11-17T17:28:22.5498076Z Progress (4): 142/577 kB | 266/833 kB | 118/527 kB | 46 kB
2026-11-17T17:28:22.5498410Z Progress (4): 142/577 kB | 266/833 kB | 122/527 kB | 46 kB
2026-11-17T17:28:22.5498938Z Progress (4): 142/577 kB | 274/833 kB | 122/527 kB | 46 kB
2026-11-17T17:28:22.5499310Z Progress (4): 146/577 kB | 274/833 kB | 122/527 kB | 46 kB
2026-11-17T17:28:22.5499904Z Progress (4): 146/577 kB | 283/833 kB | 122/527 kB | 46 kB
2026-11-17T17:28:22.5500374Z Progress (4): 146/577 kB | 283/833 kB | 127/527 kB | 46 kB
2026-11-17T17:28:22.5501205Z Progress (4): 146/577 kB | 291/833 kB | 127/527 kB | 46 kB
2026-11-17T17:28:22.5501376Z Progress (4): 150/577 kB | 291/833 kB | 127/527 kB | 46 kB
2026-11-17T17:28:22.5501741Z Progress (4): 150/577 kB | 299/833 kB | 127/527 kB | 46 kB
2026-11-17T17:28:22.5502133Z Progress (4): 150/577 kB | 299/833 kB | 131/527 kB | 46 kB
2026-11-17T17:28:22.5502532Z Progress (4): 150/577 kB | 307/833 kB | 131/527 kB | 46 kB
2026-11-17T17:28:22.5502910Z Progress (4): 154/577 kB | 307/833 kB | 131/527 kB | 46 kB
2026-11-17T17:28:22.5503425Z Progress (4): 154/577 kB | 307/833 kB | 135/527 kB | 46 kB
2026-11-17T17:28:22.5503754Z Progress (4): 158/577 kB | 307/833 kB | 135/527 kB | 46 kB
2026-11-17T17:28:22.5504452Z Progress (4): 158/577 kB | 315/833 kB | 135/527 kB | 46 kB
2026-11-17T17:28:22.5504980Z Progress (4): 162/577 kB | 315/833 kB | 135/527 kB | 46 kB
2026-11-17T17:28:22.5505317Z Progress (4): 162/577 kB | 315/833 kB | 139/527 kB | 46 kB
2026-11-17T17:28:22.5506155Z Progress (4): 162/577 kB | 324/833 kB | 139/527 kB | 46 kB
2026-11-17T17:28:22.5506573Z Progress (4): 166/577 kB | 324/833 kB | 139/527 kB | 46 kB
2026-11-17T17:28:22.5507066Z Progress (4): 166/577 kB | 332/833 kB | 139/527 kB | 46 kB
2026-11-17T17:28:22.5507459Z Progress (4): 166/577 kB | 332/833 kB | 143/527 kB | 46 kB
2026-11-17T17:28:22.5507949Z Progress (4): 166/577 kB | 340/833 kB | 143/527 kB | 46 kB
2026-11-17T17:28:22.5508299Z Progress (4): 170/577 kB | 340/833 kB | 143/527 kB | 46 kB
2026-11-17T17:28:22.5508784Z Progress (4): 170/577 kB | 340/833 kB | 147/527 kB | 46 kB
2026-11-17T17:28:22.5509161Z Progress (4): 174/577 kB | 340/833 kB | 147/527 kB | 46 kB
2026-11-17T17:28:22.5509592Z Progress (4): 174/577 kB | 348/833 kB | 147/527 kB | 46 kB
2026-11-17T17:28:22.5510016Z Progress (4): 178/577 kB | 348/833 kB | 147/527 kB | 46 kB
2026-11-17T17:28:22.5510542Z Progress (4): 178/577 kB | 348/833 kB | 151/527 kB | 46 kB
2026-11-17T17:28:22.5511088Z Progress (4): 182/577 kB | 348/833 kB | 151/527 kB | 46 kB
2026-11-17T17:28:22.5511322Z Progress (4): 182/577 kB | 356/833 kB | 151/527 kB | 46 kB
2026-11-17T17:28:22.5511778Z Progress (4): 187/577 kB | 356/833 kB | 151/527 kB | 46 kB
2026-11-17T17:28:22.5512124Z Progress (4): 187/577 kB | 356/833 kB | 155/527 kB | 46 kB
2026-11-17T17:28:22.5512597Z Progress (4): 191/577 kB | 356/833 kB | 155/527 kB | 46 kB
2026-11-17T17:28:22.5512980Z Progress (4): 191/577 kB | 365/833 kB | 155/527 kB | 46 kB
2026-11-17T17:28:22.5513545Z Progress (4): 195/577 kB | 365/833 kB | 155/527 kB | 46 kB
2026-11-17T17:28:22.5513895Z Progress (4): 195/577 kB | 365/833 kB | 159/527 kB | 46 kB
2026-11-17T17:28:22.5514340Z Progress (4): 199/577 kB | 365/833 kB | 159/527 kB | 46 kB
2026-11-17T17:28:22.5514853Z Progress (4): 199/577 kB | 373/833 kB | 159/527 kB | 46 kB
2026-11-17T17:28:22.5515365Z Progress (4): 203/577 kB | 373/833 kB | 159/527 kB | 46 kB
2026-11-17T17:28:22.5515767Z Progress (4): 203/577 kB | 373/833 kB | 163/527 kB | 46 kB
2026-11-17T17:28:22.5516217Z Progress (4): 207/577 kB | 373/833 kB | 163/527 kB | 46 kB
2026-11-17T17:28:22.5516626Z Progress (4): 207/577 kB | 381/833 kB | 163/527 kB | 46 kB
2026-11-17T17:28:22.5517103Z Progress (4): 211/577 kB | 381/833 kB | 163/527 kB | 46 kB
2026-11-17T17:28:22.5517486Z Progress (4): 211/577 kB | 381/833 kB | 167/527 kB | 46 kB
2026-11-17T17:28:22.5517995Z Progress (4): 215/577 kB | 381/833 kB | 167/527 kB | 46 kB
2026-11-17T17:28:22.5518367Z Progress (4): 215/577 kB | 389/833 kB | 167/527 kB | 46 kB
2026-11-17T17:28:22.5518906Z Progress (4): 219/577 kB | 389/833 kB | 167/527 kB | 46 kB
2026-11-17T17:28:22.5519258Z Progress (4): 219/577 kB | 389/833 kB | 172/527 kB | 46 kB
2026-11-17T17:28:22.5519659Z Progress (4): 223/577 kB | 389/833 kB | 172/527 kB | 46 kB
2026-11-17T17:28:22.5520115Z Progress (4): 223/577 kB | 397/833 kB | 172/527 kB | 46 kB
2026-11-17T17:28:22.5520658Z Progress (4): 228/577 kB | 397/833 kB | 172/527 kB | 46 kB
2026-11-17T17:28:22.5520982Z Progress (4): 228/577 kB | 397/833 kB | 176/527 kB | 46 kB
2026-11-17T17:28:22.5521473Z Progress (4): 232/577 kB | 397/833 kB | 176/527 kB | 46 kB
2026-11-17T17:28:22.5521922Z Progress (4): 232/577 kB | 406/833 kB | 176/527 kB | 46 kB
2026-11-17T17:28:22.5522374Z Progress (4): 236/577 kB | 406/833 kB | 176/527 kB | 46 kB
2026-11-17T17:28:22.5522787Z Progress (4): 236/577 kB | 406/833 kB | 180/527 kB | 46 kB
2026-11-17T17:28:22.5523134Z Progress (4): 240/577 kB | 406/833 kB | 180/527 kB | 46 kB
2026-11-17T17:28:22.5523681Z Progress (4): 240/577 kB | 406/833 kB | 184/527 kB | 46 kB
2026-11-17T17:28:22.5524110Z Progress (4): 240/577 kB | 414/833 kB | 184/527 kB | 46 kB
2026-11-17T17:28:22.5524768Z Progress (4): 240/577 kB | 414/833 kB | 188/527 kB | 46 kB
2026-11-17T17:28:22.5525067Z Progress (4): 244/577 kB | 414/833 kB | 188/527 kB | 46 kB
2026-11-17T17:28:22.5525604Z Progress (4): 244/577 kB | 414/833 kB | 192/527 kB | 46 kB
2026-11-17T17:28:22.5525842Z Progress (4): 244/577 kB | 422/833 kB | 192/527 kB | 46 kB
2026-11-17T17:28:22.5526619Z Progress (4): 244/577 kB | 422/833 kB | 196/527 kB | 46 kB
2026-11-17T17:28:22.5526871Z Progress (4): 248/577 kB | 422/833 kB | 196/527 kB | 46 kB
2026-11-17T17:28:22.5527320Z Progress (4): 248/577 kB | 422/833 kB | 200/527 kB | 46 kB
2026-11-17T17:28:22.5527755Z Progress (4): 248/577 kB | 430/833 kB | 200/527 kB | 46 kB
2026-11-17T17:28:22.5528177Z Progress (4): 248/577 kB | 430/833 kB | 204/527 kB | 46 kB
2026-11-17T17:28:22.5528766Z Progress (4): 252/577 kB | 430/833 kB | 204/527 kB | 46 kB
2026-11-17T17:28:22.5529278Z Progress (4): 252/577 kB | 430/833 kB | 208/527 kB | 46 kB
2026-11-17T17:28:22.5529573Z Progress (4): 252/577 kB | 438/833 kB | 208/527 kB | 46 kB
2026-11-17T17:28:22.5530079Z Progress (4): 252/577 kB | 438/833 kB | 213/527 kB | 46 kB
2026-11-17T17:28:22.5530323Z Progress (4): 252/577 kB | 446/833 kB | 213/527 kB | 46 kB
2026-11-17T17:28:22.5530771Z Progress (4): 252/577 kB | 446/833 kB | 217/527 kB | 46 kB
2026-11-17T17:28:22.5531270Z Progress (4): 256/577 kB | 446/833 kB | 217/527 kB | 46 kB
2026-11-17T17:28:22.5531790Z Progress (4): 256/577 kB | 446/833 kB | 221/527 kB | 46 kB
2026-11-17T17:28:22.5532213Z Progress (4): 256/577 kB | 455/833 kB | 221/527 kB | 46 kB
2026-11-17T17:28:22.5532546Z Progress (4): 256/577 kB | 455/833 kB | 225/527 kB | 46 kB
2026-11-17T17:28:22.5533091Z Progress (4): 260/577 kB | 455/833 kB | 225/527 kB | 46 kB
2026-11-17T17:28:22.5533464Z Progress (4): 260/577 kB | 455/833 kB | 229/527 kB | 46 kB
2026-11-17T17:28:22.5534097Z Progress (4): 260/577 kB | 463/833 kB | 229/527 kB | 46 kB
2026-11-17T17:28:22.5534545Z Progress (4): 260/577 kB | 463/833 kB | 233/527 kB | 46 kB
2026-11-17T17:28:22.5535202Z Progress (4): 264/577 kB | 463/833 kB | 233/527 kB | 46 kB
2026-11-17T17:28:22.5535653Z Progress (4): 264/577 kB | 463/833 kB | 237/527 kB | 46 kB
2026-11-17T17:28:22.5536083Z Progress (4): 264/577 kB | 471/833 kB | 237/527 kB | 46 kB
2026-11-17T17:28:22.5536528Z Progress (4): 264/577 kB | 471/833 kB | 241/527 kB | 46 kB
2026-11-17T17:28:22.5536966Z Progress (4): 264/577 kB | 479/833 kB | 241/527 kB | 46 kB
2026-11-17T17:28:22.5537476Z Progress (4): 264/577 kB | 479/833 kB | 245/527 kB | 46 kB
2026-11-17T17:28:22.5538113Z Progress (4): 269/577 kB | 479/833 kB | 245/527 kB | 46 kB
2026-11-17T17:28:22.5538502Z Progress (4): 269/577 kB | 479/833 kB | 249/527 kB | 46 kB
2026-11-17T17:28:22.5539275Z Progress (4): 269/577 kB | 487/833 kB | 249/527 kB | 46 kB
2026-11-17T17:28:22.5539554Z Progress (4): 269/577 kB | 487/833 kB | 253/527 kB | 46 kB
2026-11-17T17:28:22.5540236Z Progress (4): 273/577 kB | 487/833 kB | 253/527 kB | 46 kB
2026-11-17T17:28:22.5540883Z Progress (4): 273/577 kB | 487/833 kB | 258/527 kB | 46 kB
2026-11-17T17:28:22.5541169Z Progress (4): 273/577 kB | 496/833 kB | 258/527 kB | 46 kB
2026-11-17T17:28:22.5541483Z Progress (4): 273/577 kB | 496/833 kB | 262/527 kB | 46 kB
2026-11-17T17:28:22.5541912Z Progress (4): 277/577 kB | 496/833 kB | 262/527 kB | 46 kB
2026-11-17T17:28:22.5542352Z Progress (4): 277/577 kB | 496/833 kB | 266/527 kB | 46 kB
2026-11-17T17:28:22.5542694Z Progress (4): 277/577 kB | 504/833 kB | 266/527 kB | 46 kB
2026-11-17T17:28:22.5543219Z Progress (4): 277/577 kB | 504/833 kB | 270/527 kB | 46 kB
2026-11-17T17:28:22.5543828Z Progress (4): 281/577 kB | 504/833 kB | 270/527 kB | 46 kB
2026-11-17T17:28:22.5544204Z Progress (4): 281/577 kB | 504/833 kB | 274/527 kB | 46 kB
2026-11-17T17:28:22.5544738Z Progress (4): 281/577 kB | 512/833 kB | 274/527 kB | 46 kB
2026-11-17T17:28:22.5545062Z Progress (4): 281/577 kB | 512/833 kB | 278/527 kB | 46 kB
2026-11-17T17:28:22.5545467Z Progress (4): 285/577 kB | 512/833 kB | 278/527 kB | 46 kB
2026-11-17T17:28:22.5545938Z Progress (4): 285/577 kB | 512/833 kB | 282/527 kB | 46 kB
2026-11-17T17:28:22.5546521Z Progress (4): 285/577 kB | 520/833 kB | 282/527 kB | 46 kB
2026-11-17T17:28:22.5546852Z Progress (4): 285/577 kB | 520/833 kB | 286/527 kB | 46 kB
2026-11-17T17:28:22.5547407Z Progress (4): 289/577 kB | 520/833 kB | 286/527 kB | 46 kB
2026-11-17T17:28:22.5547820Z Progress (4): 289/577 kB | 520/833 kB | 290/527 kB | 46 kB
2026-11-17T17:28:22.5548220Z Progress (4): 293/577 kB | 520/833 kB | 290/527 kB | 46 kB
2026-11-17T17:28:22.5548641Z Progress (4): 293/577 kB | 528/833 kB | 290/527 kB | 46 kB
2026-11-17T17:28:22.5549187Z Progress (4): 297/577 kB | 528/833 kB | 290/527 kB | 46 kB
2026-11-17T17:28:22.5549557Z Progress (4): 297/577 kB | 528/833 kB | 294/527 kB | 46 kB
2026-11-17T17:28:22.5550074Z Progress (4): 301/577 kB | 528/833 kB | 294/527 kB | 46 kB
2026-11-17T17:28:22.5550410Z Progress (4): 301/577 kB | 537/833 kB | 294/527 kB | 46 kB
2026-11-17T17:28:22.5550896Z Progress (4): 305/577 kB | 537/833 kB | 294/527 kB | 46 kB
2026-11-17T17:28:22.5551238Z Progress (4): 305/577 kB | 537/833 kB | 299/527 kB | 46 kB
2026-11-17T17:28:22.5551821Z Progress (4): 309/577 kB | 537/833 kB | 299/527 kB | 46 kB
2026-11-17T17:28:22.5552180Z Progress (4): 309/577 kB | 545/833 kB | 299/527 kB | 46 kB
2026-11-17T17:28:22.5552685Z Progress (4): 314/577 kB | 545/833 kB | 299/527 kB | 46 kB
2026-11-17T17:28:22.5553044Z Progress (4): 314/577 kB | 545/833 kB | 303/527 kB | 46 kB
2026-11-17T17:28:22.5553557Z Progress (4): 318/577 kB | 545/833 kB | 303/527 kB | 46 kB
2026-11-17T17:28:22.5553894Z Progress (4): 318/577 kB | 553/833 kB | 303/527 kB | 46 kB
2026-11-17T17:28:22.5554328Z Progress (4): 322/577 kB | 553/833 kB | 303/527 kB | 46 kB
2026-11-17T17:28:22.5554918Z Progress (4): 322/577 kB | 553/833 kB | 307/527 kB | 46 kB
2026-11-17T17:28:22.5555479Z Progress (4): 326/577 kB | 553/833 kB | 307/527 kB | 46 kB
2026-11-17T17:28:22.5555899Z Progress (4): 326/577 kB | 561/833 kB | 307/527 kB | 46 kB
2026-11-17T17:28:22.5556497Z Progress (4): 330/577 kB | 561/833 kB | 307/527 kB | 46 kB
2026-11-17T17:28:22.5556764Z Progress (4): 330/577 kB | 561/833 kB | 311/527 kB | 46 kB
2026-11-17T17:28:22.5557320Z Progress (4): 334/577 kB | 561/833 kB | 311/527 kB | 46 kB
2026-11-17T17:28:22.5557711Z Progress (4): 334/577 kB | 569/833 kB | 311/527 kB | 46 kB
2026-11-17T17:28:22.5558295Z Progress (4): 338/577 kB | 569/833 kB | 311/527 kB | 46 kB
2026-11-17T17:28:22.5558629Z Progress (4): 338/577 kB | 569/833 kB | 315/527 kB | 46 kB
2026-11-17T17:28:22.5559073Z Progress (4): 342/577 kB | 569/833 kB | 315/527 kB | 46 kB
2026-11-17T17:28:22.5559719Z Progress (4): 342/577 kB | 578/833 kB | 315/527 kB | 46 kB
2026-11-17T17:28:22.5559961Z Progress (4): 346/577 kB | 578/833 kB | 315/527 kB | 46 kB
2026-11-17T17:28:22.5560449Z Progress (4): 346/577 kB | 578/833 kB | 319/527 kB | 46 kB
2026-11-17T17:28:22.5560956Z Progress (4): 350/577 kB | 578/833 kB | 319/527 kB | 46 kB
2026-11-17T17:28:22.5561285Z Progress (4): 350/577 kB | 586/833 kB | 319/527 kB | 46 kB
2026-11-17T17:28:22.5561911Z Progress (4): 355/577 kB | 586/833 kB | 319/527 kB | 46 kB
2026-11-17T17:28:22.5562215Z Progress (4): 355/577 kB | 586/833 kB | 323/527 kB | 46 kB
2026-11-17T17:28:22.5562722Z Progress (4): 359/577 kB | 586/833 kB | 323/527 kB | 46 kB
2026-11-17T17:28:22.5563088Z Progress (4): 359/577 kB | 594/833 kB | 323/527 kB | 46 kB
2026-11-17T17:28:22.5563546Z Progress (4): 363/577 kB | 594/833 kB | 323/527 kB | 46 kB
2026-11-17T17:28:22.5563999Z Progress (4): 363/577 kB | 594/833 kB | 327/527 kB | 46 kB
2026-11-17T17:28:22.5564617Z Progress (4): 367/577 kB | 594/833 kB | 327/527 kB | 46 kB
2026-11-17T17:28:22.5565021Z Progress (4): 367/577 kB | 602/833 kB | 327/527 kB | 46 kB
2026-11-17T17:28:22.5565573Z Progress (4): 371/577 kB | 602/833 kB | 327/527 kB | 46 kB
2026-11-17T17:28:22.5565902Z Progress (4): 371/577 kB | 602/833 kB | 331/527 kB | 46 kB
2026-11-17T17:28:22.5566434Z Progress (4): 375/577 kB | 602/833 kB | 331/527 kB | 46 kB
2026-11-17T17:28:22.5566755Z Progress (4): 375/577 kB | 610/833 kB | 331/527 kB | 46 kB
2026-11-17T17:28:22.5567222Z Progress (4): 379/577 kB | 610/833 kB | 331/527 kB | 46 kB
2026-11-17T17:28:22.5567630Z Progress (4): 379/577 kB | 610/833 kB | 335/527 kB | 46 kB
2026-11-17T17:28:22.5568175Z Progress (4): 383/577 kB | 610/833 kB | 335/527 kB | 46 kB
2026-11-17T17:28:22.5568658Z Progress (4): 383/577 kB | 619/833 kB | 335/527 kB | 46 kB
2026-11-17T17:28:22.5569229Z Progress (4): 387/577 kB | 619/833 kB | 335/527 kB | 46 kB
2026-11-17T17:28:22.5569545Z Progress (4): 387/577 kB | 619/833 kB | 340/527 kB | 46 kB
2026-11-17T17:28:22.5569985Z Progress (4): 391/577 kB | 619/833 kB | 340/527 kB | 46 kB
2026-11-17T17:28:22.5570404Z Progress (4): 391/577 kB | 627/833 kB | 340/527 kB | 46 kB
2026-11-17T17:28:22.5570969Z Progress (4): 395/577 kB | 627/833 kB | 340/527 kB | 46 kB
2026-11-17T17:28:22.5571379Z Progress (4): 395/577 kB | 627/833 kB | 344/527 kB | 46 kB
2026-11-17T17:28:22.5571837Z Progress (4): 400/577 kB | 627/833 kB | 344/527 kB | 46 kB
2026-11-17T17:28:22.5572326Z Progress (4): 400/577 kB | 635/833 kB | 344/527 kB | 46 kB
2026-11-17T17:28:22.5572632Z Progress (4): 404/577 kB | 635/833 kB | 344/527 kB | 46 kB
2026-11-17T17:28:22.5573084Z Progress (4): 404/577 kB | 635/833 kB | 348/527 kB | 46 kB
2026-11-17T17:28:22.5573711Z Progress (4): 408/577 kB | 635/833 kB | 348/527 kB | 46 kB
2026-11-17T17:28:22.5573922Z Progress (4): 408/577 kB | 643/833 kB | 348/527 kB | 46 kB
2026-11-17T17:28:22.5574603Z Progress (4): 412/577 kB | 643/833 kB | 348/527 kB | 46 kB
2026-11-17T17:28:22.5574981Z Progress (4): 412/577 kB | 643/833 kB | 352/527 kB | 46 kB
2026-11-17T17:28:22.5575438Z Progress (4): 416/577 kB | 643/833 kB | 352/527 kB | 46 kB
2026-11-17T17:28:22.5575762Z Progress (4): 416/577 kB | 651/833 kB | 352/527 kB | 46 kB
2026-11-17T17:28:22.5576418Z Progress (4): 420/577 kB | 651/833 kB | 352/527 kB | 46 kB
2026-11-17T17:28:22.5576714Z Progress (4): 420/577 kB | 651/833 kB | 356/527 kB | 46 kB
2026-11-17T17:28:22.5577153Z Progress (4): 424/577 kB | 651/833 kB | 356/527 kB | 46 kB
2026-11-17T17:28:22.5577754Z Progress (4): 424/577 kB | 659/833 kB | 356/527 kB | 46 kB
2026-11-17T17:28:22.5578367Z Progress (4): 428/577 kB | 659/833 kB | 356/527 kB | 46 kB
2026-11-17T17:28:22.5578642Z Progress (4): 428/577 kB | 659/833 kB | 360/527 kB | 46 kB
2026-11-17T17:28:22.5579240Z Progress (4): 432/577 kB | 659/833 kB | 360/527 kB | 46 kB
2026-11-17T17:28:22.5579549Z Progress (4): 432/577 kB | 668/833 kB | 360/527 kB | 46 kB
2026-11-17T17:28:22.5580081Z Progress (4): 436/577 kB | 668/833 kB | 360/527 kB | 46 kB
2026-11-17T17:28:22.5580603Z Progress (4): 436/577 kB | 668/833 kB | 364/527 kB | 46 kB
2026-11-17T17:28:22.5580938Z Progress (4): 441/577 kB | 668/833 kB | 364/527 kB | 46 kB
2026-11-17T17:28:22.5581575Z Progress (4): 441/577 kB | 676/833 kB | 364/527 kB | 46 kB
2026-11-17T17:28:22.5581897Z Progress (4): 445/577 kB | 676/833 kB | 364/527 kB | 46 kB
2026-11-17T17:28:22.5582574Z Progress (4): 445/577 kB | 684/833 kB | 364/527 kB | 46 kB
2026-11-17T17:28:22.5583147Z Progress (4): 445/577 kB | 684/833 kB | 368/527 kB | 46 kB
2026-11-17T17:28:22.5583438Z Progress (4): 449/577 kB | 684/833 kB | 368/527 kB | 46 kB
2026-11-17T17:28:22.5584192Z Progress (4): 449/577 kB | 684/833 kB | 372/527 kB | 46 kB
2026-11-17T17:28:22.5584648Z Progress (4): 449/577 kB | 692/833 kB | 372/527 kB | 46 kB
2026-11-17T17:28:22.5585171Z Progress (4): 449/577 kB | 692/833 kB | 376/527 kB | 46 kB
2026-11-17T17:28:22.5585496Z Progress (4): 453/577 kB | 692/833 kB | 376/527 kB | 46 kB
2026-11-17T17:28:22.5586062Z Progress (4): 453/577 kB | 692/833 kB | 380/527 kB | 46 kB
2026-11-17T17:28:22.5586329Z Progress (4): 453/577 kB | 700/833 kB | 380/527 kB | 46 kB
2026-11-17T17:28:22.5586735Z Progress (4): 453/577 kB | 700/833 kB | 385/527 kB | 46 kB
2026-11-17T17:28:22.5587170Z Progress (4): 457/577 kB | 700/833 kB | 385/527 kB | 46 kB
2026-11-17T17:28:22.5587626Z Progress (4): 457/577 kB | 700/833 kB | 389/527 kB | 46 kB
2026-11-17T17:28:22.5588132Z Progress (4): 457/577 kB | 709/833 kB | 389/527 kB | 46 kB
2026-11-17T17:28:22.5588554Z Progress (4): 457/577 kB | 709/833 kB | 393/527 kB | 46 kB
2026-11-17T17:28:22.5589008Z Progress (4): 457/577 kB | 717/833 kB | 393/527 kB | 46 kB
2026-11-17T17:28:22.5589534Z Progress (4): 461/577 kB | 717/833 kB | 393/527 kB | 46 kB
2026-11-17T17:28:22.5590001Z Progress (4): 461/577 kB | 717/833 kB | 397/527 kB | 46 kB
2026-11-17T17:28:22.5590578Z Progress (4): 465/577 kB | 717/833 kB | 397/527 kB | 46 kB
2026-11-17T17:28:22.5591031Z Progress (4): 465/577 kB | 725/833 kB | 397/527 kB | 46 kB
2026-11-17T17:28:22.5591523Z Progress (4): 469/577 kB | 725/833 kB | 397/527 kB | 46 kB
2026-11-17T17:28:22.5591781Z Progress (4): 469/577 kB | 733/833 kB | 397/527 kB | 46 kB
2026-11-17T17:28:22.5592266Z Progress (4): 469/577 kB | 733/833 kB | 401/527 kB | 46 kB
2026-11-17T17:28:22.5592659Z Progress (4): 473/577 kB | 733/833 kB | 401/527 kB | 46 kB
2026-11-17T17:28:22.5593132Z Progress (4): 473/577 kB | 741/833 kB | 401/527 kB | 46 kB
2026-11-17T17:28:22.5593577Z Progress (4): 477/577 kB | 741/833 kB | 401/527 kB | 46 kB
2026-11-17T17:28:22.5593945Z Progress (4): 477/577 kB | 741/833 kB | 405/527 kB | 46 kB
2026-11-17T17:28:22.5594641Z Progress (4): 482/577 kB | 741/833 kB | 405/527 kB | 46 kB
2026-11-17T17:28:22.5594926Z Progress (4): 482/577 kB | 750/833 kB | 405/527 kB | 46 kB
2026-11-17T17:28:22.5595475Z Progress (4): 486/577 kB | 750/833 kB | 405/527 kB | 46 kB
2026-11-17T17:28:22.5595929Z Progress (4): 486/577 kB | 750/833 kB | 409/527 kB | 46 kB
2026-11-17T17:28:22.5596255Z Progress (4): 490/577 kB | 750/833 kB | 409/527 kB | 46 kB
2026-11-17T17:28:22.5596690Z Progress (4): 490/577 kB | 758/833 kB | 409/527 kB | 46 kB
2026-11-17T17:28:22.5597352Z Progress (4): 490/577 kB | 758/833 kB | 413/527 kB | 46 kB
2026-11-17T17:28:22.5597618Z Progress (4): 494/577 kB | 758/833 kB | 413/527 kB | 46 kB
2026-11-17T17:28:22.5598066Z Progress (4): 494/577 kB | 758/833 kB | 417/527 kB | 46 kB
2026-11-17T17:28:22.5598398Z Progress (4): 494/577 kB | 766/833 kB | 417/527 kB | 46 kB
2026-11-17T17:28:22.5598773Z Progress (4): 494/577 kB | 766/833 kB | 421/527 kB | 46 kB
2026-11-17T17:28:22.5599176Z Progress (4): 498/577 kB | 766/833 kB | 421/527 kB | 46 kB
2026-11-17T17:28:22.5599716Z Progress (4): 498/577 kB | 766/833 kB | 426/527 kB | 46 kB
2026-11-17T17:28:22.5600115Z Progress (4): 498/577 kB | 774/833 kB | 426/527 kB | 46 kB
2026-11-17T17:28:22.5600494Z Progress (4): 498/577 kB | 774/833 kB | 430/527 kB | 46 kB
2026-11-17T17:28:22.5601049Z Progress (4): 502/577 kB | 774/833 kB | 430/527 kB | 46 kB
2026-11-17T17:28:22.5601389Z Progress (4): 502/577 kB | 774/833 kB | 434/527 kB | 46 kB
2026-11-17T17:28:22.5601862Z Progress (4): 502/577 kB | 782/833 kB | 434/527 kB | 46 kB
2026-11-17T17:28:22.5602307Z Progress (4): 502/577 kB | 782/833 kB | 438/527 kB | 46 kB
2026-11-17T17:28:22.5602728Z Progress (4): 502/577 kB | 791/833 kB | 438/527 kB | 46 kB
2026-11-17T17:28:22.5603172Z Progress (4): 506/577 kB | 791/833 kB | 438/527 kB | 46 kB
2026-11-17T17:28:22.5603536Z Progress (4): 506/577 kB | 791/833 kB | 442/527 kB | 46 kB
2026-11-17T17:28:22.5604123Z Progress (4): 510/577 kB | 791/833 kB | 442/527 kB | 46 kB
2026-11-17T17:28:22.5604494Z Progress (4): 510/577 kB | 791/833 kB | 446/527 kB | 46 kB
2026-11-17T17:28:22.5605093Z Progress (4): 514/577 kB | 791/833 kB | 446/527 kB | 46 kB
2026-11-17T17:28:22.5605444Z Progress (4): 514/577 kB | 791/833 kB | 450/527 kB | 46 kB
2026-11-17T17:28:22.5605861Z Progress (4): 518/577 kB | 791/833 kB | 450/527 kB | 46 kB
2026-11-17T17:28:22.5606277Z Progress (4): 518/577 kB | 791/833 kB | 454/527 kB | 46 kB
2026-11-17T17:28:22.5606730Z Progress (4): 522/577 kB | 791/833 kB | 454/527 kB | 46 kB
2026-11-17T17:28:22.5607160Z Progress (4): 522/577 kB | 791/833 kB | 458/527 kB | 46 kB
2026-11-17T17:28:22.5607573Z Progress (4): 527/577 kB | 791/833 kB | 458/527 kB | 46 kB
2026-11-17T17:28:22.5608058Z Progress (4): 527/577 kB | 791/833 kB | 462/527 kB | 46 kB
2026-11-17T17:28:22.5608635Z Progress (4): 531/577 kB | 791/833 kB | 462/527 kB | 46 kB
2026-11-17T17:28:22.5609108Z Progress (4): 531/577 kB | 791/833 kB | 466/527 kB | 46 kB
2026-11-17T17:28:22.5609714Z Progress (4): 535/577 kB | 791/833 kB | 466/527 kB | 46 kB
2026-11-17T17:28:22.5610054Z Progress (4): 535/577 kB | 791/833 kB | 471/527 kB | 46 kB
2026-11-17T17:28:22.5610588Z Progress (4): 539/577 kB | 791/833 kB | 471/527 kB | 46 kB
2026-11-17T17:28:22.5611300Z Progress (4): 539/577 kB | 791/833 kB | 475/527 kB | 46 kB
2026-11-17T17:28:22.5611592Z Progress (4): 543/577 kB | 791/833 kB | 475/527 kB | 46 kB
2026-11-17T17:28:22.5612112Z Progress (4): 543/577 kB | 791/833 kB | 479/527 kB | 46 kB
2026-11-17T17:28:22.5612720Z Progress (4): 547/577 kB | 791/833 kB | 479/527 kB | 46 kB
2026-11-17T17:28:22.5612960Z Progress (4): 547/577 kB | 791/833 kB | 483/527 kB | 46 kB
2026-11-17T17:28:22.5613519Z Progress (4): 551/577 kB | 791/833 kB | 483/527 kB | 46 kB
2026-11-17T17:28:22.5613857Z Progress (4): 551/577 kB | 791/833 kB | 487/527 kB | 46 kB
2026-11-17T17:28:22.5614353Z Progress (4): 555/577 kB | 791/833 kB | 487/527 kB | 46 kB
2026-11-17T17:28:22.5615065Z Progress (4): 555/577 kB | 791/833 kB | 491/527 kB | 46 kB
2026-11-17T17:28:22.5615609Z Progress (4): 559/577 kB | 791/833 kB | 491/527 kB | 46 kB
2026-11-17T17:28:22.5615950Z Progress (4): 559/577 kB | 791/833 kB | 495/527 kB | 46 kB
2026-11-17T17:28:22.5616383Z Progress (4): 563/577 kB | 791/833 kB | 495/527 kB | 46 kB
2026-11-17T17:28:22.5616939Z Progress (4): 563/577 kB | 791/833 kB | 499/527 kB | 46 kB
2026-11-17T17:28:22.5617473Z Progress (4): 563/577 kB | 799/833 kB | 499/527 kB | 46 kB
2026-11-17T17:28:22.5617877Z Progress (4): 568/577 kB | 799/833 kB | 499/527 kB | 46 kB
2026-11-17T17:28:22.5618251Z Progress (4): 568/577 kB | 799/833 kB | 503/527 kB | 46 kB
2026-11-17T17:28:22.5618763Z Progress (4): 572/577 kB | 799/833 kB | 503/527 kB | 46 kB
2026-11-17T17:28:22.5619269Z Progress (4): 572/577 kB | 807/833 kB | 503/527 kB | 46 kB
2026-11-17T17:28:22.5620016Z Progress (4): 576/577 kB | 807/833 kB | 503/527 kB | 46 kB
2026-11-17T17:28:22.5620333Z Progress (4): 576/577 kB | 807/833 kB | 507/527 kB | 46 kB
2026-11-17T17:28:22.5629095Z Progress (4): 576/577 kB | 815/833 kB | 507/527 kB | 46 kB
2026-11-17T17:28:22.5629373Z Progress (4): 576/577 kB | 815/833 kB | 512/527 kB | 46 kB
2026-11-17T17:28:22.5629534Z Progress (4): 577 kB | 815/833 kB | 512/527 kB | 46 kB    
2026-11-17T17:28:22.5629732Z Progress (4): 577 kB | 815/833 kB | 516/527 kB | 46 kB
2026-11-17T17:28:22.5629893Z Progress (4): 577 kB | 823/833 kB | 516/527 kB | 46 kB
2026-11-17T17:28:22.5630023Z Progress (4): 577 kB | 823/833 kB | 520/527 kB | 46 kB
2026-11-17T17:28:22.5630185Z Progress (4): 577 kB | 831/833 kB | 520/527 kB | 46 kB
2026-11-17T17:28:22.5630350Z Progress (4): 577 kB | 831/833 kB | 524/527 kB | 46 kB
2026-11-17T17:28:22.5630515Z Progress (4): 577 kB | 833 kB | 524/527 kB | 46 kB    
2026-11-17T17:28:22.5634942Z Progress (4): 577 kB | 833 kB | 527 kB | 46 kB    
2026-11-17T17:28:22.5636195Z                                               
2026-11-17T17:28:22.5637099Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jboss/resteasy/jaxrs-api/2.2.1.GA/jaxrs-api-2.2.1.GA.jar (46 kB at 242 kB/s)
2026-11-17T17:28:22.5637657Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/httpcomponents/httpclient/4.0.3/httpclient-4.0.3.jar
2026-11-17T17:28:22.5646195Z Progress (4): 577 kB | 833 kB | 527 kB | 4.1/19 kB
2026-11-17T17:28:22.5646549Z Progress (4): 577 kB | 833 kB | 527 kB | 8.2/19 kB
2026-11-17T17:28:22.5647105Z Progress (4): 577 kB | 833 kB | 527 kB | 12/19 kB 
2026-11-17T17:28:22.5648086Z Progress (4): 577 kB | 833 kB | 527 kB | 16/19 kB
2026-11-17T17:28:22.5740315Z Progress (4): 577 kB | 833 kB | 527 kB | 19 kB   
2026-11-17T17:28:22.5740614Z                                               
2026-11-17T17:28:22.5741434Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/struts/struts/1.2.4/struts-1.2.4.jar (527 kB at 2.6 MB/s)
2026-11-17T17:28:22.5742110Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jboss/resteasy/resteasy-jaxrs/2.2.1.GA/resteasy-jaxrs-2.2.1.GA.jar (577 kB at 2.9 MB/s)
2026-11-17T17:28:22.5742731Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/google/code/gson/gson/2.8.2/gson-2.8.2.jar
2026-11-17T17:28:22.5743377Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/mysql/mysql-connector-java/5.1.22/mysql-connector-java-5.1.22.jar (833 kB at 4.1 MB/s)
2026-11-17T17:28:22.5766494Z Progress (2): 19 kB | 4.1/293 kB
2026-11-17T17:28:22.5766674Z Progress (2): 19 kB | 8.2/293 kB
2026-11-17T17:28:22.5766826Z Progress (2): 19 kB | 12/293 kB 
2026-11-17T17:28:22.5767053Z Progress (2): 19 kB | 16/293 kB
2026-11-17T17:28:22.5767510Z Progress (2): 19 kB | 20/293 kB
2026-11-17T17:28:22.5768184Z Progress (2): 19 kB | 25/293 kB
2026-11-17T17:28:22.5769127Z Progress (2): 19 kB | 29/293 kB
2026-11-17T17:28:22.5769489Z Progress (2): 19 kB | 33/293 kB
2026-11-17T17:28:22.5770026Z Progress (2): 19 kB | 37/293 kB
2026-11-17T17:28:22.5770621Z Progress (2): 19 kB | 41/293 kB
2026-11-17T17:28:22.5771150Z Progress (2): 19 kB | 45/293 kB
2026-11-17T17:28:22.5772202Z Progress (2): 19 kB | 49/293 kB
2026-11-17T17:28:22.5772570Z Progress (2): 19 kB | 53/293 kB
2026-11-17T17:28:22.5773093Z Progress (2): 19 kB | 57/293 kB
2026-11-17T17:28:22.5773690Z Progress (2): 19 kB | 61/293 kB
2026-11-17T17:28:22.5774139Z Progress (2): 19 kB | 66/293 kB
2026-11-17T17:28:22.5774638Z Progress (2): 19 kB | 70/293 kB
2026-11-17T17:28:22.5775111Z Progress (2): 19 kB | 74/293 kB
2026-11-17T17:28:22.5775612Z Progress (2): 19 kB | 78/293 kB
2026-11-17T17:28:22.5776161Z Progress (2): 19 kB | 82/293 kB
2026-11-17T17:28:22.5777076Z Progress (2): 19 kB | 86/293 kB
2026-11-17T17:28:22.5777481Z Progress (2): 19 kB | 90/293 kB
2026-11-17T17:28:22.5777999Z Progress (2): 19 kB | 94/293 kB
2026-11-17T17:28:22.5779231Z Progress (2): 19 kB | 98/293 kB
2026-11-17T17:28:22.5779748Z Progress (2): 19 kB | 102/293 kB
2026-11-17T17:28:22.5780066Z Progress (2): 19 kB | 106/293 kB
2026-11-17T17:28:22.5780257Z Progress (2): 19 kB | 111/293 kB
2026-11-17T17:28:22.5780641Z Progress (2): 19 kB | 115/293 kB
2026-11-17T17:28:22.5781348Z Progress (2): 19 kB | 119/293 kB
2026-11-17T17:28:22.5781658Z Progress (2): 19 kB | 123/293 kB
2026-11-17T17:28:22.5782132Z Progress (2): 19 kB | 127/293 kB
2026-11-17T17:28:22.5782625Z Progress (2): 19 kB | 131/293 kB
2026-11-17T17:28:22.5783098Z Progress (2): 19 kB | 135/293 kB
2026-11-17T17:28:22.5783589Z Progress (2): 19 kB | 139/293 kB
2026-11-17T17:28:22.5784268Z Progress (2): 19 kB | 143/293 kB
2026-11-17T17:28:22.5784850Z Progress (2): 19 kB | 147/293 kB
2026-11-17T17:28:22.5785807Z Progress (2): 19 kB | 152/293 kB
2026-11-17T17:28:22.5786170Z Progress (2): 19 kB | 156/293 kB
2026-11-17T17:28:22.5786728Z Progress (2): 19 kB | 160/293 kB
2026-11-17T17:28:22.5787347Z Progress (2): 19 kB | 164/293 kB
2026-11-17T17:28:22.5795135Z Progress (2): 19 kB | 168/293 kB
2026-11-17T17:28:22.5795544Z Progress (2): 19 kB | 172/293 kB
2026-11-17T17:28:22.5795909Z Progress (2): 19 kB | 176/293 kB
2026-11-17T17:28:22.5796048Z Progress (2): 19 kB | 180/293 kB
2026-11-17T17:28:22.5796155Z Progress (2): 19 kB | 184/293 kB
2026-11-17T17:28:22.5796334Z Progress (2): 19 kB | 188/293 kB
2026-11-17T17:28:22.5796542Z Progress (2): 19 kB | 193/293 kB
2026-11-17T17:28:22.5796725Z Progress (2): 19 kB | 197/293 kB
2026-11-17T17:28:22.5796865Z Progress (2): 19 kB | 201/293 kB
2026-11-17T17:28:22.5797012Z Progress (2): 19 kB | 205/293 kB
2026-11-17T17:28:22.5797150Z Progress (2): 19 kB | 209/293 kB
2026-11-17T17:28:22.5797283Z Progress (2): 19 kB | 213/293 kB
2026-11-17T17:28:22.5797386Z Progress (2): 19 kB | 217/293 kB
2026-11-17T17:28:22.5797526Z Progress (2): 19 kB | 221/293 kB
2026-11-17T17:28:22.5797690Z Progress (2): 19 kB | 225/293 kB
2026-11-17T17:28:22.5797844Z Progress (2): 19 kB | 229/293 kB
2026-11-17T17:28:22.5798054Z Progress (2): 19 kB | 233/293 kB
2026-11-17T17:28:22.5798204Z Progress (2): 19 kB | 238/293 kB
2026-11-17T17:28:22.5798351Z Progress (2): 19 kB | 242/293 kB
2026-11-17T17:28:22.5798493Z Progress (2): 19 kB | 246/293 kB
2026-11-17T17:28:22.5798598Z Progress (2): 19 kB | 250/293 kB
2026-11-17T17:28:22.5798738Z Progress (2): 19 kB | 254/293 kB
2026-11-17T17:28:22.5798880Z Progress (2): 19 kB | 258/293 kB
2026-11-17T17:28:22.5801070Z Progress (2): 19 kB | 262/293 kB
2026-11-17T17:28:22.5801235Z Progress (2): 19 kB | 266/293 kB
2026-11-17T17:28:22.5801380Z Progress (2): 19 kB | 270/293 kB
2026-11-17T17:28:22.5801523Z Progress (2): 19 kB | 274/293 kB
2026-11-17T17:28:22.5801663Z Progress (2): 19 kB | 279/293 kB
2026-11-17T17:28:22.5801770Z Progress (2): 19 kB | 283/293 kB
2026-11-17T17:28:22.5801911Z Progress (2): 19 kB | 287/293 kB
2026-11-17T17:28:22.5802084Z Progress (2): 19 kB | 291/293 kB
2026-11-17T17:28:22.5906342Z Progress (2): 19 kB | 293 kB    
2026-11-17T17:28:22.5906898Z Progress (3): 19 kB | 293 kB | 2.3/233 kB
2026-11-17T17:28:22.5907379Z Progress (3): 19 kB | 293 kB | 6.4/233 kB
2026-11-17T17:28:22.5907802Z Progress (3): 19 kB | 293 kB | 10/233 kB 
2026-11-17T17:28:22.5908447Z Progress (3): 19 kB | 293 kB | 15/233 kB
2026-11-17T17:28:22.5908898Z Progress (3): 19 kB | 293 kB | 19/233 kB
2026-11-17T17:28:22.5909418Z Progress (3): 19 kB | 293 kB | 23/233 kB
2026-11-17T17:28:22.5910768Z                                         
2026-11-17T17:28:22.5911617Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/scannotation/scannotation/1.0.3/scannotation-1.0.3.jar (19 kB at 86 kB/s)
2026-11-17T17:28:22.5912705Z Progress (2): 293 kB | 27/233 kB
2026-11-17T17:28:22.5913031Z Progress (2): 293 kB | 31/233 kB
2026-11-17T17:28:22.5913520Z Progress (2): 293 kB | 35/233 kB
2026-11-17T17:28:22.5913964Z Progress (2): 293 kB | 39/233 kB
2026-11-17T17:28:22.5914500Z Progress (2): 293 kB | 43/233 kB
2026-11-17T17:28:22.5915061Z Progress (2): 293 kB | 47/233 kB
2026-11-17T17:28:22.5915913Z Progress (2): 293 kB | 51/233 kB
2026-11-17T17:28:22.5918271Z Progress (2): 293 kB | 56/233 kB
2026-11-17T17:28:22.5918514Z Progress (2): 293 kB | 60/233 kB
2026-11-17T17:28:22.5918888Z Progress (2): 293 kB | 64/233 kB
2026-11-17T17:28:22.5919451Z Progress (2): 293 kB | 68/233 kB
2026-11-17T17:28:22.5919962Z Progress (2): 293 kB | 72/233 kB
2026-11-17T17:28:22.5921047Z Progress (2): 293 kB | 76/233 kB
2026-11-17T17:28:22.5921637Z Progress (2): 293 kB | 80/233 kB
2026-11-17T17:28:22.5922088Z Progress (2): 293 kB | 84/233 kB
2026-11-17T17:28:22.5924802Z Progress (2): 293 kB | 88/233 kB
2026-11-17T17:28:22.5925171Z Progress (2): 293 kB | 92/233 kB
2026-11-17T17:28:22.5925411Z Progress (2): 293 kB | 96/233 kB
2026-11-17T17:28:22.5925668Z Progress (2): 293 kB | 101/233 kB
2026-11-17T17:28:22.5925907Z Progress (2): 293 kB | 105/233 kB
2026-11-17T17:28:22.5926125Z Progress (2): 293 kB | 109/233 kB
2026-11-17T17:28:22.5926301Z Progress (2): 293 kB | 113/233 kB
2026-11-17T17:28:22.5927321Z Progress (2): 293 kB | 117/233 kB
2026-11-17T17:28:22.5927484Z Progress (2): 293 kB | 121/233 kB
2026-11-17T17:28:22.5927641Z Progress (2): 293 kB | 125/233 kB
2026-11-17T17:28:22.5927785Z Progress (2): 293 kB | 129/233 kB
2026-11-17T17:28:22.5927927Z Progress (2): 293 kB | 133/233 kB
2026-11-17T17:28:22.5928065Z Progress (2): 293 kB | 137/233 kB
2026-11-17T17:28:22.5928210Z Progress (2): 293 kB | 142/233 kB
2026-11-17T17:28:22.5928350Z Progress (2): 293 kB | 146/233 kB
2026-11-17T17:28:22.5928822Z Progress (2): 293 kB | 150/233 kB
2026-11-17T17:28:22.5929334Z Progress (2): 293 kB | 154/233 kB
2026-11-17T17:28:22.5929729Z Progress (2): 293 kB | 158/233 kB
2026-11-17T17:28:22.5930169Z Progress (2): 293 kB | 162/233 kB
2026-11-17T17:28:22.5931524Z Progress (2): 293 kB | 166/233 kB
2026-11-17T17:28:22.5931832Z Progress (2): 293 kB | 170/233 kB
2026-11-17T17:28:22.5931988Z Progress (2): 293 kB | 174/233 kB
2026-11-17T17:28:22.5932764Z Progress (2): 293 kB | 178/233 kB
2026-11-17T17:28:22.5932909Z Progress (2): 293 kB | 182/233 kB
2026-11-17T17:28:22.5933534Z Progress (2): 293 kB | 187/233 kB
2026-11-17T17:28:22.5933820Z Progress (2): 293 kB | 191/233 kB
2026-11-17T17:28:22.5934247Z Progress (2): 293 kB | 195/233 kB
2026-11-17T17:28:22.5934760Z Progress (2): 293 kB | 199/233 kB
2026-11-17T17:28:22.5935151Z Progress (2): 293 kB | 203/233 kB
2026-11-17T17:28:22.5935578Z Progress (2): 293 kB | 207/233 kB
2026-11-17T17:28:22.5936005Z Progress (2): 293 kB | 211/233 kB
2026-11-17T17:28:22.5936489Z Progress (2): 293 kB | 215/233 kB
2026-11-17T17:28:22.5936876Z Progress (2): 293 kB | 219/233 kB
2026-11-17T17:28:22.5937389Z Progress (2): 293 kB | 223/233 kB
2026-11-17T17:28:22.5938023Z Progress (2): 293 kB | 228/233 kB
2026-11-17T17:28:22.5939455Z Progress (2): 293 kB | 232/233 kB
2026-11-17T17:28:22.6012345Z Progress (2): 293 kB | 233 kB    
2026-11-17T17:28:22.6012553Z                              
2026-11-17T17:28:22.6013119Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/httpcomponents/httpclient/4.0.3/httpclient-4.0.3.jar (293 kB at 1.3 MB/s)
2026-11-17T17:28:22.6049670Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/google/code/gson/gson/2.8.2/gson-2.8.2.jar (233 kB at 1000 kB/s)
2026-11-17T17:28:22.6368146Z [INFO] 
2026-11-17T17:28:22.6368664Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ siemp-web ---
2026-11-17T17:28:22.6368880Z [INFO] 
2026-11-17T17:28:22.6369408Z [INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ siemp-web ---
2026-11-17T17:28:22.6809897Z [INFO] Copying 6 resources from src/main/resources to target/classes
2026-11-17T17:28:22.7594439Z [INFO] Copying 682 resources from src/main/java to target/classes
2026-11-17T17:28:22.8231364Z [INFO] The encoding used to copy filtered properties files have not been set. This means that the same encoding will be used to copy filtered properties files as when copying other filtered resources. This might not be what you want! Run your build with --debug to see which files might be affected. Read more at https://maven.apache.org/plugins/maven-resources-plugin/examples/filtering-properties-files.html
2026-11-17T17:28:22.8236121Z [INFO] 
2026-11-17T17:28:22.8236419Z [INFO] --- maven-compiler-plugin:3.11.0:compile (default-compile) @ siemp-web ---
2026-11-17T17:28:23.0706244Z [INFO] Changes detected - recompiling the module! :dependency
2026-11-17T17:28:23.0780156Z [INFO] Compiling 2259 source files with javac [debug release 17] to target/classes
2026-11-17T17:28:32.2027728Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java(78,31): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java:[78,31] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2040248Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java(93,35): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java:[93,35] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2041477Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java:[78,31] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2041993Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java:[93,35] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2045133Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java(106,35): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java:[106,35] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2049558Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java(136,21): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java:[136,21] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2052908Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java(284,26): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java:[284,26] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2056160Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java(291,35): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java:[291,35] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2059891Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java(301,26): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java:[301,26] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2062545Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java(308,26): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java:[308,26] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2065652Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java(322,27): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java:[322,27] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2068418Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java(345,24): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java:[345,24] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2072393Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java(352,26): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java:[352,26] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2074935Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java(368,26): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java:[368,26] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2078236Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java(407,24): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java:[407,24] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2081512Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java(539,26): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java:[539,26] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2085947Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java(557,26): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java:[557,26] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2089437Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java(564,24): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java:[564,24] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2093454Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempActionForm.java(288,23): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempActionForm.java:[288,23] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2098120Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempActionForm.java(302,23): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempActionForm.java:[302,23] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2102008Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempActionForm.java(310,21): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempActionForm.java:[310,21] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2104905Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempActionForm.java(318,21): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempActionForm.java:[318,21] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2108061Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempActionForm.java(334,20): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempActionForm.java:[334,20] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2111379Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempActionForm.java(342,21): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempActionForm.java:[342,21] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2115389Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempActionForm.java(350,20): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempActionForm.java:[350,20] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2118945Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempActionForm.java(361,21): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempActionForm.java:[361,21] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2121868Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempActionForm.java(621,21): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempActionForm.java:[621,21] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2126109Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempActionForm.java(629,23): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempActionForm.java:[629,23] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2129446Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempActionForm.java(844,23): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempActionForm.java:[844,23] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2132791Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempActionForm.java(964,35): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempActionForm.java:[964,35] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2135437Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempFiltroForm.java(95,28): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempFiltroForm.java:[95,28] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2139428Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempFiltroForm.java(106,24): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempFiltroForm.java:[106,24] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2142222Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempFiltroForm.java(608,85): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempFiltroForm.java:[608,85] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2145765Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempFiltroForm.java(608,36): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempFiltroForm.java:[608,36] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2149284Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/SiempHelper.java(558,51): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/SiempHelper.java:[558,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2152602Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/SiempHelper.java(601,85): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/SiempHelper.java:[601,85] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2155912Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/SiempHelper.java(601,36): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/SiempHelper.java:[601,36] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2159509Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/ManterTabelaHelper.java(17,8): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/ManterTabelaHelper.java:[17,8] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2162527Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/ManterSelectMultipleHelper.java(17,8): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/ManterSelectMultipleHelper.java:[17,8] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2165962Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java(53,50): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[53,50] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2169596Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java(70,50): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[70,50] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2172842Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java(121,50): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[121,50] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2175699Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java(128,50): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[128,50] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2178955Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java(134,50): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[134,50] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2182218Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java(140,50): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[140,50] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2185349Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java(145,50): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[145,50] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2188081Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java(150,50): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[150,50] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2191027Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java(155,50): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[155,50] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2193960Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java(160,50): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[160,50] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2197404Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java(166,50): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[166,50] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2200317Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java(176,50): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[176,50] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2203404Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java(182,50): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[182,50] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2206412Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java(188,50): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[188,50] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2209849Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java(356,42): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[356,42] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2212762Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java(371,42): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[371,42] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2215998Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java(386,42): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[386,42] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2218678Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java(416,42): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[416,42] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2222042Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java(431,42): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[431,42] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2227018Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java(446,42): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[446,42] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2229986Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java(462,42): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[462,42] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2233912Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java(478,42): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[478,42] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2237355Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java(520,50): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[520,50] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2240628Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java(989,50): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[989,50] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2243212Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/filtros/formatador/FormatadorDeRotulo.java(108,23): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/filtros/formatador/FormatadorDeRotulo.java:[108,23] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2246215Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/util/FabricaDeCombos.java(24,8): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/util/FabricaDeCombos.java:[24,8] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2249242Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/util/IObjetoParaCombo.java(17,8): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/util/IObjetoParaCombo.java:[17,8] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2250423Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java:[106,35] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2250906Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java:[136,21] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2251556Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java:[284,26] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2252104Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java:[291,35] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2252624Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java:[301,26] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2253000Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java:[308,26] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2253447Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java:[322,27] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2253814Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java:[345,24] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2254170Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java:[352,26] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2254640Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java:[368,26] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2255010Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java:[407,24] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2255606Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java:[539,26] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2256054Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java:[557,26] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2256411Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java:[564,24] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2256739Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempActionForm.java:[288,23] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2257117Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempActionForm.java:[302,23] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2257527Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempActionForm.java:[310,21] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2257999Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempActionForm.java:[318,21] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2258379Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempActionForm.java:[334,20] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2258867Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempActionForm.java:[342,21] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2259466Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempActionForm.java:[350,20] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2259972Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempActionForm.java:[361,21] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2260398Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempActionForm.java:[621,21] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2260762Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempActionForm.java:[629,23] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2261129Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempActionForm.java:[844,23] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2261512Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempActionForm.java:[964,35] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2262030Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempFiltroForm.java:[95,28] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2262867Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempFiltroForm.java:[106,24] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2263584Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempFiltroForm.java:[608,85] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2264162Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempFiltroForm.java:[608,36] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2264730Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/SiempHelper.java:[558,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2265146Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/SiempHelper.java:[601,85] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2265558Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/SiempHelper.java:[601,36] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2265950Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/ManterTabelaHelper.java:[17,8] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2266344Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/ManterSelectMultipleHelper.java:[17,8] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2266760Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[53,50] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2267183Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[70,50] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2267630Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[121,50] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2268137Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[128,50] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2268638Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[134,50] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2269165Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[140,50] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2269671Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[145,50] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2271261Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[150,50] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2271928Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[155,50] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2272432Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[160,50] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2273088Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[166,50] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2273672Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[176,50] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2274213Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[182,50] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2274863Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[188,50] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2275318Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[356,42] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2275966Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[371,42] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2276579Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[386,42] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2277021Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[416,42] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2277497Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[431,42] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2277937Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[446,42] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2278490Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[462,42] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2278975Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[478,42] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2280002Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[520,50] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2280487Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/helper/FabricaDeHelperDeMensagemDeErro.java:[989,50] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2280889Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/filtros/formatador/FormatadorDeRotulo.java:[108,23] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2281312Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/util/FabricaDeCombos.java:[24,8] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2281719Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/util/IObjetoParaCombo.java:[17,8] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2284653Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/util/Combo.java(203,23): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/util/Combo.java:[203,23] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2287455Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/util/Combo.java(297,23): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/util/Combo.java:[297,23] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2290297Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/util/Combo.java(24,8): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/util/Combo.java:[24,8] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2293399Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/util/IObjetoParaComboComAtributos.java(20,8): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/util/IObjetoParaComboComAtributos.java:[20,8] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2297598Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/framework/transferobject/TratarTOForm.java(528,51): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/framework/transferobject/TratarTOForm.java:[528,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2301685Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/framework/transferobject/BusinessDelegate.java(230,59): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/framework/transferobject/BusinessDelegate.java:[230,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2305189Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/XMLProgramAnalyzer.java(353,41): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/XMLProgramAnalyzer.java:[353,41] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2309368Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Group.java(89,109): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Group.java:[89,109] non-varargs call of varargs method with inexact argument type for last parameter;
2026-11-17T17:28:32.2312187Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Group.java(97,108): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Group.java:[97,108] non-varargs call of varargs method with inexact argument type for last parameter;
2026-11-17T17:28:32.2315565Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Group.java(105,107): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Group.java:[105,107] non-varargs call of varargs method with inexact argument type for last parameter;
2026-11-17T17:28:32.2318833Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Group.java(112,110): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Group.java:[112,110] non-varargs call of varargs method with inexact argument type for last parameter;
2026-11-17T17:28:32.2322026Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Group.java(120,109): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Group.java:[120,109] non-varargs call of varargs method with inexact argument type for last parameter;
2026-11-17T17:28:32.2325012Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Group.java(129,108): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Group.java:[129,108] non-varargs call of varargs method with inexact argument type for last parameter;
2026-11-17T17:28:32.2327885Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Group.java(137,107): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Group.java:[137,107] non-varargs call of varargs method with inexact argument type for last parameter;
2026-11-17T17:28:32.2330793Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Group.java(145,110): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Group.java:[145,110] non-varargs call of varargs method with inexact argument type for last parameter;
2026-11-17T17:28:32.2334022Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Group.java(150,99): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Group.java:[150,99] non-varargs call of varargs method with inexact argument type for last parameter;
2026-11-17T17:28:32.2337192Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Group.java(164,94): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Group.java:[164,94] non-varargs call of varargs method with inexact argument type for last parameter;
2026-11-17T17:28:32.2341155Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Param.java(136,32): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Param.java:[136,32] Double(java.lang.String) in java.lang.Double has been deprecated and marked for removal
2026-11-17T17:28:32.2344005Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Param.java(148,32): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Param.java:[148,32] Float(java.lang.String) in java.lang.Float has been deprecated and marked for removal
2026-11-17T17:28:32.2348127Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Param.java(157,32): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Param.java:[157,32] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-17T17:28:32.2352006Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Param.java(166,32): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Param.java:[166,32] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2355322Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Param.java(180,32): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Param.java:[180,32] Double(java.lang.String) in java.lang.Double has been deprecated and marked for removal
2026-11-17T17:28:32.2358940Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Param.java(192,32): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Param.java:[192,32] Float(java.lang.String) in java.lang.Float has been deprecated and marked for removal
2026-11-17T17:28:32.2363266Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Param.java(201,32): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Param.java:[201,32] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-17T17:28:32.2367087Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Param.java(210,32): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Param.java:[210,32] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2370837Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/fachada/FabricaDeFacade.java(38,39): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/fachada/FabricaDeFacade.java:[38,39] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2375019Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/fachada/FabricaDeFacade.java(56,42): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/fachada/FabricaDeFacade.java:[56,42] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2379334Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/fachada/FabricaDeFacade.java(66,46): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/fachada/FabricaDeFacade.java:[66,46] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2383172Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/fachada/FabricaDeFacade.java(76,45): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/fachada/FabricaDeFacade.java:[76,45] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2386775Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/fachada/FabricaDeFacade.java(86,35): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/fachada/FabricaDeFacade.java:[86,35] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2389670Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/fachada/FabricaDeFacade.java(97,35): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/fachada/FabricaDeFacade.java:[97,35] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2392458Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/fachada/FabricaDeFacade.java(107,35): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/fachada/FabricaDeFacade.java:[107,35] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2395533Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/fachada/FabricaDeFacade.java(117,35): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/fachada/FabricaDeFacade.java:[117,35] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2398794Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/fachada/FabricaDeFacade.java(127,35): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/fachada/FabricaDeFacade.java:[127,35] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2401553Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/fachada/FabricaDeFacade.java(137,35): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/fachada/FabricaDeFacade.java:[137,35] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2404215Z ##[warning] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/fachada/FabricaDeFacade.java(147,35): warning :  /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/fachada/FabricaDeFacade.java:[147,35] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2405766Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/util/Combo.java:[203,23] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2406302Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/util/Combo.java:[297,23] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2406855Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/util/Combo.java:[24,8] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2407418Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/util/IObjetoParaComboComAtributos.java:[20,8] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2408080Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/framework/transferobject/TratarTOForm.java:[528,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2408807Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/framework/transferobject/BusinessDelegate.java:[230,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2409538Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/XMLProgramAnalyzer.java:[353,41] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2410248Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Group.java:[89,109] non-varargs call of varargs method with inexact argument type for last parameter;
2026-11-17T17:28:32.2410615Z   cast to java.lang.Object for a varargs call
2026-11-17T17:28:32.2411063Z   cast to java.lang.Object[] for a non-varargs call and to suppress this warning
2026-11-17T17:28:32.2411634Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Group.java:[97,108] non-varargs call of varargs method with inexact argument type for last parameter;
2026-11-17T17:28:32.2412000Z   cast to java.lang.Object for a varargs call
2026-11-17T17:28:32.2412383Z   cast to java.lang.Object[] for a non-varargs call and to suppress this warning
2026-11-17T17:28:32.2413125Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Group.java:[105,107] non-varargs call of varargs method with inexact argument type for last parameter;
2026-11-17T17:28:32.2413509Z   cast to java.lang.Object for a varargs call
2026-11-17T17:28:32.2413890Z   cast to java.lang.Object[] for a non-varargs call and to suppress this warning
2026-11-17T17:28:32.2414491Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Group.java:[112,110] non-varargs call of varargs method with inexact argument type for last parameter;
2026-11-17T17:28:32.2414993Z   cast to java.lang.Object for a varargs call
2026-11-17T17:28:32.2415438Z   cast to java.lang.Object[] for a non-varargs call and to suppress this warning
2026-11-17T17:28:32.2416030Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Group.java:[120,109] non-varargs call of varargs method with inexact argument type for last parameter;
2026-11-17T17:28:32.2416413Z   cast to java.lang.Object for a varargs call
2026-11-17T17:28:32.2416799Z   cast to java.lang.Object[] for a non-varargs call and to suppress this warning
2026-11-17T17:28:32.2417381Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Group.java:[129,108] non-varargs call of varargs method with inexact argument type for last parameter;
2026-11-17T17:28:32.2418269Z   cast to java.lang.Object for a varargs call
2026-11-17T17:28:32.2418660Z   cast to java.lang.Object[] for a non-varargs call and to suppress this warning
2026-11-17T17:28:32.2419238Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Group.java:[137,107] non-varargs call of varargs method with inexact argument type for last parameter;
2026-11-17T17:28:32.2419642Z   cast to java.lang.Object for a varargs call
2026-11-17T17:28:32.2419976Z   cast to java.lang.Object[] for a non-varargs call and to suppress this warning
2026-11-17T17:28:32.2420551Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Group.java:[145,110] non-varargs call of varargs method with inexact argument type for last parameter;
2026-11-17T17:28:32.2420897Z   cast to java.lang.Object for a varargs call
2026-11-17T17:28:32.2421252Z   cast to java.lang.Object[] for a non-varargs call and to suppress this warning
2026-11-17T17:28:32.2421825Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Group.java:[150,99] non-varargs call of varargs method with inexact argument type for last parameter;
2026-11-17T17:28:32.2422165Z   cast to java.lang.Object for a varargs call
2026-11-17T17:28:32.2422549Z   cast to java.lang.Object[] for a non-varargs call and to suppress this warning
2026-11-17T17:28:32.2423144Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Group.java:[164,94] non-varargs call of varargs method with inexact argument type for last parameter;
2026-11-17T17:28:32.2423549Z   cast to java.lang.Object for a varargs call
2026-11-17T17:28:32.2423916Z   cast to java.lang.Object[] for a non-varargs call and to suppress this warning
2026-11-17T17:28:32.2424462Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Param.java:[136,32] Double(java.lang.String) in java.lang.Double has been deprecated and marked for removal
2026-11-17T17:28:32.2426967Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Param.java:[148,32] Float(java.lang.String) in java.lang.Float has been deprecated and marked for removal
2026-11-17T17:28:32.2427670Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Param.java:[157,32] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-17T17:28:32.2428351Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Param.java:[166,32] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2430006Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Param.java:[180,32] Double(java.lang.String) in java.lang.Double has been deprecated and marked for removal
2026-11-17T17:28:32.2430775Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Param.java:[192,32] Float(java.lang.String) in java.lang.Float has been deprecated and marked for removal
2026-11-17T17:28:32.2431545Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Param.java:[201,32] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-17T17:28:32.2432250Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/com/politec/bsb/fsw/jmainframe/xml/Param.java:[210,32] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-17T17:28:32.2432861Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/fachada/FabricaDeFacade.java:[38,39] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2433572Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/fachada/FabricaDeFacade.java:[56,42] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2434198Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/fachada/FabricaDeFacade.java:[66,46] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2434921Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/fachada/FabricaDeFacade.java:[76,45] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2435519Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/fachada/FabricaDeFacade.java:[86,35] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2436096Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/fachada/FabricaDeFacade.java:[97,35] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2436724Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/fachada/FabricaDeFacade.java:[107,35] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2437259Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/fachada/FabricaDeFacade.java:[117,35] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2437856Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/fachada/FabricaDeFacade.java:[127,35] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2438478Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/fachada/FabricaDeFacade.java:[137,35] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2439058Z [WARNING] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/fachada/FabricaDeFacade.java:[147,35] deprecated item is not annotated with @Deprecated
2026-11-17T17:28:32.2439627Z [INFO] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java: Some input files use or override a deprecated API.
2026-11-17T17:28:32.2440223Z [INFO] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java: Recompile with -Xlint:deprecation for details.
2026-11-17T17:28:32.2441207Z [INFO] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/persistencia/SiempDAOMainframe.java: Some input files additionally use or override a deprecated API that is marked for removal.
2026-11-17T17:28:32.2441850Z [INFO] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java: Some input files use unchecked or unsafe operations.
2026-11-17T17:28:32.2442649Z [INFO] /opt/ads-agent/_work/21/s/siemp-web/src/main/java/br/gov/caixa/siemp/comum/apresentacao/SiempAction.java: Recompile with -Xlint:unchecked for details.
2026-11-17T17:28:32.2442971Z [INFO] 
2026-11-17T17:28:32.2443373Z [INFO] --- maven-resources-plugin:3.3.1:testResources (default-testResources) @ siemp-web ---
2026-11-17T17:28:32.2443877Z [INFO] Copying 1 resource from src/test/resources to target/test-classes
2026-11-17T17:28:32.2444145Z [INFO] 
2026-11-17T17:28:32.2444618Z [INFO] --- maven-compiler-plugin:3.11.0:testCompile (default-testCompile) @ siemp-web ---
2026-11-17T17:28:32.2445109Z [INFO] Changes detected - recompiling the module! :dependency
2026-11-17T17:28:32.2445527Z [INFO] Compiling 30 source files with javac [debug release 17] to target/test-classes
2026-11-17T17:28:32.7682399Z [INFO] /opt/ads-agent/_work/21/s/siemp-web/src/test/java/br/gov/caixa/siemp/apresentacao/consignacao/consultaTabelaDeTACDeConvenio/ConsultaTabelaDeTACDeConvenioHelpersTest.java: Some input files use or override a deprecated API.
2026-11-17T17:28:32.7683563Z [INFO] /opt/ads-agent/_work/21/s/siemp-web/src/test/java/br/gov/caixa/siemp/apresentacao/consignacao/consultaTabelaDeTACDeConvenio/ConsultaTabelaDeTACDeConvenioHelpersTest.java: Recompile with -Xlint:deprecation for details.
2026-11-17T17:28:32.7684674Z [INFO] /opt/ads-agent/_work/21/s/siemp-web/src/test/java/br/gov/caixa/siemp/comum/apresentacao/login/LoginMenuConsultasTest.java: /opt/ads-agent/_work/21/s/siemp-web/src/test/java/br/gov/caixa/siemp/comum/apresentacao/login/LoginMenuConsultasTest.java uses unchecked or unsafe operations.
2026-11-17T17:28:32.7686506Z [INFO] /opt/ads-agent/_work/21/s/siemp-web/src/test/java/br/gov/caixa/siemp/comum/apresentacao/login/LoginMenuConsultasTest.java: Recompile with -Xlint:unchecked for details.
2026-11-17T17:28:32.7686881Z [INFO] 
2026-11-17T17:28:32.7687278Z [INFO] --- maven-surefire-plugin:3.2.5:test (default-test) @ siemp-web ---
2026-11-17T17:28:33.1781690Z [INFO] Using auto detected provider org.apache.maven.surefire.junit4.JUnit4Provider
2026-11-17T17:28:33.2238469Z [INFO] 
2026-11-17T17:28:33.2239351Z [INFO] -------------------------------------------------------
2026-11-17T17:28:33.2239553Z [INFO]  T E S T S
2026-11-17T17:28:33.2239777Z [INFO] -------------------------------------------------------
2026-11-17T17:28:33.4923579Z [INFO] Running br.gov.caixa.siemp.relatorios.RelatorioPosicaoDividaCalculatorTest
2026-11-17T17:28:34.0009084Z /opt/ads-agent/_work/21/s/siemp-web/relatorioPosicaoDivida.java:235: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
2026-11-17T17:28:34.0009544Z                 value = (java.lang.Integer)(new Integer(1));
2026-11-17T17:28:34.0009738Z                                             ^
2026-11-17T17:28:34.0010244Z /opt/ads-agent/_work/21/s/siemp-web/relatorioPosicaoDivida.java:245: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
2026-11-17T17:28:34.0010619Z                 value = (java.lang.Integer)(new Integer(1));
2026-11-17T17:28:34.0010849Z                                             ^
2026-11-17T17:28:34.0011315Z /opt/ads-agent/_work/21/s/siemp-web/relatorioPosicaoDivida.java:255: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
2026-11-17T17:28:34.0011675Z                 value = (java.lang.Integer)(new Integer(0));
2026-11-17T17:28:34.0011891Z                                             ^
2026-11-17T17:28:34.0012381Z /opt/ads-agent/_work/21/s/siemp-web/relatorioPosicaoDivida.java:270: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
2026-11-17T17:28:34.0012724Z                 value = (java.lang.Integer)(new Integer(0));
2026-11-17T17:28:34.0012960Z                                             ^
2026-11-17T17:28:34.0013435Z /opt/ads-agent/_work/21/s/siemp-web/relatorioPosicaoDivida.java:365: warning: [removal] Boolean(boolean) in Boolean has been deprecated and marked for removal
2026-11-17T17:28:34.0014132Z                 value = (java.lang.Boolean)(new Boolean(((java.lang.String)field_nuParcela.getValue()) != null));
2026-11-17T17:28:34.0014398Z                                             ^
2026-11-17T17:28:34.0014956Z /opt/ads-agent/_work/21/s/siemp-web/relatorioPosicaoDivida.java:370: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
2026-11-17T17:28:34.0015394Z                 value = (java.lang.Integer)(new Integer(0));
2026-11-17T17:28:34.0015573Z                                             ^
2026-11-17T17:28:34.0016083Z /opt/ads-agent/_work/21/s/siemp-web/relatorioPosicaoDivida.java:380: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
2026-11-17T17:28:34.0016432Z                 value = (java.lang.Integer)(new Integer(1));
2026-11-17T17:28:34.0016664Z                                             ^
2026-11-17T17:28:34.0017135Z /opt/ads-agent/_work/21/s/siemp-web/relatorioPosicaoDivida.java:415: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
2026-11-17T17:28:34.0017486Z                 value = (java.lang.Integer)(new Integer(1));
2026-11-17T17:28:34.0017713Z                                             ^
2026-11-17T17:28:34.0018176Z /opt/ads-agent/_work/21/s/siemp-web/relatorioPosicaoDivida.java:420: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
2026-11-17T17:28:34.0018520Z                 value = (java.lang.Integer)(new Integer(1));
2026-11-17T17:28:34.0018786Z                                             ^
2026-11-17T17:28:34.0019203Z /opt/ads-agent/_work/21/s/siemp-web/relatorioPosicaoDivida.java:445: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
2026-11-17T17:28:34.0019546Z                 value = (java.lang.Integer)(new Integer(1));
2026-11-17T17:28:34.0019768Z                                             ^
2026-11-17T17:28:34.0020229Z /opt/ads-agent/_work/21/s/siemp-web/relatorioPosicaoDivida.java:450: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
2026-11-17T17:28:34.0020583Z                 value = (java.lang.Integer)(new Integer(0));
2026-11-17T17:28:34.0020811Z                                             ^
2026-11-17T17:28:34.0021276Z /opt/ads-agent/_work/21/s/siemp-web/relatorioPosicaoDivida.java:503: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
2026-11-17T17:28:34.0021632Z                 value = (java.lang.Integer)(new Integer(1));
2026-11-17T17:28:34.0021873Z                                             ^
2026-11-17T17:28:34.0022334Z /opt/ads-agent/_work/21/s/siemp-web/relatorioPosicaoDivida.java:513: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
2026-11-17T17:28:34.0022679Z                 value = (java.lang.Integer)(new Integer(1));
2026-11-17T17:28:34.0022901Z                                             ^
2026-11-17T17:28:34.0023312Z /opt/ads-agent/_work/21/s/siemp-web/relatorioPosicaoDivida.java:523: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
2026-11-17T17:28:34.0023652Z                 value = (java.lang.Integer)(new Integer(0));
2026-11-17T17:28:34.0023881Z                                             ^
2026-11-17T17:28:34.0024336Z /opt/ads-agent/_work/21/s/siemp-web/relatorioPosicaoDivida.java:538: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
2026-11-17T17:28:34.0024775Z                 value = (java.lang.Integer)(new Integer(0));
2026-11-17T17:28:34.0025022Z                                             ^
2026-11-17T17:28:34.0025490Z /opt/ads-agent/_work/21/s/siemp-web/relatorioPosicaoDivida.java:633: warning: [removal] Boolean(boolean) in Boolean has been deprecated and marked for removal
2026-11-17T17:28:34.0025886Z                 value = (java.lang.Boolean)(new Boolean(((java.lang.String)field_nuParcela.getOldValue()) != null));
2026-11-17T17:28:34.0026210Z                                             ^
2026-11-17T17:28:34.0026669Z /opt/ads-agent/_work/21/s/siemp-web/relatorioPosicaoDivida.java:638: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
2026-11-17T17:28:34.0027011Z                 value = (java.lang.Integer)(new Integer(0));
2026-11-17T17:28:34.0027189Z                                             ^
2026-11-17T17:28:34.0027735Z /opt/ads-agent/_work/21/s/siemp-web/relatorioPosicaoDivida.java:648: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
2026-11-17T17:28:34.0028074Z                 value = (java.lang.Integer)(new Integer(1));
2026-11-17T17:28:34.0028319Z                                             ^
2026-11-17T17:28:34.0028775Z /opt/ads-agent/_work/21/s/siemp-web/relatorioPosicaoDivida.java:683: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
2026-11-17T17:28:34.0029111Z                 value = (java.lang.Integer)(new Integer(1));
2026-11-17T17:28:34.0029336Z                                             ^
2026-11-17T17:28:34.0029787Z /opt/ads-agent/_work/21/s/siemp-web/relatorioPosicaoDivida.java:688: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
2026-11-17T17:28:34.0030135Z                 value = (java.lang.Integer)(new Integer(1));
2026-11-17T17:28:34.0030356Z                                             ^
2026-11-17T17:28:34.0030812Z /opt/ads-agent/_work/21/s/siemp-web/relatorioPosicaoDivida.java:713: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
2026-11-17T17:28:34.0031104Z                 value = (java.lang.Integer)(new Integer(1));
2026-11-17T17:28:34.0031345Z                                             ^
2026-11-17T17:28:34.0031802Z /opt/ads-agent/_work/21/s/siemp-web/relatorioPosicaoDivida.java:718: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
2026-11-17T17:28:34.0032143Z                 value = (java.lang.Integer)(new Integer(0));
2026-11-17T17:28:34.0032370Z                                             ^
2026-11-17T17:28:34.0032893Z /opt/ads-agent/_work/21/s/siemp-web/relatorioPosicaoDivida.java:771: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
2026-11-17T17:28:34.0033249Z                 value = (java.lang.Integer)(new Integer(1));
2026-11-17T17:28:34.0033474Z                                             ^
2026-11-17T17:28:34.0033934Z /opt/ads-agent/_work/21/s/siemp-web/relatorioPosicaoDivida.java:781: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
2026-11-17T17:28:34.0034294Z                 value = (java.lang.Integer)(new Integer(1));
2026-11-17T17:28:34.0034572Z                                             ^
2026-11-17T17:28:34.0034993Z /opt/ads-agent/_work/21/s/siemp-web/relatorioPosicaoDivida.java:791: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
2026-11-17T17:28:34.0035330Z                 value = (java.lang.Integer)(new Integer(0));
2026-11-17T17:28:34.0035556Z                                             ^
2026-11-17T17:28:34.0036072Z /opt/ads-agent/_work/21/s/siemp-web/relatorioPosicaoDivida.java:806: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
2026-11-17T17:28:34.0036409Z                 value = (java.lang.Integer)(new Integer(0));
2026-11-17T17:28:34.0036633Z                                             ^
2026-11-17T17:28:34.0037123Z /opt/ads-agent/_work/21/s/siemp-web/relatorioPosicaoDivida.java:901: warning: [removal] Boolean(boolean) in Boolean has been deprecated and marked for removal
2026-11-17T17:28:34.0037534Z                 value = (java.lang.Boolean)(new Boolean(((java.lang.String)field_nuParcela.getValue()) != null));
2026-11-17T17:28:34.0037805Z                                             ^
2026-11-17T17:28:34.0038261Z /opt/ads-agent/_work/21/s/siemp-web/relatorioPosicaoDivida.java:906: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
2026-11-17T17:28:34.0038665Z                 value = (java.lang.Integer)(new Integer(0));
2026-11-17T17:28:34.0038890Z                                             ^
2026-11-17T17:28:34.0039300Z /opt/ads-agent/_work/21/s/siemp-web/relatorioPosicaoDivida.java:916: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
2026-11-17T17:28:34.0039678Z                 value = (java.lang.Integer)(new Integer(1));
2026-11-17T17:28:34.0039901Z                                             ^
2026-11-17T17:28:34.0040360Z /opt/ads-agent/_work/21/s/siemp-web/relatorioPosicaoDivida.java:951: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
2026-11-17T17:28:34.0040722Z                 value = (java.lang.Integer)(new Integer(1));
2026-11-17T17:28:34.0040943Z                                             ^
2026-11-17T17:28:34.0041414Z /opt/ads-agent/_work/21/s/siemp-web/relatorioPosicaoDivida.java:956: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
2026-11-17T17:28:34.0041749Z                 value = (java.lang.Integer)(new Integer(1));
2026-11-17T17:28:34.0041970Z                                             ^
2026-11-17T17:28:34.0042428Z /opt/ads-agent/_work/21/s/siemp-web/relatorioPosicaoDivida.java:981: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
2026-11-17T17:28:34.0042769Z                 value = (java.lang.Integer)(new Integer(1));
2026-11-17T17:28:34.0042984Z                                             ^
2026-11-17T17:28:34.0043394Z /opt/ads-agent/_work/21/s/siemp-web/relatorioPosicaoDivida.java:986: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
2026-11-17T17:28:34.0043755Z                 value = (java.lang.Integer)(new Integer(0));
2026-11-17T17:28:34.0043986Z                                             ^
2026-11-17T17:28:34.0277710Z 33 warnings
2026-11-17T17:28:34.0800739Z [INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.613 s -- in br.gov.caixa.siemp.relatorios.RelatorioPosicaoDividaCalculatorTest
2026-11-17T17:28:34.0801087Z [INFO] Running br.gov.caixa.siemp.relatorios.ExportacaoPdfTest
2026-11-17T17:28:34.1988146Z log4j:WARN No appenders could be found for logger (net.sf.jasperreports.extensions.ExtensionsEnvironment).
2026-11-17T17:28:34.1988394Z log4j:WARN Please initialize the log4j system properly.
2026-11-17T17:28:34.9806618Z [ERROR] Tests run: 6, Failures: 0, Errors: 6, Skipped: 0, Time elapsed: 0.893 s <<< FAILURE! -- in br.gov.caixa.siemp.relatorios.ExportacaoPdfTest
2026-11-17T17:28:34.9807299Z [ERROR] br.gov.caixa.siemp.relatorios.ExportacaoPdfTest.deveGerarPdfLegivelComCabecalhoDetalhesEPaginacao[nce: 0 registros] -- Time elapsed: 0.448 s <<< ERROR!
2026-11-17T17:28:34.9808045Z net.sf.jasperreports.engine.util.JRFontNotFoundException: Font 'Arial' is not available to the JVM. See the Javadoc for more details.
2026-11-17T17:28:34.9808416Z 	at net.sf.jasperreports.engine.util.JRFontUtil.checkAwtFont(JRFontUtil.java:358)
2026-11-17T17:28:34.9808989Z 	at net.sf.jasperreports.engine.util.JRStyledText.getAwtAttributedString(JRStyledText.java:226)
2026-11-17T17:28:34.9809340Z 	at net.sf.jasperreports.engine.fill.TextMeasurer.measure(TextMeasurer.java:362)
2026-11-17T17:28:34.9809692Z 	at net.sf.jasperreports.engine.fill.JRFillTextElement.chopTextElement(JRFillTextElement.java:1129)
2026-11-17T17:28:34.9810090Z 	at net.sf.jasperreports.engine.fill.JRFillTextField.prepare(JRFillTextField.java:554)
2026-11-17T17:28:34.9810361Z 	at net.sf.jasperreports.engine.fill.JRFillElementContainer.prepareElements(JRFillElementContainer.java:329)
2026-11-17T17:28:34.9810589Z 	at net.sf.jasperreports.engine.fill.JRFillBand.fill(JRFillBand.java:419)
2026-11-17T17:28:34.9810833Z 	at net.sf.jasperreports.engine.fill.JRFillBand.fill(JRFillBand.java:378)
2026-11-17T17:28:34.9811053Z 	at net.sf.jasperreports.engine.fill.JRVerticalFiller.fillTitle(JRVerticalFiller.java:328)
2026-11-17T17:28:34.9811247Z 	at net.sf.jasperreports.engine.fill.JRVerticalFiller.fillReport(JRVerticalFiller.java:164)
2026-11-17T17:28:34.9811669Z 	at net.sf.jasperreports.engine.fill.JRBaseFiller.fill(JRBaseFiller.java:946)
2026-11-17T17:28:34.9811886Z 	at net.sf.jasperreports.engine.fill.JRBaseFiller.fill(JRBaseFiller.java:864)
2026-11-17T17:28:34.9812095Z 	at net.sf.jasperreports.engine.fill.JRFiller.fillReport(JRFiller.java:84)
2026-11-17T17:28:34.9812389Z 	at net.sf.jasperreports.engine.JasperFillManager.fillReport(JasperFillManager.java:624)
2026-11-17T17:28:34.9812745Z 	at br.gov.caixa.siemp.relatorios.ExportacaoPdfTest.deveGerarPdfLegivelComCabecalhoDetalhesEPaginacao(ExportacaoPdfTest.java:104)
2026-11-17T17:28:34.9813122Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-11-17T17:28:34.9813526Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-11-17T17:28:34.9813844Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-11-17T17:28:34.9814200Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-11-17T17:28:34.9814716Z 	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
2026-11-17T17:28:34.9815037Z 	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
2026-11-17T17:28:34.9815416Z 	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
2026-11-17T17:28:34.9815775Z 	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
2026-11-17T17:28:34.9816118Z 	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
2026-11-17T17:28:34.9816437Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
2026-11-17T17:28:34.9816724Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
2026-11-17T17:28:34.9816932Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:34.9817135Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:34.9817337Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:34.9817544Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:34.9817708Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:34.9817908Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:34.9818092Z 	at org.junit.runners.Suite.runChild(Suite.java:127)
2026-11-17T17:28:34.9818285Z 	at org.junit.runners.Suite.runChild(Suite.java:26)
2026-11-17T17:28:34.9818501Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:34.9818703Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:34.9818904Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:34.9819098Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:34.9819296Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:34.9819453Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:34.9819759Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:316)
2026-11-17T17:28:34.9819998Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:240)
2026-11-17T17:28:34.9820261Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:214)
2026-11-17T17:28:34.9820506Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:155)
2026-11-17T17:28:34.9820728Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-11-17T17:28:34.9820950Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-11-17T17:28:34.9821156Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-11-17T17:28:34.9821474Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-11-17T17:28:34.9821555Z 
2026-11-17T17:28:34.9821943Z [ERROR] br.gov.caixa.siemp.relatorios.ExportacaoPdfTest.deveGerarPdfLegivelComCabecalhoDetalhesEPaginacao[nce: 1 registros] -- Time elapsed: 0.042 s <<< ERROR!
2026-11-17T17:28:34.9822301Z net.sf.jasperreports.engine.util.JRFontNotFoundException: Font 'Arial' is not available to the JVM. See the Javadoc for more details.
2026-11-17T17:28:34.9822579Z 	at net.sf.jasperreports.engine.util.JRFontUtil.checkAwtFont(JRFontUtil.java:358)
2026-11-17T17:28:34.9822828Z 	at net.sf.jasperreports.engine.util.JRStyledText.getAwtAttributedString(JRStyledText.java:226)
2026-11-17T17:28:34.9823136Z 	at net.sf.jasperreports.engine.fill.TextMeasurer.measure(TextMeasurer.java:362)
2026-11-17T17:28:34.9823366Z 	at net.sf.jasperreports.engine.fill.JRFillTextElement.chopTextElement(JRFillTextElement.java:1129)
2026-11-17T17:28:34.9823564Z 	at net.sf.jasperreports.engine.fill.JRFillTextField.prepare(JRFillTextField.java:554)
2026-11-17T17:28:34.9823801Z 	at net.sf.jasperreports.engine.fill.JRFillElementContainer.prepareElements(JRFillElementContainer.java:329)
2026-11-17T17:28:34.9824028Z 	at net.sf.jasperreports.engine.fill.JRFillBand.fill(JRFillBand.java:419)
2026-11-17T17:28:34.9824245Z 	at net.sf.jasperreports.engine.fill.JRFillBand.fill(JRFillBand.java:378)
2026-11-17T17:28:34.9824465Z 	at net.sf.jasperreports.engine.fill.JRVerticalFiller.fillTitle(JRVerticalFiller.java:328)
2026-11-17T17:28:34.9824851Z 	at net.sf.jasperreports.engine.fill.JRVerticalFiller.fillReportStart(JRVerticalFiller.java:262)
2026-11-17T17:28:34.9825114Z 	at net.sf.jasperreports.engine.fill.JRVerticalFiller.fillReport(JRVerticalFiller.java:128)
2026-11-17T17:28:34.9825334Z 	at net.sf.jasperreports.engine.fill.JRBaseFiller.fill(JRBaseFiller.java:946)
2026-11-17T17:28:34.9825544Z 	at net.sf.jasperreports.engine.fill.JRBaseFiller.fill(JRBaseFiller.java:864)
2026-11-17T17:28:34.9825754Z 	at net.sf.jasperreports.engine.fill.JRFiller.fillReport(JRFiller.java:84)
2026-11-17T17:28:34.9825984Z 	at net.sf.jasperreports.engine.JasperFillManager.fillReport(JasperFillManager.java:624)
2026-11-17T17:28:34.9826196Z 	at br.gov.caixa.siemp.relatorios.ExportacaoPdfTest.deveGerarPdfLegivelComCabecalhoDetalhesEPaginacao(ExportacaoPdfTest.java:104)
2026-11-17T17:28:34.9826434Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-11-17T17:28:34.9826652Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-11-17T17:28:34.9826899Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-11-17T17:28:34.9827145Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-11-17T17:28:34.9827357Z 	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
2026-11-17T17:28:34.9827581Z 	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
2026-11-17T17:28:34.9827804Z 	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
2026-11-17T17:28:34.9828032Z 	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
2026-11-17T17:28:34.9828234Z 	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
2026-11-17T17:28:34.9828437Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
2026-11-17T17:28:34.9828619Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
2026-11-17T17:28:34.9828825Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:34.9829046Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:34.9829248Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:34.9829447Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:34.9829661Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:34.9829910Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:34.9830098Z 	at org.junit.runners.Suite.runChild(Suite.java:127)
2026-11-17T17:28:34.9830279Z 	at org.junit.runners.Suite.runChild(Suite.java:26)
2026-11-17T17:28:34.9830466Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:34.9830657Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:34.9830958Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:34.9831156Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:34.9831364Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:34.9831556Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:34.9831766Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:316)
2026-11-17T17:28:34.9831987Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:240)
2026-11-17T17:28:34.9832220Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:214)
2026-11-17T17:28:34.9832446Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:155)
2026-11-17T17:28:34.9832683Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-11-17T17:28:34.9832869Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-11-17T17:28:34.9833090Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-11-17T17:28:34.9833305Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-11-17T17:28:34.9833983Z 
2026-11-17T17:28:34.9834306Z [ERROR] br.gov.caixa.siemp.relatorios.ExportacaoPdfTest.deveGerarPdfLegivelComCabecalhoDetalhesEPaginacao[nce: 100 registros] -- Time elapsed: 0.053 s <<< ERROR!
2026-11-17T17:28:34.9834774Z net.sf.jasperreports.engine.util.JRFontNotFoundException: Font 'Arial' is not available to the JVM. See the Javadoc for more details.
2026-11-17T17:28:34.9835023Z 	at net.sf.jasperreports.engine.util.JRFontUtil.checkAwtFont(JRFontUtil.java:358)
2026-11-17T17:28:34.9835253Z 	at net.sf.jasperreports.engine.util.JRStyledText.getAwtAttributedString(JRStyledText.java:226)
2026-11-17T17:28:34.9835482Z 	at net.sf.jasperreports.engine.fill.TextMeasurer.measure(TextMeasurer.java:362)
2026-11-17T17:28:34.9835762Z 	at net.sf.jasperreports.engine.fill.JRFillTextElement.chopTextElement(JRFillTextElement.java:1129)
2026-11-17T17:28:34.9836011Z 	at net.sf.jasperreports.engine.fill.JRFillTextField.prepare(JRFillTextField.java:554)
2026-11-17T17:28:34.9836244Z 	at net.sf.jasperreports.engine.fill.JRFillElementContainer.prepareElements(JRFillElementContainer.java:329)
2026-11-17T17:28:34.9836480Z 	at net.sf.jasperreports.engine.fill.JRFillBand.fill(JRFillBand.java:419)
2026-11-17T17:28:34.9836683Z 	at net.sf.jasperreports.engine.fill.JRFillBand.fill(JRFillBand.java:378)
2026-11-17T17:28:34.9836906Z 	at net.sf.jasperreports.engine.fill.JRVerticalFiller.fillTitle(JRVerticalFiller.java:328)
2026-11-17T17:28:34.9837141Z 	at net.sf.jasperreports.engine.fill.JRVerticalFiller.fillReportStart(JRVerticalFiller.java:262)
2026-11-17T17:28:34.9837333Z 	at net.sf.jasperreports.engine.fill.JRVerticalFiller.fillReport(JRVerticalFiller.java:128)
2026-11-17T17:28:34.9837553Z 	at net.sf.jasperreports.engine.fill.JRBaseFiller.fill(JRBaseFiller.java:946)
2026-11-17T17:28:34.9837802Z 	at net.sf.jasperreports.engine.fill.JRBaseFiller.fill(JRBaseFiller.java:864)
2026-11-17T17:28:34.9838010Z 	at net.sf.jasperreports.engine.fill.JRFiller.fillReport(JRFiller.java:84)
2026-11-17T17:28:34.9838229Z 	at net.sf.jasperreports.engine.JasperFillManager.fillReport(JasperFillManager.java:624)
2026-11-17T17:28:34.9838478Z 	at br.gov.caixa.siemp.relatorios.ExportacaoPdfTest.deveGerarPdfLegivelComCabecalhoDetalhesEPaginacao(ExportacaoPdfTest.java:104)
2026-11-17T17:28:34.9838716Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-11-17T17:28:34.9838998Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-11-17T17:28:34.9839233Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-11-17T17:28:34.9839548Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-11-17T17:28:34.9839818Z 	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
2026-11-17T17:28:34.9840007Z 	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
2026-11-17T17:28:34.9840231Z 	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
2026-11-17T17:28:34.9840450Z 	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
2026-11-17T17:28:34.9840665Z 	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
2026-11-17T17:28:34.9840875Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
2026-11-17T17:28:34.9841095Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
2026-11-17T17:28:34.9841315Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:34.9841511Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:34.9841735Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:34.9841935Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:34.9842099Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:34.9842293Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:34.9842481Z 	at org.junit.runners.Suite.runChild(Suite.java:127)
2026-11-17T17:28:34.9842663Z 	at org.junit.runners.Suite.runChild(Suite.java:26)
2026-11-17T17:28:34.9842850Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:34.9843059Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:34.9843259Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:34.9843479Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:34.9843675Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:34.9843833Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:34.9844036Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:316)
2026-11-17T17:28:34.9844258Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:240)
2026-11-17T17:28:34.9844488Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:214)
2026-11-17T17:28:34.9844859Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:155)
2026-11-17T17:28:34.9845087Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-11-17T17:28:34.9845311Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-11-17T17:28:34.9845553Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-11-17T17:28:34.9845768Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-11-17T17:28:34.9845850Z 
2026-11-17T17:28:34.9846163Z [ERROR] br.gov.caixa.siemp.relatorios.ExportacaoPdfTest.deveGerarPdfLegivelComCabecalhoDetalhesEPaginacao[rural: 0 registros] -- Time elapsed: 0.032 s <<< ERROR!
2026-11-17T17:28:34.9846587Z net.sf.jasperreports.engine.util.JRFontNotFoundException: Font 'Arial Black' is not available to the JVM. See the Javadoc for more details.
2026-11-17T17:28:34.9846941Z 	at net.sf.jasperreports.engine.util.JRFontUtil.checkAwtFont(JRFontUtil.java:358)
2026-11-17T17:28:34.9847318Z 	at net.sf.jasperreports.engine.util.JRStyledText.getAwtAttributedString(JRStyledText.java:226)
2026-11-17T17:28:34.9847761Z 	at net.sf.jasperreports.engine.fill.TextMeasurer.measure(TextMeasurer.java:362)
2026-11-17T17:28:34.9848191Z 	at net.sf.jasperreports.engine.fill.JRFillTextElement.chopTextElement(JRFillTextElement.java:1129)
2026-11-17T17:28:34.9848615Z 	at net.sf.jasperreports.engine.fill.JRFillStaticText.prepare(JRFillStaticText.java:183)
2026-11-17T17:28:34.9848953Z 	at net.sf.jasperreports.engine.fill.JRFillElementContainer.prepareElements(JRFillElementContainer.java:329)
2026-11-17T17:28:34.9849320Z 	at net.sf.jasperreports.engine.fill.JRFillBand.fill(JRFillBand.java:419)
2026-11-17T17:28:34.9849535Z 	at net.sf.jasperreports.engine.fill.JRFillBand.fill(JRFillBand.java:378)
2026-11-17T17:28:34.9849850Z 	at net.sf.jasperreports.engine.fill.JRVerticalFiller.fillTitle(JRVerticalFiller.java:328)
2026-11-17T17:28:34.9850082Z 	at net.sf.jasperreports.engine.fill.JRVerticalFiller.fillReportStart(JRVerticalFiller.java:262)
2026-11-17T17:28:34.9850422Z 	at net.sf.jasperreports.engine.fill.JRVerticalFiller.fillReport(JRVerticalFiller.java:128)
2026-11-17T17:28:34.9850756Z 	at net.sf.jasperreports.engine.fill.JRBaseFiller.fill(JRBaseFiller.java:946)
2026-11-17T17:28:34.9851082Z 	at net.sf.jasperreports.engine.fill.JRBaseFiller.fill(JRBaseFiller.java:864)
2026-11-17T17:28:34.9851469Z 	at net.sf.jasperreports.engine.fill.JRFiller.fillReport(JRFiller.java:84)
2026-11-17T17:28:34.9851812Z 	at net.sf.jasperreports.engine.JasperFillManager.fillReport(JasperFillManager.java:624)
2026-11-17T17:28:34.9852177Z 	at br.gov.caixa.siemp.relatorios.ExportacaoPdfTest.deveGerarPdfLegivelComCabecalhoDetalhesEPaginacao(ExportacaoPdfTest.java:104)
2026-11-17T17:28:34.9852447Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-11-17T17:28:34.9852681Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-11-17T17:28:34.9852926Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-11-17T17:28:34.9853142Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-11-17T17:28:34.9853355Z 	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
2026-11-17T17:28:34.9853740Z 	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
2026-11-17T17:28:34.9853930Z 	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
2026-11-17T17:28:34.9854154Z 	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
2026-11-17T17:28:34.9854373Z 	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
2026-11-17T17:28:34.9854718Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
2026-11-17T17:28:34.9854953Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
2026-11-17T17:28:34.9855161Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:34.9855359Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:34.9855567Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:34.9855786Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:34.9855984Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:34.9856141Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:34.9856342Z 	at org.junit.runners.Suite.runChild(Suite.java:127)
2026-11-17T17:28:34.9856528Z 	at org.junit.runners.Suite.runChild(Suite.java:26)
2026-11-17T17:28:34.9856797Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:34.9856996Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:34.9857524Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:34.9857806Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:34.9858032Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:34.9858319Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:34.9858490Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:316)
2026-11-17T17:28:34.9858715Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:240)
2026-11-17T17:28:34.9858983Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:214)
2026-11-17T17:28:34.9859209Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:155)
2026-11-17T17:28:34.9859429Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-11-17T17:28:34.9859656Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-11-17T17:28:34.9859865Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-11-17T17:28:34.9860108Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-11-17T17:28:34.9860190Z 
2026-11-17T17:28:34.9860555Z [ERROR] br.gov.caixa.siemp.relatorios.ExportacaoPdfTest.deveGerarPdfLegivelComCabecalhoDetalhesEPaginacao[rural: 1 registros] -- Time elapsed: 0.020 s <<< ERROR!
2026-11-17T17:28:34.9860915Z net.sf.jasperreports.engine.util.JRFontNotFoundException: Font 'Arial Black' is not available to the JVM. See the Javadoc for more details.
2026-11-17T17:28:34.9861253Z 	at net.sf.jasperreports.engine.util.JRFontUtil.checkAwtFont(JRFontUtil.java:358)
2026-11-17T17:28:34.9861551Z 	at net.sf.jasperreports.engine.util.JRStyledText.getAwtAttributedString(JRStyledText.java:226)
2026-11-17T17:28:34.9861779Z 	at net.sf.jasperreports.engine.fill.TextMeasurer.measure(TextMeasurer.java:362)
2026-11-17T17:28:34.9862001Z 	at net.sf.jasperreports.engine.fill.JRFillTextElement.chopTextElement(JRFillTextElement.java:1129)
2026-11-17T17:28:34.9862244Z 	at net.sf.jasperreports.engine.fill.JRFillStaticText.prepare(JRFillStaticText.java:183)
2026-11-17T17:28:34.9862443Z 	at net.sf.jasperreports.engine.fill.JRFillElementContainer.prepareElements(JRFillElementContainer.java:329)
2026-11-17T17:28:34.9862702Z 	at net.sf.jasperreports.engine.fill.JRFillBand.fill(JRFillBand.java:419)
2026-11-17T17:28:34.9862910Z 	at net.sf.jasperreports.engine.fill.JRFillBand.fill(JRFillBand.java:378)
2026-11-17T17:28:34.9863124Z 	at net.sf.jasperreports.engine.fill.JRVerticalFiller.fillTitle(JRVerticalFiller.java:328)
2026-11-17T17:28:34.9863352Z 	at net.sf.jasperreports.engine.fill.JRVerticalFiller.fillReportStart(JRVerticalFiller.java:262)
2026-11-17T17:28:34.9863582Z 	at net.sf.jasperreports.engine.fill.JRVerticalFiller.fillReport(JRVerticalFiller.java:128)
2026-11-17T17:28:34.9863800Z 	at net.sf.jasperreports.engine.fill.JRBaseFiller.fill(JRBaseFiller.java:946)
2026-11-17T17:28:34.9864008Z 	at net.sf.jasperreports.engine.fill.JRBaseFiller.fill(JRBaseFiller.java:864)
2026-11-17T17:28:34.9864230Z 	at net.sf.jasperreports.engine.fill.JRFiller.fillReport(JRFiller.java:84)
2026-11-17T17:28:34.9864459Z 	at net.sf.jasperreports.engine.JasperFillManager.fillReport(JasperFillManager.java:624)
2026-11-17T17:28:34.9864941Z 	at br.gov.caixa.siemp.relatorios.ExportacaoPdfTest.deveGerarPdfLegivelComCabecalhoDetalhesEPaginacao(ExportacaoPdfTest.java:104)
2026-11-17T17:28:34.9865148Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-11-17T17:28:34.9865367Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-11-17T17:28:34.9865680Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-11-17T17:28:34.9865896Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-11-17T17:28:34.9866104Z 	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
2026-11-17T17:28:34.9866427Z 	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
2026-11-17T17:28:34.9866656Z 	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
2026-11-17T17:28:34.9866972Z 	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
2026-11-17T17:28:34.9867180Z 	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
2026-11-17T17:28:34.9867384Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
2026-11-17T17:28:34.9867633Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
2026-11-17T17:28:34.9867805Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:34.9868011Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:34.9868208Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:34.9868408Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:34.9868605Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:34.9868824Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:34.9869009Z 	at org.junit.runners.Suite.runChild(Suite.java:127)
2026-11-17T17:28:34.9869187Z 	at org.junit.runners.Suite.runChild(Suite.java:26)
2026-11-17T17:28:34.9869371Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:34.9869529Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:34.9869739Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:34.9869936Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:34.9870131Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:34.9870344Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:34.9870568Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:316)
2026-11-17T17:28:34.9870791Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:240)
2026-11-17T17:28:34.9871025Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:214)
2026-11-17T17:28:34.9871254Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:155)
2026-11-17T17:28:34.9871472Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-11-17T17:28:34.9871693Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-11-17T17:28:34.9871867Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-11-17T17:28:34.9872138Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-11-17T17:28:34.9872333Z 
2026-11-17T17:28:34.9872796Z [ERROR] br.gov.caixa.siemp.relatorios.ExportacaoPdfTest.deveGerarPdfLegivelComCabecalhoDetalhesEPaginacao[rural: 100 registros] -- Time elapsed: 0.295 s <<< ERROR!
2026-11-17T17:28:34.9873357Z net.sf.jasperreports.engine.util.JRFontNotFoundException: Font 'Arial Black' is not available to the JVM. See the Javadoc for more details.
2026-11-17T17:28:34.9873627Z 	at net.sf.jasperreports.engine.util.JRFontUtil.checkAwtFont(JRFontUtil.java:358)
2026-11-17T17:28:34.9873966Z 	at net.sf.jasperreports.engine.util.JRStyledText.getAwtAttributedString(JRStyledText.java:226)
2026-11-17T17:28:34.9874306Z 	at net.sf.jasperreports.engine.fill.TextMeasurer.measure(TextMeasurer.java:362)
2026-11-17T17:28:34.9874694Z 	at net.sf.jasperreports.engine.fill.JRFillTextElement.chopTextElement(JRFillTextElement.java:1129)
2026-11-17T17:28:34.9875007Z 	at net.sf.jasperreports.engine.fill.JRFillStaticText.prepare(JRFillStaticText.java:183)
2026-11-17T17:28:34.9875304Z 	at net.sf.jasperreports.engine.fill.JRFillElementContainer.prepareElements(JRFillElementContainer.java:329)
2026-11-17T17:28:34.9875636Z 	at net.sf.jasperreports.engine.fill.JRFillBand.fill(JRFillBand.java:419)
2026-11-17T17:28:34.9876036Z 	at net.sf.jasperreports.engine.fill.JRFillBand.fill(JRFillBand.java:378)
2026-11-17T17:28:34.9876361Z 	at net.sf.jasperreports.engine.fill.JRVerticalFiller.fillTitle(JRVerticalFiller.java:328)
2026-11-17T17:28:34.9876815Z 	at net.sf.jasperreports.engine.fill.JRVerticalFiller.fillReportStart(JRVerticalFiller.java:262)
2026-11-17T17:28:34.9877186Z 	at net.sf.jasperreports.engine.fill.JRVerticalFiller.fillReport(JRVerticalFiller.java:128)
2026-11-17T17:28:34.9877490Z 	at net.sf.jasperreports.engine.fill.JRBaseFiller.fill(JRBaseFiller.java:946)
2026-11-17T17:28:34.9877903Z 	at net.sf.jasperreports.engine.fill.JRBaseFiller.fill(JRBaseFiller.java:864)
2026-11-17T17:28:34.9878233Z 	at net.sf.jasperreports.engine.fill.JRFiller.fillReport(JRFiller.java:84)
2026-11-17T17:28:34.9878592Z 	at net.sf.jasperreports.engine.JasperFillManager.fillReport(JasperFillManager.java:624)
2026-11-17T17:28:34.9878880Z 	at br.gov.caixa.siemp.relatorios.ExportacaoPdfTest.deveGerarPdfLegivelComCabecalhoDetalhesEPaginacao(ExportacaoPdfTest.java:104)
2026-11-17T17:28:34.9879156Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-11-17T17:28:34.9879390Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-11-17T17:28:34.9879698Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-11-17T17:28:34.9879963Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-11-17T17:28:34.9880176Z 	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
2026-11-17T17:28:34.9880399Z 	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
2026-11-17T17:28:34.9880583Z 	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
2026-11-17T17:28:34.9880801Z 	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
2026-11-17T17:28:34.9881008Z 	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
2026-11-17T17:28:34.9881252Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
2026-11-17T17:28:34.9881465Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
2026-11-17T17:28:34.9881673Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:34.9881869Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:34.9882072Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:34.9882269Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:34.9882464Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:34.9882625Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:34.9882981Z 	at org.junit.runners.Suite.runChild(Suite.java:127)
2026-11-17T17:28:34.9883196Z 	at org.junit.runners.Suite.runChild(Suite.java:26)
2026-11-17T17:28:34.9883395Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:34.9883593Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:34.9883794Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:34.9883997Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:34.9884192Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:34.9884386Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:34.9884680Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:316)
2026-11-17T17:28:34.9884931Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:240)
2026-11-17T17:28:34.9885187Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:214)
2026-11-17T17:28:34.9885414Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:155)
2026-11-17T17:28:34.9885636Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-11-17T17:28:34.9885855Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-11-17T17:28:34.9886131Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-11-17T17:28:34.9886340Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-11-17T17:28:34.9886419Z 
2026-11-17T17:28:34.9886583Z [INFO] Running br.gov.caixa.siemp.relatorios.ModelosJasperTest
2026-11-17T17:28:35.9439055Z [ERROR] Tests run: 52, Failures: 0, Errors: 26, Skipped: 0, Time elapsed: 0.942 s <<< FAILURE! -- in br.gov.caixa.siemp.relatorios.ModelosJasperTest
2026-11-17T17:28:35.9439817Z [ERROR] br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual[consignacao/consultarParametrosDoConvenio.jasper] -- Time elapsed: 0.289 s <<< ERROR!
2026-11-17T17:28:35.9440571Z net.sf.jasperreports.engine.JRException: Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/consultarParametrosDoConvenio_1794936515260_794197.java 
2026-11-17T17:28:35.9441197Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:89)
2026-11-17T17:28:35.9441500Z 	at net.sf.jasperreports.engine.design.JRAbstractClassCompiler.compileUnits(JRAbstractClassCompiler.java:63)
2026-11-17T17:28:35.9441907Z 	at net.sf.jasperreports.engine.design.JRAbstractCompiler.compileReport(JRAbstractCompiler.java:188)
2026-11-17T17:28:35.9442167Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:215)
2026-11-17T17:28:35.9442472Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:148)
2026-11-17T17:28:35.9442764Z 	at br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual(ModelosJasperTest.java:67)
2026-11-17T17:28:35.9443046Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-11-17T17:28:35.9443341Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-11-17T17:28:35.9443598Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-11-17T17:28:35.9443817Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-11-17T17:28:35.9443993Z 	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
2026-11-17T17:28:35.9444246Z 	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
2026-11-17T17:28:35.9444624Z 	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
2026-11-17T17:28:35.9444878Z 	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
2026-11-17T17:28:35.9445096Z 	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
2026-11-17T17:28:35.9445313Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
2026-11-17T17:28:35.9445538Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
2026-11-17T17:28:35.9445749Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9445965Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9446177Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9446384Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9446550Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9446753Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9446946Z 	at org.junit.runners.Suite.runChild(Suite.java:127)
2026-11-17T17:28:35.9447134Z 	at org.junit.runners.Suite.runChild(Suite.java:26)
2026-11-17T17:28:35.9447353Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9447556Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9447801Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9448202Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9448430Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9448708Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9448949Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:316)
2026-11-17T17:28:35.9449315Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:240)
2026-11-17T17:28:35.9449641Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:214)
2026-11-17T17:28:35.9449890Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:155)
2026-11-17T17:28:35.9450110Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-11-17T17:28:35.9450335Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-11-17T17:28:35.9450546Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-11-17T17:28:35.9450761Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-11-17T17:28:35.9451096Z Caused by: java.io.IOException: Cannot run program "javac": error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:35.9451309Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1143)
2026-11-17T17:28:35.9451483Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1073)
2026-11-17T17:28:35.9451709Z 	at java.base/java.lang.Runtime.exec(Runtime.java:594)
2026-11-17T17:28:35.9451913Z 	at java.base/java.lang.Runtime.exec(Runtime.java:453)
2026-11-17T17:28:35.9452162Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:58)
2026-11-17T17:28:35.9452340Z 	... 38 more
2026-11-17T17:28:35.9452569Z Caused by: java.io.IOException: error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:35.9452755Z 	at java.base/java.lang.ProcessImpl.forkAndExec(Native Method)
2026-11-17T17:28:35.9452940Z 	at java.base/java.lang.ProcessImpl.<init>(ProcessImpl.java:314)
2026-11-17T17:28:35.9453170Z 	at java.base/java.lang.ProcessImpl.start(ProcessImpl.java:244)
2026-11-17T17:28:35.9453335Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1110)
2026-11-17T17:28:35.9453498Z 	... 42 more
2026-11-17T17:28:35.9453577Z 
2026-11-17T17:28:35.9453901Z [ERROR] br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual[consignacao/consultarParametrosDoConvenioReport.jasper] -- Time elapsed: 0.057 s <<< ERROR!
2026-11-17T17:28:35.9454297Z net.sf.jasperreports.engine.JRException: Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/consultarParametrosDoConvenioReport_1794936515325_590539.java 
2026-11-17T17:28:35.9454633Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:89)
2026-11-17T17:28:35.9454849Z 	at net.sf.jasperreports.engine.design.JRAbstractClassCompiler.compileUnits(JRAbstractClassCompiler.java:63)
2026-11-17T17:28:35.9455113Z 	at net.sf.jasperreports.engine.design.JRAbstractCompiler.compileReport(JRAbstractCompiler.java:188)
2026-11-17T17:28:35.9455362Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:215)
2026-11-17T17:28:35.9455597Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:148)
2026-11-17T17:28:35.9455875Z 	at br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual(ModelosJasperTest.java:67)
2026-11-17T17:28:35.9456126Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-11-17T17:28:35.9456345Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-11-17T17:28:35.9456588Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-11-17T17:28:35.9456842Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-11-17T17:28:35.9457638Z 	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
2026-11-17T17:28:35.9457916Z 	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
2026-11-17T17:28:35.9458223Z 	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
2026-11-17T17:28:35.9458452Z 	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
2026-11-17T17:28:35.9458668Z 	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
2026-11-17T17:28:35.9458881Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
2026-11-17T17:28:35.9459170Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
2026-11-17T17:28:35.9459449Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9459649Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9459853Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9460052Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9460253Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9460447Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9460603Z 	at org.junit.runners.Suite.runChild(Suite.java:127)
2026-11-17T17:28:35.9460788Z 	at org.junit.runners.Suite.runChild(Suite.java:26)
2026-11-17T17:28:35.9460985Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9461216Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9461414Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9461612Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9461807Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9462002Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9462208Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:316)
2026-11-17T17:28:35.9462397Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:240)
2026-11-17T17:28:35.9462629Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:214)
2026-11-17T17:28:35.9462866Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:155)
2026-11-17T17:28:35.9463106Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-11-17T17:28:35.9463324Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-11-17T17:28:35.9463536Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-11-17T17:28:35.9463743Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-11-17T17:28:35.9464100Z Caused by: java.io.IOException: Cannot run program "javac": error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:35.9464307Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1143)
2026-11-17T17:28:35.9464570Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1073)
2026-11-17T17:28:35.9464861Z 	at java.base/java.lang.Runtime.exec(Runtime.java:594)
2026-11-17T17:28:35.9465070Z 	at java.base/java.lang.Runtime.exec(Runtime.java:453)
2026-11-17T17:28:35.9465318Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:58)
2026-11-17T17:28:35.9465592Z 	... 38 more
2026-11-17T17:28:35.9465821Z Caused by: java.io.IOException: error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:35.9466006Z 	at java.base/java.lang.ProcessImpl.forkAndExec(Native Method)
2026-11-17T17:28:35.9466189Z 	at java.base/java.lang.ProcessImpl.<init>(ProcessImpl.java:314)
2026-11-17T17:28:35.9466381Z 	at java.base/java.lang.ProcessImpl.start(ProcessImpl.java:244)
2026-11-17T17:28:35.9466657Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1110)
2026-11-17T17:28:35.9466841Z 	... 42 more
2026-11-17T17:28:35.9466884Z 
2026-11-17T17:28:35.9467231Z [ERROR] br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual[consignacao/consultarTabelaDeTACDoConvenio.jasper] -- Time elapsed: 0.063 s <<< ERROR!
2026-11-17T17:28:35.9467668Z net.sf.jasperreports.engine.JRException: Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/consultarTabelaDeTACDoConvenio_1794936515386_9133.java 
2026-11-17T17:28:35.9467932Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:89)
2026-11-17T17:28:35.9468171Z 	at net.sf.jasperreports.engine.design.JRAbstractClassCompiler.compileUnits(JRAbstractClassCompiler.java:63)
2026-11-17T17:28:35.9468382Z 	at net.sf.jasperreports.engine.design.JRAbstractCompiler.compileReport(JRAbstractCompiler.java:188)
2026-11-17T17:28:35.9469373Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:215)
2026-11-17T17:28:35.9469617Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:148)
2026-11-17T17:28:35.9469865Z 	at br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual(ModelosJasperTest.java:67)
2026-11-17T17:28:35.9470100Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-11-17T17:28:35.9470327Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-11-17T17:28:35.9470568Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-11-17T17:28:35.9470781Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-11-17T17:28:35.9470973Z 	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
2026-11-17T17:28:35.9471317Z 	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
2026-11-17T17:28:35.9471565Z 	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
2026-11-17T17:28:35.9471863Z 	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
2026-11-17T17:28:35.9472089Z 	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
2026-11-17T17:28:35.9472267Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
2026-11-17T17:28:35.9472493Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
2026-11-17T17:28:35.9472697Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9472892Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9473174Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9473403Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9473598Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9473789Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9473982Z 	at org.junit.runners.Suite.runChild(Suite.java:127)
2026-11-17T17:28:35.9474128Z 	at org.junit.runners.Suite.runChild(Suite.java:26)
2026-11-17T17:28:35.9474316Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9474684Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9474908Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9475113Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9475347Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9475541Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9475746Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:316)
2026-11-17T17:28:35.9475981Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:240)
2026-11-17T17:28:35.9476278Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:214)
2026-11-17T17:28:35.9476564Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:155)
2026-11-17T17:28:35.9476809Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-11-17T17:28:35.9477071Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-11-17T17:28:35.9477281Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-11-17T17:28:35.9477551Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-11-17T17:28:35.9477928Z Caused by: java.io.IOException: Cannot run program "javac": error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:35.9478142Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1143)
2026-11-17T17:28:35.9478347Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1073)
2026-11-17T17:28:35.9478537Z 	at java.base/java.lang.Runtime.exec(Runtime.java:594)
2026-11-17T17:28:35.9478720Z 	at java.base/java.lang.Runtime.exec(Runtime.java:453)
2026-11-17T17:28:35.9478893Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:58)
2026-11-17T17:28:35.9479107Z 	... 38 more
2026-11-17T17:28:35.9479369Z Caused by: java.io.IOException: error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:35.9479580Z 	at java.base/java.lang.ProcessImpl.forkAndExec(Native Method)
2026-11-17T17:28:35.9479773Z 	at java.base/java.lang.ProcessImpl.<init>(ProcessImpl.java:314)
2026-11-17T17:28:35.9479965Z 	at java.base/java.lang.ProcessImpl.start(ProcessImpl.java:244)
2026-11-17T17:28:35.9480158Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1110)
2026-11-17T17:28:35.9480312Z 	... 42 more
2026-11-17T17:28:35.9480355Z 
2026-11-17T17:28:35.9480676Z [ERROR] br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual[consignacao/consultarTabelaDeTACDoConvenioNovo.jasper] -- Time elapsed: 0.036 s <<< ERROR!
2026-11-17T17:28:35.9481163Z net.sf.jasperreports.engine.JRException: Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/consultarTabelaDeTACDoConvenioNovo_1794936515427_418669.java 
2026-11-17T17:28:35.9481428Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:89)
2026-11-17T17:28:35.9481705Z 	at net.sf.jasperreports.engine.design.JRAbstractClassCompiler.compileUnits(JRAbstractClassCompiler.java:63)
2026-11-17T17:28:35.9481948Z 	at net.sf.jasperreports.engine.design.JRAbstractCompiler.compileReport(JRAbstractCompiler.java:188)
2026-11-17T17:28:35.9482182Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:215)
2026-11-17T17:28:35.9482380Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:148)
2026-11-17T17:28:35.9482633Z 	at br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual(ModelosJasperTest.java:67)
2026-11-17T17:28:35.9482862Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-11-17T17:28:35.9483078Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-11-17T17:28:35.9483319Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-11-17T17:28:35.9483538Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-11-17T17:28:35.9483775Z 	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
2026-11-17T17:28:35.9484001Z 	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
2026-11-17T17:28:35.9484241Z 	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
2026-11-17T17:28:35.9484476Z 	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
2026-11-17T17:28:35.9484822Z 	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
2026-11-17T17:28:35.9485087Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
2026-11-17T17:28:35.9485387Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
2026-11-17T17:28:35.9485799Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9486091Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9486443Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9486716Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9486919Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9487178Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9487461Z 	at org.junit.runners.Suite.runChild(Suite.java:127)
2026-11-17T17:28:35.9487759Z 	at org.junit.runners.Suite.runChild(Suite.java:26)
2026-11-17T17:28:35.9487984Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9488315Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9488625Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9488952Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9489225Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9489530Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9489740Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:316)
2026-11-17T17:28:35.9490057Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:240)
2026-11-17T17:28:35.9490442Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:214)
2026-11-17T17:28:35.9490804Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:155)
2026-11-17T17:28:35.9491051Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-11-17T17:28:35.9491268Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-11-17T17:28:35.9491554Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-11-17T17:28:35.9491859Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-11-17T17:28:35.9492358Z Caused by: java.io.IOException: Cannot run program "javac": error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:35.9492641Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1143)
2026-11-17T17:28:35.9492858Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1073)
2026-11-17T17:28:35.9493136Z 	at java.base/java.lang.Runtime.exec(Runtime.java:594)
2026-11-17T17:28:35.9493423Z 	at java.base/java.lang.Runtime.exec(Runtime.java:453)
2026-11-17T17:28:35.9493752Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:58)
2026-11-17T17:28:35.9493997Z 	... 38 more
2026-11-17T17:28:35.9494370Z Caused by: java.io.IOException: error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:35.9494719Z 	at java.base/java.lang.ProcessImpl.forkAndExec(Native Method)
2026-11-17T17:28:35.9495022Z 	at java.base/java.lang.ProcessImpl.<init>(ProcessImpl.java:314)
2026-11-17T17:28:35.9495289Z 	at java.base/java.lang.ProcessImpl.start(ProcessImpl.java:244)
2026-11-17T17:28:35.9495505Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1110)
2026-11-17T17:28:35.9495730Z 	... 42 more
2026-11-17T17:28:35.9495774Z 
2026-11-17T17:28:35.9496241Z [ERROR] br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual[consignacao/consultarTabelaDeTACDoConvenioSubReport.jasper] -- Time elapsed: 0.030 s <<< ERROR!
2026-11-17T17:28:35.9496900Z net.sf.jasperreports.engine.JRException: Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/consultarTabelaDeTACDoConvenioSubReport_1794936515460_100517.java 
2026-11-17T17:28:35.9497503Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:89)
2026-11-17T17:28:35.9497894Z 	at net.sf.jasperreports.engine.design.JRAbstractClassCompiler.compileUnits(JRAbstractClassCompiler.java:63)
2026-11-17T17:28:35.9498362Z 	at net.sf.jasperreports.engine.design.JRAbstractCompiler.compileReport(JRAbstractCompiler.java:188)
2026-11-17T17:28:35.9498770Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:215)
2026-11-17T17:28:35.9499151Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:148)
2026-11-17T17:28:35.9499494Z 	at br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual(ModelosJasperTest.java:67)
2026-11-17T17:28:35.9499693Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-11-17T17:28:35.9500014Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-11-17T17:28:35.9500261Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-11-17T17:28:35.9500525Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-11-17T17:28:35.9500852Z 	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
2026-11-17T17:28:35.9501183Z 	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
2026-11-17T17:28:35.9501502Z 	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
2026-11-17T17:28:35.9501749Z 	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
2026-11-17T17:28:35.9502047Z 	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
2026-11-17T17:28:35.9502256Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
2026-11-17T17:28:35.9502580Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
2026-11-17T17:28:35.9502828Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9503062Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9503272Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9503482Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9503683Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9503881Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9504069Z 	at org.junit.runners.Suite.runChild(Suite.java:127)
2026-11-17T17:28:35.9504252Z 	at org.junit.runners.Suite.runChild(Suite.java:26)
2026-11-17T17:28:35.9504440Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9504752Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9504984Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9505197Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9505395Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9505596Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9505802Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:316)
2026-11-17T17:28:35.9506025Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:240)
2026-11-17T17:28:35.9506252Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:214)
2026-11-17T17:28:35.9506478Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:155)
2026-11-17T17:28:35.9506724Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-11-17T17:28:35.9507006Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-11-17T17:28:35.9507219Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-11-17T17:28:35.9507432Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-11-17T17:28:35.9507828Z Caused by: java.io.IOException: Cannot run program "javac": error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:35.9508037Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1143)
2026-11-17T17:28:35.9508241Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1073)
2026-11-17T17:28:35.9508431Z 	at java.base/java.lang.Runtime.exec(Runtime.java:594)
2026-11-17T17:28:35.9508623Z 	at java.base/java.lang.Runtime.exec(Runtime.java:453)
2026-11-17T17:28:35.9508850Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:58)
2026-11-17T17:28:35.9509137Z 	... 38 more
2026-11-17T17:28:35.9509420Z Caused by: java.io.IOException: error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:35.9509617Z 	at java.base/java.lang.ProcessImpl.forkAndExec(Native Method)
2026-11-17T17:28:35.9509803Z 	at java.base/java.lang.ProcessImpl.<init>(ProcessImpl.java:314)
2026-11-17T17:28:35.9509995Z 	at java.base/java.lang.ProcessImpl.start(ProcessImpl.java:244)
2026-11-17T17:28:35.9510201Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1110)
2026-11-17T17:28:35.9510362Z 	... 42 more
2026-11-17T17:28:35.9510405Z 
2026-11-17T17:28:35.9510747Z [ERROR] br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual[consignacao/consultarTabelaDeTaxasDoConvenio.jasper] -- Time elapsed: 0.027 s <<< ERROR!
2026-11-17T17:28:35.9511174Z net.sf.jasperreports.engine.JRException: Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/consultarTabelaDeTaxasDoConvenio_1794936515490_661435.java 
2026-11-17T17:28:35.9511439Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:89)
2026-11-17T17:28:35.9511685Z 	at net.sf.jasperreports.engine.design.JRAbstractClassCompiler.compileUnits(JRAbstractClassCompiler.java:63)
2026-11-17T17:28:35.9511927Z 	at net.sf.jasperreports.engine.design.JRAbstractCompiler.compileReport(JRAbstractCompiler.java:188)
2026-11-17T17:28:35.9512176Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:215)
2026-11-17T17:28:35.9512406Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:148)
2026-11-17T17:28:35.9512667Z 	at br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual(ModelosJasperTest.java:67)
2026-11-17T17:28:35.9512914Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-11-17T17:28:35.9513193Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-11-17T17:28:35.9513465Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-11-17T17:28:35.9513688Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-11-17T17:28:35.9513902Z 	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
2026-11-17T17:28:35.9514128Z 	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
2026-11-17T17:28:35.9514354Z 	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
2026-11-17T17:28:35.9514642Z 	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
2026-11-17T17:28:35.9514864Z 	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
2026-11-17T17:28:35.9515071Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
2026-11-17T17:28:35.9515309Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
2026-11-17T17:28:35.9515516Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9515743Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9515945Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9516145Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9516392Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9516589Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9516810Z 	at org.junit.runners.Suite.runChild(Suite.java:127)
2026-11-17T17:28:35.9517079Z 	at org.junit.runners.Suite.runChild(Suite.java:26)
2026-11-17T17:28:35.9517376Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9517575Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9517741Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9517942Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9518161Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9518444Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9518648Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:316)
2026-11-17T17:28:35.9518874Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:240)
2026-11-17T17:28:35.9519145Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:214)
2026-11-17T17:28:35.9519434Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:155)
2026-11-17T17:28:35.9519654Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-11-17T17:28:35.9519869Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-11-17T17:28:35.9520044Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-11-17T17:28:35.9520265Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-11-17T17:28:35.9520651Z Caused by: java.io.IOException: Cannot run program "javac": error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:35.9520864Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1143)
2026-11-17T17:28:35.9521069Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1073)
2026-11-17T17:28:35.9521261Z 	at java.base/java.lang.Runtime.exec(Runtime.java:594)
2026-11-17T17:28:35.9521465Z 	at java.base/java.lang.Runtime.exec(Runtime.java:453)
2026-11-17T17:28:35.9521676Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:58)
2026-11-17T17:28:35.9521853Z 	... 38 more
2026-11-17T17:28:35.9522088Z Caused by: java.io.IOException: error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:35.9522238Z 	at java.base/java.lang.ProcessImpl.forkAndExec(Native Method)
2026-11-17T17:28:35.9522471Z 	at java.base/java.lang.ProcessImpl.<init>(ProcessImpl.java:314)
2026-11-17T17:28:35.9522721Z 	at java.base/java.lang.ProcessImpl.start(ProcessImpl.java:244)
2026-11-17T17:28:35.9522914Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1110)
2026-11-17T17:28:35.9523069Z 	... 42 more
2026-11-17T17:28:35.9523112Z 
2026-11-17T17:28:35.9523470Z [ERROR] br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual[consignacao/consultarTabelaDeTaxasDoConvenioNovo.jasper] -- Time elapsed: 0.034 s <<< ERROR!
2026-11-17T17:28:35.9523875Z net.sf.jasperreports.engine.JRException: Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/consultarTabelaDeTaxasDoConvenioNovo_1794936515526_633703.java 
2026-11-17T17:28:35.9524148Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:89)
2026-11-17T17:28:35.9524402Z 	at net.sf.jasperreports.engine.design.JRAbstractClassCompiler.compileUnits(JRAbstractClassCompiler.java:63)
2026-11-17T17:28:35.9527480Z 	at net.sf.jasperreports.engine.design.JRAbstractCompiler.compileReport(JRAbstractCompiler.java:188)
2026-11-17T17:28:35.9527726Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:215)
2026-11-17T17:28:35.9527958Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:148)
2026-11-17T17:28:35.9528361Z 	at br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual(ModelosJasperTest.java:67)
2026-11-17T17:28:35.9528643Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-11-17T17:28:35.9528872Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-11-17T17:28:35.9529101Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-11-17T17:28:35.9529371Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-11-17T17:28:35.9529589Z 	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
2026-11-17T17:28:35.9529812Z 	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
2026-11-17T17:28:35.9530029Z 	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
2026-11-17T17:28:35.9530246Z 	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
2026-11-17T17:28:35.9530452Z 	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
2026-11-17T17:28:35.9530689Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
2026-11-17T17:28:35.9530900Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
2026-11-17T17:28:35.9531105Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9531299Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9531463Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9531668Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9531865Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9532056Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9532240Z 	at org.junit.runners.Suite.runChild(Suite.java:127)
2026-11-17T17:28:35.9532458Z 	at org.junit.runners.Suite.runChild(Suite.java:26)
2026-11-17T17:28:35.9532644Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9532838Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9533035Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9533199Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9533395Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9533635Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9533933Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:316)
2026-11-17T17:28:35.9534237Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:240)
2026-11-17T17:28:35.9534496Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:214)
2026-11-17T17:28:35.9534794Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:155)
2026-11-17T17:28:35.9535020Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-11-17T17:28:35.9535235Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-11-17T17:28:35.9535447Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-11-17T17:28:35.9535622Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-11-17T17:28:35.9535965Z Caused by: java.io.IOException: Cannot run program "javac": error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:35.9536368Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1143)
2026-11-17T17:28:35.9536575Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1073)
2026-11-17T17:28:35.9536796Z 	at java.base/java.lang.Runtime.exec(Runtime.java:594)
2026-11-17T17:28:35.9537033Z 	at java.base/java.lang.Runtime.exec(Runtime.java:453)
2026-11-17T17:28:35.9537370Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:58)
2026-11-17T17:28:35.9537557Z 	... 38 more
2026-11-17T17:28:35.9537780Z Caused by: java.io.IOException: error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:35.9537975Z 	at java.base/java.lang.ProcessImpl.forkAndExec(Native Method)
2026-11-17T17:28:35.9538126Z 	at java.base/java.lang.ProcessImpl.<init>(ProcessImpl.java:314)
2026-11-17T17:28:35.9538319Z 	at java.base/java.lang.ProcessImpl.start(ProcessImpl.java:244)
2026-11-17T17:28:35.9538513Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1110)
2026-11-17T17:28:35.9538701Z 	... 42 more
2026-11-17T17:28:35.9538743Z 
2026-11-17T17:28:35.9539211Z [ERROR] br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual[consignacao/consultarTabelaDeTaxasDoConvenioSubReport.jasper] -- Time elapsed: 0.024 s <<< ERROR!
2026-11-17T17:28:35.9539634Z net.sf.jasperreports.engine.JRException: Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/consultarTabelaDeTaxasDoConvenioSubReport_1794936515552_746983.java 
2026-11-17T17:28:35.9539903Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:89)
2026-11-17T17:28:35.9540235Z 	at net.sf.jasperreports.engine.design.JRAbstractClassCompiler.compileUnits(JRAbstractClassCompiler.java:63)
2026-11-17T17:28:35.9540579Z 	at net.sf.jasperreports.engine.design.JRAbstractCompiler.compileReport(JRAbstractCompiler.java:188)
2026-11-17T17:28:35.9540818Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:215)
2026-11-17T17:28:35.9541073Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:148)
2026-11-17T17:28:35.9541427Z 	at br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual(ModelosJasperTest.java:67)
2026-11-17T17:28:35.9541769Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-11-17T17:28:35.9542094Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-11-17T17:28:35.9542465Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-11-17T17:28:35.9542705Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-11-17T17:28:35.9542881Z 	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
2026-11-17T17:28:35.9543227Z 	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
2026-11-17T17:28:35.9543457Z 	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
2026-11-17T17:28:35.9543678Z 	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
2026-11-17T17:28:35.9543920Z 	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
2026-11-17T17:28:35.9544131Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
2026-11-17T17:28:35.9544348Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
2026-11-17T17:28:35.9545412Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9545738Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9545941Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9546104Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9546316Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9546615Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9546833Z 	at org.junit.runners.Suite.runChild(Suite.java:127)
2026-11-17T17:28:35.9547020Z 	at org.junit.runners.Suite.runChild(Suite.java:26)
2026-11-17T17:28:35.9547210Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9547466Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9547667Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9548105Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9548270Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9548471Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9548677Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:316)
2026-11-17T17:28:35.9548926Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:240)
2026-11-17T17:28:35.9549236Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:214)
2026-11-17T17:28:35.9549482Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:155)
2026-11-17T17:28:35.9549701Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-11-17T17:28:35.9550036Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-11-17T17:28:35.9550255Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-11-17T17:28:35.9550459Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-11-17T17:28:35.9550760Z Caused by: java.io.IOException: Cannot run program "javac": error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:35.9550966Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1143)
2026-11-17T17:28:35.9551299Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1073)
2026-11-17T17:28:35.9551510Z 	at java.base/java.lang.Runtime.exec(Runtime.java:594)
2026-11-17T17:28:35.9551692Z 	at java.base/java.lang.Runtime.exec(Runtime.java:453)
2026-11-17T17:28:35.9551903Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:58)
2026-11-17T17:28:35.9552088Z 	... 38 more
2026-11-17T17:28:35.9552316Z Caused by: java.io.IOException: error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:35.9552499Z 	at java.base/java.lang.ProcessImpl.forkAndExec(Native Method)
2026-11-17T17:28:35.9552687Z 	at java.base/java.lang.ProcessImpl.<init>(ProcessImpl.java:314)
2026-11-17T17:28:35.9552842Z 	at java.base/java.lang.ProcessImpl.start(ProcessImpl.java:244)
2026-11-17T17:28:35.9553100Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1110)
2026-11-17T17:28:35.9553346Z 	... 42 more
2026-11-17T17:28:35.9553422Z 
2026-11-17T17:28:35.9553712Z [ERROR] br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual[creditoRural/relatorioExtratoCreditoRural.jasper] -- Time elapsed: 0.041 s <<< ERROR!
2026-11-17T17:28:35.9554201Z net.sf.jasperreports.engine.JRException: Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/relatorioExtratoCreditoRural_1794936515595_12209.java 
2026-11-17T17:28:35.9554461Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:89)
2026-11-17T17:28:35.9554846Z 	at net.sf.jasperreports.engine.design.JRAbstractClassCompiler.compileUnits(JRAbstractClassCompiler.java:63)
2026-11-17T17:28:35.9555091Z 	at net.sf.jasperreports.engine.design.JRAbstractCompiler.compileReport(JRAbstractCompiler.java:188)
2026-11-17T17:28:35.9555330Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:215)
2026-11-17T17:28:35.9555609Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:148)
2026-11-17T17:28:35.9555928Z 	at br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual(ModelosJasperTest.java:67)
2026-11-17T17:28:35.9556161Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-11-17T17:28:35.9556376Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-11-17T17:28:35.9556653Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-11-17T17:28:35.9556871Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-11-17T17:28:35.9557047Z 	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
2026-11-17T17:28:35.9557394Z 	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
2026-11-17T17:28:35.9557664Z 	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
2026-11-17T17:28:35.9557908Z 	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
2026-11-17T17:28:35.9558119Z 	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
2026-11-17T17:28:35.9558332Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
2026-11-17T17:28:35.9558550Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
2026-11-17T17:28:35.9558762Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9558958Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9559229Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9559444Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9559608Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9559822Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9560010Z 	at org.junit.runners.Suite.runChild(Suite.java:127)
2026-11-17T17:28:35.9560196Z 	at org.junit.runners.Suite.runChild(Suite.java:26)
2026-11-17T17:28:35.9560384Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9560581Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9560778Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9560992Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9561196Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9561350Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9561576Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:316)
2026-11-17T17:28:35.9561879Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:240)
2026-11-17T17:28:35.9562107Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:214)
2026-11-17T17:28:35.9562336Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:155)
2026-11-17T17:28:35.9562564Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-11-17T17:28:35.9562795Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-11-17T17:28:35.9563007Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-11-17T17:28:35.9563216Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-11-17T17:28:35.9563536Z Caused by: java.io.IOException: Cannot run program "javac": error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:35.9563709Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1143)
2026-11-17T17:28:35.9563910Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1073)
2026-11-17T17:28:35.9564102Z 	at java.base/java.lang.Runtime.exec(Runtime.java:594)
2026-11-17T17:28:35.9564305Z 	at java.base/java.lang.Runtime.exec(Runtime.java:453)
2026-11-17T17:28:35.9564702Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:58)
2026-11-17T17:28:35.9564896Z 	... 38 more
2026-11-17T17:28:35.9565127Z Caused by: java.io.IOException: error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:35.9565311Z 	at java.base/java.lang.ProcessImpl.forkAndExec(Native Method)
2026-11-17T17:28:35.9565573Z 	at java.base/java.lang.ProcessImpl.<init>(ProcessImpl.java:314)
2026-11-17T17:28:35.9565766Z 	at java.base/java.lang.ProcessImpl.start(ProcessImpl.java:244)
2026-11-17T17:28:35.9565926Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1110)
2026-11-17T17:28:35.9566087Z 	... 42 more
2026-11-17T17:28:35.9566177Z 
2026-11-17T17:28:35.9566453Z [ERROR] br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual[creditoRural/subRelatorioExtrato.jasper] -- Time elapsed: 0.010 s <<< ERROR!
2026-11-17T17:28:35.9566826Z net.sf.jasperreports.engine.JRException: Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/subRelatorioExtrato_1794936515609_45998.java 
2026-11-17T17:28:35.9567080Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:89)
2026-11-17T17:28:35.9567317Z 	at net.sf.jasperreports.engine.design.JRAbstractClassCompiler.compileUnits(JRAbstractClassCompiler.java:63)
2026-11-17T17:28:35.9567653Z 	at net.sf.jasperreports.engine.design.JRAbstractCompiler.compileReport(JRAbstractCompiler.java:188)
2026-11-17T17:28:35.9567968Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:215)
2026-11-17T17:28:35.9568199Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:148)
2026-11-17T17:28:35.9568450Z 	at br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual(ModelosJasperTest.java:67)
2026-11-17T17:28:35.9568687Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-11-17T17:28:35.9568902Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-11-17T17:28:35.9569199Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-11-17T17:28:35.9569484Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-11-17T17:28:35.9569698Z 	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
2026-11-17T17:28:35.9569886Z 	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
2026-11-17T17:28:35.9570202Z 	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
2026-11-17T17:28:35.9570420Z 	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
2026-11-17T17:28:35.9570635Z 	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
2026-11-17T17:28:35.9570845Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
2026-11-17T17:28:35.9571065Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
2026-11-17T17:28:35.9571271Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9571471Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9571676Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9572008Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9572177Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9572370Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9572567Z 	at org.junit.runners.Suite.runChild(Suite.java:127)
2026-11-17T17:28:35.9572746Z 	at org.junit.runners.Suite.runChild(Suite.java:26)
2026-11-17T17:28:35.9572930Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9573123Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9573380Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9573578Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9573862Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9574150Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9574434Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:316)
2026-11-17T17:28:35.9574845Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:240)
2026-11-17T17:28:35.9575198Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:214)
2026-11-17T17:28:35.9575553Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:155)
2026-11-17T17:28:35.9575793Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-11-17T17:28:35.9576014Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-11-17T17:28:35.9576225Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-11-17T17:28:35.9576489Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-11-17T17:28:35.9576818Z Caused by: java.io.IOException: Cannot run program "javac": error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:35.9577027Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1143)
2026-11-17T17:28:35.9577191Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1073)
2026-11-17T17:28:35.9577379Z 	at java.base/java.lang.Runtime.exec(Runtime.java:594)
2026-11-17T17:28:35.9577559Z 	at java.base/java.lang.Runtime.exec(Runtime.java:453)
2026-11-17T17:28:35.9577765Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:58)
2026-11-17T17:28:35.9578030Z 	... 38 more
2026-11-17T17:28:35.9578257Z Caused by: java.io.IOException: error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:35.9578470Z 	at java.base/java.lang.ProcessImpl.forkAndExec(Native Method)
2026-11-17T17:28:35.9578652Z 	at java.base/java.lang.ProcessImpl.<init>(ProcessImpl.java:314)
2026-11-17T17:28:35.9578847Z 	at java.base/java.lang.ProcessImpl.start(ProcessImpl.java:244)
2026-11-17T17:28:35.9579007Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1110)
2026-11-17T17:28:35.9579244Z 	... 42 more
2026-11-17T17:28:35.9579325Z 
2026-11-17T17:28:35.9579640Z [ERROR] br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual[creditoRural/subRelatorioLiberacoes.jasper] -- Time elapsed: 0.010 s <<< ERROR!
2026-11-17T17:28:35.9580024Z net.sf.jasperreports.engine.JRException: Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/subRelatorioLiberacoes_1794936515621_50094.java 
2026-11-17T17:28:35.9580241Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:89)
2026-11-17T17:28:35.9580551Z 	at net.sf.jasperreports.engine.design.JRAbstractClassCompiler.compileUnits(JRAbstractClassCompiler.java:63)
2026-11-17T17:28:35.9580855Z 	at net.sf.jasperreports.engine.design.JRAbstractCompiler.compileReport(JRAbstractCompiler.java:188)
2026-11-17T17:28:35.9581092Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:215)
2026-11-17T17:28:35.9581329Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:148)
2026-11-17T17:28:35.9581581Z 	at br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual(ModelosJasperTest.java:67)
2026-11-17T17:28:35.9581808Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-11-17T17:28:35.9582023Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-11-17T17:28:35.9582274Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-11-17T17:28:35.9582587Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-11-17T17:28:35.9582812Z 	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
2026-11-17T17:28:35.9583039Z 	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
2026-11-17T17:28:35.9583262Z 	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
2026-11-17T17:28:35.9583484Z 	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
2026-11-17T17:28:35.9583694Z 	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
2026-11-17T17:28:35.9583898Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
2026-11-17T17:28:35.9584130Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
2026-11-17T17:28:35.9584392Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9584771Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9584995Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9585192Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9585390Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9585552Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9585740Z 	at org.junit.runners.Suite.runChild(Suite.java:127)
2026-11-17T17:28:35.9585934Z 	at org.junit.runners.Suite.runChild(Suite.java:26)
2026-11-17T17:28:35.9586213Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9586409Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9586608Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9586825Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9587026Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9587219Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9587388Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:316)
2026-11-17T17:28:35.9587610Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:240)
2026-11-17T17:28:35.9587972Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:214)
2026-11-17T17:28:35.9588264Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:155)
2026-11-17T17:28:35.9588488Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-11-17T17:28:35.9588701Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-11-17T17:28:35.9588934Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-11-17T17:28:35.9589197Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-11-17T17:28:35.9589513Z Caused by: java.io.IOException: Cannot run program "javac": error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:35.9589731Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1143)
2026-11-17T17:28:35.9589938Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1073)
2026-11-17T17:28:35.9590097Z 	at java.base/java.lang.Runtime.exec(Runtime.java:594)
2026-11-17T17:28:35.9590281Z 	at java.base/java.lang.Runtime.exec(Runtime.java:453)
2026-11-17T17:28:35.9590488Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:58)
2026-11-17T17:28:35.9590672Z 	... 38 more
2026-11-17T17:28:35.9590911Z Caused by: java.io.IOException: error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:35.9591097Z 	at java.base/java.lang.ProcessImpl.forkAndExec(Native Method)
2026-11-17T17:28:35.9591284Z 	at java.base/java.lang.ProcessImpl.<init>(ProcessImpl.java:314)
2026-11-17T17:28:35.9591558Z 	at java.base/java.lang.ProcessImpl.start(ProcessImpl.java:244)
2026-11-17T17:28:35.9591751Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1110)
2026-11-17T17:28:35.9591875Z 	... 42 more
2026-11-17T17:28:35.9591956Z 
2026-11-17T17:28:35.9592272Z [ERROR] br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual[creditoRural/subRelatorioOcorrencias.jasper] -- Time elapsed: 0.009 s <<< ERROR!
2026-11-17T17:28:35.9592694Z net.sf.jasperreports.engine.JRException: Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/subRelatorioOcorrencias_1794936515631_767888.java 
2026-11-17T17:28:35.9592971Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:89)
2026-11-17T17:28:35.9593174Z 	at net.sf.jasperreports.engine.design.JRAbstractClassCompiler.compileUnits(JRAbstractClassCompiler.java:63)
2026-11-17T17:28:35.9593429Z 	at net.sf.jasperreports.engine.design.JRAbstractCompiler.compileReport(JRAbstractCompiler.java:188)
2026-11-17T17:28:35.9593721Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:215)
2026-11-17T17:28:35.9594114Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:148)
2026-11-17T17:28:35.9594388Z 	at br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual(ModelosJasperTest.java:67)
2026-11-17T17:28:35.9594780Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-11-17T17:28:35.9594996Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-11-17T17:28:35.9595239Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-11-17T17:28:35.9595482Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-11-17T17:28:35.9595701Z 	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
2026-11-17T17:28:35.9595935Z 	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
2026-11-17T17:28:35.9596155Z 	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
2026-11-17T17:28:35.9596336Z 	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
2026-11-17T17:28:35.9596551Z 	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
2026-11-17T17:28:35.9596760Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
2026-11-17T17:28:35.9596975Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
2026-11-17T17:28:35.9597179Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9597398Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9597595Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9597793Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9597992Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9598185Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9598336Z 	at org.junit.runners.Suite.runChild(Suite.java:127)
2026-11-17T17:28:35.9598527Z 	at org.junit.runners.Suite.runChild(Suite.java:26)
2026-11-17T17:28:35.9598716Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9598910Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9599199Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9599399Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9599595Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9599804Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9600084Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:316)
2026-11-17T17:28:35.9600335Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:240)
2026-11-17T17:28:35.9600566Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:214)
2026-11-17T17:28:35.9600790Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:155)
2026-11-17T17:28:35.9601053Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-11-17T17:28:35.9601379Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-11-17T17:28:35.9601595Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-11-17T17:28:35.9601887Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-11-17T17:28:35.9602190Z Caused by: java.io.IOException: Cannot run program "javac": error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:35.9602445Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1143)
2026-11-17T17:28:35.9602682Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1073)
2026-11-17T17:28:35.9602881Z 	at java.base/java.lang.Runtime.exec(Runtime.java:594)
2026-11-17T17:28:35.9603027Z 	at java.base/java.lang.Runtime.exec(Runtime.java:453)
2026-11-17T17:28:35.9603243Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:58)
2026-11-17T17:28:35.9603447Z 	... 38 more
2026-11-17T17:28:35.9603673Z Caused by: java.io.IOException: error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:35.9603872Z 	at java.base/java.lang.ProcessImpl.forkAndExec(Native Method)
2026-11-17T17:28:35.9604059Z 	at java.base/java.lang.ProcessImpl.<init>(ProcessImpl.java:314)
2026-11-17T17:28:35.9604250Z 	at java.base/java.lang.ProcessImpl.start(ProcessImpl.java:244)
2026-11-17T17:28:35.9604454Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1110)
2026-11-17T17:28:35.9604675Z 	... 42 more
2026-11-17T17:28:35.9604723Z 
2026-11-17T17:28:35.9605039Z [ERROR] br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual[creditoRural/subRelatorioPosicaoDivida.jasper] -- Time elapsed: 0.012 s <<< ERROR!
2026-11-17T17:28:35.9605448Z net.sf.jasperreports.engine.JRException: Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/subRelatorioPosicaoDivida_1794936515644_907065.java 
2026-11-17T17:28:35.9605703Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:89)
2026-11-17T17:28:35.9605937Z 	at net.sf.jasperreports.engine.design.JRAbstractClassCompiler.compileUnits(JRAbstractClassCompiler.java:63)
2026-11-17T17:28:35.9606143Z 	at net.sf.jasperreports.engine.design.JRAbstractCompiler.compileReport(JRAbstractCompiler.java:188)
2026-11-17T17:28:35.9606382Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:215)
2026-11-17T17:28:35.9606612Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:148)
2026-11-17T17:28:35.9606870Z 	at br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual(ModelosJasperTest.java:67)
2026-11-17T17:28:35.9607101Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-11-17T17:28:35.9607323Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-11-17T17:28:35.9607585Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-11-17T17:28:35.9607797Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-11-17T17:28:35.9608002Z 	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
2026-11-17T17:28:35.9608221Z 	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
2026-11-17T17:28:35.9608487Z 	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
2026-11-17T17:28:35.9608833Z 	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
2026-11-17T17:28:35.9609007Z 	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
2026-11-17T17:28:35.9609279Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
2026-11-17T17:28:35.9609516Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
2026-11-17T17:28:35.9609868Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9610069Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9610268Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9610481Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9610679Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9610872Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9611063Z 	at org.junit.runners.Suite.runChild(Suite.java:127)
2026-11-17T17:28:35.9611210Z 	at org.junit.runners.Suite.runChild(Suite.java:26)
2026-11-17T17:28:35.9611399Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9611618Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9611818Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9612028Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9612227Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9612416Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9612618Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:316)
2026-11-17T17:28:35.9612844Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:240)
2026-11-17T17:28:35.9613038Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:214)
2026-11-17T17:28:35.9613261Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:155)
2026-11-17T17:28:35.9613501Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-11-17T17:28:35.9613717Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-11-17T17:28:35.9613940Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-11-17T17:28:35.9614146Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-11-17T17:28:35.9614614Z Caused by: java.io.IOException: Cannot run program "javac": error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:35.9614845Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1143)
2026-11-17T17:28:35.9615117Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1073)
2026-11-17T17:28:35.9615370Z 	at java.base/java.lang.Runtime.exec(Runtime.java:594)
2026-11-17T17:28:35.9615524Z 	at java.base/java.lang.Runtime.exec(Runtime.java:453)
2026-11-17T17:28:35.9615758Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:58)
2026-11-17T17:28:35.9615952Z 	... 38 more
2026-11-17T17:28:35.9616184Z Caused by: java.io.IOException: error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:35.9616373Z 	at java.base/java.lang.ProcessImpl.forkAndExec(Native Method)
2026-11-17T17:28:35.9616557Z 	at java.base/java.lang.ProcessImpl.<init>(ProcessImpl.java:314)
2026-11-17T17:28:35.9616748Z 	at java.base/java.lang.ProcessImpl.start(ProcessImpl.java:244)
2026-11-17T17:28:35.9616938Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1110)
2026-11-17T17:28:35.9617099Z 	... 42 more
2026-11-17T17:28:35.9617140Z 
2026-11-17T17:28:35.9617547Z [ERROR] br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual[creditoRural/subRelatorioProAgro.jasper] -- Time elapsed: 0.012 s <<< ERROR!
2026-11-17T17:28:35.9617996Z net.sf.jasperreports.engine.JRException: Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/subRelatorioProAgro_1794936515657_438907.java 
2026-11-17T17:28:35.9618248Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:89)
2026-11-17T17:28:35.9618488Z 	at net.sf.jasperreports.engine.design.JRAbstractClassCompiler.compileUnits(JRAbstractClassCompiler.java:63)
2026-11-17T17:28:35.9618774Z 	at net.sf.jasperreports.engine.design.JRAbstractCompiler.compileReport(JRAbstractCompiler.java:188)
2026-11-17T17:28:35.9618974Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:215)
2026-11-17T17:28:35.9619298Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:148)
2026-11-17T17:28:35.9619556Z 	at br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual(ModelosJasperTest.java:67)
2026-11-17T17:28:35.9619797Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-11-17T17:28:35.9620034Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-11-17T17:28:35.9620272Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-11-17T17:28:35.9620543Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-11-17T17:28:35.9620787Z 	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
2026-11-17T17:28:35.9621014Z 	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
2026-11-17T17:28:35.9621231Z 	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
2026-11-17T17:28:35.9621447Z 	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
2026-11-17T17:28:35.9621659Z 	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
2026-11-17T17:28:35.9621833Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
2026-11-17T17:28:35.9622068Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
2026-11-17T17:28:35.9622267Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9622460Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9622719Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9622936Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9623136Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9623344Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9623529Z 	at org.junit.runners.Suite.runChild(Suite.java:127)
2026-11-17T17:28:35.9623674Z 	at org.junit.runners.Suite.runChild(Suite.java:26)
2026-11-17T17:28:35.9623881Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9624081Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9624283Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9624482Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9624740Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9624935Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9625233Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:316)
2026-11-17T17:28:35.9625455Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:240)
2026-11-17T17:28:35.9625699Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:214)
2026-11-17T17:28:35.9625887Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:155)
2026-11-17T17:28:35.9626114Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-11-17T17:28:35.9626397Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-11-17T17:28:35.9626609Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-11-17T17:28:35.9626823Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-11-17T17:28:35.9627163Z Caused by: java.io.IOException: Cannot run program "javac": error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:35.9627367Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1143)
2026-11-17T17:28:35.9627569Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1073)
2026-11-17T17:28:35.9627772Z 	at java.base/java.lang.Runtime.exec(Runtime.java:594)
2026-11-17T17:28:35.9627954Z 	at java.base/java.lang.Runtime.exec(Runtime.java:453)
2026-11-17T17:28:35.9628127Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:58)
2026-11-17T17:28:35.9628311Z 	... 38 more
2026-11-17T17:28:35.9628564Z Caused by: java.io.IOException: error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:35.9628848Z 	at java.base/java.lang.ProcessImpl.forkAndExec(Native Method)
2026-11-17T17:28:35.9629036Z 	at java.base/java.lang.ProcessImpl.<init>(ProcessImpl.java:314)
2026-11-17T17:28:35.9629307Z 	at java.base/java.lang.ProcessImpl.start(ProcessImpl.java:244)
2026-11-17T17:28:35.9629509Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1110)
2026-11-17T17:28:35.9629689Z 	... 42 more
2026-11-17T17:28:35.9629730Z 
2026-11-17T17:28:35.9630043Z [ERROR] br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual[creditoRural/subRelatorioReembolsos.jasper] -- Time elapsed: 0.009 s <<< ERROR!
2026-11-17T17:28:35.9630430Z net.sf.jasperreports.engine.JRException: Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/subRelatorioReembolsos_1794936515667_616578.java 
2026-11-17T17:28:35.9630691Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:89)
2026-11-17T17:28:35.9630928Z 	at net.sf.jasperreports.engine.design.JRAbstractClassCompiler.compileUnits(JRAbstractClassCompiler.java:63)
2026-11-17T17:28:35.9631171Z 	at net.sf.jasperreports.engine.design.JRAbstractCompiler.compileReport(JRAbstractCompiler.java:188)
2026-11-17T17:28:35.9631408Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:215)
2026-11-17T17:28:35.9631602Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:148)
2026-11-17T17:28:35.9631938Z 	at br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual(ModelosJasperTest.java:67)
2026-11-17T17:28:35.9632191Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-11-17T17:28:35.9632404Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-11-17T17:28:35.9632644Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-11-17T17:28:35.9632877Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-11-17T17:28:35.9633160Z 	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
2026-11-17T17:28:35.9633479Z 	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
2026-11-17T17:28:35.9633702Z 	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
2026-11-17T17:28:35.9633918Z 	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
2026-11-17T17:28:35.9634143Z 	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
2026-11-17T17:28:35.9634349Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
2026-11-17T17:28:35.9634645Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
2026-11-17T17:28:35.9634964Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9635238Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9635435Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9635679Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9635958Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9636149Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9636351Z 	at org.junit.runners.Suite.runChild(Suite.java:127)
2026-11-17T17:28:35.9636539Z 	at org.junit.runners.Suite.runChild(Suite.java:26)
2026-11-17T17:28:35.9636692Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9636886Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9637087Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9637290Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9637484Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9637673Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9637880Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:316)
2026-11-17T17:28:35.9638138Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:240)
2026-11-17T17:28:35.9638366Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:214)
2026-11-17T17:28:35.9638587Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:155)
2026-11-17T17:28:35.9638771Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-11-17T17:28:35.9638987Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-11-17T17:28:35.9639245Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-11-17T17:28:35.9639458Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-11-17T17:28:35.9639761Z Caused by: java.io.IOException: Cannot run program "javac": error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:35.9639966Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1143)
2026-11-17T17:28:35.9640200Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1073)
2026-11-17T17:28:35.9640394Z 	at java.base/java.lang.Runtime.exec(Runtime.java:594)
2026-11-17T17:28:35.9640571Z 	at java.base/java.lang.Runtime.exec(Runtime.java:453)
2026-11-17T17:28:35.9640857Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:58)
2026-11-17T17:28:35.9641000Z 	... 38 more
2026-11-17T17:28:35.9641322Z Caused by: java.io.IOException: error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:35.9641513Z 	at java.base/java.lang.ProcessImpl.forkAndExec(Native Method)
2026-11-17T17:28:35.9641700Z 	at java.base/java.lang.ProcessImpl.<init>(ProcessImpl.java:314)
2026-11-17T17:28:35.9641900Z 	at java.base/java.lang.ProcessImpl.start(ProcessImpl.java:244)
2026-11-17T17:28:35.9642114Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1110)
2026-11-17T17:28:35.9642277Z 	... 42 more
2026-11-17T17:28:35.9642316Z 
2026-11-17T17:28:35.9642641Z [ERROR] br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual[creditoRural/subRelatorioReembolsosVencidos.jasper] -- Time elapsed: 0.013 s <<< ERROR!
2026-11-17T17:28:35.9643034Z net.sf.jasperreports.engine.JRException: Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/subRelatorioReembolsosVencidos_1794936515680_42125.java 
2026-11-17T17:28:35.9643292Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:89)
2026-11-17T17:28:35.9643530Z 	at net.sf.jasperreports.engine.design.JRAbstractClassCompiler.compileUnits(JRAbstractClassCompiler.java:63)
2026-11-17T17:28:35.9643829Z 	at net.sf.jasperreports.engine.design.JRAbstractCompiler.compileReport(JRAbstractCompiler.java:188)
2026-11-17T17:28:35.9644068Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:215)
2026-11-17T17:28:35.9644326Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:148)
2026-11-17T17:28:35.9644662Z 	at br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual(ModelosJasperTest.java:67)
2026-11-17T17:28:35.9644904Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-11-17T17:28:35.9645115Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-11-17T17:28:35.9645356Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-11-17T17:28:35.9645573Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-11-17T17:28:35.9645874Z 	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
2026-11-17T17:28:35.9646122Z 	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
2026-11-17T17:28:35.9646343Z 	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
2026-11-17T17:28:35.9646583Z 	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
2026-11-17T17:28:35.9646792Z 	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
2026-11-17T17:28:35.9646998Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
2026-11-17T17:28:35.9647217Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
2026-11-17T17:28:35.9647385Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9647586Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9647794Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9647996Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9648193Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9648403Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9648588Z 	at org.junit.runners.Suite.runChild(Suite.java:127)
2026-11-17T17:28:35.9648842Z 	at org.junit.runners.Suite.runChild(Suite.java:26)
2026-11-17T17:28:35.9649027Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9649257Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9649561Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9649764Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9649958Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9650150Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9650376Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:316)
2026-11-17T17:28:35.9650599Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:240)
2026-11-17T17:28:35.9650822Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:214)
2026-11-17T17:28:35.9651046Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:155)
2026-11-17T17:28:35.9651274Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-11-17T17:28:35.9651458Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-11-17T17:28:35.9651664Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-11-17T17:28:35.9651869Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-11-17T17:28:35.9652169Z Caused by: java.io.IOException: Cannot run program "javac": error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:35.9652453Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1143)
2026-11-17T17:28:35.9652656Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1073)
2026-11-17T17:28:35.9652845Z 	at java.base/java.lang.Runtime.exec(Runtime.java:594)
2026-11-17T17:28:35.9653081Z 	at java.base/java.lang.Runtime.exec(Runtime.java:453)
2026-11-17T17:28:35.9653283Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:58)
2026-11-17T17:28:35.9653458Z 	... 38 more
2026-11-17T17:28:35.9653693Z Caused by: java.io.IOException: error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:35.9653916Z 	at java.base/java.lang.ProcessImpl.forkAndExec(Native Method)
2026-11-17T17:28:35.9654100Z 	at java.base/java.lang.ProcessImpl.<init>(ProcessImpl.java:314)
2026-11-17T17:28:35.9654319Z 	at java.base/java.lang.ProcessImpl.start(ProcessImpl.java:244)
2026-11-17T17:28:35.9658486Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1110)
2026-11-17T17:28:35.9658826Z 	... 42 more
2026-11-17T17:28:35.9658873Z 
2026-11-17T17:28:35.9659397Z [ERROR] br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual[evolucao/consultarPlanilhaEvolucaoDivida/relatorioEvolucaoDivida.jasper] -- Time elapsed: 0.055 s <<< ERROR!
2026-11-17T17:28:35.9659902Z net.sf.jasperreports.engine.JRException: Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/relatorioEvolucaoDivida_1794936515729_731394.java 
2026-11-17T17:28:35.9660196Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:89)
2026-11-17T17:28:35.9660438Z 	at net.sf.jasperreports.engine.design.JRAbstractClassCompiler.compileUnits(JRAbstractClassCompiler.java:63)
2026-11-17T17:28:35.9660685Z 	at net.sf.jasperreports.engine.design.JRAbstractCompiler.compileReport(JRAbstractCompiler.java:188)
2026-11-17T17:28:35.9661117Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:215)
2026-11-17T17:28:35.9661368Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:148)
2026-11-17T17:28:35.9661620Z 	at br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual(ModelosJasperTest.java:67)
2026-11-17T17:28:35.9661944Z 	at jdk.internal.reflect.GeneratedMethodAccessor116.invoke(Unknown Source)
2026-11-17T17:28:35.9662139Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-11-17T17:28:35.9662379Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-11-17T17:28:35.9662659Z 	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
2026-11-17T17:28:35.9662885Z 	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
2026-11-17T17:28:35.9663106Z 	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
2026-11-17T17:28:35.9663349Z 	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
2026-11-17T17:28:35.9663569Z 	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
2026-11-17T17:28:35.9663774Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
2026-11-17T17:28:35.9663990Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
2026-11-17T17:28:35.9664200Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9664362Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9664684Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9664899Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9665102Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9665329Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9665646Z 	at org.junit.runners.Suite.runChild(Suite.java:127)
2026-11-17T17:28:35.9665831Z 	at org.junit.runners.Suite.runChild(Suite.java:26)
2026-11-17T17:28:35.9666020Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9666221Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9666557Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9666734Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9666930Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9667139Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9667360Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:316)
2026-11-17T17:28:35.9667585Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:240)
2026-11-17T17:28:35.9667817Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:214)
2026-11-17T17:28:35.9668049Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:155)
2026-11-17T17:28:35.9668270Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-11-17T17:28:35.9668491Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-11-17T17:28:35.9668714Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-11-17T17:28:35.9668889Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-11-17T17:28:35.9669381Z Caused by: java.io.IOException: Cannot run program "javac": error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:35.9669625Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1143)
2026-11-17T17:28:35.9669833Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1073)
2026-11-17T17:28:35.9670026Z 	at java.base/java.lang.Runtime.exec(Runtime.java:594)
2026-11-17T17:28:35.9670214Z 	at java.base/java.lang.Runtime.exec(Runtime.java:453)
2026-11-17T17:28:35.9670422Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:58)
2026-11-17T17:28:35.9670599Z 	... 37 more
2026-11-17T17:28:35.9670834Z Caused by: java.io.IOException: error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:35.9670984Z 	at java.base/java.lang.ProcessImpl.forkAndExec(Native Method)
2026-11-17T17:28:35.9671171Z 	at java.base/java.lang.ProcessImpl.<init>(ProcessImpl.java:314)
2026-11-17T17:28:35.9671383Z 	at java.base/java.lang.ProcessImpl.start(ProcessImpl.java:244)
2026-11-17T17:28:35.9671577Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1110)
2026-11-17T17:28:35.9671742Z 	... 41 more
2026-11-17T17:28:35.9671782Z 
2026-11-17T17:28:35.9672126Z [ERROR] br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual[evolucao/consultarPlanilhaEvolucaoDivida/subRelatorioEvolucaoDivida.jasper] -- Time elapsed: 0.014 s <<< ERROR!
2026-11-17T17:28:35.9672529Z net.sf.jasperreports.engine.JRException: Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/subRelatorioEvolucaoDivida_1794936515747_806561.java 
2026-11-17T17:28:35.9672789Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:89)
2026-11-17T17:28:35.9673031Z 	at net.sf.jasperreports.engine.design.JRAbstractClassCompiler.compileUnits(JRAbstractClassCompiler.java:63)
2026-11-17T17:28:35.9673274Z 	at net.sf.jasperreports.engine.design.JRAbstractCompiler.compileReport(JRAbstractCompiler.java:188)
2026-11-17T17:28:35.9673531Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:215)
2026-11-17T17:28:35.9673763Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:148)
2026-11-17T17:28:35.9674011Z 	at br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual(ModelosJasperTest.java:67)
2026-11-17T17:28:35.9674307Z 	at jdk.internal.reflect.GeneratedMethodAccessor116.invoke(Unknown Source)
2026-11-17T17:28:35.9674653Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-11-17T17:28:35.9674887Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-11-17T17:28:35.9675058Z 	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
2026-11-17T17:28:35.9675417Z 	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
2026-11-17T17:28:35.9675706Z 	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
2026-11-17T17:28:35.9676013Z 	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
2026-11-17T17:28:35.9676224Z 	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
2026-11-17T17:28:35.9676434Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
2026-11-17T17:28:35.9676666Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
2026-11-17T17:28:35.9676872Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9677155Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9677352Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9677519Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9677719Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9677933Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9678122Z 	at org.junit.runners.Suite.runChild(Suite.java:127)
2026-11-17T17:28:35.9678314Z 	at org.junit.runners.Suite.runChild(Suite.java:26)
2026-11-17T17:28:35.9678503Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9678697Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9678895Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9679112Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9679310Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9679521Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9679747Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:316)
2026-11-17T17:28:35.9679969Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:240)
2026-11-17T17:28:35.9680205Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:214)
2026-11-17T17:28:35.9680432Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:155)
2026-11-17T17:28:35.9680655Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-11-17T17:28:35.9680870Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-11-17T17:28:35.9681082Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-11-17T17:28:35.9681290Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-11-17T17:28:35.9681604Z Caused by: java.io.IOException: Cannot run program "javac": error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:35.9681777Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1143)
2026-11-17T17:28:35.9681984Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1073)
2026-11-17T17:28:35.9682170Z 	at java.base/java.lang.Runtime.exec(Runtime.java:594)
2026-11-17T17:28:35.9682347Z 	at java.base/java.lang.Runtime.exec(Runtime.java:453)
2026-11-17T17:28:35.9682649Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:58)
2026-11-17T17:28:35.9682826Z 	... 37 more
2026-11-17T17:28:35.9683045Z Caused by: java.io.IOException: error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:35.9683279Z 	at java.base/java.lang.ProcessImpl.forkAndExec(Native Method)
2026-11-17T17:28:35.9683490Z 	at java.base/java.lang.ProcessImpl.<init>(ProcessImpl.java:314)
2026-11-17T17:28:35.9683648Z 	at java.base/java.lang.ProcessImpl.start(ProcessImpl.java:244)
2026-11-17T17:28:35.9683864Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1110)
2026-11-17T17:28:35.9684053Z 	... 41 more
2026-11-17T17:28:35.9684215Z 
2026-11-17T17:28:35.9684631Z [ERROR] br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual[evolucao/consultarPlanilhaEvolucaoDivida/subRelatorioEvolucaoDividaAmortiz.jasper] -- Time elapsed: 0.015 s <<< ERROR!
2026-11-17T17:28:35.9685055Z net.sf.jasperreports.engine.JRException: Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/subRelatorioEvolucaoDivida_1794936515762_489013.java 
2026-11-17T17:28:35.9685312Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:89)
2026-11-17T17:28:35.9685557Z 	at net.sf.jasperreports.engine.design.JRAbstractClassCompiler.compileUnits(JRAbstractClassCompiler.java:63)
2026-11-17T17:28:35.9685809Z 	at net.sf.jasperreports.engine.design.JRAbstractCompiler.compileReport(JRAbstractCompiler.java:188)
2026-11-17T17:28:35.9686064Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:215)
2026-11-17T17:28:35.9686299Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:148)
2026-11-17T17:28:35.9686546Z 	at br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual(ModelosJasperTest.java:67)
2026-11-17T17:28:35.9686770Z 	at jdk.internal.reflect.GeneratedMethodAccessor116.invoke(Unknown Source)
2026-11-17T17:28:35.9687051Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-11-17T17:28:35.9687326Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-11-17T17:28:35.9687534Z 	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
2026-11-17T17:28:35.9687767Z 	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
2026-11-17T17:28:35.9687952Z 	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
2026-11-17T17:28:35.9688188Z 	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
2026-11-17T17:28:35.9688391Z 	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
2026-11-17T17:28:35.9688597Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
2026-11-17T17:28:35.9688812Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
2026-11-17T17:28:35.9689013Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9689265Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9689473Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9689673Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9689964Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9690128Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9690316Z 	at org.junit.runners.Suite.runChild(Suite.java:127)
2026-11-17T17:28:35.9690499Z 	at org.junit.runners.Suite.runChild(Suite.java:26)
2026-11-17T17:28:35.9690686Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9690879Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9691079Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9691286Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9691485Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9691692Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9691905Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:316)
2026-11-17T17:28:35.9692128Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:240)
2026-11-17T17:28:35.9692434Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:214)
2026-11-17T17:28:35.9692698Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:155)
2026-11-17T17:28:35.9692931Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-11-17T17:28:35.9693237Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-11-17T17:28:35.9693452Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-11-17T17:28:35.9693660Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-11-17T17:28:35.9693974Z Caused by: java.io.IOException: Cannot run program "javac": error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:35.9694181Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1143)
2026-11-17T17:28:35.9694384Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1073)
2026-11-17T17:28:35.9973714Z 	at java.base/java.lang.Runtime.exec(Runtime.java:594)
2026-11-17T17:28:35.9974371Z 	at java.base/java.lang.Runtime.exec(Runtime.java:453)
2026-11-17T17:28:35.9974718Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:58)
2026-11-17T17:28:35.9974910Z 	... 37 more
2026-11-17T17:28:35.9975328Z Caused by: java.io.IOException: error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:35.9975524Z 	at java.base/java.lang.ProcessImpl.forkAndExec(Native Method)
2026-11-17T17:28:35.9975909Z 	at java.base/java.lang.ProcessImpl.<init>(ProcessImpl.java:314)
2026-11-17T17:28:35.9976105Z 	at java.base/java.lang.ProcessImpl.start(ProcessImpl.java:244)
2026-11-17T17:28:35.9976320Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1110)
2026-11-17T17:28:35.9976449Z 	... 41 more
2026-11-17T17:28:35.9976542Z 
2026-11-17T17:28:35.9976892Z [ERROR] br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual[evolucao/consultarPlanilhaEvolucaoDivida/subRelatorioEvolucaoDividaReneg.jasper] -- Time elapsed: 0.011 s <<< ERROR!
2026-11-17T17:28:35.9977306Z net.sf.jasperreports.engine.JRException: Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/subRelatorioEvolucaoDivida_1794936515777_482107.java 
2026-11-17T17:28:35.9977561Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:89)
2026-11-17T17:28:35.9977768Z 	at net.sf.jasperreports.engine.design.JRAbstractClassCompiler.compileUnits(JRAbstractClassCompiler.java:63)
2026-11-17T17:28:35.9978120Z 	at net.sf.jasperreports.engine.design.JRAbstractCompiler.compileReport(JRAbstractCompiler.java:188)
2026-11-17T17:28:35.9978416Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:215)
2026-11-17T17:28:35.9978654Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:148)
2026-11-17T17:28:35.9978902Z 	at br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual(ModelosJasperTest.java:67)
2026-11-17T17:28:35.9979207Z 	at jdk.internal.reflect.GeneratedMethodAccessor116.invoke(Unknown Source)
2026-11-17T17:28:35.9979434Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-11-17T17:28:35.9979660Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-11-17T17:28:35.9979872Z 	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
2026-11-17T17:28:35.9980094Z 	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
2026-11-17T17:28:35.9980339Z 	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
2026-11-17T17:28:35.9980827Z 	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
2026-11-17T17:28:35.9981003Z 	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
2026-11-17T17:28:35.9981227Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
2026-11-17T17:28:35.9981502Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
2026-11-17T17:28:35.9981708Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9981904Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9982111Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9982311Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9982531Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9982733Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9982925Z 	at org.junit.runners.Suite.runChild(Suite.java:127)
2026-11-17T17:28:35.9983072Z 	at org.junit.runners.Suite.runChild(Suite.java:26)
2026-11-17T17:28:35.9983262Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9983532Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9983767Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9983962Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9984155Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9984377Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9984682Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:316)
2026-11-17T17:28:35.9984919Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:240)
2026-11-17T17:28:35.9985114Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:214)
2026-11-17T17:28:35.9985344Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:155)
2026-11-17T17:28:35.9985565Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-11-17T17:28:35.9985788Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-11-17T17:28:35.9986001Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-11-17T17:28:35.9986209Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-11-17T17:28:35.9986551Z Caused by: java.io.IOException: Cannot run program "javac": error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:35.9986758Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1143)
2026-11-17T17:28:35.9986959Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1073)
2026-11-17T17:28:35.9987149Z 	at java.base/java.lang.Runtime.exec(Runtime.java:594)
2026-11-17T17:28:35.9987300Z 	at java.base/java.lang.Runtime.exec(Runtime.java:453)
2026-11-17T17:28:35.9987508Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:58)
2026-11-17T17:28:35.9987803Z 	... 37 more
2026-11-17T17:28:35.9988044Z Caused by: java.io.IOException: error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:35.9988244Z 	at java.base/java.lang.ProcessImpl.forkAndExec(Native Method)
2026-11-17T17:28:35.9988554Z 	at java.base/java.lang.ProcessImpl.<init>(ProcessImpl.java:314)
2026-11-17T17:28:35.9988749Z 	at java.base/java.lang.ProcessImpl.start(ProcessImpl.java:244)
2026-11-17T17:28:35.9988942Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1110)
2026-11-17T17:28:35.9989126Z 	... 41 more
2026-11-17T17:28:35.9989199Z 
2026-11-17T17:28:35.9989631Z [ERROR] br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual[evolucao/consultarPlanilhaEvolucaoDividaSeguradora/relatorioEvolucaoDividaSeguradora.jasper] -- Time elapsed: 0.031 s <<< ERROR!
2026-11-17T17:28:35.9990188Z net.sf.jasperreports.engine.JRException: Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/relatorioEvolucaoDividaSeguradora_1794936515809_270290.java 
2026-11-17T17:28:35.9990463Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:89)
2026-11-17T17:28:35.9990750Z 	at net.sf.jasperreports.engine.design.JRAbstractClassCompiler.compileUnits(JRAbstractClassCompiler.java:63)
2026-11-17T17:28:35.9991037Z 	at net.sf.jasperreports.engine.design.JRAbstractCompiler.compileReport(JRAbstractCompiler.java:188)
2026-11-17T17:28:35.9991279Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:215)
2026-11-17T17:28:35.9991477Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:148)
2026-11-17T17:28:35.9991723Z 	at br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual(ModelosJasperTest.java:67)
2026-11-17T17:28:35.9991950Z 	at jdk.internal.reflect.GeneratedMethodAccessor116.invoke(Unknown Source)
2026-11-17T17:28:35.9992169Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-11-17T17:28:35.9992423Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-11-17T17:28:35.9992635Z 	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
2026-11-17T17:28:35.9992859Z 	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
2026-11-17T17:28:35.9993093Z 	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
2026-11-17T17:28:35.9993311Z 	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
2026-11-17T17:28:35.9993593Z 	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
2026-11-17T17:28:35.9993816Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
2026-11-17T17:28:35.9994033Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
2026-11-17T17:28:35.9994243Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9994448Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9994726Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9994929Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9995151Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9995382Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9995573Z 	at org.junit.runners.Suite.runChild(Suite.java:127)
2026-11-17T17:28:35.9995758Z 	at org.junit.runners.Suite.runChild(Suite.java:26)
2026-11-17T17:28:35.9995911Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:35.9996123Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:35.9996323Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:35.9996612Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:35.9996807Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:35.9997024Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:35.9997277Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:316)
2026-11-17T17:28:35.9997499Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:240)
2026-11-17T17:28:35.9997728Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:214)
2026-11-17T17:28:35.9997961Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:155)
2026-11-17T17:28:35.9998149Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-11-17T17:28:35.9998420Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-11-17T17:28:35.9998670Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-11-17T17:28:35.9998955Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-11-17T17:28:35.9999322Z Caused by: java.io.IOException: Cannot run program "javac": error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:35.9999609Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1143)
2026-11-17T17:28:35.9999903Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1073)
2026-11-17T17:28:36.0000120Z 	at java.base/java.lang.Runtime.exec(Runtime.java:594)
2026-11-17T17:28:36.0000301Z 	at java.base/java.lang.Runtime.exec(Runtime.java:453)
2026-11-17T17:28:36.0000505Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:58)
2026-11-17T17:28:36.0000649Z 	... 37 more
2026-11-17T17:28:36.0000881Z Caused by: java.io.IOException: error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:36.0001065Z 	at java.base/java.lang.ProcessImpl.forkAndExec(Native Method)
2026-11-17T17:28:36.0001312Z 	at java.base/java.lang.ProcessImpl.<init>(ProcessImpl.java:314)
2026-11-17T17:28:36.0001503Z 	at java.base/java.lang.ProcessImpl.start(ProcessImpl.java:244)
2026-11-17T17:28:36.0001711Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1110)
2026-11-17T17:28:36.0001872Z 	... 41 more
2026-11-17T17:28:36.0001914Z 
2026-11-17T17:28:36.0002357Z [ERROR] br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual[evolucao/consultarPlanilhaEvolucaoDividaSeguradora/subRelatorioEvolucaoDividaSeguradora.jasper] -- Time elapsed: 0.008 s <<< ERROR!
2026-11-17T17:28:36.0002912Z net.sf.jasperreports.engine.JRException: Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/subRelatorioEvolucaoDividaSeguradora_1794936515820_279095.java 
2026-11-17T17:28:36.0003226Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:89)
2026-11-17T17:28:36.0003468Z 	at net.sf.jasperreports.engine.design.JRAbstractClassCompiler.compileUnits(JRAbstractClassCompiler.java:63)
2026-11-17T17:28:36.0003756Z 	at net.sf.jasperreports.engine.design.JRAbstractCompiler.compileReport(JRAbstractCompiler.java:188)
2026-11-17T17:28:36.0004005Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:215)
2026-11-17T17:28:36.0004240Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:148)
2026-11-17T17:28:36.0004493Z 	at br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual(ModelosJasperTest.java:67)
2026-11-17T17:28:36.0004782Z 	at jdk.internal.reflect.GeneratedMethodAccessor116.invoke(Unknown Source)
2026-11-17T17:28:36.0005000Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-11-17T17:28:36.0005309Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-11-17T17:28:36.0005514Z 	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
2026-11-17T17:28:36.0005742Z 	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
2026-11-17T17:28:36.0005986Z 	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
2026-11-17T17:28:36.0006246Z 	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
2026-11-17T17:28:36.0006456Z 	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
2026-11-17T17:28:36.0006664Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
2026-11-17T17:28:36.0006881Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
2026-11-17T17:28:36.0007089Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:36.0007251Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:36.0007505Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:36.0007703Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:36.0007933Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:36.0008124Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:36.0008349Z 	at org.junit.runners.Suite.runChild(Suite.java:127)
2026-11-17T17:28:36.0008529Z 	at org.junit.runners.Suite.runChild(Suite.java:26)
2026-11-17T17:28:36.0008718Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:36.0008924Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:36.0009158Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:36.0009376Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:36.0009584Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:36.0009817Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:36.0010087Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:316)
2026-11-17T17:28:36.0010312Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:240)
2026-11-17T17:28:36.0010542Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:214)
2026-11-17T17:28:36.0010800Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:155)
2026-11-17T17:28:36.0011021Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-11-17T17:28:36.0011251Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-11-17T17:28:36.0011426Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-11-17T17:28:36.0011635Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-11-17T17:28:36.0011969Z Caused by: java.io.IOException: Cannot run program "javac": error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:36.0012169Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1143)
2026-11-17T17:28:36.0012379Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1073)
2026-11-17T17:28:36.0012673Z 	at java.base/java.lang.Runtime.exec(Runtime.java:594)
2026-11-17T17:28:36.0012855Z 	at java.base/java.lang.Runtime.exec(Runtime.java:453)
2026-11-17T17:28:36.0013064Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:58)
2026-11-17T17:28:36.0013250Z 	... 37 more
2026-11-17T17:28:36.0013507Z Caused by: java.io.IOException: error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:36.0013656Z 	at java.base/java.lang.ProcessImpl.forkAndExec(Native Method)
2026-11-17T17:28:36.0013859Z 	at java.base/java.lang.ProcessImpl.<init>(ProcessImpl.java:314)
2026-11-17T17:28:36.0014078Z 	at java.base/java.lang.ProcessImpl.start(ProcessImpl.java:244)
2026-11-17T17:28:36.0014345Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1110)
2026-11-17T17:28:36.0014556Z 	... 41 more
2026-11-17T17:28:36.0014603Z 
2026-11-17T17:28:36.0014992Z [ERROR] br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual[evolucao/consultarPosicaoDivida/relatorioPosicaoDivida.jasper] -- Time elapsed: 0.035 s <<< ERROR!
2026-11-17T17:28:36.0015477Z net.sf.jasperreports.engine.JRException: Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/relatorioPosicaoDivida_1794936515849_696047.java 
2026-11-17T17:28:36.0015734Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:89)
2026-11-17T17:28:36.0016003Z 	at net.sf.jasperreports.engine.design.JRAbstractClassCompiler.compileUnits(JRAbstractClassCompiler.java:63)
2026-11-17T17:28:36.0016284Z 	at net.sf.jasperreports.engine.design.JRAbstractCompiler.compileReport(JRAbstractCompiler.java:188)
2026-11-17T17:28:36.0016587Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:215)
2026-11-17T17:28:36.0016823Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:148)
2026-11-17T17:28:36.0017084Z 	at br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual(ModelosJasperTest.java:67)
2026-11-17T17:28:36.0017376Z 	at jdk.internal.reflect.GeneratedMethodAccessor116.invoke(Unknown Source)
2026-11-17T17:28:36.0017598Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-11-17T17:28:36.0017782Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-11-17T17:28:36.0017988Z 	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
2026-11-17T17:28:36.0018218Z 	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
2026-11-17T17:28:36.0018460Z 	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
2026-11-17T17:28:36.0018714Z 	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
2026-11-17T17:28:36.0018923Z 	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
2026-11-17T17:28:36.0019204Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
2026-11-17T17:28:36.0019552Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
2026-11-17T17:28:36.0019795Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:36.0020041Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:36.0020265Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:36.0020491Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:36.0020745Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:36.0020949Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:36.0021220Z 	at org.junit.runners.Suite.runChild(Suite.java:127)
2026-11-17T17:28:36.0021487Z 	at org.junit.runners.Suite.runChild(Suite.java:26)
2026-11-17T17:28:36.0021679Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:36.0021940Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:36.0022153Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:36.0022377Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:36.0022547Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:36.0022840Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:36.0023103Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:316)
2026-11-17T17:28:36.0023337Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:240)
2026-11-17T17:28:36.0023595Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:214)
2026-11-17T17:28:36.0023819Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:155)
2026-11-17T17:28:36.0024040Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-11-17T17:28:36.0024401Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-11-17T17:28:36.0024770Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-11-17T17:28:36.0025018Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-11-17T17:28:36.0025298Z Caused by: java.io.IOException: Cannot run program "javac": error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:36.0025551Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1143)
2026-11-17T17:28:36.0025871Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1073)
2026-11-17T17:28:36.0026224Z 	at java.base/java.lang.Runtime.exec(Runtime.java:594)
2026-11-17T17:28:36.0026453Z 	at java.base/java.lang.Runtime.exec(Runtime.java:453)
2026-11-17T17:28:36.0026662Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:58)
2026-11-17T17:28:36.0026841Z 	... 37 more
2026-11-17T17:28:36.0027192Z Caused by: java.io.IOException: error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:36.0027419Z 	at java.base/java.lang.ProcessImpl.forkAndExec(Native Method)
2026-11-17T17:28:36.0027606Z 	at java.base/java.lang.ProcessImpl.<init>(ProcessImpl.java:314)
2026-11-17T17:28:36.0027761Z 	at java.base/java.lang.ProcessImpl.start(ProcessImpl.java:244)
2026-11-17T17:28:36.0027957Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1110)
2026-11-17T17:28:36.0028118Z 	... 41 more
2026-11-17T17:28:36.0028194Z 
2026-11-17T17:28:36.0028530Z [ERROR] br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual[evolucao/consultarPosicaoDivida/relatorioPosicaoDividaSeguradora.jasper] -- Time elapsed: 0.021 s <<< ERROR!
2026-11-17T17:28:36.0028973Z net.sf.jasperreports.engine.JRException: Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/relatorioPosicaoDividaSeguradora_1794936515879_878195.java 
2026-11-17T17:28:36.0029288Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:89)
2026-11-17T17:28:36.0029566Z 	at net.sf.jasperreports.engine.design.JRAbstractClassCompiler.compileUnits(JRAbstractClassCompiler.java:63)
2026-11-17T17:28:36.0029999Z 	at net.sf.jasperreports.engine.design.JRAbstractCompiler.compileReport(JRAbstractCompiler.java:188)
2026-11-17T17:28:36.0030320Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:215)
2026-11-17T17:28:36.0030602Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:148)
2026-11-17T17:28:36.0030896Z 	at br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual(ModelosJasperTest.java:67)
2026-11-17T17:28:36.0031126Z 	at jdk.internal.reflect.GeneratedMethodAccessor116.invoke(Unknown Source)
2026-11-17T17:28:36.0031346Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-11-17T17:28:36.0031582Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-11-17T17:28:36.0031824Z 	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
2026-11-17T17:28:36.0032012Z 	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
2026-11-17T17:28:36.0032259Z 	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
2026-11-17T17:28:36.0032483Z 	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
2026-11-17T17:28:36.0032992Z 	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
2026-11-17T17:28:36.0033213Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
2026-11-17T17:28:36.0033432Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
2026-11-17T17:28:36.0033639Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:36.0033837Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:36.0034055Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:36.0034280Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:36.0034445Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:36.0034800Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:36.0034994Z 	at org.junit.runners.Suite.runChild(Suite.java:127)
2026-11-17T17:28:36.0035178Z 	at org.junit.runners.Suite.runChild(Suite.java:26)
2026-11-17T17:28:36.0035370Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:36.0035623Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:36.0035833Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:36.0036027Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:36.0036265Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:36.0036509Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:36.0036680Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:316)
2026-11-17T17:28:36.0036904Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:240)
2026-11-17T17:28:36.0037136Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:214)
2026-11-17T17:28:36.0037361Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:155)
2026-11-17T17:28:36.0037591Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-11-17T17:28:36.0037819Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-11-17T17:28:36.0038152Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-11-17T17:28:36.0038382Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-11-17T17:28:36.0038687Z Caused by: java.io.IOException: Cannot run program "javac": error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:36.0038895Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1143)
2026-11-17T17:28:36.0039060Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1073)
2026-11-17T17:28:36.0039245Z 	at java.base/java.lang.Runtime.exec(Runtime.java:594)
2026-11-17T17:28:36.0039502Z 	at java.base/java.lang.Runtime.exec(Runtime.java:453)
2026-11-17T17:28:36.0039819Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:58)
2026-11-17T17:28:36.0040000Z 	... 37 more
2026-11-17T17:28:36.0040229Z Caused by: java.io.IOException: error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:36.0040479Z 	at java.base/java.lang.ProcessImpl.forkAndExec(Native Method)
2026-11-17T17:28:36.0040697Z 	at java.base/java.lang.ProcessImpl.<init>(ProcessImpl.java:314)
2026-11-17T17:28:36.0040893Z 	at java.base/java.lang.ProcessImpl.start(ProcessImpl.java:244)
2026-11-17T17:28:36.0041104Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1110)
2026-11-17T17:28:36.0041335Z 	... 41 more
2026-11-17T17:28:36.0041426Z 
2026-11-17T17:28:36.0041758Z [ERROR] br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual[evolucao/evolucaoDividaNCE/relatorioEvolucaoDividaNCE.jasper] -- Time elapsed: 0.019 s <<< ERROR!
2026-11-17T17:28:36.0042226Z net.sf.jasperreports.engine.JRException: Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/relatorioEvolucaoDividaNCE_1794936515899_695879.java 
2026-11-17T17:28:36.0042527Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:89)
2026-11-17T17:28:36.0042734Z 	at net.sf.jasperreports.engine.design.JRAbstractClassCompiler.compileUnits(JRAbstractClassCompiler.java:63)
2026-11-17T17:28:36.0043000Z 	at net.sf.jasperreports.engine.design.JRAbstractCompiler.compileReport(JRAbstractCompiler.java:188)
2026-11-17T17:28:36.0043241Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:215)
2026-11-17T17:28:36.0043571Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:148)
2026-11-17T17:28:36.0043836Z 	at br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual(ModelosJasperTest.java:67)
2026-11-17T17:28:36.0044100Z 	at jdk.internal.reflect.GeneratedMethodAccessor116.invoke(Unknown Source)
2026-11-17T17:28:36.0044391Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-11-17T17:28:36.0044744Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-11-17T17:28:36.0045076Z 	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
2026-11-17T17:28:36.0045329Z 	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
2026-11-17T17:28:36.0045548Z 	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
2026-11-17T17:28:36.0045923Z 	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
2026-11-17T17:28:36.0046216Z 	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
2026-11-17T17:28:36.0046430Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
2026-11-17T17:28:36.0046654Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
2026-11-17T17:28:36.0046939Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:36.0047137Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:36.0047339Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:36.0047564Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:36.0047775Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:36.0047966Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:36.0048120Z 	at org.junit.runners.Suite.runChild(Suite.java:127)
2026-11-17T17:28:36.0048300Z 	at org.junit.runners.Suite.runChild(Suite.java:26)
2026-11-17T17:28:36.0048490Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:36.0048727Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:36.0048923Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:36.0049177Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:36.0049473Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:36.0049678Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:36.0049919Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:316)
2026-11-17T17:28:36.0050110Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:240)
2026-11-17T17:28:36.0050347Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:214)
2026-11-17T17:28:36.0050676Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:155)
2026-11-17T17:28:36.0050922Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-11-17T17:28:36.0051142Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-11-17T17:28:36.0051403Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-11-17T17:28:36.0051680Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-11-17T17:28:36.0052032Z Caused by: java.io.IOException: Cannot run program "javac": error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:36.0052256Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1143)
2026-11-17T17:28:36.0052476Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1073)
2026-11-17T17:28:36.0052669Z 	at java.base/java.lang.Runtime.exec(Runtime.java:594)
2026-11-17T17:28:36.0052814Z 	at java.base/java.lang.Runtime.exec(Runtime.java:453)
2026-11-17T17:28:36.0053017Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:58)
2026-11-17T17:28:36.0053194Z 	... 37 more
2026-11-17T17:28:36.0053421Z Caused by: java.io.IOException: error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:36.0053754Z 	at java.base/java.lang.ProcessImpl.forkAndExec(Native Method)
2026-11-17T17:28:36.0054006Z 	at java.base/java.lang.ProcessImpl.<init>(ProcessImpl.java:314)
2026-11-17T17:28:36.0054256Z 	at java.base/java.lang.ProcessImpl.start(ProcessImpl.java:244)
2026-11-17T17:28:36.0054568Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1110)
2026-11-17T17:28:36.0054823Z 	... 41 more
2026-11-17T17:28:36.0054867Z 
2026-11-17T17:28:36.0055199Z [ERROR] br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual[evolucao/simularPrestacoes/simularPrestacoes.jasper] -- Time elapsed: 0.014 s <<< ERROR!
2026-11-17T17:28:36.0055642Z net.sf.jasperreports.engine.JRException: Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/simularPrestacoes_1794936515915_18490.java 
2026-11-17T17:28:36.0055892Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:89)
2026-11-17T17:28:36.0056155Z 	at net.sf.jasperreports.engine.design.JRAbstractClassCompiler.compileUnits(JRAbstractClassCompiler.java:63)
2026-11-17T17:28:36.0056473Z 	at net.sf.jasperreports.engine.design.JRAbstractCompiler.compileReport(JRAbstractCompiler.java:188)
2026-11-17T17:28:36.0056682Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:215)
2026-11-17T17:28:36.0056913Z 	at net.sf.jasperreports.engine.JasperCompileManager.compileReport(JasperCompileManager.java:148)
2026-11-17T17:28:36.0057222Z 	at br.gov.caixa.siemp.relatorios.ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual(ModelosJasperTest.java:67)
2026-11-17T17:28:36.0057564Z 	at jdk.internal.reflect.GeneratedMethodAccessor116.invoke(Unknown Source)
2026-11-17T17:28:36.0057784Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-11-17T17:28:36.0058010Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-11-17T17:28:36.0058213Z 	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
2026-11-17T17:28:36.0058453Z 	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
2026-11-17T17:28:36.0058671Z 	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
2026-11-17T17:28:36.0058888Z 	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
2026-11-17T17:28:36.0059091Z 	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
2026-11-17T17:28:36.0059262Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
2026-11-17T17:28:36.0059533Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
2026-11-17T17:28:36.0059748Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:36.0059947Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:36.0060144Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:36.0060360Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:36.0060557Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:36.0060750Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:36.0060937Z 	at org.junit.runners.Suite.runChild(Suite.java:127)
2026-11-17T17:28:36.0061082Z 	at org.junit.runners.Suite.runChild(Suite.java:26)
2026-11-17T17:28:36.0061272Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:36.0061478Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:36.0061678Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:36.0061874Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:36.0062091Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:36.0062284Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:36.0062484Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:316)
2026-11-17T17:28:36.0062845Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:240)
2026-11-17T17:28:36.0063149Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:214)
2026-11-17T17:28:36.0063338Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:155)
2026-11-17T17:28:36.0063563Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-11-17T17:28:36.0063810Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-11-17T17:28:36.0064022Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-11-17T17:28:36.0064256Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-11-17T17:28:36.0064611Z Caused by: java.io.IOException: Cannot run program "javac": error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:36.0064827Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1143)
2026-11-17T17:28:36.0065035Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1073)
2026-11-17T17:28:36.0065227Z 	at java.base/java.lang.Runtime.exec(Runtime.java:594)
2026-11-17T17:28:36.0065414Z 	at java.base/java.lang.Runtime.exec(Runtime.java:453)
2026-11-17T17:28:36.0065715Z 	at net.sf.jasperreports.engine.design.JRJavacCompiler.compileClasses(JRJavacCompiler.java:58)
2026-11-17T17:28:36.0065902Z 	... 37 more
2026-11-17T17:28:36.0066123Z Caused by: java.io.IOException: error=2, Arquivo ou diretório inexistente
2026-11-17T17:28:36.0066377Z 	at java.base/java.lang.ProcessImpl.forkAndExec(Native Method)
2026-11-17T17:28:36.0066616Z 	at java.base/java.lang.ProcessImpl.<init>(ProcessImpl.java:314)
2026-11-17T17:28:36.0066830Z 	at java.base/java.lang.ProcessImpl.start(ProcessImpl.java:244)
2026-11-17T17:28:36.0067095Z 	at java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1110)
2026-11-17T17:28:36.0067250Z 	... 41 more
2026-11-17T17:28:36.0067292Z 
2026-11-17T17:28:36.0067481Z [INFO] Running br.gov.caixa.siemp.apoio.apresentacao.mantertabelas.atualizarvaloresnamatrizdeexcepcionacao.AtualizarValoresNaMatrizDeExcepcionacaoFormTest
2026-11-17T17:28:36.0067907Z [INFO] Tests run: 13, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 s -- in br.gov.caixa.siemp.apoio.apresentacao.mantertabelas.atualizarvaloresnamatrizdeexcepcionacao.AtualizarValoresNaMatrizDeExcepcionacaoFormTest
2026-11-17T17:28:36.0068201Z [INFO] Running br.gov.caixa.siemp.apoio.apresentacao.mantertabelas.manterpercentualdetaxasdejuros.ReceberVigenciaFormTest
2026-11-17T17:28:36.0068694Z [INFO] Tests run: 10, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.008 s -- in br.gov.caixa.siemp.apoio.apresentacao.mantertabelas.manterpercentualdetaxasdejuros.ReceberVigenciaFormTest
2026-11-17T17:28:36.0068973Z [INFO] Running br.gov.caixa.siemp.apoio.apresentacao.mantertabelas.manterpercentualdetaxasdejuros.CopiarEstruturaDeTabelaDeTaxasFormTest
2026-11-17T17:28:36.0069481Z [INFO] Tests run: 8, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 s -- in br.gov.caixa.siemp.apoio.apresentacao.mantertabelas.manterpercentualdetaxasdejuros.CopiarEstruturaDeTabelaDeTaxasFormTest
2026-11-17T17:28:36.0069737Z [INFO] Running br.gov.caixa.siemp.indicebovespa.atualiza.AtualizarIndiceBovespaServletTest
2026-11-17T17:28:36.0529500Z Criando Log de Sistema
2026-11-17T17:28:36.0529734Z Log do Sitema inicializada!
2026-11-17T17:28:36.0816447Z org.apache.commons.fileupload.FileUploadBase$SizeLimitExceededException: the request was rejected because its size (5243003) exceeds the configured maximum (5242880)
2026-11-17T17:28:36.0816935Z 	at org.apache.commons.fileupload.FileUploadBase$FileItemIteratorImpl.<init>(FileUploadBase.java:965)
2026-11-17T17:28:36.0817415Z 	at org.apache.commons.fileupload.FileUploadBase.getItemIterator(FileUploadBase.java:310)
2026-11-17T17:28:36.0817731Z 	at org.apache.commons.fileupload.FileUploadBase.parseRequest(FileUploadBase.java:334)
2026-11-17T17:28:36.0818067Z 	at org.apache.commons.fileupload.FileUploadBase.parseRequest(FileUploadBase.java:288)
2026-11-17T17:28:36.0818424Z 	at br.gov.caixa.siemp.indicebovespa.atualiza.AtualizarIndiceBovespaServlet.obterArquivoLegivel(AtualizarIndiceBovespaServlet.java:77)
2026-11-17T17:28:36.0818918Z 	at br.gov.caixa.siemp.indicebovespa.atualiza.AtualizarIndiceBovespaServlet.doPost(AtualizarIndiceBovespaServlet.java:55)
2026-11-17T17:28:36.0819313Z 	at br.gov.caixa.siemp.indicebovespa.atualiza.AtualizarIndiceBovespaServletTest.deveRejeitarUploadAcimaDeCincoMegabytes(AtualizarIndiceBovespaServletTest.java:111)
2026-11-17T17:28:36.0819660Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-11-17T17:28:36.0819879Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-11-17T17:28:36.0820170Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-11-17T17:28:36.0820404Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-11-17T17:28:36.0820617Z 	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
2026-11-17T17:28:36.0820857Z 	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
2026-11-17T17:28:36.0821077Z 	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
2026-11-17T17:28:36.0821262Z 	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
2026-11-17T17:28:36.0821470Z 	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
2026-11-17T17:28:36.0821682Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
2026-11-17T17:28:36.0821975Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
2026-11-17T17:28:36.0822294Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:36.0822490Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:36.0822686Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:36.0822883Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:36.0823084Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:36.0823275Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:36.0823446Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:316)
2026-11-17T17:28:36.0823669Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:240)
2026-11-17T17:28:36.0823899Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:214)
2026-11-17T17:28:36.0824156Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:155)
2026-11-17T17:28:36.0824374Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-11-17T17:28:36.0824688Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-11-17T17:28:36.0824910Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-11-17T17:28:36.0825118Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-11-17T17:28:36.0837556Z java.lang.Exception: falha
2026-11-17T17:28:36.0837810Z 	at br.gov.caixa.siemp.indicebovespa.atualiza.AtualizarIndiceBovespaServletTest$3.atualizarIndice(AtualizarIndiceBovespaServletTest.java:206)
2026-11-17T17:28:36.0838264Z 	at br.gov.caixa.siemp.indicebovespa.atualiza.AtualizarIndiceBovespaServlet.processarAtualizacao(AtualizarIndiceBovespaServlet.java:112)
2026-11-17T17:28:36.0838618Z 	at br.gov.caixa.siemp.indicebovespa.atualiza.AtualizarIndiceBovespaServlet.doPost(AtualizarIndiceBovespaServlet.java:63)
2026-11-17T17:28:36.0838946Z 	at br.gov.caixa.siemp.indicebovespa.atualiza.AtualizarIndiceBovespaServletTest.executarComDelegate(AtualizarIndiceBovespaServletTest.java:249)
2026-11-17T17:28:36.0839438Z 	at br.gov.caixa.siemp.indicebovespa.atualiza.AtualizarIndiceBovespaServletTest.deveTratarFalhaNaAtualizacao(AtualizarIndiceBovespaServletTest.java:212)
2026-11-17T17:28:36.0839773Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-11-17T17:28:36.0839990Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-11-17T17:28:36.0840238Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-11-17T17:28:36.0840517Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-11-17T17:28:36.0840786Z 	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
2026-11-17T17:28:36.0841014Z 	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
2026-11-17T17:28:36.0841234Z 	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
2026-11-17T17:28:36.0841456Z 	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
2026-11-17T17:28:36.0841713Z 	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
2026-11-17T17:28:36.0841947Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
2026-11-17T17:28:36.0842175Z 	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
2026-11-17T17:28:36.0842346Z 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
2026-11-17T17:28:36.0842573Z 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
2026-11-17T17:28:36.0842811Z 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
2026-11-17T17:28:36.0843011Z 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
2026-11-17T17:28:36.0843210Z 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
2026-11-17T17:28:36.0843406Z 	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
2026-11-17T17:28:36.0843618Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:316)
2026-11-17T17:28:36.0843840Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:240)
2026-11-17T17:28:36.0844081Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:214)
2026-11-17T17:28:36.0844299Z 	at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:155)
2026-11-17T17:28:36.0844486Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-11-17T17:28:36.0844804Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-11-17T17:28:36.0845013Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-11-17T17:28:36.0845223Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-11-17T17:28:36.0898282Z [INFO] Tests run: 14, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.135 s -- in br.gov.caixa.siemp.indicebovespa.atualiza.AtualizarIndiceBovespaServletTest
2026-11-17T17:28:36.0898618Z [INFO] Running br.gov.caixa.siemp.comum.apresentacao.login.LoginActionTest
2026-11-17T17:28:36.0956209Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.004 s -- in br.gov.caixa.siemp.comum.apresentacao.login.LoginActionTest
2026-11-17T17:28:36.0956612Z [INFO] Running br.gov.caixa.siemp.comum.apresentacao.login.LoginMenuConsultasTest
2026-11-17T17:28:36.0993006Z [INFO] Tests run: 12, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.002 s -- in br.gov.caixa.siemp.comum.apresentacao.login.LoginMenuConsultasTest
2026-11-17T17:28:36.0995199Z [INFO] Running br.gov.caixa.siemp.comum.apresentacao.SiempActionTest
2026-11-17T17:28:36.1010210Z [INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 s -- in br.gov.caixa.siemp.comum.apresentacao.SiempActionTest
2026-11-17T17:28:36.1010495Z [INFO] Running br.gov.caixa.siemp.apresentacao.consignacao.consultaMovimentoDeAcertoDoConvenioNovo.ConsultaMovimentoDeAcertoDoConvenioHelperTest
2026-11-17T17:28:36.1027048Z [INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 s -- in br.gov.caixa.siemp.apresentacao.consignacao.consultaMovimentoDeAcertoDoConvenioNovo.ConsultaMovimentoDeAcertoDoConvenioHelperTest
2026-11-17T17:28:36.1027550Z [INFO] Running br.gov.caixa.siemp.apresentacao.consignacao.consultarDadosConvenio.ConsultarDadosConvenioHelpersTest
2026-11-17T17:28:36.1057090Z [INFO] Tests run: 10, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.002 s -- in br.gov.caixa.siemp.apresentacao.consignacao.consultarDadosConvenio.ConsultarDadosConvenioHelpersTest
2026-11-17T17:28:36.1057972Z [INFO] Running br.gov.caixa.siemp.apresentacao.consignacao.consultarComiteDeAutorizacoes.ConsultarComiteDeAutorizacoesHelpersTest
2026-11-17T17:28:36.1073450Z [INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 s -- in br.gov.caixa.siemp.apresentacao.consignacao.consultarComiteDeAutorizacoes.ConsultarComiteDeAutorizacoesHelpersTest
2026-11-17T17:28:36.1073818Z [INFO] Running br.gov.caixa.siemp.apresentacao.consignacao.consultaTabelaDeTACDeConvenio.ConsultaTabelaDeTACDeConvenioHelpersTest
2026-11-17T17:28:36.1124427Z [INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.003 s -- in br.gov.caixa.siemp.apresentacao.consignacao.consultaTabelaDeTACDeConvenio.ConsultaTabelaDeTACDeConvenioHelpersTest
2026-11-17T17:28:36.1124811Z [INFO] Running br.gov.caixa.siemp.apresentacao.consignacao.consultaTabelaDeTaxasDeConvenio.ConsultaTabelaDeTaxasDeConvenioHelpersTest
2026-11-17T17:28:36.1137156Z [INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 s -- in br.gov.caixa.siemp.apresentacao.consignacao.consultaTabelaDeTaxasDeConvenio.ConsultaTabelaDeTaxasDeConvenioHelpersTest
2026-11-17T17:28:36.1137538Z [INFO] Running br.gov.caixa.siemp.apresentacao.consignacao.ajustaExtratoDoConvenio.AjustaExtratoDoConvenioTotalizadorHelperTest
2026-11-17T17:28:36.1152460Z [INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 s -- in br.gov.caixa.siemp.apresentacao.consignacao.ajustaExtratoDoConvenio.AjustaExtratoDoConvenioTotalizadorHelperTest
2026-11-17T17:28:36.1152828Z [INFO] Running br.gov.caixa.siemp.apresentacao.consignacao.consultaHistoricoDoConvenio.ConsultaHistoricoDoConvenioHelperTest
2026-11-17T17:28:36.1168626Z [INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 s -- in br.gov.caixa.siemp.apresentacao.consignacao.consultaHistoricoDoConvenio.ConsultaHistoricoDoConvenioHelperTest
2026-11-17T17:28:36.1169020Z [INFO] Running br.gov.caixa.siemp.apresentacao.consignacao.consultaHistoricoDoConvenio.ConsultaHistoricoDoConvenioParametroHelperTest
2026-11-17T17:28:36.1186432Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 s -- in br.gov.caixa.siemp.apresentacao.consignacao.consultaHistoricoDoConvenio.ConsultaHistoricoDoConvenioParametroHelperTest
2026-11-17T17:28:36.1186740Z [INFO] Running br.gov.caixa.siemp.apresentacao.consignacao.consultaHistoricoDoConvenio.ConsultaHistoricoDoConvenioHistoricosHelperTest
2026-11-17T17:28:36.1201478Z [INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 s -- in br.gov.caixa.siemp.apresentacao.consignacao.consultaHistoricoDoConvenio.ConsultaHistoricoDoConvenioHistoricosHelperTest
2026-11-17T17:28:36.1201805Z [INFO] Running br.gov.caixa.siemp.apresentacao.consignacao.consultaConveniosExtratoAtraso.ConsultaConveniosExtratoAtrasoHelperColecoesTest
2026-11-17T17:28:36.1216122Z [INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 s -- in br.gov.caixa.siemp.apresentacao.consignacao.consultaConveniosExtratoAtraso.ConsultaConveniosExtratoAtrasoHelperColecoesTest
2026-11-17T17:28:36.1216377Z [INFO] Running br.gov.caixa.siemp.apresentacao.evolucao.SiricEstornoTest
2026-11-17T17:28:36.1455016Z nov. 17, 2026 2:28:36 PM br.gov.caixa.framework.log.Log4Java error
2026-11-17T17:28:36.1455434Z GRAVE: Não foi possível executar a procedure do SIRIC: 
2026-11-17T17:28:36.1455627Z nov. 17, 2026 2:28:36 PM br.gov.caixa.framework.log.Log4Java error
2026-11-17T17:28:36.1455803Z GRAVE: falha na execucao
2026-11-17T17:28:36.1455978Z nov. 17, 2026 2:28:36 PM br.gov.caixa.framework.log.Log4Java error
2026-11-17T17:28:36.1456408Z GRAVE: Não foi possível executar a procedure do SIRIC: 
2026-11-17T17:28:36.1456589Z nov. 17, 2026 2:28:36 PM br.gov.caixa.framework.log.Log4Java error
2026-11-17T17:28:36.1456753Z GRAVE: falha na execucao
2026-11-17T17:28:36.1478735Z nov. 17, 2026 2:28:36 PM br.gov.caixa.framework.log.Log4Java error
2026-11-17T17:28:36.1478953Z GRAVE: Não foi possível executar a procedure do SIRIC: 
2026-11-17T17:28:36.1479386Z nov. 17, 2026 2:28:36 PM br.gov.caixa.framework.log.Log4Java error
2026-11-17T17:28:36.1479548Z GRAVE: falha na execucao
2026-11-17T17:28:36.1479713Z nov. 17, 2026 2:28:36 PM br.gov.caixa.framework.log.Log4Java error
2026-11-17T17:28:36.1479907Z GRAVE: Erro ao fechar PreparedStatement do SIRIC: 
2026-11-17T17:28:36.1480085Z nov. 17, 2026 2:28:36 PM br.gov.caixa.framework.log.Log4Java error
2026-11-17T17:28:36.1480247Z GRAVE: falha ao fechar statement
2026-11-17T17:28:36.1480418Z nov. 17, 2026 2:28:36 PM br.gov.caixa.framework.log.Log4Java error
2026-11-17T17:28:36.1480610Z GRAVE: Erro ao fechar conexao com o SIRIC: 
2026-11-17T17:28:36.1480751Z nov. 17, 2026 2:28:36 PM br.gov.caixa.framework.log.Log4Java error
2026-11-17T17:28:36.1480918Z GRAVE: falha ao fechar conexao
2026-11-17T17:28:36.1481080Z nov. 17, 2026 2:28:36 PM br.gov.caixa.framework.log.Log4Java error
2026-11-17T17:28:36.1481401Z GRAVE: Não foi possível executar a procedure do SIRIC: 
2026-11-17T17:28:36.1481585Z nov. 17, 2026 2:28:36 PM br.gov.caixa.framework.log.Log4Java error
2026-11-17T17:28:36.1481741Z GRAVE: falha na execucao
2026-11-17T17:28:36.1481902Z nov. 17, 2026 2:28:36 PM br.gov.caixa.framework.log.Log4Java error
2026-11-17T17:28:36.1482068Z GRAVE: Erro ao fechar PreparedStatement do SIRIC: 
2026-11-17T17:28:36.1482263Z nov. 17, 2026 2:28:36 PM br.gov.caixa.framework.log.Log4Java error
2026-11-17T17:28:36.1482392Z GRAVE: falha ao fechar statement
2026-11-17T17:28:36.1482557Z nov. 17, 2026 2:28:36 PM br.gov.caixa.framework.log.Log4Java error
2026-11-17T17:28:36.1482726Z GRAVE: Erro ao fechar conexao com o SIRIC: 
2026-11-17T17:28:36.1482911Z nov. 17, 2026 2:28:36 PM br.gov.caixa.framework.log.Log4Java error
2026-11-17T17:28:36.1483074Z GRAVE: falha ao fechar conexao
2026-11-17T17:28:36.1488942Z nov. 17, 2026 2:28:36 PM br.gov.caixa.framework.log.Log4Java error
2026-11-17T17:28:36.1489185Z GRAVE: Não foi possível executar a procedure do SIRIC: 
2026-11-17T17:28:36.1489368Z nov. 17, 2026 2:28:36 PM br.gov.caixa.framework.log.Log4Java error
2026-11-17T17:28:36.1489564Z GRAVE: falha na preparacao
2026-11-17T17:28:36.1489696Z nov. 17, 2026 2:28:36 PM br.gov.caixa.framework.log.Log4Java error
2026-11-17T17:28:36.1489925Z GRAVE: Não foi possível executar a procedure do SIRIC: 
2026-11-17T17:28:36.1490113Z nov. 17, 2026 2:28:36 PM br.gov.caixa.framework.log.Log4Java error
2026-11-17T17:28:36.1490280Z GRAVE: falha na preparacao
2026-11-17T17:28:36.1508427Z [INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.028 s -- in br.gov.caixa.siemp.apresentacao.evolucao.SiricEstornoTest
2026-11-17T17:28:36.1508885Z [INFO] Running br.gov.caixa.siemp.apresentacao.evolucao.estornarconcessaoemprestimo.EstornarConcessaoEmprestimoACTTest
2026-11-17T17:28:36.1625099Z nov. 17, 2026 2:28:36 PM br.gov.caixa.framework.log.Log4Java error
2026-11-17T17:28:36.1625536Z GRAVE: Não foi possível executar a procedure do SIRIC: 
2026-11-17T17:28:36.1626254Z nov. 17, 2026 2:28:36 PM br.gov.caixa.framework.log.Log4Java error
2026-11-17T17:28:36.1626695Z GRAVE: falha na procedure
2026-11-17T17:28:36.1626972Z nov. 17, 2026 2:28:36 PM br.gov.caixa.framework.log.Log4Java error
2026-11-17T17:28:36.1627245Z GRAVE: Erro ao fechar PreparedStatement do SIRIC: 
2026-11-17T17:28:36.1627526Z nov. 17, 2026 2:28:36 PM br.gov.caixa.framework.log.Log4Java error
2026-11-17T17:28:36.1627756Z GRAVE: falha ao fechar
2026-11-17T17:28:36.1628009Z nov. 17, 2026 2:28:36 PM br.gov.caixa.framework.log.Log4Java error
2026-11-17T17:28:36.1628282Z GRAVE: Erro ao fechar conexao com o SIRIC: 
2026-11-17T17:28:36.1628717Z nov. 17, 2026 2:28:36 PM br.gov.caixa.framework.log.Log4Java error
2026-11-17T17:28:36.1629135Z GRAVE: falha ao fechar
2026-11-17T17:28:36.1662066Z nov. 17, 2026 2:28:36 PM br.gov.caixa.framework.log.Log4Java error
2026-11-17T17:28:36.1662413Z GRAVE: Erro de SQL: jdbc/SybaseSiempDS
2026-11-17T17:28:36.1703542Z [INFO] Tests run: 11, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.018 s -- in br.gov.caixa.siemp.apresentacao.evolucao.estornarconcessaoemprestimo.EstornarConcessaoEmprestimoACTTest
2026-11-17T17:28:36.1704310Z [INFO] Running br.gov.caixa.siemp.apresentacao.evolucao.estornarpagamento.EstornarPagamentoACTTest
2026-11-17T17:28:36.1724903Z nov. 17, 2026 2:28:36 PM br.gov.caixa.framework.log.Log4Java error
2026-11-17T17:28:36.1725224Z GRAVE: Não foi possível executar a procedure do SIRIC: 
2026-11-17T17:28:36.1725544Z nov. 17, 2026 2:28:36 PM br.gov.caixa.framework.log.Log4Java error
2026-11-17T17:28:36.1725718Z GRAVE: falha na procedure
2026-11-17T17:28:36.1725854Z nov. 17, 2026 2:28:36 PM br.gov.caixa.framework.log.Log4Java error
2026-11-17T17:28:36.1726035Z GRAVE: Erro ao fechar PreparedStatement do SIRIC: 
2026-11-17T17:28:36.1726231Z nov. 17, 2026 2:28:36 PM br.gov.caixa.framework.log.Log4Java error
2026-11-17T17:28:36.1726389Z GRAVE: falha ao fechar
2026-11-17T17:28:36.1726569Z nov. 17, 2026 2:28:36 PM br.gov.caixa.framework.log.Log4Java error
2026-11-17T17:28:36.1726796Z GRAVE: Erro ao fechar conexao com o SIRIC: 
2026-11-17T17:28:36.1727023Z nov. 17, 2026 2:28:36 PM br.gov.caixa.framework.log.Log4Java error
2026-11-17T17:28:36.1727219Z GRAVE: falha ao fechar
2026-11-17T17:28:36.2346297Z nov. 17, 2026 2:28:36 PM br.gov.caixa.framework.log.Log4Java error
2026-11-17T17:28:36.2346510Z GRAVE: Erro de SQL: jdbc/SybaseSiempDS
2026-11-17T17:28:36.2516848Z [INFO] Tests run: 26, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.078 s -- in br.gov.caixa.siemp.apresentacao.evolucao.estornarpagamento.EstornarPagamentoACTTest
2026-11-17T17:28:36.2517289Z [INFO] Running br.gov.caixa.siemp.creditorural.extrato.ExtratoCreditoRuralActionTest
2026-11-17T17:28:36.2529612Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 s -- in br.gov.caixa.siemp.creditorural.extrato.ExtratoCreditoRuralActionTest
2026-11-17T17:28:36.2529882Z [INFO] Running br.gov.caixa.siemp.creditorural.bndes.CobrancaBNDESActionTest
2026-11-17T17:28:36.2595028Z [INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.005 s -- in br.gov.caixa.siemp.creditorural.bndes.CobrancaBNDESActionTest
2026-11-17T17:28:36.2595427Z [INFO] Running br.gov.caixa.siemp.consultas.ConfiguracaoJstlValidatorTest
2026-11-17T17:28:36.3363264Z [INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.075 s -- in br.gov.caixa.siemp.consultas.ConfiguracaoJstlValidatorTest
2026-11-17T17:28:36.3363805Z [INFO] Running br.gov.caixa.siemp.consultas.ConveniosActionsTest
2026-11-17T17:28:36.3617916Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.024 s -- in br.gov.caixa.siemp.consultas.ConveniosActionsTest
2026-11-17T17:28:36.3618214Z [INFO] Running br.gov.caixa.siemp.consultas.ConsultasContratoTest
2026-11-17T17:28:36.6762294Z [WARNING] Tests run: 180, Failures: 0, Errors: 0, Skipped: 13, Time elapsed: 0.309 s -- in br.gov.caixa.siemp.consultas.ConsultasContratoTest
2026-11-17T17:28:36.6762635Z [INFO] Running teste.br.gov.caixa.siemp.comum.apresentacao.testeerromultiplo.TesteErroMultiploActionTest
2026-11-17T17:28:36.6779634Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 s -- in teste.br.gov.caixa.siemp.comum.apresentacao.testeerromultiplo.TesteErroMultiploActionTest
2026-11-17T17:28:36.7210165Z [INFO] 
2026-11-17T17:28:36.7210462Z [INFO] Results:
2026-11-17T17:28:36.7210601Z [INFO] 
2026-11-17T17:28:36.7210696Z [ERROR] Errors: 
2026-11-17T17:28:36.7211337Z [ERROR]   ExportacaoPdfTest.deveGerarPdfLegivelComCabecalhoDetalhesEPaginacao:104 » JRFontNotFound Font 'Arial' is not available to the JVM. See the Javadoc for more details.
2026-11-17T17:28:36.7211747Z [ERROR]   ExportacaoPdfTest.deveGerarPdfLegivelComCabecalhoDetalhesEPaginacao:104 » JRFontNotFound Font 'Arial' is not available to the JVM. See the Javadoc for more details.
2026-11-17T17:28:36.7212461Z [ERROR]   ExportacaoPdfTest.deveGerarPdfLegivelComCabecalhoDetalhesEPaginacao:104 » JRFontNotFound Font 'Arial' is not available to the JVM. See the Javadoc for more details.
2026-11-17T17:28:36.7212997Z [ERROR]   ExportacaoPdfTest.deveGerarPdfLegivelComCabecalhoDetalhesEPaginacao:104 » JRFontNotFound Font 'Arial Black' is not available to the JVM. See the Javadoc for more details.
2026-11-17T17:28:36.7213509Z [ERROR]   ExportacaoPdfTest.deveGerarPdfLegivelComCabecalhoDetalhesEPaginacao:104 » JRFontNotFound Font 'Arial Black' is not available to the JVM. See the Javadoc for more details.
2026-11-17T17:28:36.7213907Z [ERROR]   ExportacaoPdfTest.deveGerarPdfLegivelComCabecalhoDetalhesEPaginacao:104 » JRFontNotFound Font 'Arial Black' is not available to the JVM. See the Javadoc for more details.
2026-11-17T17:28:36.7214423Z [ERROR]   ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual:67 » JR Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/consultarParametrosDoConvenio_1794936515260_794197.java 
2026-11-17T17:28:36.7215017Z [ERROR]   ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual:67 » JR Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/consultarParametrosDoConvenioReport_1794936515325_590539.java 
2026-11-17T17:28:36.7215570Z [ERROR]   ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual:67 » JR Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/consultarTabelaDeTACDoConvenio_1794936515386_9133.java 
2026-11-17T17:28:36.7216022Z [ERROR]   ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual:67 » JR Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/consultarTabelaDeTACDoConvenioNovo_1794936515427_418669.java 
2026-11-17T17:28:36.7216521Z [ERROR]   ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual:67 » JR Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/consultarTabelaDeTACDoConvenioSubReport_1794936515460_100517.java 
2026-11-17T17:28:36.7217044Z [ERROR]   ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual:67 » JR Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/consultarTabelaDeTaxasDoConvenio_1794936515490_661435.java 
2026-11-17T17:28:36.7217512Z [ERROR]   ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual:67 » JR Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/consultarTabelaDeTaxasDoConvenioNovo_1794936515526_633703.java 
2026-11-17T17:28:36.7217985Z [ERROR]   ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual:67 » JR Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/consultarTabelaDeTaxasDoConvenioSubReport_1794936515552_746983.java 
2026-11-17T17:28:36.7218436Z [ERROR]   ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual:67 » JR Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/relatorioExtratoCreditoRural_1794936515595_12209.java 
2026-11-17T17:28:36.7218888Z [ERROR]   ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual:67 » JR Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/subRelatorioExtrato_1794936515609_45998.java 
2026-11-17T17:28:36.7219378Z [ERROR]   ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual:67 » JR Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/subRelatorioLiberacoes_1794936515621_50094.java 
2026-11-17T17:28:36.7219823Z [ERROR]   ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual:67 » JR Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/subRelatorioOcorrencias_1794936515631_767888.java 
2026-11-17T17:28:36.7220305Z [ERROR]   ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual:67 » JR Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/subRelatorioPosicaoDivida_1794936515644_907065.java 
2026-11-17T17:28:36.7220952Z [ERROR]   ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual:67 » JR Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/subRelatorioProAgro_1794936515657_438907.java 
2026-11-17T17:28:36.7221384Z [ERROR]   ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual:67 » JR Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/subRelatorioReembolsos_1794936515667_616578.java 
2026-11-17T17:28:36.7221860Z [ERROR]   ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual:67 » JR Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/subRelatorioReembolsosVencidos_1794936515680_42125.java 
2026-11-17T17:28:36.7222378Z [ERROR]   ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual:67 » JR Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/relatorioEvolucaoDivida_1794936515729_731394.java 
2026-11-17T17:28:36.7222819Z [ERROR]   ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual:67 » JR Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/subRelatorioEvolucaoDivida_1794936515747_806561.java 
2026-11-17T17:28:36.7223255Z [ERROR]   ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual:67 » JR Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/subRelatorioEvolucaoDivida_1794936515762_489013.java 
2026-11-17T17:28:36.7223914Z [ERROR]   ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual:67 » JR Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/subRelatorioEvolucaoDivida_1794936515777_482107.java 
2026-11-17T17:28:36.7224385Z [ERROR]   ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual:67 » JR Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/relatorioEvolucaoDividaSeguradora_1794936515809_270290.java 
2026-11-17T17:28:36.7225035Z [ERROR]   ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual:67 » JR Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/subRelatorioEvolucaoDividaSeguradora_1794936515820_279095.java 
2026-11-17T17:28:36.7225578Z [ERROR]   ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual:67 » JR Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/relatorioPosicaoDivida_1794936515849_696047.java 
2026-11-17T17:28:36.7226012Z [ERROR]   ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual:67 » JR Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/relatorioPosicaoDividaSeguradora_1794936515879_878195.java 
2026-11-17T17:28:36.7226450Z [ERROR]   ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual:67 » JR Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/relatorioEvolucaoDividaNCE_1794936515899_695879.java 
2026-11-17T17:28:36.7226918Z [ERROR]   ModelosJasperTest.fonteJrxmlDeveCompilarComBibliotecaAtual:67 » JR Error compiling report java source files : /opt/ads-agent/_work/21/s/siemp-web/simularPrestacoes_1794936515915_18490.java 
2026-11-17T17:28:36.7227259Z [INFO] 
2026-11-17T17:28:36.7227500Z [ERROR] Tests run: 403, Failures: 0, Errors: 32, Skipped: 13
2026-11-17T17:28:36.7227728Z [INFO] 
2026-11-17T17:28:36.7231177Z [INFO] ------------------------------------------------------------------------
2026-11-17T17:28:36.7231375Z [INFO] Reactor Summary for siemp application 14.37.0.6:
2026-11-17T17:28:36.7231543Z [INFO] 
2026-11-17T17:28:36.7234882Z [INFO] siemp application .................................. SUCCESS [  0.077 s]
2026-11-17T17:28:36.7235985Z [INFO] SIEMP Web module ................................... FAILURE [ 16.198 s]
2026-11-17T17:28:36.7236189Z [INFO] SIEMP EAR module ................................... SKIPPED
2026-11-17T17:28:36.7236461Z [INFO] ------------------------------------------------------------------------
2026-11-17T17:28:36.7236620Z [INFO] BUILD FAILURE
2026-11-17T17:28:36.7236815Z [INFO] ------------------------------------------------------------------------
2026-11-17T17:28:36.7237155Z [INFO] Total time:  16.474 s
2026-11-17T17:28:36.7241267Z [INFO] Finished at: 2026-11-17T14:28:36-03:00
2026-11-17T17:28:36.7241539Z [INFO] ------------------------------------------------------------------------
2026-11-17T17:28:36.7249492Z [ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:3.2.5:test (default-test) on project siemp-web: 
2026-11-17T17:28:36.7250045Z [ERROR] 
2026-11-17T17:28:36.7250306Z [ERROR] Please refer to /opt/ads-agent/_work/21/s/siemp-web/target/surefire-reports for the individual test results.
2026-11-17T17:28:36.7250595Z [ERROR] Please refer to dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
2026-11-17T17:28:36.7250854Z [ERROR] -> [Help 1]
2026-11-17T17:28:36.7250978Z [ERROR] 
2026-11-17T17:28:36.7251243Z [ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
2026-11-17T17:28:36.7251517Z [ERROR] Re-run Maven using the -X switch to enable full debug logging.
2026-11-17T17:28:36.7251673Z [ERROR] 
2026-11-17T17:28:36.7251857Z [ERROR] For more information about the errors and possible solutions, please read the following articles:
2026-11-17T17:28:36.7252056Z [ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
2026-11-17T17:28:36.7252209Z [ERROR] 
2026-11-17T17:28:36.7252370Z [ERROR] After correcting the problems, you can resume the build with the command
2026-11-17T17:28:36.7252616Z [ERROR]   mvn <args> -rf :siemp-web
2026-11-17T17:28:36.8240388Z The process '/opt/apache-maven/apache-maven-3.8.5/bin/mvn' failed with exit code 1
2026-11-17T17:28:36.8240708Z Could not retrieve code analysis results - Maven run failed.
2026-11-17T17:28:36.8243907Z ##[error]Build failed.
2026-11-17T17:28:36.8315902Z ##[section]Finishing: Maven



ele quebra no maven
