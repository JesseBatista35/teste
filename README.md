oot@sbrdeaprlx0001 p585600]#
[root@sbrdeaprlx0001 p585600]#
[root@sbrdeaprlx0001 p585600]# grep -rl "sicem-legado" /etc/httpd/*.conf
[root@sbrdeaprlx0001 p585600]#
[root@sbrdeaprlx0001 p585600]#
[root@sbrdeaprlx0001 p585600]# tail -n 200 /logs/apache2/SICEM/sicem-legado.des.caixa-error.log
[Tue Sep 01 12:17:12 2026] [error] [client 10.116.3.26] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp
[Tue Sep 01 13:58:28 2026] [error] [client 10.116.3.28] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Tue Sep 01 14:08:54 2026] [error] [client 10.116.3.22] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Tue Sep 01 14:23:19 2026] [error] [client 10.116.3.29] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Tue Sep 01 16:06:56 2026] [error] [client 10.116.3.18] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Tue Sep 01 16:07:11 2026] [error] [client 10.116.3.19] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp
[Wed Sep 02 08:22:35 2026] [error] [client 10.116.3.23] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Wed Sep 02 09:10:09 2026] [error] [client 10.116.3.25] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Wed Sep 02 09:39:50 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/Principal.jsp
[Wed Sep 02 13:54:46 2026] [error] [client 10.116.3.27] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Wed Sep 02 16:29:25 2026] [error] [client 10.116.3.23] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Wed Sep 02 16:36:51 2026] [error] [client 10.116.3.21] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp
[Wed Sep 02 16:58:15 2026] [error] [client 10.116.3.25] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/
[Wed Sep 02 17:42:30 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 03 08:58:04 2026] [error] [client 10.116.3.23] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/Principal.jsp
[Thu Sep 03 11:59:45 2026] [error] [client 10.116.3.17] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 03 12:00:09 2026] [error] [client 10.116.3.23] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp
[Thu Sep 03 12:01:54 2026] [error] [client 10.116.3.26] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/Principal.jsp
[Thu Sep 03 13:04:10 2026] [error] [client 10.116.3.25] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 03 13:44:54 2026] [error] [client 10.116.3.25] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 03 14:00:45 2026] [error] [client 10.116.3.25] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp
[Thu Sep 03 14:01:57 2026] [error] [client 10.116.3.17] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 03 14:02:11 2026] [error] [client 10.116.3.20] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp
[Thu Sep 03 16:02:08 2026] [error] [client 10.116.3.20] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp
[Thu Sep 03 16:08:53 2026] [error] [client 10.116.3.21] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 03 16:26:32 2026] [error] [client 10.116.3.24] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 03 16:26:48 2026] [error] [client 10.116.3.17] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp
[Thu Sep 03 16:37:00 2026] [error] [client 10.116.3.22] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 03 16:44:21 2026] [error] [client 10.116.3.17] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 03 16:59:53 2026] [error] [client 10.116.3.20] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 03 17:27:57 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 03 17:37:45 2026] [error] [client 10.116.3.26] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 03 18:52:18 2026] [error] [client 10.116.3.20] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp
[Thu Sep 03 19:36:40 2026] [error] [client 10.116.3.29] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp
[Thu Sep 03 19:49:56 2026] [error] [client 10.116.3.21] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 03 20:00:35 2026] [error] [client 10.116.3.29] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/sicem, referer: https://sicem-legado.des.caixa/sicem/PrincipalForward.jsp?page=/Operacoes/SolicitarImpressao.jsp&funcid=33&titulo=OPERA%C3%87%C3%83O%20MANUAL
[Thu Sep 03 20:08:37 2026] [error] [client 10.116.3.21] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 03 21:22:18 2026] [error] [client 10.116.3.20] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp
[Thu Sep 03 21:24:52 2026] [error] [client 10.116.3.26] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 03 22:00:25 2026] [error] [client 10.116.3.23] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 04 08:37:03 2026] [error] [client 10.116.3.26] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 04 09:04:01 2026] [error] [client 10.116.3.29] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 04 12:21:02 2026] [error] [client 10.116.3.26] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 04 12:34:31 2026] [error] [client 10.116.3.18] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp
[Fri Sep 04 12:36:31 2026] [error] [client 10.116.3.18] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 04 14:15:19 2026] [error] [client 10.116.3.27] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp
[Fri Sep 04 15:46:16 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp
[Fri Sep 04 16:03:54 2026] [error] [client 10.116.3.22] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 04 16:23:24 2026] [error] [client 10.116.3.27] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 04 16:34:09 2026] [error] [client 10.116.3.22] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 04 16:38:26 2026] [error] [client 10.116.3.26] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 04 16:59:44 2026] [error] [client 10.116.3.23] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp
[Fri Sep 04 17:20:32 2026] [error] [client 10.116.3.19] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 04 18:15:47 2026] [error] [client 10.116.3.22] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/
[Fri Sep 04 18:20:46 2026] [error] [client 10.116.3.24] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 04 18:20:46 2026] [error] [client 10.116.3.24] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/
[Fri Sep 04 18:21:14 2026] [error] [client 10.116.3.17] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/UsuarioAction
[Fri Sep 04 18:29:16 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 04 18:34:52 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 04 18:34:54 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 04 18:35:14 2026] [error] [client 10.116.3.21] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 04 18:43:50 2026] [error] [client 10.116.3.26] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 04 18:44:44 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp
[Fri Sep 04 19:08:38 2026] [error] [client 10.116.3.22] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp
[Fri Sep 04 19:13:23 2026] [error] [client 10.116.3.23] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 04 19:39:28 2026] [error] [client 10.116.3.23] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 04 19:46:22 2026] [error] [client 10.116.3.17] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp
[Fri Sep 04 19:48:48 2026] [error] [client 10.116.3.28] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 04 19:58:27 2026] [error] [client 10.116.3.26] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/RelatorioOperacionaisAction?parametro=pacoteCorporativo
[Fri Sep 04 19:59:33 2026] [error] [client 10.116.3.29] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/RelatorioOperacionaisAction?parametro=pacoteCorporativo
[Fri Sep 04 20:00:28 2026] [error] [client 10.116.3.18] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/sicem, referer: https://sicem-legado.des.caixa/sicem/FuncionalidadeAction?funcionalidade=13&link=/RelatorioAction?parametro=operacional
[Fri Sep 04 20:00:33 2026] [error] [client 10.116.3.18] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/sicem, referer: https://sicem-legado.des.caixa/sicem/FuncionalidadeAction?funcionalidade=13&link=/RelatorioAction?parametro=operacional
[Fri Sep 04 20:00:36 2026] [error] [client 10.116.3.18] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/sicem, referer: https://sicem-legado.des.caixa/sicem/PrincipalForward.jsp?page=/RelatorioAction?parametro=operacional&funcid=13&titulo=RELAT%C3%93RIOS%20OPERACIONAIS
[Fri Sep 04 20:01:04 2026] [error] [client 10.116.3.25] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp
[Fri Sep 04 20:10:05 2026] [error] [client 10.116.3.23] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 04 22:58:19 2026] [error] [client 10.116.3.25] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Mon Sep 07 20:20:49 2026] [error] [client 10.116.3.26] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Mon Sep 07 20:20:49 2026] [error] [client 10.116.3.26] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/UsuarioAction
[Mon Sep 07 21:19:33 2026] [error] [client 10.116.3.18] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Mon Sep 07 22:13:28 2026] [error] [client 10.116.3.29] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/UsuarioAction
[Tue Sep 08 10:36:11 2026] [error] [client 10.116.3.18] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Tue Sep 08 10:36:11 2026] [error] [client 10.116.3.18] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/Principal.jsp
[Tue Sep 08 12:04:19 2026] [error] [client 10.116.3.18] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/UsuarioAction
[Tue Sep 08 12:04:44 2026] [error] [client 10.116.3.29] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp
[Tue Sep 08 12:10:20 2026] [error] [client 10.116.3.21] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Tue Sep 08 12:36:30 2026] [error] [client 10.116.3.20] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Tue Sep 08 13:58:39 2026] [error] [client 10.116.3.24] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/RelatorioOperacionaisAction?parametro=operacionalPacoteCorporativo
[Tue Sep 08 13:58:40 2026] [error] [client 10.116.3.24] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Tue Sep 08 13:58:54 2026] [error] [client 10.116.3.17] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Tue Sep 08 14:05:21 2026] [error] [client 10.116.3.23] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Tue Sep 08 15:05:49 2026] [error] [client 10.116.3.24] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Tue Sep 08 15:19:11 2026] [error] [client 10.116.3.19] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/
[Tue Sep 08 15:22:00 2026] [error] [client 10.116.3.17] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Tue Sep 08 17:35:44 2026] [error] [client 10.116.3.26] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/
[Tue Sep 08 17:38:23 2026] [error] [client 10.116.3.20] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Wed Sep 09 11:20:30 2026] [error] [client 10.116.3.26] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Wed Sep 09 11:27:41 2026] [error] [client 10.116.3.20] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Wed Sep 09 11:29:13 2026] [error] [client 10.116.3.22] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp
[Wed Sep 09 11:32:54 2026] [error] [client 10.116.3.17] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Wed Sep 09 16:25:11 2026] [error] [client 10.116.3.17] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp
[Wed Sep 09 16:45:48 2026] [error] [client 10.116.3.25] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
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
[root@sbrdeaprlx0001 p585600]#
[root@sbrdeaprlx0001 p585600]# grep -rl "sicem-legado" /etc/httpd/ 2>/dev/null
/etc/httpd/sites-avaliable/.httpd-sicem-legado.conf.swp
/etc/httpd/sites-avaliable/httpd-sicem-legado.conf
/etc/httpd/sites-enabled/eap_des_64/.httpd-sicem-legado.conf.20260310130356.a590589
[root@sbrdeaprlx0001 p585600]#
[root@sbrdeaprlx0001 p585600]# ls /logs/apache2/SICEM/ 2>/dev/null
sicem-legado.des.caixa-access.log  sicem-legado.des.caixa-error.log
[root@sbrdeaprlx0001 p585600]#


@sbrdeaprlx0002 p585600]#
[root@sbrdeaprlx0002 p585600]#
[root@sbrdeaprlx0002 p585600]#
[root@sbrdeaprlx0002 p585600]# grep -rl "sicem-legado" /etc/httpd/*.conf
[root@sbrdeaprlx0002 p585600]#
[root@sbrdeaprlx0002 p585600]#
[root@sbrdeaprlx0002 p585600]#
[root@sbrdeaprlx0002 p585600]# cd /logs/apache2/httpd_eap_des_64/
access.log  error.log   jk.log
[root@sbrdeaprlx0002 p585600]# cd /logs/apache2/httpd_eap_des_64/
[root@sbrdeaprlx0002 httpd_eap_des_64]#
[root@sbrdeaprlx0002 httpd_eap_des_64]#
[root@sbrdeaprlx0002 httpd_eap_des_64]# cd ..
[root@sbrdeaprlx0002 apache2]# cd /etc/httpd/logs/eap
eap7_des/               eap_des_64/             eap_des_empresarial_64/ eap_des_financeiro_64/  eap_des_habitacao_64/   eap_prodt_64/
[root@sbrdeaprlx0002 apache2]# cd /etc/httpd/logs/eap_des_64/manager.
manager.balancer.balancers         manager.context.contexts.lock      manager.host.hosts                 manager.jgroupsid.jgroupsids.lock  manager.sessionid.sessionid
manager.balancer.balancers.lock    manager.domain.domain              manager.host.hosts.lock            manager.node.nodes                 manager.sessionid.sessionid.lock
manager.context.contexts           manager.domain.domain.lock         manager.jgroupsid.jgroupsids       manager.node.nodes.lock
[root@sbrdeaprlx0002 apache2]# ^C
[root@sbrdeaprlx0002 apache2]# cd /logs/apache2/SICEM/sicem-legado.des.caixa-
sicem-legado.des.caixa-access.log  sicem-legado.des.caixa-error.log
[root@sbrdeaprlx0002 apache2]# cd /logs/apache2/SICEM/sicem-legado.des.caixa-
sicem-legado.des.caixa-access.log  sicem-legado.des.caixa-error.log
[root@sbrdeaprlx0002 apache2]# cd /logs/apache2/SICEM/sicem-legado.des.caixa-access.log
bash: cd: /logs/apache2/SICEM/sicem-legado.des.caixa-access.log: Not a directory
[root@sbrdeaprlx0002 apache2]# tail -n 200 /logs/apache2/SICEM/sicem-legado.des.caixa-error.log
[Fri Sep 04 19:53:37 2026] [error] [client 10.116.3.17] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/RelatorioOperacionaisAction?parametro=pesquisaDocumentos
[Fri Sep 04 20:00:25 2026] [error] [client 10.116.3.29] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/sicem/MantemSessao.jsp, referer: https://sicem-legado.des.caixa/sicem/PrincipalForward.jsp?page=/RelatorioAction?parametro=operacional&funcid=13&titulo=RELAT%C3%93RIOS%20OPERACIONAIS
[Fri Sep 04 20:00:33 2026] [error] [client 10.116.3.29] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/sicem/RelatorioOperacionaisAction, referer: https://sicem-legado.des.caixa/sicem/FuncionalidadeAction?funcionalidade=13&link=/RelatorioAction?parametro=operacional
[Fri Sep 04 20:00:39 2026] [error] [client 10.116.3.22] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/sicem/rc, referer: https://sicem-legado.des.caixa/sicem/PrincipalForward.jsp?page=/RelatorioAction?parametro=operacional&funcid=13&titulo=RELAT%C3%93RIOS%20OPERACIONAIS
[Fri Sep 04 20:00:50 2026] [error] [client 10.116.3.19] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/FuncionalidadeAction?funcionalidade=13&link=/RelatorioAction?parametro=operacional
[Fri Sep 04 20:00:52 2026] [error] [client 10.116.3.19] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 04 20:01:07 2026] [error] [client 10.116.3.29] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 04 20:01:45 2026] [error] [client 10.116.3.19] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/RelatorioOperacionaisAction?parametro=detalhePacoteCorporativo
[Fri Sep 04 20:01:50 2026] [error] [client 10.116.3.19] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/RelatorioOperacionaisAction?parametro=detalhePacoteCorporativo
[Fri Sep 04 20:02:34 2026] [error] [client 10.116.3.27] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/RelatorioOperacionaisAction?parametro=detalhePacoteCorporativo
[Fri Sep 04 20:10:05 2026] [error] [client 10.116.3.19] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/UsuarioAction
[Fri Sep 04 20:10:25 2026] [error] [client 10.116.3.24] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp
[Fri Sep 04 20:57:54 2026] [error] [client 10.116.3.21] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 04 21:06:20 2026] [error] [client 10.116.3.20] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp
[Fri Sep 04 21:20:14 2026] [error] [client 10.116.3.19] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 04 22:41:54 2026] [error] [client 10.116.3.17] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 04 22:58:34 2026] [error] [client 10.116.3.28] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp
[Mon Sep 07 20:22:19 2026] [error] [client 10.116.3.28] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp
[Mon Sep 07 20:43:18 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Mon Sep 07 22:02:52 2026] [error] [client 10.116.3.17] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Mon Sep 07 22:13:28 2026] [error] [client 10.116.3.20] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Tue Sep 08 11:35:46 2026] [error] [client 10.116.3.28] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Tue Sep 08 11:35:46 2026] [error] [client 10.116.3.28] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/
[Tue Sep 08 12:04:19 2026] [error] [client 10.116.3.24] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Tue Sep 08 12:10:20 2026] [error] [client 10.116.3.23] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/
[Tue Sep 08 13:58:52 2026] [error] [client 10.116.3.19] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp
[Tue Sep 08 14:05:34 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp
[Tue Sep 08 14:40:03 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Tue Sep 08 15:19:11 2026] [error] [client 10.116.3.23] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Tue Sep 08 15:22:17 2026] [error] [client 10.116.3.19] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp
[Tue Sep 08 15:22:38 2026] [error] [client 10.116.3.23] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Tue Sep 08 15:22:54 2026] [error] [client 10.116.3.24] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp
[Tue Sep 08 15:23:00 2026] [error] [client 10.116.3.24] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Tue Sep 08 15:23:10 2026] [error] [client 10.116.3.28] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp
[Tue Sep 08 15:24:44 2026] [error] [client 10.116.3.20] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp
[Tue Sep 08 17:35:44 2026] [error] [client 10.116.3.18] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Tue Sep 08 17:38:32 2026] [error] [client 10.116.3.26] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp
[Tue Sep 08 17:39:53 2026] [error] [client 10.116.3.26] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Wed Sep 09 11:20:30 2026] [error] [client 10.116.3.26] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/Principal.jsp
[Wed Sep 09 11:27:42 2026] [error] [client 10.116.3.22] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/
[Wed Sep 09 11:33:02 2026] [error] [client 10.116.3.27] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp
[Wed Sep 09 16:25:02 2026] [error] [client 10.116.3.21] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Wed Sep 09 16:45:45 2026] [error] [client 10.116.3.18] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp
[Thu Sep 10 11:30:12 2026] [error] [client 10.116.3.23] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/Principal.jsp
[Thu Sep 10 13:39:57 2026] [error] [client 10.116.3.23] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/Principal.jsp
[Thu Sep 10 14:12:51 2026] [error] [client 10.116.3.22] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp
[Thu Sep 10 14:13:16 2026] [error] [client 10.116.3.19] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 10 15:10:46 2026] [error] [client 10.116.3.23] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 10 15:35:22 2026] [error] [client 10.116.3.29] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Mon Sep 14 09:38:59 2026] [error] [client 10.116.3.21] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Mon Sep 14 13:12:26 2026] [error] [client 10.116.3.23] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/
[Mon Sep 14 13:12:35 2026] [error] [client 10.116.3.23] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp
[Mon Sep 14 14:15:01 2026] [error] [client 10.116.3.23] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Mon Sep 14 14:28:33 2026] [error] [client 10.116.3.24] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Tue Sep 15 08:31:19 2026] [error] [client 10.116.3.20] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Tue Sep 15 10:40:47 2026] [error] [client 10.116.3.25] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp
[Tue Sep 15 10:57:45 2026] [error] [client 10.116.3.17] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Tue Sep 15 11:03:00 2026] [error] [client 10.116.3.27] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/Bemvindo.jsp
[Tue Sep 15 11:31:04 2026] [error] [client 10.116.3.18] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Tue Sep 15 11:31:29 2026] [error] [client 10.116.3.29] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/Operacoes, referer: https://sicem-legado.des.caixa/sicem/UnidadeGestoraAction?parametro=telaListagem
[Tue Sep 15 12:24:45 2026] [error] [client 10.116.3.17] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Tue Sep 15 15:34:46 2026] [error] [client 10.116.3.21] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Tue Sep 15 16:20:36 2026] [error] [client 10.116.3.22] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Wed Sep 16 15:22:30 2026] [error] [client 10.116.3.24] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/UsuarioAction
[Wed Sep 16 17:21:02 2026] [error] [client 10.116.3.26] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 09:38:23 2026] [error] [client 10.116.3.20] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/
[Thu Sep 17 09:43:28 2026] [error] [client 10.116.3.24] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 09:43:48 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 10:16:21 2026] [error] [client 10.116.3.28] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/UsuarioAction
[Thu Sep 17 10:19:30 2026] [error] [client 10.116.3.17] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 10:19:52 2026] [error] [client 10.116.3.20] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 10:19:53 2026] [error] [client 10.116.3.19] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 10:19:59 2026] [error] [client 10.116.3.19] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 10:21:28 2026] [error] [client 10.116.3.21] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 10:21:29 2026] [error] [client 10.116.3.21] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 10:21:30 2026] [error] [client 10.116.3.21] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 11:02:27 2026] [error] [client 10.116.3.20] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem
[Thu Sep 17 11:03:56 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 12:58:06 2026] [error] [client 10.116.3.24] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 13:01:00 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 13:01:03 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 13:01:03 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 13:02:03 2026] [error] [client 10.116.3.29] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 13:02:03 2026] [error] [client 10.116.3.29] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 13:02:05 2026] [error] [client 10.116.3.28] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 13:02:06 2026] [error] [client 10.116.3.28] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 13:02:06 2026] [error] [client 10.116.3.28] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 13:45:44 2026] [error] [client 10.116.3.19] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/Principal.jsp
[Thu Sep 17 14:14:01 2026] [error] [client 10.116.3.21] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/UsuarioAction
[Thu Sep 17 14:14:26 2026] [error] [client 10.116.3.25] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 14:16:55 2026] [error] [client 10.116.3.28] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 14:23:52 2026] [error] [client 10.116.3.29] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/
[Thu Sep 17 14:25:19 2026] [error] [client 10.116.3.18] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 14:25:46 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 14:25:52 2026] [error] [client 10.116.3.17] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 14:25:54 2026] [error] [client 10.116.3.17] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 14:29:13 2026] [error] [client 10.116.3.18] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/Principal.jsp
[Thu Sep 17 14:29:14 2026] [error] [client 10.116.3.18] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/Principal.jsp
[Thu Sep 17 14:30:02 2026] [error] [client 10.116.3.19] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/Principal.jsp
[Thu Sep 17 14:34:14 2026] [error] [client 10.116.3.28] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 14:34:19 2026] [error] [client 10.116.3.28] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 14:34:31 2026] [error] [client 10.116.3.17] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 14:34:32 2026] [error] [client 10.116.3.17] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 14:34:33 2026] [error] [client 10.116.3.17] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 14:34:36 2026] [error] [client 10.116.3.28] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 14:43:05 2026] [error] [client 10.116.3.27] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/UsuarioAction
[Thu Sep 17 14:43:10 2026] [error] [client 10.116.3.27] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/UsuarioAction
[Thu Sep 17 14:43:11 2026] [error] [client 10.116.3.27] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/UsuarioAction
[Thu Sep 17 14:43:12 2026] [error] [client 10.116.3.27] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/UsuarioAction
[Thu Sep 17 14:43:12 2026] [error] [client 10.116.3.19] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/UsuarioAction
[Thu Sep 17 14:43:18 2026] [error] [client 10.116.3.19] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/UsuarioAction
[Thu Sep 17 14:43:18 2026] [error] [client 10.116.3.19] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/UsuarioAction
[Thu Sep 17 14:43:19 2026] [error] [client 10.116.3.19] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/UsuarioAction
[Thu Sep 17 14:43:20 2026] [error] [client 10.116.3.19] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/UsuarioAction
[Thu Sep 17 14:43:21 2026] [error] [client 10.116.3.19] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/UsuarioAction
[Thu Sep 17 14:43:22 2026] [error] [client 10.116.3.19] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 14:43:24 2026] [error] [client 10.116.3.19] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/UsuarioAction
[Thu Sep 17 14:43:25 2026] [error] [client 10.116.3.19] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/UsuarioAction
[Thu Sep 17 14:45:21 2026] [error] [client 10.116.3.19] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 14:46:00 2026] [error] [client 10.116.3.22] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 14:47:17 2026] [error] [client 10.116.3.20] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 14:47:20 2026] [error] [client 10.116.3.20] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 14:51:27 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 14:51:32 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 14:51:33 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 14:53:01 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 14:53:04 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 14:53:04 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 14:53:43 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 14:58:20 2026] [error] [client 10.116.3.17] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 14:58:34 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 15:00:18 2026] [error] [client 10.116.3.24] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 15:00:36 2026] [error] [client 10.116.3.25] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 15:00:42 2026] [error] [client 10.116.3.17] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 15:00:46 2026] [error] [client 10.116.3.18] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 15:00:46 2026] [error] [client 10.116.3.18] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 15:00:47 2026] [error] [client 10.116.3.18] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 15:00:49 2026] [error] [client 10.116.3.18] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 15:00:49 2026] [error] [client 10.116.3.18] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 15:00:55 2026] [error] [client 10.116.3.18] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 15:00:56 2026] [error] [client 10.116.3.18] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 15:00:57 2026] [error] [client 10.116.3.18] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 15:00:58 2026] [error] [client 10.116.3.18] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 15:01:09 2026] [error] [client 10.116.3.17] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 15:09:25 2026] [error] [client 10.116.3.22] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 15:15:08 2026] [error] [client 10.116.3.20] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/
[Thu Sep 17 15:27:22 2026] [error] [client 10.116.3.25] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 15:27:36 2026] [error] [client 10.116.3.25] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 15:27:38 2026] [error] [client 10.116.3.25] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/
[Thu Sep 17 15:28:50 2026] [error] [client 10.116.3.23] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/
[Thu Sep 17 15:38:08 2026] [error] [client 10.116.3.27] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 15:38:15 2026] [error] [client 10.116.3.27] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 16:06:31 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/UsuarioAction
[Thu Sep 17 16:06:55 2026] [error] [client 10.116.3.22] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 17:55:46 2026] [error] [client 10.116.3.24] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/UsuarioAction
[Thu Sep 17 18:12:52 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Thu Sep 17 18:28:08 2026] [error] [client 10.116.3.18] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/UsuarioAction
[Fri Sep 18 07:50:36 2026] [error] [client 10.116.3.19] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/UsuarioAction
[Fri Sep 18 07:50:52 2026] [error] [client 10.116.3.21] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 18 07:51:09 2026] [error] [client 10.116.3.26] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 18 07:51:19 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/UsuarioAction
[Fri Sep 18 09:17:36 2026] [error] [client 10.116.3.17] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 18 09:27:36 2026] [error] [client 10.116.3.20] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 18 09:38:54 2026] [error] [client 10.116.3.22] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 18 09:38:57 2026] [error] [client 10.116.3.22] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 18 09:39:00 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 18 09:39:05 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 18 09:41:37 2026] [error] [client 10.116.3.26] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/Principal.jsp
[Fri Sep 18 09:45:24 2026] [error] [client 10.116.3.29] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 18 09:47:29 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 18 09:47:31 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/Principal.jsp
[Fri Sep 18 09:48:11 2026] [error] [client 10.116.3.24] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 18 09:51:42 2026] [error] [client 10.116.3.30] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 18 09:52:08 2026] [error] [client 10.116.3.22] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 18 09:52:10 2026] [error] [client 10.116.3.22] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 18 09:52:13 2026] [error] [client 10.116.3.22] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/Principal.jsp
[Fri Sep 18 09:52:17 2026] [error] [client 10.116.3.22] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 18 09:52:19 2026] [error] [client 10.116.3.22] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 18 09:54:45 2026] [error] [client 10.116.3.22] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 18 09:57:22 2026] [error] [client 10.116.3.20] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 18 09:57:40 2026] [error] [client 10.116.3.26] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 18 09:57:50 2026] [error] [client 10.116.3.29] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 18 09:58:06 2026] [error] [client 10.116.3.17] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/Principal.jsp
[Fri Sep 18 09:58:09 2026] [error] [client 10.116.3.17] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/Principal.jsp
[Fri Sep 18 10:06:23 2026] [error] [client 10.116.3.17] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/Principal.jsp
[Fri Sep 18 10:08:03 2026] [error] [client 10.116.3.23] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/Principal.jsp
[Fri Sep 18 10:09:40 2026] [error] [client 10.116.3.17] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 18 10:09:43 2026] [error] [client 10.116.3.17] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/Principal.jsp
[Fri Sep 18 10:09:43 2026] [error] [client 10.116.3.17] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 18 10:10:16 2026] [error] [client 10.116.3.27] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/Principal.jsp
[Fri Sep 18 10:11:01 2026] [error] [client 10.116.3.19] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 18 10:35:28 2026] [error] [client 10.116.3.24] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/Principal.jsp
[Fri Sep 18 10:35:31 2026] [error] [client 10.116.3.25] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/sicem/Principal.jsp
[Fri Sep 18 10:35:33 2026] [error] [client 10.116.3.25] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/sicem/Principal.jsp
[Fri Sep 18 10:35:36 2026] [error] [client 10.116.3.25] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/sicem/Principal.jsp
[Fri Sep 18 10:41:31 2026] [error] [client 10.116.3.21] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/sicem/Principal.jsp
[Fri Sep 18 10:47:22 2026] [error] [client 10.116.3.21] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/sicem/Principal.jsp
[Fri Sep 18 10:49:15 2026] [error] [client 10.116.3.19] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/favicon.ico, referer: https://sicem-legado.des.caixa/sicem/Principal.jsp
[Fri Sep 18 10:51:12 2026] [error] [client 10.116.3.18] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[Fri Sep 18 10:54:21 2026] [error] [client 10.116.3.21] File does not exist: /etc/httpd/htdocs/httpd_eap_des_64/css, referer: https://sicem-legado.des.caixa/sicem/AreaTrabalho.jsp
[root@sbrdeaprlx0002 apache2]#
[root@sbrdeaprlx0002 apache2]# grep -rl "sicem-legado" /etc/httpd/ 2>/dev/null
/etc/httpd/sites-avaliable/httpd-sicem-legado.conf
[root@sbrdeaprlx0002 apache2]#
[root@sbrdeaprlx0002 apache2]# ls /logs/apache2/SICEM/ 2>/dev/null
sicem-legado.des.caixa-access.log  sicem-legado.des.caixa-error.log
[root@sbrdeaprlx0002 apache2]#



