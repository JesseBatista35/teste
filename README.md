
[root@caddeapllx2520 etc]# curl -k -v https://localhost:8443/
*   Trying ::1:8443...
* connect to ::1 port 8443 failed: Conexão recusada
*   Trying 127.0.0.1:8443...
* Connected to localhost (127.0.0.1) port 8443 (#0)
* ALPN, offering h2
* ALPN, offering http/1.1
*  CAfile: /etc/pki/tls/certs/ca-bundle.crt
* TLSv1.0 (OUT), TLS header, Certificate Status (22):
* TLSv1.3 (OUT), TLS handshake, Client hello (1):
* TLSv1.2 (IN), TLS header, Certificate Status (22):
* TLSv1.3 (IN), TLS handshake, Server hello (2):
* TLSv1.2 (IN), TLS handshake, Certificate (11):
* TLSv1.2 (IN), TLS handshake, Server key exchange (12):
* TLSv1.2 (IN), TLS handshake, Server finished (14):
* TLSv1.2 (OUT), TLS header, Certificate Status (22):
* TLSv1.2 (OUT), TLS handshake, Client key exchange (16):
* TLSv1.2 (OUT), TLS header, Finished (20):
* TLSv1.2 (OUT), TLS change cipher, Change cipher spec (1):
* TLSv1.2 (OUT), TLS header, Certificate Status (22):
* TLSv1.2 (OUT), TLS handshake, Finished (20):
* TLSv1.2 (IN), TLS header, Finished (20):
* TLSv1.2 (IN), TLS header, Certificate Status (22):
* TLSv1.2 (IN), TLS handshake, Finished (20):
* SSL connection using TLSv1.2 / ECDHE-RSA-AES256-GCM-SHA384
* ALPN, server accepted to use h2
* Server certificate:
*  subject: CN=localhost
*  start date: Jun 17 18:08:34 2026 GMT
*  expire date: Jun 14 18:08:34 2036 GMT
*  issuer: CN=localhost
*  SSL certificate verify result: self-signed certificate (18), continuing anyway.
* Using HTTP2, server supports multi-use
* Connection state changed (HTTP/2 confirmed)
* Copying HTTP/2 data in stream buffer to connection buffer after upgrade: len=0
* TLSv1.2 (OUT), TLS header, Unknown (23):
* TLSv1.2 (OUT), TLS header, Unknown (23):
* TLSv1.2 (OUT), TLS header, Unknown (23):
* Using Stream ID: 1 (easy handle 0x5597c03a8040)
* TLSv1.2 (OUT), TLS header, Unknown (23):
> GET / HTTP/2
> Host: localhost:8443
> user-agent: curl/7.76.1
> accept: */*
>
* TLSv1.2 (IN), TLS header, Unknown (23):
* Connection state changed (MAX_CONCURRENT_STREAMS == 4294967295)!
* TLSv1.2 (OUT), TLS header, Unknown (23):
* TLSv1.2 (IN), TLS header, Unknown (23):
* TLSv1.2 (IN), TLS header, Unknown (23):
< HTTP/2 200
< last-modified: Fri, 19 Jan 2024 09:03:52 GMT
< content-length: 1634
< content-type: text/html
< accept-ranges: bytes
< date: Wed, 17 Jun 2026 18:08:35 GMT
<
<!DOCTYPE html>

<html>
<head>
    <!-- proper charset -->
    <meta http-equiv="content-type" content="text/html;charset=utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=EmulateIE8"/>

    <title>Welcome to JBoss EAP 8</title>
    <link rel="shortcut icon" href="favicon.ico?v=1"/>
    <link rel="StyleSheet" href="eap.css" type="text/css">
</head>

<body>

<div id="container" style="position: absolute; left: 0px; top: 0px; right: 0px; bottom: 0px;">

    <!-- header -->
    <div class="header-panel">
        <div class="header-line">&nbsp;</div>
        <div class="header-top">
            <img class="prod-title" src="images/product_title.png"/><span class="prod-version">8</span>
        </div>
        <div class="header-bottom">&nbsp;</div>
    </div>


    <!-- main content -->
    <div id="content">

        <div class="section">

            <h1>Welcome to JBoss EAP 8</h1>

            <h3>Your Red Hat JBoss Enterprise Application Platform is running.</h3>

            <p>
                <a href="/console">Administration Console</a> |
                <a href="https://access.redhat.com/documentation/en-us/red_hat_jboss_enterprise_application_platform">Latest release documentation</a> |
                <a href="https://access.redhat.com/discussions">Online User Groups</a> <br/>
            </p>

            <sub>To replace this page simply deploy your own war with / as its context path.<br/>
                To disable it, remove the "welcome-content" handler for location / in the undertow subsystem.</sub>

        </div>

    </div>


    <div id="footer">&nbsp;</div>

</div>

</body>
</html>
* Connection #0 to host localhost left intact
[root@caddeapllx2520 etc]#
