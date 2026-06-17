oc port-forward pod/sispl-consulta-transacao-ocp4-tqs-15-r82zf 8080:8080 -n sispl-tqs


curl -v http://localhost:8080/q/health









- name: JAVA_OPTIONS_APPEND
              value: '-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Dcom.sun.jndi.ldap.connect.pool=false'




eu acho que po erro continua:



026-06-17 18:44:29,479 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Starting a bearer access token authentication
2026-06-17 18:44:29,479 DEBUG [io.qua.oid.run.OidcUtils] (vert.x-eventloop-thread-0) Looking for a token in the authorization header
2026-06-17 18:44:29,479 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-06-17 18:44:29,479 DEBUG [io.qua.oid.run.OidcUtils] (vert.x-eventloop-thread-1) Looking for a token in the authorization header
2026-06-17 18:44:29,479 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-06-17 18:44:29,479 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-0) SRJWT06000: tokenHeaderName = Authorization
2026-06-17 18:44:29,479 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-0) SRJWT06005: Authorization header was null
2026-06-17 18:44:29,479 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-1) SRJWT06000: tokenHeaderName = Authorization
2026-06-17 18:44:29,479 DEBUG [io.qua.sma.jwt.run.aut.JWTAuthMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-06-17 18:44:29,479 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-1) SRJWT06005: Authorization header was null
2026-06-17 18:44:29,479 DEBUG [io.qua.sma.jwt.run.aut.JWTAuthMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-06-17 18:44:39,480 DEBUG [io.qua.oid.run.OidcAuthenticationMechanism] (vert.x-eventloop-thread-1) Resolved OIDC tenant id: Default
2026-06-17 18:44:39,480 DEBUG [io.qua.oid.run.OidcAuthenticationMechanism] (vert.x-eventloop-thread-0) Resolved OIDC tenant id: Default
2026-06-17 18:44:39,480 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Starting a bearer access token authentication
2026-06-17 18:44:39,480 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Starting a bearer access token authentication
2026-06-17 18:44:39,480 DEBUG [io.qua.oid.run.OidcUtils] (vert.x-eventloop-thread-1) Looking for a token in the authorization header
2026-06-17 18:44:39,480 DEBUG [io.qua.oid.run.OidcUtils] (vert.x-eventloop-thread-0) Looking for a token in the authorization header
2026-06-17 18:44:39,480 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-06-17 18:44:39,480 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-06-17 18:44:39,480 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-0) SRJWT06000: tokenHeaderName = Authorization




-sh-4.2$ oc port-forward pod/sispl-consulta-transacao-ocp4-tqs-15-r82zf 8080:8080 -n sispl-tqs
Forwarding from 127.0.0.1:8080 -> 8080
Forwarding from [::1]:8080 -> 8080
^C-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ curl -v http://localhost:8080/q/health
* About to connect() to localhost port 8080 (#0)
*   Trying ::1...
* Conexão recusada
*   Trying 127.0.0.1...
* Conexão recusada
* Failed connect to localhost:8080; Conexão recusada
* Closing connection 0
curl: (7) Failed connect to localhost:8080; Conexão recusada
-sh-4.2$

