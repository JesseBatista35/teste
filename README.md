
[p585600@cadsvitrlx100 ~]$ oc login --token=sha256~gkV_fhGrLveN2-je6wwd-Z9t2ELu37WlqnnpXVm7av8 --server=https://api.nprd.caixa:6443
-bash: oc: command not found
[p585600@cadsvitrlx100 ~]$
[p585600@cadsvitrlx100 ~]$
[p585600@cadsvitrlx100 ~]$ oc login --token=sha256~gkV_fhGrLveN2-je6wwd-Z9t2ELu37WlqnnpXVm7av8 --server=https://api.nprd.caixa:6443
-bash: oc: command not found
[p585600@cadsvitrlx100 ~]$
[p585600@cadsvitrlx100 ~]$
[p585600@cadsvitrlx100 ~]$
[p585600@cadsvitrlx100 ~]$ ssh 10.122.155.62
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
p585600@10.122.155.62's password:
Permission denied, please try again.
p585600@10.122.155.62's password:
Last failed login: Thu Nov 26 10:42:25 -03 2026 from 10.122.150.31 on ssh:notty
There was 1 failed login attempt since the last successful login.
Last login: Thu Nov 26 10:25:50 2026 from 10.122.150.31
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$




-sh-4.2$
-sh-4.2$ oc cp sisou-des/<pod>:/tmp/caixa-truststore-acteste-nprd-sisou-20261126.jks ./caixa-truststore-acteste-nprd-sisou-20261126.jks
-sh: pod: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pod -n sisou-des -l name=sisou-sac-okd-des
NAME                          READY     STATUS    RESTARTS   AGE
sisou-sac-okd-des-252-56hk7   1/1       Running   0          16h
-sh-4.2$
-sh-4.2$
-sh-4.2$ POD=sisou-sac-okd-des-252-56hk7
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc cp sisou-des/$POD:/tmp/caixa-truststore-acteste-nprd-sisou-20261126.jks ./caixa-truststore-acteste-nprd-sisou-20261126.jks
tar: Removing leading `/' from member names
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -n sisou-des $POD -c sisou-sac-okd-des -- cat /tmp/caixa-truststore-acteste-nprd-sisou-20261126.jks > caixa-truststore-acteste-nprd-sisou-20261126.jks
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -n sisou-des $POD -c sisou-sac-okd-des -- sha256sum /tmp/caixa-truststore-acteste-nprd-sisou-20261126.jks
3ce3284e8611f116dca761cadbc5a93e8068f5340b8d6a5e129bb4374ea3151d  /tmp/caixa-truststore-acteste-nprd-sisou-20261126.jks
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ sha256sum caixa-truststore-acteste-nprd-sisou-20261126.jks
3ce3284e8611f116dca761cadbc5a93e8068f5340b8d6a5e129bb4374ea3151d  caixa-truststore-acteste-nprd-sisou-20261126.jks
-sh-4.2$

