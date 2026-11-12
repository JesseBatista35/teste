
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]# bash /tmp/custom-log4j.sh
chmod: não foi possível acessar '/log_jboss/config-log4j/sigsj_internet.xml': Arquivo ou diretório inexistente
[root@caddeapllx2854 p585600]# /tmp/custom-log4j.sh
bash: /tmp/custom-log4j.sh: Permissão negada
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]# ls -la
total 16
drwx------   2 p585600 usucef  83 out 22 17:10 .
drwxr-xr-x. 10 root    root   131 nov  4 15:26 ..
-rw-------   1 p585600 usucef 749 nov 12 16:37 .bash_history
-rw-------   1 p585600 usucef  18 out 22 15:39 .bash_logout
-rw-------   1 p585600 usucef 141 out 22 15:39 .bash_profile
-rw-------   1 p585600 usucef 492 out 22 15:39 .bashrc
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]# ls -la /log_jboss/config-log4j/ /log_jboss/sigsj_internet/
/log_jboss/config-log4j/:
total 4
drwxr-xr-x 2 jboss jboss  34 nov 12 16:47 .
drwxr-xr-x 4 jboss jboss  48 nov 12 16:47 ..
-rw-r--r-- 1 jboss jboss 879 nov 12 16:47 XXX_INTERNET_XML_XXX

/log_jboss/sigsj_internet/:
total 0
drwxr-xr-x 2 jboss jboss  6 nov 12 16:47 .
drwxr-xr-x 4 jboss jboss 48 nov 12 16:47 ..
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]# \mv -f /log_jboss/config-log4j/XXX_INTERNET_XML_XXX /log_jboss/config-log4j/sigsj_internet.xml
chown jboss:jboss /log_jboss/config-log4j/sigsj_internet.xml
chmod 644 /log_jboss/config-log4j/sigsj_internet.xml
ls -la /log_jboss/config-log4j/
grep 'File' /log_jboss/config-log4j/sigsj_internet.xml
total 4
drwxr-xr-x 2 jboss jboss  32 nov 12 16:48 .
drwxr-xr-x 4 jboss jboss  48 nov 12 16:47 ..
-rw-r--r-- 1 jboss jboss 879 nov 12 16:47 sigsj_internet.xml
    <appender name="SIGSJ" class="org.apache.log4j.DailyRollingFileAppender">
        <param name="File" value="/log_jboss/sigsj_internet/sigsj_internet.log" />
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
