root@caddeapllx2484 verificacao_sicmu2]# cp /opt/jboss-eap/standalone/deployments/SICMU-ear.ear .
[root@caddeapllx2484 verificacao_sicmu2]# unzip -p SICMU-ear.ear SICMU-web.war > SICMU-web.war
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]# ls -la SICMU-web.war
-rw-r--r-- 1 root root 21261825 Ago 26 09:18 SICMU-web.war
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]# unzip -p SICMU-web.war WEB-INF/web.xml | grep -i "distributable"
        <distributable />
[root@caddeapllx2484 verificacao_sicmu2]#


