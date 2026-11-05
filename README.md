sh-4.1$
-sh-4.1$ ^C
-sh-4.1$ grep -A8 'OracleSiccrDS"' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -E "jndi-name|connection-url|user-name|<profile"
                    <datasource jta="true" jndi-name="java:/jdbc/OracleSiccrDS" pool-name="jdbc/OracleSiccrDS" enabled="true" use-ccm="true">
                        <connection-url>jdbc:oracle:thin:@oracle-nprd-1000.caixa:1521/prim_D01NGSRV</connection-url>
                    <datasource jta="true" jndi-name="java:/jdbc/OracleSiccrDS" pool-name="jdbc/OracleSiccrDS" enabled="true" use-ccm="true">
                        <connection-url>jdbc:oracle:thin:@oracle-nprd-1000.caixa:1521/prim_D01NGSRV</connection-url>
                    <datasource jta="true" jndi-name="java:/jdbc/OracleSiccrDS" pool-name="jdbc/OracleSiccrDS" enabled="true" use-ccm="true">
                        <connection-url>jdbc:oracle:thin:@oracle-nprd-1000.caixa:1521/prim_D01NGSRV</connection-url>
                    <datasource jta="true" jndi-name="java:/jdbc/OracleSiccrDS" pool-name="jdbc/OracleSiccrDS" enabled="true" use-ccm="true">
                        <connection-url>jdbc:oracle:thin:@oracle-nprd-1000.caixa:1521/prim_D01NGSRV</connection-url>
                    <datasource jta="true" jndi-name="java:/jdbc/OracleSiccrDS" pool-name="jdbc/OracleSiccrDS" enabled="true" use-ccm="true">
                        <connection-url>jdbc:oracle:thin:@oracle-nprd-1000.caixa:1521/prim_D01NGSRV</connection-url>
                    <datasource jta="true" jndi-name="java:/jdbc/OracleSiccrDS" pool-name="jdbc/OracleSiccrDS" enabled="true" use-ccm="true">
                        <connection-url>jdbc:oracle:thin:@oracle-nprd-1000.caixa:1521/prim_D01NGSRV</connection-url>
                    <datasource jta="true" jndi-name="java:/jdbc/OracleSiccrDS" pool-name="jdbc/OracleSiccrDS" enabled="true" use-ccm="true">
                        <connection-url>jdbc:oracle:thin:@oracle-nprd-1000.caixa:1521/prim_D01NGSRV</connection-url>
                    <datasource jta="true" jndi-name="java:/jdbc/OracleSiccrDS" pool-name="jdbc/OracleSiccrDS" enabled="true" use-ccm="true">
                        <connection-url>jdbc:oracle:thin:@oracle-nprd-1000.caixa:1521/prim_D01NGSRV</connection-url>
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ grep -nE '<profile name=|<server-group name=' /opt/jboss/jboss-eap/dc/configuration/domain.xml
84:        <profile name="default">
302:        <profile name="ha">
598:        <profile name="full">
923:        <profile name="full-ha">
1348:        <profile name="full-ha-siefi">
1758:        <profile name="full-ha-simph">
2129:        <profile name="full-ha-sigch">
2512:        <profile name="full-ha-sitah-mcmv">
2886:        <profile name="full-ha-sipmc-internet">
3363:        <profile name="full-ha-sipmc-intranet">
3841:        <profile name="full-ha-sisdu">
4220:        <profile name="full-ha-siwic">
4571:        <profile name="full-ha-siotp">
5019:        <profile name="full-ha-sisrs">
5427:        <profile name="full-ha-sifes-intranet">
5960:        <profile name="full-ha-sifes-intranet2">
6519:        <profile name="full-ha-sifes-intranet3">
7068:        <profile name="full-ha-sifes-intranet4">
7617:        <profile name="full-ha-sipge">
7963:        <profile name="full-ha-sifes-internet">
8503:        <profile name="full-ha-siric">
8945:        <profile name="full-ha-siatd">
9359:        <profile name="full-ha-sipes">
9780:        <profile name="full-ha-siopi-batch">
10939:        <profile name="full-ha-sigrr">
11383:        <profile name="full-ha-sipen">
11765:        <profile name="full-ha-sigdr">
12250:        <profile name="full-ha-sicve">
12698:        <profile name="full-ha-sicve-internet">
13129:        <profile name="full-ha-siouv">
13597:        <profile name="full-ha-sicdu-cliente-intranet">
14057:        <profile name="full-ha-sicdu-convenio-internet">
14443:        <profile name="full-ha-sirta">
14980:        <profile name="full-ha-sirta2">
15517:        <profile name="full-ha-sirta3">
16054:        <profile name="full-ha-sirta4">
16599:        <profile name="full-ha-sirta5">
17136:        <profile name="full-ha-sievj">
17560:        <profile name="full-ha-siexc">
18058:        <profile name="full-ha-sisfw">
18437:        <profile name="full-ha-siprc">
18837:        <profile name="full-ha-sifec-intranet">
20596:        <profile name="full-ha-sifec-intranet2">
22240:        <profile name="full-ha-sifec-intranet3">
23886:        <profile name="full-ha-sifec-intranet4">
25536:        <profile name="full-ha-sifec-intranet5">
27180:        <profile name="full-ha-sifec-batch">
28628:        <profile name="full-ha-sifec-internet">
29967:        <profile name="full-ha-siico">
30346:        <profile name="full-ha-sipag">
30685:        <profile name="full-ha-sipon">
31023:        <profile name="full-ha-sicli">
31556:        <profile name="full-ha-sisgd-intranet">
31934:        <profile name="full-ha-simcd">
32878:        <profile name="full-ha-sisgd-internet">
33251:        <profile name="full-ha-sictd-digitalizar-intranet">
33756:        <profile name="full-ha-sictd-intranet">
34278:        <profile name="full-ha-sinaf2-prd-legado">
34655:        <profile name="full-ha-sinafweb3-git">
35032:        <profile name="full-ha-sinaf-validador">
35390:        <profile name="full-ha-sigdp">
35819:        <profile name="full-ha-sicrs">
36171:        <profile name="full-ha-siaoi">
36890:        <profile name="full-ha-siarc">
37276:        <profile name="full-ha-siemp">
37717:        <profile name="full-ha-sipld">
38107:        <profile name="full-ha-sinch">
38540:        <profile name="full-ha-sigcr">
38934:        <profile name="full-ha-siaef">
39259:        <profile name="full-ha-siafc">
39596:        <profile name="full-ha-sigfi-ecr">
40037:        <profile name="full-ha-sigfi">
40375:        <profile name="full-ha-sigtc">
40957:        <profile name="full-ha-siccr">
41546:        <profile name="full-ha-sitah-mon">
41937:        <profile name="full-ha-siavl">
42348:        <profile name="full-ha-sisrh">
42670:        <profile name="full-ha-siapc">
43063:        <profile name="full-ha-siara">
43508:        <profile name="full-ha-sicdu-convenio-intranet">
43904:        <profile name="full-ha-sineb">
44471:        <profile name="full-ha-sinad">
44910:        <profile name="full-ha-sigct">
45278:        <profile name="full-ha-siopi-apps">
46461:        <profile name="full-ha-siecm-pre-des">
46816:        <profile name="full-ha-sicve-msw">
47247:        <profile name="full-ha-sigdf">
47612:        <profile name="full-ha-sicli-app">
48077:        <profile name="full-ha-siatd-analise-pauta">
48491:        <profile name="full-ha-sispe">
48873:        <profile name="full-ha-siatd-intranet">
49390:        <profile name="full-ha-siatd-internet">
49871:        <profile name="full-ha-siatd-pauta-intranet">
50280:        <profile name="full-ha-siatd-pauta-internet">
50688:        <profile name="full-ha-sicve-anexo">
51077:        <profile name="full-ha-sivep">
51482:        <profile name="full-ha-sifec-api">
52769:        <profile name="full-ha-sipld-teste">
53135:        <profile name="full-ha-sigec-comercial">
53640:        <profile name="full-ha-jklnctd-sictd-digitalizar-intranet">
54148:        <profile name="full-ha-apdctd-sictd-intranet">
54677:        <profile name="full-ha-sircl">
55111:        <profile name="full-ha-sictd-internet">
55499:        <profile name="full-ha-sicve-api">
55891:        <profile name="full-ha-sicem">
57056:        <server-group name="sigch" profile="full-ha-sigch">
57075:        <server-group name="sinaf2-prd-legado" profile="full-ha-sinaf2-prd-legado">
57094:        <server-group name="sinaf-validador" profile="full-ha-sinaf-validador">
57114:        <server-group name="sipmc-intranet" profile="full-ha-sipmc-intranet">
57166:        <server-group name="sipmc-internet" profile="full-ha-sipmc-internet">
57214:        <server-group name="sisdu" profile="full-ha-sisdu">
57238:        <server-group name="siwic" profile="full-ha-siwic">
57257:        <server-group name="siotp" profile="full-ha-siotp">
57269:        <server-group name="sisrs" profile="full-ha-sisrs">
57291:        <server-group name="siric" profile="full-ha-siric">
57309:        <server-group name="siatd" profile="full-ha-siatd">
57356:        <server-group name="sicve" profile="full-ha-sicve">
57457:        <server-group name="sicve-api" profile="full-ha-sicve-api">
57538:        <server-group name="siouv" profile="full-ha-siouv">
57584:        <server-group name="sicdu-cliente-intranet" profile="full-ha-sicdu-cliente-intranet">
57628:        <server-group name="sicdu-convenio-internet" profile="full-ha-sicdu-convenio-internet">
57664:        <server-group name="sicdu-convenio-intranet" profile="full-ha-sicdu-convenio-intranet">
57701:        <server-group name="sifec-intranet" profile="full-ha-sifec-intranet">
58040:        <server-group name="sifec-intranet2" profile="full-ha-sifec-intranet2">
58348:        <server-group name="sifec-intranet3" profile="full-ha-sifec-intranet3">
58651:        <server-group name="sifec-intranet4" profile="full-ha-sifec-intranet4">
58956:        <server-group name="sifec-intranet5" profile="full-ha-sifec-intranet5">
59253:        <server-group name="sifec-batch" profile="full-ha-sifec-batch">
59444:        <server-group name="sifec-internet" profile="full-ha-sifec-internet">
59609:        <server-group name="sipag" profile="full-ha-sipag">
59624:        <server-group name="siprc" profile="full-ha-siprc">
59650:        <server-group name="siico" profile="full-ha-siico">
59669:        <server-group name="sipon" profile="full-ha-sipon">
59680:        <server-group name="sicli" profile="full-ha-sicli">
59734:        <server-group name="sisgd-intranet" profile="full-ha-sisgd-intranet">
59755:        <server-group name="sisgd-internet" profile="full-ha-sisgd-internet">
59765:        <server-group name="sictd-digitalizar-intranet" profile="full-ha-sictd-digitalizar-intranet">
59853:        <server-group name="sictd-intranet" profile="full-ha-sictd-intranet">
59951:        <server-group name="sigdp" profile="full-ha-sigdp">
59962:        <server-group name="sicrs" profile="full-ha-sicrs">
59985:        <server-group name="siaoi" profile="full-ha-siaoi">
60010:        <server-group name="siemp" profile="full-ha-siemp">
60038:        <server-group name="sipld" profile="full-ha-sipld">
60078:        <server-group name="siefi" profile="full-ha-siefi">
60135:        <server-group name="sinch" profile="full-ha-sinch">
60157:        <server-group name="sifes-internet" profile="full-ha-sifes-internet">
60225:        <server-group name="sifes-intranet" profile="full-ha-sifes-intranet">
60294:        <server-group name="sifes-intranet2" profile="full-ha-sifes-intranet2">
60360:        <server-group name="sifes-intranet3" profile="full-ha-sifes-intranet3">
60426:        <server-group name="sifes-intranet4" profile="full-ha-sifes-intranet4">
60493:        <server-group name="sipge" profile="full-ha-sipge">
60500:        <server-group name="sigcr" profile="full-ha-sigcr">
60514:        <server-group name="siaef" profile="full-ha-siaef">
60528:        <server-group name="siafc" profile="full-ha-siafc">
60543:        <server-group name="sigfi" profile="full-ha-sigfi">
60557:        <server-group name="sigtc" profile="full-ha-sigtc">
60578:        <server-group name="sitah-mcmv" profile="full-ha-sitah-mcmv">
60594:        <server-group name="siccr" profile="full-ha-siccr">
60631:        <server-group name="siarc" profile="full-ha-siarc">
60679:        <server-group name="sitah-mon" profile="full-ha-sitah-mon">
60695:        <server-group name="sipes" profile="full-ha-sipes">
60712:        <server-group name="guia-sai" profile="full-ha">
60715:        <server-group name="siavl" profile="full-ha-siavl">
60722:        <server-group name="sigrr" profile="full-ha-sigrr">
60755:        <server-group name="sisrh" profile="full-ha-sisrh">
60762:        <server-group name="siapc" profile="full-ha-siapc">
60775:        <server-group name="siara" profile="full-ha-siara">
60805:        <server-group name="sipen" profile="full-ha-sipen">
60861:        <server-group name="teste_log" profile="full-ha">
60867:        <server-group name="sineb" profile="full-ha-sineb">
60915:        <server-group name="sigdr" profile="full-ha-sigdr">
60959:        <server-group name="sigct" profile="full-ha-sigct">
60975:        <server-group name="sinad" profile="full-ha-sinad">
60990:        <server-group name="siopi-apps" profile="full-ha-siopi-apps">
61201:        <server-group name="siopi-batch" profile="full-ha-siopi-batch">
61402:        <server-group name="sinaf" profile="full-ha-sinafweb3-git">
61445:        <server-group name="sicve-internet" profile="full-ha-sicve-internet">
61525:        <server-group name="simcd" profile="full-ha-simcd">
61532:        <server-group name="sirta" profile="full-ha-sirta">
61603:        <server-group name="sirta2" profile="full-ha-sirta2">
61671:        <server-group name="sirta3" profile="full-ha-sirta3">
61742:        <server-group name="sirta4" profile="full-ha-sirta4">
61813:        <server-group name="sirta5" profile="full-ha-sirta5">
61884:        <server-group name="sievj" profile="full-ha-sievj">
61896:        <server-group name="sigfi-ecr" profile="full-ha-sigfi-ecr">
61936:        <server-group name="siecm-pre-des" profile="full-ha-siecm-pre-des">
61976:        <server-group name="sicve-msw" profile="full-ha-sicve-msw">
62064:        <server-group name="siexc" profile="full-ha-siexc">
62090:        <server-group name="sisfw" profile="full-ha-sisfw">
62101:        <server-group name="sigdf" profile="full-ha-sigdf">
62112:        <server-group name="simph" profile="full-ha-simph">
62118:        <server-group name="sicli-app" profile="full-ha-sicli-app">
62179:        <server-group name="siatd-analise-pauta" profile="full-ha-siatd-analise-pauta">
62217:        <server-group name="sispe" profile="full-ha-sispe">
62224:        <server-group name="siatd-intranet" profile="full-ha-siatd-intranet">
62335:        <server-group name="siatd-internet" profile="full-ha-siatd-internet">
62431:        <server-group name="siatd-pauta-intranet" profile="full-ha-siatd-pauta-intranet">
62474:        <server-group name="siatd-pauta-internet" profile="full-ha-siatd-pauta-internet">
62515:        <server-group name="sicve-anexo" profile="full-ha-sicve-anexo">
62542:        <server-group name="sivep" profile="full-ha-sivep">
62569:        <server-group name="sifec-api" profile="full-ha-sifec-api">
62729:        <server-group name="sipld-teste" profile="full-ha-sipld-teste">
62768:        <server-group name="sigec-comercial" profile="full-ha-sigec-comercial">
62796:        <server-group name="jklnctd-sictd-digitalizar-intranet" profile="full-ha-jklnctd-sictd-digitalizar-intranet">
62884:        <server-group name="apdctd-sictd-intranet" profile="full-ha-apdctd-sictd-intranet">
62982:        <server-group name="sircl" profile="full-ha-sircl">
63036:        <server-group name="sictd-internet" profile="full-ha-sictd-internet">
63082:        <server-group name="sicem" profile="full-ha-sicem">
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ grep -A15 'secure-deployment name="workflow-credito-pj-web.war"' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -vi secret
                <secure-deployment name="workflow-credito-pj-web.war">
                    <realm>intranet</realm>
                    <resource>cli-web-fec</resource>
                </secure-deployment>
                <secure-deployment name="emp-api.war">
                    <realm>internet</realm>
                    <resource>cli-mob-fec</resource>
                </secure-deployment>
                <secure-deployment name="fec-api.war">
                    <realm>intranet</realm>
                    <resource>cli-web-fec</resource>
                </secure-deployment>
                <secure-deployment name="bdcaixa-web.war">
                    <realm>intranet</realm>
--
                <secure-deployment name="workflow-credito-pj-web.war">
                    <realm>intranet</realm>
                    <resource>cli-web-fec</resource>
                </secure-deployment>
                <secure-deployment name="emp-api.war">
                    <realm>internet</realm>
                    <resource>cli-mob-fec</resource>
                </secure-deployment>
                <secure-deployment name="fec-api.war">
                    <realm>intranet</realm>
                    <resource>cli-web-fec</resource>
                </secure-deployment>
                <secure-deployment name="bdcaixa-web.war">
                    <realm>intranet</realm>
--
                <secure-deployment name="workflow-credito-pj-web.war">
                    <realm>intranet</realm>
                    <resource>cli-web-fec</resource>
                </secure-deployment>
                <secure-deployment name="emp-api.war">
                    <realm>internet</realm>
                    <resource>cli-mob-fec</resource>
                </secure-deployment>
                <secure-deployment name="fec-api.war">
                    <realm>intranet</realm>
                    <resource>cli-web-fec</resource>
                </secure-deployment>
                <secure-deployment name="bdcaixa-web.war">
                    <realm>intranet</realm>
--
                <secure-deployment name="workflow-credito-pj-web.war">
                    <realm>intranet</realm>
                    <resource>cli-web-fec</resource>
                </secure-deployment>
                <secure-deployment name="emp-api.war">
                    <realm>internet</realm>
                    <resource>cli-mob-fec</resource>
                </secure-deployment>
                <secure-deployment name="fec-api.war">
                    <realm>intranet</realm>
                    <resource>cli-web-fec</resource>
                </secure-deployment>
                <secure-deployment name="bdcaixa-web.war">
                    <realm>intranet</realm>
--
                <secure-deployment name="workflow-credito-pj-web.war">
                    <realm>intranet</realm>
                    <resource>cli-web-fec</resource>
                </secure-deployment>
                <secure-deployment name="emp-api.war">
                    <realm>internet</realm>
                    <resource>cli-mob-fec</resource>
                </secure-deployment>
                <secure-deployment name="fec-api.war">
                    <realm>intranet</realm>
                    <resource>cli-web-fec</resource>
                </secure-deployment>
                <secure-deployment name="bdcaixa-web.war">
                    <realm>intranet</realm>
--
                <secure-deployment name="workflow-credito-pj-web.war">
                    <realm>intranet</realm>
                    <resource>cli-web-fec</resource>
                </secure-deployment>
                <secure-deployment name="emp-api.war">
                    <realm>internet</realm>
                    <resource>cli-mob-fec</resource>
                </secure-deployment>
                <secure-deployment name="fec-api.war">
                    <realm>intranet</realm>
                    <resource>cli-web-fec</resource>
                </secure-deployment>
                <secure-deployment name="bdcaixa-web.war">
                    <realm>intranet</realm>
--
                <secure-deployment name="workflow-credito-pj-web.war">
                    <realm>internet</realm>
                    <resource>cli-web-fec</resource>
                </secure-deployment>
                <secure-deployment name="emp-api.war">
                    <realm>internet</realm>
                    <resource>cli-mob-fec</resource>
                </secure-deployment>
                <secure-deployment name="fec-api.war">
                    <realm>internet</realm>
                    <resource>cli-web-fec</resource>
                </secure-deployment>
                <secure-deployment name="sifec-cdt-web.war">
                    <realm>intranet</realm>
-sh-4.1$
