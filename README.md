
[p585600@caddeapllx2577 ~]$ netstat -tlnp 2>/dev/null | grep 8009 ss -tlnp 2>/dev/null | grep 8009
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$ tail -100 /logs/httpd/*caixa-error.log
[Thu Jul 02 21:31:33.461677 2026] [ssl:info] [pid 28284:tid 28284] AH01914: Configuring server siarg-interno.esteiras.des.caixa:443 for SSL protocol
[Thu Jul 02 21:31:33.469527 2026] [ssl:info] [pid 28284:tid 28284] AH02568: Certificate and private key siarg-interno.esteiras.des.caixa:443:0 configured from /opt/jboss-eap/standalone/configuration/certificado/des/siarg-interno.esteiras.des.caixa_ACInternaIcptestes.crt and /opt/jboss-eap/standalone/configuration/certificado/des/siarg-interno.esteiras.des.caixa_ACInternaIcptestes.key
[Thu Jul 02 21:31:33.483565 2026] [ssl:info] [pid 28286:tid 28286] AH01914: Configuring server siarg-interno.esteiras.des.caixa:443 for SSL protocol
[Thu Jul 02 21:31:33.486069 2026] [ssl:info] [pid 28286:tid 28286] AH02568: Certificate and private key siarg-interno.esteiras.des.caixa:443:0 configured from /opt/jboss-eap/standalone/configuration/certificado/des/siarg-interno.esteiras.des.caixa_ACInternaIcptestes.crt and /opt/jboss-eap/standalone/configuration/certificado/des/siarg-interno.esteiras.des.caixa_ACInternaIcptestes.key
[Thu Jul 02 21:36:01.965560 2026] [ssl:info] [pid 28288:tid 28670] [client 10.116.201.44:60134] AH01964: Connection to child 1 established (server siarg-interno.esteiras.des.caixa:443)
[Thu Jul 02 21:36:20.105113 2026] [ssl:info] [pid 28288:tid 28678] [client 10.211.12.27:51269] AH01964: Connection to child 5 established (server siarg-interno.esteiras.des.caixa:443)
[Thu Jul 02 21:36:20.105721 2026] [ssl:info] [pid 28288:tid 28683] [client 10.211.12.27:60751] AH01964: Connection to child 7 established (server siarg-interno.esteiras.des.caixa:443)
[Thu Jul 02 21:36:20.114556 2026] [ssl:info] [pid 28288:tid 28683] [client 10.211.12.27:60751] AH02008: SSL library error 1 in handshake (server siarg-interno.esteiras.des.caixa:443)
[Thu Jul 02 21:36:20.114556 2026] [ssl:info] [pid 28288:tid 28678] [client 10.211.12.27:51269] AH02008: SSL library error 1 in handshake (server siarg-interno.esteiras.des.caixa:443)
[Thu Jul 02 21:36:20.114606 2026] [ssl:info] [pid 28288:tid 28683] SSL Library Error: error:14094416:SSL routines:ssl3_read_bytes:sslv3 alert certificate unknown (SSL alert number 46)
[Thu Jul 02 21:36:20.114607 2026] [ssl:info] [pid 28288:tid 28678] SSL Library Error: error:14094416:SSL routines:ssl3_read_bytes:sslv3 alert certificate unknown (SSL alert number 46)
[Thu Jul 02 21:36:20.114612 2026] [ssl:info] [pid 28288:tid 28683] [client 10.211.12.27:60751] AH01998: Connection closed to child 7 with abortive shutdown (server siarg-interno.esteiras.des.caixa:443)
[Thu Jul 02 21:36:20.114612 2026] [ssl:info] [pid 28288:tid 28678] [client 10.211.12.27:51269] AH01998: Connection closed to child 5 with abortive shutdown (server siarg-interno.esteiras.des.caixa:443)
[Thu Jul 02 21:36:20.122881 2026] [ssl:info] [pid 28288:tid 28672] [client 10.211.12.27:61194] AH01964: Connection to child 2 established (server siarg-interno.esteiras.des.caixa:443)
[Thu Jul 02 21:36:20.237370 2026] [ssl:info] [pid 28288:tid 28687] [client 10.211.12.27:53601] AH01964: Connection to child 11 established (server siarg-interno.esteiras.des.caixa:443)
[Thu Jul 02 21:36:20.244896 2026] [ssl:info] [pid 28288:tid 28687] [client 10.211.12.27:53601] AH02008: SSL library error 1 in handshake (server siarg-interno.esteiras.des.caixa:443)
[Thu Jul 02 21:36:20.244928 2026] [ssl:info] [pid 28288:tid 28687] SSL Library Error: error:14094416:SSL routines:ssl3_read_bytes:sslv3 alert certificate unknown (SSL alert number 46)
[Thu Jul 02 21:36:20.244932 2026] [ssl:info] [pid 28288:tid 28687] [client 10.211.12.27:53601] AH01998: Connection closed to child 11 with abortive shutdown (server siarg-interno.esteiras.des.caixa:443)
[Thu Jul 02 21:36:20.254645 2026] [ssl:info] [pid 28288:tid 28669] [client 10.211.12.27:63333] AH01964: Connection to child 0 established (server siarg-interno.esteiras.des.caixa:443)
[Thu Jul 02 22:37:02.544682 2026] [ssl:info] [pid 28288:tid 28693] [client 10.116.201.44:46064] AH01964: Connection to child 17 established (server siarg-interno.esteiras.des.caixa:443)
[Thu Jul 02 22:37:16.576928 2026] [ssl:info] [pid 28288:tid 28729] [client 10.116.201.44:54012] AH01964: Connection to child 43 established (server siarg-interno.esteiras.des.caixa:443)
[Thu Jul 02 22:39:53.921092 2026] [ssl:info] [pid 28288:tid 28686] [client 10.116.201.44:2254] AH01964: Connection to child 10 established (server siarg-interno.esteiras.des.caixa:443)
[Thu Jul 02 22:40:08.301795 2026] [ssl:info] [pid 28288:tid 28689] [client 10.116.201.44:56454] AH01964: Connection to child 13 established (server siarg-interno.esteiras.des.caixa:443)
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$
[p585600@caddeapllx2577 ~]$ find /logs/httpd -iname "siarg" -o -iname "error"
[p585600@caddeapllx2577 ~]$ grep -A5 "ajp" /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
                <ajp-listener name="ajp" socket-binding="ajp"/>
                <http-listener name="default" socket-binding="http" redirect-socket="https" enable-http2="true"/>
                <https-listener name="https" socket-binding="https" security-realm="ApplicationRealm" enable-http2="true" proxy-address-forwarding="true"/>

                <host name="default-host" alias="localhost caddeapllx2577.agil.nprd.caixa.gov.br siarg-interno.esteiras.des.caixa">

--
        <socket-binding name="ajp" port="${jboss.ajp.port:8009}"/>
        <socket-binding name="http" port="${jboss.http.port:8080}"/>
        <socket-binding name="https" port="${jboss.https.port:8443}"/>
        <socket-binding name="management-http" interface="management" port="${jboss.management.http.port:9990}"/>
        <socket-binding name="management-https" interface="management" port="${jboss.management.https.port:9993}"/>
        <socket-binding name="txn-recovery-environment" port="4712"/>
[p585600@caddeapllx2577 ~]$
