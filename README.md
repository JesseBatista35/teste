
-sh-4.1$ curl -k https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

<html>
        <head></head>
        <link href="css/janela.css" rel="stylesheet" type="text/css" />
        <body>
<html>
        <head></head>
        <link href="../css/janela.css" rel="stylesheet" type="text/css" />
        <body>


        </body>
</html>

        </body>
</html>-sh-4.1$ curl -k -I https://sicem-legado.des.caixa/sicem/css/menu.css
HTTP/1.1 200 OK
Date: Fri, 18 Sep 2026 14:30:01 GMT
X-Frame-Options: DENY
Content-Security-Policy: frame-ancestors https://sicem-legado.des.caixa
Content-Security-Policy: frame-ancestors 'self'
Accept-Ranges: bytes
ETag: W/"1212-1626893278000"
Last-Modified: Wed, 21 Jul 2021 18:47:58 GMT
Content-Type: text/css;charset=ISO-8859-1
Content-Length: 1212

-sh-4.1$
-sh-4.1$ curl -k -I https://sicem-legado.des.caixa/sicem/css/alert.css
HTTP/1.1 200 OK
Date: Fri, 18 Sep 2026 14:30:01 GMT
X-Frame-Options: DENY
Content-Security-Policy: frame-ancestors https://sicem-legado.des.caixa
Content-Security-Policy: frame-ancestors 'self'
Accept-Ranges: bytes
ETag: W/"2433-1626893278000"
Last-Modified: Wed, 21 Jul 2021 18:47:58 GMT
Content-Type: text/css;charset=ISO-8859-1
Content-Length: 2433

-sh-4.1$
-sh-4.1$ curl -k -I https://sicem-legado.des.caixa/sicem/rc/css/layout.css
HTTP/1.1 200 OK
Date: Fri, 18 Sep 2026 14:30:02 GMT
X-Frame-Options: DENY
Content-Security-Policy: frame-ancestors https://sicem-legado.des.caixa
Content-Security-Policy: frame-ancestors 'self'
Accept-Ranges: bytes
ETag: W/"16863-1669653090000"
Last-Modified: Mon, 28 Nov 2022 16:31:30 GMT
Content-Type: text/css
Content-Language: pt-BR
Content-Length: 16863

-sh-4.1$
