
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$ sudo systemctl daemon-reload
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$ sudo systemctl list-units --all | grep -i sirpl
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$ ls -la /etc/init.d/ | grep -i sirpl
[p585600@srjdeapllx0051 ~]$ chkconfig --list | grep -i sirpl

Note: This output shows SysV services only and does not include native
      systemd services. SysV configuration data might be overridden by native
      systemd configuration.

      If you want to list systemd services use 'systemctl list-unit-files'.
      To see services enabled on particular target use
      'systemctl list-dependencies [target]'.

[p585600@srjdeapllx0051 ~]$ sudo chkconfig <nome_do_servico> off
-bash: nome_do_servico: No such file or directory
[p585600@srjdeapllx0051 ~]$ sudo /etc/init.d/<nome_do_servico> stop
-bash: nome_do_servico: No such file or directory
[p585600@srjdeapllx0051 ~]$ ps -ef | grep sirpl
p585600   95843  93588  0 15:59 pts/7    00:00:00 grep --color=auto sirpl
[p585600@srjdeapllx0051 ~]$ sudo netstat -tulnp | grep 8601
[p585600@srjdeapllx0051 ~]$ sudo mv /opt/open/apache/2.4.6/https-sirpl.des.intra.corerj.caixa8601 /opt/open/apache/2.4.6/https-sirpl.des.intra.corerj.caixa8601.desmobilizado_20260616
mv: cannot stat ‘/opt/open/apache/2.4.6/https-sirpl.des.intra.corerj.caixa8601’: No such file or directory
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$
[p585600@srjdeapllx0051 ~]$ exit
logout
Connection to 10.116.88.212 closed.
[p585600@cadsvitrlx100 ~]$ ssh 10.116.24.142
The authenticity of host '10.116.24.142 (10.116.24.142)' can't be established.
ED25519 key fingerprint is SHA256:EzZ3EYpT6gjrmqgF34DVphV3a4wxhiiNs5rCvdWaafU.
This key is not known by any other names
Are you sure you want to continue connecting (yes/no/[fingerprint])? yes
Warning: Permanently added '10.116.24.142' (ED25519) to the list of known hosts.
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
p585600@10.116.24.142's password:
,Creating directory '/export/home/p585600'.
,[p585600@srjtqapllx0018 ~]$ exit
logout
Connection to 10.116.24.142 closed.
[p585600@cadsvitrlx100 ~]$ ssh 10.116.20.76
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
p585600@10.116.20.76's password:
Last login: Tue Sep  8 15:39:00 2026 from 10.122.150.31
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$ sudo systemctl list-units --all | grep -i sirpl
sudo: systemctl: command not found
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$ ps -ef | grep -i node
p585600  125223 124933  0 16:02 pts/1    00:00:00 grep -i node
[p585600@srjtqaprlx015 ~]$
