
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$ grep -c "urn:jboss:domain:keycloak" /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
1
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$
[p585600@caddeapllx2871 ~]$ grep -n "application-security-domain" /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
414:            <application-security-domains>
415:                <application-security-domain name="other" security-domain="ApplicationDomain"/>
416:                <application-security-domain name="jaas-sifec-local" security-domain="ApplicationDomain"/>
417:                <application-security-domain name="jaas-sigtc-local" security-domain="ApplicationDomain"/>
418:                <application-security-domain name="other2" security-domain="ApplicationDomain"/>
419:                <application-security-domain name="jaas-sigec" security-domain="jaas-sigec"/>
420:                <application-security-domain name="jaas-sifec" security-domain="jaas-sifec"/>
421:                <application-security-domain name="jaas-sinad" security-domain="jaas-sinad"/>
422:                <application-security-domain name="jaas-siric" security-domain="jaas-siric"/>
423:            </application-security-domains>
919:            <application-security-domains>
920:                <application-security-domain name="other" http-authentication-factory="keycloak-http-authentication"/>
921:                <application-security-domain name="keycloak" http-authentication-factory="keycloak-http-authentication"/>
922:                <application-security-domain name="jaas-sifec-local" security-domain="ApplicationDomain"/>
923:                <application-security-domain name="jaas-sigtc-local" security-domain="ApplicationDomain"/>
924:                <application-security-domain name="other2" security-domain="ApplicationDomain"/>
925:                <application-security-domain name="jaas-sigec" security-domain="jaas-sigec"/>
926:                <application-security-domain name="jaas-sifec" security-domain="jaas-sifec"/>
927:                <application-security-domain name="jaas-sinad" security-domain="jaas-sinad"/>
928:                <application-security-domain name="jaas-siric" security-domain="jaas-siric"/>
929:            </application-security-domains>
[p585600@caddeapllx2871 ~]$

