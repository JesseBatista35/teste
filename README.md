
[root@sbrdeapllx104 servers]# file /opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-1.5.4.Final-redhat-1.jar
/opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-1.5.4.Final-redhat-1.jar: Zip archive data, at least v1.0 to extract
[root@sbrdeapllx104 servers]# xxd /opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-1.5.4.Final-redhat-1.jar | head -5
0000000: 504b 0304 0a00 0000 0000 dd5d 7545 0000  PK.........]uE..
0000010: 0000 0000 0000 0000 0000 0900 0000 4d45  ..............ME
0000020: 5441 2d49 4e46 2f50 4b03 040a 0000 0008  TA-INF/PK.......
0000030: 00dc 5d75 45e5 2758 aa1a 0300 0045 0900  ..]uE.'X.....E..
0000040: 0014 0000 004d 4554 412d 494e 462f 4d41  .....META-INF/MA
[root@sbrdeapllx104 servers]# md5sum /opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-1.5.4.Final-redhat-1.jar
b589584f1e51accc50f8685821b38929  /opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-1.5.4.Final-redhat-1.jar
[root@sbrdeapllx104 servers]# md5sum /upload/des/ambiente/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-1.5.4.Final-redhat-1.jar
b589584f1e51accc50f8685821b38929  /upload/des/ambiente/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-1.5.4.Final-redhat-1.jar
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]# ssh p585600@sbrdeapllx105 "unzip -t /opt/jboss/jboss-eap/modules_bkp2/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-1.5.4.Final-redhat-1.jar"
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
Archive:  /opt/jboss/jboss-eap/modules_bkp2/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-1.5.4.Final-redhat-1.jar
  End-of-central-directory signature not found.  Either this file is not
  a zipfile, or it constitutes one disk of a multi-part archive.  In the
  latter case the central directory and zipfile comment will be found on
  the last disk(s) of this archive.
note:  /opt/jboss/jboss-eap/modules_bkp2/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-1.5.4.Final-redhat-1.jar may be a plain executable, not an archive
unzip:  cannot find zipfile directory in one of /opt/jboss/jboss-eap/modules_bkp2/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-1.5.4.Final-redhat-1.jar or
        /opt/jboss/jboss-eap/modules_bkp2/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-1.5.4.Final-redhat-1.jar.zip, and cannot find /opt/jboss/jboss-eap/modules_bkp2/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-1.5.4.Final-redhat-1.jar.ZIP, period.
[root@sbrdeapllx104 servers]#
