
-sh-4.1$
-sh-4.1$ sudo grep -n -iE 'hub-api|HUB-BACKEND' /opt/jboss/jboss-eap/dc/configuration/domain.xml
[sudo] password for p585600:
20570:                <secure-deployment name="hub-api.war">
22214:                <secure-deployment name="hub-api.war">
23860:                <secure-deployment name="hub-api.war">
25510:                <secure-deployment name="hub-api.war">
27154:                <secure-deployment name="hub-api.war">
28620:                <secure-deployment name="hub-api.war">
52756:                <secure-deployment name="hub-api.war">
56810:        <deployment name="SICCR-HUB-BACKEND3" runtime-name="hub-api-1.18.0-b744.ear">
56813:        <deployment name="SICCR-HUB-BACKEND4" runtime-name="hub-api-1.18.0-b745.ear">
56888:        <deployment name="SICCR-HUB-BACKEND5" runtime-name="hub-api-2.2.0-b807.ear">
56954:        <deployment name="SICCR-HUB-BACKEND2" runtime-name="hub-api-2.2.0-b809.ear">
58082:                <deployment name="SICCR-HUB-BACKEND2" runtime-name="hub-api-2.2.0-b809.ear"/>
58381:                <deployment name="SICCR-HUB-BACKEND3" runtime-name="hub-api-1.18.0-b744.ear"/>
58684:                <deployment name="SICCR-HUB-BACKEND4" runtime-name="hub-api-1.18.0-b745.ear"/>
58988:                <deployment name="SICCR-HUB-BACKEND5" runtime-name="hub-api-2.2.0-b807.ear"/>
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ sudo grep -niE 'hub' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -viE 'deployment name' | head -40
57884:                <property name="SICCR_HUB_WS_SERPRO_PROTOCOLO" value="https"/>
57885:                <property name="SICCR_HUB_WS_SERPRO_HOST" value="hom5.siapenet.gov.br"/>
57886:                <property name="SICCR_HUB_WS_SERPRO_URL_BASE" value="/wssiapeconsig"/>
57887:                <property name="SICCR_HUB_WS_SERPRO_CD_CONSIGNATARIA" value="104"/>
57888:                <property name="SICCR_HUB_WS_SERPRO_CD_PASSWORD_CONSIGNATARIA" value="UB15W3NUCO"/>
57889:                <property name="SICCR_HUB_WS_DB1_PROTOCOLO" value="https"/>
57890:                <property name="SICCR_HUB_WS_DB1_HOST" value="www1.consignet.com.br"/>
57891:                <property name="SICCR_HUB_WS_DB1_PORTA" value="8585"/>
57892:                <property name="SICCR_HUB_WS_DB1_URL_BASE" value="/DB1ConsignetWebService"/>
57893:                <property name="SICCR_HUB_WS_DB1_USUARIO" value="TESTE_INTEGRADO@CAIXA"/>
57894:                <property name="SICCR_HUB_WS_DB1_PASSWORD" value="46e25a8be134eee544fcc68c9ddbf10f"/>
58214:                <property name="SICCR_HUB_WS_SERPRO_PROTOCOLO" value="https"/>
58215:                <property name="SICCR_HUB_WS_SERPRO_HOST" value="10.195.192.1"/>
58216:                <property name="SICCR_HUB_WS_SERPRO_URL_BASE" value="/wssiapeconsig"/>
58217:                <property name="SICCR_HUB_WS_SERPRO_CD_CONSIGNATARIA" value="104"/>
58218:                <property name="SICCR_HUB_WS_SERPRO_CD_PASSWORD_CONSIGNATARIA" value="UB15W3NUCO"/>
58219:                <property name="SICCR_HUB_WS_DB1_PROTOCOLO" value="https"/>
58220:                <property name="SICCR_HUB_WS_DB1_HOST" value="www1.consignet.com.br"/>
58221:                <property name="SICCR_HUB_WS_DB1_PORTA" value="8585"/>
58222:                <property name="SICCR_HUB_WS_DB1_URL_BASE" value="/DB1ConsignetWebService"/>
58223:                <property name="SICCR_HUB_WS_DB1_USUARIO" value="TESTE_INTEGRADO@CAIXA"/>
58224:                <property name="SICCR_HUB_WS_DB1_PASSWORD" value="46e25a8be134eee544fcc68c9ddbf10f"/>
58517:                <property name="SICCR_HUB_WS_SERPRO_PROTOCOLO" value="https"/>
58518:                <property name="SICCR_HUB_WS_SERPRO_HOST" value="10.195.192.1"/>
58519:                <property name="SICCR_HUB_WS_SERPRO_URL_BASE" value="/wssiapeconsig"/>
58520:                <property name="SICCR_HUB_WS_SERPRO_CD_CONSIGNATARIA" value="104"/>
58521:                <property name="SICCR_HUB_WS_SERPRO_CD_PASSWORD_CONSIGNATARIA" value="UB15W3NUCO"/>
58522:                <property name="SICCR_HUB_WS_DB1_PROTOCOLO" value="https"/>
58523:                <property name="SICCR_HUB_WS_DB1_HOST" value="www1.consignet.com.br"/>
58524:                <property name="SICCR_HUB_WS_DB1_PORTA" value="8585"/>
58525:                <property name="SICCR_HUB_WS_DB1_URL_BASE" value="/DB1ConsignetWebService"/>
58526:                <property name="SICCR_HUB_WS_DB1_USUARIO" value="TESTE_INTEGRADO@CAIXA"/>
58527:                <property name="SICCR_HUB_WS_DB1_PASSWORD" value="46e25a8be134eee544fcc68c9ddbf10f"/>
58822:                <property name="SICCR_HUB_WS_SERPRO_PROTOCOLO" value="https"/>
58823:                <property name="SICCR_HUB_WS_SERPRO_HOST" value="10.195.192.1"/>
58824:                <property name="SICCR_HUB_WS_SERPRO_URL_BASE" value="/wssiapeconsig"/>
58825:                <property name="SICCR_HUB_WS_SERPRO_CD_CONSIGNATARIA" value="104"/>
58826:                <property name="SICCR_HUB_WS_SERPRO_CD_PASSWORD_CONSIGNATARIA" value="UB15W3NUCO"/>
58827:                <property name="SICCR_HUB_WS_DB1_PROTOCOLO" value="https"/>
58828:                <property name="SICCR_HUB_WS_DB1_HOST" value="www1.consignet.com.br"/>
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$



[p585600@cbrdeapllx471 ~]$
[p585600@cbrdeapllx471 ~]$
[p585600@cbrdeapllx471 ~]$ grep -n -iE 'hub-api|HUB-BACKEND' /opt/jboss/jboss-eap/dc/configuration/domain.xml
1592:                <secure-deployment name="hub-api.war">
4204:        <deployment name="SICCR-HUB-BACKEND3" runtime-name="hub-api-1.18.0-b744.ear">
4207:        <deployment name="SICCR-HUB-BACKEND4" runtime-name="hub-api-1.18.0-b745.ear">
4279:        <deployment name="SICCR-HUB-BACKEND5" runtime-name="hub-api-2.2.0-b807.ear">
4396:        <deployment name="SICCR-HUB-BACKEND2" runtime-name="hub-api-2.2.0-b809.ear">
[p585600@cbrdeapllx471 ~]$
[p585600@cbrdeapllx471 ~]$
[p585600@cbrdeapllx471 ~]$
[p585600@cbrdeapllx471 ~]$

