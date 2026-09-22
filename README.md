.2$
-sh-4.2$ oc -n selenium-grid rsh firefox-5-26gvg bash
To run a command as administrator (user "root"), use "sudo <command>".
See "man sudo_root" for details.

WARNING: Very high value reported by "ulimit -n". Consider passing "--ulimit nofile=32768" to "docker run".
seluser@firefox-5-26gvg:/$
seluser@firefox-5-26gvg:/$
seluser@firefox-5-26gvg:/$
seluser@firefox-5-26gvg:/$ G=http://selenium-router:4444
S=$(curl -s -X POST $G/session -H 'Content-Type: application/json' \
  -d '{"capabilities":{"alwaysMatch":{"browserName":"firefox","acceptInsecureCerts":true}}}' \
  | grep -o '"sessionId":"[^"]*"' | cut -d'"' -f4); echo "sessao=$S"

curl -s -X POST $G/session/$S/timeouts -H 'Content-Type: application/json' -d '{"pageLoad":30000}'
time curl -s -X POST $G/session/$S/url -H 'Content-Type: application/json' -d '{"url":"https://logindes.caixa.gov.br/"}'; echo
curl -s -X POST $G/session/$S/execute/sync -H 'Content-Type: application/json' \
  -d '{"script":"return [document.readyState, document.title, location.href]","args":[]}'; echo
curl -s -X DELETE $G/session/$S
sessao=
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="pt" lang="pt">
<head>
    <title>CAIXA</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <style type="text/css">
        * { border: medium none; color: #666666; font-family: Arial; }
        body { background: url("/Wbo-A1B3F78F-DD48-4F49-9040-33C1FF577E49/bkbody.jpg") repeat fixed 50% 0 #F6F6F6; margin: 0; width: 100%; }
        h1 { color: #016599; border-bottom: 1px dashed #CCCCCC; font-weight: bolder; font-size: 200%; padding-bottom: 12px; }
        h2 { color: #016599; font-size: 140%; }
        h3 { color: #FF9900; font-weight: bold; }
        a, a:active, a:link, a:valid { text-decoration: none; color: #666666; }
            a:visited, a:hover { color: #FF9900; }
        ul { margin-top: -0.7em; list-style-type: square; list-style-image: url("/Wbo-A1B3F78F-DD48-4F49-9040-33C1FF577E49/bullet.gif"); }
        #conteudo-tmg { background: url("/Wbo-A1B3F78F-DD48-4F49-9040-33C1FF577E49/bk_topo-pedes.jpg") no-repeat scroll 0 0 transparent; width: 97.4%; position: absolute; left: 50%; top: 0%; margin: auto auto 0 -30.7em; }
        #logo-caixa { padding-top: 3.4em; padding-left: 27em; }
        #logo-erro-no-acesso { float: left; width: 12%; }
            #logo-erro-no-acesso > img { width: 100%; }
        #textos { float: left; padding: 1.5em; width: 58.4em; }
        #descricao { float: right; margin-top: -1em; padding-bottom: 2em; width: 85%; font-size: 80%; }
        #tecnicos { clear: both; border-bottom: 1px dashed #CCCCCC; font-size: 70%; font-style: italic; }
            ul > #tecnicos { font-weight: lighter; list-style-type: circle; }
    </style>
</head>
<body>
    <div id="conteudo-tmg">
        <img alt="CAIXA" id="logo-caixa" src="/Wbo-A1B3F78F-DD48-4F49-9040-33C1FF577E49/logocaixa.gif" />
        <p>&nbsp;</p>
        <div id="textos">
            <div id="logo-erro-no-acesso">
                <img src="/Wbo-A1B3F78F-DD48-4F49-9040-33C1FF577E49/info-tmg-pedes.png" alt="Imagem de Erro no Site" title="Erro no Site" />
            </div>
            <div id="descricao" style="width: 754px; height: 252px">
                <h2 title="Descrição">O endereço do destino solicitado não pôde ser encontrado.</h2>
                                <h2 title="Descrição" align="justify">Este erro indica que não
                                foi possível encontrar o endereço IP do site que você está
                                tentando acessar. Isso geralmente acontece por um erro de
                                resolução de nomes (DNS) no destino.</h2>
                <p>Você pode tentar:</p>
                <ul>
                    <li>
                                        <p align="justify"><strong>Atualizar a página:</strong> Clique no botão
                                        atualizar.</li>
                    <li>
                                        <p align="justify"><strong>Verificar o endereço digitado:</strong> Confira se você digitou o endereço da página corretamente.</li>
                    <li>
                                        <p align="justify"><strong>Reclamar diretamente com o administrador da página:</strong> Você pode entrar em contato com o administrador do "site" para confirmar se a página ainda existe enviando um "e-mail" ou telefonando para o responsável (normalmente listados na página inicial do "site").</li>
                </ul>
            </div>
            <div id="tecnicos">
                <h3>&gt;&gt; Informações técnicas</h3>
                                <ul>
                                        <li><b>Erro 502 Proxy Error:</b> The host was not found. (11001)</li>
                                        <li><b>Endereço IP:</b> 10.252.32.220</li>
                                        <li><b>Data:</b> 22/09/2026 22:23:12 [GMT]</li>
                                        <li><b>Servidor:</b> CX0000NT810.corecaixa</li>
                                        <li><b>Origem:</b> proxy</li>
                                </ul>
            </div>
        </div>
    </div>
</body>
</html><!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="pt" lang="pt">
<head>
    <title>CAIXA</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <style type="text/css">
        * { border: medium none; color: #666666; font-family: Arial; }
        body { background: url("/Wbo-A1B3F78F-DD48-4F49-9040-33C1FF577E49/bkbody.jpg") repeat fixed 50% 0 #F6F6F6; margin: 0; width: 100%; }
        h1 { color: #016599; border-bottom: 1px dashed #CCCCCC; font-weight: bolder; font-size: 200%; padding-bottom: 12px; }
        h2 { color: #016599; font-size: 140%; }
        h3 { color: #FF9900; font-weight: bold; }
        a, a:active, a:link, a:valid { text-decoration: none; color: #666666; }
            a:visited, a:hover { color: #FF9900; }
        ul { margin-top: -0.7em; list-style-type: square; list-style-image: url("/Wbo-A1B3F78F-DD48-4F49-9040-33C1FF577E49/bullet.gif"); }
        #conteudo-tmg { background: url("/Wbo-A1B3F78F-DD48-4F49-9040-33C1FF577E49/bk_topo-pedes.jpg") no-repeat scroll 0 0 transparent; width: 97.4%; position: absolute; left: 50%; top: 0%; margin: auto auto 0 -30.7em; }
        #logo-caixa { padding-top: 3.4em; padding-left: 27em; }
        #logo-erro-no-acesso { float: left; width: 12%; }
            #logo-erro-no-acesso > img { width: 100%; }
        #textos { float: left; padding: 1.5em; width: 58.4em; }
        #descricao { float: right; margin-top: -1em; padding-bottom: 2em; width: 85%; font-size: 80%; }
        #tecnicos { clear: both; border-bottom: 1px dashed #CCCCCC; font-size: 70%; font-style: italic; }
            ul > #tecnicos { font-weight: lighter; list-style-type: circle; }
    </style>
</head>
<body>
    <div id="conteudo-tmg">
        <img alt="CAIXA" id="logo-caixa" src="/Wbo-A1B3F78F-DD48-4F49-9040-33C1FF577E49/logocaixa.gif" />
        <p>&nbsp;</p>
        <div id="textos">
            <div id="logo-erro-no-acesso">
                <img src="/Wbo-A1B3F78F-DD48-4F49-9040-33C1FF577E49/info-tmg-pedes.png" alt="Imagem de Erro no Site" title="Erro no Site" />
            </div>
            <div id="descricao" style="width: 754px; height: 252px">
                <h2 title="Descrição">O endereço do destino solicitado não pôde ser encontrado.</h2>
                                <h2 title="Descrição" align="justify">Este erro indica que não
                                foi possível encontrar o endereço IP do site que você está
                                tentando acessar. Isso geralmente acontece por um erro de
                                resolução de nomes (DNS) no destino.</h2>
                <p>Você pode tentar:</p>
                <ul>
                    <li>
                                        <p align="justify"><strong>Atualizar a página:</strong> Clique no botão
                                        atualizar.</li>
                    <li>
                                        <p align="justify"><strong>Verificar o endereço digitado:</strong> Confira se você digitou o endereço da página corretamente.</li>
                    <li>
                                        <p align="justify"><strong>Reclamar diretamente com o administrador da página:</strong> Você pode entrar em contato com o administrador do "site" para confirmar se a página ainda existe enviando um "e-mail" ou telefonando para o responsável (normalmente listados na página inicial do "site").</li>
                </ul>
            </div>
            <div id="tecnicos">
                <h3>&gt;&gt; Informações técnicas</h3>
                                <ul>
                                        <li><b>Erro 502 Proxy Error:</b> The host was not found. (11001)</li>
                                        <li><b>Endereço IP:</b> 10.252.32.220</li>
                                        <li><b>Data:</b> 22/09/2026 22:23:12 [GMT]</li>
                                        <li><b>Servidor:</b> CX0000NT810.corecaixa</li>
                                        <li><b>Origem:</b> proxy</li>
                                </ul>
            </div>
        </div>
    </div>
</body>
</html>
real    0m0.078s
user    0m0.004s
sys     0m0.002s

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="pt" lang="pt">
<head>
    <title>CAIXA</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <style type="text/css">
        * { border: medium none; color: #666666; font-family: Arial; }
        body { background: url("/Wbo-A1B3F78F-DD48-4F49-9040-33C1FF577E49/bkbody.jpg") repeat fixed 50% 0 #F6F6F6; margin: 0; width: 100%; }
        h1 { color: #016599; border-bottom: 1px dashed #CCCCCC; font-weight: bolder; font-size: 200%; padding-bottom: 12px; }
        h2 { color: #016599; font-size: 140%; }
        h3 { color: #FF9900; font-weight: bold; }
        a, a:active, a:link, a:valid { text-decoration: none; color: #666666; }
            a:visited, a:hover { color: #FF9900; }
        ul { margin-top: -0.7em; list-style-type: square; list-style-image: url("/Wbo-A1B3F78F-DD48-4F49-9040-33C1FF577E49/bullet.gif"); }
        #conteudo-tmg { background: url("/Wbo-A1B3F78F-DD48-4F49-9040-33C1FF577E49/bk_topo-pedes.jpg") no-repeat scroll 0 0 transparent; width: 97.4%; position: absolute; left: 50%; top: 0%; margin: auto auto 0 -30.7em; }
        #logo-caixa { padding-top: 3.4em; padding-left: 27em; }
        #logo-erro-no-acesso { float: left; width: 12%; }
            #logo-erro-no-acesso > img { width: 100%; }
        #textos { float: left; padding: 1.5em; width: 58.4em; }
        #descricao { float: right; margin-top: -1em; padding-bottom: 2em; width: 85%; font-size: 80%; }
        #tecnicos { clear: both; border-bottom: 1px dashed #CCCCCC; font-size: 70%; font-style: italic; }
            ul > #tecnicos { font-weight: lighter; list-style-type: circle; }
    </style>
</head>
<body>
    <div id="conteudo-tmg">
        <img alt="CAIXA" id="logo-caixa" src="/Wbo-A1B3F78F-DD48-4F49-9040-33C1FF577E49/logocaixa.gif" />
        <p>&nbsp;</p>
        <div id="textos">
            <div id="logo-erro-no-acesso">
                <img src="/Wbo-A1B3F78F-DD48-4F49-9040-33C1FF577E49/info-tmg-pedes.png" alt="Imagem de Erro no Site" title="Erro no Site" />
            </div>
            <div id="descricao" style="width: 754px; height: 252px">
                <h2 title="Descrição">O endereço do destino solicitado não pôde ser encontrado.</h2>
                                <h2 title="Descrição" align="justify">Este erro indica que não
                                foi possível encontrar o endereço IP do site que você está
                                tentando acessar. Isso geralmente acontece por um erro de
                                resolução de nomes (DNS) no destino.</h2>
                <p>Você pode tentar:</p>
                <ul>
                    <li>
                                        <p align="justify"><strong>Atualizar a página:</strong> Clique no botão
                                        atualizar.</li>
                    <li>
                                        <p align="justify"><strong>Verificar o endereço digitado:</strong> Confira se você digitou o endereço da página corretamente.</li>
                    <li>
                                        <p align="justify"><strong>Reclamar diretamente com o administrador da página:</strong> Você pode entrar em contato com o administrador do "site" para confirmar se a página ainda existe enviando um "e-mail" ou telefonando para o responsável (normalmente listados na página inicial do "site").</li>
                </ul>
            </div>
            <div id="tecnicos">
                <h3>&gt;&gt; Informações técnicas</h3>
                                <ul>
                                        <li><b>Erro 502 Proxy Error:</b> The host was not found. (11001)</li>
                                        <li><b>Endereço IP:</b> 10.252.32.220</li>
                                        <li><b>Data:</b> 22/09/2026 22:23:12 [GMT]</li>
                                        <li><b>Servidor:</b> CX0000NT810.corecaixa</li>
                                        <li><b>Origem:</b> proxy</li>
                                </ul>
            </div>
        </div>
    </div>
</body>
</html>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="pt" lang="pt">
<head>
    <title>CAIXA</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <style type="text/css">
        * { border: medium none; color: #666666; font-family: Arial; }
        body { background: url("/Wbo-A1B3F78F-DD48-4F49-9040-33C1FF577E49/bkbody.jpg") repeat fixed 50% 0 #F6F6F6; margin: 0; width: 100%; }
        h1 { color: #016599; border-bottom: 1px dashed #CCCCCC; font-weight: bolder; font-size: 200%; padding-bottom: 12px; }
        h2 { color: #016599; font-size: 140%; }
        h3 { color: #FF9900; font-weight: bold; }
        a, a:active, a:link, a:valid { text-decoration: none; color: #666666; }
            a:visited, a:hover { color: #FF9900; }
        ul { margin-top: -0.7em; list-style-type: square; list-style-image: url("/Wbo-A1B3F78F-DD48-4F49-9040-33C1FF577E49/bullet.gif"); }
        #conteudo-tmg { background: url("/Wbo-A1B3F78F-DD48-4F49-9040-33C1FF577E49/bk_topo-pedes.jpg") no-repeat scroll 0 0 transparent; width: 97.4%; position: absolute; left: 50%; top: 0%; margin: auto auto 0 -30.7em; }
        #logo-caixa { padding-top: 3.4em; padding-left: 27em; }
        #logo-erro-no-acesso { float: left; width: 12%; }
            #logo-erro-no-acesso > img { width: 100%; }
        #textos { float: left; padding: 1.5em; width: 58.4em; }
        #descricao { float: right; margin-top: -1em; padding-bottom: 2em; width: 85%; font-size: 80%; }
        #tecnicos { clear: both; border-bottom: 1px dashed #CCCCCC; font-size: 70%; font-style: italic; }
            ul > #tecnicos { font-weight: lighter; list-style-type: circle; }
    </style>
</head>
<body>
    <div id="conteudo-tmg">
        <img alt="CAIXA" id="logo-caixa" src="/Wbo-A1B3F78F-DD48-4F49-9040-33C1FF577E49/logocaixa.gif" />
        <p>&nbsp;</p>
        <div id="textos">
            <div id="logo-erro-no-acesso">
                <img src="/Wbo-A1B3F78F-DD48-4F49-9040-33C1FF577E49/info-tmg-pedes.png" alt="Imagem de Erro no Site" title="Erro no Site" />
            </div>
            <div id="descricao" style="width: 754px; height: 252px">
                <h2 title="Descrição">O endereço do destino solicitado não pôde ser encontrado.</h2>
                                <h2 title="Descrição" align="justify">Este erro indica que não
                                foi possível encontrar o endereço IP do site que você está
                                tentando acessar. Isso geralmente acontece por um erro de
                                resolução de nomes (DNS) no destino.</h2>
                <p>Você pode tentar:</p>
                <ul>
                    <li>
                                        <p align="justify"><strong>Atualizar a página:</strong> Clique no botão
                                        atualizar.</li>
                    <li>
                                        <p align="justify"><strong>Verificar o endereço digitado:</strong> Confira se você digitou o endereço da página corretamente.</li>
                    <li>
                                        <p align="justify"><strong>Reclamar diretamente com o administrador da página:</strong> Você pode entrar em contato com o administrador do "site" para confirmar se a página ainda existe enviando um "e-mail" ou telefonando para o responsável (normalmente listados na página inicial do "site").</li>
                </ul>
            </div>
            <div id="tecnicos">
                <h3>&gt;&gt; Informações técnicas</h3>
                                <ul>
                                        <li><b>Erro 502 Proxy Error:</b> The host was not found. (11001)</li>
                                        <li><b>Endereço IP:</b> 10.252.32.220</li>
                                        <li><b>Data:</b> 22/09/2026 22:23:12 [GMT]</li>
                                        <li><b>Servidor:</b> CX0000NT810.corecaixa</li>
                                        <li><b>Origem:</b> proxy</li>
                                </ul>
            </div>
        </div>
    </div>
</body>
</html>seluser@firefox-5-26gvg:/$
