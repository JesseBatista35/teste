ls -la /usr/jdk* 2>/dev/null
find / -maxdepth 3 -iname "*jdk1.8.0_66*" 2>/dev/null
/usr/jdk1.8.0_66/bin/java -version 2>/dev/null


ssh 10.192.222.72
ps -ef | grep java

