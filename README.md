
-sh-4.1$
-sh-4.1$
-sh-4.1$ grep "11:25:1[0-9]" /logs/jboss-eap/hc/servers/sicem_node1_lx0005/server.log
-sh-4.1$ grep -i "acesso\|permitido\|negado\|forbidden" /logs/jboss-eap/hc/servers/sicem_node1_lx0005/server.log | tail -50
10:47:23,828 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 76) HHH000037: Columns: [enti_retornoposterior, enti_id, enti_arquivoconvenio, enti_cnpj, enti_permitezerarcontas, enti_cpfpadrao, lsis_func_id, enti_datalimitepagamento, enti_siart, enti_codigoacessoanterior, cont_transitoria, enti_horamovimento, enti_retornadevolucao, enti_convenioinativo, enti_datalimitecodigoantigo, enti_fnde, enti_contapadrao, enti_sifix, enti_sicex, enti_codibge, enti_pagamentoviacontaunica, enti_numconvenio, enti_migraanoanterior, enti_codigoacesso, enti_horaretorno, enti_datatrocacodigo, lsis_usua_login, enti_valortarifated, ucai_id, acli_id, enti_controlarsaque, enti_nome, enti_enviaarquivosegmentado, enti_datalimiteremessa, enti_retornatransferencia, enti_estrategiaretorno, enti_estrategiaanalisemovimento]
10:52:59,362 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 208) HHH000037: Columns: [enti_retornoposterior, enti_id, enti_arquivoconvenio, enti_cnpj, enti_permitezerarcontas, enti_cpfpadrao, lsis_func_id, enti_datalimitepagamento, enti_siart, enti_codigoacessoanterior, cont_transitoria, enti_horamovimento, enti_retornadevolucao, enti_convenioinativo, enti_datalimitecodigoantigo, enti_fnde, enti_contapadrao, enti_sifix, enti_sicex, enti_codibge, enti_pagamentoviacontaunica, enti_numconvenio, enti_migraanoanterior, enti_codigoacesso, enti_horaretorno, enti_datatrocacodigo, lsis_usua_login, enti_valortarifated, ucai_id, acli_id, enti_controlarsaque, enti_nome, enti_enviaarquivosegmentado, enti_datalimiteremessa, enti_retornatransferencia, enti_estrategiaretorno, enti_estrategiaanalisemovimento]
-sh-4.1$





[root@sbrdeaprlx0001 eap_des_64]#

[root@sbrdeaprlx0001 eap_des_64]# find / -name "janela.css" 2>/dev/null

^C

[root@sbrdeaprlx0001 eap_des_64]# curl -k https://sicem-legado.des.caixa/sicem/Principal.jsp
 
 
 
 
 
 
<!DOCTYPE html>
<html lang="pt-BR">
<head>
<title>SICEM</title>
<meta http-equiv="cache-control" content="no-cache" />
<meta http-equiv="pragma" content="no-cache" />
<meta http-equiv="expires" content="-1" />
<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7" />
<!-- <link href="css/janela.css" rel="stylesheet" type="text/css" /> -->
<link rel="stylesheet" href="rc/css/layout.css" type="text/css" />
<link rel="stylesheet" href="css/menu.css" type="text/css" />
<link rel="stylesheet" href="css/alert.css" type="text/css" />
<style type="text/css">

                .link,

                .link:hover{font-family:Verdana;font-size:8pt;color:#FFFFFF;cursor:hand;font-weight:bold;text-decoration:none;}

                .tabelaBotao{cursor:default;}
</style>
<script type ="text/javascript" src="js/menu.js" ></script>
<script type="text/javascript" src="js/jquery-3.7.1.js"></script>
<script type="text/javascript">

                        $.noConflict();
</script>
<script type ="text/javascript" src="js/validaSessao.js" ></script>
</style>
</head>
 
 
    <script language="javascript">
 
 
            function logon(){

                if (document.formLogin.login.value == ""){

                    alert("Informe o login.");

                    document.formLogin.login.focus();

                }else if (document.formLogin.senha.value == ""){

                    alert("Informe a senha.");

                    document.formLogin.senha.focus();

                }else{

                    document.formLogin.submit();

                }

            }
 
    function redirecionar(link,id,titulo){
 
        console.log("Caminho: " + link);
 
        if(!verificaPermissao(link)){

                alert("Funcionalidade indispon▒vel para esta entidade");

                        return;

        }
 
        if(!verificaAcesso(link)){

                alert("Funcionalidade indispon▒vel para este perfil");

                        return;

        }
 
        if(link == "/RelatorioAction?parametro=operacional"){

                const rodape = document.createElement("div");

                rodape.setAttribute("id", "rodape");
 
                document.body.appendChild(rodape);

                        document.getElementById('rodape').style.background = 'url(./rc/imagens/conteudo-footer.jpg) no-repeat';

                        document.getElementById('rodape').style.height = '31px';

                        document.getElementById('rodape').style.marginLeft = '295px';

                        document.getElementById('rodape').style.marginTop = '-38px';

                        document.getElementById('rodape').style.position = 'absolute';

                document.getElementById('areaTrabalho').style.height = '380px';

        }
 
        var novaJanela = false;

        if(link.toLowerCase().indexOf('.pdf') >= 0){

                novaJanela = true;

                        var strWindowsFeatures = 'location=no,toolbar=no,resizable=yes';

                window.open(link,'_blank',strWindowsFeatures);

        } else if (link.indexOf('/rc/') >= 0){

            window.location.href = "/sicem" + link ;

        } else if (link.indexOf('http') >= 0){

            window.frames["areaTrabalho"].location.href = link;

        } else {

            window.frames["areaTrabalho"].location.href = "FuncionalidadeAction?funcionalidade="+id+"&link="+link;

        }

        if(novaJanela == false){

               document.getElementById('titulo').innerHTML = titulo;

        }

    }
 
    function verificaPermissao(link){

        if(link == "/rc/consultarremessa.action"){
 
        }

        else if(link == "/rc/processar.action" || link == "/rc/transacao.action" || link == "/rc/retorno.action"){
 
        }

        return true;

    }
 
    function verificaAcesso(link){

        if(link == "/RelatorioAction?parametro=auditoria"){
 
        }

        return true;

        }
 
    function capturaTecla(e){

        var tecla;

        if(document.all)

            tecla=event.keyCode;

        else{

            tecla=e.which;

        }

        if(tecla==13){

            logon();

        }

    }

    document.onkeydown = capturaTecla;
</script>
 
    <body background="imagens/back_cinza.gif" style="margin:0">
<div id="dialog-confirm" class="transparencia" title="Sua sess▒o vai expirar, deseja renovar?"></div>
<div class="desejaRenovar">
<div class="titulo"><p>Aten▒▒o! Encerramento de sess▒o.</p></div>
<div class="areaAlert" id="areaAlert">
<div class="opcoes">
<img id="imgAlert" src="imagens/warning.png" />
<p id="dialog-counter"></p>
</div>
<div class="botoes">
<input type="button" id="btnOk" class="botaoAlert" value="OK">
<input type="button" id="btnNao" class="botaoAlert" value="Cancelar">
</div>
</div>
</div>
<table width='100%' height='100%' border='0' cellpadding='0' cellspacing='0'>
<tr>
<td width='100%' height='100%' align='center' valign='middle'>
<table width='777px' height='599px' cellpadding='0' cellspacing='0' border='0'>
<tr height='157px'>
<td>
<table width='777px' height='100%' cellpadding='0' cellspacing='0' border='0'>
<tr align="right"><td align="right" height='15px'>
<iframe

                                                allowtransparency="true"

                                                name="sistema" id="sistema" src="Sistema.jsp" frameBorder="0" scrolling="no"

                                                style="Z-INDEX:1000; /*WIDTH:230px;*/ HEIGHT:30px;

                                                background-color:transparent; background: transparent;

                                                position: relative;top: 55px; margin-right: 10px; align: right">
</iframe></td></tr>
<tr><td height='72px' background="imagens/topo1.jpg"></td></tr>
<tr>
<td>
<table border="0" width="100%" cellpadding="0" cellspacing="0">
 
                                                <!-- MENU VAZIO -->
<tr height='27px'>
<td background="imagens/topo2.jpg">
<table border='0' cellpadding='0' cellspacing='0' width='90%' align='center'>
<tr><td>&nbsp;</td></tr>
</table>
</td>
</tr>
 
                                                <!-- FIM MENU VAZIO     -->
 
                                            </table>
</td>
</tr>
<!-- FORMULARIO DE LOGOFF -->
 
                                    <!-- FORMULARIO DE LOGIN -->
<tr>
<td height='58px' background="imagens/topo3.jpg">
<form name="formLogin" method="POST" id="formLogin" action="UsuarioAction" target="_parent">
<input type="hidden" name="parametro" value="login"/>
<table id='tableLogin' align="right"  border='0' cellpadding="0" cellspacing="0">
<tr valign="bottom" height="19px">
<td style="FONT-SIZE: 7pt" align='center' valign="middle">
<font Color="#FFFFFF" face='verdana'>Usu&aacute;rio&nbsp;</font>
</td>
<td>
<input style="height: 19px"  type="text" id='login' name='login' size='9'

                                                                   maxlength="7" style="FONT-SIZE: 9pt"/>
</td>
<td style="FONT-SIZE: 7pt" align='center' valign="middle">
<font Color="#FFFFFF" face='verdana'>&nbsp;Senha&nbsp;</font>
</td>
<td>
<input style="height: 19px" type='password' id='senha' name='senha' size='9'

                                                                   maxlength="155" style="FONT-SIZE: 9pt"/>
</td>
<td width='9px'>&nbsp;</td>
<td align='center' height="19px" width='52px' valign="middle">
<table width="100%" border='0' cellpadding="0" cellspacing="0" align="center">
<tr>
<td onClick="javascript:logon();"  style="cursor:hand;"

                                                                        background="imagens/botao.jpg" align="center" valign="middle">
<a href= "#" class="link">Entrar</a>
</td>
</tr>
</table>
</td>
<td width='6.5px'>&nbsp;</td>
</tr>
</table>
</form>
</td>
 
                                    </tr>
<!-- FIM FORMULARIO DE LOGIN -->
 
                                </table>
</td>
</tr>
<!-- AREA TRABALHO      -->
<tr>
<td height='444px' valign='top' align='center' background="imagens/back_janela.jpg">
<table width='735px' height='100%' align='center' border='0' cellpadding='0' cellspacing='0'>
<tr height='20px'>
<td colspan='2'><span></span></td>
</tr>
<tr height='10px'>
<td width='50%' align='left'>&nbsp;<span id='titulo'>&nbsp;</span></td>
<td width='50%' align='left'>&nbsp;<span id='entidade'>&nbsp;</span></td>
</tr>
<tr height='5px'>
<td colspan='2'><span></span></td>
</tr>
<tr>
<td colspan='2' align='right' valign='top'>
<div style="z-index: 1">
<iframe name="areaTrabalho" src="AreaTrabalho.jsp" frameBorder="0" scrolling="no"

                                                        style="Z-INDEX:-1000; WIDTH:738px; HEIGHT:375px;" id="areaTrabalho">
</iframe>
</div>
</td>
</tr>
</table>
</td>
</tr>
<!-- FIM AREA TRABALHO  -->
</table>
</td>
</tr>
</table>
 
    </body>
</html>[root@sbrdeaprlx0001 eap_des_64]#

 
10.116.3.28 - - [18/Sep/2026:11:22:59 -0300] "GET /sicem/Principal.jsp HTTP/1.1" 200 13135 "https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp" "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:140.0) Gecko/20100101 Firefox/140.0" text/html 200 13135 13591 9783

10.116.3.28 - - [18/Sep/2026:11:23:02 -0300] "GET /sicem/Principal.jsp HTTP/1.1" 200 13135 "https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp" "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:140.0) Gecko/20100101 Firefox/140.0" text/html 200 13135 13590 7713

10.116.3.19 - - [18/Sep/2026:11:23:08 -0300] "GET /sicem/Principal.jsp HTTP/1.1" 200 13135 "https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp" "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:140.0) Gecko/20100101 Firefox/140.0" text/html 200 13135 13591 8387

10.116.3.19 - - [18/Sep/2026:11:23:08 -0300] "GET /css/janela.css HTTP/1.1" 404 288 "https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp" "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:140.0) Gecko/20100101 Firefox/140.0" text/html 404 288 665 1066

10.116.3.19 - - [18/Sep/2026:11:23:11 -0300] "GET /sicem/Sistema.jsp HTTP/1.1" 200 727 "https://sicem-legado.des.caixa/sicem/Principal.jsp" "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:140.0) Gecko/20100101 Firefox/140.0" text/html 200 727 1154 7679

10.116.3.19 - - [18/Sep/2026:11:23:12 -0300] "GET /sicem/AreaTrabalho.jsp HTTP/1.1" 200 248 "https://sicem-legado.des.caixa/sicem/Principal.jsp" "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:140.0) Gecko/20100101 Firefox/140.0" text/html 200 248 675 8392

10.116.3.19 - - [18/Sep/2026:11:23:14 -0300] "GET /sicem/Principal.jsp HTTP/1.1" 200 13135 "https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp" "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:140.0) Gecko/20100101 Firefox/140.0" text/html 200 13135 13590 7850

10.116.3.20 - - [18/Sep/2026:11:23:25 -0300] "GET /sicem/MantemSessao.jsp?opcao=1 HTTP/1.1" 200 12 "https://sicem-legado.des.caixa/sicem/Principal.jsp" "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:140.0) Gecko/20100101 Firefox/140.0" text/html 200 12 439 9215

^[[A^[[A^[[B^C

[root@sbrdeaprlx0001 eap_des_64]# tail -100f  /logs/apache2/SICEM/sicem-legado.des.caixa-error.log

[Wed Sep 09 16:46:03 2026] [error] [client 10.116.3.25] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp

[Thu Sep 10 11:30:12 2026] [error] [client 10.116.3.18] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Thu Sep 10 13:39:57 2026] [error] [client 10.116.3.24] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Thu Sep 10 14:12:21 2026] [error] [client 10.116.3.29] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Thu Sep 10 15:10:46 2026] [error] [client 10.116.3.19] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/

[Thu Sep 10 15:11:14 2026] [error] [client 10.116.3.24] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp

[Thu Sep 10 15:39:17 2026] [error] [client 10.116.3.19] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp

[Thu Sep 10 16:23:19 2026] [error] [client 10.116.3.23] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp

[Thu Sep 10 16:23:21 2026] [error] [client 10.116.3.23] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Thu Sep 10 16:23:29 2026] [error] [client 10.116.3.23] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp

[Thu Sep 10 16:54:22 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Mon Sep 14 09:38:59 2026] [error] [client 10.116.3.26] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/Principal.jsp

[Mon Sep 14 13:12:26 2026] [error] [client 10.116.3.19] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Mon Sep 14 14:15:14 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp

[Tue Sep 15 08:31:19 2026] [error] [client 10.116.3.23] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/UsuarioAction

[Tue Sep 15 09:22:03 2026] [error] [client 10.116.3.23] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp

[Tue Sep 15 09:37:45 2026] [error] [client 10.116.3.27] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Tue Sep 15 09:48:27 2026] [error] [client 10.116.3.27] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp

[Tue Sep 15 10:15:45 2026] [error] [client 10.116.3.21] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Tue Sep 15 11:31:05 2026] [error] [client 10.116.3.26] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/

[Tue Sep 15 11:31:17 2026] [error] [client 10.116.3.27] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp

[Tue Sep 15 11:36:48 2026] [error] [client 10.116.3.23] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/Operacoes, referer: https://sicem-legado.des.caixa/sicem/UnidadeGestoraAction?parametro=telaListagem

[Tue Sep 15 13:42:27 2026] [error] [client 10.116.3.22] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp

[Tue Sep 15 14:29:46 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Tue Sep 15 15:02:40 2026] [error] [client 10.116.3.23] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp

[Tue Sep 15 15:55:17 2026] [error] [client 10.116.3.25] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp

[Tue Sep 15 16:32:24 2026] [error] [client 10.116.3.24] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp

[Tue Sep 15 17:03:40 2026] [error] [client 10.116.3.22] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Wed Sep 16 15:24:57 2026] [error] [client 10.116.3.20] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp

[Wed Sep 16 17:21:25 2026] [error] [client 10.116.3.27] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp

[Thu Sep 17 09:38:23 2026] [error] [client 10.116.3.22] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTra[Thu Sep 17 14:53:06 2026] [error] [client 10.116.3.26] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Thu Sep 17 14:58:29 2026] [error] [client 10.116.3.26] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Thu Sep 17 15:00:15 2026] [error] [client 10.116.3.24] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Thu Sep 17 15:00:22 2026] [error] [client 10.116.3.24] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Thu Sep 17 15:00:28 2026] [error] [client 10.116.3.28] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Thu Sep 17 15:00:31 2026] [error] [client 10.116.3.28] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Thu Sep 17 15:00:34 2026] [error] [client 10.116.3.28] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Thu Sep 17 15:00:46 2026] [error] [client 10.116.3.25] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Thu Sep 17 15:00:47 2026] [error] [client 10.116.3.25] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Thu Sep 17 15:00:50 2026] [error] [client 10.116.3.25] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Thu Sep 17 15:00:56 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Thu Sep 17 15:00:58 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Thu Sep 17 15:01:36 2026] [error] [client 10.116.3.23] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Thu Sep 17 15:01:48 2026] [error] [client 10.116.3.24] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Thu Sep 17 15:02:06 2026] [error] [client 10.116.3.27] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Thu Sep 17 15:03:00 2026] [error] [client 10.116.3.27] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Thu Sep 17 15:03:02 2026] [error] [client 10.116.3.27] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Thu Sep 17 15:03:04 2026] [error] [client 10.116.3.27] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Thu Sep 17 15:07:15 2026] [error] [client 10.116.3.25] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Thu Sep 17 15:07:19 2026] [error] [client 10.116.3.25] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Thu Sep 17 15:08:19 2026] [error] [client 10.116.3.25] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/sicem

[Thu Sep 17 15:09:43 2026] [error] [client 10.116.3.17] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Thu Sep 17 15:15:17 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Thu Sep 17 15:27:17 2026] [error] [client 10.116.3.27] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Thu Sep 17 15:27:33 2026] [error] [client 10.116.3.27] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/

[Thu Sep 17 15:27:33 2026] [error] [client 10.116.3.27] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Thu Sep 17 15:27:37 2026] [error] [client 10.116.3.27] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Thu Sep 17 15:27:39 2026] [error] [client 10.116.3.27] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Thu Sep 17 15:28:40 2026] [error] [client 10.116.3.25] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Thu Sep 17 15:29:13 2026] [error] [client 10.116.3.27] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/

[Thu Sep 17 15:38:03 2026] [error] [client 10.116.3.18] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Thu Sep 17 15:38:13 2026] [error] [client 10.116.3.18] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Thu Sep 17 16:06:27 2026] [error] [client 10.116.3.26] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Thu Sep 17 17:55:49 2026] [error] [client 10.116.3.24] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Thu Sep 17 18:28:03 2026] [error] [client 10.116.3.22] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Thu Sep 17 18:28:10 2026] [error] [client 10.116.3.22] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Fri Sep 18 07:50:57 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Fri Sep 18 09:38:53 2026] [error] [client 10.116.3.28] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/Principal.jsp

[Fri Sep 18 09:38:54 2026] [error] [client 10.116.3.28] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/UsuarioAction

[Fri Sep 18 09:39:02 2026] [error] [client 10.116.3.28] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Fri Sep 18 09:39:24 2026] [error] [client 10.116.3.25] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Fri Sep 18 09:42:35 2026] [error] [client 10.116.3.25] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Fri Sep 18 09:45:31 2026] [error] [client 10.116.3.17] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Fri Sep 18 09:47:30 2026] [error] [client 10.116.3.25] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Fri Sep 18 09:47:32 2026] [error] [client 10.116.3.25] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Fri Sep 18 09:52:08 2026] [error] [client 10.116.3.26] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/Principal.jsp

[Fri Sep 18 09:52:13 2026] [error] [client 10.116.3.26] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Fri Sep 18 09:52:14 2026] [error] [client 10.116.3.26] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Fri Sep 18 09:52:18 2026] [error] [client 10.116.3.26] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/Principal.jsp

[Fri Sep 18 09:54:42 2026] [error] [client 10.116.3.24] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Fri Sep 18 09:55:23 2026] [error] [client 10.116.3.26] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Fri Sep 18 09:57:21 2026] [error] [client 10.116.3.29] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/Principal.jsp

[Fri Sep 18 09:57:37 2026] [error] [client 10.116.3.28] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Fri Sep 18 09:57:41 2026] [error] [client 10.116.3.28] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Fri Sep 18 09:58:07 2026] [error] [client 10.116.3.24] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Fri Sep 18 09:58:10 2026] [error] [client 10.116.3.24] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Fri Sep 18 10:08:05 2026] [error] [client 10.116.3.20] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Fri Sep 18 10:08:07 2026] [error] [client 10.116.3.20] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/Principal.jsp

[Fri Sep 18 10:08:07 2026] [error] [client 10.116.3.20] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Fri Sep 18 10:35:29 2026] [error] [client 10.116.3.17] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/sicem/Principal.jsp

[Fri Sep 18 10:35:35 2026] [error] [client 10.116.3.17] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/sicem/Principal.jsp

[Fri Sep 18 10:41:31 2026] [error] [client 10.116.3.24] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/Principal.jsp

[Fri Sep 18 10:49:28 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Fri Sep 18 10:50:52 2026] [error] [client 10.116.3.17] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/Principal.jsp

[Fri Sep 18 10:51:04 2026] [error] [client 10.116.3.20] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Fri Sep 18 10:51:10 2026] [error] [client 10.116.3.20] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/Principal.jsp

[Fri Sep 18 10:54:10 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Fri Sep 18 10:55:24 2026] [error] [client 10.116.3.17] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Fri Sep 18 10:55:48 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

[Fri Sep 18 11:23:08 2026] [error] [client 10.116.3.19] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp

 

