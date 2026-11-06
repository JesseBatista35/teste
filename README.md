
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ LOG=/opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ LOG=/opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log
[p585600@cbrdeapllx473 ~]$ sudo grep -nE "^12:0[0-1]:" $LOG | grep -iE "ERROR|Exception|Caused by|sicdt" | head -40

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

[sudo] password for p585600:
56896:12:00:03,176 WARN  [org.keycloak.adapters.KeycloakDeployment] (default task-37) Failed to load URLs from https://login.des.caixa/auth/realms/intranet/.well-known/openid-configuration: javax.net.ssl.SSLHandshakeException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
56999:12:00:03,182 WARN  [org.keycloak.adapters.KeycloakDeployment] (default task-37) Failed to load URLs from https://login.des.caixa/auth/realms/intranet/.well-known/openid-configuration: javax.net.ssl.SSLHandshakeException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
57105:12:00:03,185 ERROR [io.undertow.request] (default task-37) UT005023: Exception handling request to /sicdt-orig-api-rest/sicdt/v2/contrato/liberacao/consultar/99178267365/3194: java.lang.NullPointerException
[p585600@cbrdeapllx473 ~]$ sudo sed -n 'NUM,+40p' $LOG | grep -vi "authorization"
sed: -e expression #1, char 2: extra characters after command
[p585600@cbrdeapllx473 ~]$
