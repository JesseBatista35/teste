scp OpenJDK17U-jdk_x64_linux_hotspot_17.0.19_10.tar.gz p585600@caddeapllx1369.agil.nprd.caixa.gov.br:/tmp/


ls -la /tmp/OpenJDK17U-jdk_x64_linux_hotspot_17.0.19_10.tar.gz


sudo mkdir -p /usr/lib/jvm
sudo tar -xzf /tmp/OpenJDK17U-jdk_x64_linux_hotspot_17.0.19_10.tar.gz -C /usr/lib/jvm/
ls /usr/lib/jvm/



p585600@10.122.155.66's password:
OpenJDK17U-jdk_x64_linux_hotspot_17.0.19_10.tar.gz                                                                                                             100%  184MB 705.1MB/s   00:00
[p585600@cadsvitrlx100 ~]$ ls -la /tmp/OpenJDK17U-jdk_x64_linux_hotspot_17.0.19_10.tar.gz
ls: cannot access '/tmp/OpenJDK17U-jdk_x64_linux_hotspot_17.0.19_10.tar.gz': No such file or directory
[p585600@cadsvitrlx100 ~]$ ssh 10.122.155.66
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
p585600@10.122.155.66's password:
Last login: Tue Jul 21 15:55:23 2026 from 10.122.150.31
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ ls -la /tmp/OpenJDK17U-jdk_x64_linux_hotspot_17.0.19_10.tar.gz
-rw-r--r-- 1 p585600 usucef 193335385 Jul 21 16:00 /tmp/OpenJDK17U-jdk_x64_linux_hotspot_17.0.19_10.tar.gz
-sh-4.2$ hostname -f
cadsvaprlx071.intra.caixa.gov.br
-sh-4.2$






copie ele errado pra dentro da servidor do agente me ajdua a excuilr ele daqui
