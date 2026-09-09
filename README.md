
[root@sbrdeapllx104 servers]# getent hosts sbrdeapllx105
10.116.94.212   sbrdeapllx105.extra.caixa.gov.br
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]# ssh p585600@sbrdeapllx105 "unzip -t /opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-1.5.4.Final-redhat-1.jar"
The authenticity of host 'sbrdeapllx105 (10.116.94.212)' can't be established.
ECDSA key fingerprint is SHA256:YDb/hgF/FAeuRp1uwYjmoDHgYrwpukpUPXSHm1OjuEY.
ECDSA key fingerprint is MD5:f7:b7:f2:c4:86:1e:79:a8:fe:5e:66:e2:27:1b:b4:e8.
Are you sure you want to continue connecting (yes/no)?
Host key verification failed.
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]# ssh p585600@sbrdeapllx105 "unzip -t /opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-1.5.4.Final-redhat-1.jar"
The authenticity of host 'sbrdeapllx105 (10.116.94.212)' can't be established.
ECDSA key fingerprint is SHA256:YDb/hgF/FAeuRp1uwYjmoDHgYrwpukpUPXSHm1OjuEY.
ECDSA key fingerprint is MD5:f7:b7:f2:c4:86:1e:79:a8:fe:5e:66:e2:27:1b:b4:e8.
Are you sure you want to continue connecting (yes/no)? yes
Warning: Permanently added 'sbrdeapllx105,10.116.94.212' (ECDSA) to the list of known hosts.
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
p585600@sbrdeapllx105's password:
unzip:  cannot find or open /opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-1.5.4.Final-redhat-1.jar, /opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-1.5.4.Final-redhat-1.jar.zip or /opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-1.5.4.Final-redhat-1.jar.ZIP.
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
