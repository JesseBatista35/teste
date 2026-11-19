
[p585600@cadsvitrlx100 ~]$
[p585600@cadsvitrlx100 ~]$ ssh 10.116.202.45
p585600@10.116.202.45's password:
Last login: Thu Nov 12 16:37:54 2026 from 10.122.150.31
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$ find / -name "*SenhasSIIBC*" 2>/dev/null
/tmp/crypto/br/gov/caixa/util/SenhasSIIBC.class
/tmp/crypto/br/gov/caixa/util/SenhasSIIBC.java
/tmp/SenhasSIIBC.class
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$ ps -ef | grep -v grep | grep -o "java.library.path=[^ ]*"
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$ scp p585600@10.116.88.96:/tmp/libSenhasSIIBC.so /tmp/
The authenticity of host '10.116.88.96 (10.116.88.96)' can't be established.
RSA key fingerprint is SHA256:4syI7cyn+8y4NieUzq5i1LX5sM/BfCSfRTH5Yn7TfcU.
This key is not known by any other names
Are you sure you want to continue connecting (yes/no/[fingerprint])? yes
Warning: Permanently added '10.116.88.96' (RSA) to the list of known hosts.
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
p585600@10.116.88.96's password:
libSenhasSIIBC.so                                                                                                                                                    100%   19KB  15.1MB/s   00:00
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$ md5sum /tmp/libSenhasSIIBC.so
9f4b9758ac4f4c75cd9e7cf6826eed38  /tmp/libSenhasSIIBC.so
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$
