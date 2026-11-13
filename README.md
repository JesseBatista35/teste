Próximo: CCR, o 401 do Edson

Rode um comando por vez:

1. Na 473:

sudo grep -nE "AdapterTokenVerifier|Failed to verify token|publicKey|Token is not active|Invalid token|ccr-api" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | tail -15

2. Na 471 (root, fora do CLI):

grep -n -A15 'secure-deployment name="ccr-api' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -vi secret

3. No 6.4 (10.116.88.20):

sudo grep -n -A15 'secure-deployment name="ccr-api' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -vi secret | head -40




Last login: Thu Nov 12 15:38:36 2026 from 10.122.150.31
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ sudo grep -n -A15 'secure-deployment name="ccr-api' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -vi secret | head -40
[sudo] password for p585600:
20560:                <secure-deployment name="ccr-api.war">
20561-                    <realm>internet</realm>
20562-                    <resource>cli-ser-fec_api</resource>
20563-                    <bearer-only>true</bearer-only>
20564-                </secure-deployment>
20565-                <secure-deployment name="pen-api.war">
20566-                    <realm>intranet</realm>
20567-                    <resource>cli-ser-fec_api</resource>
20568-                    <bearer-only>true</bearer-only>
20569-                </secure-deployment>
20570-                <secure-deployment name="hub-api.war">
20571-                    <realm>intranet</realm>
20572-                    <resource>cli-ser-fec_api</resource>
20573-                    <bearer-only>true</bearer-only>
20574-                    <auth-server-url>https://login.des.caixa/auth</auth-server-url>
20575-                </secure-deployment>
--
22204:                <secure-deployment name="ccr-api.war">
22205-                    <realm>internet</realm>
22206-                    <resource>cli-ser-fec_api</resource>
22207-                    <bearer-only>true</bearer-only>
22208-                </secure-deployment>
22209-                <secure-deployment name="pen-api.war">
22210-                    <realm>intranet</realm>
22211-                    <resource>cli-ser-fec_api</resource>
22212-                    <bearer-only>true</bearer-only>
22213-                </secure-deployment>
22214-                <secure-deployment name="hub-api.war">
22215-                    <realm>intranet</realm>
22216-                    <resource>cli-ser-fec_api</resource>
22217-                    <bearer-only>true</bearer-only>
22218-                    <auth-server-url>https://login.des.caixa/auth</auth-server-url>
22219-                </secure-deployment>
--
23850:                <secure-deployment name="ccr-api.war">
23851-                    <realm>internet</realm>
23852-                    <resource>cli-ser-fec_api</resource>
23853-                    <bearer-only>true</bearer-only>
23854-                </secure-deployment>
23855-                <secure-deployment name="pen-api.war">
-sh-4.1$
-sh-4.1$
-sh-4.1$






[p585600@cbrdeapllx473 ~]$ sudo grep -nE "AdapterTokenVerifier|Failed to verify token|publicKey|Token is not active|Invalid token|ccr-api" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | tail -15

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

[sudo] password for p585600:
14823:13:39:30,747 ERROR [org.keycloak.adapters.rotation.AdapterTokenVerifier] (default task-49) Didn't find publicKey for kid: MFeJ65_D-xqNy3VmkMHoMVKScfP7KmYk7mV0IhK-kAw
14824:13:41:35,536 ERROR [org.keycloak.adapters.rotation.AdapterTokenVerifier] (default task-49) Didn't find publicKey for kid: MFeJ65_D-xqNy3VmkMHoMVKScfP7KmYk7mV0IhK-kAw
14825:13:41:42,510 ERROR [org.keycloak.adapters.rotation.AdapterTokenVerifier] (default task-49) Didn't find publicKey for kid: MFeJ65_D-xqNy3VmkMHoMVKScfP7KmYk7mV0IhK-kAw
14826:13:45:39,283 ERROR [org.keycloak.adapters.rotation.AdapterTokenVerifier] (default task-49) Didn't find publicKey for kid: MFeJ65_D-xqNy3VmkMHoMVKScfP7KmYk7mV0IhK-kAw
14827:13:45:56,147 ERROR [org.keycloak.adapters.rotation.AdapterTokenVerifier] (default task-49) Didn't find publicKey for kid: MFeJ65_D-xqNy3VmkMHoMVKScfP7KmYk7mV0IhK-kAw
14828:13:50:46,288 ERROR [org.keycloak.adapters.rotation.AdapterTokenVerifier] (default task-49) Didn't find publicKey for kid: MFeJ65_D-xqNy3VmkMHoMVKScfP7KmYk7mV0IhK-kAw
14829:13:54:13,831 ERROR [org.keycloak.adapters.rotation.AdapterTokenVerifier] (default task-49) Didn't find publicKey for kid: MFeJ65_D-xqNy3VmkMHoMVKScfP7KmYk7mV0IhK-kAw
14830:13:57:16,894 ERROR [org.keycloak.adapters.rotation.AdapterTokenVerifier] (default task-49) Didn't find publicKey for kid: MFeJ65_D-xqNy3VmkMHoMVKScfP7KmYk7mV0IhK-kAw
14831:14:02:52,759 ERROR [org.keycloak.adapters.rotation.AdapterTokenVerifier] (default task-49) Didn't find publicKey for kid: MFeJ65_D-xqNy3VmkMHoMVKScfP7KmYk7mV0IhK-kAw
14832:14:03:31,917 ERROR [org.keycloak.adapters.rotation.AdapterTokenVerifier] (default task-49) Didn't find publicKey for kid: MFeJ65_D-xqNy3VmkMHoMVKScfP7KmYk7mV0IhK-kAw
14833:14:05:45,430 ERROR [org.keycloak.adapters.rotation.AdapterTokenVerifier] (default task-49) Didn't find publicKey for kid: MFeJ65_D-xqNy3VmkMHoMVKScfP7KmYk7mV0IhK-kAw
14834:14:06:03,491 ERROR [org.keycloak.adapters.rotation.AdapterTokenVerifier] (default task-49) Didn't find publicKey for kid: MFeJ65_D-xqNy3VmkMHoMVKScfP7KmYk7mV0IhK-kAw
14835:14:14:15,489 ERROR [org.keycloak.adapters.rotation.AdapterTokenVerifier] (default task-49) Didn't find publicKey for kid: MFeJ65_D-xqNy3VmkMHoMVKScfP7KmYk7mV0IhK-kAw
18435:14:20:16,346 ERROR [org.keycloak.adapters.rotation.AdapterTokenVerifier] (default task-49) Didn't find publicKey for kid: MFeJ65_D-xqNy3VmkMHoMVKScfP7KmYk7mV0IhK-kAw
18436:14:23:11,864 ERROR [org.keycloak.adapters.rotation.AdapterTokenVerifier] (default task-49) Didn't find publicKey for kid: MFeJ65_D-xqNy3VmkMHoMVKScfP7KmYk7mV0IhK-kAw
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$




[domain@localhost:9999 /] exit
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]# grep -n -A15 'secure-deployment name="ccr-api' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -vi secret
1582:                <secure-deployment name="ccr-api.war">
1583-                    <realm>internet</realm>
1584-                    <resource>cli-ser-fec_api</resource>
1585-                    <bearer-only>true</bearer-only>
1586-                </secure-deployment>
1587-                <secure-deployment name="pen-api.war">
1588-                    <realm>intranet</realm>
1589-                    <resource>cli-ser-fec_api</resource>
1590-                    <bearer-only>true</bearer-only>
1591-                </secure-deployment>
1592-                <secure-deployment name="hub-api.war">
1593-                    <realm>intranet</realm>
1594-                    <resource>cli-ser-fec_api</resource>
1595-                    <bearer-only>true</bearer-only>
1596-                    <auth-server-url>https://login.des.caixa/auth</auth-server-url>
1597-                </secure-deployment>
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#



