scp SicemWEB_6.1.0.11.31.war p585600@10.116.88.24:/caixa/usr/p585600/

ssh p585600@10.116.88.24
ls -la /caixa/usr/p585600/SicemWEB_6.1.0.11.31.war




/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.88.20:9999

deploy /caixa/usr/p585600/SicemWEB_6.1.0.11.31.war --server-groups=<nome_do_server_group>




[p585600@cadsvitrlx100 ~]$ scp SicemWEB_6.1.0.11.31.war p585600@10.116.88.24:/caixa/usr/p585600/
***********************************************************************
(1) - Este e um computador privado de propriedade da Caixa Economica
Federal. Usuarios autorizados e nao autorizados nao possuem direitos de
divulgar as informacoes contidas aqui.
(2) - Ao fazer uso do sistema, o usuario esta ciente que pode estar
sendo monitorado, interceptado e auditado pelo departamento competente
da Caixa Economica Federal.
(3) - O uso nao autorizado ou improprio deste sistema pode resultar em
um processo disciplinar administrativo e/ou punicao atraves de acoes
civis ou criminais. Ao continuar o uso deste sistema, indica que voce
esta ciente e concordando com os termos e condicoes acima descritos.

Pressione <Control+D> IMEDIATAMENTE se voce nao concorda com as
condicoes deste aviso
***********************************************************************
p585600@10.116.88.24's password:
dest open("/caixa/usr/p585600/"): No such file or directory
failed to upload file SicemWEB_6.1.0.11.31.war to /caixa/usr/p585600/
[p585600@cadsvitrlx100 ~]$






acho que no destino tem que jogar dentro da pasta tmp
