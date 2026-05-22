-sh-4.2$ curl -kv https://sigpf-internet.esteiras.des.caixa/sigpf_internet/
* About to connect() to sigpf-internet.esteiras.des.caixa port 443 (#0)
*   Trying 10.116.180.22...
* Connected to sigpf-internet.esteiras.des.caixa (10.116.180.22) port 443 (#0)
* Initializing NSS with certpath: sql:/etc/pki/nssdb
* skipping SSL peer certificate verification
* SSL connection using TLS_RSA_WITH_AES_256_CBC_SHA
* Server certificate:
*       subject: CN=*.esteiras.des.caixa,O=Caixa Economica Federal,C=BR
*       start date: Abr 18 14:57:45 2024 GMT
*       expire date: Abr 18 15:07:45 2029 GMT
*       common name: *.esteiras.des.caixa
*       issuer: CN=AC Icptestes Sub,O=Caixa Economica Federal,C=BR
> GET /sigpf_internet/ HTTP/1.1
> User-Agent: curl/7.29.0
> Host: sigpf-internet.esteiras.des.caixa
> Accept: */*
>
< HTTP/1.1 403 Forbidden
< Date: Fri, 22 May 2026 17:56:44 GMT
< Server: Apache/2.4.29 (Red Hat)
< Last-Modified: Fri, 17 Jan 2020 13:41:12 GMT
< ETag: "10f0-59c5618474e00"
< Accept-Ranges: bytes
< Content-Length: 4336
< Connection: close
< Content-Type: text/html; charset=UTF-8
<
<!doctype html>
<html class="no-js" lang="">
<head>
    <meta charset="utf-8">
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>DevOpsCAIXA</title>
    <link rel="apple-touch-icon" href="apple-touch-icon.png">
    <!-- Place favicon.ico in the root directory -->
    <link rel="stylesheet" href="styles/main.css">
    <link rel="stylesheet" href="styles/jquery-ui.min.css">
    <link rel="stylesheet" href="styles/theme.css">

    <script src="scripts/vendor/modernizr.js"></script>
    <style type="text/css">
        footer {
            position: absolute;
            bottom: 0;
            height: 40px;
            margin-top: 40px;
        }
    </style>
</head>
  <body>
    <!--[if IE]>
      <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
    <![endif]-->

    <header>
      <div class="content">
        <h1>
          <a href="index.html" title="">Caixa</a>
        </h1>

        <h2><strong>DevOps CAIXA</strong></h2>

        <div class="pesquisa sub-item">
          <form role="form" data-toggle="validation">
            <label for="txt_pesquisa">O que você está procurando?</label>
            <input id="txt_pesquisa" type="text" required>
            <button type="submit">Buscar</button>
          </form>

        </div>

        <div class="calendario sub-item">
          <div id="calendarioHeader"></div>
          <div class="evento">
            <h5>Eventos do mês</h5>
            <div class="conteudo">
              <h6>14/03/2011 - <strong>Nome do Evento</strong></h6>
              <p>Curabitur placeraante velitvel. Donec ac auctor nee. Morbi bibent sem. </p>
              <a href="#" class="verMais" title="Leia mais">Leia mais</a>
            </div>
          </div>

        </div>

        <div class="config sub-item">
          <h5>Ferramentas</h5>

          <ul>
            <li>
              <a href="#" title="">Ferramenta de configuração</a>
            </li>
            <li>
              <a href="#" title="">Ferramenta de configuração</a>
            </li>
            <li>
              <a href="#" title="">Ferramenta de configuração</a>
            </li>
            <li>
              <a href="#" title="">Ferramenta de configuração</a>
            </li>
          </ul>
        </div>
      </div>
    </header>

    <main>
      <div class="content">
        <section class="full">

          <div class="secao">
                        <br><br><br><br><br>
                                <h2>Olá, <br><br>
                                        Seja bem vindo ao <b><font color="#3366B7">DevOps CAIXA</font></b>.<br><br><br><br>
                                        <font color="red"><b>Ops!!!!</b>... parece que você acessou uma URL que não está disponível.</font>
                                        <br><br><br><br>
                                        <font color="#3366B7"><h3>Confere lá no Azure DevOps Server se essa URL tá certa no seu processo de <i>release</i>.
                                        <br><br>
                                        Tudo certinho lá? fala com o SAI/Suporte que vamos te ajudar, ok? :)</h3></font>
                                </h2>
          </div>

        </section>
      </div>
    </main>

    <footer>
      <div class="content">

        <h6>Caixa Econômica Federal</h6>

        <ul>
          <li>
              <a href="#" title="Política de Privacidade ">Política de Privacidade </a>
          </li>
            <li>
              <a href="#" title="Termos de Uso">Termos de Uso</a>
          </li>
            <li>
              <a href="#" title="Mapa do Site">Mapa do Site</a>
          </li>
        </ul>
      </div>
    </footer>

    <div id="overlay"></div>

    <!-- Google Analytics: change UA-XXXXX-X to be your site's ID. -->
    <script>
      (function(b,o,i,l,e,r){b.GoogleAnalyticsObject=l;b[l]||(b[l]=
      function(){(b[l].q=b[l].q||[]).push(arguments)});b[l].l=+new Date;
      e=o.createElement(i);r=o.getElementsByTagName(i)[0];
      e.src='https://www.google-analytics.com/analytics.js';
      r.parentNode.insertBefore(e,r)}(window,document,'script','ga'));
      ga('create','UA-XXXXX-X');ga('send','pageview');
    </script>

    <script src="scripts/vendor.js"></script>

    <script src="scripts/plugins.js"></script>

    <script src="scripts/main.js"></script>
  </body>
</html>
* Closing connection 0
-sh-4.2$
